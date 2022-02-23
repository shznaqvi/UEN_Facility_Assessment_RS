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
    private String g0208 = _EMPTY_;
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
    private String g040110a = _EMPTY_;
    private String g040110s = _EMPTY_;
    private String g040110sd = _EMPTY_;
    private String g040110sm = _EMPTY_;
    private String g040110p = _EMPTY_;
    private String g040120a = _EMPTY_;
    private String g040120s = _EMPTY_;
    private String g040120sd = _EMPTY_;
    private String g040120sm = _EMPTY_;
    private String g040120p = _EMPTY_;
    private String g04013 = _EMPTY_;
    private String g04010a = _EMPTY_;
    private String g04010s = _EMPTY_;
    private String g04010sd = _EMPTY_;
    private String g04010sm = _EMPTY_;
    private String g04010p = _EMPTY_;
    private String g040150a = _EMPTY_;
    private String g040150s = _EMPTY_;
    private String g040150sd = _EMPTY_;
    private String g040150sm = _EMPTY_;
    private String g040150p = _EMPTY_;
    private String g040160a = _EMPTY_;
    private String g040160s = _EMPTY_;
    private String g040160sd = _EMPTY_;
    private String g040160sm = _EMPTY_;
    private String g040160p = _EMPTY_;
    private String g040170a = _EMPTY_;
    private String g040170s = _EMPTY_;
    private String g040170sd = _EMPTY_;
    private String g040170sm = _EMPTY_;
    private String g040170p = _EMPTY_;
    private String g040180a = _EMPTY_;
    private String g040180s = _EMPTY_;
    private String g040180sd = _EMPTY_;
    private String g040180sm = _EMPTY_;
    private String g040180p = _EMPTY_;
    private String g040190a = _EMPTY_;
    private String g040190s = _EMPTY_;
    private String g040190sd = _EMPTY_;
    private String g040190sm = _EMPTY_;
    private String g040190p = _EMPTY_;
    private String g0401100a = _EMPTY_;
    private String g0401100s = _EMPTY_;
    private String g0401100sd = _EMPTY_;
    private String g0401100sm = _EMPTY_;
    private String g0401100p = _EMPTY_;
    private String g0401110a = _EMPTY_;
    private String g0401110s = _EMPTY_;
    private String g0401110sd = _EMPTY_;
    private String g0401110sm = _EMPTY_;
    private String g0401110p = _EMPTY_;
    private String g0401120a = _EMPTY_;
    private String g0401120s = _EMPTY_;
    private String g0401120sd = _EMPTY_;
    private String g0401120sm = _EMPTY_;
    private String g0401120p = _EMPTY_;
    private String g0401130a = _EMPTY_;
    private String g0401130s = _EMPTY_;
    private String g0401130sd = _EMPTY_;
    private String g0401130sm = _EMPTY_;
    private String g0401130p = _EMPTY_;
    private String g0401140a = _EMPTY_;
    private String g0401140s = _EMPTY_;
    private String g0401140sd = _EMPTY_;
    private String g0401140sm = _EMPTY_;
    private String g0401140p = _EMPTY_;
    private String g0401150a = _EMPTY_;
    private String g0401150s = _EMPTY_;
    private String g0401150sd = _EMPTY_;
    private String g0401150sm = _EMPTY_;
    private String g0401150p = _EMPTY_;
    private String g0401160a = _EMPTY_;
    private String g0401160s = _EMPTY_;
    private String g0401160sd = _EMPTY_;
    private String g0401160sm = _EMPTY_;
    private String g0401160p = _EMPTY_;
    private String g0401170a = _EMPTY_;
    private String g0401170s = _EMPTY_;
    private String g0401170sd = _EMPTY_;
    private String g0401170sm = _EMPTY_;
    private String g0401170p = _EMPTY_;
    private String g0401180a = _EMPTY_;
    private String g0401180s = _EMPTY_;
    private String g0401180sd = _EMPTY_;
    private String g0401180sm = _EMPTY_;
    private String g0401180p = _EMPTY_;
    private String g0401190a = _EMPTY_;
    private String g0401190s = _EMPTY_;
    private String g0401190sd = _EMPTY_;
    private String g0401190sm = _EMPTY_;
    private String g0401190p = _EMPTY_;
    private String g0401200a = _EMPTY_;
    private String g0401200s = _EMPTY_;
    private String g0401200sd = _EMPTY_;
    private String g0401200sm = _EMPTY_;
    private String g0401200p = _EMPTY_;
    private String g0401210a = _EMPTY_;
    private String g0401210s = _EMPTY_;
    private String g0401210sd = _EMPTY_;
    private String g0401210sm = _EMPTY_;
    private String g0401210p = _EMPTY_;
    private String g0401220a = _EMPTY_;
    private String g0401220s = _EMPTY_;
    private String g0401220sd = _EMPTY_;
    private String g0401220sm = _EMPTY_;
    private String g0401220p = _EMPTY_;
    private String g0401230a = _EMPTY_;
    private String g0401230s = _EMPTY_;
    private String g0401230sd = _EMPTY_;
    private String g0401230sm = _EMPTY_;
    private String g0401230p = _EMPTY_;
    private String g0401240a = _EMPTY_;
    private String g0401240s = _EMPTY_;
    private String g0401240sd = _EMPTY_;
    private String g0401240sm = _EMPTY_;
    private String g0401240p = _EMPTY_;
    private String g0401250a = _EMPTY_;
    private String g0401250s = _EMPTY_;
    private String g0401250sd = _EMPTY_;
    private String g0401250sm = _EMPTY_;
    private String g0401250p = _EMPTY_;
    private String g0401260a = _EMPTY_;
    private String g0401260s = _EMPTY_;
    private String g0401260sd = _EMPTY_;
    private String g0401260sm = _EMPTY_;
    private String g0401260p = _EMPTY_;
    private String g0401270a = _EMPTY_;
    private String g0401270s = _EMPTY_;
    private String g0401270sd = _EMPTY_;
    private String g0401270sm = _EMPTY_;
    private String g0401270p = _EMPTY_;
    private String g0401280a = _EMPTY_;
    private String g0401280s = _EMPTY_;
    private String g0401280sd = _EMPTY_;
    private String g0401280sm = _EMPTY_;
    private String g0401280p = _EMPTY_;
    private String g0401290a = _EMPTY_;
    private String g0401290s = _EMPTY_;
    private String g0401290sd = _EMPTY_;
    private String g0401290sm = _EMPTY_;
    private String g0401290p = _EMPTY_;
    private String g0401300a = _EMPTY_;
    private String g0401300s = _EMPTY_;
    private String g0401300sd = _EMPTY_;
    private String g0401300sm = _EMPTY_;
    private String g0401300p = _EMPTY_;
    private String g0401310a = _EMPTY_;
    private String g0401310s = _EMPTY_;
    private String g0401310sd = _EMPTY_;
    private String g0401310sm = _EMPTY_;
    private String g0401310p = _EMPTY_;
    private String g0401320a = _EMPTY_;
    private String g0401320s = _EMPTY_;
    private String g0401320sd = _EMPTY_;
    private String g0401320sm = _EMPTY_;
    private String g0401320p = _EMPTY_;
    private String g0401330a = _EMPTY_;
    private String g0401330s = _EMPTY_;
    private String g0401330sd = _EMPTY_;
    private String g0401330sm = _EMPTY_;
    private String g0401330p = _EMPTY_;
    private String g0401340a = _EMPTY_;
    private String g0401340s = _EMPTY_;
    private String g0401340sd = _EMPTY_;
    private String g0401340sm = _EMPTY_;
    private String g0401340p = _EMPTY_;
    private String g0401350a = _EMPTY_;
    private String g0401350s = _EMPTY_;
    private String g0401350sd = _EMPTY_;
    private String g0401350sm = _EMPTY_;
    private String g0401350p = _EMPTY_;
    private String g0401360a = _EMPTY_;
    private String g0401360s = _EMPTY_;
    private String g0401360sd = _EMPTY_;
    private String g0401360sm = _EMPTY_;
    private String g0401360p = _EMPTY_;
    private String g0401370a = _EMPTY_;
    private String g0401370s = _EMPTY_;
    private String g0401370sd = _EMPTY_;
    private String g0401370sm = _EMPTY_;
    private String g0401370p = _EMPTY_;
    private String g0401380a = _EMPTY_;
    private String g0401380s = _EMPTY_;
    private String g0401380sd = _EMPTY_;
    private String g0401380sm = _EMPTY_;
    private String g0401380p = _EMPTY_;
    private String g0401390a = _EMPTY_;
    private String g0401390s = _EMPTY_;
    private String g0401390sd = _EMPTY_;
    private String g0401390sm = _EMPTY_;
    private String g0401390p = _EMPTY_;
    private String g0401400a = _EMPTY_;
    private String g0401400s = _EMPTY_;
    private String g0401400sd = _EMPTY_;
    private String g0401400sm = _EMPTY_;
    private String g0401400p = _EMPTY_;
    private String g0401410a = _EMPTY_;
    private String g0401410s = _EMPTY_;
    private String g0401410sd = _EMPTY_;
    private String g0401410sm = _EMPTY_;
    private String g0401410p = _EMPTY_;
    private String g0401420a = _EMPTY_;
    private String g0401420s = _EMPTY_;
    private String g0401420sd = _EMPTY_;
    private String g0401420sm = _EMPTY_;
    private String g0401420p = _EMPTY_;
    private String g0401430a = _EMPTY_;
    private String g0401430s = _EMPTY_;
    private String g0401430sd = _EMPTY_;
    private String g0401430sm = _EMPTY_;
    private String g0401430p = _EMPTY_;
    private String g0401440a = _EMPTY_;
    private String g0401440s = _EMPTY_;
    private String g0401440sd = _EMPTY_;
    private String g0401440sm = _EMPTY_;
    private String g0401440p = _EMPTY_;
    private String g040210a = _EMPTY_;
    private String g040210s = _EMPTY_;
    private String g040210sd = _EMPTY_;
    private String g040210sm = _EMPTY_;
    private String g040210p = _EMPTY_;
    private String g040220a = _EMPTY_;
    private String g040220s = _EMPTY_;
    private String g040220sd = _EMPTY_;
    private String g040220sm = _EMPTY_;
    private String g040220p = _EMPTY_;
    private String g040230a = _EMPTY_;
    private String g040230s = _EMPTY_;
    private String g040230sd = _EMPTY_;
    private String g040230sm = _EMPTY_;
    private String g040230p = _EMPTY_;
    private String g040240a = _EMPTY_;
    private String g040240s = _EMPTY_;
    private String g040240sd = _EMPTY_;
    private String g040240sm = _EMPTY_;
    private String g040240p = _EMPTY_;
    private String g040250a = _EMPTY_;
    private String g040250s = _EMPTY_;
    private String g040250sd = _EMPTY_;
    private String g040250sm = _EMPTY_;
    private String g040250p = _EMPTY_;
    private String g040260a = _EMPTY_;
    private String g040260s = _EMPTY_;
    private String g040260sd = _EMPTY_;
    private String g040260sm = _EMPTY_;
    private String g040260p = _EMPTY_;
    private String g040270a = _EMPTY_;
    private String g040270s = _EMPTY_;
    private String g040270sd = _EMPTY_;
    private String g040270sm = _EMPTY_;
    private String g040270p = _EMPTY_;
    private String g040280a = _EMPTY_;
    private String g040280s = _EMPTY_;
    private String g040280sd = _EMPTY_;
    private String g040280sm = _EMPTY_;
    private String g040280p = _EMPTY_;
    private String g040290a = _EMPTY_;
    private String g040290s = _EMPTY_;
    private String g040290sd = _EMPTY_;
    private String g040290sm = _EMPTY_;
    private String g040290p = _EMPTY_;
    private String g0402100a = _EMPTY_;
    private String g0402100s = _EMPTY_;
    private String g0402100sd = _EMPTY_;
    private String g0402100sm = _EMPTY_;
    private String g0402100p = _EMPTY_;
    private String g040310a = _EMPTY_;
    private String g040310s = _EMPTY_;
    private String g040310sd = _EMPTY_;
    private String g040310sm = _EMPTY_;
    private String g040310p = _EMPTY_;
    private String g040320a = _EMPTY_;
    private String g040320s = _EMPTY_;
    private String g040320sd = _EMPTY_;
    private String g040320sm = _EMPTY_;
    private String g040320p = _EMPTY_;
    private String g040330a = _EMPTY_;
    private String g040330s = _EMPTY_;
    private String g040330sd = _EMPTY_;
    private String g040330sm = _EMPTY_;
    private String g040330p = _EMPTY_;
    private String g040340a = _EMPTY_;
    private String g040340s = _EMPTY_;
    private String g040340sd = _EMPTY_;
    private String g040340sm = _EMPTY_;
    private String g040340p = _EMPTY_;
    private String g040350a = _EMPTY_;
    private String g040350s = _EMPTY_;
    private String g040350sd = _EMPTY_;
    private String g040350sm = _EMPTY_;
    private String g040350p = _EMPTY_;
    private String g040360a = _EMPTY_;
    private String g040360s = _EMPTY_;
    private String g040360sd = _EMPTY_;
    private String g040360sm = _EMPTY_;
    private String g040360p = _EMPTY_;
    private String g040370a = _EMPTY_;
    private String g040370s = _EMPTY_;
    private String g040370sd = _EMPTY_;
    private String g040370sm = _EMPTY_;
    private String g040370p = _EMPTY_;
    private String g040380a = _EMPTY_;
    private String g040380s = _EMPTY_;
    private String g040380sd = _EMPTY_;
    private String g040380sm = _EMPTY_;
    private String g040380p = _EMPTY_;
    private String g040390a = _EMPTY_;
    private String g040390s = _EMPTY_;
    private String g040390sd = _EMPTY_;
    private String g040390sm = _EMPTY_;
    private String g040390p = _EMPTY_;
    private String g0403100a = _EMPTY_;
    private String g0403100s = _EMPTY_;
    private String g0403100sd = _EMPTY_;
    private String g0403100sm = _EMPTY_;
    private String g0403100p = _EMPTY_;
    private String g0403110a = _EMPTY_;
    private String g0403110s = _EMPTY_;
    private String g0403110sd = _EMPTY_;
    private String g0403110sm = _EMPTY_;
    private String g0403110p = _EMPTY_;
    private String g0403120a = _EMPTY_;
    private String g0403120s = _EMPTY_;
    private String g0403120sd = _EMPTY_;
    private String g0403120sm = _EMPTY_;
    private String g0403120p = _EMPTY_;
    private String g0403130a = _EMPTY_;
    private String g0403130s = _EMPTY_;
    private String g0403130sd = _EMPTY_;
    private String g0403130sm = _EMPTY_;
    private String g0403130p = _EMPTY_;
    private String g0403140a = _EMPTY_;
    private String g0403140s = _EMPTY_;
    private String g0403140sd = _EMPTY_;
    private String g0403140sm = _EMPTY_;
    private String g0403140p = _EMPTY_;
    private String g0403150a = _EMPTY_;
    private String g0403150s = _EMPTY_;
    private String g0403150sd = _EMPTY_;
    private String g0403150sm = _EMPTY_;
    private String g0403150p = _EMPTY_;
    private String g0403160a = _EMPTY_;
    private String g0403160s = _EMPTY_;
    private String g0403160sd = _EMPTY_;
    private String g0403160sm = _EMPTY_;
    private String g0403160p = _EMPTY_;
    private String g0403170a = _EMPTY_;
    private String g0403170s = _EMPTY_;
    private String g0403170sd = _EMPTY_;
    private String g0403170sm = _EMPTY_;
    private String g0403170p = _EMPTY_;
    private String g0403180a = _EMPTY_;
    private String g0403180s = _EMPTY_;
    private String g0403180sd = _EMPTY_;
    private String g0403180sm = _EMPTY_;
    private String g0403180p = _EMPTY_;
    private String g0403190a = _EMPTY_;
    private String g0403190s = _EMPTY_;
    private String g0403190sd = _EMPTY_;
    private String g0403190sm = _EMPTY_;
    private String g0403190p = _EMPTY_;
    private String g0403200a = _EMPTY_;
    private String g0403200s = _EMPTY_;
    private String g0403200sd = _EMPTY_;
    private String g0403200sm = _EMPTY_;
    private String g0403200p = _EMPTY_;
    private String g0403210a = _EMPTY_;
    private String g0403210s = _EMPTY_;
    private String g0403210sd = _EMPTY_;
    private String g0403210sm = _EMPTY_;
    private String g0403210p = _EMPTY_;
    private String g0403220a = _EMPTY_;
    private String g0403220s = _EMPTY_;
    private String g0403220sd = _EMPTY_;
    private String g0403220sm = _EMPTY_;
    private String g0403220p = _EMPTY_;
    private String g0403230a = _EMPTY_;
    private String g0403230s = _EMPTY_;
    private String g0403230sd = _EMPTY_;
    private String g0403230sm = _EMPTY_;
    private String g0403230p = _EMPTY_;
    private String g0403240a = _EMPTY_;
    private String g0403240s = _EMPTY_;
    private String g0403240sd = _EMPTY_;
    private String g0403240sm = _EMPTY_;
    private String g0403240p = _EMPTY_;
    private String g0403250a = _EMPTY_;
    private String g0403250s = _EMPTY_;
    private String g0403250sd = _EMPTY_;
    private String g0403250sm = _EMPTY_;
    private String g0403250p = _EMPTY_;
    private String g0403260a = _EMPTY_;
    private String g0403260s = _EMPTY_;
    private String g0403260sd = _EMPTY_;
    private String g0403260sm = _EMPTY_;
    private String g0403260p = _EMPTY_;
    private String g0403270a = _EMPTY_;
    private String g0403270s = _EMPTY_;
    private String g0403270sd = _EMPTY_;
    private String g0403270sm = _EMPTY_;
    private String g0403270p = _EMPTY_;
    private String g040410a = _EMPTY_;
    private String g040410s = _EMPTY_;
    private String g040410sd = _EMPTY_;
    private String g040410sm = _EMPTY_;
    private String g040410p = _EMPTY_;
    private String g040420a = _EMPTY_;
    private String g040420s = _EMPTY_;
    private String g040420sd = _EMPTY_;
    private String g040420sm = _EMPTY_;
    private String g040420p = _EMPTY_;
    private String g040430a = _EMPTY_;
    private String g040430s = _EMPTY_;
    private String g040430sd = _EMPTY_;
    private String g040430sm = _EMPTY_;
    private String g040430p = _EMPTY_;
    private String g040440a = _EMPTY_;
    private String g040440s = _EMPTY_;
    private String g040440sd = _EMPTY_;
    private String g040440sm = _EMPTY_;
    private String g040440p = _EMPTY_;
    private String g040450a = _EMPTY_;
    private String g040450s = _EMPTY_;
    private String g040450sd = _EMPTY_;
    private String g040450sm = _EMPTY_;
    private String g040450p = _EMPTY_;
    private String g040460a = _EMPTY_;
    private String g040460s = _EMPTY_;
    private String g040460sd = _EMPTY_;
    private String g040460sm = _EMPTY_;
    private String g040460p = _EMPTY_;


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
    public String getG0208() {
        return g0208;
    }

    public void setG0208(String g0208) {
        this.g0208 = g0208;
        notifyPropertyChanged(BR.g0208);
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
    public String getG040110a() {
        return g040110a;
    }

    public void setG040110a(String g040110a) {
        this.g040110a = g040110a;
        notifyPropertyChanged(BR.g040110a);
    }

    @Bindable
    public String getG040110s() {
        return g040110s;
    }

    public void setG040110s(String g040110s) {
        this.g040110s = g040110s;
        notifyPropertyChanged(BR.g040110s);
    }

    @Bindable
    public String getG040110sd() {
        return g040110sd;
    }

    public void setG040110sd(String g040110sd) {
        this.g040110sd = g040110sd;
        notifyPropertyChanged(BR.g040110sd);
    }

    @Bindable
    public String getG040110sm() {
        return g040110sm;
    }

    public void setG040110sm(String g040110sm) {
        this.g040110sm = g040110sm;
        notifyPropertyChanged(BR.g040110sm);
    }

    @Bindable
    public String getG040110p() {
        return g040110p;
    }

    public void setG040110p(String g040110p) {
        this.g040110p = g040110p;
        notifyPropertyChanged(BR.g040110p);
    }

    @Bindable
    public String getG040120a() {
        return g040120a;
    }

    public void setG040120a(String g040120a) {
        this.g040120a = g040120a;
        notifyPropertyChanged(BR.g040120a);
    }

    @Bindable
    public String getG040120s() {
        return g040120s;
    }

    public void setG040120s(String g040120s) {
        this.g040120s = g040120s;
        notifyPropertyChanged(BR.g040120s);
    }

    @Bindable
    public String getG040120sd() {
        return g040120sd;
    }

    public void setG040120sd(String g040120sd) {
        this.g040120sd = g040120sd;
        notifyPropertyChanged(BR.g040120sd);
    }

    @Bindable
    public String getG040120sm() {
        return g040120sm;
    }

    public void setG040120sm(String g040120sm) {
        this.g040120sm = g040120sm;
        notifyPropertyChanged(BR.g040120sm);
    }

    @Bindable
    public String getG040120p() {
        return g040120p;
    }

    public void setG040120p(String g040120p) {
        this.g040120p = g040120p;
        notifyPropertyChanged(BR.g040120p);
    }

    @Bindable
    public String getG04013() {
        return g04013;
    }

    public void setG04013(String g04013) {
        this.g04013 = g04013;
        notifyPropertyChanged(BR.g04013);
    }

    @Bindable
    public String getG04010a() {
        return g04010a;
    }

    public void setG04010a(String g04010a) {
        this.g04010a = g04010a;
        notifyPropertyChanged(BR.g04010a);
    }

    @Bindable
    public String getG04010s() {
        return g04010s;
    }

    public void setG04010s(String g04010s) {
        this.g04010s = g04010s;
        notifyPropertyChanged(BR.g04010s);
    }

    @Bindable
    public String getG04010sd() {
        return g04010sd;
    }

    public void setG04010sd(String g04010sd) {
        this.g04010sd = g04010sd;
        notifyPropertyChanged(BR.g04010sd);
    }

    @Bindable
    public String getG04010sm() {
        return g04010sm;
    }

    public void setG04010sm(String g04010sm) {
        this.g04010sm = g04010sm;
        notifyPropertyChanged(BR.g04010sm);
    }

    @Bindable
    public String getG04010p() {
        return g04010p;
    }

    public void setG04010p(String g04010p) {
        this.g04010p = g04010p;
        notifyPropertyChanged(BR.g04010p);
    }

    @Bindable
    public String getG040150a() {
        return g040150a;
    }

    public void setG040150a(String g040150a) {
        this.g040150a = g040150a;
        notifyPropertyChanged(BR.g040150a);
    }

    @Bindable
    public String getG040150s() {
        return g040150s;
    }

    public void setG040150s(String g040150s) {
        this.g040150s = g040150s;
        notifyPropertyChanged(BR.g040150s);
    }

    @Bindable
    public String getG040150sd() {
        return g040150sd;
    }

    public void setG040150sd(String g040150sd) {
        this.g040150sd = g040150sd;
        notifyPropertyChanged(BR.g040150sd);
    }

    @Bindable
    public String getG040150sm() {
        return g040150sm;
    }

    public void setG040150sm(String g040150sm) {
        this.g040150sm = g040150sm;
        notifyPropertyChanged(BR.g040150sm);
    }

    @Bindable
    public String getG040150p() {
        return g040150p;
    }

    public void setG040150p(String g040150p) {
        this.g040150p = g040150p;
        notifyPropertyChanged(BR.g040150p);
    }

    @Bindable
    public String getG040160a() {
        return g040160a;
    }

    public void setG040160a(String g040160a) {
        this.g040160a = g040160a;
        notifyPropertyChanged(BR.g040160a);
    }

    @Bindable
    public String getG040160s() {
        return g040160s;
    }

    public void setG040160s(String g040160s) {
        this.g040160s = g040160s;
        notifyPropertyChanged(BR.g040160s);
    }

    @Bindable
    public String getG040160sd() {
        return g040160sd;
    }

    public void setG040160sd(String g040160sd) {
        this.g040160sd = g040160sd;
        notifyPropertyChanged(BR.g040160sd);
    }

    @Bindable
    public String getG040160sm() {
        return g040160sm;
    }

    public void setG040160sm(String g040160sm) {
        this.g040160sm = g040160sm;
        notifyPropertyChanged(BR.g040160sm);
    }

    @Bindable
    public String getG040160p() {
        return g040160p;
    }

    public void setG040160p(String g040160p) {
        this.g040160p = g040160p;
        notifyPropertyChanged(BR.g040160p);
    }

    @Bindable
    public String getG040170a() {
        return g040170a;
    }

    public void setG040170a(String g040170a) {
        this.g040170a = g040170a;
        notifyPropertyChanged(BR.g040170a);
    }

    @Bindable
    public String getG040170s() {
        return g040170s;
    }

    public void setG040170s(String g040170s) {
        this.g040170s = g040170s;
        notifyPropertyChanged(BR.g040170s);
    }

    @Bindable
    public String getG040170sd() {
        return g040170sd;
    }

    public void setG040170sd(String g040170sd) {
        this.g040170sd = g040170sd;
        notifyPropertyChanged(BR.g040170sd);
    }

    @Bindable
    public String getG040170sm() {
        return g040170sm;
    }

    public void setG040170sm(String g040170sm) {
        this.g040170sm = g040170sm;
        notifyPropertyChanged(BR.g040170sm);
    }

    @Bindable
    public String getG040170p() {
        return g040170p;
    }

    public void setG040170p(String g040170p) {
        this.g040170p = g040170p;
        notifyPropertyChanged(BR.g040170p);
    }

    @Bindable
    public String getG040180a() {
        return g040180a;
    }

    public void setG040180a(String g040180a) {
        this.g040180a = g040180a;
        notifyPropertyChanged(BR.g040180a);
    }

    @Bindable
    public String getG040180s() {
        return g040180s;
    }

    public void setG040180s(String g040180s) {
        this.g040180s = g040180s;
        notifyPropertyChanged(BR.g040180s);
    }

    @Bindable
    public String getG040180sd() {
        return g040180sd;
    }

    public void setG040180sd(String g040180sd) {
        this.g040180sd = g040180sd;
        notifyPropertyChanged(BR.g040180sd);
    }

    @Bindable
    public String getG040180sm() {
        return g040180sm;
    }

    public void setG040180sm(String g040180sm) {
        this.g040180sm = g040180sm;
        notifyPropertyChanged(BR.g040180sm);
    }

    @Bindable
    public String getG040180p() {
        return g040180p;
    }

    public void setG040180p(String g040180p) {
        this.g040180p = g040180p;
        notifyPropertyChanged(BR.g040180p);
    }

    @Bindable
    public String getG040190a() {
        return g040190a;
    }

    public void setG040190a(String g040190a) {
        this.g040190a = g040190a;
        notifyPropertyChanged(BR.g040190a);
    }

    @Bindable
    public String getG040190s() {
        return g040190s;
    }

    public void setG040190s(String g040190s) {
        this.g040190s = g040190s;
        notifyPropertyChanged(BR.g040190s);
    }

    @Bindable
    public String getG040190sd() {
        return g040190sd;
    }

    public void setG040190sd(String g040190sd) {
        this.g040190sd = g040190sd;
        notifyPropertyChanged(BR.g040190sd);
    }

    @Bindable
    public String getG040190sm() {
        return g040190sm;
    }

    public void setG040190sm(String g040190sm) {
        this.g040190sm = g040190sm;
        notifyPropertyChanged(BR.g040190sm);
    }

    @Bindable
    public String getG040190p() {
        return g040190p;
    }

    public void setG040190p(String g040190p) {
        this.g040190p = g040190p;
        notifyPropertyChanged(BR.g040190p);
    }

    @Bindable
    public String getG0401100a() {
        return g0401100a;
    }

    public void setG0401100a(String g0401100a) {
        this.g0401100a = g0401100a;
        notifyPropertyChanged(BR.g0401100a);
    }

    @Bindable
    public String getG0401100s() {
        return g0401100s;
    }

    public void setG0401100s(String g0401100s) {
        this.g0401100s = g0401100s;
        notifyPropertyChanged(BR.g0401100s);
    }

    @Bindable
    public String getG0401100sd() {
        return g0401100sd;
    }

    public void setG0401100sd(String g0401100sd) {
        this.g0401100sd = g0401100sd;
        notifyPropertyChanged(BR.g0401100sd);
    }

    @Bindable
    public String getG0401100sm() {
        return g0401100sm;
    }

    public void setG0401100sm(String g0401100sm) {
        this.g0401100sm = g0401100sm;
        notifyPropertyChanged(BR.g0401100sm);
    }

    @Bindable
    public String getG0401100p() {
        return g0401100p;
    }

    public void setG0401100p(String g0401100p) {
        this.g0401100p = g0401100p;
        notifyPropertyChanged(BR.g0401100p);
    }

    @Bindable
    public String getG0401110a() {
        return g0401110a;
    }

    public void setG0401110a(String g0401110a) {
        this.g0401110a = g0401110a;
        notifyPropertyChanged(BR.g0401110a);
    }

    @Bindable
    public String getG0401110s() {
        return g0401110s;
    }

    public void setG0401110s(String g0401110s) {
        this.g0401110s = g0401110s;
        notifyPropertyChanged(BR.g0401110s);
    }

    @Bindable
    public String getG0401110sd() {
        return g0401110sd;
    }

    public void setG0401110sd(String g0401110sd) {
        this.g0401110sd = g0401110sd;
        notifyPropertyChanged(BR.g0401110sd);
    }

    @Bindable
    public String getG0401110sm() {
        return g0401110sm;
    }

    public void setG0401110sm(String g0401110sm) {
        this.g0401110sm = g0401110sm;
        notifyPropertyChanged(BR.g0401110sm);
    }

    @Bindable
    public String getG0401110p() {
        return g0401110p;
    }

    public void setG0401110p(String g0401110p) {
        this.g0401110p = g0401110p;
        notifyPropertyChanged(BR.g0401110p);
    }

    @Bindable
    public String getG0401120a() {
        return g0401120a;
    }

    public void setG0401120a(String g0401120a) {
        this.g0401120a = g0401120a;
        notifyPropertyChanged(BR.g0401120a);
    }

    @Bindable
    public String getG0401120s() {
        return g0401120s;
    }

    public void setG0401120s(String g0401120s) {
        this.g0401120s = g0401120s;
        notifyPropertyChanged(BR.g0401120s);
    }

    @Bindable
    public String getG0401120sd() {
        return g0401120sd;
    }

    public void setG0401120sd(String g0401120sd) {
        this.g0401120sd = g0401120sd;
        notifyPropertyChanged(BR.g0401120sd);
    }

    @Bindable
    public String getG0401120sm() {
        return g0401120sm;
    }

    public void setG0401120sm(String g0401120sm) {
        this.g0401120sm = g0401120sm;
        notifyPropertyChanged(BR.g0401120sm);
    }

    @Bindable
    public String getG0401120p() {
        return g0401120p;
    }

    public void setG0401120p(String g0401120p) {
        this.g0401120p = g0401120p;
        notifyPropertyChanged(BR.g0401120p);
    }

    @Bindable
    public String getG0401130a() {
        return g0401130a;
    }

    public void setG0401130a(String g0401130a) {
        this.g0401130a = g0401130a;
        notifyPropertyChanged(BR.g0401130a);
    }

    @Bindable
    public String getG0401130s() {
        return g0401130s;
    }

    public void setG0401130s(String g0401130s) {
        this.g0401130s = g0401130s;
        notifyPropertyChanged(BR.g0401130s);
    }

    @Bindable
    public String getG0401130sd() {
        return g0401130sd;
    }

    public void setG0401130sd(String g0401130sd) {
        this.g0401130sd = g0401130sd;
        notifyPropertyChanged(BR.g0401130sd);
    }

    @Bindable
    public String getG0401130sm() {
        return g0401130sm;
    }

    public void setG0401130sm(String g0401130sm) {
        this.g0401130sm = g0401130sm;
        notifyPropertyChanged(BR.g0401130sm);
    }

    @Bindable
    public String getG0401130p() {
        return g0401130p;
    }

    public void setG0401130p(String g0401130p) {
        this.g0401130p = g0401130p;
        notifyPropertyChanged(BR.g0401130p);
    }

    @Bindable
    public String getG0401140a() {
        return g0401140a;
    }

    public void setG0401140a(String g0401140a) {
        this.g0401140a = g0401140a;
        notifyPropertyChanged(BR.g0401140a);
    }

    @Bindable
    public String getG0401140s() {
        return g0401140s;
    }

    public void setG0401140s(String g0401140s) {
        this.g0401140s = g0401140s;
        notifyPropertyChanged(BR.g0401140s);
    }

    @Bindable
    public String getG0401140sd() {
        return g0401140sd;
    }

    public void setG0401140sd(String g0401140sd) {
        this.g0401140sd = g0401140sd;
        notifyPropertyChanged(BR.g0401140sd);
    }

    @Bindable
    public String getG0401140sm() {
        return g0401140sm;
    }

    public void setG0401140sm(String g0401140sm) {
        this.g0401140sm = g0401140sm;
        notifyPropertyChanged(BR.g0401140sm);
    }

    @Bindable
    public String getG0401140p() {
        return g0401140p;
    }

    public void setG0401140p(String g0401140p) {
        this.g0401140p = g0401140p;
        notifyPropertyChanged(BR.g0401140p);
    }

    @Bindable
    public String getG0401150a() {
        return g0401150a;
    }

    public void setG0401150a(String g0401150a) {
        this.g0401150a = g0401150a;
        notifyPropertyChanged(BR.g0401150a);
    }

    @Bindable
    public String getG0401150s() {
        return g0401150s;
    }

    public void setG0401150s(String g0401150s) {
        this.g0401150s = g0401150s;
        notifyPropertyChanged(BR.g0401150s);
    }

    @Bindable
    public String getG0401150sd() {
        return g0401150sd;
    }

    public void setG0401150sd(String g0401150sd) {
        this.g0401150sd = g0401150sd;
        notifyPropertyChanged(BR.g0401150sd);
    }

    @Bindable
    public String getG0401150sm() {
        return g0401150sm;
    }

    public void setG0401150sm(String g0401150sm) {
        this.g0401150sm = g0401150sm;
        notifyPropertyChanged(BR.g0401150sm);
    }

    @Bindable
    public String getG0401150p() {
        return g0401150p;
    }

    public void setG0401150p(String g0401150p) {
        this.g0401150p = g0401150p;
        notifyPropertyChanged(BR.g0401150p);
    }

    @Bindable
    public String getG0401160a() {
        return g0401160a;
    }

    public void setG0401160a(String g0401160a) {
        this.g0401160a = g0401160a;
        notifyPropertyChanged(BR.g0401160a);
    }

    @Bindable
    public String getG0401160s() {
        return g0401160s;
    }

    public void setG0401160s(String g0401160s) {
        this.g0401160s = g0401160s;
        notifyPropertyChanged(BR.g0401160s);
    }

    @Bindable
    public String getG0401160sd() {
        return g0401160sd;
    }

    public void setG0401160sd(String g0401160sd) {
        this.g0401160sd = g0401160sd;
        notifyPropertyChanged(BR.g0401160sd);
    }

    @Bindable
    public String getG0401160sm() {
        return g0401160sm;
    }

    public void setG0401160sm(String g0401160sm) {
        this.g0401160sm = g0401160sm;
        notifyPropertyChanged(BR.g0401160sm);
    }

    @Bindable
    public String getG0401160p() {
        return g0401160p;
    }

    public void setG0401160p(String g0401160p) {
        this.g0401160p = g0401160p;
        notifyPropertyChanged(BR.g0401160p);
    }

    @Bindable
    public String getG0401170a() {
        return g0401170a;
    }

    public void setG0401170a(String g0401170a) {
        this.g0401170a = g0401170a;
        notifyPropertyChanged(BR.g0401170a);
    }

    @Bindable
    public String getG0401170s() {
        return g0401170s;
    }

    public void setG0401170s(String g0401170s) {
        this.g0401170s = g0401170s;
        notifyPropertyChanged(BR.g0401170s);
    }

    @Bindable
    public String getG0401170sd() {
        return g0401170sd;
    }

    public void setG0401170sd(String g0401170sd) {
        this.g0401170sd = g0401170sd;
        notifyPropertyChanged(BR.g0401170sd);
    }

    @Bindable
    public String getG0401170sm() {
        return g0401170sm;
    }

    public void setG0401170sm(String g0401170sm) {
        this.g0401170sm = g0401170sm;
        notifyPropertyChanged(BR.g0401170sm);
    }

    @Bindable
    public String getG0401170p() {
        return g0401170p;
    }

    public void setG0401170p(String g0401170p) {
        this.g0401170p = g0401170p;
        notifyPropertyChanged(BR.g0401170p);
    }

    @Bindable
    public String getG0401180a() {
        return g0401180a;
    }

    public void setG0401180a(String g0401180a) {
        this.g0401180a = g0401180a;
        notifyPropertyChanged(BR.g0401180a);
    }

    @Bindable
    public String getG0401180s() {
        return g0401180s;
    }

    public void setG0401180s(String g0401180s) {
        this.g0401180s = g0401180s;
        notifyPropertyChanged(BR.g0401180s);
    }

    @Bindable
    public String getG0401180sd() {
        return g0401180sd;
    }

    public void setG0401180sd(String g0401180sd) {
        this.g0401180sd = g0401180sd;
        notifyPropertyChanged(BR.g0401180sd);
    }

    @Bindable
    public String getG0401180sm() {
        return g0401180sm;
    }

    public void setG0401180sm(String g0401180sm) {
        this.g0401180sm = g0401180sm;
        notifyPropertyChanged(BR.g0401180sm);
    }

    @Bindable
    public String getG0401180p() {
        return g0401180p;
    }

    public void setG0401180p(String g0401180p) {
        this.g0401180p = g0401180p;
        notifyPropertyChanged(BR.g0401180p);
    }

    @Bindable
    public String getG0401190a() {
        return g0401190a;
    }

    public void setG0401190a(String g0401190a) {
        this.g0401190a = g0401190a;
        notifyPropertyChanged(BR.g0401190a);
    }

    @Bindable
    public String getG0401190s() {
        return g0401190s;
    }

    public void setG0401190s(String g0401190s) {
        this.g0401190s = g0401190s;
        notifyPropertyChanged(BR.g0401190s);
    }

    @Bindable
    public String getG0401190sd() {
        return g0401190sd;
    }

    public void setG0401190sd(String g0401190sd) {
        this.g0401190sd = g0401190sd;
        notifyPropertyChanged(BR.g0401190sd);
    }

    @Bindable
    public String getG0401190sm() {
        return g0401190sm;
    }

    public void setG0401190sm(String g0401190sm) {
        this.g0401190sm = g0401190sm;
        notifyPropertyChanged(BR.g0401190sm);
    }

    @Bindable
    public String getG0401190p() {
        return g0401190p;
    }

    public void setG0401190p(String g0401190p) {
        this.g0401190p = g0401190p;
        notifyPropertyChanged(BR.g0401190p);
    }

    @Bindable
    public String getG0401200a() {
        return g0401200a;
    }

    public void setG0401200a(String g0401200a) {
        this.g0401200a = g0401200a;
        notifyPropertyChanged(BR.g0401200a);
    }

    @Bindable
    public String getG0401200s() {
        return g0401200s;
    }

    public void setG0401200s(String g0401200s) {
        this.g0401200s = g0401200s;
        notifyPropertyChanged(BR.g0401200s);
    }

    @Bindable
    public String getG0401200sd() {
        return g0401200sd;
    }

    public void setG0401200sd(String g0401200sd) {
        this.g0401200sd = g0401200sd;
        notifyPropertyChanged(BR.g0401200sd);
    }

    @Bindable
    public String getG0401200sm() {
        return g0401200sm;
    }

    public void setG0401200sm(String g0401200sm) {
        this.g0401200sm = g0401200sm;
        notifyPropertyChanged(BR.g0401200sm);
    }

    @Bindable
    public String getG0401200p() {
        return g0401200p;
    }

    public void setG0401200p(String g0401200p) {
        this.g0401200p = g0401200p;
        notifyPropertyChanged(BR.g0401200p);
    }

    @Bindable
    public String getG0401210a() {
        return g0401210a;
    }

    public void setG0401210a(String g0401210a) {
        this.g0401210a = g0401210a;
        notifyPropertyChanged(BR.g0401210a);
    }

    @Bindable
    public String getG0401210s() {
        return g0401210s;
    }

    public void setG0401210s(String g0401210s) {
        this.g0401210s = g0401210s;
        notifyPropertyChanged(BR.g0401210s);
    }

    @Bindable
    public String getG0401210sd() {
        return g0401210sd;
    }

    public void setG0401210sd(String g0401210sd) {
        this.g0401210sd = g0401210sd;
        notifyPropertyChanged(BR.g0401210sd);
    }

    @Bindable
    public String getG0401210sm() {
        return g0401210sm;
    }

    public void setG0401210sm(String g0401210sm) {
        this.g0401210sm = g0401210sm;
        notifyPropertyChanged(BR.g0401210sm);
    }

    @Bindable
    public String getG0401210p() {
        return g0401210p;
    }

    public void setG0401210p(String g0401210p) {
        this.g0401210p = g0401210p;
        notifyPropertyChanged(BR.g0401210p);
    }

    @Bindable
    public String getG0401220a() {
        return g0401220a;
    }

    public void setG0401220a(String g0401220a) {
        this.g0401220a = g0401220a;
        notifyPropertyChanged(BR.g0401220a);
    }

    @Bindable
    public String getG0401220s() {
        return g0401220s;
    }

    public void setG0401220s(String g0401220s) {
        this.g0401220s = g0401220s;
        notifyPropertyChanged(BR.g0401220s);
    }

    @Bindable
    public String getG0401220sd() {
        return g0401220sd;
    }

    public void setG0401220sd(String g0401220sd) {
        this.g0401220sd = g0401220sd;
        notifyPropertyChanged(BR.g0401220sd);
    }

    @Bindable
    public String getG0401220sm() {
        return g0401220sm;
    }

    public void setG0401220sm(String g0401220sm) {
        this.g0401220sm = g0401220sm;
        notifyPropertyChanged(BR.g0401220sm);
    }

    @Bindable
    public String getG0401220p() {
        return g0401220p;
    }

    public void setG0401220p(String g0401220p) {
        this.g0401220p = g0401220p;
        notifyPropertyChanged(BR.g0401220p);
    }

    @Bindable
    public String getG0401230a() {
        return g0401230a;
    }

    public void setG0401230a(String g0401230a) {
        this.g0401230a = g0401230a;
        notifyPropertyChanged(BR.g0401230a);
    }

    @Bindable
    public String getG0401230s() {
        return g0401230s;
    }

    public void setG0401230s(String g0401230s) {
        this.g0401230s = g0401230s;
        notifyPropertyChanged(BR.g0401230s);
    }

    @Bindable
    public String getG0401230sd() {
        return g0401230sd;
    }

    public void setG0401230sd(String g0401230sd) {
        this.g0401230sd = g0401230sd;
        notifyPropertyChanged(BR.g0401230sd);
    }

    @Bindable
    public String getG0401230sm() {
        return g0401230sm;
    }

    public void setG0401230sm(String g0401230sm) {
        this.g0401230sm = g0401230sm;
        notifyPropertyChanged(BR.g0401230sm);
    }

    @Bindable
    public String getG0401230p() {
        return g0401230p;
    }

    public void setG0401230p(String g0401230p) {
        this.g0401230p = g0401230p;
        notifyPropertyChanged(BR.g0401230p);
    }

    @Bindable
    public String getG0401240a() {
        return g0401240a;
    }

    public void setG0401240a(String g0401240a) {
        this.g0401240a = g0401240a;
        notifyPropertyChanged(BR.g0401240a);
    }

    @Bindable
    public String getG0401240s() {
        return g0401240s;
    }

    public void setG0401240s(String g0401240s) {
        this.g0401240s = g0401240s;
        notifyPropertyChanged(BR.g0401240s);
    }

    @Bindable
    public String getG0401240sd() {
        return g0401240sd;
    }

    public void setG0401240sd(String g0401240sd) {
        this.g0401240sd = g0401240sd;
        notifyPropertyChanged(BR.g0401240sd);
    }

    @Bindable
    public String getG0401240sm() {
        return g0401240sm;
    }

    public void setG0401240sm(String g0401240sm) {
        this.g0401240sm = g0401240sm;
        notifyPropertyChanged(BR.g0401240sm);
    }

    @Bindable
    public String getG0401240p() {
        return g0401240p;
    }

    public void setG0401240p(String g0401240p) {
        this.g0401240p = g0401240p;
        notifyPropertyChanged(BR.g0401240p);
    }

    @Bindable
    public String getG0401250a() {
        return g0401250a;
    }

    public void setG0401250a(String g0401250a) {
        this.g0401250a = g0401250a;
        notifyPropertyChanged(BR.g0401250a);
    }

    @Bindable
    public String getG0401250s() {
        return g0401250s;
    }

    public void setG0401250s(String g0401250s) {
        this.g0401250s = g0401250s;
        notifyPropertyChanged(BR.g0401250s);
    }

    @Bindable
    public String getG0401250sd() {
        return g0401250sd;
    }

    public void setG0401250sd(String g0401250sd) {
        this.g0401250sd = g0401250sd;
        notifyPropertyChanged(BR.g0401250sd);
    }

    @Bindable
    public String getG0401250sm() {
        return g0401250sm;
    }

    public void setG0401250sm(String g0401250sm) {
        this.g0401250sm = g0401250sm;
        notifyPropertyChanged(BR.g0401250sm);
    }

    @Bindable
    public String getG0401250p() {
        return g0401250p;
    }

    public void setG0401250p(String g0401250p) {
        this.g0401250p = g0401250p;
        notifyPropertyChanged(BR.g0401250p);
    }

    @Bindable
    public String getG0401260a() {
        return g0401260a;
    }

    public void setG0401260a(String g0401260a) {
        this.g0401260a = g0401260a;
        notifyPropertyChanged(BR.g0401260a);
    }

    @Bindable
    public String getG0401260s() {
        return g0401260s;
    }

    public void setG0401260s(String g0401260s) {
        this.g0401260s = g0401260s;
        notifyPropertyChanged(BR.g0401260s);
    }

    @Bindable
    public String getG0401260sd() {
        return g0401260sd;
    }

    public void setG0401260sd(String g0401260sd) {
        this.g0401260sd = g0401260sd;
        notifyPropertyChanged(BR.g0401260sd);
    }

    @Bindable
    public String getG0401260sm() {
        return g0401260sm;
    }

    public void setG0401260sm(String g0401260sm) {
        this.g0401260sm = g0401260sm;
        notifyPropertyChanged(BR.g0401260sm);
    }

    @Bindable
    public String getG0401260p() {
        return g0401260p;
    }

    public void setG0401260p(String g0401260p) {
        this.g0401260p = g0401260p;
        notifyPropertyChanged(BR.g0401260p);
    }

    @Bindable
    public String getG0401270a() {
        return g0401270a;
    }

    public void setG0401270a(String g0401270a) {
        this.g0401270a = g0401270a;
        notifyPropertyChanged(BR.g0401270a);
    }

    @Bindable
    public String getG0401270s() {
        return g0401270s;
    }

    public void setG0401270s(String g0401270s) {
        this.g0401270s = g0401270s;
        notifyPropertyChanged(BR.g0401270s);
    }

    @Bindable
    public String getG0401270sd() {
        return g0401270sd;
    }

    public void setG0401270sd(String g0401270sd) {
        this.g0401270sd = g0401270sd;
        notifyPropertyChanged(BR.g0401270sd);
    }

    @Bindable
    public String getG0401270sm() {
        return g0401270sm;
    }

    public void setG0401270sm(String g0401270sm) {
        this.g0401270sm = g0401270sm;
        notifyPropertyChanged(BR.g0401270sm);
    }

    @Bindable
    public String getG0401270p() {
        return g0401270p;
    }

    public void setG0401270p(String g0401270p) {
        this.g0401270p = g0401270p;
        notifyPropertyChanged(BR.g0401270p);
    }

    @Bindable
    public String getG0401280a() {
        return g0401280a;
    }

    public void setG0401280a(String g0401280a) {
        this.g0401280a = g0401280a;
        notifyPropertyChanged(BR.g0401280a);
    }

    @Bindable
    public String getG0401280s() {
        return g0401280s;
    }

    public void setG0401280s(String g0401280s) {
        this.g0401280s = g0401280s;
        notifyPropertyChanged(BR.g0401280s);
    }

    @Bindable
    public String getG0401280sd() {
        return g0401280sd;
    }

    public void setG0401280sd(String g0401280sd) {
        this.g0401280sd = g0401280sd;
        notifyPropertyChanged(BR.g0401280sd);
    }

    @Bindable
    public String getG0401280sm() {
        return g0401280sm;
    }

    public void setG0401280sm(String g0401280sm) {
        this.g0401280sm = g0401280sm;
        notifyPropertyChanged(BR.g0401280sm);
    }

    @Bindable
    public String getG0401280p() {
        return g0401280p;
    }

    public void setG0401280p(String g0401280p) {
        this.g0401280p = g0401280p;
        notifyPropertyChanged(BR.g0401280p);
    }

    @Bindable
    public String getG0401290a() {
        return g0401290a;
    }

    public void setG0401290a(String g0401290a) {
        this.g0401290a = g0401290a;
        notifyPropertyChanged(BR.g0401290a);
    }

    @Bindable
    public String getG0401290s() {
        return g0401290s;
    }

    public void setG0401290s(String g0401290s) {
        this.g0401290s = g0401290s;
        notifyPropertyChanged(BR.g0401290s);
    }

    @Bindable
    public String getG0401290sd() {
        return g0401290sd;
    }

    public void setG0401290sd(String g0401290sd) {
        this.g0401290sd = g0401290sd;
        notifyPropertyChanged(BR.g0401290sd);
    }

    @Bindable
    public String getG0401290sm() {
        return g0401290sm;
    }

    public void setG0401290sm(String g0401290sm) {
        this.g0401290sm = g0401290sm;
        notifyPropertyChanged(BR.g0401290sm);
    }

    @Bindable
    public String getG0401290p() {
        return g0401290p;
    }

    public void setG0401290p(String g0401290p) {
        this.g0401290p = g0401290p;
        notifyPropertyChanged(BR.g0401290p);
    }

    @Bindable
    public String getG0401300a() {
        return g0401300a;
    }

    public void setG0401300a(String g0401300a) {
        this.g0401300a = g0401300a;
        notifyPropertyChanged(BR.g0401300a);
    }

    @Bindable
    public String getG0401300s() {
        return g0401300s;
    }

    public void setG0401300s(String g0401300s) {
        this.g0401300s = g0401300s;
        notifyPropertyChanged(BR.g0401300s);
    }

    @Bindable
    public String getG0401300sd() {
        return g0401300sd;
    }

    public void setG0401300sd(String g0401300sd) {
        this.g0401300sd = g0401300sd;
        notifyPropertyChanged(BR.g0401300sd);
    }

    @Bindable
    public String getG0401300sm() {
        return g0401300sm;
    }

    public void setG0401300sm(String g0401300sm) {
        this.g0401300sm = g0401300sm;
        notifyPropertyChanged(BR.g0401300sm);
    }

    @Bindable
    public String getG0401300p() {
        return g0401300p;
    }

    public void setG0401300p(String g0401300p) {
        this.g0401300p = g0401300p;
        notifyPropertyChanged(BR.g0401300p);
    }

    @Bindable
    public String getG0401310a() {
        return g0401310a;
    }

    public void setG0401310a(String g0401310a) {
        this.g0401310a = g0401310a;
        notifyPropertyChanged(BR.g0401310a);
    }

    @Bindable
    public String getG0401310s() {
        return g0401310s;
    }

    public void setG0401310s(String g0401310s) {
        this.g0401310s = g0401310s;
        notifyPropertyChanged(BR.g0401310s);
    }

    @Bindable
    public String getG0401310sd() {
        return g0401310sd;
    }

    public void setG0401310sd(String g0401310sd) {
        this.g0401310sd = g0401310sd;
        notifyPropertyChanged(BR.g0401310sd);
    }

    @Bindable
    public String getG0401310sm() {
        return g0401310sm;
    }

    public void setG0401310sm(String g0401310sm) {
        this.g0401310sm = g0401310sm;
        notifyPropertyChanged(BR.g0401310sm);
    }

    @Bindable
    public String getG0401310p() {
        return g0401310p;
    }

    public void setG0401310p(String g0401310p) {
        this.g0401310p = g0401310p;
        notifyPropertyChanged(BR.g0401310p);
    }

    @Bindable
    public String getG0401320a() {
        return g0401320a;
    }

    public void setG0401320a(String g0401320a) {
        this.g0401320a = g0401320a;
        notifyPropertyChanged(BR.g0401320a);
    }

    @Bindable
    public String getG0401320s() {
        return g0401320s;
    }

    public void setG0401320s(String g0401320s) {
        this.g0401320s = g0401320s;
        notifyPropertyChanged(BR.g0401320s);
    }

    @Bindable
    public String getG0401320sd() {
        return g0401320sd;
    }

    public void setG0401320sd(String g0401320sd) {
        this.g0401320sd = g0401320sd;
        notifyPropertyChanged(BR.g0401320sd);
    }

    @Bindable
    public String getG0401320sm() {
        return g0401320sm;
    }

    public void setG0401320sm(String g0401320sm) {
        this.g0401320sm = g0401320sm;
        notifyPropertyChanged(BR.g0401320sm);
    }

    @Bindable
    public String getG0401320p() {
        return g0401320p;
    }

    public void setG0401320p(String g0401320p) {
        this.g0401320p = g0401320p;
        notifyPropertyChanged(BR.g0401320p);
    }

    @Bindable
    public String getG0401330a() {
        return g0401330a;
    }

    public void setG0401330a(String g0401330a) {
        this.g0401330a = g0401330a;
        notifyPropertyChanged(BR.g0401330a);
    }

    @Bindable
    public String getG0401330s() {
        return g0401330s;
    }

    public void setG0401330s(String g0401330s) {
        this.g0401330s = g0401330s;
        notifyPropertyChanged(BR.g0401330s);
    }

    @Bindable
    public String getG0401330sd() {
        return g0401330sd;
    }

    public void setG0401330sd(String g0401330sd) {
        this.g0401330sd = g0401330sd;
        notifyPropertyChanged(BR.g0401330sd);
    }

    @Bindable
    public String getG0401330sm() {
        return g0401330sm;
    }

    public void setG0401330sm(String g0401330sm) {
        this.g0401330sm = g0401330sm;
        notifyPropertyChanged(BR.g0401330sm);
    }

    @Bindable
    public String getG0401330p() {
        return g0401330p;
    }

    public void setG0401330p(String g0401330p) {
        this.g0401330p = g0401330p;
        notifyPropertyChanged(BR.g0401330p);
    }

    @Bindable
    public String getG0401340a() {
        return g0401340a;
    }

    public void setG0401340a(String g0401340a) {
        this.g0401340a = g0401340a;
        notifyPropertyChanged(BR.g0401340a);
    }

    @Bindable
    public String getG0401340s() {
        return g0401340s;
    }

    public void setG0401340s(String g0401340s) {
        this.g0401340s = g0401340s;
        notifyPropertyChanged(BR.g0401340s);
    }

    @Bindable
    public String getG0401340sd() {
        return g0401340sd;
    }

    public void setG0401340sd(String g0401340sd) {
        this.g0401340sd = g0401340sd;
        notifyPropertyChanged(BR.g0401340sd);
    }

    @Bindable
    public String getG0401340sm() {
        return g0401340sm;
    }

    public void setG0401340sm(String g0401340sm) {
        this.g0401340sm = g0401340sm;
        notifyPropertyChanged(BR.g0401340sm);
    }

    @Bindable
    public String getG0401340p() {
        return g0401340p;
    }

    public void setG0401340p(String g0401340p) {
        this.g0401340p = g0401340p;
        notifyPropertyChanged(BR.g0401340p);
    }

    @Bindable
    public String getG0401350a() {
        return g0401350a;
    }

    public void setG0401350a(String g0401350a) {
        this.g0401350a = g0401350a;
        notifyPropertyChanged(BR.g0401350a);
    }

    @Bindable
    public String getG0401350s() {
        return g0401350s;
    }

    public void setG0401350s(String g0401350s) {
        this.g0401350s = g0401350s;
        notifyPropertyChanged(BR.g0401350s);
    }

    @Bindable
    public String getG0401350sd() {
        return g0401350sd;
    }

    public void setG0401350sd(String g0401350sd) {
        this.g0401350sd = g0401350sd;
        notifyPropertyChanged(BR.g0401350sd);
    }

    @Bindable
    public String getG0401350sm() {
        return g0401350sm;
    }

    public void setG0401350sm(String g0401350sm) {
        this.g0401350sm = g0401350sm;
        notifyPropertyChanged(BR.g0401350sm);
    }

    @Bindable
    public String getG0401350p() {
        return g0401350p;
    }

    public void setG0401350p(String g0401350p) {
        this.g0401350p = g0401350p;
        notifyPropertyChanged(BR.g0401350p);
    }

    @Bindable
    public String getG0401360a() {
        return g0401360a;
    }

    public void setG0401360a(String g0401360a) {
        this.g0401360a = g0401360a;
        notifyPropertyChanged(BR.g0401360a);
    }

    @Bindable
    public String getG0401360s() {
        return g0401360s;
    }

    public void setG0401360s(String g0401360s) {
        this.g0401360s = g0401360s;
        notifyPropertyChanged(BR.g0401360s);
    }

    @Bindable
    public String getG0401360sd() {
        return g0401360sd;
    }

    public void setG0401360sd(String g0401360sd) {
        this.g0401360sd = g0401360sd;
        notifyPropertyChanged(BR.g0401360sd);
    }

    @Bindable
    public String getG0401360sm() {
        return g0401360sm;
    }

    public void setG0401360sm(String g0401360sm) {
        this.g0401360sm = g0401360sm;
        notifyPropertyChanged(BR.g0401360sm);
    }

    @Bindable
    public String getG0401360p() {
        return g0401360p;
    }

    public void setG0401360p(String g0401360p) {
        this.g0401360p = g0401360p;
        notifyPropertyChanged(BR.g0401360p);
    }

    @Bindable
    public String getG0401370a() {
        return g0401370a;
    }

    public void setG0401370a(String g0401370a) {
        this.g0401370a = g0401370a;
        notifyPropertyChanged(BR.g0401370a);
    }

    @Bindable
    public String getG0401370s() {
        return g0401370s;
    }

    public void setG0401370s(String g0401370s) {
        this.g0401370s = g0401370s;
        notifyPropertyChanged(BR.g0401370s);
    }

    @Bindable
    public String getG0401370sd() {
        return g0401370sd;
    }

    public void setG0401370sd(String g0401370sd) {
        this.g0401370sd = g0401370sd;
        notifyPropertyChanged(BR.g0401370sd);
    }

    @Bindable
    public String getG0401370sm() {
        return g0401370sm;
    }

    public void setG0401370sm(String g0401370sm) {
        this.g0401370sm = g0401370sm;
        notifyPropertyChanged(BR.g0401370sm);
    }

    @Bindable
    public String getG0401370p() {
        return g0401370p;
    }

    public void setG0401370p(String g0401370p) {
        this.g0401370p = g0401370p;
        notifyPropertyChanged(BR.g0401370p);
    }

    @Bindable
    public String getG0401380a() {
        return g0401380a;
    }

    public void setG0401380a(String g0401380a) {
        this.g0401380a = g0401380a;
        notifyPropertyChanged(BR.g0401380a);
    }

    @Bindable
    public String getG0401380s() {
        return g0401380s;
    }

    public void setG0401380s(String g0401380s) {
        this.g0401380s = g0401380s;
        notifyPropertyChanged(BR.g0401380s);
    }

    @Bindable
    public String getG0401380sd() {
        return g0401380sd;
    }

    public void setG0401380sd(String g0401380sd) {
        this.g0401380sd = g0401380sd;
        notifyPropertyChanged(BR.g0401380sd);
    }

    @Bindable
    public String getG0401380sm() {
        return g0401380sm;
    }

    public void setG0401380sm(String g0401380sm) {
        this.g0401380sm = g0401380sm;
        notifyPropertyChanged(BR.g0401380sm);
    }

    @Bindable
    public String getG0401380p() {
        return g0401380p;
    }

    public void setG0401380p(String g0401380p) {
        this.g0401380p = g0401380p;
        notifyPropertyChanged(BR.g0401380p);
    }

    @Bindable
    public String getG0401390a() {
        return g0401390a;
    }

    public void setG0401390a(String g0401390a) {
        this.g0401390a = g0401390a;
        notifyPropertyChanged(BR.g0401390a);
    }

    @Bindable
    public String getG0401390s() {
        return g0401390s;
    }

    public void setG0401390s(String g0401390s) {
        this.g0401390s = g0401390s;
        notifyPropertyChanged(BR.g0401390s);
    }

    @Bindable
    public String getG0401390sd() {
        return g0401390sd;
    }

    public void setG0401390sd(String g0401390sd) {
        this.g0401390sd = g0401390sd;
        notifyPropertyChanged(BR.g0401390sd);
    }

    @Bindable
    public String getG0401390sm() {
        return g0401390sm;
    }

    public void setG0401390sm(String g0401390sm) {
        this.g0401390sm = g0401390sm;
        notifyPropertyChanged(BR.g0401390sm);
    }

    @Bindable
    public String getG0401390p() {
        return g0401390p;
    }

    public void setG0401390p(String g0401390p) {
        this.g0401390p = g0401390p;
        notifyPropertyChanged(BR.g0401390p);
    }

    @Bindable
    public String getG0401400a() {
        return g0401400a;
    }

    public void setG0401400a(String g0401400a) {
        this.g0401400a = g0401400a;
        notifyPropertyChanged(BR.g0401400a);
    }

    @Bindable
    public String getG0401400s() {
        return g0401400s;
    }

    public void setG0401400s(String g0401400s) {
        this.g0401400s = g0401400s;
        notifyPropertyChanged(BR.g0401400s);
    }

    @Bindable
    public String getG0401400sd() {
        return g0401400sd;
    }

    public void setG0401400sd(String g0401400sd) {
        this.g0401400sd = g0401400sd;
        notifyPropertyChanged(BR.g0401400sd);
    }

    @Bindable
    public String getG0401400sm() {
        return g0401400sm;
    }

    public void setG0401400sm(String g0401400sm) {
        this.g0401400sm = g0401400sm;
        notifyPropertyChanged(BR.g0401400sm);
    }

    @Bindable
    public String getG0401400p() {
        return g0401400p;
    }

    public void setG0401400p(String g0401400p) {
        this.g0401400p = g0401400p;
        notifyPropertyChanged(BR.g0401400p);
    }

    @Bindable
    public String getG0401410a() {
        return g0401410a;
    }

    public void setG0401410a(String g0401410a) {
        this.g0401410a = g0401410a;
        notifyPropertyChanged(BR.g0401410a);
    }

    @Bindable
    public String getG0401410s() {
        return g0401410s;
    }

    public void setG0401410s(String g0401410s) {
        this.g0401410s = g0401410s;
        notifyPropertyChanged(BR.g0401410s);
    }

    @Bindable
    public String getG0401410sd() {
        return g0401410sd;
    }

    public void setG0401410sd(String g0401410sd) {
        this.g0401410sd = g0401410sd;
        notifyPropertyChanged(BR.g0401410sd);
    }

    @Bindable
    public String getG0401410sm() {
        return g0401410sm;
    }

    public void setG0401410sm(String g0401410sm) {
        this.g0401410sm = g0401410sm;
        notifyPropertyChanged(BR.g0401410sm);
    }

    @Bindable
    public String getG0401410p() {
        return g0401410p;
    }

    public void setG0401410p(String g0401410p) {
        this.g0401410p = g0401410p;
        notifyPropertyChanged(BR.g0401410p);
    }

    @Bindable
    public String getG0401420a() {
        return g0401420a;
    }

    public void setG0401420a(String g0401420a) {
        this.g0401420a = g0401420a;
        notifyPropertyChanged(BR.g0401420a);
    }

    @Bindable
    public String getG0401420s() {
        return g0401420s;
    }

    public void setG0401420s(String g0401420s) {
        this.g0401420s = g0401420s;
        notifyPropertyChanged(BR.g0401420s);
    }

    @Bindable
    public String getG0401420sd() {
        return g0401420sd;
    }

    public void setG0401420sd(String g0401420sd) {
        this.g0401420sd = g0401420sd;
        notifyPropertyChanged(BR.g0401420sd);
    }

    @Bindable
    public String getG0401420sm() {
        return g0401420sm;
    }

    public void setG0401420sm(String g0401420sm) {
        this.g0401420sm = g0401420sm;
        notifyPropertyChanged(BR.g0401420sm);
    }

    @Bindable
    public String getG0401420p() {
        return g0401420p;
    }

    public void setG0401420p(String g0401420p) {
        this.g0401420p = g0401420p;
        notifyPropertyChanged(BR.g0401420p);
    }

    @Bindable
    public String getG0401430a() {
        return g0401430a;
    }

    public void setG0401430a(String g0401430a) {
        this.g0401430a = g0401430a;
        notifyPropertyChanged(BR.g0401430a);
    }

    @Bindable
    public String getG0401430s() {
        return g0401430s;
    }

    public void setG0401430s(String g0401430s) {
        this.g0401430s = g0401430s;
        notifyPropertyChanged(BR.g0401430s);
    }

    @Bindable
    public String getG0401430sd() {
        return g0401430sd;
    }

    public void setG0401430sd(String g0401430sd) {
        this.g0401430sd = g0401430sd;
        notifyPropertyChanged(BR.g0401430sd);
    }

    @Bindable
    public String getG0401430sm() {
        return g0401430sm;
    }

    public void setG0401430sm(String g0401430sm) {
        this.g0401430sm = g0401430sm;
        notifyPropertyChanged(BR.g0401430sm);
    }

    @Bindable
    public String getG0401430p() {
        return g0401430p;
    }

    public void setG0401430p(String g0401430p) {
        this.g0401430p = g0401430p;
        notifyPropertyChanged(BR.g0401430p);
    }

    @Bindable
    public String getG0401440a() {
        return g0401440a;
    }

    public void setG0401440a(String g0401440a) {
        this.g0401440a = g0401440a;
        notifyPropertyChanged(BR.g0401440a);
    }

    @Bindable
    public String getG0401440s() {
        return g0401440s;
    }

    public void setG0401440s(String g0401440s) {
        this.g0401440s = g0401440s;
        notifyPropertyChanged(BR.g0401440s);
    }

    @Bindable
    public String getG0401440sd() {
        return g0401440sd;
    }

    public void setG0401440sd(String g0401440sd) {
        this.g0401440sd = g0401440sd;
        notifyPropertyChanged(BR.g0401440sd);
    }

    @Bindable
    public String getG0401440sm() {
        return g0401440sm;
    }

    public void setG0401440sm(String g0401440sm) {
        this.g0401440sm = g0401440sm;
        notifyPropertyChanged(BR.g0401440sm);
    }

    @Bindable
    public String getG0401440p() {
        return g0401440p;
    }

    public void setG0401440p(String g0401440p) {
        this.g0401440p = g0401440p;
        notifyPropertyChanged(BR.g0401440p);
    }

    @Bindable
    public String getG040210a() {
        return g040210a;
    }

    public void setG040210a(String g040210a) {
        this.g040210a = g040210a;
        notifyPropertyChanged(BR.g040210a);
    }

    @Bindable
    public String getG040210s() {
        return g040210s;
    }

    public void setG040210s(String g040210s) {
        this.g040210s = g040210s;
        notifyPropertyChanged(BR.g040210s);
    }

    @Bindable
    public String getG040210sd() {
        return g040210sd;
    }

    public void setG040210sd(String g040210sd) {
        this.g040210sd = g040210sd;
        notifyPropertyChanged(BR.g040210sd);
    }

    @Bindable
    public String getG040210sm() {
        return g040210sm;
    }

    public void setG040210sm(String g040210sm) {
        this.g040210sm = g040210sm;
        notifyPropertyChanged(BR.g040210sm);
    }

    @Bindable
    public String getG040210p() {
        return g040210p;
    }

    public void setG040210p(String g040210p) {
        this.g040210p = g040210p;
        notifyPropertyChanged(BR.g040210p);
    }

    @Bindable
    public String getG040220a() {
        return g040220a;
    }

    public void setG040220a(String g040220a) {
        this.g040220a = g040220a;
        notifyPropertyChanged(BR.g040220a);
    }

    @Bindable
    public String getG040220s() {
        return g040220s;
    }

    public void setG040220s(String g040220s) {
        this.g040220s = g040220s;
        notifyPropertyChanged(BR.g040220s);
    }

    @Bindable
    public String getG040220sd() {
        return g040220sd;
    }

    public void setG040220sd(String g040220sd) {
        this.g040220sd = g040220sd;
        notifyPropertyChanged(BR.g040220sd);
    }

    @Bindable
    public String getG040220sm() {
        return g040220sm;
    }

    public void setG040220sm(String g040220sm) {
        this.g040220sm = g040220sm;
        notifyPropertyChanged(BR.g040220sm);
    }

    @Bindable
    public String getG040220p() {
        return g040220p;
    }

    public void setG040220p(String g040220p) {
        this.g040220p = g040220p;
        notifyPropertyChanged(BR.g040220p);
    }

    @Bindable
    public String getG040230a() {
        return g040230a;
    }

    public void setG040230a(String g040230a) {
        this.g040230a = g040230a;
        notifyPropertyChanged(BR.g040230a);
    }

    @Bindable
    public String getG040230s() {
        return g040230s;
    }

    public void setG040230s(String g040230s) {
        this.g040230s = g040230s;
        notifyPropertyChanged(BR.g040230s);
    }

    @Bindable
    public String getG040230sd() {
        return g040230sd;
    }

    public void setG040230sd(String g040230sd) {
        this.g040230sd = g040230sd;
        notifyPropertyChanged(BR.g040230sd);
    }

    @Bindable
    public String getG040230sm() {
        return g040230sm;
    }

    public void setG040230sm(String g040230sm) {
        this.g040230sm = g040230sm;
        notifyPropertyChanged(BR.g040230sm);
    }

    @Bindable
    public String getG040230p() {
        return g040230p;
    }

    public void setG040230p(String g040230p) {
        this.g040230p = g040230p;
        notifyPropertyChanged(BR.g040230p);
    }

    @Bindable
    public String getG040240a() {
        return g040240a;
    }

    public void setG040240a(String g040240a) {
        this.g040240a = g040240a;
        notifyPropertyChanged(BR.g040240a);
    }

    @Bindable
    public String getG040240s() {
        return g040240s;
    }

    public void setG040240s(String g040240s) {
        this.g040240s = g040240s;
        notifyPropertyChanged(BR.g040240s);
    }

    @Bindable
    public String getG040240sd() {
        return g040240sd;
    }

    public void setG040240sd(String g040240sd) {
        this.g040240sd = g040240sd;
        notifyPropertyChanged(BR.g040240sd);
    }

    @Bindable
    public String getG040240sm() {
        return g040240sm;
    }

    public void setG040240sm(String g040240sm) {
        this.g040240sm = g040240sm;
        notifyPropertyChanged(BR.g040240sm);
    }

    @Bindable
    public String getG040240p() {
        return g040240p;
    }

    public void setG040240p(String g040240p) {
        this.g040240p = g040240p;
        notifyPropertyChanged(BR.g040240p);
    }

    @Bindable
    public String getG040250a() {
        return g040250a;
    }

    public void setG040250a(String g040250a) {
        this.g040250a = g040250a;
        notifyPropertyChanged(BR.g040250a);
    }

    @Bindable
    public String getG040250s() {
        return g040250s;
    }

    public void setG040250s(String g040250s) {
        this.g040250s = g040250s;
        notifyPropertyChanged(BR.g040250s);
    }

    @Bindable
    public String getG040250sd() {
        return g040250sd;
    }

    public void setG040250sd(String g040250sd) {
        this.g040250sd = g040250sd;
        notifyPropertyChanged(BR.g040250sd);
    }

    @Bindable
    public String getG040250sm() {
        return g040250sm;
    }

    public void setG040250sm(String g040250sm) {
        this.g040250sm = g040250sm;
        notifyPropertyChanged(BR.g040250sm);
    }

    @Bindable
    public String getG040250p() {
        return g040250p;
    }

    public void setG040250p(String g040250p) {
        this.g040250p = g040250p;
        notifyPropertyChanged(BR.g040250p);
    }

    @Bindable
    public String getG040260a() {
        return g040260a;
    }

    public void setG040260a(String g040260a) {
        this.g040260a = g040260a;
        notifyPropertyChanged(BR.g040260a);
    }

    @Bindable
    public String getG040260s() {
        return g040260s;
    }

    public void setG040260s(String g040260s) {
        this.g040260s = g040260s;
        notifyPropertyChanged(BR.g040260s);
    }

    @Bindable
    public String getG040260sd() {
        return g040260sd;
    }

    public void setG040260sd(String g040260sd) {
        this.g040260sd = g040260sd;
        notifyPropertyChanged(BR.g040260sd);
    }

    @Bindable
    public String getG040260sm() {
        return g040260sm;
    }

    public void setG040260sm(String g040260sm) {
        this.g040260sm = g040260sm;
        notifyPropertyChanged(BR.g040260sm);
    }

    @Bindable
    public String getG040260p() {
        return g040260p;
    }

    public void setG040260p(String g040260p) {
        this.g040260p = g040260p;
        notifyPropertyChanged(BR.g040260p);
    }

    @Bindable
    public String getG040270a() {
        return g040270a;
    }

    public void setG040270a(String g040270a) {
        this.g040270a = g040270a;
        notifyPropertyChanged(BR.g040270a);
    }

    @Bindable
    public String getG040270s() {
        return g040270s;
    }

    public void setG040270s(String g040270s) {
        this.g040270s = g040270s;
        notifyPropertyChanged(BR.g040270s);
    }

    @Bindable
    public String getG040270sd() {
        return g040270sd;
    }

    public void setG040270sd(String g040270sd) {
        this.g040270sd = g040270sd;
        notifyPropertyChanged(BR.g040270sd);
    }

    @Bindable
    public String getG040270sm() {
        return g040270sm;
    }

    public void setG040270sm(String g040270sm) {
        this.g040270sm = g040270sm;
        notifyPropertyChanged(BR.g040270sm);
    }

    @Bindable
    public String getG040270p() {
        return g040270p;
    }

    public void setG040270p(String g040270p) {
        this.g040270p = g040270p;
        notifyPropertyChanged(BR.g040270p);
    }

    @Bindable
    public String getG040280a() {
        return g040280a;
    }

    public void setG040280a(String g040280a) {
        this.g040280a = g040280a;
        notifyPropertyChanged(BR.g040280a);
    }

    @Bindable
    public String getG040280s() {
        return g040280s;
    }

    public void setG040280s(String g040280s) {
        this.g040280s = g040280s;
        notifyPropertyChanged(BR.g040280s);
    }

    @Bindable
    public String getG040280sd() {
        return g040280sd;
    }

    public void setG040280sd(String g040280sd) {
        this.g040280sd = g040280sd;
        notifyPropertyChanged(BR.g040280sd);
    }

    @Bindable
    public String getG040280sm() {
        return g040280sm;
    }

    public void setG040280sm(String g040280sm) {
        this.g040280sm = g040280sm;
        notifyPropertyChanged(BR.g040280sm);
    }

    @Bindable
    public String getG040280p() {
        return g040280p;
    }

    public void setG040280p(String g040280p) {
        this.g040280p = g040280p;
        notifyPropertyChanged(BR.g040280p);
    }

    @Bindable
    public String getG040290a() {
        return g040290a;
    }

    public void setG040290a(String g040290a) {
        this.g040290a = g040290a;
        notifyPropertyChanged(BR.g040290a);
    }

    @Bindable
    public String getG040290s() {
        return g040290s;
    }

    public void setG040290s(String g040290s) {
        this.g040290s = g040290s;
        notifyPropertyChanged(BR.g040290s);
    }

    @Bindable
    public String getG040290sd() {
        return g040290sd;
    }

    public void setG040290sd(String g040290sd) {
        this.g040290sd = g040290sd;
        notifyPropertyChanged(BR.g040290sd);
    }

    @Bindable
    public String getG040290sm() {
        return g040290sm;
    }

    public void setG040290sm(String g040290sm) {
        this.g040290sm = g040290sm;
        notifyPropertyChanged(BR.g040290sm);
    }

    @Bindable
    public String getG040290p() {
        return g040290p;
    }

    public void setG040290p(String g040290p) {
        this.g040290p = g040290p;
        notifyPropertyChanged(BR.g040290p);
    }

    @Bindable
    public String getG0402100a() {
        return g0402100a;
    }

    public void setG0402100a(String g0402100a) {
        this.g0402100a = g0402100a;
        notifyPropertyChanged(BR.g0402100a);
    }

    @Bindable
    public String getG0402100s() {
        return g0402100s;
    }

    public void setG0402100s(String g0402100s) {
        this.g0402100s = g0402100s;
        notifyPropertyChanged(BR.g0402100s);
    }

    @Bindable
    public String getG0402100sd() {
        return g0402100sd;
    }

    public void setG0402100sd(String g0402100sd) {
        this.g0402100sd = g0402100sd;
        notifyPropertyChanged(BR.g0402100sd);
    }

    @Bindable
    public String getG0402100sm() {
        return g0402100sm;
    }

    public void setG0402100sm(String g0402100sm) {
        this.g0402100sm = g0402100sm;
        notifyPropertyChanged(BR.g0402100sm);
    }

    @Bindable
    public String getG0402100p() {
        return g0402100p;
    }

    public void setG0402100p(String g0402100p) {
        this.g0402100p = g0402100p;
        notifyPropertyChanged(BR.g0402100p);
    }

    @Bindable
    public String getG040310a() {
        return g040310a;
    }

    public void setG040310a(String g040310a) {
        this.g040310a = g040310a;
        notifyPropertyChanged(BR.g040310a);
    }

    @Bindable
    public String getG040310s() {
        return g040310s;
    }

    public void setG040310s(String g040310s) {
        this.g040310s = g040310s;
        notifyPropertyChanged(BR.g040310s);
    }

    @Bindable
    public String getG040310sd() {
        return g040310sd;
    }

    public void setG040310sd(String g040310sd) {
        this.g040310sd = g040310sd;
        notifyPropertyChanged(BR.g040310sd);
    }

    @Bindable
    public String getG040310sm() {
        return g040310sm;
    }

    public void setG040310sm(String g040310sm) {
        this.g040310sm = g040310sm;
        notifyPropertyChanged(BR.g040310sm);
    }

    @Bindable
    public String getG040310p() {
        return g040310p;
    }

    public void setG040310p(String g040310p) {
        this.g040310p = g040310p;
        notifyPropertyChanged(BR.g040310p);
    }

    @Bindable
    public String getG040320a() {
        return g040320a;
    }

    public void setG040320a(String g040320a) {
        this.g040320a = g040320a;
        notifyPropertyChanged(BR.g040320a);
    }

    @Bindable
    public String getG040320s() {
        return g040320s;
    }

    public void setG040320s(String g040320s) {
        this.g040320s = g040320s;
        notifyPropertyChanged(BR.g040320s);
    }

    @Bindable
    public String getG040320sd() {
        return g040320sd;
    }

    public void setG040320sd(String g040320sd) {
        this.g040320sd = g040320sd;
        notifyPropertyChanged(BR.g040320sd);
    }

    @Bindable
    public String getG040320sm() {
        return g040320sm;
    }

    public void setG040320sm(String g040320sm) {
        this.g040320sm = g040320sm;
        notifyPropertyChanged(BR.g040320sm);
    }

    @Bindable
    public String getG040320p() {
        return g040320p;
    }

    public void setG040320p(String g040320p) {
        this.g040320p = g040320p;
        notifyPropertyChanged(BR.g040320p);
    }

    @Bindable
    public String getG040330a() {
        return g040330a;
    }

    public void setG040330a(String g040330a) {
        this.g040330a = g040330a;
        notifyPropertyChanged(BR.g040330a);
    }

    @Bindable
    public String getG040330s() {
        return g040330s;
    }

    public void setG040330s(String g040330s) {
        this.g040330s = g040330s;
        notifyPropertyChanged(BR.g040330s);
    }

    @Bindable
    public String getG040330sd() {
        return g040330sd;
    }

    public void setG040330sd(String g040330sd) {
        this.g040330sd = g040330sd;
        notifyPropertyChanged(BR.g040330sd);
    }

    @Bindable
    public String getG040330sm() {
        return g040330sm;
    }

    public void setG040330sm(String g040330sm) {
        this.g040330sm = g040330sm;
        notifyPropertyChanged(BR.g040330sm);
    }

    @Bindable
    public String getG040330p() {
        return g040330p;
    }

    public void setG040330p(String g040330p) {
        this.g040330p = g040330p;
        notifyPropertyChanged(BR.g040330p);
    }

    @Bindable
    public String getG040340a() {
        return g040340a;
    }

    public void setG040340a(String g040340a) {
        this.g040340a = g040340a;
        notifyPropertyChanged(BR.g040340a);
    }

    @Bindable
    public String getG040340s() {
        return g040340s;
    }

    public void setG040340s(String g040340s) {
        this.g040340s = g040340s;
        notifyPropertyChanged(BR.g040340s);
    }

    @Bindable
    public String getG040340sd() {
        return g040340sd;
    }

    public void setG040340sd(String g040340sd) {
        this.g040340sd = g040340sd;
        notifyPropertyChanged(BR.g040340sd);
    }

    @Bindable
    public String getG040340sm() {
        return g040340sm;
    }

    public void setG040340sm(String g040340sm) {
        this.g040340sm = g040340sm;
        notifyPropertyChanged(BR.g040340sm);
    }

    @Bindable
    public String getG040340p() {
        return g040340p;
    }

    public void setG040340p(String g040340p) {
        this.g040340p = g040340p;
        notifyPropertyChanged(BR.g040340p);
    }

    @Bindable
    public String getG040350a() {
        return g040350a;
    }

    public void setG040350a(String g040350a) {
        this.g040350a = g040350a;
        notifyPropertyChanged(BR.g040350a);
    }

    @Bindable
    public String getG040350s() {
        return g040350s;
    }

    public void setG040350s(String g040350s) {
        this.g040350s = g040350s;
        notifyPropertyChanged(BR.g040350s);
    }

    @Bindable
    public String getG040350sd() {
        return g040350sd;
    }

    public void setG040350sd(String g040350sd) {
        this.g040350sd = g040350sd;
        notifyPropertyChanged(BR.g040350sd);
    }

    @Bindable
    public String getG040350sm() {
        return g040350sm;
    }

    public void setG040350sm(String g040350sm) {
        this.g040350sm = g040350sm;
        notifyPropertyChanged(BR.g040350sm);
    }

    @Bindable
    public String getG040350p() {
        return g040350p;
    }

    public void setG040350p(String g040350p) {
        this.g040350p = g040350p;
        notifyPropertyChanged(BR.g040350p);
    }

    @Bindable
    public String getG040360a() {
        return g040360a;
    }

    public void setG040360a(String g040360a) {
        this.g040360a = g040360a;
        notifyPropertyChanged(BR.g040360a);
    }

    @Bindable
    public String getG040360s() {
        return g040360s;
    }

    public void setG040360s(String g040360s) {
        this.g040360s = g040360s;
        notifyPropertyChanged(BR.g040360s);
    }

    @Bindable
    public String getG040360sd() {
        return g040360sd;
    }

    public void setG040360sd(String g040360sd) {
        this.g040360sd = g040360sd;
        notifyPropertyChanged(BR.g040360sd);
    }

    @Bindable
    public String getG040360sm() {
        return g040360sm;
    }

    public void setG040360sm(String g040360sm) {
        this.g040360sm = g040360sm;
        notifyPropertyChanged(BR.g040360sm);
    }

    @Bindable
    public String getG040360p() {
        return g040360p;
    }

    public void setG040360p(String g040360p) {
        this.g040360p = g040360p;
        notifyPropertyChanged(BR.g040360p);
    }

    @Bindable
    public String getG040370a() {
        return g040370a;
    }

    public void setG040370a(String g040370a) {
        this.g040370a = g040370a;
        notifyPropertyChanged(BR.g040370a);
    }

    @Bindable
    public String getG040370s() {
        return g040370s;
    }

    public void setG040370s(String g040370s) {
        this.g040370s = g040370s;
        notifyPropertyChanged(BR.g040370s);
    }

    @Bindable
    public String getG040370sd() {
        return g040370sd;
    }

    public void setG040370sd(String g040370sd) {
        this.g040370sd = g040370sd;
        notifyPropertyChanged(BR.g040370sd);
    }

    @Bindable
    public String getG040370sm() {
        return g040370sm;
    }

    public void setG040370sm(String g040370sm) {
        this.g040370sm = g040370sm;
        notifyPropertyChanged(BR.g040370sm);
    }

    @Bindable
    public String getG040370p() {
        return g040370p;
    }

    public void setG040370p(String g040370p) {
        this.g040370p = g040370p;
        notifyPropertyChanged(BR.g040370p);
    }

    @Bindable
    public String getG040380a() {
        return g040380a;
    }

    public void setG040380a(String g040380a) {
        this.g040380a = g040380a;
        notifyPropertyChanged(BR.g040380a);
    }

    @Bindable
    public String getG040380s() {
        return g040380s;
    }

    public void setG040380s(String g040380s) {
        this.g040380s = g040380s;
        notifyPropertyChanged(BR.g040380s);
    }

    @Bindable
    public String getG040380sd() {
        return g040380sd;
    }

    public void setG040380sd(String g040380sd) {
        this.g040380sd = g040380sd;
        notifyPropertyChanged(BR.g040380sd);
    }

    @Bindable
    public String getG040380sm() {
        return g040380sm;
    }

    public void setG040380sm(String g040380sm) {
        this.g040380sm = g040380sm;
        notifyPropertyChanged(BR.g040380sm);
    }

    @Bindable
    public String getG040380p() {
        return g040380p;
    }

    public void setG040380p(String g040380p) {
        this.g040380p = g040380p;
        notifyPropertyChanged(BR.g040380p);
    }

    @Bindable
    public String getG040390a() {
        return g040390a;
    }

    public void setG040390a(String g040390a) {
        this.g040390a = g040390a;
        notifyPropertyChanged(BR.g040390a);
    }

    @Bindable
    public String getG040390s() {
        return g040390s;
    }

    public void setG040390s(String g040390s) {
        this.g040390s = g040390s;
        notifyPropertyChanged(BR.g040390s);
    }

    @Bindable
    public String getG040390sd() {
        return g040390sd;
    }

    public void setG040390sd(String g040390sd) {
        this.g040390sd = g040390sd;
        notifyPropertyChanged(BR.g040390sd);
    }

    @Bindable
    public String getG040390sm() {
        return g040390sm;
    }

    public void setG040390sm(String g040390sm) {
        this.g040390sm = g040390sm;
        notifyPropertyChanged(BR.g040390sm);
    }

    @Bindable
    public String getG040390p() {
        return g040390p;
    }

    public void setG040390p(String g040390p) {
        this.g040390p = g040390p;
        notifyPropertyChanged(BR.g040390p);
    }

    @Bindable
    public String getG0403100a() {
        return g0403100a;
    }

    public void setG0403100a(String g0403100a) {
        this.g0403100a = g0403100a;
        notifyPropertyChanged(BR.g0403100a);
    }

    @Bindable
    public String getG0403100s() {
        return g0403100s;
    }

    public void setG0403100s(String g0403100s) {
        this.g0403100s = g0403100s;
        notifyPropertyChanged(BR.g0403100s);
    }

    @Bindable
    public String getG0403100sd() {
        return g0403100sd;
    }

    public void setG0403100sd(String g0403100sd) {
        this.g0403100sd = g0403100sd;
        notifyPropertyChanged(BR.g0403100sd);
    }

    @Bindable
    public String getG0403100sm() {
        return g0403100sm;
    }

    public void setG0403100sm(String g0403100sm) {
        this.g0403100sm = g0403100sm;
        notifyPropertyChanged(BR.g0403100sm);
    }

    @Bindable
    public String getG0403100p() {
        return g0403100p;
    }

    public void setG0403100p(String g0403100p) {
        this.g0403100p = g0403100p;
        notifyPropertyChanged(BR.g0403100p);
    }

    @Bindable
    public String getG0403110a() {
        return g0403110a;
    }

    public void setG0403110a(String g0403110a) {
        this.g0403110a = g0403110a;
        notifyPropertyChanged(BR.g0403110a);
    }

    @Bindable
    public String getG0403110s() {
        return g0403110s;
    }

    public void setG0403110s(String g0403110s) {
        this.g0403110s = g0403110s;
        notifyPropertyChanged(BR.g0403110s);
    }

    @Bindable
    public String getG0403110sd() {
        return g0403110sd;
    }

    public void setG0403110sd(String g0403110sd) {
        this.g0403110sd = g0403110sd;
        notifyPropertyChanged(BR.g0403110sd);
    }

    @Bindable
    public String getG0403110sm() {
        return g0403110sm;
    }

    public void setG0403110sm(String g0403110sm) {
        this.g0403110sm = g0403110sm;
        notifyPropertyChanged(BR.g0403110sm);
    }

    @Bindable
    public String getG0403110p() {
        return g0403110p;
    }

    public void setG0403110p(String g0403110p) {
        this.g0403110p = g0403110p;
        notifyPropertyChanged(BR.g0403110p);
    }

    @Bindable
    public String getG0403120a() {
        return g0403120a;
    }

    public void setG0403120a(String g0403120a) {
        this.g0403120a = g0403120a;
        notifyPropertyChanged(BR.g0403120a);
    }

    @Bindable
    public String getG0403120s() {
        return g0403120s;
    }

    public void setG0403120s(String g0403120s) {
        this.g0403120s = g0403120s;
        notifyPropertyChanged(BR.g0403120s);
    }

    @Bindable
    public String getG0403120sd() {
        return g0403120sd;
    }

    public void setG0403120sd(String g0403120sd) {
        this.g0403120sd = g0403120sd;
        notifyPropertyChanged(BR.g0403120sd);
    }

    @Bindable
    public String getG0403120sm() {
        return g0403120sm;
    }

    public void setG0403120sm(String g0403120sm) {
        this.g0403120sm = g0403120sm;
        notifyPropertyChanged(BR.g0403120sm);
    }

    @Bindable
    public String getG0403120p() {
        return g0403120p;
    }

    public void setG0403120p(String g0403120p) {
        this.g0403120p = g0403120p;
        notifyPropertyChanged(BR.g0403120p);
    }

    @Bindable
    public String getG0403130a() {
        return g0403130a;
    }

    public void setG0403130a(String g0403130a) {
        this.g0403130a = g0403130a;
        notifyPropertyChanged(BR.g0403130a);
    }

    @Bindable
    public String getG0403130s() {
        return g0403130s;
    }

    public void setG0403130s(String g0403130s) {
        this.g0403130s = g0403130s;
        notifyPropertyChanged(BR.g0403130s);
    }

    @Bindable
    public String getG0403130sd() {
        return g0403130sd;
    }

    public void setG0403130sd(String g0403130sd) {
        this.g0403130sd = g0403130sd;
        notifyPropertyChanged(BR.g0403130sd);
    }

    @Bindable
    public String getG0403130sm() {
        return g0403130sm;
    }

    public void setG0403130sm(String g0403130sm) {
        this.g0403130sm = g0403130sm;
        notifyPropertyChanged(BR.g0403130sm);
    }

    @Bindable
    public String getG0403130p() {
        return g0403130p;
    }

    public void setG0403130p(String g0403130p) {
        this.g0403130p = g0403130p;
        notifyPropertyChanged(BR.g0403130p);
    }

    @Bindable
    public String getG0403140a() {
        return g0403140a;
    }

    public void setG0403140a(String g0403140a) {
        this.g0403140a = g0403140a;
        notifyPropertyChanged(BR.g0403140a);
    }

    @Bindable
    public String getG0403140s() {
        return g0403140s;
    }

    public void setG0403140s(String g0403140s) {
        this.g0403140s = g0403140s;
        notifyPropertyChanged(BR.g0403140s);
    }

    @Bindable
    public String getG0403140sd() {
        return g0403140sd;
    }

    public void setG0403140sd(String g0403140sd) {
        this.g0403140sd = g0403140sd;
        notifyPropertyChanged(BR.g0403140sd);
    }

    @Bindable
    public String getG0403140sm() {
        return g0403140sm;
    }

    public void setG0403140sm(String g0403140sm) {
        this.g0403140sm = g0403140sm;
        notifyPropertyChanged(BR.g0403140sm);
    }

    @Bindable
    public String getG0403140p() {
        return g0403140p;
    }

    public void setG0403140p(String g0403140p) {
        this.g0403140p = g0403140p;
        notifyPropertyChanged(BR.g0403140p);
    }

    @Bindable
    public String getG0403150a() {
        return g0403150a;
    }

    public void setG0403150a(String g0403150a) {
        this.g0403150a = g0403150a;
        notifyPropertyChanged(BR.g0403150a);
    }

    @Bindable
    public String getG0403150s() {
        return g0403150s;
    }

    public void setG0403150s(String g0403150s) {
        this.g0403150s = g0403150s;
        notifyPropertyChanged(BR.g0403150s);
    }

    @Bindable
    public String getG0403150sd() {
        return g0403150sd;
    }

    public void setG0403150sd(String g0403150sd) {
        this.g0403150sd = g0403150sd;
        notifyPropertyChanged(BR.g0403150sd);
    }

    @Bindable
    public String getG0403150sm() {
        return g0403150sm;
    }

    public void setG0403150sm(String g0403150sm) {
        this.g0403150sm = g0403150sm;
        notifyPropertyChanged(BR.g0403150sm);
    }

    @Bindable
    public String getG0403150p() {
        return g0403150p;
    }

    public void setG0403150p(String g0403150p) {
        this.g0403150p = g0403150p;
        notifyPropertyChanged(BR.g0403150p);
    }

    @Bindable
    public String getG0403160a() {
        return g0403160a;
    }

    public void setG0403160a(String g0403160a) {
        this.g0403160a = g0403160a;
        notifyPropertyChanged(BR.g0403160a);
    }

    @Bindable
    public String getG0403160s() {
        return g0403160s;
    }

    public void setG0403160s(String g0403160s) {
        this.g0403160s = g0403160s;
        notifyPropertyChanged(BR.g0403160s);
    }

    @Bindable
    public String getG0403160sd() {
        return g0403160sd;
    }

    public void setG0403160sd(String g0403160sd) {
        this.g0403160sd = g0403160sd;
        notifyPropertyChanged(BR.g0403160sd);
    }

    @Bindable
    public String getG0403160sm() {
        return g0403160sm;
    }

    public void setG0403160sm(String g0403160sm) {
        this.g0403160sm = g0403160sm;
        notifyPropertyChanged(BR.g0403160sm);
    }

    @Bindable
    public String getG0403160p() {
        return g0403160p;
    }

    public void setG0403160p(String g0403160p) {
        this.g0403160p = g0403160p;
        notifyPropertyChanged(BR.g0403160p);
    }

    @Bindable
    public String getG0403170a() {
        return g0403170a;
    }

    public void setG0403170a(String g0403170a) {
        this.g0403170a = g0403170a;
        notifyPropertyChanged(BR.g0403170a);
    }

    @Bindable
    public String getG0403170s() {
        return g0403170s;
    }

    public void setG0403170s(String g0403170s) {
        this.g0403170s = g0403170s;
        notifyPropertyChanged(BR.g0403170s);
    }

    @Bindable
    public String getG0403170sd() {
        return g0403170sd;
    }

    public void setG0403170sd(String g0403170sd) {
        this.g0403170sd = g0403170sd;
        notifyPropertyChanged(BR.g0403170sd);
    }

    @Bindable
    public String getG0403170sm() {
        return g0403170sm;
    }

    public void setG0403170sm(String g0403170sm) {
        this.g0403170sm = g0403170sm;
        notifyPropertyChanged(BR.g0403170sm);
    }

    @Bindable
    public String getG0403170p() {
        return g0403170p;
    }

    public void setG0403170p(String g0403170p) {
        this.g0403170p = g0403170p;
        notifyPropertyChanged(BR.g0403170p);
    }

    @Bindable
    public String getG0403180a() {
        return g0403180a;
    }

    public void setG0403180a(String g0403180a) {
        this.g0403180a = g0403180a;
        notifyPropertyChanged(BR.g0403180a);
    }

    @Bindable
    public String getG0403180s() {
        return g0403180s;
    }

    public void setG0403180s(String g0403180s) {
        this.g0403180s = g0403180s;
        notifyPropertyChanged(BR.g0403180s);
    }

    @Bindable
    public String getG0403180sd() {
        return g0403180sd;
    }

    public void setG0403180sd(String g0403180sd) {
        this.g0403180sd = g0403180sd;
        notifyPropertyChanged(BR.g0403180sd);
    }

    @Bindable
    public String getG0403180sm() {
        return g0403180sm;
    }

    public void setG0403180sm(String g0403180sm) {
        this.g0403180sm = g0403180sm;
        notifyPropertyChanged(BR.g0403180sm);
    }

    @Bindable
    public String getG0403180p() {
        return g0403180p;
    }

    public void setG0403180p(String g0403180p) {
        this.g0403180p = g0403180p;
        notifyPropertyChanged(BR.g0403180p);
    }

    @Bindable
    public String getG0403190a() {
        return g0403190a;
    }

    public void setG0403190a(String g0403190a) {
        this.g0403190a = g0403190a;
        notifyPropertyChanged(BR.g0403190a);
    }

    @Bindable
    public String getG0403190s() {
        return g0403190s;
    }

    public void setG0403190s(String g0403190s) {
        this.g0403190s = g0403190s;
        notifyPropertyChanged(BR.g0403190s);
    }

    @Bindable
    public String getG0403190sd() {
        return g0403190sd;
    }

    public void setG0403190sd(String g0403190sd) {
        this.g0403190sd = g0403190sd;
        notifyPropertyChanged(BR.g0403190sd);
    }

    @Bindable
    public String getG0403190sm() {
        return g0403190sm;
    }

    public void setG0403190sm(String g0403190sm) {
        this.g0403190sm = g0403190sm;
        notifyPropertyChanged(BR.g0403190sm);
    }

    @Bindable
    public String getG0403190p() {
        return g0403190p;
    }

    public void setG0403190p(String g0403190p) {
        this.g0403190p = g0403190p;
        notifyPropertyChanged(BR.g0403190p);
    }

    @Bindable
    public String getG0403200a() {
        return g0403200a;
    }

    public void setG0403200a(String g0403200a) {
        this.g0403200a = g0403200a;
        notifyPropertyChanged(BR.g0403200a);
    }

    @Bindable
    public String getG0403200s() {
        return g0403200s;
    }

    public void setG0403200s(String g0403200s) {
        this.g0403200s = g0403200s;
        notifyPropertyChanged(BR.g0403200s);
    }

    @Bindable
    public String getG0403200sd() {
        return g0403200sd;
    }

    public void setG0403200sd(String g0403200sd) {
        this.g0403200sd = g0403200sd;
        notifyPropertyChanged(BR.g0403200sd);
    }

    @Bindable
    public String getG0403200sm() {
        return g0403200sm;
    }

    public void setG0403200sm(String g0403200sm) {
        this.g0403200sm = g0403200sm;
        notifyPropertyChanged(BR.g0403200sm);
    }

    @Bindable
    public String getG0403200p() {
        return g0403200p;
    }

    public void setG0403200p(String g0403200p) {
        this.g0403200p = g0403200p;
        notifyPropertyChanged(BR.g0403200p);
    }

    @Bindable
    public String getG0403210a() {
        return g0403210a;
    }

    public void setG0403210a(String g0403210a) {
        this.g0403210a = g0403210a;
        notifyPropertyChanged(BR.g0403210a);
    }

    @Bindable
    public String getG0403210s() {
        return g0403210s;
    }

    public void setG0403210s(String g0403210s) {
        this.g0403210s = g0403210s;
        notifyPropertyChanged(BR.g0403210s);
    }

    @Bindable
    public String getG0403210sd() {
        return g0403210sd;
    }

    public void setG0403210sd(String g0403210sd) {
        this.g0403210sd = g0403210sd;
        notifyPropertyChanged(BR.g0403210sd);
    }

    @Bindable
    public String getG0403210sm() {
        return g0403210sm;
    }

    public void setG0403210sm(String g0403210sm) {
        this.g0403210sm = g0403210sm;
        notifyPropertyChanged(BR.g0403210sm);
    }

    @Bindable
    public String getG0403210p() {
        return g0403210p;
    }

    public void setG0403210p(String g0403210p) {
        this.g0403210p = g0403210p;
        notifyPropertyChanged(BR.g0403210p);
    }

    @Bindable
    public String getG0403220a() {
        return g0403220a;
    }

    public void setG0403220a(String g0403220a) {
        this.g0403220a = g0403220a;
        notifyPropertyChanged(BR.g0403220a);
    }

    @Bindable
    public String getG0403220s() {
        return g0403220s;
    }

    public void setG0403220s(String g0403220s) {
        this.g0403220s = g0403220s;
        notifyPropertyChanged(BR.g0403220s);
    }

    @Bindable
    public String getG0403220sd() {
        return g0403220sd;
    }

    public void setG0403220sd(String g0403220sd) {
        this.g0403220sd = g0403220sd;
        notifyPropertyChanged(BR.g0403220sd);
    }

    @Bindable
    public String getG0403220sm() {
        return g0403220sm;
    }

    public void setG0403220sm(String g0403220sm) {
        this.g0403220sm = g0403220sm;
        notifyPropertyChanged(BR.g0403220sm);
    }

    @Bindable
    public String getG0403220p() {
        return g0403220p;
    }

    public void setG0403220p(String g0403220p) {
        this.g0403220p = g0403220p;
        notifyPropertyChanged(BR.g0403220p);
    }

    @Bindable
    public String getG0403230a() {
        return g0403230a;
    }

    public void setG0403230a(String g0403230a) {
        this.g0403230a = g0403230a;
        notifyPropertyChanged(BR.g0403230a);
    }

    @Bindable
    public String getG0403230s() {
        return g0403230s;
    }

    public void setG0403230s(String g0403230s) {
        this.g0403230s = g0403230s;
        notifyPropertyChanged(BR.g0403230s);
    }

    @Bindable
    public String getG0403230sd() {
        return g0403230sd;
    }

    public void setG0403230sd(String g0403230sd) {
        this.g0403230sd = g0403230sd;
        notifyPropertyChanged(BR.g0403230sd);
    }

    @Bindable
    public String getG0403230sm() {
        return g0403230sm;
    }

    public void setG0403230sm(String g0403230sm) {
        this.g0403230sm = g0403230sm;
        notifyPropertyChanged(BR.g0403230sm);
    }

    @Bindable
    public String getG0403230p() {
        return g0403230p;
    }

    public void setG0403230p(String g0403230p) {
        this.g0403230p = g0403230p;
        notifyPropertyChanged(BR.g0403230p);
    }

    @Bindable
    public String getG0403240a() {
        return g0403240a;
    }

    public void setG0403240a(String g0403240a) {
        this.g0403240a = g0403240a;
        notifyPropertyChanged(BR.g0403240a);
    }

    @Bindable
    public String getG0403240s() {
        return g0403240s;
    }

    public void setG0403240s(String g0403240s) {
        this.g0403240s = g0403240s;
        notifyPropertyChanged(BR.g0403240s);
    }

    @Bindable
    public String getG0403240sd() {
        return g0403240sd;
    }

    public void setG0403240sd(String g0403240sd) {
        this.g0403240sd = g0403240sd;
        notifyPropertyChanged(BR.g0403240sd);
    }

    @Bindable
    public String getG0403240sm() {
        return g0403240sm;
    }

    public void setG0403240sm(String g0403240sm) {
        this.g0403240sm = g0403240sm;
        notifyPropertyChanged(BR.g0403240sm);
    }

    @Bindable
    public String getG0403240p() {
        return g0403240p;
    }

    public void setG0403240p(String g0403240p) {
        this.g0403240p = g0403240p;
        notifyPropertyChanged(BR.g0403240p);
    }

    @Bindable
    public String getG0403250a() {
        return g0403250a;
    }

    public void setG0403250a(String g0403250a) {
        this.g0403250a = g0403250a;
        notifyPropertyChanged(BR.g0403250a);
    }

    @Bindable
    public String getG0403250s() {
        return g0403250s;
    }

    public void setG0403250s(String g0403250s) {
        this.g0403250s = g0403250s;
        notifyPropertyChanged(BR.g0403250s);
    }

    @Bindable
    public String getG0403250sd() {
        return g0403250sd;
    }

    public void setG0403250sd(String g0403250sd) {
        this.g0403250sd = g0403250sd;
        notifyPropertyChanged(BR.g0403250sd);
    }

    @Bindable
    public String getG0403250sm() {
        return g0403250sm;
    }

    public void setG0403250sm(String g0403250sm) {
        this.g0403250sm = g0403250sm;
        notifyPropertyChanged(BR.g0403250sm);
    }

    @Bindable
    public String getG0403250p() {
        return g0403250p;
    }

    public void setG0403250p(String g0403250p) {
        this.g0403250p = g0403250p;
        notifyPropertyChanged(BR.g0403250p);
    }

    @Bindable
    public String getG0403260a() {
        return g0403260a;
    }

    public void setG0403260a(String g0403260a) {
        this.g0403260a = g0403260a;
        notifyPropertyChanged(BR.g0403260a);
    }

    @Bindable
    public String getG0403260s() {
        return g0403260s;
    }

    public void setG0403260s(String g0403260s) {
        this.g0403260s = g0403260s;
        notifyPropertyChanged(BR.g0403260s);
    }

    @Bindable
    public String getG0403260sd() {
        return g0403260sd;
    }

    public void setG0403260sd(String g0403260sd) {
        this.g0403260sd = g0403260sd;
        notifyPropertyChanged(BR.g0403260sd);
    }

    @Bindable
    public String getG0403260sm() {
        return g0403260sm;
    }

    public void setG0403260sm(String g0403260sm) {
        this.g0403260sm = g0403260sm;
        notifyPropertyChanged(BR.g0403260sm);
    }

    @Bindable
    public String getG0403260p() {
        return g0403260p;
    }

    public void setG0403260p(String g0403260p) {
        this.g0403260p = g0403260p;
        notifyPropertyChanged(BR.g0403260p);
    }

    @Bindable
    public String getG0403270a() {
        return g0403270a;
    }

    public void setG0403270a(String g0403270a) {
        this.g0403270a = g0403270a;
        notifyPropertyChanged(BR.g0403270a);
    }

    @Bindable
    public String getG0403270s() {
        return g0403270s;
    }

    public void setG0403270s(String g0403270s) {
        this.g0403270s = g0403270s;
        notifyPropertyChanged(BR.g0403270s);
    }

    @Bindable
    public String getG0403270sd() {
        return g0403270sd;
    }

    public void setG0403270sd(String g0403270sd) {
        this.g0403270sd = g0403270sd;
        notifyPropertyChanged(BR.g0403270sd);
    }

    @Bindable
    public String getG0403270sm() {
        return g0403270sm;
    }

    public void setG0403270sm(String g0403270sm) {
        this.g0403270sm = g0403270sm;
        notifyPropertyChanged(BR.g0403270sm);
    }

    @Bindable
    public String getG0403270p() {
        return g0403270p;
    }

    public void setG0403270p(String g0403270p) {
        this.g0403270p = g0403270p;
        notifyPropertyChanged(BR.g0403270p);
    }

    @Bindable
    public String getG040410a() {
        return g040410a;
    }

    public void setG040410a(String g040410a) {
        this.g040410a = g040410a;
        notifyPropertyChanged(BR.g040410a);
    }

    @Bindable
    public String getG040410s() {
        return g040410s;
    }

    public void setG040410s(String g040410s) {
        this.g040410s = g040410s;
        notifyPropertyChanged(BR.g040410s);
    }

    @Bindable
    public String getG040410sd() {
        return g040410sd;
    }

    public void setG040410sd(String g040410sd) {
        this.g040410sd = g040410sd;
        notifyPropertyChanged(BR.g040410sd);
    }

    @Bindable
    public String getG040410sm() {
        return g040410sm;
    }

    public void setG040410sm(String g040410sm) {
        this.g040410sm = g040410sm;
        notifyPropertyChanged(BR.g040410sm);
    }

    @Bindable
    public String getG040410p() {
        return g040410p;
    }

    public void setG040410p(String g040410p) {
        this.g040410p = g040410p;
        notifyPropertyChanged(BR.g040410p);
    }

    @Bindable
    public String getG040420a() {
        return g040420a;
    }

    public void setG040420a(String g040420a) {
        this.g040420a = g040420a;
        notifyPropertyChanged(BR.g040420a);
    }

    @Bindable
    public String getG040420s() {
        return g040420s;
    }

    public void setG040420s(String g040420s) {
        this.g040420s = g040420s;
        notifyPropertyChanged(BR.g040420s);
    }

    @Bindable
    public String getG040420sd() {
        return g040420sd;
    }

    public void setG040420sd(String g040420sd) {
        this.g040420sd = g040420sd;
        notifyPropertyChanged(BR.g040420sd);
    }

    @Bindable
    public String getG040420sm() {
        return g040420sm;
    }

    public void setG040420sm(String g040420sm) {
        this.g040420sm = g040420sm;
        notifyPropertyChanged(BR.g040420sm);
    }

    @Bindable
    public String getG040420p() {
        return g040420p;
    }

    public void setG040420p(String g040420p) {
        this.g040420p = g040420p;
        notifyPropertyChanged(BR.g040420p);
    }

    @Bindable
    public String getG040430a() {
        return g040430a;
    }

    public void setG040430a(String g040430a) {
        this.g040430a = g040430a;
        notifyPropertyChanged(BR.g040430a);
    }

    @Bindable
    public String getG040430s() {
        return g040430s;
    }

    public void setG040430s(String g040430s) {
        this.g040430s = g040430s;
        notifyPropertyChanged(BR.g040430s);
    }

    @Bindable
    public String getG040430sd() {
        return g040430sd;
    }

    public void setG040430sd(String g040430sd) {
        this.g040430sd = g040430sd;
        notifyPropertyChanged(BR.g040430sd);
    }

    @Bindable
    public String getG040430sm() {
        return g040430sm;
    }

    public void setG040430sm(String g040430sm) {
        this.g040430sm = g040430sm;
        notifyPropertyChanged(BR.g040430sm);
    }

    @Bindable
    public String getG040430p() {
        return g040430p;
    }

    public void setG040430p(String g040430p) {
        this.g040430p = g040430p;
        notifyPropertyChanged(BR.g040430p);
    }

    @Bindable
    public String getG040440a() {
        return g040440a;
    }

    public void setG040440a(String g040440a) {
        this.g040440a = g040440a;
        notifyPropertyChanged(BR.g040440a);
    }

    @Bindable
    public String getG040440s() {
        return g040440s;
    }

    public void setG040440s(String g040440s) {
        this.g040440s = g040440s;
        notifyPropertyChanged(BR.g040440s);
    }

    @Bindable
    public String getG040440sd() {
        return g040440sd;
    }

    public void setG040440sd(String g040440sd) {
        this.g040440sd = g040440sd;
        notifyPropertyChanged(BR.g040440sd);
    }

    @Bindable
    public String getG040440sm() {
        return g040440sm;
    }

    public void setG040440sm(String g040440sm) {
        this.g040440sm = g040440sm;
        notifyPropertyChanged(BR.g040440sm);
    }

    @Bindable
    public String getG040440p() {
        return g040440p;
    }

    public void setG040440p(String g040440p) {
        this.g040440p = g040440p;
        notifyPropertyChanged(BR.g040440p);
    }

    @Bindable
    public String getG040450a() {
        return g040450a;
    }

    public void setG040450a(String g040450a) {
        this.g040450a = g040450a;
        notifyPropertyChanged(BR.g040450a);
    }

    @Bindable
    public String getG040450s() {
        return g040450s;
    }

    public void setG040450s(String g040450s) {
        this.g040450s = g040450s;
        notifyPropertyChanged(BR.g040450s);
    }

    @Bindable
    public String getG040450sd() {
        return g040450sd;
    }

    public void setG040450sd(String g040450sd) {
        this.g040450sd = g040450sd;
        notifyPropertyChanged(BR.g040450sd);
    }

    @Bindable
    public String getG040450sm() {
        return g040450sm;
    }

    public void setG040450sm(String g040450sm) {
        this.g040450sm = g040450sm;
        notifyPropertyChanged(BR.g040450sm);
    }

    @Bindable
    public String getG040450p() {
        return g040450p;
    }

    public void setG040450p(String g040450p) {
        this.g040450p = g040450p;
        notifyPropertyChanged(BR.g040450p);
    }

    @Bindable
    public String getG040460a() {
        return g040460a;
    }

    public void setG040460a(String g040460a) {
        this.g040460a = g040460a;
        notifyPropertyChanged(BR.g040460a);
    }

    @Bindable
    public String getG040460s() {
        return g040460s;
    }

    public void setG040460s(String g040460s) {
        this.g040460s = g040460s;
        notifyPropertyChanged(BR.g040460s);
    }

    @Bindable
    public String getG040460sd() {
        return g040460sd;
    }

    public void setG040460sd(String g040460sd) {
        this.g040460sd = g040460sd;
        notifyPropertyChanged(BR.g040460sd);
    }

    @Bindable
    public String getG040460sm() {
        return g040460sm;
    }

    public void setG040460sm(String g040460sm) {
        this.g040460sm = g040460sm;
        notifyPropertyChanged(BR.g040460sm);
    }

    @Bindable
    public String getG040460p() {
        return g040460p;
    }

    public void setG040460p(String g040460p) {
        this.g040460p = g040460p;
        notifyPropertyChanged(BR.g040460p);
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
            this.g0208 = json.getString("g0208");
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
            this.g040110a = json.getString("g040110a");
            this.g040110s = json.getString("g040110s");
            this.g040110sd = json.getString("g040110sd");
            this.g040110sm = json.getString("g040110sm");
            this.g040110p = json.getString("g040110p");
            this.g040120a = json.getString("g040120a");
            this.g040120s = json.getString("g040120s");
            this.g040120sd = json.getString("g040120sd");
            this.g040120sm = json.getString("g040120sm");
            this.g040120p = json.getString("g040120p");
            this.g04013 = json.getString("g04013");
            this.g04010a = json.getString("g04010a");
            this.g04010s = json.getString("g04010s");
            this.g04010sd = json.getString("g04010sd");
            this.g04010sm = json.getString("g04010sm");
            this.g04010p = json.getString("g04010p");
            this.g040150a = json.getString("g040150a");
            this.g040150s = json.getString("g040150s");
            this.g040150sd = json.getString("g040150sd");
            this.g040150sm = json.getString("g040150sm");
            this.g040150p = json.getString("g040150p");
            this.g040160a = json.getString("g040160a");
            this.g040160s = json.getString("g040160s");
            this.g040160sd = json.getString("g040160sd");
            this.g040160sm = json.getString("g040160sm");
            this.g040160p = json.getString("g040160p");
            this.g040170a = json.getString("g040170a");
            this.g040170s = json.getString("g040170s");
            this.g040170sd = json.getString("g040170sd");
            this.g040170sm = json.getString("g040170sm");
            this.g040170p = json.getString("g040170p");
            this.g040180a = json.getString("g040180a");
            this.g040180s = json.getString("g040180s");
            this.g040180sd = json.getString("g040180sd");
            this.g040180sm = json.getString("g040180sm");
            this.g040180p = json.getString("g040180p");
            this.g040190a = json.getString("g040190a");
            this.g040190s = json.getString("g040190s");
            this.g040190sd = json.getString("g040190sd");
            this.g040190sm = json.getString("g040190sm");
            this.g040190p = json.getString("g040190p");
            this.g0401100a = json.getString("g0401100a");
            this.g0401100s = json.getString("g0401100s");
            this.g0401100sd = json.getString("g0401100sd");
            this.g0401100sm = json.getString("g0401100sm");
            this.g0401100p = json.getString("g0401100p");
            this.g0401110a = json.getString("g0401110a");
            this.g0401110s = json.getString("g0401110s");
            this.g0401110sd = json.getString("g0401110sd");
            this.g0401110sm = json.getString("g0401110sm");
            this.g0401110p = json.getString("g0401110p");
            this.g0401120a = json.getString("g0401120a");
            this.g0401120s = json.getString("g0401120s");
            this.g0401120sd = json.getString("g0401120sd");
            this.g0401120sm = json.getString("g0401120sm");
            this.g0401120p = json.getString("g0401120p");
            this.g0401130a = json.getString("g0401130a");
            this.g0401130s = json.getString("g0401130s");
            this.g0401130sd = json.getString("g0401130sd");
            this.g0401130sm = json.getString("g0401130sm");
            this.g0401130p = json.getString("g0401130p");
            this.g0401140a = json.getString("g0401140a");
            this.g0401140s = json.getString("g0401140s");
            this.g0401140sd = json.getString("g0401140sd");
            this.g0401140sm = json.getString("g0401140sm");
            this.g0401140p = json.getString("g0401140p");
            this.g0401150a = json.getString("g0401150a");
            this.g0401150s = json.getString("g0401150s");
            this.g0401150sd = json.getString("g0401150sd");
            this.g0401150sm = json.getString("g0401150sm");
            this.g0401150p = json.getString("g0401150p");
            this.g0401160a = json.getString("g0401160a");
            this.g0401160s = json.getString("g0401160s");
            this.g0401160sd = json.getString("g0401160sd");
            this.g0401160sm = json.getString("g0401160sm");
            this.g0401160p = json.getString("g0401160p");
            this.g0401170a = json.getString("g0401170a");
            this.g0401170s = json.getString("g0401170s");
            this.g0401170sd = json.getString("g0401170sd");
            this.g0401170sm = json.getString("g0401170sm");
            this.g0401170p = json.getString("g0401170p");
        }
    }

    public void sG42Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG42Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g0401180a = json.getString("g0401180a");
            this.g0401180s = json.getString("g0401180s");
            this.g0401180sd = json.getString("g0401180sd");
            this.g0401180sm = json.getString("g0401180sm");
            this.g0401180p = json.getString("g0401180p");
            this.g0401190a = json.getString("g0401190a");
            this.g0401190s = json.getString("g0401190s");
            this.g0401190sd = json.getString("g0401190sd");
            this.g0401190sm = json.getString("g0401190sm");
            this.g0401190p = json.getString("g0401190p");
            this.g0401200a = json.getString("g0401200a");
            this.g0401200s = json.getString("g0401200s");
            this.g0401200sd = json.getString("g0401200sd");
            this.g0401200sm = json.getString("g0401200sm");
            this.g0401200p = json.getString("g0401200p");
            this.g0401210a = json.getString("g0401210a");
            this.g0401210s = json.getString("g0401210s");
            this.g0401210sd = json.getString("g0401210sd");
            this.g0401210sm = json.getString("g0401210sm");
            this.g0401210p = json.getString("g0401210p");
            this.g0401220a = json.getString("g0401220a");
            this.g0401220s = json.getString("g0401220s");
            this.g0401220sd = json.getString("g0401220sd");
            this.g0401220sm = json.getString("g0401220sm");
            this.g0401220p = json.getString("g0401220p");
            this.g0401230a = json.getString("g0401230a");
            this.g0401230s = json.getString("g0401230s");
            this.g0401230sd = json.getString("g0401230sd");
            this.g0401230sm = json.getString("g0401230sm");
            this.g0401230p = json.getString("g0401230p");
            this.g0401240a = json.getString("g0401240a");
            this.g0401240s = json.getString("g0401240s");
            this.g0401240sd = json.getString("g0401240sd");
            this.g0401240sm = json.getString("g0401240sm");
            this.g0401240p = json.getString("g0401240p");
            this.g0401250a = json.getString("g0401250a");
            this.g0401250s = json.getString("g0401250s");
            this.g0401250sd = json.getString("g0401250sd");
            this.g0401250sm = json.getString("g0401250sm");
            this.g0401250p = json.getString("g0401250p");
            this.g0401260a = json.getString("g0401260a");
            this.g0401260s = json.getString("g0401260s");
            this.g0401260sd = json.getString("g0401260sd");
            this.g0401260sm = json.getString("g0401260sm");
            this.g0401260p = json.getString("g0401260p");
            this.g0401270a = json.getString("g0401270a");
            this.g0401270s = json.getString("g0401270s");
            this.g0401270sd = json.getString("g0401270sd");
            this.g0401270sm = json.getString("g0401270sm");
            this.g0401270p = json.getString("g0401270p");
            this.g0401280a = json.getString("g0401280a");
            this.g0401280s = json.getString("g0401280s");
            this.g0401280sd = json.getString("g0401280sd");
            this.g0401280sm = json.getString("g0401280sm");
            this.g0401280p = json.getString("g0401280p");
            this.g0401290a = json.getString("g0401290a");
            this.g0401290s = json.getString("g0401290s");
            this.g0401290sd = json.getString("g0401290sd");
            this.g0401290sm = json.getString("g0401290sm");
            this.g0401290p = json.getString("g0401290p");
            this.g0401300a = json.getString("g0401300a");
            this.g0401300s = json.getString("g0401300s");
            this.g0401300sd = json.getString("g0401300sd");
            this.g0401300sm = json.getString("g0401300sm");
            this.g0401300p = json.getString("g0401300p");
            this.g0401310a = json.getString("g0401310a");
            this.g0401310s = json.getString("g0401310s");
            this.g0401310sd = json.getString("g0401310sd");
            this.g0401310sm = json.getString("g0401310sm");
            this.g0401310p = json.getString("g0401310p");
            this.g0401320a = json.getString("g0401320a");
            this.g0401320s = json.getString("g0401320s");
            this.g0401320sd = json.getString("g0401320sd");
            this.g0401320sm = json.getString("g0401320sm");
            this.g0401320p = json.getString("g0401320p");
            this.g0401330a = json.getString("g0401330a");
            this.g0401330s = json.getString("g0401330s");
            this.g0401330sd = json.getString("g0401330sd");
            this.g0401330sm = json.getString("g0401330sm");
            this.g0401330p = json.getString("g0401330p");
        }
    }

    public void sG43Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG43Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g0401340a = json.getString("g0401340a");
            this.g0401340s = json.getString("g0401340s");
            this.g0401340sd = json.getString("g0401340sd");
            this.g0401340sm = json.getString("g0401340sm");
            this.g0401340p = json.getString("g0401340p");
            this.g0401350a = json.getString("g0401350a");
            this.g0401350s = json.getString("g0401350s");
            this.g0401350sd = json.getString("g0401350sd");
            this.g0401350sm = json.getString("g0401350sm");
            this.g0401350p = json.getString("g0401350p");
            this.g0401360a = json.getString("g0401360a");
            this.g0401360s = json.getString("g0401360s");
            this.g0401360sd = json.getString("g0401360sd");
            this.g0401360sm = json.getString("g0401360sm");
            this.g0401360p = json.getString("g0401360p");
            this.g0401370a = json.getString("g0401370a");
            this.g0401370s = json.getString("g0401370s");
            this.g0401370sd = json.getString("g0401370sd");
            this.g0401370sm = json.getString("g0401370sm");
            this.g0401370p = json.getString("g0401370p");
            this.g0401380a = json.getString("g0401380a");
            this.g0401380s = json.getString("g0401380s");
            this.g0401380sd = json.getString("g0401380sd");
            this.g0401380sm = json.getString("g0401380sm");
            this.g0401380p = json.getString("g0401380p");
            this.g0401390a = json.getString("g0401390a");
            this.g0401390s = json.getString("g0401390s");
            this.g0401390sd = json.getString("g0401390sd");
            this.g0401390sm = json.getString("g0401390sm");
            this.g0401390p = json.getString("g0401390p");
            this.g0401400a = json.getString("g0401400a");
            this.g0401400s = json.getString("g0401400s");
            this.g0401400sd = json.getString("g0401400sd");
            this.g0401400sm = json.getString("g0401400sm");
            this.g0401400p = json.getString("g0401400p");
            this.g0401410a = json.getString("g0401410a");
            this.g0401410s = json.getString("g0401410s");
            this.g0401410sd = json.getString("g0401410sd");
            this.g0401410sm = json.getString("g0401410sm");
            this.g0401410p = json.getString("g0401410p");
            this.g0401420a = json.getString("g0401420a");
            this.g0401420s = json.getString("g0401420s");
            this.g0401420sd = json.getString("g0401420sd");
            this.g0401420sm = json.getString("g0401420sm");
            this.g0401420p = json.getString("g0401420p");
            this.g0401430a = json.getString("g0401430a");
            this.g0401430s = json.getString("g0401430s");
            this.g0401430sd = json.getString("g0401430sd");
            this.g0401430sm = json.getString("g0401430sm");
            this.g0401430p = json.getString("g0401430p");
            this.g0401440a = json.getString("g0401440a");
            this.g0401440s = json.getString("g0401440s");
            this.g0401440sd = json.getString("g0401440sd");
            this.g0401440sm = json.getString("g0401440sm");
            this.g0401440p = json.getString("g0401440p");
        }
    }

    public void sG44Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG44Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g040210a = json.getString("g040210a");
            this.g040210s = json.getString("g040210s");
            this.g040210sd = json.getString("g040210sd");
            this.g040210sm = json.getString("g040210sm");
            this.g040210p = json.getString("g040210p");
            this.g040220a = json.getString("g040220a");
            this.g040220s = json.getString("g040220s");
            this.g040220sd = json.getString("g040220sd");
            this.g040220sm = json.getString("g040220sm");
            this.g040220p = json.getString("g040220p");
            this.g040230a = json.getString("g040230a");
            this.g040230s = json.getString("g040230s");
            this.g040230sd = json.getString("g040230sd");
            this.g040230sm = json.getString("g040230sm");
            this.g040230p = json.getString("g040230p");
            this.g040240a = json.getString("g040240a");
            this.g040240s = json.getString("g040240s");
            this.g040240sd = json.getString("g040240sd");
            this.g040240sm = json.getString("g040240sm");
            this.g040240p = json.getString("g040240p");
            this.g040250a = json.getString("g040250a");
            this.g040250s = json.getString("g040250s");
            this.g040250sd = json.getString("g040250sd");
            this.g040250sm = json.getString("g040250sm");
            this.g040250p = json.getString("g040250p");
            this.g040260a = json.getString("g040260a");
            this.g040260s = json.getString("g040260s");
            this.g040260sd = json.getString("g040260sd");
            this.g040260sm = json.getString("g040260sm");
            this.g040260p = json.getString("g040260p");
            this.g040270a = json.getString("g040270a");
            this.g040270s = json.getString("g040270s");
            this.g040270sd = json.getString("g040270sd");
            this.g040270sm = json.getString("g040270sm");
            this.g040270p = json.getString("g040270p");
            this.g040280a = json.getString("g040280a");
            this.g040280s = json.getString("g040280s");
            this.g040280sd = json.getString("g040280sd");
            this.g040280sm = json.getString("g040280sm");
            this.g040280p = json.getString("g040280p");
            this.g040290a = json.getString("g040290a");
            this.g040290s = json.getString("g040290s");
            this.g040290sd = json.getString("g040290sd");
            this.g040290sm = json.getString("g040290sm");
            this.g040290p = json.getString("g040290p");
            this.g0402100a = json.getString("g0402100a");
            this.g0402100s = json.getString("g0402100s");
            this.g0402100sd = json.getString("g0402100sd");
            this.g0402100sm = json.getString("g0402100sm");
            this.g0402100p = json.getString("g0402100p");
            this.g040310a = json.getString("g040310a");
            this.g040310s = json.getString("g040310s");
            this.g040310sd = json.getString("g040310sd");
            this.g040310sm = json.getString("g040310sm");
            this.g040310p = json.getString("g040310p");
            this.g040320a = json.getString("g040320a");
            this.g040320s = json.getString("g040320s");
            this.g040320sd = json.getString("g040320sd");
            this.g040320sm = json.getString("g040320sm");
            this.g040320p = json.getString("g040320p");
            this.g040330a = json.getString("g040330a");
            this.g040330s = json.getString("g040330s");
            this.g040330sd = json.getString("g040330sd");
            this.g040330sm = json.getString("g040330sm");
            this.g040330p = json.getString("g040330p");
            this.g040340a = json.getString("g040340a");
            this.g040340s = json.getString("g040340s");
            this.g040340sd = json.getString("g040340sd");
            this.g040340sm = json.getString("g040340sm");
            this.g040340p = json.getString("g040340p");
            this.g040350a = json.getString("g040350a");
            this.g040350s = json.getString("g040350s");
            this.g040350sd = json.getString("g040350sd");
            this.g040350sm = json.getString("g040350sm");
            this.g040350p = json.getString("g040350p");
            this.g040360a = json.getString("g040360a");
            this.g040360s = json.getString("g040360s");
            this.g040360sd = json.getString("g040360sd");
            this.g040360sm = json.getString("g040360sm");
            this.g040360p = json.getString("g040360p");
        }
    }

    public void sG45Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG45Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g040370a = json.getString("g040370a");
            this.g040370s = json.getString("g040370s");
            this.g040370sd = json.getString("g040370sd");
            this.g040370sm = json.getString("g040370sm");
            this.g040370p = json.getString("g040370p");
            this.g040380a = json.getString("g040380a");
            this.g040380s = json.getString("g040380s");
            this.g040380sd = json.getString("g040380sd");
            this.g040380sm = json.getString("g040380sm");
            this.g040380p = json.getString("g040380p");
            this.g040390a = json.getString("g040390a");
            this.g040390s = json.getString("g040390s");
            this.g040390sd = json.getString("g040390sd");
            this.g040390sm = json.getString("g040390sm");
            this.g040390p = json.getString("g040390p");
            this.g0403100a = json.getString("g0403100a");
            this.g0403100s = json.getString("g0403100s");
            this.g0403100sd = json.getString("g0403100sd");
            this.g0403100sm = json.getString("g0403100sm");
            this.g0403100p = json.getString("g0403100p");
            this.g0403110a = json.getString("g0403110a");
            this.g0403110s = json.getString("g0403110s");
            this.g0403110sd = json.getString("g0403110sd");
            this.g0403110sm = json.getString("g0403110sm");
            this.g0403110p = json.getString("g0403110p");
            this.g0403120a = json.getString("g0403120a");
            this.g0403120s = json.getString("g0403120s");
            this.g0403120sd = json.getString("g0403120sd");
            this.g0403120sm = json.getString("g0403120sm");
            this.g0403120p = json.getString("g0403120p");
            this.g0403130a = json.getString("g0403130a");
            this.g0403130s = json.getString("g0403130s");
            this.g0403130sd = json.getString("g0403130sd");
            this.g0403130sm = json.getString("g0403130sm");
            this.g0403130p = json.getString("g0403130p");
            this.g0403140a = json.getString("g0403140a");
            this.g0403140s = json.getString("g0403140s");
            this.g0403140sd = json.getString("g0403140sd");
            this.g0403140sm = json.getString("g0403140sm");
            this.g0403140p = json.getString("g0403140p");
            this.g0403150a = json.getString("g0403150a");
            this.g0403150s = json.getString("g0403150s");
            this.g0403150sd = json.getString("g0403150sd");
            this.g0403150sm = json.getString("g0403150sm");
            this.g0403150p = json.getString("g0403150p");
            this.g0403160a = json.getString("g0403160a");
            this.g0403160s = json.getString("g0403160s");
            this.g0403160sd = json.getString("g0403160sd");
            this.g0403160sm = json.getString("g0403160sm");
            this.g0403160p = json.getString("g0403160p");
            this.g0403170a = json.getString("g0403170a");
            this.g0403170s = json.getString("g0403170s");
            this.g0403170sd = json.getString("g0403170sd");
            this.g0403170sm = json.getString("g0403170sm");
            this.g0403170p = json.getString("g0403170p");
            this.g0403180a = json.getString("g0403180a");
            this.g0403180s = json.getString("g0403180s");
            this.g0403180sd = json.getString("g0403180sd");
            this.g0403180sm = json.getString("g0403180sm");
            this.g0403180p = json.getString("g0403180p");
            this.g0403190a = json.getString("g0403190a");
            this.g0403190s = json.getString("g0403190s");
            this.g0403190sd = json.getString("g0403190sd");
            this.g0403190sm = json.getString("g0403190sm");
            this.g0403190p = json.getString("g0403190p");
            this.g0403200a = json.getString("g0403200a");
            this.g0403200s = json.getString("g0403200s");
            this.g0403200sd = json.getString("g0403200sd");
            this.g0403200sm = json.getString("g0403200sm");
            this.g0403200p = json.getString("g0403200p");
            this.g0403210a = json.getString("g0403210a");
            this.g0403210s = json.getString("g0403210s");
            this.g0403210sd = json.getString("g0403210sd");
            this.g0403210sm = json.getString("g0403210sm");
            this.g0403210p = json.getString("g0403210p");
            this.g0403220a = json.getString("g0403220a");
            this.g0403220s = json.getString("g0403220s");
            this.g0403220sd = json.getString("g0403220sd");
            this.g0403220sm = json.getString("g0403220sm");
            this.g0403220p = json.getString("g0403220p");
        }
    }

    public void sG46Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG46Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g0403230a = json.getString("g0403230a");
            this.g0403230s = json.getString("g0403230s");
            this.g0403230sd = json.getString("g0403230sd");
            this.g0403230sm = json.getString("g0403230sm");
            this.g0403230p = json.getString("g0403230p");
            this.g0403240a = json.getString("g0403240a");
            this.g0403240s = json.getString("g0403240s");
            this.g0403240sd = json.getString("g0403240sd");
            this.g0403240sm = json.getString("g0403240sm");
            this.g0403240p = json.getString("g0403240p");
            this.g0403250a = json.getString("g0403250a");
            this.g0403250s = json.getString("g0403250s");
            this.g0403250sd = json.getString("g0403250sd");
            this.g0403250sm = json.getString("g0403250sm");
            this.g0403250p = json.getString("g0403250p");
            this.g0403260a = json.getString("g0403260a");
            this.g0403260s = json.getString("g0403260s");
            this.g0403260sd = json.getString("g0403260sd");
            this.g0403260sm = json.getString("g0403260sm");
            this.g0403260p = json.getString("g0403260p");
            this.g0403270a = json.getString("g0403270a");
            this.g0403270s = json.getString("g0403270s");
            this.g0403270sd = json.getString("g0403270sd");
            this.g0403270sm = json.getString("g0403270sm");
            this.g0403270p = json.getString("g0403270p");
            this.g040410a = json.getString("g040410a");
            this.g040410s = json.getString("g040410s");
            this.g040410sd = json.getString("g040410sd");
            this.g040410sm = json.getString("g040410sm");
            this.g040410p = json.getString("g040410p");
            this.g040420a = json.getString("g040420a");
            this.g040420s = json.getString("g040420s");
            this.g040420sd = json.getString("g040420sd");
            this.g040420sm = json.getString("g040420sm");
            this.g040420p = json.getString("g040420p");
            this.g040430a = json.getString("g040430a");
            this.g040430s = json.getString("g040430s");
            this.g040430sd = json.getString("g040430sd");
            this.g040430sm = json.getString("g040430sm");
            this.g040430p = json.getString("g040430p");
            this.g040440a = json.getString("g040440a");
            this.g040440s = json.getString("g040440s");
            this.g040440sd = json.getString("g040440sd");
            this.g040440sm = json.getString("g040440sm");
            this.g040440p = json.getString("g040440p");
            this.g040450a = json.getString("g040450a");
            this.g040450s = json.getString("g040450s");
            this.g040450sd = json.getString("g040450sd");
            this.g040450sm = json.getString("g040450sm");
            this.g040450p = json.getString("g040450p");
            this.g040460a = json.getString("g040460a");
            this.g040460s = json.getString("g040460s");
            this.g040460sd = json.getString("g040460sd");
            this.g040460sm = json.getString("g040460sm");
            this.g040460p = json.getString("g040460p");
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
                .put("g0208", g0208);
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
        json.put("g040110a", g040110a)
                .put("g040110s", g040110s)
                .put("g040110sd", g040110sd)
                .put("g040110sm", g040110sm)
                .put("g040110p", g040110p)
                .put("g040120a", g040120a)
                .put("g040120s", g040120s)
                .put("g040120sd", g040120sd)
                .put("g040120sm", g040120sm)
                .put("g040120p", g040120p)
                .put("g04013", g04013)
                .put("g04010a", g04010a)
                .put("g04010s", g04010s)
                .put("g04010sd", g04010sd)
                .put("g04010sm", g04010sm)
                .put("g04010p", g04010p)
                .put("g040150a", g040150a)
                .put("g040150s", g040150s)
                .put("g040150sd", g040150sd)
                .put("g040150sm", g040150sm)
                .put("g040150p", g040150p)
                .put("g040160a", g040160a)
                .put("g040160s", g040160s)
                .put("g040160sd", g040160sd)
                .put("g040160sm", g040160sm)
                .put("g040160p", g040160p)
                .put("g040170a", g040170a)
                .put("g040170s", g040170s)
                .put("g040170sd", g040170sd)
                .put("g040170sm", g040170sm)
                .put("g040170p", g040170p)
                .put("g040180a", g040180a)
                .put("g040180s", g040180s)
                .put("g040180sd", g040180sd)
                .put("g040180sm", g040180sm)
                .put("g040180p", g040180p)
                .put("g040190a", g040190a)
                .put("g040190s", g040190s)
                .put("g040190sd", g040190sd)
                .put("g040190sm", g040190sm)
                .put("g040190p", g040190p)
                .put("g0401100a", g0401100a)
                .put("g0401100s", g0401100s)
                .put("g0401100sd", g0401100sd)
                .put("g0401100sm", g0401100sm)
                .put("g0401100p", g0401100p)
                .put("g0401110a", g0401110a)
                .put("g0401110s", g0401110s)
                .put("g0401110sd", g0401110sd)
                .put("g0401110sm", g0401110sm)
                .put("g0401110p", g0401110p)
                .put("g0401120a", g0401120a)
                .put("g0401120s", g0401120s)
                .put("g0401120sd", g0401120sd)
                .put("g0401120sm", g0401120sm)
                .put("g0401120p", g0401120p)
                .put("g0401130a", g0401130a)
                .put("g0401130s", g0401130s)
                .put("g0401130sd", g0401130sd)
                .put("g0401130sm", g0401130sm)
                .put("g0401130p", g0401130p)
                .put("g0401140a", g0401140a)
                .put("g0401140s", g0401140s)
                .put("g0401140sd", g0401140sd)
                .put("g0401140sm", g0401140sm)
                .put("g0401140p", g0401140p)
                .put("g0401150a", g0401150a)
                .put("g0401150s", g0401150s)
                .put("g0401150sd", g0401150sd)
                .put("g0401150sm", g0401150sm)
                .put("g0401150p", g0401150p)
                .put("g0401160a", g0401160a)
                .put("g0401160s", g0401160s)
                .put("g0401160sd", g0401160sd)
                .put("g0401160sm", g0401160sm)
                .put("g0401160p", g0401160p)
                .put("g0401170a", g0401170a)
                .put("g0401170s", g0401170s)
                .put("g0401170sd", g0401170sd)
                .put("g0401170sm", g0401170sm)
                .put("g0401170p", g0401170p);
        return json.toString();
    }

    public String sG42toString() throws JSONException {
        Log.d(TAG, "sG42toString: ");
        JSONObject json = new JSONObject();
        json.put("g0401180a", g0401180a)
                .put("g0401180s", g0401180s)
                .put("g0401180sd", g0401180sd)
                .put("g0401180sm", g0401180sm)
                .put("g0401180p", g0401180p)
                .put("g0401190a", g0401190a)
                .put("g0401190s", g0401190s)
                .put("g0401190sd", g0401190sd)
                .put("g0401190sm", g0401190sm)
                .put("g0401190p", g0401190p)
                .put("g0401200a", g0401200a)
                .put("g0401200s", g0401200s)
                .put("g0401200sd", g0401200sd)
                .put("g0401200sm", g0401200sm)
                .put("g0401200p", g0401200p)
                .put("g0401210a", g0401210a)
                .put("g0401210s", g0401210s)
                .put("g0401210sd", g0401210sd)
                .put("g0401210sm", g0401210sm)
                .put("g0401210p", g0401210p)
                .put("g0401220a", g0401220a)
                .put("g0401220s", g0401220s)
                .put("g0401220sd", g0401220sd)
                .put("g0401220sm", g0401220sm)
                .put("g0401220p", g0401220p)
                .put("g0401230a", g0401230a)
                .put("g0401230s", g0401230s)
                .put("g0401230sd", g0401230sd)
                .put("g0401230sm", g0401230sm)
                .put("g0401230p", g0401230p)
                .put("g0401240a", g0401240a)
                .put("g0401240s", g0401240s)
                .put("g0401240sd", g0401240sd)
                .put("g0401240sm", g0401240sm)
                .put("g0401240p", g0401240p)
                .put("g0401250a", g0401250a)
                .put("g0401250s", g0401250s)
                .put("g0401250sd", g0401250sd)
                .put("g0401250sm", g0401250sm)
                .put("g0401250p", g0401250p)
                .put("g0401260a", g0401260a)
                .put("g0401260s", g0401260s)
                .put("g0401260sd", g0401260sd)
                .put("g0401260sm", g0401260sm)
                .put("g0401260p", g0401260p)
                .put("g0401270a", g0401270a)
                .put("g0401270s", g0401270s)
                .put("g0401270sd", g0401270sd)
                .put("g0401270sm", g0401270sm)
                .put("g0401270p", g0401270p)
                .put("g0401280a", g0401280a)
                .put("g0401280s", g0401280s)
                .put("g0401280sd", g0401280sd)
                .put("g0401280sm", g0401280sm)
                .put("g0401280p", g0401280p)
                .put("g0401290a", g0401290a)
                .put("g0401290s", g0401290s)
                .put("g0401290sd", g0401290sd)
                .put("g0401290sm", g0401290sm)
                .put("g0401290p", g0401290p)
                .put("g0401300a", g0401300a)
                .put("g0401300s", g0401300s)
                .put("g0401300sd", g0401300sd)
                .put("g0401300sm", g0401300sm)
                .put("g0401300p", g0401300p)
                .put("g0401310a", g0401310a)
                .put("g0401310s", g0401310s)
                .put("g0401310sd", g0401310sd)
                .put("g0401310sm", g0401310sm)
                .put("g0401310p", g0401310p)
                .put("g0401320a", g0401320a)
                .put("g0401320s", g0401320s)
                .put("g0401320sd", g0401320sd)
                .put("g0401320sm", g0401320sm)
                .put("g0401320p", g0401320p)
                .put("g0401330a", g0401330a)
                .put("g0401330s", g0401330s)
                .put("g0401330sd", g0401330sd)
                .put("g0401330sm", g0401330sm)
                .put("g0401330p", g0401330p);
        return json.toString();
    }

    public String sG43toString() throws JSONException {
        Log.d(TAG, "sG43toString: ");
        JSONObject json = new JSONObject();
        json.put("g0401340a", g0401340a)
                .put("g0401340s", g0401340s)
                .put("g0401340sd", g0401340sd)
                .put("g0401340sm", g0401340sm)
                .put("g0401340p", g0401340p)
                .put("g0401350a", g0401350a)
                .put("g0401350s", g0401350s)
                .put("g0401350sd", g0401350sd)
                .put("g0401350sm", g0401350sm)
                .put("g0401350p", g0401350p)
                .put("g0401360a", g0401360a)
                .put("g0401360s", g0401360s)
                .put("g0401360sd", g0401360sd)
                .put("g0401360sm", g0401360sm)
                .put("g0401360p", g0401360p)
                .put("g0401370a", g0401370a)
                .put("g0401370s", g0401370s)
                .put("g0401370sd", g0401370sd)
                .put("g0401370sm", g0401370sm)
                .put("g0401370p", g0401370p)
                .put("g0401380a", g0401380a)
                .put("g0401380s", g0401380s)
                .put("g0401380sd", g0401380sd)
                .put("g0401380sm", g0401380sm)
                .put("g0401380p", g0401380p)
                .put("g0401390a", g0401390a)
                .put("g0401390s", g0401390s)
                .put("g0401390sd", g0401390sd)
                .put("g0401390sm", g0401390sm)
                .put("g0401390p", g0401390p)
                .put("g0401400a", g0401400a)
                .put("g0401400s", g0401400s)
                .put("g0401400sd", g0401400sd)
                .put("g0401400sm", g0401400sm)
                .put("g0401400p", g0401400p)
                .put("g0401410a", g0401410a)
                .put("g0401410s", g0401410s)
                .put("g0401410sd", g0401410sd)
                .put("g0401410sm", g0401410sm)
                .put("g0401410p", g0401410p)
                .put("g0401420a", g0401420a)
                .put("g0401420s", g0401420s)
                .put("g0401420sd", g0401420sd)
                .put("g0401420sm", g0401420sm)
                .put("g0401420p", g0401420p)
                .put("g0401430a", g0401430a)
                .put("g0401430s", g0401430s)
                .put("g0401430sd", g0401430sd)
                .put("g0401430sm", g0401430sm)
                .put("g0401430p", g0401430p)
                .put("g0401440a", g0401440a)
                .put("g0401440s", g0401440s)
                .put("g0401440sd", g0401440sd)
                .put("g0401440sm", g0401440sm)
                .put("g0401440p", g0401440p);
        return json.toString();
    }

    public String sG44toString() throws JSONException {
        Log.d(TAG, "sG44toString: ");
        JSONObject json = new JSONObject();
        json.put("g040210a", g040210a)
                .put("g040210s", g040210s)
                .put("g040210sd", g040210sd)
                .put("g040210sm", g040210sm)
                .put("g040210p", g040210p)
                .put("g040220a", g040220a)
                .put("g040220s", g040220s)
                .put("g040220sd", g040220sd)
                .put("g040220sm", g040220sm)
                .put("g040220p", g040220p)
                .put("g040230a", g040230a)
                .put("g040230s", g040230s)
                .put("g040230sd", g040230sd)
                .put("g040230sm", g040230sm)
                .put("g040230p", g040230p)
                .put("g040240a", g040240a)
                .put("g040240s", g040240s)
                .put("g040240sd", g040240sd)
                .put("g040240sm", g040240sm)
                .put("g040240p", g040240p)
                .put("g040250a", g040250a)
                .put("g040250s", g040250s)
                .put("g040250sd", g040250sd)
                .put("g040250sm", g040250sm)
                .put("g040250p", g040250p)
                .put("g040260a", g040260a)
                .put("g040260s", g040260s)
                .put("g040260sd", g040260sd)
                .put("g040260sm", g040260sm)
                .put("g040260p", g040260p)
                .put("g040270a", g040270a)
                .put("g040270s", g040270s)
                .put("g040270sd", g040270sd)
                .put("g040270sm", g040270sm)
                .put("g040270p", g040270p)
                .put("g040280a", g040280a)
                .put("g040280s", g040280s)
                .put("g040280sd", g040280sd)
                .put("g040280sm", g040280sm)
                .put("g040280p", g040280p)
                .put("g040290a", g040290a)
                .put("g040290s", g040290s)
                .put("g040290sd", g040290sd)
                .put("g040290sm", g040290sm)
                .put("g040290p", g040290p)
                .put("g0402100a", g0402100a)
                .put("g0402100s", g0402100s)
                .put("g0402100sd", g0402100sd)
                .put("g0402100sm", g0402100sm)
                .put("g0402100p", g0402100p)
                .put("g040310a", g040310a)
                .put("g040310s", g040310s)
                .put("g040310sd", g040310sd)
                .put("g040310sm", g040310sm)
                .put("g040310p", g040310p)
                .put("g040320a", g040320a)
                .put("g040320s", g040320s)
                .put("g040320sd", g040320sd)
                .put("g040320sm", g040320sm)
                .put("g040320p", g040320p)
                .put("g040330a", g040330a)
                .put("g040330s", g040330s)
                .put("g040330sd", g040330sd)
                .put("g040330sm", g040330sm)
                .put("g040330p", g040330p)
                .put("g040340a", g040340a)
                .put("g040340s", g040340s)
                .put("g040340sd", g040340sd)
                .put("g040340sm", g040340sm)
                .put("g040340p", g040340p)
                .put("g040350a", g040350a)
                .put("g040350s", g040350s)
                .put("g040350sd", g040350sd)
                .put("g040350sm", g040350sm)
                .put("g040350p", g040350p)
                .put("g040360a", g040360a)
                .put("g040360s", g040360s)
                .put("g040360sd", g040360sd)
                .put("g040360sm", g040360sm)
                .put("g040360p", g040360p);
        return json.toString();
    }

    public String sG45toString() throws JSONException {
        Log.d(TAG, "sG45toString: ");
        JSONObject json = new JSONObject();
        json.put("g040370a", g040370a)
                .put("g040370s", g040370s)
                .put("g040370sd", g040370sd)
                .put("g040370sm", g040370sm)
                .put("g040370p", g040370p)
                .put("g040380a", g040380a)
                .put("g040380s", g040380s)
                .put("g040380sd", g040380sd)
                .put("g040380sm", g040380sm)
                .put("g040380p", g040380p)
                .put("g040390a", g040390a)
                .put("g040390s", g040390s)
                .put("g040390sd", g040390sd)
                .put("g040390sm", g040390sm)
                .put("g040390p", g040390p)
                .put("g0403100a", g0403100a)
                .put("g0403100s", g0403100s)
                .put("g0403100sd", g0403100sd)
                .put("g0403100sm", g0403100sm)
                .put("g0403100p", g0403100p)
                .put("g0403110a", g0403110a)
                .put("g0403110s", g0403110s)
                .put("g0403110sd", g0403110sd)
                .put("g0403110sm", g0403110sm)
                .put("g0403110p", g0403110p)
                .put("g0403120a", g0403120a)
                .put("g0403120s", g0403120s)
                .put("g0403120sd", g0403120sd)
                .put("g0403120sm", g0403120sm)
                .put("g0403120p", g0403120p)
                .put("g0403130a", g0403130a)
                .put("g0403130s", g0403130s)
                .put("g0403130sd", g0403130sd)
                .put("g0403130sm", g0403130sm)
                .put("g0403130p", g0403130p)
                .put("g0403140a", g0403140a)
                .put("g0403140s", g0403140s)
                .put("g0403140sd", g0403140sd)
                .put("g0403140sm", g0403140sm)
                .put("g0403140p", g0403140p)
                .put("g0403150a", g0403150a)
                .put("g0403150s", g0403150s)
                .put("g0403150sd", g0403150sd)
                .put("g0403150sm", g0403150sm)
                .put("g0403150p", g0403150p)
                .put("g0403160a", g0403160a)
                .put("g0403160s", g0403160s)
                .put("g0403160sd", g0403160sd)
                .put("g0403160sm", g0403160sm)
                .put("g0403160p", g0403160p)
                .put("g0403170a", g0403170a)
                .put("g0403170s", g0403170s)
                .put("g0403170sd", g0403170sd)
                .put("g0403170sm", g0403170sm)
                .put("g0403170p", g0403170p)
                .put("g0403180a", g0403180a)
                .put("g0403180s", g0403180s)
                .put("g0403180sd", g0403180sd)
                .put("g0403180sm", g0403180sm)
                .put("g0403180p", g0403180p)
                .put("g0403190a", g0403190a)
                .put("g0403190s", g0403190s)
                .put("g0403190sd", g0403190sd)
                .put("g0403190sm", g0403190sm)
                .put("g0403190p", g0403190p)
                .put("g0403200a", g0403200a)
                .put("g0403200s", g0403200s)
                .put("g0403200sd", g0403200sd)
                .put("g0403200sm", g0403200sm)
                .put("g0403200p", g0403200p)
                .put("g0403210a", g0403210a)
                .put("g0403210s", g0403210s)
                .put("g0403210sd", g0403210sd)
                .put("g0403210sm", g0403210sm)
                .put("g0403210p", g0403210p)
                .put("g0403220a", g0403220a)
                .put("g0403220s", g0403220s)
                .put("g0403220sd", g0403220sd)
                .put("g0403220sm", g0403220sm)
                .put("g0403220p", g0403220p);
        return json.toString();
    }

    public String sG46toString() throws JSONException {
        Log.d(TAG, "sGtoString: ");
        JSONObject json = new JSONObject();
        json.put("g0403230a", g0403230a)
                .put("g0403230s", g0403230s)
                .put("g0403230sd", g0403230sd)
                .put("g0403230sm", g0403230sm)
                .put("g0403230p", g0403230p)
                .put("g0403240a", g0403240a)
                .put("g0403240s", g0403240s)
                .put("g0403240sd", g0403240sd)
                .put("g0403240sm", g0403240sm)
                .put("g0403240p", g0403240p)
                .put("g0403250a", g0403250a)
                .put("g0403250s", g0403250s)
                .put("g0403250sd", g0403250sd)
                .put("g0403250sm", g0403250sm)
                .put("g0403250p", g0403250p)
                .put("g0403260a", g0403260a)
                .put("g0403260s", g0403260s)
                .put("g0403260sd", g0403260sd)
                .put("g0403260sm", g0403260sm)
                .put("g0403260p", g0403260p)
                .put("g0403270a", g0403270a)
                .put("g0403270s", g0403270s)
                .put("g0403270sd", g0403270sd)
                .put("g0403270sm", g0403270sm)
                .put("g0403270p", g0403270p)
                .put("g040410a", g040410a)
                .put("g040410s", g040410s)
                .put("g040410sd", g040410sd)
                .put("g040410sm", g040410sm)
                .put("g040410p", g040410p)
                .put("g040420a", g040420a)
                .put("g040420s", g040420s)
                .put("g040420sd", g040420sd)
                .put("g040420sm", g040420sm)
                .put("g040420p", g040420p)
                .put("g040430a", g040430a)
                .put("g040430s", g040430s)
                .put("g040430sd", g040430sd)
                .put("g040430sm", g040430sm)
                .put("g040430p", g040430p)
                .put("g040440a", g040440a)
                .put("g040440s", g040440s)
                .put("g040440sd", g040440sd)
                .put("g040440sm", g040440sm)
                .put("g040440p", g040440p)
                .put("g040450a", g040450a)
                .put("g040450s", g040450s)
                .put("g040450sd", g040450sd)
                .put("g040450sm", g040450sm)
                .put("g040450p", g040450p)
                .put("g040460a", g040460a)
                .put("g040460s", g040460s)
                .put("g040460sd", g040460sd)
                .put("g040460sm", g040460sm)
                .put("g040460p", g040460p);
        return json.toString();
    }


}
