package com.github.catvod.spider.merge.u1;

import com.github.catvod.spider.merge.I1.l;
import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.e1.C1032c;
import com.github.catvod.spider.merge.e1.L;
import com.github.catvod.spider.merge.m1.AbstractC1315g;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import com.github.catvod.spider.merge.m1.o;
import com.github.catvod.spider.merge.p1.C1367d;
import com.github.catvod.spider.merge.q1.C1380a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e extends k {
    private com.github.catvod.spider.merge.D0.e h;

    public e(o oVar, C1380a c1380a) {
        super(oVar, c1380a);
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final long A() {
        return this.h.f("audio_duration");
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final String B() {
        return "";
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final /* bridge */ /* synthetic */ AbstractC1315g F() {
        return null;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<l> G() {
        com.github.catvod.spider.merge.D0.c<com.github.catvod.spider.merge.D0.e> cVarB = this.h.b("tracks");
        ArrayList arrayList = new ArrayList(cVarB.size());
        for (com.github.catvod.spider.merge.D0.e eVar : cVarB) {
            eVar.i("title", null);
            eVar.e("timecode", 0);
            l lVar = new l();
            eVar.f("track_art_id");
            int i = b.b;
            com.github.catvod.spider.merge.A.c.f('a');
            eVar.i("artist", null);
            arrayList.add(lVar);
        }
        return arrayList;
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final List<String> N() {
        return Collections.emptyList();
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final String O() {
        return this.h.i("published_date", null);
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final List<C1311c> P() {
        return b.c(this.h.f("show_image_id"), false);
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final List<C1311c> T() {
        return Collections.singletonList(new C1311c("https://bandcamp.com/img/buttons/bandcamp-button-circle-whitecolor-512.png", 512, 512, 2));
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final String U() {
        com.github.catvod.spider.merge.c1.h hVarE = com.github.catvod.spider.merge.L1.l.e(this.h.i("image_caption", null));
        hVarE.getClass();
        C0899d.f("a");
        return (String) C1032c.a(new L(com.github.catvod.spider.merge.g.b.c("a")), hVarE).stream().map(c.a).findFirst().orElseThrow(new Supplier() { // from class: com.github.catvod.spider.merge.u1.d
            @Override // java.util.function.Supplier
            public final Object get() {
                return new com.github.catvod.spider.merge.p1.i("Could not get uploader name");
            }
        });
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final String W() throws C1367d {
        throw new C1367d();
    }

    @Override // com.github.catvod.spider.merge.u1.k
    /* JADX INFO: renamed from: b0 */
    public final com.github.catvod.spider.merge.s1.c F() {
        return null;
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.m1.AbstractC1310b
    public final String i() {
        return this.h.i("subtitle", null);
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.m1.AbstractC1310b
    public final String n() {
        return h().d();
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.m1.AbstractC1310b
    public final void o(AbstractC0901a abstractC0901a) throws com.github.catvod.spider.merge.p1.i {
        int i = Integer.parseInt(g());
        try {
            this.h = com.github.catvod.spider.merge.D0.g.d().a(com.github.catvod.spider.merge.m1.k.a().d("https://bandcamp.com/api/bcweekly/1/get?id=" + i).c());
        } catch (com.github.catvod.spider.merge.D0.h | com.github.catvod.spider.merge.p1.k | IOException e) {
            throw new com.github.catvod.spider.merge.p1.i("could not get show data", e);
        }
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.b> q() {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.D0.e eVarG = this.h.g("audio_stream");
        if (eVarG.containsKey("mp3-128")) {
            com.github.catvod.spider.merge.I1.a aVar = new com.github.catvod.spider.merge.I1.a();
            aVar.u("mp3-128");
            aVar.s(eVarG.i("mp3-128", null), true);
            aVar.x(EnumC1316h.MP3);
            aVar.r(128);
            arrayList.add(aVar.m());
        }
        if (eVarG.containsKey("opus-lo")) {
            com.github.catvod.spider.merge.I1.a aVar2 = new com.github.catvod.spider.merge.I1.a();
            aVar2.u("opus-lo");
            aVar2.s(eVarG.i("opus-lo", null), true);
            aVar2.x(EnumC1316h.OPUS);
            aVar2.r(100);
            arrayList.add(aVar2.m());
        }
        return arrayList;
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final String r() {
        return "";
    }

    @Override // com.github.catvod.spider.merge.u1.k, com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.I1.c t() {
        return new com.github.catvod.spider.merge.I1.c(this.h.i("desc", null), 3);
    }
}
