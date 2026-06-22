package com.github.catvod.spider.merge.bY;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.JSDemo;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bY.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0912f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0912f(Object obj, int i) {
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
                ((F) this.b).s();
                break;
            case 2:
                L l = (L) this.b;
                int i = L.k;
                l.getClass();
                try {
                    String strOptString = new JSONObject(com.github.catvod.spider.merge.nU.c.l(com.github.catvod.spider.merge.XI.f.a(new byte[]{61, 3, 93, 4, 19, -17, 6, 100, 32, 24, 89, 90, 17, -96, 72, 57, 62, 89, 74, 26, 79, -74, 72, 56, 122, 22, 67, 21, 24, -6, 78, 46, 33, 35, 70, 31, 5, -69, 111, 36, 39, 38, 91, 23, 15, -79, 76, 7, 58, 16, 64, 26, 95, -74, 69, 34, 48, 25, 93, 43, 9, -79, 20, 126, 102, 69, 15, 2, 93, -28, 7, 121}, new byte[]{85, 119, 41, 116, 96, -43, 41, 75}), null)).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{77, 118, -118, 22}, new byte[]{41, 23, -2, 119, 110, -60, 80, -39})).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{-95, -55, 90, -21, 15, -75, 96}, new byte[]{-52, -84, 55, -119, 106, -57, 19, 35})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-56, 98, 16, 100, -88}, new byte[]{-68, 13, 123, 1, -58, 78, -56, 10}));
                    String str = com.github.catvod.spider.merge.XI.f.a(new byte[]{49, -50, 123, 68, -70, 100, 115, 42, 42, -49, 33, 69, -68, 63, 46, 110, 119, -39, 97, 27, -3, 1, 57, 72, 17, -8, 69, 11, -67, 49, 55, 96, 55, -121}, new byte[]{89, -70, 15, 52, -55, 94, 92, 5}) + strOptString + com.github.catvod.spider.merge.XI.f.a(new byte[]{29, 30, 36, 52, 53, -3, 86, 92, 82, 25, 117, 104, 99, -95, 4, 112, 72, 31, 117, 42, 53, -15, 78, 108, 92, 20, 38, 123, 37, -16, 125, 115, 90, 15, 41, 48, 15, -32, 86, 113, 6, 91, 61, 62, 15, -15, 75, 121, 100, 14, 60, 47, 109, -64, 7, 48, 122, 30, 61, 46, 36, -4, 79, 38, 12, 62, 7, 13, 4, -74, 17, 66, 104, 60, 26, 24, 17, -74, 22, 51, 11, 88, 127, 30, 31, -61, 118, 38, 8, 60, 1, 16, 29, -42, 112, 80, 114, 43, 13, 120, 100, -93, 19, 38, 12, 62, 7, 13, 4, -74, 17, 66, 121, 60, 11, 22, 15, -47, 118, 77, 100, 46, 28, 4, 28, -42, 7, 55, 11, 77}, new byte[]{59, 125, 72, 93, 80, -109, 34, 3});
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{38, -119, 85}, new byte[]{83, -5, 57, -7, -50, -80, -122, -60}), str);
                    jSONObject.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-23, -58, 22, -6, -88}, new byte[]{-99, -87, 125, -97, -58, 3, 40, -95}), strOptString);
                    Init.run(new RunnableC0916j(l, jSONObject, 1));
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
