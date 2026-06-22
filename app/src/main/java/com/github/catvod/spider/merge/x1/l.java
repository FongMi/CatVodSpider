package com.github.catvod.spider.merge.x1;

import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.p1.C1368e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class l {
    private static final Pattern a = Pattern.compile("\\w+/\\w+");
    private static com.github.catvod.spider.merge.D0.c b = null;
    public static final /* synthetic */ int c = 0;

    public static com.github.catvod.spider.merge.D0.c a(AbstractC0901a abstractC0901a, com.github.catvod.spider.merge.r1.e eVar) throws C1368e {
        if (b == null) {
            try {
                b = com.github.catvod.spider.merge.D0.g.b().a(abstractC0901a.f("https://streaming.media.ccc.de/streams/v2.json", null, eVar).c());
            } catch (com.github.catvod.spider.merge.D0.h e) {
                throw new C1368e("Could not parse JSON.", e);
            } catch (com.github.catvod.spider.merge.p1.k e2) {
                e = e2;
                throw new C1368e("Could not get live stream JSON.", e);
            } catch (IOException e3) {
                e = e3;
                throw new C1368e("Could not get live stream JSON.", e);
            }
        }
        return b;
    }

    public static List<C1311c> b(com.github.catvod.spider.merge.D0.e eVar) {
        return c(eVar, "thumb", "poster");
    }

    private static List<C1311c> c(com.github.catvod.spider.merge.D0.e eVar, String str, String str2) {
        ArrayList arrayList = new ArrayList(2);
        String strI = eVar.i(str, null);
        if (!com.github.catvod.spider.merge.L1.m.j(strI)) {
            arrayList.add(new C1311c(strI, -1, -1, 2));
        }
        String strI2 = eVar.i(str2, null);
        if (!com.github.catvod.spider.merge.L1.m.j(strI2)) {
            arrayList.add(new C1311c(strI2, -1, -1, 1));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<C1311c> d(com.github.catvod.spider.merge.D0.e eVar) {
        return c(eVar, "thumb_url", "poster_url");
    }

    public static boolean e(String str) {
        return a.matcher(str).find();
    }
}
