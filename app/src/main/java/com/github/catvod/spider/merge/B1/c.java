package com.github.catvod.spider.merge.B1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.L1.k;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.m1.l;
import com.github.catvod.spider.merge.p1.i;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c extends AbstractC0901a {
    private static final c a = new c();

    private c() {
    }

    public static c o() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) {
        return k.d("(/w/|(/videos/(watch/|embed/)?))(?!p/)([^/?&#]*)", str, 4);
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String i(String str) {
        return j(str, l.b.i());
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String j(String str, String str2) {
        return t0.a(str2, "/videos/watch/", str);
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        if (str.contains("/playlist/")) {
            return false;
        }
        try {
            new URL(str);
            k.d("(/w/|(/videos/(watch/|embed/)?))(?!p/)([^/?&#]*)", str, 4);
            return true;
        } catch (i | MalformedURLException unused) {
            return false;
        }
    }
}
