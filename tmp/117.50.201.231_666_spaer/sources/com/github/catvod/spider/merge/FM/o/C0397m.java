package com.github.catvod.spider.merge.FM.o;

import android.util.TypedValue;
import com.github.catvod.spider.Init;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0397m {
    public static int a(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    public static JSONObject b(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }
}
