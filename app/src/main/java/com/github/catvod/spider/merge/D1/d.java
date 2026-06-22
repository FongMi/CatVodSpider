package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.C.u;
import com.github.catvod.spider.merge.D0.g;
import com.github.catvod.spider.merge.D0.h;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.I1.f;
import com.github.catvod.spider.merge.I1.q;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.AbstractC1315g;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import com.github.catvod.spider.merge.m1.k;
import com.github.catvod.spider.merge.m1.l;
import com.github.catvod.spider.merge.m1.o;
import com.github.catvod.spider.merge.o1.C1361c;
import com.github.catvod.spider.merge.p1.C1366c;
import com.github.catvod.spider.merge.p1.C1368e;
import com.github.catvod.spider.merge.p1.i;
import com.github.catvod.spider.merge.q1.C1380a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d extends f {
    private com.github.catvod.spider.merge.D0.e e;
    private boolean f;

    public d(o oVar, C1380a c1380a) {
        super(oVar, c1380a);
        this.f = true;
    }

    public static void b0(d dVar, List list, com.github.catvod.spider.merge.D0.e eVar) {
        dVar.getClass();
        String strI = eVar.i("url", null);
        if (m.j(strI)) {
            return;
        }
        try {
            String strI2 = eVar.i("preset", " ");
            String strI3 = eVar.g("format").i("protocol", null);
            if (strI3.contains("encrypted")) {
                return;
            }
            com.github.catvod.spider.merge.I1.a aVar = new com.github.catvod.spider.merge.I1.a();
            aVar.u(strI2);
            if (strI3.equals("hls")) {
                aVar.t(3);
            }
            aVar.s(dVar.c0(strI), true);
            if (strI2.contains("mp3")) {
                aVar.x(EnumC1316h.MP3);
                aVar.r(128);
            } else if (strI2.contains("opus")) {
                aVar.x(EnumC1316h.OPUS);
                aVar.r(64);
            } else {
                if (!strI2.contains("aac_160k")) {
                    return;
                }
                aVar.x(EnumC1316h.M4A);
                aVar.r(160);
            }
            com.github.catvod.spider.merge.I1.b bVarM = aVar.m();
            if (com.github.catvod.spider.merge.I1.e.a(bVarM, list)) {
                return;
            }
            list.add(bVarM);
        } catch (C1368e | IOException unused) {
        }
    }

    private String c0(String str) throws i {
        String strA = t0.a(str, "?client_id=", com.github.catvod.spider.merge.C1.b.a());
        String strI = this.e.i("track_authorization", null);
        if (!m.j(strI)) {
            strA = t0.a(strA, "&track_authorization=", strI);
        }
        try {
            return g.d().a(k.a().d(strA).c()).i("url", null);
        } catch (h e) {
            throw new i("Could not parse streamable URL", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long A() {
        return this.e.f("duration") / 1000;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String B() {
        return this.e.i("license", null);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long C() {
        Object obj = this.e.get("likes_count");
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return -1L;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int E() {
        return this.e.i("sharing", null).equals("public") ? 1 : 3;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final AbstractC1315g F() throws IOException, i {
        com.github.catvod.spider.merge.I1.k kVar = new com.github.catvod.spider.merge.I1.k(l());
        C1361c c1361cF = k.a().f("https://api-v2.soundcloud.com/tracks/" + m.c(g()) + "/related?client_id=" + m.c(com.github.catvod.spider.merge.C1.b.a()), null, l.a.b());
        if (c1361cF.d() >= 400) {
            throw new IOException(u.b("Could not get streams from API, HTTP ", c1361cF.d()));
        }
        try {
            com.github.catvod.spider.merge.D0.e eVarA = g.d().a(c1361cF.c());
            for (Object obj : eVarA.b("collection")) {
                if (obj instanceof com.github.catvod.spider.merge.D0.e) {
                    kVar.d(new e((com.github.catvod.spider.merge.D0.e) obj));
                }
            }
            try {
                if (!eVarA.i("next_href", null).contains("client_id=")) {
                    com.github.catvod.spider.merge.C1.b.a();
                }
            } catch (Exception unused) {
            }
            return kVar;
        } catch (h e) {
            throw new i("Could not parse json response", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int H() {
        return 3;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<String> N() {
        String[] strArrSplit = this.e.i("tag_list", null).split(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (String str : strArrSplit) {
            if (str.startsWith("\"")) {
                sb.append(str.replace("\"", ""));
                z = true;
            } else if (z) {
                boolean zEndsWith = str.endsWith("\"");
                sb.append(" ");
                if (zEndsWith) {
                    sb.append(str.replace("\"", ""));
                    arrayList.add(sb.toString());
                    z = false;
                } else {
                    sb.append(str);
                }
            } else if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String O() {
        return this.e.i("created_at", null);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> P() {
        return com.github.catvod.spider.merge.C1.b.c(this.e);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long Q() {
        long jR = R("(#t=\\d{0,3}h?\\d{0,3}m?\\d{1,3}s?)");
        if (jR == -2) {
            return 0L;
        }
        return jR;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.r1.b S() {
        return com.github.catvod.spider.merge.C1.b.d(this.e.i("created_at", null));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> T() {
        com.github.catvod.spider.merge.D0.e eVar = this.e;
        int i = com.github.catvod.spider.merge.C1.b.d;
        return com.github.catvod.spider.merge.C1.b.b(m.p(eVar.g("user").i("avatar_url", "")));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String U() {
        com.github.catvod.spider.merge.D0.e eVar = this.e;
        int i = com.github.catvod.spider.merge.C1.b.d;
        return eVar.g("user").i("username", "");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String W() {
        com.github.catvod.spider.merge.D0.e eVar = this.e;
        int i = com.github.catvod.spider.merge.C1.b.d;
        return m.p(eVar.g("user").i("permalink_url", ""));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<q> X() {
        return Collections.emptyList();
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<q> Y() {
        return Collections.emptyList();
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long Z() {
        return this.e.f("playback_count");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final boolean a0() {
        return this.e.g("user").c("verified");
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final String g() {
        return String.valueOf(this.e.f("id"));
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final String i() {
        return this.e.i("title", null);
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final void o(AbstractC0901a abstractC0901a) throws i {
        String strN = n();
        int i = com.github.catvod.spider.merge.C1.b.d;
        try {
            com.github.catvod.spider.merge.D0.e eVarA = g.d().a(abstractC0901a.f("https://api-v2.soundcloud.com/resolve?url=" + m.c(strN) + "&client_id=" + com.github.catvod.spider.merge.C1.b.a(), null, l.a.b()).c());
            this.e = eVarA;
            String strI = eVarA.i("policy", "");
            if (strI.equals("ALLOW") || strI.equals("MONETIZE")) {
                return;
            }
            this.f = false;
            if (strI.equals("SNIP")) {
                throw new com.github.catvod.spider.merge.p1.m();
            }
            if (!strI.equals("BLOCK")) {
                throw new C1366c(C1290c.a("Content not available: policy ", strI));
            }
            throw new com.github.catvod.spider.merge.p1.g("This track is not available in user's country");
        } catch (h e) {
            throw new i("Could not parse json response", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.b> q() throws C1368e {
        final ArrayList arrayList = new ArrayList();
        if (!this.e.c("streamable") || !this.f) {
            return arrayList;
        }
        try {
            com.github.catvod.spider.merge.D0.c cVarB = this.e.g("media").b("transcodings");
            if (!m.k(cVarB)) {
                cVarB.stream().filter(new c(com.github.catvod.spider.merge.D0.e.class, 0)).map(new b(com.github.catvod.spider.merge.D0.e.class, 0)).forEachOrdered(new Consumer() { // from class: com.github.catvod.spider.merge.D1.a
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        d.b0(this.a, arrayList, (com.github.catvod.spider.merge.D0.e) obj);
                    }
                });
            }
            return arrayList;
        } catch (NullPointerException e) {
            throw new C1368e("Could not get audio streams", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String r() {
        return this.e.i("genre", null);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.I1.c t() {
        return new com.github.catvod.spider.merge.I1.c(this.e.i("description", null), 3);
    }
}
