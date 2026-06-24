package com.github.catvod.utils;

import org.jsoup.select.Elements;

/**
 * HTML elements collection wrapper stub (original in deleted merge package).
 * Wraps Jsoup Elements.
 */
public class jk {

    private final Elements elements;

    public jk(Elements elements) {
        this.elements = elements != null ? elements : new Elements();
    }

    public Iw get(int index) {
        return new Iw(elements.get(index));
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /** Returns text of the first element (convenience for single-match selectors). */
    public String OL() {
        if (elements == null || elements.isEmpty()) return "";
        return elements.first().text();
    }

    /** Returns attribute value of the first element. */
    public String l8(String attrName) {
        if (elements == null || elements.isEmpty()) return "";
        return elements.first().attr(attrName);
    }
}
