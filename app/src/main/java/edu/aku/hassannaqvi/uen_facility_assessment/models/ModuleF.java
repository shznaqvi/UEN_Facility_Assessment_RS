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

import edu.aku.hassannaqvi.uen_facility_assessment.BR;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleFTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleF extends BaseObservable implements Observable {

    private final String TAG = "ModuleF";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private String projectName = MainApp.PROJECT_NAME;
    

    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    private String districtCode = _EMPTY_;
    private String tehsilCode = _EMPTY_;
    private String ucCode = _EMPTY_;
    private String hfCode = _EMPTY_;


    // FIELD VARIABLES
    private String f0100 = _EMPTY_;
    private String f01001 = _EMPTY_;
    private String f0101aa0a = _EMPTY_;
    private String f0101aa0aqx = _EMPTY_;
    private String f0101aa0f = _EMPTY_;
    private String f0101aa0fqx = _EMPTY_;
    private String f0101ab0a = _EMPTY_;
    private String f0101ab0aqx = _EMPTY_;
    private String f0101ab0f = _EMPTY_;
    private String f0101ab0fqx = _EMPTY_;
    private String f0102 = _EMPTY_;
    private String f0103 = _EMPTY_;
    private String f0104 = _EMPTY_;
    private String f0105 = _EMPTY_;
    private String f0105aaa0a = _EMPTY_;
    private String f0105aaa0aqx = _EMPTY_;
    private String f0105aaa0f = _EMPTY_;
    private String f0105aaa0fqx = _EMPTY_;
    private String f0105aab0a = _EMPTY_;
    private String f0105aab0aqx = _EMPTY_;
    private String f0105aab0f = _EMPTY_;
    private String f0105aab0fqx = _EMPTY_;
    private String f0105aac0a = _EMPTY_;
    private String f0105aac0aqx = _EMPTY_;
    private String f0105aac0f = _EMPTY_;
    private String f0105aac0fqx = _EMPTY_;
    private String f0106 = _EMPTY_;
    private String f0106aaa0a = _EMPTY_;
    private String f0106aaa0aqx = _EMPTY_;
    private String f0106aaa0f = _EMPTY_;
    private String f0106aaa0fqx = _EMPTY_;
    private String f0107 = _EMPTY_;
    private String f0108 = _EMPTY_;
    private String f0109 = _EMPTY_;
    private String f0110 = _EMPTY_;
    private String f0110aaa0a = _EMPTY_;
    private String f0110aaa0aqx = _EMPTY_;
    private String f0110aaa0f = _EMPTY_;
    private String f0110aaa0fqx = _EMPTY_;
    private String f0110aab0a = _EMPTY_;
    private String f0110aab0aqx = _EMPTY_;
    private String f0110aab0f = _EMPTY_;
    private String f0110aab0fqx = _EMPTY_;
    private String f0110aac0a = _EMPTY_;
    private String f0110aac0aqx = _EMPTY_;
    private String f0110aac0f = _EMPTY_;
    private String f0110aac0fqx = _EMPTY_;
    private String f0110aad0a = _EMPTY_;
    private String f0110aad0aqx = _EMPTY_;
    private String f0110aad0f = _EMPTY_;
    private String f0110aad0fqx = _EMPTY_;
    private String f0110aae0a = _EMPTY_;
    private String f0110aae0aqx = _EMPTY_;
    private String f0110aae0f = _EMPTY_;
    private String f0110aae0fqx = _EMPTY_;
    private String f0201 = _EMPTY_;
    private String f0201aaa0a = _EMPTY_;
    private String f0201aaa0aqx = _EMPTY_;
    private String f0201aaa0f = _EMPTY_;
    private String f0201aaa0fqx = _EMPTY_;
    private String f0201aab0a = _EMPTY_;
    private String f0201aab0aqx = _EMPTY_;
    private String f0201aab0f = _EMPTY_;
    private String f0201aab0fqx = _EMPTY_;
    private String f0202 = _EMPTY_;
    private String f0202aaa0a = _EMPTY_;
    private String f0202aaa0aqx = _EMPTY_;
    private String f0202aaa0f = _EMPTY_;
    private String f0202aaa0fqx = _EMPTY_;
    private String f0202aab0a = _EMPTY_;
    private String f0202aab0aqx = _EMPTY_;
    private String f0202aab0f = _EMPTY_;
    private String f0202aab0fqx = _EMPTY_;
    private String f0203 = _EMPTY_;
    private String f0203aaa0a = _EMPTY_;
    private String f0203aaa0aqx = _EMPTY_;
    private String f0203aaa0f = _EMPTY_;
    private String f0203aaa0fqx = _EMPTY_;
    private String f0203aab0a = _EMPTY_;
    private String f0203aab0aqx = _EMPTY_;
    private String f0203aab0f = _EMPTY_;
    private String f0203aab0fqx = _EMPTY_;
    private String f0301 = _EMPTY_;
    private String f0301aaa0a = _EMPTY_;
    private String f0301aaa0aqx = _EMPTY_;
    private String f0301aaa0f = _EMPTY_;
    private String f0301aaa0fqx = _EMPTY_;
    private String f0302 = _EMPTY_;
    private String f0302aaa0a = _EMPTY_;
    private String f0302aaa0aqx = _EMPTY_;
    private String f0302aaa0f = _EMPTY_;
    private String f0401 = _EMPTY_;
    private String f0401aaa0a = _EMPTY_;
    private String f0401aaa0aqx = _EMPTY_;
    private String f0401aaa0f = _EMPTY_;
    private String f0401aaa0fqx = _EMPTY_;
    private String f0401aab0a = _EMPTY_;
    private String f0401aab0aqx = _EMPTY_;
    private String f0401aab0f = _EMPTY_;
    private String f0401aab0fqx = _EMPTY_;
    private String f0401aac0a = _EMPTY_;
    private String f0401aac0aqx = _EMPTY_;
    private String f0401aac0f = _EMPTY_;
    private String f0401aac0fqx = _EMPTY_;
    private String f0402 = _EMPTY_;
    private String f0402aaa0a = _EMPTY_;
    private String f0402aaa0aqx = _EMPTY_;
    private String f0402aaa0f = _EMPTY_;
    private String f0402aaa0fqx = _EMPTY_;
    private String f0403 = _EMPTY_;
    private String f0403aaa0a = _EMPTY_;
    private String f0403aaa0aqx = _EMPTY_;
    private String f0403aaa0f = _EMPTY_;
    private String f0403aaa0fqx = _EMPTY_;
    private String f0404 = _EMPTY_;
    private String f0404aaa0a = _EMPTY_;
    private String f0404aaa0aqx = _EMPTY_;
    private String f0404aaa0f = _EMPTY_;
    private String f0404aaa0fqx = _EMPTY_;
    private String f0501 = _EMPTY_;
    private String f05021 = _EMPTY_;
    private String f05021qx = _EMPTY_;
    private String f05022 = _EMPTY_;
    private String f05022qx = _EMPTY_;
    private String f0601 = _EMPTY_;
    private String f0602 = _EMPTY_;
    private String f0603 = _EMPTY_;
    private String f0604 = _EMPTY_;
    private String f060401a = _EMPTY_;
    private String f060401aqx = _EMPTY_;
    private String f060401f = _EMPTY_;
    private String f060401fqx = _EMPTY_;
    private String f060402a = _EMPTY_;
    private String f060402aqx = _EMPTY_;
    private String f060402f = _EMPTY_;
    private String f060402fqx = _EMPTY_;
    private String f060403a = _EMPTY_;
    private String f060403aqx = _EMPTY_;
    private String f060403f = _EMPTY_;
    private String f060403fqx = _EMPTY_;
    private String f0701 = _EMPTY_;
    private String f0701aaa0a = _EMPTY_;
    private String f0701aaa0aqx = _EMPTY_;
    private String f0701aaa0f = _EMPTY_;
    private String f0701aaa0fqx = _EMPTY_;
    private String f0701aab0a = _EMPTY_;
    private String f0701aab0aqx = _EMPTY_;
    private String f0701aab0f = _EMPTY_;
    private String f0701aab0fqx = _EMPTY_;
    private String f0701aac0a = _EMPTY_;
    private String f0701aac0aqx = _EMPTY_;
    private String f0701aac0f = _EMPTY_;
    private String f0701aac0fqx = _EMPTY_;
    private String f0701aad0a = _EMPTY_;
    private String f0701aad0aqx = _EMPTY_;
    private String f0701aad0f = _EMPTY_;
    private String f0701aad0fqx = _EMPTY_;


    public ModuleF() {
    }


    public void populateMeta() {
        setProjectName(PROJECT_NAME);
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setUserName(MainApp.user.getUserName());
        setSysDate(MainApp.form.getSysDate());
        setUuid(MainApp.form.getUid());
        setDistrictCode(MainApp.form.getDistrictCode());
        setTehsilCode(MainApp.form.getTehsilCode());
        setUcCode(MainApp.form.getUcCode());
        setHfCode(MainApp.form.getHfCode());
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


    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }


    public String getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
    }


    public String getUcCode() {
        return ucCode;
    }

    public void setUcCode(String ucCode) {
        this.ucCode = ucCode;
    }


    public String getHfCode() {
        return hfCode;
    }

    public void setHfCode(String hfCode) {
        this.hfCode = hfCode;
    }


    @Bindable
    public String getF0100() {
        return f0100;
    }

    public void setF0100(String f0100) {
        this.f0100 = f0100;
        setF01001(f0100.equals("1") ? this.f01001 : "");
        setF0101aa0a(f0100.equals("1") ? this.f0101aa0a : "");
        setF0101ab0a(f0100.equals("1") ? this.f0101ab0a : "");
        notifyPropertyChanged(BR.f0100);
    }

    @Bindable
    public String getF01001() {
        return f01001;
    }

    public void setF01001(String f01001) {
        this.f01001 = f01001;
        notifyPropertyChanged(BR.f01001);
    }

    @Bindable
    public String getF0101aa0a() {
        return f0101aa0a;
    }

    public void setF0101aa0a(String f0101aa0a) {
        this.f0101aa0a = f0101aa0a;
        setF0101aa0aqx(f0101aa0a.equals("1") ? this.f0101aa0aqx : "");
        setF0101aa0f(f0101aa0a.equals("1") ? this.f0101aa0f : "");
        notifyPropertyChanged(BR.f0101aa0a);
    }

    @Bindable
    public String getF0101aa0aqx() {
        return f0101aa0aqx;
    }

    public void setF0101aa0aqx(String f0101aa0aqx) {
        this.f0101aa0aqx = f0101aa0aqx;
        notifyPropertyChanged(BR.f0101aa0aqx);
    }

    @Bindable
    public String getF0101aa0f() {
        return f0101aa0f;
    }

    public void setF0101aa0f(String f0101aa0f) {
        this.f0101aa0f = f0101aa0f;
        setF0101aa0fqx(f0101aa0f.equals("1") ? this.f0101aa0fqx : "");
        notifyPropertyChanged(BR.f0101aa0f);
    }

    @Bindable
    public String getF0101aa0fqx() {
        return f0101aa0fqx;
    }

    public void setF0101aa0fqx(String f0101aa0fqx) {
        this.f0101aa0fqx = f0101aa0fqx;
        notifyPropertyChanged(BR.f0101aa0fqx);
    }

    @Bindable
    public String getF0101ab0a() {
        return f0101ab0a;
    }

    public void setF0101ab0a(String f0101ab0a) {
        this.f0101ab0a = f0101ab0a;
        setF0101ab0aqx(f0101ab0a.equals("1") ? this.f0101ab0aqx : "");
        setF0101ab0f(f0101ab0a.equals("1") ? this.f0101ab0f : "");
        notifyPropertyChanged(BR.f0101ab0a);
    }

    @Bindable
    public String getF0101ab0aqx() {
        return f0101ab0aqx;
    }

    public void setF0101ab0aqx(String f0101ab0aqx) {
        this.f0101ab0aqx = f0101ab0aqx;
        notifyPropertyChanged(BR.f0101ab0aqx);
    }

    @Bindable
    public String getF0101ab0f() {
        return f0101ab0f;
    }

    public void setF0101ab0f(String f0101ab0f) {
        this.f0101ab0f = f0101ab0f;
        setF0101ab0fqx(f0101ab0f.equals("1") ? this.f0101ab0fqx : "");
        notifyPropertyChanged(BR.f0101ab0f);
    }

    @Bindable
    public String getF0101ab0fqx() {
        return f0101ab0fqx;
    }

    public void setF0101ab0fqx(String f0101ab0fqx) {
        this.f0101ab0fqx = f0101ab0fqx;
        notifyPropertyChanged(BR.f0101ab0fqx);
    }

    @Bindable
    public String getF0102() {
        return f0102;
    }

    public void setF0102(String f0102) {
        this.f0102 = f0102;
        notifyPropertyChanged(BR.f0102);
    }

    @Bindable
    public String getF0103() {
        return f0103;
    }

    public void setF0103(String f0103) {
        this.f0103 = f0103;
        notifyPropertyChanged(BR.f0103);
    }

    @Bindable
    public String getF0104() {
        return f0104;
    }

    public void setF0104(String f0104) {
        this.f0104 = f0104;
        notifyPropertyChanged(BR.f0104);
    }

    @Bindable
    public String getF0105() {
        return f0105;
    }

    public void setF0105(String f0105) {
        this.f0105 = f0105;
        setF0105aaa0a(f0105.equals("1") ? this.f0105aaa0a : "");
        setF0105aab0a(f0105.equals("1") ? this.f0105aab0a : "");
        setF0105aac0a(f0105.equals("1") ? this.f0105aac0a : "");
        notifyPropertyChanged(BR.f0105);
    }

    @Bindable
    public String getF0105aaa0a() {
        return f0105aaa0a;
    }

    public void setF0105aaa0a(String f0105aaa0a) {
        this.f0105aaa0a = f0105aaa0a;
        setF0105aaa0aqx(f0105aaa0a.equals("1") ? this.f0105aaa0aqx : "");
        setF0105aaa0f(f0105aaa0a.equals("1") ? this.f0105aaa0f : "");
        notifyPropertyChanged(BR.f0105aaa0a);
    }

    @Bindable
    public String getF0105aaa0aqx() {
        return f0105aaa0aqx;
    }

    public void setF0105aaa0aqx(String f0105aaa0aqx) {
        this.f0105aaa0aqx = f0105aaa0aqx;
        notifyPropertyChanged(BR.f0105aaa0aqx);
    }

    @Bindable
    public String getF0105aaa0f() {
        return f0105aaa0f;
    }

    public void setF0105aaa0f(String f0105aaa0f) {
        this.f0105aaa0f = f0105aaa0f;
        setF0105aaa0fqx(f0105aaa0f.equals("1") ? this.f0105aaa0fqx : "");
        notifyPropertyChanged(BR.f0105aaa0f);
    }

    @Bindable
    public String getF0105aaa0fqx() {
        return f0105aaa0fqx;
    }

    public void setF0105aaa0fqx(String f0105aaa0fqx) {
        this.f0105aaa0fqx = f0105aaa0fqx;
        notifyPropertyChanged(BR.f0105aaa0fqx);
    }

    @Bindable
    public String getF0105aab0a() {
        return f0105aab0a;
    }

    public void setF0105aab0a(String f0105aab0a) {
        this.f0105aab0a = f0105aab0a;
        setF0105aab0aqx(f0105aab0a.equals("1") ? this.f0105aab0aqx : "");
        setF0105aab0f(f0105aab0a.equals("1") ? this.f0105aab0f : "");
        notifyPropertyChanged(BR.f0105aab0a);
    }

    @Bindable
    public String getF0105aab0aqx() {
        return f0105aab0aqx;
    }

    public void setF0105aab0aqx(String f0105aab0aqx) {
        this.f0105aab0aqx = f0105aab0aqx;
        notifyPropertyChanged(BR.f0105aab0aqx);
    }

    @Bindable
    public String getF0105aab0f() {
        return f0105aab0f;
    }

    public void setF0105aab0f(String f0105aab0f) {
        this.f0105aab0f = f0105aab0f;
        setF0105aab0fqx(f0105aab0f.equals("1") ? this.f0105aab0fqx : "");
        notifyPropertyChanged(BR.f0105aab0f);
    }

    @Bindable
    public String getF0105aab0fqx() {
        return f0105aab0fqx;
    }

    public void setF0105aab0fqx(String f0105aab0fqx) {
        this.f0105aab0fqx = f0105aab0fqx;
        notifyPropertyChanged(BR.f0105aab0fqx);
    }

    @Bindable
    public String getF0105aac0a() {
        return f0105aac0a;
    }

    public void setF0105aac0a(String f0105aac0a) {
        this.f0105aac0a = f0105aac0a;
        setF0105aac0aqx(f0105aac0a.equals("1") ? this.f0105aac0aqx : "");
        setF0105aac0f(f0105aac0a.equals("1") ? this.f0105aac0f : "");
        notifyPropertyChanged(BR.f0105aac0a);
    }

    @Bindable
    public String getF0105aac0aqx() {
        return f0105aac0aqx;
    }

    public void setF0105aac0aqx(String f0105aac0aqx) {
        this.f0105aac0aqx = f0105aac0aqx;
        notifyPropertyChanged(BR.f0105aac0aqx);
    }

    @Bindable
    public String getF0105aac0f() {
        return f0105aac0f;
    }

    public void setF0105aac0f(String f0105aac0f) {
        this.f0105aac0f = f0105aac0f;
        setF0105aac0fqx(f0105aac0f.equals("1") ? this.f0105aac0fqx : "");
        notifyPropertyChanged(BR.f0105aac0f);
    }

    @Bindable
    public String getF0105aac0fqx() {
        return f0105aac0fqx;
    }

    public void setF0105aac0fqx(String f0105aac0fqx) {
        this.f0105aac0fqx = f0105aac0fqx;
        notifyPropertyChanged(BR.f0105aac0fqx);
    }

    @Bindable
    public String getF0106() {
        return f0106;
    }

    public void setF0106(String f0106) {
        this.f0106 = f0106;
        setF0106aaa0a(f0106.equals("1") ? this.f0106aaa0a : "");
        notifyPropertyChanged(BR.f0106);
    }

    @Bindable
    public String getF0106aaa0a() {
        return f0106aaa0a;
    }

    public void setF0106aaa0a(String f0106aaa0a) {
        this.f0106aaa0a = f0106aaa0a;
        setF0106aaa0aqx(f0106aaa0a.equals("1") ? this.f0106aaa0aqx : "");
        setF0106aaa0f(f0106aaa0a.equals("1") ? this.f0106aaa0f : "");
        notifyPropertyChanged(BR.f0106aaa0a);
    }

    @Bindable
    public String getF0106aaa0aqx() {
        return f0106aaa0aqx;
    }

    public void setF0106aaa0aqx(String f0106aaa0aqx) {
        this.f0106aaa0aqx = f0106aaa0aqx;
        notifyPropertyChanged(BR.f0106aaa0aqx);
    }

    @Bindable
    public String getF0106aaa0f() {
        return f0106aaa0f;
    }

    public void setF0106aaa0f(String f0106aaa0f) {
        this.f0106aaa0f = f0106aaa0f;
        setF0106aaa0fqx(f0106aaa0f.equals("1") ? this.f0106aaa0fqx : "");
        notifyPropertyChanged(BR.f0106aaa0f);
    }

    @Bindable
    public String getF0106aaa0fqx() {
        return f0106aaa0fqx;
    }

    public void setF0106aaa0fqx(String f0106aaa0fqx) {
        this.f0106aaa0fqx = f0106aaa0fqx;
        notifyPropertyChanged(BR.f0106aaa0fqx);
    }

    @Bindable
    public String getF0107() {
        return f0107;
    }

    public void setF0107(String f0107) {
        this.f0107 = f0107;
        notifyPropertyChanged(BR.f0107);
    }

    @Bindable
    public String getF0108() {
        return f0108;
    }

    public void setF0108(String f0108) {
        this.f0108 = f0108;
        notifyPropertyChanged(BR.f0108);
    }

    @Bindable
    public String getF0109() {
        return f0109;
    }

    public void setF0109(String f0109) {
        this.f0109 = f0109;
        notifyPropertyChanged(BR.f0109);
    }

    @Bindable
    public String getF0110() {
        return f0110;
    }

    public void setF0110(String f0110) {
        this.f0110 = f0110;
        setF0110aaa0a(f0110.equals("1") ? this.f0110aaa0a : "");
        setF0110aab0a(f0110.equals("1") ? this.f0110aab0a : "");
        setF0110aac0a(f0110.equals("1") ? this.f0110aac0a : "");
        setF0110aad0a(f0110.equals("1") ? this.f0110aad0a : "");
        setF0110aae0a(f0110.equals("1") ? this.f0110aae0a : "");
        notifyPropertyChanged(BR.f0110);
    }

    @Bindable
    public String getF0110aaa0a() {
        return f0110aaa0a;
    }

    public void setF0110aaa0a(String f0110aaa0a) {
        this.f0110aaa0a = f0110aaa0a;
        setF0110aaa0aqx(f0110aaa0a.equals("1") ? this.f0110aaa0aqx : "");
        setF0110aaa0f(f0110aaa0a.equals("1") ? this.f0110aaa0f : "");
        notifyPropertyChanged(BR.f0110aaa0a);
    }

    @Bindable
    public String getF0110aaa0aqx() {
        return f0110aaa0aqx;
    }

    public void setF0110aaa0aqx(String f0110aaa0aqx) {
        this.f0110aaa0aqx = f0110aaa0aqx;
        notifyPropertyChanged(BR.f0110aaa0aqx);
    }

    @Bindable
    public String getF0110aaa0f() {
        return f0110aaa0f;
    }

    public void setF0110aaa0f(String f0110aaa0f) {
        this.f0110aaa0f = f0110aaa0f;
        setF0110aaa0fqx(f0110aaa0f.equals("1") ? this.f0110aaa0fqx : "");
        notifyPropertyChanged(BR.f0110aaa0f);
    }

    @Bindable
    public String getF0110aaa0fqx() {
        return f0110aaa0fqx;
    }

    public void setF0110aaa0fqx(String f0110aaa0fqx) {
        this.f0110aaa0fqx = f0110aaa0fqx;
        notifyPropertyChanged(BR.f0110aaa0fqx);
    }

    @Bindable
    public String getF0110aab0a() {
        return f0110aab0a;
    }

    public void setF0110aab0a(String f0110aab0a) {
        this.f0110aab0a = f0110aab0a;
        setF0110aab0aqx(f0110aab0a.equals("1") ? this.f0110aab0aqx : "");
        setF0110aab0f(f0110aab0a.equals("1") ? this.f0110aab0f : "");
        notifyPropertyChanged(BR.f0110aab0a);
    }

    @Bindable
    public String getF0110aab0aqx() {
        return f0110aab0aqx;
    }

    public void setF0110aab0aqx(String f0110aab0aqx) {
        this.f0110aab0aqx = f0110aab0aqx;
        notifyPropertyChanged(BR.f0110aab0aqx);
    }

    @Bindable
    public String getF0110aab0f() {
        return f0110aab0f;
    }

    public void setF0110aab0f(String f0110aab0f) {
        this.f0110aab0f = f0110aab0f;
        setF0110aab0fqx(f0110aab0f.equals("1") ? this.f0110aab0fqx : "");
        notifyPropertyChanged(BR.f0110aab0f);
    }

    @Bindable
    public String getF0110aab0fqx() {
        return f0110aab0fqx;
    }

    public void setF0110aab0fqx(String f0110aab0fqx) {
        this.f0110aab0fqx = f0110aab0fqx;
        notifyPropertyChanged(BR.f0110aab0fqx);
    }

    @Bindable
    public String getF0110aac0a() {
        return f0110aac0a;
    }

    public void setF0110aac0a(String f0110aac0a) {
        this.f0110aac0a = f0110aac0a;
        setF0110aac0aqx(f0110aac0a.equals("1") ? this.f0110aac0aqx : "");
        setF0110aac0f(f0110aac0a.equals("1") ? this.f0110aac0f : "");
        notifyPropertyChanged(BR.f0110aac0a);
    }

    @Bindable
    public String getF0110aac0aqx() {
        return f0110aac0aqx;
    }

    public void setF0110aac0aqx(String f0110aac0aqx) {
        this.f0110aac0aqx = f0110aac0aqx;
        notifyPropertyChanged(BR.f0110aac0aqx);
    }

    @Bindable
    public String getF0110aac0f() {
        return f0110aac0f;
    }

    public void setF0110aac0f(String f0110aac0f) {
        this.f0110aac0f = f0110aac0f;
        setF0110aac0fqx(f0110aac0f.equals("1") ? this.f0110aac0fqx : "");
        notifyPropertyChanged(BR.f0110aac0f);
    }

    @Bindable
    public String getF0110aac0fqx() {
        return f0110aac0fqx;
    }

    public void setF0110aac0fqx(String f0110aac0fqx) {
        this.f0110aac0fqx = f0110aac0fqx;
        notifyPropertyChanged(BR.f0110aac0fqx);
    }

    @Bindable
    public String getF0110aad0a() {
        return f0110aad0a;
    }

    public void setF0110aad0a(String f0110aad0a) {
        this.f0110aad0a = f0110aad0a;
        setF0110aad0aqx(f0110aad0a.equals("1") ? this.f0110aad0aqx : "");
        setF0110aad0f(f0110aad0a.equals("1") ? this.f0110aad0f : "");
        notifyPropertyChanged(BR.f0110aad0a);
    }

    @Bindable
    public String getF0110aad0aqx() {
        return f0110aad0aqx;
    }

    public void setF0110aad0aqx(String f0110aad0aqx) {
        this.f0110aad0aqx = f0110aad0aqx;
        notifyPropertyChanged(BR.f0110aad0aqx);
    }

    @Bindable
    public String getF0110aad0f() {
        return f0110aad0f;
    }

    public void setF0110aad0f(String f0110aad0f) {
        this.f0110aad0f = f0110aad0f;
        setF0110aad0fqx(f0110aad0f.equals("1") ? this.f0110aad0fqx : "");
        notifyPropertyChanged(BR.f0110aad0f);
    }

    @Bindable
    public String getF0110aad0fqx() {
        return f0110aad0fqx;
    }

    public void setF0110aad0fqx(String f0110aad0fqx) {
        this.f0110aad0fqx = f0110aad0fqx;
        notifyPropertyChanged(BR.f0110aad0fqx);
    }

    @Bindable
    public String getF0110aae0a() {
        return f0110aae0a;
    }

    public void setF0110aae0a(String f0110aae0a) {
        this.f0110aae0a = f0110aae0a;
        setF0110aae0aqx(f0110aae0a.equals("1") ? this.f0110aae0aqx : "");
        setF0110aae0f(f0110aae0a.equals("1") ? this.f0110aae0f : "");
        notifyPropertyChanged(BR.f0110aae0a);
    }

    @Bindable
    public String getF0110aae0aqx() {
        return f0110aae0aqx;
    }

    public void setF0110aae0aqx(String f0110aae0aqx) {
        this.f0110aae0aqx = f0110aae0aqx;
        notifyPropertyChanged(BR.f0110aae0aqx);
    }

    @Bindable
    public String getF0110aae0f() {
        return f0110aae0f;
    }

    public void setF0110aae0f(String f0110aae0f) {
        this.f0110aae0f = f0110aae0f;
        setF0110aae0fqx(f0110aae0f.equals("1") ? this.f0110aae0fqx : "");
        notifyPropertyChanged(BR.f0110aae0f);
    }

    @Bindable
    public String getF0110aae0fqx() {
        return f0110aae0fqx;
    }

    public void setF0110aae0fqx(String f0110aae0fqx) {
        this.f0110aae0fqx = f0110aae0fqx;
        notifyPropertyChanged(BR.f0110aae0fqx);
    }

    @Bindable
    public String getF0201() {
        return f0201;
    }

    public void setF0201(String f0201) {
        this.f0201 = f0201;
        setF0201aaa0a(f0201.equals("1") ? this.f0201aaa0a : "");
        setF0201aab0a(f0201.equals("1") ? this.f0201aab0a : "");
        notifyPropertyChanged(BR.f0201);
    }

    @Bindable
    public String getF0201aaa0a() {
        return f0201aaa0a;
    }

    public void setF0201aaa0a(String f0201aaa0a) {
        this.f0201aaa0a = f0201aaa0a;
        setF0201aaa0aqx(f0201aaa0a.equals("1") ? this.f0201aaa0aqx : "");
        setF0201aaa0f(f0201aaa0a.equals("1") ? this.f0201aaa0f : "");
        notifyPropertyChanged(BR.f0201aaa0a);
    }

    @Bindable
    public String getF0201aaa0aqx() {
        return f0201aaa0aqx;
    }

    public void setF0201aaa0aqx(String f0201aaa0aqx) {
        this.f0201aaa0aqx = f0201aaa0aqx;
        notifyPropertyChanged(BR.f0201aaa0aqx);
    }

    @Bindable
    public String getF0201aaa0f() {
        return f0201aaa0f;
    }

    public void setF0201aaa0f(String f0201aaa0f) {
        this.f0201aaa0f = f0201aaa0f;
        setF0201aaa0fqx(f0201aaa0f.equals("1") ? this.f0201aaa0fqx : "");
        notifyPropertyChanged(BR.f0201aaa0f);
    }

    @Bindable
    public String getF0201aaa0fqx() {
        return f0201aaa0fqx;
    }

    public void setF0201aaa0fqx(String f0201aaa0fqx) {
        this.f0201aaa0fqx = f0201aaa0fqx;
        notifyPropertyChanged(BR.f0201aaa0fqx);
    }

    @Bindable
    public String getF0201aab0a() {
        return f0201aab0a;
    }

    public void setF0201aab0a(String f0201aab0a) {
        this.f0201aab0a = f0201aab0a;
        setF0201aab0aqx(f0201aab0a.equals("1") ? this.f0201aab0aqx : "");
        setF0201aab0f(f0201aab0a.equals("1") ? this.f0201aab0f : "");
        notifyPropertyChanged(BR.f0201aab0a);
    }

    @Bindable
    public String getF0201aab0aqx() {
        return f0201aab0aqx;
    }

    public void setF0201aab0aqx(String f0201aab0aqx) {
        this.f0201aab0aqx = f0201aab0aqx;
        notifyPropertyChanged(BR.f0201aab0aqx);
    }

    @Bindable
    public String getF0201aab0f() {
        return f0201aab0f;
    }

    public void setF0201aab0f(String f0201aab0f) {
        this.f0201aab0f = f0201aab0f;
        setF0201aab0fqx(f0201aab0f.equals("1") ? this.f0201aab0fqx : "");
        notifyPropertyChanged(BR.f0201aab0f);
    }

    @Bindable
    public String getF0201aab0fqx() {
        return f0201aab0fqx;
    }

    public void setF0201aab0fqx(String f0201aab0fqx) {
        this.f0201aab0fqx = f0201aab0fqx;
        notifyPropertyChanged(BR.f0201aab0fqx);
    }

    @Bindable
    public String getF0202() {
        return f0202;
    }

    public void setF0202(String f0202) {
        this.f0202 = f0202;
        setF0202aaa0a(f0202.equals("1") ? this.f0202aaa0a : "");
        setF0202aab0a(f0202.equals("1") ? this.f0202aab0a : "");
        notifyPropertyChanged(BR.f0202);
    }

    @Bindable
    public String getF0202aaa0a() {
        return f0202aaa0a;
    }

    public void setF0202aaa0a(String f0202aaa0a) {
        this.f0202aaa0a = f0202aaa0a;
        setF0202aaa0aqx(f0202aaa0a.equals("1") ? this.f0202aaa0aqx : "");
        setF0202aaa0f(f0202aaa0a.equals("1") ? this.f0202aaa0f : "");
        notifyPropertyChanged(BR.f0202aaa0a);
    }

    @Bindable
    public String getF0202aaa0aqx() {
        return f0202aaa0aqx;
    }

    public void setF0202aaa0aqx(String f0202aaa0aqx) {
        this.f0202aaa0aqx = f0202aaa0aqx;
        notifyPropertyChanged(BR.f0202aaa0aqx);
    }

    @Bindable
    public String getF0202aaa0f() {
        return f0202aaa0f;
    }

    public void setF0202aaa0f(String f0202aaa0f) {
        this.f0202aaa0f = f0202aaa0f;
        setF0202aaa0fqx(f0202aaa0f.equals("1") ? this.f0202aaa0fqx : "");
        notifyPropertyChanged(BR.f0202aaa0f);
    }

    @Bindable
    public String getF0202aaa0fqx() {
        return f0202aaa0fqx;
    }

    public void setF0202aaa0fqx(String f0202aaa0fqx) {
        this.f0202aaa0fqx = f0202aaa0fqx;
        notifyPropertyChanged(BR.f0202aaa0fqx);
    }

    @Bindable
    public String getF0202aab0a() {
        return f0202aab0a;
    }

    public void setF0202aab0a(String f0202aab0a) {
        this.f0202aab0a = f0202aab0a;
        setF0202aab0aqx(f0202aab0a.equals("1") ? this.f0202aab0aqx : "");
        setF0202aab0f(f0202aab0a.equals("1") ? this.f0202aab0f : "");
        notifyPropertyChanged(BR.f0202aab0a);
    }

    @Bindable
    public String getF0202aab0aqx() {
        return f0202aab0aqx;
    }

    public void setF0202aab0aqx(String f0202aab0aqx) {
        this.f0202aab0aqx = f0202aab0aqx;
        notifyPropertyChanged(BR.f0202aab0aqx);
    }

    @Bindable
    public String getF0202aab0f() {
        return f0202aab0f;
    }

    public void setF0202aab0f(String f0202aab0f) {
        this.f0202aab0f = f0202aab0f;
        setF0202aab0fqx(f0202aab0f.equals("1") ? this.f0202aab0fqx : "");
        notifyPropertyChanged(BR.f0202aab0f);
    }

    @Bindable
    public String getF0202aab0fqx() {
        return f0202aab0fqx;
    }

    public void setF0202aab0fqx(String f0202aab0fqx) {
        this.f0202aab0fqx = f0202aab0fqx;
        notifyPropertyChanged(BR.f0202aab0fqx);
    }

    @Bindable
    public String getF0203() {
        return f0203;
    }

    public void setF0203(String f0203) {
        this.f0203 = f0203;
        setF0203aaa0a(f0203.equals("1") ? this.f0203aaa0a : "");
        setF0203aab0a(f0203.equals("1") ? this.f0203aab0a : "");
        notifyPropertyChanged(BR.f0203);
    }

    @Bindable
    public String getF0203aaa0a() {
        return f0203aaa0a;
    }

    public void setF0203aaa0a(String f0203aaa0a) {
        this.f0203aaa0a = f0203aaa0a;
        setF0203aaa0aqx(f0203aaa0a.equals("1") ? this.f0203aaa0aqx : "");
        setF0203aaa0f(f0203aaa0a.equals("1") ? this.f0203aaa0f : "");
        notifyPropertyChanged(BR.f0203aaa0a);
    }

    @Bindable
    public String getF0203aaa0aqx() {
        return f0203aaa0aqx;
    }

    public void setF0203aaa0aqx(String f0203aaa0aqx) {
        this.f0203aaa0aqx = f0203aaa0aqx;
        notifyPropertyChanged(BR.f0203aaa0aqx);
    }

    @Bindable
    public String getF0203aaa0f() {
        return f0203aaa0f;
    }

    public void setF0203aaa0f(String f0203aaa0f) {
        this.f0203aaa0f = f0203aaa0f;
        setF0203aaa0fqx(f0203aaa0f.equals("1") ? this.f0203aaa0fqx : "");
        notifyPropertyChanged(BR.f0203aaa0f);
    }

    @Bindable
    public String getF0203aaa0fqx() {
        return f0203aaa0fqx;
    }

    public void setF0203aaa0fqx(String f0203aaa0fqx) {
        this.f0203aaa0fqx = f0203aaa0fqx;
        notifyPropertyChanged(BR.f0203aaa0fqx);
    }

    @Bindable
    public String getF0203aab0a() {
        return f0203aab0a;
    }

    public void setF0203aab0a(String f0203aab0a) {
        this.f0203aab0a = f0203aab0a;
        setF0203aab0aqx(f0203aab0a.equals("1") ? this.f0203aab0aqx : "");
        setF0203aab0f(f0203aab0a.equals("1") ? this.f0203aab0f : "");
        notifyPropertyChanged(BR.f0203aab0a);
    }

    @Bindable
    public String getF0203aab0aqx() {
        return f0203aab0aqx;
    }

    public void setF0203aab0aqx(String f0203aab0aqx) {
        this.f0203aab0aqx = f0203aab0aqx;
        notifyPropertyChanged(BR.f0203aab0aqx);
    }

    @Bindable
    public String getF0203aab0f() {
        return f0203aab0f;
    }

    public void setF0203aab0f(String f0203aab0f) {
        this.f0203aab0f = f0203aab0f;
        setF0203aaa0aqx(f0203aaa0a.equals("1") ? this.f0203aaa0aqx : "");
        notifyPropertyChanged(BR.f0203aab0f);
    }

    @Bindable
    public String getF0203aab0fqx() {
        return f0203aab0fqx;
    }

    public void setF0203aab0fqx(String f0203aab0fqx) {
        this.f0203aab0fqx = f0203aab0fqx;
        notifyPropertyChanged(BR.f0203aab0fqx);
    }

    @Bindable
    public String getF0301() {
        return f0301;
    }

    public void setF0301(String f0301) {
        this.f0301 = f0301;
        notifyPropertyChanged(BR.f0301);
    }

    @Bindable
    public String getF0301aaa0a() {
        return f0301aaa0a;
    }

    public void setF0301aaa0a(String f0301aaa0a) {
        this.f0301aaa0a = f0301aaa0a;
        setF0301aaa0aqx(f0301aaa0a.equals("1") ? this.f0301aaa0aqx : "");
        notifyPropertyChanged(BR.f0301aaa0a);
    }

    @Bindable
    public String getF0301aaa0aqx() {
        return f0301aaa0aqx;
    }

    public void setF0301aaa0aqx(String f0301aaa0aqx) {
        this.f0301aaa0aqx = f0301aaa0aqx;
        notifyPropertyChanged(BR.f0301aaa0aqx);
    }

    @Bindable
    public String getF0301aaa0f() {
        return f0301aaa0f;
    }

    public void setF0301aaa0f(String f0301aaa0f) {
        this.f0301aaa0f = f0301aaa0f;
        setF0301aaa0fqx(f0301aaa0f.equals("1") ? this.f0301aaa0fqx : "");
        notifyPropertyChanged(BR.f0301aaa0f);
    }

    @Bindable
    public String getF0301aaa0fqx() {
        return f0301aaa0fqx;
    }

    public void setF0301aaa0fqx(String f0301aaa0fqx) {
        this.f0301aaa0fqx = f0301aaa0fqx;
        notifyPropertyChanged(BR.f0301aaa0fqx);
    }

    @Bindable
    public String getF0302() {
        return f0302;
    }

    public void setF0302(String f0302) {
        this.f0302 = f0302;
        notifyPropertyChanged(BR.f0302);
    }

    @Bindable
    public String getF0302aaa0a() {
        return f0302aaa0a;
    }

    public void setF0302aaa0a(String f0302aaa0a) {
        this.f0302aaa0a = f0302aaa0a;
        setF0302aaa0aqx(f0302aaa0a.equals("1") ? this.f0302aaa0aqx : "");
        notifyPropertyChanged(BR.f0302aaa0a);
    }

    @Bindable
    public String getF0302aaa0aqx() {
        return f0302aaa0aqx;
    }

    public void setF0302aaa0aqx(String f0302aaa0aqx) {
        this.f0302aaa0aqx = f0302aaa0aqx;
        notifyPropertyChanged(BR.f0302aaa0aqx);
    }

    @Bindable
    public String getF0302aaa0f() {
        return f0302aaa0f;
    }

    public void setF0302aaa0f(String f0302aaa0f) {
        this.f0302aaa0f = f0302aaa0f;
        notifyPropertyChanged(BR.f0302aaa0f);
    }

    @Bindable
    public String getF0401() {
        return f0401;
    }

    public void setF0401(String f0401) {
        this.f0401 = f0401;
        notifyPropertyChanged(BR.f0401);
    }

    @Bindable
    public String getF0401aaa0a() {
        return f0401aaa0a;
    }

    public void setF0401aaa0a(String f0401aaa0a) {
        this.f0401aaa0a = f0401aaa0a;
        setF0401aaa0aqx(f0401aaa0a.equals("1") ? this.f0401aaa0aqx : "");
        notifyPropertyChanged(BR.f0401aaa0a);
    }

    @Bindable
    public String getF0401aaa0aqx() {
        return f0401aaa0aqx;
    }

    public void setF0401aaa0aqx(String f0401aaa0aqx) {
        this.f0401aaa0aqx = f0401aaa0aqx;
        notifyPropertyChanged(BR.f0401aaa0aqx);
    }

    @Bindable
    public String getF0401aaa0f() {
        return f0401aaa0f;
    }

    public void setF0401aaa0f(String f0401aaa0f) {
        this.f0401aaa0f = f0401aaa0f;
        setF0401aaa0fqx(f0401aaa0f.equals("1") ? this.f0401aaa0fqx : "");
        notifyPropertyChanged(BR.f0401aaa0f);
    }

    @Bindable
    public String getF0401aaa0fqx() {
        return f0401aaa0fqx;
    }

    public void setF0401aaa0fqx(String f0401aaa0fqx) {
        this.f0401aaa0fqx = f0401aaa0fqx;
        notifyPropertyChanged(BR.f0401aaa0fqx);
    }

    @Bindable
    public String getF0401aab0a() {
        return f0401aab0a;
    }

    public void setF0401aab0a(String f0401aab0a) {
        this.f0401aab0a = f0401aab0a;
        setF0401aab0aqx(f0401aab0a.equals("1") ? this.f0401aab0aqx : "");
        notifyPropertyChanged(BR.f0401aab0a);
    }

    @Bindable
    public String getF0401aab0aqx() {
        return f0401aab0aqx;
    }

    public void setF0401aab0aqx(String f0401aab0aqx) {
        this.f0401aab0aqx = f0401aab0aqx;
        notifyPropertyChanged(BR.f0401aab0aqx);
    }

    @Bindable
    public String getF0401aab0f() {
        return f0401aab0f;
    }

    public void setF0401aab0f(String f0401aab0f) {
        this.f0401aab0f = f0401aab0f;
        setF0401aab0fqx(f0401aab0f.equals("1") ? this.f0401aab0fqx : "");
        notifyPropertyChanged(BR.f0401aab0f);
    }

    @Bindable
    public String getF0401aab0fqx() {
        return f0401aab0fqx;
    }

    public void setF0401aab0fqx(String f0401aab0fqx) {
        this.f0401aab0fqx = f0401aab0fqx;
        notifyPropertyChanged(BR.f0401aab0fqx);
    }

    @Bindable
    public String getF0401aac0a() {
        return f0401aac0a;
    }

    public void setF0401aac0a(String f0401aac0a) {
        this.f0401aac0a = f0401aac0a;
        setF0401aac0aqx(f0401aac0a.equals("1") ? this.f0401aac0aqx : "");
        notifyPropertyChanged(BR.f0401aac0a);
    }

    @Bindable
    public String getF0401aac0aqx() {
        return f0401aac0aqx;
    }

    public void setF0401aac0aqx(String f0401aac0aqx) {
        this.f0401aac0aqx = f0401aac0aqx;
        notifyPropertyChanged(BR.f0401aac0aqx);
    }

    @Bindable
    public String getF0401aac0f() {
        return f0401aac0f;
    }

    public void setF0401aac0f(String f0401aac0f) {
        this.f0401aac0f = f0401aac0f;
        setF0401aac0fqx(f0401aac0f.equals("1") ? this.f0401aac0fqx : "");
        notifyPropertyChanged(BR.f0401aac0f);
    }

    @Bindable
    public String getF0401aac0fqx() {
        return f0401aac0fqx;
    }

    public void setF0401aac0fqx(String f0401aac0fqx) {
        this.f0401aac0fqx = f0401aac0fqx;
        notifyPropertyChanged(BR.f0401aac0fqx);
    }

    @Bindable
    public String getF0402() {
        return f0402;
    }

    public void setF0402(String f0402) {
        this.f0402 = f0402;
        notifyPropertyChanged(BR.f0402);
    }

    @Bindable
    public String getF0402aaa0a() {
        return f0402aaa0a;
    }

    public void setF0402aaa0a(String f0402aaa0a) {
        this.f0402aaa0a = f0402aaa0a;
        setF0402aaa0aqx(f0402aaa0a.equals("1") ? this.f0402aaa0aqx : "");
        notifyPropertyChanged(BR.f0402aaa0a);
    }

    @Bindable
    public String getF0402aaa0aqx() {
        return f0402aaa0aqx;
    }

    public void setF0402aaa0aqx(String f0402aaa0aqx) {
        this.f0402aaa0aqx = f0402aaa0aqx;
        notifyPropertyChanged(BR.f0402aaa0aqx);
    }

    @Bindable
    public String getF0402aaa0f() {
        return f0402aaa0f;
    }

    public void setF0402aaa0f(String f0402aaa0f) {
        this.f0402aaa0f = f0402aaa0f;
        setF0402aaa0fqx(f0402aaa0f.equals("1") ? this.f0402aaa0fqx : "");
        notifyPropertyChanged(BR.f0402aaa0f);
    }

    @Bindable
    public String getF0402aaa0fqx() {
        return f0402aaa0fqx;
    }

    public void setF0402aaa0fqx(String f0402aaa0fqx) {
        this.f0402aaa0fqx = f0402aaa0fqx;
        notifyPropertyChanged(BR.f0402aaa0fqx);
    }

    @Bindable
    public String getF0403() {
        return f0403;
    }

    public void setF0403(String f0403) {
        this.f0403 = f0403;
        notifyPropertyChanged(BR.f0403);
    }

    @Bindable
    public String getF0403aaa0a() {
        return f0403aaa0a;
    }

    public void setF0403aaa0a(String f0403aaa0a) {
        this.f0403aaa0a = f0403aaa0a;
        setF0403aaa0aqx(f0403aaa0a.equals("1") ? this.f0403aaa0aqx : "");
        notifyPropertyChanged(BR.f0403aaa0a);
    }

    @Bindable
    public String getF0403aaa0aqx() {
        return f0403aaa0aqx;
    }

    public void setF0403aaa0aqx(String f0403aaa0aqx) {
        this.f0403aaa0aqx = f0403aaa0aqx;
        notifyPropertyChanged(BR.f0403aaa0aqx);
    }

    @Bindable
    public String getF0403aaa0f() {
        return f0403aaa0f;
    }

    public void setF0403aaa0f(String f0403aaa0f) {
        this.f0403aaa0f = f0403aaa0f;
        setF0403aaa0fqx(f0403aaa0f.equals("1") ? this.f0403aaa0fqx : "");
        notifyPropertyChanged(BR.f0403aaa0f);
    }

    @Bindable
    public String getF0403aaa0fqx() {
        return f0403aaa0fqx;
    }

    public void setF0403aaa0fqx(String f0403aaa0fqx) {
        this.f0403aaa0fqx = f0403aaa0fqx;
        notifyPropertyChanged(BR.f0403aaa0fqx);
    }

    @Bindable
    public String getF0404() {
        return f0404;
    }

    public void setF0404(String f0404) {
        this.f0404 = f0404;
        notifyPropertyChanged(BR.f0404);
    }

    @Bindable
    public String getF0404aaa0a() {
        return f0404aaa0a;
    }

    public void setF0404aaa0a(String f0404aaa0a) {
        this.f0404aaa0a = f0404aaa0a;
        setF0404aaa0aqx(f0404aaa0a.equals("1") ? this.f0404aaa0aqx : "");
        notifyPropertyChanged(BR.f0404aaa0a);
    }

    @Bindable
    public String getF0404aaa0aqx() {
        return f0404aaa0aqx;
    }

    public void setF0404aaa0aqx(String f0404aaa0aqx) {
        this.f0404aaa0aqx = f0404aaa0aqx;
        notifyPropertyChanged(BR.f0404aaa0aqx);
    }

    @Bindable
    public String getF0404aaa0f() {
        return f0404aaa0f;
    }

    public void setF0404aaa0f(String f0404aaa0f) {
        this.f0404aaa0f = f0404aaa0f;
        setF0404aaa0fqx(f0404aaa0f.equals("1") ? this.f0404aaa0fqx : "");
        notifyPropertyChanged(BR.f0404aaa0f);
    }

    @Bindable
    public String getF0404aaa0fqx() {
        return f0404aaa0fqx;
    }

    public void setF0404aaa0fqx(String f0404aaa0fqx) {
        this.f0404aaa0fqx = f0404aaa0fqx;
        notifyPropertyChanged(BR.f0404aaa0fqx);
    }

    @Bindable
    public String getF0501() {
        return f0501;
    }

    public void setF0501(String f0501) {
        this.f0501 = f0501;

        notifyPropertyChanged(BR.f0501);
    }

    @Bindable
    public String getF05021() {
        return f05021;
    }

    public void setF05021(String f05021) {
        this.f05021 = f05021;
        setF05021qx(f05021.equals("1") ? this.f05021qx : "");
        notifyPropertyChanged(BR.f05021);
    }

    @Bindable
    public String getF05021qx() {
        return f05021qx;
    }

    public void setF05021qx(String f05021qx) {
        this.f05021qx = f05021qx;
        notifyPropertyChanged(BR.f05021qx);
    }

    @Bindable
    public String getF05022() {
        return f05022;
    }

    public void setF05022(String f05022) {
        this.f05022 = f05022;
        setF05022qx(f05022.equals("1") ? this.f05022qx : "");
        notifyPropertyChanged(BR.f05022);
    }

    @Bindable
    public String getF05022qx() {
        return f05022qx;
    }

    public void setF05022qx(String f05022qx) {
        this.f05022qx = f05022qx;
        notifyPropertyChanged(BR.f05022qx);
    }

    @Bindable
    public String getF0601() {
        return f0601;
    }

    public void setF0601(String f0601) {
        this.f0601 = f0601;
        notifyPropertyChanged(BR.f0601);
    }

    @Bindable
    public String getF0602() {
        return f0602;
    }

    public void setF0602(String f0602) {
        this.f0602 = f0602;
        notifyPropertyChanged(BR.f0602);
    }

    @Bindable
    public String getF0603() {
        return f0603;
    }

    public void setF0603(String f0603) {
        this.f0603 = f0603;
        notifyPropertyChanged(BR.f0603);
    }

    @Bindable
    public String getF0604() {
        return f0604;
    }

    public void setF0604(String f0604) {
        this.f0604 = f0604;
        notifyPropertyChanged(BR.f0604);
    }

    @Bindable
    public String getF060401a() {
        return f060401a;
    }

    public void setF060401a(String f060401a) {
        this.f060401a = f060401a;
        setF060401aqx(f060401a.equals("1") ? this.f060401aqx : "");
        notifyPropertyChanged(BR.f060401a);
    }

    @Bindable
    public String getF060401aqx() {
        return f060401aqx;
    }

    public void setF060401aqx(String f060401aqx) {
        this.f060401aqx = f060401aqx;
        notifyPropertyChanged(BR.f060401aqx);
    }

    @Bindable
    public String getF060401f() {
        return f060401f;
    }

    public void setF060401f(String f060401f) {
        this.f060401f = f060401f;
        setF060401fqx(f060401f.equals("1") ? this.f060401fqx : "");
        notifyPropertyChanged(BR.f060401f);
    }

    @Bindable
    public String getF060401fqx() {
        return f060401fqx;
    }

    public void setF060401fqx(String f060401fqx) {
        this.f060401fqx = f060401fqx;
        notifyPropertyChanged(BR.f060401fqx);
    }

    @Bindable
    public String getF060402a() {
        return f060402a;
    }

    public void setF060402a(String f060402a) {
        this.f060402a = f060402a;
        setF060402aqx(f060402a.equals("1") ? this.f060402aqx : "");
        notifyPropertyChanged(BR.f060402a);
    }

    @Bindable
    public String getF060402aqx() {
        return f060402aqx;
    }

    public void setF060402aqx(String f060402aqx) {
        this.f060402aqx = f060402aqx;
        notifyPropertyChanged(BR.f060402aqx);
    }

    @Bindable
    public String getF060402f() {
        return f060402f;
    }

    public void setF060402f(String f060402f) {
        this.f060402f = f060402f;
        setF060402fqx(f060402f.equals("1") ? this.f060402fqx : "");
        notifyPropertyChanged(BR.f060402f);
    }

    @Bindable
    public String getF060402fqx() {
        return f060402fqx;
    }

    public void setF060402fqx(String f060402fqx) {
        this.f060402fqx = f060402fqx;
        notifyPropertyChanged(BR.f060402fqx);
    }

    @Bindable
    public String getF060403a() {
        return f060403a;
    }

    public void setF060403a(String f060403a) {
        this.f060403a = f060403a;
        setF060403aqx(f060403a.equals("1") ? this.f060403aqx : "");
        notifyPropertyChanged(BR.f060403a);
    }

    @Bindable
    public String getF060403aqx() {
        return f060403aqx;
    }

    public void setF060403aqx(String f060403aqx) {
        this.f060403aqx = f060403aqx;
        notifyPropertyChanged(BR.f060403aqx);
    }

    @Bindable
    public String getF060403f() {
        return f060403f;
    }

    public void setF060403f(String f060403f) {
        this.f060403f = f060403f;
        setF060403fqx(f060403f.equals("1") ? this.f060403fqx : "");
        notifyPropertyChanged(BR.f060403f);
    }

    @Bindable
    public String getF060403fqx() {
        return f060403fqx;
    }

    public void setF060403fqx(String f060403fqx) {
        this.f060403fqx = f060403fqx;
        notifyPropertyChanged(BR.f060403fqx);
    }

    @Bindable
    public String getF0701() {
        return f0701;
    }

    public void setF0701(String f0701) {
        this.f0701 = f0701;
        notifyPropertyChanged(BR.f0701);
    }

    @Bindable
    public String getF0701aaa0a() {
        return f0701aaa0a;
    }

    public void setF0701aaa0a(String f0701aaa0a) {
        this.f0701aaa0a = f0701aaa0a;
        setF0701aaa0aqx(f0701aaa0a.equals("1") ? this.f0701aaa0aqx : "");
        notifyPropertyChanged(BR.f0701aaa0a);
    }

    @Bindable
    public String getF0701aaa0aqx() {
        return f0701aaa0aqx;
    }

    public void setF0701aaa0aqx(String f0701aaa0aqx) {
        this.f0701aaa0aqx = f0701aaa0aqx;
        notifyPropertyChanged(BR.f0701aaa0aqx);
    }

    @Bindable
    public String getF0701aaa0f() {
        return f0701aaa0f;
    }

    public void setF0701aaa0f(String f0701aaa0f) {
        this.f0701aaa0f = f0701aaa0f;
        setF0701aaa0fqx(f0701aaa0f.equals("1") ? this.f0701aaa0fqx : "");
        notifyPropertyChanged(BR.f0701aaa0f);
    }

    @Bindable
    public String getF0701aaa0fqx() {
        return f0701aaa0fqx;
    }

    public void setF0701aaa0fqx(String f0701aaa0fqx) {
        this.f0701aaa0fqx = f0701aaa0fqx;
        notifyPropertyChanged(BR.f0701aaa0fqx);
    }

    @Bindable
    public String getF0701aab0a() {
        return f0701aab0a;
    }

    public void setF0701aab0a(String f0701aab0a) {
        this.f0701aab0a = f0701aab0a;
        setF0701aab0aqx(f0701aab0a.equals("1") ? this.f0701aab0aqx : "");
        notifyPropertyChanged(BR.f0701aab0a);
    }

    @Bindable
    public String getF0701aab0aqx() {
        return f0701aab0aqx;
    }

    public void setF0701aab0aqx(String f0701aab0aqx) {
        this.f0701aab0aqx = f0701aab0aqx;
        notifyPropertyChanged(BR.f0701aab0aqx);
    }

    @Bindable
    public String getF0701aab0f() {
        return f0701aab0f;
    }

    public void setF0701aab0f(String f0701aab0f) {
        this.f0701aab0f = f0701aab0f;
        setF0701aab0fqx(f0701aab0f.equals("1") ? this.f0701aab0fqx : "");
        notifyPropertyChanged(BR.f0701aab0f);
    }

    @Bindable
    public String getF0701aab0fqx() {
        return f0701aab0fqx;
    }

    public void setF0701aab0fqx(String f0701aab0fqx) {
        this.f0701aab0fqx = f0701aab0fqx;
        notifyPropertyChanged(BR.f0701aab0fqx);
    }

    @Bindable
    public String getF0701aac0a() {
        return f0701aac0a;
    }

    public void setF0701aac0a(String f0701aac0a) {
        this.f0701aac0a = f0701aac0a;
        setF0701aac0aqx(f0701aac0a.equals("1") ? this.f0701aac0aqx : "");
        notifyPropertyChanged(BR.f0701aac0a);
    }

    @Bindable
    public String getF0701aac0aqx() {
        return f0701aac0aqx;
    }

    public void setF0701aac0aqx(String f0701aac0aqx) {
        this.f0701aac0aqx = f0701aac0aqx;
        notifyPropertyChanged(BR.f0701aac0aqx);
    }

    @Bindable
    public String getF0701aac0f() {
        return f0701aac0f;
    }

    public void setF0701aac0f(String f0701aac0f) {
        this.f0701aac0f = f0701aac0f;
        setF0701aaa0fqx(f0701aaa0f.equals("1") ? this.f0701aaa0fqx : "");
        notifyPropertyChanged(BR.f0701aac0f);
    }

    @Bindable
    public String getF0701aac0fqx() {
        return f0701aac0fqx;
    }

    public void setF0701aac0fqx(String f0701aac0fqx) {
        this.f0701aac0fqx = f0701aac0fqx;
        notifyPropertyChanged(BR.f0701aac0fqx);
    }

    @Bindable
    public String getF0701aad0a() {
        return f0701aad0a;
    }

    public void setF0701aad0a(String f0701aad0a) {
        this.f0701aad0a = f0701aad0a;
        setF0701aad0aqx(f0701aad0a.equals("1") ? this.f0701aad0aqx : "");
        notifyPropertyChanged(BR.f0701aad0a);
    }

    @Bindable
    public String getF0701aad0aqx() {
        return f0701aad0aqx;
    }

    public void setF0701aad0aqx(String f0701aad0aqx) {
        this.f0701aad0aqx = f0701aad0aqx;
        notifyPropertyChanged(BR.f0701aad0aqx);
    }

    @Bindable
    public String getF0701aad0f() {
        return f0701aad0f;
    }

    public void setF0701aad0f(String f0701aad0f) {
        this.f0701aad0f = f0701aad0f;
        setF0701aad0fqx(f0701aad0f.equals("1") ? this.f0701aad0fqx : "");
        notifyPropertyChanged(BR.f0701aad0f);
    }

    @Bindable
    public String getF0701aad0fqx() {
        return f0701aad0fqx;
    }

    public void setF0701aad0fqx(String f0701aad0fqx) {
        this.f0701aad0fqx = f0701aad0fqx;
        notifyPropertyChanged(BR.f0701aad0fqx);
    }


    public ModuleF Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_UUID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SYNCED_DATE));
        sF1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SF1)));
        sF2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SF2)));
        sF3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SF3)));
        sF4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SF4)));
        sF5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SF5)));
        sF6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SF6)));
        sF7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleFTable.COLUMN_SF7)));
        return this;
    }

    public void sF1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f0100 = json.getString("f0100");
            this.f01001 = json.getString("f01001");
            this.f0101aa0a = json.getString("f0101aa0a");
            this.f0101aa0aqx = json.getString("f0101aa0aqx");
            this.f0101aa0f = json.getString("f0101aa0f");
            this.f0101aa0fqx = json.getString("f0101aa0fqx");
            this.f0101ab0a = json.getString("f0101ab0a");
            this.f0101ab0aqx = json.getString("f0101ab0aqx");
            this.f0101ab0f = json.getString("f0101ab0f");
            this.f0101ab0fqx = json.getString("f0101ab0fqx");
            this.f0102 = json.getString("f0102");
            this.f0103 = json.getString("f0103");
            this.f0104 = json.getString("f0104");
            this.f0105 = json.getString("f0105");
            this.f0105aaa0a = json.getString("f0105aaa0a");
            this.f0105aaa0aqx = json.getString("f0105aaa0aqx");
            this.f0105aaa0f = json.getString("f0105aaa0f");
            this.f0105aaa0fqx = json.getString("f0105aaa0fqx");
            this.f0105aab0a = json.getString("f0105aab0a");
            this.f0105aab0aqx = json.getString("f0105aab0aqx");
            this.f0105aab0f = json.getString("f0105aab0f");
            this.f0105aab0fqx = json.getString("f0105aab0fqx");
            this.f0105aac0a = json.getString("f0105aac0a");
            this.f0105aac0aqx = json.getString("f0105aac0aqx");
            this.f0105aac0f = json.getString("f0105aac0f");
            this.f0105aac0fqx = json.getString("f0105aac0fqx");
            this.f0106 = json.getString("f0106");
            this.f0106aaa0a = json.getString("f0106aaa0a");
            this.f0106aaa0aqx = json.getString("f0106aaa0aqx");
            this.f0106aaa0f = json.getString("f0106aaa0f");
            this.f0106aaa0fqx = json.getString("f0106aaa0fqx");
            this.f0107 = json.getString("f0107");
            this.f0108 = json.getString("f0108");
            this.f0109 = json.getString("f0109");
            this.f0110 = json.getString("f0110");
            this.f0110aaa0a = json.getString("f0110aaa0a");
            this.f0110aaa0aqx = json.getString("f0110aaa0aqx");
            this.f0110aaa0f = json.getString("f0110aaa0f");
            this.f0110aaa0fqx = json.getString("f0110aaa0fqx");
            this.f0110aab0a = json.getString("f0110aab0a");
            this.f0110aab0aqx = json.getString("f0110aab0aqx");
            this.f0110aab0f = json.getString("f0110aab0f");
            this.f0110aab0fqx = json.getString("f0110aab0fqx");
            this.f0110aac0a = json.getString("f0110aac0a");
            this.f0110aac0aqx = json.getString("f0110aac0aqx");
            this.f0110aac0f = json.getString("f0110aac0f");
            this.f0110aac0fqx = json.getString("f0110aac0fqx");
            this.f0110aad0a = json.getString("f0110aad0a");
            this.f0110aad0aqx = json.getString("f0110aad0aqx");
            this.f0110aad0f = json.getString("f0110aad0f");
            this.f0110aad0fqx = json.getString("f0110aad0fqx");
            this.f0110aae0a = json.getString("f0110aae0a");
            this.f0110aae0aqx = json.getString("f0110aae0aqx");
            this.f0110aae0f = json.getString("f0110aae0f");
            this.f0110aae0fqx = json.getString("f0110aae0fqx");
        }
    }

    public void sF2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f0201 = json.getString("f0201");
            this.f0201aaa0a = json.getString("f0201aaa0a");
            this.f0201aaa0aqx = json.getString("f0201aaa0aqx");
            this.f0201aaa0f = json.getString("f0201aaa0f");
            this.f0201aaa0fqx = json.getString("f0201aaa0fqx");
            this.f0201aab0a = json.getString("f0201aab0a");
            this.f0201aab0aqx = json.getString("f0201aab0aqx");
            this.f0201aab0f = json.getString("f0201aab0f");
            this.f0201aab0fqx = json.getString("f0201aab0fqx");
            this.f0202 = json.getString("f0202");
            this.f0202aaa0a = json.getString("f0202aaa0a");
            this.f0202aaa0aqx = json.getString("f0202aaa0aqx");
            this.f0202aaa0f = json.getString("f0202aaa0f");
            this.f0202aaa0fqx = json.getString("f0202aaa0fqx");
            this.f0202aab0a = json.getString("f0202aab0a");
            this.f0202aab0aqx = json.getString("f0202aab0aqx");
            this.f0202aab0f = json.getString("f0202aab0f");
            this.f0202aab0fqx = json.getString("f0202aab0fqx");
            this.f0203 = json.getString("f0203");
            this.f0203aaa0a = json.getString("f0203aaa0a");
            this.f0203aaa0aqx = json.getString("f0203aaa0aqx");
            this.f0203aaa0f = json.getString("f0203aaa0f");
            this.f0203aaa0fqx = json.getString("f0203aaa0fqx");
            this.f0203aab0a = json.getString("f0203aab0a");
            this.f0203aab0aqx = json.getString("f0203aab0aqx");
            this.f0203aab0f = json.getString("f0203aab0f");
            this.f0203aab0fqx = json.getString("f0203aab0fqx");
        }
    }

    public void sF3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f0301 = json.getString("f0301");
            this.f0301aaa0a = json.getString("f0301aaa0a");
            this.f0301aaa0aqx = json.getString("f0301aaa0aqx");
            this.f0301aaa0f = json.getString("f0301aaa0f");
            this.f0301aaa0fqx = json.getString("f0301aaa0fqx");
            this.f0302 = json.getString("f0302");
            this.f0302aaa0a = json.getString("f0302aaa0a");
            this.f0302aaa0aqx = json.getString("f0302aaa0aqx");
            this.f0302aaa0f = json.getString("f0302aaa0f");
        }
    }

    public void sF4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f0401 = json.getString("f0401");
            this.f0401aaa0a = json.getString("f0401aaa0a");
            this.f0401aaa0aqx = json.getString("f0401aaa0aqx");
            this.f0401aaa0f = json.getString("f0401aaa0f");
            this.f0401aaa0fqx = json.getString("f0401aaa0fqx");
            this.f0401aab0a = json.getString("f0401aab0a");
            this.f0401aab0aqx = json.getString("f0401aab0aqx");
            this.f0401aab0f = json.getString("f0401aab0f");
            this.f0401aab0fqx = json.getString("f0401aab0fqx");
            this.f0401aac0a = json.getString("f0401aac0a");
            this.f0401aac0aqx = json.getString("f0401aac0aqx");
            this.f0401aac0f = json.getString("f0401aac0f");
            this.f0401aac0fqx = json.getString("f0401aac0fqx");
            this.f0402 = json.getString("f0402");
            this.f0402aaa0a = json.getString("f0402aaa0a");
            this.f0402aaa0aqx = json.getString("f0402aaa0aqx");
            this.f0402aaa0f = json.getString("f0402aaa0f");
            this.f0402aaa0fqx = json.getString("f0402aaa0fqx");
            this.f0403 = json.getString("f0403");
            this.f0403aaa0a = json.getString("f0403aaa0a");
            this.f0403aaa0aqx = json.getString("f0403aaa0aqx");
            this.f0403aaa0f = json.getString("f0403aaa0f");
            this.f0403aaa0fqx = json.getString("f0403aaa0fqx");
            this.f0404 = json.getString("f0404");
            this.f0404aaa0a = json.getString("f0404aaa0a");
            this.f0404aaa0aqx = json.getString("f0404aaa0aqx");
            this.f0404aaa0f = json.getString("f0404aaa0f");
            this.f0404aaa0fqx = json.getString("f0404aaa0fqx");
        }
    }

    public void sF5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f0501 = json.getString("f0501");
            this.f05021 = json.getString("f05021");
            this.f05021qx = json.getString("f05021qx");
            this.f05022 = json.getString("f05022");
            this.f05022qx = json.getString("f05022qx");
        }
    }

    public void sF6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f0601 = json.getString("f0601");
            this.f0602 = json.getString("f0602");
            this.f0603 = json.getString("f0603");
            this.f0604 = json.getString("f0604");
            this.f060401a = json.getString("f060401a");
            this.f060401aqx = json.getString("f060401aqx");
            this.f060401f = json.getString("f060401f");
            this.f060401fqx = json.getString("f060401fqx");
            this.f060402a = json.getString("f060402a");
            this.f060402aqx = json.getString("f060402aqx");
            this.f060402f = json.getString("f060402f");
            this.f060402fqx = json.getString("f060402fqx");
            this.f060403a = json.getString("f060403a");
            this.f060403aqx = json.getString("f060403aqx");
            this.f060403f = json.getString("f060403f");
            this.f060403fqx = json.getString("f060403fqx");
        }
    }

    public void sF7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f0701 = json.getString("f0701");
            this.f0701aaa0a = json.getString("f0701aaa0a");
            this.f0701aaa0aqx = json.getString("f0701aaa0aqx");
            this.f0701aaa0f = json.getString("f0701aaa0f");
            this.f0701aaa0fqx = json.getString("f0701aaa0fqx");
            this.f0701aab0a = json.getString("f0701aab0a");
            this.f0701aab0aqx = json.getString("f0701aab0aqx");
            this.f0701aab0f = json.getString("f0701aab0f");
            this.f0701aab0fqx = json.getString("f0701aab0fqx");
            this.f0701aac0a = json.getString("f0701aac0a");
            this.f0701aac0aqx = json.getString("f0701aac0aqx");
            this.f0701aac0f = json.getString("f0701aac0f");
            this.f0701aac0fqx = json.getString("f0701aac0fqx");
            this.f0701aad0a = json.getString("f0701aad0a");
            this.f0701aad0aqx = json.getString("f0701aad0aqx");
            this.f0701aad0f = json.getString("f0701aad0f");
            this.f0701aad0fqx = json.getString("f0701aad0fqx");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(ModuleFTable.COLUMN_ID, this.id);
        json.put(ModuleFTable.COLUMN_UID, this.uid);
        json.put(ModuleFTable.COLUMN_UUID, this.uuid);
        json.put(ModuleFTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(ModuleFTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(ModuleFTable.COLUMN_UC_CODE, this.ucCode);
        json.put(ModuleFTable.COLUMN_HF_CODE, this.hfCode);
        json.put(ModuleFTable.COLUMN_USERNAME, this.userName);
        json.put(ModuleFTable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleFTable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleFTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleFTable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleFTable.COLUMN_SYNCED, this.synced);
        json.put(ModuleFTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleFTable.COLUMN_SF1, new JSONObject(sF1toString()));
        json.put(ModuleFTable.COLUMN_SF2, new JSONObject(sF2toString()));
        json.put(ModuleFTable.COLUMN_SF3, new JSONObject(sF3toString()));
        json.put(ModuleFTable.COLUMN_SF4, new JSONObject(sF4toString()));
        json.put(ModuleFTable.COLUMN_SF5, new JSONObject(sF5toString()));
        json.put(ModuleFTable.COLUMN_SF6, new JSONObject(sF6toString()));
        json.put(ModuleFTable.COLUMN_SF7, new JSONObject(sF7toString()));
        return json;
    }

    public String sF1toString() throws JSONException {
        Log.d(TAG, "sF1toString: ");
        JSONObject json = new JSONObject();
        json.put("f0100", f0100)
                .put("f01001", f01001)
                .put("f0101aa0a", f0101aa0a)
                .put("f0101aa0aqx", f0101aa0aqx)
                .put("f0101aa0f", f0101aa0f)
                .put("f0101aa0fqx", f0101aa0fqx)
                .put("f0101ab0a", f0101ab0a)
                .put("f0101ab0aqx", f0101ab0aqx)
                .put("f0101ab0f", f0101ab0f)
                .put("f0101ab0fqx", f0101ab0fqx)
                .put("f0102", f0102)
                .put("f0103", f0103)
                .put("f0104", f0104)
                .put("f0105", f0105)
                .put("f0105aaa0a", f0105aaa0a)
                .put("f0105aaa0aqx", f0105aaa0aqx)
                .put("f0105aaa0f", f0105aaa0f)
                .put("f0105aaa0fqx", f0105aaa0fqx)
                .put("f0105aab0a", f0105aab0a)
                .put("f0105aab0aqx", f0105aab0aqx)
                .put("f0105aab0f", f0105aab0f)
                .put("f0105aab0fqx", f0105aab0fqx)
                .put("f0105aac0a", f0105aac0a)
                .put("f0105aac0aqx", f0105aac0aqx)
                .put("f0105aac0f", f0105aac0f)
                .put("f0105aac0fqx", f0105aac0fqx)
                .put("f0106", f0106)
                .put("f0106aaa0a", f0106aaa0a)
                .put("f0106aaa0aqx", f0106aaa0aqx)
                .put("f0106aaa0f", f0106aaa0f)
                .put("f0106aaa0fqx", f0106aaa0fqx)
                .put("f0107", f0107)
                .put("f0108", f0108)
                .put("f0109", f0109)
                .put("f0110", f0110)
                .put("f0110aaa0a", f0110aaa0a)
                .put("f0110aaa0aqx", f0110aaa0aqx)
                .put("f0110aaa0f", f0110aaa0f)
                .put("f0110aaa0fqx", f0110aaa0fqx)
                .put("f0110aab0a", f0110aab0a)
                .put("f0110aab0aqx", f0110aab0aqx)
                .put("f0110aab0f", f0110aab0f)
                .put("f0110aab0fqx", f0110aab0fqx)
                .put("f0110aac0a", f0110aac0a)
                .put("f0110aac0aqx", f0110aac0aqx)
                .put("f0110aac0f", f0110aac0f)
                .put("f0110aac0fqx", f0110aac0fqx)
                .put("f0110aad0a", f0110aad0a)
                .put("f0110aad0aqx", f0110aad0aqx)
                .put("f0110aad0f", f0110aad0f)
                .put("f0110aad0fqx", f0110aad0fqx)
                .put("f0110aae0a", f0110aae0a)
                .put("f0110aae0aqx", f0110aae0aqx)
                .put("f0110aae0f", f0110aae0f)
                .put("f0110aae0fqx", f0110aae0fqx);
        return json.toString();
    }

    public String sF2toString() throws JSONException {
        Log.d(TAG, "sF2toString: ");
        JSONObject json = new JSONObject();
        json.put("f0201", f0201)
                .put("f0201aaa0a", f0201aaa0a)
                .put("f0201aaa0aqx", f0201aaa0aqx)
                .put("f0201aaa0f", f0201aaa0f)
                .put("f0201aaa0fqx", f0201aaa0fqx)
                .put("f0201aab0a", f0201aab0a)
                .put("f0201aab0aqx", f0201aab0aqx)
                .put("f0201aab0f", f0201aab0f)
                .put("f0201aab0fqx", f0201aab0fqx)
                .put("f0202", f0202)
                .put("f0202aaa0a", f0202aaa0a)
                .put("f0202aaa0aqx", f0202aaa0aqx)
                .put("f0202aaa0f", f0202aaa0f)
                .put("f0202aaa0fqx", f0202aaa0fqx)
                .put("f0202aab0a", f0202aab0a)
                .put("f0202aab0aqx", f0202aab0aqx)
                .put("f0202aab0f", f0202aab0f)
                .put("f0202aab0fqx", f0202aab0fqx)
                .put("f0203", f0203)
                .put("f0203aaa0a", f0203aaa0a)
                .put("f0203aaa0aqx", f0203aaa0aqx)
                .put("f0203aaa0f", f0203aaa0f)
                .put("f0203aaa0fqx", f0203aaa0fqx)
                .put("f0203aab0a", f0203aab0a)
                .put("f0203aab0aqx", f0203aab0aqx)
                .put("f0203aab0f", f0203aab0f)
                .put("f0203aab0fqx", f0203aab0fqx);
        return json.toString();
    }

    public String sF3toString() throws JSONException {
        Log.d(TAG, "sF3toString: ");
        JSONObject json = new JSONObject();
        json.put("f0301", f0301)
                .put("f0301aaa0a", f0301aaa0a)
                .put("f0301aaa0aqx", f0301aaa0aqx)
                .put("f0301aaa0f", f0301aaa0f)
                .put("f0301aaa0fqx", f0301aaa0fqx)
                .put("f0302", f0302)
                .put("f0302aaa0a", f0302aaa0a)
                .put("f0302aaa0aqx", f0302aaa0aqx)
                .put("f0302aaa0f", f0302aaa0f);
        return json.toString();
    }

    public String sF4toString() throws JSONException {
        Log.d(TAG, "sF4toString: ");
        JSONObject json = new JSONObject();
        json.put("f0401", f0401)
                .put("f0401aaa0a", f0401aaa0a)
                .put("f0401aaa0aqx", f0401aaa0aqx)
                .put("f0401aaa0f", f0401aaa0f)
                .put("f0401aaa0fqx", f0401aaa0fqx)
                .put("f0401aab0a", f0401aab0a)
                .put("f0401aab0aqx", f0401aab0aqx)
                .put("f0401aab0f", f0401aab0f)
                .put("f0401aab0fqx", f0401aab0fqx)
                .put("f0401aac0a", f0401aac0a)
                .put("f0401aac0aqx", f0401aac0aqx)
                .put("f0401aac0f", f0401aac0f)
                .put("f0401aac0fqx", f0401aac0fqx)
                .put("f0402", f0402)
                .put("f0402aaa0a", f0402aaa0a)
                .put("f0402aaa0aqx", f0402aaa0aqx)
                .put("f0402aaa0f", f0402aaa0f)
                .put("f0402aaa0fqx", f0402aaa0fqx)
                .put("f0403", f0403)
                .put("f0403aaa0a", f0403aaa0a)
                .put("f0403aaa0aqx", f0403aaa0aqx)
                .put("f0403aaa0f", f0403aaa0f)
                .put("f0403aaa0fqx", f0403aaa0fqx)
                .put("f0404", f0404)
                .put("f0404aaa0a", f0404aaa0a)
                .put("f0404aaa0aqx", f0404aaa0aqx)
                .put("f0404aaa0f", f0404aaa0f)
                .put("f0404aaa0fqx", f0404aaa0fqx);
        return json.toString();
    }

    public String sF5toString() throws JSONException {
        Log.d(TAG, "sF5toString: ");
        JSONObject json = new JSONObject();
        json.put("f0501", f0501)
                .put("f05021", f05021)
                .put("f05021qx", f05021qx)
                .put("f05022", f05022)
                .put("f05022qx", f05022qx);
        return json.toString();
    }

    public String sF6toString() throws JSONException {
        Log.d(TAG, "sF6toString: ");
        JSONObject json = new JSONObject();
        json.put("f0601", f0601)
                .put("f0602", f0602)
                .put("f0603", f0603)
                .put("f0604", f0604)
                .put("f060401a", f060401a)
                .put("f060401aqx", f060401aqx)
                .put("f060401f", f060401f)
                .put("f060401fqx", f060401fqx)
                .put("f060402a", f060402a)
                .put("f060402aqx", f060402aqx)
                .put("f060402f", f060402f)
                .put("f060402fqx", f060402fqx)
                .put("f060403a", f060403a)
                .put("f060403aqx", f060403aqx)
                .put("f060403f", f060403f)
                .put("f060403fqx", f060403fqx);
        return json.toString();
    }

    public String sF7toString() throws JSONException {
        Log.d(TAG, "sF7toString: ");
        JSONObject json = new JSONObject();
        json.put("f0701", f0701)
                .put("f0701aaa0a", f0701aaa0a)
                .put("f0701aaa0aqx", f0701aaa0aqx)
                .put("f0701aaa0f", f0701aaa0f)
                .put("f0701aaa0fqx", f0701aaa0fqx)
                .put("f0701aab0a", f0701aab0a)
                .put("f0701aab0aqx", f0701aab0aqx)
                .put("f0701aab0f", f0701aab0f)
                .put("f0701aab0fqx", f0701aab0fqx)
                .put("f0701aac0a", f0701aac0a)
                .put("f0701aac0aqx", f0701aac0aqx)
                .put("f0701aac0f", f0701aac0f)
                .put("f0701aac0fqx", f0701aac0fqx)
                .put("f0701aad0a", f0701aad0a)
                .put("f0701aad0aqx", f0701aad0aqx)
                .put("f0701aad0f", f0701aad0f)
                .put("f0701aad0fqx", f0701aad0fqx);
        return json.toString();
    }


}
