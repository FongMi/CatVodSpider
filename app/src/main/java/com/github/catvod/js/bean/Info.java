package com.github.catvod.js.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Info {

    public int index;
    public String rule;
    public List<String> excludes;

    public Info(String rule) {
        this.rule = rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public void setInfo(String pos) {
        if (rule.contains("--")) {
            String[] rules = rule.split("--");
            setExcludes(rules);
            setRule(rules[0]);
        } else if (pos.contains("--")) {
            String[] rules = pos.split("--");
            setExcludes(rules);
            pos = rules[0];
        }
        try {
            index = Integer.parseInt(pos.replace("eq(", "").replace(")", ""));
        } catch (Exception ignored) {
            index = 0;
        }
    }

    public void setExcludes(String[] rules) {
        excludes = new ArrayList<>(Arrays.asList(rules));
        excludes.remove(0);
    }
}
