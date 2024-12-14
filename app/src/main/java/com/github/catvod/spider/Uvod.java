package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.uvod.Data;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Crypto;
import com.github.catvod.utils.Util;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Qile
 * @date 2024/11/15
 */
public class Uvod extends Spider {

    private static String siteUrl = "https://api-h5.uvod.tv";
    private static final String latest = siteUrl + "/video/latest";
    private static final String list = siteUrl + "/video/list";
    private static final String detail = siteUrl + "/video/info";
    private static final String play = siteUrl + "/video/source";
    private static final String publicKeyPem = "-----BEGIN PUBLIC KEY-----\n" + "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCeBQWotWOpsuPn3PAA+bcmM8YD\n" + "fEOzPz7hb/vItV43vBJV2FcM72Hdcv3DccIFuEV9LQ8vcmuetld98eksja9vQ1Ol\n" + "8rTnjpTpMbd4HedevSuIhWidJdMAOJKDE3AgGFcQvQePs80uXY2JhTLkRn2ICmDR\n" + "/fb32OwWY3QGOvLcuQIDAQAB\n" + "-----END PUBLIC KEY-----";
    private static final String privateKeyPem = "-----BEGIN PRIVATE KEY-----\n" + "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJ4FBai1Y6my4+fc\n" + "8AD5tyYzxgN8Q7M/PuFv+8i1Xje8ElXYVwzvYd1y/cNxwgW4RX0tDy9ya562V33x\n" + "6SyNr29DU6XytOeOlOkxt3gd5169K4iFaJ0l0wA4koMTcCAYVxC9B4+zzS5djYmF\n" + "MuRGfYgKYNH99vfY7BZjdAY68ty5AgMBAAECgYB1rbvHJj5wVF7Rf4Hk2BMDCi9+\n" + "zP4F8SW88Y6KrDbcPt1QvOonIea56jb9ZCxf4hkt3W6foRBwg86oZo2FtoZcpCJ+\n" + "rFqUM2/wyV4CuzlL0+rNNSq7bga7d7UVld4hQYOCffSMifyF5rCFNH1py/4Dvswm\n" + "pi5qljf+dPLSlxXl2QJBAMzPJ/QPAwcf5K5nngQtbZCD3nqDFpRixXH4aUAIZcDz\n" + "S1RNsHrT61mEwZ/thQC2BUJTQNpGOfgh5Ecd1MnURwsCQQDFhAFfmvK7svkygoKX\n" + "t55ARNZy9nmme0StMOfdb4Q2UdJjfw8+zQNtKFOM7VhB7ijHcfFuGsE7UeXBe20n\n" + "g/XLAkEAv9SoT2hgJaQxxUk4MCF8pgddstJlq8Z3uTA7JMa4x+kZfXTm/6TOo6I8\n" + "2VbXZLsYYe8op0lvsoHMFvBSBljV0QJBAKhxyoYRa98dZB5qZRskciaXTlge0WJk\n" + "kA4vvh3/o757izRlQMgrKTfng1GVfIZFqKtnBiIDWTXQw2N9cnqXtH8CQAx+CD5t\n" + "l1iT0cMdjvlMg2two3SnpOjpo7gALgumIDHAmsUWhocLtcrnJI032VQSUkNnLq9z\n" + "EIfmHDz0TPVNHBQ=\n" + "-----END PRIVATE KEY-----";

    private Map<String, String> getHeader(String url) {
        String[] item = url.split("\\|");
        String URL = item[0];
        String tid = item.length > 1 ? item[1] : "";
        String pg = item.length > 2 ? item[2] : "";
        String quality = item.length > 3 ? item[3] : "";
        String hm = String.valueOf(System.currentTimeMillis());
        String text = "";
        if (URL.equals(latest)) {
            text = String.format("-parent_category_id=101-%s", hm);
        } else if (URL.equals(list)) {
            if (pg != null && !pg.isEmpty()) {
                text = String.format("-page=%s&pagesize=42&parent_category_id=%s&sort_type=asc-%s", pg, tid, hm);
            } else {
                text = String.format("-keyword=%s&need_fragment=1&page=1&pagesize=42&sort_type=asc-%s", URLEncoder.encode(tid).toLowerCase(), hm);
            }
        } else if (URL.equals(detail)) {
            text = String.format("-id=%s-%s", tid, hm);
        } else if (URL.equals(play)) {
            text = String.format("-quality=%s&video_fragment_id=%s&video_id=%s-%s", quality, pg, tid, hm);
        }
        String sign = Util.MD5(text);
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("referer", "https://www.uvod.tv/");
        header.put("origin", "https://www.uvod.tv");
        header.put("content-type", "application/json");
        header.put("accept", "*/*");
        header.put("x-signature", sign);
        header.put("x-timestamp", hm);
        header.put("x-token", "");
        return header;
    }

    private Map<String, String> playHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        header.put("referer", "https://www.uvod.tv/");
        header.put("origin", "https://www.uvod.tv");
        return header;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        if (!extend.isEmpty()) siteUrl = extend;
    }

    private String encrypt(String data) throws Exception {
        String aesKey = Crypto.randomKey(32);
        String aesEncryptedData = Crypto.aesEncrypt(data, aesKey, "abcdefghijklmnop");
        String rsaEncryptedKey = Crypto.rsaEncrypt(aesKey, publicKeyPem);
        return aesEncryptedData + "." + rsaEncryptedKey;
    }

    private String decrypt(String encryptedData) throws Exception {
        encryptedData = encryptedData.replaceAll("\\s", "");
        String[] parts = encryptedData.split("\\.");
        if (parts.length != 2) return null;
        String rsaEncryptedKey = parts[1];
        String decryptedKey = Crypto.rsaDecrypt(rsaEncryptedKey, privateKeyPem);
        String aesEncryptedData = parts[0];
        return Crypto.CBC(aesEncryptedData, decryptedKey, "abcdefghijklmnop");
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("101", "100", "106", "102", "103", "104", "105");
        List<String> typeNames = Arrays.asList("电视剧", "电影", "粤台专区", "综艺", "动漫", "体育", "纪录片");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        String param = "{\"parent_category_id\":101}";
        String encryptData = encrypt(param);
        String content = OkHttp.post(latest, encryptData, getHeader(latest)).getBody();
        String decryptData = decrypt(content);
        Data data = Data.objectFrom(decryptData);
        return Result.string(classes, data.getList());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String param = String.format("{\"parent_category_id\":\"%s\",\"category_id\":null,\"language\":null,\"year\":null,\"region\":null,\"state\":null,\"keyword\":\"\",\"paid\":null,\"page\":%s,\"pagesize\":42,\"sort_field\":\"\",\"sort_type\":\"asc\"}", tid, pg);
        String encryptData = encrypt(param);
        String content = OkHttp.post(list, encryptData, getHeader(list + "|" + tid + "|" + pg)).getBody();
        String decryptData = decrypt(content);
        Data data = Data.objectFrom(decryptData);
        return Result.string(data.getList());
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String param = String.format("{\"id\":\"%s\"}", ids.get(0));
        String encryptData = encrypt(param);
        String content = OkHttp.post(detail, encryptData, getHeader(detail + "|" + ids.get(0))).getBody();
        String decryptData = decrypt(content);
        Data data = Data.objectFrom(decryptData);
        StringBuilder vod_play_url = new StringBuilder();
        List<Data.VideoFragmentList> videoFragmentList = data.getVideoFragmentList();
        for (int j = 0; j < videoFragmentList.size(); j++) {
            Data.VideoFragmentList videoList = videoFragmentList.get(j);
            String name = videoList.getSymbol();
            String nid = videoList.getId();
            List<Integer> Qualities = videoList.getQualities();
            nid = ids.get(0) + "|" + nid + "|" + Qualities;
            vod_play_url.append(name).append("$").append(nid);
            boolean notLastEpisode = j < videoFragmentList.size() - 1;
            vod_play_url.append(notLastEpisode ? "#" : "$$$");
        }
        Data.Video video = data.getVideo();
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodYear(video.getYear());
        vod.setVodArea(video.getRegion());
        vod.setVodActor(video.getStarring());
        vod.setVodRemarks(video.getState());
        vod.setVodContent(video.getDescription());
        vod.setVodDirector(video.getDirector());
        vod.setTypeName(video.getLanguage());
        vod.setVodPlayFrom("Qile");
        vod.setVodPlayUrl(vod_play_url.toString());
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String param = String.format("{\"parent_category_id\":null,\"category_id\":null,\"language\":null,\"year\":null,\"region\":null,\"state\":null,\"keyword\":\"%s\",\"paid\":null,\"page\":1,\"pagesize\":42,\"sort_field\":\"\",\"sort_type\":\"asc\",\"need_fragment\":1}", key);
        String encryptData = encrypt(param);
        String content = OkHttp.post(list, encryptData, getHeader(list + "|" + key)).getBody();
        String decryptData = decrypt(content);
        Data data = Data.objectFrom(decryptData);
        return Result.string(data.getList());
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] item = id.split("\\|");
        String tid = item[0];
        String nid = item[1];
        String[] quality = item[2].replaceAll("[\\[\\]]", "").replace(" ", "").split(",");
        List<String> url = new ArrayList<>();
        for (String s : quality) {
            if (s.equals("4")) url.add("1080p");
            else if (s.equals("3")) url.add("720p");
            else if (s.equals("2")) url.add("480p");
            else if (s.equals("1")) url.add("360p");
            else url.add(s.trim());
            String param = String.format("{\"video_id\":\"%s\",\"video_fragment_id\":%s,\"quality\":%s,\"seek\":null}", tid, nid, s.trim());
            String encryptData = encrypt(param);
            String content = OkHttp.post(play, encryptData, getHeader(play + "|" + tid + "|" + nid + "|" + s.trim())).getBody();
            String decryptData = decrypt(content);
            Data data = Data.objectFrom(decryptData);
            url.add(data.getVideo().getUrl());
        }
        return Result.get().url(url).header(playHeader()).string();
    }
}