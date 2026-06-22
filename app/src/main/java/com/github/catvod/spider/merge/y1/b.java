package com.github.catvod.spider.merge.y1;

import com.github.catvod.spider.merge.L1.j;
import com.github.catvod.spider.merge.L1.k;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.p1.i;
import com.github.catvod.spider.merge.x1.l;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b extends AbstractC0901a {
    private static final b a = new b();

    private b() {
    }

    public static b o() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) {
        String strD;
        try {
            strD = k.d("streaming\\.media\\.ccc\\.de\\/(\\w+\\/\\w+)", str, 1);
        } catch (j unused) {
            strD = null;
        }
        return strD == null ? k.d("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/events/)|(?:media\\.ccc\\.de/v/))([^/?&#]*)", str, 1) : strD;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String i(String str) {
        StringBuilder sb;
        String str2;
        if (l.e(str)) {
            sb = new StringBuilder();
            str2 = "https://streaming.media.ccc.de/";
        } else {
            sb = new StringBuilder();
            str2 = "https://media.ccc.de/v/";
        }
        return C1290c.b(sb, str2, str);
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        String strD;
        try {
            try {
                strD = k.d("streaming\\.media\\.ccc\\.de\\/(\\w+\\/\\w+)", str, 1);
            } catch (j unused) {
                strD = null;
            }
            if (strD == null) {
                strD = k.d("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/events/)|(?:media\\.ccc\\.de/v/))([^/?&#]*)", str, 1);
            }
            return strD != null;
        } catch (i unused2) {
            return false;
        }
    }
}
