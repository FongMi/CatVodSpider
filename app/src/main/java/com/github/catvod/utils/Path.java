package com.github.catvod.utils;

import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Path {

    private static final String TAG = Path.class.getSimpleName();

    private static File check(File file) {
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
        return check(new File(root() + File.separator + "TV"));
    }

    public static File tv(String name) {
        if (!name.startsWith(".")) name = "." + name;
        return new File(tv(), name);
    }

    public static String read(File file) {
        try {
            return read(new FileInputStream(file));
        } catch (Exception e) {
            return "";
        }
    }

    public static String read(String path) {
        try {
            return read(new FileInputStream(path));
        } catch (Exception e) {
            return "";
        }
    }

    public static String read(InputStream is) {
        try {
            byte[] data = new byte[is.available()];
            is.read(data);
            is.close();
            return new String(data, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static File write(File file, String data) {
        return write(file, data.getBytes());
    }

    public static File write(File file, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.flush();
            fos.close();
            chmod(file);
            return file;
        } catch (Exception ignored) {
            return file;
        }
    }

    public static void move(File in, File out) {
        copy(in, out);
        clear(in);
    }

    public static void copy(File in, File out) {
        try {
            copy(new FileInputStream(in), new FileOutputStream(out));
        } catch (Exception ignored) {
        }
    }

    public static void copy(InputStream in, File out) {
        try {
            copy(in, new FileOutputStream(out));
        } catch (Exception ignored) {
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buffer = new byte[8192];
        int amountRead;
        while ((amountRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, amountRead);
        }
    }

    public static List<File> list(File dir) {
        File[] files = dir.listFiles();
        return files == null ? Collections.emptyList() : Arrays.asList(files);
    }

    public static void clear(File dir) {
        if (dir == null) return;
        if (dir.isDirectory()) for (File file : list(dir)) clear(file);
        if (dir.delete()) Log.d(TAG, "Deleted:" + dir.getAbsolutePath());
    }

    public static File chmod(File file) {
        try {
            Process process = Runtime.getRuntime().exec("chmod 777 " + file);
            process.waitFor();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return file;
        }
    }
}
