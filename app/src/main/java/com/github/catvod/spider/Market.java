package com.github.catvod.spider;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.merge.ai.j;
import com.github.catvod.spider.merge.ai.k;
import com.github.catvod.spider.merge.ai.m;
import com.github.catvod.spider.merge.ai.o;
import com.github.catvod.spider.merge.ai.p;
import com.github.catvod.spider.merge.ai.s;
import com.github.catvod.spider.merge.bk.C0930d;
import com.github.catvod.spider.merge.bk.C0931e;
import com.github.catvod.spider.merge.bk.C0932f;
import com.github.catvod.spider.merge.nIe;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class Market extends Spider {
    private ProgressDialog a;
    private List<o> b;
    private boolean c;

    public static void a(final Market market, List list) {
        market.getClass();
        String str = (String) list.get(0);
        int i = 2;
        try {
            if (market.isBusy()) {
                return;
            }
            market.setBusy(true);
            Init.run(new s(market, 1), 500);
            Response responseExecute = com.github.catvod.spider.merge.af.FilterValue.a().newCall(new Request.Builder().url(str).build()).execute();
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), Uri.parse(str).getLastPathSegment());
            InputStream inputStreamByteStream = responseExecute.body().byteStream();
            double d = Double.parseDouble(responseExecute.header(nIe.d("01093D372C21364B1F262728360E"), nIe.d("73")));
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamByteStream);
            try {
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
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    final int i3 = (int) ((d2 / d) * 100.0d);
                    Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.ai.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            Market.c(this.a, i3);
                        }
                    });
                }
                bufferedInputStream.close();
                if (file.getName().endsWith(nIe.d("6C1C3A33"))) {
                    C0930d.b(file, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                }
                if (file.getName().endsWith(nIe.d("6C072328"))) {
                    try {
                        Runtime.getRuntime().exec(nIe.d("210E3E2C2D6F75516463") + file).waitFor();
                    } catch (Exception e) {
                        StringUtils.printStackTrace();
                    }
                    C0930d.a(file);
                } else {
                    C0931e.b(nIe.d("A6DED8ABF5C6A7C8DFA5C1DF"));
                }
                market.e(str);
                Init.run(new s(market, i));
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e2) {
            C0931e.b(e2.getMessage());
            Init.run(new s(market, i));
        }
    }

    public static /* synthetic */ void b(Market market) {
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
            StringUtils.printStackTrace();
        }
    }

    public static /* synthetic */ void c(Market market, int i) {
        market.getClass();
        try {
            ProgressDialog progressDialog = market.a;
            if (progressDialog != null) {
                progressDialog.setProgress(i);
            }
        } catch (Exception e) {
            StringUtils.printStackTrace();
        }
    }

    public static /* synthetic */ void d(Market market) {
        market.getClass();
        try {
            market.setBusy(false);
            ProgressDialog progressDialog = market.a;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception e) {
            StringUtils.printStackTrace();
        }
    }

    private void e(String str) {
        for (o oVar : this.b) {
            int iIndexOf = oVar.b().indexOf(new p(str));
            if (iIndexOf != -1) {
                String strA = oVar.b().get(iIndexOf).a();
                if (strA.isEmpty()) {
                    return;
                }
                int i = C0932f.a;
                ((ClipboardManager) Init.context().getSystemService(nIe.d("210A3A332B20231437"))).setPrimaryClip(ClipData.newPlainText(nIe.d("24093D242426"), strA));
                C0931e.b(nIe.d("A7D1E1ABEDC8AAC5EE63") + strA);
                return;
            }
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        for (o oVar : this.b) {
            if (oVar.c().equals(str)) {
                k kVar = new k();
                kVar.a();
                kVar.d(oVar.d());
                return kVar.toString();
            }
        }
        return super.categoryContent(str, str2, z, map);
    }

    public String detailContent(final List<String> list) {
        final int i = 0;
        Init.run(new s(this, i));
        GeneralUtils mVar = new GeneralUtils();
        mVar.a();
        mVar.b();
        Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.ai.r
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        Market.a((Market) this, (List) list);
                        break;
                    default:
                        Notice.a((Notice) this, (String) list);
                        break;
                }
            }
        });
        return k.b(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (this.VodCategory.size() > 1) {
            for (int i = 1; i < this.VodCategory.size(); i++) {
                o oVar = this.VodCategory.get(i);
                arrayList.add(new JsonUtils(oVar.c(), oVar.c()));
            }
        }
        return k.c(arrayList, this.VodCategory.get(0).d());
    }

    public void init(Context context, String str) {
        if (str.startsWith(nIe.d("2A122733"))) {
            str = com.github.catvod.spider.merge.af.FilterValue.b(str);
        }
        this.b = o.a(str);
        Init.checkPermission();
    }

    public boolean isBusy() {
        return this.c;
    }

    public void setBusy(boolean z) {
        this.c = z;
    }
}
