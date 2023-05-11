package com.github.catvod.bean.ali;

import com.github.catvod.utils.Utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter implements Comparator<Item> {

    public static void sort(List<Item> items) {
        Collections.sort(items, new Sorter());
    }

    @Override
    public int compare(Item o1, Item o2) {
        try {
            return Integer.compare(getDigit(o1.getDisplayName()), getDigit(o2.getDisplayName()));
        } catch (NumberFormatException e) {
            return o1.getDisplayName().compareToIgnoreCase(o2.getDisplayName());
        }
    }

    private int getDigit(String text) throws NumberFormatException {
        return Integer.parseInt(Utils.removeExt(text).replace("1080P", "").replace("4K", "").replaceAll("\\D+", ""));
    }
}
