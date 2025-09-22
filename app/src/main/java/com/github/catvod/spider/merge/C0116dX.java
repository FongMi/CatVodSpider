package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.dX */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0116dX extends ArrayList<C0127lK> {
    public C0116dX() {
    }

    @Nullable
    /* renamed from: QU */
    public C0127lK m593QU() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    /* renamed from: UJ */
    public String m594UJ() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        Iterator<C0127lK> it = iterator();
        while (it.hasNext()) {
            C0127lK next = it.next();
            if (sbM779xC.length() != 0) {
                sbM779xC.append("\n");
            }
            sbM779xC.append(next.mo276l());
        }
        return C0157x3.m778w8(sbM779xC);
    }

    /* renamed from: q */
    public String m595q(String str) {
        Iterator<C0127lK> it = iterator();
        while (it.hasNext()) {
            C0127lK next = it.next();
            if (next.m261KT(str)) {
                return next.mo126QU(str);
            }
        }
        return "";
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return m594UJ();
    }

    /* renamed from: u */
    public String m596u() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        Iterator<C0127lK> it = iterator();
        while (it.hasNext()) {
            C0127lK next = it.next();
            if (sbM779xC.length() != 0) {
                sbM779xC.append(" ");
            }
            sbM779xC.append(next.m653a());
        }
        return C0157x3.m778w8(sbM779xC);
    }

    @Override // java.util.ArrayList
    /* renamed from: xC */
    public C0116dX clone() {
        C0116dX c0116dX = new C0116dX(size());
        Iterator<C0127lK> it = iterator();
        while (it.hasNext()) {
            c0116dX.add(it.next().mo314L());
        }
        return c0116dX;
    }

    public C0116dX(int i) {
        super(i);
    }

    public C0116dX(List<C0127lK> list) {
        super(list);
    }
}
