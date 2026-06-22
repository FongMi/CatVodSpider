package com.github.catvod.spider.merge.bk;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import com.github.catvod.spider.merge.af.o;
import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.bk.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0929c extends ContentProvider {
    private static final HashMap<String, InterfaceC0927a> a = new HashMap<>();

    public static Uri a(Context context, String str, File file) {
        InterfaceC0927a interfaceC0927aB;
        HashMap<String, InterfaceC0927a> map = a;
        synchronized (map) {
            interfaceC0927aB = map.get(str);
            if (interfaceC0927aB == null) {
                try {
                    try {
                        interfaceC0927aB = b(context, str);
                        map.put(str, interfaceC0927aB);
                    } catch (IOException e) {
                        throw new IllegalArgumentException(nIe.d("04073A2F2C2B62123C63392E30153663282126143C2A2D6131132333263D3648150A050A1D36010C1F060623011C190E162E0063242A36077E27283B23"), e);
                    }
                } catch (o e2) {
                    throw new IllegalArgumentException(nIe.d("04073A2F2C2B62123C63392E30153663282126143C2A2D6131132333263D3648150A050A1D36010C1F060623011C190E162E0063242A36077E27283B23"), e2);
                }
            }
        }
        return interfaceC0927aB.a(file);
    }

    private static InterfaceC0927a b(Context context, String str) throws XmlPullParserException, IOException {
        C0928b c0928b = new C0928b(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.ai.c.a(nIe.d("0109262F2D2165127325202126463E263D2E6F023237286F24092163393D2D103A272C3D62113A37216F2313272B263D2B122A63"), str));
        }
        Bundle bundle = providerInfoResolveContentProvider.metaData;
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), nIe.d("23083731262626482036393F2D14276D0F060E230C131B00142F17061B101227070B1A"));
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException(nIe.d("0F0F203020212546322D2D3D2D0F376D3A3A32163C313D61042F1F06161F1029050A0D0A103903021D0711463E263D2E6F02323728"));
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c0928b;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, nIe.d("2C073E26"));
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, nIe.d("3207272B"));
                if (nIe.d("2107302B2C623207272B").equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (nIe.d("271E27263B21230A7E33283B2A").equals(name)) {
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
                    c0928b.b(attributeValue, externalStorageDirectory);
                }
            }
        }
    }
}
