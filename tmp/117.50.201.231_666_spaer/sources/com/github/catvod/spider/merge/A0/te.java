package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class te extends zy implements ha {
    public static final te a = new te(2, 0);
    public static final te b = new te(2, 1);
    public static final te c = new te(2, 2);
    public static final te d = new te(2, 3);
    public static final te e = new te(2, 4);
    public static final te f = new te(2, 5);
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te(int i, int i2) {
        super(i);
        this.g = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.ha
    public final Object invoke(Object obj, Object obj2) {
        tf tfVar;
        switch (this.g) {
            case 0:
                String str = (String) obj;
                xo xoVar = (xo) obj2;
                ko.f("acc", str);
                ko.f("element", xoVar);
                if (str.length() != 0) {
                }
                break;
            case 1:
                yg ygVar = (yg) obj;
                xo xoVar2 = (xo) obj2;
                ko.f("acc", ygVar);
                ko.f("element", xoVar2);
                yg ygVarMinusKey = ygVar.minusKey(xoVar2.getKey());
                ek ekVar = ek.a;
                if (ygVarMinusKey != ekVar) {
                    jo joVar = jo.c;
                    xn xnVar = (xn) ygVarMinusKey.get(joVar);
                    if (xnVar == null) {
                        tfVar = new tf(ygVarMinusKey, xoVar2);
                    } else {
                        yg ygVarMinusKey2 = ygVarMinusKey.minusKey(joVar);
                        if (ygVarMinusKey2 != ekVar) {
                            tfVar = new tf(new tf(ygVarMinusKey2, xoVar2), xnVar);
                        }
                    }
                    break;
                }
                break;
            case 2:
                xo xoVar3 = (xo) obj2;
                if (xoVar3 instanceof gd) {
                    if (!(obj instanceof Integer)) {
                        obj = null;
                    }
                    Integer num = (Integer) obj;
                    int iIntValue = num != null ? num.intValue() : 1;
                    if (iIntValue != 0) {
                    }
                }
                break;
            case 3:
                gd gdVar = (gd) obj;
                xo xoVar4 = (xo) obj2;
                if (gdVar == null) {
                    if (!(xoVar4 instanceof gd)) {
                        xoVar4 = null;
                    }
                    break;
                }
                break;
            case 4:
                break;
            default:
                break;
        }
        return (bt) obj;
    }
}
