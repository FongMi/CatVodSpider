package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.D0.e;
import com.github.catvod.spider.merge.D0.h;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.m1.k;
import com.github.catvod.spider.merge.p1.i;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a extends com.github.catvod.spider.merge.q1.c {
    private static final a a = new a();

    private a() {
    }

    public static a s() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) throws i {
        try {
            return String.valueOf(com.github.catvod.spider.merge.L1.b.d(k.a().d(m.p(str)).c(), "data-band").f("id"));
        } catch (h | com.github.catvod.spider.merge.p1.k | IOException | ArrayIndexOutOfBoundsException e) {
            throw new i("Download failed", e);
        }
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        String lowerCase = str.toLowerCase();
        String[] strArrSplit = lowerCase.split("/");
        if (strArrSplit.length != 3 && strArrSplit.length != 4) {
            return false;
        }
        if ((strArrSplit.length != 4 || strArrSplit[3].equals("releases") || strArrSplit[3].equals("music") || strArrSplit[3].equals("album") || strArrSplit[3].equals("track")) && !strArrSplit[2].equals("daily.bandcamp.com")) {
            return com.github.catvod.spider.merge.u1.b.e(lowerCase);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.q1.c
    public final String q(String str, List list) throws i {
        e eVarA = com.github.catvod.spider.merge.u1.b.a(str);
        if (eVarA.d("error")) {
            throw new i("JSON does not contain a channel URL (invalid id?) or is otherwise invalid");
        }
        return m.p(eVarA.i("bandcamp_url", null));
    }
}
