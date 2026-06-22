package com.github.catvod.spider.merge.f1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1 extends AbstractC1106W implements Map {
    private boolean p1(int i, Object obj) {
        return !(obj instanceof p2) || (((p2) obj).f0(i) & 2) == 0;
    }

    private boolean q1(String str, Object obj) {
        return !(obj instanceof p2) || (((p2) obj).h0(str) & 2) == 0;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public String F() {
        return "Object";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void Z0(C1104U c1104u) {
        T0(c1104u, "Object", -1, "getPrototypeOf", 1);
        C1185v.i().getClass();
        T0(c1104u, "Object", -2, "keys", 1);
        T0(c1104u, "Object", -3, "getOwnPropertyNames", 1);
        T0(c1104u, "Object", -15, "getOwnPropertySymbols", 1);
        T0(c1104u, "Object", -4, "getOwnPropertyDescriptor", 2);
        T0(c1104u, "Object", -5, "getOwnPropertyDescriptors", 1);
        T0(c1104u, "Object", -6, "defineProperty", 3);
        T0(c1104u, "Object", -7, "isExtensible", 1);
        T0(c1104u, "Object", -8, "preventExtensions", 1);
        T0(c1104u, "Object", -9, "defineProperties", 2);
        T0(c1104u, "Object", -10, "create", 2);
        T0(c1104u, "Object", -11, "isSealed", 1);
        T0(c1104u, "Object", -12, "isFrozen", 1);
        T0(c1104u, "Object", -13, "seal", 1);
        T0(c1104u, "Object", -14, "freeze", 1);
        T0(c1104u, "Object", -16, "assign", 2);
        T0(c1104u, "Object", -17, "is", 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x011e, code lost:
    
        if (r0 != false) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d A[PHI: r2
      0x011d: PHI (r2v38 ??) = (r2v60 ??), (r2v61 ??) binds: [B:91:0x010e, B:93:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.github.catvod.spider.merge.f1.k2] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0166 -> B:118:0x0168). Please report as a decompilation issue!!! */
    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.github.catvod.spider.merge.f1.C1104U r19, com.github.catvod.spider.merge.f1.C1185v r20, com.github.catvod.spider.merge.f1.n2 r21, com.github.catvod.spider.merge.f1.n2 r22, java.lang.Object[] r23) {
        /*
            Method dump skipped, instruction units count: 1746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1.c(com.github.catvod.spider.merge.f1.U, com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.Object[]):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "toLocaleString":
                return 3;
            case "hasOwnProperty":
                return 5;
            case "toSource":
                return 8;
            case "toString":
                return 2;
            case "constructor":
                return 1;
            case "isPrototypeOf":
                return 7;
            case "propertyIsEnumerable":
                return 6;
            case "valueOf":
                return 4;
            case "__lookupSetter__":
                return 12;
            case "__lookupGetter__":
                return 11;
            case "__defineSetter__":
                return 10;
            case "__defineGetter__":
                return 9;
            default:
                return 0;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return x((String) obj, this);
        }
        if (obj instanceof Number) {
            return z(((Number) obj).intValue(), this);
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        B1 b1 = new B1(this);
        Object[] objArrO0 = b1.b.o0(false, false);
        int i = 0;
        while (true) {
            if (!(i < objArrO0.length)) {
                return false;
            }
            int i2 = i + 1;
            Object obj2 = b1.b.get(objArrO0[i]);
            if (obj == obj2 || (obj != null && obj.equals(obj2))) {
                break;
            }
            i = i2;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<Object, Object>> entrySet() {
        return new C1193x1(this);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        String str2;
        String str3;
        int i2 = 1;
        switch (i) {
            case 1:
                str = "constructor";
                j1("Object", i, str, i2);
                return;
            case 2:
                str2 = "toString";
                str = str2;
                i2 = 0;
                j1("Object", i, str, i2);
                return;
            case 3:
                str2 = "toLocaleString";
                str = str2;
                i2 = 0;
                j1("Object", i, str, i2);
                return;
            case 4:
                str2 = "valueOf";
                str = str2;
                i2 = 0;
                j1("Object", i, str, i2);
                return;
            case 5:
                str = "hasOwnProperty";
                j1("Object", i, str, i2);
                return;
            case 6:
                str = "propertyIsEnumerable";
                j1("Object", i, str, i2);
                return;
            case 7:
                str = "isPrototypeOf";
                j1("Object", i, str, i2);
                return;
            case 8:
                str2 = "toSource";
                str = str2;
                i2 = 0;
                j1("Object", i, str, i2);
                return;
            case 9:
                str3 = "__defineGetter__";
                str = str3;
                i2 = 2;
                j1("Object", i, str, i2);
                return;
            case 10:
                str3 = "__defineSetter__";
                str = str3;
                i2 = 2;
                j1("Object", i, str, i2);
                return;
            case 11:
                str = "__lookupGetter__";
                j1("Object", i, str, i2);
                return;
            case 12:
                str = "__lookupSetter__";
                j1("Object", i, str, i2);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return new C1199z1(this);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object obj2 = get(obj);
        if (obj instanceof String) {
            delete((String) obj);
        } else if (obj instanceof Number) {
            p(((Number) obj).intValue());
        }
        return obj2;
    }

    public final String toString() {
        return C1157l2.m(this);
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return new B1(this);
    }
}
