package com.github.catvod.spider.merge.A0;

import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class de {
    public static final /* synthetic */ int a = 0;
    public final cy b;
    public final cy c;

    public de(cy cyVar, cy cyVar2) {
        this.b = cyVar;
        this.c = cyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || de.class != obj.getClass()) {
            return false;
        }
        de deVar = (de) obj;
        if (this.b.equals(deVar.b)) {
            return this.c.equals(deVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    public final String toString() {
        StringBuilder sbG = ws.g();
        sbG.append(this.b);
        sbG.append('=');
        sbG.append(this.c);
        return ws.n(sbG);
    }
}
