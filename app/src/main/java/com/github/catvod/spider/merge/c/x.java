package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.y.C1415d;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class x implements X, w {
    public static x a = new x();

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        if (type == OptionalInt.class) {
            Integer numO = com.github.catvod.spider.merge.H.A.o(bVar.t(Integer.class, null));
            return numO == null ? (T) OptionalInt.empty() : (T) OptionalInt.of(numO.intValue());
        }
        if (type == OptionalLong.class) {
            Long lQ = com.github.catvod.spider.merge.H.A.q(bVar.t(Long.class, null));
            return lQ == null ? (T) OptionalLong.empty() : (T) OptionalLong.of(lQ.longValue());
        }
        if (type == OptionalDouble.class) {
            Double dM = com.github.catvod.spider.merge.H.A.m(bVar.t(Double.class, null));
            return dM == null ? (T) OptionalDouble.empty() : (T) OptionalDouble.of(dM.doubleValue());
        }
        Object objT = bVar.t(com.github.catvod.spider.merge.H.A.v0(type), null);
        return objT == null ? (T) Optional.empty() : (T) Optional.of(objT);
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        if (obj == null) {
            l.w();
            return;
        }
        if (obj instanceof Optional) {
            Optional optional = (Optional) obj;
            l.u(optional.isPresent() ? optional.get() : null);
            return;
        }
        if (obj instanceof OptionalDouble) {
            OptionalDouble optionalDouble = (OptionalDouble) obj;
            if (optionalDouble.isPresent()) {
                l.u(Double.valueOf(optionalDouble.getAsDouble()));
                return;
            } else {
                l.w();
                return;
            }
        }
        if (obj instanceof OptionalInt) {
            OptionalInt optionalInt = (OptionalInt) obj;
            if (optionalInt.isPresent()) {
                l.j.q(optionalInt.getAsInt());
                return;
            } else {
                l.w();
                return;
            }
        }
        if (!(obj instanceof OptionalLong)) {
            StringBuilder sbB = t0.b("not support optional : ");
            sbB.append(obj.getClass());
            throw new C1415d(sbB.toString());
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        if (optionalLong.isPresent()) {
            l.j.r(optionalLong.getAsLong());
        } else {
            l.w();
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 12;
    }
}
