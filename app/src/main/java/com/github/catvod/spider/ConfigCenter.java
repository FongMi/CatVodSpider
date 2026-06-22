package com.github.catvod.spider;

import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.AliDriveApi;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.I0.GeneralUtils;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.g0.RunnableC1205a;
import com.github.catvod.spider.merge.g0.RunnableC1206b;
import com.github.catvod.spider.merge.g0.RunnableC1207c;
import com.github.catvod.spider.merge.g0.RunnableC1208d;
import com.github.catvod.spider.merge.g0.RunnableC1209e;
import com.github.catvod.spider.merge.g0.RunnableC1210f;
import com.github.catvod.spider.merge.g0.RunnableC1211g;
import com.github.catvod.spider.merge.g0.RunnableC1212h;
import com.github.catvod.spider.merge.g0.RunnableC1213i;
import com.github.catvod.spider.merge.g0.RunnableC1214j;
import com.github.catvod.spider.merge.q1.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ConfigCenter extends NetPan {
    public static final String m;
    public static final String n;
    private final Map<String, Runnable> l = new HashMap();

    static {
        StringBuilder sbB = BuilderUtils.b("http://");
        sbB.append(GeneralUtils.l());
        sbB.append(":8080");
        m = sbB.toString();
        StringBuilder sbB2 = BuilderUtils.b("http://");
        sbB2.append(GeneralUtils.l());
        sbB2.append(":5244");
        n = sbB2.toString();
    }

    private VodItem f(String str, String str2, String str3, String str4) {
        return new VodItem(str, str2, str2, str3, str4);
    }

    public static void startVpn() throws Exception {
        Intent intentPrepare = VpnService.prepare(Init.context());
        if (intentPrepare == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                Init.getActivity().startActivityForResult(null, 100);
            }
        } else {
            try {
                Init.getActivity().startActivityForResult(intentPrepare, 100);
            } catch (Exception e) {
                StringBuilder sbB = BuilderUtils.b("启动VPN失败: ");
                sbB.append(StringUtils.getMessage());
                GeneralUtils.w(sbB.toString());
                throw e;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Runnable>] */
    public String action(String str) {
        try {
            Runnable runnable = (Runnable) this.l.get(str);
            if (runnable != null) {
                Init.run(runnable);
            } else {
                GeneralUtils.w("未知操作: " + str);
            }
            return "";
        } catch (Exception e) {
            StringBuilder sbB = BuilderUtils.b("操作失败: ");
            sbB.append(StringUtils.getMessage());
            GeneralUtils.w(sbB.toString());
            StringUtils.printStackTrace();
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if ("1".equals(str)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(AliDriveApi.r().c);
                sb.append("/api/ping");
                arrayList.add(f("go代理状态", "go代理状态", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/14/68/e7/1468e7d6-a1d4-e561-ddce-e5c539a4c53f/AppIcon-0-0-1x_U007emarketing-0-4-85-220.png/350x350.png", com.github.catvod.spider.merge.P0.StringUtils.d(com.github.catvod.spider.merge.f0.HttpClient.l(sb.toString())) ? "已启动" : "未启动"));
            } catch (Exception unused) {
                arrayList.add(f("go代理状态", "go代理状态", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/14/68/e7/1468e7d6-a1d4-e561-ddce-e5c539a4c53f/AppIcon-0-0-1x_U007emarketing-0-4-85-220.png/350x350.png", "检查失败"));
            }
            arrayList.add(f("开启sing-box", "开启sing-box", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c4/25/60/c42560fd-bdd6-a6db-6fbf-0bf4017686d5/AppIcon-0-0-1x_U007emarketing-0-11-0-85-220.png/350x350.png", "开启sing-box"));
            arrayList.add(f("开启tgsou", "开启tgsou", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/15/f9/a4/15f9a4ec-71a6-732a-65ef-89dd9b69b8cf/AppIconLLC-0-0-1x_U007emarketing-0-8-0-0-85-220.png/350x350.png", "开启tgsou"));
            arrayList.add(f("开启alist", "开启alist", "https://tse3-mm.cn.bing.net/th/id/OIP-C.MeDRTpt92G3S-_kU9BZJEQHaHa?rs=1&pid=ImgDetMain", n));
            arrayList.add(f("开启filebrowser", "开启filebrowser", "https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/25/f7/fb/25f7fb4e-f365-3fc6-faed-5aca2925a679/AppIcon-1x_U007emarketing-0-7-0-85-220.png/350x350.png?", m));
        } else if ("2".equals(str)) {
            arrayList.add(f("网盘顺序、画质", "网盘顺序、画质", "data:image/jpeg;base64,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", "网盘顺序、画质"));
            arrayList.add(f("原盘调用外部播放器", "原盘调用外部播放器", "https://p2.itc.cn/q_70/images03/20220512/0d79a8e7087440b8bc89659252bd6e7f.png", "原盘调用外部播放器"));
            arrayList.add(f("网盘下载开关", "网盘下载开关", "https://ts1.cn.mm.bing.net/th/id/R-C.b835f6ba65fadeaf12212ad75b1b7639?rik=Bd%2fdNYLXjLftMA&riu=http%3a%2f%2ffile.keoaeic.org%2fuploads%2fueditor%2fimage%2f20190408%2f%e4%b8%8b%e8%bd%bd%e5%9b%be%e6%a0%87.png&ehk=aYv%2b4gyYoOZ3uswYkr7BYnvi7PRvy0eOu3dzO3d7HNA%3d&risl=&pid=ImgRaw&r=0", "网盘下载开关"));
            if (NetPan.isAliPan("")) {
                arrayList.add(f("阿里线程", "阿里线程", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", "阿里线程"));
                arrayList.add(f("设置阿里token", "设置阿里token", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", "设置阿里token"));
            }
            if (NetPan.isBaidu("")) {
                arrayList.add(f("摆渡线程", "摆渡线程", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/df/92/ee/df92ee21-b113-91fd-d6a9-c63827f1ae28/AppIcon-0-0-1x_U007ephone-0-11-0-0-sRGB-85-220.png/350x350.png", "摆渡线程"));
            }
            if (NetPan.isQuark("")) {
                arrayList.add(f("夸克线程", "夸克线程", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "夸克线程"));
                arrayList.add(f("设置夸克 cookie", "设置夸克 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "设置夸克 cookie"));
                arrayList.add(f("清除本地夸克 cookie", "清除本地夸克 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "清除本地夸克 cookie"));
            }
            if (NetPan.isUc("")) {
                arrayList.add(f("UC线程", "UC线程", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "UC线程"));
                arrayList.add(f("设置UC cookie", "设置UC cookie", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "设置UC cookie"));
                arrayList.add(f("设置UC token", "设置UC token", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "设置UC token"));
                arrayList.add(f("清除本地UC授权", "清除本地UC授权", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "清除本地UC授权"));
            }
            if (NetPan.isYun115("")) {
                arrayList.add(f("设置115 cookie", "设置115 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "设置115 cookie"));
                arrayList.add(f("清除本地115 cookie", "清除本地115 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "清除本地115 cookie"));
                arrayList.add(f("115安全删除码", "115安全删除码", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "115安全删除码"));
            }
            if (NetPan.isYun123("")) {
                arrayList.add(f("设置123盘账号", "设置123盘账号", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png", "设置123盘账号"));
                arrayList.add(f("清除本地_123账号密码", "清除本地_123账号密码", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png", "清除本地_123账号密码"));
            }
            if (NetPan.isGuangYa("")) {
                arrayList.add(f("设置光鸭token", "设置光鸭token", "https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256", "设置光鸭token"));
                arrayList.add(f("清除光鸭本地授权", "清除光鸭本地授权", "https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256", "清除光鸭本地授权"));
            }
            if (NetPan.isYunPan189("")) {
                arrayList.add(f("设置天意账号", "设置天意账号", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a8/fa/f0/a8faf032-0fa4-d9c5-ac70-920d9c84dff1/AppIcon-0-0-1x_U007emarketing-0-7-0-0-sRGB-85-220.png/350x350.png", "设置天意账号"));
            }
            if (NetPan.isYunPan139("")) {
                arrayList.add(f("设置异动cookie", "设置异动cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/87/17/34/871734bc-6a96-b3bb-55d4-72908f285eef/AppIcon-0-0-1x_U007ephone-0-5-0-85-220-0.png/460x0w.webp", "设置异动cookie"));
            }
            if (NetPan.isXunlei("")) {
                arrayList.add(f("设置迅雷账号", "设置迅雷账号", "https://pp.myapp.com/ma_icon/0/icon_113692_1776673175/256", "设置迅雷账号"));
                arrayList.add(f("清除迅雷本地账号", "清除迅雷本地账号", "https://pp.myapp.com/ma_icon/0/icon_113692_1776673175/256", "清除迅雷本地账号"));
            }
        }
        VodResult gVar = new VodResult();
        gVar.y(arrayList);
        gVar.j(1, 1, 0, 1);
        return gVar.toString();
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("1", "应用中心"));
        arrayList.add(new com.github.catvod.spider.merge.K.VodCategory("2", "网盘配置"));
        return VodResult.q(arrayList, new ArrayList());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
        this.l.put("开启filebrowser", RunnableC1213i.c);
        this.l.put("开启alist", RunnableC1211g.d);
        this.l.put("开启sing-box", RunnableC1214j.e);
        this.l.put("手动选择节点", RunnableC1210f.e);
        this.l.put("开启tgsou", RunnableC1205a.e);
        this.l.put("go代理状态", RunnableC1206b.e);
        this.l.put("阿里线程", RunnableC1207c.e);
        this.l.put("设置阿里token", RunnableC1208d.e);
        this.l.put("摆渡线程", RunnableC1209e.e);
        this.l.put("夸克线程", RunnableC1213i.f);
        this.l.put("设置夸克 cookie", RunnableC1211g.c);
        this.l.put("清除本地夸克 cookie", RunnableC1214j.c);
        this.l.put("UC线程", RunnableC1212h.c);
        this.l.put("设置UC cookie", RunnableC1210f.c);
        this.l.put("设置UC token", RunnableC1205a.c);
        this.l.put("UC UT", RunnableC1206b.c);
        this.l.put("清除本地UC授权", RunnableC1207c.c);
        this.l.put("设置115 cookie", RunnableC1208d.c);
        this.l.put("清除本地115 cookie", RunnableC1209e.c);
        this.l.put("115安全删除码", RunnableC1213i.d);
        this.l.put("设置123盘账号", RunnableC1214j.d);
        this.l.put("清除本地_123账号密码", RunnableC1212h.d);
        this.l.put("设置光鸭token", RunnableC1210f.d);
        this.l.put("清除光鸭本地授权", RunnableC1205a.d);
        this.l.put("设置异动cookie", RunnableC1206b.d);
        this.l.put("设置天意账号", RunnableC1207c.d);
        this.l.put("设置迅雷账号", RunnableC1208d.d);
        this.l.put("清除迅雷本地账号", RunnableC1209e.d);
        this.l.put("网盘顺序、画质", RunnableC1213i.e);
        this.l.put("网盘下载开关", RunnableC1211g.e);
        this.l.put("原盘调用外部播放器", RunnableC1212h.e);
    }
}
