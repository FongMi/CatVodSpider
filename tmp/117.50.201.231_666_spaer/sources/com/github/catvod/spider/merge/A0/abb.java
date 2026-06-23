package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class abb implements fd {
    public final /* synthetic */ int a;
    public final Object d;
    public final Object e;

    public abb(sf sfVar, String str) {
        this.a = 2;
        sfVar.getClass();
        this.d = sfVar.al();
        this.e = str;
    }

    public abb(sf sfVar, String str, Object[] objArr) {
        this.a = 2;
        sfVar.getClass();
        this.d = sfVar.al();
        this.e = String.format(str, objArr);
    }

    public /* synthetic */ abb(Object obj, Object obj2, int i) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    public abb(Supplier supplier) {
        this.a = 3;
        this.e = supplier;
        this.d = ThreadLocal.withInitial(new se(4));
    }

    public static String f(abf abfVar) {
        int i = abfVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(abfVar.d ? ":" : "");
        sb.append("s");
        sb.append(i);
        sb.append(abfVar.g ? "^" : "");
        String string = sb.toString();
        if (!abfVar.d) {
            return string;
        }
        if (abfVar.h != null) {
            return string + "=>" + Arrays.toString(abfVar.h);
        }
        return string + "=>" + abfVar.e;
    }

    @Override // com.github.catvod.spider.merge.A0.fd
    public void b(fw fwVar, int i) {
        if (fwVar.s().equals("#text")) {
            return;
        }
        try {
            fwVar.v((StringBuilder) this.d, i, (ut) this.e);
        } catch (IOException e) {
            throw new tv(e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.fd
    public void c(fw fwVar, int i) {
        try {
            fwVar.u((StringBuilder) this.d, i, (ut) this.e);
        } catch (IOException e) {
            throw new tv(e);
        }
    }

    public Object g() {
        Stack stackH = h();
        return !stackH.isEmpty() ? stackH.pop() : ((Supplier) this.e).get();
    }

    public Stack h() {
        ThreadLocal threadLocal = (ThreadLocal) this.d;
        Stack stack = (Stack) ((SoftReference) threadLocal.get()).get();
        if (stack != null) {
            return stack;
        }
        Stack stack2 = new Stack();
        threadLocal.set(new SoftReference(stack2));
        return stack2;
    }

    public void i(Object obj) {
        Stack stackH = h();
        if (stackH.size() < 12) {
            stackH.push(obj);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((zn) this.d).b == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                ArrayList<abf> arrayList = new ArrayList(((zn) this.d).a.keySet());
                Collections.sort(arrayList, new zm(0));
                for (abf abfVar : arrayList) {
                    abf[] abfVarArr = abfVar.c;
                    int length = abfVarArr != null ? abfVarArr.length : 0;
                    for (int i = 0; i < length; i++) {
                        abf abfVar2 = abfVar.c[i];
                        if (abfVar2 != null && abfVar2.a != Integer.MAX_VALUE) {
                            sb.append(f(abfVar));
                            String strF = ((hn) this.e).f(i - 1);
                            sb.append("-");
                            sb.append(strF);
                            sb.append("->");
                            sb.append(f(abfVar2));
                            sb.append('\n');
                        }
                    }
                }
                String string = sb.toString();
                if (string.length() == 0) {
                    return null;
                }
                return string;
            case 1:
            default:
                return super.toString();
            case 2:
                return "<" + ((String) this.d) + ">: " + ((String) this.e);
        }
    }
}
