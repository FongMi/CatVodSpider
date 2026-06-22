package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.BuilderUtils;

import com.github.catvod.spider.merge.I0.GeneralUtils;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.K.VodResult;

import com.github.catvod.spider.merge.KI.Subtitle;
import com.github.catvod.spider.merge.y.z;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Push extends NetPan {
    public static final List<String> m = Arrays.asList("thunder", "magnet", "ed2k", "ftp");
    private String l = "http://127.0.0.1:8090";

    public static String extractFileName(String str) {
        Matcher matcher = Pattern.compile(".*/([^/?]+)").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private String f(String str) throws InterruptedException, UnsupportedEncodingException {
        String strA = com.github.catvod.spider.merge.f0.HttpClient.j(ConcatUtils.b(new StringBuilder(), this.l, "/torrents"), String.format("{\"action\":\"add\",\"link\":\"%s\",\"title\":\"\",\"poster\":\"\",\"save_to_db\":true}", str), new HashMap()).a();
        SpiderDebug.log("torr1 Torrent added" + strA);
        try {
            String string = new JSONObject(strA).getString("hash");
            String strB = null;
            String strM = com.github.catvod.spider.merge.f0.HttpClient.m(z.b(new StringBuilder(), this.l, "/playlist?hash=", string), new HashMap(), null);
            if (!strM.contains("http")) {
                Thread.sleep(3000L);
                strM = com.github.catvod.spider.merge.f0.HttpClient.m(z.b(new StringBuilder(), this.l, "/playlist?hash=", string), new HashMap(), null);
            }
            Matcher matcher = Pattern.compile("http[^\n]+").matcher(strM);
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                System.out.println((String) it.next());
            }
            for (int i = 0; i < arrayList.size(); i++) {
                StringBuilder sb = new StringBuilder();
                if (strB == null) {
                    strB = "";
                }
                sb.append(strB);
                sb.append(URLDecoder.decode(extractFileName((String) arrayList.get(i)), StandardCharsets.UTF_8.toString()));
                sb.append("$");
                strB = ConcatUtils.b(sb, (String) arrayList.get(i), "#");
            }
            return strB;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Subtitle> g(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.startsWith("file://")) {
            File file = new File(str.replace("file://", ""));
            if (file.getParentFile() != null) {
                File[] fileArrListFiles = file.getParentFile().listFiles();
                fileArrListFiles.getClass();
                for (File file2 : fileArrListFiles) {
                    String strJ = GeneralUtils.j(file2.getName());
                    if (GeneralUtils.r(strJ)) {
                        Subtitle hVar = new Subtitle();
                        hVar.b(GeneralUtils.x(file2.getName()));
                        Subtitle hVarA = hVar.a(strJ);
                        StringBuilder sbB = BuilderUtils.b("file://");
                        sbB.append(file2.getAbsolutePath());
                        hVarA.c(sbB.toString());
                        arrayList.add(hVarA);
                    }
                }
            }
        }
        if (str.startsWith("http://")) {
            List listAsList = Arrays.asList("mp4", "mkv");
            List<String> listAsList2 = Arrays.asList("srt", "ass");
            if (listAsList.contains(GeneralUtils.j(str))) {
                for (String str2 : listAsList2) {
                    String strConcat = GeneralUtils.x(str).concat(".").concat(str2);
                    if (com.github.catvod.spider.merge.f0.HttpClient.l(strConcat).length() <= 100) {
                        String lastPathSegment = Uri.parse(strConcat).getLastPathSegment();
                        Subtitle hVar2 = new Subtitle();
                        hVar2.b(lastPathSegment);
                        Subtitle hVarA2 = hVar2.a(str2);
                        hVarA2.c(strConcat);
                        arrayList.add(hVarA2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean isThunder(String str) {
        return GeneralUtils.contains(scheme(str));
    }

    public static String scheme(String str) {
        String scheme = Uri.parse(str).getScheme();
        return scheme == null ? "" : scheme.toLowerCase();
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        String strJoin;
        if (NetPan.isNetPan(list.get(0))) {
            return super.detailContent("", "", list);
        }
        if (com.github.catvod.spider.merge.P0.StringUtils.d(Youtube.hasYouTube(list.get(0)))) {
            return Youtube.get().detailContent(list);
        }
        String str = list.get(0);
        VodItem iVar = new VodItem();
        iVar.l(str);
        iVar.g("FongMi");
        iVar.m(str.startsWith("file://") ? new File(str).getName() : str);
        iVar.n("https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        if (isThunder(str)) {
            String strF = null;
            try {
                strF = f(str);
            } catch (Exception unused) {
                System.out.println("获取在线Torr失败");
            }
            List listAsList = Arrays.asList("迅雷磁力", "Torr在线磁力");
            StringBuilder sb = new StringBuilder();
            Iterator it = listAsList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "$$$");
                }
            }
            iVar.o(sb.toString());
            List listAsList2 = Arrays.asList(ConcatUtils.a("播放$", str), strF);
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = listAsList2.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) "$$$");
                }
            }
            strJoin = sb2.toString();
        } else {
            iVar.o(TextUtils.join("$$$", Arrays.asList("直連", "嗅探", "解析")));
            strJoin = TextUtils.join("$$$", Arrays.asList(ConcatUtils.a("播放$", str), ConcatUtils.a("播放$", str), ConcatUtils.a("播放$", str)));
        }
        iVar.p(strJoin);
        return VodResult.m(iVar);
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
    }

    @Override // com.github.catvod.en.NetPan
    public String playerContent(String str, String str2, List<String> list) {
        if (str.equals("直連")) {
            VodResult gVar = new VodResult();
            gVar.w(str2);
            gVar.v(g(str2));
            return gVar.toString();
        }
        if (str.startsWith("Torr在线磁力") || str.startsWith("迅雷")) {
            VodResult gVar2 = new VodResult();
            gVar2.w(str2);
            gVar2.v(g(str2));
            return gVar2.toString();
        }
        if (str.equals("嗅探")) {
            VodResult gVar3 = new VodResult();
            gVar3.k();
            gVar3.w(str2);
            return gVar3.toString();
        }
        if (!str.equals("解析")) {
            return com.github.catvod.spider.merge.P0.StringUtils.d(Youtube.hasYouTube(str2)) ? Youtube.get().playerContent(null, str2, null) : super.playerContent(str, str2, list);
        }
        VodResult gVar4 = new VodResult();
        gVar4.k();
        gVar4.h();
        gVar4.w(str2);
        return gVar4.toString();
    }
}
