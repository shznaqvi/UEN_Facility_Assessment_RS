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
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleHTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleH extends BaseObservable implements Observable {

    private final String TAG = "ModuleH";
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
    private String h0101aa = _EMPTY_;
    private String h0101ab = _EMPTY_;
    private String h0101ba = _EMPTY_;
    private String h0101bb = _EMPTY_;
    private String h0101ca = _EMPTY_;
    private String h0101cb = _EMPTY_;
    private String h0201 = _EMPTY_;
    private String h0202 = _EMPTY_;
    private String h0203a = _EMPTY_;
    private String h0203b = _EMPTY_;
    private String h0301a0a = _EMPTY_;
    private String h0301a0b = _EMPTY_;
    private String h0301a0bc = _EMPTY_;
    private String h0301b0a = _EMPTY_;
    private String h0301b0b = _EMPTY_;
    private String h0301b0c = _EMPTY_;
    private String h0301c0a = _EMPTY_;
    private String h0301c0b = _EMPTY_;
    private String h0301c0c = _EMPTY_;
    private String h0301d0a = _EMPTY_;
    private String h0301d0b = _EMPTY_;
    private String h0301d0c = _EMPTY_;
    private String h0301e0a = _EMPTY_;
    private String h0301e0b = _EMPTY_;
    private String h0301e0c = _EMPTY_;
    private String h0301f0a = _EMPTY_;
    private String h0301f0b = _EMPTY_;
    private String h0301f0c = _EMPTY_;
    private String h0301g0a = _EMPTY_;
    private String h0301g0b = _EMPTY_;
    private String h0301g0c = _EMPTY_;
    private String h03011h0a = _EMPTY_;
    private String h03011h0b = _EMPTY_;
    private String h03011h0c = _EMPTY_;
    private String h0301i0a = _EMPTY_;
    private String h0301i0b = _EMPTY_;
    private String h0301i0c = _EMPTY_;
    private String h0301j0a = _EMPTY_;
    private String h0301j0b = _EMPTY_;
    private String h0301j0c = _EMPTY_;
    private String h0301k0a = _EMPTY_;
    private String h0301k0b = _EMPTY_;
    private String h0301k0c = _EMPTY_;
    private String h0301l0a = _EMPTY_;
    private String h0301l0b = _EMPTY_;
    private String h0301l0c = _EMPTY_;
    private String h0301m0a = _EMPTY_;
    private String h0301m0b = _EMPTY_;
    private String h0301m0c = _EMPTY_;
    private String h0301n0a = _EMPTY_;
    private String h0301n0b = _EMPTY_;
    private String h0301n0c = _EMPTY_;
    private String h0301o0a = _EMPTY_;
    private String h0301o0b = _EMPTY_;
    private String h0301o0c = _EMPTY_;
    private String h0301p0a = _EMPTY_;
    private String h0301p0b = _EMPTY_;
    private String h0301p0c = _EMPTY_;
    private String h0301q0a = _EMPTY_;
    private String h0301q0b = _EMPTY_;
    private String h0301q0c = _EMPTY_;
    private String h0301r0a = _EMPTY_;
    private String h0301r0b = _EMPTY_;
    private String h0301r0c = _EMPTY_;
    private String h0301s0a = _EMPTY_;
    private String h0301s0b = _EMPTY_;
    private String h0301s0c = _EMPTY_;
    private String h0301t0a = _EMPTY_;
    private String h0301t0b = _EMPTY_;
    private String h0301t0c = _EMPTY_;
    private String h0301u0a = _EMPTY_;
    private String h0301u0b = _EMPTY_;
    private String h0301u0c = _EMPTY_;
    private String h0301v0a = _EMPTY_;
    private String h0301v0b = _EMPTY_;
    private String h0301v0c = _EMPTY_;
    private String h0301w0a = _EMPTY_;
    private String h0301w0b = _EMPTY_;
    private String h0301w0c = _EMPTY_;
    private String h0301x0a = _EMPTY_;
    private String h0301x0b = _EMPTY_;
    private String h0301x0c = _EMPTY_;
    private String h0301y0a = _EMPTY_;
    private String h0301y0b = _EMPTY_;
    private String h0301y0c = _EMPTY_;
    private String h0301z0a = _EMPTY_;
    private String h0301z0b = _EMPTY_;
    private String h0301z0c = _EMPTY_;
    private String h0301aa0a = _EMPTY_;
    private String h0301aa0b = _EMPTY_;
    private String h0301aa0c = _EMPTY_;
    private String h0301ab0a = _EMPTY_;
    private String h0301ab0b = _EMPTY_;
    private String h0301ab0c = _EMPTY_;
    private String h0301ac0a = _EMPTY_;
    private String h0301ac0b = _EMPTY_;
    private String h0301ac0c = _EMPTY_;
    private String h0301ad0a = _EMPTY_;
    private String h0301ad0b = _EMPTY_;
    private String h0301ad0c = _EMPTY_;
    private String h0301ae0a = _EMPTY_;
    private String h0301ae0b = _EMPTY_;
    private String h0301ae0c = _EMPTY_;
    private String h1701 = _EMPTY_;
    private String h1702 = _EMPTY_;
    private String h1703 = _EMPTY_;
    private String h1704 = _EMPTY_;
    private String h0401 = _EMPTY_;
    private String h0401xxx = _EMPTY_;
    private String h0501 = _EMPTY_;
    private String h0501xxx = _EMPTY_;
    private String h0601 = _EMPTY_;
    private String h0601aa = _EMPTY_;
    private String h0601aaax = _EMPTY_;
    private String h0602 = _EMPTY_;
    private String h0603a = _EMPTY_;
    private String h0603b = _EMPTY_;
    private String h0603c = _EMPTY_;
    private String h0701a = _EMPTY_;
    private String h0701b = _EMPTY_;
    private String h0701c = _EMPTY_;
    private String h0701d = _EMPTY_;
    private String h0701e = _EMPTY_;
    private String h0701f = _EMPTY_;
    private String h0701g = _EMPTY_;
    private String h0801 = _EMPTY_;
    private String h0802 = _EMPTY_;
    private String h0901 = _EMPTY_;
    private String h0902a = _EMPTY_;
    private String h0902b = _EMPTY_;
    private String h0902c = _EMPTY_;
    private String h1001 = _EMPTY_;
    private String h1002a = _EMPTY_;
    private String h1002b = _EMPTY_;
    private String h1101 = _EMPTY_;
    private String h1102 = _EMPTY_;
    private String h1103 = _EMPTY_;
    private String h1104 = _EMPTY_;
    private String h1105 = _EMPTY_;
    private String h1106 = _EMPTY_;
    private String h1201 = _EMPTY_;
    private String h1202 = _EMPTY_;
    private String h1203a = _EMPTY_;
    private String h1203b = _EMPTY_;
    private String h1203c = _EMPTY_;
    private String h1203d = _EMPTY_;
    private String h1203e = _EMPTY_;
    private String h1203f = _EMPTY_;
    private String h1203g = _EMPTY_;
    private String h1301 = _EMPTY_;
    private String h1302 = _EMPTY_;
    private String h1303 = _EMPTY_;
    private String h1401aa = _EMPTY_;
    private String h1401ab = _EMPTY_;
    private String h1401ba = _EMPTY_;
    private String h1401bb = _EMPTY_;
    private String h1401ca = _EMPTY_;
    private String h1401cb = _EMPTY_;
    private String h1401da = _EMPTY_;
    private String h1401db = _EMPTY_;
    private String h1401ea = _EMPTY_;
    private String h1401eb = _EMPTY_;
    private String h1501a0a = _EMPTY_;
    private String h1501a0b = _EMPTY_;
    private String h1501a0c = _EMPTY_;
    private String h1501a0dy = _EMPTY_;
    private String h1501a0dn = _EMPTY_;
    private String h1501b0a = _EMPTY_;
    private String h1501b0b = _EMPTY_;
    private String h1501b0c = _EMPTY_;
    private String h1501b0dy = _EMPTY_;
    private String h1501b0dn = _EMPTY_;
    private String h1501c0a = _EMPTY_;
    private String h1501c0b = _EMPTY_;
    private String h1501c0c = _EMPTY_;
    private String h1501c0dy = _EMPTY_;
    private String h1501c0dn = _EMPTY_;
    private String h1501d0a = _EMPTY_;
    private String h1501d0b = _EMPTY_;
    private String h1501d0c = _EMPTY_;
    private String h1501d0dy = _EMPTY_;
    private String h1501d0dn = _EMPTY_;
    private String h1501e0a = _EMPTY_;
    private String h1501e0b = _EMPTY_;
    private String h1501e0c = _EMPTY_;
    private String h1501e0dy = _EMPTY_;
    private String h1501e0dn = _EMPTY_;
    private String h1501f0a = _EMPTY_;
    private String h1501f0b = _EMPTY_;
    private String h1501f0c = _EMPTY_;
    private String h1501f0dy = _EMPTY_;
    private String h1501f0dn = _EMPTY_;
    private String h1501g0a = _EMPTY_;
    private String h1501g0b = _EMPTY_;
    private String h1501g0c = _EMPTY_;
    private String h1501g0dy = _EMPTY_;
    private String h1501g0dn = _EMPTY_;
    private String h1501h0a = _EMPTY_;
    private String h1501h0b = _EMPTY_;
    private String h1501h0c = _EMPTY_;
    private String h1501h0dy = _EMPTY_;
    private String h1501h0dn = _EMPTY_;
    private String h1501i0a = _EMPTY_;
    private String h1501i0b = _EMPTY_;
    private String h1501i0c = _EMPTY_;
    private String h1501i0dy = _EMPTY_;
    private String h1501i0dn = _EMPTY_;
    private String h1501j0a = _EMPTY_;
    private String h1501j0b = _EMPTY_;
    private String h1501j0c = _EMPTY_;
    private String h1501j0dy = _EMPTY_;
    private String h1501j0dn = _EMPTY_;
    private String h1501k0a = _EMPTY_;
    private String h1501k0b = _EMPTY_;
    private String h1501k0c = _EMPTY_;
    private String h1501k0dy = _EMPTY_;
    private String h1501k0dn = _EMPTY_;
    private String h1501l0a = _EMPTY_;
    private String h1501l0b = _EMPTY_;
    private String h1501l0c = _EMPTY_;
    private String h1501l0dy = _EMPTY_;
    private String h1501l0dn = _EMPTY_;
    private String h1501m0a = _EMPTY_;
    private String h1501m0b = _EMPTY_;
    private String h1501m0c = _EMPTY_;
    private String h1501m0dy = _EMPTY_;
    private String h1501m0dn = _EMPTY_;
    private String h1501n0a = _EMPTY_;
    private String h1501n0b = _EMPTY_;
    private String h1501n0c = _EMPTY_;
    private String h1501n0dy = _EMPTY_;
    private String h1501n0dn = _EMPTY_;
    private String h1501o0a = _EMPTY_;
    private String h1501o0b = _EMPTY_;
    private String h1501o0c = _EMPTY_;
    private String h1501o0dy = _EMPTY_;
    private String h1501o0dn = _EMPTY_;
    private String h1501p0a = _EMPTY_;
    private String h1501p0b = _EMPTY_;
    private String h1501p0c = _EMPTY_;
    private String h1501p0dy = _EMPTY_;
    private String h1501p0dn = _EMPTY_;
    private String h1501q0a = _EMPTY_;
    private String h1501q0b = _EMPTY_;
    private String h1501q0c = _EMPTY_;
    private String h1501q0dy = _EMPTY_;
    private String h1501q0dn = _EMPTY_;
    private String h1501r0a = _EMPTY_;
    private String h1501r0b = _EMPTY_;
    private String h1501r0c = _EMPTY_;
    private String h1501r0dy = _EMPTY_;
    private String h1501r0dn = _EMPTY_;
    private String h1501s0a = _EMPTY_;
    private String h1501s0b = _EMPTY_;
    private String h1501s0c = _EMPTY_;
    private String h1501s0dy = _EMPTY_;
    private String h1501s0dn = _EMPTY_;
    private String h1501t0a = _EMPTY_;
    private String h1501t0b = _EMPTY_;
    private String h1501t0c = _EMPTY_;
    private String h1501t0dy = _EMPTY_;
    private String h1501t0dn = _EMPTY_;
    private String h1501u0a = _EMPTY_;
    private String h1501u0b = _EMPTY_;
    private String h1501u0c = _EMPTY_;
    private String h1501u0dy = _EMPTY_;
    private String h1501u0dn = _EMPTY_;
    private String h1501v0a = _EMPTY_;
    private String h1501v0b = _EMPTY_;
    private String h1501v0c = _EMPTY_;
    private String h1501v0dy = _EMPTY_;
    private String h1501v0dn = _EMPTY_;
    private String h1501w0a = _EMPTY_;
    private String h1501w0b = _EMPTY_;
    private String h1501w0c = _EMPTY_;
    private String h1501w0dy = _EMPTY_;
    private String h1501w0dn = _EMPTY_;
    private String h1501x0a = _EMPTY_;
    private String h1501x0b = _EMPTY_;
    private String h1501x0c = _EMPTY_;
    private String h1501x0dy = _EMPTY_;
    private String h1501x0dn = _EMPTY_;
    private String h1501y0a = _EMPTY_;
    private String h1501y0b = _EMPTY_;
    private String h1501y0c = _EMPTY_;
    private String h1501y0dy = _EMPTY_;
    private String h1501y0dn = _EMPTY_;
    private String h1501z0a = _EMPTY_;
    private String h1501z0b = _EMPTY_;
    private String h1501z0c = _EMPTY_;
    private String h1501z0dy = _EMPTY_;
    private String h1501z0dn = _EMPTY_;
    private String h1601 = _EMPTY_;
    private String h1602 = _EMPTY_;
    private String h1602xxx = _EMPTY_;
    private String h1603 = _EMPTY_;
    private String h1603xxx = _EMPTY_;
    private String h1604 = _EMPTY_;
    private String h1605 = _EMPTY_;
    private String h1605xxx = _EMPTY_;


    public ModuleH() {
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
    public String getH0101aa() {
        return h0101aa;
    }

    public void setH0101aa(String h0101aa) {
        this.h0101aa = h0101aa;
        notifyPropertyChanged(BR.h0101aa);
    }

    @Bindable
    public String getH0101ab() {
        return h0101ab;
    }

    public void setH0101ab(String h0101ab) {
        this.h0101ab = h0101ab;
        notifyPropertyChanged(BR.h0101ab);
    }

    @Bindable
    public String getH0101ba() {
        return h0101ba;
    }

    public void setH0101ba(String h0101ba) {
        this.h0101ba = h0101ba;
        notifyPropertyChanged(BR.h0101ba);
    }

    @Bindable
    public String getH0101bb() {
        return h0101bb;
    }

    public void setH0101bb(String h0101bb) {
        this.h0101bb = h0101bb;
        notifyPropertyChanged(BR.h0101bb);
    }

    @Bindable
    public String getH0101ca() {
        return h0101ca;
    }

    public void setH0101ca(String h0101ca) {
        this.h0101ca = h0101ca;
        notifyPropertyChanged(BR.h0101ca);
    }

    @Bindable
    public String getH0101cb() {
        return h0101cb;
    }

    public void setH0101cb(String h0101cb) {
        this.h0101cb = h0101cb;
        notifyPropertyChanged(BR.h0101cb);
    }

    @Bindable
    public String getH0201() {
        return h0201;
    }

    public void setH0201(String h0201) {
        this.h0201 = h0201;
        notifyPropertyChanged(BR.h0201);
    }

    @Bindable
    public String getH0202() {
        return h0202;
    }

    public void setH0202(String h0202) {
        this.h0202 = h0202;
        notifyPropertyChanged(BR.h0202);
    }

    @Bindable
    public String getH0203a() {
        return h0203a;
    }

    public void setH0203a(String h0203a) {
        this.h0203a = h0203a;
        notifyPropertyChanged(BR.h0203a);
    }

    @Bindable
    public String getH0203b() {
        return h0203b;
    }

    public void setH0203b(String h0203b) {
        this.h0203b = h0203b;
        notifyPropertyChanged(BR.h0203b);
    }

    @Bindable
    public String getH0301a0a() {
        return h0301a0a;
    }

    public void setH0301a0a(String h0301a0a) {
        if (this.h0301a0a.equals(h0301a0a)) return; // for all checkboxes
        this.h0301a0a = h0301a0a;
        notifyPropertyChanged(BR.h0301a0a);
    }

    @Bindable
    public String getH0301a0b() {
        return h0301a0b;
    }

    public void setH0301a0b(String h0301a0b) {
        if (this.h0301a0b.equals(h0301a0b)) return; // for all checkboxes
        this.h0301a0b = h0301a0b;
        notifyPropertyChanged(BR.h0301a0b);
    }

    @Bindable
    public String getH0301a0bc() {
        return h0301a0bc;
    }

    public void setH0301a0bc(String h0301a0bc) {
        if (this.h0301a0bc.equals(h0301a0bc)) return; // for all checkboxes
        this.h0301a0bc = h0301a0bc;
        notifyPropertyChanged(BR.h0301a0bc);
    }

    @Bindable
    public String getH0301b0a() {
        return h0301b0a;
    }

    public void setH0301b0a(String h0301b0a) {
        if (this.h0301b0a.equals(h0301b0a)) return; // for all checkboxes
        this.h0301b0a = h0301b0a;
        notifyPropertyChanged(BR.h0301b0a);
    }

    @Bindable
    public String getH0301b0b() {
        return h0301b0b;
    }

    public void setH0301b0b(String h0301b0b) {
        if (this.h0301b0b.equals(h0301b0b)) return; // for all checkboxes
        this.h0301b0b = h0301b0b;
        notifyPropertyChanged(BR.h0301b0b);
    }

    @Bindable
    public String getH0301b0c() {
        return h0301b0c;
    }

    public void setH0301b0c(String h0301b0c) {
        if (this.h0301b0c.equals(h0301b0c)) return; // for all checkboxes
        this.h0301b0c = h0301b0c;
        notifyPropertyChanged(BR.h0301b0c);
    }

    @Bindable
    public String getH0301c0a() {
        return h0301c0a;
    }

    public void setH0301c0a(String h0301c0a) {
        if (this.h0301c0a.equals(h0301c0a)) return; // for all checkboxes
        this.h0301c0a = h0301c0a;
        notifyPropertyChanged(BR.h0301c0a);
    }

    @Bindable
    public String getH0301c0b() {
        return h0301c0b;
    }

    public void setH0301c0b(String h0301c0b) {
        if (this.h0301c0b.equals(h0301c0b)) return; // for all checkboxes
        this.h0301c0b = h0301c0b;
        notifyPropertyChanged(BR.h0301c0b);
    }

    @Bindable
    public String getH0301c0c() {
        return h0301c0c;
    }

    public void setH0301c0c(String h0301c0c) {
        if (this.h0301c0c.equals(h0301c0c)) return; // for all checkboxes
        this.h0301c0c = h0301c0c;
        notifyPropertyChanged(BR.h0301c0c);
    }

    @Bindable
    public String getH0301d0a() {
        return h0301d0a;
    }

    public void setH0301d0a(String h0301d0a) {
        if (this.h0301d0a.equals(h0301d0a)) return; // for all checkboxes
        this.h0301d0a = h0301d0a;
        notifyPropertyChanged(BR.h0301d0a);
    }

    @Bindable
    public String getH0301d0b() {
        return h0301d0b;
    }

    public void setH0301d0b(String h0301d0b) {
        if (this.h0301d0b.equals(h0301d0b)) return; // for all checkboxes
        this.h0301d0b = h0301d0b;
        notifyPropertyChanged(BR.h0301d0b);
    }

    @Bindable
    public String getH0301d0c() {
        return h0301d0c;
    }

    public void setH0301d0c(String h0301d0c) {
        if (this.h0301d0c.equals(h0301d0c)) return; // for all checkboxes
        this.h0301d0c = h0301d0c;
        notifyPropertyChanged(BR.h0301d0c);
    }

    @Bindable
    public String getH0301e0a() {
        return h0301e0a;
    }

    public void setH0301e0a(String h0301e0a) {
        if (this.h0301e0a.equals(h0301e0a)) return; // for all checkboxes
        this.h0301e0a = h0301e0a;
        notifyPropertyChanged(BR.h0301e0a);
    }

    @Bindable
    public String getH0301e0b() {
        return h0301e0b;
    }

    public void setH0301e0b(String h0301e0b) {
        if (this.h0301e0b.equals(h0301e0b)) return; // for all checkboxes
        this.h0301e0b = h0301e0b;
        notifyPropertyChanged(BR.h0301e0b);
    }

    @Bindable
    public String getH0301e0c() {
        return h0301e0c;
    }

    public void setH0301e0c(String h0301e0c) {
        if (this.h0301c0c.equals(h0301c0c)) return; // for all checkboxes
        this.h0301e0c = h0301e0c;
        notifyPropertyChanged(BR.h0301e0c);
    }

    @Bindable
    public String getH0301f0a() {
        return h0301f0a;
    }

    public void setH0301f0a(String h0301f0a) {
        if (this.h0301f0a.equals(h0301f0a)) return; // for all checkboxes
        this.h0301f0a = h0301f0a;
        notifyPropertyChanged(BR.h0301f0a);
    }

    @Bindable
    public String getH0301f0b() {
        return h0301f0b;
    }

    public void setH0301f0b(String h0301f0b) {
        if (this.h0301f0b.equals(h0301f0b)) return; // for all checkboxes
        this.h0301f0b = h0301f0b;
        notifyPropertyChanged(BR.h0301f0b);
    }

    @Bindable
    public String getH0301f0c() {
        return h0301f0c;
    }

    public void setH0301f0c(String h0301f0c) {
        if (this.h0301f0c.equals(h0301f0c)) return; // for all checkboxes
        this.h0301f0c = h0301f0c;
        notifyPropertyChanged(BR.h0301f0c);
    }

    @Bindable
    public String getH0301g0a() {
        return h0301g0a;
    }

    public void setH0301g0a(String h0301g0a) {
        if (this.h0301g0a.equals(h0301g0a)) return; // for all checkboxes
        this.h0301g0a = h0301g0a;
        notifyPropertyChanged(BR.h0301g0a);
    }

    @Bindable
    public String getH0301g0b() {
        return h0301g0b;
    }

    public void setH0301g0b(String h0301g0b) {
        if (this.h0301g0b.equals(h0301g0b)) return; // for all checkboxes
        this.h0301g0b = h0301g0b;
        notifyPropertyChanged(BR.h0301g0b);
    }

    @Bindable
    public String getH0301g0c() {
        return h0301g0c;
    }

    public void setH0301g0c(String h0301g0c) {
        if (this.h0301g0c.equals(h0301g0c)) return; // for all checkboxes
        this.h0301g0c = h0301g0c;
        notifyPropertyChanged(BR.h0301g0c);
    }

    @Bindable
    public String getH03011h0a() {
        return h03011h0a;
    }

    public void setH03011h0a(String h03011h0a) {
        if (this.h03011h0a.equals(h03011h0a)) return; // for all checkboxes
        this.h03011h0a = h03011h0a;
        notifyPropertyChanged(BR.h03011h0a);
    }

    @Bindable
    public String getH03011h0b() {
        return h03011h0b;
    }

    public void setH03011h0b(String h03011h0b) {
        if (this.h03011h0b.equals(h03011h0b)) return; // for all checkboxes
        this.h03011h0b = h03011h0b;
        notifyPropertyChanged(BR.h03011h0b);
    }

    @Bindable
    public String getH03011h0c() {
        return h03011h0c;
    }

    public void setH03011h0c(String h03011h0c) {
        if (this.h03011h0c.equals(h03011h0c)) return; // for all checkboxes
        this.h03011h0c = h03011h0c;
        notifyPropertyChanged(BR.h03011h0c);
    }

    @Bindable
    public String getH0301i0a() {
        return h0301i0a;
    }

    public void setH0301i0a(String h0301i0a) {
        if (this.h0301i0a.equals(h0301i0a)) return; // for all checkboxes
        this.h0301i0a = h0301i0a;
        notifyPropertyChanged(BR.h0301i0a);
    }

    @Bindable
    public String getH0301i0b() {
        return h0301i0b;
    }

    public void setH0301i0b(String h0301i0b) {
        if (this.h0301i0b.equals(h0301i0b)) return; // for all checkboxes
        this.h0301i0b = h0301i0b;
        notifyPropertyChanged(BR.h0301i0b);
    }

    @Bindable
    public String getH0301i0c() {
        return h0301i0c;
    }

    public void setH0301i0c(String h0301i0c) {
        if (this.h0301i0c.equals(h0301i0c)) return; // for all checkboxes
        this.h0301i0c = h0301i0c;
        notifyPropertyChanged(BR.h0301i0c);
    }

    @Bindable
    public String getH0301j0a() {
        return h0301j0a;
    }

    public void setH0301j0a(String h0301j0a) {
        if (this.h0301j0a.equals(h0301j0a)) return; // for all checkboxes
        this.h0301j0a = h0301j0a;
        notifyPropertyChanged(BR.h0301j0a);
    }

    @Bindable
    public String getH0301j0b() {
        return h0301j0b;
    }

    public void setH0301j0b(String h0301j0b) {
        if (this.h0301j0b.equals(h0301j0b)) return; // for all checkboxes
        this.h0301j0b = h0301j0b;
        notifyPropertyChanged(BR.h0301j0b);
    }

    @Bindable
    public String getH0301j0c() {
        return h0301j0c;
    }

    public void setH0301j0c(String h0301j0c) {
        if (this.h0301j0c.equals(h0301j0c)) return; // for all checkboxes
        this.h0301j0c = h0301j0c;
        notifyPropertyChanged(BR.h0301j0c);
    }

    @Bindable
    public String getH0301k0a() {
        return h0301k0a;
    }

    public void setH0301k0a(String h0301k0a) {
        if (this.h0301k0a.equals(h0301k0a)) return; // for all checkboxes
        this.h0301k0a = h0301k0a;
        notifyPropertyChanged(BR.h0301k0a);
    }

    @Bindable
    public String getH0301k0b() {
        return h0301k0b;
    }

    public void setH0301k0b(String h0301k0b) {
        if (this.h0301k0b.equals(h0301k0b)) return; // for all checkboxes
        this.h0301k0b = h0301k0b;
        notifyPropertyChanged(BR.h0301k0b);
    }

    @Bindable
    public String getH0301k0c() {
        return h0301k0c;
    }

    public void setH0301k0c(String h0301k0c) {
        if (this.h0301k0c.equals(h0301k0c)) return; // for all checkboxes
        this.h0301k0c = h0301k0c;
        notifyPropertyChanged(BR.h0301k0c);
    }

    @Bindable
    public String getH0301l0a() {
        return h0301l0a;
    }

    public void setH0301l0a(String h0301l0a) {
        if (this.h0301l0a.equals(h0301l0a)) return; // for all checkboxes
        this.h0301l0a = h0301l0a;
        notifyPropertyChanged(BR.h0301l0a);
    }

    @Bindable
    public String getH0301l0b() {
        return h0301l0b;
    }

    public void setH0301l0b(String h0301l0b) {
        if (this.h0301l0a.equals(h0301l0a)) return; // for all checkboxes
        this.h0301l0b = h0301l0b;
        notifyPropertyChanged(BR.h0301l0b);
    }

    @Bindable
    public String getH0301l0c() {
        return h0301l0c;
    }

    public void setH0301l0c(String h0301l0c) {
        if (this.h0301l0c.equals(h0301l0c)) return; // for all checkboxes
        this.h0301l0c = h0301l0c;
        notifyPropertyChanged(BR.h0301l0c);
    }

    @Bindable
    public String getH0301m0a() {
        return h0301m0a;
    }

    public void setH0301m0a(String h0301m0a) {
        if (this.h0301m0a.equals(h0301m0a)) return; // for all checkboxes
        this.h0301m0a = h0301m0a;
        notifyPropertyChanged(BR.h0301m0a);
    }

    @Bindable
    public String getH0301m0b() {
        return h0301m0b;
    }

    public void setH0301m0b(String h0301m0b) {
        if (this.h0301m0b.equals(h0301m0b)) return; // for all checkboxes
        this.h0301m0b = h0301m0b;
        notifyPropertyChanged(BR.h0301m0b);
    }

    @Bindable
    public String getH0301m0c() {
        return h0301m0c;
    }

    public void setH0301m0c(String h0301m0c) {
        if (this.h0301m0c.equals(h0301m0c)) return; // for all checkboxes
        this.h0301m0c = h0301m0c;
        notifyPropertyChanged(BR.h0301m0c);
    }

    @Bindable
    public String getH0301n0a() {
        return h0301n0a;
    }

    public void setH0301n0a(String h0301n0a) {
        if (this.h0301n0a.equals(h0301n0a)) return; // for all checkboxes
        this.h0301n0a = h0301n0a;
        notifyPropertyChanged(BR.h0301n0a);
    }

    @Bindable
    public String getH0301n0b() {
        return h0301n0b;
    }

    public void setH0301n0b(String h0301n0b) {
        if (this.h0301n0b.equals(h0301n0b)) return; // for all checkboxes
        this.h0301n0b = h0301n0b;
        notifyPropertyChanged(BR.h0301n0b);
    }

    @Bindable
    public String getH0301n0c() {
        return h0301n0c;
    }

    public void setH0301n0c(String h0301n0c) {
        if (this.h0301n0c.equals(h0301n0c)) return; // for all checkboxes
        this.h0301n0c = h0301n0c;
        notifyPropertyChanged(BR.h0301n0c);
    }

    @Bindable
    public String getH0301o0a() {
        return h0301o0a;
    }

    public void setH0301o0a(String h0301o0a) {
        if (this.h0301o0a.equals(h0301o0a)) return; // for all checkboxes
        this.h0301o0a = h0301o0a;
        notifyPropertyChanged(BR.h0301o0a);
    }

    @Bindable
    public String getH0301o0b() {
        return h0301o0b;
    }

    public void setH0301o0b(String h0301o0b) {
        if (this.h0301o0b.equals(h0301o0b)) return; // for all checkboxes
        this.h0301o0b = h0301o0b;
        notifyPropertyChanged(BR.h0301o0b);
    }

    @Bindable
    public String getH0301o0c() {
        return h0301o0c;
    }

    public void setH0301o0c(String h0301o0c) {
        if (this.h0301o0c.equals(h0301o0c)) return; // for all checkboxes
        this.h0301o0c = h0301o0c;
        notifyPropertyChanged(BR.h0301o0c);
    }

    @Bindable
    public String getH0301p0a() {
        return h0301p0a;
    }

    public void setH0301p0a(String h0301p0a) {
        if (this.h0301p0a.equals(h0301p0a)) return; // for all checkboxes
        this.h0301p0a = h0301p0a;
        notifyPropertyChanged(BR.h0301p0a);
    }

    @Bindable
    public String getH0301p0b() {
        return h0301p0b;
    }

    public void setH0301p0b(String h0301p0b) {
        if (this.h0301p0b.equals(h0301p0b)) return; // for all checkboxes
        this.h0301p0b = h0301p0b;
        notifyPropertyChanged(BR.h0301p0b);
    }

    @Bindable
    public String getH0301p0c() {
        return h0301p0c;
    }

    public void setH0301p0c(String h0301p0c) {
        if (this.h0301p0c.equals(h0301p0c)) return; // for all checkboxes
        this.h0301p0c = h0301p0c;
        notifyPropertyChanged(BR.h0301p0c);
    }

    @Bindable
    public String getH0301q0a() {
        return h0301q0a;
    }

    public void setH0301q0a(String h0301q0a) {
        if (this.h0301q0a.equals(h0301q0a)) return; // for all checkboxes
        this.h0301q0a = h0301q0a;
        notifyPropertyChanged(BR.h0301q0a);
    }

    @Bindable
    public String getH0301q0b() {
        return h0301q0b;
    }

    public void setH0301q0b(String h0301q0b) {
        if (this.h0301q0b.equals(h0301q0b)) return; // for all checkboxes
        this.h0301q0b = h0301q0b;
        notifyPropertyChanged(BR.h0301q0b);
    }

    @Bindable
    public String getH0301q0c() {
        return h0301q0c;
    }

    public void setH0301q0c(String h0301q0c) {
        if (this.h0301q0c.equals(h0301q0c)) return; // for all checkboxes
        this.h0301q0c = h0301q0c;
        notifyPropertyChanged(BR.h0301q0c);
    }

    @Bindable
    public String getH0301r0a() {
        return h0301r0a;
    }

    public void setH0301r0a(String h0301r0a) {
        if (this.h0301r0a.equals(h0301r0a)) return; // for all checkboxes
        this.h0301r0a = h0301r0a;
        notifyPropertyChanged(BR.h0301r0a);
    }

    @Bindable
    public String getH0301r0b() {
        return h0301r0b;
    }

    public void setH0301r0b(String h0301r0b) {
        if (this.h0301r0b.equals(h0301r0b)) return; // for all checkboxes
        this.h0301r0b = h0301r0b;
        notifyPropertyChanged(BR.h0301r0b);
    }

    @Bindable
    public String getH0301r0c() {
        return h0301r0c;
    }

    public void setH0301r0c(String h0301r0c) {
        if (this.h0301r0c.equals(h0301r0c)) return; // for all checkboxes
        this.h0301r0c = h0301r0c;
        notifyPropertyChanged(BR.h0301r0c);
    }

    @Bindable
    public String getH0301s0a() {
        return h0301s0a;
    }

    public void setH0301s0a(String h0301s0a) {
        if (this.h0301s0a.equals(h0301s0a)) return; // for all checkboxes
        this.h0301s0a = h0301s0a;
        notifyPropertyChanged(BR.h0301s0a);
    }

    @Bindable
    public String getH0301s0b() {
        return h0301s0b;
    }

    public void setH0301s0b(String h0301s0b) {
        if (this.h0301s0b.equals(h0301s0b)) return; // for all checkboxes
        this.h0301s0b = h0301s0b;
        notifyPropertyChanged(BR.h0301s0b);
    }

    @Bindable
    public String getH0301s0c() {
        return h0301s0c;
    }

    public void setH0301s0c(String h0301s0c) {
        if (this.h0301s0c.equals(h0301s0c)) return; // for all checkboxes
        this.h0301s0c = h0301s0c;
        notifyPropertyChanged(BR.h0301s0c);
    }

    @Bindable
    public String getH0301t0a() {
        return h0301t0a;
    }

    public void setH0301t0a(String h0301t0a) {
        if (this.h0301t0a.equals(h0301t0a)) return; // for all checkboxes
        this.h0301t0a = h0301t0a;
        notifyPropertyChanged(BR.h0301t0a);
    }

    @Bindable
    public String getH0301t0b() {
        return h0301t0b;
    }

    public void setH0301t0b(String h0301t0b) {
        if (this.h0301t0b.equals(h0301t0b)) return; // for all checkboxes
        this.h0301t0b = h0301t0b;
        notifyPropertyChanged(BR.h0301t0b);
    }

    @Bindable
    public String getH0301t0c() {
        return h0301t0c;
    }

    public void setH0301t0c(String h0301t0c) {
        if (this.h0301t0c.equals(h0301t0c)) return; // for all checkboxes
        this.h0301t0c = h0301t0c;
        notifyPropertyChanged(BR.h0301t0c);
    }

    @Bindable
    public String getH0301u0a() {
        return h0301u0a;
    }

    public void setH0301u0a(String h0301u0a) {
        if (this.h0301u0a.equals(h0301u0a)) return; // for all checkboxes
        this.h0301u0a = h0301u0a;
        notifyPropertyChanged(BR.h0301u0a);
    }

    @Bindable
    public String getH0301u0b() {
        return h0301u0b;
    }

    public void setH0301u0b(String h0301u0b) {
        if (this.h0301u0b.equals(h0301u0b)) return; // for all checkboxes
        this.h0301u0b = h0301u0b;
        notifyPropertyChanged(BR.h0301u0b);
    }

    @Bindable
    public String getH0301u0c() {
        return h0301u0c;
    }

    public void setH0301u0c(String h0301u0c) {
        if (this.h0301u0c.equals(h0301u0c)) return; // for all checkboxes
        this.h0301u0c = h0301u0c;
        notifyPropertyChanged(BR.h0301u0c);
    }

    @Bindable
    public String getH0301v0a() {
        return h0301v0a;
    }

    public void setH0301v0a(String h0301v0a) {
        if (this.h0301v0a.equals(h0301v0a)) return; // for all checkboxes
        this.h0301v0a = h0301v0a;
        notifyPropertyChanged(BR.h0301v0a);
    }

    @Bindable
    public String getH0301v0b() {
        return h0301v0b;
    }

    public void setH0301v0b(String h0301v0b) {
        if (this.h0301v0b.equals(h0301v0b)) return; // for all checkboxes
        this.h0301v0b = h0301v0b;
        notifyPropertyChanged(BR.h0301v0b);
    }

    @Bindable
    public String getH0301v0c() {
        return h0301v0c;
    }

    public void setH0301v0c(String h0301v0c) {
        if (this.h0301v0c.equals(h0301v0c)) return; // for all checkboxes
        this.h0301v0c = h0301v0c;
        notifyPropertyChanged(BR.h0301v0c);
    }

    @Bindable
    public String getH0301w0a() {
        return h0301w0a;
    }

    public void setH0301w0a(String h0301w0a) {
        if (this.h0301w0a.equals(h0301w0a)) return; // for all checkboxes
        this.h0301w0a = h0301w0a;
        notifyPropertyChanged(BR.h0301w0a);
    }

    @Bindable
    public String getH0301w0b() {
        return h0301w0b;
    }

    public void setH0301w0b(String h0301w0b) {
        if (this.h0301w0b.equals(h0301w0b)) return; // for all checkboxes
        this.h0301w0b = h0301w0b;
        notifyPropertyChanged(BR.h0301w0b);
    }

    @Bindable
    public String getH0301w0c() {
        return h0301w0c;
    }

    public void setH0301w0c(String h0301w0c) {
        if (this.h0301w0c.equals(h0301w0c)) return; // for all checkboxes
        this.h0301w0c = h0301w0c;
        notifyPropertyChanged(BR.h0301w0c);
    }

    @Bindable
    public String getH0301x0a() {
        return h0301x0a;
    }

    public void setH0301x0a(String h0301x0a) {
        if (this.h0301x0a.equals(h0301x0a)) return; // for all checkboxes
        this.h0301x0a = h0301x0a;
        notifyPropertyChanged(BR.h0301x0a);
    }

    @Bindable
    public String getH0301x0b() {
        return h0301x0b;
    }

    public void setH0301x0b(String h0301x0b) {
        if (this.h0301x0b.equals(h0301x0b)) return; // for all checkboxes
        this.h0301x0b = h0301x0b;
        notifyPropertyChanged(BR.h0301x0b);
    }

    @Bindable
    public String getH0301x0c() {
        return h0301x0c;
    }

    public void setH0301x0c(String h0301x0c) {
        if (this.h0301x0c.equals(h0301x0c)) return; // for all checkboxes
        this.h0301x0c = h0301x0c;
        notifyPropertyChanged(BR.h0301x0c);
    }

    @Bindable
    public String getH0301y0a() {
        return h0301y0a;
    }

    public void setH0301y0a(String h0301y0a) {
        if (this.h0301y0a.equals(h0301y0a)) return; // for all checkboxes
        this.h0301y0a = h0301y0a;
        notifyPropertyChanged(BR.h0301y0a);
    }

    @Bindable
    public String getH0301y0b() {
        return h0301y0b;
    }

    public void setH0301y0b(String h0301y0b) {
        if (this.h0301y0b.equals(h0301y0b)) return; // for all checkboxes
        this.h0301y0b = h0301y0b;
        notifyPropertyChanged(BR.h0301y0b);
    }

    @Bindable
    public String getH0301y0c() {
        return h0301y0c;
    }

    public void setH0301y0c(String h0301y0c) {
        if (this.h0301y0c.equals(h0301y0c)) return; // for all checkboxes
        this.h0301y0c = h0301y0c;
        notifyPropertyChanged(BR.h0301y0c);
    }

    @Bindable
    public String getH0301z0a() {
        return h0301z0a;
    }

    public void setH0301z0a(String h0301z0a) {
        if (this.h0301z0a.equals(h0301z0a)) return; // for all checkboxes
        this.h0301z0a = h0301z0a;
        notifyPropertyChanged(BR.h0301z0a);
    }

    @Bindable
    public String getH0301z0b() {
        return h0301z0b;
    }

    public void setH0301z0b(String h0301z0b) {
        if (this.h0301z0b.equals(h0301z0b)) return; // for all checkboxes
        this.h0301z0b = h0301z0b;
        notifyPropertyChanged(BR.h0301z0b);
    }

    @Bindable
    public String getH0301z0c() {
        return h0301z0c;
    }

    public void setH0301z0c(String h0301z0c) {
        if (this.h0301z0c.equals(h0301z0c)) return; // for all checkboxes
        this.h0301z0c = h0301z0c;
        notifyPropertyChanged(BR.h0301z0c);
    }

    @Bindable
    public String getH0301aa0a() {
        return h0301aa0a;
    }

    public void setH0301aa0a(String h0301aa0a) {
        if (this.h0301aa0a.equals(h0301aa0a)) return; // for all checkboxes
        this.h0301aa0a = h0301aa0a;
        notifyPropertyChanged(BR.h0301aa0a);
    }

    @Bindable
    public String getH0301aa0b() {
        return h0301aa0b;
    }

    public void setH0301aa0b(String h0301aa0b) {
        if (this.h0301aa0b.equals(h0301aa0b)) return; // for all checkboxes
        this.h0301aa0b = h0301aa0b;
        notifyPropertyChanged(BR.h0301aa0b);
    }

    @Bindable
    public String getH0301aa0c() {
        return h0301aa0c;
    }

    public void setH0301aa0c(String h0301aa0c) {
        if (this.h0301aa0c.equals(h0301aa0c)) return; // for all checkboxes
        this.h0301aa0c = h0301aa0c;
        notifyPropertyChanged(BR.h0301aa0c);
    }

    @Bindable
    public String getH0301ab0a() {
        return h0301ab0a;
    }

    public void setH0301ab0a(String h0301ab0a) {
        if (this.h0301ab0a.equals(h0301ab0b)) return; // for all checkboxes
        this.h0301ab0a = h0301ab0a;
        notifyPropertyChanged(BR.h0301ab0a);
    }

    @Bindable
    public String getH0301ab0b() {
        return h0301ab0b;
    }

    public void setH0301ab0b(String h0301ab0b) {
        if (this.h0301ab0b.equals(h0301ab0b)) return; // for all checkboxes
        this.h0301ab0b = h0301ab0b;
        notifyPropertyChanged(BR.h0301ab0b);
    }

    @Bindable
    public String getH0301ab0c() {
        return h0301ab0c;
    }

    public void setH0301ab0c(String h0301ab0c) {
        if (this.h0301ab0c.equals(h0301ab0c)) return; // for all checkboxes
        this.h0301ab0c = h0301ab0c;
        notifyPropertyChanged(BR.h0301ab0c);
    }

    @Bindable
    public String getH0301ac0a() {
        return h0301ac0a;
    }

    public void setH0301ac0a(String h0301ac0a) {
        if (this.h0301ac0a.equals(h0301ac0a)) return; // for all checkboxes
        this.h0301ac0a = h0301ac0a;
        notifyPropertyChanged(BR.h0301ac0a);
    }

    @Bindable
    public String getH0301ac0b() {
        return h0301ac0b;
    }

    public void setH0301ac0b(String h0301ac0b) {
        if (this.h0301ac0b.equals(h0301ac0b)) return; // for all checkboxes
        this.h0301ac0b = h0301ac0b;
        notifyPropertyChanged(BR.h0301ac0b);
    }

    @Bindable
    public String getH0301ac0c() {
        return h0301ac0c;
    }

    public void setH0301ac0c(String h0301ac0c) {
        if (this.h0301ac0c.equals(h0301ac0c)) return; // for all checkboxes
        this.h0301ac0c = h0301ac0c;
        notifyPropertyChanged(BR.h0301ac0c);
    }

    @Bindable
    public String getH0301ad0a() {
        return h0301ad0a;
    }

    public void setH0301ad0a(String h0301ad0a) {
        if (this.h0301ad0a.equals(h0301ad0a)) return; // for all checkboxes
        this.h0301ad0a = h0301ad0a;
        notifyPropertyChanged(BR.h0301ad0a);
    }

    @Bindable
    public String getH0301ad0b() {
        return h0301ad0b;
    }

    public void setH0301ad0b(String h0301ad0b) {
        if (this.h0301ad0b.equals(h0301ad0b)) return; // for all checkboxes
        this.h0301ad0b = h0301ad0b;
        notifyPropertyChanged(BR.h0301ad0b);
    }

    @Bindable
    public String getH0301ad0c() {
        return h0301ad0c;
    }

    public void setH0301ad0c(String h0301ad0c) {
        if (this.h0301ad0c.equals(h0301ad0c)) return; // for all checkboxes
        this.h0301ad0c = h0301ad0c;
        notifyPropertyChanged(BR.h0301ad0c);
    }

    @Bindable
    public String getH0301ae0a() {
        return h0301ae0a;
    }

    public void setH0301ae0a(String h0301ae0a) {
        if (this.h0301ae0a.equals(h0301ae0a)) return; // for all checkboxes
        this.h0301ae0a = h0301ae0a;
        notifyPropertyChanged(BR.h0301ae0a);
    }

    @Bindable
    public String getH0301ae0b() {
        return h0301ae0b;
    }

    public void setH0301ae0b(String h0301ae0b) {
        if (this.h0301ae0b.equals(h0301ae0b)) return; // for all checkboxes
        this.h0301ae0b = h0301ae0b;
        notifyPropertyChanged(BR.h0301ae0b);
    }

    @Bindable
    public String getH0301ae0c() {
        return h0301ae0c;
    }

    public void setH0301ae0c(String h0301ae0c) {
        if (this.h0301ae0c.equals(h0301ae0c)) return; // for all checkboxes
        this.h0301ae0c = h0301ae0c;
        notifyPropertyChanged(BR.h0301ae0c);
    }

    @Bindable
    public String getH1701() {
        return h1701;
    }

    public void setH1701(String h1701) {
        this.h1701 = h1701;
        notifyPropertyChanged(BR.h1701);
    }

    @Bindable
    public String getH1702() {
        return h1702;
    }

    public void setH1702(String h1702) {
        this.h1702 = h1702;
        notifyPropertyChanged(BR.h1702);
    }

    @Bindable
    public String getH1703() {
        return h1703;
    }

    public void setH1703(String h1703) {
        this.h1703 = h1703;
        notifyPropertyChanged(BR.h1703);
    }

    @Bindable
    public String getH1704() {
        return h1704;
    }

    public void setH1704(String h1704) {
        this.h1704 = h1704;
        notifyPropertyChanged(BR.h1704);
    }

    @Bindable
    public String getH0401() {
        return h0401;
    }

    public void setH0401(String h0401) {
        this.h0401 = h0401;
        setH0401xxx(h0401.equals("96") ? this.h0401xxx : "");
        notifyPropertyChanged(BR.h0401);
    }

    @Bindable
    public String getH0401xxx() {
        return h0401xxx;
    }

    public void setH0401xxx(String h0401xxx) {
        this.h0401xxx = h0401xxx;
        notifyPropertyChanged(BR.h0401xxx);
    }

    @Bindable
    public String getH0501() {
        return h0501;
    }

    public void setH0501(String h0501) {
        this.h0501 = h0501;
        setH0501xxx(h0501.equals("96") ? this.h0501xxx : "");
        notifyPropertyChanged(BR.h0501);
    }

    @Bindable
    public String getH0501xxx() {
        return h0501xxx;
    }

    public void setH0501xxx(String h0501xxx) {
        this.h0501xxx = h0501xxx;
        notifyPropertyChanged(BR.h0501xxx);
    }

    @Bindable
    public String getH0601() {
        return h0601;
    }

    public void setH0601(String h0601) {
        this.h0601 = h0601;
        setH0601aa(h0601.equals("1") ? this.h0601aa : "");
        notifyPropertyChanged(BR.h0601);
    }

    @Bindable
    public String getH0601aa() {
        return h0601aa;
    }

    public void setH0601aa(String h0601aa) {
        this.h0601aa = h0601aa;
        setH0601aaax(h0601aa.equals("1") ? this.h0601aaax : "");
        notifyPropertyChanged(BR.h0601aa);
    }

    @Bindable
    public String getH0601aaax() {
        return h0601aaax;
    }

    public void setH0601aaax(String h0601aaax) {
        this.h0601aaax = h0601aaax;
        notifyPropertyChanged(BR.h0601aaax);
    }

    @Bindable
    public String getH0602() {
        return h0602;
    }

    public void setH0602(String h0602) {
        this.h0602 = h0602;
        notifyPropertyChanged(BR.h0602);
    }

    @Bindable
    public String getH0603a() {
        return h0603a;
    }

    public void setH0603a(String h0603a) {
        this.h0603a = h0603a;
        notifyPropertyChanged(BR.h0603a);
    }

    @Bindable
    public String getH0603b() {
        return h0603b;
    }

    public void setH0603b(String h0603b) {
        this.h0603b = h0603b;
        notifyPropertyChanged(BR.h0603b);
    }

    @Bindable
    public String getH0603c() {
        return h0603c;
    }

    public void setH0603c(String h0603c) {
        this.h0603c = h0603c;
        notifyPropertyChanged(BR.h0603c);
    }

    @Bindable
    public String getH0701a() {
        return h0701a;
    }

    public void setH0701a(String h0701a) {
        this.h0701a = h0701a;
        notifyPropertyChanged(BR.h0701a);
    }

    @Bindable
    public String getH0701b() {
        return h0701b;
    }

    public void setH0701b(String h0701b) {
        this.h0701b = h0701b;
        notifyPropertyChanged(BR.h0701b);
    }

    @Bindable
    public String getH0701c() {
        return h0701c;
    }

    public void setH0701c(String h0701c) {
        this.h0701c = h0701c;
        notifyPropertyChanged(BR.h0701c);
    }

    @Bindable
    public String getH0701d() {
        return h0701d;
    }

    public void setH0701d(String h0701d) {
        this.h0701d = h0701d;
        notifyPropertyChanged(BR.h0701d);
    }

    @Bindable
    public String getH0701e() {
        return h0701e;
    }

    public void setH0701e(String h0701e) {
        this.h0701e = h0701e;
        notifyPropertyChanged(BR.h0701e);
    }

    @Bindable
    public String getH0701f() {
        return h0701f;
    }

    public void setH0701f(String h0701f) {
        this.h0701f = h0701f;
        notifyPropertyChanged(BR.h0701f);
    }

    @Bindable
    public String getH0701g() {
        return h0701g;
    }

    public void setH0701g(String h0701g) {
        this.h0701g = h0701g;
        notifyPropertyChanged(BR.h0701g);
    }

    @Bindable
    public String getH0801() {
        return h0801;
    }

    public void setH0801(String h0801) {
        this.h0801 = h0801;
        notifyPropertyChanged(BR.h0801);
    }

    @Bindable
    public String getH0802() {
        return h0802;
    }

    public void setH0802(String h0802) {
        this.h0802 = h0802;
        notifyPropertyChanged(BR.h0802);
    }

    @Bindable
    public String getH0901() {
        return h0901;
    }

    public void setH0901(String h0901) {
        this.h0901 = h0901;
        setH0902a(h0901.equals("1") ? this.h0902a : "");
        setH0902b(h0901.equals("1") ? this.h0902b : "");
        setH0902c(h0901.equals("1") ? this.h0902c : "");
        notifyPropertyChanged(BR.h0901);
    }

    @Bindable
    public String getH0902a() {
        return h0902a;
    }

    public void setH0902a(String h0902a) {
        this.h0902a = h0902a;
        notifyPropertyChanged(BR.h0902a);
    }

    @Bindable
    public String getH0902b() {
        return h0902b;
    }

    public void setH0902b(String h0902b) {
        this.h0902b = h0902b;
        notifyPropertyChanged(BR.h0902b);
    }

    @Bindable
    public String getH0902c() {
        return h0902c;
    }

    public void setH0902c(String h0902c) {
        this.h0902c = h0902c;
        notifyPropertyChanged(BR.h0902c);
    }

    @Bindable
    public String getH1001() {
        return h1001;
    }

    public void setH1001(String h1001) {
        this.h1001 = h1001;
        setH1002a(h1001.equals("1") ? this.h1002a : "");
        setH1002b(h1001.equals("1") ? this.h1002b : "");
        notifyPropertyChanged(BR.h1001);
    }

    @Bindable
    public String getH1002a() {
        return h1002a;
    }

    public void setH1002a(String h1002a) {
        this.h1002a = h1002a;
        notifyPropertyChanged(BR.h1002a);
    }

    @Bindable
    public String getH1002b() {
        return h1002b;
    }

    public void setH1002b(String h1002b) {
        this.h1002b = h1002b;
        notifyPropertyChanged(BR.h1002b);
    }

    @Bindable
    public String getH1101() {
        return h1101;
    }

    public void setH1101(String h1101) {
        this.h1101 = h1101;
        notifyPropertyChanged(BR.h1101);
    }

    @Bindable
    public String getH1102() {
        return h1102;
    }

    public void setH1102(String h1102) {
        this.h1102 = h1102;
        notifyPropertyChanged(BR.h1102);
    }

    @Bindable
    public String getH1103() {
        return h1103;
    }

    public void setH1103(String h1103) {
        this.h1103 = h1103;
        notifyPropertyChanged(BR.h1103);
    }

    @Bindable
    public String getH1104() {
        return h1104;
    }

    public void setH1104(String h1104) {
        this.h1104 = h1104;
        notifyPropertyChanged(BR.h1104);
    }

    @Bindable
    public String getH1105() {
        return h1105;
    }

    public void setH1105(String h1105) {
        this.h1105 = h1105;
        notifyPropertyChanged(BR.h1105);
    }

    @Bindable
    public String getH1106() {
        return h1106;
    }

    public void setH1106(String h1106) {
        this.h1106 = h1106;
        notifyPropertyChanged(BR.h1106);
    }

    @Bindable
    public String getH1201() {
        return h1201;
    }

    public void setH1201(String h1201) {
        this.h1201 = h1201;
        notifyPropertyChanged(BR.h1201);
    }

    @Bindable
    public String getH1202() {
        return h1202;
    }

    public void setH1202(String h1202) {
        this.h1202 = h1202;
        notifyPropertyChanged(BR.h1202);
    }

    @Bindable
    public String getH1203a() {
        return h1203a;
    }

    public void setH1203a(String h1203a) {
        this.h1203a = h1203a;
        notifyPropertyChanged(BR.h1203a);
    }

    @Bindable
    public String getH1203b() {
        return h1203b;
    }

    public void setH1203b(String h1203b) {
        this.h1203b = h1203b;
        notifyPropertyChanged(BR.h1203b);
    }

    @Bindable
    public String getH1203c() {
        return h1203c;
    }

    public void setH1203c(String h1203c) {
        this.h1203c = h1203c;
        notifyPropertyChanged(BR.h1203c);
    }

    @Bindable
    public String getH1203d() {
        return h1203d;
    }

    public void setH1203d(String h1203d) {
        this.h1203d = h1203d;
        notifyPropertyChanged(BR.h1203d);
    }

    @Bindable
    public String getH1203e() {
        return h1203e;
    }

    public void setH1203e(String h1203e) {
        this.h1203e = h1203e;
        notifyPropertyChanged(BR.h1203e);
    }

    @Bindable
    public String getH1203f() {
        return h1203f;
    }

    public void setH1203f(String h1203f) {
        this.h1203f = h1203f;
        notifyPropertyChanged(BR.h1203f);
    }

    @Bindable
    public String getH1203g() {
        return h1203g;
    }

    public void setH1203g(String h1203g) {
        this.h1203g = h1203g;
        notifyPropertyChanged(BR.h1203g);
    }

    @Bindable
    public String getH1301() {
        return h1301;
    }

    public void setH1301(String h1301) {
        this.h1301 = h1301;
        notifyPropertyChanged(BR.h1301);
    }

    @Bindable
    public String getH1302() {
        return h1302;
    }

    public void setH1302(String h1302) {
        this.h1302 = h1302;
        notifyPropertyChanged(BR.h1302);
    }

    @Bindable
    public String getH1303() {
        return h1303;
    }

    public void setH1303(String h1303) {
        this.h1303 = h1303;
        notifyPropertyChanged(BR.h1303);
    }

    @Bindable
    public String getH1401aa() {
        return h1401aa;
    }

    public void setH1401aa(String h1401aa) {
        this.h1401aa = h1401aa;
        notifyPropertyChanged(BR.h1401aa);
    }

    @Bindable
    public String getH1401ab() {
        return h1401ab;
    }

    public void setH1401ab(String h1401ab) {
        this.h1401ab = h1401ab;
        notifyPropertyChanged(BR.h1401ab);
    }

    @Bindable
    public String getH1401ba() {
        return h1401ba;
    }

    public void setH1401ba(String h1401ba) {
        this.h1401ba = h1401ba;
        notifyPropertyChanged(BR.h1401ba);
    }

    @Bindable
    public String getH1401bb() {
        return h1401bb;
    }

    public void setH1401bb(String h1401bb) {
        this.h1401bb = h1401bb;
        notifyPropertyChanged(BR.h1401bb);
    }

    @Bindable
    public String getH1401ca() {
        return h1401ca;
    }

    public void setH1401ca(String h1401ca) {
        this.h1401ca = h1401ca;
        notifyPropertyChanged(BR.h1401ca);
    }

    @Bindable
    public String getH1401cb() {
        return h1401cb;
    }

    public void setH1401cb(String h1401cb) {
        this.h1401cb = h1401cb;
        notifyPropertyChanged(BR.h1401cb);
    }

    @Bindable
    public String getH1401da() {
        return h1401da;
    }

    public void setH1401da(String h1401da) {
        this.h1401da = h1401da;
        notifyPropertyChanged(BR.h1401da);
    }

    @Bindable
    public String getH1401db() {
        return h1401db;
    }

    public void setH1401db(String h1401db) {
        this.h1401db = h1401db;
        notifyPropertyChanged(BR.h1401db);
    }

    @Bindable
    public String getH1401ea() {
        return h1401ea;
    }

    public void setH1401ea(String h1401ea) {
        this.h1401ea = h1401ea;
        notifyPropertyChanged(BR.h1401ea);
    }

    @Bindable
    public String getH1401eb() {
        return h1401eb;
    }

    public void setH1401eb(String h1401eb) {
        this.h1401eb = h1401eb;
        notifyPropertyChanged(BR.h1401eb);
    }

    @Bindable
    public String getH1501a0a() {
        return h1501a0a;
    }

    public void setH1501a0a(String h1501a0a) {
        this.h1501a0a = h1501a0a;
        notifyPropertyChanged(BR.h1501a0a);
    }

    @Bindable
    public String getH1501a0b() {
        return h1501a0b;
    }

    public void setH1501a0b(String h1501a0b) {
        this.h1501a0b = h1501a0b;
        notifyPropertyChanged(BR.h1501a0b);
    }

    @Bindable
    public String getH1501a0c() {
        return h1501a0c;
    }

    public void setH1501a0c(String h1501a0c) {
        this.h1501a0c = h1501a0c;
        notifyPropertyChanged(BR.h1501a0c);
    }

    @Bindable
    public String getH1501a0dy() {
        return h1501a0dy;
    }

    public void setH1501a0dy(String h1501a0dy) {
        this.h1501a0dy = h1501a0dy;
        notifyPropertyChanged(BR.h1501a0dy);
    }

    @Bindable
    public String getH1501a0dn() {
        return h1501a0dn;
    }

    public void setH1501a0dn(String h1501a0dn) {
        this.h1501a0dn = h1501a0dn;
        notifyPropertyChanged(BR.h1501a0dn);
    }

    @Bindable
    public String getH1501b0a() {
        return h1501b0a;
    }

    public void setH1501b0a(String h1501b0a) {
        this.h1501b0a = h1501b0a;
        notifyPropertyChanged(BR.h1501b0a);
    }

    @Bindable
    public String getH1501b0b() {
        return h1501b0b;
    }

    public void setH1501b0b(String h1501b0b) {
        this.h1501b0b = h1501b0b;
        notifyPropertyChanged(BR.h1501b0b);
    }

    @Bindable
    public String getH1501b0c() {
        return h1501b0c;
    }

    public void setH1501b0c(String h1501b0c) {
        this.h1501b0c = h1501b0c;
        notifyPropertyChanged(BR.h1501b0c);
    }

    @Bindable
    public String getH1501b0dy() {
        return h1501b0dy;
    }

    public void setH1501b0dy(String h1501b0dy) {
        this.h1501b0dy = h1501b0dy;
        notifyPropertyChanged(BR.h1501b0dy);
    }

    @Bindable
    public String getH1501b0dn() {
        return h1501b0dn;
    }

    public void setH1501b0dn(String h1501b0dn) {
        this.h1501b0dn = h1501b0dn;
        notifyPropertyChanged(BR.h1501b0dn);
    }

    @Bindable
    public String getH1501c0a() {
        return h1501c0a;
    }

    public void setH1501c0a(String h1501c0a) {
        this.h1501c0a = h1501c0a;
        notifyPropertyChanged(BR.h1501c0a);
    }

    @Bindable
    public String getH1501c0b() {
        return h1501c0b;
    }

    public void setH1501c0b(String h1501c0b) {
        this.h1501c0b = h1501c0b;
        notifyPropertyChanged(BR.h1501c0b);
    }

    @Bindable
    public String getH1501c0c() {
        return h1501c0c;
    }

    public void setH1501c0c(String h1501c0c) {
        this.h1501c0c = h1501c0c;
        notifyPropertyChanged(BR.h1501c0c);
    }

    @Bindable
    public String getH1501c0dy() {
        return h1501c0dy;
    }

    public void setH1501c0dy(String h1501c0dy) {
        this.h1501c0dy = h1501c0dy;
        notifyPropertyChanged(BR.h1501c0dy);
    }

    @Bindable
    public String getH1501c0dn() {
        return h1501c0dn;
    }

    public void setH1501c0dn(String h1501c0dn) {
        this.h1501c0dn = h1501c0dn;
        notifyPropertyChanged(BR.h1501c0dn);
    }

    @Bindable
    public String getH1501d0a() {
        return h1501d0a;
    }

    public void setH1501d0a(String h1501d0a) {
        this.h1501d0a = h1501d0a;
        notifyPropertyChanged(BR.h1501d0a);
    }

    @Bindable
    public String getH1501d0b() {
        return h1501d0b;
    }

    public void setH1501d0b(String h1501d0b) {
        this.h1501d0b = h1501d0b;
        notifyPropertyChanged(BR.h1501d0b);
    }

    @Bindable
    public String getH1501d0c() {
        return h1501d0c;
    }

    public void setH1501d0c(String h1501d0c) {
        this.h1501d0c = h1501d0c;
        notifyPropertyChanged(BR.h1501d0c);
    }

    @Bindable
    public String getH1501d0dy() {
        return h1501d0dy;
    }

    public void setH1501d0dy(String h1501d0dy) {
        this.h1501d0dy = h1501d0dy;
        notifyPropertyChanged(BR.h1501d0dy);
    }

    @Bindable
    public String getH1501d0dn() {
        return h1501d0dn;
    }

    public void setH1501d0dn(String h1501d0dn) {
        this.h1501d0dn = h1501d0dn;
        notifyPropertyChanged(BR.h1501d0dn);
    }

    @Bindable
    public String getH1501e0a() {
        return h1501e0a;
    }

    public void setH1501e0a(String h1501e0a) {
        this.h1501e0a = h1501e0a;
        notifyPropertyChanged(BR.h1501e0a);
    }

    @Bindable
    public String getH1501e0b() {
        return h1501e0b;
    }

    public void setH1501e0b(String h1501e0b) {
        this.h1501e0b = h1501e0b;
        notifyPropertyChanged(BR.h1501e0b);
    }

    @Bindable
    public String getH1501e0c() {
        return h1501e0c;
    }

    public void setH1501e0c(String h1501e0c) {
        this.h1501e0c = h1501e0c;
        notifyPropertyChanged(BR.h1501e0c);
    }

    @Bindable
    public String getH1501e0dy() {
        return h1501e0dy;
    }

    public void setH1501e0dy(String h1501e0dy) {
        this.h1501e0dy = h1501e0dy;
        notifyPropertyChanged(BR.h1501e0dy);
    }

    @Bindable
    public String getH1501e0dn() {
        return h1501e0dn;
    }

    public void setH1501e0dn(String h1501e0dn) {
        this.h1501e0dn = h1501e0dn;
        notifyPropertyChanged(BR.h1501e0dn);
    }

    @Bindable
    public String getH1501f0a() {
        return h1501f0a;
    }

    public void setH1501f0a(String h1501f0a) {
        this.h1501f0a = h1501f0a;
        notifyPropertyChanged(BR.h1501f0a);
    }

    @Bindable
    public String getH1501f0b() {
        return h1501f0b;
    }

    public void setH1501f0b(String h1501f0b) {
        this.h1501f0b = h1501f0b;
        notifyPropertyChanged(BR.h1501f0b);
    }

    @Bindable
    public String getH1501f0c() {
        return h1501f0c;
    }

    public void setH1501f0c(String h1501f0c) {
        this.h1501f0c = h1501f0c;
        notifyPropertyChanged(BR.h1501f0c);
    }

    @Bindable
    public String getH1501f0dy() {
        return h1501f0dy;
    }

    public void setH1501f0dy(String h1501f0dy) {
        this.h1501f0dy = h1501f0dy;
        notifyPropertyChanged(BR.h1501f0dy);
    }

    @Bindable
    public String getH1501f0dn() {
        return h1501f0dn;
    }

    public void setH1501f0dn(String h1501f0dn) {
        this.h1501f0dn = h1501f0dn;
        notifyPropertyChanged(BR.h1501f0dn);
    }

    @Bindable
    public String getH1501g0a() {
        return h1501g0a;
    }

    public void setH1501g0a(String h1501g0a) {
        this.h1501g0a = h1501g0a;
        notifyPropertyChanged(BR.h1501g0a);
    }

    @Bindable
    public String getH1501g0b() {
        return h1501g0b;
    }

    public void setH1501g0b(String h1501g0b) {
        this.h1501g0b = h1501g0b;
        notifyPropertyChanged(BR.h1501g0b);
    }

    @Bindable
    public String getH1501g0c() {
        return h1501g0c;
    }

    public void setH1501g0c(String h1501g0c) {
        this.h1501g0c = h1501g0c;
        notifyPropertyChanged(BR.h1501g0c);
    }

    @Bindable
    public String getH1501g0dy() {
        return h1501g0dy;
    }

    public void setH1501g0dy(String h1501g0dy) {
        this.h1501g0dy = h1501g0dy;
        notifyPropertyChanged(BR.h1501g0dy);
    }

    @Bindable
    public String getH1501g0dn() {
        return h1501g0dn;
    }

    public void setH1501g0dn(String h1501g0dn) {
        this.h1501g0dn = h1501g0dn;
        notifyPropertyChanged(BR.h1501g0dn);
    }

    @Bindable
    public String getH1501h0a() {
        return h1501h0a;
    }

    public void setH1501h0a(String h1501h0a) {
        this.h1501h0a = h1501h0a;
        notifyPropertyChanged(BR.h1501h0a);
    }

    @Bindable
    public String getH1501h0b() {
        return h1501h0b;
    }

    public void setH1501h0b(String h1501h0b) {
        this.h1501h0b = h1501h0b;
        notifyPropertyChanged(BR.h1501h0b);
    }

    @Bindable
    public String getH1501h0c() {
        return h1501h0c;
    }

    public void setH1501h0c(String h1501h0c) {
        this.h1501h0c = h1501h0c;
        notifyPropertyChanged(BR.h1501h0c);
    }

    @Bindable
    public String getH1501h0dy() {
        return h1501h0dy;
    }

    public void setH1501h0dy(String h1501h0dy) {
        this.h1501h0dy = h1501h0dy;
        notifyPropertyChanged(BR.h1501h0dy);
    }

    @Bindable
    public String getH1501h0dn() {
        return h1501h0dn;
    }

    public void setH1501h0dn(String h1501h0dn) {
        this.h1501h0dn = h1501h0dn;
        notifyPropertyChanged(BR.h1501h0dn);
    }

    @Bindable
    public String getH1501i0a() {
        return h1501i0a;
    }

    public void setH1501i0a(String h1501i0a) {
        this.h1501i0a = h1501i0a;
        notifyPropertyChanged(BR.h1501i0a);
    }

    @Bindable
    public String getH1501i0b() {
        return h1501i0b;
    }

    public void setH1501i0b(String h1501i0b) {
        this.h1501i0b = h1501i0b;
        notifyPropertyChanged(BR.h1501i0b);
    }

    @Bindable
    public String getH1501i0c() {
        return h1501i0c;
    }

    public void setH1501i0c(String h1501i0c) {
        this.h1501i0c = h1501i0c;
        notifyPropertyChanged(BR.h1501i0c);
    }

    @Bindable
    public String getH1501i0dy() {
        return h1501i0dy;
    }

    public void setH1501i0dy(String h1501i0dy) {
        this.h1501i0dy = h1501i0dy;
        notifyPropertyChanged(BR.h1501i0dy);
    }

    @Bindable
    public String getH1501i0dn() {
        return h1501i0dn;
    }

    public void setH1501i0dn(String h1501i0dn) {
        this.h1501i0dn = h1501i0dn;
        notifyPropertyChanged(BR.h1501i0dn);
    }

    @Bindable
    public String getH1501j0a() {
        return h1501j0a;
    }

    public void setH1501j0a(String h1501j0a) {
        this.h1501j0a = h1501j0a;
        notifyPropertyChanged(BR.h1501j0a);
    }

    @Bindable
    public String getH1501j0b() {
        return h1501j0b;
    }

    public void setH1501j0b(String h1501j0b) {
        this.h1501j0b = h1501j0b;
        notifyPropertyChanged(BR.h1501j0b);
    }

    @Bindable
    public String getH1501j0c() {
        return h1501j0c;
    }

    public void setH1501j0c(String h1501j0c) {
        this.h1501j0c = h1501j0c;
        notifyPropertyChanged(BR.h1501j0c);
    }

    @Bindable
    public String getH1501j0dy() {
        return h1501j0dy;
    }

    public void setH1501j0dy(String h1501j0dy) {
        this.h1501j0dy = h1501j0dy;
        notifyPropertyChanged(BR.h1501j0dy);
    }

    @Bindable
    public String getH1501j0dn() {
        return h1501j0dn;
    }

    public void setH1501j0dn(String h1501j0dn) {
        this.h1501j0dn = h1501j0dn;
        notifyPropertyChanged(BR.h1501j0dn);
    }

    @Bindable
    public String getH1501k0a() {
        return h1501k0a;
    }

    public void setH1501k0a(String h1501k0a) {
        this.h1501k0a = h1501k0a;
        notifyPropertyChanged(BR.h1501k0a);
    }

    @Bindable
    public String getH1501k0b() {
        return h1501k0b;
    }

    public void setH1501k0b(String h1501k0b) {
        this.h1501k0b = h1501k0b;
        notifyPropertyChanged(BR.h1501k0b);
    }

    @Bindable
    public String getH1501k0c() {
        return h1501k0c;
    }

    public void setH1501k0c(String h1501k0c) {
        this.h1501k0c = h1501k0c;
        notifyPropertyChanged(BR.h1501k0c);
    }

    @Bindable
    public String getH1501k0dy() {
        return h1501k0dy;
    }

    public void setH1501k0dy(String h1501k0dy) {
        this.h1501k0dy = h1501k0dy;
        notifyPropertyChanged(BR.h1501k0dy);
    }

    @Bindable
    public String getH1501k0dn() {
        return h1501k0dn;
    }

    public void setH1501k0dn(String h1501k0dn) {
        this.h1501k0dn = h1501k0dn;
        notifyPropertyChanged(BR.h1501k0dn);
    }

    @Bindable
    public String getH1501l0a() {
        return h1501l0a;
    }

    public void setH1501l0a(String h1501l0a) {
        this.h1501l0a = h1501l0a;
        notifyPropertyChanged(BR.h1501l0a);
    }

    @Bindable
    public String getH1501l0b() {
        return h1501l0b;
    }

    public void setH1501l0b(String h1501l0b) {
        this.h1501l0b = h1501l0b;
        notifyPropertyChanged(BR.h1501l0b);
    }

    @Bindable
    public String getH1501l0c() {
        return h1501l0c;
    }

    public void setH1501l0c(String h1501l0c) {
        this.h1501l0c = h1501l0c;
        notifyPropertyChanged(BR.h1501l0c);
    }

    @Bindable
    public String getH1501l0dy() {
        return h1501l0dy;
    }

    public void setH1501l0dy(String h1501l0dy) {
        this.h1501l0dy = h1501l0dy;
        notifyPropertyChanged(BR.h1501l0dy);
    }

    @Bindable
    public String getH1501l0dn() {
        return h1501l0dn;
    }

    public void setH1501l0dn(String h1501l0dn) {
        this.h1501l0dn = h1501l0dn;
        notifyPropertyChanged(BR.h1501l0dn);
    }

    @Bindable
    public String getH1501m0a() {
        return h1501m0a;
    }

    public void setH1501m0a(String h1501m0a) {
        this.h1501m0a = h1501m0a;
        notifyPropertyChanged(BR.h1501m0a);
    }

    @Bindable
    public String getH1501m0b() {
        return h1501m0b;
    }

    public void setH1501m0b(String h1501m0b) {
        this.h1501m0b = h1501m0b;
        notifyPropertyChanged(BR.h1501m0b);
    }

    @Bindable
    public String getH1501m0c() {
        return h1501m0c;
    }

    public void setH1501m0c(String h1501m0c) {
        this.h1501m0c = h1501m0c;
        notifyPropertyChanged(BR.h1501m0c);
    }

    @Bindable
    public String getH1501m0dy() {
        return h1501m0dy;
    }

    public void setH1501m0dy(String h1501m0dy) {
        this.h1501m0dy = h1501m0dy;
        notifyPropertyChanged(BR.h1501m0dy);
    }

    @Bindable
    public String getH1501m0dn() {
        return h1501m0dn;
    }

    public void setH1501m0dn(String h1501m0dn) {
        this.h1501m0dn = h1501m0dn;
        notifyPropertyChanged(BR.h1501m0dn);
    }

    @Bindable
    public String getH1501n0a() {
        return h1501n0a;
    }

    public void setH1501n0a(String h1501n0a) {
        this.h1501n0a = h1501n0a;
        notifyPropertyChanged(BR.h1501n0a);
    }

    @Bindable
    public String getH1501n0b() {
        return h1501n0b;
    }

    public void setH1501n0b(String h1501n0b) {
        this.h1501n0b = h1501n0b;
        notifyPropertyChanged(BR.h1501n0b);
    }

    @Bindable
    public String getH1501n0c() {
        return h1501n0c;
    }

    public void setH1501n0c(String h1501n0c) {
        this.h1501n0c = h1501n0c;
        notifyPropertyChanged(BR.h1501n0c);
    }

    @Bindable
    public String getH1501n0dy() {
        return h1501n0dy;
    }

    public void setH1501n0dy(String h1501n0dy) {
        this.h1501n0dy = h1501n0dy;
        notifyPropertyChanged(BR.h1501n0dy);
    }

    @Bindable
    public String getH1501n0dn() {
        return h1501n0dn;
    }

    public void setH1501n0dn(String h1501n0dn) {
        this.h1501n0dn = h1501n0dn;
        notifyPropertyChanged(BR.h1501n0dn);
    }

    @Bindable
    public String getH1501o0a() {
        return h1501o0a;
    }

    public void setH1501o0a(String h1501o0a) {
        this.h1501o0a = h1501o0a;
        notifyPropertyChanged(BR.h1501o0a);
    }

    @Bindable
    public String getH1501o0b() {
        return h1501o0b;
    }

    public void setH1501o0b(String h1501o0b) {
        this.h1501o0b = h1501o0b;
        notifyPropertyChanged(BR.h1501o0b);
    }

    @Bindable
    public String getH1501o0c() {
        return h1501o0c;
    }

    public void setH1501o0c(String h1501o0c) {
        this.h1501o0c = h1501o0c;
        notifyPropertyChanged(BR.h1501o0c);
    }

    @Bindable
    public String getH1501o0dy() {
        return h1501o0dy;
    }

    public void setH1501o0dy(String h1501o0dy) {
        this.h1501o0dy = h1501o0dy;
        notifyPropertyChanged(BR.h1501o0dy);
    }

    @Bindable
    public String getH1501o0dn() {
        return h1501o0dn;
    }

    public void setH1501o0dn(String h1501o0dn) {
        this.h1501o0dn = h1501o0dn;
        notifyPropertyChanged(BR.h1501o0dn);
    }

    @Bindable
    public String getH1501p0a() {
        return h1501p0a;
    }

    public void setH1501p0a(String h1501p0a) {
        this.h1501p0a = h1501p0a;
        notifyPropertyChanged(BR.h1501p0a);
    }

    @Bindable
    public String getH1501p0b() {
        return h1501p0b;
    }

    public void setH1501p0b(String h1501p0b) {
        this.h1501p0b = h1501p0b;
        notifyPropertyChanged(BR.h1501p0b);
    }

    @Bindable
    public String getH1501p0c() {
        return h1501p0c;
    }

    public void setH1501p0c(String h1501p0c) {
        this.h1501p0c = h1501p0c;
        notifyPropertyChanged(BR.h1501p0c);
    }

    @Bindable
    public String getH1501p0dy() {
        return h1501p0dy;
    }

    public void setH1501p0dy(String h1501p0dy) {
        this.h1501p0dy = h1501p0dy;
        notifyPropertyChanged(BR.h1501p0dy);
    }

    @Bindable
    public String getH1501p0dn() {
        return h1501p0dn;
    }

    public void setH1501p0dn(String h1501p0dn) {
        this.h1501p0dn = h1501p0dn;
        notifyPropertyChanged(BR.h1501p0dn);
    }

    @Bindable
    public String getH1501q0a() {
        return h1501q0a;
    }

    public void setH1501q0a(String h1501q0a) {
        this.h1501q0a = h1501q0a;
        notifyPropertyChanged(BR.h1501q0a);
    }

    @Bindable
    public String getH1501q0b() {
        return h1501q0b;
    }

    public void setH1501q0b(String h1501q0b) {
        this.h1501q0b = h1501q0b;
        notifyPropertyChanged(BR.h1501q0b);
    }

    @Bindable
    public String getH1501q0c() {
        return h1501q0c;
    }

    public void setH1501q0c(String h1501q0c) {
        this.h1501q0c = h1501q0c;
        notifyPropertyChanged(BR.h1501q0c);
    }

    @Bindable
    public String getH1501q0dy() {
        return h1501q0dy;
    }

    public void setH1501q0dy(String h1501q0dy) {
        this.h1501q0dy = h1501q0dy;
        notifyPropertyChanged(BR.h1501q0dy);
    }

    @Bindable
    public String getH1501q0dn() {
        return h1501q0dn;
    }

    public void setH1501q0dn(String h1501q0dn) {
        this.h1501q0dn = h1501q0dn;
        notifyPropertyChanged(BR.h1501q0dn);
    }

    @Bindable
    public String getH1501r0a() {
        return h1501r0a;
    }

    public void setH1501r0a(String h1501r0a) {
        this.h1501r0a = h1501r0a;
        notifyPropertyChanged(BR.h1501r0a);
    }

    @Bindable
    public String getH1501r0b() {
        return h1501r0b;
    }

    public void setH1501r0b(String h1501r0b) {
        this.h1501r0b = h1501r0b;
        notifyPropertyChanged(BR.h1501r0b);
    }

    @Bindable
    public String getH1501r0c() {
        return h1501r0c;
    }

    public void setH1501r0c(String h1501r0c) {
        this.h1501r0c = h1501r0c;
        notifyPropertyChanged(BR.h1501r0c);
    }

    @Bindable
    public String getH1501r0dy() {
        return h1501r0dy;
    }

    public void setH1501r0dy(String h1501r0dy) {
        this.h1501r0dy = h1501r0dy;
        notifyPropertyChanged(BR.h1501r0dy);
    }

    @Bindable
    public String getH1501r0dn() {
        return h1501r0dn;
    }

    public void setH1501r0dn(String h1501r0dn) {
        this.h1501r0dn = h1501r0dn;
        notifyPropertyChanged(BR.h1501r0dn);
    }

    @Bindable
    public String getH1501s0a() {
        return h1501s0a;
    }

    public void setH1501s0a(String h1501s0a) {
        this.h1501s0a = h1501s0a;
        notifyPropertyChanged(BR.h1501s0a);
    }

    @Bindable
    public String getH1501s0b() {
        return h1501s0b;
    }

    public void setH1501s0b(String h1501s0b) {
        this.h1501s0b = h1501s0b;
        notifyPropertyChanged(BR.h1501s0b);
    }

    @Bindable
    public String getH1501s0c() {
        return h1501s0c;
    }

    public void setH1501s0c(String h1501s0c) {
        this.h1501s0c = h1501s0c;
        notifyPropertyChanged(BR.h1501s0c);
    }

    @Bindable
    public String getH1501s0dy() {
        return h1501s0dy;
    }

    public void setH1501s0dy(String h1501s0dy) {
        this.h1501s0dy = h1501s0dy;
        notifyPropertyChanged(BR.h1501s0dy);
    }

    @Bindable
    public String getH1501s0dn() {
        return h1501s0dn;
    }

    public void setH1501s0dn(String h1501s0dn) {
        this.h1501s0dn = h1501s0dn;
        notifyPropertyChanged(BR.h1501s0dn);
    }

    @Bindable
    public String getH1501t0a() {
        return h1501t0a;
    }

    public void setH1501t0a(String h1501t0a) {
        this.h1501t0a = h1501t0a;
        notifyPropertyChanged(BR.h1501t0a);
    }

    @Bindable
    public String getH1501t0b() {
        return h1501t0b;
    }

    public void setH1501t0b(String h1501t0b) {
        this.h1501t0b = h1501t0b;
        notifyPropertyChanged(BR.h1501t0b);
    }

    @Bindable
    public String getH1501t0c() {
        return h1501t0c;
    }

    public void setH1501t0c(String h1501t0c) {
        this.h1501t0c = h1501t0c;
        notifyPropertyChanged(BR.h1501t0c);
    }

    @Bindable
    public String getH1501t0dy() {
        return h1501t0dy;
    }

    public void setH1501t0dy(String h1501t0dy) {
        this.h1501t0dy = h1501t0dy;
        notifyPropertyChanged(BR.h1501t0dy);
    }

    @Bindable
    public String getH1501t0dn() {
        return h1501t0dn;
    }

    public void setH1501t0dn(String h1501t0dn) {
        this.h1501t0dn = h1501t0dn;
        notifyPropertyChanged(BR.h1501t0dn);
    }

    @Bindable
    public String getH1501u0a() {
        return h1501u0a;
    }

    public void setH1501u0a(String h1501u0a) {
        this.h1501u0a = h1501u0a;
        notifyPropertyChanged(BR.h1501u0a);
    }

    @Bindable
    public String getH1501u0b() {
        return h1501u0b;
    }

    public void setH1501u0b(String h1501u0b) {
        this.h1501u0b = h1501u0b;
        notifyPropertyChanged(BR.h1501u0b);
    }

    @Bindable
    public String getH1501u0c() {
        return h1501u0c;
    }

    public void setH1501u0c(String h1501u0c) {
        this.h1501u0c = h1501u0c;
        notifyPropertyChanged(BR.h1501u0c);
    }

    @Bindable
    public String getH1501u0dy() {
        return h1501u0dy;
    }

    public void setH1501u0dy(String h1501u0dy) {
        this.h1501u0dy = h1501u0dy;
        notifyPropertyChanged(BR.h1501u0dy);
    }

    @Bindable
    public String getH1501u0dn() {
        return h1501u0dn;
    }

    public void setH1501u0dn(String h1501u0dn) {
        this.h1501u0dn = h1501u0dn;
        notifyPropertyChanged(BR.h1501u0dn);
    }

    @Bindable
    public String getH1501v0a() {
        return h1501v0a;
    }

    public void setH1501v0a(String h1501v0a) {
        this.h1501v0a = h1501v0a;
        notifyPropertyChanged(BR.h1501v0a);
    }

    @Bindable
    public String getH1501v0b() {
        return h1501v0b;
    }

    public void setH1501v0b(String h1501v0b) {
        this.h1501v0b = h1501v0b;
        notifyPropertyChanged(BR.h1501v0b);
    }

    @Bindable
    public String getH1501v0c() {
        return h1501v0c;
    }

    public void setH1501v0c(String h1501v0c) {
        this.h1501v0c = h1501v0c;
        notifyPropertyChanged(BR.h1501v0c);
    }

    @Bindable
    public String getH1501v0dy() {
        return h1501v0dy;
    }

    public void setH1501v0dy(String h1501v0dy) {
        this.h1501v0dy = h1501v0dy;
        notifyPropertyChanged(BR.h1501v0dy);
    }

    @Bindable
    public String getH1501v0dn() {
        return h1501v0dn;
    }

    public void setH1501v0dn(String h1501v0dn) {
        this.h1501v0dn = h1501v0dn;
        notifyPropertyChanged(BR.h1501v0dn);
    }

    @Bindable
    public String getH1501w0a() {
        return h1501w0a;
    }

    public void setH1501w0a(String h1501w0a) {
        this.h1501w0a = h1501w0a;
        notifyPropertyChanged(BR.h1501w0a);
    }

    @Bindable
    public String getH1501w0b() {
        return h1501w0b;
    }

    public void setH1501w0b(String h1501w0b) {
        this.h1501w0b = h1501w0b;
        notifyPropertyChanged(BR.h1501w0b);
    }

    @Bindable
    public String getH1501w0c() {
        return h1501w0c;
    }

    public void setH1501w0c(String h1501w0c) {
        this.h1501w0c = h1501w0c;
        notifyPropertyChanged(BR.h1501w0c);
    }

    @Bindable
    public String getH1501w0dy() {
        return h1501w0dy;
    }

    public void setH1501w0dy(String h1501w0dy) {
        this.h1501w0dy = h1501w0dy;
        notifyPropertyChanged(BR.h1501w0dy);
    }

    @Bindable
    public String getH1501w0dn() {
        return h1501w0dn;
    }

    public void setH1501w0dn(String h1501w0dn) {
        this.h1501w0dn = h1501w0dn;
        notifyPropertyChanged(BR.h1501w0dn);
    }

    @Bindable
    public String getH1501x0a() {
        return h1501x0a;
    }

    public void setH1501x0a(String h1501x0a) {
        this.h1501x0a = h1501x0a;
        notifyPropertyChanged(BR.h1501x0a);
    }

    @Bindable
    public String getH1501x0b() {
        return h1501x0b;
    }

    public void setH1501x0b(String h1501x0b) {
        this.h1501x0b = h1501x0b;
        notifyPropertyChanged(BR.h1501x0b);
    }

    @Bindable
    public String getH1501x0c() {
        return h1501x0c;
    }

    public void setH1501x0c(String h1501x0c) {
        this.h1501x0c = h1501x0c;
        notifyPropertyChanged(BR.h1501x0c);
    }

    @Bindable
    public String getH1501x0dy() {
        return h1501x0dy;
    }

    public void setH1501x0dy(String h1501x0dy) {
        this.h1501x0dy = h1501x0dy;
        notifyPropertyChanged(BR.h1501x0dy);
    }

    @Bindable
    public String getH1501x0dn() {
        return h1501x0dn;
    }

    public void setH1501x0dn(String h1501x0dn) {
        this.h1501x0dn = h1501x0dn;
        notifyPropertyChanged(BR.h1501x0dn);
    }

    @Bindable
    public String getH1501y0a() {
        return h1501y0a;
    }

    public void setH1501y0a(String h1501y0a) {
        this.h1501y0a = h1501y0a;
        notifyPropertyChanged(BR.h1501y0a);
    }

    @Bindable
    public String getH1501y0b() {
        return h1501y0b;
    }

    public void setH1501y0b(String h1501y0b) {
        this.h1501y0b = h1501y0b;
        notifyPropertyChanged(BR.h1501y0b);
    }

    @Bindable
    public String getH1501y0c() {
        return h1501y0c;
    }

    public void setH1501y0c(String h1501y0c) {
        this.h1501y0c = h1501y0c;
        notifyPropertyChanged(BR.h1501y0c);
    }

    @Bindable
    public String getH1501y0dy() {
        return h1501y0dy;
    }

    public void setH1501y0dy(String h1501y0dy) {
        this.h1501y0dy = h1501y0dy;
        notifyPropertyChanged(BR.h1501y0dy);
    }

    @Bindable
    public String getH1501y0dn() {
        return h1501y0dn;
    }

    public void setH1501y0dn(String h1501y0dn) {
        this.h1501y0dn = h1501y0dn;
        notifyPropertyChanged(BR.h1501y0dn);
    }

    @Bindable
    public String getH1501z0a() {
        return h1501z0a;
    }

    public void setH1501z0a(String h1501z0a) {
        this.h1501z0a = h1501z0a;
        notifyPropertyChanged(BR.h1501z0a);
    }

    @Bindable
    public String getH1501z0b() {
        return h1501z0b;
    }

    public void setH1501z0b(String h1501z0b) {
        this.h1501z0b = h1501z0b;
        notifyPropertyChanged(BR.h1501z0b);
    }

    @Bindable
    public String getH1501z0c() {
        return h1501z0c;
    }

    public void setH1501z0c(String h1501z0c) {
        this.h1501z0c = h1501z0c;
        notifyPropertyChanged(BR.h1501z0c);
    }

    @Bindable
    public String getH1501z0dy() {
        return h1501z0dy;
    }

    public void setH1501z0dy(String h1501z0dy) {
        this.h1501z0dy = h1501z0dy;
        notifyPropertyChanged(BR.h1501z0dy);
    }

    @Bindable
    public String getH1501z0dn() {
        return h1501z0dn;
    }

    public void setH1501z0dn(String h1501z0dn) {
        this.h1501z0dn = h1501z0dn;
        notifyPropertyChanged(BR.h1501z0dn);
    }

    @Bindable
    public String getH1601() {
        return h1601;
    }

    public void setH1601(String h1601) {
        this.h1601 = h1601;
        notifyPropertyChanged(BR.h1601);
    }

    @Bindable
    public String getH1602() {
        return h1602;
    }

    public void setH1602(String h1602) {
        this.h1602 = h1602;
        setH1602xxx(h1602.equals("96") ? this.h1602xxx : "");
        notifyPropertyChanged(BR.h1602);
    }

    @Bindable
    public String getH1602xxx() {
        return h1602xxx;
    }

    public void setH1602xxx(String h1602xxx) {
        this.h1602xxx = h1602xxx;
        notifyPropertyChanged(BR.h1602xxx);
    }

    @Bindable
    public String getH1603() {
        return h1603;
    }

    public void setH1603(String h1603) {
        this.h1603 = h1603;
        setH1603xxx(h1603.equals("96") ? this.h1603xxx : "");
        notifyPropertyChanged(BR.h1603);
    }

    @Bindable
    public String getH1603xxx() {
        return h1603xxx;
    }

    public void setH1603xxx(String h1603xxx) {
        this.h1603xxx = h1603xxx;
        notifyPropertyChanged(BR.h1603xxx);
    }

    @Bindable
    public String getH1604() {
        return h1604;
    }

    public void setH1604(String h1604) {
        this.h1604 = h1604;
        notifyPropertyChanged(BR.h1604);
    }

    @Bindable
    public String getH1605() {
        return h1605;
    }

    public void setH1605(String h1605) {
        this.h1605 = h1605;
        setH1605xxx(h1605.equals("96") ? this.h1605xxx : "");
        notifyPropertyChanged(BR.h1605);
    }

    @Bindable
    public String getH1605xxx() {
        return h1605xxx;
    }

    public void setH1605xxx(String h1605xxx) {
        this.h1605xxx = h1605xxx;
        notifyPropertyChanged(BR.h1605xxx);
    }


    public ModuleH Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_UUID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SYNCED_DATE));
        sH1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH1)));
        sH2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH2)));
        sH3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH3)));
        sH4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH4)));
        sH5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH5)));
        sH6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH6)));
        sH7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH7)));
        sH8Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH8)));
        sH9Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH9)));
        sH10Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH10)));
        sH11Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH11)));
        sH12Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH12)));
        sH13Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH13)));
        sH14Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH14)));
        sH151Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH151)));
        sH152Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH152)));
        sH16Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH16)));
        sH17Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleHTable.COLUMN_SH17)));
        return this;
    }

    public void sH1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h0101aa = json.getString("h0101aa");
            this.h0101ab = json.getString("h0101ab");
            this.h0101ba = json.getString("h0101ba");
            this.h0101bb = json.getString("h0101bb");
            this.h0101ca = json.getString("h0101ca");
            this.h0101cb = json.getString("h0101cb");
        }
    }

    public void sH2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h0201 = json.getString("h0201");
            this.h0202 = json.getString("h0202");
            this.h0203a = json.getString("h0203a");
            this.h0203b = json.getString("h0203b");
        }
    }

    public void sH3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h0301a0a = json.getString("h0301a0a");
            this.h0301a0b = json.getString("h0301a0b");
            this.h0301a0bc = json.getString("h0301a0bc");
            this.h0301b0a = json.getString("h0301b0a");
            this.h0301b0b = json.getString("h0301b0b");
            this.h0301b0c = json.getString("h0301b0c");
            this.h0301c0a = json.getString("h0301c0a");
            this.h0301c0b = json.getString("h0301c0b");
            this.h0301c0c = json.getString("h0301c0c");
            this.h0301d0a = json.getString("h0301d0a");
            this.h0301d0b = json.getString("h0301d0b");
            this.h0301d0c = json.getString("h0301d0c");
            this.h0301e0a = json.getString("h0301e0a");
            this.h0301e0b = json.getString("h0301e0b");
            this.h0301e0c = json.getString("h0301e0c");
            this.h0301f0a = json.getString("h0301f0a");
            this.h0301f0b = json.getString("h0301f0b");
            this.h0301f0c = json.getString("h0301f0c");
            this.h0301g0a = json.getString("h0301g0a");
            this.h0301g0b = json.getString("h0301g0b");
            this.h0301g0c = json.getString("h0301g0c");
            this.h03011h0a = json.getString("h03011h0a");
            this.h03011h0b = json.getString("h03011h0b");
            this.h03011h0c = json.getString("h03011h0c");
            this.h0301i0a = json.getString("h0301i0a");
            this.h0301i0b = json.getString("h0301i0b");
            this.h0301i0c = json.getString("h0301i0c");
            this.h0301j0a = json.getString("h0301j0a");
            this.h0301j0b = json.getString("h0301j0b");
            this.h0301j0c = json.getString("h0301j0c");
            this.h0301k0a = json.getString("h0301k0a");
            this.h0301k0b = json.getString("h0301k0b");
            this.h0301k0c = json.getString("h0301k0c");
            this.h0301l0a = json.getString("h0301l0a");
            this.h0301l0b = json.getString("h0301l0b");
            this.h0301l0c = json.getString("h0301l0c");
            this.h0301m0a = json.getString("h0301m0a");
            this.h0301m0b = json.getString("h0301m0b");
            this.h0301m0c = json.getString("h0301m0c");
            this.h0301n0a = json.getString("h0301n0a");
            this.h0301n0b = json.getString("h0301n0b");
            this.h0301n0c = json.getString("h0301n0c");
            this.h0301o0a = json.getString("h0301o0a");
            this.h0301o0b = json.getString("h0301o0b");
            this.h0301o0c = json.getString("h0301o0c");
            this.h0301p0a = json.getString("h0301p0a");
            this.h0301p0b = json.getString("h0301p0b");
            this.h0301p0c = json.getString("h0301p0c");
            this.h0301q0a = json.getString("h0301q0a");
            this.h0301q0b = json.getString("h0301q0b");
            this.h0301q0c = json.getString("h0301q0c");
            this.h0301r0a = json.getString("h0301r0a");
            this.h0301r0b = json.getString("h0301r0b");
            this.h0301r0c = json.getString("h0301r0c");
            this.h0301s0a = json.getString("h0301s0a");
            this.h0301s0b = json.getString("h0301s0b");
            this.h0301s0c = json.getString("h0301s0c");
            this.h0301t0a = json.getString("h0301t0a");
            this.h0301t0b = json.getString("h0301t0b");
            this.h0301t0c = json.getString("h0301t0c");
            this.h0301u0a = json.getString("h0301u0a");
            this.h0301u0b = json.getString("h0301u0b");
            this.h0301u0c = json.getString("h0301u0c");
            this.h0301v0a = json.getString("h0301v0a");
            this.h0301v0b = json.getString("h0301v0b");
            this.h0301v0c = json.getString("h0301v0c");
            this.h0301w0a = json.getString("h0301w0a");
            this.h0301w0b = json.getString("h0301w0b");
            this.h0301w0c = json.getString("h0301w0c");
            this.h0301x0a = json.getString("h0301x0a");
            this.h0301x0b = json.getString("h0301x0b");
            this.h0301x0c = json.getString("h0301x0c");
            this.h0301y0a = json.getString("h0301y0a");
            this.h0301y0b = json.getString("h0301y0b");
            this.h0301y0c = json.getString("h0301y0c");
            this.h0301z0a = json.getString("h0301z0a");
            this.h0301z0b = json.getString("h0301z0b");
            this.h0301z0c = json.getString("h0301z0c");
            this.h0301aa0a = json.getString("h0301aa0a");
            this.h0301aa0b = json.getString("h0301aa0b");
            this.h0301aa0c = json.getString("h0301aa0c");
            this.h0301ab0a = json.getString("h0301ab0a");
            this.h0301ab0b = json.getString("h0301ab0b");
            this.h0301ab0c = json.getString("h0301ab0c");
            this.h0301ac0a = json.getString("h0301ac0a");
            this.h0301ac0b = json.getString("h0301ac0b");
            this.h0301ac0c = json.getString("h0301ac0c");
            this.h0301ad0a = json.getString("h0301ad0a");
            this.h0301ad0b = json.getString("h0301ad0b");
            this.h0301ad0c = json.getString("h0301ad0c");
            this.h0301ae0a = json.getString("h0301ae0a");
            this.h0301ae0b = json.getString("h0301ae0b");
            this.h0301ae0c = json.getString("h0301ae0c");
        }
    }

    public void sH4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h0401 = json.getString("h0401");
            this.h0401xxx = json.getString("h0401xxx");
        }
    }

    public void sH5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h0501 = json.getString("h0501");
            this.h0501xxx = json.getString("h0501xxx");
        }
    }

    public void sH6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h0601 = json.getString("h0601");
            this.h0601aa = json.getString("h0601aa");
            this.h0601aaax = json.getString("h0601aaax");
            this.h0602 = json.getString("h0602");
            this.h0603a = json.getString("h0603a");
            this.h0603b = json.getString("h0603b");
            this.h0603c = json.getString("h0603c");
        }
    }

    public void sH7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h0701a = json.getString("h0701a");
            this.h0701b = json.getString("h0701b");
            this.h0701c = json.getString("h0701c");
            this.h0701d = json.getString("h0701d");
            this.h0701e = json.getString("h0701e");
            this.h0701f = json.getString("h0701f");
            this.h0701g = json.getString("h0701g");
        }
    }

    public void sH8Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH8Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h0801 = json.getString("h0801");
            this.h0802 = json.getString("h0802");
        }
    }

    public void sH9Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH9Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h0901 = json.getString("h0901");
            this.h0902a = json.getString("h0902a");
            this.h0902b = json.getString("h0902b");
            this.h0902c = json.getString("h0902c");
        }
    }

    public void sH10Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH10Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h1001 = json.getString("h1001");
            this.h1002a = json.getString("h1002a");
            this.h1002b = json.getString("h1002b");
        }
    }

    public void sH11Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH11Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h1101 = json.getString("h1101");
            this.h1102 = json.getString("h1102");
            this.h1103 = json.getString("h1103");
            this.h1104 = json.getString("h1104");
            this.h1105 = json.getString("h1105");
            this.h1106 = json.getString("h1106");
        }
    }

    public void sH12Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH12Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h1201 = json.getString("h1201");
            this.h1202 = json.getString("h1202");
            this.h1203a = json.getString("h1203a");
            this.h1203b = json.getString("h1203b");
            this.h1203c = json.getString("h1203c");
            this.h1203d = json.getString("h1203d");
            this.h1203e = json.getString("h1203e");
            this.h1203f = json.getString("h1203f");
            this.h1203g = json.getString("h1203g");
        }
    }

    public void sH13Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH13Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h1301 = json.getString("h1301");
            this.h1302 = json.getString("h1302");
            this.h1303 = json.getString("h1303");
        }
    }

    public void sH14Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH14Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h1401aa = json.getString("h1401aa");
            this.h1401ab = json.getString("h1401ab");
            this.h1401ba = json.getString("h1401ba");
            this.h1401bb = json.getString("h1401bb");
            this.h1401ca = json.getString("h1401ca");
            this.h1401cb = json.getString("h1401cb");
            this.h1401da = json.getString("h1401da");
            this.h1401db = json.getString("h1401db");
            this.h1401ea = json.getString("h1401ea");
            this.h1401eb = json.getString("h1401eb");
        }
    }

    public void sH151Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH151Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h1501a0a = json.getString("h1501a0a");
            this.h1501a0b = json.getString("h1501a0b");
            this.h1501a0c = json.getString("h1501a0c");
            this.h1501a0dy = json.getString("h1501a0dy");
            this.h1501a0dn = json.getString("h1501a0dn");
            this.h1501b0a = json.getString("h1501b0a");
            this.h1501b0b = json.getString("h1501b0b");
            this.h1501b0c = json.getString("h1501b0c");
            this.h1501b0dy = json.getString("h1501b0dy");
            this.h1501b0dn = json.getString("h1501b0dn");
            this.h1501c0a = json.getString("h1501c0a");
            this.h1501c0b = json.getString("h1501c0b");
            this.h1501c0c = json.getString("h1501c0c");
            this.h1501c0dy = json.getString("h1501c0dy");
            this.h1501c0dn = json.getString("h1501c0dn");
            this.h1501d0a = json.getString("h1501d0a");
            this.h1501d0b = json.getString("h1501d0b");
            this.h1501d0c = json.getString("h1501d0c");
            this.h1501d0dy = json.getString("h1501d0dy");
            this.h1501d0dn = json.getString("h1501d0dn");
            this.h1501e0a = json.getString("h1501e0a");
            this.h1501e0b = json.getString("h1501e0b");
            this.h1501e0c = json.getString("h1501e0c");
            this.h1501e0dy = json.getString("h1501e0dy");
            this.h1501e0dn = json.getString("h1501e0dn");
            this.h1501f0a = json.getString("h1501f0a");
            this.h1501f0b = json.getString("h1501f0b");
            this.h1501f0c = json.getString("h1501f0c");
            this.h1501f0dy = json.getString("h1501f0dy");
            this.h1501f0dn = json.getString("h1501f0dn");
            this.h1501g0a = json.getString("h1501g0a");
            this.h1501g0b = json.getString("h1501g0b");
            this.h1501g0c = json.getString("h1501g0c");
            this.h1501g0dy = json.getString("h1501g0dy");
            this.h1501g0dn = json.getString("h1501g0dn");
            this.h1501h0a = json.getString("h1501h0a");
            this.h1501h0b = json.getString("h1501h0b");
            this.h1501h0c = json.getString("h1501h0c");
            this.h1501h0dy = json.getString("h1501h0dy");
            this.h1501h0dn = json.getString("h1501h0dn");
            this.h1501i0a = json.getString("h1501i0a");
            this.h1501i0b = json.getString("h1501i0b");
            this.h1501i0c = json.getString("h1501i0c");
            this.h1501i0dy = json.getString("h1501i0dy");
            this.h1501i0dn = json.getString("h1501i0dn");
            this.h1501j0a = json.getString("h1501j0a");
            this.h1501j0b = json.getString("h1501j0b");
            this.h1501j0c = json.getString("h1501j0c");
            this.h1501j0dy = json.getString("h1501j0dy");
            this.h1501j0dn = json.getString("h1501j0dn");
            this.h1501k0a = json.getString("h1501k0a");
            this.h1501k0b = json.getString("h1501k0b");
            this.h1501k0c = json.getString("h1501k0c");
            this.h1501k0dy = json.getString("h1501k0dy");
            this.h1501k0dn = json.getString("h1501k0dn");
            this.h1501l0a = json.getString("h1501l0a");
            this.h1501l0b = json.getString("h1501l0b");
            this.h1501l0c = json.getString("h1501l0c");
            this.h1501l0dy = json.getString("h1501l0dy");
            this.h1501l0dn = json.getString("h1501l0dn");
            this.h1501m0a = json.getString("h1501m0a");
            this.h1501m0b = json.getString("h1501m0b");
            this.h1501m0c = json.getString("h1501m0c");
            this.h1501m0dy = json.getString("h1501m0dy");
            this.h1501m0dn = json.getString("h1501m0dn");
            this.h1501n0a = json.getString("h1501n0a");
            this.h1501n0b = json.getString("h1501n0b");
            this.h1501n0c = json.getString("h1501n0c");
            this.h1501n0dy = json.getString("h1501n0dy");
            this.h1501n0dn = json.getString("h1501n0dn");
            this.h1501o0a = json.getString("h1501o0a");
            this.h1501o0b = json.getString("h1501o0b");
            this.h1501o0c = json.getString("h1501o0c");
            this.h1501o0dy = json.getString("h1501o0dy");
            this.h1501o0dn = json.getString("h1501o0dn");
            this.h1501p0a = json.getString("h1501p0a");
            this.h1501p0b = json.getString("h1501p0b");
            this.h1501p0c = json.getString("h1501p0c");
            this.h1501p0dy = json.getString("h1501p0dy");
            this.h1501p0dn = json.getString("h1501p0dn");
        }
    }

    public void sH152Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH152Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h1501q0a = json.getString("h1501q0a");
            this.h1501q0b = json.getString("h1501q0b");
            this.h1501q0c = json.getString("h1501q0c");
            this.h1501q0dy = json.getString("h1501q0dy");
            this.h1501q0dn = json.getString("h1501q0dn");
            this.h1501r0a = json.getString("h1501r0a");
            this.h1501r0b = json.getString("h1501r0b");
            this.h1501r0c = json.getString("h1501r0c");
            this.h1501r0dy = json.getString("h1501r0dy");
            this.h1501r0dn = json.getString("h1501r0dn");
            this.h1501s0a = json.getString("h1501s0a");
            this.h1501s0b = json.getString("h1501s0b");
            this.h1501s0c = json.getString("h1501s0c");
            this.h1501s0dy = json.getString("h1501s0dy");
            this.h1501s0dn = json.getString("h1501s0dn");
            this.h1501t0a = json.getString("h1501t0a");
            this.h1501t0b = json.getString("h1501t0b");
            this.h1501t0c = json.getString("h1501t0c");
            this.h1501t0dy = json.getString("h1501t0dy");
            this.h1501t0dn = json.getString("h1501t0dn");
            this.h1501u0a = json.getString("h1501u0a");
            this.h1501u0b = json.getString("h1501u0b");
            this.h1501u0c = json.getString("h1501u0c");
            this.h1501u0dy = json.getString("h1501u0dy");
            this.h1501u0dn = json.getString("h1501u0dn");
            this.h1501v0a = json.getString("h1501v0a");
            this.h1501v0b = json.getString("h1501v0b");
            this.h1501v0c = json.getString("h1501v0c");
            this.h1501v0dy = json.getString("h1501v0dy");
            this.h1501v0dn = json.getString("h1501v0dn");
            this.h1501w0a = json.getString("h1501w0a");
            this.h1501w0b = json.getString("h1501w0b");
            this.h1501w0c = json.getString("h1501w0c");
            this.h1501w0dy = json.getString("h1501w0dy");
            this.h1501w0dn = json.getString("h1501w0dn");
            this.h1501x0a = json.getString("h1501x0a");
            this.h1501x0b = json.getString("h1501x0b");
            this.h1501x0c = json.getString("h1501x0c");
            this.h1501x0dy = json.getString("h1501x0dy");
            this.h1501x0dn = json.getString("h1501x0dn");
            this.h1501y0a = json.getString("h1501y0a");
            this.h1501y0b = json.getString("h1501y0b");
            this.h1501y0c = json.getString("h1501y0c");
            this.h1501y0dy = json.getString("h1501y0dy");
            this.h1501y0dn = json.getString("h1501y0dn");
            this.h1501z0a = json.getString("h1501z0a");
            this.h1501z0b = json.getString("h1501z0b");
            this.h1501z0c = json.getString("h1501z0c");
            this.h1501z0dy = json.getString("h1501z0dy");
            this.h1501z0dn = json.getString("h1501z0dn");
        }
    }

    public void sH16Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH16Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h1601 = json.getString("h1601");
            this.h1602 = json.getString("h1602");
            this.h1602xxx = json.getString("h1602xxx");
            this.h1603 = json.getString("h1603");
            this.h1603xxx = json.getString("h1603xxx");
            this.h1604 = json.getString("h1604");
            this.h1605 = json.getString("h1605");
            this.h1605xxx = json.getString("h1605xxx");
        }
    }

    public void sH17Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH17Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h1701 = json.getString("h1701");
            this.h1702 = json.getString("h1702");
            this.h1703 = json.getString("h1703");
            this.h1704 = json.getString("h1704");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(ModuleHTable.COLUMN_ID, this.id);
        json.put(ModuleHTable.COLUMN_UID, this.uid);
        json.put(ModuleHTable.COLUMN_UUID, this.uuid);
        json.put(ModuleHTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(ModuleHTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(ModuleHTable.COLUMN_UC_CODE, this.ucCode);
        json.put(ModuleHTable.COLUMN_HF_CODE, this.hfCode);
        json.put(ModuleHTable.COLUMN_USERNAME, this.userName);
        json.put(ModuleHTable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleHTable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleHTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleHTable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleHTable.COLUMN_SYNCED, this.synced);
        json.put(ModuleHTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleHTable.COLUMN_SH1, new JSONObject(sH1toString()));
        json.put(ModuleHTable.COLUMN_SH2, new JSONObject(sH2toString()));
        json.put(ModuleHTable.COLUMN_SH3, new JSONObject(sH3toString()));
        json.put(ModuleHTable.COLUMN_SH4, new JSONObject(sH4toString()));
        json.put(ModuleHTable.COLUMN_SH5, new JSONObject(sH5toString()));
        json.put(ModuleHTable.COLUMN_SH6, new JSONObject(sH6toString()));
        json.put(ModuleHTable.COLUMN_SH7, new JSONObject(sH7toString()));
        json.put(ModuleHTable.COLUMN_SH8, new JSONObject(sH8toString()));
        json.put(ModuleHTable.COLUMN_SH9, new JSONObject(sH9toString()));
        json.put(ModuleHTable.COLUMN_SH10, new JSONObject(sH10toString()));
        json.put(ModuleHTable.COLUMN_SH11, new JSONObject(sH11toString()));
        json.put(ModuleHTable.COLUMN_SH12, new JSONObject(sH12toString()));
        json.put(ModuleHTable.COLUMN_SH13, new JSONObject(sH13toString()));
        json.put(ModuleHTable.COLUMN_SH14, new JSONObject(sH14toString()));
        json.put(ModuleHTable.COLUMN_SH151, new JSONObject(sH151toString()));
        json.put(ModuleHTable.COLUMN_SH152, new JSONObject(sH152toString()));
        json.put(ModuleHTable.COLUMN_SH16, new JSONObject(sH16toString()));
        json.put(ModuleHTable.COLUMN_SH17, new JSONObject(sH17toString()));
        return json;
    }

    public String sH1toString() throws JSONException {
        Log.d(TAG, "sH1toString: ");
        JSONObject json = new JSONObject();
        json.put("h0101aa", h0101aa)
                .put("h0101ab", h0101ab)
                .put("h0101ba", h0101ba)
                .put("h0101bb", h0101bb)
                .put("h0101ca", h0101ca)
                .put("h0101cb", h0101cb);
        return json.toString();
    }

    public String sH2toString() throws JSONException {
        Log.d(TAG, "sH2toString: ");
        JSONObject json = new JSONObject();
        json.put("h0201", h0201)
                .put("h0202", h0202)
                .put("h0203a", h0203a)
                .put("h0203b", h0203b);
        return json.toString();
    }

    public String sH3toString() throws JSONException {
        Log.d(TAG, "sH3toString: ");
        JSONObject json = new JSONObject();
        json.put("h0301a0a", h0301a0a)
                .put("h0301a0b", h0301a0b)
                .put("h0301a0bc", h0301a0bc)
                .put("h0301b0a", h0301b0a)
                .put("h0301b0b", h0301b0b)
                .put("h0301b0c", h0301b0c)
                .put("h0301c0a", h0301c0a)
                .put("h0301c0b", h0301c0b)
                .put("h0301c0c", h0301c0c)
                .put("h0301d0a", h0301d0a)
                .put("h0301d0b", h0301d0b)
                .put("h0301d0c", h0301d0c)
                .put("h0301e0a", h0301e0a)
                .put("h0301e0b", h0301e0b)
                .put("h0301e0c", h0301e0c)
                .put("h0301f0a", h0301f0a)
                .put("h0301f0b", h0301f0b)
                .put("h0301f0c", h0301f0c)
                .put("h0301g0a", h0301g0a)
                .put("h0301g0b", h0301g0b)
                .put("h0301g0c", h0301g0c)
                .put("h03011h0a", h03011h0a)
                .put("h03011h0b", h03011h0b)
                .put("h03011h0c", h03011h0c)
                .put("h0301i0a", h0301i0a)
                .put("h0301i0b", h0301i0b)
                .put("h0301i0c", h0301i0c)
                .put("h0301j0a", h0301j0a)
                .put("h0301j0b", h0301j0b)
                .put("h0301j0c", h0301j0c)
                .put("h0301k0a", h0301k0a)
                .put("h0301k0b", h0301k0b)
                .put("h0301k0c", h0301k0c)
                .put("h0301l0a", h0301l0a)
                .put("h0301l0b", h0301l0b)
                .put("h0301l0c", h0301l0c)
                .put("h0301m0a", h0301m0a)
                .put("h0301m0b", h0301m0b)
                .put("h0301m0c", h0301m0c)
                .put("h0301n0a", h0301n0a)
                .put("h0301n0b", h0301n0b)
                .put("h0301n0c", h0301n0c)
                .put("h0301o0a", h0301o0a)
                .put("h0301o0b", h0301o0b)
                .put("h0301o0c", h0301o0c)
                .put("h0301p0a", h0301p0a)
                .put("h0301p0b", h0301p0b)
                .put("h0301p0c", h0301p0c)
                .put("h0301q0a", h0301q0a)
                .put("h0301q0b", h0301q0b)
                .put("h0301q0c", h0301q0c)
                .put("h0301r0a", h0301r0a)
                .put("h0301r0b", h0301r0b)
                .put("h0301r0c", h0301r0c)
                .put("h0301s0a", h0301s0a)
                .put("h0301s0b", h0301s0b)
                .put("h0301s0c", h0301s0c)
                .put("h0301t0a", h0301t0a)
                .put("h0301t0b", h0301t0b)
                .put("h0301t0c", h0301t0c)
                .put("h0301u0a", h0301u0a)
                .put("h0301u0b", h0301u0b)
                .put("h0301u0c", h0301u0c)
                .put("h0301v0a", h0301v0a)
                .put("h0301v0b", h0301v0b)
                .put("h0301v0c", h0301v0c)
                .put("h0301w0a", h0301w0a)
                .put("h0301w0b", h0301w0b)
                .put("h0301w0c", h0301w0c)
                .put("h0301x0a", h0301x0a)
                .put("h0301x0b", h0301x0b)
                .put("h0301x0c", h0301x0c)
                .put("h0301y0a", h0301y0a)
                .put("h0301y0b", h0301y0b)
                .put("h0301y0c", h0301y0c)
                .put("h0301z0a", h0301z0a)
                .put("h0301z0b", h0301z0b)
                .put("h0301z0c", h0301z0c)
                .put("h0301aa0a", h0301aa0a)
                .put("h0301aa0b", h0301aa0b)
                .put("h0301aa0c", h0301aa0c)
                .put("h0301ab0a", h0301ab0a)
                .put("h0301ab0b", h0301ab0b)
                .put("h0301ab0c", h0301ab0c)
                .put("h0301ac0a", h0301ac0a)
                .put("h0301ac0b", h0301ac0b)
                .put("h0301ac0c", h0301ac0c)
                .put("h0301ad0a", h0301ad0a)
                .put("h0301ad0b", h0301ad0b)
                .put("h0301ad0c", h0301ad0c)
                .put("h0301ae0a", h0301ae0a)
                .put("h0301ae0b", h0301ae0b)
                .put("h0301ae0c", h0301ae0c);
        return json.toString();
    }

    public String sH4toString() throws JSONException {
        Log.d(TAG, "sH4toString: ");
        JSONObject json = new JSONObject();
        json.put("h0401", h0401)
                .put("h0401xxx", h0401xxx);
        return json.toString();
    }

    public String sH5toString() throws JSONException {
        Log.d(TAG, "sH5toString: ");
        JSONObject json = new JSONObject();
        json.put("h0501", h0501)
                .put("h0501xxx", h0501xxx);
        return json.toString();
    }

    public String sH6toString() throws JSONException {
        Log.d(TAG, "sH6toString: ");
        JSONObject json = new JSONObject();
        json.put("h0601", h0601)
                .put("h0601aa", h0601aa)
                .put("h0601aaax", h0601aaax)
                .put("h0602", h0602)
                .put("h0603a", h0603a)
                .put("h0603b", h0603b)
                .put("h0603c", h0603c);
        return json.toString();
    }

    public String sH7toString() throws JSONException {
        Log.d(TAG, "sH7toString: ");
        JSONObject json = new JSONObject();
        json.put("h0701a", h0701a)
                .put("h0701b", h0701b)
                .put("h0701c", h0701c)
                .put("h0701d", h0701d)
                .put("h0701e", h0701e)
                .put("h0701f", h0701f)
                .put("h0701g", h0701g);
        return json.toString();
    }

    public String sH8toString() throws JSONException {
        Log.d(TAG, "sH8toString: ");
        JSONObject json = new JSONObject();
        json.put("h0801", h0801)
                .put("h0802", h0802);
        return json.toString();
    }

    public String sH9toString() throws JSONException {
        Log.d(TAG, "sH9toString: ");
        JSONObject json = new JSONObject();
        json.put("h0901", h0901)
                .put("h0902a", h0902a)
                .put("h0902b", h0902b)
                .put("h0902c", h0902c);
        return json.toString();
    }

    public String sH10toString() throws JSONException {
        Log.d(TAG, "sH10toString: ");
        JSONObject json = new JSONObject();
        json.put("h1001", h1001)
                .put("h1002a", h1002a)
                .put("h1002b", h1002b);
        return json.toString();
    }

    public String sH11toString() throws JSONException {
        Log.d(TAG, "sH11toString: ");
        JSONObject json = new JSONObject();
        json.put("h1101", h1101)
                .put("h1102", h1102)
                .put("h1103", h1103)
                .put("h1104", h1104)
                .put("h1105", h1105)
                .put("h1106", h1106);
        return json.toString();
    }

    public String sH12toString() throws JSONException {
        Log.d(TAG, "sH12toString: ");
        JSONObject json = new JSONObject();
        json.put("h1201", h1201)
                .put("h1202", h1202)
                .put("h1203a", h1203a)
                .put("h1203b", h1203b)
                .put("h1203c", h1203c)
                .put("h1203d", h1203d)
                .put("h1203e", h1203e)
                .put("h1203f", h1203f)
                .put("h1203g", h1203g);
        return json.toString();
    }

    public String sH13toString() throws JSONException {
        Log.d(TAG, "sH13toString: ");
        JSONObject json = new JSONObject();
        json.put("h1301", h1301)
                .put("h1302", h1302)
                .put("h1303", h1303);
        return json.toString();
    }

    public String sH14toString() throws JSONException {
        Log.d(TAG, "sH14toString: ");
        JSONObject json = new JSONObject();
        json.put("h1401aa", h1401aa)
                .put("h1401ab", h1401ab)
                .put("h1401ba", h1401ba)
                .put("h1401bb", h1401bb)
                .put("h1401ca", h1401ca)
                .put("h1401cb", h1401cb)
                .put("h1401da", h1401da)
                .put("h1401db", h1401db)
                .put("h1401ea", h1401ea)
                .put("h1401eb", h1401eb);
        return json.toString();
    }

    public String sH151toString() throws JSONException {
        Log.d(TAG, "sH151toString: ");
        JSONObject json = new JSONObject();
        json.put("h1501a0a", h1501a0a)
                .put("h1501a0b", h1501a0b)
                .put("h1501a0c", h1501a0c)
                .put("h1501a0dy", h1501a0dy)
                .put("h1501a0dn", h1501a0dn)
                .put("h1501b0a", h1501b0a)
                .put("h1501b0b", h1501b0b)
                .put("h1501b0c", h1501b0c)
                .put("h1501b0dy", h1501b0dy)
                .put("h1501b0dn", h1501b0dn)
                .put("h1501c0a", h1501c0a)
                .put("h1501c0b", h1501c0b)
                .put("h1501c0c", h1501c0c)
                .put("h1501c0dy", h1501c0dy)
                .put("h1501c0dn", h1501c0dn)
                .put("h1501d0a", h1501d0a)
                .put("h1501d0b", h1501d0b)
                .put("h1501d0c", h1501d0c)
                .put("h1501d0dy", h1501d0dy)
                .put("h1501d0dn", h1501d0dn)
                .put("h1501e0a", h1501e0a)
                .put("h1501e0b", h1501e0b)
                .put("h1501e0c", h1501e0c)
                .put("h1501e0dy", h1501e0dy)
                .put("h1501e0dn", h1501e0dn)
                .put("h1501f0a", h1501f0a)
                .put("h1501f0b", h1501f0b)
                .put("h1501f0c", h1501f0c)
                .put("h1501f0dy", h1501f0dy)
                .put("h1501f0dn", h1501f0dn)
                .put("h1501g0a", h1501g0a)
                .put("h1501g0b", h1501g0b)
                .put("h1501g0c", h1501g0c)
                .put("h1501g0dy", h1501g0dy)
                .put("h1501g0dn", h1501g0dn)
                .put("h1501h0a", h1501h0a)
                .put("h1501h0b", h1501h0b)
                .put("h1501h0c", h1501h0c)
                .put("h1501h0dy", h1501h0dy)
                .put("h1501h0dn", h1501h0dn)
                .put("h1501i0a", h1501i0a)
                .put("h1501i0b", h1501i0b)
                .put("h1501i0c", h1501i0c)
                .put("h1501i0dy", h1501i0dy)
                .put("h1501i0dn", h1501i0dn)
                .put("h1501j0a", h1501j0a)
                .put("h1501j0b", h1501j0b)
                .put("h1501j0c", h1501j0c)
                .put("h1501j0dy", h1501j0dy)
                .put("h1501j0dn", h1501j0dn)
                .put("h1501k0a", h1501k0a)
                .put("h1501k0b", h1501k0b)
                .put("h1501k0c", h1501k0c)
                .put("h1501k0dy", h1501k0dy)
                .put("h1501k0dn", h1501k0dn)
                .put("h1501l0a", h1501l0a)
                .put("h1501l0b", h1501l0b)
                .put("h1501l0c", h1501l0c)
                .put("h1501l0dy", h1501l0dy)
                .put("h1501l0dn", h1501l0dn)
                .put("h1501m0a", h1501m0a)
                .put("h1501m0b", h1501m0b)
                .put("h1501m0c", h1501m0c)
                .put("h1501m0dy", h1501m0dy)
                .put("h1501m0dn", h1501m0dn)
                .put("h1501n0a", h1501n0a)
                .put("h1501n0b", h1501n0b)
                .put("h1501n0c", h1501n0c)
                .put("h1501n0dy", h1501n0dy)
                .put("h1501n0dn", h1501n0dn)
                .put("h1501o0a", h1501o0a)
                .put("h1501o0b", h1501o0b)
                .put("h1501o0c", h1501o0c)
                .put("h1501o0dy", h1501o0dy)
                .put("h1501o0dn", h1501o0dn)
                .put("h1501p0a", h1501p0a)
                .put("h1501p0b", h1501p0b)
                .put("h1501p0c", h1501p0c)
                .put("h1501p0dy", h1501p0dy)
                .put("h1501p0dn", h1501p0dn);
        return json.toString();
    }

    public String sH152toString() throws JSONException {
        Log.d(TAG, "sH152toString: ");
        JSONObject json = new JSONObject();
        json.put("h1501q0a", h1501q0a)
                .put("h1501q0b", h1501q0b)
                .put("h1501q0c", h1501q0c)
                .put("h1501q0dy", h1501q0dy)
                .put("h1501q0dn", h1501q0dn)
                .put("h1501r0a", h1501r0a)
                .put("h1501r0b", h1501r0b)
                .put("h1501r0c", h1501r0c)
                .put("h1501r0dy", h1501r0dy)
                .put("h1501r0dn", h1501r0dn)
                .put("h1501s0a", h1501s0a)
                .put("h1501s0b", h1501s0b)
                .put("h1501s0c", h1501s0c)
                .put("h1501s0dy", h1501s0dy)
                .put("h1501s0dn", h1501s0dn)
                .put("h1501t0a", h1501t0a)
                .put("h1501t0b", h1501t0b)
                .put("h1501t0c", h1501t0c)
                .put("h1501t0dy", h1501t0dy)
                .put("h1501t0dn", h1501t0dn)
                .put("h1501u0a", h1501u0a)
                .put("h1501u0b", h1501u0b)
                .put("h1501u0c", h1501u0c)
                .put("h1501u0dy", h1501u0dy)
                .put("h1501u0dn", h1501u0dn)
                .put("h1501v0a", h1501v0a)
                .put("h1501v0b", h1501v0b)
                .put("h1501v0c", h1501v0c)
                .put("h1501v0dy", h1501v0dy)
                .put("h1501v0dn", h1501v0dn)
                .put("h1501w0a", h1501w0a)
                .put("h1501w0b", h1501w0b)
                .put("h1501w0c", h1501w0c)
                .put("h1501w0dy", h1501w0dy)
                .put("h1501w0dn", h1501w0dn)
                .put("h1501x0a", h1501x0a)
                .put("h1501x0b", h1501x0b)
                .put("h1501x0c", h1501x0c)
                .put("h1501x0dy", h1501x0dy)
                .put("h1501x0dn", h1501x0dn)
                .put("h1501y0a", h1501y0a)
                .put("h1501y0b", h1501y0b)
                .put("h1501y0c", h1501y0c)
                .put("h1501y0dy", h1501y0dy)
                .put("h1501y0dn", h1501y0dn)
                .put("h1501z0a", h1501z0a)
                .put("h1501z0b", h1501z0b)
                .put("h1501z0c", h1501z0c)
                .put("h1501z0dy", h1501z0dy)
                .put("h1501z0dn", h1501z0dn);
        return json.toString();
    }

    public String sH16toString() throws JSONException {
        Log.d(TAG, "sH16toString: ");
        JSONObject json = new JSONObject();
        json.put("h1601", h1601)
                .put("h1602", h1602)
                .put("h1602xxx", h1602xxx)
                .put("h1603", h1603)
                .put("h1603xxx", h1603xxx)
                .put("h1604", h1604)
                .put("h1605", h1605)
                .put("h1605xxx", h1605xxx);
        return json.toString();
    }

    public String sH17toString() throws JSONException {
        Log.d(TAG, "sH17toString: ");
        JSONObject json = new JSONObject();
        json.put("h1701", h1701)
                .put("h1702", h1702)
                .put("h1703", h1703)
                .put("h1704", h1704);
        return json.toString();
    }


}
