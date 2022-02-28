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
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleDTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleD extends BaseObservable implements Observable {

    private final String TAG = "ModuleD";
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
    private String d0101 = _EMPTY_;
    private String d0102 = _EMPTY_;
    private String d0201 = _EMPTY_;
    private String d0202 = _EMPTY_;
    private String d0203 = _EMPTY_;
    private String d0301 = _EMPTY_;
    private String d0302 = _EMPTY_;
    private String d0303 = _EMPTY_;
    private String d0304 = _EMPTY_;
    private String d0401 = _EMPTY_;
    private String d0402 = _EMPTY_;
    private String d0403 = _EMPTY_;
    private String d0404 = _EMPTY_;
    private String d0405 = _EMPTY_;
    private String d0406 = _EMPTY_;
    private String d0507 = _EMPTY_;
    private String d0608 = _EMPTY_;
    private String d0501 = _EMPTY_;
    private String d05011 = _EMPTY_;
    private String d05012 = _EMPTY_;
    private String d0501296x = _EMPTY_;
    private String d0502a0a = _EMPTY_;
    private String d0502a0ayx = _EMPTY_;
    private String d0502a0f = _EMPTY_;
    private String d0502a0fyx = _EMPTY_;
    private String d0502b0a = _EMPTY_;
    private String d0502b0ayx = _EMPTY_;
    private String d0502b0f = _EMPTY_;
    private String d0502b0fyx = _EMPTY_;
    private String d0502c0a = _EMPTY_;
    private String d0502c0ayx = _EMPTY_;
    private String d0502c0f = _EMPTY_;
    private String d0502c0fyx = _EMPTY_;
    private String d0502d0a = _EMPTY_;
    private String d0502d0ayx = _EMPTY_;
    private String d0502d0f = _EMPTY_;
    private String d0502d0fyx = _EMPTY_;
    private String d0503a = _EMPTY_;
    private String d0503b = _EMPTY_;
    private String d0503c = _EMPTY_;
    private String d0503d = _EMPTY_;
    private String d0503e = _EMPTY_;
    private String d0503f = _EMPTY_;
    private String d0503g = _EMPTY_;
    private String d0503h = _EMPTY_;
    private String d0601a = _EMPTY_;
    private String d0601b = _EMPTY_;
    private String d0601c = _EMPTY_;
    private String d0601d = _EMPTY_;
    private String d0602 = _EMPTY_;
    private String d0603 = _EMPTY_;
    private String d0604 = _EMPTY_;
    private String d0605 = _EMPTY_;
    private String d0701 = _EMPTY_;
    private String d0701xx = _EMPTY_;
    private String d0702 = _EMPTY_;
    private String d0702xx = _EMPTY_;
    private String d0703 = _EMPTY_;
    private String d0704a = _EMPTY_;
    private String d0704b = _EMPTY_;
    private String d0704c = _EMPTY_;
    private String d0704d = _EMPTY_;
    private String d0704e = _EMPTY_;
    private String d8011 = _EMPTY_;
    private String d8012 = _EMPTY_;
    private String d8021 = _EMPTY_;
    private String d8022 = _EMPTY_;
    private String d8031 = _EMPTY_;
    private String d8032 = _EMPTY_;
    private String d8041 = _EMPTY_;
    private String d8042 = _EMPTY_;
    private String d8051 = _EMPTY_;
    private String d8052 = _EMPTY_;
    private String d8061 = _EMPTY_;
    private String d8062 = _EMPTY_;
    private String d8071 = _EMPTY_;
    private String d8072 = _EMPTY_;
    private String d8081 = _EMPTY_;
    private String d8082 = _EMPTY_;
    private String d8091 = _EMPTY_;
    private String d8092 = _EMPTY_;
    private String d8101 = _EMPTY_;
    private String d8102 = _EMPTY_;


    public ModuleD() {
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
    public String getD0101() {
        return d0101;
    }

    public void setD0101(String d0101) {
        this.d0101 = d0101;
        notifyPropertyChanged(BR.d0101);
    }

    @Bindable
    public String getD0102() {
        return d0102;
    }

    public void setD0102(String d0102) {
        this.d0102 = d0102;
        notifyPropertyChanged(BR.d0102);
    }

    @Bindable
    public String getD0201() {
        return d0201;
    }

    public void setD0201(String d0201) {
        this.d0201 = d0201;
        setD0203(d0201.equals("2") && this.d0202.equals("2") ? "" : this.d0203);
        notifyPropertyChanged(BR.d0201);
    }

    @Bindable
    public String getD0202() {
        return d0202;
    }

    public void setD0202(String d0202) {
        this.d0202 = d0202;
        setD0203(d0202.equals("2") && this.d0201.equals("2") ? "" : this.d0203);
        notifyPropertyChanged(BR.d0202);
    }

    @Bindable
    public String getD0203() {
        return d0203;
    }

    public void setD0203(String d0203) {
        this.d0203 = d0203;
        notifyPropertyChanged(BR.d0203);
    }

    @Bindable
    public String getD0301() {
        return d0301;
    }

    public void setD0301(String d0301) {
        this.d0301 = d0301;
        notifyPropertyChanged(BR.d0301);
    }

    @Bindable
    public String getD0302() {
        return d0302;
    }

    public void setD0302(String d0302) {
        this.d0302 = d0302;
        notifyPropertyChanged(BR.d0302);
    }

    @Bindable
    public String getD0303() {
        return d0303;
    }

    public void setD0303(String d0303) {
        this.d0303 = d0303;
        notifyPropertyChanged(BR.d0303);
    }

    @Bindable
    public String getD0304() {
        return d0304;
    }

    public void setD0304(String d0304) {
        this.d0304 = d0304;
        notifyPropertyChanged(BR.d0304);
    }

    @Bindable
    public String getD0401() {
        return d0401;
    }

    public void setD0401(String d0401) {
        this.d0401 = d0401;
        notifyPropertyChanged(BR.d0401);
    }

    @Bindable
    public String getD0402() {
        return d0402;
    }

    public void setD0402(String d0402) {
        this.d0402 = d0402;
        notifyPropertyChanged(BR.d0402);
    }

    @Bindable
    public String getD0403() {
        return d0403;
    }

    public void setD0403(String d0403) {
        this.d0403 = d0403;
        notifyPropertyChanged(BR.d0403);
    }

    @Bindable
    public String getD0404() {
        return d0404;
    }

    public void setD0404(String d0404) {
        this.d0404 = d0404;
        notifyPropertyChanged(BR.d0404);
    }

    @Bindable
    public String getD0405() {
        return d0405;
    }

    public void setD0405(String d0405) {
        this.d0405 = d0405;
        notifyPropertyChanged(BR.d0405);
    }

    @Bindable
    public String getD0406() {
        return d0406;
    }

    public void setD0406(String d0406) {
        this.d0406 = d0406;
        notifyPropertyChanged(BR.d0406);
    }

    @Bindable
    public String getD0507() {
        return d0507;
    }

    public void setD0507(String d0507) {
        this.d0507 = d0507;
        notifyPropertyChanged(BR.d0507);
    }

    @Bindable
    public String getD0608() {
        return d0608;
    }

    public void setD0608(String d0608) {
        this.d0608 = d0608;
        notifyPropertyChanged(BR.d0608);
    }

    @Bindable
    public String getD0501() {
        return d0501;
    }

    public void setD0501(String d0501) {
        this.d0501 = d0501;
        notifyPropertyChanged(BR.d0501);
    }

    @Bindable
    public String getD05011() {
        return d05011;
    }

    public void setD05011(String d05011) {
        this.d05011 = d05011;
        notifyPropertyChanged(BR.d05011);
    }

    @Bindable
    public String getD05012() {
        return d05012;
    }

    public void setD05012(String d05012) {
        this.d05012 = d05012;
        setD0501296x(d05012.equals("96") ? this.d0501296x : "");
        notifyPropertyChanged(BR.d05012);
    }

    @Bindable
    public String getD0501296x() {
        return d0501296x;
    }

    public void setD0501296x(String d0501296x) {
        this.d0501296x = d0501296x;
        notifyPropertyChanged(BR.d0501296x);
    }

    @Bindable
    public String getD0502a0a() {
        return d0502a0a;
    }

    public void setD0502a0a(String d0502a0a) {
        this.d0502a0a = d0502a0a;
        setD0502a0ayx(d0502a0a.equals("1") ? this.d0502a0ayx : "");
        setD0502a0f(d0502a0a.equals("1") ? this.d0502a0f : "");
        notifyPropertyChanged(BR.d0502a0a);
    }

    @Bindable
    public String getD0502a0ayx() {
        return d0502a0ayx;
    }

    public void setD0502a0ayx(String d0502a0ayx) {
        this.d0502a0ayx = d0502a0ayx;
        notifyPropertyChanged(BR.d0502a0ayx);
    }

    @Bindable
    public String getD0502a0f() {
        return d0502a0f;
    }

    public void setD0502a0f(String d0502a0f) {
        this.d0502a0f = d0502a0f;
        setD0502a0fyx(d0502a0f.equals("1") ? this.d0502a0fyx : "");
        notifyPropertyChanged(BR.d0502a0f);
    }

    @Bindable
    public String getD0502a0fyx() {
        return d0502a0fyx;
    }

    public void setD0502a0fyx(String d0502a0fyx) {
        this.d0502a0fyx = d0502a0fyx;
        notifyPropertyChanged(BR.d0502a0fyx);
    }

    @Bindable
    public String getD0502b0a() {
        return d0502b0a;
    }

    public void setD0502b0a(String d0502b0a) {
        this.d0502b0a = d0502b0a;
        setD0502b0ayx(d0502b0a.equals("1") ? this.d0502b0ayx : "");
        setD0502b0f(d0502b0a.equals("1") ? this.d0502b0f : "");
        notifyPropertyChanged(BR.d0502b0a);
    }

    @Bindable
    public String getD0502b0ayx() {
        return d0502b0ayx;
    }

    public void setD0502b0ayx(String d0502b0ayx) {
        this.d0502b0ayx = d0502b0ayx;
        notifyPropertyChanged(BR.d0502b0ayx);
    }

    @Bindable
    public String getD0502b0f() {
        return d0502b0f;
    }

    public void setD0502b0f(String d0502b0f) {
        this.d0502b0f = d0502b0f;
        setD0502b0fyx(d0502b0f.equals("1") ? this.d0502b0fyx : "");
        notifyPropertyChanged(BR.d0502b0f);
    }

    @Bindable
    public String getD0502b0fyx() {
        return d0502b0fyx;
    }

    public void setD0502b0fyx(String d0502b0fyx) {
        this.d0502b0fyx = d0502b0fyx;
        notifyPropertyChanged(BR.d0502b0fyx);
    }

    @Bindable
    public String getD0502c0a() {
        return d0502c0a;
    }

    public void setD0502c0a(String d0502c0a) {
        this.d0502c0a = d0502c0a;
        setD0502c0ayx(d0502c0a.equals("1") ? this.d0502c0ayx : "");
        setD0502c0f(d0502c0a.equals("1") ? this.d0502c0f : "");
        notifyPropertyChanged(BR.d0502c0a);
    }

    @Bindable
    public String getD0502c0ayx() {
        return d0502c0ayx;
    }

    public void setD0502c0ayx(String d0502c0ayx) {
        this.d0502c0ayx = d0502c0ayx;
        notifyPropertyChanged(BR.d0502c0ayx);
    }

    @Bindable
    public String getD0502c0f() {
        return d0502c0f;
    }

    public void setD0502c0f(String d0502c0f) {
        this.d0502c0f = d0502c0f;
        setD0502c0fyx(d0502c0f.equals("1") ? this.d0502c0fyx : "");
        notifyPropertyChanged(BR.d0502c0f);
    }

    @Bindable
    public String getD0502c0fyx() {
        return d0502c0fyx;
    }

    public void setD0502c0fyx(String d0502c0fyx) {
        this.d0502c0fyx = d0502c0fyx;
        notifyPropertyChanged(BR.d0502c0fyx);
    }

    @Bindable
    public String getD0502d0a() {
        return d0502d0a;
    }

    public void setD0502d0a(String d0502d0a) {
        this.d0502d0a = d0502d0a;
        setD0502d0ayx(d0502d0a.equals("1") ? this.d0502d0ayx : "");
        setD0502d0f(d0502d0a.equals("1") ? this.d0502d0f : "");
        notifyPropertyChanged(BR.d0502d0a);
    }

    @Bindable
    public String getD0502d0ayx() {
        return d0502d0ayx;
    }

    public void setD0502d0ayx(String d0502d0ayx) {
        this.d0502d0ayx = d0502d0ayx;
        notifyPropertyChanged(BR.d0502d0ayx);
    }

    @Bindable
    public String getD0502d0f() {
        return d0502d0f;
    }

    public void setD0502d0f(String d0502d0f) {
        this.d0502d0f = d0502d0f;
        setD0502d0fyx(d0502d0f.equals("1") ? this.d0502d0fyx : "");
        notifyPropertyChanged(BR.d0502d0f);
    }

    @Bindable
    public String getD0502d0fyx() {
        return d0502d0fyx;
    }

    public void setD0502d0fyx(String d0502d0fyx) {
        this.d0502d0fyx = d0502d0fyx;
        notifyPropertyChanged(BR.d0502d0fyx);
    }

    @Bindable
    public String getD0503a() {
        return d0503a;
    }

    public void setD0503a(String d0503a) {
        this.d0503a = d0503a;
        notifyPropertyChanged(BR.d0503a);
    }

    @Bindable
    public String getD0503b() {
        return d0503b;
    }

    public void setD0503b(String d0503b) {
        this.d0503b = d0503b;
        notifyPropertyChanged(BR.d0503b);
    }

    @Bindable
    public String getD0503c() {
        return d0503c;
    }

    public void setD0503c(String d0503c) {
        this.d0503c = d0503c;
        notifyPropertyChanged(BR.d0503c);
    }

    @Bindable
    public String getD0503d() {
        return d0503d;
    }

    public void setD0503d(String d0503d) {
        this.d0503d = d0503d;
        notifyPropertyChanged(BR.d0503d);
    }

    @Bindable
    public String getD0503e() {
        return d0503e;
    }

    public void setD0503e(String d0503e) {
        this.d0503e = d0503e;
        notifyPropertyChanged(BR.d0503e);
    }

    @Bindable
    public String getD0503f() {
        return d0503f;
    }

    public void setD0503f(String d0503f) {
        this.d0503f = d0503f;
        notifyPropertyChanged(BR.d0503f);
    }

    @Bindable
    public String getD0503g() {
        return d0503g;
    }

    public void setD0503g(String d0503g) {
        this.d0503g = d0503g;
        notifyPropertyChanged(BR.d0503g);
    }

    @Bindable
    public String getD0503h() {
        return d0503h;
    }

    public void setD0503h(String d0503h) {
        this.d0503h = d0503h;
        notifyPropertyChanged(BR.d0503h);
    }

    @Bindable
    public String getD0601a() {
        return d0601a;
    }

    public void setD0601a(String d0601a) {
        this.d0601a = d0601a;
        notifyPropertyChanged(BR.d0601a);
    }

    @Bindable
    public String getD0601b() {
        return d0601b;
    }

    public void setD0601b(String d0601b) {
        this.d0601b = d0601b;
        notifyPropertyChanged(BR.d0601b);
    }

    @Bindable
    public String getD0601c() {
        return d0601c;
    }

    public void setD0601c(String d0601c) {
        this.d0601c = d0601c;
        notifyPropertyChanged(BR.d0601c);
    }

    @Bindable
    public String getD0601d() {
        return d0601d;
    }

    public void setD0601d(String d0601d) {
        this.d0601d = d0601d;
        notifyPropertyChanged(BR.d0601d);
    }

    @Bindable
    public String getD0602() {
        return d0602;
    }

    public void setD0602(String d0602) {
        this.d0602 = d0602;
        setD0603(d0602.equals("1") ? this.d0603 : "");
        setD0604(d0602.equals("1") ? this.d0604 : "");
        notifyPropertyChanged(BR.d0602);
    }

    @Bindable
    public String getD0603() {
        return d0603;
    }

    public void setD0603(String d0603) {
        this.d0603 = d0603;
        notifyPropertyChanged(BR.d0603);
    }

    @Bindable
    public String getD0604() {
        return d0604;
    }

    public void setD0604(String d0604) {
        this.d0604 = d0604;
        notifyPropertyChanged(BR.d0604);
    }

    @Bindable
    public String getD0605() {
        return d0605;
    }

    public void setD0605(String d0605) {
        this.d0605 = d0605;
        notifyPropertyChanged(BR.d0605);
    }

    @Bindable
    public String getD0701() {
        return d0701;
    }

    public void setD0701(String d0701) {
        this.d0701 = d0701;
        setD0701xx(d0701.equals("96") ? this.d0701xx : "");
        notifyPropertyChanged(BR.d0701);
    }

    @Bindable
    public String getD0701xx() {
        return d0701xx;
    }

    public void setD0701xx(String d0701xx) {
        this.d0701xx = d0701xx;
        notifyPropertyChanged(BR.d0701xx);
    }

    @Bindable
    public String getD0702() {
        return d0702;
    }

    public void setD0702(String d0702) {
        this.d0702 = d0702;
        setD0702xx(d0702.equals("96") ? this.d0702xx : "");
        notifyPropertyChanged(BR.d0702);
    }

    @Bindable
    public String getD0702xx() {
        return d0702xx;
    }

    public void setD0702xx(String d0702xx) {
        this.d0702xx = d0702xx;
        notifyPropertyChanged(BR.d0702xx);
    }

    @Bindable
    public String getD0703() {
        return d0703;
    }

    public void setD0703(String d0703) {
        this.d0703 = d0703;
        notifyPropertyChanged(BR.d0703);
    }

    @Bindable
    public String getD0704a() {
        return d0704a;
    }

    public void setD0704a(String d0704a) {
        this.d0704a = d0704a;
        notifyPropertyChanged(BR.d0704a);
    }

    @Bindable
    public String getD0704b() {
        return d0704b;
    }

    public void setD0704b(String d0704b) {
        this.d0704b = d0704b;
        notifyPropertyChanged(BR.d0704b);
    }

    @Bindable
    public String getD0704c() {
        return d0704c;
    }

    public void setD0704c(String d0704c) {
        this.d0704c = d0704c;
        notifyPropertyChanged(BR.d0704c);
    }

    @Bindable
    public String getD0704d() {
        return d0704d;
    }

    public void setD0704d(String d0704d) {
        this.d0704d = d0704d;
        notifyPropertyChanged(BR.d0704d);
    }

    @Bindable
    public String getD0704e() {
        return d0704e;
    }

    public void setD0704e(String d0704e) {
        this.d0704e = d0704e;
        notifyPropertyChanged(BR.d0704e);
    }

    @Bindable
    public String getD8011() {
        return d8011;
    }

    public void setD8011(String d8011) {
        this.d8011 = d8011;
        setD8012(d8011.equals("1") ? this.d8012 : "");
        notifyPropertyChanged(BR.d8011);
    }

    @Bindable
    public String getD8012() {
        return d8012;
    }

    public void setD8012(String d8012) {
        this.d8012 = d8012;
        notifyPropertyChanged(BR.d8012);
    }


    @Bindable
    public String getD8021() {
        return d8021;
    }

    public void setD8021(String d8021) {
        this.d8021 = d8021;
        setD8022(d8021.equals("1") ? this.d8022 : "");
        notifyPropertyChanged(BR.d8021);
    }

    @Bindable
    public String getD8022() {
        return d8022;
    }

    public void setD8022(String d8022) {
        this.d8022 = d8022;
        notifyPropertyChanged(BR.d8022);
    }


    @Bindable
    public String getD8031() {
        return d8031;
    }

    public void setD8031(String d8031) {
        this.d8031 = d8031;
        setD8032(d8031.equals("1") ? this.d8032 : "");
        notifyPropertyChanged(BR.d8031);
    }

    @Bindable
    public String getD8032() {
        return d8032;
    }

    public void setD8032(String d8032) {
        this.d8032 = d8032;
        notifyPropertyChanged(BR.d8032);
    }


    @Bindable
    public String getD8041() {
        return d8041;
    }

    public void setD8041(String d8041) {
        this.d8041 = d8041;
        setD8042(d8041.equals("1") ? this.d8042 : "");
        notifyPropertyChanged(BR.d8041);
    }

    @Bindable
    public String getD8042() {
        return d8042;
    }

    public void setD8042(String d8042) {
        this.d8042 = d8042;
        notifyPropertyChanged(BR.d8042);
    }


    @Bindable
    public String getD8051() {
        return d8051;
    }

    public void setD8051(String d8051) {
        this.d8051 = d8051;
        setD8052(d8051.equals("1") ? this.d8052 : "");
        notifyPropertyChanged(BR.d8051);
    }

    @Bindable
    public String getD8052() {
        return d8052;
    }

    public void setD8052(String d8052) {
        this.d8052 = d8052;
        notifyPropertyChanged(BR.d8052);
    }


    @Bindable
    public String getD8061() {
        return d8061;
    }

    public void setD8061(String d8061) {
        this.d8061 = d8061;
        setD8062(d8061.equals("1") ? this.d8062 : "");
        notifyPropertyChanged(BR.d8061);
    }

    @Bindable
    public String getD8062() {
        return d8062;
    }

    public void setD8062(String d8062) {
        this.d8062 = d8062;
        notifyPropertyChanged(BR.d8062);
    }


    @Bindable
    public String getD8071() {
        return d8071;
    }

    public void setD8071(String d8071) {
        this.d8071 = d8071;
        setD8072(d8071.equals("1") ? this.d8072 : "");
        notifyPropertyChanged(BR.d8071);
    }

    @Bindable
    public String getD8072() {
        return d8072;
    }

    public void setD8072(String d8072) {
        this.d8072 = d8072;
        notifyPropertyChanged(BR.d8072);
    }


    @Bindable
    public String getD8081() {
        return d8081;
    }

    public void setD8081(String d8081) {
        this.d8081 = d8081;
        setD8082(d8081.equals("1") ? this.d8082 : "");
        notifyPropertyChanged(BR.d8081);
    }

    @Bindable
    public String getD8082() {
        return d8082;
    }

    public void setD8082(String d8082) {
        this.d8082 = d8082;
        notifyPropertyChanged(BR.d8082);
    }


    @Bindable
    public String getD8091() {
        return d8091;
    }

    public void setD8091(String d8091) {
        this.d8091 = d8091;
        setD8092(d8091.equals("1") ? this.d8092 : "");
        notifyPropertyChanged(BR.d8091);
    }

    @Bindable
    public String getD8092() {
        return d8092;
    }

    public void setD8092(String d8092) {
        this.d8092 = d8092;
        notifyPropertyChanged(BR.d8092);
    }


    @Bindable
    public String getD8101() {
        return d8101;
    }

    public void setD8101(String d8101) {
        this.d8101 = d8101;
        setD8102(d8101.equals("1") ? this.d8102 : "");
        notifyPropertyChanged(BR.d8101);
    }

    @Bindable
    public String getD8102() {
        return d8102;
    }

    public void setD8102(String d8102) {
        this.d8102 = d8102;
        notifyPropertyChanged(BR.d8102);
    }


    public ModuleD Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_UUID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SYNCED_DATE));
        sD1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD1)));
        sD2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD2)));
        sD3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD3)));
        sD4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD4)));
        sD5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD5)));
        sD6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD6)));
        sD7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD7)));
        sD8Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleDTable.COLUMN_SD8)));
        return this;
    }

    public void sD1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d0101 = json.getString("d0101");
            this.d0102 = json.getString("d0102");
        }
    }

    public void sD2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d0201 = json.getString("d0201");
            this.d0202 = json.getString("d0202");
            this.d0203 = json.getString("d0203");
        }
    }

    public void sD3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d0301 = json.getString("d0301");
            this.d0302 = json.getString("d0302");
            this.d0303 = json.getString("d0303");
            this.d0304 = json.getString("d0304");
        }
    }

    public void sD4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d0401 = json.getString("d0401");
            this.d0402 = json.getString("d0402");
            this.d0403 = json.getString("d0403");
            this.d0404 = json.getString("d0404");
            this.d0405 = json.getString("d0405");
            this.d0406 = json.getString("d0406");
            this.d0507 = json.getString("d0507");
            this.d0608 = json.getString("d0608");
        }
    }

    public void sD5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d0501 = json.getString("d0501");
            this.d05011 = json.getString("d05011");
            this.d05012 = json.getString("d05012");
            this.d0501296x = json.getString("d0501296x");
            this.d0502a0a = json.getString("d0502a0a");
            this.d0502a0ayx = json.getString("d0502a0ayx");
            this.d0502a0f = json.getString("d0502a0f");
            this.d0502a0fyx = json.getString("d0502a0fyx");
            this.d0502b0a = json.getString("d0502b0a");
            this.d0502b0ayx = json.getString("d0502b0ayx");
            this.d0502b0f = json.getString("d0502b0f");
            this.d0502b0fyx = json.getString("d0502b0fyx");
            this.d0502c0a = json.getString("d0502c0a");
            this.d0502c0ayx = json.getString("d0502c0ayx");
            this.d0502c0f = json.getString("d0502c0f");
            this.d0502c0fyx = json.getString("d0502c0fyx");
            this.d0502d0a = json.getString("d0502d0a");
            this.d0502d0ayx = json.getString("d0502d0ayx");
            this.d0502d0f = json.getString("d0502d0f");
            this.d0502d0fyx = json.getString("d0502d0fyx");
            this.d0503a = json.getString("d0503a");
            this.d0503b = json.getString("d0503b");
            this.d0503c = json.getString("d0503c");
            this.d0503d = json.getString("d0503d");
            this.d0503e = json.getString("d0503e");
            this.d0503f = json.getString("d0503f");
            this.d0503g = json.getString("d0503g");
            this.d0503h = json.getString("d0503h");
        }
    }

    public void sD6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d0601a = json.getString("d0601a");
            this.d0601b = json.getString("d0601b");
            this.d0601c = json.getString("d0601c");
            this.d0601d = json.getString("d0601d");
            this.d0602 = json.getString("d0602");
            this.d0603 = json.getString("d0603");
            this.d0604 = json.getString("d0604");
            this.d0605 = json.getString("d0605");
        }
    }

    public void sD7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d0701 = json.getString("d0701");
            this.d0701xx = json.getString("d0701xx");
            this.d0702 = json.getString("d0702");
            this.d0702xx = json.getString("d0702xx");
            this.d0703 = json.getString("d0703");
            this.d0704a = json.getString("d0704a");
            this.d0704b = json.getString("d0704b");
            this.d0704c = json.getString("d0704c");
            this.d0704d = json.getString("d0704d");
            this.d0704e = json.getString("d0704e");
        }
    }

    public void sD8Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD8Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d8011 = json.getString("d8011");
            this.d8012 = json.getString("d8012");
            this.d8021 = json.getString("d8021");
            this.d8022 = json.getString("d8022");
            this.d8031 = json.getString("d8031");
            this.d8032 = json.getString("d8032");
            this.d8041 = json.getString("d8041");
            this.d8042 = json.getString("d8042");
            this.d8051 = json.getString("d8051");
            this.d8052 = json.getString("d8052");
            this.d8061 = json.getString("d8061");
            this.d8062 = json.getString("d8062");
            this.d8071 = json.getString("d8071");
            this.d8072 = json.getString("d8072");
            this.d8081 = json.getString("d8081");
            this.d8082 = json.getString("d8082");
            this.d8091 = json.getString("d8091");
            this.d8092 = json.getString("d8092");
            this.d8101 = json.getString("d8101");
            this.d8102 = json.getString("d8102");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(ModuleDTable.COLUMN_ID, this.id);
        json.put(ModuleDTable.COLUMN_UID, this.uid);
        json.put(ModuleDTable.COLUMN_UUID, this.uuid);
        json.put(ModuleDTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(ModuleDTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(ModuleDTable.COLUMN_UC_CODE, this.ucCode);
        json.put(ModuleDTable.COLUMN_HF_CODE, this.hfCode);
        json.put(ModuleDTable.COLUMN_USERNAME, this.userName);
        json.put(ModuleDTable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleDTable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleDTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleDTable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleDTable.COLUMN_SYNCED, this.synced);
        json.put(ModuleDTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleDTable.COLUMN_SD1, new JSONObject(sD1toString()));
        json.put(ModuleDTable.COLUMN_SD2, new JSONObject(sD2toString()));
        json.put(ModuleDTable.COLUMN_SD3, new JSONObject(sD3toString()));
        json.put(ModuleDTable.COLUMN_SD4, new JSONObject(sD4toString()));
        json.put(ModuleDTable.COLUMN_SD5, new JSONObject(sD5toString()));
        json.put(ModuleDTable.COLUMN_SD6, new JSONObject(sD6toString()));
        json.put(ModuleDTable.COLUMN_SD7, new JSONObject(sD7toString()));
        json.put(ModuleDTable.COLUMN_SD8, new JSONObject(sD8toString()));
        return json;
    }

    public String sD1toString() throws JSONException {
        Log.d(TAG, "sD1toString: ");
        JSONObject json = new JSONObject();
        json.put("d0101", d0101)
                .put("d0102", d0102);
        return json.toString();
    }

    public String sD2toString() throws JSONException {
        Log.d(TAG, "sD2toString: ");
        JSONObject json = new JSONObject();
        json.put("d0201", d0201)
                .put("d0202", d0202)
                .put("d0203", d0203);
        return json.toString();
    }

    public String sD3toString() throws JSONException {
        Log.d(TAG, "sD3toString: ");
        JSONObject json = new JSONObject();
        json.put("d0301", d0301)
                .put("d0302", d0302)
                .put("d0303", d0303)
                .put("d0304", d0304);
        return json.toString();
    }

    public String sD4toString() throws JSONException {
        Log.d(TAG, "sD4toString: ");
        JSONObject json = new JSONObject();
        json.put("d0401", d0401)
                .put("d0402", d0402)
                .put("d0403", d0403)
                .put("d0404", d0404)
                .put("d0405", d0405)
                .put("d0406", d0406)
                .put("d0507", d0507)
                .put("d0608", d0608);
        return json.toString();
    }

    public String sD5toString() throws JSONException {
        Log.d(TAG, "sD5toString: ");
        JSONObject json = new JSONObject();
        json.put("d0501", d0501)
                .put("d05011", d05011)
                .put("d05012", d05012)
                .put("d0501296x", d0501296x)
                .put("d0502a0a", d0502a0a)
                .put("d0502a0ayx", d0502a0ayx)
                .put("d0502a0f", d0502a0f)
                .put("d0502a0fyx", d0502a0fyx)
                .put("d0502b0a", d0502b0a)
                .put("d0502b0ayx", d0502b0ayx)
                .put("d0502b0f", d0502b0f)
                .put("d0502b0fyx", d0502b0fyx)
                .put("d0502c0a", d0502c0a)
                .put("d0502c0ayx", d0502c0ayx)
                .put("d0502c0f", d0502c0f)
                .put("d0502c0fyx", d0502c0fyx)
                .put("d0502d0a", d0502d0a)
                .put("d0502d0ayx", d0502d0ayx)
                .put("d0502d0f", d0502d0f)
                .put("d0502d0fyx", d0502d0fyx)
                .put("d0503a", d0503a)
                .put("d0503b", d0503b)
                .put("d0503c", d0503c)
                .put("d0503d", d0503d)
                .put("d0503e", d0503e)
                .put("d0503f", d0503f)
                .put("d0503g", d0503g)
                .put("d0503h", d0503h);
        return json.toString();
    }

    public String sD6toString() throws JSONException {
        Log.d(TAG, "sD6toString: ");
        JSONObject json = new JSONObject();
        json.put("d0601a", d0601a)
                .put("d0601b", d0601b)
                .put("d0601c", d0601c)
                .put("d0601d", d0601d)
                .put("d0602", d0602)
                .put("d0603", d0603)
                .put("d0604", d0604)
                .put("d0605", d0605);
        return json.toString();
    }

    public String sD7toString() throws JSONException {
        Log.d(TAG, "sD7toString: ");
        JSONObject json = new JSONObject();
        json.put("d0701", d0701)
                .put("d0701xx", d0701xx)
                .put("d0702", d0702)
                .put("d0702xx", d0702xx)
                .put("d0703", d0703)
                .put("d0704a", d0704a)
                .put("d0704b", d0704b)
                .put("d0704c", d0704c)
                .put("d0704d", d0704d)
                .put("d0704e", d0704e);
        return json.toString();
    }

    public String sD8toString() throws JSONException {
        Log.d(TAG, "sD8toString: ");
        JSONObject json = new JSONObject();
        json.put("d8011", d8011)
                .put("d8012", d8012)
                .put("d8021", d8021)
                .put("d8022", d8022)
                .put("d8031", d8031)
                .put("d8032", d8032)
                .put("d8041", d8041)
                .put("d8042", d8042)
                .put("d8051", d8051)
                .put("d8052", d8052)
                .put("d8061", d8061)
                .put("d8062", d8062)
                .put("d8071", d8071)
                .put("d8072", d8072)
                .put("d8081", d8081)
                .put("d8082", d8082)
                .put("d8091", d8091)
                .put("d8092", d8092)
                .put("d8101", d8101)
                .put("d8102", d8102);
        return json.toString();
    }


}
