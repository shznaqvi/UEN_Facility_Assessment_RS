package edu.aku.hassannaqvi.uen_facility_assessment.models;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.districtName;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.hfName;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.selectedDistrict;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.selectedHf;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.selectedTehsil;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.selectedUc;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.tehsilName;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.ucName;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.uen_facility_assessment.BR;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class Form extends BaseObservable implements Observable {

    private final String TAG = "Form";

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

    private String districtCode = _EMPTY_;
    private String tehsilCode = _EMPTY_;
    private String ucCode = _EMPTY_;
    private String hfCode = _EMPTY_;


    // FIELD VARIABLES
    private String a01 = StringUtils.EMPTY;
    private String a03d = StringUtils.EMPTY;
    private String a03m = StringUtils.EMPTY;
    private String a03y = StringUtils.EMPTY;
    private String a07 = StringUtils.EMPTY;
    private String a08 = StringUtils.EMPTY;
    private String a09 = StringUtils.EMPTY;
    private String a10 = StringUtils.EMPTY;
    private String a11 = StringUtils.EMPTY;
    private String a12 = StringUtils.EMPTY;
    private String a13 = StringUtils.EMPTY;
    private String a14 = StringUtils.EMPTY;
    private String a15 = StringUtils.EMPTY;
    private String a16 = StringUtils.EMPTY;
    private String a17 = StringUtils.EMPTY;
    private String a18 = StringUtils.EMPTY;
    private String a18xx = StringUtils.EMPTY;
    private String a19 = StringUtils.EMPTY;
    private String a19xx = StringUtils.EMPTY;
    private String a20 = StringUtils.EMPTY;
    private String a21 = StringUtils.EMPTY;
    private String a22 = StringUtils.EMPTY;
    private String b01 = StringUtils.EMPTY;
    private String b02 = StringUtils.EMPTY;
    private String b03 = StringUtils.EMPTY;
    private String b04 = StringUtils.EMPTY;
    private String b05 = StringUtils.EMPTY;


    public Form() {
    }

    public void populateMeta() {
        setProjectName(PROJECT_NAME);
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setUserName(MainApp.user.getUserName());
        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setDistrictCode(selectedDistrict);
        setTehsilCode(selectedTehsil);
        setUcCode(selectedUc);
        setHfCode(selectedHf);
        setA12(selectedHf);
        setA07(districtName);
        setA08(tehsilName);
        setA09(ucName);
        setA13(hfName);
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
        setA18xx(a18.equals("96") ? this.a18xx : "");
        setA19(a18.equals("2") ? this.a19 : "");
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
        setA19xx(a19.equals("96") ? this.a19xx : "");
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
        setB03(b02.equals("1") ? this.b03 : "");
        setB04(b02.equals("1") ? this.b04 : "");
        setB05(b02.equals("1") ? this.b05 : "");
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


    public Form Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));
        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA)));
        sBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB)));
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


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
//        json.put(FormsTable.COLUMN_CLUSTER, this.cluster);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(FormsTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(FormsTable.COLUMN_UC_CODE, this.ucCode);
        json.put(FormsTable.COLUMN_HF_CODE, this.hfCode);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);

        // Household
        json.put(FormsTable.COLUMN_SA, new JSONObject(sAtoString()));
        json.put(FormsTable.COLUMN_SB, new JSONObject(sBtoString()));

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


}
