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
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.ModuleGTable;
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp;

public class ModuleG extends BaseObservable implements Observable {

    private final String TAG = "ModuleG";
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
    private String g0101 = _EMPTY_;
    private String g0101xx = _EMPTY_;
    private String g0102a = _EMPTY_;
    private String g0102b = _EMPTY_;
    private String g0103 = _EMPTY_;
    private String g0103xx = _EMPTY_;
    private String g0104 = _EMPTY_;
    private String g0105 = _EMPTY_;
    private String g0105ax = _EMPTY_;
    private String g0105bx = _EMPTY_;
    private String g0105cx = _EMPTY_;
    private String g0106 = _EMPTY_;
    private String g0106xx = _EMPTY_;
    private String g0107 = _EMPTY_;
    private String g0107xx = _EMPTY_;
    private String g0108a = _EMPTY_;
    private String g0108b = _EMPTY_;
    private String g0108c = _EMPTY_;
    private String g0109 = _EMPTY_;
    private String g0110 = _EMPTY_;
    private String g0110ax = _EMPTY_;
    private String g0110bx = _EMPTY_;
    private String g0110cx = _EMPTY_;
    private String g0111 = _EMPTY_;
    private String g01112 = _EMPTY_;
    private String g01112xx = _EMPTY_;
    private String g01113 = _EMPTY_;
    private String g01114 = _EMPTY_;
    private String g01115 = _EMPTY_;
    private String g01116 = _EMPTY_;
    private String g01117 = _EMPTY_;
    private String g0201 = _EMPTY_;
    private String g0202 = _EMPTY_;
    private String g0203 = _EMPTY_;
    private String g0203x = _EMPTY_;
    private String g0204 = _EMPTY_;
    private String g0205 = _EMPTY_;
    private String g0206 = _EMPTY_;
    private String g0207 = _EMPTY_;
    private String g0208a = _EMPTY_;
    private String g0208b = _EMPTY_;
    private String g0208c = _EMPTY_;
    private String g0208d = _EMPTY_;
    private String g0208e = _EMPTY_;
    private String g0301aa = _EMPTY_;
    private String g0301ab = _EMPTY_;
    private String g0301ba = _EMPTY_;
    private String g0301bb = _EMPTY_;
    private String g0301ca = _EMPTY_;
    private String g0301cb = _EMPTY_;
    private String g0302a10r = _EMPTY_;
    private String g0302a10i = _EMPTY_;
    private String g0302a10d = _EMPTY_;
    private String g0302a10b = _EMPTY_;
    private String g0302a20r = _EMPTY_;
    private String g0302a20i = _EMPTY_;
    private String g0302a20d = _EMPTY_;
    private String g0302a20b = _EMPTY_;
    private String g0302a30r = _EMPTY_;
    private String g0302a30i = _EMPTY_;
    private String g0302a30d = _EMPTY_;
    private String g0302a30b = _EMPTY_;
    private String g0302a40r = _EMPTY_;
    private String g0302a40i = _EMPTY_;
    private String g0302a40d = _EMPTY_;
    private String g0302a40b = _EMPTY_;
    private String g0302a50r = _EMPTY_;
    private String g0302a50i = _EMPTY_;
    private String g0302a50d = _EMPTY_;
    private String g0302a50b = _EMPTY_;
    private String g0302a60r = _EMPTY_;
    private String g0302a60i = _EMPTY_;
    private String g0302a60d = _EMPTY_;
    private String g0302a60b = _EMPTY_;
    private String g0302a70r = _EMPTY_;
    private String g0302a70i = _EMPTY_;
    private String g0302a70d = _EMPTY_;
    private String g0302a70b = _EMPTY_;
    private String g0302b10r = _EMPTY_;
    private String g0302b10i = _EMPTY_;
    private String g0302b10d = _EMPTY_;
    private String g0302b10b = _EMPTY_;
    private String g0302b20r = _EMPTY_;
    private String g0302b20i = _EMPTY_;
    private String g0302b20d = _EMPTY_;
    private String g0302b20b = _EMPTY_;
    private String g0302b30r = _EMPTY_;
    private String g0302b30i = _EMPTY_;
    private String g0302b30d = _EMPTY_;
    private String g0302b30b = _EMPTY_;
    private String g0302b40r = _EMPTY_;
    private String g0302b40i = _EMPTY_;
    private String g0302b40d = _EMPTY_;
    private String g0302b40b = _EMPTY_;
    private String g0302b50r = _EMPTY_;
    private String g0302b50i = _EMPTY_;
    private String g0302b50d = _EMPTY_;
    private String g0302b50b = _EMPTY_;
    private String g0302b60r = _EMPTY_;
    private String g0302b60i = _EMPTY_;
    private String g0302b60d = _EMPTY_;
    private String g0302b60b = _EMPTY_;
    private String g0302b70r = _EMPTY_;
    private String g0302b70i = _EMPTY_;
    private String g0302b70d = _EMPTY_;
    private String g0302b70b = _EMPTY_;
    private String g0302c10r = _EMPTY_;
    private String g0302c10i = _EMPTY_;
    private String g0302c10d = _EMPTY_;
    private String g0302c10b = _EMPTY_;
    private String g0302c20r = _EMPTY_;
    private String g0302c20i = _EMPTY_;
    private String g0302c20d = _EMPTY_;
    private String g0302c20b = _EMPTY_;
    private String g0302c30r = _EMPTY_;
    private String g0302c30i = _EMPTY_;
    private String g0302c30d = _EMPTY_;
    private String g0302c30b = _EMPTY_;
    private String g0302c40r = _EMPTY_;
    private String g0302c40i = _EMPTY_;
    private String g0302c40d = _EMPTY_;
    private String g0302c40b = _EMPTY_;
    private String g0302c50r = _EMPTY_;
    private String g0302c50i = _EMPTY_;
    private String g0302c50d = _EMPTY_;
    private String g0302c50b = _EMPTY_;
    private String g0302c60r = _EMPTY_;
    private String g0302c60i = _EMPTY_;
    private String g0302c60d = _EMPTY_;
    private String g0302c60b = _EMPTY_;
    private String g0302c70r = _EMPTY_;
    private String g0302c70i = _EMPTY_;
    private String g0302c70d = _EMPTY_;
    private String g0302c70b = _EMPTY_;
    private String g4101a = _EMPTY_;
    private String g4101b = _EMPTY_;
    private String g4101cd = _EMPTY_;
    private String g4101cm = _EMPTY_;
    private String g4101d = _EMPTY_;
    private String g4102a = _EMPTY_;
    private String g4102b = _EMPTY_;
    private String g4102cd = _EMPTY_;
    private String g4102cm = _EMPTY_;
    private String g4102d = _EMPTY_;
    private String g4103 = _EMPTY_;
    private String g4104a = _EMPTY_;
    private String g4104b = _EMPTY_;
    private String g4104cd = _EMPTY_;
    private String g4104cm = _EMPTY_;
    private String g4104d = _EMPTY_;
    private String g4105a = _EMPTY_;
    private String g4105b = _EMPTY_;
    private String g4105cd = _EMPTY_;
    private String g4105cm = _EMPTY_;
    private String g4105d = _EMPTY_;
    private String g4106a = _EMPTY_;
    private String g4106b = _EMPTY_;
    private String g4106cd = _EMPTY_;
    private String g4106cm = _EMPTY_;
    private String g4106d = _EMPTY_;
    private String g4107a = _EMPTY_;
    private String g4107b = _EMPTY_;
    private String g4107cd = _EMPTY_;
    private String g4107cm = _EMPTY_;
    private String g4107d = _EMPTY_;
    private String g4108a = _EMPTY_;
    private String g4108b = _EMPTY_;
    private String g4108cd = _EMPTY_;
    private String g4108cm = _EMPTY_;
    private String g4108d = _EMPTY_;
    private String g4109a = _EMPTY_;
    private String g4109b = _EMPTY_;
    private String g4109cd = _EMPTY_;
    private String g4109cm = _EMPTY_;
    private String g4109d = _EMPTY_;
    private String g4110a = _EMPTY_;
    private String g4110b = _EMPTY_;
    private String g4110cd = _EMPTY_;
    private String g4110cm = _EMPTY_;
    private String g4110d = _EMPTY_;
    private String g4111a = _EMPTY_;
    private String g4111b = _EMPTY_;
    private String g4111cd = _EMPTY_;
    private String g4111cm = _EMPTY_;
    private String g4111d = _EMPTY_;
    private String g4112a = _EMPTY_;
    private String g4112b = _EMPTY_;
    private String g4112cd = _EMPTY_;
    private String g4112cm = _EMPTY_;
    private String g4112d = _EMPTY_;
    private String g4113a = _EMPTY_;
    private String g4113b = _EMPTY_;
    private String g4113cd = _EMPTY_;
    private String g4113cm = _EMPTY_;
    private String g4113d = _EMPTY_;
    private String g4114a = _EMPTY_;
    private String g4114b = _EMPTY_;
    private String g4114cd = _EMPTY_;
    private String g4114cm = _EMPTY_;
    private String g4114d = _EMPTY_;
    private String g4115a = _EMPTY_;
    private String g4115b = _EMPTY_;
    private String g4115cd = _EMPTY_;
    private String g4115cm = _EMPTY_;
    private String g4115d = _EMPTY_;
    private String g4116a = _EMPTY_;
    private String g4116b = _EMPTY_;
    private String g4116cd = _EMPTY_;
    private String g4116cm = _EMPTY_;
    private String g4116d = _EMPTY_;
    private String g4117a = _EMPTY_;
    private String g4117b = _EMPTY_;
    private String g4117cd = _EMPTY_;
    private String g4117cm = _EMPTY_;
    private String g4117d = _EMPTY_;
    private String g4118a = _EMPTY_;
    private String g4118b = _EMPTY_;
    private String g4118cd = _EMPTY_;
    private String g4118cm = _EMPTY_;
    private String g4118d = _EMPTY_;
    private String g4119a = _EMPTY_;
    private String g4119b = _EMPTY_;
    private String g4119cd = _EMPTY_;
    private String g4119cm = _EMPTY_;
    private String g4119d = _EMPTY_;
    private String g4120a = _EMPTY_;
    private String g4120b = _EMPTY_;
    private String g4120cd = _EMPTY_;
    private String g4120cm = _EMPTY_;
    private String g4120d = _EMPTY_;
    private String g4121a = _EMPTY_;
    private String g4121b = _EMPTY_;
    private String g4121cd = _EMPTY_;
    private String g4121cm = _EMPTY_;
    private String g4121d = _EMPTY_;
    private String g4122a = _EMPTY_;
    private String g4122b = _EMPTY_;
    private String g4122cd = _EMPTY_;
    private String g4122cm = _EMPTY_;
    private String g4122d = _EMPTY_;
    private String g4123a = _EMPTY_;
    private String g4123b = _EMPTY_;
    private String g4123cd = _EMPTY_;
    private String g4123cm = _EMPTY_;
    private String g4123d = _EMPTY_;
    private String g4124a = _EMPTY_;
    private String g4124b = _EMPTY_;
    private String g4124cd = _EMPTY_;
    private String g4124cm = _EMPTY_;
    private String g4124d = _EMPTY_;
    private String g4125a = _EMPTY_;
    private String g4125b = _EMPTY_;
    private String g4125cd = _EMPTY_;
    private String g4125cm = _EMPTY_;
    private String g4125d = _EMPTY_;
    private String g4126a = _EMPTY_;
    private String g4126b = _EMPTY_;
    private String g4126cd = _EMPTY_;
    private String g4126cm = _EMPTY_;
    private String g4126d = _EMPTY_;
    private String g4127a = _EMPTY_;
    private String g4127b = _EMPTY_;
    private String g4127cd = _EMPTY_;
    private String g4127cm = _EMPTY_;
    private String g4127d = _EMPTY_;
    private String g4128a = _EMPTY_;
    private String g4128b = _EMPTY_;
    private String g4128cd = _EMPTY_;
    private String g4128cm = _EMPTY_;
    private String g4128d = _EMPTY_;
    private String g4129a = _EMPTY_;
    private String g4129b = _EMPTY_;
    private String g4129cd = _EMPTY_;
    private String g4129cm = _EMPTY_;
    private String g4129d = _EMPTY_;
    private String g4130a = _EMPTY_;
    private String g4130b = _EMPTY_;
    private String g4130cd = _EMPTY_;
    private String g4130cm = _EMPTY_;
    private String g4130d = _EMPTY_;
    private String g4131a = _EMPTY_;
    private String g4131b = _EMPTY_;
    private String g4131cd = _EMPTY_;
    private String g4131cm = _EMPTY_;
    private String g4131d = _EMPTY_;
    private String g4132a = _EMPTY_;
    private String g4132b = _EMPTY_;
    private String g4132cd = _EMPTY_;
    private String g4132cm = _EMPTY_;
    private String g4132d = _EMPTY_;
    private String g4133a = _EMPTY_;
    private String g4133b = _EMPTY_;
    private String g4133cd = _EMPTY_;
    private String g4133cm = _EMPTY_;
    private String g4133d = _EMPTY_;
    private String g4134a = _EMPTY_;
    private String g4134b = _EMPTY_;
    private String g4134cd = _EMPTY_;
    private String g4134cm = _EMPTY_;
    private String g4134d = _EMPTY_;
    private String g4135a = _EMPTY_;
    private String g4135b = _EMPTY_;
    private String g4135cd = _EMPTY_;
    private String g4135cm = _EMPTY_;
    private String g4135d = _EMPTY_;
    private String g4136a = _EMPTY_;
    private String g4136b = _EMPTY_;
    private String g4136cd = _EMPTY_;
    private String g4136cm = _EMPTY_;
    private String g4136d = _EMPTY_;
    private String g4137a = _EMPTY_;
    private String g4137b = _EMPTY_;
    private String g4137cd = _EMPTY_;
    private String g4137cm = _EMPTY_;
    private String g4137d = _EMPTY_;
    private String g4138a = _EMPTY_;
    private String g4138b = _EMPTY_;
    private String g4138cd = _EMPTY_;
    private String g4138cm = _EMPTY_;
    private String g4138d = _EMPTY_;
    private String g4139a = _EMPTY_;
    private String g4139b = _EMPTY_;
    private String g4139cd = _EMPTY_;
    private String g4139cm = _EMPTY_;
    private String g4139d = _EMPTY_;
    private String g4140a = _EMPTY_;
    private String g4140b = _EMPTY_;
    private String g4140cd = _EMPTY_;
    private String g4140cm = _EMPTY_;
    private String g4140d = _EMPTY_;
    private String g4141a = _EMPTY_;
    private String g4141b = _EMPTY_;
    private String g4141cd = _EMPTY_;
    private String g4141cm = _EMPTY_;
    private String g4141d = _EMPTY_;
    private String g4142a = _EMPTY_;
    private String g4142b = _EMPTY_;
    private String g4142cd = _EMPTY_;
    private String g4142cm = _EMPTY_;
    private String g4142d = _EMPTY_;
    private String g4143a = _EMPTY_;
    private String g4143b = _EMPTY_;
    private String g4143cd = _EMPTY_;
    private String g4143cm = _EMPTY_;
    private String g4143d = _EMPTY_;
    private String g4144a = _EMPTY_;
    private String g4144b = _EMPTY_;
    private String g4144cd = _EMPTY_;
    private String g4144cm = _EMPTY_;
    private String g4144d = _EMPTY_;
    private String g4201a = _EMPTY_;
    private String g4201b = _EMPTY_;
    private String g4201cd = _EMPTY_;
    private String g4201cm = _EMPTY_;
    private String g4201d = _EMPTY_;
    private String g4202a = _EMPTY_;
    private String g4202b = _EMPTY_;
    private String g4202cd = _EMPTY_;
    private String g4202cm = _EMPTY_;
    private String g4202d = _EMPTY_;
    private String g4203a = _EMPTY_;
    private String g4203b = _EMPTY_;
    private String g4203cd = _EMPTY_;
    private String g4203cm = _EMPTY_;
    private String g4203d = _EMPTY_;
    private String g4204a = _EMPTY_;
    private String g4204b = _EMPTY_;
    private String g4204cd = _EMPTY_;
    private String g4204cm = _EMPTY_;
    private String g4204d = _EMPTY_;
    private String g4205a = _EMPTY_;
    private String g4205b = _EMPTY_;
    private String g4205cd = _EMPTY_;
    private String g4205cm = _EMPTY_;
    private String g4205d = _EMPTY_;
    private String g4206a = _EMPTY_;
    private String g4206b = _EMPTY_;
    private String g4206cd = _EMPTY_;
    private String g4206cm = _EMPTY_;
    private String g4206d = _EMPTY_;
    private String g4207a = _EMPTY_;
    private String g4207b = _EMPTY_;
    private String g4207cd = _EMPTY_;
    private String g4207cm = _EMPTY_;
    private String g4207d = _EMPTY_;
    private String g4208a = _EMPTY_;
    private String g4208b = _EMPTY_;
    private String g4208cd = _EMPTY_;
    private String g4208cm = _EMPTY_;
    private String g4208d = _EMPTY_;
    private String g4209a = _EMPTY_;
    private String g4209b = _EMPTY_;
    private String g4209cd = _EMPTY_;
    private String g4209cm = _EMPTY_;
    private String g4209d = _EMPTY_;
    private String g4210a = _EMPTY_;
    private String g4210b = _EMPTY_;
    private String g4210cd = _EMPTY_;
    private String g4210cm = _EMPTY_;
    private String g4210d = _EMPTY_;
    private String g4301a = _EMPTY_;
    private String g4301b = _EMPTY_;
    private String g4301cd = _EMPTY_;
    private String g4301cm = _EMPTY_;
    private String g4301d = _EMPTY_;
    private String g4302a = _EMPTY_;
    private String g4302b = _EMPTY_;
    private String g4302cd = _EMPTY_;
    private String g4302cm = _EMPTY_;
    private String g4302d = _EMPTY_;
    private String g4303a = _EMPTY_;
    private String g4303b = _EMPTY_;
    private String g4303cd = _EMPTY_;
    private String g4303cm = _EMPTY_;
    private String g4303d = _EMPTY_;
    private String g4304a = _EMPTY_;
    private String g4304b = _EMPTY_;
    private String g4304cd = _EMPTY_;
    private String g4304cm = _EMPTY_;
    private String g4304d = _EMPTY_;
    private String g4305a = _EMPTY_;
    private String g4305b = _EMPTY_;
    private String g4305cd = _EMPTY_;
    private String g4305cm = _EMPTY_;
    private String g4305d = _EMPTY_;
    private String g4306a = _EMPTY_;
    private String g4306b = _EMPTY_;
    private String g4306cd = _EMPTY_;
    private String g4306cm = _EMPTY_;
    private String g4306d = _EMPTY_;
    private String g4307a = _EMPTY_;
    private String g4307b = _EMPTY_;
    private String g4307cd = _EMPTY_;
    private String g4307cm = _EMPTY_;
    private String g4307d = _EMPTY_;
    private String g4308a = _EMPTY_;
    private String g4308b = _EMPTY_;
    private String g4308cd = _EMPTY_;
    private String g4308cm = _EMPTY_;
    private String g4308d = _EMPTY_;
    private String g4309a = _EMPTY_;
    private String g4309b = _EMPTY_;
    private String g4309cd = _EMPTY_;
    private String g4309cm = _EMPTY_;
    private String g4309d = _EMPTY_;
    private String g4310a = _EMPTY_;
    private String g4310b = _EMPTY_;
    private String g4310cd = _EMPTY_;
    private String g4310cm = _EMPTY_;
    private String g4310d = _EMPTY_;
    private String g4311a = _EMPTY_;
    private String g4311b = _EMPTY_;
    private String g4311cd = _EMPTY_;
    private String g4311cm = _EMPTY_;
    private String g4311d = _EMPTY_;
    private String g4312a = _EMPTY_;
    private String g4312b = _EMPTY_;
    private String g4312cd = _EMPTY_;
    private String g4312cm = _EMPTY_;
    private String g4312d = _EMPTY_;
    private String g4313a = _EMPTY_;
    private String g4313b = _EMPTY_;
    private String g4313cd = _EMPTY_;
    private String g4313cm = _EMPTY_;
    private String g4313d = _EMPTY_;
    private String g4314a = _EMPTY_;
    private String g4314b = _EMPTY_;
    private String g4314cd = _EMPTY_;
    private String g4314cm = _EMPTY_;
    private String g4314d = _EMPTY_;
    private String g4315a = _EMPTY_;
    private String g4315b = _EMPTY_;
    private String g4315cd = _EMPTY_;
    private String g4315cm = _EMPTY_;
    private String g4315d = _EMPTY_;
    private String g4316a = _EMPTY_;
    private String g4316b = _EMPTY_;
    private String g4316cd = _EMPTY_;
    private String g4316cm = _EMPTY_;
    private String g4316d = _EMPTY_;
    private String g4317a = _EMPTY_;
    private String g4317b = _EMPTY_;
    private String g4317cd = _EMPTY_;
    private String g4317cm = _EMPTY_;
    private String g4317d = _EMPTY_;
    private String g4318a = _EMPTY_;
    private String g4318b = _EMPTY_;
    private String g4318cd = _EMPTY_;
    private String g4318cm = _EMPTY_;
    private String g4318d = _EMPTY_;
    private String g4319a = _EMPTY_;
    private String g4319b = _EMPTY_;
    private String g4319cd = _EMPTY_;
    private String g4319cm = _EMPTY_;
    private String g4319d = _EMPTY_;
    private String g4320a = _EMPTY_;
    private String g4320b = _EMPTY_;
    private String g4320cd = _EMPTY_;
    private String g4320cm = _EMPTY_;
    private String g4320d = _EMPTY_;
    private String g4321a = _EMPTY_;
    private String g4321b = _EMPTY_;
    private String g4321cd = _EMPTY_;
    private String g4321cm = _EMPTY_;
    private String g4321d = _EMPTY_;
    private String g4322a = _EMPTY_;
    private String g4322b = _EMPTY_;
    private String g4322cd = _EMPTY_;
    private String g4322cm = _EMPTY_;
    private String g4322d = _EMPTY_;
    private String g4323a = _EMPTY_;
    private String g4323b = _EMPTY_;
    private String g4323cd = _EMPTY_;
    private String g4323cm = _EMPTY_;
    private String g4323d = _EMPTY_;
    private String g4324a = _EMPTY_;
    private String g4324b = _EMPTY_;
    private String g4324cd = _EMPTY_;
    private String g4324cm = _EMPTY_;
    private String g4324d = _EMPTY_;
    private String g4325a = _EMPTY_;
    private String g4325b = _EMPTY_;
    private String g4325cd = _EMPTY_;
    private String g4325cm = _EMPTY_;
    private String g4325d = _EMPTY_;
    private String g4326a = _EMPTY_;
    private String g4326b = _EMPTY_;
    private String g4326cd = _EMPTY_;
    private String g4326cm = _EMPTY_;
    private String g4326d = _EMPTY_;
    private String g4327a = _EMPTY_;
    private String g4327b = _EMPTY_;
    private String g4327cd = _EMPTY_;
    private String g4327cm = _EMPTY_;
    private String g4327d = _EMPTY_;
    private String g4401a = _EMPTY_;
    private String g4401b = _EMPTY_;
    private String g4401cd = _EMPTY_;
    private String g4401cm = _EMPTY_;
    private String g4401d = _EMPTY_;
    private String g4402a = _EMPTY_;
    private String g4402b = _EMPTY_;
    private String g4402cd = _EMPTY_;
    private String g4402cm = _EMPTY_;
    private String g4402d = _EMPTY_;
    private String g4403a = _EMPTY_;
    private String g4403b = _EMPTY_;
    private String g4403cd = _EMPTY_;
    private String g4403cm = _EMPTY_;
    private String g4403d = _EMPTY_;
    private String g4404a = _EMPTY_;
    private String g4404b = _EMPTY_;
    private String g4404cd = _EMPTY_;
    private String g4404cm = _EMPTY_;
    private String g4404d = _EMPTY_;
    private String g4405a = _EMPTY_;
    private String g4405b = _EMPTY_;
    private String g4405cd = _EMPTY_;
    private String g4405cm = _EMPTY_;
    private String g4405d = _EMPTY_;
    private String g4406a = _EMPTY_;
    private String g4406b = _EMPTY_;
    private String g4406cd = _EMPTY_;
    private String g4406cm = _EMPTY_;
    private String g4406d = _EMPTY_;


    public ModuleG() {
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
    public String getG0101() {
        return g0101;
    }

    public void setG0101(String g0101) {
        this.g0101 = g0101;
        setG0101xx(g0101.equals("96") ? this.g0101xx : "");
        notifyPropertyChanged(BR.g0101);
    }

    @Bindable
    public String getG0101xx() {
        return g0101xx;
    }

    public void setG0101xx(String g0101xx) {
        this.g0101xx = g0101xx;
        notifyPropertyChanged(BR.g0101xx);
    }

    @Bindable
    public String getG0102a() {
        return g0102a;
    }

    public void setG0102a(String g0102a) {
        this.g0102a = g0102a;

        notifyPropertyChanged(BR.g0102a);
    }

    @Bindable
    public String getG0102b() {
        return g0102b;
    }

    public void setG0102b(String g0102b) {
        this.g0102b = g0102b;
        notifyPropertyChanged(BR.g0102b);
    }

    @Bindable
    public String getG0103() {
        return g0103;
    }

    public void setG0103(String g0103) {
        this.g0103 = g0103;
        setG0103xx(g0103.equals("96") ? this.g0103xx : "");
        notifyPropertyChanged(BR.g0103);
    }

    @Bindable
    public String getG0103xx() {
        return g0103xx;
    }

    public void setG0103xx(String g0103xx) {
        this.g0103xx = g0103xx;
        notifyPropertyChanged(BR.g0103xx);
    }

    @Bindable
    public String getG0104() {
        return g0104;
    }

    public void setG0104(String g0104) {
        this.g0104 = g0104;
        notifyPropertyChanged(BR.g0104);
    }

    @Bindable
    public String getG0105() {
        return g0105;
    }

    public void setG0105(String g0105) {
        this.g0105 = g0105;
        setG0105ax(g0105.equals("1") ? this.g0105ax : "");
        setG0105bx(g0105.equals("2") ? this.g0105bx : "");
        setG0105cx(g0105.equals("3") ? this.g0105cx : "");
        notifyPropertyChanged(BR.g0105);
    }

    @Bindable
    public String getG0105ax() {
        return g0105ax;
    }

    public void setG0105ax(String g0105ax) {
        this.g0105ax = g0105ax;
        notifyPropertyChanged(BR.g0105ax);
    }

    @Bindable
    public String getG0105bx() {
        return g0105bx;
    }

    public void setG0105bx(String g0105bx) {
        this.g0105bx = g0105bx;
        notifyPropertyChanged(BR.g0105bx);
    }

    @Bindable
    public String getG0105cx() {
        return g0105cx;
    }

    public void setG0105cx(String g0105cx) {
        this.g0105cx = g0105cx;
        notifyPropertyChanged(BR.g0105cx);
    }

    @Bindable
    public String getG0106() {
        return g0106;
    }

    public void setG0106(String g0106) {
        this.g0106 = g0106;
        setG0106xx(g0106.equals("96") ? this.g0106xx : "");
        notifyPropertyChanged(BR.g0106);
    }

    @Bindable
    public String getG0106xx() {
        return g0106xx;
    }

    public void setG0106xx(String g0106xx) {
        this.g0106xx = g0106xx;
        notifyPropertyChanged(BR.g0106xx);
    }

    @Bindable
    public String getG0107() {
        return g0107;
    }

    public void setG0107(String g0107) {
        this.g0107 = g0107;
        setG0107xx(g0107.equals("96") ? this.g0107xx : "");
        notifyPropertyChanged(BR.g0107);
    }

    @Bindable
    public String getG0107xx() {
        return g0107xx;
    }

    public void setG0107xx(String g0107xx) {
        this.g0107xx = g0107xx;
        notifyPropertyChanged(BR.g0107xx);
    }

    @Bindable
    public String getG0108a() {
        return g0108a;
    }

    public void setG0108a(String g0108a) {
        this.g0108a = g0108a;
        notifyPropertyChanged(BR.g0108a);
    }

    @Bindable
    public String getG0108b() {
        return g0108b;
    }

    public void setG0108b(String g0108b) {
        this.g0108b = g0108b;
        notifyPropertyChanged(BR.g0108b);
    }

    @Bindable
    public String getG0108c() {
        return g0108c;
    }

    public void setG0108c(String g0108c) {
        this.g0108c = g0108c;
        notifyPropertyChanged(BR.g0108c);
    }

    @Bindable
    public String getG0109() {
        return g0109;
    }

    public void setG0109(String g0109) {
        this.g0109 = g0109;
        notifyPropertyChanged(BR.g0109);
    }

    @Bindable
    public String getG0110() {
        return g0110;
    }

    public void setG0110(String g0110) {
        this.g0110 = g0110;
        setG0110ax(g0110.equals("1") ? this.g0110ax : "");
        setG0110bx(g0110.equals("2") ? this.g0110bx : "");
        setG0110cx(g0110.equals("1") ? this.g0110cx : "");
        notifyPropertyChanged(BR.g0110);
    }

    @Bindable
    public String getG0110ax() {
        return g0110ax;
    }

    public void setG0110ax(String g0110ax) {
        this.g0110ax = g0110ax;
        notifyPropertyChanged(BR.g0110ax);
    }

    @Bindable
    public String getG0110bx() {
        return g0110bx;
    }

    public void setG0110bx(String g0110bx) {
        this.g0110bx = g0110bx;
        notifyPropertyChanged(BR.g0110bx);
    }

    @Bindable
    public String getG0110cx() {
        return g0110cx;
    }

    public void setG0110cx(String g0110cx) {
        this.g0110cx = g0110cx;
        notifyPropertyChanged(BR.g0110cx);
    }

    @Bindable
    public String getG0111() {
        return g0111;
    }

    public void setG0111(String g0111) {
        this.g0111 = g0111;
        notifyPropertyChanged(BR.g0111);
    }

    @Bindable
    public String getG01112() {
        return g01112;
    }

    public void setG01112(String g01112) {
        this.g01112 = g01112;
        setG01112xx(g01112.equals("96") ? this.g01112xx : "");
        notifyPropertyChanged(BR.g01112);
    }

    @Bindable
    public String getG01112xx() {
        return g01112xx;
    }

    public void setG01112xx(String g01112xx) {
        this.g01112xx = g01112xx;
        notifyPropertyChanged(BR.g01112xx);
    }

    @Bindable
    public String getG01113() {
        return g01113;
    }

    public void setG01113(String g01113) {
        this.g01113 = g01113;
        notifyPropertyChanged(BR.g01113);
    }

    @Bindable
    public String getG01114() {
        return g01114;
    }

    public void setG01114(String g01114) {
        this.g01114 = g01114;
        notifyPropertyChanged(BR.g01114);
    }

    @Bindable
    public String getG01115() {
        return g01115;
    }

    public void setG01115(String g01115) {
        this.g01115 = g01115;
        notifyPropertyChanged(BR.g01115);
    }

    @Bindable
    public String getG01116() {
        return g01116;
    }

    public void setG01116(String g01116) {
        this.g01116 = g01116;
        notifyPropertyChanged(BR.g01116);
    }

    @Bindable
    public String getG01117() {
        return g01117;
    }

    public void setG01117(String g01117) {
        this.g01117 = g01117;
        notifyPropertyChanged(BR.g01117);
    }

    @Bindable
    public String getG0201() {
        return g0201;
    }

    public void setG0201(String g0201) {
        this.g0201 = g0201;
        notifyPropertyChanged(BR.g0201);
    }

    @Bindable
    public String getG0202() {
        return g0202;
    }

    public void setG0202(String g0202) {
        this.g0202 = g0202;
        notifyPropertyChanged(BR.g0202);
    }

    @Bindable
    public String getG0203() {
        return g0203;
    }

    public void setG0203(String g0203) {
        this.g0203 = g0203;
        setG0203x(g0203.equals("1") ? this.g0203x : "");
        notifyPropertyChanged(BR.g0203);
    }

    @Bindable
    public String getG0203x() {
        return g0203x;
    }

    public void setG0203x(String g0203x) {
        this.g0203x = g0203x;
        notifyPropertyChanged(BR.g0203x);
    }

    @Bindable
    public String getG0204() {
        return g0204;
    }

    public void setG0204(String g0204) {
        this.g0204 = g0204;
        notifyPropertyChanged(BR.g0204);
    }

    @Bindable
    public String getG0205() {
        return g0205;
    }

    public void setG0205(String g0205) {
        this.g0205 = g0205;
        notifyPropertyChanged(BR.g0205);
    }

    @Bindable
    public String getG0206() {
        return g0206;
    }

    public void setG0206(String g0206) {
        this.g0206 = g0206;
        notifyPropertyChanged(BR.g0206);
    }

    @Bindable
    public String getG0207() {
        return g0207;
    }

    public void setG0207(String g0207) {
        this.g0207 = g0207;
        notifyPropertyChanged(BR.g0207);
    }

    @Bindable
    public String getG0208a() {
        return g0208a;
    }

    public void setG0208a(String g0208a) {
        if (this.g0208a.equals(g0208a)) return;
        this.g0208a = g0208a;
        notifyPropertyChanged(BR.g0208a);
    }

    @Bindable
    public String getG0208b() {
        return g0208b;
    }

    public void setG0208b(String g0208b) {
        if (this.g0208b.equals(g0208b)) return;
        this.g0208b = g0208b;
        notifyPropertyChanged(BR.g0208b);
    }

    @Bindable
    public String getG0208c() {
        return g0208c;
    }

    public void setG0208c(String g0208c) {
        if (this.g0208c.equals(g0208c)) return;
        this.g0208c = g0208c;
        notifyPropertyChanged(BR.g0208c);
    }

    @Bindable
    public String getG0208d() {
        return g0208d;
    }

    public void setG0208d(String g0208d) {
        if (this.g0208d.equals(g0208d)) return;
        this.g0208d = g0208d;
        notifyPropertyChanged(BR.g0208d);
    }

    @Bindable
    public String getG0208e() {
        return g0208e;
    }

    public void setG0208e(String g0208e) {
        if (this.g0208e.equals(g0208e)) return;
        this.g0208e = g0208e;
        notifyPropertyChanged(BR.g0208e);
    }

    @Bindable
    public String getG0301aa() {
        return g0301aa;
    }

    public void setG0301aa(String g0301aa) {
        this.g0301aa = g0301aa;
        notifyPropertyChanged(BR.g0301aa);
    }

    @Bindable
    public String getG0301ab() {
        return g0301ab;
    }

    public void setG0301ab(String g0301ab) {
        this.g0301ab = g0301ab;
        notifyPropertyChanged(BR.g0301ab);
    }

    @Bindable
    public String getG0301ba() {
        return g0301ba;
    }

    public void setG0301ba(String g0301ba) {
        this.g0301ba = g0301ba;
        notifyPropertyChanged(BR.g0301ba);
    }

    @Bindable
    public String getG0301bb() {
        return g0301bb;
    }

    public void setG0301bb(String g0301bb) {
        this.g0301bb = g0301bb;
        notifyPropertyChanged(BR.g0301bb);
    }

    @Bindable
    public String getG0301ca() {
        return g0301ca;
    }

    public void setG0301ca(String g0301ca) {
        this.g0301ca = g0301ca;
        notifyPropertyChanged(BR.g0301ca);
    }

    @Bindable
    public String getG0301cb() {
        return g0301cb;
    }

    public void setG0301cb(String g0301cb) {
        this.g0301cb = g0301cb;
        notifyPropertyChanged(BR.g0301cb);
    }

    @Bindable
    public String getG0302a10r() {
        return g0302a10r;
    }

    public void setG0302a10r(String g0302a10r) {
        this.g0302a10r = g0302a10r;
        notifyPropertyChanged(BR.g0302a10r);
    }

    @Bindable
    public String getG0302a10i() {
        return g0302a10i;
    }

    public void setG0302a10i(String g0302a10i) {
        this.g0302a10i = g0302a10i;
        notifyPropertyChanged(BR.g0302a10i);
    }

    @Bindable
    public String getG0302a10d() {
        return g0302a10d;
    }

    public void setG0302a10d(String g0302a10d) {
        this.g0302a10d = g0302a10d;
        notifyPropertyChanged(BR.g0302a10d);
    }

    @Bindable
    public String getG0302a10b() {
        return g0302a10b;
    }

    public void setG0302a10b(String g0302a10b) {
        this.g0302a10b = g0302a10b;
        notifyPropertyChanged(BR.g0302a10b);
    }

    @Bindable
    public String getG0302a20r() {
        return g0302a20r;
    }

    public void setG0302a20r(String g0302a20r) {
        this.g0302a20r = g0302a20r;
        notifyPropertyChanged(BR.g0302a20r);
    }

    @Bindable
    public String getG0302a20i() {
        return g0302a20i;
    }

    public void setG0302a20i(String g0302a20i) {
        this.g0302a20i = g0302a20i;
        notifyPropertyChanged(BR.g0302a20i);
    }

    @Bindable
    public String getG0302a20d() {
        return g0302a20d;
    }

    public void setG0302a20d(String g0302a20d) {
        this.g0302a20d = g0302a20d;
        notifyPropertyChanged(BR.g0302a20d);
    }

    @Bindable
    public String getG0302a20b() {
        return g0302a20b;
    }

    public void setG0302a20b(String g0302a20b) {
        this.g0302a20b = g0302a20b;
        notifyPropertyChanged(BR.g0302a20b);
    }

    @Bindable
    public String getG0302a30r() {
        return g0302a30r;
    }

    public void setG0302a30r(String g0302a30r) {
        this.g0302a30r = g0302a30r;
        notifyPropertyChanged(BR.g0302a30r);
    }

    @Bindable
    public String getG0302a30i() {
        return g0302a30i;
    }

    public void setG0302a30i(String g0302a30i) {
        this.g0302a30i = g0302a30i;
        notifyPropertyChanged(BR.g0302a30i);
    }

    @Bindable
    public String getG0302a30d() {
        return g0302a30d;
    }

    public void setG0302a30d(String g0302a30d) {
        this.g0302a30d = g0302a30d;
        notifyPropertyChanged(BR.g0302a30d);
    }

    @Bindable
    public String getG0302a30b() {
        return g0302a30b;
    }

    public void setG0302a30b(String g0302a30b) {
        this.g0302a30b = g0302a30b;
        notifyPropertyChanged(BR.g0302a30b);
    }

    @Bindable
    public String getG0302a40r() {
        return g0302a40r;
    }

    public void setG0302a40r(String g0302a40r) {
        this.g0302a40r = g0302a40r;
        notifyPropertyChanged(BR.g0302a40r);
    }

    @Bindable
    public String getG0302a40i() {
        return g0302a40i;
    }

    public void setG0302a40i(String g0302a40i) {
        this.g0302a40i = g0302a40i;
        notifyPropertyChanged(BR.g0302a40i);
    }

    @Bindable
    public String getG0302a40d() {
        return g0302a40d;
    }

    public void setG0302a40d(String g0302a40d) {
        this.g0302a40d = g0302a40d;
        notifyPropertyChanged(BR.g0302a40d);
    }

    @Bindable
    public String getG0302a40b() {
        return g0302a40b;
    }

    public void setG0302a40b(String g0302a40b) {
        this.g0302a40b = g0302a40b;
        notifyPropertyChanged(BR.g0302a40b);
    }

    @Bindable
    public String getG0302a50r() {
        return g0302a50r;
    }

    public void setG0302a50r(String g0302a50r) {
        this.g0302a50r = g0302a50r;
        notifyPropertyChanged(BR.g0302a50r);
    }

    @Bindable
    public String getG0302a50i() {
        return g0302a50i;
    }

    public void setG0302a50i(String g0302a50i) {
        this.g0302a50i = g0302a50i;
        notifyPropertyChanged(BR.g0302a50i);
    }

    @Bindable
    public String getG0302a50d() {
        return g0302a50d;
    }

    public void setG0302a50d(String g0302a50d) {
        this.g0302a50d = g0302a50d;
        notifyPropertyChanged(BR.g0302a50d);
    }

    @Bindable
    public String getG0302a50b() {
        return g0302a50b;
    }

    public void setG0302a50b(String g0302a50b) {
        this.g0302a50b = g0302a50b;
        notifyPropertyChanged(BR.g0302a50b);
    }

    @Bindable
    public String getG0302a60r() {
        return g0302a60r;
    }

    public void setG0302a60r(String g0302a60r) {
        this.g0302a60r = g0302a60r;
        notifyPropertyChanged(BR.g0302a60r);
    }

    @Bindable
    public String getG0302a60i() {
        return g0302a60i;
    }

    public void setG0302a60i(String g0302a60i) {
        this.g0302a60i = g0302a60i;
        notifyPropertyChanged(BR.g0302a60i);
    }

    @Bindable
    public String getG0302a60d() {
        return g0302a60d;
    }

    public void setG0302a60d(String g0302a60d) {
        this.g0302a60d = g0302a60d;
        notifyPropertyChanged(BR.g0302a60d);
    }

    @Bindable
    public String getG0302a60b() {
        return g0302a60b;
    }

    public void setG0302a60b(String g0302a60b) {
        this.g0302a60b = g0302a60b;
        notifyPropertyChanged(BR.g0302a60b);
    }

    @Bindable
    public String getG0302a70r() {
        return g0302a70r;
    }

    public void setG0302a70r(String g0302a70r) {
        this.g0302a70r = g0302a70r;
        notifyPropertyChanged(BR.g0302a70r);
    }

    @Bindable
    public String getG0302a70i() {
        return g0302a70i;
    }

    public void setG0302a70i(String g0302a70i) {
        this.g0302a70i = g0302a70i;
        notifyPropertyChanged(BR.g0302a70i);
    }

    @Bindable
    public String getG0302a70d() {
        return g0302a70d;
    }

    public void setG0302a70d(String g0302a70d) {
        this.g0302a70d = g0302a70d;
        notifyPropertyChanged(BR.g0302a70d);
    }

    @Bindable
    public String getG0302a70b() {
        return g0302a70b;
    }

    public void setG0302a70b(String g0302a70b) {
        this.g0302a70b = g0302a70b;
        notifyPropertyChanged(BR.g0302a70b);
    }

    @Bindable
    public String getG0302b10r() {
        return g0302b10r;
    }

    public void setG0302b10r(String g0302b10r) {
        this.g0302b10r = g0302b10r;
        notifyPropertyChanged(BR.g0302b10r);
    }

    @Bindable
    public String getG0302b10i() {
        return g0302b10i;
    }

    public void setG0302b10i(String g0302b10i) {
        this.g0302b10i = g0302b10i;
        notifyPropertyChanged(BR.g0302b10i);
    }

    @Bindable
    public String getG0302b10d() {
        return g0302b10d;
    }

    public void setG0302b10d(String g0302b10d) {
        this.g0302b10d = g0302b10d;
        notifyPropertyChanged(BR.g0302b10d);
    }

    @Bindable
    public String getG0302b10b() {
        return g0302b10b;
    }

    public void setG0302b10b(String g0302b10b) {
        this.g0302b10b = g0302b10b;
        notifyPropertyChanged(BR.g0302b10b);
    }

    @Bindable
    public String getG0302b20r() {
        return g0302b20r;
    }

    public void setG0302b20r(String g0302b20r) {
        this.g0302b20r = g0302b20r;
        notifyPropertyChanged(BR.g0302b20r);
    }

    @Bindable
    public String getG0302b20i() {
        return g0302b20i;
    }

    public void setG0302b20i(String g0302b20i) {
        this.g0302b20i = g0302b20i;
        notifyPropertyChanged(BR.g0302b20i);
    }

    @Bindable
    public String getG0302b20d() {
        return g0302b20d;
    }

    public void setG0302b20d(String g0302b20d) {
        this.g0302b20d = g0302b20d;
        notifyPropertyChanged(BR.g0302b20d);
    }

    @Bindable
    public String getG0302b20b() {
        return g0302b20b;
    }

    public void setG0302b20b(String g0302b20b) {
        this.g0302b20b = g0302b20b;
        notifyPropertyChanged(BR.g0302b20b);
    }

    @Bindable
    public String getG0302b30r() {
        return g0302b30r;
    }

    public void setG0302b30r(String g0302b30r) {
        this.g0302b30r = g0302b30r;
        notifyPropertyChanged(BR.g0302b30r);
    }

    @Bindable
    public String getG0302b30i() {
        return g0302b30i;
    }

    public void setG0302b30i(String g0302b30i) {
        this.g0302b30i = g0302b30i;
        notifyPropertyChanged(BR.g0302b30i);
    }

    @Bindable
    public String getG0302b30d() {
        return g0302b30d;
    }

    public void setG0302b30d(String g0302b30d) {
        this.g0302b30d = g0302b30d;
        notifyPropertyChanged(BR.g0302b30d);
    }

    @Bindable
    public String getG0302b30b() {
        return g0302b30b;
    }

    public void setG0302b30b(String g0302b30b) {
        this.g0302b30b = g0302b30b;
        notifyPropertyChanged(BR.g0302b30b);
    }

    @Bindable
    public String getG0302b40r() {
        return g0302b40r;
    }

    public void setG0302b40r(String g0302b40r) {
        this.g0302b40r = g0302b40r;
        notifyPropertyChanged(BR.g0302b40r);
    }

    @Bindable
    public String getG0302b40i() {
        return g0302b40i;
    }

    public void setG0302b40i(String g0302b40i) {
        this.g0302b40i = g0302b40i;
        notifyPropertyChanged(BR.g0302b40i);
    }

    @Bindable
    public String getG0302b40d() {
        return g0302b40d;
    }

    public void setG0302b40d(String g0302b40d) {
        this.g0302b40d = g0302b40d;
        notifyPropertyChanged(BR.g0302b40d);
    }

    @Bindable
    public String getG0302b40b() {
        return g0302b40b;
    }

    public void setG0302b40b(String g0302b40b) {
        this.g0302b40b = g0302b40b;
        notifyPropertyChanged(BR.g0302b40b);
    }

    @Bindable
    public String getG0302b50r() {
        return g0302b50r;
    }

    public void setG0302b50r(String g0302b50r) {
        this.g0302b50r = g0302b50r;
        notifyPropertyChanged(BR.g0302b50r);
    }

    @Bindable
    public String getG0302b50i() {
        return g0302b50i;
    }

    public void setG0302b50i(String g0302b50i) {
        this.g0302b50i = g0302b50i;
        notifyPropertyChanged(BR.g0302b50i);
    }

    @Bindable
    public String getG0302b50d() {
        return g0302b50d;
    }

    public void setG0302b50d(String g0302b50d) {
        this.g0302b50d = g0302b50d;
        notifyPropertyChanged(BR.g0302b50d);
    }

    @Bindable
    public String getG0302b50b() {
        return g0302b50b;
    }

    public void setG0302b50b(String g0302b50b) {
        this.g0302b50b = g0302b50b;
        notifyPropertyChanged(BR.g0302b50b);
    }

    @Bindable
    public String getG0302b60r() {
        return g0302b60r;
    }

    public void setG0302b60r(String g0302b60r) {
        this.g0302b60r = g0302b60r;
        notifyPropertyChanged(BR.g0302b60r);
    }

    @Bindable
    public String getG0302b60i() {
        return g0302b60i;
    }

    public void setG0302b60i(String g0302b60i) {
        this.g0302b60i = g0302b60i;
        notifyPropertyChanged(BR.g0302b60i);
    }

    @Bindable
    public String getG0302b60d() {
        return g0302b60d;
    }

    public void setG0302b60d(String g0302b60d) {
        this.g0302b60d = g0302b60d;
        notifyPropertyChanged(BR.g0302b60d);
    }

    @Bindable
    public String getG0302b60b() {
        return g0302b60b;
    }

    public void setG0302b60b(String g0302b60b) {
        this.g0302b60b = g0302b60b;
        notifyPropertyChanged(BR.g0302b60b);
    }

    @Bindable
    public String getG0302b70r() {
        return g0302b70r;
    }

    public void setG0302b70r(String g0302b70r) {
        this.g0302b70r = g0302b70r;
        notifyPropertyChanged(BR.g0302b70r);
    }

    @Bindable
    public String getG0302b70i() {
        return g0302b70i;
    }

    public void setG0302b70i(String g0302b70i) {
        this.g0302b70i = g0302b70i;
        notifyPropertyChanged(BR.g0302b70i);
    }

    @Bindable
    public String getG0302b70d() {
        return g0302b70d;
    }

    public void setG0302b70d(String g0302b70d) {
        this.g0302b70d = g0302b70d;
        notifyPropertyChanged(BR.g0302b70d);
    }

    @Bindable
    public String getG0302b70b() {
        return g0302b70b;
    }

    public void setG0302b70b(String g0302b70b) {
        this.g0302b70b = g0302b70b;
        notifyPropertyChanged(BR.g0302b70b);
    }

    @Bindable
    public String getG0302c10r() {
        return g0302c10r;
    }

    public void setG0302c10r(String g0302c10r) {
        this.g0302c10r = g0302c10r;
        notifyPropertyChanged(BR.g0302c10r);
    }

    @Bindable
    public String getG0302c10i() {
        return g0302c10i;
    }

    public void setG0302c10i(String g0302c10i) {
        this.g0302c10i = g0302c10i;
        notifyPropertyChanged(BR.g0302c10i);
    }

    @Bindable
    public String getG0302c10d() {
        return g0302c10d;
    }

    public void setG0302c10d(String g0302c10d) {
        this.g0302c10d = g0302c10d;
        notifyPropertyChanged(BR.g0302c10d);
    }

    @Bindable
    public String getG0302c10b() {
        return g0302c10b;
    }

    public void setG0302c10b(String g0302c10b) {
        this.g0302c10b = g0302c10b;
        notifyPropertyChanged(BR.g0302c10b);
    }

    @Bindable
    public String getG0302c20r() {
        return g0302c20r;
    }

    public void setG0302c20r(String g0302c20r) {
        this.g0302c20r = g0302c20r;
        notifyPropertyChanged(BR.g0302c20r);
    }

    @Bindable
    public String getG0302c20i() {
        return g0302c20i;
    }

    public void setG0302c20i(String g0302c20i) {
        this.g0302c20i = g0302c20i;
        notifyPropertyChanged(BR.g0302c20i);
    }

    @Bindable
    public String getG0302c20d() {
        return g0302c20d;
    }

    public void setG0302c20d(String g0302c20d) {
        this.g0302c20d = g0302c20d;
        notifyPropertyChanged(BR.g0302c20d);
    }

    @Bindable
    public String getG0302c20b() {
        return g0302c20b;
    }

    public void setG0302c20b(String g0302c20b) {
        this.g0302c20b = g0302c20b;
        notifyPropertyChanged(BR.g0302c20b);
    }

    @Bindable
    public String getG0302c30r() {
        return g0302c30r;
    }

    public void setG0302c30r(String g0302c30r) {
        this.g0302c30r = g0302c30r;
        notifyPropertyChanged(BR.g0302c30r);
    }

    @Bindable
    public String getG0302c30i() {
        return g0302c30i;
    }

    public void setG0302c30i(String g0302c30i) {
        this.g0302c30i = g0302c30i;
        notifyPropertyChanged(BR.g0302c30i);
    }

    @Bindable
    public String getG0302c30d() {
        return g0302c30d;
    }

    public void setG0302c30d(String g0302c30d) {
        this.g0302c30d = g0302c30d;
        notifyPropertyChanged(BR.g0302c30d);
    }

    @Bindable
    public String getG0302c30b() {
        return g0302c30b;
    }

    public void setG0302c30b(String g0302c30b) {
        this.g0302c30b = g0302c30b;
        notifyPropertyChanged(BR.g0302c30b);
    }

    @Bindable
    public String getG0302c40r() {
        return g0302c40r;
    }

    public void setG0302c40r(String g0302c40r) {
        this.g0302c40r = g0302c40r;
        notifyPropertyChanged(BR.g0302c40r);
    }

    @Bindable
    public String getG0302c40i() {
        return g0302c40i;
    }

    public void setG0302c40i(String g0302c40i) {
        this.g0302c40i = g0302c40i;
        notifyPropertyChanged(BR.g0302c40i);
    }

    @Bindable
    public String getG0302c40d() {
        return g0302c40d;
    }

    public void setG0302c40d(String g0302c40d) {
        this.g0302c40d = g0302c40d;
        notifyPropertyChanged(BR.g0302c40d);
    }

    @Bindable
    public String getG0302c40b() {
        return g0302c40b;
    }

    public void setG0302c40b(String g0302c40b) {
        this.g0302c40b = g0302c40b;
        notifyPropertyChanged(BR.g0302c40b);
    }

    @Bindable
    public String getG0302c50r() {
        return g0302c50r;
    }

    public void setG0302c50r(String g0302c50r) {
        this.g0302c50r = g0302c50r;
        notifyPropertyChanged(BR.g0302c50r);
    }

    @Bindable
    public String getG0302c50i() {
        return g0302c50i;
    }

    public void setG0302c50i(String g0302c50i) {
        this.g0302c50i = g0302c50i;
        notifyPropertyChanged(BR.g0302c50i);
    }

    @Bindable
    public String getG0302c50d() {
        return g0302c50d;
    }

    public void setG0302c50d(String g0302c50d) {
        this.g0302c50d = g0302c50d;
        notifyPropertyChanged(BR.g0302c50d);
    }

    @Bindable
    public String getG0302c50b() {
        return g0302c50b;
    }

    public void setG0302c50b(String g0302c50b) {
        this.g0302c50b = g0302c50b;
        notifyPropertyChanged(BR.g0302c50b);
    }

    @Bindable
    public String getG0302c60r() {
        return g0302c60r;
    }

    public void setG0302c60r(String g0302c60r) {
        this.g0302c60r = g0302c60r;
        notifyPropertyChanged(BR.g0302c60r);
    }

    @Bindable
    public String getG0302c60i() {
        return g0302c60i;
    }

    public void setG0302c60i(String g0302c60i) {
        this.g0302c60i = g0302c60i;
        notifyPropertyChanged(BR.g0302c60i);
    }

    @Bindable
    public String getG0302c60d() {
        return g0302c60d;
    }

    public void setG0302c60d(String g0302c60d) {
        this.g0302c60d = g0302c60d;
        notifyPropertyChanged(BR.g0302c60d);
    }

    @Bindable
    public String getG0302c60b() {
        return g0302c60b;
    }

    public void setG0302c60b(String g0302c60b) {
        this.g0302c60b = g0302c60b;
        notifyPropertyChanged(BR.g0302c60b);
    }

    @Bindable
    public String getG0302c70r() {
        return g0302c70r;
    }

    public void setG0302c70r(String g0302c70r) {
        this.g0302c70r = g0302c70r;
        notifyPropertyChanged(BR.g0302c70r);
    }

    @Bindable
    public String getG0302c70i() {
        return g0302c70i;
    }

    public void setG0302c70i(String g0302c70i) {
        this.g0302c70i = g0302c70i;
        notifyPropertyChanged(BR.g0302c70i);
    }

    @Bindable
    public String getG0302c70d() {
        return g0302c70d;
    }

    public void setG0302c70d(String g0302c70d) {
        this.g0302c70d = g0302c70d;
        notifyPropertyChanged(BR.g0302c70d);
    }

    @Bindable
    public String getG0302c70b() {
        return g0302c70b;
    }

    public void setG0302c70b(String g0302c70b) {
        this.g0302c70b = g0302c70b;
        notifyPropertyChanged(BR.g0302c70b);
    }


    @Bindable
    public String getG4101a() {
        return g4101a;
    }

    public void setG4101a(String g4101a) {
        this.g4101a = g4101a;
        notifyPropertyChanged(BR.g4101a);
    }

    @Bindable
    public String getG4101b() {
        return g4101b;
    }

    public void setG4101b(String g4101b) {
        this.g4101b = g4101b;
        setG4101cd(g4101b.equals("1") ? this.g4101cd : "");
        setG4101cm(g4101b.equals("1") ? this.g4101cm : "");
        notifyPropertyChanged(BR.g4101b);
    }

    @Bindable
    public String getG4101cd() {
        return g4101cd;
    }

    public void setG4101cd(String g4101cd) {
        this.g4101cd = g4101cd;
        notifyPropertyChanged(BR.g4101cd);
    }

    @Bindable
    public String getG4101cm() {
        return g4101cm;
    }

    public void setG4101cm(String g4101cm) {
        this.g4101cm = g4101cm;
        notifyPropertyChanged(BR.g4101cm);
    }

    @Bindable
    public String getG4101d() {
        return g4101d;
    }

    public void setG4101d(String g4101d) {
        this.g4101d = g4101d;
        notifyPropertyChanged(BR.g4101d);
    }


    @Bindable
    public String getG4102a() {
        return g4102a;
    }

    public void setG4102a(String g4102a) {
        this.g4102a = g4102a;
        notifyPropertyChanged(BR.g4102a);
    }

    @Bindable
    public String getG4102b() {
        return g4102b;
    }

    public void setG4102b(String g4102b) {
        this.g4102b = g4102b;
        setG4102cd(g4102b.equals("1") ? this.g4102cd : "");
        setG4102cm(g4102b.equals("1") ? this.g4102cm : "");
        notifyPropertyChanged(BR.g4102b);
    }

    @Bindable
    public String getG4102cd() {
        return g4102cd;
    }

    public void setG4102cd(String g4102cd) {
        this.g4102cd = g4102cd;
        notifyPropertyChanged(BR.g4102cd);
    }

    @Bindable
    public String getG4102cm() {
        return g4102cm;
    }

    public void setG4102cm(String g4102cm) {
        this.g4102cm = g4102cm;
        notifyPropertyChanged(BR.g4102cm);
    }

    @Bindable
    public String getG4102d() {
        return g4102d;
    }

    public void setG4102d(String g4102d) {
        this.g4102d = g4102d;
        notifyPropertyChanged(BR.g4102d);
    }

    @Bindable
    public String getG4103() {
        return g4103;
    }

    public void setG4103(String g4103) {
        this.g4103 = g4103;
        notifyPropertyChanged(BR.g4103);
    }


    @Bindable
    public String getG4104a() {
        return g4104a;
    }

    public void setG4104a(String g4104a) {
        this.g4104a = g4104a;
        notifyPropertyChanged(BR.g4104a);
    }

    @Bindable
    public String getG4104b() {
        return g4104b;
    }

    public void setG4104b(String g4104b) {
        this.g4104b = g4104b;
        setG4104cd(g4104b.equals("1") ? this.g4104cd : "");
        setG4104cm(g4104b.equals("1") ? this.g4104cm : "");
        notifyPropertyChanged(BR.g4104b);
    }

    @Bindable
    public String getG4104cd() {
        return g4104cd;
    }

    public void setG4104cd(String g4104cd) {
        this.g4104cd = g4104cd;
        notifyPropertyChanged(BR.g4104cd);
    }

    @Bindable
    public String getG4104cm() {
        return g4104cm;
    }

    public void setG4104cm(String g4104cm) {
        this.g4104cm = g4104cm;
        notifyPropertyChanged(BR.g4104cm);
    }

    @Bindable
    public String getG4104d() {
        return g4104d;
    }

    public void setG4104d(String g4104d) {
        this.g4104d = g4104d;
        notifyPropertyChanged(BR.g4104d);
    }


    @Bindable
    public String getG4105a() {
        return g4105a;
    }

    public void setG4105a(String g4105a) {
        this.g4105a = g4105a;
        notifyPropertyChanged(BR.g4105a);
    }

    @Bindable
    public String getG4105b() {
        return g4105b;
    }

    public void setG4105b(String g4105b) {
        this.g4105b = g4105b;
        setG4105cd(g4105b.equals("1") ? this.g4105cd : "");
        setG4105cm(g4105b.equals("1") ? this.g4105cm : "");
        notifyPropertyChanged(BR.g4105b);
    }

    @Bindable
    public String getG4105cd() {
        return g4105cd;
    }

    public void setG4105cd(String g4105cd) {
        this.g4105cd = g4105cd;
        notifyPropertyChanged(BR.g4105cd);
    }

    @Bindable
    public String getG4105cm() {
        return g4105cm;
    }

    public void setG4105cm(String g4105cm) {
        this.g4105cm = g4105cm;
        notifyPropertyChanged(BR.g4105cm);
    }

    @Bindable
    public String getG4105d() {
        return g4105d;
    }

    public void setG4105d(String g4105d) {
        this.g4105d = g4105d;
        notifyPropertyChanged(BR.g4105d);
    }


    @Bindable
    public String getG4106a() {
        return g4106a;
    }

    public void setG4106a(String g4106a) {
        this.g4106a = g4106a;
        notifyPropertyChanged(BR.g4106a);
    }

    @Bindable
    public String getG4106b() {
        return g4106b;
    }

    public void setG4106b(String g4106b) {
        this.g4106b = g4106b;
        setG4106cd(g4106b.equals("1") ? this.g4106cd : "");
        setG4106cm(g4106b.equals("1") ? this.g4106cm : "");
        notifyPropertyChanged(BR.g4106b);
    }

    @Bindable
    public String getG4106cd() {
        return g4106cd;
    }

    public void setG4106cd(String g4106cd) {
        this.g4106cd = g4106cd;
        notifyPropertyChanged(BR.g4106cd);
    }

    @Bindable
    public String getG4106cm() {
        return g4106cm;
    }

    public void setG4106cm(String g4106cm) {
        this.g4106cm = g4106cm;
        notifyPropertyChanged(BR.g4106cm);
    }

    @Bindable
    public String getG4106d() {
        return g4106d;
    }

    public void setG4106d(String g4106d) {
        this.g4106d = g4106d;
        notifyPropertyChanged(BR.g4106d);
    }


    @Bindable
    public String getG4107a() {
        return g4107a;
    }

    public void setG4107a(String g4107a) {
        this.g4107a = g4107a;
        notifyPropertyChanged(BR.g4107a);
    }

    @Bindable
    public String getG4107b() {
        return g4107b;
    }

    public void setG4107b(String g4107b) {
        this.g4107b = g4107b;
        setG4107cd(g4107b.equals("1") ? this.g4107cd : "");
        setG4107cm(g4107b.equals("1") ? this.g4107cm : "");
        notifyPropertyChanged(BR.g4107b);
    }

    @Bindable
    public String getG4107cd() {
        return g4107cd;
    }

    public void setG4107cd(String g4107cd) {
        this.g4107cd = g4107cd;
        notifyPropertyChanged(BR.g4107cd);
    }

    @Bindable
    public String getG4107cm() {
        return g4107cm;
    }

    public void setG4107cm(String g4107cm) {
        this.g4107cm = g4107cm;
        notifyPropertyChanged(BR.g4107cm);
    }

    @Bindable
    public String getG4107d() {
        return g4107d;
    }

    public void setG4107d(String g4107d) {
        this.g4107d = g4107d;
        notifyPropertyChanged(BR.g4107d);
    }


    @Bindable
    public String getG4108a() {
        return g4108a;
    }

    public void setG4108a(String g4108a) {
        this.g4108a = g4108a;
        notifyPropertyChanged(BR.g4108a);
    }

    @Bindable
    public String getG4108b() {
        return g4108b;
    }

    public void setG4108b(String g4108b) {
        this.g4108b = g4108b;
        setG4108cd(g4108b.equals("1") ? this.g4108cd : "");
        setG4108cm(g4108b.equals("1") ? this.g4108cm : "");
        notifyPropertyChanged(BR.g4108b);
    }

    @Bindable
    public String getG4108cd() {
        return g4108cd;
    }

    public void setG4108cd(String g4108cd) {
        this.g4108cd = g4108cd;
        notifyPropertyChanged(BR.g4108cd);
    }

    @Bindable
    public String getG4108cm() {
        return g4108cm;
    }

    public void setG4108cm(String g4108cm) {
        this.g4108cm = g4108cm;
        notifyPropertyChanged(BR.g4108cm);
    }

    @Bindable
    public String getG4108d() {
        return g4108d;
    }

    public void setG4108d(String g4108d) {
        this.g4108d = g4108d;
        notifyPropertyChanged(BR.g4108d);
    }


    @Bindable
    public String getG4109a() {
        return g4109a;
    }

    public void setG4109a(String g4109a) {
        this.g4109a = g4109a;
        notifyPropertyChanged(BR.g4109a);
    }

    @Bindable
    public String getG4109b() {
        return g4109b;
    }

    public void setG4109b(String g4109b) {
        this.g4109b = g4109b;
        setG4109cd(g4109b.equals("1") ? this.g4109cd : "");
        setG4109cm(g4109b.equals("1") ? this.g4109cm : "");
        notifyPropertyChanged(BR.g4109b);
    }

    @Bindable
    public String getG4109cd() {
        return g4109cd;
    }

    public void setG4109cd(String g4109cd) {
        this.g4109cd = g4109cd;
        notifyPropertyChanged(BR.g4109cd);
    }

    @Bindable
    public String getG4109cm() {
        return g4109cm;
    }

    public void setG4109cm(String g4109cm) {
        this.g4109cm = g4109cm;
        notifyPropertyChanged(BR.g4109cm);
    }

    @Bindable
    public String getG4109d() {
        return g4109d;
    }

    public void setG4109d(String g4109d) {
        this.g4109d = g4109d;
        notifyPropertyChanged(BR.g4109d);
    }


    @Bindable
    public String getG4110a() {
        return g4110a;
    }

    public void setG4110a(String g4110a) {
        this.g4110a = g4110a;
        notifyPropertyChanged(BR.g4110a);
    }

    @Bindable
    public String getG4110b() {
        return g4110b;
    }

    public void setG4110b(String g4110b) {
        this.g4110b = g4110b;
        setG4110cd(g4110b.equals("1") ? this.g4110cd : "");
        setG4110cm(g4110b.equals("1") ? this.g4110cm : "");
        notifyPropertyChanged(BR.g4110b);
    }

    @Bindable
    public String getG4110cd() {
        return g4110cd;
    }

    public void setG4110cd(String g4110cd) {
        this.g4110cd = g4110cd;
        notifyPropertyChanged(BR.g4110cd);
    }

    @Bindable
    public String getG4110cm() {
        return g4110cm;
    }

    public void setG4110cm(String g4110cm) {
        this.g4110cm = g4110cm;
        notifyPropertyChanged(BR.g4110cm);
    }

    @Bindable
    public String getG4110d() {
        return g4110d;
    }

    public void setG4110d(String g4110d) {
        this.g4110d = g4110d;
        notifyPropertyChanged(BR.g4110d);
    }


    @Bindable
    public String getG4111a() {
        return g4111a;
    }

    public void setG4111a(String g4111a) {
        this.g4111a = g4111a;
        notifyPropertyChanged(BR.g4111a);
    }

    @Bindable
    public String getG4111b() {
        return g4111b;
    }

    public void setG4111b(String g4111b) {
        this.g4111b = g4111b;
        setG4111cd(g4111b.equals("1") ? this.g4111cd : "");
        setG4111cm(g4111b.equals("1") ? this.g4111cm : "");
        notifyPropertyChanged(BR.g4111b);
    }

    @Bindable
    public String getG4111cd() {
        return g4111cd;
    }

    public void setG4111cd(String g4111cd) {
        this.g4111cd = g4111cd;
        notifyPropertyChanged(BR.g4111cd);
    }

    @Bindable
    public String getG4111cm() {
        return g4111cm;
    }

    public void setG4111cm(String g4111cm) {
        this.g4111cm = g4111cm;
        notifyPropertyChanged(BR.g4111cm);
    }

    @Bindable
    public String getG4111d() {
        return g4111d;
    }

    public void setG4111d(String g4111d) {
        this.g4111d = g4111d;
        notifyPropertyChanged(BR.g4111d);
    }


    @Bindable
    public String getG4112a() {
        return g4112a;
    }

    public void setG4112a(String g4112a) {
        this.g4112a = g4112a;
        notifyPropertyChanged(BR.g4112a);
    }

    @Bindable
    public String getG4112b() {
        return g4112b;
    }

    public void setG4112b(String g4112b) {
        this.g4112b = g4112b;
        setG4112cd(g4112b.equals("1") ? this.g4112cd : "");
        setG4112cm(g4112b.equals("1") ? this.g4112cm : "");
        notifyPropertyChanged(BR.g4112b);
    }

    @Bindable
    public String getG4112cd() {
        return g4112cd;
    }

    public void setG4112cd(String g4112cd) {
        this.g4112cd = g4112cd;
        notifyPropertyChanged(BR.g4112cd);
    }

    @Bindable
    public String getG4112cm() {
        return g4112cm;
    }

    public void setG4112cm(String g4112cm) {
        this.g4112cm = g4112cm;
        notifyPropertyChanged(BR.g4112cm);
    }

    @Bindable
    public String getG4112d() {
        return g4112d;
    }

    public void setG4112d(String g4112d) {
        this.g4112d = g4112d;
        notifyPropertyChanged(BR.g4112d);
    }


    @Bindable
    public String getG4113a() {
        return g4113a;
    }

    public void setG4113a(String g4113a) {
        this.g4113a = g4113a;
        notifyPropertyChanged(BR.g4113a);
    }

    @Bindable
    public String getG4113b() {
        return g4113b;
    }

    public void setG4113b(String g4113b) {
        this.g4113b = g4113b;
        setG4113cd(g4113b.equals("1") ? this.g4113cd : "");
        setG4113cm(g4113b.equals("1") ? this.g4113cm : "");
        notifyPropertyChanged(BR.g4113b);
    }

    @Bindable
    public String getG4113cd() {
        return g4113cd;
    }

    public void setG4113cd(String g4113cd) {
        this.g4113cd = g4113cd;
        notifyPropertyChanged(BR.g4113cd);
    }

    @Bindable
    public String getG4113cm() {
        return g4113cm;
    }

    public void setG4113cm(String g4113cm) {
        this.g4113cm = g4113cm;
        notifyPropertyChanged(BR.g4113cm);
    }

    @Bindable
    public String getG4113d() {
        return g4113d;
    }

    public void setG4113d(String g4113d) {
        this.g4113d = g4113d;
        notifyPropertyChanged(BR.g4113d);
    }


    @Bindable
    public String getG4114a() {
        return g4114a;
    }

    public void setG4114a(String g4114a) {
        this.g4114a = g4114a;
        notifyPropertyChanged(BR.g4114a);
    }

    @Bindable
    public String getG4114b() {
        return g4114b;
    }

    public void setG4114b(String g4114b) {
        this.g4114b = g4114b;
        setG4114cd(g4114b.equals("1") ? this.g4114cd : "");
        setG4114cm(g4114b.equals("1") ? this.g4114cm : "");
        notifyPropertyChanged(BR.g4114b);
    }

    @Bindable
    public String getG4114cd() {
        return g4114cd;
    }

    public void setG4114cd(String g4114cd) {
        this.g4114cd = g4114cd;
        notifyPropertyChanged(BR.g4114cd);
    }

    @Bindable
    public String getG4114cm() {
        return g4114cm;
    }

    public void setG4114cm(String g4114cm) {
        this.g4114cm = g4114cm;
        notifyPropertyChanged(BR.g4114cm);
    }

    @Bindable
    public String getG4114d() {
        return g4114d;
    }

    public void setG4114d(String g4114d) {
        this.g4114d = g4114d;
        notifyPropertyChanged(BR.g4114d);
    }


    @Bindable
    public String getG4115a() {
        return g4115a;
    }

    public void setG4115a(String g4115a) {
        this.g4115a = g4115a;
        notifyPropertyChanged(BR.g4115a);
    }

    @Bindable
    public String getG4115b() {
        return g4115b;
    }

    public void setG4115b(String g4115b) {
        this.g4115b = g4115b;
        setG4115cd(g4115b.equals("1") ? this.g4115cd : "");
        setG4115cm(g4115b.equals("1") ? this.g4115cm : "");
        notifyPropertyChanged(BR.g4115b);
    }

    @Bindable
    public String getG4115cd() {
        return g4115cd;
    }

    public void setG4115cd(String g4115cd) {
        this.g4115cd = g4115cd;
        notifyPropertyChanged(BR.g4115cd);
    }

    @Bindable
    public String getG4115cm() {
        return g4115cm;
    }

    public void setG4115cm(String g4115cm) {
        this.g4115cm = g4115cm;
        notifyPropertyChanged(BR.g4115cm);
    }

    @Bindable
    public String getG4115d() {
        return g4115d;
    }

    public void setG4115d(String g4115d) {
        this.g4115d = g4115d;
        notifyPropertyChanged(BR.g4115d);
    }


    @Bindable
    public String getG4116a() {
        return g4116a;
    }

    public void setG4116a(String g4116a) {
        this.g4116a = g4116a;
        notifyPropertyChanged(BR.g4116a);
    }

    @Bindable
    public String getG4116b() {
        return g4116b;
    }

    public void setG4116b(String g4116b) {
        this.g4116b = g4116b;
        setG4116cd(g4116b.equals("1") ? this.g4116cd : "");
        setG4116cm(g4116b.equals("1") ? this.g4116cm : "");
        notifyPropertyChanged(BR.g4116b);
    }

    @Bindable
    public String getG4116cd() {
        return g4116cd;
    }

    public void setG4116cd(String g4116cd) {
        this.g4116cd = g4116cd;
        notifyPropertyChanged(BR.g4116cd);
    }

    @Bindable
    public String getG4116cm() {
        return g4116cm;
    }

    public void setG4116cm(String g4116cm) {
        this.g4116cm = g4116cm;
        notifyPropertyChanged(BR.g4116cm);
    }

    @Bindable
    public String getG4116d() {
        return g4116d;
    }

    public void setG4116d(String g4116d) {
        this.g4116d = g4116d;
        notifyPropertyChanged(BR.g4116d);
    }


    @Bindable
    public String getG4117a() {
        return g4117a;
    }

    public void setG4117a(String g4117a) {
        this.g4117a = g4117a;
        notifyPropertyChanged(BR.g4117a);
    }

    @Bindable
    public String getG4117b() {
        return g4117b;
    }

    public void setG4117b(String g4117b) {
        this.g4117b = g4117b;
        setG4117cd(g4117b.equals("1") ? this.g4117cd : "");
        setG4117cm(g4117b.equals("1") ? this.g4117cm : "");
        notifyPropertyChanged(BR.g4117b);
    }

    @Bindable
    public String getG4117cd() {
        return g4117cd;
    }

    public void setG4117cd(String g4117cd) {
        this.g4117cd = g4117cd;
        notifyPropertyChanged(BR.g4117cd);
    }

    @Bindable
    public String getG4117cm() {
        return g4117cm;
    }

    public void setG4117cm(String g4117cm) {
        this.g4117cm = g4117cm;
        notifyPropertyChanged(BR.g4117cm);
    }

    @Bindable
    public String getG4117d() {
        return g4117d;
    }

    public void setG4117d(String g4117d) {
        this.g4117d = g4117d;
        notifyPropertyChanged(BR.g4117d);
    }


    @Bindable
    public String getG4118a() {
        return g4118a;
    }

    public void setG4118a(String g4118a) {
        this.g4118a = g4118a;
        notifyPropertyChanged(BR.g4118a);
    }

    @Bindable
    public String getG4118b() {
        return g4118b;
    }

    public void setG4118b(String g4118b) {
        this.g4118b = g4118b;
        setG4118cd(g4118b.equals("1") ? this.g4118cd : "");
        setG4118cm(g4118b.equals("1") ? this.g4118cm : "");
        notifyPropertyChanged(BR.g4118b);
    }

    @Bindable
    public String getG4118cd() {
        return g4118cd;
    }

    public void setG4118cd(String g4118cd) {
        this.g4118cd = g4118cd;
        notifyPropertyChanged(BR.g4118cd);
    }

    @Bindable
    public String getG4118cm() {
        return g4118cm;
    }

    public void setG4118cm(String g4118cm) {
        this.g4118cm = g4118cm;
        notifyPropertyChanged(BR.g4118cm);
    }

    @Bindable
    public String getG4118d() {
        return g4118d;
    }

    public void setG4118d(String g4118d) {
        this.g4118d = g4118d;
        notifyPropertyChanged(BR.g4118d);
    }


    @Bindable
    public String getG4119a() {
        return g4119a;
    }

    public void setG4119a(String g4119a) {
        this.g4119a = g4119a;
        notifyPropertyChanged(BR.g4119a);
    }

    @Bindable
    public String getG4119b() {
        return g4119b;
    }

    public void setG4119b(String g4119b) {
        this.g4119b = g4119b;
        setG4119cd(g4119b.equals("1") ? this.g4119cd : "");
        setG4119cm(g4119b.equals("1") ? this.g4119cm : "");
        notifyPropertyChanged(BR.g4119b);
    }

    @Bindable
    public String getG4119cd() {
        return g4119cd;
    }

    public void setG4119cd(String g4119cd) {
        this.g4119cd = g4119cd;
        notifyPropertyChanged(BR.g4119cd);
    }

    @Bindable
    public String getG4119cm() {
        return g4119cm;
    }

    public void setG4119cm(String g4119cm) {
        this.g4119cm = g4119cm;
        notifyPropertyChanged(BR.g4119cm);
    }

    @Bindable
    public String getG4119d() {
        return g4119d;
    }

    public void setG4119d(String g4119d) {
        this.g4119d = g4119d;
        notifyPropertyChanged(BR.g4119d);
    }


    @Bindable
    public String getG4120a() {
        return g4120a;
    }

    public void setG4120a(String g4120a) {
        this.g4120a = g4120a;
        notifyPropertyChanged(BR.g4120a);
    }

    @Bindable
    public String getG4120b() {
        return g4120b;
    }

    public void setG4120b(String g4120b) {
        this.g4120b = g4120b;
        setG4120cd(g4120b.equals("1") ? this.g4120cd : "");
        setG4120cm(g4120b.equals("1") ? this.g4120cm : "");
        notifyPropertyChanged(BR.g4120b);
    }

    @Bindable
    public String getG4120cd() {
        return g4120cd;
    }

    public void setG4120cd(String g4120cd) {
        this.g4120cd = g4120cd;
        notifyPropertyChanged(BR.g4120cd);
    }

    @Bindable
    public String getG4120cm() {
        return g4120cm;
    }

    public void setG4120cm(String g4120cm) {
        this.g4120cm = g4120cm;
        notifyPropertyChanged(BR.g4120cm);
    }

    @Bindable
    public String getG4120d() {
        return g4120d;
    }

    public void setG4120d(String g4120d) {
        this.g4120d = g4120d;
        notifyPropertyChanged(BR.g4120d);
    }


    @Bindable
    public String getG4121a() {
        return g4121a;
    }

    public void setG4121a(String g4121a) {
        this.g4121a = g4121a;
        notifyPropertyChanged(BR.g4121a);
    }

    @Bindable
    public String getG4121b() {
        return g4121b;
    }

    public void setG4121b(String g4121b) {
        this.g4121b = g4121b;
        setG4121cd(g4121b.equals("1") ? this.g4121cd : "");
        setG4121cm(g4121b.equals("1") ? this.g4121cm : "");
        notifyPropertyChanged(BR.g4121b);
    }

    @Bindable
    public String getG4121cd() {
        return g4121cd;
    }

    public void setG4121cd(String g4121cd) {
        this.g4121cd = g4121cd;
        notifyPropertyChanged(BR.g4121cd);
    }

    @Bindable
    public String getG4121cm() {
        return g4121cm;
    }

    public void setG4121cm(String g4121cm) {
        this.g4121cm = g4121cm;
        notifyPropertyChanged(BR.g4121cm);
    }

    @Bindable
    public String getG4121d() {
        return g4121d;
    }

    public void setG4121d(String g4121d) {
        this.g4121d = g4121d;
        notifyPropertyChanged(BR.g4121d);
    }


    @Bindable
    public String getG4122a() {
        return g4122a;
    }

    public void setG4122a(String g4122a) {
        this.g4122a = g4122a;
        notifyPropertyChanged(BR.g4122a);
    }

    @Bindable
    public String getG4122b() {
        return g4122b;
    }

    public void setG4122b(String g4122b) {
        this.g4122b = g4122b;
        setG4122cd(g4122b.equals("1") ? this.g4122cd : "");
        setG4122cm(g4122b.equals("1") ? this.g4122cm : "");
        notifyPropertyChanged(BR.g4122b);
    }

    @Bindable
    public String getG4122cd() {
        return g4122cd;
    }

    public void setG4122cd(String g4122cd) {
        this.g4122cd = g4122cd;
        notifyPropertyChanged(BR.g4122cd);
    }

    @Bindable
    public String getG4122cm() {
        return g4122cm;
    }

    public void setG4122cm(String g4122cm) {
        this.g4122cm = g4122cm;
        notifyPropertyChanged(BR.g4122cm);
    }

    @Bindable
    public String getG4122d() {
        return g4122d;
    }

    public void setG4122d(String g4122d) {
        this.g4122d = g4122d;
        notifyPropertyChanged(BR.g4122d);
    }


    @Bindable
    public String getG4123a() {
        return g4123a;
    }

    public void setG4123a(String g4123a) {
        this.g4123a = g4123a;
        notifyPropertyChanged(BR.g4123a);
    }

    @Bindable
    public String getG4123b() {
        return g4123b;
    }

    public void setG4123b(String g4123b) {
        this.g4123b = g4123b;
        setG4123cd(g4123b.equals("1") ? this.g4123cd : "");
        setG4123cm(g4123b.equals("1") ? this.g4123cm : "");
        notifyPropertyChanged(BR.g4123b);
    }

    @Bindable
    public String getG4123cd() {
        return g4123cd;
    }

    public void setG4123cd(String g4123cd) {
        this.g4123cd = g4123cd;
        notifyPropertyChanged(BR.g4123cd);
    }

    @Bindable
    public String getG4123cm() {
        return g4123cm;
    }

    public void setG4123cm(String g4123cm) {
        this.g4123cm = g4123cm;
        notifyPropertyChanged(BR.g4123cm);
    }

    @Bindable
    public String getG4123d() {
        return g4123d;
    }

    public void setG4123d(String g4123d) {
        this.g4123d = g4123d;
        notifyPropertyChanged(BR.g4123d);
    }


    @Bindable
    public String getG4124a() {
        return g4124a;
    }

    public void setG4124a(String g4124a) {
        this.g4124a = g4124a;
        notifyPropertyChanged(BR.g4124a);
    }

    @Bindable
    public String getG4124b() {
        return g4124b;
    }

    public void setG4124b(String g4124b) {
        this.g4124b = g4124b;
        setG4124cd(g4124b.equals("1") ? this.g4124cd : "");
        setG4124cm(g4124b.equals("1") ? this.g4124cm : "");
        notifyPropertyChanged(BR.g4124b);
    }

    @Bindable
    public String getG4124cd() {
        return g4124cd;
    }

    public void setG4124cd(String g4124cd) {
        this.g4124cd = g4124cd;
        notifyPropertyChanged(BR.g4124cd);
    }

    @Bindable
    public String getG4124cm() {
        return g4124cm;
    }

    public void setG4124cm(String g4124cm) {
        this.g4124cm = g4124cm;
        notifyPropertyChanged(BR.g4124cm);
    }

    @Bindable
    public String getG4124d() {
        return g4124d;
    }

    public void setG4124d(String g4124d) {
        this.g4124d = g4124d;
        notifyPropertyChanged(BR.g4124d);
    }


    @Bindable
    public String getG4125a() {
        return g4125a;
    }

    public void setG4125a(String g4125a) {
        this.g4125a = g4125a;
        notifyPropertyChanged(BR.g4125a);
    }

    @Bindable
    public String getG4125b() {
        return g4125b;
    }

    public void setG4125b(String g4125b) {
        this.g4125b = g4125b;
        setG4125cd(g4125b.equals("1") ? this.g4125cd : "");
        setG4125cm(g4125b.equals("1") ? this.g4125cm : "");
        notifyPropertyChanged(BR.g4125b);
    }

    @Bindable
    public String getG4125cd() {
        return g4125cd;
    }

    public void setG4125cd(String g4125cd) {
        this.g4125cd = g4125cd;
        notifyPropertyChanged(BR.g4125cd);
    }

    @Bindable
    public String getG4125cm() {
        return g4125cm;
    }

    public void setG4125cm(String g4125cm) {
        this.g4125cm = g4125cm;
        notifyPropertyChanged(BR.g4125cm);
    }

    @Bindable
    public String getG4125d() {
        return g4125d;
    }

    public void setG4125d(String g4125d) {
        this.g4125d = g4125d;
        notifyPropertyChanged(BR.g4125d);
    }


    @Bindable
    public String getG4126a() {
        return g4126a;
    }

    public void setG4126a(String g4126a) {
        this.g4126a = g4126a;
        notifyPropertyChanged(BR.g4126a);
    }

    @Bindable
    public String getG4126b() {
        return g4126b;
    }

    public void setG4126b(String g4126b) {
        this.g4126b = g4126b;
        setG4126cd(g4126b.equals("1") ? this.g4126cd : "");
        setG4126cm(g4126b.equals("1") ? this.g4126cm : "");
        notifyPropertyChanged(BR.g4126b);
    }

    @Bindable
    public String getG4126cd() {
        return g4126cd;
    }

    public void setG4126cd(String g4126cd) {
        this.g4126cd = g4126cd;
        notifyPropertyChanged(BR.g4126cd);
    }

    @Bindable
    public String getG4126cm() {
        return g4126cm;
    }

    public void setG4126cm(String g4126cm) {
        this.g4126cm = g4126cm;
        notifyPropertyChanged(BR.g4126cm);
    }

    @Bindable
    public String getG4126d() {
        return g4126d;
    }

    public void setG4126d(String g4126d) {
        this.g4126d = g4126d;
        notifyPropertyChanged(BR.g4126d);
    }


    @Bindable
    public String getG4127a() {
        return g4127a;
    }

    public void setG4127a(String g4127a) {
        this.g4127a = g4127a;
        notifyPropertyChanged(BR.g4127a);
    }

    @Bindable
    public String getG4127b() {
        return g4127b;
    }

    public void setG4127b(String g4127b) {
        this.g4127b = g4127b;
        setG4127cd(g4127b.equals("1") ? this.g4127cd : "");
        setG4127cm(g4127b.equals("1") ? this.g4127cm : "");
        notifyPropertyChanged(BR.g4127b);
    }

    @Bindable
    public String getG4127cd() {
        return g4127cd;
    }

    public void setG4127cd(String g4127cd) {
        this.g4127cd = g4127cd;
        notifyPropertyChanged(BR.g4127cd);
    }

    @Bindable
    public String getG4127cm() {
        return g4127cm;
    }

    public void setG4127cm(String g4127cm) {
        this.g4127cm = g4127cm;
        notifyPropertyChanged(BR.g4127cm);
    }

    @Bindable
    public String getG4127d() {
        return g4127d;
    }

    public void setG4127d(String g4127d) {
        this.g4127d = g4127d;
        notifyPropertyChanged(BR.g4127d);
    }


    @Bindable
    public String getG4128a() {
        return g4128a;
    }

    public void setG4128a(String g4128a) {
        this.g4128a = g4128a;
        notifyPropertyChanged(BR.g4128a);
    }

    @Bindable
    public String getG4128b() {
        return g4128b;
    }

    public void setG4128b(String g4128b) {
        this.g4128b = g4128b;
        setG4128cd(g4128b.equals("1") ? this.g4128cd : "");
        setG4128cm(g4128b.equals("1") ? this.g4128cm : "");
        notifyPropertyChanged(BR.g4128b);
    }

    @Bindable
    public String getG4128cd() {
        return g4128cd;
    }

    public void setG4128cd(String g4128cd) {
        this.g4128cd = g4128cd;
        notifyPropertyChanged(BR.g4128cd);
    }

    @Bindable
    public String getG4128cm() {
        return g4128cm;
    }

    public void setG4128cm(String g4128cm) {
        this.g4128cm = g4128cm;
        notifyPropertyChanged(BR.g4128cm);
    }

    @Bindable
    public String getG4128d() {
        return g4128d;
    }

    public void setG4128d(String g4128d) {
        this.g4128d = g4128d;
        notifyPropertyChanged(BR.g4128d);
    }


    @Bindable
    public String getG4129a() {
        return g4129a;
    }

    public void setG4129a(String g4129a) {
        this.g4129a = g4129a;
        notifyPropertyChanged(BR.g4129a);
    }

    @Bindable
    public String getG4129b() {
        return g4129b;
    }

    public void setG4129b(String g4129b) {
        this.g4129b = g4129b;
        setG4129cd(g4129b.equals("1") ? this.g4129cd : "");
        setG4129cm(g4129b.equals("1") ? this.g4129cm : "");
        notifyPropertyChanged(BR.g4129b);
    }

    @Bindable
    public String getG4129cd() {
        return g4129cd;
    }

    public void setG4129cd(String g4129cd) {
        this.g4129cd = g4129cd;
        notifyPropertyChanged(BR.g4129cd);
    }

    @Bindable
    public String getG4129cm() {
        return g4129cm;
    }

    public void setG4129cm(String g4129cm) {
        this.g4129cm = g4129cm;
        notifyPropertyChanged(BR.g4129cm);
    }

    @Bindable
    public String getG4129d() {
        return g4129d;
    }

    public void setG4129d(String g4129d) {
        this.g4129d = g4129d;
        notifyPropertyChanged(BR.g4129d);
    }


    @Bindable
    public String getG4130a() {
        return g4130a;
    }

    public void setG4130a(String g4130a) {
        this.g4130a = g4130a;
        notifyPropertyChanged(BR.g4130a);
    }

    @Bindable
    public String getG4130b() {
        return g4130b;
    }

    public void setG4130b(String g4130b) {
        this.g4130b = g4130b;
        setG4130cd(g4130b.equals("1") ? this.g4130cd : "");
        setG4130cm(g4130b.equals("1") ? this.g4130cm : "");
        notifyPropertyChanged(BR.g4130b);
    }

    @Bindable
    public String getG4130cd() {
        return g4130cd;
    }

    public void setG4130cd(String g4130cd) {
        this.g4130cd = g4130cd;
        notifyPropertyChanged(BR.g4130cd);
    }

    @Bindable
    public String getG4130cm() {
        return g4130cm;
    }

    public void setG4130cm(String g4130cm) {
        this.g4130cm = g4130cm;
        notifyPropertyChanged(BR.g4130cm);
    }

    @Bindable
    public String getG4130d() {
        return g4130d;
    }

    public void setG4130d(String g4130d) {
        this.g4130d = g4130d;
        notifyPropertyChanged(BR.g4130d);
    }


    @Bindable
    public String getG4131a() {
        return g4131a;
    }

    public void setG4131a(String g4131a) {
        this.g4131a = g4131a;
        notifyPropertyChanged(BR.g4131a);
    }

    @Bindable
    public String getG4131b() {
        return g4131b;
    }

    public void setG4131b(String g4131b) {
        this.g4131b = g4131b;
        setG4131cd(g4131b.equals("1") ? this.g4131cd : "");
        setG4131cm(g4131b.equals("1") ? this.g4131cm : "");
        notifyPropertyChanged(BR.g4131b);
    }

    @Bindable
    public String getG4131cd() {
        return g4131cd;
    }

    public void setG4131cd(String g4131cd) {
        this.g4131cd = g4131cd;
        notifyPropertyChanged(BR.g4131cd);
    }

    @Bindable
    public String getG4131cm() {
        return g4131cm;
    }

    public void setG4131cm(String g4131cm) {
        this.g4131cm = g4131cm;
        notifyPropertyChanged(BR.g4131cm);
    }

    @Bindable
    public String getG4131d() {
        return g4131d;
    }

    public void setG4131d(String g4131d) {
        this.g4131d = g4131d;
        notifyPropertyChanged(BR.g4131d);
    }


    @Bindable
    public String getG4132a() {
        return g4132a;
    }

    public void setG4132a(String g4132a) {
        this.g4132a = g4132a;
        notifyPropertyChanged(BR.g4132a);
    }

    @Bindable
    public String getG4132b() {
        return g4132b;
    }

    public void setG4132b(String g4132b) {
        this.g4132b = g4132b;
        setG4132cd(g4132b.equals("1") ? this.g4132cd : "");
        setG4132cm(g4132b.equals("1") ? this.g4132cm : "");
        notifyPropertyChanged(BR.g4132b);
    }

    @Bindable
    public String getG4132cd() {
        return g4132cd;
    }

    public void setG4132cd(String g4132cd) {
        this.g4132cd = g4132cd;
        notifyPropertyChanged(BR.g4132cd);
    }

    @Bindable
    public String getG4132cm() {
        return g4132cm;
    }

    public void setG4132cm(String g4132cm) {
        this.g4132cm = g4132cm;
        notifyPropertyChanged(BR.g4132cm);
    }

    @Bindable
    public String getG4132d() {
        return g4132d;
    }

    public void setG4132d(String g4132d) {
        this.g4132d = g4132d;
        notifyPropertyChanged(BR.g4132d);
    }


    @Bindable
    public String getG4133a() {
        return g4133a;
    }

    public void setG4133a(String g4133a) {
        this.g4133a = g4133a;
        notifyPropertyChanged(BR.g4133a);
    }

    @Bindable
    public String getG4133b() {
        return g4133b;
    }

    public void setG4133b(String g4133b) {
        this.g4133b = g4133b;
        setG4133cd(g4133b.equals("1") ? this.g4133cd : "");
        setG4133cm(g4133b.equals("1") ? this.g4133cm : "");
        notifyPropertyChanged(BR.g4133b);
    }

    @Bindable
    public String getG4133cd() {
        return g4133cd;
    }

    public void setG4133cd(String g4133cd) {
        this.g4133cd = g4133cd;
        notifyPropertyChanged(BR.g4133cd);
    }

    @Bindable
    public String getG4133cm() {
        return g4133cm;
    }

    public void setG4133cm(String g4133cm) {
        this.g4133cm = g4133cm;
        notifyPropertyChanged(BR.g4133cm);
    }

    @Bindable
    public String getG4133d() {
        return g4133d;
    }

    public void setG4133d(String g4133d) {
        this.g4133d = g4133d;
        notifyPropertyChanged(BR.g4133d);
    }


    @Bindable
    public String getG4134a() {
        return g4134a;
    }

    public void setG4134a(String g4134a) {
        this.g4134a = g4134a;
        notifyPropertyChanged(BR.g4134a);
    }

    @Bindable
    public String getG4134b() {
        return g4134b;
    }

    public void setG4134b(String g4134b) {
        this.g4134b = g4134b;
        setG4134cd(g4134b.equals("1") ? this.g4134cd : "");
        setG4134cm(g4134b.equals("1") ? this.g4134cm : "");
        notifyPropertyChanged(BR.g4134b);
    }

    @Bindable
    public String getG4134cd() {
        return g4134cd;
    }

    public void setG4134cd(String g4134cd) {
        this.g4134cd = g4134cd;
        notifyPropertyChanged(BR.g4134cd);
    }

    @Bindable
    public String getG4134cm() {
        return g4134cm;
    }

    public void setG4134cm(String g4134cm) {
        this.g4134cm = g4134cm;
        notifyPropertyChanged(BR.g4134cm);
    }

    @Bindable
    public String getG4134d() {
        return g4134d;
    }

    public void setG4134d(String g4134d) {
        this.g4134d = g4134d;
        notifyPropertyChanged(BR.g4134d);
    }


    @Bindable
    public String getG4135a() {
        return g4135a;
    }

    public void setG4135a(String g4135a) {
        this.g4135a = g4135a;
        notifyPropertyChanged(BR.g4135a);
    }

    @Bindable
    public String getG4135b() {
        return g4135b;
    }

    public void setG4135b(String g4135b) {
        this.g4135b = g4135b;
        setG4135cd(g4135b.equals("1") ? this.g4135cd : "");
        setG4135cm(g4135b.equals("1") ? this.g4135cm : "");
        notifyPropertyChanged(BR.g4135b);
    }

    @Bindable
    public String getG4135cd() {
        return g4135cd;
    }

    public void setG4135cd(String g4135cd) {
        this.g4135cd = g4135cd;
        notifyPropertyChanged(BR.g4135cd);
    }

    @Bindable
    public String getG4135cm() {
        return g4135cm;
    }

    public void setG4135cm(String g4135cm) {
        this.g4135cm = g4135cm;
        notifyPropertyChanged(BR.g4135cm);
    }

    @Bindable
    public String getG4135d() {
        return g4135d;
    }

    public void setG4135d(String g4135d) {
        this.g4135d = g4135d;
        notifyPropertyChanged(BR.g4135d);
    }


    @Bindable
    public String getG4136a() {
        return g4136a;
    }

    public void setG4136a(String g4136a) {
        this.g4136a = g4136a;
        notifyPropertyChanged(BR.g4136a);
    }

    @Bindable
    public String getG4136b() {
        return g4136b;
    }

    public void setG4136b(String g4136b) {
        this.g4136b = g4136b;
        setG4136cd(g4136b.equals("1") ? this.g4136cd : "");
        setG4136cm(g4136b.equals("1") ? this.g4136cm : "");
        notifyPropertyChanged(BR.g4136b);
    }

    @Bindable
    public String getG4136cd() {
        return g4136cd;
    }

    public void setG4136cd(String g4136cd) {
        this.g4136cd = g4136cd;
        notifyPropertyChanged(BR.g4136cd);
    }

    @Bindable
    public String getG4136cm() {
        return g4136cm;
    }

    public void setG4136cm(String g4136cm) {
        this.g4136cm = g4136cm;
        notifyPropertyChanged(BR.g4136cm);
    }

    @Bindable
    public String getG4136d() {
        return g4136d;
    }

    public void setG4136d(String g4136d) {
        this.g4136d = g4136d;
        notifyPropertyChanged(BR.g4136d);
    }


    @Bindable
    public String getG4137a() {
        return g4137a;
    }

    public void setG4137a(String g4137a) {
        this.g4137a = g4137a;
        notifyPropertyChanged(BR.g4137a);
    }

    @Bindable
    public String getG4137b() {
        return g4137b;
    }

    public void setG4137b(String g4137b) {
        this.g4137b = g4137b;
        setG4137cd(g4137b.equals("1") ? this.g4137cd : "");
        setG4137cm(g4137b.equals("1") ? this.g4137cm : "");
        notifyPropertyChanged(BR.g4137b);
    }

    @Bindable
    public String getG4137cd() {
        return g4137cd;
    }

    public void setG4137cd(String g4137cd) {
        this.g4137cd = g4137cd;
        notifyPropertyChanged(BR.g4137cd);
    }

    @Bindable
    public String getG4137cm() {
        return g4137cm;
    }

    public void setG4137cm(String g4137cm) {
        this.g4137cm = g4137cm;
        notifyPropertyChanged(BR.g4137cm);
    }

    @Bindable
    public String getG4137d() {
        return g4137d;
    }

    public void setG4137d(String g4137d) {
        this.g4137d = g4137d;
        notifyPropertyChanged(BR.g4137d);
    }


    @Bindable
    public String getG4138a() {
        return g4138a;
    }

    public void setG4138a(String g4138a) {
        this.g4138a = g4138a;
        notifyPropertyChanged(BR.g4138a);
    }

    @Bindable
    public String getG4138b() {
        return g4138b;
    }

    public void setG4138b(String g4138b) {
        this.g4138b = g4138b;
        setG4138cd(g4138b.equals("1") ? this.g4138cd : "");
        setG4138cm(g4138b.equals("1") ? this.g4138cm : "");
        notifyPropertyChanged(BR.g4138b);
    }

    @Bindable
    public String getG4138cd() {
        return g4138cd;
    }

    public void setG4138cd(String g4138cd) {
        this.g4138cd = g4138cd;
        notifyPropertyChanged(BR.g4138cd);
    }

    @Bindable
    public String getG4138cm() {
        return g4138cm;
    }

    public void setG4138cm(String g4138cm) {
        this.g4138cm = g4138cm;
        notifyPropertyChanged(BR.g4138cm);
    }

    @Bindable
    public String getG4138d() {
        return g4138d;
    }

    public void setG4138d(String g4138d) {
        this.g4138d = g4138d;
        notifyPropertyChanged(BR.g4138d);
    }


    @Bindable
    public String getG4139a() {
        return g4139a;
    }

    public void setG4139a(String g4139a) {
        this.g4139a = g4139a;
        notifyPropertyChanged(BR.g4139a);
    }

    @Bindable
    public String getG4139b() {
        return g4139b;
    }

    public void setG4139b(String g4139b) {
        this.g4139b = g4139b;
        setG4139cd(g4139b.equals("1") ? this.g4139cd : "");
        setG4139cm(g4139b.equals("1") ? this.g4139cm : "");
        notifyPropertyChanged(BR.g4139b);
    }

    @Bindable
    public String getG4139cd() {
        return g4139cd;
    }

    public void setG4139cd(String g4139cd) {
        this.g4139cd = g4139cd;
        notifyPropertyChanged(BR.g4139cd);
    }

    @Bindable
    public String getG4139cm() {
        return g4139cm;
    }

    public void setG4139cm(String g4139cm) {
        this.g4139cm = g4139cm;
        notifyPropertyChanged(BR.g4139cm);
    }

    @Bindable
    public String getG4139d() {
        return g4139d;
    }

    public void setG4139d(String g4139d) {
        this.g4139d = g4139d;
        notifyPropertyChanged(BR.g4139d);
    }


    @Bindable
    public String getG4140a() {
        return g4140a;
    }

    public void setG4140a(String g4140a) {
        this.g4140a = g4140a;
        notifyPropertyChanged(BR.g4140a);
    }

    @Bindable
    public String getG4140b() {
        return g4140b;
    }

    public void setG4140b(String g4140b) {
        this.g4140b = g4140b;
        setG4140cd(g4140b.equals("1") ? this.g4140cd : "");
        setG4140cm(g4140b.equals("1") ? this.g4140cm : "");
        notifyPropertyChanged(BR.g4140b);
    }

    @Bindable
    public String getG4140cd() {
        return g4140cd;
    }

    public void setG4140cd(String g4140cd) {
        this.g4140cd = g4140cd;
        notifyPropertyChanged(BR.g4140cd);
    }

    @Bindable
    public String getG4140cm() {
        return g4140cm;
    }

    public void setG4140cm(String g4140cm) {
        this.g4140cm = g4140cm;
        notifyPropertyChanged(BR.g4140cm);
    }

    @Bindable
    public String getG4140d() {
        return g4140d;
    }

    public void setG4140d(String g4140d) {
        this.g4140d = g4140d;
        notifyPropertyChanged(BR.g4140d);
    }


    @Bindable
    public String getG4141a() {
        return g4141a;
    }

    public void setG4141a(String g4141a) {
        this.g4141a = g4141a;
        notifyPropertyChanged(BR.g4141a);
    }

    @Bindable
    public String getG4141b() {
        return g4141b;
    }

    public void setG4141b(String g4141b) {
        this.g4141b = g4141b;
        setG4141cd(g4141b.equals("1") ? this.g4141cd : "");
        setG4141cm(g4141b.equals("1") ? this.g4141cm : "");
        notifyPropertyChanged(BR.g4141b);
    }

    @Bindable
    public String getG4141cd() {
        return g4141cd;
    }

    public void setG4141cd(String g4141cd) {
        this.g4141cd = g4141cd;
        notifyPropertyChanged(BR.g4141cd);
    }

    @Bindable
    public String getG4141cm() {
        return g4141cm;
    }

    public void setG4141cm(String g4141cm) {
        this.g4141cm = g4141cm;
        notifyPropertyChanged(BR.g4141cm);
    }

    @Bindable
    public String getG4141d() {
        return g4141d;
    }

    public void setG4141d(String g4141d) {
        this.g4141d = g4141d;
        notifyPropertyChanged(BR.g4141d);
    }


    @Bindable
    public String getG4142a() {
        return g4142a;
    }

    public void setG4142a(String g4142a) {
        this.g4142a = g4142a;
        notifyPropertyChanged(BR.g4142a);
    }

    @Bindable
    public String getG4142b() {
        return g4142b;
    }

    public void setG4142b(String g4142b) {
        this.g4142b = g4142b;
        setG4142cd(g4142b.equals("1") ? this.g4142cd : "");
        setG4142cm(g4142b.equals("1") ? this.g4142cm : "");
        notifyPropertyChanged(BR.g4142b);
    }

    @Bindable
    public String getG4142cd() {
        return g4142cd;
    }

    public void setG4142cd(String g4142cd) {
        this.g4142cd = g4142cd;
        notifyPropertyChanged(BR.g4142cd);
    }

    @Bindable
    public String getG4142cm() {
        return g4142cm;
    }

    public void setG4142cm(String g4142cm) {
        this.g4142cm = g4142cm;
        notifyPropertyChanged(BR.g4142cm);
    }

    @Bindable
    public String getG4142d() {
        return g4142d;
    }

    public void setG4142d(String g4142d) {
        this.g4142d = g4142d;
        notifyPropertyChanged(BR.g4142d);
    }


    @Bindable
    public String getG4143a() {
        return g4143a;
    }

    public void setG4143a(String g4143a) {
        this.g4143a = g4143a;
        notifyPropertyChanged(BR.g4143a);
    }

    @Bindable
    public String getG4143b() {
        return g4143b;
    }

    public void setG4143b(String g4143b) {
        this.g4143b = g4143b;
        setG4143cd(g4143b.equals("1") ? this.g4143cd : "");
        setG4143cm(g4143b.equals("1") ? this.g4143cm : "");
        notifyPropertyChanged(BR.g4143b);
    }

    @Bindable
    public String getG4143cd() {
        return g4143cd;
    }

    public void setG4143cd(String g4143cd) {
        this.g4143cd = g4143cd;
        notifyPropertyChanged(BR.g4143cd);
    }

    @Bindable
    public String getG4143cm() {
        return g4143cm;
    }

    public void setG4143cm(String g4143cm) {
        this.g4143cm = g4143cm;
        notifyPropertyChanged(BR.g4143cm);
    }

    @Bindable
    public String getG4143d() {
        return g4143d;
    }

    public void setG4143d(String g4143d) {
        this.g4143d = g4143d;
        notifyPropertyChanged(BR.g4143d);
    }


    @Bindable
    public String getG4144a() {
        return g4144a;
    }

    public void setG4144a(String g4144a) {
        this.g4144a = g4144a;
        notifyPropertyChanged(BR.g4144a);
    }

    @Bindable
    public String getG4144b() {
        return g4144b;
    }

    public void setG4144b(String g4144b) {
        this.g4144b = g4144b;
        setG4144cd(g4144b.equals("1") ? this.g4144cd : "");
        setG4144cm(g4144b.equals("1") ? this.g4144cm : "");
        notifyPropertyChanged(BR.g4144b);
    }

    @Bindable
    public String getG4144cd() {
        return g4144cd;
    }

    public void setG4144cd(String g4144cd) {
        this.g4144cd = g4144cd;
        notifyPropertyChanged(BR.g4144cd);
    }

    @Bindable
    public String getG4144cm() {
        return g4144cm;
    }

    public void setG4144cm(String g4144cm) {
        this.g4144cm = g4144cm;
        notifyPropertyChanged(BR.g4144cm);
    }

    @Bindable
    public String getG4144d() {
        return g4144d;
    }

    public void setG4144d(String g4144d) {
        this.g4144d = g4144d;
        notifyPropertyChanged(BR.g4144d);
    }


    @Bindable
    public String getG4201a() {
        return g4201a;
    }

    public void setG4201a(String g4201a) {
        this.g4201a = g4201a;
        notifyPropertyChanged(BR.g4201a);
    }

    @Bindable
    public String getG4201b() {
        return g4201b;
    }

    public void setG4201b(String g4201b) {
        this.g4201b = g4201b;
        setG4201cd(g4201b.equals("1") ? this.g4201cd : "");
        setG4201cm(g4201b.equals("1") ? this.g4201cm : "");
        notifyPropertyChanged(BR.g4201b);
    }

    @Bindable
    public String getG4201cd() {
        return g4201cd;
    }

    public void setG4201cd(String g4201cd) {
        this.g4201cd = g4201cd;
        notifyPropertyChanged(BR.g4201cd);
    }

    @Bindable
    public String getG4201cm() {
        return g4201cm;
    }

    public void setG4201cm(String g4201cm) {
        this.g4201cm = g4201cm;
        notifyPropertyChanged(BR.g4201cm);
    }

    @Bindable
    public String getG4201d() {
        return g4201d;
    }

    public void setG4201d(String g4201d) {
        this.g4201d = g4201d;
        notifyPropertyChanged(BR.g4201d);
    }


    @Bindable
    public String getG4202a() {
        return g4202a;
    }

    public void setG4202a(String g4202a) {
        this.g4202a = g4202a;
        notifyPropertyChanged(BR.g4202a);
    }

    @Bindable
    public String getG4202b() {
        return g4202b;
    }

    public void setG4202b(String g4202b) {
        this.g4202b = g4202b;
        setG4202cd(g4202b.equals("1") ? this.g4202cd : "");
        setG4202cm(g4202b.equals("1") ? this.g4202cm : "");
        notifyPropertyChanged(BR.g4202b);
    }

    @Bindable
    public String getG4202cd() {
        return g4202cd;
    }

    public void setG4202cd(String g4202cd) {
        this.g4202cd = g4202cd;
        notifyPropertyChanged(BR.g4202cd);
    }

    @Bindable
    public String getG4202cm() {
        return g4202cm;
    }

    public void setG4202cm(String g4202cm) {
        this.g4202cm = g4202cm;
        notifyPropertyChanged(BR.g4202cm);
    }

    @Bindable
    public String getG4202d() {
        return g4202d;
    }

    public void setG4202d(String g4202d) {
        this.g4202d = g4202d;
        notifyPropertyChanged(BR.g4202d);
    }


    @Bindable
    public String getG4203a() {
        return g4203a;
    }

    public void setG4203a(String g4203a) {
        this.g4203a = g4203a;
        notifyPropertyChanged(BR.g4203a);
    }

    @Bindable
    public String getG4203b() {
        return g4203b;
    }

    public void setG4203b(String g4203b) {
        this.g4203b = g4203b;
        setG4203cd(g4203b.equals("1") ? this.g4203cd : "");
        setG4203cm(g4203b.equals("1") ? this.g4203cm : "");
        notifyPropertyChanged(BR.g4203b);
    }

    @Bindable
    public String getG4203cd() {
        return g4203cd;
    }

    public void setG4203cd(String g4203cd) {
        this.g4203cd = g4203cd;
        notifyPropertyChanged(BR.g4203cd);
    }

    @Bindable
    public String getG4203cm() {
        return g4203cm;
    }

    public void setG4203cm(String g4203cm) {
        this.g4203cm = g4203cm;
        notifyPropertyChanged(BR.g4203cm);
    }

    @Bindable
    public String getG4203d() {
        return g4203d;
    }

    public void setG4203d(String g4203d) {
        this.g4203d = g4203d;
        notifyPropertyChanged(BR.g4203d);
    }


    @Bindable
    public String getG4204a() {
        return g4204a;
    }

    public void setG4204a(String g4204a) {
        this.g4204a = g4204a;
        notifyPropertyChanged(BR.g4204a);
    }

    @Bindable
    public String getG4204b() {
        return g4204b;
    }

    public void setG4204b(String g4204b) {
        this.g4204b = g4204b;
        setG4204cd(g4204b.equals("1") ? this.g4204cd : "");
        setG4204cm(g4204b.equals("1") ? this.g4204cm : "");
        notifyPropertyChanged(BR.g4204b);
    }

    @Bindable
    public String getG4204cd() {
        return g4204cd;
    }

    public void setG4204cd(String g4204cd) {
        this.g4204cd = g4204cd;
        notifyPropertyChanged(BR.g4204cd);
    }

    @Bindable
    public String getG4204cm() {
        return g4204cm;
    }

    public void setG4204cm(String g4204cm) {
        this.g4204cm = g4204cm;
        notifyPropertyChanged(BR.g4204cm);
    }

    @Bindable
    public String getG4204d() {
        return g4204d;
    }

    public void setG4204d(String g4204d) {
        this.g4204d = g4204d;
        notifyPropertyChanged(BR.g4204d);
    }


    @Bindable
    public String getG4205a() {
        return g4205a;
    }

    public void setG4205a(String g4205a) {
        this.g4205a = g4205a;
        notifyPropertyChanged(BR.g4205a);
    }

    @Bindable
    public String getG4205b() {
        return g4205b;
    }

    public void setG4205b(String g4205b) {
        this.g4205b = g4205b;
        setG4205cd(g4205b.equals("1") ? this.g4205cd : "");
        setG4205cm(g4205b.equals("1") ? this.g4205cm : "");
        notifyPropertyChanged(BR.g4205b);
    }

    @Bindable
    public String getG4205cd() {
        return g4205cd;
    }

    public void setG4205cd(String g4205cd) {
        this.g4205cd = g4205cd;
        notifyPropertyChanged(BR.g4205cd);
    }

    @Bindable
    public String getG4205cm() {
        return g4205cm;
    }

    public void setG4205cm(String g4205cm) {
        this.g4205cm = g4205cm;
        notifyPropertyChanged(BR.g4205cm);
    }

    @Bindable
    public String getG4205d() {
        return g4205d;
    }

    public void setG4205d(String g4205d) {
        this.g4205d = g4205d;
        notifyPropertyChanged(BR.g4205d);
    }


    @Bindable
    public String getG4206a() {
        return g4206a;
    }

    public void setG4206a(String g4206a) {
        this.g4206a = g4206a;
        notifyPropertyChanged(BR.g4206a);
    }

    @Bindable
    public String getG4206b() {
        return g4206b;
    }

    public void setG4206b(String g4206b) {
        this.g4206b = g4206b;
        setG4206cd(g4206b.equals("1") ? this.g4206cd : "");
        setG4206cm(g4206b.equals("1") ? this.g4206cm : "");
        notifyPropertyChanged(BR.g4206b);
    }

    @Bindable
    public String getG4206cd() {
        return g4206cd;
    }

    public void setG4206cd(String g4206cd) {
        this.g4206cd = g4206cd;
        notifyPropertyChanged(BR.g4206cd);
    }

    @Bindable
    public String getG4206cm() {
        return g4206cm;
    }

    public void setG4206cm(String g4206cm) {
        this.g4206cm = g4206cm;
        notifyPropertyChanged(BR.g4206cm);
    }

    @Bindable
    public String getG4206d() {
        return g4206d;
    }

    public void setG4206d(String g4206d) {
        this.g4206d = g4206d;
        notifyPropertyChanged(BR.g4206d);
    }


    @Bindable
    public String getG4207a() {
        return g4207a;
    }

    public void setG4207a(String g4207a) {
        this.g4207a = g4207a;
        notifyPropertyChanged(BR.g4207a);
    }

    @Bindable
    public String getG4207b() {
        return g4207b;
    }

    public void setG4207b(String g4207b) {
        this.g4207b = g4207b;
        setG4207cd(g4207b.equals("1") ? this.g4207cd : "");
        setG4207cm(g4207b.equals("1") ? this.g4207cm : "");
        notifyPropertyChanged(BR.g4207b);
    }

    @Bindable
    public String getG4207cd() {
        return g4207cd;
    }

    public void setG4207cd(String g4207cd) {
        this.g4207cd = g4207cd;
        notifyPropertyChanged(BR.g4207cd);
    }

    @Bindable
    public String getG4207cm() {
        return g4207cm;
    }

    public void setG4207cm(String g4207cm) {
        this.g4207cm = g4207cm;
        notifyPropertyChanged(BR.g4207cm);
    }

    @Bindable
    public String getG4207d() {
        return g4207d;
    }

    public void setG4207d(String g4207d) {
        this.g4207d = g4207d;
        notifyPropertyChanged(BR.g4207d);
    }


    @Bindable
    public String getG4208a() {
        return g4208a;
    }

    public void setG4208a(String g4208a) {
        this.g4208a = g4208a;
        notifyPropertyChanged(BR.g4208a);
    }

    @Bindable
    public String getG4208b() {
        return g4208b;
    }

    public void setG4208b(String g4208b) {
        this.g4208b = g4208b;
        setG4208cd(g4208b.equals("1") ? this.g4208cd : "");
        setG4208cm(g4208b.equals("1") ? this.g4208cm : "");
        notifyPropertyChanged(BR.g4208b);
    }

    @Bindable
    public String getG4208cd() {
        return g4208cd;
    }

    public void setG4208cd(String g4208cd) {
        this.g4208cd = g4208cd;
        notifyPropertyChanged(BR.g4208cd);
    }

    @Bindable
    public String getG4208cm() {
        return g4208cm;
    }

    public void setG4208cm(String g4208cm) {
        this.g4208cm = g4208cm;
        notifyPropertyChanged(BR.g4208cm);
    }

    @Bindable
    public String getG4208d() {
        return g4208d;
    }

    public void setG4208d(String g4208d) {
        this.g4208d = g4208d;
        notifyPropertyChanged(BR.g4208d);
    }


    @Bindable
    public String getG4209a() {
        return g4209a;
    }

    public void setG4209a(String g4209a) {
        this.g4209a = g4209a;
        notifyPropertyChanged(BR.g4209a);
    }

    @Bindable
    public String getG4209b() {
        return g4209b;
    }

    public void setG4209b(String g4209b) {
        this.g4209b = g4209b;
        setG4209cd(g4209b.equals("1") ? this.g4209cd : "");
        setG4209cm(g4209b.equals("1") ? this.g4209cm : "");
        notifyPropertyChanged(BR.g4209b);
    }

    @Bindable
    public String getG4209cd() {
        return g4209cd;
    }

    public void setG4209cd(String g4209cd) {
        this.g4209cd = g4209cd;
        notifyPropertyChanged(BR.g4209cd);
    }

    @Bindable
    public String getG4209cm() {
        return g4209cm;
    }

    public void setG4209cm(String g4209cm) {
        this.g4209cm = g4209cm;
        notifyPropertyChanged(BR.g4209cm);
    }

    @Bindable
    public String getG4209d() {
        return g4209d;
    }

    public void setG4209d(String g4209d) {
        this.g4209d = g4209d;
        notifyPropertyChanged(BR.g4209d);
    }


    @Bindable
    public String getG4210a() {
        return g4210a;
    }

    public void setG4210a(String g4210a) {
        this.g4210a = g4210a;
        notifyPropertyChanged(BR.g4210a);
    }

    @Bindable
    public String getG4210b() {
        return g4210b;
    }

    public void setG4210b(String g4210b) {
        this.g4210b = g4210b;
        setG4210cd(g4210b.equals("1") ? this.g4210cd : "");
        setG4210cm(g4210b.equals("1") ? this.g4210cm : "");
        notifyPropertyChanged(BR.g4210b);
    }

    @Bindable
    public String getG4210cd() {
        return g4210cd;
    }

    public void setG4210cd(String g4210cd) {
        this.g4210cd = g4210cd;
        notifyPropertyChanged(BR.g4210cd);
    }

    @Bindable
    public String getG4210cm() {
        return g4210cm;
    }

    public void setG4210cm(String g4210cm) {
        this.g4210cm = g4210cm;
        notifyPropertyChanged(BR.g4210cm);
    }

    @Bindable
    public String getG4210d() {
        return g4210d;
    }

    public void setG4210d(String g4210d) {
        this.g4210d = g4210d;
        notifyPropertyChanged(BR.g4210d);
    }


    @Bindable
    public String getG4301a() {
        return g4301a;
    }

    public void setG4301a(String g4301a) {
        this.g4301a = g4301a;
        notifyPropertyChanged(BR.g4301a);
    }

    @Bindable
    public String getG4301b() {
        return g4301b;
    }

    public void setG4301b(String g4301b) {
        this.g4301b = g4301b;
        setG4301cd(g4301b.equals("1") ? this.g4301cd : "");
        setG4301cm(g4301b.equals("1") ? this.g4301cm : "");
        notifyPropertyChanged(BR.g4301b);
    }

    @Bindable
    public String getG4301cd() {
        return g4301cd;
    }

    public void setG4301cd(String g4301cd) {
        this.g4301cd = g4301cd;
        notifyPropertyChanged(BR.g4301cd);
    }

    @Bindable
    public String getG4301cm() {
        return g4301cm;
    }

    public void setG4301cm(String g4301cm) {
        this.g4301cm = g4301cm;
        notifyPropertyChanged(BR.g4301cm);
    }

    @Bindable
    public String getG4301d() {
        return g4301d;
    }

    public void setG4301d(String g4301d) {
        this.g4301d = g4301d;
        notifyPropertyChanged(BR.g4301d);
    }


    @Bindable
    public String getG4302a() {
        return g4302a;
    }

    public void setG4302a(String g4302a) {
        this.g4302a = g4302a;
        notifyPropertyChanged(BR.g4302a);
    }

    @Bindable
    public String getG4302b() {
        return g4302b;
    }

    public void setG4302b(String g4302b) {
        this.g4302b = g4302b;
        setG4302cd(g4302b.equals("1") ? this.g4302cd : "");
        setG4302cm(g4302b.equals("1") ? this.g4302cm : "");
        notifyPropertyChanged(BR.g4302b);
    }

    @Bindable
    public String getG4302cd() {
        return g4302cd;
    }

    public void setG4302cd(String g4302cd) {
        this.g4302cd = g4302cd;
        notifyPropertyChanged(BR.g4302cd);
    }

    @Bindable
    public String getG4302cm() {
        return g4302cm;
    }

    public void setG4302cm(String g4302cm) {
        this.g4302cm = g4302cm;
        notifyPropertyChanged(BR.g4302cm);
    }

    @Bindable
    public String getG4302d() {
        return g4302d;
    }

    public void setG4302d(String g4302d) {
        this.g4302d = g4302d;
        notifyPropertyChanged(BR.g4302d);
    }


    @Bindable
    public String getG4303a() {
        return g4303a;
    }

    public void setG4303a(String g4303a) {
        this.g4303a = g4303a;
        notifyPropertyChanged(BR.g4303a);
    }

    @Bindable
    public String getG4303b() {
        return g4303b;
    }

    public void setG4303b(String g4303b) {
        this.g4303b = g4303b;
        setG4303cd(g4303b.equals("1") ? this.g4303cd : "");
        setG4303cm(g4303b.equals("1") ? this.g4303cm : "");
        notifyPropertyChanged(BR.g4303b);
    }

    @Bindable
    public String getG4303cd() {
        return g4303cd;
    }

    public void setG4303cd(String g4303cd) {
        this.g4303cd = g4303cd;
        notifyPropertyChanged(BR.g4303cd);
    }

    @Bindable
    public String getG4303cm() {
        return g4303cm;
    }

    public void setG4303cm(String g4303cm) {
        this.g4303cm = g4303cm;
        notifyPropertyChanged(BR.g4303cm);
    }

    @Bindable
    public String getG4303d() {
        return g4303d;
    }

    public void setG4303d(String g4303d) {
        this.g4303d = g4303d;
        notifyPropertyChanged(BR.g4303d);
    }


    @Bindable
    public String getG4304a() {
        return g4304a;
    }

    public void setG4304a(String g4304a) {
        this.g4304a = g4304a;
        notifyPropertyChanged(BR.g4304a);
    }

    @Bindable
    public String getG4304b() {
        return g4304b;
    }

    public void setG4304b(String g4304b) {
        this.g4304b = g4304b;
        setG4304cd(g4304b.equals("1") ? this.g4304cd : "");
        setG4304cm(g4304b.equals("1") ? this.g4304cm : "");
        notifyPropertyChanged(BR.g4304b);
    }

    @Bindable
    public String getG4304cd() {
        return g4304cd;
    }

    public void setG4304cd(String g4304cd) {
        this.g4304cd = g4304cd;
        notifyPropertyChanged(BR.g4304cd);
    }

    @Bindable
    public String getG4304cm() {
        return g4304cm;
    }

    public void setG4304cm(String g4304cm) {
        this.g4304cm = g4304cm;
        notifyPropertyChanged(BR.g4304cm);
    }

    @Bindable
    public String getG4304d() {
        return g4304d;
    }

    public void setG4304d(String g4304d) {
        this.g4304d = g4304d;
        notifyPropertyChanged(BR.g4304d);
    }


    @Bindable
    public String getG4305a() {
        return g4305a;
    }

    public void setG4305a(String g4305a) {
        this.g4305a = g4305a;
        notifyPropertyChanged(BR.g4305a);
    }

    @Bindable
    public String getG4305b() {
        return g4305b;
    }

    public void setG4305b(String g4305b) {
        this.g4305b = g4305b;
        setG4305cd(g4305b.equals("1") ? this.g4305cd : "");
        setG4305cm(g4305b.equals("1") ? this.g4305cm : "");
        notifyPropertyChanged(BR.g4305b);
    }

    @Bindable
    public String getG4305cd() {
        return g4305cd;
    }

    public void setG4305cd(String g4305cd) {
        this.g4305cd = g4305cd;
        notifyPropertyChanged(BR.g4305cd);
    }

    @Bindable
    public String getG4305cm() {
        return g4305cm;
    }

    public void setG4305cm(String g4305cm) {
        this.g4305cm = g4305cm;
        notifyPropertyChanged(BR.g4305cm);
    }

    @Bindable
    public String getG4305d() {
        return g4305d;
    }

    public void setG4305d(String g4305d) {
        this.g4305d = g4305d;
        notifyPropertyChanged(BR.g4305d);
    }


    @Bindable
    public String getG4306a() {
        return g4306a;
    }

    public void setG4306a(String g4306a) {
        this.g4306a = g4306a;
        notifyPropertyChanged(BR.g4306a);
    }

    @Bindable
    public String getG4306b() {
        return g4306b;
    }

    public void setG4306b(String g4306b) {
        this.g4306b = g4306b;
        setG4306cd(g4306b.equals("1") ? this.g4306cd : "");
        setG4306cm(g4306b.equals("1") ? this.g4306cm : "");
        notifyPropertyChanged(BR.g4306b);
    }

    @Bindable
    public String getG4306cd() {
        return g4306cd;
    }

    public void setG4306cd(String g4306cd) {
        this.g4306cd = g4306cd;
        notifyPropertyChanged(BR.g4306cd);
    }

    @Bindable
    public String getG4306cm() {
        return g4306cm;
    }

    public void setG4306cm(String g4306cm) {
        this.g4306cm = g4306cm;
        notifyPropertyChanged(BR.g4306cm);
    }

    @Bindable
    public String getG4306d() {
        return g4306d;
    }

    public void setG4306d(String g4306d) {
        this.g4306d = g4306d;
        notifyPropertyChanged(BR.g4306d);
    }


    @Bindable
    public String getG4307a() {
        return g4307a;
    }

    public void setG4307a(String g4307a) {
        this.g4307a = g4307a;
        notifyPropertyChanged(BR.g4307a);
    }

    @Bindable
    public String getG4307b() {
        return g4307b;
    }

    public void setG4307b(String g4307b) {
        this.g4307b = g4307b;
        setG4307cd(g4307b.equals("1") ? this.g4307cd : "");
        setG4307cm(g4307b.equals("1") ? this.g4307cm : "");
        notifyPropertyChanged(BR.g4307b);
    }

    @Bindable
    public String getG4307cd() {
        return g4307cd;
    }

    public void setG4307cd(String g4307cd) {
        this.g4307cd = g4307cd;
        notifyPropertyChanged(BR.g4307cd);
    }

    @Bindable
    public String getG4307cm() {
        return g4307cm;
    }

    public void setG4307cm(String g4307cm) {
        this.g4307cm = g4307cm;
        notifyPropertyChanged(BR.g4307cm);
    }

    @Bindable
    public String getG4307d() {
        return g4307d;
    }

    public void setG4307d(String g4307d) {
        this.g4307d = g4307d;
        notifyPropertyChanged(BR.g4307d);
    }


    @Bindable
    public String getG4308a() {
        return g4308a;
    }

    public void setG4308a(String g4308a) {
        this.g4308a = g4308a;
        notifyPropertyChanged(BR.g4308a);
    }

    @Bindable
    public String getG4308b() {
        return g4308b;
    }

    public void setG4308b(String g4308b) {
        this.g4308b = g4308b;
        setG4308cd(g4308b.equals("1") ? this.g4308cd : "");
        setG4308cm(g4308b.equals("1") ? this.g4308cm : "");
        notifyPropertyChanged(BR.g4308b);
    }

    @Bindable
    public String getG4308cd() {
        return g4308cd;
    }

    public void setG4308cd(String g4308cd) {
        this.g4308cd = g4308cd;
        notifyPropertyChanged(BR.g4308cd);
    }

    @Bindable
    public String getG4308cm() {
        return g4308cm;
    }

    public void setG4308cm(String g4308cm) {
        this.g4308cm = g4308cm;
        notifyPropertyChanged(BR.g4308cm);
    }

    @Bindable
    public String getG4308d() {
        return g4308d;
    }

    public void setG4308d(String g4308d) {
        this.g4308d = g4308d;
        notifyPropertyChanged(BR.g4308d);
    }


    @Bindable
    public String getG4309a() {
        return g4309a;
    }

    public void setG4309a(String g4309a) {
        this.g4309a = g4309a;
        notifyPropertyChanged(BR.g4309a);
    }

    @Bindable
    public String getG4309b() {
        return g4309b;
    }

    public void setG4309b(String g4309b) {
        this.g4309b = g4309b;
        setG4309cd(g4309b.equals("1") ? this.g4309cd : "");
        setG4309cm(g4309b.equals("1") ? this.g4309cm : "");
        notifyPropertyChanged(BR.g4309b);
    }

    @Bindable
    public String getG4309cd() {
        return g4309cd;
    }

    public void setG4309cd(String g4309cd) {
        this.g4309cd = g4309cd;
        notifyPropertyChanged(BR.g4309cd);
    }

    @Bindable
    public String getG4309cm() {
        return g4309cm;
    }

    public void setG4309cm(String g4309cm) {
        this.g4309cm = g4309cm;
        notifyPropertyChanged(BR.g4309cm);
    }

    @Bindable
    public String getG4309d() {
        return g4309d;
    }

    public void setG4309d(String g4309d) {
        this.g4309d = g4309d;
        notifyPropertyChanged(BR.g4309d);
    }


    @Bindable
    public String getG4310a() {
        return g4310a;
    }

    public void setG4310a(String g4310a) {
        this.g4310a = g4310a;
        notifyPropertyChanged(BR.g4310a);
    }

    @Bindable
    public String getG4310b() {
        return g4310b;
    }

    public void setG4310b(String g4310b) {
        this.g4310b = g4310b;
        setG4310cd(g4310b.equals("1") ? this.g4310cd : "");
        setG4310cm(g4310b.equals("1") ? this.g4310cm : "");
        notifyPropertyChanged(BR.g4310b);
    }

    @Bindable
    public String getG4310cd() {
        return g4310cd;
    }

    public void setG4310cd(String g4310cd) {
        this.g4310cd = g4310cd;
        notifyPropertyChanged(BR.g4310cd);
    }

    @Bindable
    public String getG4310cm() {
        return g4310cm;
    }

    public void setG4310cm(String g4310cm) {
        this.g4310cm = g4310cm;
        notifyPropertyChanged(BR.g4310cm);
    }

    @Bindable
    public String getG4310d() {
        return g4310d;
    }

    public void setG4310d(String g4310d) {
        this.g4310d = g4310d;
        notifyPropertyChanged(BR.g4310d);
    }


    @Bindable
    public String getG4311a() {
        return g4311a;
    }

    public void setG4311a(String g4311a) {
        this.g4311a = g4311a;
        notifyPropertyChanged(BR.g4311a);
    }

    @Bindable
    public String getG4311b() {
        return g4311b;
    }

    public void setG4311b(String g4311b) {
        this.g4311b = g4311b;
        setG4311cd(g4311b.equals("1") ? this.g4311cd : "");
        setG4311cm(g4311b.equals("1") ? this.g4311cm : "");
        notifyPropertyChanged(BR.g4311b);
    }

    @Bindable
    public String getG4311cd() {
        return g4311cd;
    }

    public void setG4311cd(String g4311cd) {
        this.g4311cd = g4311cd;
        notifyPropertyChanged(BR.g4311cd);
    }

    @Bindable
    public String getG4311cm() {
        return g4311cm;
    }

    public void setG4311cm(String g4311cm) {
        this.g4311cm = g4311cm;
        notifyPropertyChanged(BR.g4311cm);
    }

    @Bindable
    public String getG4311d() {
        return g4311d;
    }

    public void setG4311d(String g4311d) {
        this.g4311d = g4311d;
        notifyPropertyChanged(BR.g4311d);
    }


    @Bindable
    public String getG4312a() {
        return g4312a;
    }

    public void setG4312a(String g4312a) {
        this.g4312a = g4312a;
        notifyPropertyChanged(BR.g4312a);
    }

    @Bindable
    public String getG4312b() {
        return g4312b;
    }

    public void setG4312b(String g4312b) {
        this.g4312b = g4312b;
        setG4312cd(g4312b.equals("1") ? this.g4312cd : "");
        setG4312cm(g4312b.equals("1") ? this.g4312cm : "");
        notifyPropertyChanged(BR.g4312b);
    }

    @Bindable
    public String getG4312cd() {
        return g4312cd;
    }

    public void setG4312cd(String g4312cd) {
        this.g4312cd = g4312cd;
        notifyPropertyChanged(BR.g4312cd);
    }

    @Bindable
    public String getG4312cm() {
        return g4312cm;
    }

    public void setG4312cm(String g4312cm) {
        this.g4312cm = g4312cm;
        notifyPropertyChanged(BR.g4312cm);
    }

    @Bindable
    public String getG4312d() {
        return g4312d;
    }

    public void setG4312d(String g4312d) {
        this.g4312d = g4312d;
        notifyPropertyChanged(BR.g4312d);
    }


    @Bindable
    public String getG4313a() {
        return g4313a;
    }

    public void setG4313a(String g4313a) {
        this.g4313a = g4313a;
        notifyPropertyChanged(BR.g4313a);
    }

    @Bindable
    public String getG4313b() {
        return g4313b;
    }

    public void setG4313b(String g4313b) {
        this.g4313b = g4313b;
        setG4313cd(g4313b.equals("1") ? this.g4313cd : "");
        setG4313cm(g4313b.equals("1") ? this.g4313cm : "");
        notifyPropertyChanged(BR.g4313b);
    }

    @Bindable
    public String getG4313cd() {
        return g4313cd;
    }

    public void setG4313cd(String g4313cd) {
        this.g4313cd = g4313cd;
        notifyPropertyChanged(BR.g4313cd);
    }

    @Bindable
    public String getG4313cm() {
        return g4313cm;
    }

    public void setG4313cm(String g4313cm) {
        this.g4313cm = g4313cm;
        notifyPropertyChanged(BR.g4313cm);
    }

    @Bindable
    public String getG4313d() {
        return g4313d;
    }

    public void setG4313d(String g4313d) {
        this.g4313d = g4313d;
        notifyPropertyChanged(BR.g4313d);
    }


    @Bindable
    public String getG4314a() {
        return g4314a;
    }

    public void setG4314a(String g4314a) {
        this.g4314a = g4314a;
        notifyPropertyChanged(BR.g4314a);
    }

    @Bindable
    public String getG4314b() {
        return g4314b;
    }

    public void setG4314b(String g4314b) {
        this.g4314b = g4314b;
        setG4314cd(g4314b.equals("1") ? this.g4314cd : "");
        setG4314cm(g4314b.equals("1") ? this.g4314cm : "");
        notifyPropertyChanged(BR.g4314b);
    }

    @Bindable
    public String getG4314cd() {
        return g4314cd;
    }

    public void setG4314cd(String g4314cd) {
        this.g4314cd = g4314cd;
        notifyPropertyChanged(BR.g4314cd);
    }

    @Bindable
    public String getG4314cm() {
        return g4314cm;
    }

    public void setG4314cm(String g4314cm) {
        this.g4314cm = g4314cm;
        notifyPropertyChanged(BR.g4314cm);
    }

    @Bindable
    public String getG4314d() {
        return g4314d;
    }

    public void setG4314d(String g4314d) {
        this.g4314d = g4314d;
        notifyPropertyChanged(BR.g4314d);
    }


    @Bindable
    public String getG4315a() {
        return g4315a;
    }

    public void setG4315a(String g4315a) {
        this.g4315a = g4315a;
        notifyPropertyChanged(BR.g4315a);
    }

    @Bindable
    public String getG4315b() {
        return g4315b;
    }

    public void setG4315b(String g4315b) {
        this.g4315b = g4315b;
        setG4315cd(g4315b.equals("1") ? this.g4315cd : "");
        setG4315cm(g4315b.equals("1") ? this.g4315cm : "");
        notifyPropertyChanged(BR.g4315b);
    }

    @Bindable
    public String getG4315cd() {
        return g4315cd;
    }

    public void setG4315cd(String g4315cd) {
        this.g4315cd = g4315cd;
        notifyPropertyChanged(BR.g4315cd);
    }

    @Bindable
    public String getG4315cm() {
        return g4315cm;
    }

    public void setG4315cm(String g4315cm) {
        this.g4315cm = g4315cm;
        notifyPropertyChanged(BR.g4315cm);
    }

    @Bindable
    public String getG4315d() {
        return g4315d;
    }

    public void setG4315d(String g4315d) {
        this.g4315d = g4315d;
        notifyPropertyChanged(BR.g4315d);
    }


    @Bindable
    public String getG4316a() {
        return g4316a;
    }

    public void setG4316a(String g4316a) {
        this.g4316a = g4316a;
        notifyPropertyChanged(BR.g4316a);
    }

    @Bindable
    public String getG4316b() {
        return g4316b;
    }

    public void setG4316b(String g4316b) {
        this.g4316b = g4316b;
        setG4316cd(g4316b.equals("1") ? this.g4316cd : "");
        setG4316cm(g4316b.equals("1") ? this.g4316cm : "");
        notifyPropertyChanged(BR.g4316b);
    }

    @Bindable
    public String getG4316cd() {
        return g4316cd;
    }

    public void setG4316cd(String g4316cd) {
        this.g4316cd = g4316cd;
        notifyPropertyChanged(BR.g4316cd);
    }

    @Bindable
    public String getG4316cm() {
        return g4316cm;
    }

    public void setG4316cm(String g4316cm) {
        this.g4316cm = g4316cm;
        notifyPropertyChanged(BR.g4316cm);
    }

    @Bindable
    public String getG4316d() {
        return g4316d;
    }

    public void setG4316d(String g4316d) {
        this.g4316d = g4316d;
        notifyPropertyChanged(BR.g4316d);
    }


    @Bindable
    public String getG4317a() {
        return g4317a;
    }

    public void setG4317a(String g4317a) {
        this.g4317a = g4317a;
        notifyPropertyChanged(BR.g4317a);
    }

    @Bindable
    public String getG4317b() {
        return g4317b;
    }

    public void setG4317b(String g4317b) {
        this.g4317b = g4317b;
        setG4317cd(g4317b.equals("1") ? this.g4317cd : "");
        setG4317cm(g4317b.equals("1") ? this.g4317cm : "");
        notifyPropertyChanged(BR.g4317b);
    }

    @Bindable
    public String getG4317cd() {
        return g4317cd;
    }

    public void setG4317cd(String g4317cd) {
        this.g4317cd = g4317cd;
        notifyPropertyChanged(BR.g4317cd);
    }

    @Bindable
    public String getG4317cm() {
        return g4317cm;
    }

    public void setG4317cm(String g4317cm) {
        this.g4317cm = g4317cm;
        notifyPropertyChanged(BR.g4317cm);
    }

    @Bindable
    public String getG4317d() {
        return g4317d;
    }

    public void setG4317d(String g4317d) {
        this.g4317d = g4317d;
        notifyPropertyChanged(BR.g4317d);
    }


    @Bindable
    public String getG4318a() {
        return g4318a;
    }

    public void setG4318a(String g4318a) {
        this.g4318a = g4318a;
        notifyPropertyChanged(BR.g4318a);
    }

    @Bindable
    public String getG4318b() {
        return g4318b;
    }

    public void setG4318b(String g4318b) {
        this.g4318b = g4318b;
        setG4318cd(g4318b.equals("1") ? this.g4318cd : "");
        setG4318cm(g4318b.equals("1") ? this.g4318cm : "");
        notifyPropertyChanged(BR.g4318b);
    }

    @Bindable
    public String getG4318cd() {
        return g4318cd;
    }

    public void setG4318cd(String g4318cd) {
        this.g4318cd = g4318cd;
        notifyPropertyChanged(BR.g4318cd);
    }

    @Bindable
    public String getG4318cm() {
        return g4318cm;
    }

    public void setG4318cm(String g4318cm) {
        this.g4318cm = g4318cm;
        notifyPropertyChanged(BR.g4318cm);
    }

    @Bindable
    public String getG4318d() {
        return g4318d;
    }

    public void setG4318d(String g4318d) {
        this.g4318d = g4318d;
        notifyPropertyChanged(BR.g4318d);
    }


    @Bindable
    public String getG4319a() {
        return g4319a;
    }

    public void setG4319a(String g4319a) {
        this.g4319a = g4319a;
        notifyPropertyChanged(BR.g4319a);
    }

    @Bindable
    public String getG4319b() {
        return g4319b;
    }

    public void setG4319b(String g4319b) {
        this.g4319b = g4319b;
        setG4319cd(g4319b.equals("1") ? this.g4319cd : "");
        setG4319cm(g4319b.equals("1") ? this.g4319cm : "");
        notifyPropertyChanged(BR.g4319b);
    }

    @Bindable
    public String getG4319cd() {
        return g4319cd;
    }

    public void setG4319cd(String g4319cd) {
        this.g4319cd = g4319cd;
        notifyPropertyChanged(BR.g4319cd);
    }

    @Bindable
    public String getG4319cm() {
        return g4319cm;
    }

    public void setG4319cm(String g4319cm) {
        this.g4319cm = g4319cm;
        notifyPropertyChanged(BR.g4319cm);
    }

    @Bindable
    public String getG4319d() {
        return g4319d;
    }

    public void setG4319d(String g4319d) {
        this.g4319d = g4319d;
        notifyPropertyChanged(BR.g4319d);
    }


    @Bindable
    public String getG4320a() {
        return g4320a;
    }

    public void setG4320a(String g4320a) {
        this.g4320a = g4320a;
        notifyPropertyChanged(BR.g4320a);
    }

    @Bindable
    public String getG4320b() {
        return g4320b;
    }

    public void setG4320b(String g4320b) {
        this.g4320b = g4320b;
        setG4320cd(g4320b.equals("1") ? this.g4320cd : "");
        setG4320cm(g4320b.equals("1") ? this.g4320cm : "");
        notifyPropertyChanged(BR.g4320b);
    }

    @Bindable
    public String getG4320cd() {
        return g4320cd;
    }

    public void setG4320cd(String g4320cd) {
        this.g4320cd = g4320cd;
        notifyPropertyChanged(BR.g4320cd);
    }

    @Bindable
    public String getG4320cm() {
        return g4320cm;
    }

    public void setG4320cm(String g4320cm) {
        this.g4320cm = g4320cm;
        notifyPropertyChanged(BR.g4320cm);
    }

    @Bindable
    public String getG4320d() {
        return g4320d;
    }

    public void setG4320d(String g4320d) {
        this.g4320d = g4320d;
        notifyPropertyChanged(BR.g4320d);
    }


    @Bindable
    public String getG4321a() {
        return g4321a;
    }

    public void setG4321a(String g4321a) {
        this.g4321a = g4321a;
        notifyPropertyChanged(BR.g4321a);
    }

    @Bindable
    public String getG4321b() {
        return g4321b;
    }

    public void setG4321b(String g4321b) {
        this.g4321b = g4321b;
        setG4321cd(g4321b.equals("1") ? this.g4321cd : "");
        setG4321cm(g4321b.equals("1") ? this.g4321cm : "");
        notifyPropertyChanged(BR.g4321b);
    }

    @Bindable
    public String getG4321cd() {
        return g4321cd;
    }

    public void setG4321cd(String g4321cd) {
        this.g4321cd = g4321cd;
        notifyPropertyChanged(BR.g4321cd);
    }

    @Bindable
    public String getG4321cm() {
        return g4321cm;
    }

    public void setG4321cm(String g4321cm) {
        this.g4321cm = g4321cm;
        notifyPropertyChanged(BR.g4321cm);
    }

    @Bindable
    public String getG4321d() {
        return g4321d;
    }

    public void setG4321d(String g4321d) {
        this.g4321d = g4321d;
        notifyPropertyChanged(BR.g4321d);
    }


    @Bindable
    public String getG4322a() {
        return g4322a;
    }

    public void setG4322a(String g4322a) {
        this.g4322a = g4322a;
        notifyPropertyChanged(BR.g4322a);
    }

    @Bindable
    public String getG4322b() {
        return g4322b;
    }

    public void setG4322b(String g4322b) {
        this.g4322b = g4322b;
        setG4322cd(g4322b.equals("1") ? this.g4322cd : "");
        setG4322cm(g4322b.equals("1") ? this.g4322cm : "");
        notifyPropertyChanged(BR.g4322b);
    }

    @Bindable
    public String getG4322cd() {
        return g4322cd;
    }

    public void setG4322cd(String g4322cd) {
        this.g4322cd = g4322cd;
        notifyPropertyChanged(BR.g4322cd);
    }

    @Bindable
    public String getG4322cm() {
        return g4322cm;
    }

    public void setG4322cm(String g4322cm) {
        this.g4322cm = g4322cm;
        notifyPropertyChanged(BR.g4322cm);
    }

    @Bindable
    public String getG4322d() {
        return g4322d;
    }

    public void setG4322d(String g4322d) {
        this.g4322d = g4322d;
        notifyPropertyChanged(BR.g4322d);
    }


    @Bindable
    public String getG4323a() {
        return g4323a;
    }

    public void setG4323a(String g4323a) {
        this.g4323a = g4323a;
        notifyPropertyChanged(BR.g4323a);
    }

    @Bindable
    public String getG4323b() {
        return g4323b;
    }

    public void setG4323b(String g4323b) {
        this.g4323b = g4323b;
        setG4323cd(g4323b.equals("1") ? this.g4323cd : "");
        setG4323cm(g4323b.equals("1") ? this.g4323cm : "");
        notifyPropertyChanged(BR.g4323b);
    }

    @Bindable
    public String getG4323cd() {
        return g4323cd;
    }

    public void setG4323cd(String g4323cd) {
        this.g4323cd = g4323cd;
        notifyPropertyChanged(BR.g4323cd);
    }

    @Bindable
    public String getG4323cm() {
        return g4323cm;
    }

    public void setG4323cm(String g4323cm) {
        this.g4323cm = g4323cm;
        notifyPropertyChanged(BR.g4323cm);
    }

    @Bindable
    public String getG4323d() {
        return g4323d;
    }

    public void setG4323d(String g4323d) {
        this.g4323d = g4323d;
        notifyPropertyChanged(BR.g4323d);
    }


    @Bindable
    public String getG4324a() {
        return g4324a;
    }

    public void setG4324a(String g4324a) {
        this.g4324a = g4324a;
        notifyPropertyChanged(BR.g4324a);
    }

    @Bindable
    public String getG4324b() {
        return g4324b;
    }

    public void setG4324b(String g4324b) {
        this.g4324b = g4324b;
        setG4324cd(g4324b.equals("1") ? this.g4324cd : "");
        setG4324cm(g4324b.equals("1") ? this.g4324cm : "");
        notifyPropertyChanged(BR.g4324b);
    }

    @Bindable
    public String getG4324cd() {
        return g4324cd;
    }

    public void setG4324cd(String g4324cd) {
        this.g4324cd = g4324cd;
        notifyPropertyChanged(BR.g4324cd);
    }

    @Bindable
    public String getG4324cm() {
        return g4324cm;
    }

    public void setG4324cm(String g4324cm) {
        this.g4324cm = g4324cm;
        notifyPropertyChanged(BR.g4324cm);
    }

    @Bindable
    public String getG4324d() {
        return g4324d;
    }

    public void setG4324d(String g4324d) {
        this.g4324d = g4324d;
        notifyPropertyChanged(BR.g4324d);
    }


    @Bindable
    public String getG4325a() {
        return g4325a;
    }

    public void setG4325a(String g4325a) {
        this.g4325a = g4325a;
        notifyPropertyChanged(BR.g4325a);
    }

    @Bindable
    public String getG4325b() {
        return g4325b;
    }

    public void setG4325b(String g4325b) {
        this.g4325b = g4325b;
        setG4325cd(g4325b.equals("1") ? this.g4325cd : "");
        setG4325cm(g4325b.equals("1") ? this.g4325cm : "");
        notifyPropertyChanged(BR.g4325b);
    }

    @Bindable
    public String getG4325cd() {
        return g4325cd;
    }

    public void setG4325cd(String g4325cd) {
        this.g4325cd = g4325cd;
        notifyPropertyChanged(BR.g4325cd);
    }

    @Bindable
    public String getG4325cm() {
        return g4325cm;
    }

    public void setG4325cm(String g4325cm) {
        this.g4325cm = g4325cm;
        notifyPropertyChanged(BR.g4325cm);
    }

    @Bindable
    public String getG4325d() {
        return g4325d;
    }

    public void setG4325d(String g4325d) {
        this.g4325d = g4325d;
        notifyPropertyChanged(BR.g4325d);
    }


    @Bindable
    public String getG4326a() {
        return g4326a;
    }

    public void setG4326a(String g4326a) {
        this.g4326a = g4326a;
        notifyPropertyChanged(BR.g4326a);
    }

    @Bindable
    public String getG4326b() {
        return g4326b;
    }

    public void setG4326b(String g4326b) {
        this.g4326b = g4326b;
        setG4326cd(g4326b.equals("1") ? this.g4326cd : "");
        setG4326cm(g4326b.equals("1") ? this.g4326cm : "");
        notifyPropertyChanged(BR.g4326b);
    }

    @Bindable
    public String getG4326cd() {
        return g4326cd;
    }

    public void setG4326cd(String g4326cd) {
        this.g4326cd = g4326cd;
        notifyPropertyChanged(BR.g4326cd);
    }

    @Bindable
    public String getG4326cm() {
        return g4326cm;
    }

    public void setG4326cm(String g4326cm) {
        this.g4326cm = g4326cm;
        notifyPropertyChanged(BR.g4326cm);
    }

    @Bindable
    public String getG4326d() {
        return g4326d;
    }

    public void setG4326d(String g4326d) {
        this.g4326d = g4326d;
        notifyPropertyChanged(BR.g4326d);
    }


    @Bindable
    public String getG4327a() {
        return g4327a;
    }

    public void setG4327a(String g4327a) {
        this.g4327a = g4327a;
        notifyPropertyChanged(BR.g4327a);
    }

    @Bindable
    public String getG4327b() {
        return g4327b;
    }

    public void setG4327b(String g4327b) {
        this.g4327b = g4327b;
        setG4327cd(g4327b.equals("1") ? this.g4327cd : "");
        setG4327cm(g4327b.equals("1") ? this.g4327cm : "");
        notifyPropertyChanged(BR.g4327b);
    }

    @Bindable
    public String getG4327cd() {
        return g4327cd;
    }

    public void setG4327cd(String g4327cd) {
        this.g4327cd = g4327cd;
        notifyPropertyChanged(BR.g4327cd);
    }

    @Bindable
    public String getG4327cm() {
        return g4327cm;
    }

    public void setG4327cm(String g4327cm) {
        this.g4327cm = g4327cm;
        notifyPropertyChanged(BR.g4327cm);
    }

    @Bindable
    public String getG4327d() {
        return g4327d;
    }

    public void setG4327d(String g4327d) {
        this.g4327d = g4327d;
        notifyPropertyChanged(BR.g4327d);
    }


    @Bindable
    public String getG4401a() {
        return g4401a;
    }

    public void setG4401a(String g4401a) {
        this.g4401a = g4401a;
        notifyPropertyChanged(BR.g4401a);
    }

    @Bindable
    public String getG4401b() {
        return g4401b;
    }

    public void setG4401b(String g4401b) {
        this.g4401b = g4401b;
        setG4401cd(g4401b.equals("1") ? this.g4401cd : "");
        setG4401cm(g4401b.equals("1") ? this.g4401cm : "");
        notifyPropertyChanged(BR.g4401b);
    }

    @Bindable
    public String getG4401cd() {
        return g4401cd;
    }

    public void setG4401cd(String g4401cd) {
        this.g4401cd = g4401cd;
        notifyPropertyChanged(BR.g4401cd);
    }

    @Bindable
    public String getG4401cm() {
        return g4401cm;
    }

    public void setG4401cm(String g4401cm) {
        this.g4401cm = g4401cm;
        notifyPropertyChanged(BR.g4401cm);
    }

    @Bindable
    public String getG4401d() {
        return g4401d;
    }

    public void setG4401d(String g4401d) {
        this.g4401d = g4401d;
        notifyPropertyChanged(BR.g4401d);
    }


    @Bindable
    public String getG4402a() {
        return g4402a;
    }

    public void setG4402a(String g4402a) {
        this.g4402a = g4402a;
        notifyPropertyChanged(BR.g4402a);
    }

    @Bindable
    public String getG4402b() {
        return g4402b;
    }

    public void setG4402b(String g4402b) {
        this.g4402b = g4402b;
        setG4402cd(g4402b.equals("1") ? this.g4402cd : "");
        setG4402cm(g4402b.equals("1") ? this.g4402cm : "");
        notifyPropertyChanged(BR.g4402b);
    }

    @Bindable
    public String getG4402cd() {
        return g4402cd;
    }

    public void setG4402cd(String g4402cd) {
        this.g4402cd = g4402cd;
        notifyPropertyChanged(BR.g4402cd);
    }

    @Bindable
    public String getG4402cm() {
        return g4402cm;
    }

    public void setG4402cm(String g4402cm) {
        this.g4402cm = g4402cm;
        notifyPropertyChanged(BR.g4402cm);
    }

    @Bindable
    public String getG4402d() {
        return g4402d;
    }

    public void setG4402d(String g4402d) {
        this.g4402d = g4402d;
        notifyPropertyChanged(BR.g4402d);
    }


    @Bindable
    public String getG4403a() {
        return g4403a;
    }

    public void setG4403a(String g4403a) {
        this.g4403a = g4403a;
        notifyPropertyChanged(BR.g4403a);
    }

    @Bindable
    public String getG4403b() {
        return g4403b;
    }

    public void setG4403b(String g4403b) {
        this.g4403b = g4403b;
        setG4403cd(g4403b.equals("1") ? this.g4403cd : "");
        setG4403cm(g4403b.equals("1") ? this.g4403cm : "");
        notifyPropertyChanged(BR.g4403b);
    }

    @Bindable
    public String getG4403cd() {
        return g4403cd;
    }

    public void setG4403cd(String g4403cd) {
        this.g4403cd = g4403cd;
        notifyPropertyChanged(BR.g4403cd);
    }

    @Bindable
    public String getG4403cm() {
        return g4403cm;
    }

    public void setG4403cm(String g4403cm) {
        this.g4403cm = g4403cm;
        notifyPropertyChanged(BR.g4403cm);
    }

    @Bindable
    public String getG4403d() {
        return g4403d;
    }

    public void setG4403d(String g4403d) {
        this.g4403d = g4403d;
        notifyPropertyChanged(BR.g4403d);
    }


    @Bindable
    public String getG4404a() {
        return g4404a;
    }

    public void setG4404a(String g4404a) {
        this.g4404a = g4404a;
        notifyPropertyChanged(BR.g4404a);
    }

    @Bindable
    public String getG4404b() {
        return g4404b;
    }

    public void setG4404b(String g4404b) {
        this.g4404b = g4404b;
        setG4404cd(g4404b.equals("1") ? this.g4404cd : "");
        setG4404cm(g4404b.equals("1") ? this.g4404cm : "");
        notifyPropertyChanged(BR.g4404b);
    }

    @Bindable
    public String getG4404cd() {
        return g4404cd;
    }

    public void setG4404cd(String g4404cd) {
        this.g4404cd = g4404cd;
        notifyPropertyChanged(BR.g4404cd);
    }

    @Bindable
    public String getG4404cm() {
        return g4404cm;
    }

    public void setG4404cm(String g4404cm) {
        this.g4404cm = g4404cm;
        notifyPropertyChanged(BR.g4404cm);
    }

    @Bindable
    public String getG4404d() {
        return g4404d;
    }

    public void setG4404d(String g4404d) {
        this.g4404d = g4404d;
        notifyPropertyChanged(BR.g4404d);
    }


    @Bindable
    public String getG4405a() {
        return g4405a;
    }

    public void setG4405a(String g4405a) {
        this.g4405a = g4405a;
        notifyPropertyChanged(BR.g4405a);
    }

    @Bindable
    public String getG4405b() {
        return g4405b;
    }

    public void setG4405b(String g4405b) {
        this.g4405b = g4405b;
        setG4405cd(g4405b.equals("1") ? this.g4405cd : "");
        setG4405cm(g4405b.equals("1") ? this.g4405cm : "");
        notifyPropertyChanged(BR.g4405b);
    }

    @Bindable
    public String getG4405cd() {
        return g4405cd;
    }

    public void setG4405cd(String g4405cd) {
        this.g4405cd = g4405cd;
        notifyPropertyChanged(BR.g4405cd);
    }

    @Bindable
    public String getG4405cm() {
        return g4405cm;
    }

    public void setG4405cm(String g4405cm) {
        this.g4405cm = g4405cm;
        notifyPropertyChanged(BR.g4405cm);
    }

    @Bindable
    public String getG4405d() {
        return g4405d;
    }

    public void setG4405d(String g4405d) {
        this.g4405d = g4405d;
        notifyPropertyChanged(BR.g4405d);
    }


    @Bindable
    public String getG4406a() {
        return g4406a;
    }

    public void setG4406a(String g4406a) {
        this.g4406a = g4406a;
        notifyPropertyChanged(BR.g4406a);
    }

    @Bindable
    public String getG4406b() {
        return g4406b;
    }

    public void setG4406b(String g4406b) {
        this.g4406b = g4406b;
        setG4406cd(g4406b.equals("1") ? this.g4406cd : "");
        setG4406cm(g4406b.equals("1") ? this.g4406cm : "");
        notifyPropertyChanged(BR.g4406b);
    }

    @Bindable
    public String getG4406cd() {
        return g4406cd;
    }

    public void setG4406cd(String g4406cd) {
        this.g4406cd = g4406cd;
        notifyPropertyChanged(BR.g4406cd);
    }

    @Bindable
    public String getG4406cm() {
        return g4406cm;
    }

    public void setG4406cm(String g4406cm) {
        this.g4406cm = g4406cm;
        notifyPropertyChanged(BR.g4406cm);
    }

    @Bindable
    public String getG4406d() {
        return g4406d;
    }

    public void setG4406d(String g4406d) {
        this.g4406d = g4406d;
        notifyPropertyChanged(BR.g4406d);
    }


    public ModuleG Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_UUID));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_UC_CODE));
        this.hfCode = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_HF_CODE));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SYNCED_DATE));
        sG1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SG1)));
        sG2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SG2)));
        sG3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SG3)));
        sG41Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SG41)));
        sG42Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SG42)));
        sG43Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SG43)));
        sG44Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SG44)));
        sG45Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SG45)));
        sG46Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(ModuleGTable.COLUMN_SG46)));
        return this;
    }

    public void sG1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g0101 = json.getString("g0101");
            this.g0101xx = json.getString("g0101xx");
            this.g0102a = json.getString("g0102a");
            this.g0102b = json.getString("g0102b");
            this.g0103 = json.getString("g0103");
            this.g0103xx = json.getString("g0103xx");
            this.g0104 = json.getString("g0104");
            this.g0105 = json.getString("g0105");
            this.g0105ax = json.getString("g0105ax");
            this.g0105bx = json.getString("g0105bx");
            this.g0105cx = json.getString("g0105cx");
            this.g0106 = json.getString("g0106");
            this.g0106xx = json.getString("g0106xx");
            this.g0107 = json.getString("g0107");
            this.g0107xx = json.getString("g0107xx");
            this.g0108a = json.getString("g0108a");
            this.g0108b = json.getString("g0108b");
            this.g0108c = json.getString("g0108c");
            this.g0109 = json.getString("g0109");
            this.g0110 = json.getString("g0110");
            this.g0110ax = json.getString("g0110ax");
            this.g0110bx = json.getString("g0110bx");
            this.g0110cx = json.getString("g0110cx");
            this.g0111 = json.getString("g0111");
            this.g01112 = json.getString("g01112");
            this.g01112xx = json.getString("g01112xx");
            this.g01113 = json.getString("g01113");
            this.g01114 = json.getString("g01114");
            this.g01115 = json.getString("g01115");
            this.g01116 = json.getString("g01116");
            this.g01117 = json.getString("g01117");
        }
    }

    public void sG2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g0201 = json.getString("g0201");
            this.g0202 = json.getString("g0202");
            this.g0203 = json.getString("g0203");
            this.g0203x = json.getString("g0203x");
            this.g0204 = json.getString("g0204");
            this.g0205 = json.getString("g0205");
            this.g0206 = json.getString("g0206");
            this.g0207 = json.getString("g0207");
            this.g0208a = json.getString("g0208a");
            this.g0208b = json.getString("g0208b");
            this.g0208c = json.getString("g0208c");
            this.g0208d = json.getString("g0208d");
            this.g0208e = json.getString("g0208e");
        }
    }

    public void sG3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g0301aa = json.getString("g0301aa");
            this.g0301ab = json.getString("g0301ab");
            this.g0301ba = json.getString("g0301ba");
            this.g0301bb = json.getString("g0301bb");
            this.g0301ca = json.getString("g0301ca");
            this.g0301cb = json.getString("g0301cb");
            this.g0302a10r = json.getString("g0302a10r");
            this.g0302a10i = json.getString("g0302a10i");
            this.g0302a10d = json.getString("g0302a10d");
            this.g0302a10b = json.getString("g0302a10b");
            this.g0302a20r = json.getString("g0302a20r");
            this.g0302a20i = json.getString("g0302a20i");
            this.g0302a20d = json.getString("g0302a20d");
            this.g0302a20b = json.getString("g0302a20b");
            this.g0302a30r = json.getString("g0302a30r");
            this.g0302a30i = json.getString("g0302a30i");
            this.g0302a30d = json.getString("g0302a30d");
            this.g0302a30b = json.getString("g0302a30b");
            this.g0302a40r = json.getString("g0302a40r");
            this.g0302a40i = json.getString("g0302a40i");
            this.g0302a40d = json.getString("g0302a40d");
            this.g0302a40b = json.getString("g0302a40b");
            this.g0302a50r = json.getString("g0302a50r");
            this.g0302a50i = json.getString("g0302a50i");
            this.g0302a50d = json.getString("g0302a50d");
            this.g0302a50b = json.getString("g0302a50b");
            this.g0302a60r = json.getString("g0302a60r");
            this.g0302a60i = json.getString("g0302a60i");
            this.g0302a60d = json.getString("g0302a60d");
            this.g0302a60b = json.getString("g0302a60b");
            this.g0302a70r = json.getString("g0302a70r");
            this.g0302a70i = json.getString("g0302a70i");
            this.g0302a70d = json.getString("g0302a70d");
            this.g0302a70b = json.getString("g0302a70b");
            this.g0302b10r = json.getString("g0302b10r");
            this.g0302b10i = json.getString("g0302b10i");
            this.g0302b10d = json.getString("g0302b10d");
            this.g0302b10b = json.getString("g0302b10b");
            this.g0302b20r = json.getString("g0302b20r");
            this.g0302b20i = json.getString("g0302b20i");
            this.g0302b20d = json.getString("g0302b20d");
            this.g0302b20b = json.getString("g0302b20b");
            this.g0302b30r = json.getString("g0302b30r");
            this.g0302b30i = json.getString("g0302b30i");
            this.g0302b30d = json.getString("g0302b30d");
            this.g0302b30b = json.getString("g0302b30b");
            this.g0302b40r = json.getString("g0302b40r");
            this.g0302b40i = json.getString("g0302b40i");
            this.g0302b40d = json.getString("g0302b40d");
            this.g0302b40b = json.getString("g0302b40b");
            this.g0302b50r = json.getString("g0302b50r");
            this.g0302b50i = json.getString("g0302b50i");
            this.g0302b50d = json.getString("g0302b50d");
            this.g0302b50b = json.getString("g0302b50b");
            this.g0302b60r = json.getString("g0302b60r");
            this.g0302b60i = json.getString("g0302b60i");
            this.g0302b60d = json.getString("g0302b60d");
            this.g0302b60b = json.getString("g0302b60b");
            this.g0302b70r = json.getString("g0302b70r");
            this.g0302b70i = json.getString("g0302b70i");
            this.g0302b70d = json.getString("g0302b70d");
            this.g0302b70b = json.getString("g0302b70b");
            this.g0302c10r = json.getString("g0302c10r");
            this.g0302c10i = json.getString("g0302c10i");
            this.g0302c10d = json.getString("g0302c10d");
            this.g0302c10b = json.getString("g0302c10b");
            this.g0302c20r = json.getString("g0302c20r");
            this.g0302c20i = json.getString("g0302c20i");
            this.g0302c20d = json.getString("g0302c20d");
            this.g0302c20b = json.getString("g0302c20b");
            this.g0302c30r = json.getString("g0302c30r");
            this.g0302c30i = json.getString("g0302c30i");
            this.g0302c30d = json.getString("g0302c30d");
            this.g0302c30b = json.getString("g0302c30b");
            this.g0302c40r = json.getString("g0302c40r");
            this.g0302c40i = json.getString("g0302c40i");
            this.g0302c40d = json.getString("g0302c40d");
            this.g0302c40b = json.getString("g0302c40b");
            this.g0302c50r = json.getString("g0302c50r");
            this.g0302c50i = json.getString("g0302c50i");
            this.g0302c50d = json.getString("g0302c50d");
            this.g0302c50b = json.getString("g0302c50b");
            this.g0302c60r = json.getString("g0302c60r");
            this.g0302c60i = json.getString("g0302c60i");
            this.g0302c60d = json.getString("g0302c60d");
            this.g0302c60b = json.getString("g0302c60b");
            this.g0302c70r = json.getString("g0302c70r");
            this.g0302c70i = json.getString("g0302c70i");
            this.g0302c70d = json.getString("g0302c70d");
            this.g0302c70b = json.getString("g0302c70b");
        }
    }

    public void sG41Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG41Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g4101a = json.getString("g4101a");
            this.g4101b = json.getString("g4101b");
            this.g4101cd = json.getString("g4101cd");
            this.g4101cm = json.getString("g4101cm");
            this.g4101d = json.getString("g4101d");
            this.g4102a = json.getString("g4102a");
            this.g4102b = json.getString("g4102b");
            this.g4102cd = json.getString("g4102cd");
            this.g4102cm = json.getString("g4102cm");
            this.g4102d = json.getString("g4102d");
            this.g4103 = json.getString("g4103");
            this.g4104a = json.getString("g4104a");
            this.g4104b = json.getString("g4104b");
            this.g4104cd = json.getString("g4104cd");
            this.g4104cm = json.getString("g4104cm");
            this.g4104d = json.getString("g4104d");
            this.g4105a = json.getString("g4105a");
            this.g4105b = json.getString("g4105b");
            this.g4105cd = json.getString("g4105cd");
            this.g4105cm = json.getString("g4105cm");
            this.g4105d = json.getString("g4105d");
            this.g4106a = json.getString("g4106a");
            this.g4106b = json.getString("g4106b");
            this.g4106cd = json.getString("g4106cd");
            this.g4106cm = json.getString("g4106cm");
            this.g4106d = json.getString("g4106d");
            this.g4107a = json.getString("g4107a");
            this.g4107b = json.getString("g4107b");
            this.g4107cd = json.getString("g4107cd");
            this.g4107cm = json.getString("g4107cm");
            this.g4107d = json.getString("g4107d");
            this.g4108a = json.getString("g4108a");
            this.g4108b = json.getString("g4108b");
            this.g4108cd = json.getString("g4108cd");
            this.g4108cm = json.getString("g4108cm");
            this.g4108d = json.getString("g4108d");
            this.g4109a = json.getString("g4109a");
            this.g4109b = json.getString("g4109b");
            this.g4109cd = json.getString("g4109cd");
            this.g4109cm = json.getString("g4109cm");
            this.g4109d = json.getString("g4109d");
        }
    }

    public void sG42Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG42Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g4110a = json.getString("g4110a");
            this.g4110b = json.getString("g4110b");
            this.g4110cd = json.getString("g4110cd");
            this.g4110cm = json.getString("g4110cm");
            this.g4110d = json.getString("g4110d");
            this.g4111a = json.getString("g4111a");
            this.g4111b = json.getString("g4111b");
            this.g4111cd = json.getString("g4111cd");
            this.g4111cm = json.getString("g4111cm");
            this.g4111d = json.getString("g4111d");
            this.g4112a = json.getString("g4112a");
            this.g4112b = json.getString("g4112b");
            this.g4112cd = json.getString("g4112cd");
            this.g4112cm = json.getString("g4112cm");
            this.g4112d = json.getString("g4112d");
            this.g4113a = json.getString("g4113a");
            this.g4113b = json.getString("g4113b");
            this.g4113cd = json.getString("g4113cd");
            this.g4113cm = json.getString("g4113cm");
            this.g4113d = json.getString("g4113d");
            this.g4114a = json.getString("g4114a");
            this.g4114b = json.getString("g4114b");
            this.g4114cd = json.getString("g4114cd");
            this.g4114cm = json.getString("g4114cm");
            this.g4114d = json.getString("g4114d");
            this.g4115a = json.getString("g4115a");
            this.g4115b = json.getString("g4115b");
            this.g4115cd = json.getString("g4115cd");
            this.g4115cm = json.getString("g4115cm");
            this.g4115d = json.getString("g4115d");
            this.g4116a = json.getString("g4116a");
            this.g4116b = json.getString("g4116b");
            this.g4116cd = json.getString("g4116cd");
            this.g4116cm = json.getString("g4116cm");
            this.g4116d = json.getString("g4116d");
            this.g4117a = json.getString("g4117a");
            this.g4117b = json.getString("g4117b");
            this.g4117cd = json.getString("g4117cd");
            this.g4117cm = json.getString("g4117cm");
            this.g4117d = json.getString("g4117d");
            this.g4118a = json.getString("g4118a");
            this.g4118b = json.getString("g4118b");
            this.g4118cd = json.getString("g4118cd");
            this.g4118cm = json.getString("g4118cm");
            this.g4118d = json.getString("g4118d");
            this.g4119a = json.getString("g4119a");
            this.g4119b = json.getString("g4119b");
            this.g4119cd = json.getString("g4119cd");
            this.g4119cm = json.getString("g4119cm");
            this.g4119d = json.getString("g4119d");
        }
    }

    public void sG43Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG43Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g4120a = json.getString("g4120a");
            this.g4120b = json.getString("g4120b");
            this.g4120cd = json.getString("g4120cd");
            this.g4120cm = json.getString("g4120cm");
            this.g4120d = json.getString("g4120d");
            this.g4121a = json.getString("g4121a");
            this.g4121b = json.getString("g4121b");
            this.g4121cd = json.getString("g4121cd");
            this.g4121cm = json.getString("g4121cm");
            this.g4121d = json.getString("g4121d");
            this.g4122a = json.getString("g4122a");
            this.g4122b = json.getString("g4122b");
            this.g4122cd = json.getString("g4122cd");
            this.g4122cm = json.getString("g4122cm");
            this.g4122d = json.getString("g4122d");
            this.g4123a = json.getString("g4123a");
            this.g4123b = json.getString("g4123b");
            this.g4123cd = json.getString("g4123cd");
            this.g4123cm = json.getString("g4123cm");
            this.g4123d = json.getString("g4123d");
            this.g4124a = json.getString("g4124a");
            this.g4124b = json.getString("g4124b");
            this.g4124cd = json.getString("g4124cd");
            this.g4124cm = json.getString("g4124cm");
            this.g4124d = json.getString("g4124d");
            this.g4125a = json.getString("g4125a");
            this.g4125b = json.getString("g4125b");
            this.g4125cd = json.getString("g4125cd");
            this.g4125cm = json.getString("g4125cm");
            this.g4125d = json.getString("g4125d");
            this.g4126a = json.getString("g4126a");
            this.g4126b = json.getString("g4126b");
            this.g4126cd = json.getString("g4126cd");
            this.g4126cm = json.getString("g4126cm");
            this.g4126d = json.getString("g4126d");
            this.g4127a = json.getString("g4127a");
            this.g4127b = json.getString("g4127b");
            this.g4127cd = json.getString("g4127cd");
            this.g4127cm = json.getString("g4127cm");
            this.g4127d = json.getString("g4127d");
            this.g4128a = json.getString("g4128a");
            this.g4128b = json.getString("g4128b");
            this.g4128cd = json.getString("g4128cd");
            this.g4128cm = json.getString("g4128cm");
            this.g4128d = json.getString("g4128d");
            this.g4129a = json.getString("g4129a");
            this.g4129b = json.getString("g4129b");
            this.g4129cd = json.getString("g4129cd");
            this.g4129cm = json.getString("g4129cm");
            this.g4129d = json.getString("g4129d");
        }
    }

    public void sG44Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG44Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g4130a = json.getString("g4130a");
            this.g4130b = json.getString("g4130b");
            this.g4130cd = json.getString("g4130cd");
            this.g4130cm = json.getString("g4130cm");
            this.g4130d = json.getString("g4130d");
            this.g4131a = json.getString("g4131a");
            this.g4131b = json.getString("g4131b");
            this.g4131cd = json.getString("g4131cd");
            this.g4131cm = json.getString("g4131cm");
            this.g4131d = json.getString("g4131d");
            this.g4132a = json.getString("g4132a");
            this.g4132b = json.getString("g4132b");
            this.g4132cd = json.getString("g4132cd");
            this.g4132cm = json.getString("g4132cm");
            this.g4132d = json.getString("g4132d");
            this.g4133a = json.getString("g4133a");
            this.g4133b = json.getString("g4133b");
            this.g4133cd = json.getString("g4133cd");
            this.g4133cm = json.getString("g4133cm");
            this.g4133d = json.getString("g4133d");
            this.g4134a = json.getString("g4134a");
            this.g4134b = json.getString("g4134b");
            this.g4134cd = json.getString("g4134cd");
            this.g4134cm = json.getString("g4134cm");
            this.g4134d = json.getString("g4134d");
            this.g4135a = json.getString("g4135a");
            this.g4135b = json.getString("g4135b");
            this.g4135cd = json.getString("g4135cd");
            this.g4135cm = json.getString("g4135cm");
            this.g4135d = json.getString("g4135d");
            this.g4136a = json.getString("g4136a");
            this.g4136b = json.getString("g4136b");
            this.g4136cd = json.getString("g4136cd");
            this.g4136cm = json.getString("g4136cm");
            this.g4136d = json.getString("g4136d");
            this.g4137a = json.getString("g4137a");
            this.g4137b = json.getString("g4137b");
            this.g4137cd = json.getString("g4137cd");
            this.g4137cm = json.getString("g4137cm");
            this.g4137d = json.getString("g4137d");
            this.g4138a = json.getString("g4138a");
            this.g4138b = json.getString("g4138b");
            this.g4138cd = json.getString("g4138cd");
            this.g4138cm = json.getString("g4138cm");
            this.g4138d = json.getString("g4138d");
            this.g4139a = json.getString("g4139a");
            this.g4139b = json.getString("g4139b");
            this.g4139cd = json.getString("g4139cd");
            this.g4139cm = json.getString("g4139cm");
            this.g4139d = json.getString("g4139d");
            this.g4140a = json.getString("g4140a");
            this.g4140b = json.getString("g4140b");
            this.g4140cd = json.getString("g4140cd");
            this.g4140cm = json.getString("g4140cm");
            this.g4140d = json.getString("g4140d");
            this.g4141a = json.getString("g4141a");
            this.g4141b = json.getString("g4141b");
            this.g4141cd = json.getString("g4141cd");
            this.g4141cm = json.getString("g4141cm");
            this.g4141d = json.getString("g4141d");
            this.g4142a = json.getString("g4142a");
            this.g4142b = json.getString("g4142b");
            this.g4142cd = json.getString("g4142cd");
            this.g4142cm = json.getString("g4142cm");
            this.g4142d = json.getString("g4142d");
            this.g4143a = json.getString("g4143a");
            this.g4143b = json.getString("g4143b");
            this.g4143cd = json.getString("g4143cd");
            this.g4143cm = json.getString("g4143cm");
            this.g4143d = json.getString("g4143d");
            this.g4144a = json.getString("g4144a");
            this.g4144b = json.getString("g4144b");
            this.g4144cd = json.getString("g4144cd");
            this.g4144cm = json.getString("g4144cm");
            this.g4144d = json.getString("g4144d");
        }
    }

    public void sG45Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG45Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g4201a = json.getString("g4201a");
            this.g4201b = json.getString("g4201b");
            this.g4201cd = json.getString("g4201cd");
            this.g4201cm = json.getString("g4201cm");
            this.g4201d = json.getString("g4201d");
            this.g4202a = json.getString("g4202a");
            this.g4202b = json.getString("g4202b");
            this.g4202cd = json.getString("g4202cd");
            this.g4202cm = json.getString("g4202cm");
            this.g4202d = json.getString("g4202d");
            this.g4203a = json.getString("g4203a");
            this.g4203b = json.getString("g4203b");
            this.g4203cd = json.getString("g4203cd");
            this.g4203cm = json.getString("g4203cm");
            this.g4203d = json.getString("g4203d");
            this.g4204a = json.getString("g4204a");
            this.g4204b = json.getString("g4204b");
            this.g4204cd = json.getString("g4204cd");
            this.g4204cm = json.getString("g4204cm");
            this.g4204d = json.getString("g4204d");
            this.g4205a = json.getString("g4205a");
            this.g4205b = json.getString("g4205b");
            this.g4205cd = json.getString("g4205cd");
            this.g4205cm = json.getString("g4205cm");
            this.g4205d = json.getString("g4205d");
            this.g4206a = json.getString("g4206a");
            this.g4206b = json.getString("g4206b");
            this.g4206cd = json.getString("g4206cd");
            this.g4206cm = json.getString("g4206cm");
            this.g4206d = json.getString("g4206d");
            this.g4207a = json.getString("g4207a");
            this.g4207b = json.getString("g4207b");
            this.g4207cd = json.getString("g4207cd");
            this.g4207cm = json.getString("g4207cm");
            this.g4207d = json.getString("g4207d");
            this.g4208a = json.getString("g4208a");
            this.g4208b = json.getString("g4208b");
            this.g4208cd = json.getString("g4208cd");
            this.g4208cm = json.getString("g4208cm");
            this.g4208d = json.getString("g4208d");
            this.g4209a = json.getString("g4209a");
            this.g4209b = json.getString("g4209b");
            this.g4209cd = json.getString("g4209cd");
            this.g4209cm = json.getString("g4209cm");
            this.g4209d = json.getString("g4209d");
            this.g4210a = json.getString("g4210a");
            this.g4210b = json.getString("g4210b");
            this.g4210cd = json.getString("g4210cd");
            this.g4210cm = json.getString("g4210cm");
            this.g4210d = json.getString("g4210d");
        }
    }

    public void sG46Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG46Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g4301a = json.getString("g4301a");
            this.g4301b = json.getString("g4301b");
            this.g4301cd = json.getString("g4301cd");
            this.g4301cm = json.getString("g4301cm");
            this.g4301d = json.getString("g4301d");
            this.g4302a = json.getString("g4302a");
            this.g4302b = json.getString("g4302b");
            this.g4302cd = json.getString("g4302cd");
            this.g4302cm = json.getString("g4302cm");
            this.g4302d = json.getString("g4302d");
            this.g4303a = json.getString("g4303a");
            this.g4303b = json.getString("g4303b");
            this.g4303cd = json.getString("g4303cd");
            this.g4303cm = json.getString("g4303cm");
            this.g4303d = json.getString("g4303d");
            this.g4304a = json.getString("g4304a");
            this.g4304b = json.getString("g4304b");
            this.g4304cd = json.getString("g4304cd");
            this.g4304cm = json.getString("g4304cm");
            this.g4304d = json.getString("g4304d");
            this.g4305a = json.getString("g4305a");
            this.g4305b = json.getString("g4305b");
            this.g4305cd = json.getString("g4305cd");
            this.g4305cm = json.getString("g4305cm");
            this.g4305d = json.getString("g4305d");
            this.g4306a = json.getString("g4306a");
            this.g4306b = json.getString("g4306b");
            this.g4306cd = json.getString("g4306cd");
            this.g4306cm = json.getString("g4306cm");
            this.g4306d = json.getString("g4306d");
            this.g4307a = json.getString("g4307a");
            this.g4307b = json.getString("g4307b");
            this.g4307cd = json.getString("g4307cd");
            this.g4307cm = json.getString("g4307cm");
            this.g4307d = json.getString("g4307d");
            this.g4308a = json.getString("g4308a");
            this.g4308b = json.getString("g4308b");
            this.g4308cd = json.getString("g4308cd");
            this.g4308cm = json.getString("g4308cm");
            this.g4308d = json.getString("g4308d");
            this.g4309a = json.getString("g4309a");
            this.g4309b = json.getString("g4309b");
            this.g4309cd = json.getString("g4309cd");
            this.g4309cm = json.getString("g4309cm");
            this.g4309d = json.getString("g4309d");
            this.g4310a = json.getString("g4310a");
            this.g4310b = json.getString("g4310b");
            this.g4310cd = json.getString("g4310cd");
            this.g4310cm = json.getString("g4310cm");
            this.g4310d = json.getString("g4310d");
            this.g4311a = json.getString("g4311a");
            this.g4311b = json.getString("g4311b");
            this.g4311cd = json.getString("g4311cd");
            this.g4311cm = json.getString("g4311cm");
            this.g4311d = json.getString("g4311d");
            this.g4312a = json.getString("g4312a");
            this.g4312b = json.getString("g4312b");
            this.g4312cd = json.getString("g4312cd");
            this.g4312cm = json.getString("g4312cm");
            this.g4312d = json.getString("g4312d");
            this.g4313a = json.getString("g4313a");
            this.g4313b = json.getString("g4313b");
            this.g4313cd = json.getString("g4313cd");
            this.g4313cm = json.getString("g4313cm");
            this.g4313d = json.getString("g4313d");
            this.g4314a = json.getString("g4314a");
            this.g4314b = json.getString("g4314b");
            this.g4314cd = json.getString("g4314cd");
            this.g4314cm = json.getString("g4314cm");
            this.g4314d = json.getString("g4314d");
            this.g4315a = json.getString("g4315a");
            this.g4315b = json.getString("g4315b");
            this.g4315cd = json.getString("g4315cd");
            this.g4315cm = json.getString("g4315cm");
            this.g4315d = json.getString("g4315d");
            this.g4316a = json.getString("g4316a");
            this.g4316b = json.getString("g4316b");
            this.g4316cd = json.getString("g4316cd");
            this.g4316cm = json.getString("g4316cm");
            this.g4316d = json.getString("g4316d");
            this.g4317a = json.getString("g4317a");
            this.g4317b = json.getString("g4317b");
            this.g4317cd = json.getString("g4317cd");
            this.g4317cm = json.getString("g4317cm");
            this.g4317d = json.getString("g4317d");
            this.g4318a = json.getString("g4318a");
            this.g4318b = json.getString("g4318b");
            this.g4318cd = json.getString("g4318cd");
            this.g4318cm = json.getString("g4318cm");
            this.g4318d = json.getString("g4318d");
            this.g4319a = json.getString("g4319a");
            this.g4319b = json.getString("g4319b");
            this.g4319cd = json.getString("g4319cd");
            this.g4319cm = json.getString("g4319cm");
            this.g4319d = json.getString("g4319d");
            this.g4320a = json.getString("g4320a");
            this.g4320b = json.getString("g4320b");
            this.g4320cd = json.getString("g4320cd");
            this.g4320cm = json.getString("g4320cm");
            this.g4320d = json.getString("g4320d");
            this.g4321a = json.getString("g4321a");
            this.g4321b = json.getString("g4321b");
            this.g4321cd = json.getString("g4321cd");
            this.g4321cm = json.getString("g4321cm");
            this.g4321d = json.getString("g4321d");
            this.g4322a = json.getString("g4322a");
            this.g4322b = json.getString("g4322b");
            this.g4322cd = json.getString("g4322cd");
            this.g4322cm = json.getString("g4322cm");
            this.g4322d = json.getString("g4322d");
            this.g4323a = json.getString("g4323a");
            this.g4323b = json.getString("g4323b");
            this.g4323cd = json.getString("g4323cd");
            this.g4323cm = json.getString("g4323cm");
            this.g4323d = json.getString("g4323d");
            this.g4324a = json.getString("g4324a");
            this.g4324b = json.getString("g4324b");
            this.g4324cd = json.getString("g4324cd");
            this.g4324cm = json.getString("g4324cm");
            this.g4324d = json.getString("g4324d");
            this.g4325a = json.getString("g4325a");
            this.g4325b = json.getString("g4325b");
            this.g4325cd = json.getString("g4325cd");
            this.g4325cm = json.getString("g4325cm");
            this.g4325d = json.getString("g4325d");
            this.g4326a = json.getString("g4326a");
            this.g4326b = json.getString("g4326b");
            this.g4326cd = json.getString("g4326cd");
            this.g4326cm = json.getString("g4326cm");
            this.g4326d = json.getString("g4326d");
            this.g4327a = json.getString("g4327a");
            this.g4327b = json.getString("g4327b");
            this.g4327cd = json.getString("g4327cd");
            this.g4327cm = json.getString("g4327cm");
            this.g4327d = json.getString("g4327d");
            this.g4401a = json.getString("g4401a");
            this.g4401b = json.getString("g4401b");
            this.g4401cd = json.getString("g4401cd");
            this.g4401cm = json.getString("g4401cm");
            this.g4401d = json.getString("g4401d");
            this.g4402a = json.getString("g4402a");
            this.g4402b = json.getString("g4402b");
            this.g4402cd = json.getString("g4402cd");
            this.g4402cm = json.getString("g4402cm");
            this.g4402d = json.getString("g4402d");
            this.g4403a = json.getString("g4403a");
            this.g4403b = json.getString("g4403b");
            this.g4403cd = json.getString("g4403cd");
            this.g4403cm = json.getString("g4403cm");
            this.g4403d = json.getString("g4403d");
            this.g4404a = json.getString("g4404a");
            this.g4404b = json.getString("g4404b");
            this.g4404cd = json.getString("g4404cd");
            this.g4404cm = json.getString("g4404cm");
            this.g4404d = json.getString("g4404d");
            this.g4405a = json.getString("g4405a");
            this.g4405b = json.getString("g4405b");
            this.g4405cd = json.getString("g4405cd");
            this.g4405cm = json.getString("g4405cm");
            this.g4405d = json.getString("g4405d");
            this.g4406a = json.getString("g4406a");
            this.g4406b = json.getString("g4406b");
            this.g4406cd = json.getString("g4406cd");
            this.g4406cm = json.getString("g4406cm");
            this.g4406d = json.getString("g4406d");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(ModuleGTable.COLUMN_ID, this.id);
        json.put(ModuleGTable.COLUMN_UID, this.uid);
        json.put(ModuleGTable.COLUMN_UUID, this.uuid);
        json.put(ModuleGTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(ModuleGTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(ModuleGTable.COLUMN_UC_CODE, this.ucCode);
        json.put(ModuleGTable.COLUMN_HF_CODE, this.hfCode);
        json.put(ModuleGTable.COLUMN_USERNAME, this.userName);
        json.put(ModuleGTable.COLUMN_SYSDATE, this.sysDate);
        json.put(ModuleGTable.COLUMN_DEVICEID, this.deviceId);
        json.put(ModuleGTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(ModuleGTable.COLUMN_ISTATUS, this.iStatus);
        json.put(ModuleGTable.COLUMN_SYNCED, this.synced);
        json.put(ModuleGTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(ModuleGTable.COLUMN_SG1, new JSONObject(sG1toString()));
        json.put(ModuleGTable.COLUMN_SG2, new JSONObject(sG2toString()));
        json.put(ModuleGTable.COLUMN_SG3, new JSONObject(sG3toString()));
        json.put(ModuleGTable.COLUMN_SG41, new JSONObject(sG41toString()));
        json.put(ModuleGTable.COLUMN_SG42, new JSONObject(sG42toString()));
        json.put(ModuleGTable.COLUMN_SG43, new JSONObject(sG43toString()));
        json.put(ModuleGTable.COLUMN_SG44, new JSONObject(sG44toString()));
        json.put(ModuleGTable.COLUMN_SG45, new JSONObject(sG45toString()));
        json.put(ModuleGTable.COLUMN_SG46, new JSONObject(sG46toString()));
        return json;
    }

    public String sG1toString() throws JSONException {
        Log.d(TAG, "sG1toString: ");
        JSONObject json = new JSONObject();
        json.put("g0101", g0101)
                .put("g0101xx", g0101xx)
                .put("g0102a", g0102a)
                .put("g0102b", g0102b)
                .put("g0103", g0103)
                .put("g0103xx", g0103xx)
                .put("g0104", g0104)
                .put("g0105", g0105)
                .put("g0105ax", g0105ax)
                .put("g0105bx", g0105bx)
                .put("g0105cx", g0105cx)
                .put("g0106", g0106)
                .put("g0106xx", g0106xx)
                .put("g0107", g0107)
                .put("g0107xx", g0107xx)
                .put("g0108a", g0108a)
                .put("g0108b", g0108b)
                .put("g0108c", g0108c)
                .put("g0109", g0109)
                .put("g0110", g0110)
                .put("g0110ax", g0110ax)
                .put("g0110bx", g0110bx)
                .put("g0110cx", g0110cx)
                .put("g0111", g0111)
                .put("g01112", g01112)
                .put("g01112xx", g01112xx)
                .put("g01113", g01113)
                .put("g01114", g01114)
                .put("g01115", g01115)
                .put("g01116", g01116)
                .put("g01117", g01117);
        return json.toString();
    }

    public String sG2toString() throws JSONException {
        Log.d(TAG, "sG2toString: ");
        JSONObject json = new JSONObject();
        json.put("g0201", g0201)
                .put("g0202", g0202)
                .put("g0203", g0203)
                .put("g0203x", g0203x)
                .put("g0204", g0204)
                .put("g0205", g0205)
                .put("g0206", g0206)
                .put("g0207", g0207)
                .put("g0208a", g0208a)
                .put("g0208b", g0208b)
                .put("g0208c", g0208c)
                .put("g0208d", g0208d)
                .put("g0208e", g0208e);
        return json.toString();
    }

    public String sG3toString() throws JSONException {
        Log.d(TAG, "sG3toString: ");
        JSONObject json = new JSONObject();
        json.put("g0301aa", g0301aa)
                .put("g0301ab", g0301ab)
                .put("g0301ba", g0301ba)
                .put("g0301bb", g0301bb)
                .put("g0301ca", g0301ca)
                .put("g0301cb", g0301cb)
                .put("g0302a10r", g0302a10r)
                .put("g0302a10i", g0302a10i)
                .put("g0302a10d", g0302a10d)
                .put("g0302a10b", g0302a10b)
                .put("g0302a20r", g0302a20r)
                .put("g0302a20i", g0302a20i)
                .put("g0302a20d", g0302a20d)
                .put("g0302a20b", g0302a20b)
                .put("g0302a30r", g0302a30r)
                .put("g0302a30i", g0302a30i)
                .put("g0302a30d", g0302a30d)
                .put("g0302a30b", g0302a30b)
                .put("g0302a40r", g0302a40r)
                .put("g0302a40i", g0302a40i)
                .put("g0302a40d", g0302a40d)
                .put("g0302a40b", g0302a40b)
                .put("g0302a50r", g0302a50r)
                .put("g0302a50i", g0302a50i)
                .put("g0302a50d", g0302a50d)
                .put("g0302a50b", g0302a50b)
                .put("g0302a60r", g0302a60r)
                .put("g0302a60i", g0302a60i)
                .put("g0302a60d", g0302a60d)
                .put("g0302a60b", g0302a60b)
                .put("g0302a70r", g0302a70r)
                .put("g0302a70i", g0302a70i)
                .put("g0302a70d", g0302a70d)
                .put("g0302a70b", g0302a70b)
                .put("g0302b10r", g0302b10r)
                .put("g0302b10i", g0302b10i)
                .put("g0302b10d", g0302b10d)
                .put("g0302b10b", g0302b10b)
                .put("g0302b20r", g0302b20r)
                .put("g0302b20i", g0302b20i)
                .put("g0302b20d", g0302b20d)
                .put("g0302b20b", g0302b20b)
                .put("g0302b30r", g0302b30r)
                .put("g0302b30i", g0302b30i)
                .put("g0302b30d", g0302b30d)
                .put("g0302b30b", g0302b30b)
                .put("g0302b40r", g0302b40r)
                .put("g0302b40i", g0302b40i)
                .put("g0302b40d", g0302b40d)
                .put("g0302b40b", g0302b40b)
                .put("g0302b50r", g0302b50r)
                .put("g0302b50i", g0302b50i)
                .put("g0302b50d", g0302b50d)
                .put("g0302b50b", g0302b50b)
                .put("g0302b60r", g0302b60r)
                .put("g0302b60i", g0302b60i)
                .put("g0302b60d", g0302b60d)
                .put("g0302b60b", g0302b60b)
                .put("g0302b70r", g0302b70r)
                .put("g0302b70i", g0302b70i)
                .put("g0302b70d", g0302b70d)
                .put("g0302b70b", g0302b70b)
                .put("g0302c10r", g0302c10r)
                .put("g0302c10i", g0302c10i)
                .put("g0302c10d", g0302c10d)
                .put("g0302c10b", g0302c10b)
                .put("g0302c20r", g0302c20r)
                .put("g0302c20i", g0302c20i)
                .put("g0302c20d", g0302c20d)
                .put("g0302c20b", g0302c20b)
                .put("g0302c30r", g0302c30r)
                .put("g0302c30i", g0302c30i)
                .put("g0302c30d", g0302c30d)
                .put("g0302c30b", g0302c30b)
                .put("g0302c40r", g0302c40r)
                .put("g0302c40i", g0302c40i)
                .put("g0302c40d", g0302c40d)
                .put("g0302c40b", g0302c40b)
                .put("g0302c50r", g0302c50r)
                .put("g0302c50i", g0302c50i)
                .put("g0302c50d", g0302c50d)
                .put("g0302c50b", g0302c50b)
                .put("g0302c60r", g0302c60r)
                .put("g0302c60i", g0302c60i)
                .put("g0302c60d", g0302c60d)
                .put("g0302c60b", g0302c60b)
                .put("g0302c70r", g0302c70r)
                .put("g0302c70i", g0302c70i)
                .put("g0302c70d", g0302c70d)
                .put("g0302c70b", g0302c70b);
        return json.toString();
    }

    public String sG41toString() throws JSONException {
        Log.d(TAG, "sG41toString: ");
        JSONObject json = new JSONObject();
        json.put("g4101a", g4101a)
                .put("g4101b", g4101b)
                .put("g4101cd", g4101cd)
                .put("g4101cm", g4101cm)
                .put("g4101d", g4101d)
                .put("g4102a", g4102a)
                .put("g4102b", g4102b)
                .put("g4102cd", g4102cd)
                .put("g4102cm", g4102cm)
                .put("g4102d", g4102d)
                .put("g4103", g4103)
                .put("g4104a", g4104a)
                .put("g4104b", g4104b)
                .put("g4104cd", g4104cd)
                .put("g4104cm", g4104cm)
                .put("g4104d", g4104d)
                .put("g4105a", g4105a)
                .put("g4105b", g4105b)
                .put("g4105cd", g4105cd)
                .put("g4105cm", g4105cm)
                .put("g4105d", g4105d)
                .put("g4106a", g4106a)
                .put("g4106b", g4106b)
                .put("g4106cd", g4106cd)
                .put("g4106cm", g4106cm)
                .put("g4106d", g4106d)
                .put("g4107a", g4107a)
                .put("g4107b", g4107b)
                .put("g4107cd", g4107cd)
                .put("g4107cm", g4107cm)
                .put("g4107d", g4107d)
                .put("g4108a", g4108a)
                .put("g4108b", g4108b)
                .put("g4108cd", g4108cd)
                .put("g4108cm", g4108cm)
                .put("g4108d", g4108d)
                .put("g4109a", g4109a)
                .put("g4109b", g4109b)
                .put("g4109cd", g4109cd)
                .put("g4109cm", g4109cm)
                .put("g4109d", g4109d);
        return json.toString();
    }

    public String sG42toString() throws JSONException {
        Log.d(TAG, "sG42toString: ");
        JSONObject json = new JSONObject();
        json.put("g4110a", g4110a)
                .put("g4110b", g4110b)
                .put("g4110cd", g4110cd)
                .put("g4110cm", g4110cm)
                .put("g4110d", g4110d)
                .put("g4111a", g4111a)
                .put("g4111b", g4111b)
                .put("g4111cd", g4111cd)
                .put("g4111cm", g4111cm)
                .put("g4111d", g4111d)
                .put("g4112a", g4112a)
                .put("g4112b", g4112b)
                .put("g4112cd", g4112cd)
                .put("g4112cm", g4112cm)
                .put("g4112d", g4112d)
                .put("g4113a", g4113a)
                .put("g4113b", g4113b)
                .put("g4113cd", g4113cd)
                .put("g4113cm", g4113cm)
                .put("g4113d", g4113d)
                .put("g4114a", g4114a)
                .put("g4114b", g4114b)
                .put("g4114cd", g4114cd)
                .put("g4114cm", g4114cm)
                .put("g4114d", g4114d)
                .put("g4115a", g4115a)
                .put("g4115b", g4115b)
                .put("g4115cd", g4115cd)
                .put("g4115cm", g4115cm)
                .put("g4115d", g4115d)
                .put("g4116a", g4116a)
                .put("g4116b", g4116b)
                .put("g4116cd", g4116cd)
                .put("g4116cm", g4116cm)
                .put("g4116d", g4116d)
                .put("g4117a", g4117a)
                .put("g4117b", g4117b)
                .put("g4117cd", g4117cd)
                .put("g4117cm", g4117cm)
                .put("g4117d", g4117d)
                .put("g4118a", g4118a)
                .put("g4118b", g4118b)
                .put("g4118cd", g4118cd)
                .put("g4118cm", g4118cm)
                .put("g4118d", g4118d)
                .put("g4119a", g4119a)
                .put("g4119b", g4119b)
                .put("g4119cd", g4119cd)
                .put("g4119cm", g4119cm)
                .put("g4119d", g4119d);
        return json.toString();
    }

    public String sG43toString() throws JSONException {
        Log.d(TAG, "sG43toString: ");
        JSONObject json = new JSONObject();
        json.put("g4120a", g4120a)
                .put("g4120b", g4120b)
                .put("g4120cd", g4120cd)
                .put("g4120cm", g4120cm)
                .put("g4120d", g4120d)
                .put("g4121a", g4121a)
                .put("g4121b", g4121b)
                .put("g4121cd", g4121cd)
                .put("g4121cm", g4121cm)
                .put("g4121d", g4121d)
                .put("g4122a", g4122a)
                .put("g4122b", g4122b)
                .put("g4122cd", g4122cd)
                .put("g4122cm", g4122cm)
                .put("g4122d", g4122d)
                .put("g4123a", g4123a)
                .put("g4123b", g4123b)
                .put("g4123cd", g4123cd)
                .put("g4123cm", g4123cm)
                .put("g4123d", g4123d)
                .put("g4124a", g4124a)
                .put("g4124b", g4124b)
                .put("g4124cd", g4124cd)
                .put("g4124cm", g4124cm)
                .put("g4124d", g4124d)
                .put("g4125a", g4125a)
                .put("g4125b", g4125b)
                .put("g4125cd", g4125cd)
                .put("g4125cm", g4125cm)
                .put("g4125d", g4125d)
                .put("g4126a", g4126a)
                .put("g4126b", g4126b)
                .put("g4126cd", g4126cd)
                .put("g4126cm", g4126cm)
                .put("g4126d", g4126d)
                .put("g4127a", g4127a)
                .put("g4127b", g4127b)
                .put("g4127cd", g4127cd)
                .put("g4127cm", g4127cm)
                .put("g4127d", g4127d)
                .put("g4128a", g4128a)
                .put("g4128b", g4128b)
                .put("g4128cd", g4128cd)
                .put("g4128cm", g4128cm)
                .put("g4128d", g4128d)
                .put("g4129a", g4129a)
                .put("g4129b", g4129b)
                .put("g4129cd", g4129cd)
                .put("g4129cm", g4129cm)
                .put("g4129d", g4129d);
        return json.toString();
    }

    public String sG44toString() throws JSONException {
        Log.d(TAG, "sG44toString: ");
        JSONObject json = new JSONObject();
        json.put("g4130a", g4130a)
                .put("g4130b", g4130b)
                .put("g4130cd", g4130cd)
                .put("g4130cm", g4130cm)
                .put("g4130d", g4130d)
                .put("g4131a", g4131a)
                .put("g4131b", g4131b)
                .put("g4131cd", g4131cd)
                .put("g4131cm", g4131cm)
                .put("g4131d", g4131d)
                .put("g4132a", g4132a)
                .put("g4132b", g4132b)
                .put("g4132cd", g4132cd)
                .put("g4132cm", g4132cm)
                .put("g4132d", g4132d)
                .put("g4133a", g4133a)
                .put("g4133b", g4133b)
                .put("g4133cd", g4133cd)
                .put("g4133cm", g4133cm)
                .put("g4133d", g4133d)
                .put("g4134a", g4134a)
                .put("g4134b", g4134b)
                .put("g4134cd", g4134cd)
                .put("g4134cm", g4134cm)
                .put("g4134d", g4134d)
                .put("g4135a", g4135a)
                .put("g4135b", g4135b)
                .put("g4135cd", g4135cd)
                .put("g4135cm", g4135cm)
                .put("g4135d", g4135d)
                .put("g4136a", g4136a)
                .put("g4136b", g4136b)
                .put("g4136cd", g4136cd)
                .put("g4136cm", g4136cm)
                .put("g4136d", g4136d)
                .put("g4137a", g4137a)
                .put("g4137b", g4137b)
                .put("g4137cd", g4137cd)
                .put("g4137cm", g4137cm)
                .put("g4137d", g4137d)
                .put("g4138a", g4138a)
                .put("g4138b", g4138b)
                .put("g4138cd", g4138cd)
                .put("g4138cm", g4138cm)
                .put("g4138d", g4138d)
                .put("g4139a", g4139a)
                .put("g4139b", g4139b)
                .put("g4139cd", g4139cd)
                .put("g4139cm", g4139cm)
                .put("g4139d", g4139d)
                .put("g4140a", g4140a)
                .put("g4140b", g4140b)
                .put("g4140cd", g4140cd)
                .put("g4140cm", g4140cm)
                .put("g4140d", g4140d)
                .put("g4141a", g4141a)
                .put("g4141b", g4141b)
                .put("g4141cd", g4141cd)
                .put("g4141cm", g4141cm)
                .put("g4141d", g4141d)
                .put("g4142a", g4142a)
                .put("g4142b", g4142b)
                .put("g4142cd", g4142cd)
                .put("g4142cm", g4142cm)
                .put("g4142d", g4142d)
                .put("g4143a", g4143a)
                .put("g4143b", g4143b)
                .put("g4143cd", g4143cd)
                .put("g4143cm", g4143cm)
                .put("g4143d", g4143d)
                .put("g4144a", g4144a)
                .put("g4144b", g4144b)
                .put("g4144cd", g4144cd)
                .put("g4144cm", g4144cm)
                .put("g4144d", g4144d);
        return json.toString();
    }

    public String sG45toString() throws JSONException {
        Log.d(TAG, "sG45toString: ");
        JSONObject json = new JSONObject();
        json.put("g4201a", g4201a)
                .put("g4201b", g4201b)
                .put("g4201cd", g4201cd)
                .put("g4201cm", g4201cm)
                .put("g4201d", g4201d)
                .put("g4202a", g4202a)
                .put("g4202b", g4202b)
                .put("g4202cd", g4202cd)
                .put("g4202cm", g4202cm)
                .put("g4202d", g4202d)
                .put("g4203a", g4203a)
                .put("g4203b", g4203b)
                .put("g4203cd", g4203cd)
                .put("g4203cm", g4203cm)
                .put("g4203d", g4203d)
                .put("g4204a", g4204a)
                .put("g4204b", g4204b)
                .put("g4204cd", g4204cd)
                .put("g4204cm", g4204cm)
                .put("g4204d", g4204d)
                .put("g4205a", g4205a)
                .put("g4205b", g4205b)
                .put("g4205cd", g4205cd)
                .put("g4205cm", g4205cm)
                .put("g4205d", g4205d)
                .put("g4206a", g4206a)
                .put("g4206b", g4206b)
                .put("g4206cd", g4206cd)
                .put("g4206cm", g4206cm)
                .put("g4206d", g4206d)
                .put("g4207a", g4207a)
                .put("g4207b", g4207b)
                .put("g4207cd", g4207cd)
                .put("g4207cm", g4207cm)
                .put("g4207d", g4207d)
                .put("g4208a", g4208a)
                .put("g4208b", g4208b)
                .put("g4208cd", g4208cd)
                .put("g4208cm", g4208cm)
                .put("g4208d", g4208d)
                .put("g4209a", g4209a)
                .put("g4209b", g4209b)
                .put("g4209cd", g4209cd)
                .put("g4209cm", g4209cm)
                .put("g4209d", g4209d)
                .put("g4210a", g4210a)
                .put("g4210b", g4210b)
                .put("g4210cd", g4210cd)
                .put("g4210cm", g4210cm)
                .put("g4210d", g4210d);
        return json.toString();
    }

    public String sG46toString() throws JSONException {
        Log.d(TAG, "sGtoString: ");
        JSONObject json = new JSONObject();
        json.put("g4301a", g4301a)
                .put("g4301b", g4301b)
                .put("g4301cd", g4301cd)
                .put("g4301cm", g4301cm)
                .put("g4301d", g4301d)
                .put("g4302a", g4302a)
                .put("g4302b", g4302b)
                .put("g4302cd", g4302cd)
                .put("g4302cm", g4302cm)
                .put("g4302d", g4302d)
                .put("g4303a", g4303a)
                .put("g4303b", g4303b)
                .put("g4303cd", g4303cd)
                .put("g4303cm", g4303cm)
                .put("g4303d", g4303d)
                .put("g4304a", g4304a)
                .put("g4304b", g4304b)
                .put("g4304cd", g4304cd)
                .put("g4304cm", g4304cm)
                .put("g4304d", g4304d)
                .put("g4305a", g4305a)
                .put("g4305b", g4305b)
                .put("g4305cd", g4305cd)
                .put("g4305cm", g4305cm)
                .put("g4305d", g4305d)
                .put("g4306a", g4306a)
                .put("g4306b", g4306b)
                .put("g4306cd", g4306cd)
                .put("g4306cm", g4306cm)
                .put("g4306d", g4306d)
                .put("g4307a", g4307a)
                .put("g4307b", g4307b)
                .put("g4307cd", g4307cd)
                .put("g4307cm", g4307cm)
                .put("g4307d", g4307d)
                .put("g4308a", g4308a)
                .put("g4308b", g4308b)
                .put("g4308cd", g4308cd)
                .put("g4308cm", g4308cm)
                .put("g4308d", g4308d)
                .put("g4309a", g4309a)
                .put("g4309b", g4309b)
                .put("g4309cd", g4309cd)
                .put("g4309cm", g4309cm)
                .put("g4309d", g4309d)
                .put("g4310a", g4310a)
                .put("g4310b", g4310b)
                .put("g4310cd", g4310cd)
                .put("g4310cm", g4310cm)
                .put("g4310d", g4310d)
                .put("g4311a", g4311a)
                .put("g4311b", g4311b)
                .put("g4311cd", g4311cd)
                .put("g4311cm", g4311cm)
                .put("g4311d", g4311d)
                .put("g4312a", g4312a)
                .put("g4312b", g4312b)
                .put("g4312cd", g4312cd)
                .put("g4312cm", g4312cm)
                .put("g4312d", g4312d)
                .put("g4313a", g4313a)
                .put("g4313b", g4313b)
                .put("g4313cd", g4313cd)
                .put("g4313cm", g4313cm)
                .put("g4313d", g4313d)
                .put("g4314a", g4314a)
                .put("g4314b", g4314b)
                .put("g4314cd", g4314cd)
                .put("g4314cm", g4314cm)
                .put("g4314d", g4314d)
                .put("g4315a", g4315a)
                .put("g4315b", g4315b)
                .put("g4315cd", g4315cd)
                .put("g4315cm", g4315cm)
                .put("g4315d", g4315d)
                .put("g4316a", g4316a)
                .put("g4316b", g4316b)
                .put("g4316cd", g4316cd)
                .put("g4316cm", g4316cm)
                .put("g4316d", g4316d)
                .put("g4317a", g4317a)
                .put("g4317b", g4317b)
                .put("g4317cd", g4317cd)
                .put("g4317cm", g4317cm)
                .put("g4317d", g4317d)
                .put("g4318a", g4318a)
                .put("g4318b", g4318b)
                .put("g4318cd", g4318cd)
                .put("g4318cm", g4318cm)
                .put("g4318d", g4318d)
                .put("g4319a", g4319a)
                .put("g4319b", g4319b)
                .put("g4319cd", g4319cd)
                .put("g4319cm", g4319cm)
                .put("g4319d", g4319d)
                .put("g4320a", g4320a)
                .put("g4320b", g4320b)
                .put("g4320cd", g4320cd)
                .put("g4320cm", g4320cm)
                .put("g4320d", g4320d)
                .put("g4321a", g4321a)
                .put("g4321b", g4321b)
                .put("g4321cd", g4321cd)
                .put("g4321cm", g4321cm)
                .put("g4321d", g4321d)
                .put("g4322a", g4322a)
                .put("g4322b", g4322b)
                .put("g4322cd", g4322cd)
                .put("g4322cm", g4322cm)
                .put("g4322d", g4322d)
                .put("g4323a", g4323a)
                .put("g4323b", g4323b)
                .put("g4323cd", g4323cd)
                .put("g4323cm", g4323cm)
                .put("g4323d", g4323d)
                .put("g4324a", g4324a)
                .put("g4324b", g4324b)
                .put("g4324cd", g4324cd)
                .put("g4324cm", g4324cm)
                .put("g4324d", g4324d)
                .put("g4325a", g4325a)
                .put("g4325b", g4325b)
                .put("g4325cd", g4325cd)
                .put("g4325cm", g4325cm)
                .put("g4325d", g4325d)
                .put("g4326a", g4326a)
                .put("g4326b", g4326b)
                .put("g4326cd", g4326cd)
                .put("g4326cm", g4326cm)
                .put("g4326d", g4326d)
                .put("g4327a", g4327a)
                .put("g4327b", g4327b)
                .put("g4327cd", g4327cd)
                .put("g4327cm", g4327cm)
                .put("g4327d", g4327d)
                .put("g4401a", g4401a)
                .put("g4401b", g4401b)
                .put("g4401cd", g4401cd)
                .put("g4401cm", g4401cm)
                .put("g4401d", g4401d)
                .put("g4402a", g4402a)
                .put("g4402b", g4402b)
                .put("g4402cd", g4402cd)
                .put("g4402cm", g4402cm)
                .put("g4402d", g4402d)
                .put("g4403a", g4403a)
                .put("g4403b", g4403b)
                .put("g4403cd", g4403cd)
                .put("g4403cm", g4403cm)
                .put("g4403d", g4403d)
                .put("g4404a", g4404a)
                .put("g4404b", g4404b)
                .put("g4404cd", g4404cd)
                .put("g4404cm", g4404cm)
                .put("g4404d", g4404d)
                .put("g4405a", g4405a)
                .put("g4405b", g4405b)
                .put("g4405cd", g4405cd)
                .put("g4405cm", g4405cm)
                .put("g4405d", g4405d)
                .put("g4406a", g4406a)
                .put("g4406b", g4406b)
                .put("g4406cd", g4406cd)
                .put("g4406cm", g4406cm)
                .put("g4406d", g4406d);
        return json.toString();
    }


}
