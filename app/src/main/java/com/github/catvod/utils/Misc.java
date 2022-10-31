package com.github.catvod.utils;

import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;

import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Misc {

    public static final String CHROME = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36";

    public static boolean isVip(String url) {
        List<String> hosts = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com");
        for (String host : hosts) if (url.contains(host)) return true;
        return false;
    }

    public static boolean isVideoFormat(String url) {
        return Sniffer.RULE.matcher(url).find();
    }

    public static boolean isSub(String ext) {
        return ext.equals("srt") || ext.equals("ass") || ext.equals("ssa");
    }

    public static String getSubMimeType(String type) {
        if (type.equals("srt")) return "application/x-subrip";
        if (type.equals("ass") || type.equals("ssa")) return "text/x-ssa";
        return "application/x-subrip";
    }

    public static String getSize(double size) {
        if (size == 0) return "";
        if (size > 1024 * 1024 * 1024 * 1024.0) {
            size /= (1024 * 1024 * 1024 * 1024.0);
            return String.format(Locale.getDefault(), "%.2f%s", size, "TB");
        } else if (size > 1024 * 1024 * 1024.0) {
            size /= (1024 * 1024 * 1024.0);
            return String.format(Locale.getDefault(), "%.2f%s", size, "GB");
        } else if (size > 1024 * 1024.0) {
            size /= (1024 * 1024.0);
            return String.format(Locale.getDefault(), "%.2f%s", size, "MB");
        } else {
            size /= 1024.0;
            return String.format(Locale.getDefault(), "%.2f%s", size, "KB");
        }
    }

    public static String fixUrl(String base, String src) {
        try {
            if (src.startsWith("//")) {
                Uri parse = Uri.parse(base);
                src = parse.getScheme() + ":" + src;
            } else if (!src.contains("://")) {
                Uri parse = Uri.parse(base);
                src = parse.getScheme() + "://" + parse.getHost() + src;
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return src;
    }

    public static JSONObject fixJsonVodHeader(JSONObject headers, String input, String url) throws JSONException {
        if (headers == null) headers = new JSONObject();
        if (input.contains("www.mgtv.com")) {
            headers.put("Referer", "");
            headers.put("User-Agent", "Mozilla/5.0");
        } else if (url.contains("titan.mgtv")) {
            headers.put("Referer", "");
            headers.put("User-Agent", "Mozilla/5.0");
        } else if (input.contains("bilibili")) {
            headers.put("Referer", "https://www.bilibili.com/");
            headers.put("User-Agent", Misc.CHROME);
        }
        return headers;
    }

    public static JSONObject jsonParse(String input, String json) throws JSONException {
        JSONObject jsonPlayData = new JSONObject(json);
        String url = jsonPlayData.getString("url");
        if (url.startsWith("//")) url = "https:" + url;
        if (!url.startsWith("http")) return null;
        if (url.equals(input)) if (isVip(url) || !isVideoFormat(url)) return null;
        JSONObject headers = new JSONObject();
        String ua = jsonPlayData.optString("user-agent", "");
        if (ua.trim().length() > 0) headers.put("User-Agent", ua);
        String referer = jsonPlayData.optString("referer", "");
        if (referer.trim().length() > 0) headers.put("Referer", referer);
        headers = Misc.fixJsonVodHeader(headers, input, url);
        JSONObject taskResult = new JSONObject();
        taskResult.put("header", headers);
        taskResult.put("url", url);
        return taskResult;
    }

    public static String substring(String text) {
        return substring(text, 1);
    }

    public static String substring(String text, int num) {
        if (text != null && text.length() > num) {
            return text.substring(0, text.length() - num);
        } else {
            return text;
        }
    }

    public static String getVar(String data, String param) {
        for (String var : data.split("var")) if (var.contains(param)) return var.split("'")[1];
        return "";
    }

    public static String MD5(String src) {
        return MD5(src, StandardCharsets.UTF_8);
    }

    public static String MD5(String src, Charset charset) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(src.getBytes(charset));
            BigInteger no = new BigInteger(1, messageDigest);
            StringBuilder sb = new StringBuilder(no.toString(16));
            while (sb.length() < 32) sb.insert(0, "0");
            return sb.toString().toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    public static DisplayMetrics getDisplayMetrics() {
        return Init.context().getResources().getDisplayMetrics();
    }

    public static int dp2px(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getDisplayMetrics());
    }

    public static void addView(View view, ViewGroup.LayoutParams params) {
        ViewGroup group = Init.getActivity().getWindow().getDecorView().findViewById(android.R.id.content);
        group.addView(view, params);
    }

    public static void removeView(View view) {
        ViewGroup group = Init.getActivity().getWindow().getDecorView().findViewById(android.R.id.content);
        group.removeView(view);
    }

    public static void loadWebView(String url, WebViewClient client) {
        Init.run(() -> {
            WebView webView = new WebView(Init.context());
            webView.getSettings().setDatabaseEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setJavaScriptEnabled(true);
            addView(webView, new ViewGroup.LayoutParams(0, 0));
            webView.setWebViewClient(client);
            webView.loadUrl(url);
        });
    }
}
