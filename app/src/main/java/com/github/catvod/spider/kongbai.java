package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.c1.JsoupDocument;
import com.github.catvod.spider.merge.c1.JsoupElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class kongbai extends NetPan {
    String l;
    private String m;
    private final Pattern n;
    private final Pattern o;

    public static native String f(kongbai kongbaiVar, String str);

    private native void g(List list, String str);

    private static native void h(GeneralUtils mVar, Matcher matcher, List list);

    private native Map i();

    private native List j(Subtitle hVar);

    private native String k(String str);

    public native String categoryContent(String str, String str2, boolean z, HashMap map);

    @Override // com.github.catvod.en.NetPan
    public native String detailContent(List list);

    public native String homeContent(boolean z);

    @Override // com.github.catvod.en.NetPan
    public native void init(Context context, String str);

    public native String searchContent(String str, boolean z);

    public native String searchContent(String str, boolean z, String str2);
}
