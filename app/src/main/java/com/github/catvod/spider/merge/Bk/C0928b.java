package com.github.catvod.spider.merge.bk;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bk.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0928b implements InterfaceC0927a {
    private final String a;
    private final HashMap<String, File> b = new HashMap<>();

    C0928b(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.bk.InterfaceC0927a
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
                throw new IllegalArgumentException(com.github.catvod.spider.merge.ai.c.a(nIe.d("04073A2F2C2B62123C632F262C0273202621240F34363B2A2646212C263B62123B223D6F21093D3728262C1573"), canonicalPath));
            }
            String path2 = entry.getValue().getPath();
            String strD = nIe.d("6D");
            boolean zEndsWith = path2.endsWith(strD);
            int length = path2.length();
            if (!zEndsWith) {
                length++;
            }
            return new Uri.Builder().scheme(nIe.d("21093D372C2136")).authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), strD)).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException(nIe.d("04073A2F2C2B62123C633B2A31093F352C6F21073D2C272621073F63392E360E7325263D62") + file);
        }
    }

    final void b(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(nIe.d("0C073E26692237152763272036463126692A2F16273A"));
        }
        try {
            this.b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException(nIe.d("04073A2F2C2B62123C633B2A31093F352C6F21073D2C272621073F63392E360E7325263D62") + file, e);
        }
    }
}
