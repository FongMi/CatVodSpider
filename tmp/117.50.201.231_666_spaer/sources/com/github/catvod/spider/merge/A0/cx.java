package com.github.catvod.spider.merge.A0;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class cx extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ my b;

    public /* synthetic */ cx(my myVar, int i) {
        this.a = i;
        this.b = myVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        adi adiVarJ;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                my myVar = this.b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                adi adiVar = null;
                if (key != null) {
                    try {
                        adiVarJ = myVar.j(key, false);
                    } catch (ClassCastException unused) {
                        adiVarJ = null;
                    }
                    break;
                } else {
                    adiVarJ = null;
                }
                if (adiVarJ != null && Objects.equals(adiVarJ.h, entry.getValue())) {
                    adiVar = adiVarJ;
                }
                return adiVar != null;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new xu(this.b, 0);
            default:
                return new xu(this.b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        adi adiVarJ;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                my myVar = this.b;
                Object key = entry.getKey();
                adi adiVar = null;
                if (key != null) {
                    try {
                        adiVarJ = myVar.j(key, false);
                    } catch (ClassCastException unused) {
                        adiVarJ = null;
                    }
                    break;
                } else {
                    adiVarJ = null;
                }
                if (adiVarJ != null && Objects.equals(adiVarJ.h, entry.getValue())) {
                    adiVar = adiVarJ;
                }
                if (adiVar == null) {
                    return false;
                }
                myVar.l(adiVar, true);
                return true;
            default:
                my myVar2 = this.b;
                adi adiVarJ2 = null;
                if (obj != null) {
                    try {
                        adiVarJ2 = myVar2.j(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (adiVarJ2 != null) {
                    myVar2.l(adiVarJ2, true);
                }
                return adiVarJ2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.e;
    }
}
