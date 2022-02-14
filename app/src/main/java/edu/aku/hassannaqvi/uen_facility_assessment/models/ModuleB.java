package edu.aku.hassannaqvi.uen_facility_assessment.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_facility_assessment.BR;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleB extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private final String wuid = StringUtils.EMPTY;
    private final String cuid = StringUtils.EMPTY;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String cluster = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;

    // SECTION VARIABLES

    private String sB = StringUtils.EMPTY;

    // FIELD VARIABLES

    private String b01 = StringUtils.EMPTY;
    private String b02 = StringUtils.EMPTY;
    private String b03 = StringUtils.EMPTY;
    private String b04 = StringUtils.EMPTY;
    private String b05 = StringUtils.EMPTY;

    @Bindable
    public String getB01() {
        return b01;
    }

    public void setB01(String b01) {
        this.b01 = b01;
        notifyPropertyChanged(BR.b01);
    }

    @Bindable
    public String getB02() {
        return b02;
    }

    public void setB02(String b02) {
        this.b02 = b02;
        notifyPropertyChanged(BR.b02);
    }

    @Bindable
    public String getB03() {
        return b03;
    }

    public void setB03(String b03) {
        this.b03 = b03;
        notifyPropertyChanged(BR.b03);
    }

    @Bindable
    public String getB04() {
        return b04;
    }

    public void setB04(String b04) {
        this.b04 = b04;
        notifyPropertyChanged(BR.b04);
    }

    @Bindable
    public String getB05() {
        return b05;
    }

    public void setB05(String b05) {
        this.b05 = b05;
        notifyPropertyChanged(BR.b05);
    }


    public ModuleB() {
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Bindable
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
        notifyPropertyChanged(BR.cluster);
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }


    /*JSON DATABASE VARIABLES*/

    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }


    public ModuleB Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
//        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_CLUSTER));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));



        sBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB)));


        return this;
    }


    public void sBHydrate(String string) throws JSONException {
        Log.d(TAG, "sBHydrate: " + string);
        if (string != null) {

            JSONObject json = null;
            json = new JSONObject(string);
            this.b01 = json.getString("b01");
            this.b02 = json.getString("b02");
            this.b03 = json.getString("b03");
            this.b04 = json.getString("b04");
            this.b05 = json.getString("b05");
        }
    }


    public String sBtoString() throws JSONException {
        Log.d(TAG, "sBtoString: ");
        JSONObject json = new JSONObject();
        json.put("b01", b01)
                .put("b02", b02)
                .put("b03", b03)
                .put("b04", b04)
                .put("b05", b05);
        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
//        json.put(FormsTable.COLUMN_CLUSTER, this.cluster);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);

        // Household

        json.put(FormsTable.COLUMN_SB, new JSONObject(sBtoString()));

        return json;
    }


}
