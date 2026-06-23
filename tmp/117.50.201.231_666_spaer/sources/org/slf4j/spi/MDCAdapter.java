package org.slf4j.spi;

import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public interface MDCAdapter {
    void clear();

    String get(String str);

    Map<String, String> getCopyOfContextMap();

    void put(String str, String str2);

    void remove(String str);

    void setContextMap(Map<String, String> map);
}
