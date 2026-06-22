package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.c1.m;
import com.github.catvod.spider.merge.c1.s;
import com.github.catvod.spider.merge.e1.O;
import java.util.HashMap;
import java.util.Stack;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f implements O {
    private final Document a;
    private boolean b = true;
    private final Stack<HashMap<String, String>> c;
    private Node d;
    private int e;
    private final m f;

    public f(Document document) {
        Stack<HashMap<String, String>> stack = new Stack<>();
        this.c = stack;
        this.e = 2;
        this.a = document;
        stack.push(new HashMap<>());
        this.d = document;
        this.f = (m) document.getUserData("jsoupContextSource");
    }

    private void e(Node node, s sVar) {
        node.setUserData("jsoupSource", sVar, null);
        this.d.appendChild(node);
    }

    @Override // com.github.catvod.spider.merge.e1.O
    public final void a(s sVar, int i) {
        if ((sVar instanceof m) && (this.d.getParentNode() instanceof Element)) {
            this.d = this.d.getParentNode();
        }
        this.c.pop();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: DOMException -> 0x00d8, TryCatch #0 {DOMException -> 0x00d8, blocks: (B:24:0x008a, B:26:0x0092, B:28:0x009f, B:29:0x00a7, B:31:0x00ad, B:33:0x00bf, B:34:0x00c7, B:36:0x00ce, B:37:0x00d5, B:27:0x0099), top: B:52:0x008a }] */
    @Override // com.github.catvod.spider.merge.e1.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.github.catvod.spider.merge.c1.s r7, int r8) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.a1.f.b(com.github.catvod.spider.merge.c1.s, int):void");
    }
}
