package com.github.catvod.utils;

import org.jsoup.nodes.Element;

/**
 * Single HTML element wrapper stub (original in deleted merge package).
 * Wraps Jsoup Element.
 */
public class Iw {

    private final Element element;

    public Iw(Element element) {
        this.element = element;
    }

    public jk LD(String cssSelector) {
        return new jk(element.select(cssSelector));
    }

    public String l8(String attrName) {
        return element.attr(attrName);
    }

    public String OL() {
        return element.text();
    }
}
