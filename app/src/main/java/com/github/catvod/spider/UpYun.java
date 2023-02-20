package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.upyun.Data;
import com.github.catvod.bean.upyun.Item;
import com.github.catvod.net.OkHttp;
import com.google.common.io.BaseEncoding;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class UpYun extends Ali {

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String res = decode(OkHttp.string("https://zyb.upyunso.com/v15/search?keyword=" + URLEncoder.encode(key) + "&page=1&s_type=2"));
        List<Vod> list = new ArrayList<>();
        for (Item item : Data.objectFrom(res).getResult().getItems()) {
            String url = decode(item.getPageUrl());
            if (!url.contains("www.aliyundrive.com")) continue;
            if (item.getTitle().contains(key)) list.add(item.url(url).getVod());
        }
        return Result.string(list);
    }

    private String decode(String data) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec("qq1920520460qqzz".getBytes(), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec("qq1920520460qqzz".getBytes());
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        byte[] encryptDataBytes = BaseEncoding.base16().decode(data.toUpperCase());
        byte[] decryptData = cipher.doFinal(encryptDataBytes);
        return new String(decryptData, "UTF-8");
    }
}