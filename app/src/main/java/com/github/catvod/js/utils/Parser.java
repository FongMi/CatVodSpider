package com.github.catvod.js.utils;

import android.text.TextUtils;

import com.github.catvod.js.bean.Cache;
import com.github.catvod.js.bean.Info;
import com.github.catvod.utils.UriUtil;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private final Pattern URL = Pattern.compile("url\\((.*?)\\)", Pattern.MULTILINE | Pattern.DOTALL);
    private final Pattern NO_ADD = Pattern.compile(":eq|:lt|:gt|:first|:last|:not|:even|:odd|:has|:contains|:matches|:empty|^body$|^#");
    private final Pattern JOIN_URL = Pattern.compile("(url|src|href|-original|-src|-play|-url|style)$|^(data-|url-|src-)", Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
    private final Pattern SPEC_URL = Pattern.compile("^(ftp|magnet|thunder|ws):", Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);

    private final Cache cache;

    public Parser() {
        cache = new Cache();
    }

    private Info getParseInfo(String rule) {
        Info info = new Info(rule);
        if (rule.contains(":eq")) {
            info.setRule(rule.split(":")[0]);
            info.setInfo(rule.split(":")[1]);
        } else if (rule.contains("--")) {
            String[] rules = rule.split("--");
            info.setExcludes(rules);
            info.setRule(rules[0]);
        }
        return info;
    }

    private String parseHikerToJq(String parse, boolean first) {
        if (!parse.contains("&&")) {
            String[] split = parse.split(" ");
            Matcher m = NO_ADD.matcher(split[split.length - 1]);
            if (!m.find() && first) parse = parse + ":eq(0)";
            return parse;
        }
        String[] parses = parse.split("&&");
        List<String> items = new ArrayList<>();
        for (int i = 0; i < parses.length; i++) {
            String[] split = parses[i].split(" ");
            if (NO_ADD.matcher(split[split.length - 1]).find()) {
                items.add(parses[i]);
            } else {
                if (!first && i >= parses.length - 1) items.add(parses[i]);
                else items.add(parses[i] + ":eq(0)");
            }
        }
        return TextUtils.join(" ", items);
    }

    public String parseDomForUrl(String html, String rule, String addUrl) {
        Document doc = cache.getPdfh(html);
        if ("body&&Text".equals(rule) || "Text".equals(rule)) {
            return doc.text();
        } else if ("body&&Html".equals(rule) || "Html".equals(rule)) {
            return doc.html();
        }
        String option = "";
        if (rule.contains("&&")) {
            String[] rs = rule.split("&&");
            option = rs[rs.length - 1];
            List<String> excludes = new ArrayList<>(Arrays.asList(rs));
            excludes.remove(rs.length - 1);
            rule = TextUtils.join("&&", excludes);
        }
        rule = parseHikerToJq(rule, true);
        String[] parses = rule.split(" ");
        Elements elements = new Elements();
        for (String parse : parses) {
            elements = parseOneRule(doc, parse, elements);
            if (elements.isEmpty()) return "";
        }
        if (TextUtils.isEmpty(option)) return elements.outerHtml();
        if ("Text".equals(option)) {
            return elements.text();
        } else if ("Html".equals(option)) {
            return elements.html();
        } else {
            String result = "";
            for (String s : option.split("[||]")) {
                result = elements.attr(s);
                if (s.toLowerCase().contains("style") && result.contains("url(")) {
                    Matcher m = URL.matcher(result);
                    if (m.find()) result = m.group(1);
                    result = result.replaceAll("^['|\"](.*)['|\"]$", "$1");
                }
                if (!result.isEmpty() && !addUrl.isEmpty()) {
                    if (JOIN_URL.matcher(s).find() && !SPEC_URL.matcher(result).find()) {
                        if (result.contains("http")) {
                            result = result.substring(result.indexOf("http"));
                        } else {
                            result = UriUtil.resolve(addUrl, result);
                        }
                    }
                }
                if (!result.isEmpty()) {
                    return result;
                }
            }
            return result;
        }
    }

    public List<String> parseDomForArray(String html, String rule) {
        Document doc = cache.getPdfa(html);
        rule = parseHikerToJq(rule, false);
        String[] parses = rule.split(" ");
        Elements elements = new Elements();
        for (String parse : parses) {
            elements = parseOneRule(doc, parse, elements);
            if (elements.isEmpty()) return new ArrayList<>();
        }
        List<String> items = new ArrayList<>();
        for (Element element : elements) items.add(element.outerHtml());
        return items;
    }

    private Elements parseOneRule(Document doc, String parse, Elements elements) {
        Info info = getParseInfo(parse);
        if (elements.isEmpty()) {
            elements = doc.select(info.rule);
        } else {
            elements = elements.select(info.rule);
        }
        if (parse.contains(":eq")) {
            if (info.index < 0) {
                elements = elements.eq(elements.size() + info.index);
            } else {
                elements = elements.eq(info.index);
            }
        }
        if (info.excludes != null && !elements.isEmpty()) {
            elements = elements.clone();
            for (int i = 0; i < info.excludes.size(); i++) {
                elements.select(info.excludes.get(i)).remove();
            }
        }
        return elements;
    }

    public List<String> parseDomForList(String html, String rule, String texts, String urls, String urlKey) {
        String[] parses = parseHikerToJq(rule, false).split(" ");
        Elements elements = new Elements();
        for (String parse : parses) {
            elements = parseOneRule(cache.getPdfa(html), parse, elements);
            if (elements.isEmpty()) return Collections.emptyList();
        }
        List<String> items = new ArrayList<>();
        for (Element element : elements) {
            html = element.outerHtml();
            items.add(parseDomForUrl(html, texts, "").trim() + '$' + parseDomForUrl(html, urls, urlKey));
        }
        return items;
    }
}
