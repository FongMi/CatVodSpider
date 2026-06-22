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

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class fS extends ImageView {
    public boolean S;
    private Handler T4;
    private String l8;

    class aA extends Handler {
        aA() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                fS.this.setImageBitmap((Bitmap) message.obj);
            } else if (i == 2) {
                Toast.makeText(fS.this.getContext(), "网络连接失败", 0).show();
            } else {
                if (i != 3) {
                    return;
                }
                Toast.makeText(fS.this.getContext(), "服务器发生错误", 0).show();
            }
        }
    }

    class ut extends Thread {
        ut() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Bitmap bitmapB;
            byte[] bArr;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(fS.this.l8).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(10000);
                if (httpURLConnection.getResponseCode() != 200) {
                    fS.this.T4.sendEmptyMessage(3);
                    return;
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                fS fSVar = fS.this;
                if (fSVar.S) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bArr = new byte[1024];
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i <= -1) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        bitmapB = fS.this.b(byteArrayInputStream);
                        fS.this.T4(byteArrayInputStream2);
                    }
                    byteArrayOutputStream.flush();
                    ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    ByteArrayInputStream byteArrayInputStream22 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    bitmapB = fS.this.b(byteArrayInputStream3);
                    fS.this.T4(byteArrayInputStream22);
                } else {
                    bitmapB = fSVar.b(inputStream);
                }
                Message messageObtain = Message.obtain();
                messageObtain.obj = bitmapB;
                messageObtain.what = 1;
                fS.this.T4.sendMessage(messageObtain);
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
                fS.this.T4.sendEmptyMessage(2);
            }
        }
    }

    public fS(Context context) {
        super(context);
        this.S = false;
        this.T4 = new aA();
    }

    public void HM(String str) {
        this.l8 = str;
        if (this.S) {
            n();
        } else {
            v();
        }
    }

    public int N() {
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

    public int OL(BitmapFactory.Options options) {
        int iRound;
        int iN = N();
        int iTT = tT();
        int i = options.outWidth;
        Log.e("网络图片实际的宽度", String.valueOf(i));
        int i2 = options.outHeight;
        Log.e("网络图片实际的高度", String.valueOf(i2));
        if (i > iN || i2 > iTT) {
            int iRound2 = Math.round(i / iN);
            iRound = Math.round(i2 / iTT);
            if (iRound2 > iRound) {
                iRound = iRound2;
            }
        } else {
            iRound = 1;
        }
        Log.e("压缩比率", String.valueOf(iRound));
        return iRound;
    }

    public void T4(InputStream inputStream) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(getContext().getCacheDir(), l()));
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

    public Bitmap b(InputStream inputStream) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bArr = new byte[1024];
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(byteArrayInputStream, null, options);
            options.inSampleSize = OL(options);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(byteArrayInputStream2, null, options);
        }
        byteArrayOutputStream.flush();
        ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ByteArrayInputStream byteArrayInputStream22 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream3, null, options2);
        options2.inSampleSize = OL(options2);
        options2.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(byteArrayInputStream22, null, options2);
    }

    public String l() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.l8.split("\\/")) {
            sb.append(str);
        }
        Log.e("MyImageView", "文件名：" + sb.toString());
        return sb.toString();
    }

    public void n() {
        File file = new File(getContext().getCacheDir(), l());
        if (file.length() <= 0) {
            v();
            Log.e("MyImageView", "使用网络图片");
            return;
        }
        try {
            Bitmap bitmapB = b(new FileInputStream(file));
            Message messageObtain = Message.obtain();
            messageObtain.obj = bitmapB;
            messageObtain.what = 1;
            this.T4.sendMessage(messageObtain);
            Log.e("MyImageView", "使用缓存图片");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int tT() {
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

    public void v() {
        new ut().start();
    }
}
