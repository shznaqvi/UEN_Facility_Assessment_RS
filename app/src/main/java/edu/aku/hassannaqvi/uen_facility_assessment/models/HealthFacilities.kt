package edu.aku.hassannaqvi.uen_facility_assessment.models

import android.database.Cursor
import edu.aku.hassannaqvi.uen_facility_assessment.contracts.TableContracts.TableHealthFacilities
import edu.aku.hassannaqvi.uen_facility_assessment.core.MainApp._EMPTY_
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 01/06/2021.
 */

class HealthFacilities {
    var provinceCode: String = _EMPTY_
    var provinceName: String = _EMPTY_
    var districtCode: String = _EMPTY_
    var districtName: String = _EMPTY_
    var tehsilCode: String = _EMPTY_
    var tehsilName: String = _EMPTY_
    var ucCode: String = _EMPTY_
    var ucName: String = _EMPTY_
    var hfCode: String = _EMPTY_
    var hfName: String = _EMPTY_

    fun sync(jsonObject: JSONObject): HealthFacilities {
        provinceCode = jsonObject.getString(TableHealthFacilities.COLUMN_PROVINCE_CODE)
        provinceName = jsonObject.getString(TableHealthFacilities.COLUMN_PROVINCE_NAME)
        districtCode = jsonObject.getString(TableHealthFacilities.COLUMN_DISTRICT_CODE)
        districtName = jsonObject.getString(TableHealthFacilities.COLUMN_DISTRICT_NAME)
        tehsilCode = jsonObject.getString(TableHealthFacilities.COLUMN_TEHSIL_CODE)
        tehsilName = jsonObject.getString(TableHealthFacilities.COLUMN_TEHSIL_NAME)
        ucCode = jsonObject.getString(TableHealthFacilities.COLUMN_UC_CODE)
        ucName = jsonObject.getString(TableHealthFacilities.COLUMN_UC_NAME)
        hfCode = jsonObject.getString(TableHealthFacilities.COLUMN_HF_CODE)
        hfName = jsonObject.getString(TableHealthFacilities.COLUMN_HF_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): HealthFacilities {
        provinceCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_PROVINCE_CODE))
        provinceName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_PROVINCE_NAME))
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_DISTRICT_CODE))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_DISTRICT_NAME))
        tehsilCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_TEHSIL_CODE))
        tehsilName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_TEHSIL_NAME))
        ucCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_UC_CODE))
        ucName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_UC_NAME))
        hfCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_HF_CODE))
        hfName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_HF_NAME))
        return this
    }


}