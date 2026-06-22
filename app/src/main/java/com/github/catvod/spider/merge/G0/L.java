package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.磁力集合;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class L implements Callable {
    public final /* synthetic */ 磁力集合 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ L(磁力集合 r1, String str, List list) {
        this.a = r1;
        this.b = str;
        this.c = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        磁力集合 r0 = this.a;
        String str = this.b;
        List list = this.c;
        r0.getClass();
        try {
            String str2 = "show=title&tempid=1&keyboard=" + URLEncoder.encode(str, "GB2312");
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            for (com.github.catvod.spider.merge.c1.m mVar : com.github.catvod.spider.merge.L1.l.e(com.github.catvod.spider.merge.f0.d.i(str2, "https://www.dytt89.com/e/search/index.php", map)).l0("div.co_content8 tbody")) {
                list.add(new com.github.catvod.spider.merge.K.VodItem("https://www.dytt89.com" + mVar.l0("a").a("href"), "电影天堂" + mVar.l0("a").a("title"), "https://www.dytt89.com" + mVar.l0("img").a("src"), mVar.l0("td[style*=padding-left]").g().s0()));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
