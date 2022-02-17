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
            + ModuleATable.COLUMN_DISTRICT_CODE + " TEXT,"
            + ModuleATable.COLUMN_TEHSIL_CODE + " TEXT,"
            + ModuleATable.COLUMN_HF_CODE + " TEXT,"
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

    const val SQL_CREATE_MODULE_B = ("CREATE TABLE "
            + ModuleBTable.TABLE_NAME + "("
            + ModuleBTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleBTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleBTable.COLUMN_UID + " TEXT,"
            + ModuleBTable.COLUMN_LHW_UID + " TEXT,"
            + ModuleBTable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleBTable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleBTable.COLUMN_USERNAME + " TEXT,"
            + ModuleBTable.COLUMN_SYSDATE + " TEXT,"
            + ModuleBTable.COLUMN_ISTATUS + " TEXT,"
            + ModuleBTable.COLUMN_DEVICEID + " TEXT,"
            + ModuleBTable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleBTable.COLUMN_SYNCED + " TEXT,"
            + ModuleBTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleBTable.COLUMN_APPVERSION + " TEXT,"
            + ModuleBTable.COLUMN_SB + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_C = ("CREATE TABLE "
            + ModuleCTable.TABLE_NAME + "("
            + ModuleCTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleCTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleCTable.COLUMN_UID + " TEXT,"
            + ModuleCTable.COLUMN_LHW_UID + " TEXT,"
            + ModuleCTable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleCTable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleCTable.COLUMN_USERNAME + " TEXT,"
            + ModuleCTable.COLUMN_SYSDATE + " TEXT,"
            + ModuleCTable.COLUMN_ISTATUS + " TEXT,"
            + ModuleCTable.COLUMN_DEVICEID + " TEXT,"
            + ModuleCTable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleCTable.COLUMN_SYNCED + " TEXT,"
            + ModuleCTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleCTable.COLUMN_APPVERSION + " TEXT,"
            + ModuleCTable.COLUMN_SC1 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_STAFFING = ("CREATE TABLE "
            + StaffingTable.TABLE_NAME + "("
            + StaffingTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + StaffingTable.COLUMN_PROJECT_NAME + " TEXT,"
            + StaffingTable.COLUMN_UID + " TEXT,"
            + StaffingTable.COLUMN_UUID + " TEXT,"
            + StaffingTable.COLUMN_LHW_UID + " TEXT,"
            + StaffingTable.COLUMN_LHW_CODE + " TEXT,"
            + StaffingTable.COLUMN_KHANDAN_NO + " TEXT,"
            + StaffingTable.COLUMN_USERNAME + " TEXT,"
            + StaffingTable.COLUMN_SYSDATE + " TEXT,"
            + StaffingTable.COLUMN_ISTATUS + " TEXT,"
            + StaffingTable.COLUMN_DEVICEID + " TEXT,"
            + StaffingTable.COLUMN_DEVICETAGID + " TEXT,"
            + StaffingTable.COLUMN_SYNCED + " TEXT,"
            + StaffingTable.COLUMN_SYNCED_DATE + " TEXT,"
            + StaffingTable.COLUMN_APPVERSION + " TEXT,"
            + StaffingTable.COLUMN_SC2 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_D = ("CREATE TABLE "
            + ModuleDTable.TABLE_NAME + "("
            + ModuleDTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleDTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleDTable.COLUMN_UID + " TEXT,"
            + ModuleDTable.COLUMN_LHW_UID + " TEXT,"
            + ModuleDTable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleDTable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleDTable.COLUMN_USERNAME + " TEXT,"
            + ModuleDTable.COLUMN_SYSDATE + " TEXT,"
            + ModuleDTable.COLUMN_ISTATUS + " TEXT,"
            + ModuleDTable.COLUMN_DEVICEID + " TEXT,"
            + ModuleDTable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleDTable.COLUMN_SYNCED + " TEXT,"
            + ModuleDTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleDTable.COLUMN_APPVERSION + " TEXT,"
            + ModuleDTable.COLUMN_SD1 + " TEXT,"
            + ModuleDTable.COLUMN_SD2 + " TEXT,"
            + ModuleDTable.COLUMN_SD3 + " TEXT,"
            + ModuleDTable.COLUMN_SD4 + " TEXT,"
            + ModuleDTable.COLUMN_SD5 + " TEXT,"
            + ModuleDTable.COLUMN_SD6 + " TEXT,"
            + ModuleDTable.COLUMN_SD7 + " TEXT,"
            + ModuleDTable.COLUMN_SD8 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_E = ("CREATE TABLE "
            + ModuleETable.TABLE_NAME + "("
            + ModuleETable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleETable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleETable.COLUMN_UID + " TEXT,"
            + ModuleETable.COLUMN_LHW_UID + " TEXT,"
            + ModuleETable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleETable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleETable.COLUMN_USERNAME + " TEXT,"
            + ModuleETable.COLUMN_SYSDATE + " TEXT,"
            + ModuleETable.COLUMN_ISTATUS + " TEXT,"
            + ModuleETable.COLUMN_DEVICEID + " TEXT,"
            + ModuleETable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleETable.COLUMN_SYNCED + " TEXT,"
            + ModuleETable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleETable.COLUMN_APPVERSION + " TEXT,"
            + ModuleETable.COLUMN_SE1 + " TEXT,"
            + ModuleETable.COLUMN_SE2 + " TEXT,"
            + ModuleETable.COLUMN_SE31 + " TEXT,"
            + ModuleETable.COLUMN_SE32 + " TEXT,"
            + ModuleETable.COLUMN_SE33 + " TEXT,"
            + ModuleETable.COLUMN_SE4 + " TEXT,"
            + ModuleETable.COLUMN_SE5 + " TEXT,"
            + ModuleETable.COLUMN_SE6 + " TEXT,"
            + ModuleETable.COLUMN_SE7 + " TEXT,"
            + ModuleETable.COLUMN_SE8 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_F = ("CREATE TABLE "
            + ModuleFTable.TABLE_NAME + "("
            + ModuleFTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleFTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleFTable.COLUMN_UID + " TEXT,"
            + ModuleFTable.COLUMN_LHW_UID + " TEXT,"
            + ModuleFTable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleFTable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleFTable.COLUMN_USERNAME + " TEXT,"
            + ModuleFTable.COLUMN_SYSDATE + " TEXT,"
            + ModuleFTable.COLUMN_ISTATUS + " TEXT,"
            + ModuleFTable.COLUMN_DEVICEID + " TEXT,"
            + ModuleFTable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleFTable.COLUMN_SYNCED + " TEXT,"
            + ModuleFTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleFTable.COLUMN_APPVERSION + " TEXT,"
            + ModuleFTable.COLUMN_SF1 + " TEXT,"
            + ModuleFTable.COLUMN_SF2 + " TEXT,"
            + ModuleFTable.COLUMN_SF3 + " TEXT,"
            + ModuleFTable.COLUMN_SF4 + " TEXT,"
            + ModuleFTable.COLUMN_SF5 + " TEXT,"
            + ModuleFTable.COLUMN_SF6 + " TEXT,"
            + ModuleFTable.COLUMN_SF7 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_G = ("CREATE TABLE "
            + ModuleGTable.TABLE_NAME + "("
            + ModuleGTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleGTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleGTable.COLUMN_UID + " TEXT,"
            + ModuleGTable.COLUMN_LHW_UID + " TEXT,"
            + ModuleGTable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleGTable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleGTable.COLUMN_USERNAME + " TEXT,"
            + ModuleGTable.COLUMN_SYSDATE + " TEXT,"
            + ModuleGTable.COLUMN_ISTATUS + " TEXT,"
            + ModuleGTable.COLUMN_DEVICEID + " TEXT,"
            + ModuleGTable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleGTable.COLUMN_SYNCED + " TEXT,"
            + ModuleGTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleGTable.COLUMN_APPVERSION + " TEXT,"
            + ModuleGTable.COLUMN_SG1 + " TEXT,"
            + ModuleGTable.COLUMN_SG2 + " TEXT,"
            + ModuleGTable.COLUMN_SG3 + " TEXT,"
            + ModuleGTable.COLUMN_SG41 + " TEXT,"
            + ModuleGTable.COLUMN_SG42 + " TEXT,"
            + ModuleGTable.COLUMN_SG43 + " TEXT,"
            + ModuleGTable.COLUMN_SG44 + " TEXT,"
            + ModuleGTable.COLUMN_SG45 + " TEXT,"
            + ModuleGTable.COLUMN_SG46 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_H = ("CREATE TABLE "
            + ModuleHTable.TABLE_NAME + "("
            + ModuleHTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleHTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleHTable.COLUMN_UID + " TEXT,"
            + ModuleHTable.COLUMN_LHW_UID + " TEXT,"
            + ModuleHTable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleHTable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleHTable.COLUMN_USERNAME + " TEXT,"
            + ModuleHTable.COLUMN_SYSDATE + " TEXT,"
            + ModuleHTable.COLUMN_ISTATUS + " TEXT,"
            + ModuleHTable.COLUMN_DEVICEID + " TEXT,"
            + ModuleHTable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleHTable.COLUMN_SYNCED + " TEXT,"
            + ModuleHTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleHTable.COLUMN_APPVERSION + " TEXT,"
            + ModuleHTable.COLUMN_SH1 + " TEXT,"
            + ModuleHTable.COLUMN_SH2 + " TEXT,"
            + ModuleHTable.COLUMN_SH3 + " TEXT,"
            + ModuleHTable.COLUMN_SH4 + " TEXT,"
            + ModuleHTable.COLUMN_SH5 + " TEXT,"
            + ModuleHTable.COLUMN_SH6 + " TEXT,"
            + ModuleHTable.COLUMN_SH7 + " TEXT,"
            + ModuleHTable.COLUMN_SH8 + " TEXT,"
            + ModuleHTable.COLUMN_SH9 + " TEXT,"
            + ModuleHTable.COLUMN_SH10 + " TEXT,"
            + ModuleHTable.COLUMN_SH11 + " TEXT,"
            + ModuleHTable.COLUMN_SH12 + " TEXT,"
            + ModuleHTable.COLUMN_SH13 + " TEXT,"
            + ModuleHTable.COLUMN_SH14 + " TEXT,"
            + ModuleHTable.COLUMN_SH151 + " TEXT,"
            + ModuleHTable.COLUMN_SH152 + " TEXT,"
            + ModuleHTable.COLUMN_SH16 + " TEXT,"
            + ModuleHTable.COLUMN_SH17 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_I = ("CREATE TABLE "
            + ModuleITable.TABLE_NAME + "("
            + ModuleITable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleITable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleITable.COLUMN_UID + " TEXT,"
            + ModuleITable.COLUMN_LHW_UID + " TEXT,"
            + ModuleITable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleITable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleITable.COLUMN_USERNAME + " TEXT,"
            + ModuleITable.COLUMN_SYSDATE + " TEXT,"
            + ModuleITable.COLUMN_ISTATUS + " TEXT,"
            + ModuleITable.COLUMN_DEVICEID + " TEXT,"
            + ModuleITable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleITable.COLUMN_SYNCED + " TEXT,"
            + ModuleITable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleITable.COLUMN_APPVERSION + " TEXT,"
            + ModuleITable.COLUMN_SI + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_J = ("CREATE TABLE "
            + ModuleJTable.TABLE_NAME + "("
            + ModuleJTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleJTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleJTable.COLUMN_UID + " TEXT,"
            + ModuleJTable.COLUMN_LHW_UID + " TEXT,"
            + ModuleJTable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleJTable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleJTable.COLUMN_USERNAME + " TEXT,"
            + ModuleJTable.COLUMN_SYSDATE + " TEXT,"
            + ModuleJTable.COLUMN_ISTATUS + " TEXT,"
            + ModuleJTable.COLUMN_DEVICEID + " TEXT,"
            + ModuleJTable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleJTable.COLUMN_SYNCED + " TEXT,"
            + ModuleJTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleJTable.COLUMN_APPVERSION + " TEXT,"
            + ModuleJTable.COLUMN_SJ1 + " TEXT,"
            + ModuleJTable.COLUMN_SJ2 + " TEXT,"
            + ModuleJTable.COLUMN_SJ3 + " TEXT,"
            + ModuleJTable.COLUMN_SJ4 + " TEXT,"
            + ModuleJTable.COLUMN_SJ5 + " TEXT,"
            + ModuleJTable.COLUMN_SJ6 + " TEXT,"
            + ModuleJTable.COLUMN_SJ7 + " TEXT,"
            + ModuleJTable.COLUMN_SJ8 + " TEXT,"
            + ModuleJTable.COLUMN_SJ9 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MODULE_K = ("CREATE TABLE "
            + ModuleKTable.TABLE_NAME + "("
            + ModuleKTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ModuleKTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ModuleKTable.COLUMN_UID + " TEXT,"
            + ModuleKTable.COLUMN_LHW_UID + " TEXT,"
            + ModuleKTable.COLUMN_LHW_CODE + " TEXT,"
            + ModuleKTable.COLUMN_KHANDAN_NO + " TEXT,"
            + ModuleKTable.COLUMN_USERNAME + " TEXT,"
            + ModuleKTable.COLUMN_SYSDATE + " TEXT,"
            + ModuleKTable.COLUMN_ISTATUS + " TEXT,"
            + ModuleKTable.COLUMN_DEVICEID + " TEXT,"
            + ModuleKTable.COLUMN_DEVICETAGID + " TEXT,"
            + ModuleKTable.COLUMN_SYNCED + " TEXT,"
            + ModuleKTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ModuleKTable.COLUMN_APPVERSION + " TEXT,"
            + ModuleKTable.COLUMN_SK1 + " TEXT,"
            + ModuleKTable.COLUMN_SK2 + " TEXT,"
            + ModuleKTable.COLUMN_SK3 + " TEXT,"
            + ModuleKTable.COLUMN_SK4 + " TEXT,"
            + ModuleKTable.COLUMN_SK61 + " TEXT,"
            + ModuleKTable.COLUMN_SK62 + " TEXT,"
            + ModuleKTable.COLUMN_SK7 + " TEXT"
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
