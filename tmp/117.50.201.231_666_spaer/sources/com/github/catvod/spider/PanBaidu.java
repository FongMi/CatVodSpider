package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0546j;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.e.C0560a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PanBaidu extends Pan {
    private C0546j g;

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        C0552c c0552c = new C0552c();
        ArrayList arrayList = new ArrayList();
        C0546j c0546j = this.g;
        ArrayList<C0560a> arrayList2 = new ArrayList();
        c0546j.d(str, arrayList2);
        for (C0560a c0560a : arrayList2) {
            C0554e c0554e = new C0554e();
            String strDd = c0560a.dd();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (!str.endsWith("/")) {
                sb.append("/");
            }
            sb.append(strDd);
            c0554e.j(sb.toString());
            if (c0560a.b() == 1) {
                c0554e.k(strDd);
            } else {
                c0554e.k(strDd + c0560a.f());
            }
            c0554e.l(c0560a.b() == 1 ? "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_f.png" : "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_v.png");
            c0554e.p(c0560a.e());
            arrayList.add(c0554e);
        }
        arrayList.size();
        c0552c.i(1, 1, Integer.MAX_VALUE, Integer.MAX_VALUE);
        c0552c.w(arrayList);
        return c0552c.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String str = list.get(0);
        int iLastIndexOf = str.lastIndexOf("/");
        String strSubstring = iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
        int iLastIndexOf2 = strSubstring.lastIndexOf("/");
        String strSubstring2 = iLastIndexOf2 >= 0 ? strSubstring.substring(iLastIndexOf2 + 1) : strSubstring;
        C0546j c0546j = this.g;
        ArrayList<C0560a> arrayList = new ArrayList();
        c0546j.d(strSubstring, arrayList);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (C0560a c0560a : arrayList) {
            if (c0560a.b() != 1) {
                if (z) {
                    sb.append("#");
                } else {
                    z = true;
                }
                String strDd = c0560a.dd();
                sb.append(strDd);
                sb.append("$");
                sb.append(strSubstring);
                sb.append("/");
                sb.append(strDd);
            }
        }
        String string = sb.toString();
        List<String> baiduOptions = Config.getBaiduOptions();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < baiduOptions.size(); i++) {
            arrayList2.add(string);
        }
        String strJoin = TextUtils.join("$$$", arrayList2);
        String strJoin2 = TextUtils.join("$$$", baiduOptions);
        C0554e c0554e = new C0554e();
        c0554e.j(strSubstring);
        c0554e.k(strSubstring2);
        c0554e.l("https://img1.baidu.com/it/u=3771019812,1738333604&fm=253&fmt=auto&app=120&f=JPEG?w=500&h=500");
        c0554e.m(strJoin2);
        c0554e.n(strJoin);
        c0554e.p("folder");
        return C0529a.processVodData(C0552c.m(c0554e));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(this.g.j())) {
                arrayList.add(new C0550a("0", "还未登录百度账号,请前往【配置中心】登录", "1"));
            } else {
                arrayList.add(new C0550a("/", "我的百度网盘", "1"));
            }
        } catch (Exception unused) {
        }
        return C0552c.p(arrayList, new ArrayList());
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            this.g = C0546j.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
