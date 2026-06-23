package com.github.catvod.spider.merge.AB.o;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class a0 implements Callable<String> {
    private final String a;

    a0(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        StringBuilder sb;
        Response responseExecute;
        if (!Thread.currentThread().isInterrupted()) {
            try {
                responseExecute = b0.a.newCall(new Request.Builder().url(this.a).head().build()).execute();
                try {
                } catch (Throwable th) {
                    if (responseExecute != null) {
                        try {
                            responseExecute.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (Thread.currentThread().isInterrupted()) {
                    sb = new StringBuilder("任务执行期间被中断: ");
                    sb.append(this.a);
                    Log.d("UrlChecker", sb.toString());
                } else {
                    Log.e("UrlChecker", "连接到 URL 失败: " + this.a, e);
                }
            }
            if (responseExecute.isSuccessful() && responseExecute.code() == 200) {
                Log.d("UrlChecker", "URL 可用: " + this.a);
                String str = this.a;
                responseExecute.close();
                return str;
            }
            Log.d("UrlChecker", "URL 不可用: " + this.a + ", 状态码: " + responseExecute.code());
            responseExecute.close();
            return null;
        }
        sb = new StringBuilder("任务执行前被中断: ");
        sb.append(this.a);
        Log.d("UrlChecker", sb.toString());
        return null;
    }
}
