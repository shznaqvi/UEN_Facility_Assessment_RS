package edu.aku.hassannaqvi.uen_facility_assessment.models;

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
    private String e0306a0a = _EMPTY_;
    private String e0306a0ayx = _EMPTY_;
    private String e0306a0f = _EMPTY_;
    private String e0306a0fyx = _EMPTY_;
    private String e0306b0a = _EMPTY_;
    private String e0306b0ayx = _EMPTY_;
    private String e0306b0f = _EMPTY_;
    private String e0306b0fyx = _EMPTY_;
    private String e0306c0a = _EMPTY_;
    private String e0306c0ayx = _EMPTY_;
    private String e0306c0f = _EMPTY_;
    private String e0306c0fyx = _EMPTY_;
    private String e0306d0a = _EMPTY_;
    private String e0306d0ayx = _EMPTY_;
    private String e0306d0f = _EMPTY_;
    private String e0306d0fyx = _EMPTY_;
    private String e0306e0a = _EMPTY_;
    private String e0306e0ayx = _EMPTY_;
    private String e0306e0f = _EMPTY_;
    private String e0306e0fyx = _EMPTY_;
    private String e0306f0a = _EMPTY_;
    private String e0306f0ayx = _EMPTY_;
    private String e0306f0f = _EMPTY_;
    private String e0306f0fyx = _EMPTY_;
    private String e0306g0a = _EMPTY_;
    private String e0306g0ayx = _EMPTY_;
    private String e0306g0f = _EMPTY_;
    private String e0306g0fyx = _EMPTY_;
    private String e0306h0a = _EMPTY_;
    private String e0306h0ayx = _EMPTY_;
    private String e0306h0f = _EMPTY_;
    private String e0306h0fyx = _EMPTY_;
    private String e0306i0a = _EMPTY_;
    private String e0306i0ayx = _EMPTY_;
    private String e0306i0f = _EMPTY_;
    private String e0306i0fyx = _EMPTY_;
    private String e0306j0a = _EMPTY_;
    private String e0306j0ayx = _EMPTY_;
    private String e0306j0f = _EMPTY_;
    private String e0306j0fyx = _EMPTY_;
    private String e0306k0a = _EMPTY_;
    private String e0306k0ayx = _EMPTY_;
    private String e0306k0f = _EMPTY_;
    private String e0306k0fyx = _EMPTY_;
    private String e0306l0a = _EMPTY_;
    private String e0306l0ayx = _EMPTY_;
    private String e0306l0f = _EMPTY_;
    private String e0306l0fyx = _EMPTY_;
    private String e0306m0a = _EMPTY_;
    private String e0306m0ayx = _EMPTY_;
    private String e0306m0f = _EMPTY_;
    private String e0306m0fyx = _EMPTY_;
    private String e0306n0a = _EMPTY_;
    private String e0306n0ayx = _EMPTY_;
    private String e0306n0f = _EMPTY_;
    private String e0306n0fyx = _EMPTY_;
    private String e0306o0a = _EMPTY_;
    private String e0306o0ayx = _EMPTY_;
    private String e0306o0f = _EMPTY_;
    private String e0306o0fyx = _EMPTY_;
    private String e0306p0a = _EMPTY_;
    private String e0306p0ayx = _EMPTY_;
    private String e0306p0f = _EMPTY_;
    private String e0306p0fyx = _EMPTY_;
    private String e0306q0a = _EMPTY_;
    private String e0306q0ayx = _EMPTY_;
    private String e0306q0f = _EMPTY_;
    private String e0306q0fyx = _EMPTY_;
    private String e0306r0a = _EMPTY_;
    private String e0306r0ayx = _EMPTY_;
    private String e0306r0f = _EMPTY_;
    private String e0306r0fyx = _EMPTY_;
    private String e0307 = _EMPTY_;
    private String e0308 = _EMPTY_;
    private String e0401 = _EMPTY_;
    private String e0402 = _EMPTY_;
    private String e0403a = _EMPTY_;
    private String e0403b = _EMPTY_;
    private String e0403c = _EMPTY_;
    private String e0404 = _EMPTY_;
    private String e0405 = _EMPTY_;
    private String e0406 = _EMPTY_;
    private String e0407a = _EMPTY_;
    private String e0407b = _EMPTY_;
    private String e0407c = _EMPTY_;
    private String e0407d = _EMPTY_;
    private String e0408 = _EMPTY_;
    private String e0409 = _EMPTY_;
    private String e0409xx = _EMPTY_;
    private String e0410a = _EMPTY_;
    private String e0410b = _EMPTY_;
    private String e0410c = _EMPTY_;
    private String e0410d = _EMPTY_;
    private String e0410e = _EMPTY_;
    private String e0410f = _EMPTY_;
    private String e0411 = _EMPTY_;
    private String e0412 = _EMPTY_;
    private String e0413 = _EMPTY_;
    private String e0414 = _EMPTY_;
    private String e0415 = _EMPTY_;
    private String e0416 = _EMPTY_;
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
    public String getE0101() {
        return e0101;
    }

    public void setE0101(String e0101) {
        this.e0101 = e0101;
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
        notifyPropertyChanged(BR.e0104a);
    }

    @Bindable
    public String getE0104b() {
        return e0104b;
    }

    public void setE0104b(String e0104b) {
        this.e0104b = e0104b;
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
        notifyPropertyChanged(BR.e0305a);
    }

    @Bindable
    public String getE0305b() {
        return e0305b;
    }

    public void setE0305b(String e0305b) {
        this.e0305b = e0305b;
        notifyPropertyChanged(BR.e0305b);
    }

    @Bindable
    public String getE0305c() {
        return e0305c;
    }

    public void setE0305c(String e0305c) {
        this.e0305c = e0305c;
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
    public String getE0306a0a() {
        return e0306a0a;
    }

    public void setE0306a0a(String e0306a0a) {
        this.e0306a0a = e0306a0a;
        setE0306a0ayx(e0306a0a.equals("3") ? this.e0306a0ayx : "");

        notifyPropertyChanged(BR.e0306a0a);
    }

    @Bindable
    public String getE0306a0ayx() {
        return e0306a0ayx;
    }

    public void setE0306a0ayx(String e0306a0ayx) {
        this.e0306a0ayx = e0306a0ayx;
        notifyPropertyChanged(BR.e0306a0ayx);
    }

    @Bindable
    public String getE0306a0f() {
        return e0306a0f;
    }

    public void setE0306a0f(String e0306a0f) {
        this.e0306a0f = e0306a0f;
        setE0306a0fyx(e0306a0f.equals("3") ? this.e0306a0fyx : "");
        notifyPropertyChanged(BR.e0306a0f);
    }

    @Bindable
    public String getE0306a0fyx() {
        return e0306a0fyx;
    }

    public void setE0306a0fyx(String e0306a0fyx) {
        this.e0306a0fyx = e0306a0fyx;
        notifyPropertyChanged(BR.e0306a0fyx);
    }

    @Bindable
    public String getE0306b0a() {
        return e0306b0a;
    }

    public void setE0306b0a(String e0306b0a) {
        this.e0306b0a = e0306b0a;
        setE0306b0ayx(e0306b0a.equals("3") ? this.e0306b0ayx : "");
        notifyPropertyChanged(BR.e0306b0a);
    }

    @Bindable
    public String getE0306b0ayx() {
        return e0306b0ayx;
    }

    public void setE0306b0ayx(String e0306b0ayx) {
        this.e0306b0ayx = e0306b0ayx;
        notifyPropertyChanged(BR.e0306b0ayx);
    }

    @Bindable
    public String getE0306b0f() {
        return e0306b0f;
    }

    public void setE0306b0f(String e0306b0f) {
        this.e0306b0f = e0306b0f;
        setE0306b0fyx(e0306b0f.equals("3") ? this.e0306b0fyx : "");
        notifyPropertyChanged(BR.e0306b0f);
    }

    @Bindable
    public String getE0306b0fyx() {
        return e0306b0fyx;
    }

    public void setE0306b0fyx(String e0306b0fyx) {
        this.e0306b0fyx = e0306b0fyx;
        notifyPropertyChanged(BR.e0306b0fyx);
    }

    @Bindable
    public String getE0306c0a() {
        return e0306c0a;
    }

    public void setE0306c0a(String e0306c0a) {
        this.e0306c0a = e0306c0a;
        setE0306c0ayx(e0306c0a.equals("3") ? this.e0306c0ayx : "");
        notifyPropertyChanged(BR.e0306c0a);
    }

    @Bindable
    public String getE0306c0ayx() {
        return e0306c0ayx;
    }

    public void setE0306c0ayx(String e0306c0ayx) {
        this.e0306c0ayx = e0306c0ayx;
        notifyPropertyChanged(BR.e0306c0ayx);
    }

    @Bindable
    public String getE0306c0f() {
        return e0306c0f;
    }

    public void setE0306c0f(String e0306c0f) {
        this.e0306c0f = e0306c0f;
        setE0306c0fyx(e0306c0f.equals("3") ? this.e0306c0fyx : "");
        notifyPropertyChanged(BR.e0306c0f);
    }

    @Bindable
    public String getE0306c0fyx() {
        return e0306c0fyx;
    }

    public void setE0306c0fyx(String e0306c0fyx) {
        this.e0306c0fyx = e0306c0fyx;
        notifyPropertyChanged(BR.e0306c0fyx);
    }

    @Bindable
    public String getE0306d0a() {
        return e0306d0a;
    }

    public void setE0306d0a(String e0306d0a) {
        this.e0306d0a = e0306d0a;
        setE0306d0ayx(e0306d0a.equals("3") ? this.e0306d0ayx : "");
        notifyPropertyChanged(BR.e0306d0a);
    }

    @Bindable
    public String getE0306d0ayx() {
        return e0306d0ayx;
    }

    public void setE0306d0ayx(String e0306d0ayx) {
        this.e0306d0ayx = e0306d0ayx;
        notifyPropertyChanged(BR.e0306d0ayx);
    }

    @Bindable
    public String getE0306d0f() {
        return e0306d0f;
    }

    public void setE0306d0f(String e0306d0f) {
        this.e0306d0f = e0306d0f;
        setE0306d0fyx(e0306d0f.equals("3") ? this.e0306d0fyx : "");
        notifyPropertyChanged(BR.e0306d0f);
    }

    @Bindable
    public String getE0306d0fyx() {
        return e0306d0fyx;
    }

    public void setE0306d0fyx(String e0306d0fyx) {
        this.e0306d0fyx = e0306d0fyx;
        notifyPropertyChanged(BR.e0306d0fyx);
    }

    @Bindable
    public String getE0306e0a() {
        return e0306e0a;
    }

    public void setE0306e0a(String e0306e0a) {
        this.e0306e0a = e0306e0a;
        setE0306e0ayx(e0306e0a.equals("3") ? this.e0306e0ayx : "");
        notifyPropertyChanged(BR.e0306e0a);
    }

    @Bindable
    public String getE0306e0ayx() {
        return e0306e0ayx;
    }

    public void setE0306e0ayx(String e0306e0ayx) {
        this.e0306e0ayx = e0306e0ayx;
        notifyPropertyChanged(BR.e0306e0ayx);
    }

    @Bindable
    public String getE0306e0f() {
        return e0306e0f;
    }

    public void setE0306e0f(String e0306e0f) {
        this.e0306e0f = e0306e0f;
        setE0306e0fyx(e0306e0f.equals("3") ? this.e0306e0fyx : "");
        notifyPropertyChanged(BR.e0306e0f);
    }

    @Bindable
    public String getE0306e0fyx() {
        return e0306e0fyx;
    }

    public void setE0306e0fyx(String e0306e0fyx) {
        this.e0306e0fyx = e0306e0fyx;
        notifyPropertyChanged(BR.e0306e0fyx);
    }

    @Bindable
    public String getE0306f0a() {
        return e0306f0a;
    }

    public void setE0306f0a(String e0306f0a) {
        this.e0306f0a = e0306f0a;
        setE0306f0ayx(e0306a0a.equals("3") ? this.e0306f0ayx : "");
        notifyPropertyChanged(BR.e0306f0a);
    }

    @Bindable
    public String getE0306f0ayx() {
        return e0306f0ayx;
    }

    public void setE0306f0ayx(String e0306f0ayx) {
        this.e0306f0ayx = e0306f0ayx;
        notifyPropertyChanged(BR.e0306f0ayx);
    }

    @Bindable
    public String getE0306f0f() {
        return e0306f0f;
    }

    public void setE0306f0f(String e0306f0f) {
        this.e0306f0f = e0306f0f;
        setE0306f0fyx(e0306f0f.equals("3") ? this.e0306f0fyx : "");
        notifyPropertyChanged(BR.e0306f0f);
    }

    @Bindable
    public String getE0306f0fyx() {
        return e0306f0fyx;
    }

    public void setE0306f0fyx(String e0306f0fyx) {
        this.e0306f0fyx = e0306f0fyx;
        notifyPropertyChanged(BR.e0306f0fyx);
    }

    @Bindable
    public String getE0306g0a() {
        return e0306g0a;
    }

    public void setE0306g0a(String e0306g0a) {
        this.e0306g0a = e0306g0a;
        setE0306g0ayx(e0306g0a.equals("3") ? this.e0306g0ayx : "");
        notifyPropertyChanged(BR.e0306g0a);
    }

    @Bindable
    public String getE0306g0ayx() {
        return e0306g0ayx;
    }

    public void setE0306g0ayx(String e0306g0ayx) {
        this.e0306g0ayx = e0306g0ayx;
        notifyPropertyChanged(BR.e0306g0ayx);
    }

    @Bindable
    public String getE0306g0f() {
        return e0306g0f;
    }

    public void setE0306g0f(String e0306g0f) {
        this.e0306g0f = e0306g0f;
        setE0306g0fyx(e0306g0f.equals("3") ? this.e0306g0fyx : "");
        notifyPropertyChanged(BR.e0306g0f);
    }

    @Bindable
    public String getE0306g0fyx() {
        return e0306g0fyx;
    }

    public void setE0306g0fyx(String e0306g0fyx) {
        this.e0306g0fyx = e0306g0fyx;
        notifyPropertyChanged(BR.e0306g0fyx);
    }

    @Bindable
    public String getE0306h0a() {
        return e0306h0a;
    }

    public void setE0306h0a(String e0306h0a) {
        this.e0306h0a = e0306h0a;
        setE0306h0ayx(e0306h0a.equals("3") ? this.e0306h0ayx : "");
        notifyPropertyChanged(BR.e0306h0a);
    }

    @Bindable
    public String getE0306h0ayx() {
        return e0306h0ayx;
    }

    public void setE0306h0ayx(String e0306h0ayx) {
        this.e0306h0ayx = e0306h0ayx;
        notifyPropertyChanged(BR.e0306h0ayx);
    }

    @Bindable
    public String getE0306h0f() {
        return e0306h0f;
    }

    public void setE0306h0f(String e0306h0f) {
        this.e0306h0f = e0306h0f;
        setE0306h0fyx(e0306h0f.equals("3") ? this.e0306h0fyx : "");
        notifyPropertyChanged(BR.e0306h0f);
    }

    @Bindable
    public String getE0306h0fyx() {
        return e0306h0fyx;
    }

    public void setE0306h0fyx(String e0306h0fyx) {
        this.e0306h0fyx = e0306h0fyx;
        notifyPropertyChanged(BR.e0306h0fyx);
    }

    @Bindable
    public String getE0306i0a() {
        return e0306i0a;
    }

    public void setE0306i0a(String e0306i0a) {
        this.e0306i0a = e0306i0a;
        setE0306i0ayx(e0306i0a.equals("3") ? this.e0306i0ayx : "");
        notifyPropertyChanged(BR.e0306i0a);
    }

    @Bindable
    public String getE0306i0ayx() {
        return e0306i0ayx;
    }

    public void setE0306i0ayx(String e0306i0ayx) {
        this.e0306i0ayx = e0306i0ayx;
        notifyPropertyChanged(BR.e0306i0ayx);
    }

    @Bindable
    public String getE0306i0f() {
        return e0306i0f;
    }

    public void setE0306i0f(String e0306i0f) {
        this.e0306i0f = e0306i0f;
        setE0306i0fyx(e0306i0f.equals("3") ? this.e0306i0fyx : "");
        notifyPropertyChanged(BR.e0306i0f);
    }

    @Bindable
    public String getE0306i0fyx() {
        return e0306i0fyx;
    }

    public void setE0306i0fyx(String e0306i0fyx) {
        this.e0306i0fyx = e0306i0fyx;
        notifyPropertyChanged(BR.e0306i0fyx);
    }

    @Bindable
    public String getE0306j0a() {
        return e0306j0a;
    }

    public void setE0306j0a(String e0306j0a) {
        this.e0306j0a = e0306j0a;
        setE0306j0ayx(e0306j0a.equals("3") ? this.e0306j0ayx : "");
        notifyPropertyChanged(BR.e0306j0a);
    }

    @Bindable
    public String getE0306j0ayx() {
        return e0306j0ayx;
    }

    public void setE0306j0ayx(String e0306j0ayx) {
        this.e0306j0ayx = e0306j0ayx;
        notifyPropertyChanged(BR.e0306j0ayx);
    }

    @Bindable
    public String getE0306j0f() {
        return e0306j0f;
    }

    public void setE0306j0f(String e0306j0f) {
        this.e0306j0f = e0306j0f;
        setE0306j0fyx(e0306j0f.equals("3") ? this.e0306j0fyx : "");
        notifyPropertyChanged(BR.e0306j0f);
    }

    @Bindable
    public String getE0306j0fyx() {
        return e0306j0fyx;
    }

    public void setE0306j0fyx(String e0306j0fyx) {
        this.e0306j0fyx = e0306j0fyx;
        notifyPropertyChanged(BR.e0306j0fyx);
    }

    @Bindable
    public String getE0306k0a() {
        return e0306k0a;
    }

    public void setE0306k0a(String e0306k0a) {
        this.e0306k0a = e0306k0a;
        setE0306k0ayx(e0306k0a.equals("3") ? this.e0306k0ayx : "");
        notifyPropertyChanged(BR.e0306k0a);
    }

    @Bindable
    public String getE0306k0ayx() {
        return e0306k0ayx;
    }

    public void setE0306k0ayx(String e0306k0ayx) {
        this.e0306k0ayx = e0306k0ayx;
        notifyPropertyChanged(BR.e0306k0ayx);
    }

    @Bindable
    public String getE0306k0f() {
        return e0306k0f;
    }

    public void setE0306k0f(String e0306k0f) {
        this.e0306k0f = e0306k0f;
        setE0306k0fyx(e0306k0f.equals("3") ? this.e0306k0fyx : "");
        notifyPropertyChanged(BR.e0306k0f);
    }

    @Bindable
    public String getE0306k0fyx() {
        return e0306k0fyx;
    }

    public void setE0306k0fyx(String e0306k0fyx) {
        this.e0306k0fyx = e0306k0fyx;
        notifyPropertyChanged(BR.e0306k0fyx);
    }

    @Bindable
    public String getE0306l0a() {
        return e0306l0a;
    }

    public void setE0306l0a(String e0306l0a) {
        this.e0306l0a = e0306l0a;
        setE0306l0ayx(e0306l0a.equals("3") ? this.e0306l0ayx : "");
        notifyPropertyChanged(BR.e0306l0a);
    }

    @Bindable
    public String getE0306l0ayx() {
        return e0306l0ayx;
    }

    public void setE0306l0ayx(String e0306l0ayx) {
        this.e0306l0ayx = e0306l0ayx;
        notifyPropertyChanged(BR.e0306l0ayx);
    }

    @Bindable
    public String getE0306l0f() {
        return e0306l0f;
    }

    public void setE0306l0f(String e0306l0f) {
        this.e0306l0f = e0306l0f;
        setE0306l0fyx(e0306l0f.equals("3") ? this.e0306l0fyx : "");
        notifyPropertyChanged(BR.e0306l0f);
    }

    @Bindable
    public String getE0306l0fyx() {
        return e0306l0fyx;
    }

    public void setE0306l0fyx(String e0306l0fyx) {
        this.e0306l0fyx = e0306l0fyx;
        notifyPropertyChanged(BR.e0306l0fyx);
    }

    @Bindable
    public String getE0306m0a() {
        return e0306m0a;
    }

    public void setE0306m0a(String e0306m0a) {
        this.e0306m0a = e0306m0a;
        setE0306m0ayx(e0306m0a.equals("3") ? this.e0306m0ayx : "");
        notifyPropertyChanged(BR.e0306m0a);
    }

    @Bindable
    public String getE0306m0ayx() {
        return e0306m0ayx;
    }

    public void setE0306m0ayx(String e0306m0ayx) {
        this.e0306m0ayx = e0306m0ayx;
        notifyPropertyChanged(BR.e0306m0ayx);
    }

    @Bindable
    public String getE0306m0f() {
        return e0306m0f;
    }

    public void setE0306m0f(String e0306m0f) {
        this.e0306m0f = e0306m0f;
        setE0306m0fyx(e0306m0f.equals("3") ? this.e0306m0fyx : "");
        notifyPropertyChanged(BR.e0306m0f);
    }

    @Bindable
    public String getE0306m0fyx() {
        return e0306m0fyx;
    }

    public void setE0306m0fyx(String e0306m0fyx) {
        this.e0306m0fyx = e0306m0fyx;
        notifyPropertyChanged(BR.e0306m0fyx);
    }

    @Bindable
    public String getE0306n0a() {
        return e0306n0a;
    }

    public void setE0306n0a(String e0306n0a) {
        this.e0306n0a = e0306n0a;
        setE0306n0ayx(e0306n0a.equals("3") ? this.e0306n0ayx : "");
        notifyPropertyChanged(BR.e0306n0a);
    }

    @Bindable
    public String getE0306n0ayx() {
        return e0306n0ayx;
    }

    public void setE0306n0ayx(String e0306n0ayx) {
        this.e0306n0ayx = e0306n0ayx;
        notifyPropertyChanged(BR.e0306n0ayx);
    }

    @Bindable
    public String getE0306n0f() {
        return e0306n0f;
    }

    public void setE0306n0f(String e0306n0f) {
        this.e0306n0f = e0306n0f;
        setE0306n0fyx(e0306n0f.equals("3") ? this.e0306n0fyx : "");
        notifyPropertyChanged(BR.e0306n0f);
    }

    @Bindable
    public String getE0306n0fyx() {
        return e0306n0fyx;
    }

    public void setE0306n0fyx(String e0306n0fyx) {
        this.e0306n0fyx = e0306n0fyx;
        notifyPropertyChanged(BR.e0306n0fyx);
    }

    @Bindable
    public String getE0306o0a() {
        return e0306o0a;
    }

    public void setE0306o0a(String e0306o0a) {
        this.e0306o0a = e0306o0a;
        setE0306o0ayx(e0306o0a.equals("3") ? this.e0306o0ayx : "");
        notifyPropertyChanged(BR.e0306o0a);
    }

    @Bindable
    public String getE0306o0ayx() {
        return e0306o0ayx;
    }

    public void setE0306o0ayx(String e0306o0ayx) {
        this.e0306o0ayx = e0306o0ayx;
        notifyPropertyChanged(BR.e0306o0ayx);
    }

    @Bindable
    public String getE0306o0f() {
        return e0306o0f;
    }

    public void setE0306o0f(String e0306o0f) {
        this.e0306o0f = e0306o0f;
        setE0306o0fyx(e0306o0f.equals("3") ? this.e0306o0fyx : "");
        notifyPropertyChanged(BR.e0306o0f);
    }

    @Bindable
    public String getE0306o0fyx() {
        return e0306o0fyx;
    }

    public void setE0306o0fyx(String e0306o0fyx) {
        this.e0306o0fyx = e0306o0fyx;
        notifyPropertyChanged(BR.e0306o0fyx);
    }

    @Bindable
    public String getE0306p0a() {
        return e0306p0a;
    }

    public void setE0306p0a(String e0306p0a) {
        this.e0306p0a = e0306p0a;
        setE0306o0ayx(e0306p0a.equals("3") ? this.e0306p0ayx : "");
        notifyPropertyChanged(BR.e0306p0a);
    }

    @Bindable
    public String getE0306p0ayx() {
        return e0306p0ayx;
    }

    public void setE0306p0ayx(String e0306p0ayx) {
        this.e0306p0ayx = e0306p0ayx;
        notifyPropertyChanged(BR.e0306p0ayx);
    }

    @Bindable
    public String getE0306p0f() {
        return e0306p0f;
    }

    public void setE0306p0f(String e0306p0f) {
        this.e0306p0f = e0306p0f;
        setE0306p0fyx(e0306p0f.equals("3") ? this.e0306p0fyx : "");
        notifyPropertyChanged(BR.e0306p0f);
    }

    @Bindable
    public String getE0306p0fyx() {
        return e0306p0fyx;
    }

    public void setE0306p0fyx(String e0306p0fyx) {
        this.e0306p0fyx = e0306p0fyx;
        notifyPropertyChanged(BR.e0306p0fyx);
    }

    @Bindable
    public String getE0306q0a() {
        return e0306q0a;
    }

    public void setE0306q0a(String e0306q0a) {
        this.e0306q0a = e0306q0a;
        setE0306q0ayx(e0306q0a.equals("3") ? this.e0306q0ayx : "");
        notifyPropertyChanged(BR.e0306q0a);
    }

    @Bindable
    public String getE0306q0ayx() {
        return e0306q0ayx;
    }

    public void setE0306q0ayx(String e0306q0ayx) {
        this.e0306q0ayx = e0306q0ayx;
        notifyPropertyChanged(BR.e0306q0ayx);
    }

    @Bindable
    public String getE0306q0f() {
        return e0306q0f;
    }

    public void setE0306q0f(String e0306q0f) {
        this.e0306q0f = e0306q0f;
        setE0306q0fyx(e0306q0f.equals("3") ? this.e0306q0fyx : "");
        notifyPropertyChanged(BR.e0306q0f);
    }

    @Bindable
    public String getE0306q0fyx() {
        return e0306q0fyx;
    }

    public void setE0306q0fyx(String e0306q0fyx) {
        this.e0306q0fyx = e0306q0fyx;
        notifyPropertyChanged(BR.e0306q0fyx);
    }

    @Bindable
    public String getE0306r0a() {
        return e0306r0a;
    }

    public void setE0306r0a(String e0306r0a) {
        this.e0306r0a = e0306r0a;
        setE0306r0ayx(e0306r0a.equals("3") ? this.e0306r0ayx : "");
        notifyPropertyChanged(BR.e0306r0a);
    }

    @Bindable
    public String getE0306r0ayx() {
        return e0306r0ayx;
    }

    public void setE0306r0ayx(String e0306r0ayx) {
        this.e0306r0ayx = e0306r0ayx;
        notifyPropertyChanged(BR.e0306r0ayx);
    }

    @Bindable
    public String getE0306r0f() {
        return e0306r0f;
    }

    public void setE0306r0f(String e0306r0f) {
        this.e0306r0f = e0306r0f;
        setE0306r0fyx(e0306r0f.equals("3") ? this.e0306r0fyx : "");
        notifyPropertyChanged(BR.e0306r0f);
    }

    @Bindable
    public String getE0306r0fyx() {
        return e0306r0fyx;
    }

    public void setE0306r0fyx(String e0306r0fyx) {
        this.e0306r0fyx = e0306r0fyx;
        notifyPropertyChanged(BR.e0306r0fyx);
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
    public String getE0401() {
        return e0401;
    }

    public void setE0401(String e0401) {
        this.e0401 = e0401;
        notifyPropertyChanged(BR.e0401);
    }

    @Bindable
    public String getE0402() {
        return e0402;
    }

    public void setE0402(String e0402) {
        this.e0402 = e0402;
        notifyPropertyChanged(BR.e0402);
    }

    @Bindable
    public String getE0403a() {
        return e0403a;
    }

    public void setE0403a(String e0403a) {
        this.e0403a = e0403a;
        notifyPropertyChanged(BR.e0403a);
    }

    @Bindable
    public String getE0403b() {
        return e0403b;
    }

    public void setE0403b(String e0403b) {
        this.e0403b = e0403b;
        notifyPropertyChanged(BR.e0403b);
    }

    @Bindable
    public String getE0403c() {
        return e0403c;
    }

    public void setE0403c(String e0403c) {
        this.e0403c = e0403c;
        notifyPropertyChanged(BR.e0403c);
    }

    @Bindable
    public String getE0404() {
        return e0404;
    }

    public void setE0404(String e0404) {
        this.e0404 = e0404;
        notifyPropertyChanged(BR.e0404);
    }

    @Bindable
    public String getE0405() {
        return e0405;
    }

    public void setE0405(String e0405) {
        this.e0405 = e0405;
        notifyPropertyChanged(BR.e0405);
    }

    @Bindable
    public String getE0406() {
        return e0406;
    }

    public void setE0406(String e0406) {
        this.e0406 = e0406;
        notifyPropertyChanged(BR.e0406);
    }

    @Bindable
    public String getE0407a() {
        return e0407a;
    }

    public void setE0407a(String e0407a) {
        this.e0407a = e0407a;
        notifyPropertyChanged(BR.e0407a);
    }

    @Bindable
    public String getE0407b() {
        return e0407b;
    }

    public void setE0407b(String e0407b) {
        this.e0407b = e0407b;
        notifyPropertyChanged(BR.e0407b);
    }

    @Bindable
    public String getE0407c() {
        return e0407c;
    }

    public void setE0407c(String e0407c) {
        this.e0407c = e0407c;
        notifyPropertyChanged(BR.e0407c);
    }

    @Bindable
    public String getE0407d() {
        return e0407d;
    }

    public void setE0407d(String e0407d) {
        this.e0407d = e0407d;
        notifyPropertyChanged(BR.e0407d);
    }

    @Bindable
    public String getE0408() {
        return e0408;
    }

    public void setE0408(String e0408) {
        this.e0408 = e0408;
        notifyPropertyChanged(BR.e0408);
    }

    @Bindable
    public String getE0409() {
        return e0409;
    }

    public void setE0409(String e0409) {
        this.e0409 = e0409;
        setE0409xx(e0409.equals("96") ? this.e0409xx : "");
        notifyPropertyChanged(BR.e0409);
    }

    @Bindable
    public String getE0409xx() {
        return e0409xx;
    }

    public void setE0409xx(String e0409xx) {
        this.e0409xx = e0409xx;
        notifyPropertyChanged(BR.e0409xx);
    }

    @Bindable
    public String getE0410a() {
        return e0410a;
    }

    public void setE0410a(String e0410a) {
        this.e0410a = e0410a;
        notifyPropertyChanged(BR.e0410a);
    }

    @Bindable
    public String getE0410b() {
        return e0410b;
    }

    public void setE0410b(String e0410b) {
        this.e0410b = e0410b;
        notifyPropertyChanged(BR.e0410b);
    }

    @Bindable
    public String getE0410c() {
        return e0410c;
    }

    public void setE0410c(String e0410c) {
        this.e0410c = e0410c;
        notifyPropertyChanged(BR.e0410c);
    }

    @Bindable
    public String getE0410d() {
        return e0410d;
    }

    public void setE0410d(String e0410d) {
        this.e0410d = e0410d;
        notifyPropertyChanged(BR.e0410d);
    }

    @Bindable
    public String getE0410e() {
        return e0410e;
    }

    public void setE0410e(String e0410e) {
        this.e0410e = e0410e;
        notifyPropertyChanged(BR.e0410e);
    }

    @Bindable
    public String getE0410f() {
        return e0410f;
    }

    public void setE0410f(String e0410f) {
        this.e0410f = e0410f;
        notifyPropertyChanged(BR.e0410f);
    }

    @Bindable
    public String getE0411() {
        return e0411;
    }

    public void setE0411(String e0411) {
        this.e0411 = e0411;
        notifyPropertyChanged(BR.e0411);
    }

    @Bindable
    public String getE0412() {
        return e0412;
    }

    public void setE0412(String e0412) {
        this.e0412 = e0412;
        notifyPropertyChanged(BR.e0412);
    }

    @Bindable
    public String getE0413() {
        return e0413;
    }

    public void setE0413(String e0413) {
        this.e0413 = e0413;
        notifyPropertyChanged(BR.e0413);
    }

    @Bindable
    public String getE0414() {
        return e0414;
    }

    public void setE0414(String e0414) {
        this.e0414 = e0414;
        notifyPropertyChanged(BR.e0414);
    }

    @Bindable
    public String getE0415() {
        return e0415;
    }

    public void setE0415(String e0415) {
        this.e0415 = e0415;
        notifyPropertyChanged(BR.e0415);
    }

    @Bindable
    public String getE0416() {
        return e0416;
    }

    public void setE0416(String e0416) {
        this.e0416 = e0416;
        notifyPropertyChanged(BR.e0416);
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
        setE0705a0ayx(e0705a0a.equals("3") ? this.e0705a0ayx : "");
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
        setE0705a0fyx(e0705a0f.equals("3") ? this.e0705a0fyx : "");
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
        setE0705b0ayx(e0705b0a.equals("3") ? this.e0705b0ayx : "");
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
        setE0705b0fyx(e0705b0f.equals("3") ? this.e0705b0fyx : "");
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
        setE0705c0ayx(e0705c0a.equals("3") ? this.e0705c0ayx : "");
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
        setE0705c0fyx(e0705c0f.equals("3") ? this.e0705c0fyx : "");
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
        setE0705d0ayx(e0705d0a.equals("3") ? this.e0705d0ayx : "");
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
        setE0705d0fyx(e0705d0f.equals("3") ? this.e0705d0fyx : "");
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
        setE0705e0ayx(e0705e0a.equals("3") ? this.e0705e0ayx : "");
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
        setE0705e0fyx(e0705e0f.equals("3") ? this.e0705e0fyx : "");
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
            this.e0306a0a = json.getString("e0306a0a");
            this.e0306a0ayx = json.getString("e0306a0ayx");
            this.e0306a0f = json.getString("e0306a0f");
            this.e0306a0fyx = json.getString("e0306a0fyx");
            this.e0306b0a = json.getString("e0306b0a");
            this.e0306b0ayx = json.getString("e0306b0ayx");
            this.e0306b0f = json.getString("e0306b0f");
            this.e0306b0fyx = json.getString("e0306b0fyx");
            this.e0306c0a = json.getString("e0306c0a");
            this.e0306c0ayx = json.getString("e0306c0ayx");
            this.e0306c0f = json.getString("e0306c0f");
            this.e0306c0fyx = json.getString("e0306c0fyx");
            this.e0306d0a = json.getString("e0306d0a");
            this.e0306d0ayx = json.getString("e0306d0ayx");
            this.e0306d0f = json.getString("e0306d0f");
            this.e0306d0fyx = json.getString("e0306d0fyx");
            this.e0306e0a = json.getString("e0306e0a");
            this.e0306e0ayx = json.getString("e0306e0ayx");
            this.e0306e0f = json.getString("e0306e0f");
            this.e0306e0fyx = json.getString("e0306e0fyx");
            this.e0306f0a = json.getString("e0306f0a");
            this.e0306f0ayx = json.getString("e0306f0ayx");
            this.e0306f0f = json.getString("e0306f0f");
            this.e0306f0fyx = json.getString("e0306f0fyx");
            this.e0306g0a = json.getString("e0306g0a");
            this.e0306g0ayx = json.getString("e0306g0ayx");
            this.e0306g0f = json.getString("e0306g0f");
            this.e0306g0fyx = json.getString("e0306g0fyx");
            this.e0306h0a = json.getString("e0306h0a");
            this.e0306h0ayx = json.getString("e0306h0ayx");
            this.e0306h0f = json.getString("e0306h0f");
            this.e0306h0fyx = json.getString("e0306h0fyx");
            this.e0306i0a = json.getString("e0306i0a");
            this.e0306i0ayx = json.getString("e0306i0ayx");
            this.e0306i0f = json.getString("e0306i0f");
            this.e0306i0fyx = json.getString("e0306i0fyx");
            this.e0306j0a = json.getString("e0306j0a");
            this.e0306j0ayx = json.getString("e0306j0ayx");
            this.e0306j0f = json.getString("e0306j0f");
            this.e0306j0fyx = json.getString("e0306j0fyx");
        }
    }

    public void sE33Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE33Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e0306k0a = json.getString("e0306k0a");
            this.e0306k0ayx = json.getString("e0306k0ayx");
            this.e0306k0f = json.getString("e0306k0f");
            this.e0306k0fyx = json.getString("e0306k0fyx");
            this.e0306l0a = json.getString("e0306l0a");
            this.e0306l0ayx = json.getString("e0306l0ayx");
            this.e0306l0f = json.getString("e0306l0f");
            this.e0306l0fyx = json.getString("e0306l0fyx");
            this.e0306m0a = json.getString("e0306m0a");
            this.e0306m0ayx = json.getString("e0306m0ayx");
            this.e0306m0f = json.getString("e0306m0f");
            this.e0306m0fyx = json.getString("e0306m0fyx");
            this.e0306n0a = json.getString("e0306n0a");
            this.e0306n0ayx = json.getString("e0306n0ayx");
            this.e0306n0f = json.getString("e0306n0f");
            this.e0306n0fyx = json.getString("e0306n0fyx");
            this.e0306o0a = json.getString("e0306o0a");
            this.e0306o0ayx = json.getString("e0306o0ayx");
            this.e0306o0f = json.getString("e0306o0f");
            this.e0306o0fyx = json.getString("e0306o0fyx");
            this.e0306p0a = json.getString("e0306p0a");
            this.e0306p0ayx = json.getString("e0306p0ayx");
            this.e0306p0f = json.getString("e0306p0f");
            this.e0306p0fyx = json.getString("e0306p0fyx");
            this.e0306q0a = json.getString("e0306q0a");
            this.e0306q0ayx = json.getString("e0306q0ayx");
            this.e0306q0f = json.getString("e0306q0f");
            this.e0306q0fyx = json.getString("e0306q0fyx");
            this.e0306r0a = json.getString("e0306r0a");
            this.e0306r0ayx = json.getString("e0306r0ayx");
            this.e0306r0f = json.getString("e0306r0f");
            this.e0306r0fyx = json.getString("e0306r0fyx");
            this.e0307 = json.getString("e0307");
            this.e0308 = json.getString("e0308");
        }
    }

    public void sE4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e0401 = json.getString("e0401");
            this.e0402 = json.getString("e0402");
            this.e0403a = json.getString("e0403a");
            this.e0403b = json.getString("e0403b");
            this.e0403c = json.getString("e0403c");
            this.e0404 = json.getString("e0404");
            this.e0405 = json.getString("e0405");
            this.e0406 = json.getString("e0406");
            this.e0407a = json.getString("e0407a");
            this.e0407b = json.getString("e0407b");
            this.e0407c = json.getString("e0407c");
            this.e0407d = json.getString("e0407d");
            this.e0408 = json.getString("e0408");
            this.e0409 = json.getString("e0409");
            this.e0409xx = json.getString("e0409xx");
            this.e0410a = json.getString("e0410a");
            this.e0410b = json.getString("e0410b");
            this.e0410c = json.getString("e0410c");
            this.e0410d = json.getString("e0410d");
            this.e0410e = json.getString("e0410e");
            this.e0410f = json.getString("e0410f");
            this.e0411 = json.getString("e0411");
            this.e0412 = json.getString("e0412");
            this.e0413 = json.getString("e0413");
            this.e0414 = json.getString("e0414");
            this.e0415 = json.getString("e0415");
            this.e0416 = json.getString("e0416");
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
        json.put("e0306a0a", e0306a0a)
                .put("e0306a0ayx", e0306a0ayx)
                .put("e0306a0f", e0306a0f)
                .put("e0306a0fyx", e0306a0fyx)
                .put("e0306b0a", e0306b0a)
                .put("e0306b0ayx", e0306b0ayx)
                .put("e0306b0f", e0306b0f)
                .put("e0306b0fyx", e0306b0fyx)
                .put("e0306c0a", e0306c0a)
                .put("e0306c0ayx", e0306c0ayx)
                .put("e0306c0f", e0306c0f)
                .put("e0306c0fyx", e0306c0fyx)
                .put("e0306d0a", e0306d0a)
                .put("e0306d0ayx", e0306d0ayx)
                .put("e0306d0f", e0306d0f)
                .put("e0306d0fyx", e0306d0fyx)
                .put("e0306e0a", e0306e0a)
                .put("e0306e0ayx", e0306e0ayx)
                .put("e0306e0f", e0306e0f)
                .put("e0306e0fyx", e0306e0fyx)
                .put("e0306f0a", e0306f0a)
                .put("e0306f0ayx", e0306f0ayx)
                .put("e0306f0f", e0306f0f)
                .put("e0306f0fyx", e0306f0fyx)
                .put("e0306g0a", e0306g0a)
                .put("e0306g0ayx", e0306g0ayx)
                .put("e0306g0f", e0306g0f)
                .put("e0306g0fyx", e0306g0fyx)
                .put("e0306h0a", e0306h0a)
                .put("e0306h0ayx", e0306h0ayx)
                .put("e0306h0f", e0306h0f)
                .put("e0306h0fyx", e0306h0fyx)
                .put("e0306i0a", e0306i0a)
                .put("e0306i0ayx", e0306i0ayx)
                .put("e0306i0f", e0306i0f)
                .put("e0306i0fyx", e0306i0fyx)
                .put("e0306j0a", e0306j0a)
                .put("e0306j0ayx", e0306j0ayx)
                .put("e0306j0f", e0306j0f)
                .put("e0306j0fyx", e0306j0fyx);
        return json.toString();
    }

    public String sE33toString() throws JSONException {
        Log.d(TAG, "sE33toString: ");
        JSONObject json = new JSONObject();
        json.put("e0306k0a", e0306k0a)
                .put("e0306k0ayx", e0306k0ayx)
                .put("e0306k0f", e0306k0f)
                .put("e0306k0fyx", e0306k0fyx)
                .put("e0306l0a", e0306l0a)
                .put("e0306l0ayx", e0306l0ayx)
                .put("e0306l0f", e0306l0f)
                .put("e0306l0fyx", e0306l0fyx)
                .put("e0306m0a", e0306m0a)
                .put("e0306m0ayx", e0306m0ayx)
                .put("e0306m0f", e0306m0f)
                .put("e0306m0fyx", e0306m0fyx)
                .put("e0306n0a", e0306n0a)
                .put("e0306n0ayx", e0306n0ayx)
                .put("e0306n0f", e0306n0f)
                .put("e0306n0fyx", e0306n0fyx)
                .put("e0306o0a", e0306o0a)
                .put("e0306o0ayx", e0306o0ayx)
                .put("e0306o0f", e0306o0f)
                .put("e0306o0fyx", e0306o0fyx)
                .put("e0306p0a", e0306p0a)
                .put("e0306p0ayx", e0306p0ayx)
                .put("e0306p0f", e0306p0f)
                .put("e0306p0fyx", e0306p0fyx)
                .put("e0306q0a", e0306q0a)
                .put("e0306q0ayx", e0306q0ayx)
                .put("e0306q0f", e0306q0f)
                .put("e0306q0fyx", e0306q0fyx)
                .put("e0306r0a", e0306r0a)
                .put("e0306r0ayx", e0306r0ayx)
                .put("e0306r0f", e0306r0f)
                .put("e0306r0fyx", e0306r0fyx)
                .put("e0307", e0307)
                .put("e0308", e0308);
        return json.toString();
    }

    public String sE4toString() throws JSONException {
        Log.d(TAG, "sE4toString: ");
        JSONObject json = new JSONObject();
        json.put("e0401", e0401)
                .put("e0402", e0402)
                .put("e0403a", e0403a)
                .put("e0403b", e0403b)
                .put("e0403c", e0403c)
                .put("e0404", e0404)
                .put("e0405", e0405)
                .put("e0406", e0406)
                .put("e0407a", e0407a)
                .put("e0407b", e0407b)
                .put("e0407c", e0407c)
                .put("e0407d", e0407d)
                .put("e0408", e0408)
                .put("e0409", e0409)
                .put("e0409xx", e0409xx)
                .put("e0410a", e0410a)
                .put("e0410b", e0410b)
                .put("e0410c", e0410c)
                .put("e0410d", e0410d)
                .put("e0410e", e0410e)
                .put("e0410f", e0410f)
                .put("e0411", e0411)
                .put("e0412", e0412)
                .put("e0413", e0413)
                .put("e0414", e0414)
                .put("e0415", e0415)
                .put("e0416", e0416);
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
