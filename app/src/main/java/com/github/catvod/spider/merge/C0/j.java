package com.github.catvod.spider.merge.C0;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.l0.C1294a;
import com.github.catvod.spider.merge.m0.C1308c;
import com.github.catvod.spider.merge.o0.C1357a;
import com.github.catvod.spider.merge.p0.C1363a;
import com.github.catvod.spider.merge.r0.C1384c;
import com.github.catvod.spider.merge.r0.InterfaceC1382a;
import com.github.catvod.spider.merge.s0.C1387b;
import com.github.catvod.spider.merge.s0.InterfaceC1386a;
import com.github.catvod.spider.merge.u0.C1394a;
import com.github.catvod.spider.merge.x0.C1404a;
import com.github.catvod.spider.merge.x0.InterfaceC1405b;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1413b;
import com.github.catvod.spider.merge.y.C1416e;
import com.github.catvod.spider.merge.y0.C1435a;
import com.github.catvod.spider.merge.z0.C1451a;
import com.github.catvod.spider.merge.z0.C1452b;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.json.JSONException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j {
    private final C1308c a;
    private final C1363a b;
    private final InterfaceC1386a c;
    private final com.github.catvod.spider.merge.o0.c d;

    public j(C1308c c1308c, C1363a c1363a, InterfaceC1386a interfaceC1386a, com.github.catvod.spider.merge.o0.c cVar) {
        this.a = c1308c;
        this.b = c1363a;
        this.c = interfaceC1386a;
        this.d = cVar;
    }

    private com.github.catvod.spider.merge.v0.c b(C1413b c1413b, String str) {
        if (c1413b.size() <= 1 || !c1413b.o(1).containsKey("continuationItemRenderer")) {
            return null;
        }
        C1416e c1416eU = c1413b.o(1).u("continuationItemRenderer").u("continuationEndpoint");
        return new com.github.catvod.spider.merge.v0.c(c1416eU.u("continuationCommand").x("token"), str, c1416eU.x("clickTrackingParams"));
    }

    private void c(String str, String str2, List<com.github.catvod.spider.merge.u0.c> list, String str3) throws com.github.catvod.spider.merge.m0.h {
        C1416e c1416eO;
        String str4;
        C1416e c1416e = new C1416e();
        C1416e c1416e2 = new C1416e();
        C1416e c1416e3 = new C1416e();
        c1416e3.n("clientName", "WEB");
        c1416e3.n("clientVersion", "2.20201021.03.00");
        c1416e2.n("client", c1416e3);
        c1416e.n("context", c1416e2);
        c1416e.n("continuation", str);
        C1416e c1416e4 = new C1416e();
        c1416e4.n("clickTrackingParams", str2);
        c1416e.n("clickTracking", c1416e4);
        com.github.catvod.spider.merge.q0.h hVar = new com.github.catvod.spider.merge.q0.h("https://www.youtube.com/youtubei/v1/browse?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8", "POST", c1416e.a());
        hVar.b("X-YouTube-Client-Name", "1");
        hVar.b("X-YouTube-Client-Version", str3);
        hVar.b("Content-Type", "application/json");
        C1384c c1384c = (C1384c) this.b.b(hVar);
        if (!c1384c.f()) {
            throw new com.github.catvod.spider.merge.m0.g(String.format("Could not load url: %s, exception: %s", "https://www.youtube.com/youtubei/v1/browse?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8", c1384c.c().getMessage()));
        }
        try {
            C1416e c1416eG = AbstractC1412a.g((String) c1384c.a());
            if (c1416eG.containsKey("continuationContents")) {
                c1416eO = c1416eG.u("continuationContents");
                str4 = "playlistVideoListContinuation";
            } else {
                c1416eO = c1416eG.t("onResponseReceivedActions").o(0);
                str4 = "appendContinuationItemsAction";
            }
            v(c1416eO.u(str4), list, str3);
        } catch (com.github.catvod.spider.merge.m0.h e) {
            throw e;
        } catch (Exception unused) {
            throw new com.github.catvod.spider.merge.m0.e("Could not parse playlist continuation json");
        }
    }

    private List<C1435a> d(C1416e c1416e) {
        if (!c1416e.containsKey("captions")) {
            return Collections.emptyList();
        }
        C1416e c1416eU = c1416e.u("captions").u("playerCaptionsTracklistRenderer");
        if (c1416eU == null || c1416eU.isEmpty()) {
            return Collections.emptyList();
        }
        C1413b c1413bT = c1416eU.t("captionTracks");
        if (c1413bT == null || c1413bT.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c1413bT.size(); i++) {
            C1416e c1416eO = c1413bT.o(i);
            String strX = c1416eO.x("languageCode");
            String strX2 = c1416eO.x("baseUrl");
            String strX3 = c1416eO.x("vssId");
            if (strX != null && strX2 != null && strX3 != null) {
                strX3.startsWith("a.");
                arrayList.add(new C1435a(strX2));
            }
        }
        return arrayList;
    }

    private com.github.catvod.spider.merge.u0.b f(String str) throws com.github.catvod.spider.merge.m0.e, com.github.catvod.spider.merge.m0.g {
        String strSubstring;
        if (str.length() == 24 && str.startsWith("UC")) {
            StringBuilder sbB = t0.b("UU");
            sbB.append(str.substring(2));
            strSubstring = sbB.toString();
        } else {
            String strA = t0.a("https://www.youtube.com/c/", str, "/videos?view=57");
            C1384c c1384c = (C1384c) this.b.b(new com.github.catvod.spider.merge.q0.h(strA));
            if (!c1384c.f()) {
                throw new com.github.catvod.spider.merge.m0.g(String.format("Could not load url: %s, exception: %s", strA, c1384c.c().getMessage()));
            }
            Scanner scanner = new Scanner((String) c1384c.a());
            scanner.useDelimiter("list=");
            while (true) {
                if (!scanner.hasNext()) {
                    strSubstring = null;
                    break;
                }
                String next = scanner.next();
                if (next.startsWith("UU")) {
                    strSubstring = next.substring(0, 24);
                    break;
                }
            }
        }
        if (strSubstring != null) {
            return k(strSubstring);
        }
        throw new com.github.catvod.spider.merge.m0.e("Upload Playlist not found");
    }

    private com.github.catvod.spider.merge.A0.c g(C1416e c1416e, String str, com.github.catvod.spider.merge.A0.e eVar, boolean z, String str2) throws com.github.catvod.spider.merge.m0.e {
        boolean z2 = true;
        if (c1416e.containsKey("signatureCipher")) {
            C1416e c1416e2 = new C1416e();
            for (String str3 : c1416e.x("signatureCipher").replace("\\u0026", "&").split("&")) {
                String[] strArrSplit = str3.split("=");
                c1416e2.put(strArrSplit[0], strArrSplit[1]);
            }
            if (!c1416e2.containsKey("url")) {
                throw new com.github.catvod.spider.merge.m0.e("Could not found url in cipher data");
            }
            String strX = c1416e2.x("url");
            try {
                strX = URLDecoder.decode(strX, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            if (!strX.contains("signature") && (c1416e2.containsKey("s") || (!strX.contains("&sig=") && !strX.contains("&lsig=")))) {
                if (str == null) {
                    throw new com.github.catvod.spider.merge.m0.e("deciphering is required but no js url");
                }
                String strX2 = c1416e2.x("s");
                try {
                    strX2 = URLDecoder.decode(strX2, "UTF-8");
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
                c1416e.put("url", strX + "&sig=" + ((C1357a) this.d).b(str).a(strX2));
            }
        }
        boolean z3 = eVar.c() || c1416e.containsKey("size") || c1416e.containsKey("width");
        if (!eVar.b() && !c1416e.containsKey("audioQuality")) {
            z2 = false;
        }
        return (z3 && z2) ? new com.github.catvod.spider.merge.A0.g(c1416e, z, str2) : z3 ? new com.github.catvod.spider.merge.A0.f(c1416e, z, str2) : new com.github.catvod.spider.merge.A0.a(c1416e, z, str2);
    }

    private List<com.github.catvod.spider.merge.A0.c> h(C1416e c1416e, String str, String str2) throws com.github.catvod.spider.merge.m0.f, com.github.catvod.spider.merge.m0.e {
        if (!c1416e.containsKey("streamingData")) {
            throw new com.github.catvod.spider.merge.m0.e("streamingData not found");
        }
        C1416e c1416eU = c1416e.u("streamingData");
        C1413b c1413b = new C1413b();
        if (c1416eU.containsKey("formats")) {
            c1413b.addAll(c1416eU.t("formats"));
        }
        C1413b c1413b2 = new C1413b();
        if (c1416eU.containsKey("adaptiveFormats")) {
            c1413b2.addAll(c1416eU.t("adaptiveFormats"));
        }
        ArrayList arrayList = new ArrayList(c1413b2.size() + c1413b.size());
        u(arrayList, c1413b, str, false, str2);
        u(arrayList, c1413b2, str, true, str2);
        return arrayList;
    }

    private com.github.catvod.spider.merge.v0.d i(String str) throws com.github.catvod.spider.merge.m0.e, com.github.catvod.spider.merge.m0.g {
        C1384c c1384c = (C1384c) this.b.b(new com.github.catvod.spider.merge.q0.h(str));
        if (!c1384c.f()) {
            throw new com.github.catvod.spider.merge.m0.g(String.format("Could not load url: %s, exception: %s", str, c1384c.c().getMessage()));
        }
        C1416e c1416eB = ((C1387b) this.c).b((String) c1384c.a());
        try {
            C1413b c1413bT = c1416eB.u("contents").u("twoColumnSearchResultsRenderer").u("primaryContents").u("sectionListRenderer").t("contents");
            return p(((C1387b) this.c).e(c1416eB.x("estimatedResults")), c1413bT, b(c1413bT, ((C1387b) this.c).a(c1416eB.u("responseContext"))));
        } catch (NullPointerException unused) {
            throw new com.github.catvod.spider.merge.m0.e("Search result root contents not found");
        }
    }

    private com.github.catvod.spider.merge.u0.b k(String str) throws com.github.catvod.spider.merge.m0.h {
        String strX;
        String strA = C1290c.a("https://www.youtube.com/playlist?list=", str);
        C1384c c1384c = (C1384c) this.b.b(new com.github.catvod.spider.merge.q0.h(strA));
        if (!c1384c.f()) {
            throw new com.github.catvod.spider.merge.m0.g(String.format("Could not load url: %s, exception: %s", strA, c1384c.c().getMessage()));
        }
        try {
            C1416e c1416eB = ((C1387b) this.c).b((String) c1384c.a());
            if (!c1416eB.containsKey("metadata")) {
                throw new com.github.catvod.spider.merge.m0.e("Invalid initial data json");
            }
            String strX2 = c1416eB.u("metadata").u("playlistMetadataRenderer").x("title");
            C1413b c1413bT = c1416eB.u("sidebar").u("playlistSidebarRenderer").t("items");
            try {
                strX = c1413bT.o(1).u("playlistSidebarSecondaryInfoRenderer").u("videoOwner").u("videoOwnerRenderer").u("title").t("runs").o(0).x("text");
            } catch (Exception unused) {
                strX = null;
            }
            C1413b c1413bT2 = c1413bT.o(0).u("playlistSidebarPrimaryInfoRenderer").t("stats");
            int iC = ((C1387b) this.c).c(c1413bT2.o(0).t("runs").o(0).x("text"));
            ((C1387b) this.c).e(c1413bT2.o(1).x("simpleText"));
            C1394a c1394a = new C1394a(strX2, strX, iC);
            try {
                return new com.github.catvod.spider.merge.u0.b(c1394a, l(c1416eB, c1394a.c()));
            } catch (com.github.catvod.spider.merge.m0.h e) {
                throw e;
            }
        } catch (com.github.catvod.spider.merge.m0.h e2) {
            throw e2;
        }
    }

    private List<com.github.catvod.spider.merge.u0.c> l(C1416e c1416e, int i) throws com.github.catvod.spider.merge.m0.e {
        try {
            C1416e c1416eU = c1416e.u("contents").u("twoColumnBrowseResultsRenderer").t("tabs").o(0).u("tabRenderer").u("content").u("sectionListRenderer").t("contents").o(0).u("itemSectionRenderer").t("contents").o(0).u("playlistVideoListRenderer");
            List<com.github.catvod.spider.merge.u0.c> arrayList = i > 0 ? new ArrayList<>(i) : new LinkedList<>();
            v(c1416eU, arrayList, ((C1387b) this.c).a(c1416e.u("responseContext")));
            return arrayList;
        } catch (NullPointerException unused) {
            throw new com.github.catvod.spider.merge.m0.e("Playlist initial data not found");
        }
    }

    private com.github.catvod.spider.merge.v0.d n(com.github.catvod.spider.merge.v0.c cVar) throws com.github.catvod.spider.merge.m0.h {
        C1416e c1416e = new C1416e();
        C1416e c1416e2 = new C1416e();
        C1416e c1416e3 = new C1416e();
        c1416e3.n("clientName", "WEB");
        c1416e3.n("clientVersion", "2.20201021.03.00");
        c1416e2.n("client", c1416e3);
        c1416e.n("context", c1416e2);
        c1416e.n("continuation", cVar.c());
        C1416e c1416e4 = new C1416e();
        c1416e4.n("clickTrackingParams", cVar.a());
        c1416e.n("clickTracking", c1416e4);
        com.github.catvod.spider.merge.q0.h hVar = new com.github.catvod.spider.merge.q0.h("https://www.youtube.com/youtubei/v1/search?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8&prettyPrint=false", "POST", c1416e.a());
        hVar.b("X-YouTube-Client-Name", "1");
        hVar.b("X-YouTube-Client-Version", cVar.b());
        hVar.b("Content-Type", "application/json");
        C1384c c1384c = (C1384c) this.b.b(hVar);
        if (!c1384c.f()) {
            throw new com.github.catvod.spider.merge.m0.g(String.format("Could not load url: %s, exception: %s", "https://www.youtube.com/youtubei/v1/search?key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8&prettyPrint=false", c1384c.c().getMessage()));
        }
        try {
            C1416e c1416eG = AbstractC1412a.g((String) c1384c.a());
            if (!c1416eG.containsKey("onResponseReceivedCommands")) {
                throw new com.github.catvod.spider.merge.m0.e("Could not find continuation data");
            }
            C1413b c1413bT = c1416eG.t("onResponseReceivedCommands").o(0).u("appendContinuationItemsAction").t("continuationItems");
            return p(((C1387b) this.c).e(c1416eG.x("estimatedResults")), c1413bT, b(c1413bT, cVar.b()));
        } catch (com.github.catvod.spider.merge.m0.h e) {
            throw e;
        } catch (Exception unused) {
            throw new com.github.catvod.spider.merge.m0.e("Could not parse search continuation json");
        }
    }

    private com.github.catvod.spider.merge.v0.d p(long j, C1413b c1413b, com.github.catvod.spider.merge.v0.c cVar) throws com.github.catvod.spider.merge.m0.e {
        C1416e c1416eO;
        String next;
        C1416e c1416eU;
        com.github.catvod.spider.merge.v0.f eVar;
        try {
            C1413b c1413bT = c1413b.o(0).u("itemSectionRenderer").t("contents");
            ArrayList arrayList = new ArrayList(c1413bT.size());
            HashMap map = new HashMap();
            for (int i = 0; i < c1413bT.size(); i++) {
                c1416eO = c1413bT.o(i);
                next = c1416eO.keySet().iterator().next();
                c1416eU = c1416eO.u(next);
                next.getClass();
                switch (next) {
                    case "horizontalCardListRenderer":
                        eVar = new com.github.catvod.spider.merge.x0.e(c1416eU);
                        break;
                    case "videoRenderer":
                        eVar = new com.github.catvod.spider.merge.v0.j(c1416eU, false);
                        break;
                    case "channelRenderer":
                        eVar = new com.github.catvod.spider.merge.v0.e(c1416eU);
                        break;
                    case "shelfRenderer":
                        eVar = new com.github.catvod.spider.merge.v0.i(c1416eU);
                        break;
                    case "playlistRenderer":
                        eVar = new com.github.catvod.spider.merge.v0.h(c1416eU);
                        break;
                    case "movieRenderer":
                        eVar = new com.github.catvod.spider.merge.v0.j(c1416eU, true);
                        break;
                    case "didYouMeanRenderer":
                        eVar = new com.github.catvod.spider.merge.x0.f(c1416eU);
                        break;
                    case "showingResultsForRenderer":
                        eVar = new C1404a(c1416eU);
                        break;
                    default:
                        System.out.println("Unknown search result element type " + next);
                        System.out.println(c1416eO);
                        eVar = null;
                        break;
                }
                if (eVar != null) {
                    if (eVar instanceof com.github.catvod.spider.merge.v0.g) {
                        arrayList.add((com.github.catvod.spider.merge.v0.g) eVar);
                    } else {
                        InterfaceC1405b interfaceC1405b = (InterfaceC1405b) eVar;
                        map.put(interfaceC1405b.type(), interfaceC1405b);
                    }
                }
            }
            return cVar == null ? new com.github.catvod.spider.merge.v0.d(arrayList, map) : new com.github.catvod.spider.merge.v0.b(j, arrayList, map, cVar);
        } catch (NullPointerException unused) {
            throw new com.github.catvod.spider.merge.m0.e("Search result contents not found");
        }
    }

    private com.github.catvod.spider.merge.v0.d q(String str, String str2) throws com.github.catvod.spider.merge.m0.h {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String strA = C1290c.a("https://www.youtube.com/results?search_query=", str);
        if (str2 != null) {
            strA = t0.a(strA, "&sp=", str2);
        }
        try {
            return i(strA);
        } catch (com.github.catvod.spider.merge.m0.h e2) {
            throw e2;
        }
    }

    private C1452b s(String str) throws com.github.catvod.spider.merge.m0.h {
        String strA = C1294a.a();
        try {
            com.github.catvod.spider.merge.q0.h hVar = new com.github.catvod.spider.merge.q0.h(String.format("https://youtubei.googleapis.com/youtubei/v1/reel/reel_item_watch?prettyPrint=false&t=%s&id=%s&fields=playerResponse", C1294a.c(), str), "POST", C1294a.d(strA, this.a.b(), str).toString());
            hVar.b("User-Agent", "com.google.android.youtube/19.28.35 (Linux; U; Android 15; GB) gzip");
            hVar.b("X-Goog-Api-Format-Version", "2");
            hVar.b("Content-Type", "application/json");
            hVar.b("Accept-Language", "en-GB, en;q=0.9");
            C1384c c1384c = (C1384c) this.b.b(hVar);
            C1452b c1452b = null;
            if (c1384c.f()) {
                try {
                    C1416e c1416eU = AbstractC1412a.g((String) c1384c.a()).u("playerResponse");
                    C1451a c1451aT = t(str, c1416eU);
                    if (c1451aT.j()) {
                        try {
                            List<com.github.catvod.spider.merge.A0.c> listH = h(c1416eU, null, ((C1387b) this.c).a(c1416eU));
                            d(c1416eU);
                            c1452b = new C1452b(c1451aT, listH);
                        } catch (com.github.catvod.spider.merge.m0.h e) {
                            throw e;
                        }
                    } else {
                        List listEmptyList = Collections.emptyList();
                        Collections.emptyList();
                        c1452b = new C1452b(c1451aT, listEmptyList);
                    }
                } catch (Exception unused) {
                }
            }
            if (c1452b != null) {
                return c1452b;
            }
            String strA2 = C1290c.a("https://www.youtube.com/watch?v=", str);
            C1384c c1384c2 = (C1384c) this.b.b(new com.github.catvod.spider.merge.q0.h(strA2));
            if (!c1384c2.f()) {
                throw new com.github.catvod.spider.merge.m0.g(String.format("Could not load url: %s, exception: %s", strA2, c1384c2.c().getMessage()));
            }
            try {
                C1416e c1416eF = ((C1387b) this.c).f((String) c1384c2.a());
                C1416e c1416eU2 = c1416eF.u("args").u("player_response");
                if (!c1416eU2.containsKey("streamingData") && !c1416eU2.containsKey("videoDetails")) {
                    throw new com.github.catvod.spider.merge.m0.e("streamingData and videoDetails not found");
                }
                C1451a c1451aT2 = t(str, c1416eU2);
                if (!c1451aT2.j()) {
                    List listEmptyList2 = Collections.emptyList();
                    Collections.emptyList();
                    return new C1452b(c1451aT2, listEmptyList2);
                }
                try {
                    try {
                        List<com.github.catvod.spider.merge.A0.c> listH2 = h(c1416eU2, ((C1387b) this.c).d(c1416eF, str), ((C1387b) this.c).a(c1416eF.u("args").u("player_response").u("responseContext")));
                        d(c1416eU2);
                        return new C1452b(c1451aT2, listH2);
                    } catch (com.github.catvod.spider.merge.m0.h e2) {
                        throw e2;
                    }
                } catch (com.github.catvod.spider.merge.m0.h e3) {
                    throw e3;
                }
            } catch (com.github.catvod.spider.merge.m0.h e4) {
                throw e4;
            }
        } catch (JSONException e5) {
            throw new RuntimeException(e5);
        }
    }

    private C1451a t(String str, C1416e c1416e) {
        if (!c1416e.containsKey("videoDetails")) {
            return new C1451a(str);
        }
        C1416e c1416eU = c1416e.u("videoDetails");
        if (c1416eU.o("isLive") && c1416e.containsKey("streamingData")) {
            c1416e.u("streamingData").x("hlsManifestUrl");
        }
        return new C1451a(c1416eU);
    }

    private void u(List<com.github.catvod.spider.merge.A0.c> list, C1413b c1413b, String str, boolean z, String str2) throws com.github.catvod.spider.merge.m0.f {
        for (int i = 0; i < c1413b.size(); i++) {
            C1416e c1416eO = c1413b.o(i);
            if (!"FORMAT_STREAM_TYPE_OTF".equals(c1416eO.x("type"))) {
                int iQ = c1416eO.q("itag");
                try {
                    try {
                        list.add(g(c1416eO, str, com.github.catvod.spider.merge.A0.e.valueOf("i" + iQ), z, str2));
                    } catch (com.github.catvod.spider.merge.m0.f e) {
                        throw e;
                    } catch (com.github.catvod.spider.merge.m0.h e2) {
                        PrintStream printStream = System.err;
                        StringBuilder sbB = t0.b("Error ");
                        sbB.append(e2.getMessage());
                        sbB.append(" parsing format: ");
                        sbB.append(c1416eO);
                        printStream.println(sbB.toString());
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                } catch (IllegalArgumentException unused) {
                    System.err.println("Error parsing format: unknown itag " + iQ);
                }
            }
        }
    }

    private void v(C1416e c1416e, List<com.github.catvod.spider.merge.u0.c> list, String str) {
        if (list.size() > 49) {
            return;
        }
        String str2 = "contents";
        if (!c1416e.containsKey("contents")) {
            str2 = "continuationItems";
            if (!c1416e.containsKey("continuationItems")) {
                if (c1416e.containsKey("continuations")) {
                    C1416e c1416eU = c1416e.t("continuations").o(0).u("nextContinuationData");
                    c(c1416eU.x("continuation"), c1416eU.x("clickTrackingParams"), list, str);
                    return;
                }
                return;
            }
        }
        C1413b c1413bT = c1416e.t(str2);
        for (int i = 0; i < c1413bT.size(); i++) {
            C1416e c1416eO = c1413bT.o(i);
            if (c1416eO.containsKey("playlistVideoRenderer")) {
                list.add(new com.github.catvod.spider.merge.u0.c(c1416eO.u("playlistVideoRenderer")));
            } else if (c1416eO.containsKey("continuationItemRenderer")) {
                C1416e c1416e2 = (C1416e) Optional.ofNullable(c1416eO.u("continuationItemRenderer")).map(new Function() { // from class: com.github.catvod.spider.merge.C0.c
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((C1416e) obj).u("continuationEndpoint");
                    }
                }).orElseThrow(new Supplier() { // from class: com.github.catvod.spider.merge.C0.i
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new com.github.catvod.spider.merge.m0.e("Continuation endpoint not found");
                    }
                });
                c((String) Optional.ofNullable(c1416e2.u("commandExecutorCommand")).map(new Function() { // from class: com.github.catvod.spider.merge.C0.d
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((C1416e) obj).t("commands");
                    }
                }).flatMap(new Function() { // from class: com.github.catvod.spider.merge.C0.a
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((C1413b) obj).stream().filter(new Predicate() { // from class: com.github.catvod.spider.merge.C0.g
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                return (obj2 instanceof C1416e) && ((C1416e) obj2).x("continuationCommand") != null;
                            }
                        }).findFirst();
                    }
                }).map(new Function() { // from class: com.github.catvod.spider.merge.C0.b
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (C1416e) obj;
                    }
                }).map(new Function() { // from class: com.github.catvod.spider.merge.C0.e
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((C1416e) obj).u("continuationCommand");
                    }
                }).map(new Function() { // from class: com.github.catvod.spider.merge.C0.f
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((C1416e) obj).x("token");
                    }
                }).orElseThrow(new Supplier() { // from class: com.github.catvod.spider.merge.C0.h
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new com.github.catvod.spider.merge.m0.e("Could not find continuation token");
                    }
                }), c1416e2.x("clickTrackingParams"), list, str);
            }
        }
    }

    public final InterfaceC1382a<com.github.catvod.spider.merge.u0.b> e(com.github.catvod.spider.merge.q0.b bVar) {
        try {
            return C1384c.d(f(bVar.c()));
        } catch (com.github.catvod.spider.merge.m0.h e) {
            return C1384c.b(e);
        }
    }

    public final InterfaceC1382a<com.github.catvod.spider.merge.u0.b> j(com.github.catvod.spider.merge.q0.c cVar) {
        try {
            return C1384c.d(k(cVar.c()));
        } catch (com.github.catvod.spider.merge.m0.h e) {
            return C1384c.b(e);
        }
    }

    public final InterfaceC1382a<com.github.catvod.spider.merge.v0.d> m(com.github.catvod.spider.merge.q0.d dVar) {
        try {
            return C1384c.d(n(dVar.c()));
        } catch (com.github.catvod.spider.merge.m0.h e) {
            return C1384c.b(e);
        }
    }

    public final InterfaceC1382a<com.github.catvod.spider.merge.v0.d> o(com.github.catvod.spider.merge.q0.f fVar) {
        try {
            return C1384c.d(q(fVar.d(), fVar.c()));
        } catch (com.github.catvod.spider.merge.m0.h e) {
            return C1384c.b(e);
        }
    }

    public final InterfaceC1382a<C1452b> r(com.github.catvod.spider.merge.q0.g gVar) {
        try {
            return C1384c.d(s(gVar.c()));
        } catch (com.github.catvod.spider.merge.m0.h e) {
            return C1384c.b(e);
        }
    }
}
