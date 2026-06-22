package com.github.catvod.spider.merge.g;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.p.C0207D;
import com.google.gson.annotations.SerializedName;
import java.net.URLEncoder;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0168j {
    private final int[] a = {46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    @SerializedName("img_url")
    private String b;

    @SerializedName("sub_url")
    private String c;

    public final String a(LinkedHashMap<String, Object> linkedHashMap) {
        String strA = y.a(Uri.parse(TextUtils.isEmpty(this.b) ? "" : this.b).getLastPathSegment().split(C0098a.a(new byte[]{-87, 72}, new byte[]{-11, 102, -62, 40, 83, 61, -31, 41}))[0], Uri.parse(TextUtils.isEmpty(this.c) ? "" : this.c).getLastPathSegment().split(C0098a.a(new byte[]{-109, -53}, new byte[]{-49, -27, 2, 35, 70, -74, 124, 14}))[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(strA.charAt(this.a[i]));
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        linkedHashMap.put(C0098a.a(new byte[]{-43, -109, -71}, new byte[]{-94, -25, -54, 84, -9, 29, 81, 59}), Long.valueOf(System.currentTimeMillis() / 1000));
        for (String str : linkedHashMap.keySet()) {
            sb2.append(str);
            sb2.append(C0098a.a(new byte[]{-31}, new byte[]{-36, -31, 27, -115, 25, -88, 72, 98}));
            sb2.append(URLEncoder.encode(linkedHashMap.get(str).toString()));
            sb2.append(C0098a.a(new byte[]{-16}, new byte[]{-42, -56, -39, 8, -122, -32, 125, -121}));
        }
        String strS = C0207D.s(sb2.toString());
        return C0134u.b(new byte[]{-31, 93, -33, -48, -111, -128, -94}, new byte[]{-57, 42, -128, -94, -8, -28, -97, -19}, C0133t.c(strS), C0207D.a(strS + string));
    }
}
