package com.github.catvod.spider.merge.A1;

import com.github.catvod.spider.merge.C.u;
import com.github.catvod.spider.merge.D0.g;
import com.github.catvod.spider.merge.D0.h;
import com.github.catvod.spider.merge.H0.j;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.I1.f;
import com.github.catvod.spider.merge.I1.k;
import com.github.catvod.spider.merge.I1.l;
import com.github.catvod.spider.merge.I1.n;
import com.github.catvod.spider.merge.I1.o;
import com.github.catvod.spider.merge.I1.p;
import com.github.catvod.spider.merge.I1.q;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.g0.C1202A;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.AbstractC1315g;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import com.github.catvod.spider.merge.o1.C1361c;
import com.github.catvod.spider.merge.p1.C1366c;
import com.github.catvod.spider.merge.p1.C1368e;
import com.github.catvod.spider.merge.p1.i;
import com.github.catvod.spider.merge.q1.C1380a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d extends f {
    private final String e;
    private com.github.catvod.spider.merge.D0.e f;
    private final List<o> g;
    private final List<com.github.catvod.spider.merge.I1.b> h;
    private final List<q> i;
    private i j;

    public d(com.github.catvod.spider.merge.m1.o oVar, C1380a c1380a) {
        super(oVar, c1380a);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = null;
        this.e = c();
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.b>] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.b>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.b>] */
    private void b0(com.github.catvod.spider.merge.D0.e eVar, boolean z, String str, String str2, String str3, String str4) {
        String strSubstring = str3.substring(str3.lastIndexOf(".") + 1);
        EnumC1316h enumC1316hA = EnumC1316h.a(strSubstring);
        String strA = t0.a(str, "-", strSubstring);
        List<o> r4 = this.h;
        com.github.catvod.spider.merge.I1.a aVar = new com.github.catvod.spider.merge.I1.a();
        aVar.u(strA + "-" + str2 + "-" + j.c(1));
        aVar.s(str3, true);
        aVar.x(enumC1316hA);
        aVar.r(-1);
        r4.add(aVar.m());
        if (!m.j(str4)) {
            String strE0 = z ? e0(eVar, str2, strSubstring, str3) : str4.replace("master", com.github.catvod.spider.merge.L1.b.e(eVar).toString());
            com.github.catvod.spider.merge.I1.a aVar2 = new com.github.catvod.spider.merge.I1.a();
            StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(strA, "-");
            sbA.append(j.c(3));
            aVar2.u(sbA.toString());
            aVar2.s(strE0, true);
            aVar2.t(3);
            aVar2.x(enumC1316hA);
            aVar2.r(-1);
            aVar2.w(str4);
            com.github.catvod.spider.merge.I1.b bVarM = aVar2.m();
            if (!com.github.catvod.spider.merge.I1.e.a(bVarM, this.h)) {
                this.h.add(bVarM);
            }
        }
        String strG = com.github.catvod.spider.merge.L1.b.g(eVar, "torrentUrl");
        if (m.j(strG)) {
            return;
        }
        List<com.github.catvod.spider.merge.I1.b> r10 = this.h;
        com.github.catvod.spider.merge.I1.a aVar3 = new com.github.catvod.spider.merge.I1.a();
        aVar3.u(strA + "-" + str2 + "-" + j.c(5));
        aVar3.s(strG, true);
        aVar3.t(5);
        aVar3.x(enumC1316hA);
        aVar3.r(-1);
        r10.add(aVar3.m());
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.q>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.q>] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.q>] */
    private void c0(com.github.catvod.spider.merge.D0.e eVar, boolean z, String str, String str2, String str3, String str4) {
        String strSubstring = str3.substring(str3.lastIndexOf(".") + 1);
        EnumC1316h enumC1316hA = EnumC1316h.a(strSubstring);
        String strA = t0.a(str, "-", strSubstring);
        boolean z2 = eVar.containsKey("hasAudio") && !eVar.d("hasAudio");
        List<q> r12 = this.i;
        p pVar = new p();
        pVar.d(strA + "-" + str2 + "-" + j.c(1));
        pVar.b(str3, true);
        pVar.e(z2);
        pVar.i(str);
        pVar.h(enumC1316hA);
        r12.add(pVar.a());
        if (!m.j(str4)) {
            String strE0 = z ? e0(eVar, str2, strSubstring, str3) : str4.replace("master", com.github.catvod.spider.merge.L1.b.e(eVar).toString());
            p pVar2 = new p();
            StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(strA, "-");
            sbA.append(j.c(3));
            pVar2.d(sbA.toString());
            pVar2.b(strE0, true);
            pVar2.e(z2);
            pVar2.c(3);
            pVar2.i(str);
            pVar2.h(enumC1316hA);
            pVar2.g(str4);
            q qVarA = pVar2.a();
            if (!com.github.catvod.spider.merge.I1.e.a(qVarA, this.i)) {
                this.i.add(qVarA);
            }
        }
        String strG = com.github.catvod.spider.merge.L1.b.g(eVar, "torrentUrl");
        if (m.j(strG)) {
            return;
        }
        List<q> r4 = this.i;
        p pVar3 = new p();
        pVar3.d(strA + "-" + str2 + "-" + j.c(5));
        pVar3.b(strG, true);
        pVar3.e(z2);
        pVar3.c(5);
        pVar3.i(str);
        pVar3.h(enumC1316hA);
        r4.add(pVar3.a());
    }

    private com.github.catvod.spider.merge.D0.e d0(String str) throws i {
        C1361c c1361cD = d().d(this.e + "/api/v1/videos/" + g() + "/" + str);
        if (c1361cD == null) {
            throw new i("Could not get segments from API.");
        }
        if (c1361cD.d() == 400) {
            return null;
        }
        if (c1361cD.d() != 200) {
            throw new i(u.b("Could not get segments from API. Response code: ", c1361cD.d()));
        }
        try {
            return g.d().a(c1361cD.c());
        } catch (h e) {
            throw new i("Could not parse json data for segments", e);
        }
    }

    private String e0(com.github.catvod.spider.merge.D0.e eVar, String str, String str2, String str3) {
        if ("fileDownloadUrl".equals(str)) {
            str3 = com.github.catvod.spider.merge.L1.b.g(eVar, "fileUrl");
        }
        return str3.replace("-fragmented." + str2, ".m3u8");
    }

    private void f0() throws i {
        g0(this.f.b("files"), "");
        try {
            for (com.github.catvod.spider.merge.D0.e eVar : (List) this.f.b("streamingPlaylists").stream().filter(new com.github.catvod.spider.merge.D0.b(com.github.catvod.spider.merge.D0.e.class, 1)).map(new com.github.catvod.spider.merge.D0.a(com.github.catvod.spider.merge.D0.e.class, 1)).collect(Collectors.toList())) {
                g0(eVar.b("files"), eVar.i("playlistUrl", null));
            }
        } catch (Exception e) {
            throw new i("Could not get streams", e);
        }
    }

    private void g0(com.github.catvod.spider.merge.D0.c cVar, String str) throws i {
        try {
            boolean z = !m.j(str) && str.endsWith("-master.m3u8");
            for (com.github.catvod.spider.merge.D0.e eVar : (List) cVar.stream().filter(new c(com.github.catvod.spider.merge.D0.e.class, 0)).map(new a(com.github.catvod.spider.merge.D0.e.class, 0)).collect(Collectors.toList())) {
                String strG = com.github.catvod.spider.merge.L1.b.g(eVar, eVar.containsKey("fileUrl") ? "fileUrl" : "fileDownloadUrl");
                if (m.j(strG)) {
                    return;
                }
                String strG2 = com.github.catvod.spider.merge.L1.b.g(eVar, "resolution.label");
                String str2 = eVar.containsKey("fileUrl") ? "fileUrl" : "fileDownloadUrl";
                if (strG2.toLowerCase().contains("audio")) {
                    b0(eVar, z, strG2, str2, strG, str);
                } else {
                    c0(eVar, z, strG2, str2, strG, str);
                }
            }
        } catch (Exception e) {
            throw new i("Could not get streams from array", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long A() {
        return this.f.f("duration");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String B() {
        return com.github.catvod.spider.merge.L1.b.g(this.f, "licence.label");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long C() {
        return this.f.f("likes");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int E() {
        int iE = this.f.g("privacy").e("id", 0);
        int i = 1;
        if (iE != 1) {
            i = 2;
            if (iE != 2) {
                i = 3;
                if (iE != 3) {
                    i = 4;
                    if (iE != 4) {
                        return 5;
                    }
                }
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final AbstractC1315g F() throws i {
        String str;
        List<String> listH = com.github.catvod.spider.merge.L1.b.h(this.f.b("tags"));
        if (listH.isEmpty()) {
            str = this.e + "/api/v1/accounts/" + com.github.catvod.spider.merge.L1.b.g(this.f, "account.name") + "@" + com.github.catvod.spider.merge.L1.b.g(this.f, "account.host") + "/videos?start=0&count=8";
        } else {
            String strA = C1290c.a(this.e, "/api/v1/search/videos");
            StringBuilder sbB = t0.b("start=0&count=8&sort=-createdAt");
            for (String str2 : listH) {
                sbB.append("&tagsOneOf=");
                sbB.append(m.c(str2));
            }
            str = strA + "?" + ((Object) sbB);
        }
        com.github.catvod.spider.merge.D0.e eVarA = null;
        if (m.h(str)) {
            return null;
        }
        k kVar = new k(l());
        C1361c c1361cD = d().d(str);
        if (c1361cD != null && !m.h(c1361cD.c())) {
            try {
                eVarA = g.d().a(c1361cD.c());
            } catch (h e) {
                throw new i("Could not parse json data for related videos", e);
            }
        }
        if (eVarA != null) {
            try {
                for (Object obj : (com.github.catvod.spider.merge.D0.c) com.github.catvod.spider.merge.L1.b.i(eVarA, "data")) {
                    if (obj instanceof com.github.catvod.spider.merge.D0.e) {
                        e eVar = new e((com.github.catvod.spider.merge.D0.e) obj, this.e);
                        if (!eVar.f().equals(n())) {
                            kVar.d(eVar);
                        }
                    }
                }
            } catch (Exception e2) {
                throw new i("Could not extract related videos", e2);
            }
        }
        return kVar;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<l> G() throws i {
        ArrayList arrayList = new ArrayList();
        try {
            com.github.catvod.spider.merge.D0.e eVarD0 = d0("chapters");
            if (eVarD0 != null && eVarD0.containsKey("chapters")) {
                com.github.catvod.spider.merge.D0.c cVarB = eVarD0.b("chapters");
                for (int i = 0; i < cVarB.size(); i++) {
                    com.github.catvod.spider.merge.D0.e eVarA = cVarB.a(i);
                    eVarA.i("title", null);
                    eVarA.e("timecode", 0);
                    arrayList.add(new l());
                }
            }
            return arrayList;
        } catch (com.github.catvod.spider.merge.p1.k | IOException e) {
            throw new i("Could not get stream segments", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int H() {
        return this.f.d("isLive") ? 4 : 2;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> I() {
        return com.github.catvod.spider.merge.z1.f.a(this.e, this.f.g("channel"));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String J() {
        return com.github.catvod.spider.merge.L1.b.g(this.f, "channel.displayName");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String K() {
        return com.github.catvod.spider.merge.L1.b.g(this.f, "channel.url");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<o> L() throws i {
        i iVar = this.j;
        if (iVar == null) {
            return this.g;
        }
        throw iVar;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String M() {
        try {
            return com.github.catvod.spider.merge.L1.b.g(this.f, "support");
        } catch (i unused) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<String> N() {
        return com.github.catvod.spider.merge.L1.b.h(this.f.b("tags"));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String O() {
        return com.github.catvod.spider.merge.L1.b.g(this.f, "publishedAt");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> P() {
        return com.github.catvod.spider.merge.z1.f.b(this.e, this.f);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long Q() {
        long jR = R("((#|&|\\?)start=\\d{0,3}h?\\d{0,3}m?\\d{1,3}s?)");
        if (jR == -2) {
            return 0L;
        }
        return jR;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.r1.b S() {
        return com.github.catvod.spider.merge.r1.b.a(com.github.catvod.spider.merge.L1.b.g(this.f, "publishedAt"));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> T() {
        return com.github.catvod.spider.merge.z1.f.a(this.e, this.f.g("account"));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String U() {
        return com.github.catvod.spider.merge.L1.b.g(this.f, "account.displayName");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String W() {
        String strG = com.github.catvod.spider.merge.L1.b.g(this.f, "account.name");
        String strG2 = com.github.catvod.spider.merge.L1.b.g(this.f, "account.host");
        return k().a().o("accounts/" + strG + "@" + strG2, this.e).d();
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<q> X() {
        return Collections.emptyList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.q>] */
    @Override // com.github.catvod.spider.merge.I1.f
    public final List<q> Y() throws i {
        a();
        if (this.i.isEmpty()) {
            if (H() == 2) {
                f0();
            } else {
                try {
                    Stream map = this.f.b("streamingPlaylists").stream().filter(new com.github.catvod.spider.merge.z1.d(com.github.catvod.spider.merge.D0.e.class, 1)).map(new com.github.catvod.spider.merge.z1.b(com.github.catvod.spider.merge.D0.e.class, 1)).map(new Function() { // from class: com.github.catvod.spider.merge.A1.b
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) obj;
                            p pVar = new p();
                            pVar.d(String.valueOf(eVar.e("id", -1)));
                            pVar.b(eVar.i("playlistUrl", ""), true);
                            pVar.e(false);
                            pVar.i("");
                            pVar.h(EnumC1316h.MPEG_4);
                            pVar.c(3);
                            return pVar.a();
                        }
                    });
                    List<q> list = this.i;
                    list.getClass();
                    map.forEachOrdered(new C1202A(list, 1));
                } catch (Exception e) {
                    throw new i("Could not get video streams", e);
                }
            }
        }
        return this.i;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long Z() {
        return this.f.f("views");
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final String i() {
        return com.github.catvod.spider.merge.L1.b.g(this.f, "name");
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.o>] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.o>] */
    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final void o(AbstractC0901a abstractC0901a) throws C1368e {
        C1361c c1361cD = abstractC0901a.d(this.e + "/api/v1/videos/" + g());
        if (c1361cD == null) {
            throw new C1368e("Could not extract PeerTube channel data");
        }
        try {
            com.github.catvod.spider.merge.D0.e eVarA = g.d().a(c1361cD.c());
            this.f = eVarA;
            if (eVarA == null) {
                throw new C1368e("Could not extract PeerTube stream data");
            }
            String strI = eVarA.i("error", null);
            if (!m.h(strI)) {
                throw new C1366c(strI);
            }
            if (this.g.isEmpty()) {
                try {
                    for (Object obj : com.github.catvod.spider.merge.L1.b.a(g.d().a(d().d(this.e + "/api/v1/videos/" + g() + "/captions").c()), "data")) {
                        if (obj instanceof com.github.catvod.spider.merge.D0.e) {
                            com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) obj;
                            String str = this.e + com.github.catvod.spider.merge.L1.b.g(eVar, "captionPath");
                            String strG = com.github.catvod.spider.merge.L1.b.g(eVar, "language.id");
                            EnumC1316h enumC1316hA = EnumC1316h.a(str.substring(str.lastIndexOf(".") + 1));
                            if (enumC1316hA != null && !m.j(strG)) {
                                List<o> r3 = this.g;
                                n nVar = new n();
                                nVar.c(str);
                                nVar.e(enumC1316hA);
                                nVar.d(strG);
                                nVar.b(false);
                                r3.add(nVar.a());
                            }
                        }
                    }
                } catch (Exception e) {
                    this.j = new i("Could not get subtitles", e);
                }
            }
        } catch (h e2) {
            throw new C1368e("Could not extract PeerTube stream data", e2);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int p() {
        return com.github.catvod.spider.merge.L1.b.b(this.f).booleanValue() ? 18 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.b>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.I1.q>] */
    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.b> q() throws i {
        a();
        if (this.h.isEmpty() && this.i.isEmpty() && H() == 2) {
            f0();
        }
        return this.h;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String r() {
        return com.github.catvod.spider.merge.L1.b.g(this.f, "category.label");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.I1.c t() {
        try {
            String strG = com.github.catvod.spider.merge.L1.b.g(this.f, "description");
            if (strG.length() == 250 && strG.substring(247).equals("...")) {
                AbstractC0901a abstractC0901aA = com.github.catvod.spider.merge.m1.k.a();
                try {
                    strG = com.github.catvod.spider.merge.L1.b.g(g.d().a(abstractC0901aA.d(this.e + "/api/v1/videos/" + g() + "/description").c()), "description");
                } catch (h | com.github.catvod.spider.merge.p1.k | IOException unused) {
                }
            }
            return new com.github.catvod.spider.merge.I1.c(strG, 2);
        } catch (i unused2) {
            return com.github.catvod.spider.merge.I1.c.d;
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long u() {
        return this.f.f("dislikes");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.d> w() throws C1368e {
        ArrayList arrayList = new ArrayList();
        try {
            com.github.catvod.spider.merge.D0.e eVarD0 = d0("storyboards");
            if (eVarD0 != null && eVarD0.containsKey("storyboards")) {
                for (Object obj : eVarD0.b("storyboards")) {
                    if (obj instanceof com.github.catvod.spider.merge.D0.e) {
                        com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) obj;
                        String strI = eVar.i("storyboardPath", null);
                        int iE = eVar.e("spriteWidth", 0);
                        int iE2 = eVar.e("spriteHeight", 0);
                        int iE3 = eVar.e("totalWidth", 0) / iE;
                        int iE4 = eVar.e("totalHeight", 0) / iE2;
                        eVar.e("spriteDuration", 0);
                        Object[] objArr = {C1290c.a(this.e, strI)};
                        ArrayList arrayList2 = new ArrayList(1);
                        for (int i = 0; i < 1; i++) {
                            Object obj2 = objArr[i];
                            obj2.getClass();
                            arrayList2.add(obj2);
                        }
                        Collections.unmodifiableList(arrayList2);
                        arrayList.add(new com.github.catvod.spider.merge.I1.d());
                    }
                }
            }
            return arrayList;
        } catch (com.github.catvod.spider.merge.p1.k | IOException e) {
            throw new C1368e("Could not get frames", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String x() {
        a();
        return ((H() != 2 || m.l(this.f.g("files"))) ? this.f.b("streamingPlaylists").a(0) : this.f.g("files")).i("playlistUrl", "");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String y() {
        return com.github.catvod.spider.merge.L1.b.g(this.f, "account.host");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final Locale z() {
        try {
            return new Locale(com.github.catvod.spider.merge.L1.b.g(this.f, "language.id"));
        } catch (i unused) {
            return null;
        }
    }
}
