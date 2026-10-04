package com.github.catvod.bean.alist;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter implements Comparator<Item> {

    private final String type;
    private final String order;

    public static void sort(String type, String order, List<Item> items) {
        Collections.sort(items, new Sorter(type, order));
    }

    public Sorter(String type, String order) {
        this.type = type;
        this.order = order;
    }

    @Override
    public int compare(Item o1, Item o2) {
        boolean asc = order.equals("asc");
        return switch (type) {
            case "name" -> asc ? o1.getName().compareTo(o2.getName()) : o2.getName().compareTo(o1.getName());
            case "size" -> asc ? Long.compare(o1.getSize(), o2.getSize()) : Long.compare(o2.getSize(), o1.getSize());
            case "date" -> asc ? o1.getDate().compareTo(o2.getDate()) : o2.getDate().compareTo(o1.getDate());
            default -> 0;
        };
    }
}
