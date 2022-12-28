package com.fongmi.tools;

import com.fongmi.tools.bean.Channel;
import com.fongmi.tools.bean.Group;
import com.google.gson.Gson;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Run {

    private final List<Group> items = new ArrayList<>();
    private final Gson gson = new Gson().newBuilder().disableHtmlEscaping().setPrettyPrinting().create();

    public static void main(String[] args) {
        new Run().start();
    }

    private void start() {
        parse(Util.getFile(getClass(), "live.txt"));
        System.out.println(gson.toJson(items));
        writeFile();
    }

    private void parse(String text) {
        for (String line : text.split("\n")) {
            String[] split = line.split(",");
            if (split.length < 2) continue;
            if (line.contains("#genre#")) items.add(Group.create(split[0]));
            if (!line.contains("://")) continue;
            Group group = items.get(items.size() - 1);
            String number = split[0];
            String epg = split[1];
            String logo = split[2];
            String name = split[3];
            String url = split[4];
            group.find(Channel.create().number(number).epg(epg).logo(logo).name(name).ua(getUa(url))).addUrls(url.split("#"));
        }
    }

    private String getUa(String url) {
        if (url.contains("play-live.ifeng")) return "okhttp/3.15";
        return null;
    }

    private void writeFile() {
        try {
            File file = new File("json", "live.json");
            PrintWriter writer = new PrintWriter(file, String.valueOf(StandardCharsets.UTF_8));
            writer.println(gson.toJson(items));
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
