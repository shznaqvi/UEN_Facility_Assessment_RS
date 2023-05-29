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
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleMTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;


public class ModuleM extends BaseObservable implements Observable {

    private final String TAG = "ModuleM";
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
    private String m101 = _EMPTY_;
    private String m201 = _EMPTY_;
    private String m202 = _EMPTY_;
    private String m203 = _EMPTY_;
    private String m204 = _EMPTY_;
    private String m205 = _EMPTY_;
    private String m301 = _EMPTY_;
    private String m302 = _EMPTY_;
    private String m303 = _EMPTY_;
    private String m401 = _EMPTY_;
    private String m402 = _EMPTY_;
    private String m403 = _EMPTY_;
    private String m404 = _EMPTY_;
    private String m40401 = _EMPTY_;
    private String m40402 = _EMPTY_;
    private String m40403 = _EMPTY_;
    private String m40404 = _EMPTY_;
    private String m405 = _EMPTY_;
    private String m406 = _EMPTY_;
    private String m407 = _EMPTY_;
    private String m40701 = _EMPTY_;
    private String m40702 = _EMPTY_;
    private String m40703 = _EMPTY_;
    private String m40704 = _EMPTY_;
    private String m40706 = _EMPTY_;
    private String m40707 = _EMPTY_;
    private String m501 = _EMPTY_;
    private String m502 = _EMPTY_;
    private String m50201 = _EMPTY_;
    private String m50202 = _EMPTY_;
    private String m50203 = _EMPTY_;
    private String m50204 = _EMPTY_;
    private String m50205 = _EMPTY_;
    private String m503 = _EMPTY_;
    private String m50401 = _EMPTY_;
    private String m50402 = _EMPTY_;
    private String m601 = _EMPTY_;
    private String m602 = _EMPTY_;
    private String m60201 = _EMPTY_;
    private String m60201x = _EMPTY_;
    private String m60202 = _EMPTY_;
    private String m60202x = _EMPTY_;
    private String m60203 = _EMPTY_;
    private String m60203x = _EMPTY_;
    private String m60204 = _EMPTY_;
    private String m60204x = _EMPTY_;
    private String m60205 = _EMPTY_;
    private String m60205x = _EMPTY_;
    private String m60206 = _EMPTY_;
    private String m60206x = _EMPTY_;
    private String m60207 = _EMPTY_;
    private String m60207x = _EMPTY_;
    private String m60208 = _EMPTY_;
    private String m60208x = _EMPTY_;
    private String m701 = _EMPTY_;
    private String m702 = _EMPTY_;
    private String m70201 = _EMPTY_;
    private String m70202 = _EMPTY_;
    private String m70203 = _EMPTY_;
    private String m70204 = _EMPTY_;
    private String m70205 = _EMPTY_;
    private String m70206 = _EMPTY_;
    private String m70207 = _EMPTY_;
    private String m70208 = _EMPTY_;
    private String m70209 = _EMPTY_;
    private String m70210 = _EMPTY_;
    private String m70211 = _EMPTY_;
    private String m70296 = _EMPTY_;
    private String m70296x = _EMPTY_;
    private String m703 = _EMPTY_;
    private String m704 = _EMPTY_;
    private String m705 = _EMPTY_;
    private String m706 = _EMPTY_;
    private String m801 = _EMPTY_;
    private String m802 = _EMPTY_;
    private String m803 = _EMPTY_;
    private String m804 = _EMPTY_;
    private String m805 = _EMPTY_;
    private String m806 = _EMPTY_;
    private String m807 = _EMPTY_;
    private String m808 = _EMPTY_;
    private String m809 = _EMPTY_;
    private String m810 = _EMPTY_;
    private String m811 = _EMPTY_;
    private String m812 = _EMPTY_;
    private String m813 = _EMPTY_;
    private String m814 = _EMPTY_;
    private String m815 = _EMPTY_;


    public ModuleM() {
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
    public String getM101() {
        return m101;
    }

    public void setM101(String m101) {
        this.m101 = m101;
        setM201(m101.equals("1") ? this.m201 : "");
        setM202(m101.equals("1") ? this.m202 : "");
        setM203(m101.equals("1") ? this.m203 : "");
        setM204(m101.equals("1") ? this.m204 : "");
        setM205(m101.equals("1") ? this.m205 : "");
        setM301(m101.equals("1") ? this.m301 : "");
        notifyPropertyChanged(BR.m101);
    }

    @Bindable
    public String getM201() {
        return m201;
    }

    public void setM201(String m201) {
        this.m201 = m201;
        notifyPropertyChanged(BR.m201);
    }

    @Bindable
    public String getM202() {
        return m202;
    }

    public void setM202(String m202) {
        this.m202 = m202;
        notifyPropertyChanged(BR.m202);
    }

    @Bindable
    public String getM203() {
        return m203;
    }

    public void setM203(String m203) {
        this.m203 = m203;
        notifyPropertyChanged(BR.m203);
    }

    @Bindable
    public String getM204() {
        return m204;
    }

    public void setM204(String m204) {
        this.m204 = m204;
        notifyPropertyChanged(BR.m204);
    }

    @Bindable
    public String getM205() {
        return m205;
    }

    public void setM205(String m205) {
        this.m205 = m205;
        notifyPropertyChanged(BR.m205);
    }

    @Bindable
    public String getM301() {
        return m301;
    }

    public void setM301(String m301) {
        this.m301 = m301;
        setM302(m301.equals("1") || m301.equals("3") ? this.m302 : "");
        setM303(m301.equals("1") || m301.equals("3") ? this.m303 : "");
        notifyPropertyChanged(BR.m301);
    }

    @Bindable
    public String getM302() {
        return m302;
    }

    public void setM302(String m302) {
        this.m302 = m302;
        notifyPropertyChanged(BR.m302);
    }

    @Bindable
    public String getM303() {
        return m303;
    }

    public void setM303(String m303) {
        this.m303 = m303;
        notifyPropertyChanged(BR.m303);
    }

    @Bindable
    public String getM401() {
        return m401;
    }

    public void setM401(String m401) {
        this.m401 = m401;
        notifyPropertyChanged(BR.m401);
    }

    @Bindable
    public String getM402() {
        return m402;
    }

    public void setM402(String m402) {
        this.m402 = m402;
        notifyPropertyChanged(BR.m402);
    }

    @Bindable
    public String getM403() {
        return m403;
    }

    public void setM403(String m403) {
        this.m403 = m403;
        notifyPropertyChanged(BR.m403);
    }

    @Bindable
    public String getM404() {
        return m404;
    }

    public void setM404(String m404) {
        this.m404 = m404;
        notifyPropertyChanged(BR.m404);
    }

    @Bindable
    public String getM40401() {
        return m40401;
    }

    public void setM40401(String m40401) {
        this.m40401 = m40401;
        notifyPropertyChanged(BR.m40401);
    }

    @Bindable
    public String getM40402() {
        return m40402;
    }

    public void setM40402(String m40402) {
        this.m40402 = m40402;
        notifyPropertyChanged(BR.m40402);
    }

    @Bindable
    public String getM40403() {
        return m40403;
    }

    public void setM40403(String m40403) {
        this.m40403 = m40403;
        notifyPropertyChanged(BR.m40403);
    }

    @Bindable
    public String getM40404() {
        return m40404;
    }

    public void setM40404(String m40404) {
        this.m40404 = m40404;
        notifyPropertyChanged(BR.m40404);
    }

    @Bindable
    public String getM405() {
        return m405;
    }

    public void setM405(String m405) {
        this.m405 = m405;
        notifyPropertyChanged(BR.m405);
    }

    @Bindable
    public String getM406() {
        return m406;
    }

    public void setM406(String m406) {
        this.m406 = m406;
        notifyPropertyChanged(BR.m406);
    }

    @Bindable
    public String getM407() {
        return m407;
    }

    public void setM407(String m407) {
        this.m407 = m407;
        notifyPropertyChanged(BR.m407);
    }

    @Bindable
    public String getM40701() {
        return m40701;
    }

    public void setM40701(String m40701) {
        this.m40701 = m40701;
        notifyPropertyChanged(BR.m40701);
    }

    @Bindable
    public String getM40702() {
        return m40702;
    }

    public void setM40702(String m40702) {
        this.m40702 = m40702;
        notifyPropertyChanged(BR.m40702);
    }

    @Bindable
    public String getM40703() {
        return m40703;
    }

    public void setM40703(String m40703) {
        this.m40703 = m40703;
        notifyPropertyChanged(BR.m40703);
    }

    @Bindable
    public String getM40704() {
        return m40704;
    }

    public void setM40704(String m40704) {
        this.m40704 = m40704;
        notifyPropertyChanged(BR.m40704);
    }

    @Bindable
    public String getM40706() {
        return m40706;
    }

    public void setM40706(String m40706) {
        this.m40706 = m40706;
        notifyPropertyChanged(BR.m40706);
    }

    @Bindable
    public String getM40707() {
        return m40707;
    }

    public void setM40707(String m40707) {
        this.m40707 = m40707;
        notifyPropertyChanged(BR.m40707);
    }

    @Bindable
    public String getM501() {
        return m501;
    }

    public void setM501(String m501) {
        this.m501 = m501;
        notifyPropertyChanged(BR.m501);
    }

    @Bindable
    public String getM502() {
        return m502;
    }

    public void setM502(String m502) {
        this.m502 = m502;
        notifyPropertyChanged(BR.m502);
    }

    @Bindable
    public String getM50201() {
        return m50201;
    }

    public void setM50201(String m50201) {
        this.m50201 = m50201;
        notifyPropertyChanged(BR.m50201);
    }

    @Bindable
    public String getM50202() {
        return m50202;
    }

    public void setM50202(String m50202) {
        this.m50202 = m50202;
        notifyPropertyChanged(BR.m50202);
    }

    @Bindable
    public String getM50203() {
        return m50203;
    }

    public void setM50203(String m50203) {
        this.m50203 = m50203;
        notifyPropertyChanged(BR.m50203);
    }

    @Bindable
    public String getM50204() {
        return m50204;
    }

    public void setM50204(String m50204) {
        this.m50204 = m50204;
        notifyPropertyChanged(BR.m50204);
    }

    @Bindable
    public String getM50205() {
        return m50205;
    }

    public void setM50205(String m50205) {
        this.m50205 = m50205;
        notifyPropertyChanged(BR.m50205);
    }

    @Bindable
    public String getM503() {
        return m503;
    }

    public void setM503(String m503) {
        this.m503 = m503;
        notifyPropertyChanged(BR.m503);
    }

    @Bindable
    public String getM50401() {
        return m50401;
    }

    public void setM50401(String m50401) {
        this.m50401 = m50401;
        notifyPropertyChanged(BR.m50401);
    }

    @Bindable
    public String getM50402() {
        return m50402;
    }

    public void setM50402(String m50402) {
        this.m50402 = m50402;
        notifyPropertyChanged(BR.m50402);
    }

    @Bindable
    public String getM601() {
        return m601;
    }

    public void setM601(String m601) {
        this.m601 = m601;
        notifyPropertyChanged(BR.m601);
    }

    @Bindable
    public String getM602() {
        return m602;
    }

    public void setM602(String m602) {
        this.m602 = m602;
        notifyPropertyChanged(BR.m602);
    }

    @Bindable
    public String getM60201() {
        return m60201;
    }

    public void setM60201(String m60201) {
        this.m60201 = m60201;
        notifyPropertyChanged(BR.m60201);
    }

    @Bindable
    public String getM60201x() {
        return m60201x;
    }

    public void setM60201x(String m60201x) {
        this.m60201x = m60201x;
        notifyPropertyChanged(BR.m60201x);
    }

    @Bindable
    public String getM60202() {
        return m60202;
    }

    public void setM60202(String m60202) {
        this.m60202 = m60202;
        notifyPropertyChanged(BR.m60202);
    }

    @Bindable
    public String getM60202x() {
        return m60202x;
    }

    public void setM60202x(String m60202x) {
        this.m60202x = m60202x;
        notifyPropertyChanged(BR.m60202x);
    }

    @Bindable
    public String getM60203() {
        return m60203;
    }

    public void setM60203(String m60203) {
        this.m60203 = m60203;
        notifyPropertyChanged(BR.m60203);
    }

    @Bindable
    public String getM60203x() {
        return m60203x;
    }

    public void setM60203x(String m60203x) {
        this.m60203x = m60203x;
        notifyPropertyChanged(BR.m60203x);
    }

    @Bindable
    public String getM60204() {
        return m60204;
    }

    public void setM60204(String m60204) {
        this.m60204 = m60204;
        notifyPropertyChanged(BR.m60204);
    }

    @Bindable
    public String getM60204x() {
        return m60204x;
    }

    public void setM60204x(String m60204x) {
        this.m60204x = m60204x;
        notifyPropertyChanged(BR.m60204x);
    }

    @Bindable
    public String getM60205() {
        return m60205;
    }

    public void setM60205(String m60205) {
        this.m60205 = m60205;
        notifyPropertyChanged(BR.m60205);
    }

    @Bindable
    public String getM60205x() {
        return m60205x;
    }

    public void setM60205x(String m60205x) {
        this.m60205x = m60205x;
        notifyPropertyChanged(BR.m60205x);
    }

    @Bindable
    public String getM60206() {
        return m60206;
    }

    public void setM60206(String m60206) {
        this.m60206 = m60206;
        notifyPropertyChanged(BR.m60206);
    }

    @Bindable
    public String getM60206x() {
        return m60206x;
    }

    public void setM60206x(String m60206x) {
        this.m60206x = m60206x;
        notifyPropertyChanged(BR.m60206x);
    }

    @Bindable
    public String getM60207() {
        return m60207;
    }

    public void setM60207(String m60207) {
        this.m60207 = m60207;
        notifyPropertyChanged(BR.m60207);
    }

    @Bindable
    public String getM60207x() {
        return m60207x;
    }

    public void setM60207x(String m60207x) {
        this.m60207x = m60207x;
        notifyPropertyChanged(BR.m60207x);
    }

    @Bindable
    public String getM60208() {
        return m60208;
    }

    public void setM60208(String m60208) {
        this.m60208 = m60208;
        notifyPropertyChanged(BR.m60208);
    }

    @Bindable
    public String getM60208x() {
        return m60208x;
    }

    public void setM60208x(String m60208x) {
        this.m60208x = m60208x;
        notifyPropertyChanged(BR.m60208x);
    }

    @Bindable
    public String getM701() {
        return m701;
    }

    public void setM701(String m701) {
        this.m701 = m701;
        notifyPropertyChanged(BR.m701);
    }

    @Bindable
    public String getM702() {
        return m702;
    }

    public void setM702(String m702) {
        this.m702 = m702;
        notifyPropertyChanged(BR.m702);
    }

    @Bindable
    public String getM70201() {
        return m70201;
    }

    public void setM70201(String m70201) {
        this.m70201 = m70201;
        notifyPropertyChanged(BR.m70201);
    }

    @Bindable
    public String getM70202() {
        return m70202;
    }

    public void setM70202(String m70202) {
        this.m70202 = m70202;
        notifyPropertyChanged(BR.m70202);
    }

    @Bindable
    public String getM70203() {
        return m70203;
    }

    public void setM70203(String m70203) {
        this.m70203 = m70203;
        notifyPropertyChanged(BR.m70203);
    }

    @Bindable
    public String getM70204() {
        return m70204;
    }

    public void setM70204(String m70204) {
        this.m70204 = m70204;
        notifyPropertyChanged(BR.m70204);
    }

    @Bindable
    public String getM70205() {
        return m70205;
    }

    public void setM70205(String m70205) {
        this.m70205 = m70205;
        notifyPropertyChanged(BR.m70205);
    }

    @Bindable
    public String getM70206() {
        return m70206;
    }

    public void setM70206(String m70206) {
        this.m70206 = m70206;
        notifyPropertyChanged(BR.m70206);
    }

    @Bindable
    public String getM70207() {
        return m70207;
    }

    public void setM70207(String m70207) {
        this.m70207 = m70207;
        notifyPropertyChanged(BR.m70207);
    }

    @Bindable
    public String getM70208() {
        return m70208;
    }

    public void setM70208(String m70208) {
        this.m70208 = m70208;
        notifyPropertyChanged(BR.m70208);
    }

    @Bindable
    public String getM70209() {
        return m70209;
    }

    public void setM70209(String m70209) {
        this.m70209 = m70209;
        notifyPropertyChanged(BR.m70209);
    }

    @Bindable
    public String getM70210() {
        return m70210;
    }

    public void setM70210(String m70210) {
        this.m70210 = m70210;
        notifyPropertyChanged(BR.m70210);
    }

    @Bindable
    public String getM70211() {
        return m70211;
    }

    public void setM70211(String m70211) {
        this.m70211 = m70211;
        notifyPropertyChanged(BR.m70211);
    }

    @Bindable
    public String getM70296() {
        return m70296;
    }

    public void setM70296(String m70296) {
        this.m70296 = m70296;
        notifyPropertyChanged(BR.m70296);
    }

    @Bindable
    public String getM70296x() {
        return m70296x;
    }

    public void setM70296x(String m70296x) {
        this.m70296x = m70296x;
        notifyPropertyChanged(BR.m70296x);
    }

    @Bindable
    public String getM703() {
        return m703;
    }

    public void setM703(String m703) {
        this.m703 = m703;
        notifyPropertyChanged(BR.m703);
    }

    @Bindable
    public String getM704() {
        return m704;
    }

    public void setM704(String m704) {
        this.m704 = m704;
        notifyPropertyChanged(BR.m704);
    }

    @Bindable
    public String getM705() {
        return m705;
    }

    public void setM705(String m705) {
        this.m705 = m705;
        notifyPropertyChanged(BR.m705);
    }

    @Bindable
    public String getM706() {
        return m706;
    }

    public void setM706(String m706) {
        this.m706 = m706;
        notifyPropertyChanged(BR.m706);
    }

    @Bindable
    public String getM801() {
        return m801;
    }

    public void setM801(String m801) {
        this.m801 = m801;
        notifyPropertyChanged(BR.m801);
    }

    @Bindable
    public String getM802() {
        return m802;
    }

    public void setM802(String m802) {
        this.m802 = m802;
        notifyPropertyChanged(BR.m802);
    }

    @Bindable
    public String getM803() {
        return m803;
    }

    public void setM803(String m803) {
        this.m803 = m803;
        notifyPropertyChanged(BR.m803);
    }

    @Bindable
    public String getM804() {
        return m804;
    }

    public void setM804(String m804) {
        this.m804 = m804;
        notifyPropertyChanged(BR.m804);
    }

    @Bindable
    public String getM805() {
        return m805;
    }

    public void setM805(String m805) {
        this.m805 = m805;
        notifyPropertyChanged(BR.m805);
    }

    @Bindable
    public String getM806() {
        return m806;
    }

    public void setM806(String m806) {
        this.m806 = m806;
        notifyPropertyChanged(BR.m806);
    }

    @Bindable
    public String getM807() {
        return m807;
    }

    public void setM807(String m807) {
        this.m807 = m807;
        notifyPropertyChanged(BR.m807);
    }

    @Bindable
    public String getM808() {
        return m808;
    }

    public void setM808(String m808) {
        this.m808 = m808;
        notifyPropertyChanged(BR.m808);
    }

    @Bindable
    public String getM809() {
        return m809;
    }

    public void setM809(String m809) {
        this.m809 = m809;
        notifyPropertyChanged(BR.m809);
    }

    @Bindable
    public String getM810() {
        return m810;
    }

    public void setM810(String m810) {
        this.m810 = m810;
        notifyPropertyChanged(BR.m810);
    }

    @Bindable
    public String getM811() {
        return m811;
    }

    public void setM811(String m811) {
        this.m811 = m811;
        notifyPropertyChanged(BR.m811);
    }

    @Bindable
    public String getM812() {
        return m812;
    }

    public void setM812(String m812) {
        this.m812 = m812;
        notifyPropertyChanged(BR.m812);
    }

    @Bindable
    public String getM813() {
        return m813;
    }

    public void setM813(String m813) {
        this.m813 = m813;
        notifyPropertyChanged(BR.m813);
    }

    @Bindable
    public String getM814() {
        return m814;
    }

    public void setM814(String m814) {
        this.m814 = m814;
        notifyPropertyChanged(BR.m814);
    }

    @Bindable
    public String getM815() {
        return m815;
    }

    public void setM815(String m815) {
        this.m815 = m815;
        notifyPropertyChanged(BR.m815);
    }


    public ModuleM Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_UUID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_SYNCED_DATE));
        sM123Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_SM123)));
        sM4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_SM4)));
        sM5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_SM5)));
        sM6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_SM6)));
        sM7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_SM7)));
        sM8Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleMTable.COLUMN_SM8)));
        return this;
    }

    public void sM123Hydrate(String string) throws JSONException {
        Log.d(TAG, "sM123Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.m101 = json.getString("m101");
            this.m201 = json.getString("m201");
            this.m202 = json.getString("m202");
            this.m203 = json.getString("m203");
            this.m204 = json.getString("m204");
            this.m205 = json.getString("m205");
            this.m301 = json.getString("m301");
            this.m302 = json.getString("m302");
            this.m303 = json.getString("m303");
        }
    }

    public void sM4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sM2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.m401 = json.getString("m401");
            this.m402 = json.getString("m402");
            this.m403 = json.getString("m403");
            this.m404 = json.getString("m404");
            this.m40401 = json.getString("m40401");
            this.m40402 = json.getString("m40402");
            this.m40403 = json.getString("m40403");
            this.m40404 = json.getString("m40404");
            this.m405 = json.getString("m405");
            this.m406 = json.getString("m406");
            this.m407 = json.getString("m407");
            this.m40701 = json.getString("m40701");
            this.m40702 = json.getString("m40702");
            this.m40703 = json.getString("m40703");
            this.m40704 = json.getString("m40704");
            this.m40706 = json.getString("m40706");
            this.m40707 = json.getString("m40707");
        }
    }

    public void sM5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sM5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.m501 = json.getString("m501");
            this.m502 = json.getString("m502");
            this.m50201 = json.getString("m50201");
            this.m50202 = json.getString("m50202");
            this.m50203 = json.getString("m50203");
            this.m50204 = json.getString("m50204");
            this.m50205 = json.getString("m50205");
            this.m503 = json.getString("m503");
            this.m50401 = json.getString("m50401");
            this.m50402 = json.getString("m50402");
        }
    }

    public void sM6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sM6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.m601 = json.getString("m601");
            this.m602 = json.getString("m602");
            this.m60201 = json.getString("m60201");
            this.m60201x = json.getString("m60201x");
            this.m60202 = json.getString("m60202");
            this.m60202x = json.getString("m60202x");
            this.m60203 = json.getString("m60203");
            this.m60203x = json.getString("m60203x");
            this.m60204 = json.getString("m60204");
            this.m60204x = json.getString("m60204x");
            this.m60205 = json.getString("m60205");
            this.m60205x = json.getString("m60205x");
            this.m60206 = json.getString("m60206");
            this.m60206x = json.getString("m60206x");
            this.m60207 = json.getString("m60207");
            this.m60207x = json.getString("m60207x");
            this.m60208 = json.getString("m60208");
            this.m60208x = json.getString("m60208x");
        }
    }

    public void sM7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sM7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.m701 = json.getString("m701");
            this.m702 = json.getString("m702");
            this.m70201 = json.getString("m70201");
            this.m70202 = json.getString("m70202");
            this.m70203 = json.getString("m70203");
            this.m70204 = json.getString("m70204");
            this.m70205 = json.getString("m70205");
            this.m70206 = json.getString("m70206");
            this.m70207 = json.getString("m70207");
            this.m70208 = json.getString("m70208");
            this.m70209 = json.getString("m70209");
            this.m70210 = json.getString("m70210");
            this.m70211 = json.getString("m70211");
            this.m70296 = json.getString("m70296");
            this.m70296x = json.getString("m70296x");
            this.m703 = json.getString("m703");
            this.m704 = json.getString("m704");
            this.m705 = json.getString("m705");
            this.m706 = json.getString("m706");
        }
    }

    public void sM8Hydrate(String string) throws JSONException {
        Log.d(TAG, "sK62Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.m801 = json.getString("m801");
            this.m802 = json.getString("m802");
            this.m803 = json.getString("m803");
            this.m804 = json.getString("m804");
            this.m805 = json.getString("m805");
            this.m806 = json.getString("m806");
            this.m807 = json.getString("m807");
            this.m808 = json.getString("m808");
            this.m809 = json.getString("m809");
            this.m810 = json.getString("m810");
            this.m811 = json.getString("m811");
            this.m812 = json.getString("m812");
            this.m813 = json.getString("m813");
            this.m814 = json.getString("m814");
            this.m815 = json.getString("m815");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(ModuleMTable.COLUMN_ID, this.id);
        json.put(ModuleMTable.COLUMN_UID, this.uid);
        json.put(ModuleMTable.COLUMN_UUID, this.uuid);
        json.put(ModuleMTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(ModuleMTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(ModuleMTable.COLUMN_UC_CODE, this.ucCode);
        json.put(ModuleMTable.COLUMN_HF_CODE, this.hfCode);
        json.put(ModuleMTable.COLUMN_USERNAME, this.userName);
        json.put(ModuleMTable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleMTable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleMTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleMTable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleMTable.COLUMN_SYNCED, this.synced);
        json.put(ModuleMTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleMTable.COLUMN_SM123, new JSONObject(sM123toString()));
        json.put(ModuleMTable.COLUMN_SM4, new JSONObject(sM4toString()));
        json.put(ModuleMTable.COLUMN_SM5, new JSONObject(sM5toString()));
        json.put(ModuleMTable.COLUMN_SM6, new JSONObject(sM6toString()));
        json.put(ModuleMTable.COLUMN_SM7, new JSONObject(sM7toString()));
        json.put(ModuleMTable.COLUMN_SM8, new JSONObject(sM8toString()));
        return json;
    }

    public String sM123toString() throws JSONException {
        Log.d(TAG, "sM123toString: ");
        JSONObject json = new JSONObject();
        json.put("m101", m101)
                .put("m201", m201)
                .put("m202", m202)
                .put("m203", m203)
                .put("m204", m204)
                .put("m205", m205)
                .put("m301", m301)
                .put("m302", m302)
                .put("m303", m303);
        return json.toString();
    }

    public String sM4toString() throws JSONException {
        Log.d(TAG, "sM4toString: ");
        JSONObject json = new JSONObject();
        json.put("m401", m401)
                .put("m402", m402)
                .put("m403", m403)
                .put("m404", m404)
                .put("m40401", m40401)
                .put("m40402", m40402)
                .put("m40403", m40403)
                .put("m40404", m40404)
                .put("m405", m405)
                .put("m406", m406)
                .put("m407", m407)
                .put("m40701", m40701)
                .put("m40702", m40702)
                .put("m40703", m40703)
                .put("m40704", m40704)
                .put("m40706", m40706)
                .put("m40707", m40707);
        return json.toString();
    }

    public String sM5toString() throws JSONException {
        Log.d(TAG, "sM5toString: ");
        JSONObject json = new JSONObject();
        json.put("m501", m501)
                .put("m502", m502)
                .put("m50201", m50201)
                .put("m50202", m50202)
                .put("m50203", m50203)
                .put("m50204", m50204)
                .put("m50205", m50205)
                .put("m503", m503)
                .put("m50401", m50401)
                .put("m50402", m50402);
        return json.toString();
    }

    public String sM6toString() throws JSONException {
        Log.d(TAG, "sM6toString: ");
        JSONObject json = new JSONObject();
        json.put("m601", m601)
                .put("m602", m602)
                .put("m60201", m60201)
                .put("m60201x", m60201x)
                .put("m60202", m60202)
                .put("m60202x", m60202x)
                .put("m60203", m60203)
                .put("m60203x", m60203x)
                .put("m60204", m60204)
                .put("m60204x", m60204x)
                .put("m60205", m60205)
                .put("m60205x", m60205x)
                .put("m60206", m60206)
                .put("m60206x", m60206x)
                .put("m60207", m60207)
                .put("m60207x", m60207x)
                .put("m60208", m60208)
                .put("m60208x", m60208x);
        return json.toString();
    }

    public String sM7toString() throws JSONException {
        Log.d(TAG, "sM7toString: ");
        JSONObject json = new JSONObject();
        json.put("m701", m701)
                .put("m702", m702)
                .put("m70201", m70201)
                .put("m70202", m70202)
                .put("m70203", m70203)
                .put("m70204", m70204)
                .put("m70205", m70205)
                .put("m70206", m70206)
                .put("m70207", m70207)
                .put("m70208", m70208)
                .put("m70209", m70209)
                .put("m70210", m70210)
                .put("m70211", m70211)
                .put("m70296", m70296)
                .put("m70296x", m70296x)
                .put("m703", m703)
                .put("m704", m704)
                .put("m705", m705)
                .put("m706", m706);
        return json.toString();
    }

    public String sM8toString() throws JSONException {
        Log.d(TAG, "sM8toString: ");
        JSONObject json = new JSONObject();
        json.put("m801", m801)
                .put("m802", m802)
                .put("m803", m803)
                .put("m804", m804)
                .put("m805", m805)
                .put("m806", m806)
                .put("m807", m807)
                .put("m808", m808)
                .put("m809", m809)
                .put("m810", m810)
                .put("m811", m811)
                .put("m812", m812)
                .put("m813", m813)
                .put("m814", m814)
                .put("m815", m815);
        return json.toString();
    }


}
