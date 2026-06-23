package com.github.catvod.bean.yun139;

import com.github.catvod.utils.PanStringUtils;

import java.util.Comparator;

/**
 * Yun139 file name comparator (replaces com.github.catvod.spider.merge.Z.f)
 */
public class Yun139Comparator implements Comparator<Yun139File> {
    @Override
    public int compare(Yun139File a, Yun139File b) {
        String nameA = PanStringUtils.cleanFilename(a.getCoName());
        String nameB = PanStringUtils.cleanFilename(b.getCoName());
        int epA = parseEpisode(nameA);
        int epB = parseEpisode(nameB);
        if (epA != epB) return Integer.compare(epA, epB);
        return nameA.compareToIgnoreCase(nameB);
    }

    private static int parseEpisode(String name) {
        try {
            String num = PanStringUtils.extractEpisodeNumber(name);
            return num.isEmpty() ? 0 : Integer.parseInt(num);
        } catch (Exception e) {
            return 0;
        }
    }
}
