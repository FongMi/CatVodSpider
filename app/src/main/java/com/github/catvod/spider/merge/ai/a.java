package com.github.catvod.spider.merge.ai;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class a {
    public final /* synthetic */ int a;
    private final Constructor b;

    public a(Class cls, int i) throws NoSuchMethodException {
        this.a = i;
        if (i == 1) {
            Constructor constructor = cls.getConstructor(File.class, File.class, DexFile.class);
            this.b = constructor;
            constructor.setAccessible(true);
        } else if (i != 2) {
            Constructor constructor2 = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
            this.b = constructor2;
            constructor2.setAccessible(true);
        } else {
            Constructor constructor3 = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
            this.b = constructor3;
            constructor3.setAccessible(true);
        }
    }

    public final Object a(File file, DexFile dexFile) {
        switch (this.a) {
            case 0:
                return this.b.newInstance(file, new ZipFile(file), dexFile);
            case 1:
                return this.b.newInstance(file, file, dexFile);
            default:
                return this.b.newInstance(file, Boolean.FALSE, file, dexFile);
        }
    }
}
