package com.github.catvod.spider.merge.x1;

import com.github.catvod.spider.merge.I1.p;
import com.github.catvod.spider.merge.I1.q;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import com.github.catvod.spider.merge.m1.o;
import com.github.catvod.spider.merge.p1.C1368e;
import com.github.catvod.spider.merge.q1.C1380a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class n extends com.github.catvod.spider.merge.I1.f {
    private com.github.catvod.spider.merge.D0.e e;
    private com.github.catvod.spider.merge.D0.e f;

    public n(o oVar, C1380a c1380a) {
        super(oVar, c1380a);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long A() {
        return this.e.e("length", 0);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int H() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<String> N() {
        return com.github.catvod.spider.merge.L1.b.h(this.e.b("tags"));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String O() {
        return this.e.i("release_date", null);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> P() {
        return l.d(this.e);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.r1.b S() {
        return com.github.catvod.spider.merge.r1.b.b(this.e.i("release_date", null));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> T() {
        String strI = this.f.i("logo_url", null);
        int i = l.c;
        if (com.github.catvod.spider.merge.L1.m.j(strI)) {
            return Collections.emptyList();
        }
        Object[] objArr = {new C1311c(strI, -1, -1, 4)};
        ArrayList arrayList = new ArrayList(1);
        for (int i2 = 0; i2 < 1; i2++) {
            Object obj = objArr[i2];
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String U() {
        return this.e.i("conference_url", null).replaceFirst("https://(api\\.)?media\\.ccc\\.de/public/conferences/", "");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String W() {
        return C1290c.a("https://media.ccc.de/c/", this.e.i("conference_url", null).replaceFirst("https://(api\\.)?media\\.ccc\\.de/public/conferences/", ""));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<q> X() {
        return Collections.emptyList();
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<q> Y() {
        com.github.catvod.spider.merge.D0.c cVarB = this.e.b("recordings");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cVarB.size(); i++) {
            com.github.catvod.spider.merge.D0.e eVarA = cVarB.a(i);
            String strI = eVarA.i("mime_type", null);
            if (strI.startsWith("video")) {
                EnumC1316h enumC1316h = strI.endsWith("webm") ? EnumC1316h.WEBM : strI.endsWith("mp4") ? EnumC1316h.MPEG_4 : null;
                p pVar = new p();
                pVar.d(eVarA.i("filename", " "));
                pVar.b(eVarA.i("recording_url", null), true);
                pVar.e(false);
                pVar.h(enumC1316h);
                pVar.i(eVarA.e("height", 0) + "p");
                arrayList.add(pVar.a());
            }
        }
        return arrayList;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long Z() {
        return this.e.e("view_count", 0);
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final String i() {
        return this.e.i("title", null);
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final String j() {
        return this.e.i("frontend_link", null);
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final void o(AbstractC0901a abstractC0901a) throws C1368e {
        String str = "https://api.media.ccc.de/public/events/" + g();
        try {
            this.e = com.github.catvod.spider.merge.D0.g.d().a(abstractC0901a.d(str).c());
            this.f = com.github.catvod.spider.merge.D0.g.d().a(abstractC0901a.d(this.e.i("conference_url", null)).c());
        } catch (com.github.catvod.spider.merge.D0.h e) {
            throw new C1368e(C1290c.a("Could not parse json returned by URL: ", str), e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.b> q() {
        com.github.catvod.spider.merge.D0.c cVarB = this.e.b("recordings");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cVarB.size(); i++) {
            com.github.catvod.spider.merge.D0.e eVarA = cVarB.a(i);
            String strI = eVarA.i("mime_type", null);
            if (strI.startsWith("audio")) {
                EnumC1316h enumC1316h = strI.endsWith("opus") ? EnumC1316h.OPUS : strI.endsWith("mpeg") ? EnumC1316h.MP3 : strI.endsWith("ogg") ? EnumC1316h.OGG : null;
                com.github.catvod.spider.merge.I1.a aVar = new com.github.catvod.spider.merge.I1.a();
                aVar.u(eVarA.i("filename", " "));
                aVar.s(eVarA.i("recording_url", null), true);
                aVar.x(enumC1316h);
                aVar.r(-1);
                final String strI2 = eVarA.i("language", null);
                if (strI2 != null && !strI2.contains("-")) {
                    aVar.n(com.github.catvod.spider.merge.L1.c.a(strI2).orElseThrow(new Supplier() { // from class: com.github.catvod.spider.merge.x1.m
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new com.github.catvod.spider.merge.p1.i(C1290c.a("Cannot convert this language to a locale: ", strI2));
                        }
                    }));
                }
                arrayList.add(aVar.m());
            }
        }
        return arrayList;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.I1.c t() {
        return new com.github.catvod.spider.merge.I1.c(this.e.i("description", null), 3);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final Locale z() throws com.github.catvod.spider.merge.p1.i {
        String strI = this.e.i("original_language", null);
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap map = new HashMap(iSOLanguages.length);
        for (String str : iSOLanguages) {
            Locale locale = new Locale(str);
            map.put(locale.getISO3Language(), locale);
        }
        if (map.containsKey(strI)) {
            return (Locale) map.get(strI);
        }
        throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Could not get Locale from this three letter language code", strI));
    }
}
