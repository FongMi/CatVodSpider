package com.github.catvod.spider.merge.m;

import android.content.SharedPreferences;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0603l {
    private static SharedPreferences a() {
        return Init.context().getSharedPreferences(Init.context().getPackageName() + "_preferences", 0);
    }

    public static void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static String b(String str) {
        return a().getString(str, "");
    }

    public static void c(String str, Object obj) {
        SharedPreferences.Editor editorPutLong;
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            editorPutLong = a().edit().putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            editorPutLong = a().edit().putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editorPutLong = a().edit().putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editorPutLong = a().edit().putInt(str, ((Integer) obj).intValue());
        } else if (!(obj instanceof Long)) {
            return;
        } else {
            editorPutLong = a().edit().putLong(str, ((Long) obj).longValue());
        }
        editorPutLong.apply();
    }
}
