package com.github.catvod.spider.merge.FM.o;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import com.github.catvod.spider.merge.FM.a.C0298a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.o.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0388d extends ContentProvider {
    private static final String a = "android.support.FILE_PROVIDER_PATHS";
    private static final String b = "cache-path";
    private static final String c = "external-path";
    private static final String d = "name";
    private static final String e = "path";
    private static final HashMap<String, InterfaceC0386b> f;

    static {
        C0298a.b(new byte[]{-117, -87, -113, -70, 18, 55, 104, 66, -114, -83, -103}, new byte[]{-17, -64, -4, -54, 126, 86, 17, 12});
        C0298a.b(new byte[]{-68, 108, 63, 15, -49, -87, -105, 104, -68, 102, 55, 17, -38}, new byte[]{-29, 8, 86, 124, -65, -59, -10, 17});
        C0298a.b(new byte[]{-37, 27, 115, 40, 119}, new byte[]{-124, 104, 26, 82, 18, 32, 32, 54});
        f = new HashMap<>();
    }

    public static Uri a(Context context, String str, File file) {
        InterfaceC0386b interfaceC0386bB;
        HashMap<String, InterfaceC0386b> map = f;
        synchronized (map) {
            interfaceC0386bB = map.get(str);
            if (interfaceC0386bB == null) {
                try {
                    interfaceC0386bB = b(context, str);
                    map.put(str, interfaceC0386bB);
                } catch (com.github.catvod.spider.merge.FM.e0.a e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return interfaceC0386bB.a(file);
    }

    private static InterfaceC0386b b(Context context, String str) throws XmlPullParserException, IOException {
        C0387c c0387c = new C0387c(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.FM.b.r.b(new byte[]{70, -103, 105, -67, -28, -99, 71, -2, 37, -112, 117, -65, -28, -45, 13, -17, 113, -105, 49, -75, -31, -121, 1, -86, 99, -103, 110, -15, -16, -127, 15, -4, 108, -110, 121, -93, -96, -124, 9, -2, 109, -42, 125, -92, -12, -101, 15, -8, 108, -126, 101, -15}, new byte[]{5, -10, 28, -47, -128, -13, 96, -118}, new StringBuilder(), str));
        }
        Bundle bundle = providerInfoResolveContentProvider.metaData;
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), a);
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c0387c;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, d);
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, e);
                if (b.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (c.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                }
                if (externalStorageDirectory != null) {
                    String[] strArr = {attributeValue2};
                    for (int i = 0; i < 1; i++) {
                        String str2 = strArr[i];
                        if (str2 != null) {
                            externalStorageDirectory = new File(externalStorageDirectory, str2);
                        }
                    }
                    c0387c.b(attributeValue, externalStorageDirectory);
                }
            }
        }
    }
}
