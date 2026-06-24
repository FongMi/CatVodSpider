package com.github.catvod.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网盘/视频相关的字符串工具类
 * <p>
 * 替代 merge.I.GeneralUtils 和 merge.i0.m 中的工具方法
 */
public final class PanStringUtils {

    private static final Pattern EPISODE_PATTERN = Pattern.compile("(E|EP)0*([1-9]\\d*).*");
    private static final Pattern NUMBER_PATTERN = Pattern.compile(".*?([1-9]\\d*).*");
    private static final Pattern SEASON_PATTERN = Pattern.compile("^(.+)[sS]\\d{1,2}[eE]?\\d?$");
    private static final Pattern EP_SUFFIX_PATTERN = Pattern.compile("^(.+EP)\\d?$");

    public static final List<String> VIDEO_EXTENSIONS = Arrays.asList(
            "mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts",
            "mp3", "aac", "flac", "m4a", "ape", "ogg"
    );

    private PanStringUtils() {
    }

    // ==================== MIME 类型 ====================

    /**
     * 根据文件名获取 MIME 类型（替代 GeneralUtils.m）
     *
     * @return MIME 类型字符串，不识别返回 null
     */
    public static String getMimeType(String filename) {
        if (filename == null) return null;
        String lower = filename.toLowerCase();
        if (lower.endsWith(".mp4")) return "video/mp4";
        if (lower.endsWith(".webm")) return "video/webm";
        if (lower.endsWith(".avi")) return "video/x-msvideo";
        if (lower.endsWith(".wmv")) return "video/x-ms-wmv";
        if (lower.endsWith(".flv")) return "video/x-flv";
        if (lower.endsWith(".mov")) return "video/quicktime";
        if (lower.endsWith(".mkv")) return "video/x-matroska";
        if (lower.endsWith(".mpeg")) return "video/mpeg";
        if (lower.endsWith(".3gp")) return "video/3gpp";
        if (lower.endsWith(".ts")) return "video/MP2T";
        if (lower.endsWith(".mp3")) return "audio/mp3";
        if (lower.endsWith(".wav")) return "audio/wav";
        if (lower.endsWith(".aac")) return "audio/aac";
        if (lower.endsWith(".iso")) return "video/iso";
        if (lower.endsWith(".m2ts")) return "video/m2ts";
        if (lower.endsWith(".mpg")) return "video/mpg";
        return null;
    }

    /**
     * 判断是否为视频文件（替代 GeneralUtils.m() != null 模式）
     */
    public static boolean isVideoFile(String filename) {
        return getMimeType(filename) != null;
    }

    /**
     * 获取文件扩展名（替代 GeneralUtils.j）
     */
    public static String getExtension(String filename) {
        if (filename == null || !filename.contains(".")) return "";
        return filename.substring(filename.lastIndexOf(".") + 1);
    }

    /**
     * 判断是否为字幕扩展名（替代 GeneralUtils.r）
     */
    public static boolean isSubtitleExtension(String ext) {
        return "srt".equals(ext) || "ass".equals(ext) || "ssa".equals(ext);
    }

    // ==================== 文件名处理 ====================

    /**
     * 清理文件名：去除 # + $ 特殊字符（替代 GeneralUtils.y）
     */
    public static String cleanFilename(String name) {
        if (name == null || isBlank(name)) return "";
        return name.replaceAll("#", "").replaceAll("\\+", "").replaceAll("\\$", "");
    }

    /**
     * 去除文件扩展名（替代 GeneralUtils.x）
     */
    public static String removeExtension(String filename) {
        if (filename == null) return "";
        return filename.contains(".") ? filename.substring(0, filename.lastIndexOf(".")) : filename;
    }

    /**
     * 提取集数编号（替代 GeneralUtils.v）
     * <p>
     * 优先匹配 E01/EP01 格式，回退到第一个数字
     */
    public static String extractEpisodeNumber(String name) {
        if (name == null) return "";
        Matcher m = EPISODE_PATTERN.matcher(name);
        if (m.find()) return m.group(2);
        Matcher m2 = NUMBER_PATTERN.matcher(name);
        if (m2.find()) return m2.group(1);
        return "";
    }

    /**
     * 从文件名列表中提取公共前缀（替代 GeneralUtils.h）
     */
    public static String findCommonPrefix(List<String> names) {
        if (names == null || names.size() <= 1) return "";
        String prefix = names.get(0);
        for (int i = 1; i < names.size(); i++) {
            int j = 0;
            String other = names.get(i);
            while (j < prefix.length() && j < other.length() && prefix.charAt(j) == other.charAt(j)) {
                j++;
            }
            prefix = other.substring(0, j);
        }
        Matcher m = SEASON_PATTERN.matcher(prefix);
        if (m.matches()) return m.group(1);
        m = EP_SUFFIX_PATTERN.matcher(prefix);
        if (m.matches()) return m.group(1);
        return "《".equals(prefix) ? "" : prefix;
    }

    // ==================== 格式化 ====================

    /**
     * 格式化文件大小（替代 GeneralUtils.n）
     */
    public static String formatFileSize(double bytes) {
        if (bytes == 0.0) return "";
        if (bytes > 1099511627776.0) return String.format(Locale.getDefault(), "%.2fTB", bytes / 1099511627776.0);
        if (bytes > 1073741824.0) return String.format(Locale.getDefault(), "%.2fGB", bytes / 1073741824.0);
        if (bytes > 1048576.0) return String.format(Locale.getDefault(), "%.2fMB", bytes / 1048576.0);
        return String.format(Locale.getDefault(), "%.2fKB", bytes / 1024.0);
    }

    /**
     * 格式化时长（替代 GeneralUtils.z）
     *
     * @param seconds 秒数
     * @return "H:MM:SS" 或 "M:SS" 格式
     */
    public static String formatDuration(long seconds) {
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long secs = seconds % 60;
        return hours > 0
                ? String.format("%d:%02d:%02d", hours, minutes, secs)
                : String.format("%d:%02d", minutes, secs);
    }

    // ==================== 加密 ====================

    /**
     * MD5 哈希（替代 GeneralUtils.c 和 i0.m.c）
     */
    public static String md5(String input) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(input.getBytes("UTF-8"));
            StringBuilder hex = new StringBuilder(new java.math.BigInteger(1, digest).toString(16));
            while (hex.length() < 32) {
                hex.insert(0, "0");
            }
            return hex.toString().toLowerCase();
        } catch (Exception e) {
            return "";
        }
    }

    // ==================== Android ====================

    /**
     * dp 转 px（替代 GeneralUtils.f）
     */
    public static int dpToPx(int dp) {
        return (int) android.util.TypedValue.applyDimension(
                android.util.TypedValue.COMPLEX_UNIT_DIP, dp,
                android.content.res.Resources.getSystem().getDisplayMetrics());
    }

    // ==================== Cookie Utilities ====================

    /**
     * Extract __pus value from a Cookie header string.
     * Replaces GeneralUtils.i() from I0 package.
     */
    public static String extractPusFromCookie(String cookie) {
        if (cookie == null || cookie.trim().isEmpty()) return null;
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("([^=;]+)=([^;]*)").matcher(cookie);
        while (m.find()) {
            if ("__pus".equals(m.group(1).trim())) return m.group(2).trim();
        }
        return null;
    }

    /**
     * Merge HTTP Set-Cookie response headers with an existing Cookie string.
     * Replaces GeneralUtils.A() from I0 package.
     */
    public static String mergeCookies(Map<String, List<String>> responseHeaders, String existingCookie) {
        java.util.LinkedHashMap<String, String> cookies = new java.util.LinkedHashMap<>();
        if (existingCookie != null && !existingCookie.trim().isEmpty()) {
            for (String pair : existingCookie.split(";")) {
                String trimmed = pair.trim();
                int eq = trimmed.indexOf('=');
                if (!trimmed.isEmpty() && eq > 0) {
                    cookies.put(trimmed.substring(0, eq), eq < trimmed.length() - 1 ? trimmed.substring(eq + 1) : "");
                }
            }
        }
        List<String> setCookies = responseHeaders.get("Set-Cookie");
        if (setCookies == null) setCookies = responseHeaders.get("set-cookie");
        if (setCookies != null) {
            for (String sc : setCookies) {
                String pair = sc.split(";")[0].trim();
                int eq = pair.indexOf('=');
                if (!pair.isEmpty() && eq > 0) {
                    cookies.put(pair.substring(0, eq), eq < pair.length() - 1 ? pair.substring(eq + 1) : "");
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> e : cookies.entrySet()) {
            if (sb.length() > 0) sb.append("; ");
            sb.append(e.getKey()).append("=").append(e.getValue());
        }
        return sb.toString();
    }

    // ==================== 内部工具 ====================

    /** Public null-or-empty check for String. */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private static boolean isBlank(CharSequence cs) {
        if (cs == null || cs.length() == 0) return true;
        for (int i = 0; i < cs.length(); i++) {
            if (!Character.isWhitespace(cs.charAt(i))) return false;
        }
        return true;
    }
}
