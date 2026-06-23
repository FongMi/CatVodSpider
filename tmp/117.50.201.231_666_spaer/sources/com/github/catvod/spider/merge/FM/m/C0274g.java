package com.github.catvod.spider.merge.FM.M;

import com.github.catvod.spider.merge.m.C0602k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0274g extends ArrayList<com.github.catvod.spider.merge.FM.K.m> {
    public C0274g() {
    }

    public C0274g(int i) {
        super(i);
    }

    public C0274g(List<com.github.catvod.spider.merge.FM.K.m> list) {
        super(list);
    }

    public C0274g(com.github.catvod.spider.merge.FM.K.m... mVarArr) {
        super(Arrays.asList(mVarArr));
    }

    public static String filterCloudDiskLinks(String str) {
        if (str == null || str.trim().isEmpty()) {
            return str;
        }
        String strOptString = new JSONObject(C0602k.a(C0602k.c("/config.json"))).optString("panBlock");
        return (strOptString.contains("夸克网盘") && Pattern.compile("pan\\.quark\\.cn").matcher(str).find()) ? "" : (strOptString.contains("UC网盘") && Pattern.compile("drive\\.uc\\.cn").matcher(str).find()) ? "" : (strOptString.contains("百度网盘") && Pattern.compile("pan\\.baidu\\.com").matcher(str).find()) ? "" : (strOptString.contains("123云盘") && Pattern.compile("www\\.123\\w{3}\\.com").matcher(str).find()) ? "" : (strOptString.contains("天翼云盘") && Pattern.compile("cloud\\.189\\.cn").matcher(str).find()) ? "" : (strOptString.contains("阿里云盘") && Pattern.compile("(www\\.aliyundrive\\.com|www\\.alipan\\.com)").matcher(str).find()) ? "" : (strOptString.contains("移动云盘") && Pattern.compile("caiyun\\.139\\.com").matcher(str).find()) ? "" : str;
    }

    public final String a(String str) {
        for (com.github.catvod.spider.merge.FM.K.m mVar : this) {
            if (mVar.n(str)) {
                return mVar.c(str);
            }
        }
        return "";
    }

    public final List<String> b(String str) {
        ArrayList arrayList = new ArrayList(size());
        for (com.github.catvod.spider.merge.FM.K.m mVar : this) {
            if (mVar.n(str)) {
                arrayList.add(filterCloudDiskLinks(mVar.c(str)));
            }
        }
        return arrayList;
    }

    public final List<String> c() {
        ArrayList arrayList = new ArrayList(size());
        for (com.github.catvod.spider.merge.FM.K.m mVar : this) {
            if (mVar.b0()) {
                arrayList.add(mVar.v0());
            }
        }
        return arrayList;
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C0274g c0274g = new C0274g(size());
        Iterator<com.github.catvod.spider.merge.FM.K.m> it = iterator();
        while (it.hasNext()) {
            c0274g.add(it.next().i());
        }
        return c0274g;
    }

    public final C0274g d(int i) {
        return size() > i ? new C0274g(get(i)) : new C0274g();
    }

    @Nullable
    public final com.github.catvod.spider.merge.FM.K.m e() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final String f() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        for (com.github.catvod.spider.merge.FM.K.m mVar : this) {
            if (sbB.length() != 0) {
                sbB.append("\n");
            }
            sbB.append(mVar.c0());
        }
        return com.github.catvod.spider.merge.FM.J.b.h(sbB);
    }

    @Nullable
    public final com.github.catvod.spider.merge.FM.K.m g() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public final C0274g h(String str) {
        com.github.catvod.spider.merge.FM.I.c.e(str);
        N nJ = P.j(str);
        C0274g c0274g = new C0274g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (com.github.catvod.spider.merge.FM.K.m mVar : this) {
            com.github.catvod.spider.merge.FM.I.c.g(nJ);
            com.github.catvod.spider.merge.FM.I.c.g(mVar);
            for (com.github.catvod.spider.merge.FM.K.m mVar2 : C0270c.a(nJ, mVar)) {
                if (identityHashMap.put(mVar2, Boolean.TRUE) == null) {
                    c0274g.add(mVar2);
                }
            }
        }
        return c0274g;
    }

    public final String i() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        for (com.github.catvod.spider.merge.FM.K.m mVar : this) {
            if (sbB.length() != 0) {
                sbB.append(" ");
            }
            sbB.append(mVar.v0());
        }
        return com.github.catvod.spider.merge.FM.J.b.h(sbB);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        for (com.github.catvod.spider.merge.FM.K.m mVar : this) {
            if (sbB.length() != 0) {
                sbB.append("\n");
            }
            sbB.append(mVar.t());
        }
        return com.github.catvod.spider.merge.FM.J.b.h(sbB);
    }
}
