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
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleETable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleE extends BaseObservable implements Observable {

    private final String TAG = "ModuleE";
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
    private String e0101 = _EMPTY_;
    private String e0102a = _EMPTY_;
    private String e0102b = _EMPTY_;
    private String e0102c = _EMPTY_;
    private String e0102d = _EMPTY_;
    private String e0102e = _EMPTY_;
    private String e0102f = _EMPTY_;
    private String e0102g = _EMPTY_;
    private String e0102h = _EMPTY_;
    private String e0102i = _EMPTY_;
    private String e0102j = _EMPTY_;
    private String e0103a = _EMPTY_;
    private String e0103b = _EMPTY_;
    private String e0104a = _EMPTY_;
    private String e0104b = _EMPTY_;
    private String e0104c = _EMPTY_;
    private String e0104d = _EMPTY_;
    private String e0104e = _EMPTY_;
    private String e0104exx = _EMPTY_;
    private String e0201 = _EMPTY_;
    private String e0202a = _EMPTY_;
    private String e0202b = _EMPTY_;
    private String e0202c = _EMPTY_;
    private String e0202d = _EMPTY_;
    private String e0202e = _EMPTY_;
    private String e0202f = _EMPTY_;
    private String e0203a = _EMPTY_;
    private String e0203b = _EMPTY_;
    private String e0204a = _EMPTY_;
    private String e0204b = _EMPTY_;
    private String e0204c = _EMPTY_;
    private String e0204d = _EMPTY_;
    private String e0204dxx = _EMPTY_;
    private String e0301 = _EMPTY_;
    private String e0302a = _EMPTY_;
    private String e0302b = _EMPTY_;
    private String e0302c = _EMPTY_;
    private String e0302d = _EMPTY_;
    private String e0302e = _EMPTY_;
    private String e0303a = _EMPTY_;
    private String e0303b = _EMPTY_;
    private String e0303c = _EMPTY_;
    private String e0303d = _EMPTY_;
    private String e0303e = _EMPTY_;
    private String e0303f = _EMPTY_;
    private String e0303g = _EMPTY_;
    private String e0303h = _EMPTY_;
    private String e0303i = _EMPTY_;
    private String e0303j = _EMPTY_;
    private String e0303k = _EMPTY_;
    private String e0303l = _EMPTY_;
    private String e0303m = _EMPTY_;
    private String e0303n = _EMPTY_;
    private String e0304a = _EMPTY_;
    private String e0304b = _EMPTY_;
    private String e0304c = _EMPTY_;
    private String e0304d = _EMPTY_;
    private String e0305a = _EMPTY_;
    private String e0305b = _EMPTY_;
    private String e0305c = _EMPTY_;
    private String e0305d = _EMPTY_;
    private String e0305e = _EMPTY_;
    private String e0305exx = _EMPTY_;
    private String e306011 = _EMPTY_;
    private String e306011q = _EMPTY_;
    private String e306012 = _EMPTY_;
    private String e306012q = _EMPTY_;
    private String e306021 = _EMPTY_;
    private String e306021q = _EMPTY_;
    private String e306022 = _EMPTY_;
    private String e306022q = _EMPTY_;
    private String e306031 = _EMPTY_;
    private String e306031q = _EMPTY_;
    private String e306032 = _EMPTY_;
    private String e306032q = _EMPTY_;
    private String e306041 = _EMPTY_;
    private String e306041q = _EMPTY_;
    private String e306042 = _EMPTY_;
    private String e306042q = _EMPTY_;
    private String e306051 = _EMPTY_;
    private String e306051q = _EMPTY_;
    private String e306052 = _EMPTY_;
    private String e306052q = _EMPTY_;
    private String e306061 = _EMPTY_;
    private String e306061q = _EMPTY_;
    private String e306062 = _EMPTY_;
    private String e306062q = _EMPTY_;
    private String e306071 = _EMPTY_;
    private String e306071q = _EMPTY_;
    private String e306072 = _EMPTY_;
    private String e306072q = _EMPTY_;
    private String e306081 = _EMPTY_;
    private String e306081q = _EMPTY_;
    private String e306082 = _EMPTY_;
    private String e306082q = _EMPTY_;
    private String e306091 = _EMPTY_;
    private String e306091q = _EMPTY_;
    private String e306092 = _EMPTY_;
    private String e306092q = _EMPTY_;
    private String e306101 = _EMPTY_;
    private String e306101q = _EMPTY_;
    private String e306102 = _EMPTY_;
    private String e306102q = _EMPTY_;
    private String e306111 = _EMPTY_;
    private String e306111q = _EMPTY_;
    private String e306112 = _EMPTY_;
    private String e306112q = _EMPTY_;
    private String e306121 = _EMPTY_;
    private String e306121q = _EMPTY_;
    private String e306122 = _EMPTY_;
    private String e306122q = _EMPTY_;
    private String e306131 = _EMPTY_;
    private String e306131q = _EMPTY_;
    private String e306132 = _EMPTY_;
    private String e306132q = _EMPTY_;
    private String e306141 = _EMPTY_;
    private String e306141q = _EMPTY_;
    private String e306142 = _EMPTY_;
    private String e306142q = _EMPTY_;
    private String e306151 = _EMPTY_;
    private String e306151q = _EMPTY_;
    private String e306152 = _EMPTY_;
    private String e306152q = _EMPTY_;
    private String e306161 = _EMPTY_;
    private String e306161q = _EMPTY_;
    private String e306162 = _EMPTY_;
    private String e306162q = _EMPTY_;
    private String e306171 = _EMPTY_;
    private String e306171q = _EMPTY_;
    private String e306172 = _EMPTY_;
    private String e306172q = _EMPTY_;
    private String e306181 = _EMPTY_;
    private String e306181q = _EMPTY_;
    private String e306182 = _EMPTY_;
    private String e306182q = _EMPTY_;
    private String e0307 = _EMPTY_;
    private String e0308 = _EMPTY_;
    private String e401 = _EMPTY_;
    private String e402 = _EMPTY_;
    private String e403a = _EMPTY_;
    private String e403b = _EMPTY_;
    private String e403c = _EMPTY_;
    private String e404a = _EMPTY_;
    private String e404b = _EMPTY_;
    private String e404c = _EMPTY_;
    private String e404d = _EMPTY_;
    private String e404e = _EMPTY_;
    private String e404f = _EMPTY_;
    private String e404g = _EMPTY_;
    private String e404h = _EMPTY_;
    private String e405a = _EMPTY_;
    private String e405b = _EMPTY_;
    private String e405c = _EMPTY_;
    private String e405d = _EMPTY_;
    private String e405e = _EMPTY_;
    private String e405f = _EMPTY_;
    private String e405g = _EMPTY_;
    private String e405h = _EMPTY_;
    private String e406 = _EMPTY_;
    private String e407a = _EMPTY_;
    private String e407b = _EMPTY_;
    private String e407c = _EMPTY_;
    private String e407d = _EMPTY_;
    private String e408 = _EMPTY_;
    private String e409 = _EMPTY_;
    private String e40996x = _EMPTY_;
    private String e410a = _EMPTY_;
    private String e410b = _EMPTY_;
    private String e410c = _EMPTY_;
    private String e410d = _EMPTY_;
    private String e410e = _EMPTY_;
    private String e410f = _EMPTY_;
    private String e411 = _EMPTY_;
    private String e412 = _EMPTY_;
    private String e412a = _EMPTY_;
    private String e412b = _EMPTY_;
    private String e412c = _EMPTY_;
    private String e412d = _EMPTY_;
    private String e413 = _EMPTY_;
    private String e414 = _EMPTY_;
    private String e415 = _EMPTY_;
    private String e416 = _EMPTY_;
    private String e0501 = _EMPTY_;
    private String e0502a = _EMPTY_;
    private String e0502b = _EMPTY_;
    private String e0502c = _EMPTY_;
    private String e0502d = _EMPTY_;
    private String e0502e = _EMPTY_;
    private String e0502f = _EMPTY_;
    private String e0502g = _EMPTY_;
    private String e0502h = _EMPTY_;
    private String e0502i = _EMPTY_;
    private String e0503 = _EMPTY_;
    private String e0504 = _EMPTY_;
    private String e0505 = _EMPTY_;
    private String e0506 = _EMPTY_;
    private String e0507 = _EMPTY_;
    private String e0508 = _EMPTY_;
    private String e0509 = _EMPTY_;
    private String e0601 = _EMPTY_;
    private String e0602 = _EMPTY_;
    private String e0603 = _EMPTY_;
    private String e0604 = _EMPTY_;
    private String e0605a = _EMPTY_;
    private String e0605b = _EMPTY_;
    private String e0605c = _EMPTY_;
    private String e0605d = _EMPTY_;
    private String e0606 = _EMPTY_;
    private String e0607 = _EMPTY_;
    private String e0608 = _EMPTY_;
    private String e0609 = _EMPTY_;
    private String e0610 = _EMPTY_;
    private String e0611 = _EMPTY_;
    private String e0701 = _EMPTY_;
    private String e0702a = _EMPTY_;
    private String e0702b = _EMPTY_;
    private String e0702c = _EMPTY_;
    private String e0702d = _EMPTY_;
    private String e0702e = _EMPTY_;
    private String e0702f = _EMPTY_;
    private String e0702g = _EMPTY_;
    private String e0702h = _EMPTY_;
    private String e0702i = _EMPTY_;
    private String e0702j = _EMPTY_;
    private String e0702k = _EMPTY_;
    private String e0702l = _EMPTY_;
    private String e0703a = _EMPTY_;
    private String e0703b = _EMPTY_;
    private String e0703c = _EMPTY_;
    private String e0703d = _EMPTY_;
    private String e0704a = _EMPTY_;
    private String e0704b = _EMPTY_;
    private String e0704c = _EMPTY_;
    private String e0704d = _EMPTY_;
    private String e0704e = _EMPTY_;
    private String e0704f = _EMPTY_;
    private String e0704g = _EMPTY_;
    private String e0704gxx = _EMPTY_;
    private String e0705a0a = _EMPTY_;
    private String e0705a0ayx = _EMPTY_;
    private String e0705a0f = _EMPTY_;
    private String e0705a0fyx = _EMPTY_;
    private String e0705b0a = _EMPTY_;
    private String e0705b0ayx = _EMPTY_;
    private String e0705b0f = _EMPTY_;
    private String e0705b0fyx = _EMPTY_;
    private String e0705c0a = _EMPTY_;
    private String e0705c0ayx = _EMPTY_;
    private String e0705c0f = _EMPTY_;
    private String e0705c0fyx = _EMPTY_;
    private String e0705d0a = _EMPTY_;
    private String e0705d0ayx = _EMPTY_;
    private String e0705d0f = _EMPTY_;
    private String e0705d0fyx = _EMPTY_;
    private String e0705e0a = _EMPTY_;
    private String e0705e0ayx = _EMPTY_;
    private String e0705e0f = _EMPTY_;
    private String e0705e0fyx = _EMPTY_;
    private String e0801 = _EMPTY_;
    private String e0802 = _EMPTY_;
    private String e0803 = _EMPTY_;
    private String e0804 = _EMPTY_;
    private String e0805 = _EMPTY_;
    private String e0806 = _EMPTY_;
    private String e0807 = _EMPTY_;
    private String e0808 = _EMPTY_;
    private String e0809 = _EMPTY_;
    private String e0810 = _EMPTY_;
    private String e0811 = _EMPTY_;
    private String e0812 = _EMPTY_;
    private String e0813 = _EMPTY_;
    private String e0814 = _EMPTY_;


    public ModuleE() {
    }


    public void populateMeta() {
        setProjectName(PROJECT_NAME);
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setUserName(MainApp.user.getUserName());
        setUuid(MainApp.form.getUid());
        setSysDate(MainApp.form.getSysDate());
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
    public String getE0101() {
        return e0101;
    }

    public void setE0101(String e0101) {
        this.e0101 = e0101;
        setE0102a(e0101.equals("1") ? this.e0102a : "");
        setE0102b(e0101.equals("1") ? this.e0102b : "");
        setE0102c(e0101.equals("1") ? this.e0102c : "");
        setE0102d(e0101.equals("1") ? this.e0102d : "");
        setE0102e(e0101.equals("1") ? this.e0102e : "");
        setE0102f(e0101.equals("1") ? this.e0102f : "");
        setE0102g(e0101.equals("1") ? this.e0102g : "");
        setE0102h(e0101.equals("1") ? this.e0102h : "");
        setE0102i(e0101.equals("1") ? this.e0102i : "");
        setE0102j(e0101.equals("1") ? this.e0102j : "");
        setE0103a(e0101.equals("1") ? this.e0103a : "");
        setE0103b(e0101.equals("1") ? this.e0103b : "");
        setE0104a(e0101.equals("1") ? this.e0104a : "");
        setE0104b(e0101.equals("1") ? this.e0104b : "");
        setE0104c(e0101.equals("1") ? this.e0104c : "");
        setE0104d(e0101.equals("1") ? this.e0104d : "");
        setE0104e(e0101.equals("1") ? this.e0104e : "");
        notifyPropertyChanged(BR.e0101);
    }

    @Bindable
    public String getE0102a() {
        return e0102a;
    }

    public void setE0102a(String e0102a) {
        this.e0102a = e0102a;
        notifyPropertyChanged(BR.e0102a);
    }

    @Bindable
    public String getE0102b() {
        return e0102b;
    }

    public void setE0102b(String e0102b) {
        this.e0102b = e0102b;
        notifyPropertyChanged(BR.e0102b);
    }

    @Bindable
    public String getE0102c() {
        return e0102c;
    }

    public void setE0102c(String e0102c) {
        this.e0102c = e0102c;
        notifyPropertyChanged(BR.e0102c);
    }

    @Bindable
    public String getE0102d() {
        return e0102d;
    }

    public void setE0102d(String e0102d) {
        this.e0102d = e0102d;
        notifyPropertyChanged(BR.e0102d);
    }

    @Bindable
    public String getE0102e() {
        return e0102e;
    }

    public void setE0102e(String e0102e) {
        this.e0102e = e0102e;
        notifyPropertyChanged(BR.e0102e);
    }

    @Bindable
    public String getE0102f() {
        return e0102f;
    }

    public void setE0102f(String e0102f) {
        this.e0102f = e0102f;
        notifyPropertyChanged(BR.e0102f);
    }

    @Bindable
    public String getE0102g() {
        return e0102g;
    }

    public void setE0102g(String e0102g) {
        this.e0102g = e0102g;
        notifyPropertyChanged(BR.e0102g);
    }

    @Bindable
    public String getE0102h() {
        return e0102h;
    }

    public void setE0102h(String e0102h) {
        this.e0102h = e0102h;
        notifyPropertyChanged(BR.e0102h);
    }

    @Bindable
    public String getE0102i() {
        return e0102i;
    }

    public void setE0102i(String e0102i) {
        this.e0102i = e0102i;
        notifyPropertyChanged(BR.e0102i);
    }

    @Bindable
    public String getE0102j() {
        return e0102j;
    }

    public void setE0102j(String e0102j) {
        this.e0102j = e0102j;
        notifyPropertyChanged(BR.e0102j);
    }

    @Bindable
    public String getE0103a() {
        return e0103a;
    }

    public void setE0103a(String e0103a) {
        this.e0103a = e0103a;
        notifyPropertyChanged(BR.e0103a);
    }

    @Bindable
    public String getE0103b() {
        return e0103b;
    }

    public void setE0103b(String e0103b) {
        this.e0103b = e0103b;
        notifyPropertyChanged(BR.e0103b);
    }

    @Bindable
    public String getE0104a() {
        return e0104a;
    }

    public void setE0104a(String e0104a) {
        this.e0104a = e0104a;
        setE0104c(e0104a.equals("2") && this.e0104b.equals("2") ? "" : this.e0104c);
        setE0104d(e0104a.equals("2") && this.e0104b.equals("2") ? "" : this.e0104d);
        setE0104e(e0104a.equals("2") && this.e0104b.equals("2") ? "" : this.e0104e);
        notifyPropertyChanged(BR.e0104a);
    }

    @Bindable
    public String getE0104b() {
        return e0104b;
    }

    public void setE0104b(String e0104b) {
        this.e0104b = e0104b;
        setE0104c(e0104b.equals("2") && this.e0104a.equals("2") ? "" : this.e0104c);
        setE0104d(e0104b.equals("2") && this.e0104a.equals("2") ? "" : this.e0104d);
        setE0104e(e0104b.equals("2") && this.e0104a.equals("2") ? "" : this.e0104e);
        notifyPropertyChanged(BR.e0104b);
    }

    @Bindable
    public String getE0104c() {
        return e0104c;
    }

    public void setE0104c(String e0104c) {
        this.e0104c = e0104c;
        notifyPropertyChanged(BR.e0104c);
    }

    @Bindable
    public String getE0104d() {
        return e0104d;
    }

    public void setE0104d(String e0104d) {
        this.e0104d = e0104d;
        notifyPropertyChanged(BR.e0104d);
    }

    @Bindable
    public String getE0104e() {
        return e0104e;
    }

    public void setE0104e(String e0104e) {
        this.e0104e = e0104e;
        setE0104exx(e0104e.equals("96") ? this.e0104exx : "");
        notifyPropertyChanged(BR.e0104e);
    }

    @Bindable
    public String getE0104exx() {
        return e0104exx;
    }

    public void setE0104exx(String e0104exx) {
        this.e0104exx = e0104exx;
        notifyPropertyChanged(BR.e0104exx);
    }

    @Bindable
    public String getE0201() {
        return e0201;
    }

    public void setE0201(String e0201) {
        this.e0201 = e0201;
        setE0202a(e0201.equals("1") ? this.e0202a : "");
        setE0202b(e0201.equals("1") ? this.e0202b : "");
        setE0202c(e0201.equals("1") ? this.e0202c : "");
        setE0202d(e0201.equals("1") ? this.e0202d : "");
        setE0202e(e0201.equals("1") ? this.e0202e : "");
        setE0202f(e0201.equals("1") ? this.e0202f : "");
        setE0203a(e0201.equals("1") ? this.e0203a : "");
        setE0203b(e0201.equals("1") ? this.e0203b : "");
        setE0204a(e0201.equals("1") ? this.e0204a : "");
        setE0204b(e0201.equals("1") ? this.e0204b : "");
        setE0204c(e0201.equals("1") ? this.e0204c : "");
        setE0204d(e0201.equals("1") ? this.e0204d : "");
        notifyPropertyChanged(BR.e0201);
    }

    @Bindable
    public String getE0202a() {
        return e0202a;
    }

    public void setE0202a(String e0202a) {
        this.e0202a = e0202a;
        notifyPropertyChanged(BR.e0202a);
    }

    @Bindable
    public String getE0202b() {
        return e0202b;
    }

    public void setE0202b(String e0202b) {
        this.e0202b = e0202b;
        notifyPropertyChanged(BR.e0202b);
    }

    @Bindable
    public String getE0202c() {
        return e0202c;
    }

    public void setE0202c(String e0202c) {
        this.e0202c = e0202c;
        notifyPropertyChanged(BR.e0202c);
    }

    @Bindable
    public String getE0202d() {
        return e0202d;
    }

    public void setE0202d(String e0202d) {
        this.e0202d = e0202d;
        notifyPropertyChanged(BR.e0202d);
    }

    @Bindable
    public String getE0202e() {
        return e0202e;
    }

    public void setE0202e(String e0202e) {
        this.e0202e = e0202e;
        notifyPropertyChanged(BR.e0202e);
    }

    @Bindable
    public String getE0202f() {
        return e0202f;
    }

    public void setE0202f(String e0202f) {
        this.e0202f = e0202f;
        notifyPropertyChanged(BR.e0202f);
    }

    @Bindable
    public String getE0203a() {
        return e0203a;
    }

    public void setE0203a(String e0203a) {
        this.e0203a = e0203a;
        notifyPropertyChanged(BR.e0203a);
    }

    @Bindable
    public String getE0203b() {
        return e0203b;
    }

    public void setE0203b(String e0203b) {
        this.e0203b = e0203b;
        notifyPropertyChanged(BR.e0203b);
    }

    @Bindable
    public String getE0204a() {
        return e0204a;
    }

    public void setE0204a(String e0204a) {
        this.e0204a = e0204a;
        setE0204b(e0204a.equals("1") ? this.e0204b : "");
        setE0204c(e0204a.equals("1") ? this.e0204c : "");
        setE0204d(e0204a.equals("1") ? this.e0204d : "");
        notifyPropertyChanged(BR.e0204a);
    }

    @Bindable
    public String getE0204b() {
        return e0204b;
    }

    public void setE0204b(String e0204b) {
        this.e0204b = e0204b;
        notifyPropertyChanged(BR.e0204b);
    }

    @Bindable
    public String getE0204c() {
        return e0204c;
    }

    public void setE0204c(String e0204c) {
        this.e0204c = e0204c;
        notifyPropertyChanged(BR.e0204c);
    }

    @Bindable
    public String getE0204d() {
        return e0204d;
    }

    public void setE0204d(String e0204d) {
        this.e0204d = e0204d;
        setE0204dxx(e0204d.equals("96") ? this.e0204dxx : "");
        notifyPropertyChanged(BR.e0204d);
    }

    @Bindable
    public String getE0204dxx() {
        return e0204dxx;
    }

    public void setE0204dxx(String e0204dxx) {
        this.e0204dxx = e0204dxx;
        notifyPropertyChanged(BR.e0204dxx);
    }

    @Bindable
    public String getE0301() {
        return e0301;
    }

    public void setE0301(String e0301) {
        this.e0301 = e0301;
        setE0302a(e0301.equals("1") ? this.e0302a : "");
        setE0302b(e0301.equals("1") ? this.e0302b : "");
        setE0302c(e0301.equals("1") ? this.e0302c : "");
        setE0302d(e0301.equals("1") ? this.e0302d : "");
        setE0302e(e0301.equals("1") ? this.e0302e : "");
        setE0303a(e0301.equals("1") ? this.e0303a : "");
        setE0303b(e0301.equals("1") ? this.e0303b : "");
        setE0303c(e0301.equals("1") ? this.e0303c : "");
        setE0303d(e0301.equals("1") ? this.e0303d : "");
        setE0303e(e0301.equals("1") ? this.e0303e : "");
        setE0303f(e0301.equals("1") ? this.e0303f : "");
        setE0303g(e0301.equals("1") ? this.e0303g : "");
        setE0303h(e0301.equals("1") ? this.e0303h : "");
        setE0303i(e0301.equals("1") ? this.e0303i : "");
        setE0303j(e0301.equals("1") ? this.e0303j : "");
        setE0303k(e0301.equals("1") ? this.e0303k : "");
        setE0303l(e0301.equals("1") ? this.e0303l : "");
        setE0303m(e0301.equals("1") ? this.e0303m : "");
        setE0303n(e0301.equals("1") ? this.e0303n : "");
        setE0304a(e0301.equals("1") ? this.e0304a : "");
        setE0304b(e0301.equals("1") ? this.e0304b : "");
        setE0304c(e0301.equals("1") ? this.e0304c : "");
        setE0304d(e0301.equals("1") ? this.e0304d : "");
        setE0305a(e0301.equals("1") ? this.e0305a : "");
        setE0305b(e0301.equals("1") ? this.e0305b : "");
        setE0305c(e0301.equals("1") ? this.e0305c : "");
        setE0305d(e0301.equals("1") ? this.e0305d : "");
        setE0305e(e0301.equals("1") ? this.e0305e : "");
        notifyPropertyChanged(BR.e0301);
    }

    @Bindable
    public String getE0302a() {
        return e0302a;
    }

    public void setE0302a(String e0302a) {
        this.e0302a = e0302a;
        notifyPropertyChanged(BR.e0302a);
    }

    @Bindable
    public String getE0302b() {
        return e0302b;
    }

    public void setE0302b(String e0302b) {
        this.e0302b = e0302b;
        notifyPropertyChanged(BR.e0302b);
    }

    @Bindable
    public String getE0302c() {
        return e0302c;
    }

    public void setE0302c(String e0302c) {
        this.e0302c = e0302c;
        notifyPropertyChanged(BR.e0302c);
    }

    @Bindable
    public String getE0302d() {
        return e0302d;
    }

    public void setE0302d(String e0302d) {
        this.e0302d = e0302d;
        notifyPropertyChanged(BR.e0302d);
    }

    @Bindable
    public String getE0302e() {
        return e0302e;
    }

    public void setE0302e(String e0302e) {
        this.e0302e = e0302e;
        notifyPropertyChanged(BR.e0302e);
    }

    @Bindable
    public String getE0303a() {
        return e0303a;
    }

    public void setE0303a(String e0303a) {
        this.e0303a = e0303a;
        notifyPropertyChanged(BR.e0303a);
    }

    @Bindable
    public String getE0303b() {
        return e0303b;
    }

    public void setE0303b(String e0303b) {
        this.e0303b = e0303b;
        notifyPropertyChanged(BR.e0303b);
    }

    @Bindable
    public String getE0303c() {
        return e0303c;
    }

    public void setE0303c(String e0303c) {
        this.e0303c = e0303c;
        notifyPropertyChanged(BR.e0303c);
    }

    @Bindable
    public String getE0303d() {
        return e0303d;
    }

    public void setE0303d(String e0303d) {
        this.e0303d = e0303d;
        notifyPropertyChanged(BR.e0303d);
    }

    @Bindable
    public String getE0303e() {
        return e0303e;
    }

    public void setE0303e(String e0303e) {
        this.e0303e = e0303e;
        notifyPropertyChanged(BR.e0303e);
    }

    @Bindable
    public String getE0303f() {
        return e0303f;
    }

    public void setE0303f(String e0303f) {
        this.e0303f = e0303f;
        notifyPropertyChanged(BR.e0303f);
    }

    @Bindable
    public String getE0303g() {
        return e0303g;
    }

    public void setE0303g(String e0303g) {
        this.e0303g = e0303g;
        notifyPropertyChanged(BR.e0303g);
    }

    @Bindable
    public String getE0303h() {
        return e0303h;
    }

    public void setE0303h(String e0303h) {
        this.e0303h = e0303h;
        notifyPropertyChanged(BR.e0303h);
    }

    @Bindable
    public String getE0303i() {
        return e0303i;
    }

    public void setE0303i(String e0303i) {
        this.e0303i = e0303i;
        notifyPropertyChanged(BR.e0303i);
    }

    @Bindable
    public String getE0303j() {
        return e0303j;
    }

    public void setE0303j(String e0303j) {
        this.e0303j = e0303j;
        notifyPropertyChanged(BR.e0303j);
    }

    @Bindable
    public String getE0303k() {
        return e0303k;
    }

    public void setE0303k(String e0303k) {
        this.e0303k = e0303k;
        notifyPropertyChanged(BR.e0303k);
    }

    @Bindable
    public String getE0303l() {
        return e0303l;
    }

    public void setE0303l(String e0303l) {
        this.e0303l = e0303l;
        notifyPropertyChanged(BR.e0303l);
    }

    @Bindable
    public String getE0303m() {
        return e0303m;
    }

    public void setE0303m(String e0303m) {
        this.e0303m = e0303m;
        notifyPropertyChanged(BR.e0303m);
    }

    @Bindable
    public String getE0303n() {
        return e0303n;
    }

    public void setE0303n(String e0303n) {
        this.e0303n = e0303n;
        notifyPropertyChanged(BR.e0303n);
    }

    @Bindable
    public String getE0304a() {
        return e0304a;
    }

    public void setE0304a(String e0304a) {
        this.e0304a = e0304a;
        notifyPropertyChanged(BR.e0304a);
    }

    @Bindable
    public String getE0304b() {
        return e0304b;
    }

    public void setE0304b(String e0304b) {
        this.e0304b = e0304b;
        notifyPropertyChanged(BR.e0304b);
    }

    @Bindable
    public String getE0304c() {
        return e0304c;
    }

    public void setE0304c(String e0304c) {
        this.e0304c = e0304c;
        notifyPropertyChanged(BR.e0304c);
    }

    @Bindable
    public String getE0304d() {
        return e0304d;
    }

    public void setE0304d(String e0304d) {
        this.e0304d = e0304d;
        notifyPropertyChanged(BR.e0304d);
    }

    @Bindable
    public String getE0305a() {
        return e0305a;
    }

    public void setE0305a(String e0305a) {
        this.e0305a = e0305a;
        setE0305d(e0305a.equals("3") && this.e0305b.equals("3") && this.e0305c.equals("3") ? "" : this.e0305d);
        setE0305e(e0305a.equals("3") && this.e0305b.equals("3") && this.e0305c.equals("3") ? "" : this.e0305e);
        notifyPropertyChanged(BR.e0305a);
    }

    @Bindable
    public String getE0305b() {
        return e0305b;
    }

    public void setE0305b(String e0305b) {
        this.e0305b = e0305b;
        setE0305d(e0305b.equals("3") && this.e0305a.equals("3") && this.e0305c.equals("3") ? "" : this.e0305d);
        setE0305e(e0305b.equals("3") && this.e0305a.equals("3") && this.e0305c.equals("3") ? "" : this.e0305e);
        notifyPropertyChanged(BR.e0305b);
    }

    @Bindable
    public String getE0305c() {
        return e0305c;
    }

    public void setE0305c(String e0305c) {
        this.e0305c = e0305c;
        setE0305d(e0305c.equals("3") && this.e0305a.equals("3") && this.e0305b.equals("3") ? "" : this.e0305d);
        setE0305e(e0305c.equals("3") && this.e0305a.equals("3") && this.e0305b.equals("3") ? "" : this.e0305e);
        notifyPropertyChanged(BR.e0305c);
    }

    @Bindable
    public String getE0305d() {
        return e0305d;
    }

    public void setE0305d(String e0305d) {
        this.e0305d = e0305d;
        notifyPropertyChanged(BR.e0305d);
    }

    @Bindable
    public String getE0305e() {
        return e0305e;
    }

    public void setE0305e(String e0305e) {
        this.e0305e = e0305e;
        setE0305exx(this.e0305e.equals("96") ? this.e0305exx : "");
        notifyPropertyChanged(BR.e0305e);
    }

    @Bindable
    public String getE0305exx() {
        return e0305exx;
    }

    public void setE0305exx(String e0305exx) {
        this.e0305exx = e0305exx;
        notifyPropertyChanged(BR.e0305exx);
    }


    @Bindable
    public String getE306011() {
        return e306011;
    }

    public void setE306011(String e306011) {
        this.e306011 = e306011;
        setE306011q(e306011.equals("1") ? this.e306011q : "");
        setE306012(e306011.equals("1") ? this.e306012 : "");
        notifyPropertyChanged(BR.e306011);
    }

    @Bindable
    public String getE306011q() {
        return e306011q;
    }

    public void setE306011q(String e306011q) {
        this.e306011q = e306011q;
        notifyPropertyChanged(BR.e306011q);
    }

    @Bindable
    public String getE306012() {
        return e306012;
    }

    public void setE306012(String e306012) {
        this.e306012 = e306012;
        setE306012q(e306012.equals("1") ? this.e306012q : "");
        notifyPropertyChanged(BR.e306012);
    }

    @Bindable
    public String getE306012q() {
        return e306012q;
    }

    public void setE306012q(String e306012q) {
        this.e306012q = e306012q;
        notifyPropertyChanged(BR.e306012q);
    }


    @Bindable
    public String getE306021() {
        return e306021;
    }

    public void setE306021(String e306021) {
        this.e306021 = e306021;
        setE306021q(e306021.equals("1") ? this.e306021q : "");
        setE306022(e306021.equals("1") ? this.e306022 : "");
        notifyPropertyChanged(BR.e306021);
    }

    @Bindable
    public String getE306021q() {
        return e306021q;
    }

    public void setE306021q(String e306021q) {
        this.e306021q = e306021q;
        notifyPropertyChanged(BR.e306021q);
    }

    @Bindable
    public String getE306022() {
        return e306022;
    }

    public void setE306022(String e306022) {
        this.e306022 = e306022;
        setE306022q(e306022.equals("1") ? this.e306022q : "");
        notifyPropertyChanged(BR.e306022);
    }

    @Bindable
    public String getE306022q() {
        return e306022q;
    }

    public void setE306022q(String e306022q) {
        this.e306022q = e306022q;
        notifyPropertyChanged(BR.e306022q);
    }


    @Bindable
    public String getE306031() {
        return e306031;
    }

    public void setE306031(String e306031) {
        this.e306031 = e306031;
        setE306031q(e306031.equals("1") ? this.e306031q : "");
        setE306032(e306031.equals("1") ? this.e306032 : "");
        notifyPropertyChanged(BR.e306031);
    }

    @Bindable
    public String getE306031q() {
        return e306031q;
    }

    public void setE306031q(String e306031q) {
        this.e306031q = e306031q;
        notifyPropertyChanged(BR.e306031q);
    }

    @Bindable
    public String getE306032() {
        return e306032;
    }

    public void setE306032(String e306032) {
        this.e306032 = e306032;
        setE306032q(e306032.equals("1") ? this.e306032q : "");
        notifyPropertyChanged(BR.e306032);
    }

    @Bindable
    public String getE306032q() {
        return e306032q;
    }

    public void setE306032q(String e306032q) {
        this.e306032q = e306032q;
        notifyPropertyChanged(BR.e306032q);
    }


    @Bindable
    public String getE306041() {
        return e306041;
    }

    public void setE306041(String e306041) {
        this.e306041 = e306041;
        setE306041q(e306041.equals("1") ? this.e306041q : "");
        setE306042(e306041.equals("1") ? this.e306042 : "");
        notifyPropertyChanged(BR.e306041);
    }

    @Bindable
    public String getE306041q() {
        return e306041q;
    }

    public void setE306041q(String e306041q) {
        this.e306041q = e306041q;
        notifyPropertyChanged(BR.e306041q);
    }

    @Bindable
    public String getE306042() {
        return e306042;
    }

    public void setE306042(String e306042) {
        this.e306042 = e306042;
        setE306042q(e306042.equals("1") ? this.e306042q : "");
        notifyPropertyChanged(BR.e306042);
    }

    @Bindable
    public String getE306042q() {
        return e306042q;
    }

    public void setE306042q(String e306042q) {
        this.e306042q = e306042q;
        notifyPropertyChanged(BR.e306042q);
    }


    @Bindable
    public String getE306051() {
        return e306051;
    }

    public void setE306051(String e306051) {
        this.e306051 = e306051;
        setE306051q(e306051.equals("1") ? this.e306051q : "");
        setE306052(e306051.equals("1") ? this.e306052 : "");
        notifyPropertyChanged(BR.e306051);
    }

    @Bindable
    public String getE306051q() {
        return e306051q;
    }

    public void setE306051q(String e306051q) {
        this.e306051q = e306051q;
        notifyPropertyChanged(BR.e306051q);
    }

    @Bindable
    public String getE306052() {
        return e306052;
    }

    public void setE306052(String e306052) {
        this.e306052 = e306052;
        setE306052q(e306052.equals("1") ? this.e306052q : "");
        notifyPropertyChanged(BR.e306052);
    }

    @Bindable
    public String getE306052q() {
        return e306052q;
    }

    public void setE306052q(String e306052q) {
        this.e306052q = e306052q;
        notifyPropertyChanged(BR.e306052q);
    }


    @Bindable
    public String getE306061() {
        return e306061;
    }

    public void setE306061(String e306061) {
        this.e306061 = e306061;
        setE306061q(e306061.equals("1") ? this.e306061q : "");
        setE306062(e306061.equals("1") ? this.e306062 : "");
        notifyPropertyChanged(BR.e306061);
    }

    @Bindable
    public String getE306061q() {
        return e306061q;
    }

    public void setE306061q(String e306061q) {
        this.e306061q = e306061q;
        notifyPropertyChanged(BR.e306061q);
    }

    @Bindable
    public String getE306062() {
        return e306062;
    }

    public void setE306062(String e306062) {
        this.e306062 = e306062;
        setE306062q(e306062.equals("1") ? this.e306062q : "");
        notifyPropertyChanged(BR.e306062);
    }

    @Bindable
    public String getE306062q() {
        return e306062q;
    }

    public void setE306062q(String e306062q) {
        this.e306062q = e306062q;
        notifyPropertyChanged(BR.e306062q);
    }


    @Bindable
    public String getE306071() {
        return e306071;
    }

    public void setE306071(String e306071) {
        this.e306071 = e306071;
        setE306071q(e306071.equals("1") ? this.e306071q : "");
        setE306072(e306071.equals("1") ? this.e306072 : "");
        notifyPropertyChanged(BR.e306071);
    }

    @Bindable
    public String getE306071q() {
        return e306071q;
    }

    public void setE306071q(String e306071q) {
        this.e306071q = e306071q;
        notifyPropertyChanged(BR.e306071q);
    }

    @Bindable
    public String getE306072() {
        return e306072;
    }

    public void setE306072(String e306072) {
        this.e306072 = e306072;
        setE306072q(e306072.equals("1") ? this.e306072q : "");
        notifyPropertyChanged(BR.e306072);
    }

    @Bindable
    public String getE306072q() {
        return e306072q;
    }

    public void setE306072q(String e306072q) {
        this.e306072q = e306072q;
        notifyPropertyChanged(BR.e306072q);
    }


    @Bindable
    public String getE306081() {
        return e306081;
    }

    public void setE306081(String e306081) {
        this.e306081 = e306081;
        setE306081q(e306081.equals("1") ? this.e306081q : "");
        setE306082(e306081.equals("1") ? this.e306082 : "");
        notifyPropertyChanged(BR.e306081);
    }

    @Bindable
    public String getE306081q() {
        return e306081q;
    }

    public void setE306081q(String e306081q) {
        this.e306081q = e306081q;
        notifyPropertyChanged(BR.e306081q);
    }

    @Bindable
    public String getE306082() {
        return e306082;
    }

    public void setE306082(String e306082) {
        this.e306082 = e306082;
        setE306082q(e306082.equals("1") ? this.e306082q : "");
        notifyPropertyChanged(BR.e306082);
    }

    @Bindable
    public String getE306082q() {
        return e306082q;
    }

    public void setE306082q(String e306082q) {
        this.e306082q = e306082q;
        notifyPropertyChanged(BR.e306082q);
    }


    @Bindable
    public String getE306091() {
        return e306091;
    }

    public void setE306091(String e306091) {
        this.e306091 = e306091;
        setE306091q(e306091.equals("1") ? this.e306091q : "");
        setE306092(e306091.equals("1") ? this.e306092 : "");
        notifyPropertyChanged(BR.e306091);
    }

    @Bindable
    public String getE306091q() {
        return e306091q;
    }

    public void setE306091q(String e306091q) {
        this.e306091q = e306091q;
        notifyPropertyChanged(BR.e306091q);
    }

    @Bindable
    public String getE306092() {
        return e306092;
    }

    public void setE306092(String e306092) {
        this.e306092 = e306092;
        setE306092q(e306092.equals("1") ? this.e306092q : "");
        notifyPropertyChanged(BR.e306092);
    }

    @Bindable
    public String getE306092q() {
        return e306092q;
    }

    public void setE306092q(String e306092q) {
        this.e306092q = e306092q;
        notifyPropertyChanged(BR.e306092q);
    }


    @Bindable
    public String getE306101() {
        return e306101;
    }

    public void setE306101(String e306101) {
        this.e306101 = e306101;
        setE306101q(e306101.equals("1") ? this.e306101q : "");
        setE306102(e306101.equals("1") ? this.e306102 : "");
        notifyPropertyChanged(BR.e306101);
    }

    @Bindable
    public String getE306101q() {
        return e306101q;
    }

    public void setE306101q(String e306101q) {
        this.e306101q = e306101q;
        notifyPropertyChanged(BR.e306101q);
    }

    @Bindable
    public String getE306102() {
        return e306102;
    }

    public void setE306102(String e306102) {
        this.e306102 = e306102;
        setE306102q(e306102.equals("1") ? this.e306102q : "");
        notifyPropertyChanged(BR.e306102);
    }

    @Bindable
    public String getE306102q() {
        return e306102q;
    }

    public void setE306102q(String e306102q) {
        this.e306102q = e306102q;
        notifyPropertyChanged(BR.e306102q);
    }


    @Bindable
    public String getE306111() {
        return e306111;
    }

    public void setE306111(String e306111) {
        this.e306111 = e306111;
        setE306111q(e306111.equals("1") ? this.e306111q : "");
        setE306112(e306111.equals("1") ? this.e306112 : "");
        notifyPropertyChanged(BR.e306111);
    }

    @Bindable
    public String getE306111q() {
        return e306111q;
    }

    public void setE306111q(String e306111q) {
        this.e306111q = e306111q;
        notifyPropertyChanged(BR.e306111q);
    }

    @Bindable
    public String getE306112() {
        return e306112;
    }

    public void setE306112(String e306112) {
        this.e306112 = e306112;
        setE306112q(e306112.equals("1") ? this.e306112q : "");
        notifyPropertyChanged(BR.e306112);
    }

    @Bindable
    public String getE306112q() {
        return e306112q;
    }

    public void setE306112q(String e306112q) {
        this.e306112q = e306112q;
        notifyPropertyChanged(BR.e306112q);
    }


    @Bindable
    public String getE306121() {
        return e306121;
    }

    public void setE306121(String e306121) {
        this.e306121 = e306121;
        setE306121q(e306121.equals("1") ? this.e306121q : "");
        setE306122(e306121.equals("1") ? this.e306122 : "");
        notifyPropertyChanged(BR.e306121);
    }

    @Bindable
    public String getE306121q() {
        return e306121q;
    }

    public void setE306121q(String e306121q) {
        this.e306121q = e306121q;
        notifyPropertyChanged(BR.e306121q);
    }

    @Bindable
    public String getE306122() {
        return e306122;
    }

    public void setE306122(String e306122) {
        this.e306122 = e306122;
        setE306122q(e306122.equals("1") ? this.e306122q : "");
        notifyPropertyChanged(BR.e306122);
    }

    @Bindable
    public String getE306122q() {
        return e306122q;
    }

    public void setE306122q(String e306122q) {
        this.e306122q = e306122q;
        notifyPropertyChanged(BR.e306122q);
    }


    @Bindable
    public String getE306131() {
        return e306131;
    }

    public void setE306131(String e306131) {
        this.e306131 = e306131;
        setE306131q(e306131.equals("1") ? this.e306131q : "");
        setE306132(e306131.equals("1") ? this.e306132 : "");
        notifyPropertyChanged(BR.e306131);
    }

    @Bindable
    public String getE306131q() {
        return e306131q;
    }

    public void setE306131q(String e306131q) {
        this.e306131q = e306131q;
        notifyPropertyChanged(BR.e306131q);
    }

    @Bindable
    public String getE306132() {
        return e306132;
    }

    public void setE306132(String e306132) {
        this.e306132 = e306132;
        setE306132q(e306132.equals("1") ? this.e306132q : "");
        notifyPropertyChanged(BR.e306132);
    }

    @Bindable
    public String getE306132q() {
        return e306132q;
    }

    public void setE306132q(String e306132q) {
        this.e306132q = e306132q;
        notifyPropertyChanged(BR.e306132q);
    }


    @Bindable
    public String getE306141() {
        return e306141;
    }

    public void setE306141(String e306141) {
        this.e306141 = e306141;
        setE306141q(e306141.equals("1") ? this.e306141q : "");
        setE306142(e306141.equals("1") ? this.e306142 : "");
        notifyPropertyChanged(BR.e306141);
    }

    @Bindable
    public String getE306141q() {
        return e306141q;
    }

    public void setE306141q(String e306141q) {
        this.e306141q = e306141q;
        notifyPropertyChanged(BR.e306141q);
    }

    @Bindable
    public String getE306142() {
        return e306142;
    }

    public void setE306142(String e306142) {
        this.e306142 = e306142;
        setE306142q(e306142.equals("1") ? this.e306142q : "");
        notifyPropertyChanged(BR.e306142);
    }

    @Bindable
    public String getE306142q() {
        return e306142q;
    }

    public void setE306142q(String e306142q) {
        this.e306142q = e306142q;
        notifyPropertyChanged(BR.e306142q);
    }


    @Bindable
    public String getE306151() {
        return e306151;
    }

    public void setE306151(String e306151) {
        this.e306151 = e306151;
        setE306151q(e306151.equals("1") ? this.e306151q : "");
        setE306152(e306151.equals("1") ? this.e306152 : "");
        notifyPropertyChanged(BR.e306151);
    }

    @Bindable
    public String getE306151q() {
        return e306151q;
    }

    public void setE306151q(String e306151q) {
        this.e306151q = e306151q;
        notifyPropertyChanged(BR.e306151q);
    }

    @Bindable
    public String getE306152() {
        return e306152;
    }

    public void setE306152(String e306152) {
        this.e306152 = e306152;
        setE306152q(e306152.equals("1") ? this.e306152q : "");
        notifyPropertyChanged(BR.e306152);
    }

    @Bindable
    public String getE306152q() {
        return e306152q;
    }

    public void setE306152q(String e306152q) {
        this.e306152q = e306152q;
        notifyPropertyChanged(BR.e306152q);
    }


    @Bindable
    public String getE306161() {
        return e306161;
    }

    public void setE306161(String e306161) {
        this.e306161 = e306161;
        setE306161q(e306161.equals("1") ? this.e306161q : "");
        setE306162(e306161.equals("1") ? this.e306162 : "");
        notifyPropertyChanged(BR.e306161);
    }

    @Bindable
    public String getE306161q() {
        return e306161q;
    }

    public void setE306161q(String e306161q) {
        this.e306161q = e306161q;
        notifyPropertyChanged(BR.e306161q);
    }

    @Bindable
    public String getE306162() {
        return e306162;
    }

    public void setE306162(String e306162) {
        this.e306162 = e306162;
        setE306162q(e306162.equals("1") ? this.e306162q : "");
        notifyPropertyChanged(BR.e306162);
    }

    @Bindable
    public String getE306162q() {
        return e306162q;
    }

    public void setE306162q(String e306162q) {
        this.e306162q = e306162q;
        notifyPropertyChanged(BR.e306162q);
    }


    @Bindable
    public String getE306171() {
        return e306171;
    }

    public void setE306171(String e306171) {
        this.e306171 = e306171;
        setE306171q(e306171.equals("1") ? this.e306171q : "");
        setE306172(e306171.equals("1") ? this.e306172 : "");
        notifyPropertyChanged(BR.e306171);
    }

    @Bindable
    public String getE306171q() {
        return e306171q;
    }

    public void setE306171q(String e306171q) {
        this.e306171q = e306171q;
        notifyPropertyChanged(BR.e306171q);
    }

    @Bindable
    public String getE306172() {
        return e306172;
    }

    public void setE306172(String e306172) {
        this.e306172 = e306172;
        setE306172q(e306172.equals("1") ? this.e306172q : "");
        notifyPropertyChanged(BR.e306172);
    }

    @Bindable
    public String getE306172q() {
        return e306172q;
    }

    public void setE306172q(String e306172q) {
        this.e306172q = e306172q;
        notifyPropertyChanged(BR.e306172q);
    }


    @Bindable
    public String getE306181() {
        return e306181;
    }

    public void setE306181(String e306181) {
        this.e306181 = e306181;
        setE306181q(e306181.equals("1") ? this.e306181q : "");
        setE306182(e306181.equals("1") ? this.e306182 : "");
        notifyPropertyChanged(BR.e306181);
    }

    @Bindable
    public String getE306181q() {
        return e306181q;
    }

    public void setE306181q(String e306181q) {
        this.e306181q = e306181q;
        notifyPropertyChanged(BR.e306181q);
    }

    @Bindable
    public String getE306182() {
        return e306182;
    }

    public void setE306182(String e306182) {
        this.e306182 = e306182;
        setE306182q(e306182.equals("1") ? this.e306182q : "");
        notifyPropertyChanged(BR.e306182);
    }

    @Bindable
    public String getE306182q() {
        return e306182q;
    }

    public void setE306182q(String e306182q) {
        this.e306182q = e306182q;
        notifyPropertyChanged(BR.e306182q);
    }


    @Bindable
    public String getE0307() {
        return e0307;
    }

    public void setE0307(String e0307) {
        this.e0307 = e0307;
        notifyPropertyChanged(BR.e0307);
    }

    @Bindable
    public String getE0308() {
        return e0308;
    }

    public void setE0308(String e0308) {
        this.e0308 = e0308;
        notifyPropertyChanged(BR.e0308);
    }


    @Bindable
    public String getE401() {
        return e401;
    }

    public void setE401(String e401) {
        this.e401 = e401;
        notifyPropertyChanged(BR.e401);
    }

    @Bindable
    public String getE402() {
        return e402;
    }

    public void setE402(String e402) {
        this.e402 = e402;
        notifyPropertyChanged(BR.e402);
    }

    @Bindable
    public String getE403a() {
        return e403a;
    }

    public void setE403a(String e403a) {
        this.e403a = e403a;
        notifyPropertyChanged(BR.e403a);
    }

    @Bindable
    public String getE403b() {
        return e403b;
    }

    public void setE403b(String e403b) {
        this.e403b = e403b;
        notifyPropertyChanged(BR.e403b);
    }

    @Bindable
    public String getE403c() {
        return e403c;
    }

    public void setE403c(String e403c) {
        this.e403c = e403c;
        notifyPropertyChanged(BR.e403c);
    }

    @Bindable
    public String getE404a() {
        return e404a;
    }

    public void setE404a(String e404a) {
        this.e404a = e404a;
        notifyPropertyChanged(BR.e404a);
    }

    @Bindable
    public String getE404b() {
        return e404b;
    }

    public void setE404b(String e404b) {
        this.e404b = e404b;
        notifyPropertyChanged(BR.e404b);
    }

    @Bindable
    public String getE404c() {
        return e404c;
    }

    public void setE404c(String e404c) {
        this.e404c = e404c;
        notifyPropertyChanged(BR.e404c);
    }

    @Bindable
    public String getE404d() {
        return e404d;
    }

    public void setE404d(String e404d) {
        this.e404d = e404d;
        notifyPropertyChanged(BR.e404d);
    }

    @Bindable
    public String getE404e() {
        return e404e;
    }

    public void setE404e(String e404e) {
        this.e404e = e404e;
        notifyPropertyChanged(BR.e404e);
    }

    @Bindable
    public String getE404f() {
        return e404f;
    }

    public void setE404f(String e404f) {
        this.e404f = e404f;
        notifyPropertyChanged(BR.e404f);
    }

    @Bindable
    public String getE404g() {
        return e404g;
    }

    public void setE404g(String e404g) {
        this.e404g = e404g;
        notifyPropertyChanged(BR.e404g);
    }

    @Bindable
    public String getE404h() {
        return e404h;
    }

    public void setE404h(String e404h) {
        this.e404h = e404h;
        notifyPropertyChanged(BR.e404h);
    }

    @Bindable
    public String getE405a() {
        return e405a;
    }

    public void setE405a(String e405a) {
        this.e405a = e405a;
        notifyPropertyChanged(BR.e405a);
    }

    @Bindable
    public String getE405b() {
        return e405b;
    }

    public void setE405b(String e405b) {
        this.e405b = e405b;
        notifyPropertyChanged(BR.e405b);
    }

    @Bindable
    public String getE405c() {
        return e405c;
    }

    public void setE405c(String e405c) {
        this.e405c = e405c;
        notifyPropertyChanged(BR.e405c);
    }

    @Bindable
    public String getE405d() {
        return e405d;
    }

    public void setE405d(String e405d) {
        this.e405d = e405d;
        notifyPropertyChanged(BR.e405d);
    }

    @Bindable
    public String getE405e() {
        return e405e;
    }

    public void setE405e(String e405e) {
        this.e405e = e405e;
        notifyPropertyChanged(BR.e405e);
    }

    @Bindable
    public String getE405f() {
        return e405f;
    }

    public void setE405f(String e405f) {
        this.e405f = e405f;
        notifyPropertyChanged(BR.e405f);
    }

    @Bindable
    public String getE405g() {
        return e405g;
    }

    public void setE405g(String e405g) {
        this.e405g = e405g;
        notifyPropertyChanged(BR.e405g);
    }

    @Bindable
    public String getE405h() {
        return e405h;
    }

    public void setE405h(String e405h) {
        this.e405h = e405h;
        notifyPropertyChanged(BR.e405h);
    }

    @Bindable
    public String getE406() {
        return e406;
    }

    public void setE406(String e406) {
        this.e406 = e406;
        notifyPropertyChanged(BR.e406);
    }

    @Bindable
    public String getE407a() {
        return e407a;
    }

    public void setE407a(String e407a) {
        this.e407a = e407a;
        notifyPropertyChanged(BR.e407a);
    }

    @Bindable
    public String getE407b() {
        return e407b;
    }

    public void setE407b(String e407b) {
        this.e407b = e407b;
        notifyPropertyChanged(BR.e407b);
    }

    @Bindable
    public String getE407c() {
        return e407c;
    }

    public void setE407c(String e407c) {
        this.e407c = e407c;
        notifyPropertyChanged(BR.e407c);
    }

    @Bindable
    public String getE407d() {
        return e407d;
    }

    public void setE407d(String e407d) {
        this.e407d = e407d;
        notifyPropertyChanged(BR.e407d);
    }

    @Bindable
    public String getE408() {
        return e408;
    }

    public void setE408(String e408) {
        this.e408 = e408;
        notifyPropertyChanged(BR.e408);
    }

    @Bindable
    public String getE409() {
        return e409;
    }

    public void setE409(String e409) {
        this.e409 = e409;
        setE40996x(e409.equals("96") ? this.e40996x : "");
        notifyPropertyChanged(BR.e409);
    }

    @Bindable
    public String getE40996x() {
        return e40996x;
    }

    public void setE40996x(String e40996x) {
        this.e40996x = e40996x;
        notifyPropertyChanged(BR.e40996x);
    }

    @Bindable
    public String getE410a() {
        return e410a;
    }

    public void setE410a(String e410a) {
        this.e410a = e410a;
        notifyPropertyChanged(BR.e410a);
    }

    @Bindable
    public String getE410b() {
        return e410b;
    }

    public void setE410b(String e410b) {
        this.e410b = e410b;
        notifyPropertyChanged(BR.e410b);
    }

    @Bindable
    public String getE410c() {
        return e410c;
    }

    public void setE410c(String e410c) {
        this.e410c = e410c;
        notifyPropertyChanged(BR.e410c);
    }

    @Bindable
    public String getE410d() {
        return e410d;
    }

    public void setE410d(String e410d) {
        this.e410d = e410d;
        notifyPropertyChanged(BR.e410d);
    }

    @Bindable
    public String getE410e() {
        return e410e;
    }

    public void setE410e(String e410e) {
        this.e410e = e410e;
        notifyPropertyChanged(BR.e410e);
    }

    @Bindable
    public String getE410f() {
        return e410f;
    }

    public void setE410f(String e410f) {
        this.e410f = e410f;
        notifyPropertyChanged(BR.e410f);
    }

    @Bindable
    public String getE411() {
        return e411;
    }

    public void setE411(String e411) {
        this.e411 = e411;
        notifyPropertyChanged(BR.e411);
    }

    @Bindable
    public String getE412() {
        return e412;
    }

    public void setE412(String e412) {
        this.e412 = e412;
        notifyPropertyChanged(BR.e412);
    }

    @Bindable
    public String getE412a() {
        return e412a;
    }

    public void setE412a(String e412a) {
        if (this.e412a.equals(e412a)) return;
        this.e412a = e412a;
        notifyPropertyChanged(BR.e412a);
    }

    @Bindable
    public String getE412b() {
        return e412b;
    }

    public void setE412b(String e412b) {
        if (this.e412b.equals(e412b)) return;
        this.e412b = e412b;
        notifyPropertyChanged(BR.e412b);
    }

    @Bindable
    public String getE412c() {
        return e412c;
    }

    public void setE412c(String e412c) {
        if (this.e412c.equals(e412c)) return;
        this.e412c = e412c;
        notifyPropertyChanged(BR.e412c);
    }

    @Bindable
    public String getE412d() {
        return e412d;
    }

    public void setE412d(String e412d) {
        if (this.e412d.equals(e412d)) return;
        this.e412d = e412d;
        notifyPropertyChanged(BR.e412d);
    }

    @Bindable
    public String getE413() {
        return e413;
    }

    public void setE413(String e413) {
        this.e413 = e413;
        notifyPropertyChanged(BR.e413);
    }

    @Bindable
    public String getE414() {
        return e414;
    }

    public void setE414(String e414) {
        this.e414 = e414;
        notifyPropertyChanged(BR.e414);
    }

    @Bindable
    public String getE415() {
        return e415;
    }

    public void setE415(String e415) {
        this.e415 = e415;
        notifyPropertyChanged(BR.e415);
    }

    @Bindable
    public String getE416() {
        return e416;
    }

    public void setE416(String e416) {
        this.e416 = e416;
        notifyPropertyChanged(BR.e416);
    }


    @Bindable
    public String getE0501() {
        return e0501;
    }

    public void setE0501(String e0501) {
        this.e0501 = e0501;
        notifyPropertyChanged(BR.e0501);
    }

    @Bindable
    public String getE0502a() {
        return e0502a;
    }

    public void setE0502a(String e0502a) {
        this.e0502a = e0502a;
        notifyPropertyChanged(BR.e0502a);
    }

    @Bindable
    public String getE0502b() {
        return e0502b;
    }

    public void setE0502b(String e0502b) {
        this.e0502b = e0502b;
        notifyPropertyChanged(BR.e0502b);
    }

    @Bindable
    public String getE0502c() {
        return e0502c;
    }

    public void setE0502c(String e0502c) {
        this.e0502c = e0502c;
        notifyPropertyChanged(BR.e0502c);
    }

    @Bindable
    public String getE0502d() {
        return e0502d;
    }

    public void setE0502d(String e0502d) {
        this.e0502d = e0502d;
        notifyPropertyChanged(BR.e0502d);
    }

    @Bindable
    public String getE0502e() {
        return e0502e;
    }

    public void setE0502e(String e0502e) {
        this.e0502e = e0502e;
        notifyPropertyChanged(BR.e0502e);
    }

    @Bindable
    public String getE0502f() {
        return e0502f;
    }

    public void setE0502f(String e0502f) {
        this.e0502f = e0502f;
        notifyPropertyChanged(BR.e0502f);
    }

    @Bindable
    public String getE0502g() {
        return e0502g;
    }

    public void setE0502g(String e0502g) {
        this.e0502g = e0502g;
        notifyPropertyChanged(BR.e0502g);
    }

    @Bindable
    public String getE0502h() {
        return e0502h;
    }

    public void setE0502h(String e0502h) {
        this.e0502h = e0502h;
        notifyPropertyChanged(BR.e0502h);
    }

    @Bindable
    public String getE0502i() {
        return e0502i;
    }

    public void setE0502i(String e0502i) {
        this.e0502i = e0502i;
        notifyPropertyChanged(BR.e0502i);
    }

    @Bindable
    public String getE0503() {
        return e0503;
    }

    public void setE0503(String e0503) {
        this.e0503 = e0503;
        notifyPropertyChanged(BR.e0503);
    }

    @Bindable
    public String getE0504() {
        return e0504;
    }

    public void setE0504(String e0504) {
        this.e0504 = e0504;
        notifyPropertyChanged(BR.e0504);
    }

    @Bindable
    public String getE0505() {
        return e0505;
    }

    public void setE0505(String e0505) {
        this.e0505 = e0505;
        notifyPropertyChanged(BR.e0505);
    }

    @Bindable
    public String getE0506() {
        return e0506;
    }

    public void setE0506(String e0506) {
        this.e0506 = e0506;
        notifyPropertyChanged(BR.e0506);
    }

    @Bindable
    public String getE0507() {
        return e0507;
    }

    public void setE0507(String e0507) {
        this.e0507 = e0507;
        notifyPropertyChanged(BR.e0507);
    }

    @Bindable
    public String getE0508() {
        return e0508;
    }

    public void setE0508(String e0508) {
        this.e0508 = e0508;
        notifyPropertyChanged(BR.e0508);
    }

    @Bindable
    public String getE0509() {
        return e0509;
    }

    public void setE0509(String e0509) {
        this.e0509 = e0509;
        notifyPropertyChanged(BR.e0509);
    }

    @Bindable
    public String getE0601() {
        return e0601;
    }

    public void setE0601(String e0601) {
        this.e0601 = e0601;
        notifyPropertyChanged(BR.e0601);
    }

    @Bindable
    public String getE0602() {
        return e0602;
    }

    public void setE0602(String e0602) {
        this.e0602 = e0602;
        notifyPropertyChanged(BR.e0602);
    }

    @Bindable
    public String getE0603() {
        return e0603;
    }

    public void setE0603(String e0603) {
        this.e0603 = e0603;
        notifyPropertyChanged(BR.e0603);
    }

    @Bindable
    public String getE0604() {
        return e0604;
    }

    public void setE0604(String e0604) {
        this.e0604 = e0604;
        notifyPropertyChanged(BR.e0604);
    }

    @Bindable
    public String getE0605a() {
        return e0605a;
    }

    public void setE0605a(String e0605a) {
        this.e0605a = e0605a;
        notifyPropertyChanged(BR.e0605a);
    }

    @Bindable
    public String getE0605b() {
        return e0605b;
    }

    public void setE0605b(String e0605b) {
        this.e0605b = e0605b;
        notifyPropertyChanged(BR.e0605b);
    }

    @Bindable
    public String getE0605c() {
        return e0605c;
    }

    public void setE0605c(String e0605c) {
        this.e0605c = e0605c;
        notifyPropertyChanged(BR.e0605c);
    }

    @Bindable
    public String getE0605d() {
        return e0605d;
    }

    public void setE0605d(String e0605d) {
        this.e0605d = e0605d;
        notifyPropertyChanged(BR.e0605d);
    }

    @Bindable
    public String getE0606() {
        return e0606;
    }

    public void setE0606(String e0606) {
        this.e0606 = e0606;
        notifyPropertyChanged(BR.e0606);
    }

    @Bindable
    public String getE0607() {
        return e0607;
    }

    public void setE0607(String e0607) {
        this.e0607 = e0607;
        notifyPropertyChanged(BR.e0607);
    }

    @Bindable
    public String getE0608() {
        return e0608;
    }

    public void setE0608(String e0608) {
        this.e0608 = e0608;
        notifyPropertyChanged(BR.e0608);
    }

    @Bindable
    public String getE0609() {
        return e0609;
    }

    public void setE0609(String e0609) {
        this.e0609 = e0609;
        notifyPropertyChanged(BR.e0609);
    }

    @Bindable
    public String getE0610() {
        return e0610;
    }

    public void setE0610(String e0610) {
        this.e0610 = e0610;
        notifyPropertyChanged(BR.e0610);
    }

    @Bindable
    public String getE0611() {
        return e0611;
    }

    public void setE0611(String e0611) {
        this.e0611 = e0611;
        notifyPropertyChanged(BR.e0611);
    }

    @Bindable
    public String getE0701() {
        return e0701;
    }

    public void setE0701(String e0701) {
        this.e0701 = e0701;
        notifyPropertyChanged(BR.e0701);
    }

    @Bindable
    public String getE0702a() {
        return e0702a;
    }

    public void setE0702a(String e0702a) {
        this.e0702a = e0702a;
        notifyPropertyChanged(BR.e0702a);
    }

    @Bindable
    public String getE0702b() {
        return e0702b;
    }

    public void setE0702b(String e0702b) {
        this.e0702b = e0702b;
        notifyPropertyChanged(BR.e0702b);
    }

    @Bindable
    public String getE0702c() {
        return e0702c;
    }

    public void setE0702c(String e0702c) {
        this.e0702c = e0702c;
        notifyPropertyChanged(BR.e0702c);
    }

    @Bindable
    public String getE0702d() {
        return e0702d;
    }

    public void setE0702d(String e0702d) {
        this.e0702d = e0702d;
        notifyPropertyChanged(BR.e0702d);
    }

    @Bindable
    public String getE0702e() {
        return e0702e;
    }

    public void setE0702e(String e0702e) {
        this.e0702e = e0702e;
        notifyPropertyChanged(BR.e0702e);
    }

    @Bindable
    public String getE0702f() {
        return e0702f;
    }

    public void setE0702f(String e0702f) {
        this.e0702f = e0702f;
        notifyPropertyChanged(BR.e0702f);
    }

    @Bindable
    public String getE0702g() {
        return e0702g;
    }

    public void setE0702g(String e0702g) {
        this.e0702g = e0702g;
        notifyPropertyChanged(BR.e0702g);
    }

    @Bindable
    public String getE0702h() {
        return e0702h;
    }

    public void setE0702h(String e0702h) {
        this.e0702h = e0702h;
        notifyPropertyChanged(BR.e0702h);
    }

    @Bindable
    public String getE0702i() {
        return e0702i;
    }

    public void setE0702i(String e0702i) {
        this.e0702i = e0702i;
        notifyPropertyChanged(BR.e0702i);
    }

    @Bindable
    public String getE0702j() {
        return e0702j;
    }

    public void setE0702j(String e0702j) {
        this.e0702j = e0702j;
        notifyPropertyChanged(BR.e0702j);
    }

    @Bindable
    public String getE0702k() {
        return e0702k;
    }

    public void setE0702k(String e0702k) {
        this.e0702k = e0702k;
        notifyPropertyChanged(BR.e0702k);
    }

    @Bindable
    public String getE0702l() {
        return e0702l;
    }

    public void setE0702l(String e0702l) {
        this.e0702l = e0702l;
        notifyPropertyChanged(BR.e0702l);
    }

    @Bindable
    public String getE0703a() {
        return e0703a;
    }

    public void setE0703a(String e0703a) {
        this.e0703a = e0703a;
        notifyPropertyChanged(BR.e0703a);
    }

    @Bindable
    public String getE0703b() {
        return e0703b;
    }

    public void setE0703b(String e0703b) {
        this.e0703b = e0703b;
        notifyPropertyChanged(BR.e0703b);
    }

    @Bindable
    public String getE0703c() {
        return e0703c;
    }

    public void setE0703c(String e0703c) {
        this.e0703c = e0703c;
        notifyPropertyChanged(BR.e0703c);
    }

    @Bindable
    public String getE0703d() {
        return e0703d;
    }

    public void setE0703d(String e0703d) {
        this.e0703d = e0703d;
        notifyPropertyChanged(BR.e0703d);
    }

    @Bindable
    public String getE0704a() {
        return e0704a;
    }

    public void setE0704a(String e0704a) {
        this.e0704a = e0704a;
        notifyPropertyChanged(BR.e0704a);
    }

    @Bindable
    public String getE0704b() {
        return e0704b;
    }

    public void setE0704b(String e0704b) {
        this.e0704b = e0704b;
        notifyPropertyChanged(BR.e0704b);
    }

    @Bindable
    public String getE0704c() {
        return e0704c;
    }

    public void setE0704c(String e0704c) {
        this.e0704c = e0704c;
        notifyPropertyChanged(BR.e0704c);
    }

    @Bindable
    public String getE0704d() {
        return e0704d;
    }

    public void setE0704d(String e0704d) {
        this.e0704d = e0704d;
        notifyPropertyChanged(BR.e0704d);
    }

    @Bindable
    public String getE0704e() {
        return e0704e;
    }

    public void setE0704e(String e0704e) {
        this.e0704e = e0704e;
        notifyPropertyChanged(BR.e0704e);
    }

    @Bindable
    public String getE0704f() {
        return e0704f;
    }

    public void setE0704f(String e0704f) {
        this.e0704f = e0704f;
        notifyPropertyChanged(BR.e0704f);
    }

    @Bindable
    public String getE0704g() {
        return e0704g;
    }

    public void setE0704g(String e0704g) {
        this.e0704g = e0704g;
        setE0704gxx(e0704g.equals("96") ? this.e0704gxx : "");
        notifyPropertyChanged(BR.e0704g);
    }

    @Bindable
    public String getE0704gxx() {
        return e0704gxx;
    }

    public void setE0704gxx(String e0704gxx) {
        this.e0704gxx = e0704gxx;
        notifyPropertyChanged(BR.e0704gxx);
    }

    @Bindable
    public String getE0705a0a() {
        return e0705a0a;
    }

    public void setE0705a0a(String e0705a0a) {
        this.e0705a0a = e0705a0a;
        setE0705a0ayx(e0705a0a.equals("1") ? this.e0705a0ayx : "");
        notifyPropertyChanged(BR.e0705a0a);
    }

    @Bindable
    public String getE0705a0ayx() {
        return e0705a0ayx;
    }

    public void setE0705a0ayx(String e0705a0ayx) {
        this.e0705a0ayx = e0705a0ayx;
        notifyPropertyChanged(BR.e0705a0ayx);
    }

    @Bindable
    public String getE0705a0f() {
        return e0705a0f;
    }

    public void setE0705a0f(String e0705a0f) {
        this.e0705a0f = e0705a0f;
        setE0705a0fyx(e0705a0f.equals("1") ? this.e0705a0fyx : "");
        notifyPropertyChanged(BR.e0705a0f);
    }

    @Bindable
    public String getE0705a0fyx() {
        return e0705a0fyx;
    }

    public void setE0705a0fyx(String e0705a0fyx) {
        this.e0705a0fyx = e0705a0fyx;
        notifyPropertyChanged(BR.e0705a0fyx);
    }

    @Bindable
    public String getE0705b0a() {
        return e0705b0a;
    }

    public void setE0705b0a(String e0705b0a) {
        this.e0705b0a = e0705b0a;
        setE0705b0ayx(e0705b0a.equals("1") ? this.e0705b0ayx : "");
        notifyPropertyChanged(BR.e0705b0a);
    }

    @Bindable
    public String getE0705b0ayx() {
        return e0705b0ayx;
    }

    public void setE0705b0ayx(String e0705b0ayx) {
        this.e0705b0ayx = e0705b0ayx;
        notifyPropertyChanged(BR.e0705b0ayx);
    }

    @Bindable
    public String getE0705b0f() {
        return e0705b0f;
    }

    public void setE0705b0f(String e0705b0f) {
        this.e0705b0f = e0705b0f;
        setE0705b0fyx(e0705b0f.equals("1") ? this.e0705b0fyx : "");
        notifyPropertyChanged(BR.e0705b0f);
    }

    @Bindable
    public String getE0705b0fyx() {
        return e0705b0fyx;
    }

    public void setE0705b0fyx(String e0705b0fyx) {
        this.e0705b0fyx = e0705b0fyx;
        notifyPropertyChanged(BR.e0705b0fyx);
    }

    @Bindable
    public String getE0705c0a() {
        return e0705c0a;
    }

    public void setE0705c0a(String e0705c0a) {
        this.e0705c0a = e0705c0a;
        setE0705c0ayx(e0705c0a.equals("1") ? this.e0705c0ayx : "");
        notifyPropertyChanged(BR.e0705c0a);
    }

    @Bindable
    public String getE0705c0ayx() {
        return e0705c0ayx;
    }

    public void setE0705c0ayx(String e0705c0ayx) {
        this.e0705c0ayx = e0705c0ayx;
        notifyPropertyChanged(BR.e0705c0ayx);
    }

    @Bindable
    public String getE0705c0f() {
        return e0705c0f;
    }

    public void setE0705c0f(String e0705c0f) {
        this.e0705c0f = e0705c0f;
        setE0705c0fyx(e0705c0f.equals("1") ? this.e0705c0fyx : "");
        notifyPropertyChanged(BR.e0705c0f);
    }

    @Bindable
    public String getE0705c0fyx() {
        return e0705c0fyx;
    }

    public void setE0705c0fyx(String e0705c0fyx) {
        this.e0705c0fyx = e0705c0fyx;
        notifyPropertyChanged(BR.e0705c0fyx);
    }

    @Bindable
    public String getE0705d0a() {
        return e0705d0a;
    }

    public void setE0705d0a(String e0705d0a) {
        this.e0705d0a = e0705d0a;
        setE0705d0ayx(e0705d0a.equals("1") ? this.e0705d0ayx : "");
        notifyPropertyChanged(BR.e0705d0a);
    }

    @Bindable
    public String getE0705d0ayx() {
        return e0705d0ayx;
    }

    public void setE0705d0ayx(String e0705d0ayx) {
        this.e0705d0ayx = e0705d0ayx;
        notifyPropertyChanged(BR.e0705d0ayx);
    }

    @Bindable
    public String getE0705d0f() {
        return e0705d0f;
    }

    public void setE0705d0f(String e0705d0f) {
        this.e0705d0f = e0705d0f;
        setE0705d0fyx(e0705d0f.equals("1") ? this.e0705d0fyx : "");
        notifyPropertyChanged(BR.e0705d0f);
    }

    @Bindable
    public String getE0705d0fyx() {
        return e0705d0fyx;
    }

    public void setE0705d0fyx(String e0705d0fyx) {
        this.e0705d0fyx = e0705d0fyx;
        notifyPropertyChanged(BR.e0705d0fyx);
    }

    @Bindable
    public String getE0705e0a() {
        return e0705e0a;
    }

    public void setE0705e0a(String e0705e0a) {
        this.e0705e0a = e0705e0a;
        setE0705e0ayx(e0705e0a.equals("1") ? this.e0705e0ayx : "");
        notifyPropertyChanged(BR.e0705e0a);
    }

    @Bindable
    public String getE0705e0ayx() {
        return e0705e0ayx;
    }

    public void setE0705e0ayx(String e0705e0ayx) {
        this.e0705e0ayx = e0705e0ayx;
        notifyPropertyChanged(BR.e0705e0ayx);
    }

    @Bindable
    public String getE0705e0f() {
        return e0705e0f;
    }

    public void setE0705e0f(String e0705e0f) {
        this.e0705e0f = e0705e0f;
        setE0705e0fyx(e0705e0f.equals("1") ? this.e0705e0fyx : "");
        notifyPropertyChanged(BR.e0705e0f);
    }

    @Bindable
    public String getE0705e0fyx() {
        return e0705e0fyx;
    }

    public void setE0705e0fyx(String e0705e0fyx) {
        this.e0705e0fyx = e0705e0fyx;
        notifyPropertyChanged(BR.e0705e0fyx);
    }

    @Bindable
    public String getE0801() {
        return e0801;
    }

    public void setE0801(String e0801) {
        this.e0801 = e0801;
        notifyPropertyChanged(BR.e0801);
    }

    @Bindable
    public String getE0802() {
        return e0802;
    }

    public void setE0802(String e0802) {
        this.e0802 = e0802;
        notifyPropertyChanged(BR.e0802);
    }

    @Bindable
    public String getE0803() {
        return e0803;
    }

    public void setE0803(String e0803) {
        this.e0803 = e0803;
        notifyPropertyChanged(BR.e0803);
    }

    @Bindable
    public String getE0804() {
        return e0804;
    }

    public void setE0804(String e0804) {
        this.e0804 = e0804;
        notifyPropertyChanged(BR.e0804);
    }

    @Bindable
    public String getE0805() {
        return e0805;
    }

    public void setE0805(String e0805) {
        this.e0805 = e0805;
        notifyPropertyChanged(BR.e0805);
    }

    @Bindable
    public String getE0806() {
        return e0806;
    }

    public void setE0806(String e0806) {
        this.e0806 = e0806;
        notifyPropertyChanged(BR.e0806);
    }

    @Bindable
    public String getE0807() {
        return e0807;
    }

    public void setE0807(String e0807) {
        this.e0807 = e0807;
        notifyPropertyChanged(BR.e0807);
    }

    @Bindable
    public String getE0808() {
        return e0808;
    }

    public void setE0808(String e0808) {
        this.e0808 = e0808;
        notifyPropertyChanged(BR.e0808);
    }

    @Bindable
    public String getE0809() {
        return e0809;
    }

    public void setE0809(String e0809) {
        this.e0809 = e0809;
        notifyPropertyChanged(BR.e0809);
    }

    @Bindable
    public String getE0810() {
        return e0810;
    }

    public void setE0810(String e0810) {
        this.e0810 = e0810;
        notifyPropertyChanged(BR.e0810);
    }

    @Bindable
    public String getE0811() {
        return e0811;
    }

    public void setE0811(String e0811) {
        this.e0811 = e0811;
        notifyPropertyChanged(BR.e0811);
    }

    @Bindable
    public String getE0812() {
        return e0812;
    }

    public void setE0812(String e0812) {
        this.e0812 = e0812;
        notifyPropertyChanged(BR.e0812);
    }

    @Bindable
    public String getE0813() {
        return e0813;
    }

    public void setE0813(String e0813) {
        this.e0813 = e0813;
        notifyPropertyChanged(BR.e0813);
    }

    @Bindable
    public String getE0814() {
        return e0814;
    }

    public void setE0814(String e0814) {
        this.e0814 = e0814;
        notifyPropertyChanged(BR.e0814);
    }


    public ModuleE Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_UUID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SYNCED_DATE));
        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE1)));
        sE2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE2)));
        sE31Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE31)));
        sE32Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE32)));
        sE33Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE33)));
        sE4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE4)));
        sE5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE5)));
        sE6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE6)));
        sE7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE7)));
        sE8Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleETable.COLUMN_SE8)));
        return this;
    }

    public void sE1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e0101 = json.getString("e0101");
            this.e0102a = json.getString("e0102a");
            this.e0102b = json.getString("e0102b");
            this.e0102c = json.getString("e0102c");
            this.e0102d = json.getString("e0102d");
            this.e0102e = json.getString("e0102e");
            this.e0102f = json.getString("e0102f");
            this.e0102g = json.getString("e0102g");
            this.e0102h = json.getString("e0102h");
            this.e0102i = json.getString("e0102i");
            this.e0102j = json.getString("e0102j");
            this.e0103a = json.getString("e0103a");
            this.e0103b = json.getString("e0103b");
            this.e0104a = json.getString("e0104a");
            this.e0104b = json.getString("e0104b");
            this.e0104c = json.getString("e0104c");
            this.e0104d = json.getString("e0104d");
            this.e0104e = json.getString("e0104e");
            this.e0104exx = json.getString("e0104exx");
        }
    }

    public void sE2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e0201 = json.getString("e0201");
            this.e0202a = json.getString("e0202a");
            this.e0202b = json.getString("e0202b");
            this.e0202c = json.getString("e0202c");
            this.e0202d = json.getString("e0202d");
            this.e0202e = json.getString("e0202e");
            this.e0202f = json.getString("e0202f");
            this.e0203a = json.getString("e0203a");
            this.e0203b = json.getString("e0203b");
            this.e0204a = json.getString("e0204a");
            this.e0204b = json.getString("e0204b");
            this.e0204c = json.getString("e0204c");
            this.e0204d = json.getString("e0204d");
            this.e0204dxx = json.getString("e0204dxx");
        }
    }

    public void sE31Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE31Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e0301 = json.getString("e0301");
            this.e0302a = json.getString("e0302a");
            this.e0302b = json.getString("e0302b");
            this.e0302c = json.getString("e0302c");
            this.e0302d = json.getString("e0302d");
            this.e0302e = json.getString("e0302e");
            this.e0303a = json.getString("e0303a");
            this.e0303b = json.getString("e0303b");
            this.e0303c = json.getString("e0303c");
            this.e0303d = json.getString("e0303d");
            this.e0303e = json.getString("e0303e");
            this.e0303f = json.getString("e0303f");
            this.e0303g = json.getString("e0303g");
            this.e0303h = json.getString("e0303h");
            this.e0303i = json.getString("e0303i");
            this.e0303j = json.getString("e0303j");
            this.e0303k = json.getString("e0303k");
            this.e0303l = json.getString("e0303l");
            this.e0303m = json.getString("e0303m");
            this.e0303n = json.getString("e0303n");
            this.e0304a = json.getString("e0304a");
            this.e0304b = json.getString("e0304b");
            this.e0304c = json.getString("e0304c");
            this.e0304d = json.getString("e0304d");
            this.e0305a = json.getString("e0305a");
            this.e0305b = json.getString("e0305b");
            this.e0305c = json.getString("e0305c");
            this.e0305d = json.getString("e0305d");
            this.e0305e = json.getString("e0305e");
            this.e0305exx = json.getString("e0305exx");
        }
    }

    public void sE32Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE32Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e306011 = json.getString("e306011");
            this.e306011q = json.getString("e306011q");
            this.e306012 = json.getString("e306012");
            this.e306012q = json.getString("e306012q");
            this.e306021 = json.getString("e306021");
            this.e306021q = json.getString("e306021q");
            this.e306022 = json.getString("e306022");
            this.e306022q = json.getString("e306022q");
            this.e306031 = json.getString("e306031");
            this.e306031q = json.getString("e306031q");
            this.e306032 = json.getString("e306032");
            this.e306032q = json.getString("e306032q");
            this.e306041 = json.getString("e306041");
            this.e306041q = json.getString("e306041q");
            this.e306042 = json.getString("e306042");
            this.e306042q = json.getString("e306042q");
            this.e306051 = json.getString("e306051");
            this.e306051q = json.getString("e306051q");
            this.e306052 = json.getString("e306052");
            this.e306052q = json.getString("e306052q");
            this.e306061 = json.getString("e306061");
            this.e306061q = json.getString("e306061q");
            this.e306062 = json.getString("e306062");
            this.e306062q = json.getString("e306062q");
            this.e306071 = json.getString("e306071");
            this.e306071q = json.getString("e306071q");
            this.e306072 = json.getString("e306072");
            this.e306072q = json.getString("e306072q");
            this.e306081 = json.getString("e306081");
            this.e306081q = json.getString("e306081q");
            this.e306082 = json.getString("e306082");
            this.e306082q = json.getString("e306082q");
            this.e306091 = json.getString("e306091");
            this.e306091q = json.getString("e306091q");
            this.e306092 = json.getString("e306092");
            this.e306092q = json.getString("e306092q");
            this.e306101 = json.getString("e306101");
            this.e306101q = json.getString("e306101q");
            this.e306102 = json.getString("e306102");
            this.e306102q = json.getString("e306102q");
        }
    }

    public void sE33Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE33Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e306111 = json.getString("e306111");
            this.e306111q = json.getString("e306111q");
            this.e306112 = json.getString("e306112");
            this.e306112q = json.getString("e306112q");
            this.e306121 = json.getString("e306121");
            this.e306121q = json.getString("e306121q");
            this.e306122 = json.getString("e306122");
            this.e306122q = json.getString("e306122q");
            this.e306131 = json.getString("e306131");
            this.e306131q = json.getString("e306131q");
            this.e306132 = json.getString("e306132");
            this.e306132q = json.getString("e306132q");
            this.e306141 = json.getString("e306141");
            this.e306141q = json.getString("e306141q");
            this.e306142 = json.getString("e306142");
            this.e306142q = json.getString("e306142q");
            this.e306151 = json.getString("e306151");
            this.e306151q = json.getString("e306151q");
            this.e306152 = json.getString("e306152");
            this.e306152q = json.getString("e306152q");
            this.e306161 = json.getString("e306161");
            this.e306161q = json.getString("e306161q");
            this.e306162 = json.getString("e306162");
            this.e306162q = json.getString("e306162q");
            this.e306171 = json.getString("e306171");
            this.e306171q = json.getString("e306171q");
            this.e306172 = json.getString("e306172");
            this.e306172q = json.getString("e306172q");
            this.e306181 = json.getString("e306181");
            this.e306181q = json.getString("e306181q");
            this.e306182 = json.getString("e306182");
            this.e306182q = json.getString("e306182q");
            this.e0307 = json.getString("e0307");
            this.e0308 = json.getString("e0308");
        }
    }

    public void sE4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e401 = json.getString("e401");
            this.e402 = json.getString("e402");
            this.e403a = json.getString("e403a");
            this.e403b = json.getString("e403b");
            this.e403c = json.getString("e403c");
            this.e404a = json.getString("e404a");
            this.e404b = json.getString("e404b");
            this.e404c = json.getString("e404c");
            this.e404d = json.getString("e404d");
            this.e404e = json.getString("e404e");
            this.e404f = json.getString("e404f");
            this.e404g = json.getString("e404g");
            this.e404h = json.getString("e404h");
            this.e405a = json.getString("e405a");
            this.e405b = json.getString("e405b");
            this.e405c = json.getString("e405c");
            this.e405d = json.getString("e405d");
            this.e405e = json.getString("e405e");
            this.e405f = json.getString("e405f");
            this.e405g = json.getString("e405g");
            this.e405h = json.getString("e405h");
            this.e406 = json.getString("e406");
            this.e407a = json.getString("e407a");
            this.e407b = json.getString("e407b");
            this.e407c = json.getString("e407c");
            this.e407d = json.getString("e407d");
            this.e408 = json.getString("e408");
            this.e409 = json.getString("e409");
            this.e40996x = json.getString("e40996x");
            this.e410a = json.getString("e410a");
            this.e410b = json.getString("e410b");
            this.e410c = json.getString("e410c");
            this.e410d = json.getString("e410d");
            this.e410e = json.getString("e410e");
            this.e410f = json.getString("e410f");
            this.e411 = json.getString("e411");
            this.e412 = json.getString("e412");
            this.e412a = json.getString("e412a");
            this.e412b = json.getString("e412b");
            this.e412c = json.getString("e412c");
            this.e412d = json.getString("e412d");
            this.e413 = json.getString("e413");
            this.e414 = json.getString("e414");
            this.e415 = json.getString("e415");
            this.e416 = json.getString("e416");
        }
    }

    public void sE5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e0501 = json.getString("e0501");
            this.e0502a = json.getString("e0502a");
            this.e0502b = json.getString("e0502b");
            this.e0502c = json.getString("e0502c");
            this.e0502d = json.getString("e0502d");
            this.e0502e = json.getString("e0502e");
            this.e0502f = json.getString("e0502f");
            this.e0502g = json.getString("e0502g");
            this.e0502h = json.getString("e0502h");
            this.e0502i = json.getString("e0502i");
            this.e0503 = json.getString("e0503");
            this.e0504 = json.getString("e0504");
            this.e0505 = json.getString("e0505");
            this.e0506 = json.getString("e0506");
            this.e0507 = json.getString("e0507");
            this.e0508 = json.getString("e0508");
            this.e0509 = json.getString("e0509");
        }
    }

    public void sE6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e0601 = json.getString("e0601");
            this.e0602 = json.getString("e0602");
            this.e0603 = json.getString("e0603");
            this.e0604 = json.getString("e0604");
            this.e0605a = json.getString("e0605a");
            this.e0605b = json.getString("e0605b");
            this.e0605c = json.getString("e0605c");
            this.e0605d = json.getString("e0605d");
            this.e0606 = json.getString("e0606");
            this.e0607 = json.getString("e0607");
            this.e0608 = json.getString("e0608");
            this.e0609 = json.getString("e0609");
            this.e0610 = json.getString("e0610");
            this.e0611 = json.getString("e0611");
        }
    }

    public void sE7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e0701 = json.getString("e0701");
            this.e0702a = json.getString("e0702a");
            this.e0702b = json.getString("e0702b");
            this.e0702c = json.getString("e0702c");
            this.e0702d = json.getString("e0702d");
            this.e0702e = json.getString("e0702e");
            this.e0702f = json.getString("e0702f");
            this.e0702g = json.getString("e0702g");
            this.e0702h = json.getString("e0702h");
            this.e0702i = json.getString("e0702i");
            this.e0702j = json.getString("e0702j");
            this.e0702k = json.getString("e0702k");
            this.e0702l = json.getString("e0702l");
            this.e0703a = json.getString("e0703a");
            this.e0703b = json.getString("e0703b");
            this.e0703c = json.getString("e0703c");
            this.e0703d = json.getString("e0703d");
            this.e0704a = json.getString("e0704a");
            this.e0704b = json.getString("e0704b");
            this.e0704c = json.getString("e0704c");
            this.e0704d = json.getString("e0704d");
            this.e0704e = json.getString("e0704e");
            this.e0704f = json.getString("e0704f");
            this.e0704g = json.getString("e0704g");
            this.e0704gxx = json.getString("e0704gxx");
            this.e0705a0a = json.getString("e0705a0a");
            this.e0705a0ayx = json.getString("e0705a0ayx");
            this.e0705a0f = json.getString("e0705a0f");
            this.e0705a0fyx = json.getString("e0705a0fyx");
            this.e0705b0a = json.getString("e0705b0a");
            this.e0705b0ayx = json.getString("e0705b0ayx");
            this.e0705b0f = json.getString("e0705b0f");
            this.e0705b0fyx = json.getString("e0705b0fyx");
            this.e0705c0a = json.getString("e0705c0a");
            this.e0705c0ayx = json.getString("e0705c0ayx");
            this.e0705c0f = json.getString("e0705c0f");
            this.e0705c0fyx = json.getString("e0705c0fyx");
            this.e0705d0a = json.getString("e0705d0a");
            this.e0705d0ayx = json.getString("e0705d0ayx");
            this.e0705d0f = json.getString("e0705d0f");
            this.e0705d0fyx = json.getString("e0705d0fyx");
            this.e0705e0a = json.getString("e0705e0a");
            this.e0705e0ayx = json.getString("e0705e0ayx");
            this.e0705e0f = json.getString("e0705e0f");
            this.e0705e0fyx = json.getString("e0705e0fyx");
        }
    }

    public void sE8Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE8Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e0801 = json.getString("e0801");
            this.e0802 = json.getString("e0802");
            this.e0803 = json.getString("e0803");
            this.e0804 = json.getString("e0804");
            this.e0805 = json.getString("e0805");
            this.e0806 = json.getString("e0806");
            this.e0807 = json.getString("e0807");
            this.e0808 = json.getString("e0808");
            this.e0809 = json.getString("e0809");
            this.e0810 = json.getString("e0810");
            this.e0811 = json.getString("e0811");
            this.e0812 = json.getString("e0812");
            this.e0813 = json.getString("e0813");
            this.e0814 = json.getString("e0814");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(ModuleETable.COLUMN_ID, this.id);
        json.put(ModuleETable.COLUMN_UID, this.uid);
        json.put(ModuleETable.COLUMN_UUID, this.uuid);
        json.put(ModuleETable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(ModuleETable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(ModuleETable.COLUMN_UC_CODE, this.ucCode);
        json.put(ModuleETable.COLUMN_HF_CODE, this.hfCode);
        json.put(ModuleETable.COLUMN_USERNAME, this.userName);
        json.put(ModuleETable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleETable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleETable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleETable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleETable.COLUMN_SYNCED, this.synced);
        json.put(ModuleETable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleETable.COLUMN_SE1, new JSONObject(sE1toString()));
        json.put(ModuleETable.COLUMN_SE2, new JSONObject(sE2toString()));
        json.put(ModuleETable.COLUMN_SE31, new JSONObject(sE31toString()));
        json.put(ModuleETable.COLUMN_SE32, new JSONObject(sE32toString()));
        json.put(ModuleETable.COLUMN_SE33, new JSONObject(sE33toString()));
        json.put(ModuleETable.COLUMN_SE4, new JSONObject(sE4toString()));
        json.put(ModuleETable.COLUMN_SE5, new JSONObject(sE5toString()));
        json.put(ModuleETable.COLUMN_SE6, new JSONObject(sE6toString()));
        json.put(ModuleETable.COLUMN_SE7, new JSONObject(sE7toString()));
        json.put(ModuleETable.COLUMN_SE8, new JSONObject(sE8toString()));
        return json;
    }

    public String sE1toString() throws JSONException {
        Log.d(TAG, "sE1toString: ");
        JSONObject json = new JSONObject();
        json.put("e0101", e0101)
                .put("e0102a", e0102a)
                .put("e0102b", e0102b)
                .put("e0102c", e0102c)
                .put("e0102d", e0102d)
                .put("e0102e", e0102e)
                .put("e0102f", e0102f)
                .put("e0102g", e0102g)
                .put("e0102h", e0102h)
                .put("e0102i", e0102i)
                .put("e0102j", e0102j)
                .put("e0103a", e0103a)
                .put("e0103b", e0103b)
                .put("e0104a", e0104a)
                .put("e0104b", e0104b)
                .put("e0104c", e0104c)
                .put("e0104d", e0104d)
                .put("e0104e", e0104e)
                .put("e0104exx", e0104exx);
        return json.toString();
    }

    public String sE2toString() throws JSONException {
        Log.d(TAG, "sE2toString: ");
        JSONObject json = new JSONObject();
        json.put("e0201", e0201)
                .put("e0202a", e0202a)
                .put("e0202b", e0202b)
                .put("e0202c", e0202c)
                .put("e0202d", e0202d)
                .put("e0202e", e0202e)
                .put("e0202f", e0202f)
                .put("e0203a", e0203a)
                .put("e0203b", e0203b)
                .put("e0204a", e0204a)
                .put("e0204b", e0204b)
                .put("e0204c", e0204c)
                .put("e0204d", e0204d)
                .put("e0204dxx", e0204dxx);
        return json.toString();
    }

    public String sE31toString() throws JSONException {
        Log.d(TAG, "sE31toString: ");
        JSONObject json = new JSONObject();
        json.put("e0301", e0301)
                .put("e0302a", e0302a)
                .put("e0302b", e0302b)
                .put("e0302c", e0302c)
                .put("e0302d", e0302d)
                .put("e0302e", e0302e)
                .put("e0303a", e0303a)
                .put("e0303b", e0303b)
                .put("e0303c", e0303c)
                .put("e0303d", e0303d)
                .put("e0303e", e0303e)
                .put("e0303f", e0303f)
                .put("e0303g", e0303g)
                .put("e0303h", e0303h)
                .put("e0303i", e0303i)
                .put("e0303j", e0303j)
                .put("e0303k", e0303k)
                .put("e0303l", e0303l)
                .put("e0303m", e0303m)
                .put("e0303n", e0303n)
                .put("e0304a", e0304a)
                .put("e0304b", e0304b)
                .put("e0304c", e0304c)
                .put("e0304d", e0304d)
                .put("e0305a", e0305a)
                .put("e0305b", e0305b)
                .put("e0305c", e0305c)
                .put("e0305d", e0305d)
                .put("e0305e", e0305e)
                .put("e0305exx", e0305exx);
        return json.toString();
    }

    public String sE32toString() throws JSONException {
        Log.d(TAG, "sE32toString: ");
        JSONObject json = new JSONObject();
        json.put("e306011", e306011)
                .put("e306011q", e306011q)
                .put("e306012", e306012)
                .put("e306012q", e306012q)
                .put("e306021", e306021)
                .put("e306021q", e306021q)
                .put("e306022", e306022)
                .put("e306022q", e306022q)
                .put("e306031", e306031)
                .put("e306031q", e306031q)
                .put("e306032", e306032)
                .put("e306032q", e306032q)
                .put("e306041", e306041)
                .put("e306041q", e306041q)
                .put("e306042", e306042)
                .put("e306042q", e306042q)
                .put("e306051", e306051)
                .put("e306051q", e306051q)
                .put("e306052", e306052)
                .put("e306052q", e306052q)
                .put("e306061", e306061)
                .put("e306061q", e306061q)
                .put("e306062", e306062)
                .put("e306062q", e306062q)
                .put("e306071", e306071)
                .put("e306071q", e306071q)
                .put("e306072", e306072)
                .put("e306072q", e306072q)
                .put("e306081", e306081)
                .put("e306081q", e306081q)
                .put("e306082", e306082)
                .put("e306082q", e306082q)
                .put("e306091", e306091)
                .put("e306091q", e306091q)
                .put("e306092", e306092)
                .put("e306092q", e306092q)
                .put("e306101", e306101)
                .put("e306101q", e306101q)
                .put("e306102", e306102)
                .put("e306102q", e306102q);
        return json.toString();
    }

    public String sE33toString() throws JSONException {
        Log.d(TAG, "sE33toString: ");
        JSONObject json = new JSONObject();
        json.put("e306111", e306111)
                .put("e306111q", e306111q)
                .put("e306112", e306112)
                .put("e306112q", e306112q)
                .put("e306121", e306121)
                .put("e306121q", e306121q)
                .put("e306122", e306122)
                .put("e306122q", e306122q)
                .put("e306131", e306131)
                .put("e306131q", e306131q)
                .put("e306132", e306132)
                .put("e306132q", e306132q)
                .put("e306141", e306141)
                .put("e306141q", e306141q)
                .put("e306142", e306142)
                .put("e306142q", e306142q)
                .put("e306151", e306151)
                .put("e306151q", e306151q)
                .put("e306152", e306152)
                .put("e306152q", e306152q)
                .put("e306161", e306161)
                .put("e306161q", e306161q)
                .put("e306162", e306162)
                .put("e306162q", e306162q)
                .put("e306171", e306171)
                .put("e306171q", e306171q)
                .put("e306172", e306172)
                .put("e306172q", e306172q)
                .put("e306181", e306181)
                .put("e306181q", e306181q)
                .put("e306182", e306182)
                .put("e306182q", e306182q)
                .put("e0307", e0307)
                .put("e0308", e0308);
        return json.toString();
    }

    public String sE4toString() throws JSONException {
        Log.d(TAG, "sE4toString: ");
        JSONObject json = new JSONObject();
        json.put("e401", e401)
                .put("e402", e402)
                .put("e403a", e403a)
                .put("e403b", e403b)
                .put("e403c", e403c)
                .put("e404a", e404a)
                .put("e404b", e404b)
                .put("e404c", e404c)
                .put("e404d", e404d)
                .put("e404e", e404e)
                .put("e404f", e404f)
                .put("e404g", e404g)
                .put("e404h", e404h)
                .put("e405a", e405a)
                .put("e405b", e405b)
                .put("e405c", e405c)
                .put("e405d", e405d)
                .put("e405e", e405e)
                .put("e405f", e405f)
                .put("e405g", e405g)
                .put("e405h", e405h)
                .put("e406", e406)
                .put("e407a", e407a)
                .put("e407b", e407b)
                .put("e407c", e407c)
                .put("e407d", e407d)
                .put("e408", e408)
                .put("e409", e409)
                .put("e40996x", e40996x)
                .put("e410a", e410a)
                .put("e410b", e410b)
                .put("e410c", e410c)
                .put("e410d", e410d)
                .put("e410e", e410e)
                .put("e410f", e410f)
                .put("e411", e411)
                .put("e412", e412)
                .put("e412a", e412a)
                .put("e412b", e412b)
                .put("e412c", e412c)
                .put("e412d", e412d)
                .put("e413", e413)
                .put("e414", e414)
                .put("e415", e415)
                .put("e416", e416);
        return json.toString();
    }

    public String sE5toString() throws JSONException {
        Log.d(TAG, "sE5toString: ");
        JSONObject json = new JSONObject();
        json.put("e0501", e0501)
                .put("e0502a", e0502a)
                .put("e0502b", e0502b)
                .put("e0502c", e0502c)
                .put("e0502d", e0502d)
                .put("e0502e", e0502e)
                .put("e0502f", e0502f)
                .put("e0502g", e0502g)
                .put("e0502h", e0502h)
                .put("e0502i", e0502i)
                .put("e0503", e0503)
                .put("e0504", e0504)
                .put("e0505", e0505)
                .put("e0506", e0506)
                .put("e0507", e0507)
                .put("e0508", e0508)
                .put("e0509", e0509);
        return json.toString();
    }

    public String sE6toString() throws JSONException {
        Log.d(TAG, "sE6toString: ");
        JSONObject json = new JSONObject();
        json.put("e0601", e0601)
                .put("e0602", e0602)
                .put("e0603", e0603)
                .put("e0604", e0604)
                .put("e0605a", e0605a)
                .put("e0605b", e0605b)
                .put("e0605c", e0605c)
                .put("e0605d", e0605d)
                .put("e0606", e0606)
                .put("e0607", e0607)
                .put("e0608", e0608)
                .put("e0609", e0609)
                .put("e0610", e0610)
                .put("e0611", e0611);
        return json.toString();
    }

    public String sE7toString() throws JSONException {
        Log.d(TAG, "sE7toString: ");
        JSONObject json = new JSONObject();
        json.put("e0701", e0701)
                .put("e0702a", e0702a)
                .put("e0702b", e0702b)
                .put("e0702c", e0702c)
                .put("e0702d", e0702d)
                .put("e0702e", e0702e)
                .put("e0702f", e0702f)
                .put("e0702g", e0702g)
                .put("e0702h", e0702h)
                .put("e0702i", e0702i)
                .put("e0702j", e0702j)
                .put("e0702k", e0702k)
                .put("e0702l", e0702l)
                .put("e0703a", e0703a)
                .put("e0703b", e0703b)
                .put("e0703c", e0703c)
                .put("e0703d", e0703d)
                .put("e0704a", e0704a)
                .put("e0704b", e0704b)
                .put("e0704c", e0704c)
                .put("e0704d", e0704d)
                .put("e0704e", e0704e)
                .put("e0704f", e0704f)
                .put("e0704g", e0704g)
                .put("e0704gxx", e0704gxx)
                .put("e0705a0a", e0705a0a)
                .put("e0705a0ayx", e0705a0ayx)
                .put("e0705a0f", e0705a0f)
                .put("e0705a0fyx", e0705a0fyx)
                .put("e0705b0a", e0705b0a)
                .put("e0705b0ayx", e0705b0ayx)
                .put("e0705b0f", e0705b0f)
                .put("e0705b0fyx", e0705b0fyx)
                .put("e0705c0a", e0705c0a)
                .put("e0705c0ayx", e0705c0ayx)
                .put("e0705c0f", e0705c0f)
                .put("e0705c0fyx", e0705c0fyx)
                .put("e0705d0a", e0705d0a)
                .put("e0705d0ayx", e0705d0ayx)
                .put("e0705d0f", e0705d0f)
                .put("e0705d0fyx", e0705d0fyx)
                .put("e0705e0a", e0705e0a)
                .put("e0705e0ayx", e0705e0ayx)
                .put("e0705e0f", e0705e0f)
                .put("e0705e0fyx", e0705e0fyx);
        return json.toString();
    }

    public String sE8toString() throws JSONException {
        Log.d(TAG, "sE8toString: ");
        JSONObject json = new JSONObject();
        json.put("e0801", e0801)
                .put("e0802", e0802)
                .put("e0803", e0803)
                .put("e0804", e0804)
                .put("e0805", e0805)
                .put("e0806", e0806)
                .put("e0807", e0807)
                .put("e0808", e0808)
                .put("e0809", e0809)
                .put("e0810", e0810)
                .put("e0811", e0811)
                .put("e0812", e0812)
                .put("e0813", e0813)
                .put("e0814", e0814);
        return json.toString();
    }


}
