package com.vaenow.appupdate.android;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by LuoWen on 16/7/22.
 */
public class Utils {

    static JSONObject makeJSON(String ver, String packgeNum, String url, String describe, int localversion, int version, int code, Object msg) {
        JSONObject json = new JSONObject();

        try {
            json.put("ver", ver);
            json.put("packgeNum", packgeNum);
            json.put("url", url);
            json.put("describe", describe);
            json.put("localversion", localversion);
            json.put("version", version);
            json.put("code", code);
            json.put("msg", msg);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json;
    }
}
