package com.github.catvod;

import android.app.Activity;
import android.os.Bundle;

import com.github.catvod.crawler.Spider;
import com.github.catvod.databinding.ActivityMainBinding;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.PTT;
import com.github.catvod.spider.Proxy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;
    private ExecutorService executor;
    private Spider spider;
    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gson = new GsonBuilder().setPrettyPrinting().create();
        Logger.addLogAdapter(new AndroidLogAdapter());
        executor = Executors.newCachedThreadPool();
        executor.execute(this::initSpider);
        spider = new PTT();
        initView();
        initEvent();
    }

    private void initView() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    private void initEvent() {
        binding.home.setOnClickListener(view -> executor.execute(this::homeContent));
        binding.homeVideo.setOnClickListener(view -> executor.execute(this::homeVideoContent));
        binding.category.setOnClickListener(view -> executor.execute(this::categoryContent));
        binding.detail.setOnClickListener(view -> executor.execute(this::detailContent));
        binding.player.setOnClickListener(view -> executor.execute(this::playerContent));
        binding.search.setOnClickListener(view -> executor.execute(this::searchContent));
        binding.live.setOnClickListener(view -> executor.execute(this::liveContent));
        binding.proxy.setOnClickListener(view -> executor.execute(this::proxy));
    }

    private void initSpider() {
        try {
            Init.init(getApplicationContext());
            spider.init(this, "");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void homeContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.homeContent(true)));
            Init.post(() -> binding.result.setText(result));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void homeVideoContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.homeVideoContent()));
            Init.post(() -> binding.result.setText(result));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void categoryContent() {
        try {
            HashMap<String, String> extend = new HashMap<>();
            extend.put("c", "19");
            extend.put("year", "2024");
            String result = gson.toJson(JsonParser.parseString(spider.categoryContent("3", "2", true, extend)));
            Init.post(() -> binding.result.setText(result));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void detailContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.detailContent(List.of("78702"))));
            Init.post(() -> binding.result.setText(result));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void playerContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.playerContent("", "382044/1/78", new ArrayList<>())));
            Init.post(() -> binding.result.setText(result));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void searchContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.searchContent("我的人间烟火", false)));
            Init.post(() -> binding.result.setText(result));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void liveContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.liveContent("")));
            Init.post(() -> binding.result.setText(result));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void proxy() {
        try {
            Map<String, String> params = new HashMap<>();
            Logger.t("liveContent").d(Proxy.proxy(params));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}