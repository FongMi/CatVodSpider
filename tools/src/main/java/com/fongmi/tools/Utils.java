package com.fongmi.tools;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Utils {

    public static String call(String url) throws IOException {
        return new OkHttpClient().newCall(new Request.Builder().url(url).build()).execute().body().string();
    }

    public static String getFile(Class<?> clz, String fileName) {
        try {
            StringBuilder sb = new StringBuilder();
            URI uri = clz.getClassLoader().getResource(fileName).toURI();
            Stream<String> stream = Files.lines(Paths.get(uri), StandardCharsets.UTF_8);
            stream.forEach(s -> sb.append(s).append("\n"));
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static String getFile(String fileName) {
        try {
            return Files.readString(Path.of(fileName));
        } catch (Exception e) {
            return "";
        }
    }
}
