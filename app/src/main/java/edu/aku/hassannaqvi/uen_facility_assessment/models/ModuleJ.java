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
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleJTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleJ extends BaseObservable implements Observable {

    private final String TAG = "ModuleJ";
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
    private String j0100a = _EMPTY_;
    private String j0100b = _EMPTY_;
    private String j0100c = _EMPTY_;
    private String j0101a = _EMPTY_;
    private String j0101b = _EMPTY_;
    private String j0101c = _EMPTY_;
    private String j0101d = _EMPTY_;
    private String j0101e = _EMPTY_;
    private String j0101f = _EMPTY_;
    private String j0101g = _EMPTY_;
    private String j0101h = _EMPTY_;
    private String j0101ia = _EMPTY_;
    private String j0101ib = _EMPTY_;
    private String j0101j = _EMPTY_;
    private String j0101k = _EMPTY_;
    private String j0101l = _EMPTY_;
    private String j0101m = _EMPTY_;
    private String j0101ma = _EMPTY_;
    private String j0101mb = _EMPTY_;
    private String j0101mc = _EMPTY_;
    private String j0101md = _EMPTY_;
    private String j0101me = _EMPTY_;
    private String j0101mf = _EMPTY_;
    private String j0101mxx = _EMPTY_;
    private String j0101mxxx = _EMPTY_;
    private String j0200a = _EMPTY_;
    private String j0200b = _EMPTY_;
    private String j0200c = _EMPTY_;
    private String j0201a = _EMPTY_;
    private String j0201b = _EMPTY_;
    private String j0201c = _EMPTY_;
    private String j0201d = _EMPTY_;
    private String j0201e = _EMPTY_;
    private String j0201f = _EMPTY_;
    private String j0201g = _EMPTY_;
    private String j0201ga = _EMPTY_;
    private String j0201gb = _EMPTY_;
    private String j0201gc = _EMPTY_;
    private String j0201gd = _EMPTY_;
    private String j0201ge = _EMPTY_;
    private String j0201gf = _EMPTY_;
    private String j0201gxx = _EMPTY_;
    private String j0201gxxx = _EMPTY_;
    private String j0300a = _EMPTY_;
    private String j0300b = _EMPTY_;
    private String j0300c = _EMPTY_;
    private String j0301a = _EMPTY_;
    private String j0301b = _EMPTY_;
    private String j0301c = _EMPTY_;
    private String j0301d = _EMPTY_;
    private String j0301e = _EMPTY_;
    private String j0301f = _EMPTY_;
    private String j0301g = _EMPTY_;
    private String j0301h = _EMPTY_;
    private String j0301i = _EMPTY_;
    private String j0301j = _EMPTY_;
    private String j0301k = _EMPTY_;
    private String j0301l = _EMPTY_;
    private String j0301m = _EMPTY_;
    private String j0301n = _EMPTY_;
    private String j0301o = _EMPTY_;
    private String j0301p = _EMPTY_;
    private String j0301q = _EMPTY_;
    private String j0301r = _EMPTY_;
    private String j0301s = _EMPTY_;
    private String j0301t = _EMPTY_;
    private String j0301u = _EMPTY_;
    private String j0301v = _EMPTY_;
    private String j0301w = _EMPTY_;
    private String j0301wa = _EMPTY_;
    private String j0301wb = _EMPTY_;
    private String j0301wc = _EMPTY_;
    private String j0301wd = _EMPTY_;
    private String j0301we = _EMPTY_;
    private String j0301wf = _EMPTY_;
    private String j0301wxx = _EMPTY_;
    private String j0301wxxx = _EMPTY_;
    private String j0400a = _EMPTY_;
    private String j0400b = _EMPTY_;
    private String j0400c = _EMPTY_;
    private String j0401a = _EMPTY_;
    private String j0401b = _EMPTY_;
    private String j0401c = _EMPTY_;
    private String j0401d = _EMPTY_;
    private String j0401e = _EMPTY_;
    private String j0401f = _EMPTY_;
    private String j0401g = _EMPTY_;
    private String j0401h = _EMPTY_;
    private String j0401i = _EMPTY_;
    private String j0401j = _EMPTY_;
    private String j0401k = _EMPTY_;
    private String j0401l = _EMPTY_;
    private String j0401m = _EMPTY_;
    private String j0401ma = _EMPTY_;
    private String j0401mb = _EMPTY_;
    private String j0401mc = _EMPTY_;
    private String j0401md = _EMPTY_;
    private String j0401me = _EMPTY_;
    private String j0401mf = _EMPTY_;
    private String j0401mxx = _EMPTY_;
    private String j0401mxxx = _EMPTY_;
    private String j0500a = _EMPTY_;
    private String j0500b = _EMPTY_;
    private String j0500c = _EMPTY_;
    private String j0501a = _EMPTY_;
    private String j0501b = _EMPTY_;
    private String j0501c = _EMPTY_;
    private String j0501d = _EMPTY_;
    private String j0501e = _EMPTY_;
    private String j0501f = _EMPTY_;
    private String j0501g = _EMPTY_;
    private String j0501h = _EMPTY_;
    private String j0501i = _EMPTY_;
    private String j0501j = _EMPTY_;
    private String j0501k = _EMPTY_;
    private String j0501l = _EMPTY_;
    private String j0501m = _EMPTY_;
    private String j0501n = _EMPTY_;
    private String j0501na = _EMPTY_;
    private String j0501nb = _EMPTY_;
    private String j0501nc = _EMPTY_;
    private String j0501nd = _EMPTY_;
    private String j0501ne = _EMPTY_;
    private String j0501nf = _EMPTY_;
    private String j0501nxx = _EMPTY_;
    private String j0501nxxx = _EMPTY_;
    private String j0600a = _EMPTY_;
    private String j0600b = _EMPTY_;
    private String j0600c = _EMPTY_;
    private String j0601a = _EMPTY_;
    private String j0601b = _EMPTY_;
    private String j0601c = _EMPTY_;
    private String j0601d = _EMPTY_;
    private String j0601e = _EMPTY_;
    private String j0601f = _EMPTY_;
    private String j0601g = _EMPTY_;
    private String j0601h = _EMPTY_;
    private String j0601i = _EMPTY_;
    private String j0601j = _EMPTY_;
    private String j0601k = _EMPTY_;
    private String j0601l = _EMPTY_;
    private String j0601m = _EMPTY_;
    private String j0601ma = _EMPTY_;
    private String j0601mb = _EMPTY_;
    private String j0601mc = _EMPTY_;
    private String j0601md = _EMPTY_;
    private String j0601me = _EMPTY_;
    private String j0601mf = _EMPTY_;
    private String j0601mxx = _EMPTY_;
    private String j0601mxxx = _EMPTY_;
    private String j0700a = _EMPTY_;
    private String j0700b = _EMPTY_;
    private String j0700c = _EMPTY_;
    private String j0701a = _EMPTY_;
    private String j0701b = _EMPTY_;
    private String j0701c = _EMPTY_;
    private String j0701d = _EMPTY_;
    private String j0701e = _EMPTY_;
    private String j0701f = _EMPTY_;
    private String j0701g = _EMPTY_;
    private String j0701ga = _EMPTY_;
    private String j0701gb = _EMPTY_;
    private String j0701gc = _EMPTY_;
    private String j0701gd = _EMPTY_;
    private String j0701ge = _EMPTY_;
    private String j0701gf = _EMPTY_;
    private String j0701gxx = _EMPTY_;
    private String j0701gxxx = _EMPTY_;
    private String j0800a = _EMPTY_;
    private String j0800b = _EMPTY_;
    private String j0800c = _EMPTY_;
    private String j0801a = _EMPTY_;
    private String j0801b = _EMPTY_;
    private String j0801c = _EMPTY_;
    private String j0801d = _EMPTY_;
    private String j0801e = _EMPTY_;
    private String j0801f = _EMPTY_;
    private String j0801g = _EMPTY_;
    private String j0801ga = _EMPTY_;
    private String j0801gb = _EMPTY_;
    private String j0801gc = _EMPTY_;
    private String j0801gd = _EMPTY_;
    private String j0900a = _EMPTY_;
    private String j0900b = _EMPTY_;
    private String j0900c = _EMPTY_;
    private String j0901a = _EMPTY_;
    private String j0901b = _EMPTY_;
    private String j0901c = _EMPTY_;
    private String j0901d = _EMPTY_;
    private String j0901e = _EMPTY_;
    private String j0901f = _EMPTY_;
    private String j0901fa = _EMPTY_;
    private String j0901fb = _EMPTY_;
    private String j0901fc = _EMPTY_;
    private String j0901fd = _EMPTY_;
    private String j0901fe = _EMPTY_;


    public ModuleJ() {
    }


    public void populateMeta() {
        setProjectName(PROJECT_NAME);
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.versionName + "." + MainApp.versionCode);
        setUserName(MainApp.user.getUserName());
        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setDistrictCode(MainApp.moduleA.getDistrictCode());
        setTehsilCode(MainApp.moduleA.getTehsilCode());
        setUcCode(MainApp.moduleA.getUcCode());
        setHfCode(MainApp.moduleA.getHfCode());
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
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
    public String getJ0100a() {
        return j0100a;
    }

    public void setJ0100a(String j0100a) {
        this.j0100a = j0100a;
        notifyPropertyChanged(BR.j0100a);
    }

    @Bindable
    public String getJ0100b() {
        return j0100b;
    }

    public void setJ0100b(String j0100b) {
        this.j0100b = j0100b;
        notifyPropertyChanged(BR.j0100b);
    }

    @Bindable
    public String getJ0100c() {
        return j0100c;
    }

    public void setJ0100c(String j0100c) {
        this.j0100c = j0100c;
        notifyPropertyChanged(BR.j0100c);
    }

    @Bindable
    public String getJ0101a() {
        return j0101a;
    }

    public void setJ0101a(String j0101a) {
        this.j0101a = j0101a;
        notifyPropertyChanged(BR.j0101a);
    }

    @Bindable
    public String getJ0101b() {
        return j0101b;
    }

    public void setJ0101b(String j0101b) {
        this.j0101b = j0101b;
        notifyPropertyChanged(BR.j0101b);
    }

    @Bindable
    public String getJ0101c() {
        return j0101c;
    }

    public void setJ0101c(String j0101c) {
        this.j0101c = j0101c;
        notifyPropertyChanged(BR.j0101c);
    }

    @Bindable
    public String getJ0101d() {
        return j0101d;
    }

    public void setJ0101d(String j0101d) {
        this.j0101d = j0101d;
        notifyPropertyChanged(BR.j0101d);
    }

    @Bindable
    public String getJ0101e() {
        return j0101e;
    }

    public void setJ0101e(String j0101e) {
        this.j0101e = j0101e;
        notifyPropertyChanged(BR.j0101e);
    }

    @Bindable
    public String getJ0101f() {
        return j0101f;
    }

    public void setJ0101f(String j0101f) {
        this.j0101f = j0101f;
        notifyPropertyChanged(BR.j0101f);
    }

    @Bindable
    public String getJ0101g() {
        return j0101g;
    }

    public void setJ0101g(String j0101g) {
        this.j0101g = j0101g;
        notifyPropertyChanged(BR.j0101g);
    }

    @Bindable
    public String getJ0101h() {
        return j0101h;
    }

    public void setJ0101h(String j0101h) {
        this.j0101h = j0101h;
        notifyPropertyChanged(BR.j0101h);
    }

    @Bindable
    public String getJ0101ia() {
        return j0101ia;
    }

    public void setJ0101ia(String j0101ia) {
        this.j0101ia = j0101ia;
        notifyPropertyChanged(BR.j0101ia);
    }

    @Bindable
    public String getJ0101ib() {
        return j0101ib;
    }

    public void setJ0101ib(String j0101ib) {
        this.j0101ib = j0101ib;
        notifyPropertyChanged(BR.j0101ib);
    }

    @Bindable
    public String getJ0101j() {
        return j0101j;
    }

    public void setJ0101j(String j0101j) {
        this.j0101j = j0101j;
        notifyPropertyChanged(BR.j0101j);
    }

    @Bindable
    public String getJ0101k() {
        return j0101k;
    }

    public void setJ0101k(String j0101k) {
        this.j0101k = j0101k;
        notifyPropertyChanged(BR.j0101k);
    }

    @Bindable
    public String getJ0101l() {
        return j0101l;
    }

    public void setJ0101l(String j0101l) {
        this.j0101l = j0101l;
        notifyPropertyChanged(BR.j0101l);
    }

    @Bindable
    public String getJ0101m() {
        return j0101m;
    }

    public void setJ0101m(String j0101m) {
        this.j0101m = j0101m;
        notifyPropertyChanged(BR.j0101m);
    }

    @Bindable
    public String getJ0101ma() {
        return j0101ma;
    }

    public void setJ0101ma(String j0101ma) {
        if (this.j0101ma.equals(j0101ma)) return; // for all checkboxes
        this.j0101ma = j0101ma;
        notifyPropertyChanged(BR.j0101ma);
    }

    @Bindable
    public String getJ0101mb() {
        return j0101mb;
    }

    public void setJ0101mb(String j0101mb) {
        if (this.j0101mb.equals(j0101mb)) return; // for all checkboxes
        this.j0101mb = j0101mb;
        notifyPropertyChanged(BR.j0101mb);
    }

    @Bindable
    public String getJ0101mc() {
        return j0101mc;
    }

    public void setJ0101mc(String j0101mc) {
        if (this.j0101mc.equals(j0101mc)) return; // for all checkboxes
        this.j0101mc = j0101mc;
        notifyPropertyChanged(BR.j0101mc);
    }

    @Bindable
    public String getJ0101md() {
        return j0101md;
    }

    public void setJ0101md(String j0101md) {
        if (this.j0101md.equals(j0101md)) return; // for all checkboxes
        this.j0101md = j0101md;
        notifyPropertyChanged(BR.j0101md);
    }

    @Bindable
    public String getJ0101me() {
        return j0101me;
    }

    public void setJ0101me(String j0101me) {
        if (this.j0101me.equals(j0101me)) return; // for all checkboxes
        this.j0101me = j0101me;
        notifyPropertyChanged(BR.j0101me);
    }

    @Bindable
    public String getJ0101mf() {
        return j0101mf;
    }

    public void setJ0101mf(String j0101mf) {
        if (this.j0101mf.equals(j0101mf)) return; // for all checkboxes
        this.j0101mf = j0101mf;
        notifyPropertyChanged(BR.j0101mf);
    }

    @Bindable
    public String getJ0101mxx() {
        return j0101mxx;
    }

    public void setJ0101mxx(String j0101mxx) {
        if (this.j0101mxx.equals(j0101mxx)) return; // for all checkboxes
        this.j0101mxx = j0101mxx;
        setJ0101mxxx(j0101mxx.equals("96") ? this.j0101mxxx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.j0101mxx);
    }

    @Bindable
    public String getJ0101mxxx() {
        return j0101mxxx;
    }

    public void setJ0101mxxx(String j0101mxxx) {
        this.j0101mxxx = j0101mxxx;
        notifyPropertyChanged(BR.j0101mxxx);
    }

    @Bindable
    public String getJ0200a() {
        return j0200a;
    }

    public void setJ0200a(String j0200a) {
        this.j0200a = j0200a;
        notifyPropertyChanged(BR.j0200a);
    }

    @Bindable
    public String getJ0200b() {
        return j0200b;
    }

    public void setJ0200b(String j0200b) {
        this.j0200b = j0200b;
        notifyPropertyChanged(BR.j0200b);
    }

    @Bindable
    public String getJ0200c() {
        return j0200c;
    }

    public void setJ0200c(String j0200c) {
        this.j0200c = j0200c;
        notifyPropertyChanged(BR.j0200c);
    }

    @Bindable
    public String getJ0201a() {
        return j0201a;
    }

    public void setJ0201a(String j0201a) {
        this.j0201a = j0201a;
        notifyPropertyChanged(BR.j0201a);
    }

    @Bindable
    public String getJ0201b() {
        return j0201b;
    }

    public void setJ0201b(String j0201b) {
        this.j0201b = j0201b;
        notifyPropertyChanged(BR.j0201b);
    }

    @Bindable
    public String getJ0201c() {
        return j0201c;
    }

    public void setJ0201c(String j0201c) {
        this.j0201c = j0201c;
        notifyPropertyChanged(BR.j0201c);
    }

    @Bindable
    public String getJ0201d() {
        return j0201d;
    }

    public void setJ0201d(String j0201d) {
        this.j0201d = j0201d;
        notifyPropertyChanged(BR.j0201d);
    }

    @Bindable
    public String getJ0201e() {
        return j0201e;
    }

    public void setJ0201e(String j0201e) {
        this.j0201e = j0201e;
        notifyPropertyChanged(BR.j0201e);
    }

    @Bindable
    public String getJ0201f() {
        return j0201f;
    }

    public void setJ0201f(String j0201f) {
        this.j0201f = j0201f;
        notifyPropertyChanged(BR.j0201f);
    }

    @Bindable
    public String getJ0201g() {
        return j0201g;
    }

    public void setJ0201g(String j0201g) {
        this.j0201g = j0201g;
        notifyPropertyChanged(BR.j0201g);
    }

    @Bindable
    public String getJ0201ga() {
        return j0201ga;
    }

    public void setJ0201ga(String j0201ga) {
        if (this.j0201ga.equals(j0201ga)) return; // for all checkboxes
        this.j0201ga = j0201ga;
        notifyPropertyChanged(BR.j0201ga);
    }

    @Bindable
    public String getJ0201gb() {
        return j0201gb;
    }

    public void setJ0201gb(String j0201gb) {
        if (this.j0201gb.equals(j0201gb)) return; // for all checkboxes
        this.j0201gb = j0201gb;
        notifyPropertyChanged(BR.j0201gb);
    }

    @Bindable
    public String getJ0201gc() {
        return j0201gc;
    }

    public void setJ0201gc(String j0201gc) {
        if (this.j0201gc.equals(j0201gc)) return; // for all checkboxes
        this.j0201gc = j0201gc;
        notifyPropertyChanged(BR.j0201gc);
    }

    @Bindable
    public String getJ0201gd() {
        return j0201gd;
    }

    public void setJ0201gd(String j0201gd) {
        if (this.j0201gd.equals(j0201gd)) return; // for all checkboxes
        this.j0201gd = j0201gd;
        notifyPropertyChanged(BR.j0201gd);
    }

    @Bindable
    public String getJ0201ge() {
        return j0201ge;
    }

    public void setJ0201ge(String j0201ge) {
        if (this.j0201ge.equals(j0201ge)) return; // for all checkboxes
        this.j0201ge = j0201ge;
        notifyPropertyChanged(BR.j0201ge);
    }

    @Bindable
    public String getJ0201gf() {
        return j0201gf;
    }

    public void setJ0201gf(String j0201gf) {
        if (this.j0201gf.equals(j0201gf)) return; // for all checkboxes
        this.j0201gf = j0201gf;
        notifyPropertyChanged(BR.j0201gf);
    }

    @Bindable
    public String getJ0201gxx() {
        return j0201gxx;
    }

    public void setJ0201gxx(String j0201gxx) {
        if (this.j0201gxx.equals(j0201gxx)) return; // for all checkboxes
        this.j0201gxx = j0201gxx;
        setJ0201gxxx(j0201gxx.equals("96") ? this.j0201gxxx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.j0201gxx);
    }

    @Bindable
    public String getJ0201gxxx() {
        return j0201gxxx;
    }

    public void setJ0201gxxx(String j0201gxxx) {
        this.j0201gxxx = j0201gxxx;
        notifyPropertyChanged(BR.j0201gxxx);
    }

    @Bindable
    public String getJ0300a() {
        return j0300a;
    }

    public void setJ0300a(String j0300a) {
        this.j0300a = j0300a;
        notifyPropertyChanged(BR.j0300a);
    }

    @Bindable
    public String getJ0300b() {
        return j0300b;
    }

    public void setJ0300b(String j0300b) {
        this.j0300b = j0300b;
        notifyPropertyChanged(BR.j0300b);
    }

    @Bindable
    public String getJ0300c() {
        return j0300c;
    }

    public void setJ0300c(String j0300c) {
        this.j0300c = j0300c;
        notifyPropertyChanged(BR.j0300c);
    }

    @Bindable
    public String getJ0301a() {
        return j0301a;
    }

    public void setJ0301a(String j0301a) {
        this.j0301a = j0301a;
        notifyPropertyChanged(BR.j0301a);
    }

    @Bindable
    public String getJ0301b() {
        return j0301b;
    }

    public void setJ0301b(String j0301b) {
        this.j0301b = j0301b;
        notifyPropertyChanged(BR.j0301b);
    }

    @Bindable
    public String getJ0301c() {
        return j0301c;
    }

    public void setJ0301c(String j0301c) {
        this.j0301c = j0301c;
        notifyPropertyChanged(BR.j0301c);
    }

    @Bindable
    public String getJ0301d() {
        return j0301d;
    }

    public void setJ0301d(String j0301d) {
        this.j0301d = j0301d;
        notifyPropertyChanged(BR.j0301d);
    }

    @Bindable
    public String getJ0301e() {
        return j0301e;
    }

    public void setJ0301e(String j0301e) {
        this.j0301e = j0301e;
        notifyPropertyChanged(BR.j0301e);
    }

    @Bindable
    public String getJ0301f() {
        return j0301f;
    }

    public void setJ0301f(String j0301f) {
        this.j0301f = j0301f;
        notifyPropertyChanged(BR.j0301f);
    }

    @Bindable
    public String getJ0301g() {
        return j0301g;
    }

    public void setJ0301g(String j0301g) {
        this.j0301g = j0301g;
        notifyPropertyChanged(BR.j0301g);
    }

    @Bindable
    public String getJ0301h() {
        return j0301h;
    }

    public void setJ0301h(String j0301h) {
        this.j0301h = j0301h;
        notifyPropertyChanged(BR.j0301h);
    }

    @Bindable
    public String getJ0301i() {
        return j0301i;
    }

    public void setJ0301i(String j0301i) {
        this.j0301i = j0301i;
        notifyPropertyChanged(BR.j0301i);
    }

    @Bindable
    public String getJ0301j() {
        return j0301j;
    }

    public void setJ0301j(String j0301j) {
        this.j0301j = j0301j;
        notifyPropertyChanged(BR.j0301j);
    }

    @Bindable
    public String getJ0301k() {
        return j0301k;
    }

    public void setJ0301k(String j0301k) {
        this.j0301k = j0301k;
        notifyPropertyChanged(BR.j0301k);
    }

    @Bindable
    public String getJ0301l() {
        return j0301l;
    }

    public void setJ0301l(String j0301l) {
        this.j0301l = j0301l;
        notifyPropertyChanged(BR.j0301l);
    }

    @Bindable
    public String getJ0301m() {
        return j0301m;
    }

    public void setJ0301m(String j0301m) {
        this.j0301m = j0301m;
        notifyPropertyChanged(BR.j0301m);
    }

    @Bindable
    public String getJ0301n() {
        return j0301n;
    }

    public void setJ0301n(String j0301n) {
        this.j0301n = j0301n;
        notifyPropertyChanged(BR.j0301n);
    }

    @Bindable
    public String getJ0301o() {
        return j0301o;
    }

    public void setJ0301o(String j0301o) {
        this.j0301o = j0301o;
        notifyPropertyChanged(BR.j0301o);
    }

    @Bindable
    public String getJ0301p() {
        return j0301p;
    }

    public void setJ0301p(String j0301p) {
        this.j0301p = j0301p;
        notifyPropertyChanged(BR.j0301p);
    }

    @Bindable
    public String getJ0301q() {
        return j0301q;
    }

    public void setJ0301q(String j0301q) {
        this.j0301q = j0301q;
        notifyPropertyChanged(BR.j0301q);
    }

    @Bindable
    public String getJ0301r() {
        return j0301r;
    }

    public void setJ0301r(String j0301r) {
        this.j0301r = j0301r;
        notifyPropertyChanged(BR.j0301r);
    }

    @Bindable
    public String getJ0301s() {
        return j0301s;
    }

    public void setJ0301s(String j0301s) {
        this.j0301s = j0301s;
        notifyPropertyChanged(BR.j0301s);
    }

    @Bindable
    public String getJ0301t() {
        return j0301t;
    }

    public void setJ0301t(String j0301t) {
        this.j0301t = j0301t;
        notifyPropertyChanged(BR.j0301t);
    }

    @Bindable
    public String getJ0301u() {
        return j0301u;
    }

    public void setJ0301u(String j0301u) {
        this.j0301u = j0301u;
        notifyPropertyChanged(BR.j0301u);
    }

    @Bindable
    public String getJ0301v() {
        return j0301v;
    }

    public void setJ0301v(String j0301v) {
        this.j0301v = j0301v;
        notifyPropertyChanged(BR.j0301v);
    }

    @Bindable
    public String getJ0301w() {
        return j0301w;
    }

    public void setJ0301w(String j0301w) {
        this.j0301w = j0301w;
        notifyPropertyChanged(BR.j0301w);
    }

    @Bindable
    public String getJ0301wa() {
        return j0301wa;
    }

    public void setJ0301wa(String j0301wa) {
        if (this.j0301wa.equals(j0301wa)) return; // for all checkboxes
        this.j0301wa = j0301wa;
        notifyPropertyChanged(BR.j0301wa);
    }

    @Bindable
    public String getJ0301wb() {
        return j0301wb;
    }

    public void setJ0301wb(String j0301wb) {
        if (this.j0301wb.equals(j0301wb)) return; // for all checkboxes
        this.j0301wb = j0301wb;
        notifyPropertyChanged(BR.j0301wb);
    }

    @Bindable
    public String getJ0301wc() {
        return j0301wc;
    }

    public void setJ0301wc(String j0301wc) {
        if (this.j0301wc.equals(j0301wc)) return; // for all checkboxes
        this.j0301wc = j0301wc;
        notifyPropertyChanged(BR.j0301wc);
    }

    @Bindable
    public String getJ0301wd() {
        return j0301wd;
    }

    public void setJ0301wd(String j0301wd) {
        if (this.j0301wd.equals(j0301wd)) return; // for all checkboxes
        this.j0301wd = j0301wd;
        notifyPropertyChanged(BR.j0301wd);
    }

    @Bindable
    public String getJ0301we() {
        return j0301we;
    }

    public void setJ0301we(String j0301we) {
        if (this.j0301we.equals(j0301we)) return; // for all checkboxes
        this.j0301we = j0301we;
        notifyPropertyChanged(BR.j0301we);
    }

    @Bindable
    public String getJ0301wf() {
        return j0301wf;
    }

    public void setJ0301wf(String j0301wf) {
        if (this.j0301wf.equals(j0301wf)) return; // for all checkboxes
        this.j0301wf = j0301wf;
        notifyPropertyChanged(BR.j0301wf);
    }

    @Bindable
    public String getJ0301wxx() {
        return j0301wxx;
    }

    public void setJ0301wxx(String j0301wxx) {
        if (this.j0301wxx.equals(j0301wxx)) return; // for all checkboxes
        this.j0301wxx = j0301wxx;
        setJ0301wxxx(j0301wxx.equals("96") ? this.j0301wxxx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.j0301wxx);
    }

    @Bindable
    public String getJ0301wxxx() {
        return j0301wxxx;
    }

    public void setJ0301wxxx(String j0301wxxx) {
        this.j0301wxxx = j0301wxxx;
        notifyPropertyChanged(BR.j0301wxxx);
    }

    @Bindable
    public String getJ0400a() {
        return j0400a;
    }

    public void setJ0400a(String j0400a) {
        this.j0400a = j0400a;
        notifyPropertyChanged(BR.j0400a);
    }

    @Bindable
    public String getJ0400b() {
        return j0400b;
    }

    public void setJ0400b(String j0400b) {
        this.j0400b = j0400b;
        notifyPropertyChanged(BR.j0400b);
    }

    @Bindable
    public String getJ0400c() {
        return j0400c;
    }

    public void setJ0400c(String j0400c) {
        this.j0400c = j0400c;
        notifyPropertyChanged(BR.j0400c);
    }

    @Bindable
    public String getJ0401a() {
        return j0401a;
    }

    public void setJ0401a(String j0401a) {
        this.j0401a = j0401a;
        notifyPropertyChanged(BR.j0401a);
    }

    @Bindable
    public String getJ0401b() {
        return j0401b;
    }

    public void setJ0401b(String j0401b) {
        this.j0401b = j0401b;
        notifyPropertyChanged(BR.j0401b);
    }

    @Bindable
    public String getJ0401c() {
        return j0401c;
    }

    public void setJ0401c(String j0401c) {
        this.j0401c = j0401c;
        notifyPropertyChanged(BR.j0401c);
    }

    @Bindable
    public String getJ0401d() {
        return j0401d;
    }

    public void setJ0401d(String j0401d) {
        this.j0401d = j0401d;
        notifyPropertyChanged(BR.j0401d);
    }

    @Bindable
    public String getJ0401e() {
        return j0401e;
    }

    public void setJ0401e(String j0401e) {
        this.j0401e = j0401e;
        notifyPropertyChanged(BR.j0401e);
    }

    @Bindable
    public String getJ0401f() {
        return j0401f;
    }

    public void setJ0401f(String j0401f) {
        this.j0401f = j0401f;
        notifyPropertyChanged(BR.j0401f);
    }

    @Bindable
    public String getJ0401g() {
        return j0401g;
    }

    public void setJ0401g(String j0401g) {
        this.j0401g = j0401g;
        notifyPropertyChanged(BR.j0401g);
    }

    @Bindable
    public String getJ0401h() {
        return j0401h;
    }

    public void setJ0401h(String j0401h) {
        this.j0401h = j0401h;
        notifyPropertyChanged(BR.j0401h);
    }

    @Bindable
    public String getJ0401i() {
        return j0401i;
    }

    public void setJ0401i(String j0401i) {
        this.j0401i = j0401i;
        notifyPropertyChanged(BR.j0401i);
    }

    @Bindable
    public String getJ0401j() {
        return j0401j;
    }

    public void setJ0401j(String j0401j) {
        this.j0401j = j0401j;
        notifyPropertyChanged(BR.j0401j);
    }

    @Bindable
    public String getJ0401k() {
        return j0401k;
    }

    public void setJ0401k(String j0401k) {
        this.j0401k = j0401k;
        notifyPropertyChanged(BR.j0401k);
    }

    @Bindable
    public String getJ0401l() {
        return j0401l;
    }

    public void setJ0401l(String j0401l) {
        this.j0401l = j0401l;
        notifyPropertyChanged(BR.j0401l);
    }

    @Bindable
    public String getJ0401m() {
        return j0401m;
    }

    public void setJ0401m(String j0401m) {
        this.j0401m = j0401m;
        notifyPropertyChanged(BR.j0401m);
    }

    @Bindable
    public String getJ0401ma() {
        return j0401ma;
    }

    public void setJ0401ma(String j0401ma) {
        if (this.j0401ma.equals(j0401ma)) return; // for all checkboxes
        this.j0401ma = j0401ma;
        notifyPropertyChanged(BR.j0401ma);
    }

    @Bindable
    public String getJ0401mb() {
        return j0401mb;
    }

    public void setJ0401mb(String j0401mb) {
        if (this.j0401mb.equals(j0401mb)) return; // for all checkboxes
        this.j0401mb = j0401mb;
        notifyPropertyChanged(BR.j0401mb);
    }

    @Bindable
    public String getJ0401mc() {
        return j0401mc;
    }

    public void setJ0401mc(String j0401mc) {
        if (this.j0401mc.equals(j0401mc)) return; // for all checkboxes
        this.j0401mc = j0401mc;
        notifyPropertyChanged(BR.j0401mc);
    }

    @Bindable
    public String getJ0401md() {
        return j0401md;
    }

    public void setJ0401md(String j0401md) {
        if (this.j0401md.equals(j0401md)) return; // for all checkboxes
        this.j0401md = j0401md;
        notifyPropertyChanged(BR.j0401md);
    }

    @Bindable
    public String getJ0401me() {
        return j0401me;
    }

    public void setJ0401me(String j0401me) {
        if (this.j0401me.equals(j0401me)) return; // for all checkboxes
        this.j0401me = j0401me;
        notifyPropertyChanged(BR.j0401me);
    }

    @Bindable
    public String getJ0401mf() {
        return j0401mf;
    }

    public void setJ0401mf(String j0401mf) {
        if (this.j0401mf.equals(j0401mf)) return; // for all checkboxes
        this.j0401mf = j0401mf;
        notifyPropertyChanged(BR.j0401mf);
    }

    @Bindable
    public String getJ0401mxx() {
        return j0401mxx;
    }

    public void setJ0401mxx(String j0401mxx) {
        if (this.j0401mxx.equals(j0401mxx)) return; // for all checkboxes
        this.j0401mxx = j0401mxx;
        setJ0401mxxx(j0401mxx.equals("96") ? this.j0401mxxx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.j0401mxx);
    }

    @Bindable
    public String getJ0401mxxx() {
        return j0401mxxx;
    }

    public void setJ0401mxxx(String j0401mxxx) {
        this.j0401mxxx = j0401mxxx;
        notifyPropertyChanged(BR.j0401mxxx);
    }

    @Bindable
    public String getJ0500a() {
        return j0500a;
    }

    public void setJ0500a(String j0500a) {
        this.j0500a = j0500a;
        notifyPropertyChanged(BR.j0500a);
    }

    @Bindable
    public String getJ0500b() {
        return j0500b;
    }

    public void setJ0500b(String j0500b) {
        this.j0500b = j0500b;
        notifyPropertyChanged(BR.j0500b);
    }

    @Bindable
    public String getJ0500c() {
        return j0500c;
    }

    public void setJ0500c(String j0500c) {
        this.j0500c = j0500c;
        notifyPropertyChanged(BR.j0500c);
    }

    @Bindable
    public String getJ0501a() {
        return j0501a;
    }

    public void setJ0501a(String j0501a) {
        this.j0501a = j0501a;
        notifyPropertyChanged(BR.j0501a);
    }

    @Bindable
    public String getJ0501b() {
        return j0501b;
    }

    public void setJ0501b(String j0501b) {
        this.j0501b = j0501b;
        notifyPropertyChanged(BR.j0501b);
    }

    @Bindable
    public String getJ0501c() {
        return j0501c;
    }

    public void setJ0501c(String j0501c) {
        this.j0501c = j0501c;
        notifyPropertyChanged(BR.j0501c);
    }

    @Bindable
    public String getJ0501d() {
        return j0501d;
    }

    public void setJ0501d(String j0501d) {
        this.j0501d = j0501d;
        notifyPropertyChanged(BR.j0501d);
    }

    @Bindable
    public String getJ0501e() {
        return j0501e;
    }

    public void setJ0501e(String j0501e) {
        this.j0501e = j0501e;
        notifyPropertyChanged(BR.j0501e);
    }

    @Bindable
    public String getJ0501f() {
        return j0501f;
    }

    public void setJ0501f(String j0501f) {
        this.j0501f = j0501f;
        notifyPropertyChanged(BR.j0501f);
    }

    @Bindable
    public String getJ0501g() {
        return j0501g;
    }

    public void setJ0501g(String j0501g) {
        this.j0501g = j0501g;
        notifyPropertyChanged(BR.j0501g);
    }

    @Bindable
    public String getJ0501h() {
        return j0501h;
    }

    public void setJ0501h(String j0501h) {
        this.j0501h = j0501h;
        notifyPropertyChanged(BR.j0501h);
    }

    @Bindable
    public String getJ0501i() {
        return j0501i;
    }

    public void setJ0501i(String j0501i) {
        this.j0501i = j0501i;
        notifyPropertyChanged(BR.j0501i);
    }

    @Bindable
    public String getJ0501j() {
        return j0501j;
    }

    public void setJ0501j(String j0501j) {
        this.j0501j = j0501j;
        notifyPropertyChanged(BR.j0501j);
    }

    @Bindable
    public String getJ0501k() {
        return j0501k;
    }

    public void setJ0501k(String j0501k) {
        this.j0501k = j0501k;
        notifyPropertyChanged(BR.j0501k);
    }

    @Bindable
    public String getJ0501l() {
        return j0501l;
    }

    public void setJ0501l(String j0501l) {
        this.j0501l = j0501l;
        notifyPropertyChanged(BR.j0501l);
    }

    @Bindable
    public String getJ0501m() {
        return j0501m;
    }

    public void setJ0501m(String j0501m) {
        this.j0501m = j0501m;
        notifyPropertyChanged(BR.j0501m);
    }

    @Bindable
    public String getJ0501n() {
        return j0501n;
    }

    public void setJ0501n(String j0501n) {
        this.j0501n = j0501n;
        notifyPropertyChanged(BR.j0501n);
    }

    @Bindable
    public String getJ0501na() {
        return j0501na;
    }

    public void setJ0501na(String j0501na) {
        if (this.j0501na.equals(j0501na)) return; // for all checkboxes
        this.j0501na = j0501na;
        notifyPropertyChanged(BR.j0501na);
    }

    @Bindable
    public String getJ0501nb() {
        return j0501nb;
    }

    public void setJ0501nb(String j0501nb) {
        if (this.j0501nb.equals(j0501nb)) return; // for all checkboxes
        this.j0501nb = j0501nb;
        notifyPropertyChanged(BR.j0501nb);
    }

    @Bindable
    public String getJ0501nc() {
        return j0501nc;
    }

    public void setJ0501nc(String j0501nc) {
        if (this.j0501nc.equals(j0501nc)) return; // for all checkboxes
        this.j0501nc = j0501nc;
        notifyPropertyChanged(BR.j0501nc);
    }

    @Bindable
    public String getJ0501nd() {
        return j0501nd;
    }

    public void setJ0501nd(String j0501nd) {
        if (this.j0501nd.equals(j0501nd)) return; // for all checkboxes
        this.j0501nd = j0501nd;
        notifyPropertyChanged(BR.j0501nd);
    }

    @Bindable
    public String getJ0501ne() {
        return j0501ne;
    }

    public void setJ0501ne(String j0501ne) {
        if (this.j0501ne.equals(j0501ne)) return; // for all checkboxes
        this.j0501ne = j0501ne;
        notifyPropertyChanged(BR.j0501ne);
    }

    @Bindable
    public String getJ0501nf() {
        return j0501nf;
    }

    public void setJ0501nf(String j0501nf) {
        if (this.j0501nf.equals(j0501nf)) return; // for all checkboxes
        this.j0501nf = j0501nf;
        notifyPropertyChanged(BR.j0501nf);
    }

    @Bindable
    public String getJ0501nxx() {
        return j0501nxx;
    }

    public void setJ0501nxx(String j0501nxx) {
        if (this.j0501nxx.equals(j0501nxx)) return; // for all checkboxes
        this.j0501nxx = j0501nxx;
        setJ0501nxxx(j0501nxx.equals("96") ? this.j0501nxxx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.j0501nxx);
    }

    @Bindable
    public String getJ0501nxxx() {
        return j0501nxxx;
    }

    public void setJ0501nxxx(String j0501nxxx) {
        this.j0501nxxx = j0501nxxx;
        notifyPropertyChanged(BR.j0501nxxx);
    }

    @Bindable
    public String getJ0600a() {
        return j0600a;
    }

    public void setJ0600a(String j0600a) {
        this.j0600a = j0600a;
        notifyPropertyChanged(BR.j0600a);
    }

    @Bindable
    public String getJ0600b() {
        return j0600b;
    }

    public void setJ0600b(String j0600b) {
        this.j0600b = j0600b;
        notifyPropertyChanged(BR.j0600b);
    }

    @Bindable
    public String getJ0600c() {
        return j0600c;
    }

    public void setJ0600c(String j0600c) {
        this.j0600c = j0600c;
        notifyPropertyChanged(BR.j0600c);
    }

    @Bindable
    public String getJ0601a() {
        return j0601a;
    }

    public void setJ0601a(String j0601a) {
        this.j0601a = j0601a;
        notifyPropertyChanged(BR.j0601a);
    }

    @Bindable
    public String getJ0601b() {
        return j0601b;
    }

    public void setJ0601b(String j0601b) {
        this.j0601b = j0601b;
        notifyPropertyChanged(BR.j0601b);
    }

    @Bindable
    public String getJ0601c() {
        return j0601c;
    }

    public void setJ0601c(String j0601c) {
        this.j0601c = j0601c;
        notifyPropertyChanged(BR.j0601c);
    }

    @Bindable
    public String getJ0601d() {
        return j0601d;
    }

    public void setJ0601d(String j0601d) {
        this.j0601d = j0601d;
        notifyPropertyChanged(BR.j0601d);
    }

    @Bindable
    public String getJ0601e() {
        return j0601e;
    }

    public void setJ0601e(String j0601e) {
        this.j0601e = j0601e;
        notifyPropertyChanged(BR.j0601e);
    }

    @Bindable
    public String getJ0601f() {
        return j0601f;
    }

    public void setJ0601f(String j0601f) {
        this.j0601f = j0601f;
        notifyPropertyChanged(BR.j0601f);
    }

    @Bindable
    public String getJ0601g() {
        return j0601g;
    }

    public void setJ0601g(String j0601g) {
        this.j0601g = j0601g;
        notifyPropertyChanged(BR.j0601g);
    }

    @Bindable
    public String getJ0601h() {
        return j0601h;
    }

    public void setJ0601h(String j0601h) {
        this.j0601h = j0601h;
        notifyPropertyChanged(BR.j0601h);
    }

    @Bindable
    public String getJ0601i() {
        return j0601i;
    }

    public void setJ0601i(String j0601i) {
        this.j0601i = j0601i;
        notifyPropertyChanged(BR.j0601i);
    }

    @Bindable
    public String getJ0601j() {
        return j0601j;
    }

    public void setJ0601j(String j0601j) {
        this.j0601j = j0601j;
        notifyPropertyChanged(BR.j0601j);
    }

    @Bindable
    public String getJ0601k() {
        return j0601k;
    }

    public void setJ0601k(String j0601k) {
        this.j0601k = j0601k;
        notifyPropertyChanged(BR.j0601k);
    }

    @Bindable
    public String getJ0601l() {
        return j0601l;
    }

    public void setJ0601l(String j0601l) {
        this.j0601l = j0601l;
        notifyPropertyChanged(BR.j0601l);
    }

    @Bindable
    public String getJ0601m() {
        return j0601m;
    }

    public void setJ0601m(String j0601m) {
        this.j0601m = j0601m;
        notifyPropertyChanged(BR.j0601m);
    }

    @Bindable
    public String getJ0601ma() {
        return j0601ma;
    }

    public void setJ0601ma(String j0601ma) {
        if (this.j0601ma.equals(j0601ma)) return; // for all checkboxes
        this.j0601ma = j0601ma;
        notifyPropertyChanged(BR.j0601ma);
    }

    @Bindable
    public String getJ0601mb() {
        return j0601mb;
    }

    public void setJ0601mb(String j0601mb) {
        if (this.j0601mb.equals(j0601mb)) return; // for all checkboxes
        this.j0601mb = j0601mb;
        notifyPropertyChanged(BR.j0601mb);
    }

    @Bindable
    public String getJ0601mc() {
        return j0601mc;
    }

    public void setJ0601mc(String j0601mc) {
        if (this.j0601mc.equals(j0601mc)) return; // for all checkboxes
        this.j0601mc = j0601mc;
        notifyPropertyChanged(BR.j0601mc);
    }

    @Bindable
    public String getJ0601md() {
        return j0601md;
    }

    public void setJ0601md(String j0601md) {
        if (this.j0601md.equals(j0601md)) return; // for all checkboxes
        this.j0601md = j0601md;
        notifyPropertyChanged(BR.j0601md);
    }

    @Bindable
    public String getJ0601me() {
        return j0601me;
    }

    public void setJ0601me(String j0601me) {
        if (this.j0601me.equals(j0601me)) return; // for all checkboxes
        this.j0601me = j0601me;
        notifyPropertyChanged(BR.j0601me);
    }

    @Bindable
    public String getJ0601mf() {
        return j0601mf;
    }

    public void setJ0601mf(String j0601mf) {
        if (this.j0601mf.equals(j0601mf)) return; // for all checkboxes
        this.j0601mf = j0601mf;
        notifyPropertyChanged(BR.j0601mf);
    }

    @Bindable
    public String getJ0601mxx() {
        return j0601mxx;
    }

    public void setJ0601mxx(String j0601mxx) {
        if (this.j0601mxx.equals(j0601mxx)) return; // for all checkboxes
        this.j0601mxx = j0601mxx;
        setJ0601mxxx(j0601mxx.equals("96") ? this.j0601mxxx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.j0601mxx);
    }

    @Bindable
    public String getJ0601mxxx() {
        return j0601mxxx;
    }

    public void setJ0601mxxx(String j0601mxxx) {
        this.j0601mxxx = j0601mxxx;
        notifyPropertyChanged(BR.j0601mxxx);
    }

    @Bindable
    public String getJ0700a() {
        return j0700a;
    }

    public void setJ0700a(String j0700a) {
        this.j0700a = j0700a;
        notifyPropertyChanged(BR.j0700a);
    }

    @Bindable
    public String getJ0700b() {
        return j0700b;
    }

    public void setJ0700b(String j0700b) {
        this.j0700b = j0700b;
        notifyPropertyChanged(BR.j0700b);
    }

    @Bindable
    public String getJ0700c() {
        return j0700c;
    }

    public void setJ0700c(String j0700c) {
        this.j0700c = j0700c;
        notifyPropertyChanged(BR.j0700c);
    }

    @Bindable
    public String getJ0701a() {
        return j0701a;
    }

    public void setJ0701a(String j0701a) {
        this.j0701a = j0701a;
        notifyPropertyChanged(BR.j0701a);
    }

    @Bindable
    public String getJ0701b() {
        return j0701b;
    }

    public void setJ0701b(String j0701b) {
        this.j0701b = j0701b;
        notifyPropertyChanged(BR.j0701b);
    }

    @Bindable
    public String getJ0701c() {
        return j0701c;
    }

    public void setJ0701c(String j0701c) {
        this.j0701c = j0701c;
        notifyPropertyChanged(BR.j0701c);
    }

    @Bindable
    public String getJ0701d() {
        return j0701d;
    }

    public void setJ0701d(String j0701d) {
        this.j0701d = j0701d;
        notifyPropertyChanged(BR.j0701d);
    }

    @Bindable
    public String getJ0701e() {
        return j0701e;
    }

    public void setJ0701e(String j0701e) {
        this.j0701e = j0701e;
        notifyPropertyChanged(BR.j0701e);
    }

    @Bindable
    public String getJ0701f() {
        return j0701f;
    }

    public void setJ0701f(String j0701f) {
        this.j0701f = j0701f;
        notifyPropertyChanged(BR.j0701f);
    }

    @Bindable
    public String getJ0701g() {
        return j0701g;
    }

    public void setJ0701g(String j0701g) {
        this.j0701g = j0701g;
        notifyPropertyChanged(BR.j0701g);
    }

    @Bindable
    public String getJ0701ga() {
        return j0701ga;
    }

    public void setJ0701ga(String j0701ga) {
        if (this.j0701ga.equals(j0701ga)) return; // for all checkboxes
        this.j0701ga = j0701ga;
        notifyPropertyChanged(BR.j0701ga);
    }

    @Bindable
    public String getJ0701gb() {
        return j0701gb;
    }

    public void setJ0701gb(String j0701gb) {
        if (this.j0701gb.equals(j0701gb)) return; // for all checkboxes
        this.j0701gb = j0701gb;
        notifyPropertyChanged(BR.j0701gb);
    }

    @Bindable
    public String getJ0701gc() {
        return j0701gc;
    }

    public void setJ0701gc(String j0701gc) {
        if (this.j0701gc.equals(j0701gc)) return; // for all checkboxes
        this.j0701gc = j0701gc;
        notifyPropertyChanged(BR.j0701gc);
    }

    @Bindable
    public String getJ0701gd() {
        return j0701gd;
    }

    public void setJ0701gd(String j0701gd) {
        if (this.j0701gd.equals(j0701gd)) return; // for all checkboxes
        this.j0701gd = j0701gd;
        notifyPropertyChanged(BR.j0701gd);
    }

    @Bindable
    public String getJ0701ge() {
        return j0701ge;
    }

    public void setJ0701ge(String j0701ge) {
        if (this.j0701ge.equals(j0701ge)) return; // for all checkboxes
        this.j0701ge = j0701ge;
        notifyPropertyChanged(BR.j0701ge);
    }

    @Bindable
    public String getJ0701gf() {
        return j0701gf;
    }

    public void setJ0701gf(String j0701gf) {
        if (this.j0701gf.equals(j0701gf)) return; // for all checkboxes
        this.j0701gf = j0701gf;
        notifyPropertyChanged(BR.j0701gf);
    }

    @Bindable
    public String getJ0701gxx() {
        return j0701gxx;
    }

    public void setJ0701gxx(String j0701gxx) {
        if (this.j0701gxx.equals(j0701gxx)) return; // for all checkboxes
        this.j0701gxx = j0701gxx;
        setJ0701gxxx(j0701gxx.equals("96") ? this.j0701gxxx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.j0701gxx);
    }

    @Bindable
    public String getJ0701gxxx() {
        return j0701gxxx;
    }

    public void setJ0701gxxx(String j0701gxxx) {
        this.j0701gxxx = j0701gxxx;
        notifyPropertyChanged(BR.j0701gxxx);
    }

    @Bindable
    public String getJ0800a() {
        return j0800a;
    }

    public void setJ0800a(String j0800a) {
        this.j0800a = j0800a;
        notifyPropertyChanged(BR.j0800a);
    }

    @Bindable
    public String getJ0800b() {
        return j0800b;
    }

    public void setJ0800b(String j0800b) {
        this.j0800b = j0800b;
        notifyPropertyChanged(BR.j0800b);
    }

    @Bindable
    public String getJ0800c() {
        return j0800c;
    }

    public void setJ0800c(String j0800c) {
        this.j0800c = j0800c;
        notifyPropertyChanged(BR.j0800c);
    }

    @Bindable
    public String getJ0801a() {
        return j0801a;
    }

    public void setJ0801a(String j0801a) {
        this.j0801a = j0801a;
        notifyPropertyChanged(BR.j0801a);
    }

    @Bindable
    public String getJ0801b() {
        return j0801b;
    }

    public void setJ0801b(String j0801b) {
        this.j0801b = j0801b;
        notifyPropertyChanged(BR.j0801b);
    }

    @Bindable
    public String getJ0801c() {
        return j0801c;
    }

    public void setJ0801c(String j0801c) {
        this.j0801c = j0801c;
        notifyPropertyChanged(BR.j0801c);
    }

    @Bindable
    public String getJ0801d() {
        return j0801d;
    }

    public void setJ0801d(String j0801d) {
        this.j0801d = j0801d;
        notifyPropertyChanged(BR.j0801d);
    }

    @Bindable
    public String getJ0801e() {
        return j0801e;
    }

    public void setJ0801e(String j0801e) {
        this.j0801e = j0801e;
        notifyPropertyChanged(BR.j0801e);
    }

    @Bindable
    public String getJ0801f() {
        return j0801f;
    }

    public void setJ0801f(String j0801f) {
        this.j0801f = j0801f;
        notifyPropertyChanged(BR.j0801f);
    }

    @Bindable
    public String getJ0801g() {
        return j0801g;
    }

    public void setJ0801g(String j0801g) {
        this.j0801g = j0801g;
        notifyPropertyChanged(BR.j0801g);
    }

    @Bindable
    public String getJ0801ga() {
        return j0801ga;
    }

    public void setJ0801ga(String j0801ga) {
        if (this.j0801ga.equals(j0801ga)) return; // for all checkboxes
        this.j0801ga = j0801ga;
        notifyPropertyChanged(BR.j0801ga);
    }

    @Bindable
    public String getJ0801gb() {
        return j0801gb;
    }

    public void setJ0801gb(String j0801gb) {
        if (this.j0801gb.equals(j0801gb)) return; // for all checkboxes
        this.j0801gb = j0801gb;
        notifyPropertyChanged(BR.j0801gb);
    }

    @Bindable
    public String getJ0801gc() {
        return j0801gc;
    }

    public void setJ0801gc(String j0801gc) {
        if (this.j0801gc.equals(j0801gc)) return; // for all checkboxes
        this.j0801gc = j0801gc;
        notifyPropertyChanged(BR.j0801gc);
    }

    @Bindable
    public String getJ0801gd() {
        return j0801gd;
    }

    public void setJ0801gd(String j0801gd) {
        if (this.j0801gd.equals(j0801gd)) return; // for all checkboxes
        this.j0801gd = j0801gd;
        notifyPropertyChanged(BR.j0801gd);
    }

    @Bindable
    public String getJ0900a() {
        return j0900a;
    }

    public void setJ0900a(String j0900a) {
        this.j0900a = j0900a;
        notifyPropertyChanged(BR.j0900a);
    }

    @Bindable
    public String getJ0900b() {
        return j0900b;
    }

    public void setJ0900b(String j0900b) {
        this.j0900b = j0900b;
        notifyPropertyChanged(BR.j0900b);
    }

    @Bindable
    public String getJ0900c() {
        return j0900c;
    }

    public void setJ0900c(String j0900c) {
        this.j0900c = j0900c;
        notifyPropertyChanged(BR.j0900c);
    }

    @Bindable
    public String getJ0901a() {
        return j0901a;
    }

    public void setJ0901a(String j0901a) {
        this.j0901a = j0901a;
        notifyPropertyChanged(BR.j0901a);
    }

    @Bindable
    public String getJ0901b() {
        return j0901b;
    }

    public void setJ0901b(String j0901b) {
        this.j0901b = j0901b;
        notifyPropertyChanged(BR.j0901b);
    }

    @Bindable
    public String getJ0901c() {
        return j0901c;
    }

    public void setJ0901c(String j0901c) {
        this.j0901c = j0901c;
        notifyPropertyChanged(BR.j0901c);
    }

    @Bindable
    public String getJ0901d() {
        return j0901d;
    }

    public void setJ0901d(String j0901d) {
        this.j0901d = j0901d;
        notifyPropertyChanged(BR.j0901d);
    }

    @Bindable
    public String getJ0901e() {
        return j0901e;
    }

    public void setJ0901e(String j0901e) {
        this.j0901e = j0901e;
        notifyPropertyChanged(BR.j0901e);
    }

    @Bindable
    public String getJ0901f() {
        return j0901f;
    }

    public void setJ0901f(String j0901f) {
        this.j0901f = j0901f;
        notifyPropertyChanged(BR.j0901f);
    }

    @Bindable
    public String getJ0901fa() {
        return j0901fa;
    }

    public void setJ0901fa(String j0901fa) {
        if (this.j0901fa.equals(j0901fa)) return; // for all checkboxes
        this.j0901fa = j0901fa;
        notifyPropertyChanged(BR.j0901fa);
    }

    @Bindable
    public String getJ0901fb() {
        return j0901fb;
    }

    public void setJ0901fb(String j0901fb) {
        if (this.j0901fb.equals(j0901fb)) return; // for all checkboxes
        this.j0901fb = j0901fb;
        notifyPropertyChanged(BR.j0901fb);
    }

    @Bindable
    public String getJ0901fc() {
        return j0901fc;
    }

    public void setJ0901fc(String j0901fc) {
        if (this.j0901fc.equals(j0901fc)) return; // for all checkboxes
        this.j0901fc = j0901fc;
        notifyPropertyChanged(BR.j0901fc);
    }

    @Bindable
    public String getJ0901fd() {
        return j0901fd;
    }

    public void setJ0901fd(String j0901fd) {
        if (this.j0901fd.equals(j0901fd)) return; // for all checkboxes
        this.j0901fd = j0901fd;
        notifyPropertyChanged(BR.j0901fd);
    }

    @Bindable
    public String getJ0901fe() {
        return j0901fe;
    }

    public void setJ0901fe(String j0901fe) {
        if (this.j0901fe.equals(j0901fe)) return; // for all checkboxes
        this.j0901fe = j0901fe;
        notifyPropertyChanged(BR.j0901fe);
    }


    public ModuleJ Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_UUID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SYNCED_DATE));
        sJ1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SJ1)));
        sJ2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SJ2)));
        sJ3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SJ3)));
        sJ4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SJ4)));
        sJ5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SJ5)));
        sJ6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SJ6)));
        sJ7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SJ7)));
        sJ8Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SJ8)));
        sJ9Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleJTable.COLUMN_SJ9)));
        return this;
    }

    public void sJ1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sJ1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.j0100a = json.getString("j0100a");
            this.j0100b = json.getString("j0100b");
            this.j0100c = json.getString("j0100c");
            this.j0101a = json.getString("j0101a");
            this.j0101b = json.getString("j0101b");
            this.j0101c = json.getString("j0101c");
            this.j0101d = json.getString("j0101d");
            this.j0101e = json.getString("j0101e");
            this.j0101f = json.getString("j0101f");
            this.j0101g = json.getString("j0101g");
            this.j0101h = json.getString("j0101h");
            this.j0101ia = json.getString("j0101ia");
            this.j0101ib = json.getString("j0101ib");
            this.j0101j = json.getString("j0101j");
            this.j0101k = json.getString("j0101k");
            this.j0101l = json.getString("j0101l");
            this.j0101ma = json.getString("j0101ma");
            this.j0101mb = json.getString("j0101mb");
            this.j0101mc = json.getString("j0101mc");
            this.j0101md = json.getString("j0101md");
            this.j0101me = json.getString("j0101me");
            this.j0101mf = json.getString("j0101mf");
            this.j0101mxx = json.getString("j0101mxx");
            this.j0101mxxx = json.getString("j0101mxxx");
        }
    }

    public void sJ2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sJ2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.j0200a = json.getString("j0200a");
            this.j0200b = json.getString("j0200b");
            this.j0200c = json.getString("j0200c");
            this.j0201a = json.getString("j0201a");
            this.j0201b = json.getString("j0201b");
            this.j0201c = json.getString("j0201c");
            this.j0201d = json.getString("j0201d");
            this.j0201e = json.getString("j0201e");
            this.j0201f = json.getString("j0201f");
            this.j0201ga = json.getString("j0201ga");
            this.j0201gb = json.getString("j0201gb");
            this.j0201gc = json.getString("j0201gc");
            this.j0201gd = json.getString("j0201gd");
            this.j0201ge = json.getString("j0201ge");
            this.j0201gf = json.getString("j0201gf");
            this.j0201gxx = json.getString("j0201gxx");
            this.j0201gxxx = json.getString("j0201gxxx");
        }
    }

    public void sJ3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sJ3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.j0300a = json.getString("j0300a");
            this.j0300b = json.getString("j0300b");
            this.j0300c = json.getString("j0300c");
            this.j0301a = json.getString("j0301a");
            this.j0301b = json.getString("j0301b");
            this.j0301c = json.getString("j0301c");
            this.j0301d = json.getString("j0301d");
            this.j0301e = json.getString("j0301e");
            this.j0301f = json.getString("j0301f");
            this.j0301g = json.getString("j0301g");
            this.j0301h = json.getString("j0301h");
            this.j0301i = json.getString("j0301i");
            this.j0301j = json.getString("j0301j");
            this.j0301k = json.getString("j0301k");
            this.j0301l = json.getString("j0301l");
            this.j0301m = json.getString("j0301m");
            this.j0301n = json.getString("j0301n");
            this.j0301o = json.getString("j0301o");
            this.j0301p = json.getString("j0301p");
            this.j0301q = json.getString("j0301q");
            this.j0301r = json.getString("j0301r");
            this.j0301s = json.getString("j0301s");
            this.j0301t = json.getString("j0301t");
            this.j0301u = json.getString("j0301u");
            this.j0301v = json.getString("j0301v");
            this.j0301wa = json.getString("j0301wa");
            this.j0301wb = json.getString("j0301wb");
            this.j0301wc = json.getString("j0301wc");
            this.j0301wd = json.getString("j0301wd");
            this.j0301we = json.getString("j0301we");
            this.j0301wf = json.getString("j0301wf");
            this.j0301wxx = json.getString("j0301wxx");
            this.j0301wxxx = json.getString("j0301wxxx");
        }
    }

    public void sJ4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sJ4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.j0400a = json.getString("j0400a");
            this.j0400b = json.getString("j0400b");
            this.j0400c = json.getString("j0400c");
            this.j0401a = json.getString("j0401a");
            this.j0401b = json.getString("j0401b");
            this.j0401c = json.getString("j0401c");
            this.j0401d = json.getString("j0401d");
            this.j0401e = json.getString("j0401e");
            this.j0401f = json.getString("j0401f");
            this.j0401g = json.getString("j0401g");
            this.j0401h = json.getString("j0401h");
            this.j0401i = json.getString("j0401i");
            this.j0401j = json.getString("j0401j");
            this.j0401k = json.getString("j0401k");
            this.j0401l = json.getString("j0401l");
            this.j0401ma = json.getString("j0401ma");
            this.j0401mb = json.getString("j0401mb");
            this.j0401mc = json.getString("j0401mc");
            this.j0401md = json.getString("j0401md");
            this.j0401me = json.getString("j0401me");
            this.j0401mf = json.getString("j0401mf");
            this.j0401mxx = json.getString("j0401mxx");
            this.j0401mxxx = json.getString("j0401mxxx");
        }
    }

    public void sJ5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sJ5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.j0500a = json.getString("j0500a");
            this.j0500b = json.getString("j0500b");
            this.j0500c = json.getString("j0500c");
            this.j0501a = json.getString("j0501a");
            this.j0501b = json.getString("j0501b");
            this.j0501c = json.getString("j0501c");
            this.j0501d = json.getString("j0501d");
            this.j0501e = json.getString("j0501e");
            this.j0501f = json.getString("j0501f");
            this.j0501g = json.getString("j0501g");
            this.j0501h = json.getString("j0501h");
            this.j0501i = json.getString("j0501i");
            this.j0501j = json.getString("j0501j");
            this.j0501k = json.getString("j0501k");
            this.j0501l = json.getString("j0501l");
            this.j0501m = json.getString("j0501m");
            this.j0501na = json.getString("j0501na");
            this.j0501nb = json.getString("j0501nb");
            this.j0501nc = json.getString("j0501nc");
            this.j0501nd = json.getString("j0501nd");
            this.j0501ne = json.getString("j0501ne");
            this.j0501nf = json.getString("j0501nf");
            this.j0501nxx = json.getString("j0501nxx");
            this.j0501nxxx = json.getString("j0501nxxx");
        }
    }

    public void sJ6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sJ6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.j0600a = json.getString("j0600a");
            this.j0600b = json.getString("j0600b");
            this.j0600c = json.getString("j0600c");
            this.j0601a = json.getString("j0601a");
            this.j0601b = json.getString("j0601b");
            this.j0601c = json.getString("j0601c");
            this.j0601d = json.getString("j0601d");
            this.j0601e = json.getString("j0601e");
            this.j0601f = json.getString("j0601f");
            this.j0601g = json.getString("j0601g");
            this.j0601h = json.getString("j0601h");
            this.j0601i = json.getString("j0601i");
            this.j0601j = json.getString("j0601j");
            this.j0601k = json.getString("j0601k");
            this.j0601l = json.getString("j0601l");
            this.j0601ma = json.getString("j0601ma");
            this.j0601mb = json.getString("j0601mb");
            this.j0601mc = json.getString("j0601mc");
            this.j0601md = json.getString("j0601md");
            this.j0601me = json.getString("j0601me");
            this.j0601mf = json.getString("j0601mf");
            this.j0601mxx = json.getString("j0601mxx");
            this.j0601mxxx = json.getString("j0601mxxx");
        }
    }

    public void sJ7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sJ7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.j0700a = json.getString("j0700a");
            this.j0700b = json.getString("j0700b");
            this.j0700c = json.getString("j0700c");
            this.j0701a = json.getString("j0701a");
            this.j0701b = json.getString("j0701b");
            this.j0701c = json.getString("j0701c");
            this.j0701d = json.getString("j0701d");
            this.j0701e = json.getString("j0701e");
            this.j0701f = json.getString("j0701f");
            this.j0701ga = json.getString("j0701ga");
            this.j0701gb = json.getString("j0701gb");
            this.j0701gc = json.getString("j0701gc");
            this.j0701gd = json.getString("j0701gd");
            this.j0701ge = json.getString("j0701ge");
            this.j0701gf = json.getString("j0701gf");
            this.j0701gxx = json.getString("j0701gxx");
            this.j0701gxxx = json.getString("j0701gxxx");
        }
    }

    public void sJ8Hydrate(String string) throws JSONException {
        Log.d(TAG, "sJ8Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.j0800a = json.getString("j0800a");
            this.j0800b = json.getString("j0800b");
            this.j0800c = json.getString("j0800c");
            this.j0801a = json.getString("j0801a");
            this.j0801b = json.getString("j0801b");
            this.j0801c = json.getString("j0801c");
            this.j0801d = json.getString("j0801d");
            this.j0801e = json.getString("j0801e");
            this.j0801f = json.getString("j0801f");
            this.j0801ga = json.getString("j0801ga");
            this.j0801gb = json.getString("j0801gb");
            this.j0801gc = json.getString("j0801gc");
            this.j0801gd = json.getString("j0801gd");
        }
    }

    public void sJ9Hydrate(String string) throws JSONException {
        Log.d(TAG, "sJ9Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.j0900a = json.getString("j0900a");
            this.j0900b = json.getString("j0900b");
            this.j0900c = json.getString("j0900c");
            this.j0901a = json.getString("j0901a");
            this.j0901b = json.getString("j0901b");
            this.j0901c = json.getString("j0901c");
            this.j0901d = json.getString("j0901d");
            this.j0901e = json.getString("j0901e");
            this.j0901fa = json.getString("j0901fa");
            this.j0901fb = json.getString("j0901fb");
            this.j0901fc = json.getString("j0901fc");
            this.j0901fd = json.getString("j0901fd");
            this.j0901fe = json.getString("j0901fe");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(ModuleJTable.COLUMN_ID, this.id);
        json.put(ModuleJTable.COLUMN_UID, this.uid);
        json.put(ModuleJTable.COLUMN_UUID, this.uuid);
        json.put(ModuleJTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(ModuleJTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(ModuleJTable.COLUMN_UC_CODE, this.ucCode);
        json.put(ModuleJTable.COLUMN_HF_CODE, this.hfCode);
        json.put(ModuleJTable.COLUMN_USERNAME, this.userName);
        json.put(ModuleJTable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleJTable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleJTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleJTable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleJTable.COLUMN_SYNCED, this.synced);
        json.put(ModuleJTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleJTable.COLUMN_SJ1, new JSONObject(sJ1toString()));
        json.put(ModuleJTable.COLUMN_SJ2, new JSONObject(sJ2toString()));
        json.put(ModuleJTable.COLUMN_SJ3, new JSONObject(sJ3toString()));
        json.put(ModuleJTable.COLUMN_SJ4, new JSONObject(sJ4toString()));
        json.put(ModuleJTable.COLUMN_SJ5, new JSONObject(sJ5toString()));
        json.put(ModuleJTable.COLUMN_SJ6, new JSONObject(sJ6toString()));
        json.put(ModuleJTable.COLUMN_SJ7, new JSONObject(sJ7toString()));
        json.put(ModuleJTable.COLUMN_SJ8, new JSONObject(sJ8toString()));
        json.put(ModuleJTable.COLUMN_SJ9, new JSONObject(sJ9toString()));
        return json;
    }

    public String sJ1toString() throws JSONException {
        Log.d(TAG, "sJ1toString: ");
        JSONObject json = new JSONObject();
        json.put("j0100a", j0100a)
                .put("j0100b", j0100b)
                .put("j0100c", j0100c)
                .put("j0101a", j0101a)
                .put("j0101b", j0101b)
                .put("j0101c", j0101c)
                .put("j0101d", j0101d)
                .put("j0101e", j0101e)
                .put("j0101f", j0101f)
                .put("j0101g", j0101g)
                .put("j0101h", j0101h)
                .put("j0101ia", j0101ia)
                .put("j0101ib", j0101ib)
                .put("j0101j", j0101j)
                .put("j0101k", j0101k)
                .put("j0101l", j0101l)
                .put("j0101ma", j0101ma)
                .put("j0101mb", j0101mb)
                .put("j0101mc", j0101mc)
                .put("j0101md", j0101md)
                .put("j0101me", j0101me)
                .put("j0101mf", j0101mf)
                .put("j0101mxx", j0101mxx)
                .put("j0101mxxx", j0101mxxx);
        return json.toString();
    }

    public String sJ2toString() throws JSONException {
        Log.d(TAG, "sJ2toString: ");
        JSONObject json = new JSONObject();
        json.put("j0200a", j0200a)
                .put("j0200b", j0200b)
                .put("j0200c", j0200c)
                .put("j0201a", j0201a)
                .put("j0201b", j0201b)
                .put("j0201c", j0201c)
                .put("j0201d", j0201d)
                .put("j0201e", j0201e)
                .put("j0201f", j0201f)
                .put("j0201ga", j0201ga)
                .put("j0201gb", j0201gb)
                .put("j0201gc", j0201gc)
                .put("j0201gd", j0201gd)
                .put("j0201ge", j0201ge)
                .put("j0201gf", j0201gf)
                .put("j0201gxx", j0201gxx)
                .put("j0201gxxx", j0201gxxx);
        return json.toString();
    }

    public String sJ3toString() throws JSONException {
        Log.d(TAG, "sJ3toString: ");
        JSONObject json = new JSONObject();
        json.put("j0300a", j0300a)
                .put("j0300b", j0300b)
                .put("j0300c", j0300c)
                .put("j0301a", j0301a)
                .put("j0301b", j0301b)
                .put("j0301c", j0301c)
                .put("j0301d", j0301d)
                .put("j0301e", j0301e)
                .put("j0301f", j0301f)
                .put("j0301g", j0301g)
                .put("j0301h", j0301h)
                .put("j0301i", j0301i)
                .put("j0301j", j0301j)
                .put("j0301k", j0301k)
                .put("j0301l", j0301l)
                .put("j0301m", j0301m)
                .put("j0301n", j0301n)
                .put("j0301o", j0301o)
                .put("j0301p", j0301p)
                .put("j0301q", j0301q)
                .put("j0301r", j0301r)
                .put("j0301s", j0301s)
                .put("j0301t", j0301t)
                .put("j0301u", j0301u)
                .put("j0301v", j0301v)
                .put("j0301wa", j0301wa)
                .put("j0301wb", j0301wb)
                .put("j0301wc", j0301wc)
                .put("j0301wd", j0301wd)
                .put("j0301we", j0301we)
                .put("j0301wf", j0301wf)
                .put("j0301wxx", j0301wxx)
                .put("j0301wxxx", j0301wxxx);
        return json.toString();
    }

    public String sJ4toString() throws JSONException {
        Log.d(TAG, "sJ4toString: ");
        JSONObject json = new JSONObject();
        json.put("j0400a", j0400a)
                .put("j0400b", j0400b)
                .put("j0400c", j0400c)
                .put("j0401a", j0401a)
                .put("j0401b", j0401b)
                .put("j0401c", j0401c)
                .put("j0401d", j0401d)
                .put("j0401e", j0401e)
                .put("j0401f", j0401f)
                .put("j0401g", j0401g)
                .put("j0401h", j0401h)
                .put("j0401i", j0401i)
                .put("j0401j", j0401j)
                .put("j0401k", j0401k)
                .put("j0401l", j0401l)
                .put("j0401ma", j0401ma)
                .put("j0401mb", j0401mb)
                .put("j0401mc", j0401mc)
                .put("j0401md", j0401md)
                .put("j0401me", j0401me)
                .put("j0401mf", j0401mf)
                .put("j0401mxx", j0401mxx)
                .put("j0401mxxx", j0401mxxx);
        return json.toString();
    }

    public String sJ5toString() throws JSONException {
        Log.d(TAG, "sJ5toString: ");
        JSONObject json = new JSONObject();
        json.put("j0500a", j0500a)
                .put("j0500b", j0500b)
                .put("j0500c", j0500c)
                .put("j0501a", j0501a)
                .put("j0501b", j0501b)
                .put("j0501c", j0501c)
                .put("j0501d", j0501d)
                .put("j0501e", j0501e)
                .put("j0501f", j0501f)
                .put("j0501g", j0501g)
                .put("j0501h", j0501h)
                .put("j0501i", j0501i)
                .put("j0501j", j0501j)
                .put("j0501k", j0501k)
                .put("j0501l", j0501l)
                .put("j0501m", j0501m)
                .put("j0501na", j0501na)
                .put("j0501nb", j0501nb)
                .put("j0501nc", j0501nc)
                .put("j0501nd", j0501nd)
                .put("j0501ne", j0501ne)
                .put("j0501nf", j0501nf)
                .put("j0501nxx", j0501nxx)
                .put("j0501nxxx", j0501nxxx);
        return json.toString();
    }

    public String sJ6toString() throws JSONException {
        Log.d(TAG, "sJ6toString: ");
        JSONObject json = new JSONObject();
        json.put("j0600a", j0600a)
                .put("j0600b", j0600b)
                .put("j0600c", j0600c)
                .put("j0601a", j0601a)
                .put("j0601b", j0601b)
                .put("j0601c", j0601c)
                .put("j0601d", j0601d)
                .put("j0601e", j0601e)
                .put("j0601f", j0601f)
                .put("j0601g", j0601g)
                .put("j0601h", j0601h)
                .put("j0601i", j0601i)
                .put("j0601j", j0601j)
                .put("j0601k", j0601k)
                .put("j0601l", j0601l)
                .put("j0601ma", j0601ma)
                .put("j0601mb", j0601mb)
                .put("j0601mc", j0601mc)
                .put("j0601md", j0601md)
                .put("j0601me", j0601me)
                .put("j0601mf", j0601mf)
                .put("j0601mxx", j0601mxx)
                .put("j0601mxxx", j0601mxxx);
        return json.toString();
    }

    public String sJ7toString() throws JSONException {
        Log.d(TAG, "sJ7toString: ");
        JSONObject json = new JSONObject();
        json.put("j0700a", j0700a)
                .put("j0700b", j0700b)
                .put("j0700c", j0700c)
                .put("j0701a", j0701a)
                .put("j0701b", j0701b)
                .put("j0701c", j0701c)
                .put("j0701d", j0701d)
                .put("j0701e", j0701e)
                .put("j0701f", j0701f)
                .put("j0701ga", j0701ga)
                .put("j0701gb", j0701gb)
                .put("j0701gc", j0701gc)
                .put("j0701gd", j0701gd)
                .put("j0701ge", j0701ge)
                .put("j0701gf", j0701gf)
                .put("j0701gxx", j0701gxx)
                .put("j0701gxxx", j0701gxxx);
        return json.toString();
    }

    public String sJ8toString() throws JSONException {
        Log.d(TAG, "sJ8toString: ");
        JSONObject json = new JSONObject();
        json.put("j0800a", j0800a)
                .put("j0800b", j0800b)
                .put("j0800c", j0800c)
                .put("j0801a", j0801a)
                .put("j0801b", j0801b)
                .put("j0801c", j0801c)
                .put("j0801d", j0801d)
                .put("j0801e", j0801e)
                .put("j0801f", j0801f)
                .put("j0801ga", j0801ga)
                .put("j0801gb", j0801gb)
                .put("j0801gc", j0801gc)
                .put("j0801gd", j0801gd);
        return json.toString();
    }

    public String sJ9toString() throws JSONException {
        Log.d(TAG, "sJ9toString: ");
        JSONObject json = new JSONObject();
        json.put("j0900a", j0900a)
                .put("j0900b", j0900b)
                .put("j0900c", j0900c)
                .put("j0901a", j0901a)
                .put("j0901b", j0901b)
                .put("j0901c", j0901c)
                .put("j0901d", j0901d)
                .put("j0901e", j0901e)
                .put("j0901fa", j0901fa)
                .put("j0901fb", j0901fb)
                .put("j0901fc", j0901fc)
                .put("j0901fd", j0901fd)
                .put("j0901fe", j0901fe);
        return json.toString();
    }


}
