package com.github.catvod.utils;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import androidx.core.content.FileProvider;

import com.github.catvod.Runtime;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class FileUtil {

    public static void openFile(File file) {
        Context context = Runtime.context();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setDataAndType(FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file), getMimeType(file.getName()));
        context.startActivity(intent);
    }

    public static void unzip(File target, File path) throws IOException {
        String root = path.getCanonicalPath() + File.separator;
        try (ZipFile zip = new ZipFile(target.getAbsolutePath())) {
            Enumeration<?> entries = zip.entries();
            while (entries.hasMoreElements()) {
                if (Thread.currentThread().isInterrupted()) throw new InterruptedIOException("解壓已取消");
                unzipEntry(zip, (ZipEntry) entries.nextElement(), path, root);
            }
        }
    }

    private static void unzipEntry(ZipFile zip, ZipEntry entry, File path, String root) throws IOException {
        File out = new File(path, entry.getName());
        if (!out.getCanonicalPath().startsWith(root)) throw new IOException("解壓路徑超出目錄：" + entry.getName());
        File dir = entry.isDirectory() ? out : out.getParentFile();
        if (!dir.isDirectory() && !dir.mkdirs()) throw new IOException("無法建立目錄：" + dir);
        if (entry.isDirectory()) return;
        try (InputStream input = zip.getInputStream(entry); FileOutputStream output = new FileOutputStream(out)) {
            byte[] buffer = new byte[8192];
            int count;
            while ((count = input.read(buffer)) != -1) {
                if (Thread.currentThread().isInterrupted()) throw new InterruptedIOException("解壓已取消");
                output.write(buffer, 0, count);
            }
        }
    }

    private static String getMimeType(String fileName) {
        if (fileName.toLowerCase(Locale.ROOT).endsWith(".apk")) return "application/vnd.android.package-archive";
        String mimeType = URLConnection.guessContentTypeFromName(fileName);
        return TextUtils.isEmpty(mimeType) ? "*/*" : mimeType;
    }
}
