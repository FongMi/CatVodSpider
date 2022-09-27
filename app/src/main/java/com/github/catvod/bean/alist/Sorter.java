package com.github.catvod.bean.alist;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter implements Comparator<Item> {

    private final String type;

    public static void sort(String type, List<Item> items) {
        Collections.sort(items, new Sorter(type));
    }

    public Sorter(String type) {
        this.type = type;
    }

    @Override
    public int compare(Item o1, Item o2) {
        switch (type) {
            case "name":
                return o1.getName().compareTo(o2.getName());
            case "size":
                return Long.compare(o1.getSize(), o2.getSize());
            case "date":
                return o1.getDate().compareTo(o2.getDate());
            default:
                return -1;
        }
    }
}
