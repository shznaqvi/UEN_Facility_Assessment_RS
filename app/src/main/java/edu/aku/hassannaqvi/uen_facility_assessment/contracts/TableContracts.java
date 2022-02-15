package edu.aku.hassannaqvi.uen_facility_assessment.contracts;

import android.provider.BaseColumns;

public class TableContracts {

    public static abstract class FormsTable implements BaseColumns {
        public static final String TABLE_NAME = "HouseholdForm";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_LHW_UID = "_lhwuid";
        public static final String COLUMN_LHW_CODE = "lhwcode";
        public static final String COLUMN_KHANDAN_NO = "kno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";

        public static final String COLUMN_SA = "sA";
        public static final String COLUMN_SB = "sB";
        public static final String COLUMN_SC = "sC";
        public static final String COLUMN_SD = "sD";
        public static final String COLUMN_SE = "sE";
        public static final String COLUMN_SF = "sF";
        public static final String COLUMN_SG = "sG";
        public static final String COLUMN_SH = "sH";
        public static final String COLUMN_SI = "sI";
        public static final String COLUMN_SJ = "sJ";
        public static final String COLUMN_SK = "sK";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class ModuleATable implements BaseColumns {
        public static final String TABLE_NAME = "ModuleA";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_LHW_UID = "_lhwuid";
        public static final String COLUMN_LHW_CODE = "lhwcode";
        public static final String COLUMN_KHANDAN_NO = "kno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";

        public static final String COLUMN_SA = "sA";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


    public static abstract class UsersTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "AppUser";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_PASSWORD = "passwordEnc";
        public static final String COLUMN_FULLNAME = "full_name";
        public static final String COLUMN_DESIGNATION = "designation";
        public static final String COLUMN_ENABLED = "enabled";
        public static final String COLUMN_ISNEW_USER = "isNewUser";
        public static final String COLUMN_PWD_EXPIRY = "pwdExpiry";
        public static final String COLUMN_DIST_ID = "dist_id";
    }


    public static abstract class TableDistricts implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "district";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_DISTRICT_NAME = "district_name";
        public static final String COLUMN_DISTRICT_CODE = "district_code";

    }

    public static abstract class TableTehsil implements BaseColumns {

        public static final String TABLE_NAME = "tehsil";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_id";
        public static final String COLUMN_TEHSIL_NAME = "tehsil";
        public static final String COLUMN_DIST_ID = "dist_id";


    }

    public static abstract class TableLhw implements BaseColumns {

        public static final String TABLE_NAME = "lhw";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_HF_CODE = "hfcode";
        public static final String COLUMN_LHW_NAME = "lhw_name";
        public static final String COLUMN_LHW_CODE = "lhw_code";

    }

    public static abstract class TableHealthFacilities implements BaseColumns {
        public static final String TABLE_NAME = "HealthFacility";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_DIST_ID = "dist_id";
        public static final String COLUMN_HF_CODE = "hfcode";
        public static final String COLUMN_HF_NAME = "hf_name";
    }


    public static abstract class VersionTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "versionApp";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_VERSION_PATH = "elements";
        public static final String COLUMN_VERSION_CODE = "versionCode";
        public static final String COLUMN_VERSION_NAME = "versionName";
        public static final String COLUMN_PATH_NAME = "outputFile";
        public static final String SERVER_URI = "output-metadata.json";

    }

    public static abstract class TableProvince implements BaseColumns {
        public static final String TABLE_NAME = "province";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_PROVINCE = "province";
        public static final String COLUMN_PRO_ID = "pro_id";
    }

    public static abstract class EntryLogTable implements BaseColumns {
        public static final String TABLE_NAME = "EntryLog";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_PSU_CODE = "psuCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_ENTRY_DATE = "entryDate";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_ENTRY_TYPE = "entry_type";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
    }
}
