package com.github.catvod.bean.quark;

import com.github.catvod.utils.PanStringUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Quark file list sorter (replaces com.github.catvod.spider.merge.S.d)
 */
public final class QuarkSorter {

    /** Sort file list by name (replaces S.d.a) */
    public static void a(List<QuarkFile> files) {
        if (files == null || files.size() <= 1) return;
        Collections.sort(files, new Comparator<QuarkFile>() {
            @Override
            public int compare(QuarkFile a, QuarkFile b) {
                String nameA = PanStringUtils.cleanFilename(a.getFileName());
                String nameB = PanStringUtils.cleanFilename(b.getFileName());
                int epA = parseEpisode(nameA);
                int epB = parseEpisode(nameB);
                if (epA != epB) return Integer.compare(epA, epB);
                return nameA.compareToIgnoreCase(nameB);
            }
        });
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
