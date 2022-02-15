package edu.aku.hassannaqvi.uen_facility_assessment.database;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.IBAHC;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.UserAuth.checkPassword;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_DISTRICT;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_ENTRYLOGS;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_HH_FORMS;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_LHW;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_LHW_HF;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_MODULE_A;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_MODULE_B;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_MODULE_C;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_MODULE_D;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_MODULE_E;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_MODULE_F;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_MODULE_G;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_MODULE_H;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_STAFFING;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_TEHSIL;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_USERS;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_VERSIONAPP;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.util.Log;
import android.widget.Toast;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteOpenHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.EntryLogTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleATable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleBTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleCTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleDTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleETable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleFTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleGTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleHTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.StaffingTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.TableDistricts;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.TableHealthFacilities;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.TableLhw;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.TableTehsil;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.UsersTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.VersionTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Districts;
import edu.aku.hassannaqvi.uen_facility_assessment.models.EntryLog;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Form;
import edu.aku.hassannaqvi.uen_facility_assessment.models.HealthFacilities;
import edu.aku.hassannaqvi.uen_facility_assessment.models.LHW;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleA;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleB;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleC;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleD;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleE;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleF;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleG;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleH;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Staffing;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Tehsil;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Users;
import edu.aku.hassannaqvi.uen_facility_assessment.models.VersionApp;




/*import edu.aku.hassannaqvi.naunehal.models.Immunization;*/

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = PROJECT_NAME + ".db";
    public static final String DATABASE_COPY = PROJECT_NAME + "_copy.db";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_PASSWORD = IBAHC;
    private final String TAG = "DatabaseHelper";
    private final Context mContext;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_DISTRICT);
        db.execSQL(SQL_CREATE_TEHSIL);
        db.execSQL(SQL_CREATE_LHW);
        db.execSQL(SQL_CREATE_LHW_HF);
        db.execSQL(SQL_CREATE_HH_FORMS);
        db.execSQL(SQL_CREATE_MODULE_A);
        db.execSQL(SQL_CREATE_MODULE_B);
        db.execSQL(SQL_CREATE_MODULE_C);
        db.execSQL(SQL_CREATE_STAFFING);
        db.execSQL(SQL_CREATE_MODULE_D);
        db.execSQL(SQL_CREATE_MODULE_E);
        db.execSQL(SQL_CREATE_MODULE_F);
        db.execSQL(SQL_CREATE_MODULE_G);
        db.execSQL(SQL_CREATE_MODULE_H);
        db.execSQL(SQL_CREATE_VERSIONAPP);
        db.execSQL(SQL_CREATE_ENTRYLOGS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
            case 2:
        }
    }



    //ADDING FORM in DB
    public long addForm(Form form) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsTable.COLUMN_UID, form.getUid());
        values.put(FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(FormsTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(FormsTable.COLUMN_SYNCED, form.getSynced());
        values.put(FormsTable.COLUMN_SYNCED_DATE, form.getSyncDate());

        values.put(FormsTable.COLUMN_SA, form.sAtoString());
        values.put(FormsTable.COLUMN_SB, form.sBtoString());
        values.put(FormsTable.COLUMN_SC, form.sCtoString());
        values.put(FormsTable.COLUMN_SD, form.sDtoString());
        values.put(FormsTable.COLUMN_SE, form.sEtoString());
        values.put(FormsTable.COLUMN_SF, form.sFtoString());
        values.put(FormsTable.COLUMN_SG, form.sGtoString());
        values.put(FormsTable.COLUMN_SH, form.sHtoString());
        values.put(FormsTable.COLUMN_SI, form.sItoString());
        values.put(FormsTable.COLUMN_SJ, form.sJtoString());
        values.put(FormsTable.COLUMN_SK, form.sKtoString());


        values.put(FormsTable.COLUMN_ISTATUS, form.getiStatus());
        values.put(FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(FormsTable.COLUMN_APPVERSION, form.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsTable.TABLE_NAME,
                FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addModuleA(ModuleA moda) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(ModuleATable.COLUMN_PROJECT_NAME, moda.getProjectName());
        values.put(ModuleATable.COLUMN_UID, moda.getUid());
        values.put(ModuleATable.COLUMN_USERNAME, moda.getUserName());
        values.put(ModuleATable.COLUMN_SYSDATE, moda.getSysDate());
        values.put(ModuleATable.COLUMN_SYNCED, moda.getSynced());
        values.put(ModuleATable.COLUMN_SYNCED_DATE, moda.getSyncDate());

        values.put(ModuleATable.COLUMN_SA, moda.sAtoString());

        values.put(ModuleATable.COLUMN_ISTATUS, moda.getiStatus());
        values.put(ModuleATable.COLUMN_DEVICETAGID, moda.getDeviceTag());
        values.put(ModuleATable.COLUMN_DEVICEID, moda.getDeviceId());
        values.put(ModuleATable.COLUMN_APPVERSION, moda.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                ModuleATable.TABLE_NAME,
                ModuleATable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addModuleB(ModuleB modb) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(ModuleBTable.COLUMN_PROJECT_NAME, modb.getProjectName());
        values.put(ModuleBTable.COLUMN_UID, modb.getUid());
        values.put(ModuleBTable.COLUMN_USERNAME, modb.getUserName());
        values.put(ModuleBTable.COLUMN_SYSDATE, modb.getSysDate());
        values.put(ModuleBTable.COLUMN_SYNCED, modb.getSynced());
        values.put(ModuleBTable.COLUMN_SYNCED_DATE, modb.getSyncDate());

        values.put(ModuleBTable.COLUMN_SB, modb.sBtoString());

        values.put(ModuleBTable.COLUMN_ISTATUS, modb.getiStatus());
        values.put(ModuleBTable.COLUMN_DEVICETAGID, modb.getDeviceTag());
        values.put(ModuleBTable.COLUMN_DEVICEID, modb.getDeviceId());
        values.put(ModuleBTable.COLUMN_APPVERSION, modb.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                ModuleBTable.TABLE_NAME,
                ModuleBTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addModuleC(ModuleC modc) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(ModuleCTable.COLUMN_PROJECT_NAME, modc.getProjectName());
        values.put(ModuleCTable.COLUMN_UID, modc.getUid());
        values.put(ModuleCTable.COLUMN_USERNAME, modc.getUserName());
        values.put(ModuleCTable.COLUMN_SYSDATE, modc.getSysDate());
        values.put(ModuleCTable.COLUMN_SYNCED, modc.getSynced());
        values.put(ModuleCTable.COLUMN_SYNCED_DATE, modc.getSyncDate());

        values.put(ModuleCTable.COLUMN_SC1, modc.sC1toString());

        values.put(ModuleCTable.COLUMN_ISTATUS, modc.getiStatus());
        values.put(ModuleCTable.COLUMN_DEVICETAGID, modc.getDeviceTag());
        values.put(ModuleCTable.COLUMN_DEVICEID, modc.getDeviceId());
        values.put(ModuleCTable.COLUMN_APPVERSION, modc.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                ModuleCTable.TABLE_NAME,
                ModuleCTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addStaff(Staffing staf) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(StaffingTable.COLUMN_PROJECT_NAME, staf.getProjectName());
        values.put(StaffingTable.COLUMN_UID, staf.getUid());
        values.put(StaffingTable.COLUMN_UUID, staf.getUuid());
        values.put(StaffingTable.COLUMN_USERNAME, staf.getUserName());
        values.put(StaffingTable.COLUMN_SYSDATE, staf.getSysDate());
        values.put(StaffingTable.COLUMN_SYNCED, staf.getSynced());
        values.put(StaffingTable.COLUMN_SYNCED_DATE, staf.getSyncDate());

        values.put(StaffingTable.COLUMN_SC2, staf.sC2toString());

        values.put(StaffingTable.COLUMN_ISTATUS, staf.getiStatus());
        values.put(StaffingTable.COLUMN_DEVICETAGID, staf.getDeviceTag());
        values.put(StaffingTable.COLUMN_DEVICEID, staf.getDeviceId());
        values.put(StaffingTable.COLUMN_APPVERSION, staf.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                StaffingTable.TABLE_NAME,
                StaffingTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addModuleD(ModuleD modd) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(ModuleDTable.COLUMN_PROJECT_NAME, modd.getProjectName());
        values.put(ModuleDTable.COLUMN_UID, modd.getUid());
        values.put(ModuleDTable.COLUMN_USERNAME, modd.getUserName());
        values.put(ModuleDTable.COLUMN_SYSDATE, modd.getSysDate());
        values.put(ModuleDTable.COLUMN_SYNCED, modd.getSynced());
        values.put(ModuleDTable.COLUMN_SYNCED_DATE, modd.getSyncDate());

        values.put(ModuleDTable.COLUMN_SD1, modd.sD1toString());
        values.put(ModuleDTable.COLUMN_SD2, modd.sD2toString());
        values.put(ModuleDTable.COLUMN_SD3, modd.sD3toString());
        values.put(ModuleDTable.COLUMN_SD4, modd.sD4toString());
        values.put(ModuleDTable.COLUMN_SD5, modd.sD5toString());
        values.put(ModuleDTable.COLUMN_SD6, modd.sD6toString());
        values.put(ModuleDTable.COLUMN_SD7, modd.sD7toString());
        values.put(ModuleDTable.COLUMN_SD8, modd.sD8toString());


        values.put(ModuleDTable.COLUMN_ISTATUS, modd.getiStatus());
        values.put(ModuleDTable.COLUMN_DEVICETAGID, modd.getDeviceTag());
        values.put(ModuleDTable.COLUMN_DEVICEID, modd.getDeviceId());
        values.put(ModuleDTable.COLUMN_APPVERSION, modd.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                ModuleDTable.TABLE_NAME,
                ModuleDTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addModuleE(ModuleE mode) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(ModuleETable.COLUMN_PROJECT_NAME, mode.getProjectName());
        values.put(ModuleETable.COLUMN_UID, mode.getUid());
        values.put(ModuleETable.COLUMN_USERNAME, mode.getUserName());
        values.put(ModuleETable.COLUMN_SYSDATE, mode.getSysDate());
        values.put(ModuleETable.COLUMN_SYNCED, mode.getSynced());
        values.put(ModuleETable.COLUMN_SYNCED_DATE, mode.getSyncDate());

        values.put(ModuleETable.COLUMN_SE1, mode.sE1toString());
        values.put(ModuleETable.COLUMN_SE2, mode.sE2toString());
        values.put(ModuleETable.COLUMN_SE31, mode.sE31toString());
        values.put(ModuleETable.COLUMN_SE32, mode.sE32toString());
        values.put(ModuleETable.COLUMN_SE33, mode.sE33toString());
        values.put(ModuleETable.COLUMN_SE4, mode.sE4toString());
        values.put(ModuleETable.COLUMN_SE5, mode.sE5toString());
        values.put(ModuleETable.COLUMN_SE6, mode.sE6toString());
        values.put(ModuleETable.COLUMN_SE7, mode.sE7toString());
        values.put(ModuleETable.COLUMN_SE8, mode.sE8toString());


        values.put(ModuleETable.COLUMN_ISTATUS, mode.getiStatus());
        values.put(ModuleETable.COLUMN_DEVICETAGID, mode.getDeviceTag());
        values.put(ModuleETable.COLUMN_DEVICEID, mode.getDeviceId());
        values.put(ModuleETable.COLUMN_APPVERSION, mode.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                ModuleETable.TABLE_NAME,
                ModuleETable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addModuleF(ModuleF modf) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(ModuleFTable.COLUMN_PROJECT_NAME, modf.getProjectName());
        values.put(ModuleFTable.COLUMN_UID, modf.getUid());
        values.put(ModuleFTable.COLUMN_USERNAME, modf.getUserName());
        values.put(ModuleFTable.COLUMN_SYSDATE, modf.getSysDate());
        values.put(ModuleFTable.COLUMN_SYNCED, modf.getSynced());
        values.put(ModuleFTable.COLUMN_SYNCED_DATE, modf.getSyncDate());

        values.put(ModuleFTable.COLUMN_SF1, modf.sF1toString());
        values.put(ModuleFTable.COLUMN_SF2, modf.sF2toString());
        values.put(ModuleFTable.COLUMN_SF3, modf.sF3toString());
        values.put(ModuleFTable.COLUMN_SF4, modf.sF4toString());
        values.put(ModuleFTable.COLUMN_SF5, modf.sF5toString());
        values.put(ModuleFTable.COLUMN_SF6, modf.sF6toString());
        values.put(ModuleFTable.COLUMN_SF7, modf.sF7toString());

        values.put(ModuleFTable.COLUMN_ISTATUS, modf.getiStatus());
        values.put(ModuleFTable.COLUMN_DEVICETAGID, modf.getDeviceTag());
        values.put(ModuleFTable.COLUMN_DEVICEID, modf.getDeviceId());
        values.put(ModuleFTable.COLUMN_APPVERSION, modf.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                ModuleFTable.TABLE_NAME,
                ModuleFTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addModuleG(ModuleG modg) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(ModuleGTable.COLUMN_PROJECT_NAME, modg.getProjectName());
        values.put(ModuleGTable.COLUMN_UID, modg.getUid());
        values.put(ModuleGTable.COLUMN_USERNAME, modg.getUserName());
        values.put(ModuleGTable.COLUMN_SYSDATE, modg.getSysDate());
        values.put(ModuleGTable.COLUMN_SYNCED, modg.getSynced());
        values.put(ModuleGTable.COLUMN_SYNCED_DATE, modg.getSyncDate());

        values.put(ModuleGTable.COLUMN_SG1, modg.sG1toString());
        values.put(ModuleGTable.COLUMN_SG2, modg.sG2toString());
        values.put(ModuleGTable.COLUMN_SG3, modg.sG3toString());
        values.put(ModuleGTable.COLUMN_SG41, modg.sG41toString());
        values.put(ModuleGTable.COLUMN_SG42, modg.sG42toString());
        values.put(ModuleGTable.COLUMN_SG43, modg.sG43toString());
        values.put(ModuleGTable.COLUMN_SG44, modg.sG44toString());
        values.put(ModuleGTable.COLUMN_SG45, modg.sG45toString());
        values.put(ModuleGTable.COLUMN_SG46, modg.sG46toString());

        values.put(ModuleGTable.COLUMN_ISTATUS, modg.getiStatus());
        values.put(ModuleGTable.COLUMN_DEVICETAGID, modg.getDeviceTag());
        values.put(ModuleGTable.COLUMN_DEVICEID, modg.getDeviceId());
        values.put(ModuleGTable.COLUMN_APPVERSION, modg.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                ModuleGTable.TABLE_NAME,
                ModuleGTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addModuleH(ModuleH modh) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(ModuleHTable.COLUMN_PROJECT_NAME, modh.getProjectName());
        values.put(ModuleHTable.COLUMN_UID, modh.getUid());
        values.put(ModuleHTable.COLUMN_USERNAME, modh.getUserName());
        values.put(ModuleHTable.COLUMN_SYSDATE, modh.getSysDate());
        values.put(ModuleHTable.COLUMN_SYNCED, modh.getSynced());
        values.put(ModuleHTable.COLUMN_SYNCED_DATE, modh.getSyncDate());

        values.put(ModuleHTable.COLUMN_SH1, modh.sH1toString());
        values.put(ModuleHTable.COLUMN_SH2, modh.sH2toString());
        values.put(ModuleHTable.COLUMN_SH3, modh.sH3toString());
        values.put(ModuleHTable.COLUMN_SH4, modh.sH4toString());
        values.put(ModuleHTable.COLUMN_SH5, modh.sH5toString());
        values.put(ModuleHTable.COLUMN_SH6, modh.sH6toString());
        values.put(ModuleHTable.COLUMN_SH7, modh.sH7toString());
        values.put(ModuleHTable.COLUMN_SH8, modh.sH8toString());
        values.put(ModuleHTable.COLUMN_SH9, modh.sH9toString());
        values.put(ModuleHTable.COLUMN_SH10, modh.sH10toString());
        values.put(ModuleHTable.COLUMN_SH11, modh.sH11toString());
        values.put(ModuleHTable.COLUMN_SH12, modh.sH12toString());
        values.put(ModuleHTable.COLUMN_SH13, modh.sH13toString());
        values.put(ModuleHTable.COLUMN_SH14, modh.sH14toString());
        values.put(ModuleHTable.COLUMN_SH151, modh.sH151toString());
        values.put(ModuleHTable.COLUMN_SH152, modh.sH152toString());
        values.put(ModuleHTable.COLUMN_SH16, modh.sH16toString());
        values.put(ModuleHTable.COLUMN_SH17, modh.sH17toString());

        values.put(ModuleHTable.COLUMN_ISTATUS, modh.getiStatus());
        values.put(ModuleHTable.COLUMN_DEVICETAGID, modh.getDeviceTag());
        values.put(ModuleHTable.COLUMN_DEVICEID, modh.getDeviceId());
        values.put(ModuleHTable.COLUMN_APPVERSION, modh.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                ModuleHTable.TABLE_NAME,
                ModuleHTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    //UPDATE in DB
    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesModuleAColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ModuleATable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.moduleA.getId())};

        return db.update(ModuleATable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesModuleBColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ModuleBTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.moduleB.getId())};

        return db.update(ModuleBTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesModuleCColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ModuleCTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.moduleC.getId())};

        return db.update(ModuleCTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesStaffColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = StaffingTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.staffing.getId())};

        return db.update(StaffingTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesModuleDColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ModuleDTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.moduleD.getId())};

        return db.update(ModuleDTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesModuleEColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ModuleETable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.moduleE.getId())};

        return db.update(ModuleETable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesModuleFColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ModuleFTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.moduleF.getId())};

        return db.update(ModuleFTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesModuleGColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ModuleGTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.moduleG.getId())};

        return db.update(ModuleGTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesModuleHColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ModuleHTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.moduleH.getId())};

        return db.update(ModuleHTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_ISTATUS, MainApp.form.getiStatus());

        // Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    //Functions that dealing with table data
    public boolean doLogin(String username, String password) throws InvalidKeySpecException, NoSuchAlgorithmException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = UsersTable.COLUMN_USERNAME + "=? ";
        String[] whereArgs = {username};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = new Users();
        c = db.query(
                UsersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            loggedInUser = new Users().hydrate(c);

        }

        c.close();

        db.close();
        if (loggedInUser.getPassword().equals("")) {
            Toast.makeText(mContext, "Stored password is invalid", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (checkPassword(password, loggedInUser.getPassword())) {
            MainApp.user = loggedInUser;
            //  MainApp.selectedDistrict = loggedInUser.getDist_id();
            return c.getCount() > 0;
        } else {
            return false;
        }
    }

    public ArrayList<Form> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                FormsTable._ID,
                FormsTable.COLUMN_UID,
                FormsTable.COLUMN_SYSDATE,
                FormsTable.COLUMN_USERNAME,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Form forms = new Form();
            forms.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
            forms.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
            forms.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
            forms.setUserName(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME)));
            allForms.add(forms);
        }

        db.close();

        return allForms;
    }


    // istatus examples: (1) or (1,9) or (1,3,5)
    public Form getFormByAssessNo(String uid, String istatus) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_UID + "=? AND " +
                FormsTable.COLUMN_ISTATUS + " in " + istatus;

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Form allFC = null;
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            allFC = new Form().Hydrate(c);
        }

        db.close();

        return allFC;
    }

    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    /*public int updateTemp(String assessNo, String temp) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_TSF305, temp);
        values.put(FormsTable.COLUMN_SYSDATE, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()) + "-Updated");
        values.put(FormsTable.COLUMN_ISTATUS, "1");
        values.put(FormsTable.COLUMN_SYNCED, (byte[]) null);

        String selection = FormsTable.COLUMN_ASSESMENT_NO + " =? AND " + FormsTable.COLUMN_ISTATUS + " =? ";
        // String selection = FormsTable.COLUMN_ASSESMENT_NO + " =? ";
        String[] selectionArgs = {assessNo, "9"};
        // String[] selectionArgs = {assessNo};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }*/


    public int syncVersionApp(JSONObject VersionList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(VersionTable.TABLE_NAME, null, null);
        long count = 0;
        JSONObject jsonObjectCC = ((JSONArray) VersionList.get(VersionTable.COLUMN_VERSION_PATH)).getJSONObject(0);
        VersionApp Vc = new VersionApp();
        Vc.sync(jsonObjectCC);

        ContentValues values = new ContentValues();

        values.put(VersionTable.COLUMN_PATH_NAME, Vc.getPathname());
        values.put(VersionTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
        values.put(VersionTable.COLUMN_VERSION_NAME, Vc.getVersionname());

        count = db.insert(VersionTable.TABLE_NAME, null, values);
        if (count > 0) count = 1;


        db.close();


        return (int) count;
    }

    public int syncUser(JSONArray userList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < userList.length(); i++) {

            JSONObject jsonObjectUser = userList.getJSONObject(i);

            Users user = new Users();
            user.sync(jsonObjectUser);
            ContentValues values = new ContentValues();

            values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
            values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
            values.put(UsersTable.COLUMN_FULLNAME, user.getFullname());
            values.put(UsersTable.COLUMN_ENABLED, user.getEnabled());
            values.put(UsersTable.COLUMN_ISNEW_USER, user.getNewUser());
            values.put(UsersTable.COLUMN_PWD_EXPIRY, user.getPwdExpiry());
            values.put(UsersTable.COLUMN_DESIGNATION, user.getDesignation());
            values.put(UsersTable.COLUMN_DIST_ID, user.getDist_id());
            long rowID = db.insert(UsersTable.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }


        db.close();
        return insertCount;
    }

    /*
     * Download data functions
     * */
    public int syncDistricts(JSONArray Districtslist) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableDistricts.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < Districtslist.length(); i++) {
            JSONObject jsonObjectDistrict = Districtslist.getJSONObject(i);
            Districts District = new Districts();
            District.sync(jsonObjectDistrict);
            ContentValues values = new ContentValues();

            values.put(TableDistricts.COLUMN_DISTRICT_CODE, District.getDistrictCode());
            values.put(TableDistricts.COLUMN_DISTRICT_NAME, District.getDistrictName());
            long rowID = db.insert(TableDistricts.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }


        db.close();

        return insertCount;
    }


    //    Sync LHW
    public int syncLhw(JSONArray lhwList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableLhw.TABLE_NAME, null, null);
        int insertCount = 0;

        for (int i = 0; i < lhwList.length(); i++) {
            JSONObject json = lhwList.getJSONObject(i);
            LHW lhw = new LHW();
            lhw.sync(json);
            ContentValues values = new ContentValues();

            values.put(TableLhw.COLUMN_HF_CODE, lhw.getHf_Code());
            values.put(TableLhw.COLUMN_LHW_CODE, lhw.getLhw_Code());
            values.put(TableLhw.COLUMN_LHW_NAME, lhw.getLhw_Name());

            long rowID = db.insert(TableLhw.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        db.close();


        return insertCount;
    }

    //    Sync Tehsil
    public int syncTehsil(JSONArray tehsilList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableTehsil.TABLE_NAME, null, null);
        int insertCount = 0;


        for (int i = 0; i < tehsilList.length(); i++) {
            JSONObject json = tehsilList.getJSONObject(i);
            Tehsil tehsil = new Tehsil();
            tehsil.sync(json);
            ContentValues values = new ContentValues();

            values.put(TableTehsil.COLUMN_DIST_ID, tehsil.getDist_id());
            values.put(TableTehsil.COLUMN_TEHSIL_NAME, tehsil.getTehsilName());
            values.put(TableTehsil.COLUMN_TEHSIL_CODE, tehsil.getTehsilCode());

            long rowID = db.insert(TableTehsil.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        db.close();


        db.close();

        return insertCount;
    }

    //    Sync LHWHF
    public int syncHealthFacilities(JSONArray healthfacilities) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableHealthFacilities.TABLE_NAME, null, null);
        int insertCount = 0;

        for (int i = 0; i < healthfacilities.length(); i++) {
            JSONObject json = healthfacilities.getJSONObject(i);
            HealthFacilities lhwHF = new HealthFacilities();
            lhwHF.sync(json);
            ContentValues values = new ContentValues();

            values.put(TableHealthFacilities.COLUMN_HF_CODE, lhwHF.getHfCode());
            values.put(TableHealthFacilities.COLUMN_HF_NAME, lhwHF.getHfName());
            values.put(TableHealthFacilities.COLUMN_DIST_ID, lhwHF.getDist_id());

            long rowID = db.insert(TableHealthFacilities.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        db.close();


        db.close();

        return insertCount;
    }


    public JSONArray getUnsyncedForms() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        //whereClause = null;
        whereClause = FormsTable.COLUMN_SYNCED + " ='' AND " +
                FormsTable.COLUMN_ISTATUS + "!= ''";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();

        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*form fc = new form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedForms: " + c.getCount());
            Form Form = new Form();
            allForms.put(Form.Hydrate(c).toJSONObject());


        }

        db.close();

        Log.d(TAG, "getUnsyncedLHWHouseholds: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedLHWHouseholds: " + allForms);
        return allForms;
    }


    //update SyncedTables
    public void updateSyncedForm(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_SYNCED, true);
        values.put(FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {
            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }


    //get Distinct Districts
    public Collection<Districts> getAllDistricts() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {TableDistricts.COLUMN_DISTRICT_CODE, TableDistricts.COLUMN_DISTRICT_NAME};

        String orderBy = TableDistricts.COLUMN_DISTRICT_NAME + " ASC";

        Collection<Districts> allDistricts = new ArrayList<>();
        c = db.query(
                true,
                TableDistricts.TABLE_NAME,  // The table to query
                columns,
                null,
                null,
                null,
                null,
                orderBy,
                "5000"

                // The sort order
        );
        while (c.moveToNext()) {


            Log.d(TAG, "getUnsyncedPreg: " + c.getCount());
            Districts cluster = new Districts();
            cluster.setDistrictCode(c.getString(c.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_CODE)));
            cluster.setDistrictName(c.getString(c.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_NAME)));
            allDistricts.add(cluster);

        }

        db.close();


        return allDistricts;
    }


    public Form getFormByClusterHHNo(String cluster_no, String hh_no) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_LHW_CODE + "=? AND " +
                FormsTable.COLUMN_KHANDAN_NO + " =? ";

        String[] whereArgs = {cluster_no, hh_no};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Form HHForm = null;

        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            HHForm = new Form().Hydrate(c);
        }

        db.close();

        return HHForm;
    }


    public Collection<Form> getFormsByCluster(String cluster) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_LHW_CODE + " = ? ";
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allFC = new ArrayList<>();

        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Form fc = new Form();
            fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
            fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
            fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
            fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
            fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
            allFC.add(fc);
        }

        db.close();

        return allFC;
    }

    public Collection<Form> getTodayForms(String sysdate) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();

        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Form fc = new Form();
            fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
            fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
            fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
            fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
            fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
            allFC.add(fc);
        }

        db.close();

        return allFC;
    }


    public Collection<Form> getPendingForms() {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_ISTATUS + " = ?";
        String[] whereArgs = new String[]{""};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Form fc = new Form();
            fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
            fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
            fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
            fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
            fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
            allFC.add(fc);
        }

        db.close();

        return allFC;
    }


    public Collection<Tehsil> getTehsilByDist(String distCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = TableTehsil.COLUMN_DIST_ID + " = ? ";

        String[] whereArgs = {distCode};

        String groupBy = null;
        String having = null;

        String orderBy = TableTehsil.COLUMN_ID + " ASC";

        List<Tehsil> tehsils = new ArrayList<>();

        c = db.query(
                TableTehsil.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {

            tehsils.add(new Tehsil().hydrate(c));


        }

        db.close();

        return tehsils;
    }

    public Collection<HealthFacilities> getHealthFacilityByDist(String distCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = TableHealthFacilities.COLUMN_DIST_ID + " = ? ";

        String[] whereArgs = {distCode};

        String groupBy = null;
        String having = null;

        String orderBy = TableHealthFacilities.COLUMN_ID + " ASC";

        List<HealthFacilities> healthFacilities = new ArrayList<>();

        c = db.query(
                TableHealthFacilities.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {

            healthFacilities.add(new HealthFacilities().hydrate(c));


        }

        db.close();

        return healthFacilities;
    }


    public Long addEntryLog(EntryLog entryLog) throws SQLiteException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_PROJECT_NAME, entryLog.getProjectName());
        values.put(EntryLogTable.COLUMN_UUID, entryLog.getUuid());
        values.put(EntryLogTable.COLUMN_PSU_CODE, entryLog.getPsuCode());
        values.put(EntryLogTable.COLUMN_HHID, entryLog.getHhid());
        values.put(EntryLogTable.COLUMN_USERNAME, entryLog.getUserName());
        values.put(EntryLogTable.COLUMN_SYSDATE, entryLog.getSysDate());
        values.put(EntryLogTable.COLUMN_ISTATUS, entryLog.getiStatus());
        values.put(EntryLogTable.COLUMN_ISTATUS96x, entryLog.getiStatus96x());
        values.put(EntryLogTable.COLUMN_ENTRY_TYPE, entryLog.getEntryType());
        values.put(EntryLogTable.COLUMN_ENTRY_DATE, entryLog.getEntryDate());
        values.put(EntryLogTable.COLUMN_DEVICEID, entryLog.getDeviceId());
        values.put(EntryLogTable.COLUMN_SYNCED, entryLog.getSynced());
        values.put(EntryLogTable.COLUMN_SYNC_DATE, entryLog.getSyncDate());
        values.put(EntryLogTable.COLUMN_APPVERSION, entryLog.getAppver());

        long newRowId;
        newRowId = db.insertOrThrow(
                EntryLogTable.TABLE_NAME,
                EntryLogTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public int updatesEntryLogColumn(String column, String value, String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = EntryLogTable._ID + " =? ";
        String[] selectionArgs = {id};

        return db.update(EntryLogTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public JSONArray getUnsyncedEntryLog() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = EntryLogTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = EntryLogTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                EntryLogTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedEntryLog: " + c.getCount());
            EntryLog entryLog = new EntryLog();
            all.put(entryLog.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedEntryLog: " + all.toString().length());
        Log.d(TAG, "getUnsyncedEntryLog: " + all);
        return all;
    }

    public void updateSyncedEntryLog(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_SYNCED, true);
        values.put(EntryLogTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = EntryLogTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                EntryLogTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public int updatePassword(String hashedPassword) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(UsersTable.COLUMN_PASSWORD, hashedPassword);
        values.put(UsersTable.COLUMN_ISNEW_USER, "");

        String selection = UsersTable.COLUMN_USERNAME + " =? ";
        String[] selectionArgs = {MainApp.user.getUserName()};

        return db.update(UsersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }
}