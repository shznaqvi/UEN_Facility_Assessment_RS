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
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.StaffingTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class Staffing extends BaseObservable implements Observable {

    private final String TAG = "Staffing";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private String projectName = MainApp.PROJECT_NAME;


    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
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
    private String c021a = _EMPTY_;
    private String c021b = _EMPTY_;
    private String c021bfx = _EMPTY_;
    private String c021c = _EMPTY_;
    private String c021d = _EMPTY_;
    private String c021dgx = _EMPTY_;
    private String c021e = _EMPTY_;


    public Staffing() {
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
    public String getC021a() {
        return c021a;
    }

    public void setC021a(String c021a) {
        this.c021a = c021a;
        notifyPropertyChanged(BR.c021a);
    }

    @Bindable
    public String getC021b() {
        return c021b;
    }

    public void setC021b(String c021b) {
        this.c021b = c021b;

        setC021bfx(c021b.equals("96") ? this.c021bfx : "");

        notifyPropertyChanged(BR.c021b);
    }

    @Bindable
    public String getC021bfx() {
        return c021bfx;
    }

    public void setC021bfx(String c021bfx) {
        this.c021bfx = c021bfx;
        notifyPropertyChanged(BR.c021bfx);
    }

    @Bindable
    public String getC021c() {
        return c021c;
    }

    public void setC021c(String c021c) {
        this.c021c = c021c;
        notifyPropertyChanged(BR.c021c);
    }

    @Bindable
    public String getC021d() {
        return c021d;
    }

    public void setC021d(String c021d) {
        this.c021d = c021d;
        setC021dgx(c021d.equals("96") ? this.c021dgx : "");
        notifyPropertyChanged(BR.c021d);
    }

    @Bindable
    public String getC021dgx() {
        return c021dgx;
    }

    public void setC021dgx(String c021dgx) {
        this.c021dgx = c021dgx;
        notifyPropertyChanged(BR.c021dgx);
    }

    @Bindable
    public String getC021e() {
        return c021e;
    }

    public void setC021e(String c021e) {
        this.c021e = c021e;
        notifyPropertyChanged(BR.c021e);
    }


    public Staffing Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_UUID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_SYNCED_DATE));
        sC2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(StaffingTable.COLUMN_SC2)));
        return this;
    }

    public void sC2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sCHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c021a = json.getString("c021a");
            this.c021b = json.getString("c021b");
            this.c021bfx = json.getString("c021bfx");
            this.c021c = json.getString("c021c");
            this.c021d = json.getString("c021d");
            this.c021dgx = json.getString("c021dgx");
            this.c021e = json.getString("c021e");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(StaffingTable.COLUMN_ID, this.id);
        json.put(StaffingTable.COLUMN_UID, this.uid);
        json.put(StaffingTable.COLUMN_UUID, this.uuid);
        json.put(StaffingTable.COLUMN_USERNAME, this.userName);
        json.put(StaffingTable.COLUMN_SYSDATE, this.sysDate);
        json.put(StaffingTable.COLUMN_DEVICEID, this.deviceId);
        json.put(StaffingTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(StaffingTable.COLUMN_ISTATUS, this.iStatus);
        json.put(StaffingTable.COLUMN_SYNCED, this.synced);
        json.put(StaffingTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(StaffingTable.COLUMN_SC2, new JSONObject(sC2toString()));
        return json;
    }

    public String sC2toString() throws JSONException {
        Log.d(TAG, "sCtoString: ");
        JSONObject json = new JSONObject();
        json.put("c021a", c021a)
                .put("c021b", c021b)
                .put("c021bfx", c021bfx)
                .put("c021c", c021c)
                .put("c021d", c021d)
                .put("c021dgx", c021dgx)
                .put("c021e", c021e);
        return json.toString();
    }


}