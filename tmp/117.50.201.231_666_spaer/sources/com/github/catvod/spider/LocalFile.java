package com.github.catvod.spider;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A0.dz;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class LocalFile extends Spider {
    public static final /* synthetic */ int a = 0;

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
            Arrays.sort(fileArrListFiles, new dz(1));
            JSONArray jSONArray = new JSONArray();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (name.indexOf(46) != 0) {
                    String str3 = file.isDirectory() ? "https://cc-im-kefu-cos.7moor-fs2.com/im/2768a390-5474-11ea-afc9-7b323e3e16c0/e8213224-8902-4b2f-8042-ef5809445c8e/2024-06-07/2024-06-07_18:01:26/1717754486746/11664624/folder.png" : "https://cc-im-kefu-cos.7moor-fs2.com/im/2768a390-5474-11ea-afc9-7b323e3e16c0/e8213224-8902-4b2f-8042-ef5809445c8e/2024-06-07/2024-06-07_18:02:18/1717754538432/24531685/video.png";
                    if (file.isDirectory() || checkstring(name)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vod_id", file.getAbsolutePath());
                        jSONObject.put("vod_name", file.getName());
                        jSONObject.put("vod_pic", str3);
                        jSONObject.put("vod_tag", file.isDirectory() ? "folder" : "file");
                        long jLastModified = file.lastModified();
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(jLastModified);
                        jSONObject.put("vod_remarks", new SimpleDateFormat("yyyy/MM/dd aHH:mm:ss").format(calendar.getTime()));
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
            e.printStackTrace();
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String str = list.get(0);
            String parent = new File(str).getParent();
            File[] fileArrListFiles = new File(parent).listFiles();
            Arrays.sort(fileArrListFiles, new dz(2));
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
            jSONObject.put("vod_play_from", "本地");
            jSONObject.put("vod_play_url", TextUtils.join("#", arrayList));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
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
            e.printStackTrace();
            return "";
        }
    }

    public void init(Context context) {
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
            e.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        return "";
    }
}
