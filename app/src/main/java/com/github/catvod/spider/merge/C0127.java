package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0035;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˍ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0127 extends C0016 {
    public C0127(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.C0016, com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: މ */
    public String mo122() {
        return SOY.d("593135170016");
    }

    @Override // com.github.catvod.spider.merge.C0016, com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ލ */
    void mo123(Appendable appendable, int i, C0035.C0036 c0036) throws IOException {
        appendable.append(SOY.d("46730A3530362E130A")).append(m213());
    }

    @Override // com.github.catvod.spider.merge.C0016, com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ގ */
    void mo124(Appendable appendable, int i, C0035.C0036 c0036) {
        try {
            appendable.append(SOY.d("270F6F"));
        } catch (IOException e) {
            throw new C0167(e);
        }
    }

    @Override // com.github.catvod.spider.merge.C0016
    /* JADX INFO: renamed from: ޱ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0127 mo120() {
        return (C0127) super.mo120();
    }
}
