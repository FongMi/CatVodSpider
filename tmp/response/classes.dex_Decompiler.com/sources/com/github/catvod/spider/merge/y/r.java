package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.oZP;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class r implements com.github.catvod.spider.merge.W.c {
    private Double b(String str) {
        if (com.github.catvod.spider.merge.W.b.a.matcher(str).matches()) {
            return Double.valueOf(Double.parseDouble(str));
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.W.c
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar, List<com.github.catvod.spider.merge.W.f> list) {
        if (list.isEmpty()) {
            return new com.github.catvod.spider.merge.W.f(0);
        }
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.W.f fVar : list) {
            if (fVar.q()) {
                linkedList.add(fVar.c());
            }
            if (fVar.r()) {
                Double dB = b(fVar.g());
                if (dB == null) {
                    return null;
                }
                linkedList.add(dB);
            }
            if (fVar.n()) {
                Iterator<com.github.catvod.spider.merge.L.m> it = fVar.d().iterator();
                while (it.hasNext()) {
                    Double dB2 = b(it.next().j0());
                    if (dB2 == null) {
                        return null;
                    }
                    linkedList.add(dB2);
                }
            }
        }
        Double d = (Double) linkedList.stream().reduce(Double.valueOf(0.0d), new BinaryOperator() { // from class: com.github.catvod.spider.merge.Y.q
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Double.valueOf(((Double) obj2).doubleValue() + ((Double) obj).doubleValue());
            }
        });
        return d.compareTo(Double.valueOf(new BigDecimal(d.longValue()).doubleValue())) == 0 ? new com.github.catvod.spider.merge.W.f(new Long(d.longValue())) : new com.github.catvod.spider.merge.W.f(d);
    }

    @Override // com.github.catvod.spider.merge.W.c
    public final String name() {
        return oZP.d("061A1A");
    }
}
