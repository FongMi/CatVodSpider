package com.fongmi.tools;

import com.fongmi.tools.bean.Channel;
import com.fongmi.tools.bean.Data;
import com.fongmi.tools.bean.Group;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Live {

    private final List<Group> groups;
    private final List<Data> data;
    private final Gson gson;

    public static void main(String[] args) throws IOException {
        new Live().start("http://home.jundie.top:81/Cat/tv/live.txt");
    }

    public Live() {
        groups = new ArrayList<>();
        data = Data.arrayFrom(Utils.getFile(getClass(), "data.json"));
        gson = new Gson().newBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    }

    private void start(String text) throws IOException {
        //parseTxt(Util.getFile(getClass(), "test.txt"));
        parse(Utils.call(text));
        writeFile();
    }

    private void parse(String text) {
        for (String line : text.split("\n")) {
            String[] split = line.split(",");
            if (split.length < 2) continue;
            if (line.contains("#genre#")) groups.add(Group.create(split[0]));
            if (split[1].contains("://")) {
                Group group = groups.get(groups.size() - 1);
                String name = split[0];
                String url = split[1].trim();
                group.find(Channel.create().name(name).epg(name)).addUrls(url.split("#"));
            }
        }
        int number = 0;
        for (Group group : groups) {
            for (Channel channel : group.getChannel()) {
                channel.number(String.format(Locale.getDefault(), "%03d", ++number));
                channel.logo("https://raw.githubusercontent.com/FongMi/TV/release/app/src/main/res/drawable-xxhdpi/ic_img_empty.png");
                combine(channel);
            }
        }
    }

    private void parseTxt(String text) {
        for (String line : text.split("\n")) {
            String[] split = line.split(",");
            if (split.length < 2) continue;
            if (line.contains("#genre#")) groups.add(Group.create(split[0]));
            if (!line.contains("://")) continue;
            Group group = groups.get(groups.size() - 1);
            String number = split[0];
            String epg = split[1];
            String logo = split[2];
            String name = split[3];
            String url = split[4];
            group.find(Channel.create().number(number).epg(epg).logo(logo).name(name).ua(getUa(url))).addUrls(url.split("#"));
        }
    }

    private void combine(Channel channel) {
        for (Data item : data) {
            if (item.getName().contains(channel.getName())) {
                channel.logo(item.getLogo());
                channel.epg(item.getEpg());
                break;
            }
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
            writer.println(gson.toJson(groups));
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
