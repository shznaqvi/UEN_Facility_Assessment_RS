package edu.aku.hassannaqvi.uen_hfa_el.ui;

import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.editor;
import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.sharedPref;
import static edu.aku.hassannaqvi.uen_hfa_el.core.UserAuth.checkPassword;
import static edu.aku.hassannaqvi.uen_hfa_el.core.UserAuth.generatePassword;
import static edu.aku.hassannaqvi.uen_hfa_el.database.CreateTable.DATABASE_COPY;
import static edu.aku.hassannaqvi.uen_hfa_el.database.CreateTable.DATABASE_NAME;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import net.sqlcipher.database.SQLiteException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import edu.aku.hassannaqvi.uen_hfa_el.MainActivity;
import edu.aku.hassannaqvi.uen_hfa_el.R;
import edu.aku.hassannaqvi.uen_hfa_el.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_hfa_el.core.AppInfo;
import edu.aku.hassannaqvi.uen_hfa_el.core.MainApp;
import edu.aku.hassannaqvi.uen_hfa_el.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_hfa_el.databinding.ActivityLoginBinding;
import edu.aku.hassannaqvi.uen_hfa_el.models.EntryLog;
import edu.aku.hassannaqvi.uen_hfa_el.models.Users;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    protected static LocationManager locationManager;

    // UI references.

    ActivityLoginBinding bi;
    Spinner spinnerDistrict;
    String DirectoryName;
    DatabaseHelper db;
    ArrayAdapter<String> provinceAdapter;
    int attemptCounter = 0;
    String username = "";
    String password = "";
    private int countryCode;

    public static String encrypt(String plain) {
        try {
            byte[] iv = new byte[16];
            new SecureRandom().nextBytes(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec("asSa%s|n'$ crEed".getBytes(StandardCharsets.UTF_8), "AES"), new IvParameterSpec(iv));
            byte[] cipherText = cipher.doFinal(plain.getBytes(StandardCharsets.UTF_8));
            byte[] ivAndCipherText = new byte[iv.length + cipherText.length];
            System.arraycopy(iv, 0, ivAndCipherText, 0, iv.length);
            System.arraycopy(cipherText, 0, ivAndCipherText, iv.length, cipherText.length);
            return Base64.encodeToString(ivAndCipherText, Base64.NO_WRAP);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static String decrypt(String encoded) {
        try {
            byte[] ivAndCipherText = Base64.decode(encoded, Base64.NO_WRAP);
            byte[] iv = Arrays.copyOfRange(ivAndCipherText, 0, 16);
            byte[] cipherText = Arrays.copyOfRange(ivAndCipherText, 16, ivAndCipherText.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec("asSa%s|n'$ crEed".getBytes(StandardCharsets.UTF_8), "AES"), new IvParameterSpec(iv));
            return new String(cipher.doFinal(cipherText), StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        Dexter.withContext(this)
                .withPermissions(
                        Manifest.permission.ACCESS_NETWORK_STATE,
                        Manifest.permission.WAKE_LOCK,
                        Manifest.permission.INTERNET,
                        Manifest.permission.READ_PHONE_STATE,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_PHONE_STATE,
                        Manifest.permission.CAMERA
                ).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport report) {
                if (report.areAllPermissionsGranted()) {
                    MainApp.permissionCheck = true;
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                token.continuePermissionRequest();
            }
        }).check();
        bi = DataBindingUtil.setContentView(this, R.layout.activity_login);
        bi.setCallback(this);
        db = MainApp.appInfo.getDbHelper();
        MainApp.appInfo = new AppInfo(this);
        MainApp.user = new Users();
        bi.txtinstalldate.setText(MainApp.appInfo.getAppInfo());

        try {
            String testPass = generatePassword("test0001", null);
            Log.d(TAG, "onCreate(testPass): " + testPass);
            Log.d(TAG, "onCreate(checkPAss): " + checkPassword("test0001", testPass));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }


    }



    public void dbBackup() {

        String dt = sharedPref.getString("dt", new SimpleDateFormat("yyyy_mm_dd").format(new Date()));

        if (!dt.equals(new SimpleDateFormat("yyyy_mm_dd").format(new Date()))) {
            MainApp.editor.putString("dt", new SimpleDateFormat("yyyy_mm_dd").format(new Date()));
            MainApp.editor.apply();
        }

        // File folder = new File(Environment.getExternalStorageDirectory() + File.separator + PROJECT_NAME);
        File folder = Environment
                .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        boolean success = true;
        folder = new File(folder + File.separator + PROJECT_NAME);


        DirectoryName = folder.getPath() + File.separator + sharedPref.getString("dt", "");
        folder = new File(DirectoryName);
        if (!folder.exists()) {
            success = folder.mkdirs();
        }
        if (success) {


            File dbFile = new File(this.getDatabasePath(DATABASE_NAME).getPath());

            Long oldDBFileSize = sharedPref.getLong("dbFileSize", 0);
            Long newDBFileSize = dbFile.length();
            sharedPref.edit().putLong("dbFileSize", newDBFileSize);
            editor.apply();
            if (newDBFileSize > oldDBFileSize) {
                try {
                    FileInputStream fis = new FileInputStream(dbFile);
                    String outFileName = DirectoryName + File.separator + dt + "_" + DATABASE_COPY;
                    Log.d(TAG, "dbBackup: " + outFileName);

                    // Open the empty db as the output stream
                    OutputStream output = new FileOutputStream(outFileName);

                    // Transfer bytes from the inputfile to the outputfile
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = fis.read(buffer)) > 0) {
                        output.write(buffer, 0, length);
                    }

                    // Close the streams
                    output.flush();
                    output.close();
                    fis.close();
                } catch (IOException e) {
                    Log.e("dbBackup:", Objects.requireNonNull(e.getMessage()));
                }
            }


        } else {
            Toast.makeText(this, getString(R.string.folder_not_created), Toast.LENGTH_SHORT).show();
        }

    }

    public void onShowPasswordClick(View view) {
        //TODO implement
        if (bi.password.getTransformationMethod() == null) {
            bi.password.setTransformationMethod(new PasswordTransformationMethod());
            bi.password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_close, 0, 0, 0);
        } else {
            bi.password.setTransformationMethod(null);
            bi.password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_open, 0, 0, 0);
        }
    }

    public void onSyncDataClick(View view) {
        //callUsersWorker();

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            startActivity(new Intent(this, edu.aku.hassannaqvi.uen_hfa_el.ui.SyncActivity.class).putExtra("login", true));
        } else {
            Toast.makeText(this, getString(R.string.network_conn_error), Toast.LENGTH_SHORT).show();
        }
    }

    public void attemptLogin(View view) {

        MainApp.user = null;

        if (username.equals(bi.username.getText().toString())) {
            attemptCounter++;
        } else {
            attemptCounter = 1;
        }
        username = bi.username.getText().toString();


        // Reset errors.
        bi.username.setError(null);
        bi.password.setError(null);
        long timeNowInMillis = System.currentTimeMillis();

        Toast.makeText(this, String.valueOf(attemptCounter), Toast.LENGTH_SHORT).show();

        if (MainApp.sharedPref.contains(bi.username.getText().toString())) {
            long startTimeout = MainApp.sharedPref.getLong(bi.username.getText().toString(), timeNowInMillis);
            long timeElapsed = TimeUnit.MILLISECONDS.toMinutes(timeNowInMillis - startTimeout);
            Log.d(TAG, "attemptLogin(timeleft): " + timeElapsed);
            if (timeElapsed > 15) {
                MainApp.editor.remove(bi.username.getText().toString()).commit();
            } else {
                bi.username.setError("This user has been blocked.");
                Toast.makeText(this, "This user has been blocked. Please try again after some time.", Toast.LENGTH_LONG).show();
                return;
            }

        }
        if (attemptCounter > 5) {

            if (!MainApp.sharedPref.contains(bi.username.getText().toString())) {
                MainApp.editor.putLong(bi.username.getText().toString(), timeNowInMillis).commit();
                Toast.makeText(this, "This user has been blocked.", Toast.LENGTH_LONG).show();
                return;
            }

        } else {

            // Store values at the time of the login attempt.
            String username = bi.username.getText().toString();
            String password = bi.password.getText().toString();

            boolean cancel = false;
            View focusView = null;

            // Check for a valid password, if the user entered one.
            if (password.length() < 8) {
                bi.password.setError(getResources().getString(R.string.invalid_password));
                focusView = bi.password;
                return;
            }

            // Check for a valid username address.
            if (TextUtils.isEmpty(username)) {
                bi.username.setError(getResources().getString(R.string.username_required));
                focusView = bi.username;
                return;
            }

            //if(!Validator.emptySpinner(this, bi.countrySwitch)) return;
            /*if (bi.countrySwitch.getSelectedItemPosition() == 0) {
                bi.as1q01.setError(getString(R.string.as1q01));
                return;
            }*/
            try {

                if (db.doLogin(username, password)) {
                    MainApp.user.setUserName(username);
                    //   MainApp.admin = username.contains("@") || username.contains("test1234");
                    MainApp.superuser = MainApp.user.getDesignation().equals("Supervisor");
                    Intent iLogin = null;
                    if (MainApp.admin) {
                        recordEntry("Successful Login (Admin)");
                        iLogin = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(iLogin);
                    } else if (MainApp.user.getEnabled().equals("1")) {
                        if (!MainApp.user.getNewUser().equals("1")) { // TODO: getEnabled().equals("1")
                            recordEntry("Successful Login");
                            iLogin = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(iLogin);
                        } else if (MainApp.user.getNewUser().equals("1")) {
                            recordEntry("First Login");
                            iLogin = new Intent(LoginActivity.this, ChangePasswordActivity.class);
                            startActivity(iLogin);
                        }
                    } else {
                        recordEntry("Inactive User (Disabled)");
                        Toast.makeText(this, "This user is inactive.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    recordEntry("Failed Login: Incorrect username or password");
                    bi.password.setError(getResources().getString(R.string.incorrect_username_or_password));
                    bi.password.requestFocus();
                    //  Toast.makeText(LoginActivity.this, username + " " + password, Toast.LENGTH_SHORT).show();
                }
            } catch (InvalidKeySpecException e) {
                e.printStackTrace();
                Toast.makeText(this, "InvalidKeySpecException(UserAuth):" + e.getMessage(), Toast.LENGTH_SHORT).show();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                Toast.makeText(this, "NoSuchAlgorithmException(UserAuth):" + e.getMessage(), Toast.LENGTH_SHORT).show();

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                Toast.makeText(this, "IllegalArgumentException(UserAuth):" + e.getMessage(), Toast.LENGTH_SHORT).show();
            }

        }
    }

    private void recordEntry(String entryType) {

        EntryLog entryLog = new EntryLog();
        entryLog.setProjectName(PROJECT_NAME);
        entryLog.setUserName(username);
        entryLog.setEntryDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        entryLog.setAppver(MainApp.appInfo.getAppVersion());
        entryLog.setEntryType(entryType);
        entryLog.setDeviceId(MainApp.deviceid);
        Long rowId = null;
        try {
            rowId = db.addEntryLog(entryLog);
        } catch (SQLiteException e) {
            Toast.makeText(this, "SQLiteException(EntryLog)" + entryLog, Toast.LENGTH_SHORT).show();
        }
        if (rowId != -1) {
            entryLog.setId(String.valueOf(rowId));
            //entryLog.setUid(entryLog.getDeviceId() + entryLog.getId());
            entryLog.setUid(MainApp.generateUid(entryLog.getDeviceId()));
            db.updatesEntryLogColumn(TableContracts.EntryLogTable.COLUMN_UID, entryLog.getUid(), entryLog.getId());
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
        }

    }

    public String computeHash(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();
        byte[] byteData = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        Log.d("TAG", "computeHash: " + sb);
        return sb.toString();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }


}
