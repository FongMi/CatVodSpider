package com.github.catvod.spider.merge.A;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.protobuf.DescriptorProtos;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Headers;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a implements com.github.catvod.spider.merge.R.a {
    public static int a(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    public static String a(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr;
        int i = 0;
        if (str == null || str.length() % 2 != 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[str.length() / 2];
            while (i < str.length()) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = str3.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArr), StandardCharsets.UTF_8);
    }

    public static String a(String str, ArrayList arrayList) {
        return C0552c.s(arrayList, new JSONObject(str));
    }

    public static String a(String str, Map<String, String> map) {
        Map multimap = C0575b.a().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().toMultimap();
        if (multimap == null || !multimap.containsKey("Set-Cookie")) {
            return null;
        }
        String string = "";
        for (int i = 0; i < ((List) multimap.get("Set-Cookie")).size(); i++) {
            StringBuilder sbA = C0529a.a(string);
            sbA.append(((String) ((List) multimap.get("Set-Cookie")).get(i)).replaceAll("secure", ""));
            string = sbA.toString();
        }
        return string;
    }

    public static String a(String str, Object[] objArr, StringBuilder sb) {
        sb.append(String.format(str, objArr));
        return sb.toString();
    }

    public static String a(JSONObject jSONObject, String str, StringBuilder sb, String str2, String str3) {
        sb.append(jSONObject.getString(str));
        sb.append(str2);
        sb.append(jSONObject.getString(str3));
        return sb.toString();
    }

    public static String a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String ad(int i) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(cArr[random.nextInt(36)]);
        }
        return sb.toString();
    }

    public static String af(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String an(String str, String str2, String str3) {
        try {
            str = str.replace("\\", "");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception unused) {
            return str;
        }
    }

    public static String ao(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt((int) Math.floor(Math.random() * ((double) 62))));
        }
        return sb.toString();
    }

    public static String at(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 2), StandardCharsets.UTF_8);
        } catch (IllegalArgumentException | Exception unused) {
            return null;
        }
    }

    public static C0554e b(String str) {
        C0554e c0554e = new C0554e();
        c0554e.j(str);
        return c0554e;
    }

    public static Object b(int i) {
        return DescriptorProtos.getDescriptor().getMessageTypes().get(i);
    }

    public static String b() {
        return C0552c.n(new ArrayList());
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static String m5b(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    public static String b(String str, String str2) {
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(bytes), 0);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th2 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th2 != null) {
            th = th2;
        }
        int i = com.github.catvod.spider.merge.y.b.e;
        String strA = com.github.catvod.spider.merge.y.b.a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strA);
        sb.append(": ");
        int i2 = com.github.catvod.spider.merge.y.f.a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static HashMap m6b() {
        new ArrayList();
        return new HashMap();
    }

    public static JSONArray b(String str, String str2, String str3) {
        return new JSONObject(str).getJSONObject(str2).getJSONArray(str3);
    }

    public static void b(LinkedHashMap linkedHashMap, String str, C0554e c0554e, String str2) {
        c0554e.m(TextUtils.join(str, linkedHashMap.keySet()));
        c0554e.n(TextUtils.join(str2, linkedHashMap.values()));
    }

    public static String bo(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Charset charset = StandardCharsets.UTF_8;
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(charset));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return Base64.encodeToString(cipher.doFinal(str.getBytes(charset)), 2);
    }

    public static JsonObject c(String str) {
        JsonElement string;
        try {
            try {
                string = JsonParser.parseString(str);
            } catch (Throwable unused) {
                string = new JsonParser().parse(str);
            }
            JsonObject asJsonObject = string.getAsJsonObject();
            return asJsonObject == null ? new JsonObject() : asJsonObject;
        } catch (Throwable unused2) {
            return new JsonObject();
        }
    }

    public static String c(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String c(String str, int i) {
        return str + i;
    }

    public static String c(String str, String str2) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode("MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGAe6hKrWLi1zQmjTT1ozbE4QdFeJGNxubxld6GrFGximxfMsMB6BpJhpcTouAqywAFppiKetUBBbXwYsYU1wNr648XVmPmCMCy4rY8vdliFnbMUj086DU6Z+/oXBdWU3/b1G0DN3E9wULRSwcKZT3wj/cCI1vsCm3gj2R5SqkA9Y0CAwEAAQKBgAJH+4CxV0/zBVcLiBCHvSANm0l7HetybTh/j2p0Y1sTXro4ALwAaCTUeqdBjWiLSo9lNwDHFyq8zX90+gNxa7c5EqcWV9FmlVXr8VhfBzcZo1nXeNdXFT7tQ2yah/odtdcx+vRMSGJd1t/5k5bDd9wAvYdIDblMAg+wiKKZ5KcdAkEA1cCakEN4NexkF5tHPRrR6XOY/XHfkqXxEhMqmNbB9U34saTJnLWIHC8IXys6Qmzz30TtzCjuOqKRRy+FMM4TdwJBAJQZFPjsGC+RqcG5UvVMiMPhnwe/bXEehShK86yJK/g/UiKrO87h3aEu5gcJqBygTq3BBBoH2md3pr/W+hUMWBsCQQChfhTIrdDinKi6lRxrdBnn0Ohjg2cwuqK5zzU9p/N+S9x7Ck8wUI53DKm8jUJE8WAG7WLj/oCOWEh+ic6NIwTdAkEAj0X8nhx6AXsgCYRql1klbqtVmL8+95KZK7PnLWG/IfjQUy3pPGoSaZ7fdquG8bq8oyf5+dzjE/oTXcByS+6XRQJAP/5ciy1bL3NhUhsaOVy55MHXnPjdcTX0FaLi+ybXZIfIQ2P4rb19mVq1feMbCXhz+L1rG8oat5lYKfpe8k83ZA==", 2)));
        Cipher cipher = Cipher.getInstance(str2);
        cipher.init(2, privateKeyGeneratePrivate);
        return new String(cipher.doFinal(Base64.decode(str, 2)), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static JSONArray m7c(String str, String str2) {
        return new JSONObject(str).getJSONArray(str2);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static JSONObject m8c(String str, String str2) {
        return new JSONObject(str).getJSONObject(str2);
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static String d(ArrayList arrayList, int i, int i2, int i3, int i4) {
        C0552c c0552c = new C0552c();
        c0552c.w(arrayList);
        c0552c.i(i, i2, i3, i4);
        return c0552c.toString();
    }

    public static String d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr);
    }

    public static StringBuilder e(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder f(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static StringBuilder f(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        StringBuilder sb2 = new StringBuilder(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static String g(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String h(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String i(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{}";
        }
        String strTrim = str.trim();
        if (!strTrim.startsWith("{") && !strTrim.startsWith("http")) {
            try {
                byte[] bArrDecode = Base64.decode(strTrim, 2);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, new SecretKeySpec("CatVodAppGet2024".getBytes("UTF-8"), "AES"), new IvParameterSpec("SpiderExtConfig!".getBytes("UTF-8")));
                return new String(cipher.doFinal(bArrDecode), "UTF-8");
            } catch (Exception unused) {
            }
        }
        return strTrim;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void p(LinkedHashMap linkedHashMap, String str, C0554e c0554e, String str2) {
        c0554e.m(TextUtils.join(str, linkedHashMap.keySet()));
        c0554e.n(TextUtils.join(str2, linkedHashMap.values()));
    }

    public static void r(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        SpiderDebug.log(sb.toString());
    }

    public static void s(String str, String str2, String str3, ArrayList arrayList) {
        arrayList.add(new C0550a(str, str2, str3));
    }

    public static C0552c z(String str) {
        C0552c c0552c = new C0552c();
        c0552c.w(str);
        return c0552c;
    }

    @Override // com.github.catvod.spider.merge.R.a
    public com.github.catvod.spider.merge.R.b a(String str) {
        return com.github.catvod.spider.merge.T.b.a;
    }
}
