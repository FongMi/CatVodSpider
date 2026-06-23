package com.github.catvod.spider.merge.m;

import com.github.catvod.spider.merge.m.C0601j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0601j {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.j$a */
    static class a {
        final String a;
        final boolean b;
        final long c;

        a(String str, boolean z, long j) {
            this.a = str;
            this.b = z;
            this.c = j;
        }
    }

    private static List<a> a(List<String> list, final OkHttpClient okHttpClient) throws InterruptedException {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.min(list.size(), 5));
        final List<a> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        for (final String str : list) {
            executorServiceNewFixedThreadPool.execute(new Runnable() { // from class: com.github.catvod.spider.merge.m.h
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    OkHttpClient okHttpClient2 = okHttpClient;
                    List list2 = listSynchronizedList;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    Request requestBuild = new Request.Builder().url(str2).get().build();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        try {
                            Response responseExecute = okHttpClient2.newCall(requestBuild).execute();
                            try {
                                ResponseBody responseBodyBody = responseExecute.body();
                                if (responseBodyBody != null) {
                                    responseBodyBody.close();
                                }
                                boolean zIsSuccessful = responseExecute.isSuccessful();
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                if (responseExecute.code() == 200) {
                                    list2.add(new C0601j.a(str2, zIsSuccessful, jCurrentTimeMillis2));
                                }
                                responseExecute.close();
                            } catch (Throwable th) {
                                if (responseExecute != null) {
                                    try {
                                        responseExecute.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            countDownLatch2.countDown();
                        }
                    } catch (Exception unused2) {
                        list2.add(new C0601j.a(str2, false, Long.MAX_VALUE));
                    }
                }
            });
        }
        executorServiceNewFixedThreadPool.shutdown();
        countDownLatch.await(10L, TimeUnit.SECONDS);
        return listSynchronizedList;
    }

    private static String b(List<a> list) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            if (aVar.b) {
                arrayList.add(aVar);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.github.catvod.spider.merge.m.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return (((C0601j.a) obj).c > ((C0601j.a) obj2).c ? 1 : (((C0601j.a) obj).c == ((C0601j.a) obj2).c ? 0 : -1));
            }
        });
        return arrayList.isEmpty() ? "" : ((a) arrayList.get(0)).a;
    }

    public static String c(JSONArray jSONArray) {
        try {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient okHttpClientBuild = builder.connectTimeout(10L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(15L, timeUnit).build();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return b(a(arrayList, okHttpClientBuild));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
