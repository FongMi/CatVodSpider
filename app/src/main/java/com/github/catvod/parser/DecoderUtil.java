package com.github.catvod.parser;

import com.github.catvod.spider.C0183;
import java.io.ByteArrayOutputStream;

public class DecoderUtil {

    /** 常量 */
    public static final int CONST_VALUE = 130;

    /**
     * 将十六进制字符串解码成普通字符串
     */
    public static String decodeHex(String hexStr) {
        // 十六进制字符映射表
        String hexChars = "";
        for (int i = 0; i < 15; i++) {
            hexChars += Integer.toHexString(i);
        }

        // 将十六进制字符串转为字节数组
        ByteArrayOutputStream baos = new ByteArrayOutputStream(hexStr.length() / 2);
        for (int i = 0; i < hexStr.length(); i += 2) {
            int high = hexChars.indexOf(hexStr.charAt(i));
            int low = hexChars.indexOf(hexStr.charAt(i + 1));
            baos.write((high << 4) | low);
        }

        return new String(baos.toByteArray());
    }

    /**
     * 返回对象的 hashCode
     */
    public static int getHash(Object obj) {
        return obj.hashCode();
    }

    /**
     * 一个混淆过的计算方法
     */
    public static int calcValue() {
        return (-798) ^ C0183.f894;
    }

    /**
     * 使用异或规则将 short 数组解码成字符串
     */
    public static String decodeShortArray(short[] arr, int offset, int length, int xorKey) {
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = (char) (arr[offset + i] ^ xorKey);
        }
        return new String(chars);
    }
}
