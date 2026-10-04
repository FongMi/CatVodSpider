package com.github.catvod.utils;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class VodUtil {

    public static final List<String> MEDIA = Arrays.asList("mp4", "mkv", "mov", "wav", "wma", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg", "rm", "rmvb", "asf", "dts", "dsf", "dff");
    public static final List<String> SUB = Arrays.asList("srt", "ass", "ssa", "vtt");

    public static String getSize(double size) {
        if (size <= 0) return "";
        String[] units = new String[]{"bytes", "KB", "MB", "GB", "TB"};
        int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
        return new DecimalFormat("#,##0.#").format(size / Math.pow(1024, digitGroups)) + " " + units[digitGroups];
    }

    public static boolean isSub(String text) {
        return SUB.contains(getExt(text));
    }

    public static boolean isMedia(String text) {
        return MEDIA.contains(getExt(text));
    }

    public static String getExt(String name) {
        return (name.contains(".") ? name.substring(name.lastIndexOf(".") + 1) : name).toLowerCase(Locale.ROOT);
    }

    public static String removeExt(String text) {
        return text.contains(".") ? text.substring(0, text.lastIndexOf(".")) : text;
    }
}
