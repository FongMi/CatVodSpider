package com.github.catvod.spider.merge.FM.z;

import com.github.catvod.spider.merge.FM.x.C0432J;
import com.github.catvod.spider.merge.FM.x.InterfaceC0431I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.z.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0486c {
    private final C0485b a;
    private final InterfaceC0431I b;

    public C0486c(C0485b c0485b, InterfaceC0431I interfaceC0431I) {
        this.a = c0485b;
        this.b = interfaceC0431I;
    }

    protected final String a(C0488e c0488e) {
        StringBuilder sb;
        int i = c0488e.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0488e.d ? ":" : "");
        sb2.append("s");
        sb2.append(i);
        sb2.append(c0488e.g ? "^" : "");
        String string = sb2.toString();
        if (!c0488e.d) {
            return string;
        }
        if (c0488e.h != null) {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(Arrays.toString(c0488e.h));
        } else {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(c0488e.e);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.FM.z.e, com.github.catvod.spider.merge.FM.z.e>] */
    public final String toString() {
        if (this.a.b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        C0485b c0485b = this.a;
        c0485b.getClass();
        ArrayList<C0488e> arrayList = new ArrayList(c0485b.a.keySet());
        Collections.sort(arrayList, new C0484a());
        for (C0488e c0488e : arrayList) {
            C0488e[] c0488eArr = c0488e.c;
            int length = c0488eArr != null ? c0488eArr.length : 0;
            for (int i = 0; i < length; i++) {
                C0488e c0488e2 = c0488e.c[i];
                if (c0488e2 != null && c0488e2.a != Integer.MAX_VALUE) {
                    sb.append(a(c0488e));
                    String strA = ((C0432J) this.b).a(i - 1);
                    sb.append("-");
                    sb.append(strA);
                    sb.append("->");
                    sb.append(a(c0488e2));
                    sb.append('\n');
                }
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return null;
        }
        return string;
    }
}
