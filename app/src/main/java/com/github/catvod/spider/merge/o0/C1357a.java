package com.github.catvod.spider.merge.o0;

import com.github.catvod.spider.merge.p0.C1363a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.o0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1357a implements c {
    private static final String[] e = {"\\b[cs]\\s*&&\\s*[adf]\\.set\\([^,]+\\s*,\\s*encodeURIComponent\\s*\\(\\s*([a-zA-Z0-9$]+)\\(", "\\b[a-zA-Z0-9]+\\s*&&\\s*[a-zA-Z0-9]+\\.set\\([^,]+\\s*,\\s*encodeURIComponent\\s*\\(\\s*([a-zA-Z0-9$]+)\\(", "(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{2})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)", "([a-zA-Z0-9$]+)\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)", "([\"'])signature\\1\\s*,\\s*([a-zA-Z0-9$]+)\\(", "\\.sig\\|\\|([a-zA-Z0-9$]+)\\(", "yt\\.akamaized\\.net/\\)\\s*\\|\\|\\s*.*?\\s*[cs]\\s*&&\\s*[adf]\\.set\\([^,]+\\s*,\\s*(?:encodeURIComponent\\s*\\()?\\s*()$", "\\b[cs]\\s*&&\\s*[adf]\\.set\\([^,]+\\s*,\\s*([a-zA-Z0-9$]+)\\(", "\\b[a-zA-Z0-9]+\\s*&&\\s*[a-zA-Z0-9]+\\.set\\([^,]+\\s*,\\s*([a-zA-Z0-9$]+)\\(", "\\bc\\s*&&\\s*a\\.set\\([^,]+\\s*,\\s*\\([^)]*\\)\\s*\\(\\s*([a-zA-Z0-9$]+)\\(", "\\bc\\s*&&\\s*[a-zA-Z0-9]+\\.set\\([^,]+\\s*,\\s*\\([^)]*\\)\\s*\\(\\s*([a-zA-Z0-9$]+)\\("};
    private static final Pattern[] f = {Pattern.compile("\\w+\\.(\\w+)\\(\\w,(\\d+)\\)"), Pattern.compile("\\w+\\[(\\\"\\w+\\\")\\]\\(\\w,(\\d+)\\)")};
    private C1363a a;
    private List<Pattern> b = new ArrayList();
    private Map<Pattern, d> c = new HashMap();
    private Map<String, InterfaceC1358b> d = new HashMap();

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<java.util.regex.Pattern>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<java.util.regex.Pattern>] */
    public C1357a(C1363a c1363a) {
        this.a = c1363a;
        String[] strArr = e;
        for (int i = 0; i < 11; i++) {
            String str = strArr[i];
            this.b.add(this.b.size(), Pattern.compile(str));
        }
        a("\\{\\w\\.reverse\\(\\)\\}", new g());
        a("\\{\\w\\.splice\\(0,\\w\\)\\}", new h());
        a("\\{var\\s\\w=\\w\\[0];\\w\\[0]=\\w\\[\\w%\\w.length];\\w\\[\\w]=\\w\\}", new i());
        j jVar = new j();
        a("\\{var\\s\\w=\\w\\[0];\\w\\[0]=\\w\\[\\w%\\w.length];\\w\\[\\w%\\w.length]=\\w\\}", jVar);
        a("function\\(\\w+,\\w+\\)\\{var\\s\\w=\\w\\[0];\\w\\[0]=\\w\\[\\w%\\w.length];\\w\\[\\w%\\w.length]=\\w\\}", jVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.util.regex.Pattern, com.github.catvod.spider.merge.o0.d>] */
    public final void a(String str, d dVar) {
        this.c.put(Pattern.compile(str), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0161, code lost:
    
        r3.put(r10, r11.getValue());
        r6 = r6 + 1;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.o0.InterfaceC1358b b(java.lang.String r20) throws com.github.catvod.spider.merge.m0.f, com.github.catvod.spider.merge.m0.g {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.o0.C1357a.b(java.lang.String):com.github.catvod.spider.merge.o0.b");
    }
}
