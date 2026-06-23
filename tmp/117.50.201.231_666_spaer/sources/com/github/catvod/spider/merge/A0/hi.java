package com.github.catvod.spider.merge.A0;

import com.google.protobuf.DescriptorProtos;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class hi implements Serializable {
    public static final u[] a = new u[0];
    public static final ConcurrentHashMap b = new ConcurrentHashMap(7);
    public final String c;
    public final TimeZone d;
    public final Locale e;
    public final transient u[] f;
    public final transient int g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.github.catvod.spider.merge.A0.xk] */
    /* JADX WARN: Type inference failed for: r15v11, types: [com.github.catvod.spider.merge.A0.xk] */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.github.catvod.spider.merge.A0.lf] */
    /* JADX WARN: Type inference failed for: r15v14, types: [com.github.catvod.spider.merge.A0.ep] */
    /* JADX WARN: Type inference failed for: r15v15, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v16, types: [com.github.catvod.spider.merge.A0.ky] */
    /* JADX WARN: Type inference failed for: r15v17, types: [com.github.catvod.spider.merge.A0.ky] */
    /* JADX WARN: Type inference failed for: r15v18, types: [com.github.catvod.spider.merge.A0.it] */
    /* JADX WARN: Type inference failed for: r15v19, types: [com.github.catvod.spider.merge.A0.it] */
    /* JADX WARN: Type inference failed for: r15v20, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v21, types: [com.github.catvod.spider.merge.A0.it] */
    /* JADX WARN: Type inference failed for: r15v22, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v23, types: [com.github.catvod.spider.merge.A0.j] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v26, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v27, types: [com.github.catvod.spider.merge.A0.j] */
    /* JADX WARN: Type inference failed for: r15v28, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v29, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v30, types: [com.github.catvod.spider.merge.A0.it] */
    /* JADX WARN: Type inference failed for: r15v31, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v32, types: [com.github.catvod.spider.merge.A0.it] */
    /* JADX WARN: Type inference failed for: r15v33, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v34, types: [com.github.catvod.spider.merge.A0.h] */
    /* JADX WARN: Type inference failed for: r15v35, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v36, types: [com.github.catvod.spider.merge.A0.h] */
    /* JADX WARN: Type inference failed for: r15v37, types: [com.github.catvod.spider.merge.A0.h] */
    /* JADX WARN: Type inference failed for: r15v38, types: [com.github.catvod.spider.merge.A0.es] */
    /* JADX WARN: Type inference failed for: r15v39, types: [com.github.catvod.spider.merge.A0.es] */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.github.catvod.spider.merge.A0.br] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public hi(java.lang.String r20, java.util.TimeZone r21, java.util.Locale r22) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.hi.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    public static void h(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static void i(StringBuilder sb, int i, int i2) {
        if (i < 10000) {
            int i3 = i < 1000 ? i < 100 ? i < 10 ? 1 : 2 : 3 : 4;
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                sb.append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        sb.append((char) ((i / DescriptorProtos.Edition.EDITION_2023_VALUE) + 48));
                        i %= DescriptorProtos.Edition.EDITION_2023_VALUE;
                    }
                    if (i >= 100) {
                        sb.append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        sb.append('0');
                    }
                }
                if (i >= 10) {
                    sb.append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    sb.append('0');
                }
            }
            sb.append((char) (i + 48));
            return;
        }
        char[] cArr = new char[10];
        int i5 = 0;
        while (i != 0) {
            cArr[i5] = (char) ((i % 10) + 48);
            i /= 10;
            i5++;
        }
        while (i5 < i2) {
            sb.append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            } else {
                sb.append(cArr[i5]);
            }
        }
    }

    public static String j(TimeZone timeZone, boolean z, int i, Locale locale) {
        g gVar = new g(timeZone, z, i, locale);
        ConcurrentHashMap concurrentHashMap = b;
        String str = (String) concurrentHashMap.get(gVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String str2 = (String) concurrentHashMap.putIfAbsent(gVar, displayName);
        return str2 != null ? str2 : displayName;
    }

    public static br k(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? new fp(i, i2) : new gc(i, 0) : new gc(i, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj;
        return this.c.equals(hiVar.c) && this.d.equals(hiVar.d) && this.e.equals(hiVar.e);
    }

    public final int hashCode() {
        return (((this.e.hashCode() * 13) + this.d.hashCode()) * 13) + this.c.hashCode();
    }

    public final String toString() {
        return "FastDatePrinter[" + this.c + "," + this.e + "," + this.d.getID() + "]";
    }
}
