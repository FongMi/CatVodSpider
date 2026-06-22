package com.github.catvod.spider.merge.F1;

import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class E {
    private static void a(com.github.catvod.spider.merge.D0.d<com.github.catvod.spider.merge.D0.e> dVar, String str, String str2) {
        dVar.f("videoId", str);
        if (str2 != null) {
            dVar.f("cpn", str2);
        }
        dVar.g("contentCheckOk", true);
        dVar.g("racyCheckOk", true);
    }

    public static com.github.catvod.spider.merge.D0.e b(com.github.catvod.spider.merge.r1.a aVar, com.github.catvod.spider.merge.r1.e eVar, String str, String str2) {
        C0627c c0627cA = C0627c.a();
        Map<String, List<String>> mapC = c(B.i(eVar));
        c0627cA.a.c = B.t(c0627cA, eVar, aVar, mapC, "https://youtubei.googleapis.com/youtubei/v1/");
        com.github.catvod.spider.merge.D0.d dVarD = B.D(eVar, aVar, c0627cA);
        dVarD.d("playerRequest");
        a(dVarD, str, str2);
        dVarD.c();
        dVarD.g("disablePlayerResponse", false);
        return com.github.catvod.spider.merge.L1.b.j(B.s(com.github.catvod.spider.merge.m1.k.a().n("https://youtubei.googleapis.com/youtubei/v1/reel/reel_item_watch?prettyPrint=false&t=" + B.h() + "&id=" + str + "&$fields=playerResponse", mapC, com.github.catvod.spider.merge.D0.k.b(dVarD.b()).getBytes(StandardCharsets.UTF_8), eVar))).g("playerResponse");
    }

    private static Map<String, List<String>> c(String str) {
        Object[] objArr = {str};
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i < 1; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Object[] objArr2 = {"2"};
        ArrayList arrayList2 = new ArrayList(1);
        for (int i2 = 0; i2 < 1; i2++) {
            Object obj2 = objArr2[i2];
            obj2.getClass();
            arrayList2.add(obj2);
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("User-Agent", listUnmodifiableList), new AbstractMap.SimpleEntry("X-Goog-Api-Format-Version", Collections.unmodifiableList(arrayList2))};
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

    public static com.github.catvod.spider.merge.D0.e d(com.github.catvod.spider.merge.r1.e eVar, com.github.catvod.spider.merge.r1.a aVar, String str) {
        C0627c c0627cB = C0627c.b();
        c0627cB.a.b = B.k();
        Map<String, List<String>> mapU = B.u();
        c0627cB.a.c = B.t(c0627cB, eVar, aVar, mapU, "https://www.youtube.com/youtubei/v1/");
        com.github.catvod.spider.merge.D0.d dVarD = B.D(eVar, aVar, c0627cB);
        a(dVarD, str, null);
        return com.github.catvod.spider.merge.L1.b.j(B.s(com.github.catvod.spider.merge.m1.k.a().n("https://www.youtube.com/youtubei/v1/player?prettyPrint=false&$fields=microformat,videoDetails.thumbnail.thumbnails,videoDetails.videoId", mapU, com.github.catvod.spider.merge.D0.k.b(dVarD.b()).getBytes(StandardCharsets.UTF_8), eVar)));
    }
}
