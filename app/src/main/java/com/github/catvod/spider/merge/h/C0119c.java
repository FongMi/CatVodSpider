package com.github.catvod.spider.merge.h;

import com.github.catvod.spider.merge.b.C0094c;
import com.github.catvod.spider.merge.b.C0095d;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0119c {

    @SerializedName("label")
    private List<List<String>> a;

    @SerializedName("country")
    private List<String> b;

    @SerializedName("time")
    private List<Integer> c;

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0094c("全部", ""));
        List<List<String>> listEmptyList = this.a;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        Iterator<List<String>> it = listEmptyList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C0094c(it.next().get(0)));
        }
        arrayList.add(new C0095d("type", "類型", arrayList2));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C0094c("全部", ""));
        List<String> listEmptyList2 = this.b;
        if (listEmptyList2 == null) {
            listEmptyList2 = Collections.emptyList();
        }
        Iterator<String> it2 = listEmptyList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C0094c(it2.next()));
        }
        arrayList.add(new C0095d("area", "地區", arrayList3));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C0094c("全部", ""));
        List<Integer> listEmptyList3 = this.c;
        if (listEmptyList3 == null) {
            listEmptyList3 = Collections.emptyList();
        }
        Collections.sort(listEmptyList3, Collections.reverseOrder());
        List<Integer> listEmptyList4 = this.c;
        if (listEmptyList4 == null) {
            listEmptyList4 = Collections.emptyList();
        }
        for (Integer num : listEmptyList4) {
            if (num.intValue() >= 2010) {
                arrayList4.add(new C0094c(String.valueOf(num)));
            }
        }
        arrayList.add(new C0095d("year", "年份", arrayList4));
        return arrayList;
    }
}
