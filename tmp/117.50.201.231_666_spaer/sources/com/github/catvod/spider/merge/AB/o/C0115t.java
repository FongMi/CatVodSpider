package com.github.catvod.spider.merge.AB.o;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0115t extends ContentProvider {
    private static final String a = "android.support.FILE_PROVIDER_PATHS";
    private static final String b = "cache-path";
    private static final String c = "external-path";
    private static final String d = "name";
    private static final String e = "path";
    private static final HashMap<String, r> f = new HashMap<>();

    public static Uri a(Context context, String str, File file) {
        r rVarB;
        HashMap<String, r> map = f;
        synchronized (map) {
            rVarB = map.get(str);
            if (rVarB == null) {
                try {
                    rVarB = b(context, str);
                    map.put(str, rVarB);
                } catch (com.github.catvod.spider.merge.AB.e0.a e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return rVarB.a(file);
    }

    private static r b(Context context, String str) throws XmlPullParserException, IOException {
        C0114s c0114s = new C0114s(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.AB.b.u.b(new byte[]{28, -100, -55, -73, 68, -88, -67, -96, 127, -107, -43, -75, 68, -26, -9, -79, 43, -110, -111, -65, 65, -78, -5, -12, 57, -100, -50, -5, 80, -76, -11, -94, 54, -105, -39, -87, 0, -79, -13, -96, 55, -45, -35, -82, 84, -82, -11, -90, 54, -121, -59, -5}, new byte[]{95, -13, -68, -37, 32, -58, -102, -44}, new StringBuilder(), str));
        }
        Bundle bundle = providerInfoResolveContentProvider.metaData;
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), a);
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c0114s;
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
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    c0114s.b(attributeValue, externalStorageDirectory);
                }
            }
        }
    }
}
