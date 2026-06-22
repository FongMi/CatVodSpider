package com.github.catvod.spider.merge.C;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0599e extends n {
    private final Type c;
    private int d;
    private w e;

    public C0599e(Class cls, com.github.catvod.spider.merge.H.e eVar) {
        Type type;
        super(cls, eVar);
        Type type2 = eVar.g;
        if (type2 instanceof ParameterizedType) {
            type = ((ParameterizedType) type2).getActualTypeArguments()[0];
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                if (upperBounds.length == 1) {
                    type = upperBounds[0];
                }
            }
        } else {
            type = Object.class;
        }
        this.c = type;
    }

    @Override // com.github.catvod.spider.merge.C.n
    public final int b() {
        return 14;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    @Override // com.github.catvod.spider.merge.C.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.github.catvod.spider.merge.B.b r19, java.lang.Object r20, java.lang.reflect.Type r21, java.util.Map<java.lang.String, java.lang.Object> r22) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.C0599e.d(com.github.catvod.spider.merge.B.b, java.lang.Object, java.lang.reflect.Type, java.util.Map):void");
    }
}
