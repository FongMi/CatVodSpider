package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.p.C0208a;
import com.github.catvod.spider.merge.p.C0220m;
import com.github.catvod.spider.merge.q.AbstractC0222a;
import com.github.catvod.spider.merge.q.f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Czsapp extends Spider {
    private static final Pattern a = Pattern.compile(C0098a.a(new byte[]{33, -86, -51, 85, 98, -96, -110, -51, 33, -71, -32, 106, 50, -35, -30, -72, 103, -34, -31, 86, 107, -64, -33, -111, 109, -31, -30, 98, 47, -109, -103, -128, 109, -31, -28, 114, 110, -41, -44, -128, 54, -84, -13, 101, 35, -45, -20, -112, 101, -70, -72, 123, 33, -113, -54, -127, 95, -86, -76, 35, 27, -95, -35, -72, 116, -33, -67, 34, 98, -45, -109, -119, 103, -73, -72, 110, 46, -98, -105, -79, 119, -28, -82, 37, 48, -100, -53, -105, 102, -34, -66, 35, 27, -95, -35, -71, 40, -85, -54, 34}, new byte[]{3, -126, -106, 11, 64, -3, -71, -28}));
    private static final Pattern b = Pattern.compile(C0098a.a(new byte[]{-30, 48, 76, -119, 116, -17, 57, -77, -17, 44, 90, -128, 33, -11, 59, -57, -49, 7, 10, -79, 48, -4, 59}, new byte[]{-108, 89, 40, -20, 27, -43, 25, -17}));
    private static final Pattern c = Pattern.compile(C0098a.a(new byte[]{-123, 62, -29, 73, -51, -37, 89, 83, -52, 107, -35, 70, -47, -35, 89, 12, -44, 99, -38, 99, -122, -14, 30, 106, -40, 61, -11, 73, -115, -115}, new byte[]{-10, 75, -127, 61, -92, -81, 53, 54}));
    private static String d;

    protected static HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{112, -11, -24, 5, 91, -22, 35, -121, 75, -14}, new byte[]{37, -122, -115, 119, 118, -85, 68, -30}), C0098a.a(new byte[]{-12, -8, -12, -8, -105, 17, -84, 6, -49, -1, -75, -57, -43, 42, -94, 15, -51, -22, -66, -65, -108, 96, -21, 75, -19, -30, -1, -1, -62, 107, -21, 34, -49, -17, -29, -27, -45, 52, -21, 82, -108, -80, -79, -38, -16, 10, -6, 82, -111, -85, -45, -1, -45, 60, -81, 76, -32, -37, -94, -53, -108, 98, -1, 83, -105, -70, -90, -92, -118, 96, -13, 88, -127, -4, -25, -93, -102, 17, -69, 19, -51, -18, -58, -17, -40, 27, -94, 23, -114, -66, -94, -67, -108, 99, -3, 67, -119, -64, -39, -34, -9, 28, -25, 67, -51, -30, -6, -17, -102, 23, -82, 0, -54, -28, -72, -86, -20, 53, -71, 16, -56, -28, -1, -91, -114, 126, -5, 67, -30, -29, -29, -27, -41, 53, -28, 82, -110, -67, -65, -70, -108, 103, -6, 83, -110, -91, -96, -72, -115, 112, -122, 12, -61, -30, -3, -17, -102, 3, -86, 5, -64, -7, -8, -91, -113, 99, -4, 77, -110, -67}, new byte[]{-95, -117, -111, -118, -70, 80, -53, 99}));
        map.put(C0098a.a(new byte[]{-39, 35, -3, -40, 46, -62, -110}, new byte[]{-117, 70, -101, -67, 92, -89, -32, 125}), d);
        return map;
    }

    private Map<String, String> b() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{69, -42, 97, -59, 20, -119, -69, -113, 126, -47}, new byte[]{16, -91, 4, -73, 57, -56, -36, -22}), C0098a.a(new byte[]{107, 83, 108, -21, -4, -60, 13, -27, 80, 84, 45, -44, -66, -1, 3, -20, 82, 65, 38, -84, -1, -75, 74, -88, 114, 73, 103, -20, -87, -66, 74, -63, 80, 68, 123, -10, -72, -31, 74, -79, 11, 27, 41, -55, -101, -33, 91, -79, 14, 0, 75, -20, -72, -23, 14, -81, 127, 112, 58, -40, -1, -73, 94, -80, 8, 17, 62, -73, -31, -75, 82, -69, 30, 87, 127, -80, -15, -60, 26, -16, 82, 69, 94, -4, -77, -50, 3, -12, 17, 21, 58, -82, -1, -74, 92, -96, 22, 107, 65, -51, -100, -55, 70, -96, 82, 73, 98, -4, -15, -62, 15, -29, 85, 79, 32, -71, -121, -32, 24, -13, 87, 79, 103, -74, -27, -85, 90, -96, 125, 72, 123, -10, -68, -32, 69, -79, 13, 22, 39, -87, -1, -78, 91, -80, 13, 14, 56, -85, -26, -91, 39, -17, 92, 73, 101, -4, -15, -42, 11, -26, 95, 82, 96, -74, -28, -74, 93, -82, 13, 22}, new byte[]{62, 32, 9, -103, -47, -123, 106, -128}));
        map.put(C0098a.a(new byte[]{-41, -91, 84, 32, -13, 67, -69}, new byte[]{-123, -64, 50, 69, -127, 38, -55, -69}), d);
        map.put(C0098a.a(new byte[]{36, -65, 83, 67, 99, 68, 15, 63, 4, -78, 87, 83, 114, 87, 71}, new byte[]{101, -36, 48, 38, 19, 48, 34, 115}), C0098a.a(new byte[]{-29, -39, -105, -66, 123, 84, -25, -75, -94, -64, -121, -51, 27, 65}, new byte[]{-103, -79, -70, -3, 53, 120, -99, -35}));
        return map;
    }

    private void c(List<k> list, h hVar) {
        Iterator itD = C0133t.d(new byte[]{-80, 15, 127, -51, -54, -90, 21, 60, -13, 4, 84, -4, -58, -108, 25, 118, -66, 83, 43, -25, -49, -21, 76, 126, -9}, new byte[]{-98, 109, 11, -110, -93, -53, 114, 18}, hVar);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            list.add(new k(mVar.o0(C0098a.a(new byte[]{-118}, new byte[]{-21, -105, 56, -15, 93, 91, -56, -89})).a(C0098a.a(new byte[]{-72, -116, 7, -10}, new byte[]{-48, -2, 98, -112, 28, -126, -38, -97})), y.b(new byte[]{-120, 70, -128, 110, 69, -41, 90, 91, -122, 67}, new byte[]{-90, 34, -7, 26, 44, -93, 122, 101}, mVar), mVar.o0(C0098a.a(new byte[]{73, 126, 15}, new byte[]{32, 19, 104, -111, -120, -111, -80, -8})).a(C0098a.a(new byte[]{-84, -72, -85, 27, 119, 58, -127, -76, -81, -80, -79, 27, 54}, new byte[]{-56, -39, -33, 122, 90, 85, -13, -35})), y.b(new byte[]{56, 2, 41, 20, -45, 84, 85, -56, 119, 6}, new byte[]{22, 104, 64, 112, -70, 116, 38, -72}, mVar)));
        }
    }

    public static Object[] loadSub(Map<String, String> map) {
        String str = map.get(C0098a.a(new byte[]{-30, 106, 12}, new byte[]{-105, 24, 96, 45, 97, 28, 18, -75}));
        try {
            AbstractC0222a abstractC0222a = new AbstractC0222a() { // from class: com.github.catvod.spider.Czsapp.1
                @Override // com.github.catvod.spider.merge.q.AbstractC0224c
                protected final void a(Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.q.AbstractC0224c
                protected final /* bridge */ /* synthetic */ void b(Response response) {
                }
            };
            f.c(f.b(), str, a(), abstractC0222a);
            Response result = abstractC0222a.getResult();
            char c2 = '\f';
            if (result.code() == 404) {
                return new Object[]{200, C0098a.a(new byte[]{81, -36, -113, -49, -56, 15, 26, 59, 89, -61, -111, -116, -50, 15, 15, 42, 68, -127, -116, -41, -45, 9, 26, 34}, new byte[]{48, -84, -1, -93, -95, 108, 123, 79}), new ByteArrayInputStream(C0098a.a(new byte[]{119, 118, 10, 24, 90, -87}, new byte[]{32, 51, 72, 78, 14, -3, 113, -106}).getBytes())};
            }
            byte[] bArrBytes = result.body().bytes();
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrBytes, 0, 16);
            BufferedReader bufferedReader = new BufferedReader(new StringReader(C0220m.a(C0208a.e(Arrays.copyOfRange(bArrBytes, 16, bArrBytes.length), bArrCopyOfRange, bArrCopyOfRange, C0098a.a(new byte[]{-14, 106, -48, -75, -61, 1, 68, 85, -29, 100, -64, -55, -73, 19, 102, 30, -41, 70, -19, -3}, new byte[]{-77, 47, -125, -102, -128, 67, 7, 122}))).replaceAll(C0098a.a(new byte[]{23, -111, 115, 38, -43, -117, -112, 43, 91, -74, 37, 32, -35, -86, -50, 12, 13, -80, 57, 1, -125, -115, -103, 10, 17, -26, 75, 57, -100, -60, -41, 77, 99, -87, 108, 111, -102, -52, -10, 19, 68, -1, 106, 115, -69, -110, -47, 68, 66, -28, 57, 119}, new byte[]{63, -51, 23, 93, -25, -10, -86, 119}), C0098a.a(new byte[]{64, 5}, new byte[]{100, 52, 98, 84, 66, 63, 127, -65})).replaceAll(C0098a.a(new byte[]{113, -34, 36, 115, -107, -31, 100, -124, 61, -7, 114, 117, -119, -64, 58, -93, 106, -1, 105, 38, -115, -93, 118, -8, 116, -81, 126, 40, -114, -76, 2, -68, 34, -80, 61, 50, -5, -8, 37, -22, 36, -84, 28, 108, -36, -81, 35, -15, 119, -88}, new byte[]{89, -126, 64, 8, -89, -100, 94, -40}), C0098a.a(new byte[]{-84, 70, -16, -53, -111, -49, -116, -102, -84, 76, -18, -36}, new byte[]{-100, 118, -54, -17, -96, -21, -66, -86})).replaceAll(C0098a.a(new byte[]{-98, -117, -50, 15, 6, -50, 3, -28, -118, -117, -50, 24, 6, -50, 3, -28, -98, -117, -50, 15}, new byte[]{-94, -91, -28, 49, 58, -32, 41, -38}), C0098a.a(new byte[]{-74, -71}, new byte[]{-110, -120, 114, 62, 0, -30, 29, -3})).replaceAll(C0098a.a(new byte[]{-84, 101, 91, 125, -109, 1}, new byte[]{-118, 77, 117, 87, -70, 58, 87, 35}), "").replaceAll(C0098a.a(new byte[]{82, -102, 21, -55, -17, -29, -21, -72}, new byte[]{124, -80, 91, -122, -69, -90, -59, -110}), "")));
            ArrayList arrayList = new ArrayList();
            String line = bufferedReader.readLine();
            int i = 1;
            while (line != null) {
                byte[] bArr = new byte[48];
                bArr[0] = -116;
                bArr[1] = -91;
                bArr[2] = 24;
                bArr[3] = -47;
                bArr[4] = 40;
                bArr[5] = -103;
                bArr[6] = -53;
                bArr[7] = 32;
                bArr[8] = -85;
                bArr[9] = -13;
                bArr[10] = 30;
                bArr[11] = -39;
                bArr[c2] = 9;
                bArr[13] = -57;
                bArr[14] = -20;
                bArr[15] = 118;
                bArr[16] = -83;
                bArr[17] = -17;
                bArr[18] = 63;
                bArr[19] = -121;
                bArr[20] = 46;
                bArr[21] = -112;
                bArr[22] = -22;
                bArr[23] = 106;
                bArr[24] = -5;
                bArr[25] = -99;
                bArr[26] = 7;
                bArr[27] = -104;
                bArr[28] = 103;
                bArr[29] = -34;
                bArr[30] = -83;
                bArr[31] = 24;
                bArr[32] = -76;
                bArr[33] = -70;
                bArr[34] = 81;
                bArr[35] = -98;
                bArr[36] = 111;
                bArr[37] = -1;
                bArr[38] = -13;
                bArr[39] = 63;
                bArr[40] = -30;
                bArr[41] = -68;
                bArr[42] = 77;
                bArr[43] = -65;
                bArr[44] = 49;
                bArr[45] = -40;
                bArr[46] = -92;
                bArr[47] = 57;
                if (line.matches(C0098a.a(bArr, new byte[]{-48, -63, 99, -29, 85, -93, -105, 68})) && ((String) arrayList.get(arrayList.size() - 1)).trim().isEmpty()) {
                    arrayList.add(String.valueOf(i));
                    i++;
                }
                arrayList.add(line);
                line = bufferedReader.readLine();
                c2 = '\f';
            }
            return new Object[]{200, C0098a.a(new byte[]{21, 75, -109, -5, -100, -65, 60, 23, 29, 84, -115, -72, -102, -65, 41, 6, 0, 22, -112, -29, -121, -71, 60, 14}, new byte[]{116, 59, -29, -105, -11, -36, 93, 99}), new ByteArrayInputStream(TextUtils.join(oZP.d("7F"), arrayList).getBytes())};
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return null;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        c(arrayList, l.e(C0197c.l(d + String.format(C0098a.a(new byte[]{-94, 38, 99, 108, -117, -11, -7, 18, -94, 38, 99}, new byte[]{-115, 3, 16, 67, -5, -108, -98, 119}), str, str2), null)));
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0154. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r26) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Czsapp.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        h hVarE = l.e(C0197c.l(d, null));
        Iterator itD = C0133t.d(new byte[]{-68, 22, -57, -74, 20, -60, -125, 59, -78, 70, -122, -84, 17}, new byte[]{-110, 120, -90, -64, 120, -83, -16, 79}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            String strA = mVar.o0(C0098a.a(new byte[]{-52}, new byte[]{-83, -32, -122, -120, -48, 118, -23, -122})).a(C0098a.a(new byte[]{-100, -60, 10, 68}, new byte[]{-12, -74, 111, 34, -91, -98, -18, 97}));
            String strB = y.b(new byte[]{-123}, new byte[]{-28, 92, -62, 83, 106, -56, -53, 59}, mVar);
            if (!strB.equals(C0098a.a(new byte[]{-12, -51, 117, -9, 104, -5}, new byte[]{29, 107, -29, 30, -55, 78, 112, -13}))) {
                arrayList2.add(new C0135a(strA, strB));
            }
        }
        c(arrayList, hVarE);
        return com.github.catvod.spider.merge.c.h.t(arrayList2, arrayList);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        d = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strH;
        String strGroup;
        try {
            String strL = C0197c.l(str2, b());
            h hVarE = l.e(strL);
            Matcher matcher = a.matcher(strL);
            if (matcher.find()) {
                String strF = C0208a.f(Base64.decode(matcher.group(1), 0), matcher.group(2).getBytes(), matcher.group(3).getBytes(), C0098a.a(new byte[]{20, -61, 81, 2, 11, 91, -7, 94, 5, -51, 65, 126, 127, 73, -37, 21, 49, -17, 108, 74}, new byte[]{85, -122, 2, 45, 72, 25, -70, 113}));
                Matcher matcher2 = b.matcher(strF);
                strH = matcher2.find() ? matcher2.group(1) : "";
                Matcher matcher3 = c.matcher(strF);
                strGroup = matcher3.find() ? matcher3.group(1) : "";
            } else {
                strH = "";
                strGroup = "";
            }
            if (TextUtils.isEmpty(strH)) {
                String strA = hVarE.o0(C0098a.a(new byte[]{61, 120, -51, 64, -82, -8, 77, -33, 54, 97, -41, 15, -95, -79, 23, -102, 48, 119, -55, 15, -75, -12}, new byte[]{89, 17, -69, 110, -40, -111, 41, -70})).a(C0098a.a(new byte[]{-46, 73, 126}, new byte[]{-95, 59, 29, -61, -12, 44, 77, 114}));
                if (strA.isEmpty()) {
                    com.github.catvod.spider.merge.c.h hVarE2 = com.github.catvod.spider.merge.c.h.e();
                    hVarE2.y(str2);
                    hVarE2.l();
                    hVarE2.f(b());
                    return hVarE2.o();
                }
                HashMap map = new HashMap();
                map.put(C0098a.a(new byte[]{61, 26, 93, 120, 103, -4, 101, -88, 6, 29}, new byte[]{104, 105, 56, 10, 74, -67, 2, -51}), C0098a.a(new byte[]{-27, 44, 18, 69, 60, -4, -39, -76, -34, 43, 83, 122, 126, -57, -41, -67, -36, 62, 88, 2, 63, -115, -98, -7, -4, 54, 25, 66, 105, -122, -98, -112, -34, 59, 5, 88, 120, -39, -98, -32, -123, 100, 87, 103, 91, -25, -113, -32, -128, 127, 53, 66, 120, -47, -38, -2, -15, 15, 68, 118, 63, -113, -118, -31, -122, 110, 64, 25, 33, -115, -122, -22, -112, 40, 1, 30, 49, -4, -50, -95, -36, 58, 32, 82, 115, -10, -41, -91, -97, 106, 68, 0, 63, -114, -120, -15, -104, 20, 63, 99, 92, -15, -110, -15, -36, 54, 28, 82, 49, -6, -37, -78, -37, 48, 94, 23, 71, -40, -52, -94, -39, 48, 25, 24, 37, -109, -114, -15, -13, 55, 5, 88, 124, -40, -111, -32, -125, 105, 89, 7, 63, -118, -113, -31, -125, 113, 70, 5, 38, -99, -13, -66, -46, 54, 27, 82, 49, -18, -33, -73, -47, 45, 30, 24, 36, -114, -119, -1, -125, 105}, new byte[]{-80, 95, 119, 55, 17, -67, -66, -47}));
                map.put(C0098a.a(new byte[]{20, 126, -24, 70, 40, 120, 97, 72, 8, 96, -4, 81, 42, 105, 118, 0, 108, 92, -22, 69, 60, 121, 119, 17, 50}, new byte[]{65, 14, -113, 52, 73, 28, 4, 101}), C0098a.a(new byte[]{-18}, new byte[]{-33, 110, 80, -98, 38, 7, -34, -90}));
                map.put(C0098a.a(new byte[]{-28, 81, -97, 109, -48, -9, -78, -30, -33, 25, -72, 37, -27, -26}, new byte[]{-73, 52, -4, 64, -106, -110, -58, -127}), C0098a.a(new byte[]{18, -76, -84, 96, 25, 113}, new byte[]{123, -46, -34, 1, 116, 20, -91, -117}));
                map.put(C0098a.a(new byte[]{43, 108, -113, 17, -116, 47, -36}, new byte[]{121, 9, -23, 116, -2, 74, -82, 20}), d);
                map.put(C0098a.a(new byte[]{111, -68, -36, -104, 17, -47, 34, -73, 84, -12, -20, -36, 35, -47}, new byte[]{60, -39, -65, -75, 87, -76, 86, -44}), C0098a.a(new byte[]{45, 72, -5, -54, -50, 78, 28, -60, 58, 95}, new byte[]{78, 58, -108, -71, -67, 99, 111, -83}));
                map.put(C0098a.a(new byte[]{-33, 9, 9, 9, 79, 76, 112, -97, -28, 65, 39, 75, 109, 76}, new byte[]{-116, 108, 106, 36, 9, 41, 4, -4}), C0098a.a(new byte[]{121, -126, 58, -49, -66, -7, -75, -123}, new byte[]{23, -29, 76, -90, -39, -104, -63, -32}));
                new JSONObject(map);
                Matcher matcher4 = Pattern.compile(C0098a.a(new byte[]{-96, -3, 43, 93, -123, 105, 23, -40, -70, -24, 6, 11, -59, 44, 89, -115, -2, -64, 34, 83, -35, 51, 56, -48, -1, -89}, new byte[]{-42, -100, 89, 125, -9, 12, 100, -83}), 32).matcher(C0197c.l(strA, map));
                strH = C0208a.h(new StringBuilder(new JSONObject(matcher4.find() ? matcher4.group(1) : "").getString(C0098a.a(new byte[]{47, 36, -33, -125}, new byte[]{75, 69, -85, -30, -80, 102, 56, -20}))).reverse().toString());
            }
            JSONObject jSONObject = new JSONObject(b());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0098a.a(new byte[]{88, 65, 12, -19, -12}, new byte[]{40, 32, 126, -98, -111, 0, 57, -58}), C0098a.a(new byte[]{-77}, new byte[]{-125, -12, -125, 13, 67, 81, 66, 51}));
            jSONObject2.put(C0098a.a(new byte[]{-24, -30, -96, -36, -122, -40, -35}, new byte[]{-104, -114, -63, -91, -45, -86, -79, -59}), "");
            jSONObject2.put(C0098a.a(new byte[]{-38, -4, 95}, new byte[]{-81, -114, 51, -36, -52, 76, -10, -59}), strH);
            jSONObject2.put(C0098a.a(new byte[]{-42, -29, 18, 52, -62, 52}, new byte[]{-66, -122, 115, 80, -89, 70, -117, -121}), jSONObject.toString());
            if (!TextUtils.isEmpty(strGroup)) {
                jSONObject2.put(C0098a.a(new byte[]{-52, -69, 20, -40}, new byte[]{-65, -50, 118, -66, 63, 53, 23, 40}), C0098a.a(new byte[]{68, -107, -39, 110, -3, -95, 88, 83, 70, -37}, new byte[]{107, -29, -83, 26, -46, -44, 44, 53}));
                jSONObject2.put(C0098a.a(new byte[]{-112, 73, -50, -79}, new byte[]{-29, 60, -84, -59, -27, 5, -86, 110}), Proxy.getUrl() + C0098a.a(new byte[]{-103, 38, -61, 95, 60, -103, -23, -85, -42, 100, -39, 16, 51, -34}, new byte[]{-90, 66, -84, 98, 95, -29, -102, -37}) + URLEncoder.encode(strGroup));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            com.github.catvod.spider.merge.c.h hVarE3 = com.github.catvod.spider.merge.c.h.e();
            hVarE3.y(str2);
            hVarE3.l();
            hVarE3.f(b());
            return hVarE3.o();
        }
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        h hVarE = l.e(C0197c.l(C0133t.b(new byte[]{-20, -96, -3, 47, -35, 48, 114, 123, -87, -83, -7, 43, -53, 44, 116, 117, -95, -79, -17, 40, -51, 38, 115, 105, -95, -83, -14, 39, -101, 46, 33}, new byte[]{-61, -60, -100, 64, -92, 95, 28, 28}, sb) + str, null));
        ArrayList arrayList = new ArrayList();
        c(arrayList, hVarE);
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }
}
