package com.github.catvod.spider.merge.d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class C0954f implements Parcelable {
    public static final Parcelable.Creator<C0954f> CREATOR = new C0952d();
    InterfaceC0951c b;

    C0954f(Parcel parcel) {
        InterfaceC0951c c0949a;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = AbstractBinderC0950b.a;
        if (strongBinder == null) {
            c0949a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c0949a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0951c)) ? new C0949a(strongBinder) : (InterfaceC0951c) iInterfaceQueryLocalInterface;
        }
        this.b = c0949a;
    }

    protected void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.b == null) {
                this.b = new BinderC0953e(this);
            }
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
