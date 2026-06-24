package com.github.catvod.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * HTML document wrapper stub (original in deleted merge package).
 * Wraps Jsoup Document for CSS selector queries.
 */
public class g9 {

    private Document doc;

    public g9(String html) {
        this.doc = Jsoup.parse(html != null ? html : "");
    }

    public jk LD(String cssSelector) {
        Elements elements = doc.select(cssSelector);
        return new jk(elements);
    }

    public String OL() {
        return doc.title() != null ? doc.title() : "";
    }
}
