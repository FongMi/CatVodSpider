package com.github.catvod.spider.merge.FM.X;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class r implements com.github.catvod.spider.merge.FM.V.c {
    private Double b(String str) {
        if (com.github.catvod.spider.merge.FM.V.b.a.matcher(str).matches()) {
            return Double.valueOf(Double.parseDouble(str));
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.FM.V.c
    public final com.github.catvod.spider.merge.FM.V.f a(com.github.catvod.spider.merge.FM.V.e eVar, List<com.github.catvod.spider.merge.FM.V.f> list) {
        if (list.isEmpty()) {
            return new com.github.catvod.spider.merge.FM.V.f(0);
        }
        LinkedList linkedList = new LinkedList();
        for (com.github.catvod.spider.merge.FM.V.f fVar : list) {
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
                Iterator<com.github.catvod.spider.merge.FM.K.m> it = fVar.d().iterator();
                while (it.hasNext()) {
                    Double dB2 = b(it.next().j0());
                    if (dB2 == null) {
                        return null;
                    }
                    linkedList.add(dB2);
                }
            }
        }
        Double d = (Double) linkedList.stream().reduce(Double.valueOf(0.0d), new BinaryOperator() { // from class: com.github.catvod.spider.merge.FM.X.q
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Double.valueOf(((Double) obj2).doubleValue() + ((Double) obj).doubleValue());
            }
        });
        return d.compareTo(Double.valueOf(new BigDecimal(d.longValue()).doubleValue())) == 0 ? new com.github.catvod.spider.merge.FM.V.f(new Long(d.longValue())) : new com.github.catvod.spider.merge.FM.V.f(d);
    }

    @Override // com.github.catvod.spider.merge.FM.V.c
    public final String name() {
        return "sum";
    }
}
