package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Push extends Spider {
    private Pan a = new Pan();

    public String detailContent(List<String> list) {
        try {
            String str = list.get(0);
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!str.contains("aliyundrive.com") && !str.contains("alipan.com") && !str.contains("pan.quark.cn") && !str.contains("uc.cn") && !str.contains(".189.") && !str.contains(".123") && !str.contains("//123") && !str.contains(".baidu") && !str.contains(".139")) {
                if (str.startsWith("file://")) {
                    C0554e c0554e = new C0554e();
                    c0554e.j(str);
                    c0554e.n(str);
                    c0554e.k("本地视频");
                    c0554e.m("本地");
                    c0554e.h("");
                    return C0552c.m(c0554e);
                }
                if (new File(str).exists()) {
                }
                C0554e c0554e2 = new C0554e();
                c0554e2.j(str);
                c0554e2.n(str);
                c0554e2.k("在线视频");
                c0554e2.m("直连$$$嗅探$$$解析");
                c0554e2.n(str + "$$$" + str + "$$$" + str);
                c0554e2.h("");
                return C0552c.m(c0554e2);
            }
            return this.a.detailContent(list);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        if (str.contains("阿里") || str.contains("夸克") || str.contains("UC") || str.contains("天翼") || str.contains("123") || str.contains("百度") || str.contains("移动")) {
            return this.a.playerContent(str, str2, list);
        }
        if (str.equals("直连")) {
            C0552c c0552c = new C0552c();
            c0552c.k(0);
            c0552c.u(str2);
            return c0552c.toString();
        }
        if (str.equals("嗅探")) {
            C0552c c0552c2 = new C0552c();
            c0552c2.k(1);
            c0552c2.u(str2);
            return c0552c2.toString();
        }
        if (!str.equals("解析")) {
            C0552c c0552c3 = new C0552c();
            c0552c3.u(str2);
            return c0552c3.toString();
        }
        C0552c c0552c4 = new C0552c();
        c0552c4.k(2);
        c0552c4.f();
        c0552c4.u(str2);
        return c0552c4.toString();
    }
}
