package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0726i extends N {
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ C0726i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
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
                return String.format(ZrJ.d("22663810"), (String) this.b);
            case 1:
                return String.format(ZrJ.d("576638"), (String) this.b);
            default:
                return String.format(ZrJ.d("432E2A392B2D1C30043A266D5C3062"), (Pattern) this.b);
        }
    }
}
