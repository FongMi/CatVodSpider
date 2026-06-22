package com.github.catvod.spider.merge.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0952d implements Parcelable.Creator<C0954f> {
    C0952d() {
    }

    @Override // android.os.Parcelable.Creator
    public final C0954f createFromParcel(Parcel parcel) {
        return new C0954f(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final C0954f[] newArray(int i) {
        return new C0954f[i];
    }
}
