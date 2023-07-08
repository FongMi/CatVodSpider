package com.github.catvod.utils;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.github.catvod.spider.Init;

import org.mozilla.universalchardet.UniversalDetector;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class Utils {

    public static final String CHROME = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36";
    public static final List<String> MEDIA = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "mp3", "aac", "flac", "m4a", "ape", "ogg");
    public static final Pattern RULE = Pattern.compile(
            "http((?!http).){12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?.*|" +
                    "http((?!http).){12,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|" +
                    "http((?!http).)*?video/tos*"
    );

    public static boolean isVip(String url) {
        List<String> hosts = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com");
        for (String host : hosts) if (url.contains(host)) return true;
        return false;
    }

    public static boolean isVideoFormat(String url) {
        if (url.contains("url=http") || url.contains(".js") || url.contains(".css") || url.contains(".html")) return false;
        return RULE.matcher(url).find();
    }

    public static boolean isMobile() {
        boolean hasCamera = Init.context().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
        boolean hasPhone = Init.context().getPackageManager().hasSystemFeature(PackageManager.FEATURE_TELEPHONY);
        boolean hasBT = Init.context().getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH);
        return hasCamera && hasPhone && hasBT;
    }

    public static byte[] toUtf8(byte[] bytes) throws Exception {
        UniversalDetector detector = new UniversalDetector(null);
        detector.handleData(bytes, 0, bytes.length);
        detector.dataEnd();
        return new String(bytes, detector.getDetectedCharset()).getBytes("UTF-8");
    }

    public static boolean isSub(String ext) {
        return ext.equals("srt") || ext.equals("ass") || ext.equals("ssa");
    }

    public static String getExt(String name) {
        return name.substring(name.lastIndexOf(".") + 1);
    }

    public static String getSize(double size) {
        if (size <= 0) return "";
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
        if (src.startsWith("//")) {
            Uri parse = Uri.parse(base);
            return parse.getScheme() + ":" + src;
        } else if (!src.contains("://")) {
            Uri parse = Uri.parse(base);
            return parse.getScheme() + "://" + parse.getHost() + src;
        } else {
            return src;
        }
    }

    public static String removeExt(String text) {
        return text.contains(".") ? text.substring(0, text.lastIndexOf(".")) : text;
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
        for (String var : data.split("var")) if (var.contains(param)) return checkVar(var);
        return "";
    }

    private static String checkVar(String var) {
        if (var.contains("'")) return var.split("'")[1];
        if (var.contains("\"")) return var.split("\"")[1];
        return "";
    }

    public static String MD5(String src) {
        return MD5(src, "UTF-8");
    }

    public static String MD5(String src, String charset) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(src.getBytes(charset));
            BigInteger no = new BigInteger(1, messageDigest);
            StringBuilder sb = new StringBuilder(no.toString(16));
            while (sb.length() < 32) sb.insert(0, "0");
            return sb.toString().toLowerCase();
        } catch (Exception e) {
            return "";
        }
    }

    public static DisplayMetrics getDisplayMetrics() {
        return Init.context().getResources().getDisplayMetrics();
    }

    public static int dp2px(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getDisplayMetrics());
    }

    public static void loadUrl(WebView webView, String script) {
        loadUrl(webView, script, null);
    }

    public static void loadUrl(WebView webView, String script, ValueCallback<String> callback) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) webView.evaluateJavascript(script, callback);
        else webView.loadUrl(script);
    }

    public static void notify(String msg) {
        Init.run(() -> Toast.makeText(Init.context(), msg, Toast.LENGTH_LONG).show());
    }

    public static void addView(View view, ViewGroup.LayoutParams params) {
        try {
            ViewGroup group = Init.getActivity().getWindow().getDecorView().findViewById(android.R.id.content);
            group.addView(view, params);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeView(View view) {
        try {
            ViewGroup group = Init.getActivity().getWindow().getDecorView().findViewById(android.R.id.content);
            group.removeView(view);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
