package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.d.C0146e;
import com.github.catvod.spider.merge.n.C0197c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class RunnableC0131q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ RunnableC0131q(x xVar, int i) {
        this.a = i;
        this.b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x.b(this.b);
                break;
            default:
                x xVar = this.b;
                xVar.getClass();
                String strL = C0197c.l(C0098a.a(new byte[]{-6, -44, -51, -26, 107, 126, 69, 43, -30, -63, -54, -27, 104, 43, 24, 112, -68, -63, -43, -1, 97, 49, 4, 96, -32, -55, -49, -13, 54, 39, 5, 105, -67, -50, -36, -31, 116, 43, 13, 109, -4, -113, -56, -28, 123, 43, 14, 97, -67, -57, -36, -8, 125, 54, 11, 112, -9, -114, -35, -7, 39, 37, 26, 116, -36, -63, -44, -13, 37, 37, 6, 109, -21, -43, -41, -55, 124, 54, 3, 114, -9, -122, -33, -28, 119, 41, 57, 109, -26, -59, -124, -93, 42, 98, 11, 116, -30, -18, -40, -5, 125, 121, 11, 104, -5, -39, -52, -8, 71, 32, 24, 109, -28, -59, -97, -9, 104, 52, 47, 106, -26, -46, -40, -8, 123, 33, 87, 115, -9, -62, -97, -1, 107, 9, 5, 102, -5, -52, -36, -85, 126, 37, 6, 119, -9, -122, -43, -9, 118, 35, 87, 126, -6, -1, -6, -40, 62, 54, 15, 112, -25, -46, -41, -61, 106, 40, 87, 34, -16, -55, -61, -58, 121, 54, 11, 105, -31, -99, -97, -55, 122, 60, 71, 114, -81, -110, -105, -92, 54, 119}, new byte[]{-110, -96, -71, -106, 24, 68, 106, 4}), null);
                Init.run(new RunnableC0126l(xVar, strL, C0146e.g(strL).b().c(), 0));
                break;
        }
    }
}
