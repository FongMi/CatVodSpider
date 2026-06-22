package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.b1.C0906c;
import com.github.catvod.spider.merge.c1.h;
import com.github.catvod.spider.merge.c1.i;
import com.github.catvod.spider.merge.c1.m;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g {
    protected DocumentBuilderFactory a;
    private boolean b = true;

    public g() {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        this.a = documentBuilderFactoryNewInstance;
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
    }

    public final void a(m mVar, Document document) {
        f fVar = new f(document);
        fVar.b = this.b;
        h hVarX = mVar.x();
        if (hVarX != null) {
            if (!C0906c.d(hVarX.B0())) {
                document.setDocumentURI(hVarX.B0());
            }
            fVar.e = hVarX.C0().j();
        }
        if (mVar instanceof h) {
            mVar = mVar.R();
        }
        l.i(fVar, mVar);
    }

    public final Document b(m mVar) {
        C0899d.h(mVar);
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = this.a.newDocumentBuilder();
            DOMImplementation dOMImplementation = documentBuilderNewDocumentBuilder.getDOMImplementation();
            Document documentNewDocument = documentBuilderNewDocumentBuilder.newDocument();
            h hVarX = mVar.x();
            i iVarZ0 = hVarX != null ? hVarX.z0() : null;
            if (iVarZ0 != null) {
                documentNewDocument.appendChild(dOMImplementation.createDocumentType(iVarZ0.L(), iVarZ0.M(), iVarZ0.O()));
            }
            documentNewDocument.setXmlStandalone(true);
            documentNewDocument.setUserData("jsoupContextSource", mVar instanceof h ? mVar.R() : mVar, null);
            if (hVarX != null) {
                mVar = hVarX;
            }
            a(mVar, documentNewDocument);
            return documentNewDocument;
        } catch (ParserConfigurationException e) {
            throw new IllegalStateException(e);
        }
    }

    public final g c() {
        this.b = false;
        this.a.setNamespaceAware(false);
        return this;
    }
}
