package edu.aku.hassannaqvi.uen_facility_assessment.models;

import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.selectedDistrict;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.selectedHf;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.selectedTehsil;
import static edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp.selectedUc;

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
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleKTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;


public class ModuleK extends BaseObservable implements Observable {

    private final String TAG = "ModuleK";
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
    private String k101 = _EMPTY_;
    private String k101a = _EMPTY_;
    private String k101ba = _EMPTY_;
    private String k101ba03 = _EMPTY_;
    private String k101bb = _EMPTY_;
    private String k101bb03 = _EMPTY_;
    private String k101bc = _EMPTY_;
    private String k101bc03 = _EMPTY_;
    private String k101bd = _EMPTY_;
    private String k101bd03 = _EMPTY_;
    private String k101be = _EMPTY_;
    private String k101be03 = _EMPTY_;
    private String k101bf = _EMPTY_;
    private String k101bf03 = _EMPTY_;
    private String k101bg = _EMPTY_;
    private String k101bg03 = _EMPTY_;
    private String k101b96 = _EMPTY_;
    private String k101b9603x = _EMPTY_;
    private String k101b9604 = _EMPTY_;
    private String k102 = _EMPTY_;
    private String k10296x = _EMPTY_;
    private String k103 = _EMPTY_;
    private String k104 = _EMPTY_;
    private String k201 = _EMPTY_;
    private String k202 = _EMPTY_;
    private String k203 = _EMPTY_;
    private String k204 = _EMPTY_;
    private String k301 = _EMPTY_;
    private String k302 = _EMPTY_;
    private String k303 = _EMPTY_;
    private String k304 = _EMPTY_;
    private String k305 = _EMPTY_;
    private String k306 = _EMPTY_;
    private String k307 = _EMPTY_;
    private String k30704x = _EMPTY_;
    private String k308 = _EMPTY_;
    private String k401 = _EMPTY_;
    private String k402 = _EMPTY_;
    private String k403 = _EMPTY_;
    private String k404 = _EMPTY_;
    private String k405 = _EMPTY_;
    private String k406 = _EMPTY_;
    private String k407 = _EMPTY_;
    private String k408 = _EMPTY_;
    private String k409 = _EMPTY_;
    private String k410 = _EMPTY_;
    private String k411 = _EMPTY_;
    private String k41101 = _EMPTY_;
    private String k41102 = _EMPTY_;
    private String k41103 = _EMPTY_;
    private String k41201 = _EMPTY_;
    private String k41202 = _EMPTY_;
    private String k41203 = _EMPTY_;
    private String k41204 = _EMPTY_;
    private String k41205 = _EMPTY_;
    private String k41206 = _EMPTY_;
    private String k41207 = _EMPTY_;
    private String k41301 = _EMPTY_;
    private String k41302 = _EMPTY_;
    private String k41303 = _EMPTY_;
    private String k414 = _EMPTY_;
    private String k41401 = _EMPTY_;
    private String k41402 = _EMPTY_;
    private String k41403 = _EMPTY_;
    private String k41404 = _EMPTY_;
    private String k41405 = _EMPTY_;
    private String k41406 = _EMPTY_;
    private String k41407 = _EMPTY_;
    private String k41408 = _EMPTY_;
    private String k41409 = _EMPTY_;
    private String k415 = _EMPTY_;
    private String k416 = _EMPTY_;
    private String k417 = _EMPTY_;
    private String k41796x = _EMPTY_;
    private String k418 = _EMPTY_;
    private String k419 = _EMPTY_;
    private String k41901 = _EMPTY_;
    private String k41902 = _EMPTY_;
    private String k41903 = _EMPTY_;
    private String k41904 = _EMPTY_;
    private String k41905 = _EMPTY_;
    private String k41906 = _EMPTY_;
    private String k41907 = _EMPTY_;
    private String k601 = _EMPTY_;
    private String k601dx = _EMPTY_;
    private String k601ex = _EMPTY_;
    private String k602 = _EMPTY_;
    private String k602dx = _EMPTY_;
    private String k602ex = _EMPTY_;
    private String k603 = _EMPTY_;
    private String k603dx = _EMPTY_;
    private String k603ex = _EMPTY_;
    private String k604 = _EMPTY_;
    private String k604dx = _EMPTY_;
    private String k604ex = _EMPTY_;
    private String k605 = _EMPTY_;
    private String k605dx = _EMPTY_;
    private String k605ex = _EMPTY_;
    private String k606 = _EMPTY_;
    private String k606dx = _EMPTY_;
    private String k606ex = _EMPTY_;
    private String k607 = _EMPTY_;
    private String k607dx = _EMPTY_;
    private String k607ex = _EMPTY_;
    private String k608 = _EMPTY_;
    private String k608dx = _EMPTY_;
    private String k608ex = _EMPTY_;
    private String k609 = _EMPTY_;
    private String k609dx = _EMPTY_;
    private String k609ex = _EMPTY_;
    private String k610 = _EMPTY_;
    private String k610dx = _EMPTY_;
    private String k610ex = _EMPTY_;
    private String k611 = _EMPTY_;
    private String k611dx = _EMPTY_;
    private String k611ex = _EMPTY_;
    private String k612 = _EMPTY_;
    private String k612dx = _EMPTY_;
    private String k612ex = _EMPTY_;
    private String k613 = _EMPTY_;
    private String k613dx = _EMPTY_;
    private String k613ex = _EMPTY_;
    private String k614 = _EMPTY_;
    private String k614dx = _EMPTY_;
    private String k614ex = _EMPTY_;
    private String k615 = _EMPTY_;
    private String k615dx = _EMPTY_;
    private String k615ex = _EMPTY_;
    private String k616 = _EMPTY_;
    private String k616dx = _EMPTY_;
    private String k616ex = _EMPTY_;
    private String k617 = _EMPTY_;
    private String k617dx = _EMPTY_;
    private String k617ex = _EMPTY_;
    private String k618 = _EMPTY_;
    private String k618dx = _EMPTY_;
    private String k618ex = _EMPTY_;
    private String k619 = _EMPTY_;
    private String k619dx = _EMPTY_;
    private String k619ex = _EMPTY_;
    private String k620 = _EMPTY_;
    private String k620dx = _EMPTY_;
    private String k620ex = _EMPTY_;
    private String k621 = _EMPTY_;
    private String k621dx = _EMPTY_;
    private String k621ex = _EMPTY_;
    private String k622 = _EMPTY_;
    private String k622dx = _EMPTY_;
    private String k622ex = _EMPTY_;
    private String k623 = _EMPTY_;
    private String k623dx = _EMPTY_;
    private String k623ex = _EMPTY_;
    private String k624 = _EMPTY_;
    private String k624dx = _EMPTY_;
    private String k624ex = _EMPTY_;
    private String k625 = _EMPTY_;
    private String k625dx = _EMPTY_;
    private String k625ex = _EMPTY_;
    private String k626 = _EMPTY_;
    private String k626dx = _EMPTY_;
    private String k626ex = _EMPTY_;
    private String k627 = _EMPTY_;
    private String k627dx = _EMPTY_;
    private String k627ex = _EMPTY_;
    private String k628 = _EMPTY_;
    private String k628dx = _EMPTY_;
    private String k628ex = _EMPTY_;
    private String k701 = _EMPTY_;
    private String k702 = _EMPTY_;
    private String k703 = _EMPTY_;
    private String k704 = _EMPTY_;
    private String k705 = _EMPTY_;
    private String k706 = _EMPTY_;
    private String k707 = _EMPTY_;
    private String k708 = _EMPTY_;
    private String k709 = _EMPTY_;
    private String k710 = _EMPTY_;
    private String k711 = _EMPTY_;


    public ModuleK() {
    }


    public void populateMeta() {
        setProjectName(PROJECT_NAME);
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.versionName + "." + MainApp.versionCode);
        setUserName(MainApp.user.getUserName());
        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUuid(MainApp.moduleA.getUid());
        setDistrictCode(selectedDistrict);
        setTehsilCode(selectedTehsil);
        setUcCode(selectedUc);
        setHfCode(selectedHf);
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
    public String getK101() {
        return k101;
    }

    public void setK101(String k101) {
        this.k101 = k101;
        notifyPropertyChanged(BR.k101);
    }

    @Bindable
    public String getK101a() {
        return k101a;
    }

    public void setK101a(String k101a) {
        this.k101a = k101a;
        notifyPropertyChanged(BR.k101a);
    }

    @Bindable
    public String getK101ba() {
        return k101ba;
    }

    public void setK101ba(String k101ba) {
        this.k101ba = k101ba;
        setK101ba03(k101ba.equals("1") ? this.k101ba03 : "");
        notifyPropertyChanged(BR.k101ba);
    }

    @Bindable
    public String getK101ba03() {
        return k101ba03;
    }

    public void setK101ba03(String k101ba03) {
        this.k101ba03 = k101ba03;
        notifyPropertyChanged(BR.k101ba03);
    }

    @Bindable
    public String getK101bb() {
        return k101bb;
    }

    public void setK101bb(String k101bb) {
        this.k101bb = k101bb;
        setK101bb03(k101bb.equals("1") ? this.k101bb03 : "");
        notifyPropertyChanged(BR.k101bb);
    }

    @Bindable
    public String getK101bb03() {
        return k101bb03;
    }

    public void setK101bb03(String k101bb03) {
        this.k101bb03 = k101bb03;
        notifyPropertyChanged(BR.k101bb03);
    }

    @Bindable
    public String getK101bc() {
        return k101bc;
    }

    public void setK101bc(String k101bc) {
        this.k101bc = k101bc;
        setK101bc03(k101bc.equals("1") ? this.k101bc03 : "");
        notifyPropertyChanged(BR.k101bc);
    }

    @Bindable
    public String getK101bc03() {
        return k101bc03;
    }

    public void setK101bc03(String k101bc03) {
        this.k101bc03 = k101bc03;
        notifyPropertyChanged(BR.k101bc03);
    }

    @Bindable
    public String getK101bd() {
        return k101bd;
    }

    public void setK101bd(String k101bd) {
        this.k101bd = k101bd;
        setK101bd03(k101bd.equals("1") ? this.k101bd03 : "");
        notifyPropertyChanged(BR.k101bd);
    }

    @Bindable
    public String getK101bd03() {
        return k101bd03;
    }

    public void setK101bd03(String k101bd03) {
        this.k101bd03 = k101bd03;
        notifyPropertyChanged(BR.k101bd03);
    }

    @Bindable
    public String getK101be() {
        return k101be;
    }

    public void setK101be(String k101be) {
        this.k101be = k101be;
        setK101be03(k101be.equals("1") ? this.k101be03 : "");
        notifyPropertyChanged(BR.k101be);
    }

    @Bindable
    public String getK101be03() {
        return k101be03;
    }

    public void setK101be03(String k101be03) {
        this.k101be03 = k101be03;
        notifyPropertyChanged(BR.k101be03);
    }

    @Bindable
    public String getK101bf() {
        return k101bf;
    }

    public void setK101bf(String k101bf) {
        this.k101bf = k101bf;
        setK101bf03(k101bf.equals("1") ? this.k101bf03 : "");
        notifyPropertyChanged(BR.k101bf);
    }

    @Bindable
    public String getK101bf03() {
        return k101bf03;
    }

    public void setK101bf03(String k101bf03) {
        this.k101bf03 = k101bf03;
        notifyPropertyChanged(BR.k101bf03);
    }

    @Bindable
    public String getK101bg() {
        return k101bg;
    }

    public void setK101bg(String k101bg) {
        this.k101bg = k101bg;
        setK101bg03(k101bg.equals("1") ? this.k101bg03 : "");
        notifyPropertyChanged(BR.k101bg);
    }

    @Bindable
    public String getK101bg03() {
        return k101bg03;
    }

    public void setK101bg03(String k101bg03) {
        this.k101bg03 = k101bg03;
        notifyPropertyChanged(BR.k101bg03);
    }

    @Bindable
    public String getK101b96() {
        return k101b96;
    }

    public void setK101b96(String k101b96) {
        this.k101b96 = k101b96;
        setK101b9603x(k101b96.equals("96") ? this.k101b9603x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k101b96);
    }

    @Bindable
    public String getK101b9603x() {
        return k101b9603x;
    }

    public void setK101b9603x(String k101b9603x) {
        this.k101b9603x = k101b9603x;
        notifyPropertyChanged(BR.k101b9603x);
    }

    @Bindable
    public String getK101b9604() {
        return k101b9604;
    }

    public void setK101b9604(String k101b9604) {
        this.k101b9604 = k101b9604;
        setK101b9604(k101b96.equals("1") ? this.k101b9604 : "");
        notifyPropertyChanged(BR.k101b9604);
    }

    @Bindable
    public String getK102() {
        return k102;
    }

    public void setK102(String k102) {
        this.k102 = k102;
        setK10296x(k102.equals("96") ? this.k10296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k102);
    }

    @Bindable
    public String getK10296x() {
        return k10296x;
    }

    public void setK10296x(String k10296x) {
        this.k10296x = k10296x;
        notifyPropertyChanged(BR.k10296x);
    }

    @Bindable
    public String getK103() {
        return k103;
    }

    public void setK103(String k103) {
        this.k103 = k103;
        notifyPropertyChanged(BR.k103);
    }

    @Bindable
    public String getK104() {
        return k104;
    }

    public void setK104(String k104) {
        this.k104 = k104;
        notifyPropertyChanged(BR.k104);
    }

    @Bindable
    public String getK201() {
        return k201;
    }

    public void setK201(String k201) {
        this.k201 = k201;
        setK202(k201.equals("1") ? this.k202 : "");
        setK203(k201.equals("1") ? this.k203 : "");
        setK204(k201.equals("1") ? this.k204 : "");
        notifyPropertyChanged(BR.k201);
    }

    @Bindable
    public String getK202() {
        return k202;
    }

    public void setK202(String k202) {
        this.k202 = k202;
        notifyPropertyChanged(BR.k202);
    }

    @Bindable
    public String getK203() {
        return k203;
    }

    public void setK203(String k203) {
        this.k203 = k203;
        notifyPropertyChanged(BR.k203);
    }

    @Bindable
    public String getK204() {
        return k204;
    }

    public void setK204(String k204) {
        this.k204 = k204;
        notifyPropertyChanged(BR.k204);
    }

    @Bindable
    public String getK301() {
        return k301;
    }

    public void setK301(String k301) {
        this.k301 = k301;
        setK302(k301.equals("2") ? "" : this.k302);
        setK303(k301.equals("2") ? "" : this.k303);
        notifyPropertyChanged(BR.k301);
    }

    @Bindable
    public String getK302() {
        return k302;
    }

    public void setK302(String k302) {
        this.k302 = k302;
        notifyPropertyChanged(BR.k302);
    }

    @Bindable
    public String getK303() {
        return k303;
    }

    public void setK303(String k303) {
        this.k303 = k303;
        notifyPropertyChanged(BR.k303);
    }

    @Bindable
    public String getK304() {
        return k304;
    }

    public void setK304(String k304) {
        this.k304 = k304;
        notifyPropertyChanged(BR.k304);
    }

    @Bindable
    public String getK305() {
        return k305;
    }

    public void setK305(String k305) {
        this.k305 = k305;
        notifyPropertyChanged(BR.k305);
    }

    @Bindable
    public String getK306() {
        return k306;
    }

    public void setK306(String k306) {
        this.k306 = k306;
        notifyPropertyChanged(BR.k306);
    }

    @Bindable
    public String getK307() {
        return k307;
    }

    public void setK307(String k307) {
        this.k307 = k307;
        setK30704x(k307.equals("2") || k307.equals("3") || k307.equals("4") ? this.k30704x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k307);
    }

    @Bindable
    public String getK30704x() {
        return k30704x;
    }

    public void setK30704x(String k30704x) {
        this.k30704x = k30704x;
        notifyPropertyChanged(BR.k30704x);
    }

    @Bindable
    public String getK308() {
        return k308;
    }

    public void setK308(String k308) {
        this.k308 = k308;
        notifyPropertyChanged(BR.k308);
    }

    @Bindable
    public String getK401() {
        return k401;
    }

    public void setK401(String k401) {
        this.k401 = k401;
        notifyPropertyChanged(BR.k401);
    }

    @Bindable
    public String getK402() {
        return k402;
    }

    public void setK402(String k402) {
        this.k402 = k402;
        notifyPropertyChanged(BR.k402);
    }

    @Bindable
    public String getK403() {
        return k403;
    }

    public void setK403(String k403) {
        this.k403 = k403;
        notifyPropertyChanged(BR.k403);
    }

    @Bindable
    public String getK404() {
        return k404;
    }

    public void setK404(String k404) {
        this.k404 = k404;
        notifyPropertyChanged(BR.k404);
    }

    @Bindable
    public String getK405() {
        return k405;
    }

    public void setK405(String k405) {
        this.k405 = k405;
        notifyPropertyChanged(BR.k405);
    }

    @Bindable
    public String getK406() {
        return k406;
    }

    public void setK406(String k406) {
        this.k406 = k406;
        notifyPropertyChanged(BR.k406);
    }

    @Bindable
    public String getK407() {
        return k407;
    }

    public void setK407(String k407) {
        this.k407 = k407;
        notifyPropertyChanged(BR.k407);
    }

    @Bindable
    public String getK408() {
        return k408;
    }

    public void setK408(String k408) {
        this.k408 = k408;
        notifyPropertyChanged(BR.k408);
    }

    @Bindable
    public String getK409() {
        return k409;
    }

    public void setK409(String k409) {
        this.k409 = k409;
        notifyPropertyChanged(BR.k409);
    }

    @Bindable
    public String getK410() {
        return k410;
    }

    public void setK410(String k410) {
        this.k410 = k410;
        setK41101(k410.equals("2") ? "" : this.k41101);
        setK41102(k410.equals("2") ? "" : this.k41102);
        setK41103(k410.equals("2") ? "" : this.k41103);
        setK41201(k410.equals("2") ? "" : this.k41201);
        setK41202(k410.equals("2") ? "" : this.k41202);
        setK41203(k410.equals("2") ? "" : this.k41203);
        setK41204(k410.equals("2") ? "" : this.k41204);
        setK41205(k410.equals("2") ? "" : this.k41205);
        setK41206(k410.equals("2") ? "" : this.k41206);
        setK41207(k410.equals("2") ? "" : this.k41207);
        setK41301(k410.equals("2") ? "" : this.k41301);
        setK41302(k410.equals("2") ? "" : this.k41302);
        setK41303(k410.equals("2") ? "" : this.k41303);
        setK41401(k410.equals("2") ? "" : this.k41401);
        setK41402(k410.equals("2") ? "" : this.k41402);
        setK41403(k410.equals("2") ? "" : this.k41403);
        setK41404(k410.equals("2") ? "" : this.k41404);
        setK41405(k410.equals("2") ? "" : this.k41405);
        setK41406(k410.equals("2") ? "" : this.k41406);
        setK41407(k410.equals("2") ? "" : this.k41407);
        setK41408(k410.equals("2") ? "" : this.k41408);
        setK41409(k410.equals("2") ? "" : this.k41409);
        notifyPropertyChanged(BR.k410);
    }

    @Bindable
    public String getK411() {
        return k411;
    }

    public void setK411(String k411) {
        this.k411 = k411;
        notifyPropertyChanged(BR.k411);
    }

    @Bindable
    public String getK41101() {
        return k41101;
    }

    public void setK41101(String k41101) {
        if (this.k41101.equals(k41101)) return; // for all checkboxes
        this.k41101 = k41101;
        notifyPropertyChanged(BR.k41101);
    }

    @Bindable
    public String getK41102() {
        return k41102;
    }

    public void setK41102(String k41102) {
        if (this.k41102.equals(k41102)) return; // for all checkboxes
        this.k41102 = k41102;
        notifyPropertyChanged(BR.k41102);
    }

    @Bindable
    public String getK41103() {
        return k41103;
    }

    public void setK41103(String k41103) {
        if (this.k41103.equals(k41103)) return; // for all checkboxes
        this.k41103 = k41103;
        notifyPropertyChanged(BR.k41103);
    }

    @Bindable
    public String getK41201() {
        return k41201;
    }

    public void setK41201(String k41201) {
        this.k41201 = k41201;
        notifyPropertyChanged(BR.k41201);
    }

    @Bindable
    public String getK41202() {
        return k41202;
    }

    public void setK41202(String k41202) {
        this.k41202 = k41202;
        notifyPropertyChanged(BR.k41202);
    }

    @Bindable
    public String getK41203() {
        return k41203;
    }

    public void setK41203(String k41203) {
        this.k41203 = k41203;
        notifyPropertyChanged(BR.k41203);
    }

    @Bindable
    public String getK41204() {
        return k41204;
    }

    public void setK41204(String k41204) {
        this.k41204 = k41204;
        notifyPropertyChanged(BR.k41204);
    }

    @Bindable
    public String getK41205() {
        return k41205;
    }

    public void setK41205(String k41205) {
        this.k41205 = k41205;
        notifyPropertyChanged(BR.k41205);
    }

    @Bindable
    public String getK41206() {
        return k41206;
    }

    public void setK41206(String k41206) {
        this.k41206 = k41206;
        notifyPropertyChanged(BR.k41206);
    }

    @Bindable
    public String getK41207() {
        return k41207;
    }

    public void setK41207(String k41207) {
        this.k41207 = k41207;
        notifyPropertyChanged(BR.k41207);
    }

    @Bindable
    public String getK41301() {
        return k41301;
    }

    public void setK41301(String k41301) {
        this.k41301 = k41301;
        notifyPropertyChanged(BR.k41301);
    }

    @Bindable
    public String getK41302() {
        return k41302;
    }

    public void setK41302(String k41302) {
        this.k41302 = k41302;
        notifyPropertyChanged(BR.k41302);
    }

    @Bindable
    public String getK41303() {
        return k41303;
    }

    public void setK41303(String k41303) {
        this.k41303 = k41303;
        notifyPropertyChanged(BR.k41303);
    }

    @Bindable
    public String getK414() {
        return k414;
    }

    public void setK414(String k414) {
        this.k414 = k414;
        notifyPropertyChanged(BR.k414);
    }

    @Bindable
    public String getK41401() {
        return k41401;
    }

    public void setK41401(String k41401) {
        if (this.k41401.equals(k41401)) return; // for all checkboxes
        this.k41401 = k41401;
        notifyPropertyChanged(BR.k41401);
    }

    @Bindable
    public String getK41402() {
        return k41402;
    }

    public void setK41402(String k41402) {
        if (this.k41402.equals(k41402)) return; // for all checkboxes
        this.k41402 = k41402;
        notifyPropertyChanged(BR.k41402);
    }

    @Bindable
    public String getK41403() {
        return k41403;
    }

    public void setK41403(String k41403) {
        if (this.k41403.equals(k41403)) return; // for all checkboxes
        this.k41403 = k41403;
        notifyPropertyChanged(BR.k41403);
    }

    @Bindable
    public String getK41404() {
        return k41404;
    }

    public void setK41404(String k41404) {
        if (this.k41404.equals(k41404)) return; // for all checkboxes
        this.k41404 = k41404;
        notifyPropertyChanged(BR.k41404);
    }

    @Bindable
    public String getK41405() {
        return k41405;
    }

    public void setK41405(String k41405) {
        if (this.k41405.equals(k41405)) return; // for all checkboxes
        this.k41405 = k41405;
        notifyPropertyChanged(BR.k41405);
    }

    @Bindable
    public String getK41406() {
        return k41406;
    }

    public void setK41406(String k41406) {
        if (this.k41406.equals(k41406)) return; // for all checkboxes
        this.k41406 = k41406;
        notifyPropertyChanged(BR.k41406);
    }

    @Bindable
    public String getK41407() {
        return k41407;
    }

    public void setK41407(String k41407) {
        if (this.k41407.equals(k41407)) return; // for all checkboxes
        this.k41407 = k41407;
        notifyPropertyChanged(BR.k41407);
    }

    @Bindable
    public String getK41408() {
        return k41408;
    }

    public void setK41408(String k41408) {
        if (this.k41408.equals(k41408)) return; // for all checkboxes
        this.k41408 = k41408;
        notifyPropertyChanged(BR.k41408);
    }

    @Bindable
    public String getK41409() {
        return k41409;
    }

    public void setK41409(String k41409) {
        if (this.k41409.equals(k41409)) return; // for all checkboxes
        this.k41409 = k41409;
        notifyPropertyChanged(BR.k41409);
    }

    @Bindable
    public String getK415() {
        return k415;
    }

    public void setK415(String k415) {
        this.k415 = k415;
        notifyPropertyChanged(BR.k415);
    }

    @Bindable
    public String getK416() {
        return k416;
    }

    public void setK416(String k416) {
        this.k416 = k416;
        notifyPropertyChanged(BR.k416);
    }

    @Bindable
    public String getK417() {
        return k417;
    }

    public void setK417(String k417) {
        this.k417 = k417;
        setK41796x(k417.equals("96") ? this.k41796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k417);
    }

    @Bindable
    public String getK41796x() {
        return k41796x;
    }

    public void setK41796x(String k41796x) {
        this.k41796x = k41796x;
        notifyPropertyChanged(BR.k41796x);
    }

    @Bindable
    public String getK418() {
        return k418;
    }

    public void setK418(String k418) {
        this.k418 = k418;
        notifyPropertyChanged(BR.k418);
    }

    @Bindable
    public String getK419() {
        return k419;
    }

    public void setK419(String k419) {
        this.k419 = k419;
        notifyPropertyChanged(BR.k419);
    }

    @Bindable
    public String getK41901() {
        return k41901;
    }

    public void setK41901(String k41901) {
        if (this.k41901.equals(k41901)) return; // for all checkboxes
        this.k41901 = k41901;
        notifyPropertyChanged(BR.k41901);
    }

    @Bindable
    public String getK41902() {
        return k41902;
    }

    public void setK41902(String k41902) {
        if (this.k41902.equals(k41902)) return; // for all checkboxes
        this.k41902 = k41902;
        notifyPropertyChanged(BR.k41902);
    }

    @Bindable
    public String getK41903() {
        return k41903;
    }

    public void setK41903(String k41903) {
        if (this.k41903.equals(k41903)) return; // for all checkboxes
        this.k41903 = k41903;
        notifyPropertyChanged(BR.k41903);
    }

    @Bindable
    public String getK41904() {
        return k41904;
    }

    public void setK41904(String k41904) {
        if (this.k41904.equals(k41904)) return; // for all checkboxes
        this.k41904 = k41904;
        notifyPropertyChanged(BR.k41904);
    }

    @Bindable
    public String getK41905() {
        return k41905;
    }

    public void setK41905(String k41905) {
        if (this.k41905.equals(k41905)) return; // for all checkboxes
        this.k41905 = k41905;
        notifyPropertyChanged(BR.k41905);
    }

    @Bindable
    public String getK41906() {
        return k41906;
    }

    public void setK41906(String k41906) {
        if (this.k41906.equals(k41906)) return; // for all checkboxes
        this.k41906 = k41906;
        notifyPropertyChanged(BR.k41906);
    }

    @Bindable
    public String getK41907() {
        return k41907;
    }

    public void setK41907(String k41907) {
        if (this.k41907.equals(k41907)) return; // for all checkboxes
        this.k41907 = k41907;
        notifyPropertyChanged(BR.k41907);
    }

    @Bindable
    public String getK601() {
        return k601;
    }

    public void setK601(String k601) {
        this.k601 = k601;
        setK601dx(k601.equals("2") || k601.equals("3") ? this.k601dx : ""); // for all skips, mention all skipped questions
        setK601ex(k601.equals("2") || k601.equals("3") ? this.k601ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k601);
    }

    @Bindable
    public String getK601dx() {
        return k601dx;
    }

    public void setK601dx(String k601dx) {
        this.k601dx = k601dx;
        notifyPropertyChanged(BR.k601dx);
    }

    @Bindable
    public String getK601ex() {
        return k601ex;
    }

    public void setK601ex(String k601ex) {
        this.k601ex = k601ex;
        notifyPropertyChanged(BR.k601ex);
    }

    @Bindable
    public String getK602() {
        return k602;
    }

    public void setK602(String k602) {
        this.k602 = k602;
        setK602dx(k602.equals("2") || k602.equals("3") ? this.k602dx : ""); // for all skips, mention all skipped questions
        setK602ex(k601.equals("2") || k602.equals("3") ? this.k602ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k602);
    }

    @Bindable
    public String getK602dx() {
        return k602dx;
    }

    public void setK602dx(String k602dx) {
        this.k602dx = k602dx;
        notifyPropertyChanged(BR.k602dx);
    }

    @Bindable
    public String getK602ex() {
        return k602ex;
    }

    public void setK602ex(String k602ex) {
        this.k602ex = k602ex;
        notifyPropertyChanged(BR.k602ex);
    }

    @Bindable
    public String getK603() {
        return k603;
    }

    public void setK603(String k603) {
        this.k603 = k603;
        setK603dx(k603.equals("2") || k603.equals("3") ? this.k603dx : ""); // for all skips, mention all skipped questions
        setK603ex(k603.equals("2") || k603.equals("3") ? this.k603ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k603);
    }

    @Bindable
    public String getK603dx() {
        return k603dx;
    }

    public void setK603dx(String k603dx) {
        this.k603dx = k603dx;
        notifyPropertyChanged(BR.k603dx);
    }

    @Bindable
    public String getK603ex() {
        return k603ex;
    }

    public void setK603ex(String k603ex) {
        this.k603ex = k603ex;
        notifyPropertyChanged(BR.k603ex);
    }

    @Bindable
    public String getK604() {
        return k604;
    }

    public void setK604(String k604) {
        this.k604 = k604;
        setK604dx(k604.equals("2") || k604.equals("3") ? this.k604dx : ""); // for all skips, mention all skipped questions
        setK604ex(k604.equals("2") || k604.equals("3") ? this.k604ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k604);
    }

    @Bindable
    public String getK604dx() {
        return k604dx;
    }

    public void setK604dx(String k604dx) {
        this.k604dx = k604dx;
        notifyPropertyChanged(BR.k604dx);
    }

    @Bindable
    public String getK604ex() {
        return k604ex;
    }

    public void setK604ex(String k604ex) {
        this.k604ex = k604ex;
        notifyPropertyChanged(BR.k604ex);
    }

    @Bindable
    public String getK605() {
        return k605;
    }

    public void setK605(String k605) {
        this.k605 = k605;
        setK605dx(k605.equals("2") || k605.equals("3") ? this.k605dx : ""); // for all skips, mention all skipped questions
        setK605ex(k605.equals("2") || k605.equals("3") ? this.k605ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k605);
    }

    @Bindable
    public String getK605dx() {
        return k605dx;
    }

    public void setK605dx(String k605dx) {
        this.k605dx = k605dx;
        notifyPropertyChanged(BR.k605dx);
    }

    @Bindable
    public String getK605ex() {
        return k605ex;
    }

    public void setK605ex(String k605ex) {
        this.k605ex = k605ex;
        notifyPropertyChanged(BR.k605ex);
    }

    @Bindable
    public String getK606() {
        return k606;
    }

    public void setK606(String k606) {
        this.k606 = k606;
        setK606dx(k606.equals("2") || k606.equals("3") ? this.k606dx : ""); // for all skips, mention all skipped questions
        setK606ex(k606.equals("2") || k606.equals("3") ? this.k606ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k606);
    }

    @Bindable
    public String getK606dx() {
        return k606dx;
    }

    public void setK606dx(String k606dx) {
        this.k606dx = k606dx;
        notifyPropertyChanged(BR.k606dx);
    }

    @Bindable
    public String getK606ex() {
        return k606ex;
    }

    public void setK606ex(String k606ex) {
        this.k606ex = k606ex;
        notifyPropertyChanged(BR.k606ex);
    }

    @Bindable
    public String getK607() {
        return k607;
    }

    public void setK607(String k607) {
        this.k607 = k607;
        setK607dx(k607.equals("2") || k607.equals("3") ? this.k607dx : ""); // for all skips, mention all skipped questions
        setK607ex(k607.equals("2") || k607.equals("3") ? this.k607ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k607);
    }

    @Bindable
    public String getK607dx() {
        return k607dx;
    }

    public void setK607dx(String k607dx) {
        this.k607dx = k607dx;
        notifyPropertyChanged(BR.k607dx);
    }

    @Bindable
    public String getK607ex() {
        return k607ex;
    }

    public void setK607ex(String k607ex) {
        this.k607ex = k607ex;
        notifyPropertyChanged(BR.k607ex);
    }

    @Bindable
    public String getK608() {
        return k608;
    }

    public void setK608(String k608) {
        this.k608 = k608;
        setK608dx(k608.equals("2") || k608.equals("3") ? this.k608dx : ""); // for all skips, mention all skipped questions
        setK608ex(k608.equals("2") || k608.equals("3") ? this.k608ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k608);
    }

    @Bindable
    public String getK608dx() {
        return k608dx;
    }

    public void setK608dx(String k608dx) {
        this.k608dx = k608dx;
        notifyPropertyChanged(BR.k608dx);
    }

    @Bindable
    public String getK608ex() {
        return k608ex;
    }

    public void setK608ex(String k608ex) {
        this.k608ex = k608ex;
        notifyPropertyChanged(BR.k608ex);
    }

    @Bindable
    public String getK609() {
        return k609;
    }

    public void setK609(String k609) {
        this.k609 = k609;
        setK609dx(k609.equals("2") || k609.equals("3") ? this.k609dx : ""); // for all skips, mention all skipped questions
        setK609ex(k609.equals("2") || k609.equals("3") ? this.k609ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k609);
    }

    @Bindable
    public String getK609dx() {
        return k609dx;
    }

    public void setK609dx(String k609dx) {
        this.k609dx = k609dx;
        notifyPropertyChanged(BR.k609dx);
    }

    @Bindable
    public String getK609ex() {
        return k609ex;
    }

    public void setK609ex(String k609ex) {
        this.k609ex = k609ex;
        notifyPropertyChanged(BR.k609ex);
    }

    @Bindable
    public String getK610() {
        return k610;
    }

    public void setK610(String k610) {
        this.k610 = k610;
        setK610dx(k610.equals("2") || k610.equals("3") ? this.k610dx : ""); // for all skips, mention all skipped questions
        setK610ex(k610.equals("2") || k610.equals("3") ? this.k610ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k610);
    }

    @Bindable
    public String getK610dx() {
        return k610dx;
    }

    public void setK610dx(String k610dx) {
        this.k610dx = k610dx;
        notifyPropertyChanged(BR.k610dx);
    }

    @Bindable
    public String getK610ex() {
        return k610ex;
    }

    public void setK610ex(String k610ex) {
        this.k610ex = k610ex;
        notifyPropertyChanged(BR.k610ex);
    }

    @Bindable
    public String getK611() {
        return k611;
    }

    public void setK611(String k611) {
        this.k611 = k611;
        setK611dx(k611.equals("2") || k611.equals("3") ? this.k611dx : ""); // for all skips, mention all skipped questions
        setK611ex(k611.equals("2") || k611.equals("3") ? this.k611ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k611);
    }

    @Bindable
    public String getK611dx() {
        return k611dx;
    }

    public void setK611dx(String k611dx) {
        this.k611dx = k611dx;
        notifyPropertyChanged(BR.k611dx);
    }

    @Bindable
    public String getK611ex() {
        return k611ex;
    }

    public void setK611ex(String k611ex) {
        this.k611ex = k611ex;
        notifyPropertyChanged(BR.k611ex);
    }

    @Bindable
    public String getK612() {
        return k612;
    }

    public void setK612(String k612) {
        this.k612 = k612;
        setK612dx(k612.equals("2") || k612.equals("3") ? this.k612dx : ""); // for all skips, mention all skipped questions
        setK612ex(k612.equals("2") || k612.equals("3") ? this.k612ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k612);
    }

    @Bindable
    public String getK612dx() {
        return k612dx;
    }

    public void setK612dx(String k612dx) {
        this.k612dx = k612dx;
        notifyPropertyChanged(BR.k612dx);
    }

    @Bindable
    public String getK612ex() {
        return k612ex;
    }

    public void setK612ex(String k612ex) {
        this.k612ex = k612ex;
        notifyPropertyChanged(BR.k612ex);
    }

    @Bindable
    public String getK613() {
        return k613;
    }

    public void setK613(String k613) {
        this.k613 = k613;
        setK613dx(k613.equals("2") || k613.equals("3") ? this.k613dx : ""); // for all skips, mention all skipped questions
        setK613ex(k613.equals("2") || k613.equals("3") ? this.k613ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k613);
    }

    @Bindable
    public String getK613dx() {
        return k613dx;
    }

    public void setK613dx(String k613dx) {
        this.k613dx = k613dx;
        notifyPropertyChanged(BR.k613dx);
    }

    @Bindable
    public String getK613ex() {
        return k613ex;
    }

    public void setK613ex(String k613ex) {
        this.k613ex = k613ex;
        notifyPropertyChanged(BR.k613ex);
    }

    @Bindable
    public String getK614() {
        return k614;
    }

    public void setK614(String k614) {
        this.k614 = k614;
        setK614dx(k614.equals("2") || k614.equals("3") ? this.k614dx : ""); // for all skips, mention all skipped questions
        setK614ex(k614.equals("2") || k614.equals("3") ? this.k614ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k614);
    }

    @Bindable
    public String getK614dx() {
        return k614dx;
    }

    public void setK614dx(String k614dx) {
        this.k614dx = k614dx;
        notifyPropertyChanged(BR.k614dx);
    }

    @Bindable
    public String getK614ex() {
        return k614ex;
    }

    public void setK614ex(String k614ex) {
        this.k614ex = k614ex;
        notifyPropertyChanged(BR.k614ex);
    }

    @Bindable
    public String getK615() {
        return k615;
    }

    public void setK615(String k615) {
        this.k615 = k615;
        setK615dx(k615.equals("2") || k615.equals("3") ? this.k615dx : ""); // for all skips, mention all skipped questions
        setK615ex(k615.equals("2") || k615.equals("3") ? this.k615ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k615);
    }

    @Bindable
    public String getK615dx() {
        return k615dx;
    }

    public void setK615dx(String k615dx) {
        this.k615dx = k615dx;
        notifyPropertyChanged(BR.k615dx);
    }

    @Bindable
    public String getK615ex() {
        return k615ex;
    }

    public void setK615ex(String k615ex) {
        this.k615ex = k615ex;
        notifyPropertyChanged(BR.k615ex);
    }

    @Bindable
    public String getK616() {
        return k616;
    }

    public void setK616(String k616) {
        this.k616 = k616;
        setK616dx(k616.equals("2") || k616.equals("3") ? this.k616dx : ""); // for all skips, mention all skipped questions
        setK616ex(k616.equals("2") || k616.equals("3") ? this.k616ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k616);
    }

    @Bindable
    public String getK616dx() {
        return k616dx;
    }

    public void setK616dx(String k616dx) {
        this.k616dx = k616dx;
        notifyPropertyChanged(BR.k616dx);
    }

    @Bindable
    public String getK616ex() {
        return k616ex;
    }

    public void setK616ex(String k616ex) {
        this.k616ex = k616ex;
        notifyPropertyChanged(BR.k616ex);
    }

    @Bindable
    public String getK617() {
        return k617;
    }

    public void setK617(String k617) {
        this.k617 = k617;
        setK617dx(k617.equals("2") || k617.equals("3") ? this.k617dx : ""); // for all skips, mention all skipped questions
        setK617ex(k617.equals("2") || k617.equals("3") ? this.k617ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k617);
    }

    @Bindable
    public String getK617dx() {
        return k617dx;
    }

    public void setK617dx(String k617dx) {
        this.k617dx = k617dx;
        notifyPropertyChanged(BR.k617dx);
    }

    @Bindable
    public String getK617ex() {
        return k617ex;
    }

    public void setK617ex(String k617ex) {
        this.k617ex = k617ex;
        notifyPropertyChanged(BR.k617ex);
    }

    @Bindable
    public String getK618() {
        return k618;
    }

    public void setK618(String k618) {
        this.k618 = k618;
        setK618dx(k618.equals("2") || k618.equals("3") ? this.k618dx : ""); // for all skips, mention all skipped questions
        setK618ex(k618.equals("2") || k618.equals("3") ? this.k618ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k618);
    }

    @Bindable
    public String getK618dx() {
        return k618dx;
    }

    public void setK618dx(String k618dx) {
        this.k618dx = k618dx;
        notifyPropertyChanged(BR.k618dx);
    }

    @Bindable
    public String getK618ex() {
        return k618ex;
    }

    public void setK618ex(String k618ex) {
        this.k618ex = k618ex;
        notifyPropertyChanged(BR.k618ex);
    }

    @Bindable
    public String getK619() {
        return k619;
    }

    public void setK619(String k619) {
        this.k619 = k619;
        setK619dx(k619.equals("2") || k619.equals("3") ? this.k619dx : ""); // for all skips, mention all skipped questions
        setK619ex(k619.equals("2") || k619.equals("3") ? this.k619ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k619);
    }

    @Bindable
    public String getK619dx() {
        return k619dx;
    }

    public void setK619dx(String k619dx) {
        this.k619dx = k619dx;
        notifyPropertyChanged(BR.k619dx);
    }

    @Bindable
    public String getK619ex() {
        return k619ex;
    }

    public void setK619ex(String k619ex) {
        this.k619ex = k619ex;
        notifyPropertyChanged(BR.k619ex);
    }

    @Bindable
    public String getK620() {
        return k620;
    }

    public void setK620(String k620) {
        this.k620 = k620;
        setK620dx(k620.equals("2") || k620.equals("3") ? this.k620dx : ""); // for all skips, mention all skipped questions
        setK620ex(k620.equals("2") || k620.equals("3") ? this.k620ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k620);
    }

    @Bindable
    public String getK620dx() {
        return k620dx;
    }

    public void setK620dx(String k620dx) {
        this.k620dx = k620dx;
        notifyPropertyChanged(BR.k620dx);
    }

    @Bindable
    public String getK620ex() {
        return k620ex;
    }

    public void setK620ex(String k620ex) {
        this.k620ex = k620ex;
        notifyPropertyChanged(BR.k620ex);
    }

    @Bindable
    public String getK621() {
        return k621;
    }

    public void setK621(String k621) {
        this.k621 = k621;
        setK621dx(k621.equals("2") || k621.equals("3") ? this.k621dx : ""); // for all skips, mention all skipped questions
        setK621ex(k621.equals("2") || k621.equals("3") ? this.k621ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k621);
    }

    @Bindable
    public String getK621dx() {
        return k621dx;
    }

    public void setK621dx(String k621dx) {
        this.k621dx = k621dx;
        notifyPropertyChanged(BR.k621dx);
    }

    @Bindable
    public String getK621ex() {
        return k621ex;
    }

    public void setK621ex(String k621ex) {
        this.k621ex = k621ex;
        notifyPropertyChanged(BR.k621ex);
    }

    @Bindable
    public String getK622() {
        return k622;
    }

    public void setK622(String k622) {
        this.k622 = k622;
        setK622dx(k622.equals("2") || k622.equals("3") ? this.k622dx : ""); // for all skips, mention all skipped questions
        setK622ex(k622.equals("2") || k622.equals("3") ? this.k622ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k622);
    }

    @Bindable
    public String getK622dx() {
        return k622dx;
    }

    public void setK622dx(String k622dx) {
        this.k622dx = k622dx;
        notifyPropertyChanged(BR.k622dx);
    }

    @Bindable
    public String getK622ex() {
        return k622ex;
    }

    public void setK622ex(String k622ex) {
        this.k622ex = k622ex;
        notifyPropertyChanged(BR.k622ex);
    }

    @Bindable
    public String getK623() {
        return k623;
    }

    public void setK623(String k623) {
        this.k623 = k623;
        setK623dx(k623.equals("2") || k623.equals("3") ? this.k623dx : ""); // for all skips, mention all skipped questions
        setK623ex(k623.equals("2") || k623.equals("3") ? this.k623ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k623);
    }

    @Bindable
    public String getK623dx() {
        return k623dx;
    }

    public void setK623dx(String k623dx) {
        this.k623dx = k623dx;
        notifyPropertyChanged(BR.k623dx);
    }

    @Bindable
    public String getK623ex() {
        return k623ex;
    }

    public void setK623ex(String k623ex) {
        this.k623ex = k623ex;
        notifyPropertyChanged(BR.k623ex);
    }

    @Bindable
    public String getK624() {
        return k624;
    }

    public void setK624(String k624) {
        this.k624 = k624;
        setK624dx(k624.equals("2") || k624.equals("3") ? this.k624dx : ""); // for all skips, mention all skipped questions
        setK624ex(k624.equals("2") || k624.equals("3") ? this.k624ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k624);
    }

    @Bindable
    public String getK624dx() {
        return k624dx;
    }

    public void setK624dx(String k624dx) {
        this.k624dx = k624dx;
        notifyPropertyChanged(BR.k624dx);
    }

    @Bindable
    public String getK624ex() {
        return k624ex;
    }

    public void setK624ex(String k624ex) {
        this.k624ex = k624ex;
        notifyPropertyChanged(BR.k624ex);
    }

    @Bindable
    public String getK625() {
        return k625;
    }

    public void setK625(String k625) {
        this.k625 = k625;
        setK625dx(k625.equals("2") || k625.equals("3") ? this.k625dx : ""); // for all skips, mention all skipped questions
        setK625ex(k625.equals("2") || k625.equals("3") ? this.k625ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k625);
    }

    @Bindable
    public String getK625dx() {
        return k625dx;
    }

    public void setK625dx(String k625dx) {
        this.k625dx = k625dx;
        notifyPropertyChanged(BR.k625dx);
    }

    @Bindable
    public String getK625ex() {
        return k625ex;
    }

    public void setK625ex(String k625ex) {
        this.k625ex = k625ex;
        notifyPropertyChanged(BR.k625ex);
    }

    @Bindable
    public String getK626() {
        return k626;
    }

    public void setK626(String k626) {
        this.k626 = k626;
        setK626dx(k626.equals("2") || k626.equals("3") ? this.k626dx : ""); // for all skips, mention all skipped questions
        setK626ex(k626.equals("2") || k626.equals("3") ? this.k626ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k626);
    }

    @Bindable
    public String getK626dx() {
        return k626dx;
    }

    public void setK626dx(String k626dx) {
        this.k626dx = k626dx;
        notifyPropertyChanged(BR.k626dx);
    }

    @Bindable
    public String getK626ex() {
        return k626ex;
    }

    public void setK626ex(String k626ex) {
        this.k626ex = k626ex;
        notifyPropertyChanged(BR.k626ex);
    }

    @Bindable
    public String getK627() {
        return k627;
    }

    public void setK627(String k627) {
        this.k627 = k627;
        setK627dx(k627.equals("2") || k627.equals("3") ? this.k627dx : ""); // for all skips, mention all skipped questions
        setK627ex(k627.equals("2") || k627.equals("3") ? this.k627ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k627);
    }

    @Bindable
    public String getK627dx() {
        return k627dx;
    }

    public void setK627dx(String k627dx) {
        this.k627dx = k627dx;
        notifyPropertyChanged(BR.k627dx);
    }

    @Bindable
    public String getK627ex() {
        return k627ex;
    }

    public void setK627ex(String k627ex) {
        this.k627ex = k627ex;
        notifyPropertyChanged(BR.k627ex);
    }

    @Bindable
    public String getK628() {
        return k628;
    }

    public void setK628(String k628) {
        this.k628 = k628;
        setK628dx(k628.equals("2") || k628.equals("3") ? this.k628dx : ""); // for all skips, mention all skipped questions
        setK628ex(k628.equals("2") || k628.equals("3") ? this.k628ex : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k628);
    }

    @Bindable
    public String getK628dx() {
        return k628dx;
    }

    public void setK628dx(String k628dx) {
        this.k628dx = k628dx;
        notifyPropertyChanged(BR.k628dx);
    }

    @Bindable
    public String getK628ex() {
        return k628ex;
    }

    public void setK628ex(String k628ex) {
        this.k628ex = k628ex;
        notifyPropertyChanged(BR.k628ex);
    }

    @Bindable
    public String getK701() {
        return k701;
    }

    public void setK701(String k701) {
        this.k701 = k701;
        notifyPropertyChanged(BR.k701);
    }

    @Bindable
    public String getK702() {
        return k702;
    }

    public void setK702(String k702) {
        this.k702 = k702;
        notifyPropertyChanged(BR.k702);
    }

    @Bindable
    public String getK703() {
        return k703;
    }

    public void setK703(String k703) {
        this.k703 = k703;
        notifyPropertyChanged(BR.k703);
    }

    @Bindable
    public String getK704() {
        return k704;
    }

    public void setK704(String k704) {
        this.k704 = k704;
        notifyPropertyChanged(BR.k704);
    }

    @Bindable
    public String getK705() {
        return k705;
    }

    public void setK705(String k705) {
        this.k705 = k705;
        notifyPropertyChanged(BR.k705);
    }

    @Bindable
    public String getK706() {
        return k706;
    }

    public void setK706(String k706) {
        this.k706 = k706;
        notifyPropertyChanged(BR.k706);
    }

    @Bindable
    public String getK707() {
        return k707;
    }

    public void setK707(String k707) {
        this.k707 = k707;
        notifyPropertyChanged(BR.k707);
    }

    @Bindable
    public String getK708() {
        return k708;
    }

    public void setK708(String k708) {
        this.k708 = k708;
        notifyPropertyChanged(BR.k708);
    }

    @Bindable
    public String getK709() {
        return k709;
    }

    public void setK709(String k709) {
        this.k709 = k709;
        notifyPropertyChanged(BR.k709);
    }

    @Bindable
    public String getK710() {
        return k710;
    }

    public void setK710(String k710) {
        this.k710 = k710;
        notifyPropertyChanged(BR.k710);
    }

    @Bindable
    public String getK711() {
        return k711;
    }

    public void setK711(String k711) {
        this.k711 = k711;
        notifyPropertyChanged(BR.k711);
    }


    public ModuleK Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_UUID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SYNCED_DATE));
        sK1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SK1)));
        sK2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SK2)));
        sK3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SK3)));
        sK4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SK4)));
        sK61Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SK61)));
        sK62Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SK62)));
        sK7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleKTable.COLUMN_SK7)));
        return this;
    }

    public void sK1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sK1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.k101 = json.getString("k101");
            this.k101a = json.getString("k101a");
            this.k101ba = json.getString("k101ba");
            this.k101ba03 = json.getString("k101ba03");
            this.k101bb = json.getString("k101bb");
            this.k101bb03 = json.getString("k101bb03");
            this.k101bc = json.getString("k101bc");
            this.k101bc03 = json.getString("k101bc03");
            this.k101bd = json.getString("k101bd");
            this.k101bd03 = json.getString("k101bd03");
            this.k101be = json.getString("k101be");
            this.k101be03 = json.getString("k101be03");
            this.k101bf = json.getString("k101bf");
            this.k101bf03 = json.getString("k101bf03");
            this.k101bg = json.getString("k101bg");
            this.k101bg03 = json.getString("k101bg03");
            this.k101b96 = json.getString("k101b96");
            this.k101b9603x = json.getString("k101b9603x");
            this.k101b9604 = json.getString("k101b9604");
            this.k102 = json.getString("k102");
            this.k10296x = json.getString("k10296x");
            this.k103 = json.getString("k103");
            this.k104 = json.getString("k104");
        }
    }

    public void sK2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sK2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.k201 = json.getString("k201");
            this.k202 = json.getString("k202");
            this.k203 = json.getString("k203");
            this.k204 = json.getString("k204");
        }
    }

    public void sK3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sK3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.k301 = json.getString("k301");
            this.k302 = json.getString("k302");
            this.k303 = json.getString("k303");
            this.k304 = json.getString("k304");
            this.k305 = json.getString("k305");
            this.k306 = json.getString("k306");
            this.k307 = json.getString("k307");
            this.k30704x = json.getString("k30704x");
            this.k308 = json.getString("k308");
        }
    }

    public void sK4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sK4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.k401 = json.getString("k401");
            this.k402 = json.getString("k402");
            this.k403 = json.getString("k403");
            this.k404 = json.getString("k404");
            this.k405 = json.getString("k405");
            this.k406 = json.getString("k406");
            this.k407 = json.getString("k407");
            this.k408 = json.getString("k408");
            this.k409 = json.getString("k409");
            this.k410 = json.getString("k410");
            this.k41101 = json.getString("k41101");
            this.k41102 = json.getString("k41102");
            this.k41103 = json.getString("k41103");
            this.k41201 = json.getString("k41201");
            this.k41202 = json.getString("k41202");
            this.k41203 = json.getString("k41203");
            this.k41204 = json.getString("k41204");
            this.k41205 = json.getString("k41205");
            this.k41206 = json.getString("k41206");
            this.k41207 = json.getString("k41207");
            this.k41301 = json.getString("k41301");
            this.k41302 = json.getString("k41302");
            this.k41303 = json.getString("k41303");
            this.k41401 = json.getString("k41401");
            this.k41402 = json.getString("k41402");
            this.k41403 = json.getString("k41403");
            this.k41404 = json.getString("k41404");
            this.k41405 = json.getString("k41405");
            this.k41406 = json.getString("k41406");
            this.k41407 = json.getString("k41407");
            this.k41408 = json.getString("k41408");
            this.k41409 = json.getString("k41409");
            this.k415 = json.getString("k415");
            this.k416 = json.getString("k416");
            this.k417 = json.getString("k417");
            this.k41796x = json.getString("k41796x");
            this.k418 = json.getString("k418");
            this.k41901 = json.getString("k41901");
            this.k41902 = json.getString("k41902");
            this.k41903 = json.getString("k41903");
            this.k41904 = json.getString("k41904");
            this.k41905 = json.getString("k41905");
            this.k41906 = json.getString("k41906");
            this.k41907 = json.getString("k41907");
        }
    }

    public void sK61Hydrate(String string) throws JSONException {
        Log.d(TAG, "sK61Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.k601 = json.getString("k601");
            this.k601dx = json.getString("k601dx");
            this.k601ex = json.getString("k601ex");
            this.k602 = json.getString("k602");
            this.k602dx = json.getString("k602dx");
            this.k602ex = json.getString("k602ex");
            this.k603 = json.getString("k603");
            this.k603dx = json.getString("k603dx");
            this.k603ex = json.getString("k603ex");
            this.k604 = json.getString("k604");
            this.k604dx = json.getString("k604dx");
            this.k604ex = json.getString("k604ex");
            this.k605 = json.getString("k605");
            this.k605dx = json.getString("k605dx");
            this.k605ex = json.getString("k605ex");
            this.k606 = json.getString("k606");
            this.k606dx = json.getString("k606dx");
            this.k606ex = json.getString("k606ex");
            this.k607 = json.getString("k607");
            this.k607dx = json.getString("k607dx");
            this.k607ex = json.getString("k607ex");
            this.k608 = json.getString("k608");
            this.k608dx = json.getString("k608dx");
            this.k608ex = json.getString("k608ex");
            this.k609 = json.getString("k609");
            this.k609dx = json.getString("k609dx");
            this.k609ex = json.getString("k609ex");
            this.k610 = json.getString("k610");
            this.k610dx = json.getString("k610dx");
            this.k610ex = json.getString("k610ex");
            this.k611 = json.getString("k611");
            this.k611dx = json.getString("k611dx");
            this.k611ex = json.getString("k611ex");
            this.k612 = json.getString("k612");
            this.k612dx = json.getString("k612dx");
            this.k612ex = json.getString("k612ex");
            this.k613 = json.getString("k613");
            this.k613dx = json.getString("k613dx");
            this.k613ex = json.getString("k613ex");
            this.k614 = json.getString("k614");
            this.k614dx = json.getString("k614dx");
            this.k614ex = json.getString("k614ex");
            this.k615 = json.getString("k615");
            this.k615dx = json.getString("k615dx");
            this.k615ex = json.getString("k615ex");
            this.k616 = json.getString("k616");
            this.k616dx = json.getString("k616dx");
            this.k616ex = json.getString("k616ex");
            this.k617 = json.getString("k617");
            this.k617dx = json.getString("k617dx");
            this.k617ex = json.getString("k617ex");
            this.k618 = json.getString("k618");
            this.k618dx = json.getString("k618dx");
            this.k618ex = json.getString("k618ex");
            this.k619 = json.getString("k619");
            this.k619dx = json.getString("k619dx");
            this.k619ex = json.getString("k619ex");
        }
    }

    public void sK62Hydrate(String string) throws JSONException {
        Log.d(TAG, "sK62Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.k620 = json.getString("k620");
            this.k620dx = json.getString("k620dx");
            this.k620ex = json.getString("k620ex");
            this.k621 = json.getString("k621");
            this.k621dx = json.getString("k621dx");
            this.k621ex = json.getString("k621ex");
            this.k622 = json.getString("k622");
            this.k622dx = json.getString("k622dx");
            this.k622ex = json.getString("k622ex");
            this.k623 = json.getString("k623");
            this.k623dx = json.getString("k623dx");
            this.k623ex = json.getString("k623ex");
            this.k624 = json.getString("k624");
            this.k624dx = json.getString("k624dx");
            this.k624ex = json.getString("k624ex");
            this.k625 = json.getString("k625");
            this.k625dx = json.getString("k625dx");
            this.k625ex = json.getString("k625ex");
            this.k626 = json.getString("k626");
            this.k626dx = json.getString("k626dx");
            this.k626ex = json.getString("k626ex");
            this.k627 = json.getString("k627");
            this.k627dx = json.getString("k627dx");
            this.k627ex = json.getString("k627ex");
            this.k628 = json.getString("k628");
            this.k628dx = json.getString("k628dx");
            this.k628ex = json.getString("k628ex");
        }
    }

    public void sK7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sK7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.k701 = json.getString("k701");
            this.k702 = json.getString("k702");
            this.k703 = json.getString("k703");
            this.k704 = json.getString("k704");
            this.k705 = json.getString("k705");
            this.k706 = json.getString("k706");
            this.k707 = json.getString("k707");
            this.k708 = json.getString("k708");
            this.k709 = json.getString("k709");
            this.k710 = json.getString("k710");
            this.k711 = json.getString("k711");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(ModuleKTable.COLUMN_ID, this.id);
        json.put(ModuleKTable.COLUMN_UID, this.uid);
        json.put(ModuleKTable.COLUMN_UUID, this.uuid);
        json.put(ModuleKTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(ModuleKTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(ModuleKTable.COLUMN_UC_CODE, this.ucCode);
        json.put(ModuleKTable.COLUMN_HF_CODE, this.hfCode);
        json.put(ModuleKTable.COLUMN_USERNAME, this.userName);
        json.put(ModuleKTable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleKTable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleKTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleKTable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleKTable.COLUMN_SYNCED, this.synced);
        json.put(ModuleKTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleKTable.COLUMN_SK1, new JSONObject(sK1toString()));
        json.put(ModuleKTable.COLUMN_SK2, new JSONObject(sK2toString()));
        json.put(ModuleKTable.COLUMN_SK3, new JSONObject(sK3toString()));
        json.put(ModuleKTable.COLUMN_SK4, new JSONObject(sK4toString()));
        json.put(ModuleKTable.COLUMN_SK61, new JSONObject(sK61toString()));
        json.put(ModuleKTable.COLUMN_SK62, new JSONObject(sK62toString()));
        json.put(ModuleKTable.COLUMN_SK7, new JSONObject(sK7toString()));
        return json;
    }

    public String sK1toString() throws JSONException {
        Log.d(TAG, "sK1toString: ");
        JSONObject json = new JSONObject();
        json.put("k101", k101)
                .put("k101a", k101a)
                .put("k101ba", k101ba)
                .put("k101ba03", k101ba03)
                .put("k101bb", k101bb)
                .put("k101bb03", k101bb03)
                .put("k101bc", k101bc)
                .put("k101bc03", k101bc03)
                .put("k101bd", k101bd)
                .put("k101bd03", k101bd03)
                .put("k101be", k101be)
                .put("k101be03", k101be03)
                .put("k101bf", k101bf)
                .put("k101bf03", k101bf03)
                .put("k101bg", k101bg)
                .put("k101bg03", k101bg03)
                .put("k101b96", k101b96)
                .put("k101b9603x", k101b9603x)
                .put("k101b9604", k101b9604)
                .put("k102", k102)
                .put("k10296x", k10296x)
                .put("k103", k103)
                .put("k104", k104);
        return json.toString();
    }

    public String sK2toString() throws JSONException {
        Log.d(TAG, "sK2toString: ");
        JSONObject json = new JSONObject();
        json.put("k201", k201)
                .put("k202", k202)
                .put("k203", k203)
                .put("k204", k204);
        return json.toString();
    }

    public String sK3toString() throws JSONException {
        Log.d(TAG, "sK3toString: ");
        JSONObject json = new JSONObject();
        json.put("k301", k301)
                .put("k302", k302)
                .put("k303", k303)
                .put("k304", k304)
                .put("k305", k305)
                .put("k306", k306)
                .put("k307", k307)
                .put("k30704x", k30704x)
                .put("k308", k308);
        return json.toString();
    }

    public String sK4toString() throws JSONException {
        Log.d(TAG, "sK4toString: ");
        JSONObject json = new JSONObject();
        json.put("k401", k401)
                .put("k402", k402)
                .put("k403", k403)
                .put("k404", k404)
                .put("k405", k405)
                .put("k406", k406)
                .put("k407", k407)
                .put("k408", k408)
                .put("k409", k409)
                .put("k410", k410)
                .put("k41101", k41101)
                .put("k41102", k41102)
                .put("k41103", k41103)
                .put("k41201", k41201)
                .put("k41202", k41202)
                .put("k41203", k41203)
                .put("k41204", k41204)
                .put("k41205", k41205)
                .put("k41206", k41206)
                .put("k41207", k41207)
                .put("k41301", k41301)
                .put("k41302", k41302)
                .put("k41303", k41303)
                .put("k41401", k41401)
                .put("k41402", k41402)
                .put("k41403", k41403)
                .put("k41404", k41404)
                .put("k41405", k41405)
                .put("k41406", k41406)
                .put("k41407", k41407)
                .put("k41408", k41408)
                .put("k41409", k41409)
                .put("k415", k415)
                .put("k416", k416)
                .put("k417", k417)
                .put("k41796x", k41796x)
                .put("k418", k418)
                .put("k41901", k41901)
                .put("k41902", k41902)
                .put("k41903", k41903)
                .put("k41904", k41904)
                .put("k41905", k41905)
                .put("k41906", k41906)
                .put("k41907", k41907);
        return json.toString();
    }

    public String sK61toString() throws JSONException {
        Log.d(TAG, "sK61toString: ");
        JSONObject json = new JSONObject();
        json.put("k601", k601)
                .put("k601dx", k601dx)
                .put("k601ex", k601ex)
                .put("k602", k602)
                .put("k602dx", k602dx)
                .put("k602ex", k602ex)
                .put("k603", k603)
                .put("k603dx", k603dx)
                .put("k603ex", k603ex)
                .put("k604", k604)
                .put("k604dx", k604dx)
                .put("k604ex", k604ex)
                .put("k605", k605)
                .put("k605dx", k605dx)
                .put("k605ex", k605ex)
                .put("k606", k606)
                .put("k606dx", k606dx)
                .put("k606ex", k606ex)
                .put("k607", k607)
                .put("k607dx", k607dx)
                .put("k607ex", k607ex)
                .put("k608", k608)
                .put("k608dx", k608dx)
                .put("k608ex", k608ex)
                .put("k609", k609)
                .put("k609dx", k609dx)
                .put("k609ex", k609ex)
                .put("k610", k610)
                .put("k610dx", k610dx)
                .put("k610ex", k610ex)
                .put("k611", k611)
                .put("k611dx", k611dx)
                .put("k611ex", k611ex)
                .put("k612", k612)
                .put("k612dx", k612dx)
                .put("k612ex", k612ex)
                .put("k613", k613)
                .put("k613dx", k613dx)
                .put("k613ex", k613ex)
                .put("k614", k614)
                .put("k614dx", k614dx)
                .put("k614ex", k614ex)
                .put("k615", k615)
                .put("k615dx", k615dx)
                .put("k615ex", k615ex)
                .put("k616", k616)
                .put("k616dx", k616dx)
                .put("k616ex", k616ex)
                .put("k617", k617)
                .put("k617dx", k617dx)
                .put("k617ex", k617ex)
                .put("k618", k618)
                .put("k618dx", k618dx)
                .put("k618ex", k618ex)
                .put("k619", k619)
                .put("k619dx", k619dx)
                .put("k619ex", k619ex);
        return json.toString();
    }

    public String sK62toString() throws JSONException {
        Log.d(TAG, "sK62toString: ");
        JSONObject json = new JSONObject();
        json.put("k620", k620)
                .put("k620dx", k620dx)
                .put("k620ex", k620ex)
                .put("k621", k621)
                .put("k621dx", k621dx)
                .put("k621ex", k621ex)
                .put("k622", k622)
                .put("k622dx", k622dx)
                .put("k622ex", k622ex)
                .put("k623", k623)
                .put("k623dx", k623dx)
                .put("k623ex", k623ex)
                .put("k624", k624)
                .put("k624dx", k624dx)
                .put("k624ex", k624ex)
                .put("k625", k625)
                .put("k625dx", k625dx)
                .put("k625ex", k625ex)
                .put("k626", k626)
                .put("k626dx", k626dx)
                .put("k626ex", k626ex)
                .put("k627", k627)
                .put("k627dx", k627dx)
                .put("k627ex", k627ex)
                .put("k628", k628)
                .put("k628dx", k628dx)
                .put("k628ex", k628ex);
        return json.toString();
    }

    public String sK7toString() throws JSONException {
        Log.d(TAG, "sKtoString: ");
        JSONObject json = new JSONObject();
        json.put("k701", k701)
                .put("k702", k702)
                .put("k703", k703)
                .put("k704", k704)
                .put("k705", k705)
                .put("k706", k706)
                .put("k707", k707)
                .put("k708", k708)
                .put("k709", k709)
                .put("k710", k710)
                .put("k711", k711);
        return json.toString();
    }


}
