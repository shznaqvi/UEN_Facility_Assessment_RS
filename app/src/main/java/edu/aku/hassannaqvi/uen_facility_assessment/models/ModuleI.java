package edu.aku.hassannaqvi.uen_facility_assessment.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_facility_assessment.BR;
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleI extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private final String wuid = StringUtils.EMPTY;
    private final String cuid = StringUtils.EMPTY;
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

    // SECTION VARIABLES
    private String sI = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String i0101 = StringUtils.EMPTY;
    private String i0102aa = StringUtils.EMPTY;
    private String i0102ab = StringUtils.EMPTY;
    private String i0102ac = StringUtils.EMPTY;
    private String i0102ba = StringUtils.EMPTY;
    private String i0102bb = StringUtils.EMPTY;
    private String i0103 = StringUtils.EMPTY;
    private String i0104 = StringUtils.EMPTY;
    private String i0105 = StringUtils.EMPTY;
    private String i0106a = StringUtils.EMPTY;
    private String i0106b = StringUtils.EMPTY;
    private String i0107 = StringUtils.EMPTY;
    private String i0108 = StringUtils.EMPTY;
    private String i0108a = StringUtils.EMPTY;
    private String i0108b = StringUtils.EMPTY;
    private String i0108c = StringUtils.EMPTY;
    private String i0108d = StringUtils.EMPTY;
    private String i0108e = StringUtils.EMPTY;
    private String i0108f = StringUtils.EMPTY;
    private String i0108g = StringUtils.EMPTY;
    private String i010896 = StringUtils.EMPTY;
    private String i010896x = StringUtils.EMPTY;
    private String i01091 = StringUtils.EMPTY;
    private String i01092 = StringUtils.EMPTY;
    private String i01093 = StringUtils.EMPTY;
    private String i01094 = StringUtils.EMPTY;
    private String i01095 = StringUtils.EMPTY;
    private String i01096 = StringUtils.EMPTY;
    private String i0110 = StringUtils.EMPTY;
    private String i0110a = StringUtils.EMPTY;
    private String i0110ax = StringUtils.EMPTY;
    private String i0110b = StringUtils.EMPTY;
    private String i0110bx = StringUtils.EMPTY;
    private String i0110c = StringUtils.EMPTY;
    private String i0110cx = StringUtils.EMPTY;
    private String i0111 = StringUtils.EMPTY;
    private String i0111a = StringUtils.EMPTY;
    private String i0111ax = StringUtils.EMPTY;
    private String i0111b = StringUtils.EMPTY;
    private String i0111bx = StringUtils.EMPTY;
    private String i0111c = StringUtils.EMPTY;
    private String i0111cx = StringUtils.EMPTY;
    private String i0112 = StringUtils.EMPTY;
    private String i0112a = StringUtils.EMPTY;
    private String i0112ax = StringUtils.EMPTY;
    private String i0112b = StringUtils.EMPTY;
    private String i0112bx = StringUtils.EMPTY;
    private String i0113 = StringUtils.EMPTY;
    private String i0114 = StringUtils.EMPTY;
    private String i0115 = StringUtils.EMPTY;
    private String i0115a = StringUtils.EMPTY;
    private String i0115ax = StringUtils.EMPTY;
    private String i0115b = StringUtils.EMPTY;
    private String i0115bx = StringUtils.EMPTY;
    private String i0115c = StringUtils.EMPTY;
    private String i0115cx = StringUtils.EMPTY;
    private String i0116 = StringUtils.EMPTY;
    private String i011696x = StringUtils.EMPTY;
    private String i0117 = StringUtils.EMPTY;


    @Bindable
    public String getI0101() {
        return i0101;
    }

    public void setI0101(String i0101) {
        this.i0101 = i0101;
        notifyPropertyChanged(BR.i0101);
    }

    @Bindable
    public String getI0102aa() {
        return i0102aa;
    }

    public void setI0102aa(String i0102aa) {
        this.i0102aa = i0102aa;
        notifyPropertyChanged(BR.i0102aa);
    }

    @Bindable
    public String getI0102ab() {
        return i0102ab;
    }

    public void setI0102ab(String i0102ab) {
        this.i0102ab = i0102ab;
        notifyPropertyChanged(BR.i0102ab);
    }

    @Bindable
    public String getI0102ac() {
        return i0102ac;
    }

    public void setI0102ac(String i0102ac) {
        this.i0102ac = i0102ac;
        notifyPropertyChanged(BR.i0102ac);
    }

    @Bindable
    public String getI0102ba() {
        return i0102ba;
    }

    public void setI0102ba(String i0102ba) {
        this.i0102ba = i0102ba;
        notifyPropertyChanged(BR.i0102ba);
    }

    @Bindable
    public String getI0102bb() {
        return i0102bb;
    }

    public void setI0102bb(String i0102bb) {
        this.i0102bb = i0102bb;
        notifyPropertyChanged(BR.i0102bb);
    }

    @Bindable
    public String getI0103() {
        return i0103;
    }

    public void setI0103(String i0103) {
        this.i0103 = i0103;
        notifyPropertyChanged(BR.i0103);
    }

    @Bindable
    public String getI0104() {
        return i0104;
    }

    public void setI0104(String i0104) {
        this.i0104 = i0104;
        notifyPropertyChanged(BR.i0104);
    }

    @Bindable
    public String getI0105() {
        return i0105;
    }

    public void setI0105(String i0105) {
        this.i0105 = i0105;
        notifyPropertyChanged(BR.i0105);
    }

    @Bindable
    public String getI0106a() {
        return i0106a;
    }

    public void setI0106a(String i0106a) {
        this.i0106a = i0106a;
        notifyPropertyChanged(BR.i0106a);
    }

    @Bindable
    public String getI0106b() {
        return i0106b;
    }

    public void setI0106b(String i0106b) {
        this.i0106b = i0106b;
        notifyPropertyChanged(BR.i0106b);
    }

    @Bindable
    public String getI0107() {
        return i0107;
    }

    public void setI0107(String i0107) {
        this.i0107 = i0107;
        notifyPropertyChanged(BR.i0107);
    }

    @Bindable
    public String getI0108() {
        return i0108;
    }

    public void setI0108(String i0108) {
        this.i0108 = i0108;
        notifyPropertyChanged(BR.i0108);
    }

    @Bindable
    public String getI0108a() {
        return i0108a;
    }

    public void setI0108a(String i0108a) {
        this.i0108a = i0108a;
        notifyPropertyChanged(BR.i0108a);
    }

    @Bindable
    public String getI0108b() {
        return i0108b;
    }

    public void setI0108b(String i0108b) {
        this.i0108b = i0108b;
        notifyPropertyChanged(BR.i0108b);
    }

    @Bindable
    public String getI0108c() {
        return i0108c;
    }

    public void setI0108c(String i0108c) {
        this.i0108c = i0108c;
        notifyPropertyChanged(BR.i0108c);
    }

    @Bindable
    public String getI0108d() {
        return i0108d;
    }

    public void setI0108d(String i0108d) {
        this.i0108d = i0108d;
        notifyPropertyChanged(BR.i0108d);
    }

    @Bindable
    public String getI0108e() {
        return i0108e;
    }

    public void setI0108e(String i0108e) {
        this.i0108e = i0108e;
        notifyPropertyChanged(BR.i0108e);
    }

    @Bindable
    public String getI0108f() {
        return i0108f;
    }

    public void setI0108f(String i0108f) {
        this.i0108f = i0108f;
        notifyPropertyChanged(BR.i0108f);
    }

    @Bindable
    public String getI0108g() {
        return i0108g;
    }

    public void setI0108g(String i0108g) {
        this.i0108g = i0108g;
        notifyPropertyChanged(BR.i0108g);
    }

    @Bindable
    public String getI010896() {
        return i010896;
    }

    public void setI010896(String i010896) {
        this.i010896 = i010896;
        notifyPropertyChanged(BR.i010896);
    }

    @Bindable
    public String getI010896x() {
        return i010896x;
    }

    public void setI010896x(String i010896x) {
        this.i010896x = i010896x;
        notifyPropertyChanged(BR.i010896x);
    }

    @Bindable
    public String getI01091() {
        return i01091;
    }

    public void setI01091(String i01091) {
        this.i01091 = i01091;
        notifyPropertyChanged(BR.i01091);
    }

    @Bindable
    public String getI01092() {
        return i01092;
    }

    public void setI01092(String i01092) {
        this.i01092 = i01092;
        notifyPropertyChanged(BR.i01092);
    }

    @Bindable
    public String getI01093() {
        return i01093;
    }

    public void setI01093(String i01093) {
        this.i01093 = i01093;
        notifyPropertyChanged(BR.i01093);
    }

    @Bindable
    public String getI01094() {
        return i01094;
    }

    public void setI01094(String i01094) {
        this.i01094 = i01094;
        notifyPropertyChanged(BR.i01094);
    }

    @Bindable
    public String getI01095() {
        return i01095;
    }

    public void setI01095(String i01095) {
        this.i01095 = i01095;
        notifyPropertyChanged(BR.i01095);
    }

    @Bindable
    public String getI01096() {
        return i01096;
    }

    public void setI01096(String i01096) {
        this.i01096 = i01096;
        notifyPropertyChanged(BR.i01096);
    }

    @Bindable
    public String getI0110() {
        return i0110;
    }

    public void setI0110(String i0110) {
        this.i0110 = i0110;
        notifyPropertyChanged(BR.i0110);
    }

    @Bindable
    public String getI0110a() {
        return i0110a;
    }

    public void setI0110a(String i0110a) {
        this.i0110a = i0110a;
        notifyPropertyChanged(BR.i0110a);
    }

    @Bindable
    public String getI0110ax() {
        return i0110ax;
    }

    public void setI0110ax(String i0110ax) {
        this.i0110ax = i0110ax;
        notifyPropertyChanged(BR.i0110ax);
    }

    @Bindable
    public String getI0110b() {
        return i0110b;
    }

    public void setI0110b(String i0110b) {
        this.i0110b = i0110b;
        notifyPropertyChanged(BR.i0110b);
    }

    @Bindable
    public String getI0110bx() {
        return i0110bx;
    }

    public void setI0110bx(String i0110bx) {
        this.i0110bx = i0110bx;
        notifyPropertyChanged(BR.i0110bx);
    }

    @Bindable
    public String getI0110c() {
        return i0110c;
    }

    public void setI0110c(String i0110c) {
        this.i0110c = i0110c;
        notifyPropertyChanged(BR.i0110c);
    }

    @Bindable
    public String getI0110cx() {
        return i0110cx;
    }

    public void setI0110cx(String i0110cx) {
        this.i0110cx = i0110cx;
        notifyPropertyChanged(BR.i0110cx);
    }

    @Bindable
    public String getI0111() {
        return i0111;
    }

    public void setI0111(String i0111) {
        this.i0111 = i0111;
        notifyPropertyChanged(BR.i0111);
    }

    @Bindable
    public String getI0111a() {
        return i0111a;
    }

    public void setI0111a(String i0111a) {
        this.i0111a = i0111a;
        notifyPropertyChanged(BR.i0111a);
    }

    @Bindable
    public String getI0111ax() {
        return i0111ax;
    }

    public void setI0111ax(String i0111ax) {
        this.i0111ax = i0111ax;
        notifyPropertyChanged(BR.i0111ax);
    }

    @Bindable
    public String getI0111b() {
        return i0111b;
    }

    public void setI0111b(String i0111b) {
        this.i0111b = i0111b;
        notifyPropertyChanged(BR.i0111b);
    }

    @Bindable
    public String getI0111bx() {
        return i0111bx;
    }

    public void setI0111bx(String i0111bx) {
        this.i0111bx = i0111bx;
        notifyPropertyChanged(BR.i0111bx);
    }

    @Bindable
    public String getI0111c() {
        return i0111c;
    }

    public void setI0111c(String i0111c) {
        this.i0111c = i0111c;
        notifyPropertyChanged(BR.i0111c);
    }

    @Bindable
    public String getI0111cx() {
        return i0111cx;
    }

    public void setI0111cx(String i0111cx) {
        this.i0111cx = i0111cx;
        notifyPropertyChanged(BR.i0111cx);
    }

    @Bindable
    public String getI0112() {
        return i0112;
    }

    public void setI0112(String i0112) {
        this.i0112 = i0112;
        notifyPropertyChanged(BR.i0112);
    }

    @Bindable
    public String getI0112a() {
        return i0112a;
    }

    public void setI0112a(String i0112a) {
        this.i0112a = i0112a;
        notifyPropertyChanged(BR.i0112a);
    }

    @Bindable
    public String getI0112ax() {
        return i0112ax;
    }

    public void setI0112ax(String i0112ax) {
        this.i0112ax = i0112ax;
        notifyPropertyChanged(BR.i0112ax);
    }

    @Bindable
    public String getI0112b() {
        return i0112b;
    }

    public void setI0112b(String i0112b) {
        this.i0112b = i0112b;
        notifyPropertyChanged(BR.i0112b);
    }

    @Bindable
    public String getI0112bx() {
        return i0112bx;
    }

    public void setI0112bx(String i0112bx) {
        this.i0112bx = i0112bx;
        notifyPropertyChanged(BR.i0112bx);
    }

    @Bindable
    public String getI0113() {
        return i0113;
    }

    public void setI0113(String i0113) {
        this.i0113 = i0113;
        notifyPropertyChanged(BR.i0113);
    }

    @Bindable
    public String getI0114() {
        return i0114;
    }

    public void setI0114(String i0114) {
        this.i0114 = i0114;
        notifyPropertyChanged(BR.i0114);
    }

    @Bindable
    public String getI0115() {
        return i0115;
    }

    public void setI0115(String i0115) {
        this.i0115 = i0115;
        notifyPropertyChanged(BR.i0115);
    }

    @Bindable
    public String getI0115a() {
        return i0115a;
    }

    public void setI0115a(String i0115a) {
        this.i0115a = i0115a;
        notifyPropertyChanged(BR.i0115a);
    }

    @Bindable
    public String getI0115ax() {
        return i0115ax;
    }

    public void setI0115ax(String i0115ax) {
        this.i0115ax = i0115ax;
        notifyPropertyChanged(BR.i0115ax);
    }

    @Bindable
    public String getI0115b() {
        return i0115b;
    }

    public void setI0115b(String i0115b) {
        this.i0115b = i0115b;
        notifyPropertyChanged(BR.i0115b);
    }

    @Bindable
    public String getI0115bx() {
        return i0115bx;
    }

    public void setI0115bx(String i0115bx) {
        this.i0115bx = i0115bx;
        notifyPropertyChanged(BR.i0115bx);
    }

    @Bindable
    public String getI0115c() {
        return i0115c;
    }

    public void setI0115c(String i0115c) {
        this.i0115c = i0115c;
        notifyPropertyChanged(BR.i0115c);
    }

    @Bindable
    public String getI0115cx() {
        return i0115cx;
    }

    public void setI0115cx(String i0115cx) {
        this.i0115cx = i0115cx;
        notifyPropertyChanged(BR.i0115cx);
    }

    @Bindable
    public String getI0116() {
        return i0116;
    }

    public void setI0116(String i0116) {
        this.i0116 = i0116;
        notifyPropertyChanged(BR.i0116);
    }

    @Bindable
    public String getI011696x() {
        return i011696x;
    }

    public void setI011696x(String i011696x) {
        this.i011696x = i011696x;
        notifyPropertyChanged(BR.i011696x);
    }

    @Bindable
    public String getI0117() {
        return i0117;
    }

    public void setI0117(String i0117) {
        this.i0117 = i0117;
        notifyPropertyChanged(BR.i0117);
    }


    public ModuleI() {
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


    /*JSON DATABASE VARIABLES*/

    public String getsI() {
        return sI;
    }

    public void setsI(String sI) {
        this.sI = sI;
    }




    public ModuleI Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
//        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_CLUSTER));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));


        sIHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SI)));

        return this;
    }


    public void sIHydrate(String string) throws JSONException {
        Log.d(TAG, "sIHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.i0101 = json.getString("i0101");
            this.i0102aa = json.getString("i0102aa");
            this.i0102ab = json.getString("i0102ab");
            this.i0102ac = json.getString("i0102ac");
            this.i0102ba = json.getString("i0102ba");
            this.i0102bb = json.getString("i0102bb");
            this.i0103 = json.getString("i0103");
            this.i0104 = json.getString("i0104");
            this.i0105 = json.getString("i0105");
            this.i0106a = json.getString("i0106a");
            this.i0106b = json.getString("i0106b");
            this.i0107 = json.getString("i0107");
            this.i0108a = json.getString("i0108a");
            this.i0108b = json.getString("i0108b");
            this.i0108c = json.getString("i0108c");
            this.i0108d = json.getString("i0108d");
            this.i0108e = json.getString("i0108e");
            this.i0108f = json.getString("i0108f");
            this.i0108g = json.getString("i0108g");
            this.i010896 = json.getString("i010896");
            this.i010896x = json.getString("i010896x");
            this.i01091 = json.getString("i01091");
            this.i01092 = json.getString("i01092");
            this.i01093 = json.getString("i01093");
            this.i01094 = json.getString("i01094");
            this.i01095 = json.getString("i01095");
            this.i01096 = json.getString("i01096");
            this.i0110a = json.getString("i0110a");
            this.i0110ax = json.getString("i0110ax");
            this.i0110b = json.getString("i0110b");
            this.i0110bx = json.getString("i0110bx");
            this.i0110c = json.getString("i0110c");
            this.i0110cx = json.getString("i0110cx");
            this.i0111a = json.getString("i0111a");
            this.i0111ax = json.getString("i0111ax");
            this.i0111b = json.getString("i0111b");
            this.i0111bx = json.getString("i0111bx");
            this.i0111c = json.getString("i0111c");
            this.i0111cx = json.getString("i0111cx");
            this.i0112a = json.getString("i0112a");
            this.i0112ax = json.getString("i0112ax");
            this.i0112b = json.getString("i0112b");
            this.i0112bx = json.getString("i0112bx");
            this.i0113 = json.getString("i0113");
            this.i0114 = json.getString("i0114");
            this.i0115a = json.getString("i0115a");
            this.i0115ax = json.getString("i0115ax");
            this.i0115b = json.getString("i0115b");
            this.i0115bx = json.getString("i0115bx");
            this.i0115c = json.getString("i0115c");
            this.i0115cx = json.getString("i0115cx");
            this.i0116 = json.getString("i0116");
            this.i011696x = json.getString("i011696x");
            this.i0117 = json.getString("i0117");
        }
    }






    public String sItoString() throws JSONException {
        Log.d(TAG, "sItoString: ");
        JSONObject json = new JSONObject();
        json.put("i0101", i0101)
                .put("i0102aa", i0102aa)
                .put("i0102ab", i0102ab)
                .put("i0102ac", i0102ac)
                .put("i0102ba", i0102ba)
                .put("i0102bb", i0102bb)
                .put("i0103", i0103)
                .put("i0104", i0104)
                .put("i0105", i0105)
                .put("i0106a", i0106a)
                .put("i0106b", i0106b)
                .put("i0107", i0107)
                .put("i0108a", i0108a)
                .put("i0108b", i0108b)
                .put("i0108c", i0108c)
                .put("i0108d", i0108d)
                .put("i0108e", i0108e)
                .put("i0108f", i0108f)
                .put("i0108g", i0108g)
                .put("i010896", i010896)
                .put("i010896x", i010896x)
                .put("i01091", i01091)
                .put("i01092", i01092)
                .put("i01093", i01093)
                .put("i01094", i01094)
                .put("i01095", i01095)
                .put("i01096", i01096)
                .put("i0110a", i0110a)
                .put("i0110ax", i0110ax)
                .put("i0110b", i0110b)
                .put("i0110bx", i0110bx)
                .put("i0110c", i0110c)
                .put("i0110cx", i0110cx)
                .put("i0111a", i0111a)
                .put("i0111ax", i0111ax)
                .put("i0111b", i0111b)
                .put("i0111bx", i0111bx)
                .put("i0111c", i0111c)
                .put("i0111cx", i0111cx)
                .put("i0112a", i0112a)
                .put("i0112ax", i0112ax)
                .put("i0112b", i0112b)
                .put("i0112bx", i0112bx)
                .put("i0113", i0113)
                .put("i0114", i0114)
                .put("i0115a", i0115a)
                .put("i0115ax", i0115ax)
                .put("i0115b", i0115b)
                .put("i0115bx", i0115bx)
                .put("i0115c", i0115c)
                .put("i0115cx", i0115cx)
                .put("i0116", i0116)
                .put("i011696x", i011696x)
                .put("i0117", i0117);
        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
//        json.put(FormsTable.COLUMN_CLUSTER, this.cluster);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);

        // Household
        json.put(FormsTable.COLUMN_SI, new JSONObject(sItoString()));
        return json;
    }


}
