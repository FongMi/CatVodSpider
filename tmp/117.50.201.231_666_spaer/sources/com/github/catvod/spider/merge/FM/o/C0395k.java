package com.github.catvod.spider.merge.FM.o;

import android.util.Base64;
import com.github.catvod.spider.merge.FM.m.C0378c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0395k {
    private static final String a = "https://api.nn.ci/ocr/b64/text";

    public static String a(String str, Map<String, String> map) {
        String str2 = "";
        for (int i = 0; str2.equals("") && i < 3; i++) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                map.put("Cookie", httpURLConnection.getHeaderFields().get("Set-Cookie").get(0));
                InputStream inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
                inputStream.close();
                ResponseBody responseBodyBody = C0378c.k(a, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0)).body();
                if (responseBodyBody != null) {
                    String strString = responseBodyBody.string();
                    if (strString.length() == 4) {
                        str2 = strString;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }
}
