package com.github.catvod.spider.merge.FM.o;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0387c implements InterfaceC0386b {
    private final String a;
    private final HashMap<String, File> b = new HashMap<>();

    C0387c(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.FM.o.InterfaceC0386b
    public final Uri a(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.b.entrySet()) {
                String path = entry2.getValue().getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(com.github.catvod.spider.merge.FM.b.r.b(new byte[]{-109, -80, 71, 51, -88, -41, -79, -84, -70, -15, 72, 54, -93, -41, -79, -69, -70, -65, 72, 54, -86, -58, -29, -67, -79, -15, 92, 48, -94, -57, -79, -84, -67, -80, 90, 127, -82, -36, -1, -84, -76, -72, 64, 44, -19}, new byte[]{-43, -47, 46, 95, -51, -77, -111, -40}, new StringBuilder(), canonicalPath));
            }
            String path2 = entry.getValue().getPath();
            boolean zEndsWith = path2.endsWith("/");
            int length = path2.length();
            if (!zEndsWith) {
                length++;
            }
            return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    final void b(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        try {
            this.b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }
}
