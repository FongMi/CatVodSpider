package com.github.catvod.spider;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DanmakuUtils {

    // 提取集数
    public static float extractEpisodeNum(String text) {
        if (TextUtils.isEmpty(text)) return -1;

        // 尝试匹配 "第X集"
        Pattern pattern = Pattern.compile("第\\s*(\\d+)\\s*集");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            try {
                return Float.parseFloat(matcher.group(1));
            } catch (Exception e) {}
        }

        // 尝试匹配 "EP01" 或 "E01"
        pattern = Pattern.compile("[Ee][Pp]?\\s*(\\d+)");
        matcher = pattern.matcher(text);
        if (matcher.find()) {
            try {
                return Float.parseFloat(matcher.group(1));
            } catch (Exception e) {}
        }

        return -1;
    }

    // 提取标题（简化版）
    public static String extractTitle(String src) {
        if (TextUtils.isEmpty(src)) return "";

        String result = src.trim();

        // 移除集数信息（更彻底）
        result = result.replaceAll("第\\s*[0-9零一二三四五六七八九十百千]+\\s*[集話话]", "");
        result = result.replaceAll("[Ee][Pp]?\\s*\\d+", "");
        result = result.replaceAll("S\\d+", "");
        result = result.replaceAll("\\d+[Kk]", "");
        // 移除文件大小信息
        result = result.replaceAll("\\[\\d+[\\.\\d]*[MGT]\\]", "");
        // 移除分辨率信息
        result = result.replaceAll("\\d+[Pp]", "");
        result = result.replaceAll("4K", "");
        // 移除文件扩展名
        result = result.replaceAll("\\.(mp4|mkv|avi|rmvb|flv|web|dl|h265|h264|hevc)$", "");
        // 移除括号内容
        result = result.replaceAll("【.*?】", "");
        result = result.replaceAll("\\[.*?\\]", "");
        result = result.replaceAll("\\(.*?\\)", "");
        // 清理中文标点
        result = result.replaceAll("[:：]", " ");

        // 提取中文部分（如果有）
        String chinesePart = "";
        Matcher chineseMatcher = Pattern.compile("[\\u4e00-\\u9fff]+").matcher(result);
        if (chineseMatcher.find()) {
            chinesePart = chineseMatcher.group();
        }

        // 如果找到中文部分，优先使用中文
        if (!TextUtils.isEmpty(chinesePart)) {
            return chinesePart.trim();
        }

        // 否则清理多余空格
        result = result.replaceAll("\\s+", " ").trim();

        return result;
    }

    // 生成视频签名（用于识别是否同一个视频）
    public static String generateVideoSignature(String title) {
        if (TextUtils.isEmpty(title)) return "";

        String signature = title.trim().toLowerCase();

        // 移除常见后缀（保留核心内容）
        signature = signature.replaceAll("\\.(mp4|mkv|avi|rmvb|flv|web|dl|h265|h264|hevc)$", "");
        signature = signature.replaceAll("\\d+[Pp]", "");
        signature = signature.replaceAll("4k", "");
        signature = signature.replaceAll("2160p", "");
        signature = signature.replaceAll("1080p", "");
        signature = signature.replaceAll("720p", "");
        signature = signature.replaceAll("web-dl", "");
        signature = signature.replaceAll("webdl", "");
        signature = signature.replaceAll("h\\.?265", "");
        signature = signature.replaceAll("h\\.?264", "");
        signature = signature.replaceAll("hevc", "");
        signature = signature.replaceAll("hdr", "");
        signature = signature.replaceAll("avc", "");
        signature = signature.replaceAll("aac", "");
        signature = signature.replaceAll("ac3", "");

        // 提取中文部分
        StringBuilder chinesePart = new StringBuilder();
        Matcher chineseMatcher = Pattern.compile("[\\u4e00-\\u9fff]+").matcher(signature);
        while (chineseMatcher.find()) {
            chinesePart.append(chineseMatcher.group());
        }

        if (chinesePart.length() > 0) {
            return chinesePart.toString();
        }

        // 如果没有中文，提取英文单词（至少3个字母）
        StringBuilder englishPart = new StringBuilder();
        Matcher englishMatcher = Pattern.compile("\\b[a-zA-Z]{3,}\\b").matcher(signature);
        while (englishMatcher.find()) {
            englishPart.append(englishMatcher.group()).append(" ");
        }

        if (englishPart.length() > 0) {
            return englishPart.toString().trim();
        }

        // 如果什么都没有，返回清理后的标题
        return signature.replaceAll("\\s+", " ").trim();
    }

    // 判断两个视频签名是否相同
    public static boolean isSameVideo(String signature1, String signature2) {
        if (TextUtils.isEmpty(signature1) || TextUtils.isEmpty(signature2)) {
            return false;
        }

        // 简单比较
        if (signature1.equals(signature2)) {
            return true;
        }

        // 或者一个包含另一个
        if (signature1.contains(signature2) || signature2.contains(signature1)) {
            return true;
        }

        // 计算相似度（简单版）
        int minLen = Math.min(signature1.length(), signature2.length());
        int maxLen = Math.max(signature1.length(), signature2.length());

        if (minLen == 0 || maxLen == 0) {
            return false;
        }

        // 如果较短的字符串至少70%的内容在较长的字符串中，认为是同一个视频
        int matchCount = 0;
        for (int i = 0; i < minLen; i++) {
            if (signature2.contains(String.valueOf(signature1.charAt(i)))) {
                matchCount++;
            }
        }

        double similarity = (double) matchCount / minLen;
        return similarity > 0.7;
    }
}