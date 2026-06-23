package com.github.catvod.utils;

/**
 * 网盘字符串判空工具类
 * <p>
 * 替代 merge.P0.e 中的 isEmpty/isBlank/isNotBlank 方法
 */
public final class PanTextUtils {

    private PanTextUtils() {
    }

    /**
     * 判空（null 或长度为 0）（替代 P0.e.c）
     */
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * 判空白（null、空串或全空白字符）（替代 P0.e.b）
     */
    public static boolean isBlank(CharSequence cs) {
        if (cs == null || cs.length() == 0) return true;
        for (int i = 0; i < cs.length(); i++) {
            if (!Character.isWhitespace(cs.charAt(i))) return false;
        }
        return true;
    }

    /**
     * 非空白（替代 P0.e.d）
     */
    public static boolean isNotBlank(CharSequence cs) {
        return !isBlank(cs);
    }

    /**
     * 非空
     */
    public static boolean isNotEmpty(CharSequence cs) {
        return !isEmpty(cs);
    }
}
