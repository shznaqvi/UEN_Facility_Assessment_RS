package edu.aku.hassannaqvi.uen_hfa_el.core;

import static edu.aku.hassannaqvi.uen_hfa_el.database.DatabaseHelper.DATABASE_NAME;
import static edu.aku.hassannaqvi.uen_hfa_el.database.DatabaseHelper.DATABASE_PASSWORD;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import net.sqlcipher.database.SQLiteDatabase;

import org.json.JSONArray;

import java.io.File;
import java.util.List;

import edu.aku.hassannaqvi.uen_hfa_el.BuildConfig;
import edu.aku.hassannaqvi.uen_hfa_el.models.Form;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleC;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleD;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleE;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleF;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleG;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleH;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleI;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleJ;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleK;
import edu.aku.hassannaqvi.uen_hfa_el.models.ModuleM;
import edu.aku.hassannaqvi.uen_hfa_el.models.Staffing;
import edu.aku.hassannaqvi.uen_hfa_el.models.Users;


public class MainApp extends Application {

    public static final String PROJECT_NAME = "UeN_HFA_EL";
    public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    //public static final String _IP = "https://cls-pae-fp51764";// .TEST server
    // public static final String _IP = "http://f38158/prosystem";// .TEST server
    //public static final String _IP = "http://43.245.131.159:8080";// .TEST server
    public static final String _HOST_URL = MainApp._IP + "/" + PROJECT_NAME + "/api/";// .TEST server;
    public static final String _SERVER_URL = "syncGCM.php";
    public static final String _SERVER_GET_URL = "getDataGCM.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _UPDATE_URL = MainApp._IP + "/" + PROJECT_NAME + "/app/";
    public static final String _USER_URL = "resetpassword.php";
    public static final String _APP_FOLDER = "../app/survey";
    public static final String _EMPTY_ = "";
    private static final String TAG = "MainApp";
    public static int TRATS = 8;
    public static String IBAHC = "";

    public static File sdDir;
    public static String[] downloadData;
    public static Form form;
    public static String selectedDistrict = "";
    public static String districtName = "";
    public static String selectedTehsil = "";
    public static String tehsilName = "";
    public static String selectedUc = "";
    public static String ucName = "";
    public static String selectedHf = "";
    public static String hfName = "";
    public static ModuleC moduleC;
    public static Staffing staffing;
    public static ModuleD moduleD;
    public static ModuleE moduleE;
    public static ModuleF moduleF;
    public static ModuleG moduleG;
    public static ModuleH moduleH;
    public static ModuleI moduleI;
    public static ModuleJ moduleJ;
    public static ModuleK moduleK;
    public static ModuleM moduleM;
    public static String DeviceURL = "devices.php";
    public static AppInfo appInfo;
    public static Users user;
    public static Boolean admin = false;
    public static List<JSONArray> uploadData;
    public static SharedPreferences.Editor editor;
    public static SharedPreferences sharedPref;
    public static String deviceid;
    public static int versionCode = BuildConfig.VERSION_CODE;
    public static String versionName = BuildConfig.VERSION_NAME;
    public static boolean permissionCheck = false;
    public static int countC = 0;
    public static int countI = 0;
    public static boolean superuser = false;

    public static void hideSystemUI(View decorView) {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
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

    public static String getDeviceId(Context context) {
        String deviceId;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            deviceId = Settings.Secure.getString(
                    context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
        } else {
           /* final TelephonyManager mTelephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            if (mTelephony.getDeviceId() != null) {
                deviceId = mTelephony.getDeviceId();
            } else {
                deviceId = Settings.Secure.getString(
                        context.getContentResolver(),
                        Settings.Secure.ANDROID_ID);
            }*/
        }
        return "deviceId";
    }

    public static Boolean isNetworkAvailable(Context c) {
        ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network nw = connectivityManager.getActiveNetwork();
            if (nw == null) return false;
            NetworkCapabilities actNw = connectivityManager.getNetworkCapabilities(nw);
            return actNw != null && (actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
        } else {
            NetworkInfo nwInfo = connectivityManager.getActiveNetworkInfo();
            return nwInfo != null && nwInfo.isConnected();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();

        /*
        RootBeer rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }*/

        //Initiate DateTime
        //Initializ App info
        appInfo = new AppInfo(this);
        sharedPref = getSharedPreferences(PROJECT_NAME, MODE_PRIVATE);
        editor = sharedPref.edit();
        deviceid = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        initSecure();
    }

    private void initSecure() {
        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);
        File databaseFile = getDatabasePath(DATABASE_NAME);
       /* databaseFile.mkdirs();
        databaseFile.delete();*/
        SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(databaseFile, DATABASE_PASSWORD, null);
        // Prepare encryption KEY
        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            TRATS = bundle.getInt("YEK_TRATS");
            //IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            IBAHC = bundle.getString("YEK_REVRES");
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

}
