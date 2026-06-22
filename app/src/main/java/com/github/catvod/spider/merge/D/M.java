package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.z.InterfaceC1450d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class M extends g0 implements X {
    protected final D[] i;
    protected final D[] j;
    protected final d0 k;
    private volatile transient long[] l;
    private volatile transient short[] m;

    public M(d0 d0Var) {
        D[] dArr;
        boolean z;
        this.k = d0Var;
        this.j = new D[d0Var.f.length];
        int i = 0;
        while (true) {
            dArr = this.j;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = new D(d0Var.a, d0Var.f[i]);
            i++;
        }
        com.github.catvod.spider.merge.H.e[] eVarArr = d0Var.e;
        if (eVarArr == d0Var.f) {
            this.i = dArr;
        } else {
            this.i = new D[eVarArr.length];
            int i2 = 0;
            while (true) {
                if (i2 >= this.i.length) {
                    z = false;
                    break;
                }
                D dK = k(d0Var.e[i2].b);
                if (dK == null) {
                    z = true;
                    break;
                } else {
                    this.i[i2] = dK;
                    i2++;
                }
            }
            if (z) {
                D[] dArr2 = this.j;
                System.arraycopy(dArr2, 0, this.i, 0, dArr2.length);
            }
        }
        InterfaceC1450d interfaceC1450d = d0Var.d;
        if (interfaceC1450d != null) {
            for (Class<? extends f0> cls : interfaceC1450d.serialzeFilters()) {
                try {
                    c(cls.getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        r(l, obj, obj2, type, i, false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.O>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.O>] */
    protected final boolean i(L l, String str) {
        ?? r2 = l.g;
        if (r2 != 0) {
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                if (!((O) it.next()).a()) {
                    return false;
                }
            }
        }
        ?? r22 = this.g;
        if (r22 == 0) {
            return true;
        }
        Iterator it2 = r22.iterator();
        while (it2.hasNext()) {
            if (!((O) it2.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public final Set<String> j(Object obj) {
        HashSet hashSet = new HashSet();
        for (D d : this.j) {
            if (d.b(obj) != null) {
                hashSet.add(d.b.b);
            }
        }
        return hashSet;
    }

    public final D k(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        int length = this.j.length - 1;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            int iCompareTo = this.j[i2].b.b.compareTo(str);
            if (iCompareTo < 0) {
                i = i2 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return this.j[i2];
                }
                length = i2 - 1;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.Object r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.M.l(java.lang.Object, java.lang.String, long):java.lang.Object");
    }

    public final List<Object> m(Object obj) {
        ArrayList arrayList = new ArrayList(this.j.length);
        for (D d : this.j) {
            arrayList.add(d.a(obj));
        }
        return arrayList;
    }

    public final Map<String, Object> n(Object obj) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.j.length);
        for (D d : this.j) {
            boolean zB = i0.b(d.d, i0.SkipTransientField);
            com.github.catvod.spider.merge.H.e eVar = d.b;
            if (!zB || eVar == null || !eVar.o) {
                if (eVar.s) {
                    Object objJ = AbstractC1412a.j(d.a(obj));
                    if (objJ instanceof Map) {
                        linkedHashMap.putAll((Map) objJ);
                    } else {
                        str = d.b.b;
                    }
                } else {
                    str = eVar.b;
                }
                linkedHashMap.put(str, d.a(obj));
            }
        }
        return linkedHashMap;
    }

    public final InterfaceC1450d o() {
        return this.k.d;
    }

    public final int p(Object obj) {
        int i = 0;
        for (D d : this.j) {
            if (d.b(obj) != null) {
                i++;
            }
        }
        return i;
    }

    protected final boolean q(L l, int i) {
        int i2 = i0.BeanToArray.b;
        return ((this.k.g & i2) == 0 && !l.j.j && (i & i2) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0294 A[Catch: Exception -> 0x0173, all -> 0x04c3, TryCatch #0 {all -> 0x04c3, blocks: (B:62:0x00d8, B:64:0x00e4, B:70:0x00f7, B:79:0x010d, B:81:0x0113, B:87:0x0121, B:89:0x012b, B:103:0x014e, B:107:0x0160, B:110:0x016c, B:113:0x0176, B:116:0x019d, B:118:0x01a9, B:120:0x01b4, B:122:0x01be, B:125:0x01c8, B:127:0x01d4, B:129:0x01d8, B:132:0x01df, B:139:0x01ec, B:135:0x01e4, B:137:0x01e9, B:141:0x01f2, B:143:0x01fe, B:145:0x0202, B:148:0x0209, B:151:0x020e, B:153:0x0213, B:156:0x0219, B:158:0x0221, B:160:0x022d, B:162:0x0231, B:165:0x0238, B:172:0x0245, B:168:0x023d, B:170:0x0242, B:173:0x024a, B:175:0x0252, B:177:0x025e, B:179:0x0262, B:182:0x0269, B:189:0x0276, B:185:0x026e, B:187:0x0273, B:191:0x027d, B:193:0x0281, B:195:0x028b, B:199:0x0294, B:201:0x0298, B:203:0x02a1, B:205:0x02a8, B:207:0x02ae, B:209:0x02b2, B:212:0x02bd, B:214:0x02c1, B:216:0x02c5, B:219:0x02d0, B:221:0x02d4, B:223:0x02d8, B:226:0x02e3, B:228:0x02e7, B:230:0x02eb, B:233:0x02f9, B:235:0x02fd, B:237:0x0301, B:240:0x030e, B:242:0x0312, B:244:0x0316, B:247:0x0324, B:249:0x0328, B:251:0x032c, B:255:0x0338, B:257:0x033c, B:259:0x0340, B:262:0x034b, B:264:0x0358, B:269:0x0364, B:273:0x036f, B:323:0x0417, B:325:0x041b, B:327:0x041f, B:330:0x0428, B:332:0x0430, B:333:0x0438, B:335:0x043e, B:272:0x036c, B:275:0x0377, B:277:0x0383, B:284:0x0398, B:289:0x03a2, B:293:0x03b2, B:296:0x03ba, B:299:0x03c4, B:301:0x03cc, B:302:0x03d5, B:304:0x03de, B:309:0x03e9, B:307:0x03e6, B:310:0x03ed, B:311:0x03f1, B:313:0x03f6, B:314:0x03fa, B:315:0x03fe, B:317:0x0402, B:319:0x0406, B:322:0x0414, B:290:0x03aa, B:94:0x0137, B:99:0x0141, B:347:0x045a, B:369:0x04a1, B:371:0x04a9, B:373:0x04b1, B:375:0x04b9), top: B:418:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a8 A[Catch: Exception -> 0x0173, all -> 0x04c3, TryCatch #0 {all -> 0x04c3, blocks: (B:62:0x00d8, B:64:0x00e4, B:70:0x00f7, B:79:0x010d, B:81:0x0113, B:87:0x0121, B:89:0x012b, B:103:0x014e, B:107:0x0160, B:110:0x016c, B:113:0x0176, B:116:0x019d, B:118:0x01a9, B:120:0x01b4, B:122:0x01be, B:125:0x01c8, B:127:0x01d4, B:129:0x01d8, B:132:0x01df, B:139:0x01ec, B:135:0x01e4, B:137:0x01e9, B:141:0x01f2, B:143:0x01fe, B:145:0x0202, B:148:0x0209, B:151:0x020e, B:153:0x0213, B:156:0x0219, B:158:0x0221, B:160:0x022d, B:162:0x0231, B:165:0x0238, B:172:0x0245, B:168:0x023d, B:170:0x0242, B:173:0x024a, B:175:0x0252, B:177:0x025e, B:179:0x0262, B:182:0x0269, B:189:0x0276, B:185:0x026e, B:187:0x0273, B:191:0x027d, B:193:0x0281, B:195:0x028b, B:199:0x0294, B:201:0x0298, B:203:0x02a1, B:205:0x02a8, B:207:0x02ae, B:209:0x02b2, B:212:0x02bd, B:214:0x02c1, B:216:0x02c5, B:219:0x02d0, B:221:0x02d4, B:223:0x02d8, B:226:0x02e3, B:228:0x02e7, B:230:0x02eb, B:233:0x02f9, B:235:0x02fd, B:237:0x0301, B:240:0x030e, B:242:0x0312, B:244:0x0316, B:247:0x0324, B:249:0x0328, B:251:0x032c, B:255:0x0338, B:257:0x033c, B:259:0x0340, B:262:0x034b, B:264:0x0358, B:269:0x0364, B:273:0x036f, B:323:0x0417, B:325:0x041b, B:327:0x041f, B:330:0x0428, B:332:0x0430, B:333:0x0438, B:335:0x043e, B:272:0x036c, B:275:0x0377, B:277:0x0383, B:284:0x0398, B:289:0x03a2, B:293:0x03b2, B:296:0x03ba, B:299:0x03c4, B:301:0x03cc, B:302:0x03d5, B:304:0x03de, B:309:0x03e9, B:307:0x03e6, B:310:0x03ed, B:311:0x03f1, B:313:0x03f6, B:314:0x03fa, B:315:0x03fe, B:317:0x0402, B:319:0x0406, B:322:0x0414, B:290:0x03aa, B:94:0x0137, B:99:0x0141, B:347:0x045a, B:369:0x04a1, B:371:0x04a9, B:373:0x04b1, B:375:0x04b9), top: B:418:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x041b A[Catch: Exception -> 0x0173, all -> 0x04c3, TryCatch #0 {all -> 0x04c3, blocks: (B:62:0x00d8, B:64:0x00e4, B:70:0x00f7, B:79:0x010d, B:81:0x0113, B:87:0x0121, B:89:0x012b, B:103:0x014e, B:107:0x0160, B:110:0x016c, B:113:0x0176, B:116:0x019d, B:118:0x01a9, B:120:0x01b4, B:122:0x01be, B:125:0x01c8, B:127:0x01d4, B:129:0x01d8, B:132:0x01df, B:139:0x01ec, B:135:0x01e4, B:137:0x01e9, B:141:0x01f2, B:143:0x01fe, B:145:0x0202, B:148:0x0209, B:151:0x020e, B:153:0x0213, B:156:0x0219, B:158:0x0221, B:160:0x022d, B:162:0x0231, B:165:0x0238, B:172:0x0245, B:168:0x023d, B:170:0x0242, B:173:0x024a, B:175:0x0252, B:177:0x025e, B:179:0x0262, B:182:0x0269, B:189:0x0276, B:185:0x026e, B:187:0x0273, B:191:0x027d, B:193:0x0281, B:195:0x028b, B:199:0x0294, B:201:0x0298, B:203:0x02a1, B:205:0x02a8, B:207:0x02ae, B:209:0x02b2, B:212:0x02bd, B:214:0x02c1, B:216:0x02c5, B:219:0x02d0, B:221:0x02d4, B:223:0x02d8, B:226:0x02e3, B:228:0x02e7, B:230:0x02eb, B:233:0x02f9, B:235:0x02fd, B:237:0x0301, B:240:0x030e, B:242:0x0312, B:244:0x0316, B:247:0x0324, B:249:0x0328, B:251:0x032c, B:255:0x0338, B:257:0x033c, B:259:0x0340, B:262:0x034b, B:264:0x0358, B:269:0x0364, B:273:0x036f, B:323:0x0417, B:325:0x041b, B:327:0x041f, B:330:0x0428, B:332:0x0430, B:333:0x0438, B:335:0x043e, B:272:0x036c, B:275:0x0377, B:277:0x0383, B:284:0x0398, B:289:0x03a2, B:293:0x03b2, B:296:0x03ba, B:299:0x03c4, B:301:0x03cc, B:302:0x03d5, B:304:0x03de, B:309:0x03e9, B:307:0x03e6, B:310:0x03ed, B:311:0x03f1, B:313:0x03f6, B:314:0x03fa, B:315:0x03fe, B:317:0x0402, B:319:0x0406, B:322:0x0414, B:290:0x03aa, B:94:0x0137, B:99:0x0141, B:347:0x045a, B:369:0x04a1, B:371:0x04a9, B:373:0x04b1, B:375:0x04b9), top: B:418:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0464 A[PHI: r27 r30 r32 r33
      0x0464: PHI (r27v10 com.github.catvod.spider.merge.D.D) = (r27v11 com.github.catvod.spider.merge.D.D), (r27v13 com.github.catvod.spider.merge.D.D) binds: [B:78:0x0108, B:342:0x044c] A[DONT_GENERATE, DONT_INLINE]
      0x0464: PHI (r30v1 int) = (r30v2 int), (r30v4 int) binds: [B:78:0x0108, B:342:0x044c] A[DONT_GENERATE, DONT_INLINE]
      0x0464: PHI (r32v2 char) = (r32v3 char), (r32v5 char) binds: [B:78:0x0108, B:342:0x044c] A[DONT_GENERATE, DONT_INLINE]
      0x0464: PHI (r33v2 com.github.catvod.spider.merge.D.D[]) = (r33v3 com.github.catvod.spider.merge.D.D[]), (r33v5 com.github.catvod.spider.merge.D.D[]) binds: [B:78:0x0108, B:342:0x044c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x04fe A[Catch: all -> 0x050d, TRY_ENTER, TryCatch #5 {all -> 0x050d, blocks: (B:391:0x04fe, B:400:0x052f, B:402:0x054a, B:404:0x0550, B:405:0x0568, B:407:0x056c, B:411:0x0575, B:412:0x057a, B:395:0x0511, B:397:0x0515, B:399:0x0519, B:401:0x0534), top: B:427:0x04fc }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0550 A[Catch: all -> 0x050d, TryCatch #5 {all -> 0x050d, blocks: (B:391:0x04fe, B:400:0x052f, B:402:0x054a, B:404:0x0550, B:405:0x0568, B:407:0x056c, B:411:0x0575, B:412:0x057a, B:395:0x0511, B:397:0x0515, B:399:0x0519, B:401:0x0534), top: B:427:0x04fc }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x056c A[Catch: all -> 0x050d, TryCatch #5 {all -> 0x050d, blocks: (B:391:0x04fe, B:400:0x052f, B:402:0x054a, B:404:0x0550, B:405:0x0568, B:407:0x056c, B:411:0x0575, B:412:0x057a, B:395:0x0511, B:397:0x0515, B:399:0x0519, B:401:0x0534), top: B:427:0x04fc }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void r(com.github.catvod.spider.merge.D.L r35, java.lang.Object r36, java.lang.Object r37, java.lang.reflect.Type r38, int r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 1411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.M.r(com.github.catvod.spider.merge.D.L, java.lang.Object, java.lang.Object, java.lang.reflect.Type, int, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.d>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.d>] */
    protected final char s(L l, Object obj, char c) {
        ?? r0 = l.b;
        if (r0 != 0) {
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                c = ((AbstractC0603d) it.next()).f(l, obj, c);
            }
        }
        ?? r02 = this.b;
        if (r02 != 0) {
            Iterator it2 = r02.iterator();
            while (it2.hasNext()) {
                c = ((AbstractC0603d) it2.next()).f(l, obj, c);
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.l>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.D.l>] */
    protected final char t(L l, Object obj, char c) {
        ?? r0 = l.a;
        if (r0 != 0) {
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                c = ((AbstractC0611l) it.next()).f(l, obj, c);
            }
        }
        ?? r02 = this.a;
        if (r02 != 0) {
            Iterator it2 = r02.iterator();
            while (it2.hasNext()) {
                c = ((AbstractC0611l) it2.next()).f(l, obj, c);
            }
        }
        return c;
    }

    protected final void u(L l, String str, Object obj) {
        if (str == null) {
            str = l.i.c;
        }
        l.j.j(str);
        String name = this.k.b;
        if (name == null) {
            Class<?> superclass = obj.getClass();
            if (com.github.catvod.spider.merge.H.A.i0(superclass)) {
                superclass = superclass.getSuperclass();
            }
            name = superclass.getName();
        }
        l.v(name);
    }

    public final void v(L l, Object obj, Object obj2, Type type, int i) {
        r(l, obj, obj2, type, i, false);
    }

    public final boolean w(L l, Object obj, int i) {
        IdentityHashMap<Object, c0> identityHashMap;
        c0 c0Var = l.p;
        int i2 = i0.DisableCircularReferenceDetect.b;
        if (c0Var == null || (c0Var.d & i2) != 0 || (i & i2) != 0 || (identityHashMap = l.o) == null || !identityHashMap.containsKey(obj)) {
            return false;
        }
        l.x(obj);
        return true;
    }
}
