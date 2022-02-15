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

public class ModuleD extends BaseObservable implements Observable {

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

    private String sD = StringUtils.EMPTY;

    // FIELD VARIABLES
    private String d0101 = StringUtils.EMPTY;
    private String d0102 = StringUtils.EMPTY;
    private String d0201 = StringUtils.EMPTY;
    private String d0202 = StringUtils.EMPTY;
    private String d0203 = StringUtils.EMPTY;
    private String d0301 = StringUtils.EMPTY;
    private String d0302 = StringUtils.EMPTY;
    private String d0303 = StringUtils.EMPTY;
    private String d0304 = StringUtils.EMPTY;
    private String d0501 = StringUtils.EMPTY;
    private String d05011 = StringUtils.EMPTY;
    private String d05012 = StringUtils.EMPTY;
    private String d0501296x = StringUtils.EMPTY;
    private String d0502a0a = StringUtils.EMPTY;
    private String d0502a0ayx = StringUtils.EMPTY;
    private String d0502a0f = StringUtils.EMPTY;
    private String d0502a0fyx = StringUtils.EMPTY;
    private String d0502b0a = StringUtils.EMPTY;
    private String d0502b0ayx = StringUtils.EMPTY;
    private String d0502b0f = StringUtils.EMPTY;
    private String d0502b0fyx = StringUtils.EMPTY;
    private String d0502c0a = StringUtils.EMPTY;
    private String d0502c0ayx = StringUtils.EMPTY;
    private String d0502c0f = StringUtils.EMPTY;
    private String d0502c0fyx = StringUtils.EMPTY;
    private String d0502d0a = StringUtils.EMPTY;
    private String d0502d0ayx = StringUtils.EMPTY;
    private String d0502d0f = StringUtils.EMPTY;
    private String d0502d0fyx = StringUtils.EMPTY;
    private String d0503a = StringUtils.EMPTY;
    private String d0503b = StringUtils.EMPTY;
    private String d0503c = StringUtils.EMPTY;
    private String d0503d = StringUtils.EMPTY;
    private String d0503e = StringUtils.EMPTY;
    private String d0503f = StringUtils.EMPTY;
    private String d0503g = StringUtils.EMPTY;
    private String d0503h = StringUtils.EMPTY;
    private String d0601a = StringUtils.EMPTY;
    private String d0601b = StringUtils.EMPTY;
    private String d0601c = StringUtils.EMPTY;
    private String d0601d = StringUtils.EMPTY;
    private String d0602 = StringUtils.EMPTY;
    private String d0603 = StringUtils.EMPTY;
    private String d0604 = StringUtils.EMPTY;
    private String d0605 = StringUtils.EMPTY;
    private String d0701 = StringUtils.EMPTY;
    private String d0701xx = StringUtils.EMPTY;
    private String d0702 = StringUtils.EMPTY;
    private String d0702xx = StringUtils.EMPTY;
    private String d0703 = StringUtils.EMPTY;
    private String d0704a = StringUtils.EMPTY;
    private String d0704b = StringUtils.EMPTY;
    private String d0704c = StringUtils.EMPTY;
    private String d0704d = StringUtils.EMPTY;
    private String d0704e = StringUtils.EMPTY;
    private String d0801a0a = StringUtils.EMPTY;
    private String d0801a0fq = StringUtils.EMPTY;
    private String d0801b0a = StringUtils.EMPTY;
    private String d0801b0fq = StringUtils.EMPTY;
    private String d0801c0a = StringUtils.EMPTY;
    private String d0801c0fq = StringUtils.EMPTY;
    private String d0801d0a = StringUtils.EMPTY;
    private String d0801d0fq = StringUtils.EMPTY;
    private String d0801e0a = StringUtils.EMPTY;
    private String d0801e0fq = StringUtils.EMPTY;
    private String d0801f0a = StringUtils.EMPTY;
    private String d0801f0fq = StringUtils.EMPTY;
    private String d0801g0a = StringUtils.EMPTY;
    private String d0801g0fq = StringUtils.EMPTY;
    private String d0801h0a = StringUtils.EMPTY;
    private String d0801h0fq = StringUtils.EMPTY;
    private String d0801i0a = StringUtils.EMPTY;
    private String d0801i0fq = StringUtils.EMPTY;
    private String d0801j0a = StringUtils.EMPTY;
    private String d0801j0fq = StringUtils.EMPTY;
    private String d0401 = StringUtils.EMPTY;
    private String d0402 = StringUtils.EMPTY;
    private String d0403 = StringUtils.EMPTY;
    private String d0404 = StringUtils.EMPTY;
    private String d0405 = StringUtils.EMPTY;
    private String d0406 = StringUtils.EMPTY;
    private String d0507 = StringUtils.EMPTY;
    private String d0608 = StringUtils.EMPTY;


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
        notifyPropertyChanged(BR.d0201);
    }

    @Bindable
    public String getD0202() {
        return d0202;
    }

    public void setD0202(String d0202) {
        this.d0202 = d0202;
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
    public String getD0801a0a() {
        return d0801a0a;
    }

    public void setD0801a0a(String d0801a0a) {
        this.d0801a0a = d0801a0a;
        notifyPropertyChanged(BR.d0801a0a);
    }

    @Bindable
    public String getD0801a0fq() {
        return d0801a0fq;
    }

    public void setD0801a0fq(String d0801a0fq) {
        this.d0801a0fq = d0801a0fq;
        notifyPropertyChanged(BR.d0801a0fq);
    }

    @Bindable
    public String getD0801b0a() {
        return d0801b0a;
    }

    public void setD0801b0a(String d0801b0a) {
        this.d0801b0a = d0801b0a;
        notifyPropertyChanged(BR.d0801b0a);
    }

    @Bindable
    public String getD0801b0fq() {
        return d0801b0fq;
    }

    public void setD0801b0fq(String d0801b0fq) {
        this.d0801b0fq = d0801b0fq;
        notifyPropertyChanged(BR.d0801b0fq);
    }

    @Bindable
    public String getD0801c0a() {
        return d0801c0a;
    }

    public void setD0801c0a(String d0801c0a) {
        this.d0801c0a = d0801c0a;
        notifyPropertyChanged(BR.d0801c0a);
    }

    @Bindable
    public String getD0801c0fq() {
        return d0801c0fq;
    }

    public void setD0801c0fq(String d0801c0fq) {
        this.d0801c0fq = d0801c0fq;
        notifyPropertyChanged(BR.d0801c0fq);
    }

    @Bindable
    public String getD0801d0a() {
        return d0801d0a;
    }

    public void setD0801d0a(String d0801d0a) {
        this.d0801d0a = d0801d0a;
        notifyPropertyChanged(BR.d0801d0a);
    }

    @Bindable
    public String getD0801d0fq() {
        return d0801d0fq;
    }

    public void setD0801d0fq(String d0801d0fq) {
        this.d0801d0fq = d0801d0fq;
        notifyPropertyChanged(BR.d0801d0fq);
    }

    @Bindable
    public String getD0801e0a() {
        return d0801e0a;
    }

    public void setD0801e0a(String d0801e0a) {
        this.d0801e0a = d0801e0a;
        notifyPropertyChanged(BR.d0801e0a);
    }

    @Bindable
    public String getD0801e0fq() {
        return d0801e0fq;
    }

    public void setD0801e0fq(String d0801e0fq) {
        this.d0801e0fq = d0801e0fq;
        notifyPropertyChanged(BR.d0801e0fq);
    }

    @Bindable
    public String getD0801f0a() {
        return d0801f0a;
    }

    public void setD0801f0a(String d0801f0a) {
        this.d0801f0a = d0801f0a;
        notifyPropertyChanged(BR.d0801f0a);
    }

    @Bindable
    public String getD0801f0fq() {
        return d0801f0fq;
    }

    public void setD0801f0fq(String d0801f0fq) {
        this.d0801f0fq = d0801f0fq;
        notifyPropertyChanged(BR.d0801f0fq);
    }

    @Bindable
    public String getD0801g0a() {
        return d0801g0a;
    }

    public void setD0801g0a(String d0801g0a) {
        this.d0801g0a = d0801g0a;
        notifyPropertyChanged(BR.d0801g0a);
    }

    @Bindable
    public String getD0801g0fq() {
        return d0801g0fq;
    }

    public void setD0801g0fq(String d0801g0fq) {
        this.d0801g0fq = d0801g0fq;
        notifyPropertyChanged(BR.d0801g0fq);
    }

    @Bindable
    public String getD0801h0a() {
        return d0801h0a;
    }

    public void setD0801h0a(String d0801h0a) {
        this.d0801h0a = d0801h0a;
        notifyPropertyChanged(BR.d0801h0a);
    }

    @Bindable
    public String getD0801h0fq() {
        return d0801h0fq;
    }

    public void setD0801h0fq(String d0801h0fq) {
        this.d0801h0fq = d0801h0fq;
        notifyPropertyChanged(BR.d0801h0fq);
    }

    @Bindable
    public String getD0801i0a() {
        return d0801i0a;
    }

    public void setD0801i0a(String d0801i0a) {
        this.d0801i0a = d0801i0a;
        notifyPropertyChanged(BR.d0801i0a);
    }

    @Bindable
    public String getD0801i0fq() {
        return d0801i0fq;
    }

    public void setD0801i0fq(String d0801i0fq) {
        this.d0801i0fq = d0801i0fq;
        notifyPropertyChanged(BR.d0801i0fq);
    }

    @Bindable
    public String getD0801j0a() {
        return d0801j0a;
    }

    public void setD0801j0a(String d0801j0a) {
        this.d0801j0a = d0801j0a;
        notifyPropertyChanged(BR.d0801j0a);
    }

    @Bindable
    public String getD0801j0fq() {
        return d0801j0fq;
    }

    public void setD0801j0fq(String d0801j0fq) {
        this.d0801j0fq = d0801j0fq;
        notifyPropertyChanged(BR.d0801j0fq);
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

    public ModuleD() {
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

    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }



    public ModuleD Hydrate(Cursor cursor) throws JSONException {
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


        sDHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SD)));

        return this;
    }


    public void sDHydrate(String string) throws JSONException {
        Log.d(TAG, "sDHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d0101 = json.getString("d0101");
            this.d0102 = json.getString("d0102");
            this.d0201 = json.getString("d0201");
            this.d0202 = json.getString("d0202");
            this.d0203 = json.getString("d0203");
            this.d0301 = json.getString("d0301");
            this.d0302 = json.getString("d0302");
            this.d0303 = json.getString("d0303");
            this.d0304 = json.getString("d0304");
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
            this.d0601a = json.getString("d0601a");
            this.d0601b = json.getString("d0601b");
            this.d0601c = json.getString("d0601c");
            this.d0601d = json.getString("d0601d");
            this.d0602 = json.getString("d0602");
            this.d0603 = json.getString("d0603");
            this.d0604 = json.getString("d0604");
            this.d0605 = json.getString("d0605");
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
            this.d0801a0a = json.getString("d0801a0a");
            this.d0801a0fq = json.getString("d0801a0fq");
            this.d0801b0a = json.getString("d0801b0a");
            this.d0801b0fq = json.getString("d0801b0fq");
            this.d0801c0a = json.getString("d0801c0a");
            this.d0801c0fq = json.getString("d0801c0fq");
            this.d0801d0a = json.getString("d0801d0a");
            this.d0801d0fq = json.getString("d0801d0fq");
            this.d0801e0a = json.getString("d0801e0a");
            this.d0801e0fq = json.getString("d0801e0fq");
            this.d0801f0a = json.getString("d0801f0a");
            this.d0801f0fq = json.getString("d0801f0fq");
            this.d0801g0a = json.getString("d0801g0a");
            this.d0801g0fq = json.getString("d0801g0fq");
            this.d0801h0a = json.getString("d0801h0a");
            this.d0801h0fq = json.getString("d0801h0fq");
            this.d0801i0a = json.getString("d0801i0a");
            this.d0801i0fq = json.getString("d0801i0fq");
            this.d0801j0a = json.getString("d0801j0a");
            this.d0801j0fq = json.getString("d0801j0fq");
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




    public String sDtoString() throws JSONException {
        Log.d(TAG, "sDtoString: ");
        JSONObject json = new JSONObject();
        json.put("d0101", d0101)
                .put("d0102", d0102)
                .put("d0201", d0201)
                .put("d0202", d0202)
                .put("d0203", d0203)
                .put("d0301", d0301)
                .put("d0302", d0302)
                .put("d0303", d0303)
                .put("d0304", d0304)
                .put("d0401", d0401)
                .put("d0402", d0402)
                .put("d0403", d0403)
                .put("d0404", d0404)
                .put("d0405", d0405)
                .put("d0406", d0406)
                .put("d0507", d0507)
                .put("d0608", d0608)
                .put("d0501", d0501)
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
                .put("d0503h", d0503h)
                .put("d0601a", d0601a)
                .put("d0601b", d0601b)
                .put("d0601c", d0601c)
                .put("d0601d", d0601d)
                .put("d0602", d0602)
                .put("d0603", d0603)
                .put("d0604", d0604)
                .put("d0605", d0605)
                .put("d0701", d0701)
                .put("d0701xx", d0701xx)
                .put("d0702", d0702)
                .put("d0702xx", d0702xx)
                .put("d0703", d0703)
                .put("d0704a", d0704a)
                .put("d0704b", d0704b)
                .put("d0704c", d0704c)
                .put("d0704d", d0704d)
                .put("d0704e", d0704e)
                .put("d0801a0a", d0801a0a)
                .put("d0801a0fq", d0801a0fq)
                .put("d0801b0a", d0801b0a)
                .put("d0801b0fq", d0801b0fq)
                .put("d0801c0a", d0801c0a)
                .put("d0801c0fq", d0801c0fq)
                .put("d0801d0a", d0801d0a)
                .put("d0801d0fq", d0801d0fq)
                .put("d0801e0a", d0801e0a)
                .put("d0801e0fq", d0801e0fq)
                .put("d0801f0a", d0801f0a)
                .put("d0801f0fq", d0801f0fq)
                .put("d0801g0a", d0801g0a)
                .put("d0801g0fq", d0801g0fq)
                .put("d0801h0a", d0801h0a)
                .put("d0801h0fq", d0801h0fq)
                .put("d0801i0a", d0801i0a)
                .put("d0801i0fq", d0801i0fq)
                .put("d0801j0a", d0801j0a)
                .put("d0801j0fq", d0801j0fq);
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
        json.put(FormsTable.COLUMN_SD, new JSONObject(sDtoString()));

        return json;
    }


}
