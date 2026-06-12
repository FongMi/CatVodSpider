package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.I.J0;
import com.github.catvod.spider.merge.K.VodResult;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class YunPan123 extends Spider {
    public String detailContent(String str, List<String> list) {
        return VodResult.m(J0.a().g(list.get(0).trim()));
    }

    public String detailContent(List<String> list) {
        return detailContent("", list);
    }

    public void init(Context context, String str) {
    }

    public String playerContent(String str, String str2, List<String> list) {
        SpiderDebug.log("playerContent ids" + str2);
        if (BaseApi.isOk("yun123")) {
            return "";
        }
        J0 j0A = J0.a();
        String[] strArrSplit = str2.split("\\+");
        str.split("#")[0].equals("p123原畫");
        return j0A.j(strArrSplit);
    }

    public void test() {
        new YunPan123().detailContent(Arrays.asList("https://www.123684.com/s/Gme4Td-BW0Bd?提取码:evCv"));
    }
}
