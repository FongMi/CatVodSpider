package com.github.catvod.spider;

import android.content.Context;
import android.os.SystemClock;

import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Path;
import com.github.catvod.utils.Shell;
import com.github.catvod.utils.Util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Feiyang extends Spider {

    private static final String URL = "http://127.0.0.1:35345/";
    private static final String AIO = "allinone-linux-musl";
    private static final String SHELL = "run-allinone.sh";
    private static final File f_shell = new File(Path.files(), SHELL);
    private static final File f_aio = new File(Path.files(), AIO);
    private static Thread thread;

    @Override
    public void init(Context context, String extend) throws Exception {
        createShell();
        checkExtend(extend);
        findAIO(Path.tv().listFiles());
        findAIO(Path.download().listFiles());
    }

    @Override
    public String liveContent(String url) {
        int retry = 0;
        while ((OkHttp.string(URL)).isEmpty() && retry++ < 20) SystemClock.sleep(250);
        return OkHttp.string(url.startsWith("http") ? url : URL + url);
    }

    private void createShell() {
        File cache = Path.cache("allinone.cache");
        String cachePath = cache.getAbsolutePath();
        String shellPath = f_shell.getAbsolutePath();
        String aioPath = f_aio.getAbsolutePath();
        String script = "if [ -e " + shellPath + ".kill ]; then\n" + "sh " + shellPath + ".kill;\n" + "killall -9 " + AIO + ";\n" + "sleep 1;\n" + "rm -f " + shellPath + ".kill;\n" + "fi\n" + "echo \"kill -9 $$\" >> " + shellPath + ".kill;\n" + "while(true)\n" + "do\n" + "TMPDIR=" + cachePath + " " + aioPath + " -ipv6=true " + " -port 35345 " + " >/dev/null 2>&1\n" + "pidlist=$(ps -ef|grep " + SHELL + "|grep -v grep|awk '{print $2}')\n" + "selfpid=$$\n" + "for pid in $pidlist\n" + "do\n" + "if [[ $pid != \"$selfpid\" ]] then\n" + "kill -9 $pid\n" + "fi\n" + "done\n" + "killall -9 " + AIO + "\n" + "rm -rf \"" + cachePath + "\"/*\n" + "sleep 5;\n" + "done";
        Path.write(f_shell, script);
    }

    private void checkExtend(String extend) {
        if (!extend.contains(";md5;")) return;
        String[] texts = extend.split(";md5;");
        String url = texts[0].trim();
        String md5 = texts[1].trim();
        if (md5.startsWith("http")) md5 = OkHttp.string(md5).trim();
        if (Util.MD5(f_aio).equals(md5)) return;
        try {
            File file = Path.create(new File(Path.download(), AIO));
            download(file, OkHttp.newCall(url).body().byteStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void download(File file, InputStream is) throws Exception {
        FileOutputStream os = new FileOutputStream(file);
        try (BufferedInputStream input = new BufferedInputStream(is)) {
            byte[] buffer = new byte[4096];
            int readBytes;
            while ((readBytes = input.read(buffer)) != -1) {
                os.write(buffer, 0, readBytes);
            }
        }
    }

    private void findAIO(File[] files) {
        if (files == null || thread != null) return;
        for (File f : files) {
            if (f.getName().equals("allinone") || f.getName().startsWith("allinone-linux")) {
                Path.move(f, f_aio);
            }
        }
        if (f_aio.exists()) {
            thread = new Thread(() -> Shell.exec("nohup " + f_shell.getAbsolutePath() + " &"));
            thread.start();
        }
    }

    @Override
    public void destroy() {
        try {
            Shell.exec("killall -9 " + AIO);
            if (thread != null) thread.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            thread = null;
        }
    }
}
