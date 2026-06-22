package com.github.catvod.spider.merge.o;

import android.net.Uri;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class d {
    public static final Pattern a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");
    public static final Pattern b = Pattern.compile("(magnet|thunder|ed2k):.*");
    public static final List c = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");
    public static final List d = Arrays.asList("srt", "ass", "ssa", "vtt");

    public static String a(String str, String str2) {
        if (str2.startsWith("//")) {
            return Uri.parse(str).getScheme() + ":" + str2;
        }
        if (str2.contains("://")) {
            return str2;
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() + "://" + uri.getHost() + str2;
    }

    public static String b(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    public static String c(double d2) {
        return d2 <= 0.0d ? "" : d2 > 1.099511627776E12d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1.099511627776E12d), "TB") : d2 > 1.073741824E9d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1.073741824E9d), "GB") : d2 > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1024.0d), "KB");
    }

    public static boolean d(String str) {
        if (str.contains("url=http") || str.contains(".js") || str.contains(".css") || str.contains(".html")) {
            return false;
        }
        return a.matcher(str).find();
    }

    public static boolean e(String str) {
        Iterator it = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String f(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    public static String g(String str) {
        return (str == null || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
    }
}
