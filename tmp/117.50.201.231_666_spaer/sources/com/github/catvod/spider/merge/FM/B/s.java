package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.spider.merge.FM.a.C0298a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class s {
    public static Matcher a(byte[] bArr, byte[] bArr2, String str) {
        return Pattern.compile(C0298a.b(bArr, bArr2)).matcher(str);
    }

    public static void b(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(C0298a.b(bArr, bArr2));
        sb.append(str);
    }

    public static void c(byte[] bArr, byte[] bArr2, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        jSONObject2.put(str, jSONObject.getString(C0298a.b(bArr, bArr2)));
    }
}
