package edu.aku.hassannaqvi.uen_hfa_el.models

import android.database.Cursor
import edu.aku.hassannaqvi.uen_hfa_el.contracts.TableContracts.VersionTable
import org.apache.commons.lang3.StringUtils
import org.json.JSONObject

class VersionApp {
    var versioncode: String = StringUtils.EMPTY
    var versionname: String = StringUtils.EMPTY
    var pathname: String = StringUtils.EMPTY

    fun sync(jsonObject: JSONObject): VersionApp {
        versioncode = jsonObject.getString(VersionTable.COLUMN_VERSION_CODE)
        pathname = jsonObject.getString(VersionTable.COLUMN_PATH_NAME)
        versionname = jsonObject.getString(VersionTable.COLUMN_VERSION_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): VersionApp {
        versioncode =
            cursor.getString(cursor.getColumnIndexOrThrow(VersionTable.COLUMN_VERSION_CODE))
        pathname = cursor.getString(cursor.getColumnIndexOrThrow(VersionTable.COLUMN_PATH_NAME))
        versionname =
            cursor.getString(cursor.getColumnIndexOrThrow(VersionTable.COLUMN_VERSION_NAME))
        return this
    }


}