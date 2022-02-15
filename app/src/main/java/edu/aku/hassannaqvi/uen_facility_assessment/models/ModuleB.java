package edu.aku.hassannaqvi.uen_facility_assessment.models;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.uen_facility_assessment.BR;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleBTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleB extends BaseObservable implements Observable {

    private final String TAG = "ModuleB";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private String projectName = MainApp.PROJECT_NAME;


    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String cluster = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;


    // FIELD VARIABLES
    private String b01 = _EMPTY_;
    private String b02 = _EMPTY_;
    private String b03 = _EMPTY_;
    private String b04 = _EMPTY_;
    private String b05 = _EMPTY_;


    public ModuleB() {
    }


    public void populateMeta() {
        setProjectName(PROJECT_NAME);
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.versionName + "." + MainApp.versionCode);
        setUserName(MainApp.user.getUserName());
        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        /*setProvinceCode(selectedProvince);
        setDistrictCode(selectedDistrict);
        setTehsilCode(selectedTehsil);
        setUcCode(selectedUc);
        setVillageCode(selectedVillage);
        setPsuCode(selectedPSU);
        setHhid(selectedHHID);*/
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


    public ModuleB Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_SYNCED_DATE));
        sBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleBTable.COLUMN_SB)));
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
        json.put(ModuleBTable.COLUMN_ID, this.id);
        json.put(ModuleBTable.COLUMN_UID, this.uid);
        json.put(ModuleBTable.COLUMN_USERNAME, this.userName);
        json.put(ModuleBTable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleBTable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleBTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleBTable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleBTable.COLUMN_SYNCED, this.synced);
        json.put(ModuleBTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleBTable.COLUMN_SB, new JSONObject(sBtoString()));
        return json;
    }


}
