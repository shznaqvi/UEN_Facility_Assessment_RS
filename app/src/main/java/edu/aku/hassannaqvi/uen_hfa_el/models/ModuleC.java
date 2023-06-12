package edu.aku.hassannaqvi.uen_hfa_el.models;

import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_hfa_el.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_hfa_el.BR;
import edu.aku.hassannaqvi.uen_hfa_el.contracts.TableContracts.ModuleCTable;
import edu.aku.hassannaqvi.uen_hfa_el.core.MainApp;

public class ModuleC extends BaseObservable implements Observable {

    private final String TAG = "ModuleC";
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
    private String c01aa = _EMPTY_;
    private String c01ab = _EMPTY_;
    private String c01ac = _EMPTY_;
    private String c01ad = _EMPTY_;
    private String c01ae = _EMPTY_;
    private String c01ba = _EMPTY_;
    private String c01bb = _EMPTY_;
    private String c01bc = _EMPTY_;
    private String c01bd = _EMPTY_;
    private String c01be = _EMPTY_;
    private String c01ca = _EMPTY_;
    private String c01cb = _EMPTY_;
    private String c01cc = _EMPTY_;
    private String c01cd = _EMPTY_;
    private String c01ce = _EMPTY_;
    private String c01da = _EMPTY_;
    private String c01db = _EMPTY_;
    private String c01dc = _EMPTY_;
    private String c01dd = _EMPTY_;
    private String c01de = _EMPTY_;
    private String c01ea = _EMPTY_;
    private String c01eb = _EMPTY_;
    private String c01ec = _EMPTY_;
    private String c01ed = _EMPTY_;
    private String c01ee = _EMPTY_;
    private String c01fa = _EMPTY_;
    private String c01fb = _EMPTY_;
    private String c01fc = _EMPTY_;
    private String c01fd = _EMPTY_;
    private String c01fe = _EMPTY_;
    private String c01ga = _EMPTY_;
    private String c01gb = _EMPTY_;
    private String c01gc = _EMPTY_;
    private String c01gd = _EMPTY_;
    private String c01ge = _EMPTY_;
    private String c01ha = _EMPTY_;
    private String c01hb = _EMPTY_;
    private String c01hc = _EMPTY_;
    private String c01hd = _EMPTY_;
    private String c01he = _EMPTY_;
    private String c01ia = _EMPTY_;
    private String c01ib = _EMPTY_;
    private String c01ic = _EMPTY_;
    private String c01id = _EMPTY_;
    private String c01ie = _EMPTY_;
    private String c01ja = _EMPTY_;
    private String c01jb = _EMPTY_;
    private String c01jc = _EMPTY_;
    private String c01jd = _EMPTY_;
    private String c01je = _EMPTY_;
    private String c01ka = _EMPTY_;
    private String c01kb = _EMPTY_;
    private String c01kc = _EMPTY_;
    private String c01kd = _EMPTY_;
    private String c01ke = _EMPTY_;
    private String c01la = _EMPTY_;
    private String c01lb = _EMPTY_;
    private String c01lc = _EMPTY_;
    private String c01ld = _EMPTY_;
    private String c01le = _EMPTY_;


    public ModuleC() {
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
    public String getC01aa() {
        return c01aa;
    }

    public void setC01aa(String c01aa) {
        this.c01aa = c01aa;
        notifyPropertyChanged(BR.c01aa);
    }

    @Bindable
    public String getC01ab() {
        return c01ab;
    }

    public void setC01ab(String c01ab) {
        this.c01ab = c01ab;
        notifyPropertyChanged(BR.c01ab);
    }

    @Bindable
    public String getC01ac() {
        return c01ac;
    }

    public void setC01ac(String c01ac) {
        this.c01ac = c01ac;
        notifyPropertyChanged(BR.c01ac);
    }

    @Bindable
    public String getC01ad() {
        return c01ad;
    }

    public void setC01ad(String c01ad) {
        this.c01ad = c01ad;
        notifyPropertyChanged(BR.c01ad);
    }

    @Bindable
    public String getC01ae() {
        return c01ae;
    }

    public void setC01ae(String c01ae) {
        this.c01ae = c01ae;
        notifyPropertyChanged(BR.c01ae);
    }

    @Bindable
    public String getC01ba() {
        return c01ba;
    }

    public void setC01ba(String c01ba) {
        this.c01ba = c01ba;
        notifyPropertyChanged(BR.c01ba);
    }

    @Bindable
    public String getC01bb() {
        return c01bb;
    }

    public void setC01bb(String c01bb) {
        this.c01bb = c01bb;
        notifyPropertyChanged(BR.c01bb);
    }

    @Bindable
    public String getC01bc() {
        return c01bc;
    }

    public void setC01bc(String c01bc) {
        this.c01bc = c01bc;
        notifyPropertyChanged(BR.c01bc);
    }

    @Bindable
    public String getC01bd() {
        return c01bd;
    }

    public void setC01bd(String c01bd) {
        this.c01bd = c01bd;
        notifyPropertyChanged(BR.c01bd);
    }

    @Bindable
    public String getC01be() {
        return c01be;
    }

    public void setC01be(String c01be) {
        this.c01be = c01be;
        notifyPropertyChanged(BR.c01be);
    }

    @Bindable
    public String getC01ca() {
        return c01ca;
    }

    public void setC01ca(String c01ca) {
        this.c01ca = c01ca;
        notifyPropertyChanged(BR.c01ca);
    }

    @Bindable
    public String getC01cb() {
        return c01cb;
    }

    public void setC01cb(String c01cb) {
        this.c01cb = c01cb;
        notifyPropertyChanged(BR.c01cb);
    }

    @Bindable
    public String getC01cc() {
        return c01cc;
    }

    public void setC01cc(String c01cc) {
        this.c01cc = c01cc;
        notifyPropertyChanged(BR.c01cc);
    }

    @Bindable
    public String getC01cd() {
        return c01cd;
    }

    public void setC01cd(String c01cd) {
        this.c01cd = c01cd;
        notifyPropertyChanged(BR.c01cd);
    }

    @Bindable
    public String getC01ce() {
        return c01ce;
    }

    public void setC01ce(String c01ce) {
        this.c01ce = c01ce;
        notifyPropertyChanged(BR.c01ce);
    }

    @Bindable
    public String getC01da() {
        return c01da;
    }

    public void setC01da(String c01da) {
        this.c01da = c01da;
        notifyPropertyChanged(BR.c01da);
    }

    @Bindable
    public String getC01db() {
        return c01db;
    }

    public void setC01db(String c01db) {
        this.c01db = c01db;
        notifyPropertyChanged(BR.c01db);
    }

    @Bindable
    public String getC01dc() {
        return c01dc;
    }

    public void setC01dc(String c01dc) {
        this.c01dc = c01dc;
        notifyPropertyChanged(BR.c01dc);
    }

    @Bindable
    public String getC01dd() {
        return c01dd;
    }

    public void setC01dd(String c01dd) {
        this.c01dd = c01dd;
        notifyPropertyChanged(BR.c01dd);
    }

    @Bindable
    public String getC01de() {
        return c01de;
    }

    public void setC01de(String c01de) {
        this.c01de = c01de;
        notifyPropertyChanged(BR.c01de);
    }

    @Bindable
    public String getC01ea() {
        return c01ea;
    }

    public void setC01ea(String c01ea) {
        this.c01ea = c01ea;
        notifyPropertyChanged(BR.c01ea);
    }

    @Bindable
    public String getC01eb() {
        return c01eb;
    }

    public void setC01eb(String c01eb) {
        this.c01eb = c01eb;
        notifyPropertyChanged(BR.c01eb);
    }

    @Bindable
    public String getC01ec() {
        return c01ec;
    }

    public void setC01ec(String c01ec) {
        this.c01ec = c01ec;
        notifyPropertyChanged(BR.c01ec);
    }

    @Bindable
    public String getC01ed() {
        return c01ed;
    }

    public void setC01ed(String c01ed) {
        this.c01ed = c01ed;
        notifyPropertyChanged(BR.c01ed);
    }

    @Bindable
    public String getC01ee() {
        return c01ee;
    }

    public void setC01ee(String c01ee) {
        this.c01ee = c01ee;
        notifyPropertyChanged(BR.c01ee);
    }

    @Bindable
    public String getC01fa() {
        return c01fa;
    }

    public void setC01fa(String c01fa) {
        this.c01fa = c01fa;
        notifyPropertyChanged(BR.c01fa);
    }

    @Bindable
    public String getC01fb() {
        return c01fb;
    }

    public void setC01fb(String c01fb) {
        this.c01fb = c01fb;
        notifyPropertyChanged(BR.c01fb);
    }

    @Bindable
    public String getC01fc() {
        return c01fc;
    }

    public void setC01fc(String c01fc) {
        this.c01fc = c01fc;
        notifyPropertyChanged(BR.c01fc);
    }

    @Bindable
    public String getC01fd() {
        return c01fd;
    }

    public void setC01fd(String c01fd) {
        this.c01fd = c01fd;
        notifyPropertyChanged(BR.c01fd);
    }

    @Bindable
    public String getC01fe() {
        return c01fe;
    }

    public void setC01fe(String c01fe) {
        this.c01fe = c01fe;
        notifyPropertyChanged(BR.c01fe);
    }

    @Bindable
    public String getC01ga() {
        return c01ga;
    }

    public void setC01ga(String c01ga) {
        this.c01ga = c01ga;
        notifyPropertyChanged(BR.c01ga);
    }

    @Bindable
    public String getC01gb() {
        return c01gb;
    }

    public void setC01gb(String c01gb) {
        this.c01gb = c01gb;
        notifyPropertyChanged(BR.c01gb);
    }

    @Bindable
    public String getC01gc() {
        return c01gc;
    }

    public void setC01gc(String c01gc) {
        this.c01gc = c01gc;
        notifyPropertyChanged(BR.c01gc);
    }

    @Bindable
    public String getC01gd() {
        return c01gd;
    }

    public void setC01gd(String c01gd) {
        this.c01gd = c01gd;
        notifyPropertyChanged(BR.c01gd);
    }

    @Bindable
    public String getC01ge() {
        return c01ge;
    }

    public void setC01ge(String c01ge) {
        this.c01ge = c01ge;
        notifyPropertyChanged(BR.c01ge);
    }

    @Bindable
    public String getC01ha() {
        return c01ha;
    }

    public void setC01ha(String c01ha) {
        this.c01ha = c01ha;
        notifyPropertyChanged(BR.c01ha);
    }

    @Bindable
    public String getC01hb() {
        return c01hb;
    }

    public void setC01hb(String c01hb) {
        this.c01hb = c01hb;
        notifyPropertyChanged(BR.c01hb);
    }

    @Bindable
    public String getC01hc() {
        return c01hc;
    }

    public void setC01hc(String c01hc) {
        this.c01hc = c01hc;
        notifyPropertyChanged(BR.c01hc);
    }

    @Bindable
    public String getC01hd() {
        return c01hd;
    }

    public void setC01hd(String c01hd) {
        this.c01hd = c01hd;
        notifyPropertyChanged(BR.c01hd);
    }

    @Bindable
    public String getC01he() {
        return c01he;
    }

    public void setC01he(String c01he) {
        this.c01he = c01he;
        notifyPropertyChanged(BR.c01he);
    }

    @Bindable
    public String getC01ia() {
        return c01ia;
    }

    public void setC01ia(String c01ia) {
        this.c01ia = c01ia;
        notifyPropertyChanged(BR.c01ia);
    }

    @Bindable
    public String getC01ib() {
        return c01ib;
    }

    public void setC01ib(String c01ib) {
        this.c01ib = c01ib;
        notifyPropertyChanged(BR.c01ib);
    }

    @Bindable
    public String getC01ic() {
        return c01ic;
    }

    public void setC01ic(String c01ic) {
        this.c01ic = c01ic;
        notifyPropertyChanged(BR.c01ic);
    }

    @Bindable
    public String getC01id() {
        return c01id;
    }

    public void setC01id(String c01id) {
        this.c01id = c01id;
        notifyPropertyChanged(BR.c01id);
    }

    @Bindable
    public String getC01ie() {
        return c01ie;
    }

    public void setC01ie(String c01ie) {
        this.c01ie = c01ie;
        notifyPropertyChanged(BR.c01ie);
    }

    @Bindable
    public String getC01ja() {
        return c01ja;
    }

    public void setC01ja(String c01ja) {
        this.c01ja = c01ja;
        notifyPropertyChanged(BR.c01ja);
    }

    @Bindable
    public String getC01jb() {
        return c01jb;
    }

    public void setC01jb(String c01jb) {
        this.c01jb = c01jb;
        notifyPropertyChanged(BR.c01jb);
    }

    @Bindable
    public String getC01jc() {
        return c01jc;
    }

    public void setC01jc(String c01jc) {
        this.c01jc = c01jc;
        notifyPropertyChanged(BR.c01jc);
    }

    @Bindable
    public String getC01jd() {
        return c01jd;
    }

    public void setC01jd(String c01jd) {
        this.c01jd = c01jd;
        notifyPropertyChanged(BR.c01jd);
    }

    @Bindable
    public String getC01je() {
        return c01je;
    }

    public void setC01je(String c01je) {
        this.c01je = c01je;
        notifyPropertyChanged(BR.c01je);
    }

    @Bindable
    public String getC01ka() {
        return c01ka;
    }

    public void setC01ka(String c01ka) {
        this.c01ka = c01ka;
        notifyPropertyChanged(BR.c01ka);
    }

    @Bindable
    public String getC01kb() {
        return c01kb;
    }

    public void setC01kb(String c01kb) {
        this.c01kb = c01kb;
        notifyPropertyChanged(BR.c01kb);
    }

    @Bindable
    public String getC01kc() {
        return c01kc;
    }

    public void setC01kc(String c01kc) {
        this.c01kc = c01kc;
        notifyPropertyChanged(BR.c01kc);
    }

    @Bindable
    public String getC01kd() {
        return c01kd;
    }

    public void setC01kd(String c01kd) {
        this.c01kd = c01kd;
        notifyPropertyChanged(BR.c01kd);
    }

    @Bindable
    public String getC01ke() {
        return c01ke;
    }

    public void setC01ke(String c01ke) {
        this.c01ke = c01ke;
        notifyPropertyChanged(BR.c01ke);
    }

    @Bindable
    public String getC01la() {
        return c01la;
    }

    public void setC01la(String c01la) {
        this.c01la = c01la;
        notifyPropertyChanged(BR.c01la);
    }

    @Bindable
    public String getC01lb() {
        return c01lb;
    }

    public void setC01lb(String c01lb) {
        this.c01lb = c01lb;
        notifyPropertyChanged(BR.c01lb);
    }

    @Bindable
    public String getC01lc() {
        return c01lc;
    }

    public void setC01lc(String c01lc) {
        this.c01lc = c01lc;
        notifyPropertyChanged(BR.c01lc);
    }

    @Bindable
    public String getC01ld() {
        return c01ld;
    }

    public void setC01ld(String c01ld) {
        this.c01ld = c01ld;
        notifyPropertyChanged(BR.c01ld);
    }

    @Bindable
    public String getC01le() {
        return c01le;
    }

    public void setC01le(String c01le) {
        this.c01le = c01le;
        notifyPropertyChanged(BR.c01le);
    }




    public ModuleC Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_UUID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_SYNCED_DATE));
        sC1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleCTable.COLUMN_SC1)));
        return this;
    }

    public void sC1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c01aa = json.getString("c01aa");
            this.c01ab = json.getString("c01ab");
            this.c01ac = json.getString("c01ac");
            this.c01ad = json.getString("c01ad");
            this.c01ae = json.getString("c01ae");
            this.c01ba = json.getString("c01ba");
            this.c01bb = json.getString("c01bb");
            this.c01bc = json.getString("c01bc");
            this.c01bd = json.getString("c01bd");
            this.c01be = json.getString("c01be");
            this.c01ca = json.getString("c01ca");
            this.c01cb = json.getString("c01cb");
            this.c01cc = json.getString("c01cc");
            this.c01cd = json.getString("c01cd");
            this.c01ce = json.getString("c01ce");
            this.c01da = json.getString("c01da");
            this.c01db = json.getString("c01db");
            this.c01dc = json.getString("c01dc");
            this.c01dd = json.getString("c01dd");
            this.c01de = json.getString("c01de");
            this.c01ea = json.getString("c01ea");
            this.c01eb = json.getString("c01eb");
            this.c01ec = json.getString("c01ec");
            this.c01ed = json.getString("c01ed");
            this.c01ee = json.getString("c01ee");
            this.c01fa = json.getString("c01fa");
            this.c01fb = json.getString("c01fb");
            this.c01fc = json.getString("c01fc");
            this.c01fd = json.getString("c01fd");
            this.c01fe = json.getString("c01fe");
            this.c01ga = json.getString("c01ga");
            this.c01gb = json.getString("c01gb");
            this.c01gc = json.getString("c01gc");
            this.c01gd = json.getString("c01gd");
            this.c01ge = json.getString("c01ge");
            this.c01ha = json.getString("c01ha");
            this.c01hb = json.getString("c01hb");
            this.c01hc = json.getString("c01hc");
            this.c01hd = json.getString("c01hd");
            this.c01he = json.getString("c01he");
            this.c01ia = json.getString("c01ia");
            this.c01ib = json.getString("c01ib");
            this.c01ic = json.getString("c01ic");
            this.c01id = json.getString("c01id");
            this.c01ie = json.getString("c01ie");
            this.c01ja = json.getString("c01ja");
            this.c01jb = json.getString("c01jb");
            this.c01jc = json.getString("c01jc");
            this.c01jd = json.getString("c01jd");
            this.c01je = json.getString("c01je");
            this.c01ka = json.getString("c01ka");
            this.c01kb = json.getString("c01kb");
            this.c01kc = json.getString("c01kc");
            this.c01kd = json.getString("c01kd");
            this.c01ke = json.getString("c01ke");
            this.c01la = json.getString("c01la");
            this.c01lb = json.getString("c01lb");
            this.c01lc = json.getString("c01lc");
            this.c01ld = json.getString("c01ld");
            this.c01le = json.getString("c01le");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(ModuleCTable.COLUMN_ID, this.id);
        json.put(ModuleCTable.COLUMN_UID, this.uid);
        json.put(ModuleCTable.COLUMN_UUID, this.uuid);
        json.put(ModuleCTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(ModuleCTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(ModuleCTable.COLUMN_UC_CODE, this.ucCode);
        json.put(ModuleCTable.COLUMN_HF_CODE, this.hfCode);
        json.put(ModuleCTable.COLUMN_USERNAME, this.userName);
        json.put(ModuleCTable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleCTable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleCTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleCTable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleCTable.COLUMN_SYNCED, this.synced);
        json.put(ModuleCTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleCTable.COLUMN_SC1, new JSONObject(sC1toString()));
        return json;
    }

    public String sC1toString() throws JSONException {
        Log.d(TAG, "sC1toString: ");
        JSONObject json = new JSONObject();
        json.put("c01aa", c01aa)
                .put("c01ab", c01ab)
                .put("c01ac", c01ac)
                .put("c01ad", c01ad)
                .put("c01ae", c01ae)
                .put("c01ba", c01ba)
                .put("c01bb", c01bb)
                .put("c01bc", c01bc)
                .put("c01bd", c01bd)
                .put("c01be", c01be)
                .put("c01ca", c01ca)
                .put("c01cb", c01cb)
                .put("c01cc", c01cc)
                .put("c01cd", c01cd)
                .put("c01ce", c01ce)
                .put("c01da", c01da)
                .put("c01db", c01db)
                .put("c01dc", c01dc)
                .put("c01dd", c01dd)
                .put("c01de", c01de)
                .put("c01ea", c01ea)
                .put("c01eb", c01eb)
                .put("c01ec", c01ec)
                .put("c01ed", c01ed)
                .put("c01ee", c01ee)
                .put("c01fa", c01fa)
                .put("c01fb", c01fb)
                .put("c01fc", c01fc)
                .put("c01fd", c01fd)
                .put("c01fe", c01fe)
                .put("c01ga", c01ga)
                .put("c01gb", c01gb)
                .put("c01gc", c01gc)
                .put("c01gd", c01gd)
                .put("c01ge", c01ge)
                .put("c01ha", c01ha)
                .put("c01hb", c01hb)
                .put("c01hc", c01hc)
                .put("c01hd", c01hd)
                .put("c01he", c01he)
                .put("c01ia", c01ia)
                .put("c01ib", c01ib)
                .put("c01ic", c01ic)
                .put("c01id", c01id)
                .put("c01ie", c01ie)
                .put("c01ja", c01ja)
                .put("c01jb", c01jb)
                .put("c01jc", c01jc)
                .put("c01jd", c01jd)
                .put("c01je", c01je)
                .put("c01ka", c01ka)
                .put("c01kb", c01kb)
                .put("c01kc", c01kc)
                .put("c01kd", c01kd)
                .put("c01ke", c01ke)
                .put("c01la", c01la)
                .put("c01lb", c01lb)
                .put("c01lc", c01lc)
                .put("c01ld", c01ld)
                .put("c01le", c01le);
        return json.toString();
    }


}
