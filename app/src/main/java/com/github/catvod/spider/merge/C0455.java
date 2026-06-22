package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ำ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0455 extends ArrayList<C0011> {
    public C0455() {
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return m1691();
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public String m1686(String str) {
        for (C0011 c0011 : this) {
            if (c0011.m685(str)) {
                return c0011.mo117(str);
            }
        }
        return "";
    }

    @Override // java.util.ArrayList
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0455 clone() {
        C0455 c0455 = new C0455(size());
        Iterator<C0011> it = iterator();
        while (it.hasNext()) {
            c0455.add(it.next().mo120());
        }
        return c0455;
    }

    @Nullable
    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public C0011 m1688() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public String m1689() {
        StringBuilder sbM136 = C0008.m136();
        for (C0011 c0011 : this) {
            if (sbM136.length() != 0) {
                sbM136.append(SOY.d("70"));
            }
            sbM136.append(c0011.m189());
        }
        return C0008.m147(sbM136);
    }

    @Nullable
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public C0011 m1690() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public String m1691() {
        StringBuilder sbM136 = C0008.m136();
        for (C0011 c0011 : this) {
            if (sbM136.length() != 0) {
                sbM136.append(SOY.d("70"));
            }
            sbM136.append(c0011.mo287());
        }
        return C0008.m147(sbM136);
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public C0455 m1692(String str) {
        return C0170.m589(str, this);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public String m1693() {
        StringBuilder sbM136 = C0008.m136();
        for (C0011 c0011 : this) {
            if (sbM136.length() != 0) {
                sbM136.append(SOY.d("5A"));
            }
            sbM136.append(c0011.m204());
        }
        return C0008.m147(sbM136);
    }

    public C0455(int i) {
        super(i);
    }

    public C0455(List<C0011> list) {
        super(list);
    }

    public C0455(C0011... c0011Arr) {
        super(Arrays.asList(c0011Arr));
    }
}
