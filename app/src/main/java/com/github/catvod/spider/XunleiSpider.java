package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.I.B0;
import com.github.catvod.spider.merge.I.C0;
import com.github.catvod.spider.merge.I.AliDriveApi;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.I.z0;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.i0.GeneralUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class XunleiSpider extends Spider {
    private VodItem a(String str, String str2, z0 z0Var, List<B0> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add("迅雷盘原畫");
        ArrayList arrayList2 = new ArrayList();
        for (B0 b0 : list) {
            if (com.github.catvod.spider.merge.P0.StringUtils.d(GeneralUtils.m(b0.b))) {
                arrayList2.add(b0);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        String strM = C0.g().m();
        Iterator<B0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            B0 next = it.next();
            arrayList3.add((next.VodCategory.length() > 40 ? next.VodCategory.substring(0, 37) + "..." : next.b) + "$" + (((String) z0Var.a) + "::" + strM + "::" + next.a + "::" + GeneralUtils.y(next.b)));
        }
        ArrayList arrayList4 = new ArrayList();
        for (i = 0; i < arrayList.size(); i++) {
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it2.next());
                    if (it2.hasNext()) {
                        sb.append((CharSequence) "#");
                    }
                }
            }
            arrayList4.add(sb.toString());
        }
        VodItem iVar = new VodItem();
        iVar.l(str2);
        iVar.j(str2);
        iVar.n("https://pp.myapp.com/ma_icon/0/icon_113692_1776673175/256");
        if (!com.github.catvod.spider.merge.P0.StringUtils.d(str)) {
            str = "迅雷分享";
        }
        iVar.m(str);
        StringBuilder sb2 = new StringBuilder();
        Iterator it3 = arrayList4.iterator();
        if (it3.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it3.next());
                if (!it3.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "$$$");
            }
        }
        iVar.p(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it4.next());
                if (!it4.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) "$$$");
            }
        }
        iVar.o(sb3.toString());
        iVar.g("迅雷盘");
        return iVar;
    }

    public String detailContent(String str, List<String> list) {
        try {
            String strTrim = list.get(0).trim();
            SpiderDebug.log("迅雷盘 detailContent: " + strTrim);
            z0 z0VarN = C0.g().n(strTrim);
            if (z0VarN == null) {
                SpiderDebug.log("迅雷盘 无法解析分享链接");
                return VodResult.m(BaseApi.fakeVod(new ArrayList(), "迅雷盘"));
            }
            List<B0> listO = C0.g().o(strTrim);
            if (!((ArrayList) listO).isEmpty()) {
                return VodResult.m(a(str, strTrim, z0VarN, listO));
            }
            SpiderDebug.log("迅雷盘 分享列表为空");
            return VodResult.m(BaseApi.fakeVod(new ArrayList(), "迅雷盘"));
        } catch (Exception e) {
            StringBuilder sbB = BuilderUtils.b("迅雷盘 detailContent 异常: ");
            sbB.append(StringUtils.getMessage());
            SpiderDebug.log(sbB.toString());
            return VodResult.m(BaseApi.fakeVod(new ArrayList(), "迅雷盘"));
        }
    }

    public String detailContent(List<String> list) {
        return detailContent("", list);
    }

    public void init(Context context, String str) {
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            if (BaseApi.isOk("xunlei")) {
                return "";
            }
            SpiderDebug.log("迅雷盘 playerContent id: " + str2);
            String[] strArrSplit = str2.split("::");
            if (strArrSplit.length < 3) {
                SpiderDebug.log("迅雷盘 playerContent 参数不足");
                return "";
            }
            String strK = C0.g().k(strArrSplit[2], strArrSplit[0], strArrSplit[1]);
            SpiderDebug.log("迅雷盘 downloadUrl: " + strK);
            C0.g().d();
            if (com.github.catvod.spider.merge.P0.StringUtils.b(strK)) {
                return "";
            }
            VodResult gVar = new VodResult();
            gVar.w(strK);
            gVar.i();
            gVar.a(AliDriveApi.r().t(strArrSplit));
            return gVar.toString();
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.FilterValue.e(e, BuilderUtils.b("迅雷盘 playerContent 异常: "));
            return "";
        }
    }
}
