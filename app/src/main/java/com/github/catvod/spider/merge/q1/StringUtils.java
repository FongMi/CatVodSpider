package com.github.catvod.spider.merge.q1;

import java.io.PrintStream;

public final class StringUtils extends Exception {
    protected static Throwable throwable;

    public StringUtils(String str) {
        super(str);
    }

    public StringUtils(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append("");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("caused by: ");
        stringBuffer2.append(th);
        stringBuffer.append(stringBuffer2.toString());
        this.throwable = th;
    }

    @Override // java.lang.Throwable
    public static void printStackTrace() {
        if (throwable == null) {
            throwable.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getMessage());
            stringBuffer.append("; nested exception is:");
            printStream.println(stringBuffer.toString());
            throwable.printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public static final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.a) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.a.getClass().toString() : message2;
    }

    public static void printStackTrace(Exception throwable) {
        if (throwable == null) {
            throwable.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            String stringBuffer = getMessage() +
                    "; nested exception is:";
            printStream.println(stringBuffer);
            throwable.printStackTrace();
        }
    }
}
