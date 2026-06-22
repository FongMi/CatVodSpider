package com.github.catvod.spider.merge.d0;

import com.github.catvod.en.NetPan;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0967m implements ToIntFunction {
    public final /* synthetic */ List a;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        List list = this.a;
        Pattern pattern = NetPan.a;
        return list.indexOf(NetPan.extractNetName(((com.github.catvod.spider.merge.K.VodItem) obj).c()));
    }
}
