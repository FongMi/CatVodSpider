package com.github.catvod.spider.merge.B1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.L1.k;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.l;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a extends com.github.catvod.spider.merge.q1.c {
    private static final a a = new a();

    private a() {
    }

    private String s(String str) {
        String strSubstring;
        StringBuilder sb;
        String str2;
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.startsWith("a/")) {
            strSubstring = str.substring(1);
            sb = new StringBuilder();
            str2 = "accounts";
        } else {
            if (!str.startsWith("c/")) {
                return str;
            }
            strSubstring = str.substring(1);
            sb = new StringBuilder();
            str2 = "video-channels";
        }
        return C1290c.b(sb, str2, strSubstring);
    }

    public static a t() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) {
        return s(k.d("/((accounts|a)|(video-channels|c))/([^/?&#]*)", str, 0));
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        try {
            new URL(str);
            if (!str.contains("/accounts/") && !str.contains("/a/") && !str.contains("/video-channels/")) {
                if (!str.contains("/c/")) {
                    return false;
                }
            }
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.github.catvod.spider.merge.q1.c
    public final String q(String str, List list) {
        return r(str, list, l.b.i());
    }

    @Override // com.github.catvod.spider.merge.q1.c
    public final String r(String str, List list, String str2) {
        StringBuilder sbB;
        String str3;
        if (str.matches("((accounts|a)|(video-channels|c))/([^/?&#]*)")) {
            str = s(str);
            sbB = t0.b(str2);
            str3 = "/";
        } else {
            sbB = t0.b(str2);
            str3 = "/accounts/";
        }
        return C1290c.b(sbB, str3, str);
    }
}
