package com.github.catvod.bean.webdav;

import com.thegrizzlylabs.sardineandroid.DavResource;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter implements Comparator<DavResource> {

    private final String type;
    private final String order;

    public static void sort(String type, String order, List<DavResource> items) {
        Collections.sort(items, new Sorter(type, order));
    }

    public Sorter(String type, String order) {
        this.type = type;
        this.order = order;
    }

    @Override
    public int compare(DavResource o1, DavResource o2) {
        boolean asc = order.equals("asc");
        return switch (type) {
            case "name" -> asc ? o1.getName().compareTo(o2.getName()) : o2.getName().compareTo(o1.getName());
            case "size" -> asc ? Long.compare(o1.getContentLength(), o2.getContentLength()) : Long.compare(o2.getContentLength(), o1.getContentLength());
            case "date" -> asc ? o1.getModified().compareTo(o2.getModified()) : o2.getModified().compareTo(o1.getModified());
            default -> 0;
        };
    }
}
