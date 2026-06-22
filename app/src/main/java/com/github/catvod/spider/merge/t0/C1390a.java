package com.github.catvod.spider.merge.t0;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.y.C1416e;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.t0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1390a extends b {
    public C1390a(C1416e c1416e) {
        super(c1416e);
        try {
            this.f = C0899d.j(c1416e.u("shortBylineText"));
            C1416e c1416eU = c1416e.u("title");
            this.e = !(c1416eU == null) ? c1416eU.containsKey("simpleText") ? c1416eU.x("simpleText") : C0899d.j(c1416eU) : this.f;
        } catch (C1415d e) {
            PrintStream printStream = System.out;
            StringBuilder sbB = t0.b("JSON Parsing Error: ");
            sbB.append(e.getMessage());
            printStream.println(sbB.toString());
        }
    }
}
