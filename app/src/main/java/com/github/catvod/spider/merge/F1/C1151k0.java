package com.github.catvod.spider.merge.f1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1151k0 extends C1147j0 {
    C1151k0(n2 n2Var, Class<?> cls, boolean z) {
        super(n2Var, cls, z);
    }

    private static boolean o(Class<?> cls) {
        String name;
        Package r0 = cls.getPackage();
        if (r0 != null) {
            name = r0.getName();
        } else {
            if (!Proxy.isProxyClass(cls)) {
                return true;
            }
            String name2 = cls.getName();
            name = name2.substring(0, name2.lastIndexOf(46));
        }
        try {
            try {
                Object objInvoke = cls.getClass().getMethod("getModule", new Class[0]).invoke(cls, new Object[0]);
                return ((Boolean) objInvoke.getClass().getMethod("isExported", String.class).invoke(objInvoke, name)).booleanValue();
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r4 = r4.getSuperclass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (o(r4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r3 = r4.getMethod(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0021, code lost:
    
        continue;
     */
    @Override // com.github.catvod.spider.merge.f1.C1147j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void b(java.lang.Class<?> r12, java.util.Map<com.github.catvod.spider.merge.f1.C1143i0, java.lang.reflect.Method> r13) {
        /*
            r11 = this;
            boolean r0 = o(r12)
            if (r0 == 0) goto La
            super.b(r12, r13)
            goto L55
        La:
            java.lang.reflect.Method[] r12 = r12.getMethods()
            int r0 = r12.length
            r1 = 0
            r2 = 0
        L11:
            if (r2 >= r0) goto L55
            r3 = r12[r2]
            java.lang.Class r4 = r3.getDeclaringClass()
            java.lang.String r5 = r3.getName()
            java.lang.Class[] r6 = r3.getParameterTypes()
        L21:
            java.lang.Class[] r7 = r4.getInterfaces()
            int r8 = r7.length
            r9 = 0
        L27:
            if (r9 >= r8) goto L33
            r10 = r7[r9]
            java.lang.reflect.Method r3 = r10.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L30
            goto L44
        L30:
            int r9 = r9 + 1
            goto L27
        L33:
            java.lang.Class r4 = r4.getSuperclass()
            if (r4 != 0) goto L3a
            goto L44
        L3a:
            boolean r7 = o(r4)
            if (r7 == 0) goto L21
            java.lang.reflect.Method r3 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L21
        L44:
            com.github.catvod.spider.merge.f1.i0 r4 = new com.github.catvod.spider.merge.f1.i0
            r4.<init>(r3)
            boolean r5 = r13.containsKey(r4)
            if (r5 != 0) goto L52
            r13.put(r4, r3)
        L52:
            int r2 = r2 + 1
            goto L11
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1151k0.b(java.lang.Class, java.util.Map):void");
    }
}
