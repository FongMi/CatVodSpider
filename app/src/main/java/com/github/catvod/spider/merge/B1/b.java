package com.github.catvod.spider.merge.B1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.L1.k;
import com.github.catvod.spider.merge.m1.l;
import com.github.catvod.spider.merge.p1.i;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b extends com.github.catvod.spider.merge.q1.c {
    private static final b a = new b();

    private b() {
    }

    public static b s() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) {
        try {
            return k.d("(/videos/watch/playlist/|/w/p/)([^/?&#]*)", str, 2);
        } catch (i unused) {
            return k.d("/video-playlists/([^/?&#]*)", str, 1);
        }
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        try {
            new URL(str);
            try {
                k.d("(/videos/watch/playlist/|/w/p/)([^/?&#]*)", str, 2);
            } catch (i unused) {
                k.d("/video-playlists/([^/?&#]*)", str, 1);
            }
            return true;
        } catch (i | MalformedURLException unused2) {
            return false;
        }
    }

    @Override // com.github.catvod.spider.merge.q1.c
    public final String q(String str, List list) {
        return r(str, list, l.b.i());
    }

    @Override // com.github.catvod.spider.merge.q1.c
    public final String r(String str, List list, String str2) {
        return t0.a(str2, "/api/v1/video-playlists/", str);
    }
}
