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
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleATable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleA extends BaseObservable implements Observable {

    private final String TAG = "ModuleA";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
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
    private String a01 = _EMPTY_;
    private String a03d = _EMPTY_;
    private String a03m = _EMPTY_;
    private String a03y = _EMPTY_;
    private String a07 = _EMPTY_;
    private String a08 = _EMPTY_;
    private String a09 = _EMPTY_;
    private String a10 = _EMPTY_;
    private String a11 = _EMPTY_;
    private String a12 = _EMPTY_;
    private String a13 = _EMPTY_;
    private String a14 = _EMPTY_;
    private String a15 = _EMPTY_;
    private String a16 = _EMPTY_;
    private String a17 = _EMPTY_;
    private String a18 = _EMPTY_;
    private String a18xx = _EMPTY_;
    private String a19 = _EMPTY_;
    private String a19xx = _EMPTY_;
    private String a20 = _EMPTY_;
    private String a21 = _EMPTY_;
    private String a22 = _EMPTY_;


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


    @Bindable
    public String getA01() {
        return a01;
    }

    public void setA01(String a01) {
        this.a01 = a01;
        notifyPropertyChanged(BR.a01);
    }

    @Bindable
    public String getA03d() {
        return a03d;
    }

    public void setA03d(String a03d) {
        this.a03d = a03d;
        notifyPropertyChanged(BR.a03d);
    }

    @Bindable
    public String getA03m() {
        return a03m;
    }

    public void setA03m(String a03m) {
        this.a03m = a03m;
        notifyPropertyChanged(BR.a03m);
    }

    @Bindable
    public String getA03y() {
        return a03y;
    }

    public void setA03y(String a03y) {
        this.a03y = a03y;
        notifyPropertyChanged(BR.a03y);
    }


    @Bindable
    public String getA07() {
        return a07;
    }

    public void setA07(String a07) {
        this.a07 = a07;
        notifyPropertyChanged(BR.a07);
    }

    @Bindable
    public String getA08() {
        return a08;
    }

    public void setA08(String a08) {
        this.a08 = a08;
        notifyPropertyChanged(BR.a08);
    }

    @Bindable
    public String getA09() {
        return a09;
    }

    public void setA09(String a09) {
        this.a09 = a09;
        notifyPropertyChanged(BR.a09);
    }

    @Bindable
    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
        notifyPropertyChanged(BR.a10);
    }

    @Bindable
    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
        notifyPropertyChanged(BR.a11);
    }

    @Bindable
    public String getA12() {
        return a12;
    }

    public void setA12(String a12) {
        this.a12 = a12;
        notifyPropertyChanged(BR.a12);
    }

    @Bindable
    public String getA13() {
        return a13;
    }

    public void setA13(String a13) {
        this.a13 = a13;
        notifyPropertyChanged(BR.a13);
    }

    @Bindable
    public String getA14() {
        return a14;
    }

    public void setA14(String a14) {
        this.a14 = a14;
        notifyPropertyChanged(BR.a14);
    }

    @Bindable
    public String getA15() {
        return a15;
    }

    public void setA15(String a15) {
        this.a15 = a15;
        notifyPropertyChanged(BR.a15);
    }

    @Bindable
    public String getA16() {
        return a16;
    }

    public void setA16(String a16) {
        this.a16 = a16;
        notifyPropertyChanged(BR.a16);
    }

    @Bindable
    public String getA17() {
        return a17;
    }

    public void setA17(String a17) {
        this.a17 = a17;
        notifyPropertyChanged(BR.a17);
    }

    @Bindable
    public String getA18() {
        return a18;
    }

    public void setA18(String a18) {
        this.a18 = a18;
        notifyPropertyChanged(BR.a18);
    }

    @Bindable
    public String getA18xx() {
        return a18xx;
    }

    public void setA18xx(String a18xx) {
        this.a18xx = a18xx;
        notifyPropertyChanged(BR.a18xx);
    }

    @Bindable
    public String getA19() {
        return a19;
    }

    public void setA19(String a19) {
        this.a19 = a19;
        notifyPropertyChanged(BR.a19);
    }

    @Bindable
    public String getA19xx() {
        return a19xx;
    }

    public void setA19xx(String a19xx) {
        this.a19xx = a19xx;
        notifyPropertyChanged(BR.a19xx);
    }

    @Bindable
    public String getA20() {
        return a20;
    }

    public void setA20(String a20) {
        this.a20 = a20;
        notifyPropertyChanged(BR.a20);
    }

    @Bindable
    public String getA21() {
        return a21;
    }

    public void setA21(String a21) {
        this.a21 = a21;
        notifyPropertyChanged(BR.a21);
    }

    @Bindable
    public String getA22() {
        return a22;
    }

    public void setA22(String a22) {
        this.a22 = a22;
        notifyPropertyChanged(BR.a22);
    }


    public ModuleA() {
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



    public ModuleA Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_SYNCED_DATE));
        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleATable.COLUMN_SA)));
        return this;
    }
    

    public void sAHydrate(String string) throws JSONException {
        Log.d(TAG, "sAHydrate: " + string);
        if (string != null) {

            JSONObject json = null;
            json = new JSONObject(string);
            this.a01 = json.getString("a01");
            this.a03d = json.getString("a03d");
            this.a03m = json.getString("a03m");
            this.a03y = json.getString("a03y");
            this.a07 = json.getString("a07");
            this.a08 = json.getString("a08");
            this.a09 = json.getString("a09");
            this.a10 = json.getString("a10");
            this.a11 = json.getString("a11");
            this.a12 = json.getString("a12");
            this.a13 = json.getString("a13");
            this.a14 = json.getString("a14");
            this.a15 = json.getString("a15");
            this.a16 = json.getString("a16");
            this.a17 = json.getString("a17");
            this.a18 = json.getString("a18");
            this.a18xx = json.getString("a18xx");
            this.a19 = json.getString("a19");
            this.a19xx = json.getString("a19xx");
            this.a20 = json.getString("a20");
            this.a21 = json.getString("a21");
            this.a22 = json.getString("a22");
        }
    }
    


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(ModuleATable.COLUMN_ID, this.id);
        json.put(ModuleATable.COLUMN_UID, this.uid);
        json.put(ModuleATable.COLUMN_USERNAME, this.userName);
        json.put(ModuleATable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleATable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleATable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleATable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleATable.COLUMN_SYNCED, this.synced);
        json.put(ModuleATable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleATable.COLUMN_SA, new JSONObject(sAtoString()));
        return json;
    }
    

    public String sAtoString() throws JSONException {
        Log.d(TAG, "sAtoString: ");
        JSONObject json = new JSONObject();
        json.put("a01", a01)
                .put("a03d", a03d)
                .put("a03m", a03m)
                .put("a03y", a03y)
                .put("a07", a07)
                .put("a08", a08)
                .put("a09", a09)
                .put("a10", a10)
                .put("a11", a11)
                .put("a12", a12)
                .put("a13", a13)
                .put("a14", a14)
                .put("a15", a15)
                .put("a16", a16)
                .put("a17", a17)
                .put("a18", a18)
                .put("a18xx", a18xx)
                .put("a19", a19)
                .put("a19xx", a19xx)
                .put("a20", a20)
                .put("a21", a21)
                .put("a22", a22);
        return json.toString();
    }


}
