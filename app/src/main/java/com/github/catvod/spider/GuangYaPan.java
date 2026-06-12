package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.B.LogUtils;
import com.github.catvod.spider.merge.I.O;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class GuangYaPan extends Spider {
    public static final Pattern a = Pattern.compile("www\\.guangyapan\\.com/s/([^/#?]*)(?:\\?code=([\\w]+))?(?:#/share/([\\w-]+))?");

    public String detailContent(String str, List<String> list) {
        try {
            SpiderDebug.log("光鸭云盘 detailContent vodName:" + str + " ids:" + list);
            String strTrim = list.get(0).trim();
            Matcher matcher = a.matcher(strTrim);
            if (!matcher.find()) {
                return "";
            }
            return VodResult.m(O.l().r(strTrim, matcher.group(1) != null ? matcher.group(1) : "", matcher.group(3) != null ? matcher.group(3) : "", matcher.group(2) != null ? matcher.group(2) : "", str));
        } catch (Exception e) {
            StringBuilder sbB = BuilderUtils.b("光鸭云盘 detailContent 异常: ");
            sbB.append(StringUtils.getMessage());
            SpiderDebug.log(sbB.toString());
            return VodResult.m(new VodItem("1", "无效", ""));
        }
    }

    public void init(Context context, String str) {
        SpiderDebug.log("光鸭云盘 init");
    }

    public String playerContent(String str, String str2, List list) {
        SpiderDebug.log("光鸭云盘 playerContent flag:" + str + " id:" + str2);
        if (BaseApi.isOk("guangya")) {
            return "";
        }
        String[] strArrSplit = str2.split("\\+");
        O oL = O.l();
        oL.getClass();
        try {
            String strN = oL.n(strArrSplit[0], strArrSplit[1], strArrSplit.length > 2 ? strArrSplit[2] : "");
            if (!com.github.catvod.spider.merge.P0.StringUtils.d(strN)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parse", 0);
            jSONObject.put("url", strN);
            jSONObject.put("header", new JSONObject());
            return jSONObject.toString();
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.FilterValue.e(e, BuilderUtils.b("光鸭云盘 playerContent 异常: "));
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String strTrim = list.get(0).trim();
        Subtitle.b("光鸭云盘 detailContent url:", strTrim);
        Matcher matcher = a.matcher(strTrim);
        if (!matcher.find()) {
            return "";
        }
        return VodResult.m(O.l().r(strTrim, matcher.group(1) != null ? matcher.group(1) : "", matcher.group(3) != null ? matcher.group(3) : "", matcher.group(2) != null ? matcher.group(2) : "", ""));
    }
}
