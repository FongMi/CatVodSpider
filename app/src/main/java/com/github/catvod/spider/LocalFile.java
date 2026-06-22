package com.github.catvod.spider;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.q1.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;


public class LocalFile extends Spider {
    public static boolean checkstring(String str) {
        String[] strArr = {".avi", ".wmv", ".rm", ".3gp", ".mov", ".mp", ".m4", ".vob", ".ts", ".webm", ".dat", ".m3u", ".mkv", ".flv", ".aac", ".wma", ".flac", ".ape"};
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < 18; i++) {
            if (lowerCase.contains(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            File[] fileArrListFiles = new File(str).listFiles();
            Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.github.catvod.spider.Ԩ
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((File) obj).getName().compareTo(((File) obj2).getName());
                }
            });
            JSONArray jSONArray = new JSONArray();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (name.indexOf(46) != 0) {
                    String strD = "https://img.tukuppt.com/png_preview/00/18/23/GBmBU6fHo7.jpg!/fw/260";
                    if (!file.isDirectory()) {
                        strD = "https://img.tukuppt.com/png_preview/00/42/50/3ySGW7mvyY.jpg!/fw/260";
                    }
                    if (file.isDirectory() || checkstring(name)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vod_id", file.getAbsolutePath());
                        jSONObject.put("vod_name", file.getName());
                        jSONObject.put("vod_pic", strD);
                        jSONObject.put("vod_tag", file.isDirectory() ? "folder" : "file");
                        jSONObject.put("vod_remarks", m41(file.lastModified(), "yyyy/MM/dd aHH:mm:ss"));
                        jSONArray.put(jSONObject);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("page", 1);
            jSONObject2.put("pagecount", 1);
            jSONObject2.put("limit", jSONArray.length());
            jSONObject2.put("total", jSONArray.length());
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            StringUtils.printStackTrace(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String str = list.get(0);
            String parent = new File(str).getParent();
            File[] fileArrListFiles = new File(parent).listFiles();
            Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.github.catvod.spider.Ԫ
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((File) obj).getName().compareTo(((File) obj2).getName());
                }
            });
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (name.indexOf(46) != 0 && file.isFile() && checkstring(name)) {
                    arrayList.add(name + "$" + file.getAbsolutePath());
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod_id", str);
            jSONObject.put("vod_name", parent);
            jSONObject.put("vod_pic", "");
            jSONObject.put("type_name", "");
            jSONObject.put("vod_play_from", "♥香雅情");
            jSONObject.put("vod_play_url", TextUtils.join("#", arrayList));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            StringUtils.printStackTrace();
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", Environment.getExternalStorageDirectory().getAbsolutePath());
            jSONObject.put("type_name", "本地文件");
            jSONObject.put("type_flag", "1");
            jSONArray.put(jSONObject);
            new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", new JSONObject("{}"));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            StringUtils.printStackTrace(e);
            return "";
        }
    }

    public void init(Context context) throws Exception {
        super.init(context);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            StringUtils.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        return "";
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    String m41(long j, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat(str).format(calendar.getTime());
    }
}
