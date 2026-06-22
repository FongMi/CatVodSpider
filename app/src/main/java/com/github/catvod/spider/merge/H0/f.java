package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.I.t0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f implements r {
    private final File a;
    private final FileOutputStream b;

    public f(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.a = fileCreateTempFile;
        this.b = new FileOutputStream(fileCreateTempFile);
    }

    @Override // com.github.catvod.spider.merge.H0.r
    public final void a() throws Exception {
        t.o(this.b);
        if (this.a.delete()) {
            return;
        }
        StringBuilder sbB = t0.b("could not delete temporary file: ");
        sbB.append(this.a.getAbsolutePath());
        throw new Exception(sbB.toString());
    }

    public final String b() {
        return this.a.getAbsolutePath();
    }
}
