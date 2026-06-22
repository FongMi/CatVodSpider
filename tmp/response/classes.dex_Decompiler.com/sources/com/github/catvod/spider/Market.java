package com.github.catvod.spider;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.RunnableC0115a;
import com.github.catvod.spider.merge.b.RunnableC0118d;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.i.C0178b;
import com.github.catvod.spider.merge.i.c;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0208a;
import com.github.catvod.spider.merge.p.C0212e;
import com.github.catvod.spider.merge.p.C0219l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Market extends Spider {
    private ProgressDialog a;
    private List<C0178b> b;
    private boolean c;

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
        for (C0178b c0178b : this.b) {
            int iIndexOf = c0178b.b().indexOf(new c(str));
            if (iIndexOf != -1) {
                String strA = c0178b.b().get(iIndexOf).a();
                if (strA.isEmpty()) {
                    return;
                }
                Pattern pattern = C0207D.a;
                ((ClipboardManager) Init.context().getSystemService(C0098a.a(new byte[]{7, -107, 76, -69, -94, -57, 84, 19, 0}, new byte[]{100, -7, 37, -53, -64, -88, 53, 97}))).setPrimaryClip(ClipData.newPlainText(C0098a.a(new byte[]{54, -70, -79, 40, -57, 68}, new byte[]{80, -43, -33, 79, -86, 45, -50, -110}), strA));
                C0219l.b(C0098a.a(new byte[]{-57, 85, 127, -94, -14, -33, 104, -119, -97, -62}, new byte[]{34, -30, -51, 74, 86, 88, -128, 42}) + strA);
                return;
            }
        }
    }

    public String action(String str) {
        try {
            String str2 = "";
            if (isBusy()) {
                return "";
            }
            setBusy(true);
            Init.run(new RunnableC0118d(this, 2), 500);
            Response responseD = C0197c.d(str);
            File fileD = C0208a.d(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), Uri.parse(str).getLastPathSegment()));
            InputStream inputStreamByteStream = responseD.body().byteStream();
            double d = Double.parseDouble(responseD.header(C0098a.a(new byte[]{-19, -36, -44, -38, 43, 61, 104, -106, -30, -42, -44, -55, 58, 59}, new byte[]{-82, -77, -70, -82, 78, 83, 28, -69}), C0098a.a(new byte[]{-76}, new byte[]{-123, -98, -105, -27, 26, 18, 36, -48})));
            FileOutputStream fileOutputStream = new FileOutputStream(fileD);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamByteStream);
            try {
                byte[] bArr = new byte[4096];
                long j = 0;
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    long j2 = j + ((long) i);
                    fileOutputStream.write(bArr, 0, i);
                    String str3 = str2;
                    double d2 = j2;
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    final int i2 = (int) ((d2 / d) * 100.0d);
                    Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.o.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            Market.a(this.a, i2);
                        }
                    });
                    str2 = str3;
                    j = j2;
                }
                String str4 = str2;
                bufferedInputStream.close();
                if (fileD.getName().endsWith(C0098a.a(new byte[]{-79, -79, 32, -100}, new byte[]{-97, -53, 73, -20, -124, 36, -75, 102}))) {
                    C0212e.c(fileD, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                }
                if (fileD.getName().endsWith(C0098a.a(new byte[]{-33, -77, 122, -65}, new byte[]{-15, -46, 10, -44, -10, -16, -75, -95}))) {
                    C0212e.b(fileD);
                } else {
                    h.i(C0098a.a(new byte[]{-6, 61, 126, 116, -57, 67, 73, 94, -110, 99, 125, 12}, new byte[]{30, -123, -11, -100, 123, -54, -84, -16}));
                }
                d(str);
                Init.run(new RunnableC0115a(this, 4));
                return str4;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e) {
            Init.run(new RunnableC0115a(this, 4));
            return h.i(e.getMessage());
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        for (C0178b c0178b : this.b) {
            if (c0178b.c().equals(str)) {
                h hVar = new h();
                hVar.k(1, 1, 0, 1);
                hVar.A(c0178b.d());
                return hVar.toString();
            }
        }
        return super.categoryContent(str, str2, z, map);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (this.b.size() > 1) {
            for (int i = 1; i < this.b.size(); i++) {
                C0178b c0178b = this.b.get(i);
                arrayList.add(new C0135a(c0178b.c(), c0178b.c()));
            }
        }
        return h.t(arrayList, this.b.get(0).d());
    }

    public void init(Context context, String str) {
        if (str.startsWith(C0098a.a(new byte[]{119, 40, -100, -68}, new byte[]{31, 92, -24, -52, 38, 29, 10, -3}))) {
            str = C0197c.l(str, null);
        }
        this.b = C0178b.a(str);
        Init.checkPermission();
    }

    public boolean isBusy() {
        return this.c;
    }

    public void setBusy(boolean z) {
        this.c = z;
    }
}
