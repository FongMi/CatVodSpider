package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.e1.JsoupElements;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.regex.Pattern;


public class TgYunPanLocal extends NetPan {
    static Pattern p = Pattern.compile("background-image:url\\('([^']+)'\\)");
    private JsonObject l;
    private String m;
    private Integer n;
    private boolean o;

    public static native String extractAllMessageTexts(JsoupElements c1036g);

    public static native String[] extractMovieDescription(String str);

    private native void extracted(String str, List list, String str2);

    public static native /* synthetic */ void f(TgYunPanLocal tgYunPanLocal, String str, List list, String str2);

    private native String g(String str);

    @Override // com.github.catvod.en.NetPan
    public native String detailContent(List list);

    @Override // com.github.catvod.en.NetPan
    public native void init(Context context, String str);

    public native String searchContent(String str, boolean z);

    public native String searchContent(String str, boolean z, String str2);
}
