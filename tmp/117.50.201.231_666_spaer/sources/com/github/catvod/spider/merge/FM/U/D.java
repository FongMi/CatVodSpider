package com.github.catvod.spider.merge.FM.U;

import com.github.catvod.spider.merge.FM.x.C0423A;
import com.github.catvod.spider.merge.FM.x.C0432J;
import com.github.catvod.spider.merge.FM.x.InterfaceC0430H;
import com.github.catvod.spider.merge.FM.y.C0459a;
import com.github.catvod.spider.merge.FM.y.C0469k;
import com.github.catvod.spider.merge.FM.y.S;
import com.github.catvod.spider.merge.FM.y.Y;
import com.github.catvod.spider.merge.FM.z.C0485b;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class D extends com.github.catvod.spider.merge.FM.x.x {
    protected static final C0485b[] l;
    protected static final Y m = new Y();
    public static final String[] n = {"main", "locationPath", "absoluteLocationPathNoroot", "relativeLocationPath", "step", "axisSpecifier", "nodeTest", "predicate", "abbreviatedStep", "expr", "primaryExpr", "functionCall", "unionExprNoRoot", "pathExprNoRoot", "filterExpr", "orExpr", "andExpr", "equalityExpr", "relationalExpr", "additiveExpr", "multiplicativeExpr", "unaryExprNoRoot", "qName", "functionName", "variableReference", "nameTest", "nCName"};
    public static final C0432J o = new C0432J(new String[]{null, "'processing-instruction'", "'or'", "'and'", "'$'", null, null, null, "'/'", "'//'", "'('", "')'", "'['", "']'", "'-'", "'+'", "'.'", "'*'", "'`div`'", "'`mod`'", "'..'", "'@'", "','", "'|'", "'<'", "'>'", "'<='", "'>='", "'='", "'!='", "'^='", "'$='", "'*='", "'~='", "'!~'", "':'", "'::'", "'''", "'\"'"}, new String[]{null, null, null, null, null, "NodeType", "Number", "AxisName", "PATHSEP", "ABRPATH", "LPAR", "RPAR", "LBRAC", "RBRAC", "MINUS", "PLUS", "DOT", "MUL", "DIVISION", "MODULO", "DOTDOT", "AT", "COMMA", "PIPE", "LESS", "MORE_", "LE", "GE", "EQUALITY", "INEQUALITY", "START_WITH", "END_WITH", "CONTAIN_WITH", "REGEXP_WITH", "REGEXP_NOT_WITH", "COLON", "CC", "APOS", "QUOT", "Literal", "Whitespace", "NCName"}, null);

    @Deprecated
    public static final String[] p = new String[42];
    public static final C0459a q;

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = p;
            if (i2 >= strArr.length) {
                break;
            }
            C0432J c0432j = o;
            strArr[i2] = c0432j.b(i2);
            if (strArr[i2] == null) {
                strArr[i2] = c0432j.c(i2);
            }
            if (strArr[i2] == null) {
                strArr[i2] = "<INVALID>";
            }
            i2++;
        }
        C0459a c0459aB = new C0469k().b("\u0003悋Ꜫ脳맭䅼㯧瞆奤\u0003+å\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003=\n\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005E\n\u0005\f\u0005\u000e\u0005H\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0007\u0006M\n\u0006\f\u0006\u000e\u0006P\u000b\u0006\u0003\u0006\u0005\u0006S\n\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007X\n\u0007\u0005\u0007Z\n\u0007\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bd\n\b\u0003\t\u0003\t\u0003\t\u0003\t\u0003\n\u0003\n\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0005\fv\n\f\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0007\r}\n\r\f\r\u000e\r\u0080\u000b\r\u0005\r\u0082\n\r\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u0089\n\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u008e\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u0094\n\u000f\u0005\u000f\u0096\n\u000f\u0003\u0010\u0003\u0010\u0007\u0010\u009a\n\u0010\f\u0010\u000e\u0010\u009d\u000b\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011¢\n\u0011\f\u0011\u000e\u0011¥\u000b\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012ª\n\u0012\f\u0012\u000e\u0012\u00ad\u000b\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013²\n\u0013\f\u0013\u000e\u0013µ\u000b\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014º\n\u0014\f\u0014\u000e\u0014½\u000b\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015Â\n\u0015\f\u0015\u000e\u0015Å\u000b\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016Ê\n\u0016\u0003\u0017\u0005\u0017Í\n\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018Ô\n\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001bá\n\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0002\u0002\u001d\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0002\t\u0003\u0002\n\u000b\u0004\u0002\u0012\u0012\u0016\u0016\u0003\u0002\u001e\u001f\u0005\u0002\u001a\u001b\u001d\u001d $\u0003\u0002\u0010\u0011\u0003\u0002\u0013\u0015\u0004\u0002\t\t++\u0002æ\u00028\u0003\u0002\u0002\u0002\u0004<\u0003\u0002\u0002\u0002\u0006>\u0003\u0002\u0002\u0002\bA\u0003\u0002\u0002\u0002\nR\u0003\u0002\u0002\u0002\fY\u0003\u0002\u0002\u0002\u000ec\u0003\u0002\u0002\u0002\u0010e\u0003\u0002\u0002\u0002\u0012i\u0003\u0002\u0002\u0002\u0014k\u0003\u0002\u0002\u0002\u0016u\u0003\u0002\u0002\u0002\u0018w\u0003\u0002\u0002\u0002\u001a\u008d\u0003\u0002\u0002\u0002\u001c\u0095\u0003\u0002\u0002\u0002\u001e\u0097\u0003\u0002\u0002\u0002 \u009e\u0003\u0002\u0002\u0002\"¦\u0003\u0002\u0002\u0002$®\u0003\u0002\u0002\u0002&¶\u0003\u0002\u0002\u0002(¾\u0003\u0002\u0002\u0002*Æ\u0003\u0002\u0002\u0002,Ì\u0003\u0002\u0002\u0002.Ð\u0003\u0002\u0002\u00020Õ\u0003\u0002\u0002\u00022×\u0003\u0002\u0002\u00024à\u0003\u0002\u0002\u00026â\u0003\u0002\u0002\u000289\u0005\u0014\u000b\u00029\u0003\u0003\u0002\u0002\u0002:=\u0005\b\u0005\u0002;=\u0005\u0006\u0004\u0002<:\u0003\u0002\u0002\u0002<;\u0003\u0002\u0002\u0002=\u0005\u0003\u0002\u0002\u0002>?\t\u0002\u0002\u0002?@\u0005\b\u0005\u0002@\u0007\u0003\u0002\u0002\u0002AF\u0005\n\u0006\u0002BC\t\u0002\u0002\u0002CE\u0005\n\u0006\u0002DB\u0003\u0002\u0002\u0002EH\u0003\u0002\u0002\u0002FD\u0003\u0002\u0002\u0002FG\u0003\u0002\u0002\u0002G\t\u0003\u0002\u0002\u0002HF\u0003\u0002\u0002\u0002IJ\u0005\f\u0007\u0002JN\u0005\u000e\b\u0002KM\u0005\u0010\t\u0002LK\u0003\u0002\u0002\u0002MP\u0003\u0002\u0002\u0002NL\u0003\u0002\u0002\u0002NO\u0003\u0002\u0002\u0002OS\u0003\u0002\u0002\u0002PN\u0003\u0002\u0002\u0002QS\u0005\u0012\n\u0002RI\u0003\u0002\u0002\u0002RQ\u0003\u0002\u0002\u0002S\u000b\u0003\u0002\u0002\u0002TU\u0007\t\u0002\u0002UZ\u0007&\u0002\u0002VX\u0007\u0017\u0002\u0002WV\u0003\u0002\u0002\u0002WX\u0003\u0002\u0002\u0002XZ\u0003\u0002\u0002\u0002YT\u0003\u0002\u0002\u0002YW\u0003\u0002\u0002\u0002Z\r\u0003\u0002\u0002\u0002[d\u00054\u001b\u0002\\]\u0007\u0007\u0002\u0002]^\u0007\f\u0002\u0002^d\u0007\r\u0002\u0002_`\u0007\u0003\u0002\u0002`a\u0007\f\u0002\u0002ab\u0007)\u0002\u0002bd\u0007\r\u0002\u0002c[\u0003\u0002\u0002\u0002c\\\u0003\u0002\u0002\u0002c_\u0003\u0002\u0002\u0002d\u000f\u0003\u0002\u0002\u0002ef\u0007\u000e\u0002\u0002fg\u0005\u0014\u000b\u0002gh\u0007\u000f\u0002\u0002h\u0011\u0003\u0002\u0002\u0002ij\t\u0003\u0002\u0002j\u0013\u0003\u0002\u0002\u0002kl\u0005 \u0011\u0002l\u0015\u0003\u0002\u0002\u0002mv\u00052\u001a\u0002no\u0007\f\u0002\u0002op\u0005\u0014\u000b\u0002pq\u0007\r\u0002\u0002qv\u0003\u0002\u0002\u0002rv\u0007)\u0002\u0002sv\u0007\b\u0002\u0002tv\u0005\u0018\r\u0002um\u0003\u0002\u0002\u0002un\u0003\u0002\u0002\u0002ur\u0003\u0002\u0002\u0002us\u0003\u0002\u0002\u0002ut\u0003\u0002\u0002\u0002v\u0017\u0003\u0002\u0002\u0002wx\u00050\u0019\u0002x\u0081\u0007\f\u0002\u0002y~\u0005\u0014\u000b\u0002z{\u0007\u0018\u0002\u0002{}\u0005\u0014\u000b\u0002|z\u0003\u0002\u0002\u0002}\u0080\u0003\u0002\u0002\u0002~|\u0003\u0002\u0002\u0002~\u007f\u0003\u0002\u0002\u0002\u007f\u0082\u0003\u0002\u0002\u0002\u0080~\u0003\u0002\u0002\u0002\u0081y\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082\u0083\u0003\u0002\u0002\u0002\u0083\u0084\u0007\r\u0002\u0002\u0084\u0019\u0003\u0002\u0002\u0002\u0085\u0088\u0005\u001c\u000f\u0002\u0086\u0087\u0007\u0019\u0002\u0002\u0087\u0089\u0005\u001a\u000e\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0088\u0089\u0003\u0002\u0002\u0002\u0089\u008e\u0003\u0002\u0002\u0002\u008a\u008b\u0007\n\u0002\u0002\u008b\u008c\u0007\u0019\u0002\u0002\u008c\u008e\u0005\u001a\u000e\u0002\u008d\u0085\u0003\u0002\u0002\u0002\u008d\u008a\u0003\u0002\u0002\u0002\u008e\u001b\u0003\u0002\u0002\u0002\u008f\u0096\u0005\u0004\u0003\u0002\u0090\u0093\u0005\u001e\u0010\u0002\u0091\u0092\t\u0002\u0002\u0002\u0092\u0094\u0005\b\u0005\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0093\u0094\u0003\u0002\u0002\u0002\u0094\u0096\u0003\u0002\u0002\u0002\u0095\u008f\u0003\u0002\u0002\u0002\u0095\u0090\u0003\u0002\u0002\u0002\u0096\u001d\u0003\u0002\u0002\u0002\u0097\u009b\u0005\u0016\f\u0002\u0098\u009a\u0005\u0010\t\u0002\u0099\u0098\u0003\u0002\u0002\u0002\u009a\u009d\u0003\u0002\u0002\u0002\u009b\u0099\u0003\u0002\u0002\u0002\u009b\u009c\u0003\u0002\u0002\u0002\u009c\u001f\u0003\u0002\u0002\u0002\u009d\u009b\u0003\u0002\u0002\u0002\u009e£\u0005\"\u0012\u0002\u009f \u0007\u0004\u0002\u0002 ¢\u0005\"\u0012\u0002¡\u009f\u0003\u0002\u0002\u0002¢¥\u0003\u0002\u0002\u0002£¡\u0003\u0002\u0002\u0002£¤\u0003\u0002\u0002\u0002¤!\u0003\u0002\u0002\u0002¥£\u0003\u0002\u0002\u0002¦«\u0005$\u0013\u0002§¨\u0007\u0005\u0002\u0002¨ª\u0005$\u0013\u0002©§\u0003\u0002\u0002\u0002ª\u00ad\u0003\u0002\u0002\u0002«©\u0003\u0002\u0002\u0002«¬\u0003\u0002\u0002\u0002¬#\u0003\u0002\u0002\u0002\u00ad«\u0003\u0002\u0002\u0002®³\u0005&\u0014\u0002¯°\t\u0004\u0002\u0002°²\u0005&\u0014\u0002±¯\u0003\u0002\u0002\u0002²µ\u0003\u0002\u0002\u0002³±\u0003\u0002\u0002\u0002³´\u0003\u0002\u0002\u0002´%\u0003\u0002\u0002\u0002µ³\u0003\u0002\u0002\u0002¶»\u0005(\u0015\u0002·¸\t\u0005\u0002\u0002¸º\u0005(\u0015\u0002¹·\u0003\u0002\u0002\u0002º½\u0003\u0002\u0002\u0002»¹\u0003\u0002\u0002\u0002»¼\u0003\u0002\u0002\u0002¼'\u0003\u0002\u0002\u0002½»\u0003\u0002\u0002\u0002¾Ã\u0005*\u0016\u0002¿À\t\u0006\u0002\u0002ÀÂ\u0005*\u0016\u0002Á¿\u0003\u0002\u0002\u0002ÂÅ\u0003\u0002\u0002\u0002ÃÁ\u0003\u0002\u0002\u0002ÃÄ\u0003\u0002\u0002\u0002Ä)\u0003\u0002\u0002\u0002ÅÃ\u0003\u0002\u0002\u0002ÆÉ\u0005,\u0017\u0002ÇÈ\t\u0007\u0002\u0002ÈÊ\u0005*\u0016\u0002ÉÇ\u0003\u0002\u0002\u0002ÉÊ\u0003\u0002\u0002\u0002Ê+\u0003\u0002\u0002\u0002ËÍ\u0007\u0010\u0002\u0002ÌË\u0003\u0002\u0002\u0002ÌÍ\u0003\u0002\u0002\u0002ÍÎ\u0003\u0002\u0002\u0002ÎÏ\u0005\u001a\u000e\u0002Ï-\u0003\u0002\u0002\u0002ÐÓ\u00056\u001c\u0002ÑÒ\u0007%\u0002\u0002ÒÔ\u00056\u001c\u0002ÓÑ\u0003\u0002\u0002\u0002ÓÔ\u0003\u0002\u0002\u0002Ô/\u0003\u0002\u0002\u0002ÕÖ\u0005.\u0018\u0002Ö1\u0003\u0002\u0002\u0002×Ø\u0007\u0006\u0002\u0002ØÙ\u0005.\u0018\u0002Ù3\u0003\u0002\u0002\u0002Úá\u0007\u0013\u0002\u0002ÛÜ\u00056\u001c\u0002ÜÝ\u0007%\u0002\u0002ÝÞ\u0007\u0013\u0002\u0002Þá\u0003\u0002\u0002\u0002ßá\u0005.\u0018\u0002àÚ\u0003\u0002\u0002\u0002àÛ\u0003\u0002\u0002\u0002àß\u0003\u0002\u0002\u0002á5\u0003\u0002\u0002\u0002âã\t\b\u0002\u0002ã7\u0003\u0002\u0002\u0002\u001a<FNRWYcu~\u0081\u0088\u008d\u0093\u0095\u009b£«³»ÃÉÌÓà".toCharArray());
        q = c0459aB;
        l = new C0485b[c0459aB.d()];
        while (true) {
            C0459a c0459a = q;
            if (i >= c0459a.d()) {
                return;
            }
            l[i] = new C0485b(c0459a.b(i), i);
            i++;
        }
    }

    public D(InterfaceC0430H interfaceC0430H) {
        super(interfaceC0430H);
        this.b = new S(this, q, l, m);
    }

    public final i A() {
        i iVar = new i(this.g, g());
        l(iVar, 18);
        try {
            try {
                k(iVar);
                i(105);
                K();
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return iVar;
        } finally {
            m();
        }
    }

    public final j B() {
        j jVar = new j(this.g, g());
        l(jVar, 28);
        try {
            try {
                k(jVar);
                i(149);
                N();
                i(153);
                this.d.l(this);
                while (this.e.h(1) == 12) {
                    i(150);
                    M();
                    i(155);
                    this.d.l(this);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return jVar;
        } finally {
            m();
        }
    }

    public final k C() {
        k kVar = new k(this.g, g());
        l(kVar, 22);
        try {
            try {
                k(kVar);
                i(117);
                D();
                i(118);
                q(10);
                i(127);
                this.d.l(this);
                int iH = this.e.h(1);
                if ((iH & (-64)) == 0 && ((1 << iH) & 2748782430194L) != 0) {
                    i(119);
                    A();
                    i(124);
                    this.d.l(this);
                    while (this.e.h(1) == 22) {
                        i(120);
                        q(22);
                        i(121);
                        A();
                        i(126);
                        this.d.l(this);
                    }
                }
                i(129);
                q(11);
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return kVar;
        } finally {
            m();
        }
    }

    public final l D() {
        l lVar = new l(this.g, g());
        l(lVar, 46);
        try {
            try {
                k(lVar);
                i(211);
                O();
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return lVar;
        } finally {
            m();
        }
    }

    public final m E() {
        m mVar = new m(this.g, g());
        l(mVar, 2);
        try {
            try {
                i(58);
                this.d.l(this);
                int iH = this.e.h(1);
                if (iH == 1 || iH == 5 || iH == 41 || iH == 7) {
                    k(mVar);
                    i(56);
                    Q();
                } else if (iH == 8 || iH == 9) {
                    k(mVar);
                    i(57);
                    v();
                } else {
                    if (iH != 16 && iH != 17 && iH != 20 && iH != 21) {
                        throw new com.github.catvod.spider.merge.FM.x.v(this);
                    }
                    k(mVar);
                    i(56);
                    Q();
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return mVar;
        } finally {
            m();
        }
    }

    public final n F() {
        n nVar = new n(this.g, g());
        l(nVar, 0);
        try {
            try {
                k(nVar);
                i(54);
                A();
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return nVar;
        } finally {
            m();
        }
    }

    public final o G() {
        o oVar = new o(this.g, g());
        l(oVar, 40);
        try {
            try {
                k(oVar);
                i(196);
                S();
                i(199);
                this.d.l(this);
                int iH = this.e.h(1);
                if ((iH & (-64)) == 0 && ((1 << iH) & 917504) != 0) {
                    i(197);
                    oVar.g = this.e.g(1);
                    int iH2 = this.e.h(1);
                    if ((iH2 & (-64)) != 0 || ((1 << iH2) & 917504) == 0) {
                        oVar.g = this.d.g(this);
                    } else {
                        if (this.e.h(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        j();
                    }
                    i(198);
                    G();
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return oVar;
        } finally {
            m();
        }
    }

    public final p H() {
        p pVar = new p(this.g, g());
        l(pVar, 52);
        try {
            try {
                k(pVar);
                i(224);
                int iH = this.e.h(1);
                if (iH == 7 || iH == 41) {
                    if (this.e.h(1) == -1) {
                        this.k = true;
                    }
                    this.d.i();
                    j();
                } else {
                    this.d.g(this);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return pVar;
        } finally {
            m();
        }
    }

    public final q I() {
        int iB;
        q qVar = new q(this.g, g());
        l(qVar, 50);
        try {
            try {
                i(222);
                this.d.l(this);
                iB = ((S) f()).b(this.e, 23, this.g);
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            if (iB == 1) {
                k(qVar);
                i(216);
            } else {
                if (iB != 2) {
                    if (iB == 3) {
                        k(qVar);
                        i(221);
                        O();
                    }
                    return qVar;
                }
                k(qVar);
                i(217);
                H();
                i(218);
                q(35);
                i(219);
            }
            q(17);
            return qVar;
        } finally {
            m();
        }
    }

    public final r J() {
        int iH;
        r rVar = new r(this.g, g());
        l(rVar, 12);
        try {
            try {
                i(97);
                this.d.l(this);
                iH = this.e.h(1);
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            if (iH == 1) {
                k(rVar);
                i(93);
                q(1);
                i(94);
                q(10);
                i(95);
                q(39);
                i(96);
            } else {
                if (iH != 5) {
                    if (iH != 7 && iH != 17 && iH != 41) {
                        throw new com.github.catvod.spider.merge.FM.x.v(this);
                    }
                    k(rVar);
                    i(89);
                    I();
                    return rVar;
                }
                k(rVar);
                i(90);
                q(5);
                i(91);
                q(10);
                i(92);
            }
            q(11);
            return rVar;
        } finally {
            m();
        }
    }

    public final s K() {
        s sVar = new s(this.g, g());
        l(sVar, 30);
        try {
            try {
                k(sVar);
                i(156);
                x();
                i(161);
                this.d.l(this);
                while (this.e.h(1) == 2) {
                    i(157);
                    q(2);
                    i(158);
                    x();
                    i(163);
                    this.d.l(this);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return sVar;
        } finally {
            m();
        }
    }

    public final t L() {
        t tVar = new t(this.g, g());
        l(tVar, 26);
        try {
            try {
                i(147);
                this.d.l(this);
                int iB = ((S) f()).b(this.e, 13, this.g);
                if (iB == 1) {
                    k(tVar);
                    i(141);
                    E();
                } else if (iB == 2) {
                    k(tVar);
                    i(142);
                    B();
                    i(145);
                    this.d.l(this);
                    int iH = this.e.h(1);
                    if (iH == 8 || iH == 9) {
                        i(143);
                        tVar.g = this.e.g(1);
                        int iH2 = this.e.h(1);
                        if (iH2 == 8 || iH2 == 9) {
                            if (this.e.h(1) == -1) {
                                this.k = true;
                            }
                            this.d.i();
                            j();
                        } else {
                            tVar.g = this.d.g(this);
                        }
                        i(144);
                        Q();
                    }
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return tVar;
        } finally {
            m();
        }
    }

    public final u M() {
        u uVar = new u(this.g, g());
        l(uVar, 14);
        try {
            try {
                k(uVar);
                i(99);
                q(12);
                i(100);
                A();
                i(101);
                q(13);
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return uVar;
        } finally {
            m();
        }
    }

    public final v N() {
        v vVar = new v(this.g, g());
        l(vVar, 20);
        try {
            try {
                i(115);
                this.d.l(this);
                int iH = this.e.h(1);
                if (iH == 4) {
                    k(vVar);
                    i(107);
                    U();
                } else if (iH != 10) {
                    int i = 39;
                    if (iH != 39) {
                        if (iH != 41) {
                            i = 6;
                            if (iH == 6) {
                                k(vVar);
                                i(113);
                            } else if (iH != 7) {
                                throw new com.github.catvod.spider.merge.FM.x.v(this);
                            }
                        }
                        k(vVar);
                        i(114);
                        C();
                    } else {
                        k(vVar);
                        i(112);
                    }
                    q(i);
                } else {
                    k(vVar);
                    i(108);
                    q(10);
                    i(109);
                    A();
                    i(110);
                    q(11);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return vVar;
        } finally {
            m();
        }
    }

    public final w O() {
        w wVar = new w(this.g, g());
        l(wVar, 44);
        try {
            try {
                k(wVar);
                i(206);
                H();
                i(209);
                this.d.l(this);
                if (this.e.h(1) == 35) {
                    i(207);
                    q(35);
                    i(208);
                    H();
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return wVar;
        } finally {
            m();
        }
    }

    public final x P() {
        x xVar = new x(this.g, g());
        l(xVar, 36);
        try {
            try {
                k(xVar);
                i(180);
                w();
                i(185);
                this.d.l(this);
                while (true) {
                    int iH = this.e.h(1);
                    if ((iH & (-64)) != 0 || ((1 << iH) & 33470545920L) == 0) {
                        break;
                    }
                    i(181);
                    xVar.g = this.e.g(1);
                    int iH2 = this.e.h(1);
                    if ((iH2 & (-64)) != 0 || ((1 << iH2) & 33470545920L) == 0) {
                        xVar.g = this.d.g(this);
                    } else {
                        if (this.e.h(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        j();
                    }
                    i(182);
                    w();
                    i(187);
                    this.d.l(this);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return xVar;
        } finally {
            m();
        }
    }

    public final y Q() {
        y yVar = new y(this.g, g());
        l(yVar, 6);
        try {
            try {
                k(yVar);
                i(63);
                R();
                i(68);
                this.d.l(this);
                while (true) {
                    int iH = this.e.h(1);
                    if (iH != 8 && iH != 9) {
                        break;
                    }
                    i(64);
                    yVar.g = this.e.g(1);
                    int iH2 = this.e.h(1);
                    if (iH2 == 8 || iH2 == 9) {
                        if (this.e.h(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        j();
                    } else {
                        yVar.g = this.d.g(this);
                    }
                    i(65);
                    R();
                    i(70);
                    this.d.l(this);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return yVar;
        } finally {
            m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[Catch: all -> 0x008a, A -> 0x008c, LOOP:0: B:24:0x006d->B:26:0x0077, LOOP_END, TRY_LEAVE, TryCatch #1 {A -> 0x008c, blocks: (B:3:0x0012, B:20:0x003e, B:21:0x0043, B:22:0x0044, B:23:0x0050, B:24:0x006d, B:26:0x0077), top: B:37:0x0012, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.FM.U.z R() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.FM.U.z r0 = new com.github.catvod.spider.merge.FM.U.z
            com.github.catvod.spider.merge.FM.x.y r1 = r4.g
            int r2 = r4.g()
            r0.<init>(r1, r2)
            r1 = 8
            r4.l(r0, r1)
            r1 = 80
            r4.i(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            com.github.catvod.spider.merge.FM.x.p r1 = r4.d     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r1.l(r4)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            com.github.catvod.spider.merge.FM.x.H r1 = r4.e     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r2 = 1
            int r1 = r1.h(r2)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            if (r1 == r2) goto L50
            r3 = 5
            if (r1 == r3) goto L50
            r3 = 7
            if (r1 == r3) goto L50
            r3 = 41
            if (r1 == r3) goto L50
            r3 = 16
            if (r1 == r3) goto L44
            r3 = 17
            if (r1 == r3) goto L50
            r3 = 20
            if (r1 == r3) goto L44
            r3 = 21
            if (r1 != r3) goto L3e
            goto L50
        L3e:
            com.github.catvod.spider.merge.FM.x.v r1 = new com.github.catvod.spider.merge.FM.x.v     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            throw r1     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
        L44:
            r4.k(r0)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r1 = 79
            r4.i(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r4.u()     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            goto L97
        L50:
            r4.k(r0)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r1 = 71
            r4.i(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r4.y()     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r1 = 72
            r4.i(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r4.J()     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r1 = 76
            r4.i(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            com.github.catvod.spider.merge.FM.x.p r1 = r4.d     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r1.l(r4)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
        L6d:
            com.github.catvod.spider.merge.FM.x.H r1 = r4.e     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            int r1 = r1.h(r2)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r3 = 12
            if (r1 != r3) goto L97
            r1 = 73
            r4.i(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r4.M()     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r1 = 78
            r4.i(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            com.github.catvod.spider.merge.FM.x.p r1 = r4.d     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            r1.l(r4)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.FM.x.C0423A -> L8c
            goto L6d
        L8a:
            r0 = move-exception
            goto L9b
        L8c:
            r1 = move-exception
            com.github.catvod.spider.merge.FM.x.p r2 = r4.d     // Catch: java.lang.Throwable -> L8a
            r2.h(r4, r1)     // Catch: java.lang.Throwable -> L8a
            com.github.catvod.spider.merge.FM.x.p r2 = r4.d     // Catch: java.lang.Throwable -> L8a
            r2.f(r4, r1)     // Catch: java.lang.Throwable -> L8a
        L97:
            r4.m()
            return r0
        L9b:
            r4.m()
            goto La0
        L9f:
            throw r0
        La0:
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.FM.U.D.R():com.github.catvod.spider.merge.FM.U.z");
    }

    public final A S() {
        A a = new A(this.g, g());
        l(a, 42);
        try {
            try {
                k(a);
                i(202);
                this.d.l(this);
                if (this.e.h(1) == 14) {
                    i(201);
                    a.g = q(14);
                }
                i(204);
                T();
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return a;
        } finally {
            m();
        }
    }

    public final B T() {
        B b = new B(this.g, g());
        l(b, 24);
        try {
            try {
                i(139);
                this.d.l(this);
                int iB = ((S) f()).b(this.e, 11, this.g);
                if (iB == 1) {
                    k(b);
                    i(131);
                    L();
                    i(134);
                    this.d.l(this);
                    if (this.e.h(1) == 23) {
                        i(132);
                        b.g = q(23);
                        i(133);
                        T();
                    }
                } else if (iB == 2) {
                    k(b);
                    i(136);
                    q(8);
                    i(137);
                    q(23);
                    i(138);
                    T();
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return b;
        } finally {
            m();
        }
    }

    public final C U() {
        C c = new C(this.g, g());
        l(c, 48);
        try {
            try {
                k(c);
                i(213);
                q(4);
                i(214);
                O();
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return c;
        } finally {
            m();
        }
    }

    @Override // com.github.catvod.spider.merge.FM.x.AbstractC0425C
    public final C0459a d() {
        return q;
    }

    public final C0295c u() {
        C0295c c0295c = new C0295c(this.g, g());
        l(c0295c, 16);
        try {
            try {
                k(c0295c);
                i(103);
                int iH = this.e.h(1);
                if (iH == 16 || iH == 20) {
                    if (this.e.h(1) == -1) {
                        this.k = true;
                    }
                    this.d.i();
                    j();
                } else {
                    this.d.g(this);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return c0295c;
        } finally {
            m();
        }
    }

    public final C0296d v() {
        C0296d c0296d = new C0296d(this.g, g());
        l(c0296d, 4);
        try {
            try {
                k(c0296d);
                i(60);
                c0296d.g = this.e.g(1);
                int iH = this.e.h(1);
                if (iH == 8 || iH == 9) {
                    if (this.e.h(1) == -1) {
                        this.k = true;
                    }
                    this.d.i();
                    j();
                } else {
                    c0296d.g = this.d.g(this);
                }
                i(61);
                Q();
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return c0296d;
        } finally {
            m();
        }
    }

    public final C0297e w() {
        C0297e c0297e = new C0297e(this.g, g());
        l(c0297e, 38);
        try {
            try {
                k(c0297e);
                i(188);
                G();
                i(193);
                this.d.l(this);
                while (true) {
                    int iH = this.e.h(1);
                    if (iH != 14 && iH != 15) {
                        break;
                    }
                    i(189);
                    c0297e.g = this.e.g(1);
                    int iH2 = this.e.h(1);
                    if (iH2 == 14 || iH2 == 15) {
                        if (this.e.h(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        j();
                    } else {
                        c0297e.g = this.d.g(this);
                    }
                    i(190);
                    G();
                    i(195);
                    this.d.l(this);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return c0297e;
        } finally {
            m();
        }
    }

    public final f x() {
        f fVar = new f(this.g, g());
        l(fVar, 32);
        try {
            try {
                k(fVar);
                i(164);
                z();
                i(169);
                this.d.l(this);
                while (this.e.h(1) == 3) {
                    i(165);
                    q(3);
                    i(166);
                    z();
                    i(171);
                    this.d.l(this);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return fVar;
        } finally {
            m();
        }
    }

    public final g y() {
        g gVar = new g(this.g, g());
        l(gVar, 10);
        try {
            try {
                i(87);
                this.d.l(this);
                int iB = ((S) f()).b(this.e, 5, this.g);
                if (iB == 1) {
                    k(gVar);
                    i(82);
                    q(7);
                    i(83);
                    q(36);
                } else if (iB == 2) {
                    k(gVar);
                    i(85);
                    this.d.l(this);
                    if (this.e.h(1) == 21) {
                        i(84);
                        q(21);
                    }
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return gVar;
        } finally {
            m();
        }
    }

    public final h z() {
        h hVar = new h(this.g, g());
        l(hVar, 34);
        try {
            try {
                k(hVar);
                i(172);
                P();
                i(177);
                this.d.l(this);
                while (true) {
                    int iH = this.e.h(1);
                    if (iH != 28 && iH != 29) {
                        break;
                    }
                    i(173);
                    hVar.g = this.e.g(1);
                    int iH2 = this.e.h(1);
                    if (iH2 == 28 || iH2 == 29) {
                        if (this.e.h(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        j();
                    } else {
                        hVar.g = this.d.g(this);
                    }
                    i(174);
                    P();
                    i(179);
                    this.d.l(this);
                }
            } catch (C0423A e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return hVar;
        } finally {
            m();
        }
    }
}
