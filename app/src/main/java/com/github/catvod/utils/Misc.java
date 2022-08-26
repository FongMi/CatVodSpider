package com.github.catvod.utils;

import android.net.Uri;

import com.github.catvod.crawler.SpiderDebug;

import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigInteger;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

public class Misc {

    public static final String CHROME = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.62 Safari/537.36";
    private static final Pattern SNIFFER = Pattern.compile("http((?!http).){20,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg)\\?.*|http((?!http).){20,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg)|http((?!http).){20,}?\\/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com\\/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?\\/obj\\/tos[^\\?]*|http.*?\\/player\\/m3u8play\\.php\\?url=.*|http.*?\\/player\\/.*?[pP]lay\\.php\\?url=.*|http.*?\\/playlist\\/m3u8\\/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?\\/download.aspx\\?.*|http.*?\\/api\\/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com\\/file\\/.*");

    public static boolean isVip(String url) {
        try {
            boolean isVip = false;
            String host = Uri.parse(url).getHost();
            String[] vipWebsites = new String[]{"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com"};
            for (String vipWebsite : vipWebsites) {
                if (host.contains(vipWebsite)) {
                    if ("iqiyi.com".equals(vipWebsite)) {
                        if (url.contains("iqiyi.com/a_") || url.contains("iqiyi.com/w_") || url.contains("iqiyi.com/v_")) {
                            isVip = true;
                            break;
                        }
                    } else {
                        isVip = true;
                        break;
                    }
                }
            }
            return isVip;
        } catch (Exception ignored) {
        }
        return false;
    }

    public static boolean isVideoFormat(String url) {
        if (url.contains("=http") || url.contains("=https") || url.contains("=https%3a%2f") || url.contains("=http%3a%2f")) return false;
        if (url.contains("cdn-tos") || url.contains(".js") || url.contains(".css") || url.contains(".ico")) return false;
        return SNIFFER.matcher(url).find();
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
        if (headers == null)
            headers = new JSONObject();
        if (input.contains("www.mgtv.com")) {
            headers.put("Referer", " ");
            headers.put("User-Agent", " Mozilla/5.0");
        } else if (url.contains("titan.mgtv")) {
            headers.put("Referer", " ");
            headers.put("User-Agent", " Mozilla/5.0");
        } else if (input.contains("bilibili")) {
            headers.put("Referer", " https://www.bilibili.com/");
            headers.put("User-Agent", " " + Misc.CHROME);
        }
        return headers;
    }

    public static JSONObject jsonParse(String input, String json) throws JSONException {
        JSONObject jsonPlayData = new JSONObject(json);
        String url = jsonPlayData.getString("url");
        if (url.startsWith("//")) {
            url = "https:" + url;
        }
        if (!url.startsWith("http")) {
            return null;
        }
        if (url.equals(input)) {
            if (isVip(url) || !isVideoFormat(url)) return null;
        }
        JSONObject headers = new JSONObject();
        String ua = jsonPlayData.optString("user-agent", "");
        if (ua.trim().length() > 0) {
            headers.put("User-Agent", " " + ua);
        }
        String referer = jsonPlayData.optString("referer", "");
        if (referer.trim().length() > 0) {
            headers.put("Referer", " " + referer);
        }
        headers = Misc.fixJsonVodHeader(headers, input, url);
        JSONObject taskResult = new JSONObject();
        taskResult.put("header", headers);
        taskResult.put("url", url);
        return taskResult;
    }

    public static String encode(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (Exception e) {
            return "";
        }
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
}
