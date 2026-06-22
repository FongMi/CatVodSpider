package com.github.catvod.spider;

import android.app.AlertDialog;
import android.content.Context;
import com.github.catvod.en.NetPan;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;


public class TgYunDouBanPan extends NetPan {
    public static final /* synthetic */ int t = 0;
    private ScheduledExecutorService l;
    private String m;
    private AlertDialog n;
    private JsonObject o;
    private String p;
    private Integer q;
    private boolean r;
    private final Douban s;

    public static native void f(TgYunDouBanPan tgYunDouBanPan);

    public static native void g(TgYunDouBanPan tgYunDouBanPan);

    public static native void h(TgYunDouBanPan tgYunDouBanPan);

    public static native void i(TgYunDouBanPan tgYunDouBanPan);

    public static native void j(TgYunDouBanPan tgYunDouBanPan);

    public static native /* synthetic */ void k(TgYunDouBanPan tgYunDouBanPan);

    public static native void l(TgYunDouBanPan tgYunDouBanPan, String str);

    private native String m(String str);

    private native void n(String str);

    private native void o();

    public native String categoryContent(String str, String str2, boolean z, HashMap map);

    @Override
    public native String detailContent(List list);

    public native void extracted(String str, List list, String str2);

    public native String homeContent(boolean z);

    @Override
    public native void init(Context context, String str);

    public native String searchContent(String str, boolean z);

    public native String searchContent(String str, boolean z, String str2);

    public native void showTgInput();

    public native void startTgFlow();
}
