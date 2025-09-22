package com.github.catvod.spider.merge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.github.catvod.spider.merge.c */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0112c extends ImageView {

    /* renamed from: QU */
    private Handler f598QU;

    /* renamed from: q */
    private String f599q;

    /* renamed from: xC */
    public boolean f600xC;

    /* renamed from: com.github.catvod.spider.merge.c$Qe */
    class Qe extends Thread {
        Qe() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IOException {
            Bitmap bitmapM568UJ;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C0112c.this.f599q).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(10000);
                if (httpURLConnection.getResponseCode() != 200) {
                    C0112c.this.f598QU.sendEmptyMessage(3);
                    return;
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                C0112c c0112c = C0112c.this;
                if (c0112c.f600xC) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i <= -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                        }
                        byteArrayOutputStream.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    bitmapM568UJ = C0112c.this.m568UJ(byteArrayInputStream);
                    C0112c.this.m567QU(byteArrayInputStream2);
                } else {
                    bitmapM568UJ = c0112c.m568UJ(inputStream);
                }
                Message messageObtain = Message.obtain();
                messageObtain.obj = bitmapM568UJ;
                messageObtain.what = 1;
                C0112c.this.f598QU.sendMessage(messageObtain);
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
                C0112c.this.f598QU.sendEmptyMessage(2);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.c$p */
    class p extends Handler {
        p() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C0112c.this.setImageBitmap((Bitmap) message.obj);
            } else if (i == 2) {
                Toast.makeText(C0112c.this.getContext(), "网络连接失败", 0).show();
            } else {
                if (i != 3) {
                    return;
                }
                Toast.makeText(C0112c.this.getContext(), "服务器发生错误", 0).show();
            }
        }
    }

    public C0112c(Context context) {
        super(context);
        this.f600xC = false;
        this.f598QU = new p();
    }

    /* renamed from: FN */
    public void m564FN() {
        new Qe().start();
    }

    /* renamed from: MH */
    public int m565MH() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int width = getWidth();
        if (width <= 0) {
            width = layoutParams.width;
        }
        if (width <= 0) {
            width = getMaxWidth();
        }
        if (width <= 0) {
            width = displayMetrics.widthPixels;
        }
        Log.e("ImageView实际的宽度", String.valueOf(width));
        return width;
    }

    /* renamed from: Mo */
    public String m566Mo() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f599q.split("\\/")) {
            sb.append(str);
        }
        Log.e("MyImageView", "文件名：" + sb.toString());
        return sb.toString();
    }

    /* renamed from: QU */
    public void m567QU(InputStream inputStream) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(getContext().getCacheDir(), m566Mo()));
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    fileOutputStream.close();
                    Log.e("MyImageView", "缓存成功");
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("MyImageView", "缓存失败");
        }
    }

    /* renamed from: UJ */
    public Bitmap m568UJ(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            byteArrayOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        options.inSampleSize = m572u(options);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(byteArrayInputStream2, null, options);
    }

    /* renamed from: W */
    public void m569W() throws IOException {
        File file = new File(getContext().getCacheDir(), m566Mo());
        if (file.length() <= 0) {
            m564FN();
            Log.e("MyImageView", "使用网络图片");
            return;
        }
        try {
            Bitmap bitmapM568UJ = m568UJ(new FileInputStream(file));
            Message messageObtain = Message.obtain();
            messageObtain.obj = bitmapM568UJ;
            messageObtain.what = 1;
            this.f598QU.sendMessage(messageObtain);
            Log.e("MyImageView", "使用缓存图片");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public int m570i() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int height = getHeight();
        if (height <= 0) {
            height = layoutParams.height;
        }
        if (height <= 0) {
            height = getMaxHeight();
        }
        if (height <= 0) {
            height = displayMetrics.heightPixels;
        }
        Log.e("ImageView实际的高度", String.valueOf(height));
        return height;
    }

    /* renamed from: se */
    public void m571se(String str) {
        this.f599q = str;
        if (this.f600xC) {
            m569W();
        } else {
            m564FN();
        }
    }

    /* renamed from: u */
    public int m572u(BitmapFactory.Options options) {
        int iRound;
        int iM565MH = m565MH();
        int iM570i = m570i();
        int i = options.outWidth;
        Log.e("网络图片实际的宽度", String.valueOf(i));
        int i2 = options.outHeight;
        Log.e("网络图片实际的高度", String.valueOf(i2));
        if (i > iM565MH || i2 > iM570i) {
            int iRound2 = Math.round(i / iM565MH);
            iRound = Math.round(i2 / iM570i);
            if (iRound2 > iRound) {
                iRound = iRound2;
            }
        } else {
            iRound = 1;
        }
        Log.e("压缩比率", String.valueOf(iRound));
        return iRound;
    }
}
