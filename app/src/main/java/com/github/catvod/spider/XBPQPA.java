package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.bean.VodResult;
import com.github.catvod.bean.vod.FilterGroup;
import com.github.catvod.bean.vod.StringUtils;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class XBPQPA extends XBPQAli {
    private List<StringUtils> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.startsWith("file://")) {
            File file = new File(str.replace("file://", ""));
            if (file.getParentFile() != null) {
                File[] fileArrListFiles = file.getParentFile().listFiles();
                fileArrListFiles.getClass();
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    String strB = name.substring(name.lastIndexOf(".") + 1);
                    if (strB.equals("srt") || strB.equals("ass") || strB.equals("ssa")) {
                        String baseName = name.contains(".") ? name.substring(0, name.lastIndexOf(".")) : name;
                        StringUtils eVar = new StringUtils();
                        eVar.c(baseName);
                        StringUtils eVarA = eVar.a(strB);
                        StringBuilder sbB = new StringBuilder("file://");
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
                if (listAsList.contains(str.substring(str.lastIndexOf(".") + 1))) {
                    for (String str2 : listAsList2) {
                        String strConcat = (str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str).concat(".").concat(str2);
                        if (OkHttpUtil.string(strConcat) != null) {
                            String lastPathSegment = Uri.parse(strConcat).getLastPathSegment();
                            StringUtils eVar2 = new StringUtils();
                            eVar2.c(lastPathSegment);
                            StringUtils eVarA2 = eVar2.a(str2);
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

    private VodResult b(String str) {
        VodResult gVar = new VodResult();
        gVar.f(str);
        gVar.g(str);
        gVar.a("XBPQ");
        gVar.h("https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        gVar.i(TextUtils.join("$$$", str.startsWith("http") ? Arrays.asList("解析", "嗅探", "直链") : str.startsWith("magnet") ? Arrays.asList("直连", "嗅探", "解析") : Arrays.asList("嗅探", "解析", "直连")));
        gVar.j(TextUtils.join("$$$", Arrays.asList("播放$" + str, "播放$" + str, "播放$" + str)));
        return gVar;
    }

    @Override // com.github.catvod.spider.XBPQAli
    public String detailContent(List<String> list) {
        try {
            String strTrim = list.get(0).trim();
            if (strTrim.contains("magnet")) {
                strTrim = strTrim.replaceAll("[\\S\\s]*(magnet:\\?xt=urn:btih:[0-9a-fA-F]{40})[\\S\\s]*", "$1");
            }
            if (strTrim.contains("https://www.aliyundrive.com/s/") || strTrim.contains("https://www.alipan.com/s/")) {
                strTrim = strTrim.replace("www.alipan.com", "www.aliyundrive.com").replaceAll("[\\S\\s]*(https://www\\.aliyundrive\\.com/s/\\S{11})[\\S\\s]*", "$1");
            }
            return strTrim.contains("aliyundrive") ? super.detailContent(list) : FilterGroup.e(b(strTrim));
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.XBPQAli
    public void init(Context context, String str) {
        super.init(context, str);
    }

    @Override // com.github.catvod.spider.XBPQAli
    public String playerContent(String str, String str2, List<String> list) {
        try {
            if (str2.contains("youtube.com")) {
                FilterGroup dVar = new FilterGroup();
                dVar.i(Youtube.fetch(str2));
                return dVar.toString();
            }
            if (str.equals("直连")) {
                FilterGroup dVar2 = new FilterGroup();
                dVar2.i(str2);
                dVar2.h(a(str2));
                return dVar2.toString();
            }
            if (str.equals("嗅探")) {
                FilterGroup dVar3 = new FilterGroup();
                dVar3.d();
                dVar3.i(str2);
                return dVar3.toString();
            }
            if (!str.equals("解析")) {
                return super.playerContent(str, str2, list);
            }
            FilterGroup dVar4 = new FilterGroup();
            dVar4.d();
            dVar4.b();
            dVar4.i(str2);
            return dVar4.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
