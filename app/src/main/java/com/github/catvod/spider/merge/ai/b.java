package com.github.catvod.spider.merge.ai;

import android.util.Log;
import com.github.catvod.spider.merge.nIe;
import dalvik.system.DexFile;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class b {
    private final a a;

    private b() throws ClassNotFoundException {
        a aVar;
        Class<?> cls = Class.forName(nIe.d("26073F3520246C152A303D2A2F481726311F23123B0F203C3642162F2C22270827"));
        try {
            try {
                aVar = new a(cls, 0);
            } catch (NoSuchMethodException unused) {
                aVar = new a(cls, 2);
            }
        } catch (NoSuchMethodException unused2) {
            aVar = new a(cls, 1);
        }
        this.a = aVar;
    }

    static void a(ClassLoader classLoader, List<? extends File> list) {
        Object obj = e.e(classLoader, nIe.d("3207272B05263112")).get(classLoader);
        b bVar = new b();
        int size = list.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            File file = list.get(i);
            objArr[i] = bVar.a.a(file, DexFile.loadDex(file.getPath(), new File(file.getParentFile(), file.getName().substring(0, r9.length() - 4) + nIe.d("6C02363B")).getPath(), 0));
        }
        try {
            e.b(obj, nIe.d("26032B06252A2F033D373A"), objArr);
        } catch (NoSuchFieldException e) {
            Log.w(nIe.d("0F133F37200B271E"), nIe.d("04073A2F2C2B62003A2D2D6F240F362F2D6F6502363B0C23270B362D3D3C654632373D2A2F16272A2728624123223D27070A362E2C21361574"), e);
            e.b(obj, nIe.d("3207272B0C23270B362D3D3C"), objArr);
        }
    }
}
