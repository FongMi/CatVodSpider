package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class nx extends kv {
    public final /* synthetic */ int a;
    public final Object d;
    public final Object e;
    public final Object f;

    public nx(oa oaVar, kv kvVar, Type type) {
        this.a = 0;
        this.d = oaVar;
        this.e = kvVar;
        this.f = type;
    }

    public nx(Class cls) {
        this.a = 1;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new iq(cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                ni niVar = (ni) field.getAnnotation(ni.class);
                if (niVar != null) {
                    strName = niVar.value();
                    for (String str : niVar.alternate()) {
                        ((HashMap) this.d).put(str, r4);
                    }
                }
                ((HashMap) this.d).put(strName, r4);
                ((HashMap) this.e).put(string, r4);
                ((HashMap) this.f).put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        switch (this.a) {
            case 0:
                return ((kv) this.e).b(rdVar);
            default:
                if (rdVar.ak() == 9) {
                    rdVar.ag();
                    return null;
                }
                String strAi = rdVar.ai();
                Enum r0 = (Enum) ((HashMap) this.d).get(strAi);
                return r0 == null ? (Enum) ((HashMap) this.e).get(strAi) : r0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    @Override // com.github.catvod.spider.merge.A0.kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.github.catvod.spider.merge.A0.aag r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto Lb
            r6 = 0
            goto L15
        Lb:
            java.lang.Object r0 = r4.f
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.ae(r6)
            return
        L19:
            java.lang.Object r0 = r4.f
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L2c
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L27
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L2c
        L27:
            java.lang.Class r1 = r6.getClass()
            goto L2d
        L2c:
            r1 = r0
        L2d:
            java.lang.Object r2 = r4.e
            com.github.catvod.spider.merge.A0.kv r2 = (com.github.catvod.spider.merge.A0.kv) r2
            if (r1 == r0) goto L5c
            com.github.catvod.spider.merge.A0.fj r0 = new com.github.catvod.spider.merge.A0.fj
            r0.<init>(r1)
            java.lang.Object r1 = r4.d
            com.github.catvod.spider.merge.A0.oa r1 = (com.github.catvod.spider.merge.A0.oa) r1
            com.github.catvod.spider.merge.A0.kv r0 = r1.aa(r0)
            boolean r1 = r0 instanceof com.github.catvod.spider.merge.A0.lo
            if (r1 != 0) goto L45
            goto L5b
        L45:
            r1 = r2
        L46:
            boolean r3 = r1 instanceof com.github.catvod.spider.merge.A0.us
            if (r3 == 0) goto L56
            r3 = r1
            com.github.catvod.spider.merge.A0.us r3 = (com.github.catvod.spider.merge.A0.us) r3
            com.github.catvod.spider.merge.A0.kv r3 = r3.k()
            if (r3 != r1) goto L54
            goto L56
        L54:
            r1 = r3
            goto L46
        L56:
            boolean r1 = r1 instanceof com.github.catvod.spider.merge.A0.lo
            if (r1 != 0) goto L5b
            goto L5c
        L5b:
            r2 = r0
        L5c:
            r2.c(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.nx.c(com.github.catvod.spider.merge.A0.aag, java.lang.Object):void");
    }
}
