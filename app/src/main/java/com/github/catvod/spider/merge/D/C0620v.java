package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.y.C1413b;
import com.github.catvod.spider.merge.y.C1415d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0620v implements X, com.github.catvod.spider.merge.C.w {
    public static final C0620v a = new C0620v();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, com.github.catvod.spider.merge.y.b, java.util.Collection] */
    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        Collection collection;
        if (bVar.g.p() == 8) {
            bVar.g.o(16);
            return null;
        }
        if (type == C1413b.class) {
            C1413b r5 = (T) new C1413b();
            bVar.q(r5, null);
            return r5;
        }
        if (bVar.g.p() == 21) {
            bVar.g.nextToken();
            Class<?> clsW = com.github.catvod.spider.merge.H.A.W(type);
            if (clsW == AbstractCollection.class || clsW == Collection.class || clsW.isAssignableFrom(HashSet.class)) {
                collection = (T) new HashSet();
            } else if (clsW.isAssignableFrom(LinkedHashSet.class)) {
                collection = (T) new LinkedHashSet();
            } else if (clsW.isAssignableFrom(TreeSet.class)) {
                collection = (T) new TreeSet();
            } else if (clsW.isAssignableFrom(EnumSet.class)) {
                collection = (T) EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
            } else {
                try {
                    collection = (T) ((Set) clsW.newInstance());
                } catch (Exception unused) {
                    throw new C1415d(com.github.catvod.spider.merge.H0.j.b(clsW, t0.b("create instance error, class ")));
                }
            }
        } else {
            collection = (T) com.github.catvod.spider.merge.H.A.x(type);
        }
        bVar.p(com.github.catvod.spider.merge.H.A.L(type), collection, obj);
        return (T) collection;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    @Override // com.github.catvod.spider.merge.D.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.github.catvod.spider.merge.D.L r14, java.lang.Object r15, java.lang.Object r16, java.lang.reflect.Type r17, int r18) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.C0620v.d(com.github.catvod.spider.merge.D.L, java.lang.Object, java.lang.Object, java.lang.reflect.Type, int):void");
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 14;
    }
}
