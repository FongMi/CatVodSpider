package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.yiso.Item;
import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.Misc;
import com.google.gson.JsonParser;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class YiSo extends Spider {

    private Ali ali;

    @Override
    public void init(Context context, String extend) {
        ali = new Ali(extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        return ali.detailContent(ids);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return ali.playerContent(flag, id);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) return "";
        String url = "https://yiso.fun/api/search?name=" + URLEncoder.encode(key) + "&from=ali";
        Map<String, String> result = new HashMap<>();
        Misc.loadWebView(url, getWebViewClient(result));
        while (!result.containsKey("json")) SystemClock.sleep(50);
        String json = JsonParser.parseString(Objects.requireNonNull(result.get("json"))).getAsJsonPrimitive().getAsString();
        return Result.string(Item.objectFrom(json).getData().getList());
    }

    private WebViewClient getWebViewClient(Map<String, String> result) {
        return new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) return;
                view.evaluateJavascript("document.getElementsByTagName('pre')[0].textContent", value -> {
                    if (!value.equals("null")) result.put("json", value);
                });
            }
        };
    }
}
