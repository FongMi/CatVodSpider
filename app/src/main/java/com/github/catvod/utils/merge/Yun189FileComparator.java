package com.github.catvod.utils.merge;

import java.util.Comparator;

/**
 * 天翼云盘文件排序器（按文件名中的数字排序）
 */
public final class Yun189FileComparator implements Comparator<Yun189File> {

    @Override
    public final int compare(Yun189File a, Yun189File b) {
        try {
            int numA = Integer.parseInt(m.x(m.v(a.mediaId())).replaceAll("\\D+", ""));
            int numB = Integer.parseInt(m.x(m.v(b.mediaId())).replaceAll("\\D+", ""));
            return Integer.compare(numA, numB);
        } catch (NumberFormatException e) {
            return a.displayName().compareToIgnoreCase(b.displayName());
        }
    }
}
