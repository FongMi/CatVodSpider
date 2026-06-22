package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.a.C0098a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class C0134u {
    public static String a(String str, long j) {
        return str + j;
    }

    public static String b(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(C0098a.a(bArr, bArr2));
        sb.append(str);
        return sb.toString();
    }

    public static void c(byte[] bArr, byte[] bArr2, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        jSONObject2.put(str, jSONObject.getString(C0098a.a(bArr, bArr2)));
    }

    public static /* synthetic */ boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
