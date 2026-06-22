package com.github.catvod.spider;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0099A;
import com.github.catvod.spider.merge.b.C0104F;
import com.github.catvod.spider.merge.b.C0110L;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.U;
import com.github.catvod.spider.merge.b.x;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.i;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0207D;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Push extends WangPan {
    @Override // com.github.catvod.spider.WangPan
    public String detailContent(List<String> list) {
        SpiderDebug.log(C0098a.a(new byte[]{-70, 45, 25, -35, -114, 99, -20, 47, -80, 60, 8, -46, -109, 47, -58, 36, -83, 114, 77}, new byte[]{-34, 72, 109, -68, -25, 15, -81, 64}) + list.get(0));
        String strTrim = list.get(0).trim();
        if (WangPan.a.matcher(strTrim).find() || WangPan.b.matcher(strTrim).find() || WangPan.c.matcher(strTrim).find() || WangPan.d.matcher(strTrim).find() || WangPan.e.matcher(strTrim).find()) {
            return super.detailContent(Collections.singletonList(strTrim));
        }
        k kVar = new k();
        kVar.g(strTrim);
        kVar.b(C0098a.a(new byte[]{-107, -51, 70, -20, -121, -10}, new byte[]{-45, -94, 40, -117, -54, -97, -74, 0}));
        kVar.h(strTrim.startsWith(C0098a.a(new byte[]{-78, -97, 97, -117, -77, 85, 72}, new byte[]{-44, -10, 13, -18, -119, 122, 103, 22})) ? new File(strTrim).getName() : strTrim);
        if (strTrim.startsWith(C0098a.a(new byte[]{-84, -20, 108, 57}, new byte[]{-60, -104, 24, 73, 115, 114, -84, 106})) && strTrim.contains(C0098a.a(new byte[]{93}, new byte[]{126, 57, -86, -51, 49, -123, -109, -28}))) {
            strTrim = strTrim.replace(C0098a.a(new byte[]{103}, new byte[]{68, 64, -44, -32, -122, 88, -111, -15}), C0098a.a(new byte[]{82, -65, 30}, new byte[]{120, -107, 52, -111, 58, -113, -57, -73}));
        }
        kVar.i(C0098a.a(new byte[]{-97, -30, 51, -38, 118, -109, -88, -22, -121, -1, 36, -124, 119, -60, -27, -21, -107, -14, 52, -34, 100, -35, -18, -90, -39, -11, 40, -57, 42, -53, -19, -83, -40, -89, 35, -102, 103, -103, -75, -95, -57, -16, 114, -99, 99, -103, -26, -15, -59, -92, 119, -101, 99, -112, -75, -90, -106, -12, 38, -97, 52, -103, -80, -96, -109, -72, 45, -38, 96, -50}, new byte[]{-9, -106, 71, -86, 5, -87, -121, -59}));
        kVar.j(TextUtils.join(C0098a.a(new byte[]{-9, -119, -121}, new byte[]{-45, -83, -93, -118, 101, -53, -58, -75}), Arrays.asList(C0098a.a(new byte[]{35, 19, -33, -77, -33, 9}, new byte[]{-60, -120, 107, 91, 96, -105, 124, 33}), C0098a.a(new byte[]{69, -69, 0, 69, -71, 91}, new byte[]{-96, 44, -123, -93, 55, -7, -3, -42}), C0098a.a(new byte[]{87, -91, 28, -62, 113, -112}, new byte[]{-65, 2, -65, 36, -17, 0, 55, -97}))));
        kVar.k(TextUtils.join(C0098a.a(new byte[]{54, -9, -51}, new byte[]{18, -45, -23, -128, 80, -107, -88, 57}), Arrays.asList(C0134u.b(new byte[]{80, -14, -55, -45, -2, -72, -34}, new byte[]{-74, 96, 100, 53, 106, 6, -6, -1}, new StringBuilder(), strTrim), C0134u.b(new byte[]{-106, 4, 66, -77, 28, 119, 111}, new byte[]{112, -106, -17, 85, -120, -55, 75, -40}, new StringBuilder(), strTrim), C0134u.b(new byte[]{67, -46, 69, -98, -12, -124, -62}, new byte[]{-91, 64, -24, 120, 96, 58, -26, 65}, new StringBuilder(), strTrim))));
        return h.p(kVar);
    }

    @Override // com.github.catvod.spider.WangPan
    public String playerContent(String str, String str2, List<String> list) {
        String strReplace = str2;
        SpiderDebug.log(C0098a.a(new byte[]{63, 71, -79, 36, -42, -86, -83, 46, 33, 95, -75, 51, -57, -8, -120, 45, 46, 76, -22, 125}, new byte[]{79, 43, -48, 93, -77, -40, -18, 65}) + str);
        SpiderDebug.log(C0098a.a(new byte[]{-86, -28, -113, -70, -96, -113, 67, 40, -76, -4, -117, -83, -79, -35, 105, 35, -32, -88}, new byte[]{-38, -120, -18, -61, -59, -3, 0, 71}) + strReplace);
        if (strReplace.startsWith(C0098a.a(new byte[]{60, -114, -3, -23}, new byte[]{84, -6, -119, -103, 13, -42, -30, 62})) && strReplace.contains(C0098a.a(new byte[]{34, -120, -105}, new byte[]{8, -94, -67, 58, -19, -27, 75, -57}))) {
            strReplace = strReplace.replace(C0098a.a(new byte[]{2, -71, -23}, new byte[]{40, -109, -61, 120, -47, 108, -72, 49}), C0098a.a(new byte[]{90}, new byte[]{121, -103, -62, 120, 114, -105, -118, -35}));
        }
        if (!str.equals(C0098a.a(new byte[]{-123, -116, -34, 55, -126, -32}, new byte[]{98, 23, 106, -33, 61, 126, 18, 127}))) {
            if (str.equals(C0098a.a(new byte[]{-2, 95, -42, -128, 34, -93}, new byte[]{22, -8, 117, 102, -68, 51, 115, -60}))) {
                h hVar = new h();
                hVar.l();
                hVar.g();
                hVar.y(strReplace);
                return hVar.toString();
            }
            if (!str.equals(C0098a.a(new byte[]{46, -44, 118, -85, -67, -59}, new byte[]{-53, 67, -13, 77, 51, 103, 20, -27}))) {
                return str.contains(C0098a.a(new byte[]{-106, 45, -32, -71, 124, -17}, new byte[]{115, -119, 88, 92, -7, 100, 115, 26})) ? C0110L.p().F(strReplace.split(C0098a.a(new byte[]{93, -120}, new byte[]{1, -93, 27, 1, -32, -25, 69, -67})), str) : str.contains(C0098a.a(new byte[]{25, -121}, new byte[]{76, -60, 19, 27, -70, 13, -86, 50})) ? U.t().K(strReplace.split(C0098a.a(new byte[]{61, -71}, new byte[]{97, -110, 83, -75, 64, -112, 19, -80})), str) : str.contains(C0098a.a(new byte[]{86, -19, -118}, new byte[]{103, -33, -71, 37, 80, 19, 32, -126})) ? C0104F.j().r(strReplace.split(C0098a.a(new byte[]{-39, -117}, new byte[]{-123, -96, -107, -108, -8, 14, -46, -56}))) : str.contains(C0098a.a(new byte[]{-9, -110, -110, 116}, new byte[]{-75, 119, 40, -46, 116, -52, 11, 16})) ? C0099A.e().q(strReplace.split(C0098a.a(new byte[]{-90, -76}, new byte[]{-6, -97, -84, -100, 94, -102, -119, 81}))) : x.p().E(strReplace.split(C0098a.a(new byte[]{-74, 4}, new byte[]{-22, 47, 34, -33, 21, 34, 23, 30})), str);
            }
            h hVar2 = new h();
            hVar2.l();
            hVar2.y(strReplace);
            return hVar2.toString();
        }
        h hVar3 = new h();
        hVar3.y(strReplace);
        ArrayList arrayList = new ArrayList();
        if (strReplace.startsWith(C0098a.a(new byte[]{120, -117, -9, 126, 118, -107, 69}, new byte[]{30, -30, -101, 27, 76, -70, 106, 12}))) {
            File file = new File(strReplace.replace(C0098a.a(new byte[]{-41, 108, -97, 42, -20, -30, 14}, new byte[]{-79, 5, -13, 79, -42, -51, 33, 10}), ""));
            if (file.getParentFile() != null) {
                for (File file2 : file.getParentFile().listFiles()) {
                    String strF = C0207D.f(file2.getName());
                    if (C0207D.n(strF)) {
                        i iVar = new i();
                        iVar.c(C0207D.r(file2.getName()));
                        i iVarA = iVar.a(strF);
                        iVarA.d(C0098a.a(new byte[]{-38, -27, -16, -98, -110, 24, 69}, new byte[]{-68, -116, -100, -5, -88, 55, 106, 50}) + file2.getAbsolutePath());
                        arrayList.add(iVarA);
                    }
                }
            }
        }
        if (strReplace.startsWith(C0098a.a(new byte[]{101, 101, -101, 62, 122, 74, -50}, new byte[]{13, 17, -17, 78, 64, 101, -31, -86}))) {
            List listAsList = Arrays.asList(C0098a.a(new byte[]{-89, 122, -73}, new byte[]{-54, 10, -125, 62, -78, -57, -3, 69}), C0098a.a(new byte[]{52, 94, -47}, new byte[]{89, 53, -89, -102, -21, 126, 69, -109}));
            List<String> listAsList2 = Arrays.asList(C0098a.a(new byte[]{1, -107, -22}, new byte[]{114, -25, -98, -123, -71, -14, 118, -18}), C0098a.a(new byte[]{90, 19, 59}, new byte[]{59, 96, 72, 57, 26, 9, -127, 13}));
            if (listAsList.contains(C0207D.f(strReplace))) {
                for (String str3 : listAsList2) {
                    String strConcat = C0207D.r(strReplace).concat(C0098a.a(new byte[]{-65}, new byte[]{-111, 2, -44, 88, 126, -13, 44, 67})).concat(str3);
                    if (C0197c.l(strConcat, null).length() >= 100) {
                        String lastPathSegment = Uri.parse(strConcat).getLastPathSegment();
                        i iVar2 = new i();
                        iVar2.c(lastPathSegment);
                        i iVarA2 = iVar2.a(str3);
                        iVarA2.d(strConcat);
                        arrayList.add(iVarA2);
                    }
                }
            }
        }
        hVar3.x(arrayList);
        return hVar3.toString();
    }
}
