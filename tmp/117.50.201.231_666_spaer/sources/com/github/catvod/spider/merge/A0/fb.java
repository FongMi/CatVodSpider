package com.github.catvod.spider.merge.A0;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rxhttp.wrapper.entity.UpFile;
import rxhttp.wrapper.param.IFile;
import rxhttp.wrapper.param.Param;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract /* synthetic */ class fb {
    public static Param a(IFile iFile, String str, File file) {
        return iFile.addFile(new UpFile(str, file));
    }

    public static Param b(IFile iFile, String str, File file) {
        return iFile.addFile(new UpFile(str, file));
    }

    public static Param c(IFile iFile, String str, File file, String str2) {
        return iFile.addFile(new UpFile(str, file, str2));
    }

    public static Param d(IFile iFile, String str, String str2) {
        return iFile.addFile(new UpFile(str, str2));
    }

    public static Param e(IFile iFile, String str, List list) {
        for (Object obj : list) {
            if (obj instanceof String) {
                iFile.addFile(new UpFile(str, obj.toString()));
            } else {
                if (!(obj instanceof File)) {
                    throw new IllegalArgumentException("Incoming data type exception, it must be String or File");
                }
                iFile.addFile(new UpFile(str, (File) obj));
            }
        }
        return (Param) iFile;
    }

    public static Param f(IFile iFile, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iFile.addFile((UpFile) it.next());
        }
        return (Param) iFile;
    }

    public static Param g(IFile iFile, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                iFile.addFile(new UpFile(str, value.toString()));
            } else {
                if (!(value instanceof File)) {
                    throw new IllegalArgumentException("Incoming data type exception, it must be String or File");
                }
                iFile.addFile(new UpFile(str, (File) value));
            }
        }
        return (Param) iFile;
    }
}
