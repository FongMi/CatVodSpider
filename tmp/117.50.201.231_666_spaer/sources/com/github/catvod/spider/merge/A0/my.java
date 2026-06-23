package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class my extends AbstractMap implements Serializable {
    public static final zm a = new zm(1);
    public final Comparator b;
    public final boolean c;
    public adi d;
    public int e;
    public int f;
    public final adi g;
    public cx h;
    public cx i;

    public my(boolean z) {
        zm zmVar = a;
        this.e = 0;
        this.f = 0;
        this.b = zmVar;
        this.c = z;
        this.g = new adi(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.d = null;
        this.e = 0;
        this.f++;
        adi adiVar = this.g;
        adiVar.e = adiVar;
        adiVar.d = adiVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        adi adiVarJ = null;
        if (obj != null) {
            try {
                adiVarJ = j(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return adiVarJ != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        cx cxVar = this.h;
        if (cxVar != null) {
            return cxVar;
        }
        cx cxVar2 = new cx(this, 0);
        this.h = cxVar2;
        return cxVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        adi adiVarJ;
        if (obj != null) {
            try {
                adiVarJ = j(obj, false);
            } catch (ClassCastException unused) {
                adiVarJ = null;
            }
        } else {
            adiVarJ = null;
        }
        if (adiVarJ != null) {
            return adiVarJ.h;
        }
        return null;
    }

    public final adi j(Object obj, boolean z) {
        int iCompareTo;
        adi adiVar;
        adi adiVar2 = this.d;
        zm zmVar = a;
        Comparator comparator = this.b;
        if (adiVar2 != null) {
            Comparable comparable = comparator == zmVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = adiVar2.f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return adiVar2;
                }
                adi adiVar3 = iCompareTo < 0 ? adiVar2.b : adiVar2.c;
                if (adiVar3 == null) {
                    break;
                }
                adiVar2 = adiVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        adi adiVar4 = this.g;
        if (adiVar2 != null) {
            adiVar = new adi(this.c, adiVar2, obj, adiVar4, adiVar4.e);
            if (iCompareTo < 0) {
                adiVar2.b = adiVar;
            } else {
                adiVar2.c = adiVar;
            }
            k(adiVar2, true);
        } else {
            if (comparator == zmVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            adiVar = new adi(this.c, adiVar2, obj, adiVar4, adiVar4.e);
            this.d = adiVar;
        }
        this.e++;
        this.f++;
        return adiVar;
    }

    public final void k(adi adiVar, boolean z) {
        while (adiVar != null) {
            adi adiVar2 = adiVar.b;
            adi adiVar3 = adiVar.c;
            int i = adiVar2 != null ? adiVar2.i : 0;
            int i2 = adiVar3 != null ? adiVar3.i : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                adi adiVar4 = adiVar3.b;
                adi adiVar5 = adiVar3.c;
                int i4 = (adiVar4 != null ? adiVar4.i : 0) - (adiVar5 != null ? adiVar5.i : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    n(adiVar);
                } else {
                    o(adiVar3);
                    n(adiVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                adi adiVar6 = adiVar2.b;
                adi adiVar7 = adiVar2.c;
                int i5 = (adiVar6 != null ? adiVar6.i : 0) - (adiVar7 != null ? adiVar7.i : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    o(adiVar);
                } else {
                    n(adiVar2);
                    o(adiVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                adiVar.i = i + 1;
                if (z) {
                    return;
                }
            } else {
                adiVar.i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            adiVar = adiVar.a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        cx cxVar = this.i;
        if (cxVar != null) {
            return cxVar;
        }
        cx cxVar2 = new cx(this, 1);
        this.i = cxVar2;
        return cxVar2;
    }

    public final void l(adi adiVar, boolean z) {
        adi adiVar2;
        adi adiVar3;
        int i;
        if (z) {
            adi adiVar4 = adiVar.e;
            adiVar4.d = adiVar.d;
            adiVar.d.e = adiVar4;
        }
        adi adiVar5 = adiVar.b;
        adi adiVar6 = adiVar.c;
        adi adiVar7 = adiVar.a;
        int i2 = 0;
        if (adiVar5 == null || adiVar6 == null) {
            if (adiVar5 != null) {
                m(adiVar, adiVar5);
                adiVar.b = null;
            } else if (adiVar6 != null) {
                m(adiVar, adiVar6);
                adiVar.c = null;
            } else {
                m(adiVar, null);
            }
            k(adiVar7, false);
            this.e--;
            this.f++;
            return;
        }
        if (adiVar5.i > adiVar6.i) {
            adi adiVar8 = adiVar5.c;
            while (true) {
                adi adiVar9 = adiVar8;
                adiVar3 = adiVar5;
                adiVar5 = adiVar9;
                if (adiVar5 == null) {
                    break;
                } else {
                    adiVar8 = adiVar5.c;
                }
            }
        } else {
            adi adiVar10 = adiVar6.b;
            while (true) {
                adiVar2 = adiVar6;
                adiVar6 = adiVar10;
                if (adiVar6 == null) {
                    break;
                } else {
                    adiVar10 = adiVar6.b;
                }
            }
            adiVar3 = adiVar2;
        }
        l(adiVar3, false);
        adi adiVar11 = adiVar.b;
        if (adiVar11 != null) {
            i = adiVar11.i;
            adiVar3.b = adiVar11;
            adiVar11.a = adiVar3;
            adiVar.b = null;
        } else {
            i = 0;
        }
        adi adiVar12 = adiVar.c;
        if (adiVar12 != null) {
            i2 = adiVar12.i;
            adiVar3.c = adiVar12;
            adiVar12.a = adiVar3;
            adiVar.c = null;
        }
        adiVar3.i = Math.max(i, i2) + 1;
        m(adiVar, adiVar3);
    }

    public final void m(adi adiVar, adi adiVar2) {
        adi adiVar3 = adiVar.a;
        adiVar.a = null;
        if (adiVar2 != null) {
            adiVar2.a = adiVar3;
        }
        if (adiVar3 == null) {
            this.d = adiVar2;
        } else if (adiVar3.b == adiVar) {
            adiVar3.b = adiVar2;
        } else {
            adiVar3.c = adiVar2;
        }
    }

    public final void n(adi adiVar) {
        adi adiVar2 = adiVar.b;
        adi adiVar3 = adiVar.c;
        adi adiVar4 = adiVar3.b;
        adi adiVar5 = adiVar3.c;
        adiVar.c = adiVar4;
        if (adiVar4 != null) {
            adiVar4.a = adiVar;
        }
        m(adiVar, adiVar3);
        adiVar3.b = adiVar;
        adiVar.a = adiVar3;
        int iMax = Math.max(adiVar2 != null ? adiVar2.i : 0, adiVar4 != null ? adiVar4.i : 0) + 1;
        adiVar.i = iMax;
        adiVar3.i = Math.max(iMax, adiVar5 != null ? adiVar5.i : 0) + 1;
    }

    public final void o(adi adiVar) {
        adi adiVar2 = adiVar.b;
        adi adiVar3 = adiVar.c;
        adi adiVar4 = adiVar2.b;
        adi adiVar5 = adiVar2.c;
        adiVar.b = adiVar5;
        if (adiVar5 != null) {
            adiVar5.a = adiVar;
        }
        m(adiVar, adiVar2);
        adiVar2.c = adiVar;
        adiVar.a = adiVar2;
        int iMax = Math.max(adiVar3 != null ? adiVar3.i : 0, adiVar5 != null ? adiVar5.i : 0) + 1;
        adiVar.i = iMax;
        adiVar2.i = Math.max(iMax, adiVar4 != null ? adiVar4.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.c) {
            throw new NullPointerException("value == null");
        }
        adi adiVarJ = j(obj, true);
        Object obj3 = adiVarJ.h;
        adiVarJ.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        adi adiVarJ;
        if (obj != null) {
            try {
                adiVarJ = j(obj, false);
            } catch (ClassCastException unused) {
                adiVarJ = null;
            }
        } else {
            adiVarJ = null;
        }
        if (adiVarJ != null) {
            l(adiVarJ, true);
        }
        if (adiVarJ != null) {
            return adiVarJ.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e;
    }
}
