package com.github.catvod.spider.merge.A0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class wh {
    public static final List a = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");
    public static final List b = Arrays.asList("srt", "ass", "ssa", "vtt");
    public static final String[] c = {"href", "src", "class", "title", "alt"};

    public static String d(String str) {
        if (str.isEmpty()) {
            return str;
        }
        String[] strArr = {"/", "-", "$", "(", ")", Marker.ANY_MARKER, Marker.ANY_NON_NULL_MARKER, ".", "[", "]", "?", "^", "{", "}", "|"};
        String strReplace = str;
        for (int i = 0; i < 15; i++) {
            String str2 = strArr[i];
            if (strReplace.contains(str2)) {
                strReplace = strReplace.replace(str2, "\\" + str2);
            }
        }
        return strReplace;
    }

    public static String e(String str, String str2, HashMap map) {
        try {
            adc adcVar = new adc(0);
            yi.g(yi.f(), str, map, adcVar);
            return new String(((Response) adcVar.getResult()).body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String f(String str, LinkedHashMap linkedHashMap, HashMap map) {
        try {
            adc adcVar = new adc(1);
            yi.i(yi.f(), str, linkedHashMap, map, adcVar);
            return new String(((Response) adcVar.getResult()).body().bytes(), "utf-8").replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String g(String str, String str2) {
        try {
            if (str2.startsWith("//")) {
                return Uri.parse(str).getScheme() + ":" + str2;
            }
            if (str2.startsWith("/") && str2.contains("=http")) {
                Uri uri = Uri.parse(str);
                return uri.getScheme() + "://" + uri.getHost() + str2;
            }
            if (str2.startsWith("mac://")) {
                return str2.replace("mac://", Uri.parse(str).getScheme() + "://");
            }
            if (str2.contains("://")) {
                return str2;
            }
            Uri uri2 = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(uri2.getScheme());
            sb.append("://");
            sb.append(uri2.getHost());
            sb.append(!str2.startsWith("/") ? "/".concat(str2) : str2);
            return sb.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    public static String h(ed edVar, String str, String str2) {
        int i;
        String strJ;
        String strJ2;
        String[] strArrSplit = str.split(str2);
        ArrayList arrayList = new ArrayList();
        int length = strArrSplit.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String strTrim = strArrSplit[i2].trim();
            if ((strTrim.startsWith("'") && strTrim.endsWith("'")) || (strTrim.startsWith("\"") && strTrim.endsWith("\""))) {
                arrayList.add(strTrim.substring(1, strTrim.length() - 1).replace("\\n", "\n"));
            } else {
                String[] strArrSplit2 = strTrim.split("&&");
                ed edVarK = strArrSplit2.length == 1 ? edVar : k(strArrSplit2[0], edVar);
                for (int i3 = 1; i3 < strArrSplit2.length - 1; i3++) {
                    edVarK = k(strArrSplit2[i3], edVarK);
                }
                String str3 = strArrSplit2[strArrSplit2.length - 1];
                if (Marker.ANY_MARKER.equals(str3)) {
                    strJ = "null";
                } else {
                    String[] strArrSplit3 = str3.split("\\|\\|");
                    if (strArrSplit3.length > 1) {
                        for (String str4 : strArrSplit3) {
                            try {
                                strJ2 = j(edVarK, str4);
                            } catch (Exception e) {
                                e.printStackTrace();
                                strJ2 = null;
                            }
                            if (!TextUtils.isEmpty(strJ2)) {
                                strJ = strJ2;
                                break;
                            }
                        }
                        strJ = j(edVarK, str3);
                    } else {
                        strJ = j(edVarK, str3);
                    }
                }
                arrayList.add(strJ);
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() <= 0) {
            return "";
        }
        if (arrayList.size() <= 1) {
            return (String) arrayList.get(0);
        }
        sb.append((String) arrayList.get(0));
        for (i = 1; i < arrayList.size(); i++) {
            sb.append("");
            sb.append((String) arrayList.get(i));
        }
        return sb.toString();
    }

    public static String i(ed edVar, String str) {
        if (str.length() == 0 || Marker.ANY_MARKER.equals(str)) {
            return "";
        }
        if (!str.contains(".js:") && !str.contains("＋")) {
            return h(edVar, str, "\\+");
        }
        return h(edVar, str, "＋");
    }

    public static String j(ed edVar, String str) {
        try {
            String[] strArrSplit = str.split("\\.js:");
            if (strArrSplit.length > 1) {
                str = strArrSplit[0];
            }
            String[] strArrSplit2 = str.split("!");
            if (strArrSplit2.length <= 1) {
                String strAk = str.equals("Text") ? edVar.ak() : "B64Dec".equals(str) ? new String(Base64.decode(edVar.ak(), 0)) : "Html".equals(str) ? edVar.ae() : str.contains("Attr") ? edVar.au(str.replace("Attr", "")) : edVar.au(str);
                return !"Html".equals(str) ? strAk.replaceAll("\n", " ") : strAk;
            }
            String strAk2 = strArrSplit2[0].equals("Text") ? edVar.ak() : "B64Dec".equals(strArrSplit2[0]) ? new String(Base64.decode(edVar.ak(), 0)) : "Html".equals(strArrSplit2[0]) ? edVar.ae() : strArrSplit2[0].contains("Attr") ? edVar.au(strArrSplit2[0].replace("Attr", "")) : edVar.au(strArrSplit2[0]);
            if (!"Html".equals(str)) {
                strAk2 = strAk2.replaceAll("\n", " ");
            }
            for (int i = 1; i < strArrSplit2.length; i++) {
                strAk2 = strAk2.replace(strArrSplit2[i], "");
            }
            return strAk2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ed k(String str, ed edVar) {
        ed edVarK;
        if (str.startsWith("Text") || str.startsWith("Attr")) {
            return edVar;
        }
        for (String str2 : c) {
            if (str2.equals(str)) {
                return edVar;
            }
        }
        String[] strArrSplit = str.split("--");
        if (strArrSplit.length > 1) {
            ed edVarK2 = k(strArrSplit[0], edVar);
            String strAn = edVarK2.an();
            for (int i = 1; i < strArrSplit.length; i++) {
                strAn = strAn.replace(k(strArrSplit[i], edVarK2).an(), "");
                edVarK2 = oj.a(strAn);
            }
            return edVarK2;
        }
        String[] strArrSplit2 = str.split("\\|\\|");
        if (strArrSplit2.length > 1) {
            for (String str3 : strArrSplit2) {
                try {
                    edVarK = k(str3, edVar);
                } catch (Exception e) {
                    e.printStackTrace();
                    edVarK = null;
                }
                if (edVarK != null) {
                    return edVarK;
                }
            }
        }
        String[] strArrSplit3 = str.split(",");
        if (strArrSplit3.length > 1) {
            int i2 = Integer.parseInt(strArrSplit3[1]);
            rp rpVarAh = edVar.ah(strArrSplit3[0]);
            return i2 < 0 ? (ed) rpVarAh.get(rpVarAh.size() + i2) : (ed) edVar.ah(strArrSplit3[0]).get(i2);
        }
        rp rpVarAh2 = edVar.ah(str);
        if (rpVarAh2.isEmpty()) {
            return null;
        }
        return (ed) rpVarAh2.get(0);
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("magnet:") || lowerCase.startsWith("ed2k:") || lowerCase.startsWith("thunder:")) {
            return true;
        }
        return (lowerCase.startsWith("http") && lowerCase.split(";")[0].endsWith(".torrent")) || lowerCase.startsWith("ftp://") || lowerCase.startsWith("tvbox-xg:") || lowerCase.startsWith("xg://") || lowerCase.startsWith("xgplay://");
    }

    public static String m(String str) {
        String[] strArr = {"[排序", "[替换", "[不包含"};
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (str.contains(str2)) {
                str = str.substring(0, str.indexOf(str2));
            }
        }
        return str;
    }

    public static String n(String str, String str2) {
        if (!str.isEmpty()) {
            for (String str3 : ((String) q(str2, "[替换:", "]").get(0)).split("\\|\\|")) {
                if (str3.contains("=>")) {
                    str = str3.split("=>").length < 2 ? str.replace(str3.split("=>")[0], "") : str.replace(str3.split("=>")[0], str3.split("=>")[1]);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rp o(ed edVar, String str) {
        int i;
        int size;
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length <= 1) {
            return edVar.ah(str);
        }
        String[] strArrSplit2 = strArrSplit[1].split(":", -1);
        if (TextUtils.isEmpty(strArrSplit2[0])) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(strArrSplit2[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                i = 0;
            }
        }
        if (TextUtils.isEmpty(strArrSplit2[1])) {
            size = 0;
        } else {
            try {
                size = Integer.parseInt(strArrSplit2[1]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                size = 0;
            }
        }
        rp rpVarAh = edVar.ah(strArrSplit[0]);
        if (size > rpVarAh.size()) {
            size = rpVarAh.size();
        }
        if (size <= 0) {
            size += rpVarAh.size();
        }
        rp rpVar = new rp();
        while (i < size) {
            rpVar.add((ed) rpVarAh.get(i));
            i++;
        }
        return rpVar;
    }

    public static String p(String str) {
        String strTrim;
        String str2;
        try {
            String str3 = str.split("/share")[0];
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
            String strReplace = yi.k(str, map).replace("var purl", "var main");
            String str4 = null;
            if (strReplace.indexOf("main") != -1) {
                Matcher matcher = Pattern.compile("var main = ['\"](.*?)['\"]").matcher(strReplace);
                if (matcher.find()) {
                    strTrim = matcher.group(1).trim();
                    if (strTrim.indexOf("http") == -1) {
                        str2 = str3 + strTrim;
                        str4 = str2;
                    }
                    str4 = strTrim;
                }
            } else {
                Matcher matcher2 = Pattern.compile("url:.*?['\"](.*?)['\"]").matcher(strReplace);
                if (matcher2.find()) {
                    strTrim = matcher2.group(1).trim();
                    if (strTrim.indexOf("http") != -1) {
                        str4 = strTrim;
                    } else {
                        str2 = str3 + strTrim;
                        str4 = str2;
                    }
                }
            }
            return str4 != null ? str4 : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static ArrayList q(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (str2.isEmpty() && str3.isEmpty()) {
            arrayList.add(str);
            return arrayList;
        }
        try {
            Matcher matcher = Pattern.compile(d(str2.replaceAll("＆＆", "&")) + "(.*?)" + d(str3.replaceAll("＆＆", "&"))).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1).trim());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (arrayList.isEmpty()) {
            arrayList.add("");
        }
        return arrayList;
    }

    public static String r(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArrSplit = str.split("\\\\u");
        for (int i = 1; i < strArrSplit.length; i++) {
            stringBuffer.append((char) Integer.parseInt(strArrSplit[i], 16));
        }
        return stringBuffer.toString();
    }
}
