package com.github.catvod.spider.merge.A0;

import com.github.catvod.crawler.SpiderDebug;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ic {
    public String a;
    public Pattern aa;
    public String ab;
    public String ac;
    public String ad;
    public String ae;
    public Pattern af;
    public String ag;
    public Pattern ah;
    public String ai;
    public Pattern aj;
    public String ak;
    public Pattern al;
    public String am;
    public Pattern an;
    public String ao;
    public Pattern ap;
    public String aq;
    public Pattern ar;
    public String as;
    public Pattern at;
    public String au;
    public Pattern av;
    public String aw;
    public String ax;
    public Pattern ay;
    public String az;
    public String b;
    public String ba;
    public String bb;
    public Pattern bc;
    public String bd;
    public Pattern be;
    public boolean bf;
    public String bg;
    public String bh;
    public String bi;
    public String bj;
    public String bk;
    public Pattern bl;
    public String bm;
    public Pattern bn;
    public String bo;
    public Pattern bp;
    public String bq;
    public Pattern br;
    public boolean bs;
    public String bt;
    public String bu;
    public String c;
    public String d;
    public Pattern e;
    public String f;
    public Pattern g;
    public LinkedHashMap h;
    public JSONObject i;
    public String j;
    public String k;
    public Pattern l;
    public String m;
    public Pattern n;
    public String o;
    public Pattern p;
    public String q;
    public Pattern r;
    public String s;
    public String t;
    public String u;
    public String v;
    public Pattern w;
    public String x;
    public Pattern y;
    public String z;

    public static String bv(String str, Pattern pattern) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return str;
    }

    public static ic bw(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ic icVar = new ic();
            icVar.h = new LinkedHashMap();
            icVar.a = jSONObject.optString("ua");
            icVar.b = jSONObject.optString("homeUrl").trim();
            icVar.c = jSONObject.optString("cateNode").trim();
            icVar.d = jSONObject.optString("cateName").trim();
            icVar.e = bx("cateNameR", jSONObject);
            icVar.f = jSONObject.optString("cateId").trim();
            icVar.g = bx("cateIdR", jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cateManual");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    icVar.h.put(next.trim(), jSONObjectOptJSONObject.getString(next).trim());
                }
            }
            icVar.i = jSONObject.optJSONObject("filter");
            icVar.j = jSONObject.optString("homeVodNode").trim();
            icVar.k = jSONObject.optString("homeVodName").trim();
            icVar.l = bx("homeVodNameR", jSONObject);
            icVar.m = jSONObject.optString("homeVodId").trim();
            icVar.n = bx("homeVodIdR", jSONObject);
            icVar.o = jSONObject.optString("homeVodImg").trim();
            icVar.p = bx("homeVodImgR", jSONObject);
            icVar.q = jSONObject.optString("homeVodMark").trim();
            icVar.r = bx("homeVodMarkR", jSONObject);
            icVar.s = jSONObject.optString("cateUrl").trim();
            icVar.t = jSONObject.optString("cateUrl2").trim();
            icVar.u = jSONObject.optString("cateVodNode").trim();
            icVar.v = jSONObject.optString("cateVodName").trim();
            icVar.w = bx("cateVodNameR", jSONObject);
            icVar.x = jSONObject.optString("cateVodId").trim();
            icVar.y = bx("cateVodIdR", jSONObject);
            icVar.z = jSONObject.optString("cateVodImg").trim();
            icVar.aa = bx("cateVodImgR", jSONObject);
            icVar.ab = jSONObject.optString("cateVodMark").trim();
            bx("cateVodMarkR", jSONObject);
            icVar.ac = jSONObject.optString("dtUrl");
            icVar.ad = jSONObject.optString("dtNode");
            icVar.ae = jSONObject.optString("dtName");
            icVar.af = bx("dtNameR", jSONObject);
            icVar.ag = jSONObject.optString("dtImg");
            icVar.ah = bx("dtImgR", jSONObject);
            icVar.ai = jSONObject.optString("dtCate");
            icVar.aj = bx("dtCateR", jSONObject);
            icVar.ak = jSONObject.optString("dtYear");
            icVar.al = bx("dtYearR", jSONObject);
            icVar.am = jSONObject.optString("dtArea");
            icVar.an = bx("dtAreaR", jSONObject);
            icVar.ao = jSONObject.optString("dtMark");
            icVar.ap = bx("dtMarkR", jSONObject);
            icVar.aq = jSONObject.optString("dtActor");
            icVar.ar = bx("dtActorR", jSONObject);
            icVar.as = jSONObject.optString("dtDirector");
            icVar.at = bx("dtDirectorR", jSONObject);
            icVar.au = jSONObject.optString("dtDesc");
            icVar.av = bx("dtDescR", jSONObject);
            icVar.aw = jSONObject.optString("dtFromNode");
            icVar.ax = jSONObject.optString("dtFromName");
            icVar.ay = bx("dtFromNameR", jSONObject);
            icVar.az = jSONObject.optString("dtUrlNode");
            icVar.ba = jSONObject.optString("dtUrlSubNode");
            icVar.bb = jSONObject.optString("dtUrlId");
            icVar.bc = bx("dtUrlIdR", jSONObject);
            icVar.bd = jSONObject.optString("dtUrlName");
            icVar.be = bx("dtUrlNameR", jSONObject);
            icVar.bf = jSONObject.optBoolean("dtEpiRevers", false);
            icVar.bg = jSONObject.optString("playUrl");
            icVar.bh = jSONObject.optString("playUa");
            icVar.bi = jSONObject.optString("searchUrl");
            icVar.bj = jSONObject.optString("scVodNode").trim();
            icVar.bk = jSONObject.optString("scVodName").trim();
            icVar.bl = bx("scVodNameR", jSONObject);
            icVar.bm = jSONObject.optString("scVodId").trim();
            icVar.bn = bx("scVodIdR", jSONObject);
            icVar.bo = jSONObject.optString("scVodImg").trim();
            icVar.bp = bx("scVodImgR", jSONObject);
            icVar.bq = jSONObject.optString("scVodMark").trim();
            icVar.br = bx("scVodMarkR", jSONObject);
            icVar.bs = jSONObject.optBoolean("ManualSniff", false);
            icVar.bt = jSONObject.optString("sniffWord");
            icVar.bu = jSONObject.optString("filterWord");
            return icVar;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static Pattern bx(String str, JSONObject jSONObject) {
        String strTrim = jSONObject.optString(str).trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            return Pattern.compile(strTrim);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }
}
