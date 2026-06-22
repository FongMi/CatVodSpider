package com.github.catvod.spider.merge.f1;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1091G implements t2 {
    private s2[] b;
    private s2 c;
    private s2 d;
    private int e;

    private void a(s2 s2Var) {
        this.e++;
        s2 s2Var2 = this.d;
        if (s2Var2 != null) {
            s2Var2.g = s2Var;
        }
        if (this.c == null) {
            this.c = s2Var;
        }
        this.d = s2Var;
        s2[] s2VarArr = this.b;
        int length = (s2VarArr.length - 1) & s2Var.c;
        s2 s2Var3 = s2VarArr[length];
        s2VarArr[length] = s2Var;
        s2Var.f = s2Var3;
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final void f(Object obj, int i) {
        if (obj != null) {
            i = obj.hashCode();
        }
        if (this.e != 0) {
            int length = (r0.length - 1) & i;
            s2 s2Var = this.b[length];
            s2 s2Var2 = s2Var;
            while (s2Var != null) {
                if (s2Var.c == i) {
                    Object obj2 = s2Var.b;
                    if (obj2 == obj || (obj2 != null && obj2.equals(obj))) {
                        break;
                    }
                }
                s2Var2 = s2Var;
                s2Var = s2Var.f;
            }
            if (s2Var != null) {
                if ((s2Var.a() & 4) != 0) {
                    if (C1185v.h().u()) {
                        throw C1157l2.C1("msg.delete.property.with.configurable.false", obj);
                    }
                    return;
                }
                this.e--;
                if (s2Var2 == s2Var) {
                    this.b[length] = s2Var.f;
                } else {
                    s2Var2.f = s2Var.f;
                }
                s2 s2Var3 = this.c;
                if (s2Var == s2Var3) {
                    s2Var3 = null;
                    this.c = s2Var.g;
                } else {
                    while (true) {
                        s2 s2Var4 = s2Var3.g;
                        if (s2Var4 == s2Var) {
                            break;
                        } else {
                            s2Var3 = s2Var4;
                        }
                    }
                    s2Var3.g = s2Var.g;
                }
                if (s2Var == this.d) {
                    this.d = s2Var3;
                }
            }
        }
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final s2 i(Object obj, int i, int i2) {
        if (obj != null) {
            i = obj.hashCode();
        }
        s2[] s2VarArr = this.b;
        if (s2VarArr != null) {
            s2 s2Var = s2VarArr[(s2VarArr.length - 1) & i];
            while (s2Var != null) {
                if (i == s2Var.c) {
                    Object obj2 = s2Var.b;
                    if (obj2 == obj || (obj2 != null && obj2.equals(obj))) {
                        break;
                    }
                }
                s2Var = s2Var.f;
            }
            if (s2Var != null) {
                return s2Var;
            }
        }
        int i3 = this.e;
        if (i3 == 0) {
            this.b = new s2[4];
        }
        int i4 = (i3 + 1) * 4;
        s2[] s2VarArr2 = this.b;
        if (i4 > s2VarArr2.length * 3) {
            int length = s2VarArr2.length * 2;
            s2[] s2VarArr3 = new s2[length];
            for (s2 s2Var2 : s2VarArr2) {
                while (s2Var2 != null) {
                    s2 s2Var3 = s2Var2.f;
                    s2Var2.f = null;
                    int i5 = s2Var2.c & (length - 1);
                    s2 s2Var4 = s2VarArr3[i5];
                    s2VarArr3[i5] = s2Var2;
                    s2Var2.f = s2Var4;
                    s2Var2 = s2Var3;
                }
            }
            this.b = s2VarArr3;
        }
        s2 s2Var5 = new s2(obj, i, i2);
        a(s2Var5);
        return s2Var5;
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<s2> iterator() {
        return new C1090F(this.c);
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final s2 r(Object obj, int i) {
        if (this.b == null) {
            return null;
        }
        if (obj != null) {
            i = obj.hashCode();
        }
        for (s2 s2Var = this.b[(r0.length - 1) & i]; s2Var != null; s2Var = s2Var.f) {
            if (i == s2Var.c) {
                Object obj2 = s2Var.b;
                if (obj2 == obj || (obj2 != null && obj2.equals(obj))) {
                    return s2Var;
                }
            }
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final int size() {
        return this.e;
    }

    @Override // com.github.catvod.spider.merge.f1.t2
    public final void y(s2 s2Var, s2 s2Var2) {
        s2[] s2VarArr = this.b;
        int length = (s2VarArr.length - 1) & s2Var.c;
        s2 s2Var3 = s2VarArr[length];
        s2 s2Var4 = s2Var3;
        while (s2Var3 != null && s2Var3 != s2Var) {
            s2Var4 = s2Var3;
            s2Var3 = s2Var3.f;
        }
        if (s2Var4 == s2Var) {
            this.b[length] = s2Var2;
        } else {
            s2Var4.f = s2Var2;
        }
        s2Var2.f = s2Var.f;
        s2 s2Var5 = this.c;
        if (s2Var == s2Var5) {
            this.c = s2Var2;
        } else {
            while (s2Var5 != null) {
                s2 s2Var6 = s2Var5.g;
                if (s2Var6 == s2Var) {
                    break;
                } else {
                    s2Var5 = s2Var6;
                }
            }
            if (s2Var5 != null) {
                s2Var5.g = s2Var2;
            }
        }
        s2Var2.g = s2Var.g;
        if (s2Var == this.d) {
            this.d = s2Var2;
        }
    }
}
