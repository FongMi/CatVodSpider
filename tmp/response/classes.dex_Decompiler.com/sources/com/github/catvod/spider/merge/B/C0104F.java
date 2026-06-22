package com.github.catvod.spider.merge.b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.j.C0180b;
import com.github.catvod.spider.merge.j.C0181c;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0212e;
import com.github.catvod.spider.merge.p.C0213f;
import com.github.catvod.spider.merge.p.C0219l;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0104F {
    private static final String d = C0098a.a(new byte[]{-59, 56, -61, 55, -36, 8, 15, 37, -63, 35, -48, 46, -63, 28, 17, 56, -98, 60, -42, 41, -127, 81, 79, 103, -126, 45, -57, 46, -128, 71, 83, 111, -33, 99, -60, 46, -56, 92, 127, 99, -61}, new byte[]{-83, 76, -73, 71, -81, 50, 32, 10});
    private static final String e = C0098a.a(new byte[]{-125, -2, -123, 107, -92, -7, 64, 125, -100, -3, -122, 53, -26, -15, 92, 34, -118, -28, -33, 120, -72, -82}, new byte[]{-21, -118, -15, 27, -41, -61, 111, 82});
    private static final String f = C0098a.a(new byte[]{31, -123, 106, 3, 108, 27, 106, 80}, new byte[]{74, -10, 15, 113, 37, 117, 12, 63});
    private String a;
    private AlertDialog b;
    private boolean c = false;

    C0104F() {
        Init.checkPermission();
        SpiderDebug.log(C0098a.a(new byte[]{-24, 124, 87, -2, -12, 106, 101, 71, -42, 116, 77}, new byte[]{-72, 29, 57, -49, -58, 89, 69, 14}));
    }

    public static void a(C0104F c0104f, String[] strArr) {
        c0104f.getClass();
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String str4 = strArr[3];
        String str5 = strArr[5];
        try {
            int iM = c0104f.m();
            c0104f.h(iM);
            JsonArray jsonArray = new JsonArray();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(C0098a.a(new byte[]{-121, -14, 59, 6, -6, -57, -6}, new byte[]{-31, -101, 87, 99, -91, -82, -98, -122}), str2);
            jsonObject.addProperty(C0098a.a(new byte[]{-49, 13, 63, 103}, new byte[]{-68, 100, 69, 2, 28, -91, 38, 97}), str5);
            jsonObject.addProperty(C0098a.a(new byte[]{-27, -91, -56, 122}, new byte[]{-128, -47, -87, 29, -79, -92, -13, -121}), str4);
            jsonObject.addProperty(C0098a.a(new byte[]{-16, 63, 64, -41}, new byte[]{-124, 70, 48, -78, -98, 87, -66, 95}), 0);
            jsonObject.addProperty(C0098a.a(new byte[]{104, 114, -6, -32, -120, 59, 84, 26, 113, 127, -19, -38, -113, 43}, new byte[]{24, 19, -120, -123, -26, 79, 11, 124}), Integer.valueOf(iM));
            jsonObject.addProperty(C0098a.a(new byte[]{-121, 88, 27, 16, -97, 87, -96, 119, -124}, new byte[]{-31, 49, 119, 117, -64, 57, -63, 26}), str3);
            jsonObject.addProperty(C0098a.a(new byte[]{-91, 29, -83, 51, 54, 51, 82, -1}, new byte[]{-63, 111, -60, 69, 83, 108, 59, -101}), 0);
            jsonArray.add(jsonObject);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add(C0098a.a(new byte[]{-38, 113, 40, -46, 79, -22, -63, -42, -56}, new byte[]{-68, 24, 68, -73, 16, -122, -88, -91}), jsonArray);
            jsonObject2.addProperty(C0098a.a(new byte[]{-36, -82, 125, 102, 74, -56, 81, 101, -42}, new byte[]{-81, -58, 28, 20, 47, -105, 58, 0}), str);
            jsonObject2.addProperty(C0098a.a(new byte[]{57, 89, -91, -101, 45, 63, -50, -46, 54, 73, -95, -116, 36}, new byte[]{90, 44, -41, -23, 72, 81, -70, -115}), 1);
            jsonObject2.addProperty(C0098a.a(new byte[]{104, 20, 98, -95, -81}, new byte[]{13, 98, 7, -49, -37, 31, 9, 42}), C0098a.a(new byte[]{23, -92, 43, -24, -109, -76, 73, 89}, new byte[]{99, -42, 74, -122, -32, -46, 44, 43}));
            jsonObject2.addProperty(C0098a.a(new byte[]{-24, -110, 115, 0, -74, -72, -63}, new byte[]{-114, -5, 31, 101, -8, -51, -84, 113}), 1);
            jsonObject2.addProperty(C0098a.a(new byte[]{114, 115, -25, 50, 3, -91, -3, -15, 113, 98, -31, 37}, new byte[]{29, 3, -126, 64, 98, -47, -104, -95}), 1);
            C0197c.g(C0098a.a(new byte[]{32, 20, 114, 0, 13, 31, -66, -14, 63, 23, 113, 94, 79, 23, -94, -83, 41, 14, 40, 19, 17, 72, -66, -65, 103, 1, 118, 25, 81, 67, -8, -79, 45, 79, 101, 31, 14, 92, -66, -68, 59, 25, 104, 19}, new byte[]{72, 96, 6, 112, 126, 37, -111, -35}), jsonObject2.toString(), c0104f.l());
        } catch (Exception e2) {
            y.c(new byte[]{-60, 81, -86, -80, -56, 16, -71, -75, -60, 30, -65, -69, -5}, new byte[]{-89, 62, -38, -55, -119, 99, -64, -37}, new StringBuilder(), e2);
        }
    }

    public static void c(final C0104F c0104f, EditText editText, EditText editText2) {
        c0104f.getClass();
        final String string = editText.getText().toString();
        final String string2 = editText2.getText().toString();
        c0104f.i();
        Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.b.D
            @Override // java.lang.Runnable
            public final void run() {
                C0104F.d(this.a, string, string2);
            }
        });
    }

    public static /* synthetic */ void d(C0104F c0104f, String str, String str2) {
        c0104f.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0098a.a(new byte[]{-44, 97, 97, 73, -77, -52, -48, 14}, new byte[]{-95, 18, 4, 59, -35, -83, -67, 107}), str);
            jSONObject.put(C0098a.a(new byte[]{55, -25, -10, -87, 116, -99, 55, -13}, new byte[]{71, -122, -123, -38, 3, -14, 69, -105}), str2);
            C0207D.u(f, jSONObject.toString());
            if (c0104f.q(true)) {
                return;
            }
            c0104f.o();
        } catch (Exception e2) {
            y.c(new byte[]{69, -81, 53, 74, -99, 41, 97, 114, 92, -92, 69, 64, -100, 50, 47, 59}, new byte[]{42, -63, 101, 37, -18, 64, 21, 27}, new StringBuilder(), e2);
        }
    }

    public static /* synthetic */ void e(C0104F c0104f) {
        c0104f.getClass();
        while (c0104f.c) {
            try {
                String strQ = C0207D.q(f);
                SpiderDebug.log(C0098a.a(new byte[]{-9, 127, -116, -42, 102, 96, 106, 25, -72, 44}, new byte[]{-126, 12, -23, -92, 47, 14, 12, 118}) + strQ);
                if (!TextUtils.isEmpty(strQ)) {
                    C0219l.b(C0098a.a(new byte[]{22, 76, 119, -93, 124, 59, -10, 11, 97, 48, 70, -39, -19, -114, -8, 44, 70, 60, 76, -58, 36, 41, -86, 106, 118, 88, 42, -48, 113, 70, -81, 24, 23, 72, 105}, new byte[]{-15, -43, -52, 70, -63, -82, 16, -125}));
                    c0104f.q(false);
                    c0104f.b.dismiss();
                    return;
                }
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                SpiderDebug.log("");
                return;
            }
        }
    }

    public static long g(String str) {
        String strReplace = str.replace(C0098a.a(new byte[]{97, -46, 119, 125, 36, 122}, new byte[]{74, -30, 79, 71, 20, 74, 65, -125}), C0098a.a(new byte[]{54, -64, 124, 4, -17}, new byte[]{29, -16, 68, 52, -33, 50, -35, 28}));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0098a.a(new byte[]{-93, -58, 119, 67, -55, 78, -78, 95, -66, -37, 41, 110, -61, 75, -73, 72, -73, -46, 52, 73, -105, 89, -91, 40, -128, -27}, new byte[]{-38, -65, 14, 58, -28, 3, -1, 114}));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(C0098a.a(new byte[]{-66, -117, -8}, new byte[]{-21, -33, -69, 52, -118, 20, 59, -117})));
        try {
            return simpleDateFormat.parse(strReplace).getTime();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    private void h(int i) {
        char c = 16;
        try {
            long j = C0207D.j();
            JsonArray jsonArray = new JsonArray();
            Gson gson = new Gson();
            while (true) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[59];
                bArr[0] = -79;
                bArr[1] = 110;
                bArr[2] = -63;
                bArr[3] = -34;
                bArr[4] = 87;
                bArr[5] = -55;
                bArr[6] = 120;
                bArr[7] = 18;
                bArr[8] = -82;
                bArr[9] = 109;
                bArr[10] = -62;
                bArr[11] = -128;
                bArr[12] = 21;
                bArr[13] = -63;
                bArr[14] = 100;
                bArr[15] = 77;
                bArr[c] = -72;
                bArr[17] = 116;
                bArr[18] = -101;
                bArr[19] = -51;
                bArr[20] = 75;
                bArr[21] = -98;
                bArr[22] = 120;
                bArr[23] = 95;
                bArr[24] = -10;
                bArr[25] = 123;
                bArr[26] = -59;
                bArr[27] = -57;
                bArr[28] = 11;
                bArr[29] = -107;
                bArr[30] = 62;
                bArr[31] = 81;
                bArr[32] = -68;
                bArr[33] = 53;
                bArr[34] = -39;
                bArr[35] = -57;
                bArr[36] = 87;
                bArr[37] = -121;
                bArr[38] = 120;
                bArr[39] = 83;
                bArr[40] = -68;
                bArr[41] = 109;
                bArr[42] = -118;
                bArr[43] = -54;
                bArr[44] = 86;
                bArr[45] = -102;
                bArr[46] = 33;
                bArr[47] = 88;
                bArr[48] = -112;
                bArr[49] = 126;
                bArr[50] = -120;
                bArr[51] = -98;
                bArr[52] = 2;
                bArr[53] = -97;
                bArr[54] = 62;
                bArr[55] = 80;
                bArr[56] = -80;
                bArr[57] = 110;
                bArr[58] = -120;
                sb.append(C0098a.a(bArr, new byte[]{-39, 26, -75, -82, 36, -13, 87, 61}));
                sb.append(100);
                sb.append(C0098a.a(new byte[]{46, 95, 91, 22, -27, -91, 60, -51, 103, 67, 90, 11, -29, -38, 117, -42, 125, 65, 90, 15, -27, -3, 83, -97, 97, 92, 91, 72, -2, -22, 104, -114, 122, 117, 87, 28, -12, -5, 120, -126, 103, 95, 3, 10, -12, -21, 111, -51, 120, 80, 76, 11, -1, -20, 74, -126, 100, 84, 119, 10, -84}, new byte[]{8, 49, 62, 110, -111, -104, 12, -21}));
                sb.append(i);
                sb.append(C0098a.a(new byte[]{34, 73, -13, 124, -16, 38, -46, 12, 57, 91, -32, 113, -16, 43, -111, 59, 97, 92, -13, 126, -21, 10, -42, 28, 101, 0, -89, 77, -30, 41, -46, 85}, new byte[]{4, 61, -127, 29, -125, 78, -73, 104}));
                sb.append(1);
                sb.append(C0098a.a(new byte[]{-96, 93, -22, 63, 94, -15, -41, 47, -23, 85, -7, 22, 89, -10, -98, 1, -17, 84, -7, 124, 95, -11, -113, 53, -25, 76, -7, 14, 73, -11, -113, 122, -73, 30, -11, 52, 116, -20, -104, 34, -27, 76, -49, 42, 81, -26, -113, 122, -32, 89, -16, 41, 85}, new byte[]{-122, 56, -100, 90, 48, -123, -22, 71}));
                C0181c c0181cB = C0181c.b(C0197c.l(sb.toString(), l()));
                for (C0180b c0180b : c0181cB.a().a()) {
                    if (g(c0180b.b()) < j) {
                        jsonArray.add(gson.toJsonTree(c0180b).getAsJsonObject());
                    }
                }
                if (c0181cB.a().b() < 100) {
                    break;
                } else {
                    c = 16;
                }
            }
            if (jsonArray.size() == 0) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(C0098a.a(new byte[]{-60, 37, 26, 65, 104, -23, 117}, new byte[]{-96, 87, 115, 55, 13, -96, 17, 35}), 0);
            jsonObject.addProperty(C0098a.a(new byte[]{-102, 75, -28, 75, -47, 86, 46, 16, -101}, new byte[]{-11, 59, -127, 57, -80, 34, 71, 127}), Boolean.TRUE);
            jsonObject.addProperty(C0098a.a(new byte[]{3, 55, 76, 101, -99}, new byte[]{102, 65, 41, 11, -23, 59, 13, 56}), C0098a.a(new byte[]{-93, -70, -32, -60, -66, 108, 1, -106, -87, -72, -15}, new byte[]{-54, -44, -108, -85, -20, 9, 98, -17}));
            jsonObject.addProperty(C0098a.a(new byte[]{82, 80, 33, 90, -16, -57, -89, 9, 81, 65, 39, 77}, new byte[]{61, 32, 68, 40, -111, -77, -62, 89}), 1);
            jsonObject.add(C0098a.a(new byte[]{99, -68, 109, -43, 14, -106, -22, 79, 109, -100, 111, -42, 53, -88, -30, 79, 113}, new byte[]{5, -43, 1, -80, 90, -28, -117, 60}), jsonArray);
            SpiderDebug.log(C0098a.a(new byte[]{6, -83, 49, -115, 47, -38, -99, 92, 7, -91, 46, -56, 41, -38, -89, 18, 66}, new byte[]{98, -56, 93, -24, 91, -65, -44, 40}) + C0197c.g(C0098a.a(new byte[]{-114, -61, -118, 104, 57, -49, -122, 65, -111, -64, -119, 54, 123, -57, -102, 30, -121, -39, -48, 123, 37, -104, -122, 12, -55, -42, -114, 113, 101, -109, -64, 2, -125, -104, -118, 106, 43, -122, -63}, new byte[]{-26, -73, -2, 24, 74, -11, -87, 110}), jsonObject.toString(), l()).toString());
        } catch (Exception e2) {
            y.c(new byte[]{29, 78, -114, -103, -90, -48, -103, 58, 28, 70, -106, -36, -73, -57, -94, 116}, new byte[]{121, 43, -27, -4, -46, -75, -48, 78}, new StringBuilder(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            this.c = false;
            AlertDialog alertDialog = this.b;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static C0104F j() {
        return C0103E.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x069c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String k(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 2950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.C0104F.k(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private Map<String, String> l() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-124, 21, 22, -41, 53, 98}, new byte[]{-21, 103, 127, -80, 92, 12, -12, -19}), e);
        map.put(C0098a.a(new byte[]{-87, -11, 101, 106, -23, -48, -125}, new byte[]{-37, -112, 3, 15, -101, -75, -15, -9}), C0098a.a(new byte[]{-63, 94, -37, -87, 8, -53, -60, 19, -34, 93, -40, -9, 74, -61, -40, 76, -56, 68, -127, -70, 20, -100, -60}, new byte[]{-87, 42, -81, -39, 123, -15, -21, 60}));
        map.put(C0098a.a(new byte[]{42, -38, 18, -3, 123, -118, 49, -105, 49, -35}, new byte[]{95, -87, 119, -113, 86, -21, 86, -14}), C0098a.a(new byte[]{49, 35, 26, 123, -50, -79, -91, -95, 76, 106, 12, 110, -109, -9, -79, -7, 26, 107, 69, 110, -115, -22, -8, -28}, new byte[]{117, 66, 104, 15, -31, -125, -117, -112}));
        map.put(C0098a.a(new byte[]{-101, 29, -100, -50, -75, 126, -41, -30}, new byte[]{-21, 113, -3, -70, -45, 17, -91, -113}), C0098a.a(new byte[]{-76, 74, -36, 49, -25, 127, 52}, new byte[]{-43, 36, -72, 67, -120, 22, 80, 43}));
        map.put(C0098a.a(new byte[]{81, -87, 14, -32, 76, -68, 77, 50, 89, -74, 16}, new byte[]{48, -39, 126, -51, 58, -39, 63, 65}), C0098a.a(new byte[]{-127}, new byte[]{-78, 46, 117, 61, 56, 121, 97, -81}));
        if (!TextUtils.isEmpty(this.a)) {
            map.put(C0098a.a(new byte[]{116, -2, -29, 75, -13, -87, -89, 101, 84, -1, -2, 76, -14}, new byte[]{53, -117, -105, 35, -100, -37, -50, 31}), C0098a.a(new byte[]{72, -59, -61, 22, -94, 111, -67}, new byte[]{10, -96, -94, 100, -57, 29, -99, 22}) + this.a);
        }
        return map;
    }

    private int m() {
        for (int i = 0; i <= 2; i++) {
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(C0098a.a(new byte[]{22, -87, 39, -98, 77, -119, -19}, new byte[]{114, -37, 78, -24, 40, -64, -119, -97}), 0);
                jsonObject.addProperty(C0098a.a(new byte[]{20, 58, -54, 69, -28, 83, -31, -54}, new byte[]{114, 83, -90, 32, -86, 50, -116, -81}), C0098a.a(new byte[]{34, 84, 32, -75, 32, -93, -64, -58, 32, 65, 35, -94}, new byte[]{86, 53, 78, -46, 83, -62, -82, -78}));
                jsonObject.addProperty(C0098a.a(new byte[]{91, 127, -92, 42, -72, -62, 8, -75, 71, 123, -97, 43}, new byte[]{43, 30, -42, 79, -42, -74, 78, -36}), 0);
                jsonObject.addProperty(C0098a.a(new byte[]{-65, 68, 126, -44}, new byte[]{-52, 45, 4, -79, 103, -54, 109, 22}), 0);
                jsonObject.addProperty(C0098a.a(new byte[]{-11, -124, -94, -116}, new byte[]{-127, -3, -46, -23, -19, -92, 49, 35}), 1);
                jsonObject.addProperty(C0098a.a(new byte[]{61, -40, 97, -95, -51, 89, -5, -44, 60}, new byte[]{89, -83, 17, -51, -92, 58, -102, -96}), 0);
                jsonObject.addProperty(C0098a.a(new byte[]{72, 69, 61, 31, 2, -64, 121, 2}, new byte[]{6, 42, 73, 77, 103, -75, 10, 103}), Boolean.FALSE);
                jsonObject.addProperty(C0098a.a(new byte[]{-64, -7, 44, -128, 117}, new byte[]{-91, -113, 73, -18, 1, -104, -23, 45}), C0098a.a(new byte[]{-104, 33, -95, 37, -35, 123, -8, 86, -109, 2, -71, 10, -53, 123, -21}, new byte[]{-10, 68, -42, 102, -81, 30, -103, 34}));
                jsonObject.addProperty(C0098a.a(new byte[]{-17, 6, 93, 25, 125, 76, -56, -58, -7, 6, 93}, new byte[]{-128, 118, 56, 107, 28, 56, -83, -110}), 1);
                JSONObject jSONObject = new JSONObject(C0197c.g(C0098a.a(new byte[]{-81, 9, -69, -43, -26, -40, 1, 30, -80, 10, -72, -117, -92, -48, 29, 65, -90, 19, -31, -58, -6, -113, 1, 83, -24, 28, -65, -52, -70, -124, 71, 93, -94, 82, -70, -43, -7, -115, 79, 85, -104, 15, -86, -44, -32, -121, 93, 69}, new byte[]{-57, 125, -49, -91, -107, -30, 46, 49}), jsonObject.toString(), l()).a());
                if (jSONObject.optInt(C0098a.a(new byte[]{64, -2, -18, -103}, new byte[]{35, -111, -118, -4, -87, -12, -122, -122})) != 401) {
                    return jSONObject.optJSONObject(C0098a.a(new byte[]{-92, -56, 78, 47}, new byte[]{-64, -87, 58, 78, 9, -65, 75, 95})).optJSONObject(C0098a.a(new byte[]{9, -94, -43, 25}, new byte[]{64, -52, -77, 118, -29, 38, 53, 84})).optInt(C0098a.a(new byte[]{-59, 76, 82, -40, -36, -124}, new byte[]{-125, 37, 62, -67, -107, -32, 71, 9}));
                }
                try {
                    q(true);
                } catch (Exception e2) {
                    e = e2;
                }
                e = e2;
            } catch (Exception e3) {
                e = e3;
            }
            y.c(new byte[]{-34, 38, 50, -113, 59, -44, -76, 121, -48, 49, 0, -76, 56, -34, -92, 116, -35, 99, 35, -81, 38, -127, -32}, new byte[]{-71, 67, 70, -35, 84, -69, -64, 61}, new StringBuilder(), e);
            return 0;
        }
        return 0;
    }

    private void p(String str, C0180b c0180b, List<C0180b> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0098a.a(new byte[]{75, 38, 9, 9, 34, -93, -46, 91, 84, 37, 10, 87, 96, -85, -50, 4, 66, 60, 83, 26, 62, -12, -46, 22, 12, 51, 13, 16, 126, -22, -107, 21, 81, 55, 82, 30, 52, -19, -62, 24, 74, 63, 20, 13, 108}, new byte[]{35, 82, 125, 121, 81, -103, -3, 116}));
            sb.append(100);
            sb.append(C0098a.a(new byte[]{-66, -27, -26, 4, 42, 117}, new byte[]{-104, -75, -121, 99, 79, 72, 47, -47}));
            sb.append(i);
            sb.append(C0098a.a(new byte[]{61, 94, -107, -110, 12, -83, 111, -33, 116, 66, -108, -113, 10, -46, 38, -60, 125, 89, -100, -113, 39, -2, 62, -108, 126, 22, -97, -104, 28, -11, 45, -67, 114, 66, -107, -119, 12, -7, 48, -105, 38, 81, -125, -119, 94, -32, 62, -117, 126, 94, -124, -84, 17, -4, 58, -80, 127, 13}, new byte[]{27, 48, -16, -22, 120, -112, 95, -7}));
            sb.append(c0180b.d());
            v.a(new byte[]{120, 16, -19, 91, -115, 79, 86, 73, 39, 94}, new byte[]{94, 99, -123, 58, -1, 42, 29, 44}, sb, str);
            C0181c c0181c = (C0181c) C0132s.a(C0197c.l(C0133t.b(new byte[]{-35, 86, 36, -79, -44, 18, -14, -24, -97}, new byte[]{-5, 5, 76, -48, -90, 119, -94, -97}, sb), l()), C0181c.class);
            for (C0180b c0180b2 : c0181c.a().a()) {
                if (c0180b2.a() == 0) {
                    arrayList.add(c0180b2);
                } else if (c0180b2.a() == 2) {
                    if (!TextUtils.isEmpty(c0180b.e())) {
                        c0180b2.j(c0180b.e());
                    }
                    arrayList2.add(c0180b2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                if (c0181c.a().a().isEmpty()) {
                    break;
                }
                String strC = c0181c.a().c();
                boolean z = false;
                String strA = C0098a.a(new byte[]{-121, 82}, new byte[]{-86, 99, -78, -111, -69, 68, -32, 62});
                if (strC == strA || (strC != null && strC.equals(strA))) {
                    z = true;
                }
                if (z) {
                    break;
                } else {
                    i++;
                }
            } catch (Exception unused) {
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p(str, (C0180b) it.next(), list);
        }
    }

    private boolean q(boolean z) {
        try {
            String str = f;
            String strQ = C0207D.q(str);
            if (TextUtils.isEmpty(strQ)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(strQ);
            String strOptString = jSONObject.optString(C0098a.a(new byte[]{70, -51, -68, 85, 10, -50, -38, 3}, new byte[]{51, -66, -39, 39, 100, -81, -73, 102}));
            String strOptString2 = jSONObject.optString(C0098a.a(new byte[]{33, -61, -54, 70, -57, 96, -66, 8}, new byte[]{81, -94, -71, 53, -80, 15, -52, 108}));
            String strOptString3 = jSONObject.optString(C0098a.a(new byte[]{105, -1, -116, 99, 63, 61, 83, 101, 103, -9, -118, 104}, new byte[]{8, -100, -17, 6, 76, 78, 12, 17}));
            this.a = strOptString3;
            if (!TextUtils.isEmpty(strOptString3) && !z) {
                return true;
            }
            JsonObject jsonObject = new JsonObject();
            if (C0207D.m(strOptString)) {
                jsonObject.addProperty(C0098a.a(new byte[]{81, 57, 34, -126}, new byte[]{60, 88, 75, -18, 75, 90, 77, -109}), strOptString);
                jsonObject.addProperty(C0098a.a(new byte[]{78, 64, 95, 16, 55, 65, 66, 95}, new byte[]{62, 33, 44, 99, 64, 46, 48, 59}), strOptString2);
                jsonObject.addProperty(C0098a.a(new byte[]{-127, -37, -4, 127}, new byte[]{-11, -94, -116, 26, -43, 31, 19, 50}), 2);
            } else {
                jsonObject.addProperty(C0098a.a(new byte[]{79, 82, 109, 81, 2, 55, -102, -3}, new byte[]{63, 51, 30, 34, 114, 88, -24, -119}), strOptString);
                jsonObject.addProperty(C0098a.a(new byte[]{92, -93, 108, -78, 121, -120, 45, 81}, new byte[]{44, -62, 31, -63, 14, -25, 95, 53}), strOptString2);
                jsonObject.addProperty(C0098a.a(new byte[]{-91, -31, 37, -36, -126, 77, 104, 119}, new byte[]{-41, -124, 72, -71, -17, 47, 13, 5}), Boolean.TRUE);
            }
            Map<String, String> mapL = l();
            ((HashMap) mapL).put(C0098a.a(new byte[]{125, -43, -23, 11, 50, -88, -49, -65}, new byte[]{13, -71, -120, 127, 84, -57, -67, -46}), C0098a.a(new byte[]{-110, -22, -41}, new byte[]{-27, -113, -75, -101, 2, 108, -50, -69}));
            JSONObject jSONObject2 = new JSONObject(C0197c.g(d, jsonObject.toString(), mapL).a());
            if (jSONObject2.optInt(C0098a.a(new byte[]{-20, 13, -126, -28}, new byte[]{-113, 98, -26, -127, -120, 48, 84, 120})) != 200) {
                C0207D.d(str);
                C0219l.b(jSONObject2.optString(C0098a.a(new byte[]{112, 0, 103, 24, 127, -13, 28}, new byte[]{29, 101, 20, 107, 30, -108, 121, 42})));
                throw new Exception(jSONObject2.optString(C0098a.a(new byte[]{-125, 107, 74, 17, 121, -119, 59}, new byte[]{-18, 14, 57, 98, 24, -18, 94, -110})));
            }
            this.a = jSONObject2.optJSONObject(C0098a.a(new byte[]{-64, -89, -107, 117}, new byte[]{-92, -58, -31, 20, 40, -112, 28, -31})).optString(C0098a.a(new byte[]{98, -121, 36, 36, -113}, new byte[]{22, -24, 79, 65, -31, 54, -98, -5}));
            jSONObject.put(C0098a.a(new byte[]{13, -124, 43, 11, 56, 27, -11, 54, 3, -116, 45, 0}, new byte[]{108, -25, 72, 110, 75, 104, -86, 66}), this.a);
            C0207D.u(str, jSONObject.toString());
            return true;
        } catch (Exception e2) {
            y.c(new byte[]{-70, -100, -16, 4, 125, 27, 90, -105, -10}, new byte[]{-42, -13, -105, 109, 19, 59, 63, -83}, new StringBuilder(), e2);
            return false;
        }
    }

    public final com.github.catvod.spider.merge.c.k n(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        p(str, new C0180b(), arrayList);
        if (arrayList.size() < 1) {
            return C0207D.e();
        }
        List listSingletonList = Collections.singletonList(C0098a.a(new byte[]{-20, 69, -82, -62, -111, -42, 95, -45, 102}, new byte[]{-35, 119, -99, 39, 31, 73, -72, 71}));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strB = "";
            if (!it.hasNext()) {
                break;
            }
            C0180b c0180b = (C0180b) it.next();
            if (!TextUtils.isEmpty(c0180b.f())) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0098a.a(new byte[]{102}, new byte[]{61, 121, -4, 126, 10, 78, -7, 93}));
                sb.append(c0180b.f().trim());
                strB = C0133t.b(new byte[]{-89}, new byte[]{-6, -37, -22, -26, -51, 88, 81, 2}, sb);
            }
            StringBuilder sbC = C0133t.c(strB);
            sbC.append(c0180b.e());
            sbC.append(c0180b.i());
            v.a(new byte[]{-25}, new byte[]{-61, -23, 83, -102, -39, -41, 75, -90}, sbC, str);
            sbC.append(C0098a.a(new byte[]{-126}, new byte[]{-87, -29, -69, 95, 28, -88, -45, 68}));
            sbC.append(c0180b.d());
            sbC.append(C0098a.a(new byte[]{111}, new byte[]{68, 102, -109, 41, -81, -124, -28, 45}));
            sbC.append(c0180b.e());
            sbC.append(C0098a.a(new byte[]{-58}, new byte[]{-19, -103, 28, 42, 13, -124, 16, -66}));
            sbC.append(c0180b.c());
            sbC.append(C0098a.a(new byte[]{6}, new byte[]{45, -46, -93, 80, -27, 82, 29, -108}));
            sbC.append(c0180b.g());
            sbC.append(C0098a.a(new byte[]{-61}, new byte[]{-24, -102, 87, -62, -36, 90, -119, 81}));
            sbC.append(c0180b.h());
            String string = sbC.toString();
            if (!TextUtils.isEmpty(str2) && !str2.contains(C0098a.a(new byte[]{-85, -118, 17, 126}, new byte[]{-61, -2, 101, 14, 94, -122, 110, 28}))) {
                StringBuilder sbC2 = C0133t.c(string);
                v.a(new byte[]{-31}, new byte[]{-54, 54, 67, 88, -45, 70, 66, -120}, sbC2, str2);
                sbC2.append(C0098a.a(new byte[]{12}, new byte[]{39, 107, -60, 98, 12, 43, 109, -57}));
                sbC2.append(c0180b.e());
                string = sbC2.toString();
            }
            arrayList2.add(string);
        }
        for (int i = 0; i < listSingletonList.size(); i++) {
            arrayList3.add(TextUtils.join(C0098a.a(new byte[]{7}, new byte[]{36, -84, 63, 28, -96, -126, 11, -86}), arrayList2));
        }
        com.github.catvod.spider.merge.c.k kVar = new com.github.catvod.spider.merge.c.k();
        kVar.g(str);
        kVar.e(str);
        kVar.i("");
        kVar.h(C0098a.a(new byte[]{107, -109, -81}, new byte[]{90, -95, -100, -122, -91, 67, -107, -43}));
        kVar.k(TextUtils.join(C0098a.a(new byte[]{57, -86, 45}, new byte[]{29, -114, 9, 100, -57, 80, -90, -76}), arrayList3));
        kVar.j(TextUtils.join(C0098a.a(new byte[]{-107, -94, -23}, new byte[]{-79, -122, -51, 36, 11, 40, -11, 115}), listSingletonList));
        kVar.b(C0098a.a(new byte[]{-34, -121, 100, 44, 24, 103, 19, -127, 119}, new byte[]{-17, -75, 87, -53, -91, -10, -12, 26}));
        return kVar;
    }

    public final void o() {
        int i = 1;
        try {
            try {
                SystemClock.sleep(400L);
                Init.run(new RunnableC0116b(this, i));
                Init.run(new RunnableC0120f(this, i));
                while (TextUtils.isEmpty(this.a)) {
                    SystemClock.sleep(400L);
                }
            } catch (Exception e2) {
                Init.run(new RunnableC0116b(this, i));
                SpiderDebug.log(C0098a.a(new byte[]{-94, -18, 37, -23, 45, -16, -88, 0, -81, -3, 2, -29, 39, -6, -57, 83}, new byte[]{-54, -113, 75, -115, 65, -107, -3, 115}) + e2);
                while (TextUtils.isEmpty(this.a)) {
                    SystemClock.sleep(400L);
                }
            }
        } catch (Throwable th) {
            while (TextUtils.isEmpty(this.a)) {
                SystemClock.sleep(400L);
            }
            throw th;
        }
    }

    public final String r(String[] strArr) {
        if (TextUtils.isEmpty(this.a) && !q(false)) {
            o();
        }
        new Thread(new RunnableC0123i(this, strArr, 1)).start();
        String strK = k(strArr[1], strArr[2], strArr[3], strArr[4], strArr[5]);
        StringBuilder sb = new StringBuilder();
        sb.append(Proxy.getUrl());
        sb.append(C0098a.a(new byte[]{67, -83, 3, -124, -48, 108, 34, -93, 9, -17, 26, -42, -48, 67, 45, -93, 25, -12}, new byte[]{124, -55, 108, -71, -76, 13, 76, -50}));
        sb.append(strArr[3]);
        sb.append(C0098a.a(new byte[]{29, -66, -37, 101, -82, -18, -98, -45, 67, -11}, new byte[]{59, -56, -76, 1, -25, -128, -6, -74}));
        sb.append(strArr[4]);
        String strB = C0133t.b(new byte[]{-102, -70, 7, -97, 53, 1, 68, 87}, new byte[]{-68, -52, 104, -5, 96, 115, 40, 106}, sb);
        com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
        hVar.y(strK);
        hVar.a(strB);
        hVar.j();
        hVar.f(l());
        return hVar.toString();
    }

    public final void s() {
        try {
            LinearLayout linearLayout = new LinearLayout(Init.getActivity());
            int i = 0;
            linearLayout.setOrientation(0);
            linearLayout.setPadding(16, 16, 16, 16);
            linearLayout.setBackgroundColor(-1);
            ImageView imageView = new ImageView(Init.getActivity());
            int iA = C0212e.a(120);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iA, iA));
            int i2 = 1;
            imageView.setContentDescription(C0098a.a(new byte[]{-31, -79, -13, 39, -35, 97, -20, -2, -124}, new byte[]{5, 11, 127, -64, 102, -43, 11, 94}));
            try {
                imageView.setImageBitmap(C0213f.c(String.format(C0098a.a(new byte[]{-29, 48, -122, 22, -69, -43, -79, 92, -8, 126, -53, 95, -74, -62, -79, 9, -7, 43, -118, 31, -66, -98, -15, 68, -5, 49, -127, 14, -24, -108, -8, 22}, new byte[]{-117, 68, -14, 102, -127, -6, -98, 121}), C0207D.g(Init.context())), iA));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            LinearLayout linearLayout2 = new LinearLayout(Init.getActivity());
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(16, 0, 0, 0);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            final EditText editText = new EditText(Init.getActivity());
            editText.setHint(C0098a.a(new byte[]{108, -97, -106, 114, 53, -103, 48, 74, 33, -40, -107, 60, 110, -123, 98}, new byte[]{-124, 48, 33, -102, -117, 10, -43, -49}));
            editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            final EditText editText2 = new EditText(Init.getActivity());
            editText2.setHint(C0098a.a(new byte[]{-90, -32, -97, 35, 56, -24, 81, 50, -21, -86, -121, 77, 97, -37, 53}, new byte[]{78, 79, 40, -53, -122, 123, -76, -73}));
            editText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.addView(editText);
            linearLayout2.addView(editText2);
            linearLayout.addView(imageView);
            linearLayout.addView(linearLayout2);
            this.b = new AlertDialog.Builder(Init.getActivity()).setTitle(C0098a.a(new byte[]{-89, 51, 30, -17, -92, 22, 75, 122, -22, -83, -101, 52, -2, 63, 63, 24, -44, 4, 78, -99, -98, 96, 1, 121, -88, 60, 40, -31, -110, 19, 70, 127, -54, 122, 32, -84, -4, 10, 33, 27, -9, 23, 64, -102, -72, 98, 52, 123, -85, 38, 37, -32, -95, 49, 73, 95, -50, 116, 22, -100, -14, 36, 34, 26, -18, 55, 76, -127, -125}, new byte[]{79, -100, -87, 7, 26, -123, -82, -1})).setView(linearLayout).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0100B(this, i)).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.b.C
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C0104F.c(this.a, editText, editText2);
                }
            }).show();
            this.c = true;
            new Thread(new RunnableC0115a(this, i2)).start();
        } catch (Exception e3) {
            i();
            e3.printStackTrace();
            SpiderDebug.log(C0098a.a(new byte[]{-90, -71, 30, -12, -92, 92, 88, 13, -95, -29, 81, -26, -107, 8, 8}, new byte[]{-43, -47, 113, -125, -19, 50, 40, 120}) + e3.getMessage());
        }
    }
}
