package com.github.catvod.utils;

public class Image {

    public static final String FOLDER = "https://x.imgs.ovh/x/2023/09/05/64f680bb030b4.png";
    public static final String VIDEO = "https://x.imgs.ovh/x/2023/09/05/64f67fe2e7720.png";

    public static String getIcon(boolean folder) {
        return folder ? FOLDER : VIDEO;
    }
}
