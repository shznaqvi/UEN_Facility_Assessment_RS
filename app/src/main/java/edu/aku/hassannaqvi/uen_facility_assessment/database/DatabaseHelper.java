package edu.aku.hassannaqvi.uen_facility_assessment.database;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.IBAHC;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.UserAuth.checkPassword;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_DISTRICT;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_ENTRYLOGS;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_HH_FORMS;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_LHW;
import static edu.aku.hassannaqvi.uen_facility_assessment.database.CreateTable.SQL_CREATE_LHW_HF;
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

import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.EntryLogTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.TableDistricts;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.TableHealthFacilities;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.TableLhw;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.TableTehsil;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.UsersTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Districts;
import edu.aku.hassannaqvi.uen_facility_assessment.models.EntryLog;
import edu.aku.hassannaqvi.uen_facility_assessment.models.Form;
import edu.aku.hassannaqvi.uen_facility_assessment.models.HealthFacilities;
import edu.aku.hassannaqvi.uen_facility_assessment.models.LHW;
import edu.aku.hassannaqvi.uen_facility_assessment.models.ModuleA;
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

        values.put(TableContracts.FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(TableContracts.FormsTable.COLUMN_UID, form.getUid());
        values.put(TableContracts.FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(TableContracts.FormsTable.COLUMN_SYSDATE, form.getSysDate());
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


        values.put(TableContracts.FormsTable.COLUMN_ISTATUS, form.getiStatus());
        values.put(TableContracts.FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(TableContracts.FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(TableContracts.FormsTable.COLUMN_APPVERSION, form.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                TableContracts.FormsTable.TABLE_NAME,
                TableContracts.FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public long addModuleA(ModuleA moda) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();

        values.put(TableContracts.FormsTable.COLUMN_PROJECT_NAME, moda.getProjectName());
        values.put(TableContracts.FormsTable.COLUMN_UID, moda.getUid());
        values.put(TableContracts.FormsTable.COLUMN_USERNAME, moda.getUserName());
        values.put(TableContracts.FormsTable.COLUMN_SYSDATE, moda.getSysDate());
        values.put(FormsTable.COLUMN_SYNCED, moda.getSynced());
        values.put(FormsTable.COLUMN_SYNCED_DATE, moda.getSyncDate());

        values.put(FormsTable.COLUMN_SA, moda.sAtoString());

        values.put(TableContracts.FormsTable.COLUMN_ISTATUS, moda.getiStatus());
        values.put(TableContracts.FormsTable.COLUMN_DEVICETAGID, moda.getDeviceTag());
        values.put(TableContracts.FormsTable.COLUMN_DEVICEID, moda.getDeviceId());
        values.put(TableContracts.FormsTable.COLUMN_APPVERSION, moda.getAppver());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                TableContracts.FormsTable.TABLE_NAME,
                TableContracts.FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }



    //UPDATE in DB
    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = TableContracts.FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(TableContracts.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesModuleAColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = TableContracts.ModuleATable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.moduleA.getId())};

        return db.update(TableContracts.ModuleATable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(TableContracts.FormsTable.COLUMN_ISTATUS, MainApp.form.getiStatus());

        // Which row to update, based on the ID
        String selection = TableContracts.FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(TableContracts.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    //Functions that dealing with table data
    public boolean doLogin(String username, String password) throws InvalidKeySpecException, NoSuchAlgorithmException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = TableContracts.UsersTable.COLUMN_USERNAME + "=? ";
        String[] whereArgs = {username};
        String groupBy = null;
        String having = null;
        String orderBy = TableContracts.UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = new Users();
        c = db.query(
                TableContracts.UsersTable.TABLE_NAME,  // The table to query
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
                TableContracts.FormsTable._ID,
                TableContracts.FormsTable.COLUMN_UID,
                TableContracts.FormsTable.COLUMN_SYSDATE,
                TableContracts.FormsTable.COLUMN_USERNAME,
                TableContracts.FormsTable.COLUMN_ISTATUS,
                TableContracts.FormsTable.COLUMN_SYNCED,

        };
        String whereClause = TableContracts.FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = TableContracts.FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        c = db.query(
                TableContracts.FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Form forms = new Form();
            forms.setId(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_ID)));
            forms.setUid(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_UID)));
            forms.setSysDate(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_SYSDATE)));
            forms.setUserName(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_USERNAME)));
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
        whereClause = TableContracts.FormsTable.COLUMN_UID + "=? AND " +
                TableContracts.FormsTable.COLUMN_ISTATUS + " in " + istatus;

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.FormsTable.COLUMN_ID + " ASC";

        Form allFC = null;
        c = db.query(
                TableContracts.FormsTable.TABLE_NAME,  // The table to query
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
        db.delete(TableContracts.VersionTable.TABLE_NAME, null, null);
        long count = 0;
        JSONObject jsonObjectCC = ((JSONArray) VersionList.get(TableContracts.VersionTable.COLUMN_VERSION_PATH)).getJSONObject(0);
        VersionApp Vc = new VersionApp();
        Vc.sync(jsonObjectCC);

        ContentValues values = new ContentValues();

        values.put(TableContracts.VersionTable.COLUMN_PATH_NAME, Vc.getPathname());
        values.put(TableContracts.VersionTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
        values.put(TableContracts.VersionTable.COLUMN_VERSION_NAME, Vc.getVersionname());

        count = db.insert(TableContracts.VersionTable.TABLE_NAME, null, values);
        if (count > 0) count = 1;


        db.close();


        return (int) count;
    }

    public int syncUser(JSONArray userList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableContracts.UsersTable.TABLE_NAME, null, null);
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
            long rowID = db.insert(TableContracts.UsersTable.TABLE_NAME, null, values);
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
        whereClause = TableContracts.FormsTable.COLUMN_SYNCED + " ='' AND " +
                TableContracts.FormsTable.COLUMN_ISTATUS + "!= ''";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.FormsTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();

        c = db.query(
                TableContracts.FormsTable.TABLE_NAME,  // The table to query
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
        values.put(TableContracts.FormsTable.COLUMN_SYNCED, true);
        values.put(TableContracts.FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = TableContracts.FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                TableContracts.FormsTable.TABLE_NAME,
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
        String[] columns = {TableContracts.TableDistricts.COLUMN_DISTRICT_CODE, TableContracts.TableDistricts.COLUMN_DISTRICT_NAME};

        String orderBy = TableContracts.TableDistricts.COLUMN_DISTRICT_NAME + " ASC";

        Collection<Districts> allDistricts = new ArrayList<>();
        c = db.query(
                true,
                TableContracts.TableDistricts.TABLE_NAME,  // The table to query
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
            cluster.setDistrictCode(c.getString(c.getColumnIndexOrThrow(TableContracts.TableDistricts.COLUMN_DISTRICT_CODE)));
            cluster.setDistrictName(c.getString(c.getColumnIndexOrThrow(TableContracts.TableDistricts.COLUMN_DISTRICT_NAME)));
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
        whereClause = TableContracts.FormsTable.COLUMN_LHW_CODE + "=? AND " +
                TableContracts.FormsTable.COLUMN_KHANDAN_NO + " =? ";

        String[] whereArgs = {cluster_no, hh_no};

        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.FormsTable.COLUMN_ID + " ASC";

        Form HHForm = null;

        c = db.query(
                TableContracts.FormsTable.TABLE_NAME,  // The table to query
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
        String whereClause = TableContracts.FormsTable.COLUMN_LHW_CODE + " = ? ";
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                TableContracts.FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allFC = new ArrayList<>();

        c = db.query(
                TableContracts.FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Form fc = new Form();
            fc.setId(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_ID)));
            fc.setUid(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_UID)));
            fc.setSysDate(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_SYSDATE)));
            fc.setiStatus(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_ISTATUS)));
            fc.setSynced(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_SYNCED)));
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
        String whereClause = TableContracts.FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();

        c = db.query(
                TableContracts.FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Form fc = new Form();
            fc.setId(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_ID)));
            fc.setUid(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_UID)));
            fc.setSysDate(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_SYSDATE)));
            fc.setiStatus(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_ISTATUS)));
            fc.setSynced(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_SYNCED)));
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
        String whereClause = TableContracts.FormsTable.COLUMN_ISTATUS + " = ?";
        String[] whereArgs = new String[]{""};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();
        c = db.query(
                TableContracts.FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Form fc = new Form();
            fc.setId(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_ID)));
            fc.setUid(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_UID)));
            fc.setSysDate(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_SYSDATE)));
            fc.setiStatus(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_ISTATUS)));
            fc.setSynced(c.getString(c.getColumnIndexOrThrow(TableContracts.FormsTable.COLUMN_SYNCED)));
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

        String orderBy = TableContracts.TableTehsil.COLUMN_ID + " ASC";

        List<Tehsil> tehsils = new ArrayList<>();

        c = db.query(
                TableContracts.TableTehsil.TABLE_NAME,  // The table to query
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

        String orderBy = TableContracts.TableHealthFacilities.COLUMN_ID + " ASC";

        List<HealthFacilities> healthFacilities = new ArrayList<>();

        c = db.query(
                TableContracts.TableHealthFacilities.TABLE_NAME,  // The table to query
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