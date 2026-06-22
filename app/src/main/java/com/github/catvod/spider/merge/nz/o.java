package com.github.catvod.spider.merge.nz;

import android.util.TypedValue;
import com.github.catvod.spider.Init;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o {
    public static final /* synthetic */ int a = 0;

    static {
        Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "mp3", "aac", "flac", "m4a", "ape", "ogg");
        Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http((?!http).)*?video/tos*");
    }

    public static int a(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    public static String b(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    public static String c(double d) {
        return d <= 0.0d ? "" : d > 1.099511627776E12d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.099511627776E12d), "TB") : d > 1.073741824E9d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.073741824E9d), "GB") : d > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1024.0d), "KB");
    }

    public static boolean d(String str) {
        return str.equals("srt") || str.equals("ass") || str.equals("ssa");
    }

    public static String e(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }
}
