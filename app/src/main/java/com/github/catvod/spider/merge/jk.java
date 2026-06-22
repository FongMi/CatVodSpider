package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class jk extends ArrayList<Iw> {
    public jk() {
    }

    public String OL() {
        StringBuilder sbS = tv.S();
        for (Iw iw : this) {
            if (sbS.length() != 0) {
                sbS.append(" ");
            }
            sbS.append(iw.GO());
        }
        return tv.cD(sbS);
    }

    @Override // java.util.ArrayList
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public jk clone() {
        jk jkVar = new jk(size());
        Iterator<Iw> it = iterator();
        while (it.hasNext()) {
            jkVar.add(it.next().v());
        }
        return jkVar;
    }

    @Nullable
    public Iw T4() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public String b() {
        StringBuilder sbS = tv.S();
        for (Iw iw : this) {
            if (sbS.length() != 0) {
                sbS.append("\n");
            }
            sbS.append(iw.C());
        }
        return tv.cD(sbS);
    }

    public String l8(String str) {
        for (Iw iw : this) {
            if (iw.Kf(str)) {
                return iw.T4(str);
            }
        }
        return "";
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return b();
    }

    public jk(int i) {
        super(i);
    }

    public jk(List<Iw> list) {
        super(list);
    }
}
