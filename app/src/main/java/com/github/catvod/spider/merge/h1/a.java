package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.F1.B;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.p1.i;
import java.net.URL;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a extends com.github.catvod.spider.merge.q1.c {
    private static final a a = new a();
    private static final Pattern b = Pattern.compile("playlist|watch|attribution_link|watch_popup|embed|feed|select_site|account|reporthistory|redirect");

    private a() {
    }

    public static a s() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) throws i {
        try {
            URL urlQ = m.q(str);
            String path = urlQ.getPath();
            if (!m.i(urlQ) || (!B.B(urlQ) && !B.x(urlQ) && !urlQ.getHost().equalsIgnoreCase("hooktube.com"))) {
                throw new i("The URL given is not a YouTube URL");
            }
            String strSubstring = path.substring(1);
            String[] strArrSplit = strSubstring.split("/");
            if (!(strArrSplit.length > 0 && strArrSplit[0].startsWith("@"))) {
                if (!((strArrSplit.length != 1 || strArrSplit[0].isEmpty() || b.matcher(strArrSplit[0]).matches()) ? false : true)) {
                    if (!strSubstring.startsWith("user/") && !strSubstring.startsWith("channel/") && !strSubstring.startsWith("c/")) {
                        throw new i("The given URL is not a channel, a user or a handle URL");
                    }
                    String str2 = strArrSplit[1];
                    if (m.h(str2)) {
                        throw new i("The given ID is not a YouTube channel or user ID");
                    }
                    return strArrSplit[0] + "/" + str2;
                }
            }
            return strArrSplit[0];
        } catch (Exception e) {
            throw new i(C1290c.a("Could not parse URL :", e.getMessage()), e);
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

    @Override // com.github.catvod.spider.merge.q1.c
    public final String q(String str, List list) {
        return C1290c.a("https://www.youtube.com/", str);
    }
}
