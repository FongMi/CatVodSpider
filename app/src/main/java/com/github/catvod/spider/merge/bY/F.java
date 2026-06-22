package com.github.catvod.spider.merge.bY;

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

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class F {
    private static final String d = com.github.catvod.spider.merge.XI.f.a(new byte[]{54, 3, 16, 35, 41, 16, -101, -118, 50, 24, 3, 58, 52, 4, -123, -105, 109, 7, 5, 61, 116, 73, -37, -56, 113, 22, 20, 58, 117, 95, -57, -64, 44, 88, 23, 58, 61, 68, -21, -52, 48}, new byte[]{94, 119, 100, 83, 90, 42, -76, -91});
    private static final String e = com.github.catvod.spider.merge.XI.f.a(new byte[]{-49, -9, 102, 17, 37, -127, -94, -116, -48, -12, 101, 79, 103, -119, -66, -45, -58, -19, 60, 2, 57, -42}, new byte[]{-89, -125, 18, 97, 86, -69, -115, -93});
    private static final String f = com.github.catvod.spider.merge.XI.f.a(new byte[]{99, -63, -70, 80, 63, -72, 64, 78}, new byte[]{54, -78, -33, 34, 118, -42, 38, 33});
    private String a;
    private AlertDialog b;
    private boolean c = false;

    F() {
        Init.checkPermission();
        SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{17, -34, -65, 55, -64, -107, -48, 36, 47, -42, -91}, new byte[]{65, -65, -47, 6, -14, -90, -16, 109}));
    }

    public static void a(F f2, String[] strArr) {
        f2.getClass();
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String str4 = strArr[3];
        String str5 = strArr[5];
        try {
            int iM = f2.m();
            f2.h(iM);
            JsonArray jsonArray = new JsonArray();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{10, -128, -61, -126, -42, 61, 104}, new byte[]{108, -23, -81, -25, -119, 84, 12, -29}), str2);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-128, 29, -2, 110}, new byte[]{-13, 116, -124, 11, -123, -16, 69, -17}), str5);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{3, 46, 100, -127}, new byte[]{102, 90, 5, -26, -4, 92, -50, -114}), str4);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-115, -103, -91, 103}, new byte[]{-7, -32, -43, 2, 42, -86, -6, 75}), 0);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-60, -77, -55, 110, -70, -6, 24, 52, -35, -66, -34, 84, -67, -22}, new byte[]{-76, -46, -69, 11, -44, -114, 71, 82}), Integer.valueOf(iM));
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-108, -98, -106, 58, -44, -82, 17, -62, -105}, new byte[]{-14, -9, -6, 95, -117, -64, 112, -81}), str3);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-47, 66, 30, 79, -37, -12, 109, -100}, new byte[]{-75, 48, 119, 57, -66, -85, 4, -8}), 0);
            jsonArray.add(jsonObject);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add(com.github.catvod.spider.merge.XI.f.a(new byte[]{-48, 71, -20, -84, 36, -86, -36, 72, -62}, new byte[]{-74, 46, -128, -55, 123, -58, -75, 59}), jsonArray);
            jsonObject2.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-3, -39, -11, -24, 26, -37, -77, -122, -9}, new byte[]{-114, -79, -108, -102, 127, -124, -40, -29}), str);
            jsonObject2.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-61, 31, -59, 66, 103, 86, 56, 78, -52, 15, -63, 85, 110}, new byte[]{-96, 106, -73, 48, 2, 56, 76, 17}), 1);
            jsonObject2.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-82, 93, -69, 126, -91}, new byte[]{-53, 43, -34, 16, -47, 19, 65, 50}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-86, -42, -26, -28, 94, -2, -114, -78}, new byte[]{-34, -92, -121, -118, 45, -104, -21, -64}));
            jsonObject2.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{94, 5, -68, 66, -112, 25, 35}, new byte[]{56, 108, -48, 39, -34, 108, 78, 86}), 1);
            jsonObject2.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{82, 88, -107, 39, -64, 91, 65, -75, 81, 73, -109, 48}, new byte[]{61, 40, -16, 85, -95, 47, 36, -27}), 1);
            com.github.catvod.spider.merge.nU.c.g(com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, 4, -109, 122, 127, -114, 58, -86, -85, 7, -112, 36, 61, -122, 38, -11, -67, 30, -55, 105, 99, -39, 58, -25, -13, 17, -105, 99, 35, -46, 124, -23, -71, 95, -124, 101, 124, -51, 58, -28, -81, 9, -119, 105}, new byte[]{-36, 112, -25, 10, 12, -76, 21, -123}), jsonObject2.toString(), f2.l());
        } catch (Exception e2) {
            y.b(new byte[]{-13, -54, 30, -79, -121, 70, 77, -67, -13, -123, 11, -70, -76}, new byte[]{-112, -91, 110, -56, -58, 53, 52, -45}, new StringBuilder(), e2);
        }
    }

    public static void c(final F f2, EditText editText, EditText editText2) {
        f2.getClass();
        final String string = editText.getText().toString();
        final String string2 = editText2.getText().toString();
        f2.i();
        Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.bY.D
            @Override // java.lang.Runnable
            public final void run() {
                F.d(this.a, string, string2);
            }
        });
    }

    public static /* synthetic */ void d(F f2, String str, String str2) {
        f2.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{86, 113, 126, 44, 47, -118, 90, 67}, new byte[]{35, 2, 27, 94, 65, -21, 55, 38}), str);
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-114, -89, -82, 30, 17, 54, 44, -52}, new byte[]{-2, -58, -35, 109, 102, 89, 94, -88}), str2);
            com.github.catvod.spider.merge.pT.C.u(f, jSONObject.toString());
            if (f2.q(true)) {
                return;
            }
            f2.o();
        } catch (Exception e2) {
            y.b(new byte[]{52, -40, 51, 50, -33, 13, -125, 114, 45, -45, 67, 56, -34, 22, -51, 59}, new byte[]{91, -74, 99, 93, -84, 100, -9, 27}, new StringBuilder(), e2);
        }
    }

    public static /* synthetic */ void e(F f2) {
        f2.getClass();
        while (f2.c) {
            try {
                String strQ = com.github.catvod.spider.merge.pT.C.q(f);
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{112, 65, -108, -79, -11, -80, -90, -101, 63, 18}, new byte[]{5, 50, -15, -61, -68, -34, -64, -12}) + strQ);
                if (!TextUtils.isEmpty(strQ)) {
                    com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{43, 76, -73, 50, 25, 109, -87, -21, 92, 48, -122, 72, -120, -40, -89, -52, 123, 60, -116, 87, 65, 127, -11, -118, 75, 88, -22, 65, 20, 16, -16, -8, 42, 72, -87}, new byte[]{-52, -43, 12, -41, -92, -8, 79, 99}));
                    f2.q(false);
                    f2.b.dismiss();
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
        String strReplace = str.replace(com.github.catvod.spider.merge.XI.f.a(new byte[]{-27, -46, -4, -25, -89, 82}, new byte[]{-50, -30, -60, -35, -105, 98, 41, -37}), com.github.catvod.spider.merge.XI.f.a(new byte[]{105, 34, 20, 92, 72}, new byte[]{66, 18, 44, 108, 120, -125, -111, -33}));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(com.github.catvod.spider.merge.XI.f.a(new byte[]{-73, -40, -52, 33, -64, -6, 31, 4, -86, -59, -110, 12, -54, -1, 26, 19, -93, -52, -113, 43, -98, -19, 8, 115, -108, -5}, new byte[]{-50, -95, -75, 88, -19, -73, 82, 41}));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(com.github.catvod.spider.merge.XI.f.a(new byte[]{78, -29, 60}, new byte[]{27, -73, 127, -110, 75, 111, 83, 81})));
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
            long j = com.github.catvod.spider.merge.pT.C.j();
            JsonArray jsonArray = new JsonArray();
            Gson gson = new Gson();
            while (true) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[59];
                bArr[0] = 95;
                bArr[1] = 110;
                bArr[2] = 121;
                bArr[3] = 41;
                bArr[4] = -66;
                bArr[5] = -86;
                bArr[6] = 59;
                bArr[7] = 111;
                bArr[8] = 64;
                bArr[9] = 109;
                bArr[10] = 122;
                bArr[11] = 119;
                bArr[12] = -4;
                bArr[13] = -94;
                bArr[14] = 39;
                bArr[15] = 48;
                bArr[c] = 86;
                bArr[17] = 116;
                bArr[18] = 35;
                bArr[19] = 58;
                bArr[20] = -94;
                bArr[21] = -3;
                bArr[22] = 59;
                bArr[23] = 34;
                bArr[24] = 24;
                bArr[25] = 123;
                bArr[26] = 125;
                bArr[27] = 48;
                bArr[28] = -30;
                bArr[29] = -10;
                bArr[30] = 125;
                bArr[31] = 44;
                bArr[32] = 82;
                bArr[33] = 53;
                bArr[34] = 97;
                bArr[35] = 48;
                bArr[36] = -66;
                bArr[37] = -28;
                bArr[38] = 59;
                bArr[39] = 46;
                bArr[40] = 82;
                bArr[41] = 109;
                bArr[42] = 50;
                bArr[43] = 61;
                bArr[44] = -65;
                bArr[45] = -7;
                bArr[46] = 98;
                bArr[47] = 37;
                bArr[48] = 126;
                bArr[49] = 126;
                bArr[50] = 48;
                bArr[51] = 105;
                bArr[52] = -21;
                bArr[53] = -4;
                bArr[54] = 125;
                bArr[55] = 45;
                bArr[56] = 94;
                bArr[57] = 110;
                bArr[58] = 48;
                sb.append(com.github.catvod.spider.merge.XI.f.a(bArr, new byte[]{55, 26, 13, 89, -51, -112, 20, 64}));
                sb.append(100);
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-10, 7, 83, 118, 5, -84, -57, -3, -65, 27, 82, 107, 3, -45, -114, -26, -91, 25, 82, 111, 5, -12, -88, -81, -71, 4, 83, 40, 30, -29, -109, -66, -94, 45, 95, 124, 20, -14, -125, -78, -65, 7, 11, 106, 20, -30, -108, -3, -96, 8, 68, 107, 31, -27, -79, -78, -68, 12, 127, 106, 76}, new byte[]{-48, 105, 54, 14, 113, -111, -9, -37}));
                sb.append(i);
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-123, 92, -18, 72, 117, 116, 36, 113, -98, 78, -3, 69, 117, 121, 103, 70, -58, 73, -18, 74, 110, 88, 32, 97, -62, 21, -70, 121, 103, 123, 36, 40}, new byte[]{-93, 40, -100, 41, 6, 28, 65, 21}));
                sb.append(1);
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-71, -45, -118, -44, 32, -92, -102, 114, -16, -37, -103, -3, 39, -93, -45, 92, -10, -38, -103, -105, 33, -96, -62, 104, -2, -62, -103, -27, 55, -96, -62, 39, -82, -112, -107, -33, 10, -71, -43, 127, -4, -62, -81, -63, 47, -77, -62, 39, -7, -41, -112, -62, 43}, new byte[]{-97, -74, -4, -79, 78, -48, -89, 26}));
                com.github.catvod.spider.merge.XU.h hVarB = com.github.catvod.spider.merge.XU.h.b(com.github.catvod.spider.merge.nU.c.l(sb.toString(), l()));
                for (com.github.catvod.spider.merge.XU.g gVar : hVarB.a().a()) {
                    if (g(gVar.b()) < j) {
                        jsonArray.add(gson.toJsonTree(gVar).getAsJsonObject());
                    }
                }
                if (hVarB.a().b() < 100) {
                    break;
                } else {
                    c = 16;
                }
            }
            if (jsonArray.size() == 0) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{86, 79, -5, 9, -54, 39, -51}, new byte[]{50, 61, -110, 127, -81, 110, -87, -123}), 0);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{9, 88, 101, -31, -97, -74, -110, -59, 8}, new byte[]{102, 40, 0, -109, -2, -62, -5, -86}), Boolean.TRUE);
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{65, 18, -73, 65, -98}, new byte[]{36, 100, -46, 47, -22, 13, -57, -68}), com.github.catvod.spider.merge.XI.f.a(new byte[]{98, -79, 63, -57, -8, 56, -20, 31, 104, -77, 46}, new byte[]{11, -33, 75, -88, -86, 93, -113, 102}));
            jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{43, -90, 23, 75, 73, 33, 41, -77, 40, -73, 17, 92}, new byte[]{68, -42, 114, 57, 40, 85, 76, -29}), 1);
            jsonObject.add(com.github.catvod.spider.merge.XI.f.a(new byte[]{53, 40, 72, -55, 50, 95, -45, -72, 59, 8, 74, -54, 9, 97, -37, -72, 39}, new byte[]{83, 65, 36, -84, 102, 45, -78, -53}), jsonArray);
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-16, 79, -117, -30, -108, -69, -5, 32, -15, 71, -108, -89, -110, -69, -63, 110, -76}, new byte[]{-108, 42, -25, -121, -32, -34, -78, 84}) + com.github.catvod.spider.merge.nU.c.g(com.github.catvod.spider.merge.XI.f.a(new byte[]{-47, -123, 1, -62, 59, 127, 95, -7, -50, -122, 2, -100, 121, 119, 67, -90, -40, -97, 91, -47, 39, 40, 95, -76, -106, -112, 5, -37, 103, 35, 25, -70, -36, -34, 1, -64, 41, 54, 24}, new byte[]{-71, -15, 117, -78, 72, 69, 112, -42}), jsonObject.toString(), l()).toString());
        } catch (Exception e2) {
            y.b(new byte[]{-16, 19, -64, 61, 15, 19, 124, 12, -15, 27, -40, 120, 30, 4, 71, 66}, new byte[]{-108, 118, -85, 88, 123, 118, 53, 120}, new StringBuilder(), e2);
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

    public static F j() {
        return E.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x069b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String k(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 2946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.bY.F.k(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private Map<String, String> l() {
        HashMap map = new HashMap();
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-124, -94, 54, -99, 100, 6}, new byte[]{-21, -48, 95, -6, 13, 104, -59, -86}), e);
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{124, -119, -2, -16, 65, 93, -34}, new byte[]{14, -20, -104, -107, 51, 56, -84, -47}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-56, 81, 107, 29, 23, -125, 19, 98, -41, 82, 104, 67, 85, -117, 15, 61, -63, 75, 49, 14, 11, -44, 19}, new byte[]{-96, 37, 31, 109, 100, -71, 60, 77}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-84, 113, 30, -30, -6, -48, 59, -118, -73, 118}, new byte[]{-39, 2, 123, -112, -41, -79, 92, -17}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-122, 77, -78, 78, -97, 123, -120, -103, -5, 4, -92, 91, -62, 61, -100, -63, -83, 5, -19, 91, -36, 32, -43, -36}, new byte[]{-62, 44, -64, 58, -80, 73, -90, -88}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{120, -16, -4, -32, -105, -87, 13, 94}, new byte[]{8, -100, -99, -108, -15, -58, 127, 51}), com.github.catvod.spider.merge.XI.f.a(new byte[]{125, 104, 16, 108, -128, 75, 33}, new byte[]{28, 6, 116, 30, -17, 34, 69, 127}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-87, 36, -57, 13, 124, 2, 40, -75, -95, 59, -39}, new byte[]{-56, 84, -73, 32, 10, 103, 90, -58}), com.github.catvod.spider.merge.XI.f.a(new byte[]{8}, new byte[]{59, -85, 93, 60, 76, 79, 82, -62}));
        if (!TextUtils.isEmpty(this.a)) {
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{14, -82, -127, -107, -90, 74, 69, -15, 46, -81, -100, -110, -89}, new byte[]{79, -37, -11, -3, -55, 56, 44, -117}), com.github.catvod.spider.merge.XI.f.a(new byte[]{97, 12, 123, 12, 48, -56, 97}, new byte[]{35, 105, 26, 126, 85, -70, 65, 27}) + this.a);
        }
        return map;
    }

    private int m() {
        for (int i = 0; i <= 2; i++) {
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-21, -40, 103, -1, -106, -113, 74}, new byte[]{-113, -86, 14, -119, -13, -58, 46, 102}), 0);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{80, 110, -60, -106, -17, -70, -62, 57}, new byte[]{54, 7, -88, -13, -95, -37, -81, 92}), com.github.catvod.spider.merge.XI.f.a(new byte[]{85, 123, -3, -81, -37, -85, 113, -121, 87, 110, -2, -72}, new byte[]{33, 26, -109, -56, -88, -54, 31, -13}));
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{82, 57, -44, 90, -96, 41, 123, -118, 78, 61, -17, 91}, new byte[]{34, 88, -90, 63, -50, 93, 61, -29}), 0);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{33, 12, 114, 84}, new byte[]{82, 101, 8, 49, -106, 56, -72, 55}), 0);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-11, 62, 46, -76}, new byte[]{-127, 71, 94, -47, -79, -97, -13, -94}), 1);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-115, 93, 56, 89, -95, 16, 43, -7, -116}, new byte[]{-23, 40, 72, 53, -56, 115, 74, -115}), 0);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-54, 26, 120, -34, 49, -65, 82, -76}, new byte[]{-124, 117, 12, -116, 84, -54, 33, -47}), Boolean.FALSE);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{125, -114, 1, -43, -44}, new byte[]{24, -8, 100, -69, -96, -68, 71, 37}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-109, 83, -121, 86, 104, 22, 63, 91, -104, 112, -97, 121, 126, 22, 44}, new byte[]{-3, 54, -16, 21, 26, 115, 94, 47}));
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-45, -24, -20, -61, 55, -27, 90, -33, -59, -24, -20}, new byte[]{-68, -104, -119, -79, 86, -111, 63, -117}), 1);
                JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.g(com.github.catvod.spider.merge.XI.f.a(new byte[]{-61, -29, 63, 40, 50, 67, 6, -12, -36, -32, 60, 118, 112, 75, 26, -85, -54, -7, 101, 59, 46, 20, 6, -71, -124, -10, 59, 49, 110, 31, 64, -73, -50, -72, 62, 40, 45, 22, 72, -65, -12, -27, 46, 41, 52, 28, 90, -81}, new byte[]{-85, -105, 75, 88, 65, 121, 41, -37}), jsonObject.toString(), l()).a());
                if (jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{7, -93, -46, -96}, new byte[]{100, -52, -74, -59, 78, 107, 16, -69})) != 401) {
                    return jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{117, 42, 126, -30}, new byte[]{17, 75, 10, -125, -36, 103, 35, 90})).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-123, -30, 112, 63}, new byte[]{-52, -116, 22, 80, -111, 101, -108, -25})).optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-20, 124, -82, -125, 78, -59}, new byte[]{-86, 21, -62, -26, 7, -95, -78, 84}));
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
            y.b(new byte[]{-61, -15, -79, -65, -88, 24, -76, 61, -51, -26, -125, -124, -85, 18, -92, 48, -64, -76, -96, -97, -75, 77, -32}, new byte[]{-92, -108, -59, -19, -57, 119, -64, 121}, new StringBuilder(), e);
            return 0;
        }
        return 0;
    }

    private void p(String str, com.github.catvod.spider.merge.XU.g gVar, List<com.github.catvod.spider.merge.XU.g> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{93, -48, -79, 36, -125, 106, -108, 71, 66, -45, -78, 122, -63, 98, -120, 24, 84, -54, -21, 55, -97, 61, -108, 10, 26, -59, -75, 61, -33, 35, -45, 9, 71, -63, -22, 51, -107, 36, -124, 4, 92, -55, -84, 32, -51}, new byte[]{53, -92, -59, 84, -16, 80, -69, 104}));
            sb.append(100);
            sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{92, 51, 100, 61, 109, 9}, new byte[]{122, 99, 5, 90, 8, 52, -46, 48}));
            sb.append(i);
            sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{94, 77, 57, 115, 67, 127, -101, 84, 23, 81, 56, 110, 69, 0, -46, 79, 30, 74, 48, 110, 104, 44, -54, 31, 29, 5, 51, 121, 83, 39, -39, 54, 17, 81, 57, 104, 67, 43, -60, 28, 69, 66, 47, 104, 17, 50, -54, 0, 29, 77, 40, 77, 94, 46, -50, 59, 28, 30}, new byte[]{120, 35, 92, 11, 55, 66, -85, 114}));
            sb.append(gVar.d());
            v.c(new byte[]{-94, -72, 117, -116, -98, 28, 87, -85, -3, -10}, new byte[]{-124, -53, 29, -19, -20, 121, 28, -50}, sb, str);
            com.github.catvod.spider.merge.XU.h hVar = (com.github.catvod.spider.merge.XU.h) C0924s.a(com.github.catvod.spider.merge.nU.c.l(C0925t.a(new byte[]{20, 34, 13, -120, -9, 21, -28, -103, 86}, new byte[]{50, 113, 101, -23, -123, 112, -76, -18}, sb), l()), com.github.catvod.spider.merge.XU.h.class);
            for (com.github.catvod.spider.merge.XU.g gVar2 : hVar.a().a()) {
                if (gVar2.a() == 0) {
                    arrayList.add(gVar2);
                } else if (gVar2.a() == 2) {
                    if (!TextUtils.isEmpty(gVar.e())) {
                        gVar2.j(gVar.e());
                    }
                    arrayList2.add(gVar2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                if (hVar.a().a().isEmpty()) {
                    break;
                }
                String strC = hVar.a().c();
                boolean z = false;
                String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{26, 124}, new byte[]{55, 77, -100, -14, -117, -118, 47, 91});
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
            p(str, (com.github.catvod.spider.merge.XU.g) it.next(), list);
        }
    }

    private boolean q(boolean z) {
        try {
            String str = f;
            String strQ = com.github.catvod.spider.merge.pT.C.q(str);
            if (TextUtils.isEmpty(strQ)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(strQ);
            String strOptString = jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-121, 102, -31, -110, -76, -91, -110, -47}, new byte[]{-14, 21, -124, -32, -38, -60, -1, -76}));
            String strOptString2 = jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{124, 71, 52, 15, -90, 112, -127, -107}, new byte[]{12, 38, 71, 124, -47, 31, -13, -15}));
            String strOptString3 = jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{2, -117, 22, 45, -78, 100, 89, 77, 12, -125, 16, 38}, new byte[]{99, -24, 117, 72, -63, 23, 6, 57}));
            this.a = strOptString3;
            if (!TextUtils.isEmpty(strOptString3) && !z) {
                return true;
            }
            JsonObject jsonObject = new JsonObject();
            if (com.github.catvod.spider.merge.pT.C.m(strOptString)) {
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-124, -56, -74, -11}, new byte[]{-23, -87, -33, -103, 69, -91, -62, 69}), strOptString);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-9, -28, -114, 41, 102, -26, 10, -43}, new byte[]{-121, -123, -3, 90, 17, -119, 120, -79}), strOptString2);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{72, -42, 4, 43}, new byte[]{60, -81, 116, 78, -97, -36, 86, -9}), 2);
            } else {
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-13, -16, 73, -51, -95, 84, 52, 126}, new byte[]{-125, -111, 58, -66, -47, 59, 70, 10}), strOptString);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-67, 26, 41, 96, -126, -19, 97, -54}, new byte[]{-51, 123, 90, 19, -11, -126, 19, -82}), strOptString2);
                jsonObject.addProperty(com.github.catvod.spider.merge.XI.f.a(new byte[]{-105, 46, -80, -19, 40, -81, 109, -75}, new byte[]{-27, 75, -35, -120, 69, -51, 8, -57}), Boolean.TRUE);
            }
            Map<String, String> mapL = l();
            ((HashMap) mapL).put(com.github.catvod.spider.merge.XI.f.a(new byte[]{114, -12, 100, 32, -47, -96, 90, -106}, new byte[]{2, -104, 5, 84, -73, -49, 40, -5}), com.github.catvod.spider.merge.XI.f.a(new byte[]{101, -55, 68}, new byte[]{18, -84, 38, 5, -77, 76, -105, -85}));
            JSONObject jSONObject2 = new JSONObject(com.github.catvod.spider.merge.nU.c.g(d, jsonObject.toString(), mapL).a());
            if (jSONObject2.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{46, 76, -108, 108}, new byte[]{77, 35, -16, 9, -81, -76, -65, -81})) != 200) {
                com.github.catvod.spider.merge.pT.C.d(str);
                com.github.catvod.spider.merge.pT.k.b(jSONObject2.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{37, -126, -37, -31, 82, -105, 93}, new byte[]{72, -25, -88, -110, 51, -16, 56, -38})));
                throw new Exception(jSONObject2.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{112, 61, 82, 106, -84, 100, 79}, new byte[]{29, 88, 33, 25, -51, 3, 42, -78})));
            }
            this.a = jSONObject2.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-22, -65, 118, 60}, new byte[]{-114, -34, 2, 93, 99, -32, -53, 123})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{119, 92, -17, 65, -7}, new byte[]{3, 51, -124, 36, -105, -33, 49, 17}));
            jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-86, -34, 84, 103, 29, -85, 108, 87, -92, -42, 82, 108}, new byte[]{-53, -67, 55, 2, 110, -40, 51, 35}), this.a);
            com.github.catvod.spider.merge.pT.C.u(str, jSONObject.toString());
            return true;
        } catch (Exception e2) {
            y.b(new byte[]{-121, -46, -50, -5, 54, -113, 12, 70, -53}, new byte[]{-21, -67, -87, -110, 88, -81, 105, 124}, new StringBuilder(), e2);
            return false;
        }
    }

    public final com.github.catvod.spider.merge.KI.k n(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        p(str, new com.github.catvod.spider.merge.XU.g(), arrayList);
        if (arrayList.size() < 1) {
            return com.github.catvod.spider.merge.pT.C.e();
        }
        List listSingletonList = Collections.singletonList(com.github.catvod.spider.merge.XI.f.a(new byte[]{44, -18, 24, 84, -41, -20, 32, -88, -90}, new byte[]{29, -36, 43, -79, 89, 115, -57, 60}));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strA = "";
            if (!it.hasNext()) {
                break;
            }
            com.github.catvod.spider.merge.XU.g gVar = (com.github.catvod.spider.merge.XU.g) it.next();
            if (!TextUtils.isEmpty(gVar.f())) {
                StringBuilder sb = new StringBuilder();
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{93}, new byte[]{6, 119, 90, -100, 11, 116, 14, 51}));
                sb.append(gVar.f().trim());
                strA = C0925t.a(new byte[]{-56}, new byte[]{-107, 29, 106, -50, 80, 17, 123, 19}, sb);
            }
            StringBuilder sbB = C0925t.b(strA);
            sbB.append(gVar.e());
            sbB.append(gVar.i());
            v.c(new byte[]{-60}, new byte[]{-32, 49, -63, -48, -116, -30, -35, 99}, sbB, str);
            sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{104}, new byte[]{67, -104, -67, -106, -16, 77, 48, -123}));
            sbB.append(gVar.d());
            sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-4}, new byte[]{-41, 122, -65, -49, -18, 112, -76, -33}));
            sbB.append(gVar.e());
            sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{120}, new byte[]{83, -1, 64, 36, 27, 19, -9, -65}));
            sbB.append(gVar.c());
            sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-79}, new byte[]{-102, 116, -94, 74, 42, 89, 85, -27}));
            sbB.append(gVar.g());
            sbB.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-46}, new byte[]{-7, -11, -115, -70, -106, -68, -34, -15}));
            sbB.append(gVar.h());
            String string = sbB.toString();
            if (!TextUtils.isEmpty(str2) && !str2.contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{11, 48, 12, 41}, new byte[]{99, 68, 120, 89, 33, -103, 69, -62}))) {
                StringBuilder sbB2 = C0925t.b(string);
                v.c(new byte[]{110}, new byte[]{69, 49, -5, -91, -121, 40, 89, -33}, sbB2, str2);
                sbB2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{96}, new byte[]{75, 106, 67, -80, -12, -71, 25, -34}));
                sbB2.append(gVar.e());
                string = sbB2.toString();
            }
            arrayList2.add(string);
        }
        for (int i = 0; i < listSingletonList.size(); i++) {
            arrayList3.add(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-23}, new byte[]{-54, 85, -63, -85, -63, 93, -17, -108}), arrayList2));
        }
        com.github.catvod.spider.merge.KI.k kVar = new com.github.catvod.spider.merge.KI.k();
        kVar.g(str);
        kVar.e(str);
        kVar.i("");
        kVar.h(com.github.catvod.spider.merge.XI.f.a(new byte[]{-103, 101, 123}, new byte[]{-88, 87, 72, 27, -98, 103, -104, -56}));
        kVar.k(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-67, 42, -2}, new byte[]{-103, 14, -38, -34, -47, -115, -44, 15}), arrayList3));
        kVar.j(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-113, 0, 88}, new byte[]{-85, 36, 124, -59, 126, 10, 6, -101}), listSingletonList));
        kVar.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-48, 119, 48, -128, 121, 116, 20, 37, 121}, new byte[]{-31, 69, 3, 103, -60, -27, -13, -66}));
        return kVar;
    }

    public final void o() {
        int i = 1;
        try {
            try {
                SystemClock.sleep(400L);
                Init.run(new RunnableC0908b(this, i));
                Init.run(new RunnableC0912f(this, i));
                while (TextUtils.isEmpty(this.a)) {
                    SystemClock.sleep(400L);
                }
            } catch (Exception e2) {
                Init.run(new RunnableC0908b(this, i));
                SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{23, 79, -44, 7, -33, -21, 68, 30, 26, 92, -13, 13, -43, -31, 43, 77}, new byte[]{127, 46, -70, 99, -77, -114, 17, 109}) + e2);
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
        new Thread(new RunnableC0915i(this, strArr, 1)).start();
        String strK = k(strArr[1], strArr[2], strArr[3], strArr[4], strArr[5]);
        StringBuilder sb = new StringBuilder();
        sb.append(Proxy.getUrl());
        sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-24, -30, -118, 122, -48, 2, -86, -34, -94, -96, -109, 40, -48, 45, -91, -34, -78, -69}, new byte[]{-41, -122, -27, 71, -76, 99, -60, -77}));
        sb.append(strArr[3]);
        sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{94, -99, 34, -38, -27, 120, -41, 35, 0, -42}, new byte[]{120, -21, 77, -66, -84, 22, -77, 70}));
        sb.append(strArr[4]);
        String strA = C0925t.a(new byte[]{35, -69, -57, -30, -107, 77, 97, -55}, new byte[]{5, -51, -88, -122, -64, 63, 13, -12}, sb);
        com.github.catvod.spider.merge.KI.h hVar = new com.github.catvod.spider.merge.KI.h();
        hVar.y(strK);
        hVar.a(strA);
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
            int iA = com.github.catvod.spider.merge.pT.e.a(120);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iA, iA));
            int i2 = 1;
            imageView.setContentDescription(com.github.catvod.spider.merge.XI.f.a(new byte[]{-66, -12, 52, -106, -67, 5, -67, 13, -37}, new byte[]{90, 78, -72, 113, 6, -79, 90, -83}));
            try {
                imageView.setImageBitmap(com.github.catvod.spider.merge.XI.f.d(String.format(com.github.catvod.spider.merge.XI.f.a(new byte[]{-23, 97, -91, -19, -93, 91, -32, 27, -14, 47, -24, -92, -82, 76, -32, 78, -13, 122, -87, -28, -90, 16, -96, 3, -15, 96, -94, -11, -16, 26, -87, 81}, new byte[]{-127, 21, -47, -99, -103, 116, -49, 62}), com.github.catvod.spider.merge.pT.C.g(Init.context())), iA));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            LinearLayout linearLayout2 = new LinearLayout(Init.getActivity());
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(16, 0, 0, 0);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            final EditText editText = new EditText(Init.getActivity());
            editText.setHint(com.github.catvod.spider.merge.XI.f.a(new byte[]{121, -2, 92, -7, -13, 73, 66, -49, 52, -71, 95, -73, -88, 85, 16}, new byte[]{-111, 81, -21, 17, 77, -38, -89, 74}));
            editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            final EditText editText2 = new EditText(Init.getActivity());
            editText2.setHint(com.github.catvod.spider.merge.XI.f.a(new byte[]{-12, -114, 1, -121, 92, -93, -30, -119, -71, -60, 25, -23, 5, -112, -122}, new byte[]{28, 33, -74, 111, -30, 48, 7, 12}));
            editText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.addView(editText);
            linearLayout2.addView(editText2);
            linearLayout.addView(imageView);
            linearLayout.addView(linearLayout2);
            this.b = new AlertDialog.Builder(Init.getActivity()).setTitle(com.github.catvod.spider.merge.XI.f.a(new byte[]{93, -17, 64, -26, 71, -117, -89, -103, 16, 113, -59, 61, 29, -94, -45, -5, 46, -40, 16, -108, 125, -3, -19, -102, 82, -32, 118, -24, 113, -114, -86, -100, 48, -90, 126, -91, 31, -105, -51, -8, 13, -53, 30, -109, 91, -1, -40, -104, 81, -6, 123, -23, 66, -84, -91, -68, 52, -88, 72, -107, 17, -71, -50, -7, 20, -21, 18, -120, 96}, new byte[]{-75, 64, -9, 14, -7, 24, 66, 28})).setView(linearLayout).setNegativeButton(R.string.cancel, new B(this, i)).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.bY.C
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    F.c(this.a, editText, editText2);
                }
            }).show();
            this.c = true;
            new Thread(new RunnableC0907a(this, i2)).start();
        } catch (Exception e3) {
            i();
            e3.printStackTrace();
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-117, -76, -52, 76, -2, 125, -33, 51, -116, -18, -125, 94, -49, 41, -113}, new byte[]{-8, -36, -93, 59, -73, 19, -81, 70}) + e3.getMessage());
        }
    }
}
