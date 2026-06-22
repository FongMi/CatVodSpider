package com.github.catvod.spider.merge.t;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.t.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1389b implements Parcelable {
    public static final AbstractC1389b c = new C1388a();
    private final Parcelable b;

    AbstractC1389b() {
        this.b = null;
    }

    protected AbstractC1389b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.b = parcelable == c ? null : parcelable;
    }

    public final Parcelable a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
