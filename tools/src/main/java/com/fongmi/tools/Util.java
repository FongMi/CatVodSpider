package com.fongmi.tools;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Util {

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
}
