package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.n.C0197c;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0120f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0120f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.b((x) this.b);
                break;
            case 1:
                ((C0104F) this.b).s();
                break;
            case 2:
                C0110L c0110l = (C0110L) this.b;
                int i = C0110L.k;
                c0110l.getClass();
                try {
                    String strOptString = new JSONObject(C0197c.l(C0098a.a(new byte[]{109, 16, 89, -113, -119, -99, 23, 6, 112, 11, 93, -47, -117, -46, 89, 91, 110, 74, 78, -111, -43, -60, 89, 90, 42, 5, 71, -98, -126, -120, 95, 76, 113, 48, 66, -108, -97, -55, 126, 70, 119, 53, 95, -100, -107, -61, 93, 101, 106, 3, 68, -111, -59, -60, 84, 64, 96, 10, 89, -96, -109, -61, 5, 28, 54, 86, 11, -119, -57, -106, 22, 27}, new byte[]{5, 100, 45, -1, -6, -89, 56, 41}), null)).optJSONObject(C0098a.a(new byte[]{-91, -85, -69, 118}, new byte[]{-63, -54, -49, 23, 98, 49, -49, 31})).optJSONObject(C0098a.a(new byte[]{-69, -69, -37, -21, 120, -98, 80}, new byte[]{-42, -34, -74, -119, 29, -20, 35, -53})).optString(C0098a.a(new byte[]{89, 113, 75, -114, 56}, new byte[]{45, 30, 32, -21, 86, -70, -17, -17}));
                    String str = C0098a.a(new byte[]{41, -17, -121, 41, 74, 53, 16, 98, 50, -18, -35, 40, 76, 110, 77, 38, 111, -8, -99, 118, 13, 80, 90, 0, 9, -39, -71, 102, 77, 96, 84, 40, 47, -90}, new byte[]{65, -101, -13, 89, 57, 15, 63, 77}) + strOptString + C0098a.a(new byte[]{126, -114, -14, 33, -22, -109, -103, -104, 49, -119, -93, 125, -68, -49, -53, -76, 43, -113, -93, 63, -22, -97, -127, -88, 63, -124, -16, 110, -6, -98, -78, -73, 57, -97, -1, 37, -48, -114, -103, -75, 101, -53, -21, 43, -48, -97, -124, -67, 7, -98, -22, 58, -78, -82, -56, -12, 25, -114, -21, 59, -5, -110, -128, -30, 111, -82, -47, 24, -37, -40, -34, -122, 11, -84, -52, 13, -50, -40, -39, -9, 104, -56, -87, 11, -64, -83, -71, -30, 107, -84, -41, 5, -62, -72, -65, -108, 17, -69, -37, 109, -69, -51, -36, -30, 111, -82, -47, 24, -37, -40, -34, -122, 26, -84, -35, 3, -48, -65, -71, -119, 7, -66, -54, 17, -61, -72, -56, -13, 104, -35}, new byte[]{88, -19, -98, 72, -113, -3, -19, -57});
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C0098a.a(new byte[]{74, 59, -112}, new byte[]{63, 73, -4, 74, -13, 6, 75, 72}), str);
                    jSONObject.put(C0098a.a(new byte[]{-49, -92, 59, 2, 92}, new byte[]{-69, -53, 80, 103, 50, -2, -41, -57}), strOptString);
                    Init.run(new RunnableC0124j(c0110l, jSONObject, 1));
                } catch (Exception unused) {
                    return;
                }
                break;
            case 3:
                ((U) this.b).s();
                break;
            default:
                JSDemo.a((JSDemo) this.b);
                break;
        }
    }
}
