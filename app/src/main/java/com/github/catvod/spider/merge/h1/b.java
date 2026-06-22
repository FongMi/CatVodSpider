package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.F1.B;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.p1.i;
import com.github.catvod.spider.merge.q1.C1380a;
import com.github.catvod.spider.merge.q1.C1381b;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b extends com.github.catvod.spider.merge.q1.c {
    private static final b a = new b();

    private b() {
    }

    public static b s() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) throws i {
        try {
            URL urlQ = m.q(str);
            if (!m.i(urlQ) || (!B.B(urlQ) && !B.x(urlQ))) {
                throw new i("the url given is not a YouTube-URL");
            }
            String path = urlQ.getPath();
            if (!path.equals("/watch") && !path.equals("/playlist")) {
                throw new i("the url given is neither a video nor a playlist URL");
            }
            String strF = m.f(urlQ, "list");
            if (strF == null) {
                throw new i("the URL given does not include a playlist");
            }
            if (strF.matches("[a-zA-Z0-9_-]{10,}")) {
                return strF;
            }
            throw new i("the list-ID given in the URL does not match the list pattern");
        } catch (Exception e) {
            throw new i(C1290c.a("Error could not parse URL: ", e.getMessage()), e);
        }
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        try {
            g(str);
            return true;
        } catch (i unused) {
            return false;
        }
    }

    @Override // com.github.catvod.spider.merge.q1.c, com.github.catvod.spider.merge.b.AbstractC0901a
    /* JADX INFO: renamed from: p */
    public final C1381b b(String str) throws i {
        try {
            URL urlQ = m.q(str);
            String strF = m.f(urlQ, "list");
            if (strF != null) {
                int i = B.j;
                if (strF.startsWith("RD")) {
                    String strF2 = m.f(urlQ, "v");
                    if (strF2 == null) {
                        strF2 = B.e(strF);
                    }
                    return new C1381b(new C1380a(str, "https://www.youtube.com/watch?v=" + strF2 + "&list=" + strF, strF));
                }
            }
            return super.b(str);
        } catch (MalformedURLException e) {
            throw new i(C1290c.a("Error could not parse URL: ", e.getMessage()), e);
        }
    }

    @Override // com.github.catvod.spider.merge.q1.c
    public final String q(String str, List list) {
        return C1290c.a("https://www.youtube.com/playlist?list=", str);
    }
}
