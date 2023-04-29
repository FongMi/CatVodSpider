package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.URLEncoder;


/**
 * @author zhixc
 * 
 */
public class PanSearch extends Spider {
    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            JSONArray videoArray = new JSONArray();

            Request request = new Request.Builder()
                    .get()
                    .url("https://www.pansearch.me")
                    .addHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.96 Safari/537.36")
                    .build();
            OkHttpClient okHttpClient = new OkHttpClient();
            Response response = okHttpClient.newCall(request).execute();
            String homePageStr = response.body().string();
            response.close();
            Document document = Jsoup.parse(homePageStr);
            String html = document.select("script[type=application/json]").html();
            String html2 = document.select("script").get(0).html();
            String html3 = document.select("script").get(0).data();
            String html4 = document.select("script[id=__NEXT_DATA__]").get(0).data();
            String html5 = document.select("script[id=__NEXT_DATA__]").html();
            System.out.println(html2);
            JSONObject nextData = new JSONObject(html4);
            String buildId = nextData.getString("buildId");

            String searchUrl = "https://www.pansearch.me/_next/data/" + buildId + "/search.json?keyword=" + URLEncoder.encode(key) + "&pan=aliyundrive";
            Request request2 = new Request.Builder()
                    .get()
                    .url(searchUrl)
                    .addHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.96 Safari/537.36")
                    .addHeader("referer", "https://www.pansearch.me/")
                    .addHeader("x-nextjs-data", "1")
                    .build();
            Response response2 = okHttpClient.newCall(request2).execute();
            String searchResult = response2.body().string();
            response2.close();
            JSONArray dataArray = new JSONObject(searchResult)
                    .getJSONObject("pageProps")
                    .getJSONObject("data")
                    .getJSONArray("data");
            for (int i = 0; i < dataArray.length(); i++) {
                JSONObject item = dataArray.getJSONObject(i);
                String content = item.get("content") + "";
                String image = item.get("image") + "";
                String[] split = content.split("\\n");
                String title = split.length > 0 ? split[0].replaceAll("</?[^>]+>", "") : "无题，李商隐";
                String url = Jsoup.parse(content).select("a").attr("href");
                String time = item.get("time") + "";
                JSONObject v = new JSONObject();
                v.put("vod_id", url);
                v.put("vod_name", title);
                v.put("vod_pic", image);
                v.put("vod_remarks", time);
                videoArray.put(v);
            }

            JSONObject result = new JSONObject();
            result.put("list", videoArray);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
