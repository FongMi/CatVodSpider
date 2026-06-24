package com.github.catvod.utils.merge;

import android.util.Base64;
import com.github.catvod.bean.yun139.Yun139Comparator;
import com.github.catvod.bean.yun139.Yun139File;
import com.github.catvod.bean.yun139.Yun139Folder;
import com.github.catvod.bean.yun139.Yun139Response;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Proxy;
import com.github.catvod.utils.GsonHelper;
import com.github.catvod.utils.MapHelper;
import com.github.catvod.utils.PanHttpClient;
import com.github.catvod.utils.PanStringUtils;
import com.github.catvod.utils.merge.C1290c;
import com.github.catvod.utils.server.Server;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public final class Yun139Api {
    private static class Holder { static final Yun139Api INSTANCE = new Yun139Api(); }
    public String a;

    Yun139Api() {
    }

    public static Yun139Api a() {
        return Holder.INSTANCE;
    }

    private List<Yun139File> b(String str, com.github.catvod.bean.VodItem iVar) {
        String strH = h("yun-share/richlifeApp/devapp/IOutLink/getOutLinkInfoV6", String.format("{\"getOutLinkInfoReq\":{\"account\":\"\",\"linkID\":\"%s\",\"passwd\":\"\",\"caSrt\":0,\"coSrt\":0,\"srtDr\":1,\"bNum\":1,\"pCaID\":\"root\",\"eNum\":200}}", str), false);
        ArrayList arrayList = new ArrayList();
        Yun139Response eVar = GsonHelper.fromJson(strH, Yun139Response.class);
        iVar.m(eVar.data.h);
        SpiderDebug.log("shareMediaEntity:" + eVar);
        List<Yun139File> list = eVar.data.c;
        if (list != null) {
            Collections.sort(list, new Yun139Comparator());
            arrayList.addAll(eVar.data.c);
        }
        SpiderDebug.log("shareMediaEntity:" + eVar);
        f(str, arrayList, eVar);
        return arrayList;
    }

    private void f(String str, List<Yun139File> list, Yun139Response eVar) {
        List<Yun139Folder> list2 = eVar.data.b;
        if (list2 != null) {
            Iterator<Yun139Folder> it = list2.iterator();
            while (it.hasNext()) {
                Yun139Response eVar2 = GsonHelper.fromJson(h("yun-share/richlifeApp/devapp/IOutLink/getOutLinkInfoV6", String.format("{\"getOutLinkInfoReq\":{\"extInfo\":{\"isReturnCdnDownloadUrl\":\"1\"},\"account\":\"\",\"linkID\":\"%s\",\"passwd\":\"\",\"caSrt\":0,\"coSrt\":0,\"srtDr\":1,\"bNum\":1,\"pCaID\":\"%s\",\"eNum\":200}}", str, it.next().f), false), Yun139Response.class);
                List<Yun139File> list3 = eVar2.data.c;
                if (list3 != null) {
                    Collections.sort(list3, new Yun139Comparator());
                    list.addAll(eVar2.data.c);
                }
                f(str, list, eVar2);
            }
        }
    }

    private static final byte[] AES_KEY = "PVGDwmcvfs1uV3d1".getBytes();

    private static String aesEncrypt(String plaintext) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(AES_KEY, "AES");
        byte[] iv = new byte[16];
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(iv));
        byte[] encrypted = cipher.doFinal(plaintext.getBytes("UTF-8"));
        byte[] result = new byte[16 + encrypted.length];
        System.arraycopy(iv, 0, result, 0, 16);
        System.arraycopy(encrypted, 0, result, 16, encrypted.length);
        return java.util.Base64.getEncoder().encodeToString(result);
    }

    private static String aesDecrypt(byte[] data) throws Exception {
        byte[] iv = new byte[16];
        System.arraycopy(data, 0, iv, 0, 16);
        SecretKeySpec keySpec = new SecretKeySpec(AES_KEY, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(iv));
        byte[] decrypted = cipher.doFinal(data, 16, data.length - 16);
        return new String(decrypted, "UTF-8");
    }

    private String h(String str, String str2, boolean z) {
        HashMap<String, String> mapD;
        String str3;
        if (!str.startsWith("https")) {
            str = UrlUtils.resolveUrl("https://caiyun.139.com/", str);
        }
        String strG;
        try {
            strG = aesEncrypt(str2);
        } catch (Exception e) {
            SpiderDebug.log("AES encrypt failed: " + e.getMessage());
            return null;
        }
        if (z) {
            mapD = new HashMap<>();
            StringBuilder sbB = new StringBuilder("Authorization ");
            sbB.append(this.a);
            SpiderDebug.log(sbB.toString());
            mapD.put("Authorization", "Basic " + this.a);
            mapD.put("Content-Type", "application/json;charset=UTF-8");
            mapD.put("hcy-cool-flag", "1");
            mapD.put("x-DeviceInfo", "||9|12.27.0|chrome|120.0.0.0|||windows 10|746X932|zh-CN|||");
        } else {
            mapD = d();
        }
        PanHttpClient.HttpResponse iVarJ = PanHttpClient.post(str, strG, mapD);
        try {
            byte[] bArrA = java.util.Base64.getDecoder().decode(iVarJ.body());
            str3 = aesDecrypt(bArrA);
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = null;
        }
        SpiderDebug.log(iVarJ.code() + "," + str + "," + str3);
        return str3;
    }

    public final String c(String str, String str2) {
        try {
            Object[] objArr = new Object[3];
            String[] strArrSplit = new String(Base64.decode(this.a, 0)).split(":", 3);
            if (strArrSplit.length < 2) {
                throw new IllegalArgumentException("Authorization is invalid, splits < 2");
            }
            SpiderDebug.log(strArrSplit[1]);
            objArr[0] = strArrSplit[1];
            objArr[1] = str;
            objArr[2] = str2;
            return new JSONObject(h("yun-share/richlifeApp/devapp/IOutLink/dlFromOutLinkV3", String.format("{\"dlFromOutLinkReqV3\":{\"account\":\"%s\",\"linkID\":\"%s\",\"coIDLst\":{\"item\":[\"%s\"]},\"extInfo\":{\"isReturnCdnDownloadUrl\":\"1\"}}}", objArr), true)).getJSONObject("data").getString("redrUrl");
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public final HashMap<String, String> d() {
        HashMap<String, String> mapB = MapHelper.of("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Content-Type", "application/json;charset=UTF-8");
        mapB.put("hcy-cool-flag", "1");
        mapB.put("x-DeviceInfo", "||9|12.27.0|chrome|120.0.0.0|||windows 10|746X932|zh-CN|||");
        return mapB;
    }

    public final com.github.catvod.bean.VodItem e(String str, String str2, String str3) {
        List listAsList = Arrays.asList("异动普畫", "异动原畫");
        try {
            com.github.catvod.bean.VodItem iVar = new com.github.catvod.bean.VodItem();
            List<Yun139File> listB = b(str3, iVar);
            SpiderDebug.log("getCoLsts(shareId)");
            ArrayList arrayList = new ArrayList();
            for (Yun139File bVar : listB) {
                if (bVar.a() != null) {
                    arrayList.add(bVar);
                }
            }
            SpiderDebug.log("Comparator.comparing");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                Yun139File bVar2 = (Yun139File) arrayList.get(i);
                arrayList2.add(bVar2.b() + "$" + str3 + "+" + bVar2.p + "+" + str + "+" + bVar2.a() + "+" + bVar2.i);
            }
            for (int i2 = 0; i2 < listAsList.size(); i2++) {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb.append((CharSequence) "#");
                        }
                    }
                }
                arrayList3.add(sb.toString());
            }
            iVar.l(str2);
            iVar.j(str2);
            iVar.n(((Yun139File) arrayList.get(0)).h);
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) "$$$");
                }
            }
            iVar.p(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            Iterator it3 = listAsList.iterator();
            if (it3.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it3.next());
                    if (!it3.hasNext()) {
                        break;
                    }
                    sb3.append((CharSequence) "$$$");
                }
            }
            iVar.o(sb3.toString());
            iVar.g("异动");
            return iVar;
        } catch (Exception unused) {
            return BaseApi.fakeVod(listAsList, "异动雲盤");
        }
    }

    public final String g(String[] strArr, boolean z) {
        String isoDownloadUrl;
        if (!z) {
            try {
                PlayResult gVar = new PlayResult();
                gVar.setUrl(strArr[4]);
                gVar.setHeaders(d());
                return gVar.toString();
            } catch (Exception e) {
                e.printStackTrace();
                PlayResult gVar2 = new PlayResult();
                gVar2.setUrl("");
                return gVar2.toString();
            }
        }
        try {
            System.out.println("https://danmu.lxian74a.repl.co/danmuku/?vodName=" + strArr[2] + "&jishu=" + strArr[3]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String strW = Server.w(strArr[0], strArr[1]);
        if (BaseApi.get().d.booleanValue()) {
            String str = strArr[2] + strArr[3];
            BaseApi.get().downloadFileWithDownloadManager(strW, str, d());
            SpiderDebug.log("正在下载 " + str);
            isoDownloadUrl = Server.B();
        } else {
            isoDownloadUrl = NetPan.getIsoDownloadUrl(strW);
        }
        PlayResult gVar3 = new PlayResult();
        gVar3.setUrl(isoDownloadUrl);
        gVar3.setOctetStream();
        gVar3.setExtra(AliDriveHelper.getDanmakuUrl(strArr));
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (str2.contains("@@@")) {
                String[] strArrSplit = str2.split("@@@");
                String str3 = strArrSplit[0];
                String str4 = strArrSplit[1];
                String str5 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                com.github.catvod.bean.h hVar = new com.github.catvod.bean.h();
                hVar.b(str3);
                com.github.catvod.bean.h hVarA = hVar.a(str4);
                hVarA.c(str5);
                arrayList.add(hVarA);
            }
        }
        gVar3.v(arrayList);
        gVar3.setHeaders(d());
        return gVar3.toString();
    }
}
