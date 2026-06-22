package com.github.catvod.spider.merge.H0;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g {
    private final File a;
    private final List<r> b;

    public g() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        this.a = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.b = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.H0.r>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.H0.r>] */
    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((r) it.next()).a();
            } catch (Exception e) {
                t.k.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        this.b.clear();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final r b() {
        f fVar = new f(this.a);
        this.b.add(fVar);
        return fVar;
    }
}
