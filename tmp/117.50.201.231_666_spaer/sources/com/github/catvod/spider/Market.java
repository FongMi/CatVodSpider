package com.github.catvod.spider;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Process;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.b.RunnableC0308c;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.h.C0357b;
import com.github.catvod.spider.merge.FM.l.RunnableC0374g;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.o.C0385a;
import com.github.catvod.spider.merge.FM.o.C0394j;
import com.github.catvod.spider.merge.FM.o.z;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Market extends Spider {
    private ProgressDialog a;
    private List<C0357b> b;
    private boolean c;

    /* JADX INFO: renamed from: com.github.catvod.spider.Market$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Market.restartApp(Init.getActivity());
        }
    }

    public static /* synthetic */ void a(Market market, int i) {
        market.getClass();
        try {
            ProgressDialog progressDialog = market.a;
            if (progressDialog != null) {
                progressDialog.setProgress(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void b(Market market) {
        market.getClass();
        try {
            market.setBusy(false);
            ProgressDialog progressDialog = market.a;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void c(Market market) {
        market.getClass();
        try {
            ProgressDialog progressDialog = new ProgressDialog(Init.getActivity());
            market.a = progressDialog;
            progressDialog.setProgressStyle(1);
            market.a.setCancelable(false);
            if (market.isBusy()) {
                market.a.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void d(String str) {
        for (C0357b c0357b : this.b) {
            int iIndexOf = c0357b.b().indexOf(new com.github.catvod.spider.merge.FM.h.c(str));
            if (iIndexOf != -1) {
                String strA = c0357b.b().get(iIndexOf).a();
                if (strA.isEmpty()) {
                    return;
                }
                Pattern pattern = z.a;
                ((ClipboardManager) Init.context().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("fongmi", strA));
                C0394j.b("已複製 " + strA);
                return;
            }
        }
    }

    public static void restartApp(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            launchIntentForPackage.addFlags(268468224);
            context.startActivity(launchIntentForPackage);
            Thread.sleep(100L);
            Process.killProcess(Process.myPid());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String action(String str) {
        int i = 3;
        try {
            if (isBusy()) {
                return "";
            }
            setBusy(true);
            Init.run(new RunnableC0308c(this, i), 500);
            Response responseExecute = new OkHttpClient.Builder().build().newCall(new Request.Builder().url(str).addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8").addHeader("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8").addHeader("Connection", "keep-alive").addHeader("Upgrade-Insecure-Requests", "1").build()).execute();
            final File fileB = C0385a.b(new File(Environment.getExternalStoragePublicDirectory("/"), Uri.parse(str).getLastPathSegment()));
            InputStream inputStreamByteStream = responseExecute.body().byteStream();
            double d = Double.parseDouble(responseExecute.header("Content-Length", "1"));
            FileOutputStream fileOutputStream = new FileOutputStream(fileB);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamByteStream);
            byte[] bArr = new byte[4096];
            long j = 0;
            while (true) {
                int i2 = bufferedInputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                j += (long) i2;
                fileOutputStream.write(bArr, 0, i2);
                double d2 = j;
                Double.isNaN(d2);
                final int i3 = (int) ((d2 / d) * 100.0d);
                Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.FM.n.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        Market.a(this.a, i3);
                    }
                });
            }
            bufferedInputStream.close();
            if (fileB.getName().endsWith(".zip")) {
                l.h(fileB, Environment.getExternalStoragePublicDirectory("/"));
                if (fileB.exists() && !fileB.delete()) {
                    C0394j.b("无法删除文件: " + fileB.getAbsolutePath());
                }
                C0394j.b("下载完成，可前往文件管理查找相应内容或使用方法");
            } else if (fileB.getName().endsWith(".apk")) {
                l.f(fileB);
                new Thread(new Runnable() { // from class: com.github.catvod.spider.Market.2
                    @Override // java.lang.Runnable
                    public void run() throws InterruptedException {
                        Thread.sleep(10000L);
                        File file = fileB;
                        if (file == null || !file.exists()) {
                            return;
                        }
                        fileB.delete();
                    }
                }).start();
            } else {
                C0394j.b("下载完成");
            }
            d(str);
            Init.run(new RunnableC0374g(this, i));
            return "";
        } catch (Exception e) {
            Init.run(new RunnableC0374g(this, i));
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        for (C0357b c0357b : this.b) {
            if (c0357b.c().equals(str)) {
                C0329g c0329g = new C0329g();
                c0329g.k(1, 1, 0, 1);
                c0329g.z(c0357b.d());
                return c0329g.toString();
            }
        }
        return super.categoryContent(str, str2, z, map);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (this.b.size() > 1) {
            for (int i = 1; i < this.b.size(); i++) {
                C0357b c0357b = this.b.get(i);
                arrayList.add(new C0323a(c0357b.c(), c0357b.c()));
            }
        }
        return C0329g.s(arrayList, this.b.get(0).d());
    }

    public void init(Context context, String str) {
        if (str.startsWith("http")) {
            str = C0378c.n(str, null);
        }
        this.b = C0357b.a(str);
        Init.checkPermission();
    }

    public boolean isBusy() {
        return this.c;
    }

    public void setBusy(boolean z) {
        this.c = z;
    }
}
