package com.github.catvod.spider;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.o.C0394j;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.w;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.i.C0568a;
import com.github.catvod.spider.merge.m.C0590I;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PanQuark extends Pan {
    private w h;
    public ProgressDialog i;
    public boolean j;

    private void b(String str, String str2, List<C0554e> list, boolean z, boolean z2) {
        ArrayList<C0568a> arrayList = new ArrayList();
        if (z) {
            this.h.r(str2, arrayList);
        } else {
            this.h.u(str);
            this.h.w(str, str2, 1, arrayList);
        }
        for (C0568a c0568a : arrayList) {
            C0554e c0554e = new C0554e();
            c0554e.j(C0590I.o(str, c0568a.b(), str2, c0568a.d()));
            c0554e.k(Pan.a(c0568a.c()));
            c0554e.l(c0568a.f() ? "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_f.png" : "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_v.png");
            c0554e.m(c0568a.e());
            if (c0554e.b().contains(".apk")) {
                c0554e.r(c0554e.a());
            }
            c0554e.p(c0568a.f() ? "folder" : "file");
            if (!z2 || c0568a.g()) {
                list.add(c0554e);
            }
        }
    }

    public String action(String str) {
        try {
            if (isBusy()) {
                return "";
            }
            setBusy(true);
            Init.run(new Runnable() { // from class: com.github.catvod.spider.PanQuark.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PanQuark panQuark = PanQuark.this;
                        ProgressDialog progressDialog = new ProgressDialog(Init.getActivity());
                        panQuark.i = progressDialog;
                        progressDialog.setProgressStyle(1);
                        PanQuark.this.i.setMax(100);
                        PanQuark.this.i.setCancelable(false);
                        if (PanQuark.this.isBusy()) {
                            PanQuark.this.i.show();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            JSONObject jSONObjectOptJSONObject = new JSONArray(str).optJSONObject(0);
            Response responseExecute = new OkHttpClient().newCall(new Request.Builder().url(this.h.ss(new String[]{jSONObjectOptJSONObject.optString("folder"), jSONObjectOptJSONObject.optString("shareId"), jSONObjectOptJSONObject.optString("fileToken")}, "我的夸克原画")).build()).execute();
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "quark_" + System.currentTimeMillis() + ".apk");
            InputStream inputStreamByteStream = responseExecute.body().byteStream();
            double d = Double.parseDouble(responseExecute.header("Content-Length", "1"));
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamByteStream);
            byte[] bArr = new byte[4096];
            long j = 0;
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                j += (long) i;
                fileOutputStream.write(bArr, 0, i);
                double d2 = j;
                Double.isNaN(d2);
                final int i2 = (int) ((d2 / d) * 100.0d);
                Init.run(new Runnable() { // from class: com.github.catvod.spider.PanQuark.4
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (PanQuark.this.i != null) {
                                PanQuark.this.i.setProgress(i2);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
            bufferedInputStream.close();
            fileOutputStream.close();
            if (file.getName().endsWith(".apk")) {
                l.f(file);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(file) { // from class: com.github.catvod.spider.PanQuark.1
                    private final File file;

                    {
                        this.file = file;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            File file2 = this.file;
                            if (file2 == null || !file2.exists() || file2.delete()) {
                                return;
                            }
                            C0394j.b("Delete file failed");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, 10000L);
            }
            Init.run(new Runnable() { // from class: com.github.catvod.spider.PanQuark.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PanQuark.this.setBusy(false);
                        if (PanQuark.this.i != null) {
                            PanQuark.this.i.dismiss();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            return "";
        } catch (Exception e) {
            Init.run(new Runnable() { // from class: com.github.catvod.spider.PanQuark.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PanQuark.this.setBusy(false);
                        if (PanQuark.this.i != null) {
                            PanQuark.this.i.dismiss();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("shareId");
                String strOptString2 = jSONObjectOptJSONObject.optString("folder");
                jSONObjectOptJSONObject.optString("sharePwd");
                b(strOptString, strOptString2, arrayList, TextUtils.isEmpty(strOptString), false);
            }
            C0552c c0552c = new C0552c();
            c0552c.i(1, 1, 0, 0);
            c0552c.w(arrayList);
            return c0552c.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        JSONObject jSONObjectOptJSONObject = new JSONArray(list.get(0)).optJSONObject(0);
        String strOptString = jSONObjectOptJSONObject.optString("shareId");
        jSONObjectOptJSONObject.optString("folder");
        jSONObjectOptJSONObject.optString("sharePwd");
        String strOptString2 = jSONObjectOptJSONObject.optString("parentId");
        C0554e c0554e = new C0554e();
        c0554e.j(list.get(0));
        c0554e.k("");
        c0554e.l("https://img.youxiguancha.com/29/imgfile/20230817/17092205srh1.png");
        c0554e.m(TextUtils.join("$$$", Config.getQuarkOptions()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C0554e> arrayList3 = new ArrayList();
        b(strOptString, strOptString2, arrayList3, TextUtils.isEmpty(strOptString), true);
        for (C0554e c0554e2 : arrayList3) {
            JSONObject jSONObjectOptJSONObject2 = new JSONArray(c0554e2.a()).optJSONObject(0);
            arrayList2.add(c0554e2.b() + "$" + jSONObjectOptJSONObject2.optString("folder") + Marker.ANY_NON_NULL_MARKER + strOptString + Marker.ANY_NON_NULL_MARKER + jSONObjectOptJSONObject2.optString("fileToken"));
        }
        for (int i = 0; i < Config.getQuarkOptions().size(); i++) {
            arrayList.add(TextUtils.join("#", arrayList2));
        }
        c0554e.n(TextUtils.join("$$$", arrayList));
        return C0529a.processVodData(C0552c.m(c0554e));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray("[{\"name\":\"我的夸克网盘\",\"folders\":[{\"shareId\":\"\",\"folder\":\"0\"}]},{\"name\":\"软件商店\",\"folders\":[{\"shareId\":\"969cc97687d3\",\"folder\":\"0\"},{\"shareId\":\"cb0ee2b9ac64\",\"folder\":\"0\"},{\"shareId\":\"6f7316f47eb7\",\"folder\":\"0\"}]},{\"name\":\"幼儿教育\",\"folders\":[{\"shareId\":\"a08f66152533\",\"folder\":\"0\"}]},{\"name\":\"短剧合集\",\"folders\":[{\"shareId\":\"885fd4ba2d92\",\"folder\":\"0\"},{\"shareId\":\"a1cda418984f\",\"folder\":\"0\"}]},{\"name\":\"电影合集\",\"folders\":[{\"shareId\":\"49ab75d52e00\",\"folder\":\"0\"},{\"shareId\":\"a632967760cf\",\"folder\":\"0\"},{\"shareId\":\"2f59bb5d96b9\",\"folder\":\"0\"},{\"shareId\":\"50828c368def\",\"folder\":\"0\"},{\"shareId\":\"e07e26aecc08\",\"folder\":\"0\"},{\"shareId\":\"0536a38a356e\",\"folder\":\"0\"},{\"shareId\":\"e273ef697403\",\"folder\":\"0\"},{\"shareId\":\"c8ac6c88e5d8\",\"folder\":\"0\"}]},{\"name\":\"电视剧合集\",\"folders\":[{\"shareId\":\"d19c4ebe1ff7\",\"folder\":\"0\"},{\"shareId\":\"cd4c5ac7e830\",\"folder\":\"0\"},{\"shareId\":\"e1b2ba8b6d6c\",\"folder\":\"0\"},{\"shareId\":\"166fa0a7ca6f\",\"folder\":\"0\"},{\"shareId\":\"37a92c0b7f10\",\"folder\":\"0\"},{\"shareId\":\"fb3386e42af2\",\"folder\":\"0\"},{\"shareId\":\"46ce214f4ed7\",\"folder\":\"0\"},{\"shareId\":\"fe4681d7fb43\",\"folder\":\"0\"},{\"shareId\":\"8d65e885b059\",\"folder\":\"0\"}]}]");
            w wVar = this.h;
            if (wVar == null || TextUtils.isEmpty(wVar.j())) {
                arrayList.add(new C0550a("0", "还未登录夸克账号,请前往【配置中心】登录", "1"));
            } else {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    arrayList.add(new C0550a(jSONObjectOptJSONObject.optString("folders"), jSONObjectOptJSONObject.optString("name"), "1"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return C0552c.p(arrayList, new ArrayList());
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            this.h = w.e();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isBusy() {
        return this.j;
    }

    public void setBusy(boolean z) {
        this.j = z;
    }
}
