package com.github.catvod.utils;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import androidx.core.content.FileProvider;

import com.github.catvod.Init;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class FileUtil {

    public static void openFile(File file) {
        Context context = Init.context();
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
                ZipEntry entry = (ZipEntry) entries.nextElement();
                File out = new File(path, entry.getName());
                if (!out.getCanonicalPath().startsWith(root)) throw new IOException("解壓路徑超出目錄：" + entry.getName());
                File dir = entry.isDirectory() ? out : out.getParentFile();
                if (!dir.isDirectory() && !dir.mkdirs()) throw new IOException("無法建立目錄：" + dir);
                if (entry.isDirectory()) continue;
                try (InputStream input = zip.getInputStream(entry); FileOutputStream output = new FileOutputStream(out)) {
                    byte[] buffer = new byte[8192];
                    int count;
                    while ((count = input.read(buffer)) != -1) output.write(buffer, 0, count);
                }
            }
        }
    }

    private static String getMimeType(String fileName) {
        String mimeType = URLConnection.guessContentTypeFromName(fileName);
        return TextUtils.isEmpty(mimeType) ? "*/*" : mimeType;
    }
}
