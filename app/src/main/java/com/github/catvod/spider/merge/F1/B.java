package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.o1.C1361c;
import com.github.catvod.spider.merge.p1.C1366c;
import com.github.catvod.spider.merge.p1.C1368e;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class B {
    private static String a;
    private static boolean b;
    private static Optional<Boolean> c = Optional.empty();
    private static final String[] d = {"INNERTUBE_CONTEXT_CLIENT_VERSION\":\"([0-9\\.]+?)\"", "innertube_context_client_version\":\"([0-9\\.]+?)\"", "client.version=([0-9\\.]+)"};
    private static final String[] e = {"window\\[\"ytInitialData\"\\]\\s*=\\s*(\\{.*?\\});", "var\\s*ytInitialData\\s*=\\s*(\\{.*?\\});"};
    private static Random f = new Random();
    private static final Set<String> g;
    private static final Set<String> h;
    private static final Set<String> i;
    public static final /* synthetic */ int j = 0;

    static {
        Pattern.compile("&c=WEB");
        Pattern.compile("&c=WEB_EMBEDDED_PLAYER");
        Pattern.compile("&c=ANDROID");
        Pattern.compile("&c=IOS");
        Object[] objArr = {"google.", "m.google.", "www.google."};
        HashSet hashSet = new HashSet(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Object obj = objArr[i2];
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.d("duplicate element: ", obj));
            }
        }
        g = Collections.unmodifiableSet(hashSet);
        String[] strArr = {"invidio.us", "dev.invidio.us", "www.invidio.us", "redirect.invidious.io", "invidious.snopyta.org", "yewtu.be", "tube.connect.cafe", "tubus.eduvid.org", "invidious.kavin.rocks", "invidious.site", "invidious-us.kavin.rocks", "piped.kavin.rocks", "vid.mint.lgbt", "invidiou.site", "invidious.fdn.fr", "invidious.048596.xyz", "invidious.zee.li", "vid.puffyan.us", "ytprivate.com", "invidious.namazso.eu", "invidious.silkky.cloud", "ytb.trom.tf", "invidious.exonip.de", "inv.riverside.rocks", "invidious.blamefran.net", "y.com.cm", "invidious.moomoo.me", "yt.cyberhost.uk"};
        HashSet hashSet2 = new HashSet(28);
        for (int i3 = 0; i3 < 28; i3++) {
            String str = strArr[i3];
            str.getClass();
            if (!hashSet2.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        h = Collections.unmodifiableSet(hashSet2);
        Object[] objArr2 = {"youtube.com", "www.youtube.com", "m.youtube.com", "music.youtube.com"};
        HashSet hashSet3 = new HashSet(4);
        for (int i4 = 0; i4 < 4; i4++) {
            Object obj2 = objArr2[i4];
            obj2.getClass();
            if (!hashSet3.add(obj2)) {
                throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.d("duplicate element: ", obj2));
            }
        }
        i = Collections.unmodifiableSet(hashSet3);
    }

    public static boolean A(URL url) {
        String host = url.getHost();
        return host.equalsIgnoreCase("www.youtube-nocookie.com") || host.equalsIgnoreCase("youtu.be");
    }

    public static boolean B(URL url) {
        return i.contains(url.getHost().toLowerCase(Locale.ROOT));
    }

    public static int C(String str) throws com.github.catvod.spider.merge.p1.i {
        int i2;
        String[] strArrSplit = str.split(str.contains(":") ? ":" : "\\.");
        int[] iArr = {24, 60, 60, 1};
        int length = 4 - strArrSplit.length;
        if (length < 0) {
            throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Error duration string with unknown format: ", str));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
            int i5 = iArr[i4 + length];
            String str2 = strArrSplit[i4];
            if (str2 == null || str2.isEmpty()) {
                i2 = 0;
            } else {
                int i6 = com.github.catvod.spider.merge.L1.m.c;
                try {
                    i2 = Integer.parseInt(str2.replaceAll("\\D+", ""));
                } catch (NumberFormatException unused) {
                    i2 = 0;
                }
            }
            i3 = (i3 + i2) * i5;
        }
        return i3;
    }

    public static com.github.catvod.spider.merge.D0.d D(com.github.catvod.spider.merge.r1.e eVar, com.github.catvod.spider.merge.r1.a aVar, C0627c c0627c) {
        com.github.catvod.spider.merge.D0.d<com.github.catvod.spider.merge.D0.e> dVarA = com.github.catvod.spider.merge.D0.e.a();
        dVarA.d("context");
        dVarA.d("client");
        dVarA.f("clientName", c0627c.a.a);
        dVarA.f("clientVersion", c0627c.a.b);
        c0627c.a.getClass();
        c0627c.a.getClass();
        dVarA.f("clientScreen", "WATCH");
        String str = c0627c.b.a;
        if (str != null) {
            dVarA.f("platform", str);
        }
        String str2 = c0627c.a.c;
        if (str2 != null) {
            dVarA.f("visitorData", str2);
        }
        String str3 = c0627c.b.b;
        if (str3 != null) {
            dVarA.f("deviceMake", str3);
        }
        String str4 = c0627c.b.c;
        if (str4 != null) {
            dVarA.f("deviceModel", str4);
        }
        String str5 = c0627c.b.d;
        if (str5 != null) {
            dVarA.f("osName", str5);
        }
        String str6 = c0627c.b.e;
        if (str6 != null) {
            dVarA.f("osVersion", str6);
        }
        int i2 = c0627c.b.f;
        if (i2 > 0) {
            dVarA.e("androidSdkVersion", i2);
        }
        dVarA.f("hl", eVar.c());
        dVarA.f("gl", aVar.a());
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
        return dVarA;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return str.contains("webcache.googleusercontent.com") ? str.split("cache:")[1] : str;
    }

    private static void c() throws com.github.catvod.spider.merge.p1.i {
        if (b) {
            return;
        }
        try {
            a = com.github.catvod.spider.merge.L1.m.g(com.github.catvod.spider.merge.m1.k.a().e("https://www.youtube.com/sw.js", n()).c(), d);
            b = true;
        } catch (com.github.catvod.spider.merge.L1.j e2) {
            throw new com.github.catvod.spider.merge.p1.i("Could not extract YouTube WEB InnerTube client version from sw.js", e2);
        }
    }

    public static int d(String str) throws com.github.catvod.spider.merge.p1.i {
        if (com.github.catvod.spider.merge.L1.m.j(str)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not extract playlist type from empty playlist id");
        }
        if (z(str)) {
            return 3;
        }
        if (str.startsWith("RDGMEM")) {
            return 5;
        }
        return str.startsWith("RD") ? 2 : 1;
    }

    public static String e(String str) throws com.github.catvod.spider.merge.p1.i {
        int i2;
        if (com.github.catvod.spider.merge.L1.m.j(str)) {
            throw new com.github.catvod.spider.merge.p1.i("Video id could not be determined from empty playlist id");
        }
        if (str.startsWith("RDMM")) {
            i2 = 4;
        } else if (z(str)) {
            i2 = 6;
        } else {
            if (str.startsWith("RDGMEM")) {
                throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Video id could not be determined from genre mix id: ", str));
            }
            if (!str.startsWith("RD")) {
                throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Video id could not be determined from playlist id: ", str));
            }
            if (str.length() != 13) {
                throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Video id could not be determined from mix id: ", str));
            }
            i2 = 2;
        }
        return str.substring(i2);
    }

    public static String f(String str) {
        if (str.startsWith("//")) {
            str = str.substring(2);
        }
        return str.startsWith("http://") ? com.github.catvod.spider.merge.L1.m.p(str) : !str.startsWith("https://") ? C1290c.a("https://", str) : str;
    }

    public static String g() {
        return com.github.catvod.spider.merge.L1.l.c(16, f);
    }

    public static String h() {
        return com.github.catvod.spider.merge.L1.l.c(12, f);
    }

    public static String i(com.github.catvod.spider.merge.r1.e eVar) {
        if (eVar == null) {
            eVar = com.github.catvod.spider.merge.r1.e.d;
        }
        return t0.a("com.google.android.youtube/21.03.36 (Linux; U; Android 15; ", eVar.a(), ") gzip");
    }

    public static Map j(String str) {
        Object[] objArr = {"1"};
        ArrayList arrayList = new ArrayList(1);
        for (int i2 = 0; i2 < 1; i2++) {
            Object obj = objArr[i2];
            obj.getClass();
            arrayList.add(obj);
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Object[] objArr2 = {str};
        ArrayList arrayList2 = new ArrayList(1);
        for (int i3 = 0; i3 < 1; i3++) {
            Object obj2 = objArr2[i3];
            obj2.getClass();
            arrayList2.add(obj2);
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("X-YouTube-Client-Name", listUnmodifiableList), new AbstractMap.SimpleEntry("X-YouTube-Client-Version", Collections.unmodifiableList(arrayList2))};
        HashMap map = new HashMap(2);
        for (int i4 = 0; i4 < 2; i4++) {
            Map.Entry entry = entryArr[i4];
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.d("duplicate key: ", key));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static String k() throws C1368e {
        Optional<Boolean> optionalOf;
        if (!com.github.catvod.spider.merge.L1.m.j(a)) {
            return a;
        }
        boolean z = false;
        try {
            c();
        } catch (Exception unused) {
            if (!b) {
                AbstractC0901a abstractC0901aA = com.github.catvod.spider.merge.m1.k.a();
                Object[] objArr = {"SOCS=CAE="};
                ArrayList arrayList = new ArrayList(1);
                for (int i2 = 0; i2 < 1; i2++) {
                    Object obj = objArr[i2];
                    obj.getClass();
                    arrayList.add(obj);
                }
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("Cookie", Collections.unmodifiableList(arrayList))};
                HashMap map = new HashMap(1);
                for (int i3 = 0; i3 < 1; i3++) {
                    Map.Entry entry = entryArr[i3];
                    Object key = entry.getKey();
                    key.getClass();
                    Object value = entry.getValue();
                    value.getClass();
                    if (map.put(key, value) != null) {
                        throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.d("duplicate key: ", key));
                    }
                }
                String strC = abstractC0901aA.e("https://www.youtube.com/results?search_query=&ucbcb=1", Collections.unmodifiableMap(map)).c();
                try {
                    final Class<com.github.catvod.spider.merge.D0.e> cls = com.github.catvod.spider.merge.D0.e.class;
                    Stream map2 = com.github.catvod.spider.merge.D0.g.d().a(com.github.catvod.spider.merge.L1.m.g(strC, e)).g("responseContext").b("serviceTrackingParams").stream().filter(new com.github.catvod.spider.merge.x1.g(com.github.catvod.spider.merge.D0.e.class, 1)).map(new Function() { // from class: com.github.catvod.spider.merge.F1.t
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (com.github.catvod.spider.merge.D0.e) cls.cast(obj2);
                        }
                    });
                    String strL = l(map2, "CSI", "cver");
                    a = strL;
                    if (strL == null) {
                        try {
                            a = com.github.catvod.spider.merge.L1.m.g(strC, d);
                        } catch (com.github.catvod.spider.merge.L1.j unused2) {
                        }
                    }
                    if (com.github.catvod.spider.merge.L1.m.j(a)) {
                        a = l(map2, "ECATCHER", "client.version");
                    }
                    if (a == null) {
                        throw new com.github.catvod.spider.merge.p1.i("Could not extract YouTube WEB InnerTube client version from HTML search results page");
                    }
                    b = true;
                } catch (com.github.catvod.spider.merge.D0.h | com.github.catvod.spider.merge.L1.j e2) {
                    throw new com.github.catvod.spider.merge.p1.i("Could not get ytInitialData", e2);
                }
            }
        }
        if (b) {
            return a;
        }
        if (c.isPresent()) {
            optionalOf = c;
        } else {
            com.github.catvod.spider.merge.D0.i iVarA = com.github.catvod.spider.merge.D0.k.a();
            iVarA.j();
            iVarA.k("context");
            iVarA.k("client");
            com.github.catvod.spider.merge.D0.i iVarU = iVarA.u("hl", "en-GB").u("gl", "GB").u("clientName", "WEB").u("clientVersion", "2.20260120.01.00").u("platform", "DESKTOP");
            iVarU.s();
            iVarU.g();
            iVarU.k("request");
            iVarU.c("internalExperimentFlags");
            iVarU.g();
            iVarU.v("useSsl", true);
            iVarU.g();
            iVarU.k("user");
            iVarU.v("lockedSafetyMode", false);
            iVarU.g();
            iVarU.g();
            iVarU.v("fetchLiveState", true);
            iVarU.g();
            C1361c c1361cM = com.github.catvod.spider.merge.m1.k.a().m("https://www.youtube.com/youtubei/v1/guide?prettyPrint=false", j("2.20260120.01.00"), iVarU.w().getBytes(StandardCharsets.UTF_8));
            String strC2 = c1361cM.c();
            int iD = c1361cM.d();
            if (strC2.length() > 5000 && iD == 200) {
                z = true;
            }
            optionalOf = Optional.of(Boolean.valueOf(z));
            c = optionalOf;
        }
        if (!optionalOf.get().booleanValue()) {
            throw new C1368e("Could not get YouTube WEB client version");
        }
        a = "2.20260120.01.00";
        return "2.20260120.01.00";
    }

    private static String l(Stream<com.github.catvod.spider.merge.D0.e> stream, String str, String str2) {
        return (String) stream.filter(new x(str, 0)).flatMap(new Function() { // from class: com.github.catvod.spider.merge.F1.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = B.j;
                return ((com.github.catvod.spider.merge.D0.e) obj).b("params").stream();
            }
        }).filter(new com.github.catvod.spider.merge.D1.c(com.github.catvod.spider.merge.D0.e.class, 0)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 0)).filter(new com.github.catvod.spider.merge.x1.g(str2, 2)).map(new Function() { // from class: com.github.catvod.spider.merge.F1.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = B.j;
                return ((com.github.catvod.spider.merge.D0.e) obj).i("value", null);
            }
        }).filter(r.c).findFirst().orElse(null);
    }

    public static List<C1311c> m(com.github.catvod.spider.merge.D0.c cVar) {
        return (List) cVar.stream().filter(new com.github.catvod.spider.merge.D1.c(com.github.catvod.spider.merge.D0.e.class, 1)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 1)).filter(new Predicate() { // from class: com.github.catvod.spider.merge.F1.z
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = B.j;
                return !com.github.catvod.spider.merge.L1.m.j(((com.github.catvod.spider.merge.D0.e) obj).i("url", null));
            }
        }).map(new Function() { // from class: com.github.catvod.spider.merge.F1.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) obj;
                int i2 = B.j;
                int iE = eVar.e("height", -1);
                return new C1311c(B.f(eVar.i("url", null)), iE, eVar.e("width", -1), iE <= 0 ? 4 : iE < 175 ? 3 : iE < 720 ? 2 : 1);
            }
        }).collect(Collectors.toList());
    }

    public static Map n() {
        Object[] objArr = {"https://www.youtube.com"};
        ArrayList arrayList = new ArrayList(1);
        for (int i2 = 0; i2 < 1; i2++) {
            Object obj = objArr[i2];
            obj.getClass();
            arrayList.add(obj);
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("Origin", listUnmodifiableList), new AbstractMap.SimpleEntry("Referer", listUnmodifiableList)};
        HashMap map = new HashMap(2);
        for (int i3 = 0; i3 < 2; i3++) {
            Map.Entry entry = entryArr[i3];
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.d("duplicate key: ", key));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static String o(com.github.catvod.spider.merge.D0.e eVar, boolean z) {
        if (com.github.catvod.spider.merge.L1.m.l(eVar)) {
            return null;
        }
        if (eVar.containsKey("simpleText")) {
            return eVar.i("simpleText", null);
        }
        com.github.catvod.spider.merge.D0.c<com.github.catvod.spider.merge.D0.e> cVarB = eVar.b("runs");
        if (cVarB.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (com.github.catvod.spider.merge.D0.e eVar2 : cVarB) {
            String strI = eVar2.i("text", null);
            if (z) {
                if (eVar2.containsKey("navigationEndpoint")) {
                    String strR = r(eVar2.g("navigationEndpoint"));
                    if (!com.github.catvod.spider.merge.L1.m.j(strR)) {
                        strI = "<a href=\"" + com.github.catvod.spider.merge.c1.o.d(strR) + "\">" + com.github.catvod.spider.merge.c1.o.d(strI) + "</a>";
                    }
                }
                boolean z2 = eVar2.containsKey("bold") && eVar2.c("bold");
                boolean z3 = eVar2.containsKey("italics") && eVar2.c("italics");
                boolean z4 = eVar2.containsKey("strikethrough") && eVar2.c("strikethrough");
                if (z2) {
                    sb.append("<b>");
                }
                if (z3) {
                    sb.append("<i>");
                }
                if (z4) {
                    sb.append("<s>");
                }
                sb.append(strI);
                if (z4) {
                    sb.append("</s>");
                }
                if (z3) {
                    sb.append("</i>");
                }
                if (z2) {
                    sb.append("</b>");
                }
            } else {
                sb.append(strI);
            }
        }
        String string = sb.toString();
        return z ? string.replaceAll("\\n", "<br>").replaceAll(" {2}", " &nbsp;") : string;
    }

    public static String p(com.github.catvod.spider.merge.D0.e eVar, String str) throws com.github.catvod.spider.merge.p1.i {
        String strO = o(eVar, false);
        if (strO != null) {
            return strO;
        }
        throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Could not extract text: ", str));
    }

    public static List<C1311c> q(com.github.catvod.spider.merge.D0.e eVar) throws com.github.catvod.spider.merge.p1.i {
        try {
            return m(eVar.g("thumbnail").b("thumbnails"));
        } catch (Exception e2) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get thumbnails from InfoItem", e2);
        }
    }

    public static String r(com.github.catvod.spider.merge.D0.e eVar) {
        if (eVar.containsKey("urlEndpoint")) {
            String strI = eVar.g("urlEndpoint").i("url", null);
            if (strI.startsWith("https://www.youtube.com/redirect?")) {
                strI = strI.substring(23);
            }
            if (strI.startsWith("/redirect?")) {
                for (String str : strI.substring(10).split("&")) {
                    if (str.split("=")[0].equals("q")) {
                        return com.github.catvod.spider.merge.L1.m.b(str.split("=")[1]);
                    }
                }
            } else {
                if (strI.startsWith("http")) {
                    return strI;
                }
                if (strI.startsWith("/channel") || strI.startsWith("/user") || strI.startsWith("/watch")) {
                    return C1290c.a("https://www.youtube.com", strI);
                }
            }
        }
        if (eVar.containsKey("browseEndpoint")) {
            com.github.catvod.spider.merge.D0.e eVarG = eVar.g("browseEndpoint");
            String strI2 = eVarG.i("canonicalBaseUrl", null);
            String strI3 = eVarG.i("browseId", null);
            if (strI3 != null) {
                if (strI3.startsWith("UC")) {
                    return C1290c.a("https://www.youtube.com/channel/", strI3);
                }
                if (strI3.startsWith("VL")) {
                    return C1290c.a("https://www.youtube.com/playlist?list=", strI3.substring(2));
                }
            }
            if (!com.github.catvod.spider.merge.L1.m.j(strI2)) {
                return C1290c.a("https://www.youtube.com", strI2);
            }
        }
        if (eVar.containsKey("watchEndpoint")) {
            StringBuilder sbB = t0.b("https://www.youtube.com/watch?v=");
            sbB.append(eVar.g("watchEndpoint").i("videoId", null));
            if (eVar.g("watchEndpoint").containsKey("playlistId")) {
                sbB.append("&list=");
                sbB.append(eVar.g("watchEndpoint").i("playlistId", null));
            }
            if (eVar.g("watchEndpoint").containsKey("startTimeSeconds")) {
                sbB.append("&t=");
                sbB.append(eVar.g("watchEndpoint").e("startTimeSeconds", 0));
            }
            return sbB.toString();
        }
        if (eVar.containsKey("watchPlaylistEndpoint")) {
            return C1290c.a("https://www.youtube.com/playlist?list=", eVar.g("watchPlaylistEndpoint").i("playlistId", null));
        }
        if (eVar.containsKey("showDialogCommand")) {
            try {
                return r(com.github.catvod.spider.merge.L1.b.f(com.github.catvod.spider.merge.L1.b.a(eVar, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems").a(0), "listItemViewModel.rendererContext.commandContext.onTap.innertubeCommand"));
            } catch (com.github.catvod.spider.merge.p1.i unused) {
            }
        }
        if (eVar.containsKey("commandMetadata")) {
            com.github.catvod.spider.merge.D0.e eVarG2 = eVar.g("commandMetadata").g("webCommandMetadata");
            if (eVarG2.containsKey("url")) {
                return C1290c.a("https://www.youtube.com", eVarG2.i("url", null));
            }
        }
        return null;
    }

    public static String s(C1361c c1361c) throws com.github.catvod.spider.merge.p1.i {
        if (c1361c.d() == 404) {
            throw new C1366c("Not found (\"" + c1361c.d() + " " + c1361c.e() + "\")");
        }
        String strC = c1361c.c();
        if (strC.length() < 50) {
            throw new com.github.catvod.spider.merge.p1.i("JSON response is too short");
        }
        URL url = new URL(c1361c.b());
        if (url.getHost().equalsIgnoreCase("www.youtube.com")) {
            String path = url.getPath();
            if (path.equalsIgnoreCase("/oops") || path.equalsIgnoreCase("/error")) {
                throw new C1366c("Content unavailable");
            }
        }
        String strA = c1361c.a();
        if (strA == null || !strA.toLowerCase().contains("text/html")) {
            return strC;
        }
        throw new com.github.catvod.spider.merge.p1.i(t0.a("Got HTML document, expected JSON response (latest url was: \"", c1361c.b(), "\")"));
    }

    public static String t(C0627c c0627c, com.github.catvod.spider.merge.r1.e eVar, com.github.catvod.spider.merge.r1.a aVar, Map map, String str) throws com.github.catvod.spider.merge.p1.i {
        String strI = com.github.catvod.spider.merge.L1.b.j(s(com.github.catvod.spider.merge.m1.k.a().m(t0.a(str, "visitor_id", "?prettyPrint=false"), map, com.github.catvod.spider.merge.D0.k.b(D(eVar, aVar, c0627c).b()).getBytes(StandardCharsets.UTF_8)))).g("responseContext").i("visitorData", null);
        if (com.github.catvod.spider.merge.L1.m.j(strI)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get visitorData");
        }
        return strI;
    }

    public static Map<String, List<String>> u() {
        HashMap map = new HashMap(n());
        map.putAll(j(k()));
        Object[] objArr = {"SOCS=CAE="};
        ArrayList arrayList = new ArrayList(1);
        for (int i2 = 0; i2 < 1; i2++) {
            Object obj = objArr[i2];
            obj.getClass();
            arrayList.add(obj);
        }
        map.put("Cookie", Collections.unmodifiableList(arrayList));
        return map;
    }

    public static boolean v(com.github.catvod.spider.merge.D0.c cVar) {
        return cVar.stream().filter(new h(com.github.catvod.spider.merge.D0.e.class, 1)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 1)).anyMatch(new Predicate() { // from class: com.github.catvod.spider.merge.F1.y
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((com.github.catvod.spider.merge.D0.e) obj).g("element").g("type").g("imageType").g("image").b("sources").stream().filter(new com.github.catvod.spider.merge.A1.c(com.github.catvod.spider.merge.D0.e.class, 1)).map(new com.github.catvod.spider.merge.A1.a(com.github.catvod.spider.merge.D0.e.class, 1)).anyMatch(new Predicate() { // from class: com.github.catvod.spider.merge.F1.A
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        int i2 = B.j;
                        String strI = ((com.github.catvod.spider.merge.D0.e) obj2).g("clientResource").i("imageName", null);
                        return "CHECK_CIRCLE_FILLED".equals(strI) || "AUDIO_BADGE".equals(strI) || "MUSIC_FILLED".equals(strI);
                    }
                });
            }
        });
    }

    public static boolean w(String str) {
        try {
            return g.stream().anyMatch(new com.github.catvod.spider.merge.x1.f(new URL(b(str)), 3));
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static boolean x(URL url) {
        return h.contains(url.getHost().toLowerCase(Locale.ROOT));
    }

    public static boolean y(com.github.catvod.spider.merge.D0.c cVar) {
        if (com.github.catvod.spider.merge.L1.m.k(cVar)) {
            return false;
        }
        Iterator<Object> it = cVar.iterator();
        while (it.hasNext()) {
            String strI = ((com.github.catvod.spider.merge.D0.e) it.next()).g("metadataBadgeRenderer").i("style", null);
            if (strI != null && (strI.equals("BADGE_STYLE_TYPE_VERIFIED") || strI.equals("BADGE_STYLE_TYPE_VERIFIED_ARTIST"))) {
                return true;
            }
        }
        return false;
    }

    public static boolean z(String str) {
        return str.startsWith("RDAMVM") || str.startsWith("RDCLAK");
    }
}
