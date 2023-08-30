package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class YiSo extends Ali {
    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("User-Agent", "Mozilla/5.0 (Linux; Android 12; V2049A Build/SP1A.210812.003; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/103.0.5060.129 Mobile Safari/537.36");
        hashMap.put("Referer", "https://yiso.fun/");
        hashMap.put("Cookie", "satoken=2854cb58-3884-473b-84c4-34161f67a409");
        String poststr = OkHttp.string("https://yiso.fun/api/search?name=" + URLEncoder.encode(key) + "&pageNo=1&from=ali", hashMap);
        SpiderDebug.log(poststr);
        JSONArray jsonArray = new JSONObject(poststr).getJSONObject("data").getJSONArray("list");
        ArrayList<Vod> arrayList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            Vod vod = new Vod();
            String string = jsonArray.getJSONObject(i).getJSONArray("fileInfos").getJSONObject(0).getString("fileName");
            String string2 = jsonArray.getJSONObject(i).getString("gmtCreate");
            vod.setVodId(decrypt(jsonArray.getJSONObject(i).getString("url")));
            vod.setVodName(string);
            vod.setVodPic("https://inews.gtimg.com/newsapp_bt/0/13263837859/1000");
            vod.setVodRemarks(string2);
            arrayList.add(vod);
        }

        return Result.string(arrayList);
       // return ("55555555555555");
    }

    public static String decrypt(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec("4OToScUFOaeVTrHE".getBytes("UTF-8"), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec("9CLGao1vHKqm17Oz".getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)), "UTF-8");
        } catch (Exception unused) {
            return "";
        }


    }
}
