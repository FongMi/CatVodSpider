package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MixWeb {

    /*
    "parses": [
    {
      "name": "聚合",
      "type": 3,
      "url": "Demo"
    },
    {
      "name": "解析",
      "type": 1,
      "url": "https://192.168.10.88/jx.php?url=",
      "ext": {
        "flag": [
          "qq",
          "iqiyi",
          "qiyi",
          "爱奇艺",
          "腾讯",
          "letv",
          "sohu",
          "tudou",
          "pptv",
          "mgtv",
          "wasu",
          "bilibili"
        ]
      }
     }]
     */

    public static HashMap<String, ArrayList<String>> flagWebJx = new HashMap<>();

    static HashMap<String, ArrayList<String>> configs = null;

    public static JSONObject parse(LinkedHashMap<String, HashMap<String, String>> jx, String nameMe, String flag, String url) {
        try {
            if (configs == null) {
                configs = new HashMap<>();
                Iterator<String> keys = jx.keySet().iterator();
                while (keys.hasNext()) {
                    String key = keys.next();
                    HashMap<String, String> parseBean = jx.get(key);
                    String type = parseBean.get("type");
                    if (type.equals("0")) {
                        try {
                            //取出单个解析的flags列表
                            JSONArray flags = new JSONObject(parseBean.get("ext")).getJSONArray("flag");
                            for (int j = 0; j < flags.length(); j++) {
                                //获取单个flags
                                String flagKey = flags.getString(j);
                                //取出configs中对应flags的解析
                                ArrayList<String> flagJx = configs.get(flagKey);
                                //如果configs中没有这个flags，则插入一个空的值
                                if (flagJx == null) {
                                    flagJx = new ArrayList<>();
                                    configs.put(flagKey, flagJx);
                                }
                                //如果有就在flagJx中增加解析
                                flagJx.add(key);
                            }
                        } catch (Throwable th) {

                        }
                    }
                }
            }
            // 通过上面的配置获得解析列表
            ArrayList<String> webJx = new ArrayList<>();
            ArrayList<String> flagJx = configs.get(flag);
            //如果flagJx不为空
            if (flagJx != null && !flagJx.isEmpty()) {
                for (int i = 0; i < flagJx.size(); i++) {
                    String key = flagJx.get(i);
                    HashMap<String, String> parseBean = jx.get(key);
                    String type = parseBean.get("type");
                    if (type.equals("0")) {
                        //将json解析放入webJx
                        webJx.add(parseBean.get("url"));
                    }
                }
            } else {
                Iterator<String> keys = jx.keySet().iterator();
                while (keys.hasNext()) {
                    String key = keys.next();
                    HashMap<String, String> parseBean = jx.get(key);
                    String type = parseBean.get("type");
                    if (type.equals("0")) {
                        webJx.add(parseBean.get("url"));
                    }
                }
            }
            if (!webJx.isEmpty()) {
                flagWebJx.put(flag, webJx);
            }

            // json解析没有得到结果 用webview解析
            if (!webJx.isEmpty()) {
                JSONObject webResult = new JSONObject();
                webResult.put("url", "proxy://do=MixWeb&flag=" + flag + "&url=" + Base64.encodeToString(url.getBytes(), Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP));
                webResult.put("parse", 1);
                webResult.put("ua", Misc.UaWinChrome);
                return webResult;
            }
        } catch (Throwable th) {
            SpiderDebug.log(th);
        }
        return new JSONObject();
    }


    public static Object[] loadHtml(String flag, String url) {
        try {
            url = new String(Base64.decode(url, Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP), "UTF-8");
            String html = "\n" +
                    "<!doctype html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title>解析</title>\n" +
                    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                    "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE10\" />\n" +
                    "<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\n" +
                    "<meta name=\"viewport\" content=\"width=device-width\">\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<script>\n" +
                    "var apiArray=[#jxs#];\n" +
                    "var urlPs=\"#url#\";\n" +
                    "var iframeHtml=\"\";\n" +
                    "for(var i=0;i<apiArray.length;i++){\n" +
                    "var URL=apiArray[i]+urlPs;\n" +
                    "iframeHtml=iframeHtml+\"<iframe sandbox='allow-scripts allow-same-origin allow-forms' frameborder='0' allowfullscreen='true' webkitallowfullscreen='true' mozallowfullscreen='true' src=\"+URL+\"></iframe>\";\n" +
                    "}\n" +
                    "document.write(iframeHtml);\n" +
                    "</script>\n" +
                    "</body>\n" +
                    "</html>";

            StringBuilder jxs = new StringBuilder();
            if (flagWebJx.containsKey(flag)) {
                ArrayList<String> jxUrls = flagWebJx.get(flag);
                for (int i = 0; i < jxUrls.size(); i++) {
                    jxs.append("\"");
                    jxs.append(jxUrls.get(i));
                    jxs.append("\"");
                    if (i < jxUrls.size() - 1) {
                        jxs.append(",");
                    }
                }
            }
            html = html.replace("#url#", url).replace("#jxs#", jxs.toString());
            Object[] result = new Object[3];
            result[0] = 200;
            result[1] = "text/html; charset=\"UTF-8\"";
            ByteArrayInputStream baos = new ByteArrayInputStream(html.toString().getBytes("UTF-8"));
            result[2] = baos;
            return result;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }
}
