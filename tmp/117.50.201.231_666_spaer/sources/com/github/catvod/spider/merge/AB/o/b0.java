package com.github.catvod.spider.merge.AB.o;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class b0 {
    private static final OkHttpClient a;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = builder.connectTimeout(3L, timeUnit).readTimeout(5L, timeUnit).callTimeout(10L, timeUnit).build();
    }

    public static String b(List<String> list) {
        String str = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.min(list.size(), 4));
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorServiceNewFixedThreadPool);
        CopyOnWriteArrayList<Future> copyOnWriteArrayList = new CopyOnWriteArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add(executorCompletionService.submit(new a0(it.next())));
        }
        int i = 0;
        while (true) {
            try {
                try {
                    try {
                        try {
                            if (i >= list.size()) {
                                break;
                            }
                            String str2 = (String) executorCompletionService.take().get();
                            if (str2 != null) {
                                str = str2;
                                break;
                            }
                            i++;
                        } catch (InterruptedException unused) {
                            executorServiceNewFixedThreadPool.shutdownNow();
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th) {
                        for (Future future : copyOnWriteArrayList) {
                            if (!future.isDone()) {
                                future.cancel(true);
                            }
                        }
                        executorServiceNewFixedThreadPool.shutdown();
                        try {
                            if (!executorServiceNewFixedThreadPool.awaitTermination(5L, TimeUnit.SECONDS)) {
                                executorServiceNewFixedThreadPool.shutdownNow();
                            }
                        } catch (InterruptedException unused2) {
                            executorServiceNewFixedThreadPool.shutdownNow();
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.e("UrlChecker", "线程被中断", e);
                    for (Future future2 : copyOnWriteArrayList) {
                        if (!future2.isDone()) {
                            future2.cancel(true);
                        }
                    }
                    executorServiceNewFixedThreadPool.shutdown();
                    if (!executorServiceNewFixedThreadPool.awaitTermination(5L, TimeUnit.SECONDS)) {
                    }
                }
            } catch (ExecutionException e2) {
                Log.e("UrlChecker", "任务执行异常", e2);
                for (Future future3 : copyOnWriteArrayList) {
                    if (!future3.isDone()) {
                        future3.cancel(true);
                    }
                }
                executorServiceNewFixedThreadPool.shutdown();
                if (!executorServiceNewFixedThreadPool.awaitTermination(5L, TimeUnit.SECONDS)) {
                }
            }
        }
        for (Future future4 : copyOnWriteArrayList) {
            if (!future4.isDone()) {
                future4.cancel(true);
            }
        }
        executorServiceNewFixedThreadPool.shutdown();
        if (!executorServiceNewFixedThreadPool.awaitTermination(5L, TimeUnit.SECONDS)) {
            executorServiceNewFixedThreadPool.shutdownNow();
        }
        return str;
    }
}
