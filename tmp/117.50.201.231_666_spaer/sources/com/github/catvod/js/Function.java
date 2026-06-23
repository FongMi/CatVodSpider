package com.github.catvod.js;

import com.github.catvod.spider.merge.A0.bl;
import com.github.catvod.spider.merge.A0.ed;
import com.github.catvod.spider.merge.A0.em;
import com.github.catvod.spider.merge.A0.ks;
import com.github.catvod.spider.merge.A0.oj;
import com.github.catvod.spider.merge.A0.ok;
import com.github.catvod.spider.merge.A0.rp;
import com.github.catvod.spider.merge.A0.ry;
import com.whl.quickjs.wrapper.JSArray;
import com.whl.quickjs.wrapper.JSMethod;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Function {
    private final QuickJSContext ctx;
    private final bl parser = new bl();

    public Function(QuickJSContext quickJSContext) {
        this.ctx = quickJSContext;
        setProperty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setProperty$0(Method method, Object[] objArr) {
        try {
            return method.invoke(this, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    private void setProperty() {
        for (Method method : getClass().getMethods()) {
            if (method.isAnnotationPresent(JSMethod.class)) {
                this.ctx.getGlobalObject().setProperty(method.getName(), new ok(this, method));
            }
        }
    }

    @JSMethod
    public String pd(String str, String str2, String str3) {
        return this.parser.g(str, str2, str3);
    }

    @JSMethod
    public JSArray pdfa(String str, String str2) {
        ArrayList arrayList;
        QuickJSContext quickJSContext = this.ctx;
        bl blVar = this.parser;
        ry ryVar = blVar.e;
        if (!str.equals(ryVar.b)) {
            ryVar.b = str;
            ryVar.d = oj.a(str);
        }
        em emVar = ryVar.d;
        int i = 0;
        String[] strArrSplit = blVar.h(str2, false).split(" ");
        rp rpVar = new rp();
        int length = strArrSplit.length;
        while (true) {
            if (i < length) {
                rpVar = bl.f(emVar, strArrSplit[i], rpVar);
                if (rpVar.isEmpty()) {
                    arrayList = new ArrayList();
                    break;
                }
                i++;
            } else {
                arrayList = new ArrayList();
                Iterator<E> it = rpVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ed) it.next()).an());
                }
            }
        }
        return ks.a(quickJSContext, arrayList);
    }

    @JSMethod
    public String pdfh(String str, String str2) {
        return this.parser.g(str, str2, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    @JSMethod
    public JSArray pdfl(String str, String str2, String str3, String str4, String str5) {
        ?? arrayList;
        QuickJSContext quickJSContext = this.ctx;
        bl blVar = this.parser;
        int i = 0;
        String[] strArrSplit = blVar.h(str2, false).split(" ");
        rp rpVar = new rp();
        int length = strArrSplit.length;
        while (true) {
            if (i < length) {
                String str6 = strArrSplit[i];
                ry ryVar = blVar.e;
                if (!str.equals(ryVar.b)) {
                    ryVar.b = str;
                    ryVar.d = oj.a(str);
                }
                rpVar = bl.f(ryVar.d, str6, rpVar);
                if (rpVar.isEmpty()) {
                    arrayList = Collections.emptyList();
                    break;
                }
                i++;
            } else {
                arrayList = new ArrayList();
                Iterator it = rpVar.iterator();
                while (it.hasNext()) {
                    String strAn = ((ed) it.next()).an();
                    arrayList.add(blVar.g(strAn, str3, "").trim() + '$' + blVar.g(strAn, str4, str5));
                }
            }
        }
        return ks.a(quickJSContext, arrayList);
    }
}
