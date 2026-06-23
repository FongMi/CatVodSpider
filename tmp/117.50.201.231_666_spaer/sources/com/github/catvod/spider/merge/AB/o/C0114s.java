package com.github.catvod.spider.merge.AB.o;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0114s implements r {
    private final String a;
    private final HashMap<String, File> b = new HashMap<>();

    C0114s(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.AB.o.r
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
                throw new IllegalArgumentException(com.github.catvod.spider.merge.AB.b.u.b(new byte[]{-51, 74, -82, -45, -82, 48, 15, -14, -28, 11, -95, -42, -91, 48, 15, -27, -28, 69, -95, -42, -84, 33, 93, -29, -17, 11, -75, -48, -92, 32, 15, -14, -29, 74, -77, -97, -88, 59, 65, -14, -22, 66, -87, -52, -21}, new byte[]{-117, 43, -57, -65, -53, 84, 47, -122}, new StringBuilder(), canonicalPath));
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
