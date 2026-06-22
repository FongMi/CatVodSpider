package com.github.catvod.spider.merge.j;

import com.github.catvod.crawler.SpiderDebug;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0126a {
    public String A;
    public String B;
    public String C;
    public String D;
    public Pattern E;
    public String F;
    public Pattern G;
    public String H;
    public Pattern I;
    public String J;
    public Pattern K;
    public String L;
    public Pattern M;
    public String N;
    public Pattern O;
    public String P;
    public Pattern Q;
    public String R;
    public Pattern S;
    public String T;
    public Pattern U;
    public String V;
    public String W;
    public Pattern X;
    public String Y;
    public String Z;
    public String a;
    public String a0;
    public String b;
    public Pattern b0;
    public String c;
    public String c0;
    public String d;
    public Pattern d0;
    public Pattern e;
    public String e0;
    public String f;
    public String f0;
    public Pattern g;
    public String g0;
    public final LinkedHashMap h = new LinkedHashMap();
    public String h0;
    public JSONObject i;
    public String i0;
    public String j;
    public String j0;
    public String k;
    public Pattern k0;
    public Pattern l;
    public String l0;
    public String m;
    public Pattern m0;
    public Pattern n;
    public String n0;
    public String o;
    public Pattern o0;
    public Pattern p;
    public String p0;
    public String q;
    public Pattern q0;
    public Pattern r;
    public String s;
    public String t;
    public String u;
    public Pattern v;
    public String w;
    public Pattern x;
    public String y;
    public Pattern z;

    public static String a(String str, Pattern pattern) {
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

    public static C0126a b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0126a c0126a = new C0126a();
            c0126a.a = jSONObject.optString("ua");
            c0126a.b = jSONObject.optString("homeUrl").trim();
            c0126a.c = jSONObject.optString("cateNode").trim();
            c0126a.d = jSONObject.optString("cateName").trim();
            c0126a.e = c("cateNameR", jSONObject);
            c0126a.f = jSONObject.optString("cateId").trim();
            c0126a.g = c("cateIdR", jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cateManual");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c0126a.h.put(next.trim(), jSONObjectOptJSONObject.getString(next).trim());
                }
            }
            c0126a.i = jSONObject.optJSONObject("filter");
            c0126a.j = jSONObject.optString("homeVodNode").trim();
            c0126a.k = jSONObject.optString("homeVodName").trim();
            c0126a.l = c("homeVodNameR", jSONObject);
            c0126a.m = jSONObject.optString("homeVodId").trim();
            c0126a.n = c("homeVodIdR", jSONObject);
            c0126a.o = jSONObject.optString("homeVodImg").trim();
            c0126a.p = c("homeVodImgR", jSONObject);
            c0126a.q = jSONObject.optString("homeVodMark").trim();
            c0126a.r = c("homeVodMarkR", jSONObject);
            c0126a.s = jSONObject.optString("cateUrl").trim();
            c0126a.t = jSONObject.optString("cateVodNode").trim();
            c0126a.u = jSONObject.optString("cateVodName").trim();
            c0126a.v = c("cateVodNameR", jSONObject);
            c0126a.w = jSONObject.optString("cateVodId").trim();
            c0126a.x = c("cateVodIdR", jSONObject);
            c0126a.y = jSONObject.optString("cateVodImg").trim();
            c0126a.z = c("cateVodImgR", jSONObject);
            c0126a.A = jSONObject.optString("cateVodMark").trim();
            c("cateVodMarkR", jSONObject);
            c0126a.B = jSONObject.optString("dtUrl");
            c0126a.C = jSONObject.optString("dtNode");
            c0126a.D = jSONObject.optString("dtName");
            c0126a.E = c("dtNameR", jSONObject);
            c0126a.F = jSONObject.optString("dtImg");
            c0126a.G = c("dtImgR", jSONObject);
            c0126a.H = jSONObject.optString("dtCate");
            c0126a.I = c("dtCateR", jSONObject);
            c0126a.J = jSONObject.optString("dtYear");
            c0126a.K = c("dtYearR", jSONObject);
            c0126a.L = jSONObject.optString("dtArea");
            c0126a.M = c("dtAreaR", jSONObject);
            c0126a.N = jSONObject.optString("dtMark");
            c0126a.O = c("dtMarkR", jSONObject);
            c0126a.P = jSONObject.optString("dtActor");
            c0126a.Q = c("dtActorR", jSONObject);
            c0126a.R = jSONObject.optString("dtDirector");
            c0126a.S = c("dtDirectorR", jSONObject);
            c0126a.T = jSONObject.optString("dtDesc");
            c0126a.U = c("dtDescR", jSONObject);
            c0126a.V = jSONObject.optString("dtFromNode");
            c0126a.W = jSONObject.optString("dtFromName");
            c0126a.X = c("dtFromNameR", jSONObject);
            c0126a.Y = jSONObject.optString("dtUrlNode");
            c0126a.Z = jSONObject.optString("dtUrlSubNode");
            c0126a.a0 = jSONObject.optString("dtUrlId");
            c0126a.b0 = c("dtUrlIdR", jSONObject);
            c0126a.c0 = jSONObject.optString("dtUrlName");
            c0126a.d0 = c("dtUrlNameR", jSONObject);
            c0126a.e0 = jSONObject.optString("playUrl");
            c0126a.f0 = jSONObject.optString("playUa");
            c0126a.g0 = jSONObject.optString("playReferer");
            c0126a.h0 = jSONObject.optString("searchUrl");
            c0126a.i0 = jSONObject.optString("scVodNode").trim();
            c0126a.j0 = jSONObject.optString("scVodName").trim();
            c0126a.k0 = c("scVodNameR", jSONObject);
            c0126a.l0 = jSONObject.optString("scVodId").trim();
            c0126a.m0 = c("scVodIdR", jSONObject);
            c0126a.n0 = jSONObject.optString("scVodImg").trim();
            c0126a.o0 = c("scVodImgR", jSONObject);
            c0126a.p0 = jSONObject.optString("scVodMark").trim();
            c0126a.q0 = c("scVodMarkR", jSONObject);
            return c0126a;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static Pattern c(String str, JSONObject jSONObject) {
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
