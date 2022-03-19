package edu.aku.hassannaqvi.uen_facility_assessment.core;

import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.DATABASE_NAME;

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

import edu.aku.hassannaqvi.uen_facility_assessment.BuildConfig;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Form;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleC;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleD;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleE;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleF;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleG;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleH;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleI;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleJ;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleK;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Staffing;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Users;


public class MainApp extends Application {

    public static final String PROJECT_NAME = "uen_facility_assessment";
    public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    //public static final String _IP = "https://cls-pae-fp51764";// .TEST server
    // public static final String _IP = "http://f38158/prosystem";// .TEST server
    //public static final String _IP = "http://43.245.131.159:8080";// .TEST server
    public static final String _HOST_URL = MainApp._IP + "/hfassess/api/";// .TEST server;
    public static final String _SERVER_URL = "syncenc.php";
    public static final String _SERVER_GET_URL = "getDataenc.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _UPDATE_URL = MainApp._IP + "/hfassess/app/";
    public static final String _USER_URL = "resetpassword.php";
    public static final String _EMPTY_ = "";
    private static final String TAG = "MainApp";
    public static String IBAHC = "";
    //COUNTRIES
    public static int PAKISTAN = 1;
    public static int TAJIKISTAN = 3;

    public static File sdDir;
    public static String[] downloadData;
    public static Form form;
    public static String selectedDistrict = "";
    public static String selectedTehsil = "";
    public static String selectedUc = "";
    public static String selectedHf = "";
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

        // Prepare encryption KEY
        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            int TRATS = bundle.getInt("YEK_TRATS");
            IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            Log.d(TAG, "onCreate: YEK_REVRES = " + DATABASE_NAME);
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
