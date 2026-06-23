package com.github.catvod.spider;

import android.app.Application;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.github.catvod.crawler.Spider;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Wallpaper extends Spider {
    public static Object[] proxy(Map<String, String> map) {
        InputStream byteArrayInputStream;
        Object[] objArr = new Object[3];
        objArr[0] = 200;
        objArr[1] = "image/jpeg";
        char c = 1;
        Application applicationContext = Init.context();
        if (applicationContext != null) {
            try {
                Display defaultDisplay = ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                c = point.x > point.y ? (char) 2 : (char) 1;
            } catch (Exception unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(c == 2 ? "http://127.0.0.1:1314/wallpaper/tv" : "http://127.0.0.1:1314/wallpaper").openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            byteArrayInputStream = httpURLConnection.getInputStream();
        } catch (Exception e) {
            byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
        }
        objArr[2] = byteArrayInputStream;
        return objArr;
    }
}
