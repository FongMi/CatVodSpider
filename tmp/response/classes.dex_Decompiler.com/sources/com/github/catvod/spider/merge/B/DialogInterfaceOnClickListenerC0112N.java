package com.github.catvod.spider.merge.b;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.p.C0206C;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0112N implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0112N(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                U.e((U) this.b, (EditText) this.c);
                break;
            default:
                C0206C c0206c = (C0206C) this.b;
                Map map = (Map) this.c;
                c0206c.getClass();
                map.put(C0098a.a(new byte[]{125, 52, -7, -100, 8}, new byte[]{16, 91, -99, -7, 100, 77, -60, -100}), C0098a.a(new byte[]{86}, new byte[]{103, 117, 84, -70, 65, -111, 125, 41}));
                map.put(C0098a.a(new byte[]{59, -104, -60, -89}, new byte[]{93, -12, -91, -64, 80, -44, -71, -57}), C0098a.a(new byte[]{-80, 112, 124, -80, -33, -68, 5, 39, -16, 58, 117, -6, -122, -68, 67, 85, -48, 73, 35, -44, -25, -27, 87, 60, -80, 120, 67, -79, -5, -85, 4, 58, -13, 56, 107, -43, -122, -69, 105, 85, -50, 102, 47, -18, -18, -28, 89, 7, -65, 127, 74, -68, -35, -97, 5, 27, -45, 55, 117, -57, -121, -122, 71}, new byte[]{88, -33, -53, 84, 98, 3, -30, -77}));
                Init.execute(new S(c0206c, map, 1));
                break;
        }
    }
}
