package com.fongmi.tools;

import com.google.common.io.BaseEncoding;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Config {

    private final Gson gson;

    public static void main(String[] args) {
        try {
            Config config = new Config();
            String json = config.getJson("http://饭太硬.top/tv");
            System.out.println(config.gson.toJson(JsonParser.parseString(json)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Config() {
        gson = new Gson().newBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    }

    private String getJson(String url) throws Exception {
        String key = url.contains(";") ? url.split(";")[2] : "";
        url = url.contains(";") ? url.split(";")[0] : url;
        String data = getData(url);
        if (Utils.isJson(data)) return data;
        if (data.isEmpty()) throw new Exception();
        if (data.contains("**")) data = base64(data);
        if (data.startsWith("2423")) data = cbc(data);
        if (key.length() > 0) data = ecb(data, key);
        return data;
    }

    private String getData(String url) throws Exception {
        if (url.startsWith("http")) return Utils.call(url);
        throw new Exception();
    }

    private String ecb(String data, String key) throws Exception {
        SecretKeySpec spec = new SecretKeySpec(padEnd(key), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, spec);
        return new String(cipher.doFinal(decodeHex(data)), StandardCharsets.UTF_8);
    }

    private String cbc(String data) throws Exception {
        int indexKey = data.indexOf("2324") + 4;
        String key = new String(decodeHex(data.substring(0, indexKey)), StandardCharsets.UTF_8);
        key = key.replace("$#", "").replace("#$", "");
        int indexIv = data.length() - 26;
        String iv = data.substring(indexIv).trim();
        iv = new String(decodeHex(iv), StandardCharsets.UTF_8);
        SecretKeySpec keySpec = new SecretKeySpec(padEnd(key), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(padEnd(iv));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        data = data.substring(indexKey, indexIv).trim();
        byte[] encryptDataBytes = decodeHex(data);
        byte[] decryptData = cipher.doFinal(encryptDataBytes);
        return new String(decryptData, StandardCharsets.UTF_8);
    }

    private String base64(String data) {
        String extract = extract(data);
        if (extract.isEmpty()) return data;
        return new String(Base64.getDecoder().decode(extract));
    }

    private String extract(String data) {
        Matcher matcher = Pattern.compile("[A-Za-z0-9]{8}\\*\\*").matcher(data);
        return matcher.find() ? data.substring(data.indexOf(matcher.group()) + 10) : "";
    }

    private byte[] padEnd(String key) {
        return (key + "0000000000000000".substring(key.length())).getBytes(StandardCharsets.UTF_8);
    }

    private byte[] decodeHex(String s) {
        return BaseEncoding.base16().decode(s.toUpperCase());
    }
}
