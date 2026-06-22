package com.github.catvod.spider.merge.L1;

import com.github.catvod.spider.merge.I.t0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k implements com.github.catvod.spider.merge.N1.a {
    public static boolean b(String str, String str2) {
        return c(Pattern.compile(str), str2);
    }

    public static boolean c(Pattern pattern, String str) {
        return pattern.matcher(str).find();
    }

    public static String d(String str, String str2, int i) {
        return e(Pattern.compile(str), str2, i);
    }

    public static String e(Pattern pattern, String str, int i) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(i);
        }
        String strA = t0.a("Failed to find pattern \"", pattern.pattern(), "\"");
        if (str.length() <= 1024) {
            strA = strA + " inside of \"" + str + "\"";
        }
        throw new j(strA);
    }

    public static Matcher f(Pattern[] patternArr, String str) throws j {
        j jVar = null;
        for (Pattern pattern : patternArr) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher;
            }
            if (jVar == null) {
                jVar = new j("Failed to find pattern \"" + pattern.pattern() + "\"" + (str.length() <= 1000 ? t0.a("inside of \"", str, "\"") : ""));
            }
        }
        if (jVar != null) {
            throw jVar;
        }
        throw new j("Empty patterns array passed to matchMultiplePatterns");
    }

    public static String g(int i) {
        switch (i) {
            case -1:
                return "ERROR";
            case 0:
                return "EOF";
            case 1:
                return "EOL";
            case 2:
                return "ENTERWITH";
            case 3:
                return "LEAVEWITH";
            case 4:
                return "RETURN";
            case 5:
                return "GOTO";
            case 6:
                return "IFEQ";
            case 7:
                return "IFNE";
            case 8:
                return "SETNAME";
            case 9:
                return "BITOR";
            case 10:
                return "BITXOR";
            case 11:
                return "BITAND";
            case 12:
                return "EQ";
            case 13:
                return "NE";
            case 14:
                return "LT";
            case 15:
                return "LE";
            case 16:
                return "GT";
            case 17:
                return "GE";
            case 18:
                return "LSH";
            case 19:
                return "RSH";
            case 20:
                return "URSH";
            case 21:
                return "ADD";
            case 22:
                return "SUB";
            case 23:
                return "MUL";
            case 24:
                return "DIV";
            case 25:
                return "MOD";
            case 26:
                return "NOT";
            case 27:
                return "BITNOT";
            case 28:
                return "POS";
            case 29:
                return "NEG";
            case 30:
                return "NEW";
            case 31:
                return "DELPROP";
            case 32:
                return "TYPEOF";
            case 33:
                return "GETPROP";
            case 34:
                return "GETPROPNOWARN";
            case 35:
                return "SETPROP";
            case 36:
                return "GETELEM";
            case 37:
                return "SETELEM";
            case 38:
                return "CALL";
            case 39:
                return "NAME";
            case 40:
                return "NUMBER";
            case 41:
                return "STRING";
            case 42:
                return "NULL";
            case 43:
                return "THIS";
            case 44:
                return "FALSE";
            case 45:
                return "TRUE";
            case 46:
                return "SHEQ";
            case 47:
                return "SHNE";
            case 48:
                return "REGEXP";
            case 49:
                return "BINDNAME";
            case 50:
                return "THROW";
            case 51:
                return "RETHROW";
            case 52:
                return "IN";
            case 53:
                return "INSTANCEOF";
            case 54:
                return "LOCAL_LOAD";
            case 55:
                return "GETVAR";
            case 56:
                return "SETVAR";
            case 57:
                return "CATCH_SCOPE";
            case 58:
                return "ENUM_INIT_KEYS";
            case 59:
                return "ENUM_INIT_VALUES";
            case 60:
                return "ENUM_INIT_ARRAY";
            case 61:
                return "ENUM_INIT_VALUES_IN_ORDER";
            case 62:
                return "ENUM_NEXT";
            case 63:
                return "ENUM_ID";
            case 64:
                return "THISFN";
            case 65:
                return "RETURN_RESULT";
            case 66:
                return "ARRAYLIT";
            case 67:
                return "OBJECTLIT";
            case 68:
                return "GET_REF";
            case 69:
                return "SET_REF";
            case 70:
                return "DEL_REF";
            case 71:
                return "REF_CALL";
            case 72:
                return "REF_SPECIAL";
            case 73:
                return "YIELD";
            case 74:
            case 160:
            default:
                throw new IllegalStateException(String.valueOf(i));
            case 75:
                return "EXP";
            case 76:
                return "DEFAULTNAMESPACE";
            case 77:
                return "ESCXMLATTR";
            case 78:
                return "ESCXMLTEXT";
            case 79:
                return "REF_MEMBER";
            case 80:
                return "REF_NS_MEMBER";
            case 81:
                return "REF_NAME";
            case 82:
                return "REF_NS_NAME";
            case 83:
                return "BIGINT";
            case 84:
                return "TRY";
            case 85:
                return "SEMI";
            case 86:
                return "LB";
            case 87:
                return "RB";
            case 88:
                return "LC";
            case 89:
                return "RC";
            case 90:
                return "LP";
            case 91:
                return "RP";
            case 92:
                return "COMMA";
            case 93:
                return "ASSIGN";
            case 94:
                return "ASSIGN_BITOR";
            case 95:
                return "ASSIGN_BITXOR";
            case 96:
                return "ASSIGN_BITAND";
            case 97:
                return "ASSIGN_LSH";
            case 98:
                return "ASSIGN_RSH";
            case 99:
                return "ASSIGN_URSH";
            case 100:
                return "ASSIGN_ADD";
            case 101:
                return "ASSIGN_SUB";
            case 102:
                return "ASSIGN_MUL";
            case 103:
                return "ASSIGN_DIV";
            case 104:
                return "ASSIGN_MOD";
            case 105:
                return "ASSIGN_EXP";
            case 106:
                return "HOOK";
            case 107:
                return "COLON";
            case 108:
                return "OR";
            case 109:
                return "AND";
            case 110:
                return "INC";
            case 111:
                return "DEC";
            case 112:
                return "DOT";
            case 113:
                return "FUNCTION";
            case 114:
                return "EXPORT";
            case 115:
                return "IMPORT";
            case 116:
                return "IF";
            case 117:
                return "ELSE";
            case 118:
                return "SWITCH";
            case 119:
                return "CASE";
            case 120:
                return "DEFAULT";
            case 121:
                return "WHILE";
            case 122:
                return "DO";
            case 123:
                return "FOR";
            case 124:
                return "BREAK";
            case 125:
                return "CONTINUE";
            case 126:
                return "VAR";
            case 127:
                return "WITH";
            case 128:
                return "CATCH";
            case 129:
                return "FINALLY";
            case 130:
                return "VOID";
            case 131:
                return "RESERVED";
            case 132:
                return "EMPTY";
            case 133:
                return "BLOCK";
            case 134:
                return "LABEL";
            case 135:
                return "TARGET";
            case 136:
                return "LOOP";
            case 137:
                return "EXPR_VOID";
            case 138:
                return "EXPR_RESULT";
            case 139:
                return "JSR";
            case 140:
                return "SCRIPT";
            case 141:
                return "TYPEOFNAME";
            case 142:
                return "USE_STACK";
            case 143:
                return "SETPROP_OP";
            case 144:
                return "SETELEM_OP";
            case 145:
                return "LOCAL_BLOCK";
            case 146:
                return "SET_REF_OP";
            case 147:
                return "DOTDOT";
            case 148:
                return "COLONCOLON";
            case 149:
                return "XML";
            case 150:
                return "DOTQUERY";
            case 151:
                return "XMLATTR";
            case 152:
                return "XMLEND";
            case 153:
                return "TO_OBJECT";
            case 154:
                return "TO_DOUBLE";
            case 155:
                return "GET";
            case 156:
                return "SET";
            case 157:
                return "LET";
            case 158:
                return "CONST";
            case 159:
                return "SETCONST";
            case 161:
                return "ARRAYCOMP";
            case 162:
                return "LETEXPR";
            case 163:
                return "WITHEXPR";
            case 164:
                return "DEBUGGER";
            case 165:
                return "COMMENT";
            case 166:
                return "GENEXPR";
            case 167:
                return "METHOD";
            case 168:
                return "ARROW";
            case 169:
                return "YIELD_STAR";
            case 170:
                return "TEMPLATE_LITERAL";
            case 171:
                return "TEMPLATE_CHARS";
            case 172:
                return "TEMPLATE_LITERAL_SUBST";
            case 173:
                return "TAGGED_TEMPLATE_LITERAL";
        }
    }

    @Override // com.github.catvod.spider.merge.N1.a
    public com.github.catvod.spider.merge.N1.b a(String str) {
        return com.github.catvod.spider.merge.P1.b.b;
    }
}
