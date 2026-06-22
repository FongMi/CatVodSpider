package com.github.catvod.spider.merge.q1;

import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.p1.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class c extends AbstractC0901a {
    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final C1380a c(String str, String str2) {
        if (str != null) {
            return new C1381b(super.c(str, str2));
        }
        throw new NullPointerException("URL may not be null");
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String i(String str) {
        return q(str, new ArrayList(0));
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String j(String str, String str2) {
        return r(str, new ArrayList(0), str2);
    }

    public final C1381b o(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("ID cannot be null");
        }
        String strJ = j(str, str2);
        return new C1381b(new C1380a(strJ, strJ, str));
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C1381b b(String str) throws i {
        String strD = m.d(str);
        String strE = m.e(strD);
        if (strD != null) {
            return new C1381b(super.c(strD, strE));
        }
        throw new NullPointerException("URL may not be null");
    }

    public abstract String q(String str, List list);

    public String r(String str, List list, String str2) {
        return q(str, list);
    }
}
