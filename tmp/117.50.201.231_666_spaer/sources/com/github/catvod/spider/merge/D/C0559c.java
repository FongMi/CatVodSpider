package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0559c {

    @SerializedName("redirectUri")
    private String a;

    public final String a() throws IllegalArgumentException {
        String str = this.a;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.contains("code=")) {
            throw new IllegalArgumentException("Redirect URI does not contain authorization code");
        }
        String[] strArrSplit = str.split("code=");
        if (strArrSplit.length < 1) {
            throw new IllegalArgumentException("Invalid redirect URI format");
        }
        String str2 = strArrSplit[1];
        int iIndexOf = str2.indexOf("&");
        return iIndexOf >= 0 ? str2.substring(0, iIndexOf) : str2;
    }
}
