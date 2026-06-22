package com.github.catvod.spider.merge.p;

import android.net.Uri;
import com.github.catvod.spider.merge.a.C0098a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0214g {
    private static final Pattern a;
    public static final String b;

    static {
        C0098a.a(new byte[]{-18, 24, -33, -74, 87, 88, -5, 26, -106, 89, -107, -1, 19, 99, -13, 91, -57, 24, -46, -84, 27, 122, -50, 21, -110, 71, -117, -17, 0, 20, -51, 92, -51, 65, -111, -28, 27, 76, -84, 1, -118, 87, -28, -81, 75, 88, -1, 98, -58, 21, -18, -74, 79, 27, -81, 6, -108, 89, -106, -23, 27, 28, -47, 125, -9, 58, -23, -13, 27, 88, -13, 94, -58, 87, -30, -70, 88, 95, -11, 28, -125, 52, -51, -83, 84, 89, -1, 26, -102, 67, -117, -17, 21, 0, -84, 5, -107, 89, -112, -21, 27, 103, -5, 83, -62, 5, -52, -16, 14, 7, -83, 27, -112, 65}, new byte[]{-93, 119, -91, -33, 59, 52, -102, 53});
        b = C0098a.a(new byte[]{63, -84, 86, -50, -34, 9, -41, 50, 71, -19, 28, -121, -102, 41, -33, 115, 7, -69, 23, -121, -13, 11, -46, 111, 29, -86, 72, -121, -125, 85, -115, 61, 33, -114, 1, -32, -117, 82, -125, 91, 91, -29, 109, -41, -62, 9, -45, 74, 23, -95, 103, -50, -58, 74, -125, 46, 69, -19, 31, -111, -110, 77, -3, 85, 38, -114, 96, -117, -110, 9, -33, 118, 23, -29, 107, -62, -47, 14, -39, 52, 82, -128, 68, -43, -35, 8, -45, 50, 75, -14, 2, -105, -100, 81, -126, 42, 64, -19, 29, -107, -126, 69, -5, 114, 16, -86, 64, -62, -110, 54, -41, 123, 19, -79, 69, -120, -121, 86, -127, 51, 65, -11}, new byte[]{114, -61, 44, -89, -78, 101, -74, 29});
        a = Pattern.compile(C0098a.a(new byte[]{49, 118, -46, -52, -82, 64, -4, 110, 49, 118, -46, -52, -81, 70, -22, 52, 107, 52, -118, -63, -71, 52, -19, 103, 52, 49, -45, -124, -6, 5, -77, 123, 112, 94, -103, -110, -84, 20, -85, 59, 45, 114, -114, -108, -71, 73, -85, 59, 45, 114, -113, -110, -81, 19, -15, 121, 117, 127, -6, -110, -82, 5, -16, 58, 97, 126, -53, -52, -78, 65, -65, 39, 45, 118, -42, -108, -82, 87, -30, 39, 45, 118, -42, -107, -88, 65, -72, 125, 111, 46, -37, -125, -87, 5, -16, 58, 97, 94, -103, -52, -14, 85, -82, 124, 44, 58, -120, -106, -6, 0, -73, 59, 41, 42, -114, -125, -89, 0, -73, 59, 41, 43, -120, -107, -84, 87, -89, 42, 63, 99, -45, -48, -14, 52, -19, 38, 33, 107, -63, -55, -25, 52, -19, 44, 54, 111, -119, -110, -84, 20, -85, 59, 45, 114, -114, -108, -71, 73, -85, 59, 45, 114, -113, -110, -81, 66, -4, 44, 61, 108, -117, -56, -23, 27, -104, 17, 5, 61, -5, -106, -6, 0, -73, 59, 41, 42, -114, -125, -89, 0, -73, 59, 41, 43, -120, -107, -84, 87, -20, 32, 59, 104, -119, -56, -23, 27, -104, 17, 5, 61, -5, -106, -6, 0, -73, 59, 41, 44, -116, -125, -87, 24, -81, 46, 32, 103, -44, -109, -21, 91, -74, 119, 41, 110, -57, -59, -38, 70, -77, 39, 41, 94, -103, -55, -12, 4, -2, 97, 115, 126, -50, -56, -14, 24, -19, 101, 102, 45, -42, -48, -25, 17, -90, 61, 118, 44, -116, -125, -35, 24, -109, 18, 53, 99, -33, -32, -88, 24, -85, 63, 5, 61, -45, -50, -22, 85, -19, 101, 37, 106, -46, -56, -10, 70, -23, 112, 118, 114, -54, -35, -1, 4, -86, 60, 45, 45, -53, -113, -13, 80, -20, 19, 102, 116, -49, -40, -69, 70, -23, 51, 49, 118, -46, -52, -88, 66, -4, 19, 119, 114, -50, -52, -38, 87, -73, 54, 41, 103, -101, -47, -75, 29, -5, 105, 119, 40, -38, -44, -14, 28, -77, 97, 115, 61, -119, -40, -23, 31, -83, 35, 54, 99, -62, -110, -25, 27, -77, 55, 5, 61, -120, -106, -6, 0, -73, 59, 41, 44, -116, -125, -87, 9, -77, 38, 118, 119, -42, -29, -25, 24, -86, 97, 41, 106, -42, -32, -71, 70, -23, 51, 49, 118, -46, -52, -11, 70, -23, 112, 5, 44, -112, -118, -1, 3, -97, 97, 58, 108, -120, -106, -6, 0, -73, 59, 41, 42, -114, -125, -89, 0, -73, 59, 41, 43, -120, -107, -84, 87, -83, 42, 45, 103, -57, -49, -29, 52, -19, 44, 54, 111, -119, -38, -17, 4, -90, 96, 119, 40}, new byte[]{89, 2, -90, -68, -122, 104, -61, 79}));
        Charset charset = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.ISO_8859_1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0110, code lost:
    
        r0 = r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p.C0214g.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean b(String str) {
        try {
            String host = Uri.parse(str).getHost();
            String[] strArr = {C0098a.a(new byte[]{82, -119, 87, 47, 78, 84, 64, -52, 86}, new byte[]{59, -8, 62, 86, 39, 122, 35, -93}), C0098a.a(new byte[]{67, -10, 61, 18, 61, 102, 99, -94}, new byte[]{53, -40, 76, 99, 19, 5, 12, -49}), C0098a.a(new byte[]{38, 18, 52, -82, -11, -24, 67, -90, 50}, new byte[]{95, 125, 65, -59, -128, -58, 32, -55}), C0098a.a(new byte[]{-91, 127, 73, -71, 117, 2}, new byte[]{-55, 26, 103, -38, 26, 111, 126, 30}), C0098a.a(new byte[]{65, 114, -83, -45, 103, -36, 79, 85, 88}, new byte[]{53, 7, -55, -68, 18, -14, 44, 58}), C0098a.a(new byte[]{-46, -84, -64, 0, -114, -122, 4, -122}, new byte[]{-65, -53, -76, 118, -96, -27, 107, -21}), C0098a.a(new byte[]{47, -11, 7, 26, -22, -121, 27, 24}, new byte[]{92, -102, 111, 111, -60, -28, 116, 117}), C0098a.a(new byte[]{-58, -50, -29, -111, -77, 63, 79, -93}, new byte[]{-89, -83, -123, -28, -35, 17, 44, -51}), C0098a.a(new byte[]{-47, 55, -121, -117, -47, 46, 37, 40, -99, 61, -124, -113}, new byte[]{-77, 94, -21, -30, -77, 71, 73, 65}), C0098a.a(new byte[]{-35, -61, 83, 60, -3, -87, 58, -120, -36, -51, 81}, new byte[]{-65, -94, 60, 90, -104, -57, 93, -90}), C0098a.a(new byte[]{61, -48, -83, 121, -67, -120, -53, 100}, new byte[]{77, -96, -39, 15, -109, -21, -92, 9})};
            for (int i = 0; i < 11; i++) {
                if (host.contains(strArr[i]) && (!C0098a.a(new byte[]{-96, 18, 94, 16, 8, -77, 66, -11, -92}, new byte[]{-55, 99, 55, 105, 97, -99, 33, -102}).equals(strArr[i]) || str.contains(C0098a.a(new byte[]{-79, 66, -8, -83, 85, 50, -1, -35, -75, 28, -16, -117}, new byte[]{-40, 51, -111, -44, 60, 28, -100, -78})) || str.contains(C0098a.a(new byte[]{58, 95, 1, -45, 109, -46, 23, -62, 62, 1, 31, -11}, new byte[]{83, 46, 104, -86, 4, -4, 116, -83})) || str.contains(C0098a.a(new byte[]{38, 105, -104, 0, 85, 4, -112, -12, 34, 55, -121, 38}, new byte[]{79, 24, -15, 121, 60, 42, -13, -101})))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
    
        if ((com.github.catvod.spider.merge.p.C0214g.a.matcher(r1).find() && !(r1.contains(com.github.catvod.spider.merge.a.C0098a.a(new byte[]{121, -41, 90, -17, -125, -52, 92}, new byte[]{26, -77, 52, -62, -9, -93, 47, 53})) && r1.contains(com.github.catvod.spider.merge.a.C0098a.a(new byte[]{-106, 82, 43}, new byte[]{-72, 56, 88, 103, -49, -57, -53, -102})))) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject c(java.lang.String r12, java.lang.String r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p.C0214g.c(java.lang.String, java.lang.String):org.json.JSONObject");
    }
}
