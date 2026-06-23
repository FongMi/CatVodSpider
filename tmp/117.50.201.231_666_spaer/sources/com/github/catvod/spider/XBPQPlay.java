package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.C0.b.n;
import com.github.catvod.spider.merge.C0.c.g;
import com.github.catvod.spider.merge.C0.j.m;
import com.github.catvod.spider.merge.C0.j.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class XBPQPlay extends Spider {
    private List<com.github.catvod.spider.merge.C0.c.e> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.startsWith("file://")) {
            File file = new File(str.replace("file://", ""));
            if (file.getParentFile() != null) {
                File[] fileArrListFiles = file.getParentFile().listFiles();
                fileArrListFiles.getClass();
                for (File file2 : fileArrListFiles) {
                    String strB = o.b(file2.getName());
                    if (o.d(strB)) {
                        com.github.catvod.spider.merge.C0.c.e eVar = new com.github.catvod.spider.merge.C0.c.e();
                        eVar.c(o.e(file2.getName()));
                        com.github.catvod.spider.merge.C0.c.e eVarA = eVar.a(strB);
                        StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("file://");
                        sbB.append(file2.getAbsolutePath());
                        eVarA.d(sbB.toString());
                        arrayList.add(eVarA);
                    }
                }
            }
        }
        if (str.startsWith("http://")) {
            try {
                List listAsList = Arrays.asList("mp4", "mkv");
                List<String> listAsList2 = Arrays.asList("srt", "ass");
                if (listAsList.contains(o.b(str))) {
                    for (String str2 : listAsList2) {
                        String strConcat = o.e(str).concat(".").concat(str2);
                        if (com.github.catvod.spider.merge.C0.h.b.a(strConcat).code() == 200) {
                            String lastPathSegment = Uri.parse(strConcat).getLastPathSegment();
                            com.github.catvod.spider.merge.C0.c.e eVar2 = new com.github.catvod.spider.merge.C0.c.e();
                            eVar2.c(lastPathSegment);
                            com.github.catvod.spider.merge.C0.c.e eVarA2 = eVar2.a(str2);
                            eVarA2.d(strConcat);
                            arrayList.add(eVarA2);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    private g b(String str) {
        g gVar = new g();
        gVar.f(str);
        gVar.g(str);
        gVar.a("XBPQ");
        gVar.h("https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        gVar.i(TextUtils.join("$$$", m.d(str) ? Arrays.asList("解析", "嗅探", "直链") : (m.c(str) || str.startsWith("magnet")) ? Arrays.asList("直连", "嗅探", "解析") : Arrays.asList("嗅探", "解析", "直连")));
        gVar.j(TextUtils.join("$$$", Arrays.asList(n.a("播放$", str), n.a("播放$", str), n.a("播放$", str))));
        return gVar;
    }

    public String detailContent(List<String> list) {
        try {
            String strTrim = list.get(0).trim();
            if (strTrim.contains("magnet")) {
                strTrim = strTrim.replaceAll("[\\S\\s]*(magnet:\\?xt=urn:btih:[0-9a-fA-F]{40})[\\S\\s]*", "$1");
            }
            return com.github.catvod.spider.merge.C0.c.d.e(b(strTrim));
        } catch (Exception e) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String playerContent(String str, String str2, List<String> list) {
        try {
            if (str2.contains("youtube.com")) {
                com.github.catvod.spider.merge.C0.c.d dVar = new com.github.catvod.spider.merge.C0.c.d();
                dVar.i(Youtube.fetch(str2));
                return addDanmaku(dVar.toString());
            }
            if (str.equals("直连")) {
                com.github.catvod.spider.merge.C0.c.d dVar2 = new com.github.catvod.spider.merge.C0.c.d();
                dVar2.i(str2);
                dVar2.h(a(str2));
                return addDanmaku(dVar2.toString());
            }
            if (str.equals("嗅探")) {
                com.github.catvod.spider.merge.C0.c.d dVar3 = new com.github.catvod.spider.merge.C0.c.d();
                dVar3.d();
                dVar3.i(str2);
                return addDanmaku(dVar3.toString());
            }
            if (!str.equals("解析")) {
                return addDanmaku(new com.github.catvod.spider.merge.C0.c.d().toString());
            }
            com.github.catvod.spider.merge.C0.c.d dVar4 = new com.github.catvod.spider.merge.C0.c.d();
            dVar4.d();
            dVar4.b();
            dVar4.i(str2);
            return addDanmaku(dVar4.toString());
        } catch (Exception e) {
            return addDanmaku("");
        }
    }
}
