package com.github.catvod.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件路径和写入工具（替代 VodResult.VodCategory 的静态方法）
 */
public final class PathHelper {

    private PathHelper() {
    }

    /**
     * 拼接文件路径（替代 VodCategory.a(dir, name)）
     */
    public static String buildPath(String dir, String name) {
        if (dir == null || dir.isEmpty()) return name;
        if (name == null || name.isEmpty()) return dir;
        return dir + File.separator + name;
    }

    /**
     * 写入文本文件（替代 VodCategory.g(file, content)）
     */
    public static void writeFile(File file, String content) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
