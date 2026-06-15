package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0118ga;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONObject;

public class Kuaikan extends Spider {

    private static final String SIGN_KEY = "bf70a456195ae394184b2e0b1b471cae1000300001dc431681b806089dac1153fb13960f87";
    private static final String APP_ID = "1000300001";
    private static final String AES_KEY_HEX = "bf70a456195ae394";
    private static final String AES_IV_HEX = "184b2e0b1b471cae";
    private static final String AES_KEY_FULL = "bf70a456195ae394184b2e0b1b471cae";
    private static final String RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCiYJ5UFjeEgeUi5ynLKhj5EMF0\n3sawTyAKoPbfUCSZZQ5QdrHhrINggrYxDtB/TWXoqSF+BJP85F0vq8B6gOqFWhK/\n1PIKe2wKlRRuZSOdUzK/3vzRHmR3J3KGrvNzvwARH8gg8xZjbsalc/gBkcVxSxGd\n8j8rJ4QhOSFh9F8B2wIDAQAB";
    private static final String API_BASE = "http://ctlook.facaishiyi.com/api/v1/";
    private static final String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDitX/rWP6WWc3h\nDzUcfD8Hbw79yCB7rz18GEkjDapjlUVIa3P8FEQFoOchu7N+vdK6HQNsl2Bql4lv\nWOYuzRWNbLGQ7mNtMca28iCuPHck0AcJzOs9F6qruPL73eY7Ai7yvzs2IfEdyXSz\nHP/yXgEOi5ZEBfsBZEPMJw6vfHJVueuD/lh/LkoJ/gXEKMCM/pkIzGpBPd2TsIg8\nZdvOGMPy+MOnJb1Qfe0y3QQdc5VPVdZFWoWsM9RAenHmE3d1THb+uNZZZcnM1tV7\nxYgBbIhgHtXAZnWDWDRBM3xJPR3O9dfBHHt/tbyrZrSwK1IgwFgqfYm/tRbmp4y/\n1DhIF6mDAgMBAAECggEAIzDjS2gEFNiZ0a6nouVSb1f47sHq8OgR1jp619seMNkR\n6Rzs4xtON8VzO1REl47lsAgi6O9SgxlEtykIiglBqDNQGNw4SNHqM6nAEuvF3sv/\n27CYb2JGFuPdq+UVAOHk4b93dH6uS95ipA8DV97psRVP3P1EqkGjGISTjf/2S4IG\n10Q0UhP4xxiRS2iCtaIq0fbvnrChqYRlYQYpkkRCCH+Q4FNKquSsqmWyCu5yfeQM\nMek+aT9KgvmCh05UCeqC1x7xPtSneNbpJpLD5zW8CcG7EYFDtIP8b9BPDlud47ZH\n5Y4/wyQQFHHLOaniTJVvEJZ7cIoXy2gOhvgcHpNryQKBgQDxNNtXnCfVK0JYNhnU\n5WCOX9NeW9Q79HldhTM5/EqsjA5H21j5S7A/duBSRfX7iou1hyXaa2p+J7rxF9sj\nNlwHPsKhprskxXaHJ7qU84gSmwORsTQQPmtTsizGwVsM330+Q2ZROaSEfDoUqH9+\nKBKs6K+FOldcTOrCZ+ILk8werwKBgQDwnQUrKATzRThVdD6Hcgt/F/SAizDmvtiT\nVvRcGkiV3EtB5Rx8zFNJ9GWrqSAArwIxTWgfYCYsvpUjbJW02Mg0Ufj2+YhjT713\nO9yViwUq996St9eLwGQO5FDMD8FYi7bRAiZEAeAeIEeveDRsNK15++8VVJVo7b2l\nzcapp5k3bQKBgQDSiJNHRhqSet6+xgIIDGoZ+1Qv0TFPX5UrZt8OpsK7FshEOhXQ\nCxt8WZN03HHXK9fEC4GjwwxBrwYB+BOjCYiMHmCd3j0M3HoXgDrgViyYKMuVuDk8\nUG83r5ZbqVuCwfO8i/HbxddueEvtyiD2CZ47ZCIHxKOKAe0K4Mex2UBaKwKBgQDi\nrEouOelP9Kn5dyVhHENQXBTu9DIBb1FAnO5fxjMTWxFa5qhLuYHNbfxKF24atsRu\nBepNhJryFCkT0jvGv2L8Ry0wHiwqwvhO14obJ3ia3iBEQAVDlt+sV9L2KvGOpTB4\n/nlmIA4u02I1IBziw02aWYkGo0SOMUo0ZQL+2PEykQKBgAV1uqiJlWuA9uPdFFJP\nZPL2YoOuTWdWfIwIb/UdsbUuTckCgqPIqUPi3HhiVSunOgcO7HWK3GD3j8k4XEbW\nG4y+Ik0lLrWzBl728tZe1GENzTf8aapElHlUfFSM4OlrTRBsbMOsQBcJNh7QbyoZ\nBHiZZTbRUY6xUR4DGYkCOksF";
    private static final String RSA_SIGN_KEY = "bf70a456195ae394184b2e0b1b471cae";

    private static String ticket = "";
    private static long tokenExpiry = 0;

    private HashMap<String, ArrayList<String>> filterCache = new HashMap<>();
    private String umId = "";

    private String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hex = Integer.toHexString(b & 0xFF);
                if (hex.length() < 2) sb.append("0");
                sb.append(hex);
            }
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }

    private String rsaEncrypt(String data) throws Exception {
        RSAPublicKey publicKey = (RSAPublicKey) KeyFactory.getInstance("RSA")
            .generatePublic(new X509EncodedKeySpec(Base64.decode(RSA_PUBLIC_KEY, Base64.DEFAULT)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] bytes = data.getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (int i = 0; i < bytes.length; i += 256) {
            int len = Math.min(256, bytes.length - i);
            baos.write(cipher.doFinal(bytes, i, len));
        }
        return Base64.encodeToString(baos.toByteArray(), Base64.DEFAULT);
    }

    private String rsaDecryptWithPrivateKey(String privateKeyStr, String data) throws Exception {
        PrivateKey privateKey = KeyFactory.getInstance("RSA")
            .generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(privateKeyStr, Base64.DEFAULT)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] bytes = Base64.decode(data, Base64.DEFAULT);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (int i = 0; i < bytes.length; i += 256) {
            int len = Math.min(256, bytes.length - i);
            baos.write(cipher.doFinal(bytes, i, len));
        }
        return new String(baos.toByteArray());
    }

    private String aesDecrypt(String keyHex, String ivHex, String data) throws Exception {
        byte[] keyBytes = hexToBytes(keyHex);
        byte[] ivBytes = hexToBytes(ivHex);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE,
            new SecretKeySpec(keyBytes, "AES"),
            new IvParameterSpec(ivBytes));
        return new String(cipher.doFinal(Base64.decode(data, Base64.DEFAULT)), "UTF-8");
    }

    private String aesEncrypt(String data) throws Exception {
        byte[] keyBytes = hexToBytes(AES_KEY_FULL);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE,
            new SecretKeySpec(keyBytes, "AES"),
            new IvParameterSpec(keyBytes));
        return Base64.encodeToString(cipher.doFinal(data.getBytes("UTF-8")), Base64.DEFAULT);
    }

    private byte[] hexToBytes(String hex) {
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return bytes;
    }

    private HashMap<String, String> makeHeaders(long timestamp) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "okhttp/4.9.1");
        headers.put("Content-Type", "application/json; charset=utf-8");
        headers.put("appId", APP_ID);
        headers.put("timestamp", String.valueOf(timestamp));
        headers.put("sign", md5(SIGN_KEY + timestamp + "notice"));
        return headers;
    }

    private JSONObject buildSignedBody(long timestamp) throws Exception {
        JSONObject body = new JSONObject();
        body.put("appId", APP_ID);
        body.put("sign", md5(SIGN_KEY + timestamp + "notice"));
        body.put("timestamp", timestamp);
        return body;
    }

    private JSONObject encryptAndSend(String url, JSONObject body) throws Exception {
        String encryptedBody = rsaEncrypt(AES_KEY_HEX + AES_IV_HEX + body.toString());
        String encryptedTicket = rsaEncryptWithPublicKey(RSA_SIGN_KEY, ticket);
        JSONObject request = new JSONObject();
        request.put("body", encryptedBody);
        request.put("ticket", encryptedTicket);
        String response = C0106ZJ.m486MH(C0106ZJ.m488QU(), url, request.toString(), makeHeaders(System.currentTimeMillis() / 1000));
        JSONObject respObj = new JSONObject(response);
        String decryptedTicket = rsaDecryptWithPrivateKey(RSA_PRIVATE_KEY, respObj.getString("ticket"));
        JSONObject decryptedData = new JSONObject(aesDecrypt(decryptedTicket.substring(0, 16), decryptedTicket.substring(16, 32), respObj.getString("body")));
        return decryptedData;
    }

    private String rsaEncryptWithPublicKey(String keyStr, String data) throws Exception {
        RSAPublicKey key = (RSAPublicKey) KeyFactory.getInstance("RSA")
            .generatePublic(new X509EncodedKeySpec(Base64.decode(keyStr, Base64.DEFAULT)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return Base64.encodeToString(cipher.doFinal(data.getBytes()), Base64.DEFAULT);
    }

    @Override
    public void init(Context context, String str) {
        super.init(context, str);
        this.umId = str;
        login();
    }

    private void login() {
        try {
            long now = System.currentTimeMillis() / 1000;
            JSONObject body = buildSignedBody(now);
            String encryptedBody = rsaEncrypt(AES_KEY_HEX + AES_IV_HEX + body.toString());
            String encryptedTicket = rsaEncryptWithPublicKey(RSA_SIGN_KEY, "");
            JSONObject request = new JSONObject();
            request.put("body", encryptedBody);
            request.put("ticket", encryptedTicket);
            C0106ZJ.m486MH(C0106ZJ.m488QU(),
                API_BASE + "user/login.do", request.toString(), makeHeaders(now),
                new AbstractC0099V3.Qe(this) {
                    @Override public void onFailure(Call call, Exception exc) {}
                    @Override public String onResponse(String str) {
                        try {
                            JSONObject resp = new JSONObject(str);
                            String decryptedTicket = rsaDecryptWithPrivateKey(RSA_PRIVATE_KEY, resp.getString("ticket"));
                            JSONObject data = new JSONObject(aesDecrypt(decryptedTicket.substring(0, 16), decryptedTicket.substring(16, 32), resp.getString("body")));
                            tokenExpiry = data.getLong("duration") * 1000;
                            ticket = data.getString("data");
                            loadConfig();
                        } catch (Exception e) { e.printStackTrace(); }
                        return str;
                    }
                });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadConfig() {
        try {
            long now = System.currentTimeMillis() / 1000;
            JSONObject body = buildSignedBody(now);
            body.put("umId", this.umId);
            JSONObject data = encryptAndSend(API_BASE + "user/config.do", body);
            // Config loaded - ticket refreshed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String categoryContent(String typeId, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            long now = System.currentTimeMillis() / 1000;
            JSONObject body = buildSignedBody(now);
            body.put("typeId", typeId);
            body.put("page", pg);
            body.put("pageSize", 18);
            JSONObject data = encryptAndSend(API_BASE + "search/video.do", body);

            JSONObject response = new JSONObject();
            JSONArray results = data.getJSONArray("results");
            JSONArray list = new JSONArray();
            for (int i = 0; i < results.length(); i++) {
                JSONObject item = results.getJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.getString("id"));
                entry.put("vod_name", item.getString("name"));
                entry.put("vod_pic", item.getString("pic"));
                entry.put("vod_remarks", item.optString("progress"));
                list.put(entry);
            }
            response.put("page", data.optInt("page", Integer.parseInt(pg)));
            response.put("pagecount", data.optInt("pagecount", 999));
            response.put("limit", data.optInt("limit", 18));
            response.put("total", data.optInt("total", Integer.MAX_VALUE));
            response.put("list", list);
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            JSONObject response = new JSONObject();
            long now = System.currentTimeMillis() / 1000;
            JSONObject body = buildSignedBody(now);
            body.put("id", ids.get(0));
            JSONObject data = encryptAndSend(API_BASE + "video/play/" + ids.get(0) + ".do", body);

            response.put("vod_id", data.getString("vod_id"));
            response.put("vod_name", data.getString("vod_name"));
            response.put("vod_pic", data.getString("pic"));
            response.put("vod_year", data.optString("year"));
            response.put("vod_remarks", data.optString("progress"));
            response.put("vod_actor", data.optString("actor"));
            response.put("vod_director", data.optString("director"));
            response.put("vod_content", data.optString("content"));

            ArrayList<String> playFromList = new ArrayList<>();
            ArrayList<String> playUrlList = new ArrayList<>();
            JSONArray episodes = data.optJSONArray("episodes");
            if (episodes != null) {
                for (int i = 0; i < episodes.length(); i++) {
                    JSONObject ep = episodes.getJSONObject(i);
                    String epId = ep.getString("id");
                    String epTitle = ep.getString("title");
                    String epUrl = ep.getString("url");
                    playFromList.add(epTitle);
                    playUrlList.add(epTitle + "$" + epUrl + "|" + epId);
                }
            }
            response.put("vod_play_from", TextUtils.join("$$$", playFromList));
            response.put("vod_play_url", TextUtils.join("$$$", playUrlList));

            JSONArray list = new JSONArray();
            list.put(response);
            JSONObject wrapper = new JSONObject();
            wrapper.put("list", list);
            return wrapper.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject response = new JSONObject();
            long now = System.currentTimeMillis() / 1000;
            JSONObject body = buildSignedBody(now);
            JSONObject data = encryptAndSend(API_BASE + "user/genres.do", body);

            JSONArray genres = data.getJSONArray("genres");
            JSONArray categories = new JSONArray();
            for (int i = 0; i < genres.length(); i++) {
                JSONObject genre = genres.getJSONObject(i);
                JSONObject cat = new JSONObject();
                cat.put("type_id", genre.getString("id"));
                cat.put("type_name", genre.getString("name"));
                categories.put(cat);
            }
            response.put("class", categories);

            if (filter) {
                JSONObject filters = new JSONObject();
                for (int i = 0; i < genres.length(); i++) {
                    JSONObject genre = genres.getJSONObject(i);
                    String genreId = genre.getString("id");
                    // Load sub-genre filters
                    long now2 = System.currentTimeMillis() / 1000;
                    JSONObject filterBody = buildSignedBody(now2);
                    filterBody.put("id", genreId);
                    JSONObject filterData = encryptAndSend(API_BASE + "user/genre/" + genreId + ".do", filterBody);
                    JSONArray subGenres = filterData.optJSONArray("subGenres");
                    JSONArray filterList = new JSONArray();
                    if (subGenres != null) {
                        for (int j = 0; j < subGenres.length(); j++) {
                            JSONObject sub = subGenres.getJSONObject(j);
                            JSONObject f = new JSONObject();
                            f.put("key", "tagId");
                            f.put("name", sub.getString("template"));
                            JSONArray values = new JSONArray();
                            JSONObject all = new JSONObject();
                            all.put("n", "全部");
                            all.put("v", "");
                            values.put(all);
                            JSONArray videos = sub.optJSONArray("video");
                            if (videos != null) {
                                for (int k = 0; k < videos.length(); k++) {
                                    JSONObject v = videos.getJSONObject(k);
                                    JSONObject val = new JSONObject();
                                    val.put("n", v.getString("name"));
                                    val.put("v", v.getString("id"));
                                    values.put(val);
                                }
                            }
                            f.put("value", values);
                            filterList.put(f);
                        }
                    }
                    filters.put(genreId, filterList);
                }
                response.put("filters", filters);
            }
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String homeVideoContent() {
        try {
            JSONObject response = new JSONObject();
            long now = System.currentTimeMillis() / 1000;
            JSONObject body = buildSignedBody(now);
            JSONObject data = encryptAndSend(API_BASE + "user/config.do", body);

            JSONArray list = new JSONArray();
            // config returns recommendations
            response.put("list", list);
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vodFlags) {
        try {
            String[] parts = id.split("\\|");
            String videoUrl = parts[0];

            JSONObject result = new JSONObject();
            if (videoUrl.startsWith("http")) {
                result.put("parse", 0);
                result.put("playUrl", "");
                result.put("url", videoUrl);
            }
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String searchContent(String keyword, boolean quick) {
        try {
            JSONObject response = new JSONObject();
            long now = System.currentTimeMillis() / 1000;
            JSONObject body = buildSignedBody(now);
            body.put("keyword", keyword);
            body.put("page", "1");
            body.put("pageSize", 18);
            JSONObject data = encryptAndSend(API_BASE + "search/page.do", body);

            JSONArray results = data.getJSONArray("results");
            JSONArray list = new JSONArray();
            for (int i = 0; i < results.length(); i++) {
                JSONObject item = results.getJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.getString("id"));
                entry.put("vod_name", item.getString("name"));
                entry.put("vod_pic", item.getString("pic"));
                list.put(entry);
            }
            response.put("list", list);
            return response.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
