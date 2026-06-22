package com.github.catvod.spider.merge;

import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʰ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0101 extends AbstractC0108 {

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final AbstractC0108[] f269;

    public C0101(AbstractC0108... abstractC0108Arr) {
        this.f269 = (AbstractC0108[]) C0166.m585(abstractC0108Arr);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0108
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public int mo363(CharSequence charSequence, int i, Writer writer) {
        for (AbstractC0108 abstractC0108 : this.f269) {
            int iMo363 = abstractC0108.mo363(charSequence, i, writer);
            if (iMo363 != 0) {
                return iMo363;
            }
        }
        return 0;
    }
}
