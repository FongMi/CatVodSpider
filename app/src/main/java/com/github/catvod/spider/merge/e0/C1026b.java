package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.f0.g;
import com.github.catvod.spider.merge.o1.C1360b;
import com.github.catvod.spider.merge.o1.C1361c;
import com.github.catvod.spider.merge.p1.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1026b extends AbstractC0901a {
    public static C1026b o() {
        return C1025a.a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final C1361c a(C1360b c1360b) throws k {
        String strC = c1360b.c();
        String strD = c1360b.d();
        Map<String, List<String>> mapB = c1360b.b();
        byte[] bArrA = c1360b.a();
        Request.Builder builderAddHeader = new Request.Builder().method(strC, bArrA != null ? RequestBody.create((MediaType) null, bArrA) : null).url(strD).addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:128.0) Gecko/20100101 Firefox/128.0");
        for (Map.Entry<String, List<String>> entry : mapB.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value.size() > 1) {
                builderAddHeader.removeHeader(key);
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    builderAddHeader.addHeader(key, it.next());
                }
            } else if (value.size() == 1) {
                builderAddHeader.header(key, value.get(0));
            }
        }
        Response responseExecute = g.a().newCall(builderAddHeader.build()).execute();
        if (responseExecute.code() != 429) {
            return new C1361c(responseExecute.code(), responseExecute.message(), responseExecute.headers().toMultimap(), responseExecute.body().string(), responseExecute.request().url().toString());
        }
        responseExecute.close();
        throw new k();
    }
}
