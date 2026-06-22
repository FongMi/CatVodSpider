package com.github.catvod.spider.merge.p;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0134u;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0210c implements InterfaceC0209b {
    private final String a;
    private final HashMap<String, File> b = new HashMap<>();

    C0210c(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.p.InterfaceC0209b
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
                throw new IllegalArgumentException(C0134u.b(new byte[]{32, 65, 80, 1, -56, 63, 116, 42, 9, 0, 95, 4, -61, 63, 116, 61, 9, 78, 95, 4, -54, 46, 38, 59, 2, 0, 75, 2, -62, 47, 116, 42, 14, 65, 77, 77, -50, 52, 58, 42, 7, 73, 87, 30, -115}, new byte[]{102, 32, 57, 109, -83, 91, 84, 94}, new StringBuilder(), canonicalPath));
            }
            String path2 = entry.getValue().getPath();
            boolean zEndsWith = path2.endsWith(C0098a.a(new byte[]{-85}, new byte[]{-124, -46, 2, 62, -86, -109, 72, 7}));
            int length = path2.length();
            if (!zEndsWith) {
                length++;
            }
            return new Uri.Builder().scheme(C0098a.a(new byte[]{-25, -127, 39, 70, -74, 119, -75}, new byte[]{-124, -18, 73, 50, -45, 25, -63, -114})).authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), C0098a.a(new byte[]{-80}, new byte[]{-97, -74, -75, -115, 87, 125, 48, 107}))).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException(C0098a.a(new byte[]{-8, -37, 80, 73, 37, 4, 46, 110, -47, -102, 75, 64, 51, 15, 98, 108, -37, -102, 90, 68, 46, 15, 96, 115, -35, -37, 85, 5, 48, 1, 122, 114, -98, -36, 86, 87, 96}, new byte[]{-66, -70, 57, 37, 64, 96, 14, 26}) + file);
        }
    }

    final void b(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(C0098a.a(new byte[]{-35, -17, 88, 111, -40, -84, -59, -12, -25, -82, 91, 101, -116, -31, -46, -30, -77, -21, 88, 122, -116, -72}, new byte[]{-109, -114, 53, 10, -8, -63, -80, -121}));
        }
        try {
            this.b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException(C0098a.a(new byte[]{50, 102, 122, 34, -36, -95, 112, 100, 27, 39, 97, 43, -54, -86, 60, 102, 17, 39, 112, 47, -41, -86, 62, 121, 23, 102, 127, 110, -55, -92, 36, 120, 84, 97, 124, 60, -103}, new byte[]{116, 7, 19, 78, -71, -59, 80, 16}) + file, e);
        }
    }
}
