package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class qi implements xl, yw, Serializable {
    private final xl completion;

    public qi(xl xlVar) {
        this.completion = xlVar;
    }

    public xl create(xl xlVar) {
        ko.f("completion", xlVar);
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public xl create(Object obj, xl xlVar) {
        ko.f("completion", xlVar);
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public yw getCallerFrame() {
        xl xlVar = this.completion;
        if (xlVar instanceof yw) {
            return (yw) xlVar;
        }
        return null;
    }

    public final xl getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        acb acbVar = (acb) getClass().getAnnotation(acb.class);
        String str = null;
        if (acbVar == null) {
            return null;
        }
        int iV = acbVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? acbVar.l()[iIntValue] : -1;
        kn knVar = acs.j;
        kn knVar2 = acs.i;
        if (knVar == null) {
            try {
                kn knVar3 = new kn(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                acs.j = knVar3;
                knVar = knVar3;
            } catch (Exception unused2) {
                acs.j = knVar2;
                knVar = knVar2;
            }
        }
        if (knVar != knVar2) {
            Method method = knVar.a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = knVar.b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = knVar.c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = acbVar.c();
        } else {
            strC = str + '/' + acbVar.c();
        }
        return new StackTraceElement(strC, acbVar.m(), acbVar.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final void resumeWith(Object obj) {
        xl xlVar = this;
        while (true) {
            qi qiVar = (qi) xlVar;
            xl xlVar2 = qiVar.completion;
            ko.c(xlVar2);
            try {
                obj = qiVar.invokeSuspend(obj);
                if (obj == ys.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = act.b(th);
            }
            qiVar.releaseIntercepted();
            if (!(xlVar2 instanceof qi)) {
                xlVar2.resumeWith(obj);
                return;
            }
            xlVar = xlVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
