package com.github.catvod.spider.merge.J;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.C0781w;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.i0.m;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k extends Spider {
    public final String detailContent(String str, List<String> list) {
        com.github.catvod.spider.merge.K.VodItem iVarFakeVod;
        String strTrim = list.get(0).trim();
        C0781w c0781wA = C0781w.a();
        c0781wA.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add("摆渡原畫");
        if (NetPan.containPuHua()) {
            arrayList.add("摆渡普畫");
        }
        StringBuilder sbB = t0.b("baidu getVod1");
        sbB.append(c0781wA.b.b());
        SpiderDebug.log(sbB.toString());
        if (com.github.catvod.spider.merge.P0.e.d(str)) {
            c0781wA.c.c = str;
        } else {
            c0781wA.c.c = "";
        }
        h hVar = c0781wA.c;
        String strB = c0781wA.b.b();
        hVar.getClass();
        HashMap map = new HashMap();
        if (strB != null && !strB.isEmpty()) {
            for (String str2 : strB.split(";\\s*")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length == 2) {
                    try {
                        map.put(strArrSplit[0].trim(), URLDecoder.decode(strArrSplit[1].trim(), "UTF-8"));
                    } catch (Exception unused) {
                        com.github.catvod.spider.merge.B.h.b("Error decoding cookie: ", str2);
                    }
                }
            }
        }
        hVar.b = map;
        StringBuilder sbB2 = t0.b("baidu getVod");
        sbB2.append(c0781wA.c.b);
        SpiderDebug.log(sbB2.toString());
        g gVarN = c0781wA.c.n(Collections.singletonList(strTrim));
        StringBuilder sbB3 = t0.b("baidu getVod2");
        sbB3.append(gVarN.a);
        SpiderDebug.log(sbB3.toString());
        try {
            iVarFakeVod = new com.github.catvod.spider.merge.K.VodItem();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList2.add(gVarN.a.get(0));
            }
            iVarFakeVod.l(strTrim);
            iVarFakeVod.j(strTrim);
            iVarFakeVod.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/df/92/ee/df92ee21-b113-91fd-d6a9-c63827f1ae28/AppIcon-0-0-1x_U007ephone-0-11-0-0-sRGB-85-220.png/350x350.png");
            iVarFakeVod.m(c0781wA.c.c);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "$$$");
                }
            }
            iVarFakeVod.p(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) "$$$");
                }
            }
            iVarFakeVod.o(sb2.toString());
            iVarFakeVod.g("摆渡");
        } catch (Exception e) {
            m.w(e.getMessage());
            iVarFakeVod = BaseApi.fakeVod(arrayList, "摆渡");
        }
        return com.github.catvod.spider.merge.K.g.m(iVarFakeVod);
    }

    public final String detailContent(List<String> list) {
        return detailContent("", list);
    }

    public final void init(Context context, String str) {
    }

    public final String playerContent(String str, String str2, List<String> list) {
        com.github.catvod.spider.merge.B.h.b("playerContent ids", str2);
        String[] strArr = {str2};
        if (BaseApi.isOk("YunPanBd")) {
            return "";
        }
        C0781w c0781wA = C0781w.a();
        str.split("#")[0].equals("摆渡原畫");
        return c0781wA.c(strArr);
    }
}
