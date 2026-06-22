package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class GuanYing extends NetPan {
    private static String p = "";
    private static final Map<String, String> q;
    private String l;
    private String m;
    private String n;
    private ConcurrentHashMap<String, JsonObject> o;

    static {
        HashMap map = new HashMap();
        q = map;
        map.put("dp", "百度网盘");
        map.put("quark", "夸克网盘");
        map.put("ty", "天翼网盘");
        map.put("115", "115网盘");
        map.put("p123", "123网盘");
        map.put("uc", "UC网盘");
        map.put("ali", "阿里网盘");
        map.put("yd", "移动网盘");
    }

    private native String f(String str);

    private native String g();

    private native HashMap getHeader();

    private native void h();

    public native String categoryContent(String str, String str2, boolean z, HashMap map);

    @Override // com.github.catvod.en.NetPan
    public native String detailContent(List list);

    public native String homeContent(boolean z);

    @Override // com.github.catvod.en.NetPan
    public native void init(Context context, String str);

    public native String searchContent(String str, boolean z);
}
