package com.github.catvod.spider.merge.u1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.I1.q;
import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.c1.m;
import com.github.catvod.spider.merge.e1.C1032c;
import com.github.catvod.spider.merge.e1.C1041l;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import com.github.catvod.spider.merge.m1.o;
import com.github.catvod.spider.merge.p1.C1368e;
import com.github.catvod.spider.merge.q1.C1380a;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class k extends com.github.catvod.spider.merge.I1.f {
    private com.github.catvod.spider.merge.D0.e e;
    private com.github.catvod.spider.merge.D0.e f;
    private com.github.catvod.spider.merge.c1.h g;

    public k(o oVar, C1380a c1380a) {
        super(oVar, c1380a);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public long A() {
        Object obj = this.e.b("trackinfo").a(0).get("duration");
        return (long) (obj instanceof Number ? ((Number) obj).doubleValue() : 0.0d);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public String B() {
        switch (this.f.e("license_type", 0)) {
            case 1:
                return "All rights reserved ©";
            case 2:
                return "CC BY-NC-ND 3.0";
            case 3:
                return "CC BY-NC-SA 3.0";
            case 4:
                return "CC BY-NC 3.0";
            case 5:
                return "CC BY-ND 3.0";
            case 6:
                return "CC BY 3.0";
            case 7:
            default:
                return "Unknown";
            case 8:
                return "CC BY-SA 3.0";
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int H() {
        return 3;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public List<String> N() {
        com.github.catvod.spider.merge.c1.h hVar = this.g;
        hVar.getClass();
        return (List) C1032c.a(new C1041l("itemprop", "keywords"), hVar).stream().map(c.a).collect(Collectors.toList());
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public String O() {
        return this.f.i("publish_date", null);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public List<C1311c> P() {
        com.github.catvod.spider.merge.D0.e eVar = this.e;
        return eVar.containsKey("art_id") && eVar.get("art_id") == null ? Collections.emptyList() : b.c(this.e.f("art_id"), true);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.r1.b S() {
        return b.g(O());
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public List<C1311c> T() {
        return b.d((String) this.g.X("band-photo").stream().map(new Function() { // from class: com.github.catvod.spider.merge.u1.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((m) obj).c("src");
            }
        }).findFirst().orElse(""));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public String U() {
        return this.e.i("artist", null);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public String W() {
        return t0.a("https://", n().split("/")[2], "/");
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
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public com.github.catvod.spider.merge.s1.c F() {
        com.github.catvod.spider.merge.s1.c cVar = new com.github.catvod.spider.merge.s1.c(l());
        this.g.X("recommended-album").stream().map(new Function() { // from class: com.github.catvod.spider.merge.u1.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new f((m) obj);
            }
        }).forEach(new g(cVar, 0));
        return cVar;
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public String i() {
        return this.f.i("title", null);
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public String n() {
        return com.github.catvod.spider.merge.L1.m.p(this.e.i("url", null));
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public void o(AbstractC0901a abstractC0901a) throws C1368e {
        String strC = abstractC0901a.d(h().d()).c();
        this.g = l.e(strC);
        try {
            com.github.catvod.spider.merge.D0.e eVarD = com.github.catvod.spider.merge.L1.b.d(strC, "data-tralbum");
            this.e = eVarD;
            this.f = eVarD.g("current");
            if (this.e.b("trackinfo").size() > 1) {
                throw new C1368e("Page is actually an album, not a track");
            }
            com.github.catvod.spider.merge.D0.e eVarA = this.e.b("trackinfo").a(0);
            if (eVarA.containsKey("file") && eVarA.get("file") == null) {
                throw new com.github.catvod.spider.merge.p1.h("This track is not available without being purchased");
            }
        } catch (com.github.catvod.spider.merge.D0.h e) {
            throw new com.github.catvod.spider.merge.p1.i("Faulty JSON; page likely does not contain album data", e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new com.github.catvod.spider.merge.p1.i("JSON does not exist", e2);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public List<com.github.catvod.spider.merge.I1.b> q() {
        com.github.catvod.spider.merge.I1.a aVar = new com.github.catvod.spider.merge.I1.a();
        aVar.u("mp3-128");
        aVar.s(this.e.b("trackinfo").a(0).g("file").i("mp3-128", null), true);
        aVar.x(EnumC1316h.MP3);
        aVar.r(128);
        return Collections.singletonList(aVar.m());
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public String r() {
        return (String) this.g.X("tralbum-tags").stream().flatMap(new Function() { // from class: com.github.catvod.spider.merge.u1.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((m) obj).X("tag").stream();
            }
        }).map(c.a).findFirst().orElse("");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public com.github.catvod.spider.merge.I1.c t() {
        boolean z = true;
        String[] strArr = {this.f.i("about", null), this.f.i("lyrics", null), this.f.i("credits", null)};
        int i = com.github.catvod.spider.merge.L1.m.c;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            String str = strArr[i2];
            if (!com.github.catvod.spider.merge.L1.m.j(str) && !str.equals("null")) {
                if (!z) {
                    sb.append((CharSequence) "\n\n");
                }
                sb.append(str);
                z = false;
            }
        }
        return new com.github.catvod.spider.merge.I1.c(sb.toString(), 3);
    }
}
