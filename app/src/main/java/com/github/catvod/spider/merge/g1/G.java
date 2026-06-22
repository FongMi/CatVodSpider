package com.github.catvod.spider.merge.G1;

import com.github.catvod.spider.merge.F1.C0628d;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.AbstractC1315g;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.C1317i;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import com.github.catvod.spider.merge.m1.InterfaceC1314f;
import com.github.catvod.spider.merge.p1.C1364a;
import com.github.catvod.spider.merge.p1.C1365b;
import com.github.catvod.spider.merge.p1.C1366c;
import com.github.catvod.spider.merge.p1.C1368e;
import com.github.catvod.spider.merge.q1.C1380a;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class G extends com.github.catvod.spider.merge.I1.f {
    private com.github.catvod.spider.merge.D0.e e;
    private com.github.catvod.spider.merge.D0.e f;
    private com.github.catvod.spider.merge.D0.e g;
    private com.github.catvod.spider.merge.D0.e h;
    private com.github.catvod.spider.merge.D0.e i;
    private com.github.catvod.spider.merge.D0.e j;
    private com.github.catvod.spider.merge.D0.e k;
    private com.github.catvod.spider.merge.D0.c l;
    private int m;
    private int n;
    private String o;

    public G(com.github.catvod.spider.merge.m1.o oVar, C1380a c1380a) {
        super(oVar, c1380a);
        this.m = -1;
    }

    public static com.github.catvod.spider.merge.I1.q c0(G g, boolean z, C0682a c0682a) {
        g.getClass();
        C0628d c0628dC = c0682a.c();
        com.github.catvod.spider.merge.I1.p pVar = new com.github.catvod.spider.merge.I1.p();
        pVar.d(String.valueOf(c0628dC.c));
        pVar.b(c0682a.a(), c0682a.b());
        pVar.h(c0628dC.m());
        pVar.e(z);
        pVar.f(c0628dC);
        String str = c0628dC.g;
        if (str == null) {
            str = "";
        }
        pVar.i(str);
        if (g.n != 2 || !c0682a.b()) {
            pVar.c(2);
        }
        return pVar.a();
    }

    public static C0682a d0(G g, int i, String str, String str2, String str3, com.github.catvod.spider.merge.D0.e eVar) {
        g.getClass();
        try {
            C0628d c0628dL = C0628d.l(eVar.e("itag", 0));
            int i2 = c0628dL.d;
            if (i2 == i) {
                return g.j0(str, eVar, c0628dL, i2, str2, str3);
            }
        } catch (C1368e unused) {
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.time.ZonedDateTime] */
    public static com.github.catvod.spider.merge.r1.b g0(LocalDate localDate) {
        return new com.github.catvod.spider.merge.r1.b(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant(), true);
    }

    public static Stream h0(final G g, final String str, String str2, final int i, com.github.catvod.spider.merge.L1.d dVar) {
        g.getClass();
        com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) dVar.a();
        final String str3 = (String) ((com.github.catvod.spider.merge.L1.d) dVar.b()).a();
        final String str4 = (String) ((com.github.catvod.spider.merge.L1.d) dVar.b()).b();
        if (eVar == null || !eVar.containsKey(str2)) {
            return Stream.empty();
        }
        final Class<com.github.catvod.spider.merge.D0.e> cls = com.github.catvod.spider.merge.D0.e.class;
        return eVar.b(str2).stream().filter(new Predicate() { // from class: com.github.catvod.spider.merge.G1.p
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance(obj);
            }
        }).map(new com.github.catvod.spider.merge.z1.c(com.github.catvod.spider.merge.D0.e.class, 1)).map(new Function() { // from class: com.github.catvod.spider.merge.G1.B
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return G.d0(this.a, i, str, str3, str4, (com.github.catvod.spider.merge.D0.e) obj);
            }
        }).filter(t.b);
    }

    public static com.github.catvod.spider.merge.I1.b i0(G g, C0682a c0682a) {
        g.getClass();
        C0628d c0628dC = c0682a.c();
        com.github.catvod.spider.merge.I1.a aVar = new com.github.catvod.spider.merge.I1.a();
        aVar.u(String.valueOf(c0628dC.c));
        aVar.s(c0682a.a(), c0682a.b());
        aVar.x(c0628dC.m());
        aVar.r(c0628dC.e);
        aVar.o(c0628dC.b());
        aVar.p(c0628dC.c());
        aVar.n(c0628dC.a());
        aVar.q(c0628dC.d());
        aVar.v(c0628dC);
        int i = g.n;
        if (i == 4 || i == 6 || !c0682a.b()) {
            aVar.t(2);
        }
        return aVar.m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.github.catvod.spider.merge.G1.C0682a j0(java.lang.String r10, com.github.catvod.spider.merge.D0.e r11, final com.github.catvod.spider.merge.F1.C0628d r12, int r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.G1.G.j0(java.lang.String, com.github.catvod.spider.merge.D0.e, com.github.catvod.spider.merge.F1.d, int, java.lang.String, java.lang.String):com.github.catvod.spider.merge.G1.a");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/github/catvod/spider/merge/I1/e;>(Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Function<Lcom/github/catvod/spider/merge/G1/a;TT;>;Ljava/lang/String;)Ljava/util/List<TT;>; */
    private List k0(final String str, final int i, Function function, String str2) throws com.github.catvod.spider.merge.p1.i {
        try {
            final String strG = g();
            final ArrayList arrayList = new ArrayList();
            Stream.of((Object[]) new com.github.catvod.spider.merge.L1.d[]{new com.github.catvod.spider.merge.L1.d(this.g, new com.github.catvod.spider.merge.L1.d(this.o, null)), new com.github.catvod.spider.merge.L1.d(null, new com.github.catvod.spider.merge.L1.d(null, null))}).flatMap(new Function() { // from class: com.github.catvod.spider.merge.G1.C
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return G.h0(this.a, strG, str, i, (com.github.catvod.spider.merge.L1.d) obj);
                }
            }).map(function).forEachOrdered(new Consumer() { // from class: com.github.catvod.spider.merge.G1.y
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    List list = arrayList;
                    com.github.catvod.spider.merge.I1.e eVar = (com.github.catvod.spider.merge.I1.e) obj;
                    if (com.github.catvod.spider.merge.I1.e.a(eVar, list)) {
                        return;
                    }
                    list.add(eVar);
                }
            });
            return arrayList;
        } catch (Exception e) {
            throw new com.github.catvod.spider.merge.p1.i(t0.a("Could not get ", str2, " streams"), e);
        }
    }

    private static String l0(String str, List<com.github.catvod.spider.merge.L1.d<com.github.catvod.spider.merge.D0.e, String>> list, String str2) {
        String strA = C1290c.a(str, "ManifestUrl");
        for (com.github.catvod.spider.merge.L1.d<com.github.catvod.spider.merge.D0.e, String> dVar : list) {
            if (dVar.a() != null) {
                String strI = ((com.github.catvod.spider.merge.D0.e) dVar.a()).i(strA, null);
                if (!com.github.catvod.spider.merge.L1.m.j(strI)) {
                    if (dVar.b() == null) {
                        return t0.a(strI, "?", str2);
                    }
                    return strI + "?pot=" + ((String) dVar.b()) + "&" + str2;
                }
            }
        }
        return "";
    }

    private com.github.catvod.spider.merge.D0.e m0(String str) {
        return (com.github.catvod.spider.merge.D0.e) this.f.g("contents").g("twoColumnWatchNextResults").g("results").g("results").b("contents").stream().filter(new com.github.catvod.spider.merge.D0.b(com.github.catvod.spider.merge.D0.e.class, 2)).map(new com.github.catvod.spider.merge.D0.a(com.github.catvod.spider.merge.D0.e.class, 2)).filter(new C0696o(str, 0)).map(new z(str, 0)).findFirst().orElse(new com.github.catvod.spider.merge.D0.e());
    }

    private com.github.catvod.spider.merge.D0.e n0() {
        com.github.catvod.spider.merge.D0.e eVar = this.h;
        if (eVar != null) {
            return eVar;
        }
        com.github.catvod.spider.merge.D0.e eVarM0 = m0("videoPrimaryInfoRenderer");
        this.h = eVarM0;
        return eVarM0;
    }

    private com.github.catvod.spider.merge.D0.e o0() {
        com.github.catvod.spider.merge.D0.e eVar = this.i;
        if (eVar != null) {
            return eVar;
        }
        com.github.catvod.spider.merge.D0.e eVarM0 = m0("videoSecondaryInfoRenderer");
        this.i = eVarM0;
        return eVarM0;
    }

    private static boolean p0(com.github.catvod.spider.merge.D0.e eVar, String str) {
        return !str.equals(eVar.g("videoDetails").i("videoId", null));
    }

    private static long q0(com.github.catvod.spider.merge.D0.c cVar) throws com.github.catvod.spider.merge.p1.i {
        String strI = null;
        com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) cVar.stream().filter(new com.github.catvod.spider.merge.x1.f(com.github.catvod.spider.merge.D0.e.class, 1)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 1)).map(C0694m.d).filter(r.c).findFirst().orElse(null);
        if (eVar != null) {
            String strI2 = eVar.g("accessibilityData").g("accessibilityData").i("label", null);
            if (strI2 == null) {
                strI2 = eVar.g("accessibility").i("label", null);
            }
            strI = strI2 == null ? eVar.g("defaultText").g("accessibility").g("accessibilityData").i("label", null) : strI2;
            if (strI != null && strI.toLowerCase().contains("no likes")) {
                return 0L;
            }
        }
        if (strI == null) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get like count from accessibility data");
        }
        try {
            int i = com.github.catvod.spider.merge.L1.m.c;
            return Long.parseLong(strI.replaceAll("\\D+", ""));
        } catch (NumberFormatException e) {
            throw new com.github.catvod.spider.merge.p1.i(t0.a("Could not parse \"", strI, "\" as a long"), e);
        }
    }

    private static long r0(com.github.catvod.spider.merge.D0.c cVar) throws com.github.catvod.spider.merge.p1.i {
        com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) cVar.stream().filter(new com.github.catvod.spider.merge.z1.d(com.github.catvod.spider.merge.D0.e.class, 4)).map(new com.github.catvod.spider.merge.z1.b(com.github.catvod.spider.merge.D0.e.class, 4)).map(C0695n.c).filter(C0699s.c).findFirst().orElse(null);
        if (eVar == null) {
            throw new com.github.catvod.spider.merge.p1.i("Could not find buttonViewModel object");
        }
        String strI = eVar.i("accessibilityText", null);
        if (strI == null) {
            throw new com.github.catvod.spider.merge.p1.i("Could not find buttonViewModel's accessibilityText string");
        }
        try {
            int i = com.github.catvod.spider.merge.L1.m.c;
            return Long.parseLong(strI.replaceAll("\\D+", ""));
        } catch (NumberFormatException e) {
            throw new com.github.catvod.spider.merge.p1.i(t0.a("Could not parse \"", strI, "\" as a long"), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Optional<LocalDate> s0(String str, String str2) {
        try {
            return Optional.of(LocalDate.parse(str, DateTimeFormatter.ofPattern(str2, Locale.ENGLISH)));
        } catch (DateTimeParseException unused) {
            return Optional.empty();
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long A() throws com.github.catvod.spider.merge.p1.i {
        a();
        String str = null;
        try {
            return Long.parseLong(this.e.g("videoDetails").i("lengthSeconds", null));
        } catch (Exception unused) {
            Iterator it = Arrays.asList(this.g, null).iterator();
            while (it.hasNext()) {
                if (!((com.github.catvod.spider.merge.D0.e) it.next()).b("adaptiveFormats").isEmpty()) {
                    try {
                        return Math.round(Long.parseLong(r2.a(0).i("approxDurationMs", str)) / 1000.0f);
                    } catch (NumberFormatException unused2) {
                    }
                }
            }
            throw new com.github.catvod.spider.merge.p1.i("Could not get duration");
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String B() {
        com.github.catvod.spider.merge.D0.e eVarG = o0().g("metadataRowContainer").g("metadataRowContainerRenderer").b("rows").a(0).g("metadataRowRenderer");
        String strO = com.github.catvod.spider.merge.F1.B.o(eVarG.b("contents").a(0), false);
        return (strO == null || !"Licence".equals(com.github.catvod.spider.merge.F1.B.o(eVarG.g("title"), false))) ? "YouTube licence" : strO;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long C() throws com.github.catvod.spider.merge.p1.i {
        a();
        if (!this.e.g("videoDetails").d("allowRatings")) {
            return -1L;
        }
        com.github.catvod.spider.merge.D0.c cVarB = n0().g("videoActions").g("menuRenderer").b("topLevelButtons");
        try {
            try {
                return r0(cVarB);
            } catch (com.github.catvod.spider.merge.p1.i unused) {
                return q0(cVarB);
            }
        } catch (com.github.catvod.spider.merge.p1.i e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get like count", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1317i> D() {
        return com.github.catvod.spider.merge.F1.s.a(this.f.g("contents").g("twoColumnWatchNextResults").g("results").g("results").b("contents"));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int E() {
        return (this.j.d("isUnlisted") || n0().b("badges").b().anyMatch(new Predicate() { // from class: com.github.catvod.spider.merge.G1.q
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return "PRIVACY_UNLISTED".equals(((com.github.catvod.spider.merge.D0.e) obj).g("metadataBadgeRenderer").g("icon").i("iconType", null));
            }
        })) ? 2 : 1;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final AbstractC1315g F() throws com.github.catvod.spider.merge.p1.i {
        a();
        if (p() != 0) {
            return null;
        }
        try {
            final com.github.catvod.spider.merge.m1.j jVar = new com.github.catvod.spider.merge.m1.j(l());
            this.f.g("contents").g("twoColumnWatchNextResults").g("secondaryResults").g("secondaryResults").b("results").stream().filter(new com.github.catvod.spider.merge.z1.d(com.github.catvod.spider.merge.D0.e.class, 3)).map(new com.github.catvod.spider.merge.z1.b(com.github.catvod.spider.merge.D0.e.class, 3)).map(new A(m(), 1)).filter(C0699s.b).forEach(new Consumer() { // from class: com.github.catvod.spider.merge.G1.x
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    jVar.d((InterfaceC1314f) obj);
                }
            });
            return jVar;
        } catch (Exception e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get related videos", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.l> G() throws com.github.catvod.spider.merge.p1.i {
        if (!this.f.containsKey("engagementPanels")) {
            return Collections.emptyList();
        }
        com.github.catvod.spider.merge.D0.c cVar = (com.github.catvod.spider.merge.D0.c) this.f.b("engagementPanels").stream().filter(new C0685d(com.github.catvod.spider.merge.D0.e.class, 1)).map(new C0684c(com.github.catvod.spider.merge.D0.e.class, 1)).filter(C0687f.c).map(C0694m.c).findFirst().orElse(null);
        if (cVar == null) {
            return Collections.emptyList();
        }
        long jA = A();
        ArrayList arrayList = new ArrayList();
        for (com.github.catvod.spider.merge.D0.e eVar : (List) cVar.stream().filter(new com.github.catvod.spider.merge.D1.c(com.github.catvod.spider.merge.D0.e.class, 2)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 2)).map(C0692k.b).collect(Collectors.toList())) {
            int iE = eVar.g("onTap").g("watchEndpoint").e("startTimeSeconds", -1);
            if (iE == -1) {
                throw new com.github.catvod.spider.merge.p1.i("Could not get stream segment start time.");
            }
            if (iE > jA) {
                break;
            }
            if (com.github.catvod.spider.merge.L1.m.j(com.github.catvod.spider.merge.F1.B.o(eVar.g("title"), false))) {
                throw new com.github.catvod.spider.merge.p1.i("Could not get stream segment title.");
            }
            com.github.catvod.spider.merge.I1.l lVar = new com.github.catvod.spider.merge.I1.l();
            n();
            if (eVar.containsKey("thumbnail")) {
                com.github.catvod.spider.merge.D0.c cVarB = eVar.g("thumbnail").b("thumbnails");
                if (!cVarB.isEmpty()) {
                    com.github.catvod.spider.merge.F1.B.f(cVarB.a(cVarB.size() - 1).i("url", null));
                }
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int H() {
        a();
        return this.n;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.o> L() {
        EnumC1316h enumC1316h = EnumC1316h.TTML;
        a();
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.D0.c cVarB = this.k.b("captionTracks");
        for (int i = 0; i < cVarB.size(); i++) {
            String strI = cVarB.a(i).i("languageCode", null);
            String strI2 = cVarB.a(i).i("baseUrl", null);
            String strI3 = cVarB.a(i).i("vssId", null);
            if (strI != null && strI2 != null && strI3 != null) {
                boolean zStartsWith = strI3.startsWith("a.");
                String strReplaceAll = strI2.replaceAll("&fmt=[^&]*", "").replaceAll("&tlang=[^&]*", "");
                com.github.catvod.spider.merge.I1.n nVar = new com.github.catvod.spider.merge.I1.n();
                nVar.c(strReplaceAll + "&fmt=ttml");
                nVar.e(enumC1316h);
                nVar.d(strI);
                nVar.b(zStartsWith);
                arrayList.add(nVar.a());
            }
        }
        return arrayList;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<String> N() {
        return com.github.catvod.spider.merge.L1.b.h(this.e.g("videoDetails").b("keywords"));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String O() {
        String strO;
        int i;
        String strI = this.j.i("uploadDate", "");
        if (strI.isEmpty()) {
            strI = this.j.i("publishDate", "");
        }
        if (!strI.isEmpty()) {
            return strI;
        }
        com.github.catvod.spider.merge.D0.e eVarG = this.j.g("liveBroadcastDetails");
        String strI2 = eVarG.i("endTimestamp", "");
        if (strI2.isEmpty()) {
            strI2 = eVarG.i("startTimestamp", "");
        }
        if (!strI2.isEmpty()) {
            return strI2;
        }
        a();
        if (this.n == 4 || (strO = com.github.catvod.spider.merge.F1.B.o(n0().g("dateText"), false)) == null) {
            return null;
        }
        if (strO.startsWith("Premiered on ")) {
            i = 13;
        } else {
            if (!strO.startsWith("Premiered ")) {
                return strO;
            }
            i = 10;
        }
        return strO.substring(i);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> P() throws com.github.catvod.spider.merge.p1.i {
        a();
        try {
            return com.github.catvod.spider.merge.F1.B.m(this.l);
        } catch (Exception unused) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get thumbnails");
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long Q() {
        long jR = R("((#|&|\\?)t=\\d*h?\\d*m?\\d+s?)");
        if (jR == -2) {
            return 0L;
        }
        return jR;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.r1.b S() {
        final String strO = O();
        try {
            try {
                return com.github.catvod.spider.merge.r1.b.b(strO);
            } catch (com.github.catvod.spider.merge.p1.i unused) {
                return com.github.catvod.spider.merge.r1.k.a(new com.github.catvod.spider.merge.r1.e("en", null)).d(strO);
            }
        } catch (com.github.catvod.spider.merge.p1.i unused2) {
            return (com.github.catvod.spider.merge.r1.b) s0(strO, "MMM dd, yyyy").or(new Supplier() { // from class: com.github.catvod.spider.merge.G1.u
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.a.s0(strO, "dd MMM yyyy");
                }
            }).map(C0695n.b).orElseThrow(new Supplier() { // from class: com.github.catvod.spider.merge.G1.v
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new com.github.catvod.spider.merge.p1.i(t0.a("Could not parse upload date \"", strO, "\""));
                }
            });
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> T() throws com.github.catvod.spider.merge.p1.i {
        com.github.catvod.spider.merge.D0.e eVarG;
        String str;
        a();
        com.github.catvod.spider.merge.D0.e eVarG2 = o0().g("owner").g("videoOwnerRenderer");
        if (eVarG2.containsKey("avatarStack")) {
            eVarG = eVarG2.g("avatarStack").g("avatarStackViewModel").b("avatars").a(0).g("avatarViewModel").g("image");
            str = "sources";
        } else {
            eVarG = eVarG2.g("thumbnail");
            str = "thumbnails";
        }
        List<C1311c> listM = com.github.catvod.spider.merge.F1.B.m(eVarG.b(str));
        if (listM.isEmpty() && this.m == 0) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get uploader avatars");
        }
        return listM;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String U() throws com.github.catvod.spider.merge.p1.i {
        a();
        String strI = this.e.g("videoDetails").i("author", null);
        if (com.github.catvod.spider.merge.L1.m.j(strI)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get uploader name");
        }
        return strI;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long V() throws com.github.catvod.spider.merge.p1.i {
        com.github.catvod.spider.merge.D0.e eVarG;
        String strO;
        com.github.catvod.spider.merge.D0.e eVarF = com.github.catvod.spider.merge.L1.b.f(this.i, "owner.videoOwnerRenderer");
        if (eVarF.containsKey("subscriberCountText")) {
            strO = com.github.catvod.spider.merge.F1.B.o(eVarF.g("subscriberCountText"), false);
        } else {
            com.github.catvod.spider.merge.D0.e eVarG2 = eVarF.g("navigationEndpoint");
            int i = com.github.catvod.spider.merge.F1.B.j;
            try {
                eVarG = com.github.catvod.spider.merge.L1.b.a(eVarG2, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems").a(0).g("listItemViewModel");
            } catch (com.github.catvod.spider.merge.p1.i unused) {
                eVarG = null;
            }
            strO = eVarG.g("subtitle").i("content", null).split("•")[1];
        }
        if (com.github.catvod.spider.merge.L1.m.j(strO)) {
            return -1L;
        }
        try {
            return com.github.catvod.spider.merge.L1.m.m(strO);
        } catch (NumberFormatException e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get uploader subscriber count", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String W() throws com.github.catvod.spider.merge.p1.i {
        a();
        String strI = this.e.g("videoDetails").i("channelId", null);
        if (com.github.catvod.spider.merge.L1.m.j(strI)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get uploader url");
        }
        return com.github.catvod.spider.merge.H1.a.s().i("channel/" + strI);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.q> X() {
        a();
        return k0("adaptiveFormats", 3, new D(this, true), "video-only");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.q> Y() {
        a();
        return k0("formats", 2, new D(this, false), "video");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long Z() throws com.github.catvod.spider.merge.p1.i {
        String strO = com.github.catvod.spider.merge.F1.B.o(n0().g("viewCount").g("videoViewCountRenderer").g("viewCount"), false);
        if (com.github.catvod.spider.merge.L1.m.j(strO)) {
            strO = this.e.g("videoDetails").i("viewCount", null);
            if (com.github.catvod.spider.merge.L1.m.j(strO)) {
                throw new com.github.catvod.spider.merge.p1.i("Could not get view count");
            }
        }
        if (strO.toLowerCase().contains("no views")) {
            return 0L;
        }
        return Long.parseLong(strO.replaceAll("\\D+", ""));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final boolean a0() {
        com.github.catvod.spider.merge.D0.e eVarG;
        com.github.catvod.spider.merge.D0.e eVarG2 = o0().g("owner").g("videoOwnerRenderer");
        if (eVarG2.containsKey("badges")) {
            return com.github.catvod.spider.merge.F1.B.y(eVarG2.b("badges"));
        }
        com.github.catvod.spider.merge.D0.e eVarG3 = eVarG2.g("navigationEndpoint");
        int i = com.github.catvod.spider.merge.F1.B.j;
        try {
            eVarG = com.github.catvod.spider.merge.L1.b.a(eVarG3, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems").a(0).g("listItemViewModel");
        } catch (com.github.catvod.spider.merge.p1.i unused) {
            eVarG = null;
        }
        if (eVarG == null) {
            return false;
        }
        return com.github.catvod.spider.merge.F1.B.v(eVarG.g("title").b("attachmentRuns"));
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final String i() throws com.github.catvod.spider.merge.p1.i {
        a();
        String strI = this.e.g("videoDetails").i("title", null);
        if (com.github.catvod.spider.merge.L1.m.j(strI)) {
            strI = com.github.catvod.spider.merge.F1.B.o(n0().g("title"), false);
            if (com.github.catvod.spider.merge.L1.m.j(strI)) {
                throw new com.github.catvod.spider.merge.p1.i("Could not get name");
            }
        }
        return strI;
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final void o(AbstractC0901a abstractC0901a) throws C1368e {
        String strG = g();
        com.github.catvod.spider.merge.r1.e eVarF = f();
        com.github.catvod.spider.merge.r1.a aVarE = e();
        String strG2 = com.github.catvod.spider.merge.F1.B.g();
        this.o = strG2;
        com.github.catvod.spider.merge.D0.e eVarB = com.github.catvod.spider.merge.F1.E.b(aVarE, eVarF, strG, strG2);
        this.e = eVarB;
        com.github.catvod.spider.merge.D0.e eVarG = eVarB.g("playabilityStatus");
        String strI = eVarG.i("status", null);
        if (strI != null && !strI.equalsIgnoreCase("ok")) {
            String strI2 = eVarG.i("reason", null);
            if (strI2 != null) {
                if (strI.equalsIgnoreCase("login_required")) {
                    if (strI2.contains("inappropriate for some users")) {
                        throw new C1365b();
                    }
                    if (strI2.contains("private")) {
                        throw new com.github.catvod.spider.merge.p1.j();
                    }
                    if (strI2.contains("a bot")) {
                        throw new com.github.catvod.spider.merge.p1.l("YouTube probably temporarily blocked anonymous watch access with this IP , got error " + strI + ": \"" + strI2 + "\"");
                    }
                }
                if (strI.equalsIgnoreCase("unplayable") || strI.equalsIgnoreCase("error")) {
                    if (strI2.contains("Music Premium")) {
                        throw new com.github.catvod.spider.merge.p1.n();
                    }
                    if (strI2.contains("payment")) {
                        throw new com.github.catvod.spider.merge.p1.h("This video is a paid video");
                    }
                    if (strI2.contains("members")) {
                        throw new com.github.catvod.spider.merge.p1.h("This video is only available for members of the channel of this video");
                    }
                    if (strI2.contains("country")) {
                        throw new com.github.catvod.spider.merge.p1.g("This video is not available in client's country.");
                    }
                    if (strI2.contains("closed") || strI2.contains("terminated")) {
                        throw new C1364a(strI2);
                    }
                }
            }
            throw new C1366c("Got error " + strI + ": \"" + strI2 + "\"");
        }
        if (p0(this.e, strG)) {
            throw new C1368e("ANDROID player response is not valid");
        }
        this.g = this.e.g("streamingData");
        this.k = this.e.g("captions").g("playerCaptionsTracklistRenderer");
        this.n = this.e.g("playabilityStatus").containsKey("liveStreamability") ? 4 : this.e.g("videoDetails").d("isPostLiveDvr") ? 6 : 2;
        try {
            com.github.catvod.spider.merge.D0.e eVarD = com.github.catvod.spider.merge.F1.E.d(eVarF, aVarE, strG);
            if (!p0(eVarD, strG)) {
                this.j = eVarD.g("microformat").g("playerMicroformatRenderer");
                com.github.catvod.spider.merge.D0.e eVarG2 = eVarD.g("videoDetails").g("thumbnail");
                if (!eVarG2.containsKey("thumbnails")) {
                    eVarG2 = this.e.g("videoDetails").g("thumbnail");
                }
                this.l = eVarG2.b("thumbnails");
            }
        } catch (Exception unused) {
            this.j = new com.github.catvod.spider.merge.D0.e();
            this.l = this.e.g("videoDetails").g("thumbnail").b("thumbnails");
        }
        com.github.catvod.spider.merge.D0.d<com.github.catvod.spider.merge.D0.e> dVarA = com.github.catvod.spider.merge.D0.e.a();
        dVarA.d("context");
        dVarA.d("client");
        dVarA.f("hl", eVarF.c());
        dVarA.f("gl", aVarE.a());
        dVarA.f("clientName", "WEB");
        dVarA.f("clientVersion", com.github.catvod.spider.merge.F1.B.k());
        dVarA.f("originalUrl", "https://www.youtube.com");
        dVarA.f("platform", "DESKTOP");
        dVarA.e("utcOffsetMinutes", 0);
        dVarA.c();
        dVarA.d("request");
        dVarA.a();
        dVarA.c();
        dVarA.g("useSsl", true);
        dVarA.c();
        dVarA.d("user");
        dVarA.g("lockedSafetyMode", false);
        dVarA.c();
        dVarA.c();
        dVarA.f("videoId", strG);
        dVarA.g("contentCheckOk", true);
        dVarA.g("racyCheckOk", true);
        this.f = com.github.catvod.spider.merge.L1.b.j(com.github.catvod.spider.merge.F1.B.s(com.github.catvod.spider.merge.m1.k.a().n("https://www.youtube.com/youtubei/v1/next?prettyPrint=false", com.github.catvod.spider.merge.F1.B.u(), com.github.catvod.spider.merge.D0.k.b(dVarA.b()).getBytes(StandardCharsets.UTF_8), eVarF)));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int p() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int i2 = o0().g("metadataRowContainer").g("metadataRowContainerRenderer").b("rows").stream().filter(new com.github.catvod.spider.merge.A1.c(com.github.catvod.spider.merge.D0.e.class, 2)).map(new com.github.catvod.spider.merge.A1.a(com.github.catvod.spider.merge.D0.e.class, 2)).flatMap(C0693l.b).flatMap(new Function() { // from class: com.github.catvod.spider.merge.G1.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((com.github.catvod.spider.merge.D0.e) obj).b("runs").stream().filter(new com.github.catvod.spider.merge.x1.f(com.github.catvod.spider.merge.D0.e.class, 2)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 2));
            }
        }).map(C0694m.b).anyMatch(r.b) ? 18 : 0;
        this.m = i2;
        return i2;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.b> q() {
        a();
        return k0("adaptiveFormats", 1, new A(this, 0), "audio");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String r() {
        return this.j.i("category", "");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String s() {
        a();
        Object[] objArr = {new com.github.catvod.spider.merge.L1.d(this.g, null)};
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i < 1; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        return l0("dash", Collections.unmodifiableList(arrayList), "mpd_version=7");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.I1.c t() {
        a();
        String strO = com.github.catvod.spider.merge.F1.B.o(o0().g("description"), true);
        if (!com.github.catvod.spider.merge.L1.m.j(strO)) {
            return new com.github.catvod.spider.merge.I1.c(strO, 1);
        }
        String strB = com.github.catvod.spider.merge.F1.n.b(o0().g("attributedDescription"));
        if (!com.github.catvod.spider.merge.L1.m.j(strB)) {
            return new com.github.catvod.spider.merge.I1.c(strB, 1);
        }
        String strI = this.e.g("videoDetails").i("shortDescription", null);
        if (strI == null) {
            strI = com.github.catvod.spider.merge.F1.B.o(this.j.g("description"), false);
        }
        return new com.github.catvod.spider.merge.I1.c(strI, 3);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String v() {
        try {
            return com.github.catvod.spider.merge.F1.B.o(this.e.g("playabilityStatus").g("errorScreen").g("playerErrorMessageRenderer").g("reason"), false);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.d> w() throws C1368e {
        String str = "playerLiveStoryboardSpecRenderer";
        try {
            com.github.catvod.spider.merge.D0.e eVarG = this.e.g("storyboards");
            if (!eVarG.containsKey("playerLiveStoryboardSpecRenderer")) {
                str = "playerStoryboardSpecRenderer";
            }
            com.github.catvod.spider.merge.D0.e eVarG2 = eVarG.g(str);
            if (eVarG2 == null) {
                return Collections.emptyList();
            }
            String strI = eVarG2.i("spec", null);
            if (strI == null) {
                return Collections.emptyList();
            }
            String[] strArrSplit = strI.split("\\|");
            String str2 = strArrSplit[0];
            ArrayList arrayList = new ArrayList(strArrSplit.length - 1);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].split("#");
                if (strArrSplit2.length == 8 && Integer.parseInt(strArrSplit2[5]) != 0) {
                    int i2 = Integer.parseInt(strArrSplit2[2]);
                    int i3 = Integer.parseInt(strArrSplit2[3]);
                    int i4 = Integer.parseInt(strArrSplit2[4]);
                    String str3 = str2.replace("$L", String.valueOf(i - 1)).replace("$N", strArrSplit2[6]) + "&sigh=" + strArrSplit2[7];
                    if (str3.contains("$M")) {
                        double d = i2;
                        double d2 = i3 * i4;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        int iCeil = (int) Math.ceil(d / d2);
                        ArrayList arrayList2 = new ArrayList(iCeil);
                        for (int i5 = 0; i5 < iCeil; i5++) {
                            arrayList2.add(str3.replace("$M", String.valueOf(i5)));
                        }
                    } else {
                        Collections.singletonList(str3);
                    }
                    Integer.parseInt(strArrSplit2[0]);
                    Integer.parseInt(strArrSplit2[1]);
                    Integer.parseInt(strArrSplit2[5]);
                    arrayList.add(new com.github.catvod.spider.merge.I1.d());
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new C1368e("Could not get frames", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String x() {
        a();
        Object[] objArr = {new com.github.catvod.spider.merge.L1.d(null, null), new com.github.catvod.spider.merge.L1.d(this.g, null)};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        return l0("hls", Collections.unmodifiableList(arrayList), "");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final Locale z() {
        return null;
    }
}
