package com.github.catvod.utils;

import android.os.Environment;

import androidx.annotation.Nullable;

import com.github.catvod.crawler.SpiderDebug;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Path {

    private static final String TAG = Path.class.getSimpleName();

    private static File mkdir(File file) {
        if (!file.exists()) file.mkdirs();
        return file;
    }

    public static File download() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    public static File root() {
        return Environment.getExternalStorageDirectory();
    }

    public static File tv() {
        return mkdir(new File(root() + File.separator + "TV"));
    }

    public static File tv(String name) {
        if (!name.startsWith(".")) name = "." + name;
        return new File(tv(), name);
    }

    public static String read(File file) {
        try {
            return new String(readToByte(file), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "";
        }
    }

    public static String read(InputStream is) {
        try {
            return new String(readToByte(is), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static byte[] readToByte(File file) throws IOException {
        try (FileInputStream is = new FileInputStream(file)) {
            return readToByte(is);
        }
    }

    private static byte[] readToByte(InputStream is) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            int read;
            byte[] buffer = new byte[16384];
            while ((read = is.read(buffer)) != -1) bos.write(buffer, 0, read);
            return bos.toByteArray();
        }
    }

    public static File write(File file, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(create(file));
            fos.write(data);
            fos.flush();
            fos.close();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return file;
        }
    }

    public static void move(File in, File out) {
        if (in.renameTo(out)) return;
        copy(in, out);
        clear(in);
    }

    public static void copy(File in, File out) {
        try {
            copy(new FileInputStream(in), out);
        } catch (IOException ignored) {
        }
    }

    public static void copy(InputStream in, File out) {
        try {
            int read;
            byte[] buffer = new byte[16384];
            FileOutputStream fos = new FileOutputStream(create(out));
            while ((read = in.read(buffer)) != -1) fos.write(buffer, 0, read);
            fos.close();
            in.close();
        } catch (IOException ignored) {
        }
    }

    public static void sort(File[] files) {
        Arrays.sort(files, (o1, o2) -> {
            if (o1.isDirectory() && o2.isFile()) return -1;
            if (o1.isFile() && o2.isDirectory()) return 1;
            return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
        });
    }

    public static List<File> list(@Nullable File dir) {
        if (dir == null) return new ArrayList<>();
        File[] files = dir.listFiles();
        if (files != null) sort(files);
        return files == null ? new ArrayList<>() : Arrays.asList(files);
    }

    public static void clear(File dir) {
        if (dir == null) return;
        if (dir.isDirectory()) for (File file : list(dir)) clear(file);
        if (dir.delete()) SpiderDebug.log("Deleted:" + dir.getAbsolutePath());
    }

    public static File create(File file) {
        try {
            if (file.getParentFile() != null) mkdir(file.getParentFile());
            if (!file.canWrite()) file.setWritable(true);
            if (!file.exists()) file.createNewFile();
            Shell.exec("chmod 777 " + file);
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return file;
        }
    }
}
