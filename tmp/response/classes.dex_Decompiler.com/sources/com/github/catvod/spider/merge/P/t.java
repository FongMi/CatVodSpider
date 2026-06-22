package com.github.catvod.spider.merge.p;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0110L;
import com.github.catvod.spider.merge.b.RunnableC0124j;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class t implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                C0206C.b((C0206C) this.b, (Map) this.c);
                break;
            case 1:
                C0206C c0206c = (C0206C) this.b;
                Map map = (Map) this.c;
                c0206c.getClass();
                map.put(C0098a.a(new byte[]{119, 115, -19, 23, -4}, new byte[]{26, 28, -119, 114, -112, -38, -115, 81}), C0098a.a(new byte[]{-127}, new byte[]{-80, -119, -52, -94, -26, 87, 87, -51}));
                map.put(C0098a.a(new byte[]{61, -24, 85, 27}, new byte[]{91, -124, 52, 124, 98, -15, 97, -62}), C0098a.a(new byte[]{39, -84, -109, 97, -57, 18, -94, -128, 103, -26, -102, 43, -98, 18, -28, -14, 71, -107, -52, 5, -1, 75, -16, -101, 39, -92, -84, 96, -29, 5, -93, -99, 100, -28, -124, 4, -98, 21, -50, -14, 89, -70, -64, 63, -10, 74, -2, -96, 40, -93, -91, 109, -59, 49, -94, -68, 68, -21, -102, 22, -97, 40, -32}, new byte[]{-49, 3, 36, -123, 122, -83, 69, 20}));
                Init.execute(new RunnableC0124j(c0206c, map, 5));
                break;
            default:
                C0110L.e((C0110L) this.b, (EditText) this.c);
                break;
        }
    }
}
