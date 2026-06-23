package com.github.catvod.utils.merge;

import java.util.Comparator;

/**
 * 115 网盘文件排序器（按文件名中的数字排序）
 */
public final class Yun115FileComparator implements Comparator<Yun115File> {

    @Override
    public final int compare(Yun115File a, Yun115File b) {
        try {
            int numA = Integer.parseInt(m.x(a.sortKey()).replaceAll("\\D+", ""));
            int numB = Integer.parseInt(m.x(b.sortKey()).replaceAll("\\D+", ""));
            return Integer.compare(numA, numB);
        } catch (NumberFormatException e) {
            return a.display().compareToIgnoreCase(b.display());
        }
    }
}
