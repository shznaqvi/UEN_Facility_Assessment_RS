package edu.aku.hassannaqvi.uen_facility_assessment.database

import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.*
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.PROJECT_NAME

object CreateTable {

    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_HH_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_LHW_UID + " TEXT,"
            + FormsTable.COLUMN_LHW_CODE + " TEXT,"
            + FormsTable.COLUMN_KHANDAN_NO + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_SA + " TEXT,"
            + FormsTable.COLUMN_SB + " TEXT,"
            + FormsTable.COLUMN_SC + " TEXT,"
            + FormsTable.COLUMN_SD + " TEXT,"
            + FormsTable.COLUMN_SE + " TEXT,"
            + FormsTable.COLUMN_SF + " TEXT,"
            + FormsTable.COLUMN_SG + " TEXT,"
            + FormsTable.COLUMN_SH + " TEXT,"
            + FormsTable.COLUMN_SI + " TEXT,"
            + FormsTable.COLUMN_SJ + " TEXT,"
            + FormsTable.COLUMN_SK + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_A = ("CREATE TABLE "
            + ModuleATable.TABLE_NAME + "("
            + ModuleATable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleATable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleATable.COLUMN_UID + " TEXT,"
            + ModuleATable.COLUMN_LHW_UID + " TEXT,"
            + ModuleATable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleATable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleATable.COLUMN_USERNAME + " TEXT,"
            + ModuleATable.COLUMN_SYSDATE + " TEXT,"
            + ModuleATable.COLUMN_ISTATUS + " TEXT,"
            + ModuleATable.COLUMN_DEVICEID + " TEXT,"
            + ModuleATable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleATable.COLUMN_SYNCED + " TEXT,"
            + ModuleATable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleATable.COLUMN_APPVERSION + " TEXT,"
            + ModuleATable.COLUMN_SA + " TEXT"
            + " );"
            )


    /*const val SQL_CREATE_LHW_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_CLUSTER + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_A101 + " TEXT,"
            + FormsTable.COLUMN_A102 + " TEXT,"
            + FormsTable.COLUMN_A103 + " TEXT,"
            + FormsTable.COLUMN_A104n + " TEXT,"
            + FormsTable.COLUMN_A104c + " TEXT,"
            + FormsTable.COLUMN_SL1 + " TEXT,"
            + FormsTable.COLUMN_SL2 + " TEXT,"
            + FormsTable.COLUMN_SL3 + " TEXT,"
            + FormsTable.COLUMN_SL4 + " TEXT"
            + " );"
            )*/


    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT,"
            + UsersTable.COLUMN_DIST_ID + " TEXT,"
            + UsersTable.COLUMN_ENABLED + " TEXT,"
            + UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + UsersTable.COLUMN_DESIGNATION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_PSU_CODE + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_DISTRICT = ("CREATE TABLE " + TableDistricts.TABLE_NAME + "("
            + TableDistricts.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableDistricts.COLUMN_DISTRICT_NAME + " TEXT,"
            + TableDistricts.COLUMN_DISTRICT_CODE + " TEXT"
            + " );")


    const val SQL_CREATE_LHW = ("CREATE TABLE " + TableLhw.TABLE_NAME + "("
            + TableLhw.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableLhw.COLUMN_HF_CODE + " TEXT,"
            + TableLhw.COLUMN_LHW_CODE + " TEXT,"
            + TableLhw.COLUMN_LHW_NAME + " TEXT"
            + " );")

    const val SQL_CREATE_TEHSIL = ("CREATE TABLE " + TableTehsil.TABLE_NAME + "("
            + TableTehsil.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableTehsil.COLUMN_DIST_ID + " TEXT,"
            + TableTehsil.COLUMN_TEHSIL_NAME + " TEXT,"
            + TableTehsil.COLUMN_TEHSIL_CODE + " TEXT"
            + " );")

    const val SQL_CREATE_LHW_HF = ("CREATE TABLE " + TableHealthFacilities.TABLE_NAME + "("
            + TableHealthFacilities.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableHealthFacilities.COLUMN_HF_CODE + " TEXT,"
            + TableHealthFacilities.COLUMN_HF_NAME + " TEXT,"
            + TableHealthFacilities.COLUMN_DIST_ID + " TEXT"
            + " );")

    const val SQL_CREATE_PROVINCE = ("CREATE TABLE " + TableProvince.TABLE_NAME + "("
            + TableProvince.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableProvince.COLUMN_PROVINCE + " TEXT,"
            + TableProvince.COLUMN_PRO_ID + " TEXT"
            + " );")


    const val SQL_CREATE_VERSIONAPP = ("CREATE TABLE "
            + VersionTable.TABLE_NAME + " ("
            + VersionTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VersionTable.COLUMN_VERSION_CODE + " TEXT, "
            + VersionTable.COLUMN_VERSION_NAME + " TEXT, "
            + VersionTable.COLUMN_PATH_NAME + " TEXT "
            + ");"
            )
}
