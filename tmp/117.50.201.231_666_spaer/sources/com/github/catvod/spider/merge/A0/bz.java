package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class bz extends kv {
    public final /* synthetic */ int a;

    public /* synthetic */ bz(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        switch (this.a) {
            case 0:
                if (rdVar.ak() != 9) {
                    return Double.valueOf(rdVar.ab());
                }
                rdVar.ag();
                return null;
            case 1:
                if (rdVar.ak() != 9) {
                    return Float.valueOf((float) rdVar.ab());
                }
                rdVar.ag();
                return null;
            default:
                rdVar.ar();
                return null;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    oa.x(dDoubleValue);
                    aagVar.ab(dDoubleValue);
                } else {
                    aagVar.w();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    oa.x(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    aagVar.ad(numberValueOf);
                } else {
                    aagVar.w();
                }
                break;
            default:
                aagVar.w();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
