package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.C.C0595a;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.m1.AbstractC1313e;
import com.github.catvod.spider.merge.m1.C1311c;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i extends AbstractC1313e {
    private final int g;
    private String h;
    private String i;
    private long j;
    private long k;
    private String l;
    private boolean m;

    public i(int i, String str, String str2, int i2) {
        super(1, i, str, str2);
        this.j = -1L;
        this.k = -1L;
        this.l = null;
        Collections.emptyList();
        this.m = false;
        this.g = i2;
    }

    public final void g(long j) {
        this.k = j;
    }

    public final void h(String str) {
        this.i = str;
    }

    public final void i(String str) {
        this.h = str;
    }

    public final void j(String str) {
        this.l = str;
    }

    public final void k(boolean z) {
        this.m = z;
    }

    public final void l(long j) {
        this.j = j;
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1313e
    public final String toString() {
        int i = this.g;
        String str = this.h;
        String str2 = this.i;
        long j = this.j;
        long j2 = this.k;
        String str3 = this.l;
        int iA = a();
        int iC = c();
        String strE = e();
        String strB = b();
        List<C1311c> listD = d();
        boolean z = this.m;
        StringBuilder sbB = t0.b("StreamInfoItem{streamType=");
        sbB.append(C0595a.c(i));
        sbB.append(", uploaderName='");
        sbB.append(str);
        sbB.append("', textualUploadDate='");
        sbB.append(str2);
        sbB.append("', viewCount=");
        sbB.append(j);
        sbB.append(", duration=");
        sbB.append(j2);
        sbB.append(", uploaderUrl='");
        sbB.append(str3);
        sbB.append("', infoType=");
        sbB.append(C0595a.d(iA));
        sbB.append(", serviceId=");
        sbB.append(iC);
        sbB.append(", url='");
        sbB.append(strE);
        sbB.append("', name='");
        sbB.append(strB);
        sbB.append("', thumbnails='");
        sbB.append(listD);
        sbB.append("', uploaderVerified='");
        sbB.append(z);
        sbB.append("'}");
        return sbB.toString();
    }
}
