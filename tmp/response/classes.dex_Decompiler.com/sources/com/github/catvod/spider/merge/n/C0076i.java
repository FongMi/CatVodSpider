package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0076i extends N {
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ C0076i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        switch (this.a) {
            case 0:
                return mVar2.n((String) this.b);
            case 1:
                return mVar2.a0((String) this.b);
            default:
                return ((Pattern) this.b).matcher(mVar2.j0()).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(oZP.d("2E4A041C"), (String) this.b);
            case 1:
                return String.format(oZP.d("5B4A04"), (String) this.b);
            default:
                return String.format(oZP.d("4F0216350F3D101C3836027D501C5E"), (Pattern) this.b);
        }
    }
}
