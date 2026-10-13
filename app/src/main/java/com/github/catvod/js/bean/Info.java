package com.github.catvod.js.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Info {

    public int index;
    public String rule;
    public List<String> excludes;

    private Info() {
    }

    public static Info create() {
        return new Info();
    }

    public Info rule(String rule) {
        this.rule = rule;
        return this;
    }

    public Info info(String pos) {
        if (rule.contains("--")) {
            String[] rules = rule.split("--");
            excludes(rules).rule(rules[0]);
        } else if (pos.contains("--")) {
            String[] rules = pos.split("--");
            excludes(rules);
            pos = rules[0];
        }
        try {
            index = Integer.parseInt(pos.replace("eq(", "").replace(")", ""));
        } catch (Exception ignored) {
            index = 0;
        }
        return this;
    }

    public Info excludes(String[] rules) {
        excludes = new ArrayList<>(Arrays.asList(rules));
        excludes.remove(0);
        return this;
    }
}
