package com.github.catvod.utils;

public class Image {

    public static final String FOLDER = "https://s1.ax1x.com/2023/05/04/p9tgI81.png";
    public static final String VIDEO = "https://s1.ax1x.com/2023/05/04/p9tgogx.png";

    public static String getIcon(boolean folder) {
        return folder ? FOLDER : VIDEO;
    }
}
