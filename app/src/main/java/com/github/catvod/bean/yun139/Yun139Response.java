package com.github.catvod.bean.yun139;

import com.google.gson.Gson;

/**
 * Yun139 API response wrapper (replaces com.github.catvod.spider.merge.Z.e)
 */
public class Yun139Response {
    /** Nested data containing the actual file/folder info */
    public Yun139Data data;

    /** Deserialize from JSON (replaces C.u.a equivalent) */
    public static Yun139Response fromJson(String json) {
        return new Gson().fromJson(json, Yun139Response.class);
    }

    public Yun139Data getC() { return data; }
}
