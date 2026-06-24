/**
 * Frida 脚本: 脱壳 awdm/Amns 加固的 CatVod APK
 *
 * 使用方法:
 *   1. 在已 root 的设备或模拟器上安装目标 APK
 *   2. 运行: frida -U -f <package_name> -l frida_unpack.js --no-pause
 *   3. 触发任意 Spider 的 init() 方法（打开应用即可）
 *   4. 脱壳后的 DEX 将保存到 /sdcard/unpacked/
 *
 * 目标:
 *   - Hook DexClassLoader 拦截解密后的 DEX 加载
 *   - Hook Native 层 open/write 拦截写出的文件
 *   - Hook System.load 拦截 SO 加载路径
 */

'use strict';

var LOG_TAG = 'AMNS_UNPACK';
function log(msg) {
    console.log('[' + LOG_TAG + '] ' + msg);
}

// ============================================================
// 1. Hook DexClassLoader - 拦截动态加载的 DEX
// ============================================================
Java.perform(function() {
    log('Java.perform started');

    // 确保输出目录存在
    var File = Java.use('java.io.File');
    var outDir = File.$new('/sdcard/unpacked');
    if (!outDir.exists()) {
        outDir.mkdirs();
        log('Created output directory: /sdcard/unpacked');
    }

    // --- Hook DexClassLoader ---
    var DexClassLoader = Java.use('dalvik.system.DexClassLoader');
    DexClassLoader.$init.overload(
        'java.lang.String', 'java.lang.String',
        'java.lang.String', 'java.lang.ClassLoader'
    ).implementation = function(dexPath, optimizedDirectory, librarySearchPath, parent) {
        log('=== DexClassLoader.$init ===');
        log('  dexPath: ' + dexPath);
        log('  optimizedDir: ' + optimizedDirectory);
        log('  libSearchPath: ' + librarySearchPath);

        // 复制 DEX 文件到 /sdcard/unpacked/
        try {
            var fis = Java.use('java.io.FileInputStream').$new(dexPath);
            var srcFile = File.$new(dexPath);
            var destPath = '/sdcard/unpacked/unpacked_' + srcFile.getName();
            var fos = Java.use('java.io.FileOutputStream').$new(destPath);

            var buf = Java.array('byte', new Array(8192).fill(0));
            var len;
            while ((len = fis.read(buf)) > 0) {
                fos.write(buf, 0, len);
            }
            fis.close();
            fos.close();
            log('  DEX dumped to: ' + destPath);
        } catch (e) {
            log('  Error dumping DEX: ' + e);
        }

        return this.$init(dexPath, optimizedDirectory, librarySearchPath, parent);
    };

    // --- Hook InMemoryDexClassLoader (Android 8+) ---
    try {
        var InMemoryDexClassLoader = Java.use('dalvik.system.InMemoryDexClassLoader');
        InMemoryDexClassLoader.$init.overload(
            'java.nio.ByteBuffer', 'java.lang.ClassLoader'
        ).implementation = function(buffer, parent) {
            log('=== InMemoryDexClassLoader.$init ===');
            log('  buffer size: ' + buffer.remaining());

            // 从内存中 dump DEX
            try {
                var pos = buffer.position();
                var size = buffer.remaining();
                var bytes = Java.array('byte', new Array(size).fill(0));
                buffer.get(bytes);
                buffer.position(pos);  // 恢复位置

                var fos = Java.use('java.io.FileOutputStream').$new(
                    '/sdcard/unpacked/inmemory_' + Date.now() + '.dex'
                );
                fos.write(bytes);
                fos.close();
                log('  In-memory DEX dumped');
            } catch (e) {
                log('  Error dumping in-memory DEX: ' + e);
            }

            return this.$init(buffer, parent);
        };
        log('InMemoryDexClassLoader hook installed');
    } catch (e) {
        log('InMemoryDexClassLoader not available (pre-Android 8)');
    }

    // --- Hook PathClassLoader ---
    try {
        var PathClassLoader = Java.use('dalvik.system.PathClassLoader');
        PathClassLoader.$init.overload(
            'java.lang.String', 'java.lang.ClassLoader'
        ).implementation = function(dexPath, parent) {
            log('=== PathClassLoader.$init ===');
            log('  dexPath: ' + dexPath);
            return this.$init(dexPath, parent);
        };
    } catch(e) {}

    // --- Hook System.load / System.loadLibrary ---
    var System = Java.use('java.lang.System');
    System.load.overload('java.lang.String').implementation = function(libPath) {
        log('=== System.load ===');
        log('  path: ' + libPath);
        return this.load(libPath);
    };

    System.loadLibrary.overload('java.lang.String').implementation = function(libName) {
        log('=== System.loadLibrary ===');
        log('  name: ' + libName);
        return this.loadLibrary(libName);
    };

    // --- Hook Init.init if we can find the class ---
    try {
        var Init = Java.use('com.github.catvod.spider.Init');
        Init.init.overload('android.content.Context').implementation = function(ctx) {
            log('=== Init.init() called ===');
            this.init(ctx);
            log('=== Init.init() completed ===');
        };
        log('Init.init hook installed');
    } catch (e) {
        log('Init class not found (will be loaded dynamically)');
    }

    // --- Hook DexNative ---
    try {
        var DexNative = Java.use('com.github.catvod.spider.DexNative');
        log('DexNative class found');
        // Hook getLoader
        try {
            DexNative.getLoader.implementation = function() {
                var result = this.getLoader();
                log('=== DexNative.getLoader() === result: ' + result);
                return result;
            };
        } catch(e) {}
        // Hook getSpider
        try {
            DexNative.getSpider.overload('java.lang.String').implementation = function(name) {
                log('=== DexNative.getSpider("' + name + '") ===');
                var result = this.getSpider(name);
                log('  result: ' + result);
                return result;
            };
        } catch(e) {}
    } catch (e) {
        log('DexNative class not available yet');
    }
});

// ============================================================
// 2. Hook Native 层 - 拦截文件 I/O
// ============================================================
Interceptor.attach(Module.findExportByName('libc.so', 'open'), {
    onEnter: function(args) {
        this.path = args[0].readUtf8String();
        this.flags = args[1].toInt32();
    },
    onLeave: function(retval) {
        if (this.path && (
            this.path.indexOf('.dex') !== -1 ||
            this.path.indexOf('.amns') !== -1 ||
            this.path.indexOf('unpacked') !== -1 ||
            this.path.indexOf('cache') !== -1 ||
            this.path.indexOf('/data/data/') !== -1
        )) {
            log('[native] open(' + this.path + ', flags=0x' +
                this.flags.toString(16) + ') -> fd=' + retval.toInt32());
        }
    }
});

// 拦截 write - 捕获写入 DEX 文件的数据
var writeBuffer = {};
Interceptor.attach(Module.findExportByName('libc.so', 'write'), {
    onEnter: function(args) {
        this.fd = args[0].toInt32();
        this.buf = args[1];
        this.size = args[2].toInt32();
        // 检查是否以 DEX 魔术头开始
        try {
            var header = this.buf.readByteArray(4);
            var magic = new Uint8Array(header);
            if (magic[0] === 0x64 && magic[1] === 0x65 &&
                magic[2] === 0x78 && magic[3] === 0x0a) {
                log('[native] write() DEX MAGIC detected! fd=' + this.fd +
                    ', size=' + this.size);
                // 标记这个 fd 用于后续 dump
                writeBuffer[this.fd] = { chunks: [], totalSize: 0 };
            }
        } catch(e) {}
        // 如果已标记此 fd，收集数据
        if (writeBuffer[this.fd]) {
            try {
                var data = this.buf.readByteArray(this.size);
                writeBuffer[this.fd].chunks.push(data);
                writeBuffer[this.fd].totalSize += this.size;
            } catch(e) {}
        }
    },
    onLeave: function(retval) {
        // write 返回后，如果是 DEX fd 且已关闭，dump 数据
    }
});

// 拦截 close - 在关闭 DEX fd 时 dump 数据
Interceptor.attach(Module.findExportByName('libc.so', 'close'), {
    onEnter: function(args) {
        var fd = args[0].toInt32();
        if (writeBuffer[fd] && writeBuffer[fd].totalSize > 0) {
            log('[native] close(fd=' + fd + ') - dumping DEX data (' +
                writeBuffer[fd].totalSize + ' bytes)');
            // 通过 Java 层写文件
            Java.perform(function() {
                try {
                    var timestamp = Date.now();
                    var fos = Java.use('java.io.FileOutputStream').$new(
                        '/sdcard/unpacked/native_dump_' + timestamp + '.dex'
                    );
                    var chunks = writeBuffer[fd].chunks;
                    for (var i = 0; i < chunks.length; i++) {
                        fos.write(chunks[i]);
                    }
                    fos.close();
                    log('  Native DEX dump saved to /sdcard/unpacked/native_dump_' +
                        timestamp + '.dex');
                } catch(e) {
                    log('  Error saving native dump: ' + e);
                }
            });
            delete writeBuffer[fd];
        }
    }
});

// ============================================================
// 3. 拦截 ClassLoader.getResourceAsStream - 读取 amns 文件
// ============================================================
Java.perform(function() {
    var ClassLoader = Java.use('java.lang.ClassLoader');
    ClassLoader.getResourceAsStream.implementation = function(name) {
        if (name && name.indexOf('.amns') !== -1) {
            log('=== ClassLoader.getResourceAsStream("' + name + '") ===');
        }
        return this.getResourceAsStream(name);
    };
});

// ============================================================
// 4. 扫描内存中的 DEX (延迟执行)
// ============================================================
setTimeout(function() {
    log('=== Scanning memory for DEX files ===');
    Process.enumerateRanges('r--').forEach(function(range) {
        try {
            var buf = Memory.readByteArray(range.base, Math.min(8, range.size));
            var magic = new Uint8Array(buf);
            // 检查 dex\n 魔术头
            if (magic[0] === 0x64 && magic[1] === 0x65 &&
                magic[2] === 0x78 && magic[3] === 0x0a) {
                // 读取 DEX 文件大小 (offset 32, little-endian uint32)
                var fileSize = Memory.readU32(range.base.add(32));
                log('Found DEX in memory at ' + range.base +
                    ', size=' + fileSize + ', range=' + range.size);
                if (fileSize > 0 && fileSize < 50 * 1024 * 1024) {
                    try {
                        var dexData = Memory.readByteArray(range.base, fileSize);
                        Java.perform(function() {
                            try {
                                var timestamp = Date.now();
                                var fos = Java.use('java.io.FileOutputStream').$new(
                                    '/sdcard/unpacked/memscan_' + timestamp + '.dex'
                                );
                                var buf = Java.array('byte',
                                    Array.from(new Uint8Array(dexData)));
                                fos.write(buf);
                                fos.close();
                                log('  Memory DEX dumped: /sdcard/unpacked/memscan_' +
                                    timestamp + '.dex (' + fileSize + ' bytes)');
                            } catch(e) {
                                log('  Error writing memory DEX: ' + e);
                            }
                        });
                    } catch(e) {}
                }
            }
        } catch(e) {}
    });
    log('=== Memory scan complete ===');
}, 10000);  // 10 秒后扫描

log('Frida unpack script loaded successfully');
