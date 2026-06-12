package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.c1.JsoupDocument;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class Wogg extends NetPan {
    private String l;
    private final Pattern m;
    private final Pattern n;
    private JsonObject o;

    public static native String f(Wogg wogg, String str);

    private native void g(List list, String str);

    public static native String getIPAddress();

    private native Map h();

    private native List i(Subtitle hVar);

    private native String searchContent(String str, String str2);

    public native String categoryContent(String str, String str2, boolean z, HashMap map);

    @Override // com.github.catvod.en.NetPan
    public native String detailContent(List list);

    public native String homeContent(boolean z);

    @Override // com.github.catvod.en.NetPan
    public native void init(Context context, String str);

    public native String searchContent(String str, boolean z);

    public native String searchContent(String str, boolean z, String str2);
}
