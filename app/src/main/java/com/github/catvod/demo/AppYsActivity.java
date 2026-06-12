package com.github.catvod.demo;

import android.app.Activity;
import android.os.Bundle;

import com.github.catvod.spider.Douban;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class AppYsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Douban dyls = new Douban();
                try {
                    dyls.init(AppYsActivity.this);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                String json = null;
                try {
                    json = dyls.homeContent(true);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                System.out.println(json);
                JSONObject homeContent = null;
                String string = null;
                try {
                    string = dyls.searchContent("庆余年", false);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                try {
                    JSONObject jsonObject = new JSONObject(string);
                    System.out.println(jsonObject);
                    JSONArray list = jsonObject.getJSONArray("list");
                    JSONObject jsonObject1 = list.getJSONObject(0);
                    String vodId = jsonObject1.getString("vod_id");
                    ArrayList<String> ids = new ArrayList<>();
                    ids.add(vodId);
                    String x = dyls.detailContent(ids);
                    System.out.println(x);
                    String seven = dyls.playerContent("app", "11259170*parse_68baecafbb731b65a4cdb67269637a4433ce35ef51fbc761ae7141227bb60417a2dd8afa", new ArrayList<>());
                    System.out.println(seven);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                try {
                    System.out.println(dyls.searchContent("顶楼", false));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}