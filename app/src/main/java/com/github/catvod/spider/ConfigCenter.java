package com.github.catvod.spider;

import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.format.Formatter;
import android.util.Log;
import com.github.catvod.en.NetPan;
import com.github.catvod.bean.VodItem;
import com.github.catvod.bean.VodResult;
import com.github.catvod.utils.okhttp.OkHttpUtil;
import com.google.gson.annotations.SerializedName;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.*;


public class ConfigCenter extends NetPan {

    private static final String TAG = "ConfigCenter";

    // Concrete VodCategory replacement (the merge.K.VodCategory is abstract and cannot be instantiated)
    private static class CategoryItem extends com.github.catvod.bean.VodCategory {
        @SerializedName("type_id")
        private final String id;
        @SerializedName("type_name")
        private final String name;

        CategoryItem(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    public static final String ALIST_URL;
    public static final String FILEBROWSER_URL;
    private final Map<String, Runnable> actionHandlers = new HashMap<>();

    static {
        String ip = getLocalIpAddress();
        ALIST_URL = "http://" + ip + ":5244";
        FILEBROWSER_URL = "http://" + ip + ":8080";
    }

    private static String getLocalIpAddress() {
        try {
            int ipAddress = ((WifiManager) Init.context().getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
            if (ipAddress != 0) {
                return Formatter.formatIpAddress(ipAddress);
            }
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                Enumeration<InetAddress> addresses = interfaces.nextElement().getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    if (!address.isLoopbackAddress() && (address instanceof Inet4Address)) {
                        return address.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Exception e) {
            return "";
        }
    }

    private static String getAliDriveApiUrl() {
        // Original AliDriveApi.r().c - reconstruct from config
        return "http://" + getLocalIpAddress() + ":5244";
    }

    private VodItem makeVodItem(String id, String name, String pic, String remark) {
        return new VodItem(id, name, name, pic, remark);
    }

    public static void startVpn() throws Exception {
        Intent intentPrepare = VpnService.prepare(Init.context());
        if (intentPrepare == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                Init.getActivity().startActivityForResult(null, 100);
            }
        } else {
            try {
                Init.getActivity().startActivityForResult(intentPrepare, 100);
            } catch (Exception e) {
                Log.w(TAG, "启动VPN失败: " + e.getMessage());
                throw e;
            }
        }
    }

    public String action(String actionName) {
        try {
            Runnable handler = this.actionHandlers.get(actionName);
            if (handler != null) {
                Init.run(handler);
            } else {
                Log.w(TAG, "未知操作: " + actionName);
            }
            return "";
        } catch (Exception e) {
            Log.w(TAG, "操作失败: " + e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public String categoryContent(String cateId, String page, boolean filterEnabled, HashMap<String, String> filters) {
        ArrayList<VodItem> items = new ArrayList<>();
        if ("1".equals(cateId)) {
            try {
                String pingUrl = getAliDriveApiUrl() + "/api/ping";
                String status = OkHttpUtil.string(pingUrl, new HashMap<>()).isEmpty() ? "未启动" : "已启动";
                items.add(makeVodItem("go代理状态", "go代理状态", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/14/68/e7/1468e7d6-a1d4-e561-ddce-e5c539a4c53f/AppIcon-0-0-1x_U007emarketing-0-4-85-220.png/350x350.png", status));
            } catch (Exception e) {
                items.add(makeVodItem("go代理状态", "go代理状态", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/14/68/e7/1468e7d6-a1d4-e561-ddce-e5c539a4c53f/AppIcon-0-0-1x_U007emarketing-0-4-85-220.png/350x350.png", "检查失败"));
            }
            items.add(makeVodItem("开启sing-box", "开启sing-box", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c4/25/60/c42560fd-bdd6-a6db-6fbf-0bf4017686d5/AppIcon-0-0-1x_U007emarketing-0-11-0-85-220.png/350x350.png", "开启sing-box"));
            items.add(makeVodItem("开启tgsou", "开启tgsou", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/15/f9/a4/15f9a4ec-71a6-732a-65ef-89dd9b69b8cf/AppIconLLC-0-0-1x_U007emarketing-0-8-0-0-85-220.png/350x350.png", "开启tgsou"));
            items.add(makeVodItem("开启alist", "开启alist", "https://tse3-mm.cn.bing.net/th/id/OIP-C.MeDRTpt92G3S-_kU9BZJEQHaHa?rs=1&pid=ImgDetMain", ALIST_URL));
            items.add(makeVodItem("开启filebrowser", "开启filebrowser", "https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/25/f7/fb/25f7fb4e-f365-3fc6-faed-5aca2925a679/AppIcon-1x_U007emarketing-0-7-0-85-220.png/350x350.png?", FILEBROWSER_URL));
        } else if ("2".equals(cateId)) {
            items.add(makeVodItem("网盘顺序、画质", "网盘顺序、画质", "https://example.com/icon.png", "网盘顺序、画质"));
            items.add(makeVodItem("原盘调用外部播放器", "原盘调用外部播放器", "https://p2.itc.cn/q_70/images03/20220512/0d79a8e7087440b8bc89659252bd6e7f.png", "原盘调用外部播放器"));
            items.add(makeVodItem("网盘下载开关", "网盘下载开关", "https://ts1.cn.mm.bing.net/th/id/R-C.b835f6ba65fadeaf12212ad75b1b7639?rik=Bd%2fdNYLXjLftMA&riu=http%3a%2f%2ffile.keoaeic.org%2fuploads%2fueditor%2fimage%2f20190408%2f%e4%b8%8b%e8%bd%bd%e5%9b%be%e6%a0%87.png&ehk=aYv%2b4gyYoOZ3uswYkr7BYnvi7PRvy0eOu3dzO3d7HNA%3d&risl=&pid=ImgRaw&r=0", "网盘下载开关"));
            if (NetPan.isAliPan("")) {
                items.add(makeVodItem("阿里线程", "阿里线程", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", "阿里线程"));
                items.add(makeVodItem("设置阿里token", "设置阿里token", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", "设置阿里token"));
            }
            if (NetPan.isBaidu("")) {
                items.add(makeVodItem("摆渡线程", "摆渡线程", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/df/92/ee/df92ee21-b113-91fd-d6a9-c63827f1ae28/AppIcon-0-0-1x_U007ephone-0-11-0-0-sRGB-85-220.png/350x350.png", "摆渡线程"));
            }
            if (NetPan.isQuark("")) {
                items.add(makeVodItem("夸克线程", "夸克线程", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "夸克线程"));
                items.add(makeVodItem("设置夸克 cookie", "设置夸克 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "设置夸克 cookie"));
                items.add(makeVodItem("清除本地夸克 cookie", "清除本地夸克 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png", "清除本地夸克 cookie"));
            }
            if (NetPan.isUc("")) {
                items.add(makeVodItem("UC线程", "UC线程", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "UC线程"));
                items.add(makeVodItem("设置UC cookie", "设置UC cookie", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "设置UC cookie"));
                items.add(makeVodItem("设置UC token", "设置UC token", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "设置UC token"));
                items.add(makeVodItem("清除本地UC授权", "清除本地UC授权", "https://ts1.cn.mm.bing.net/th/id/R-C.421c96e47df7c9719403654ee4f7c281?rik=yiiEoGCTgDDc3w&riu=http%3a%2f%2fpic.9663.com%2fupload%2f2023-5%2f20235111411256277.png&ehk=R81N%2flXMrl%2bxpRlST8DtHXDfab6rzaMb83gihuD71Fk%3d&risl=&pid=ImgRaw&r=0", "清除本地UC授权"));
            }
            if (NetPan.isYun115("")) {
                items.add(makeVodItem("设置115 cookie", "设置115 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "设置115 cookie"));
                items.add(makeVodItem("清除本地115 cookie", "清除本地115 cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "清除本地115 cookie"));
                items.add(makeVodItem("115安全删除码", "115安全删除码", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png", "115安全删除码"));
            }
            if (NetPan.isYun123("")) {
                items.add(makeVodItem("设置123盘账号", "设置123盘账号", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png", "设置123盘账号"));
                items.add(makeVodItem("清除本地_123账号密码", "清除本地_123账号密码", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c3/2b/fa/c32bfa72-c460-e1a4-d8a1-ba175f59bbce/AppIcon-0-0-1x_U007emarketing-0-8-0-85-220.png/350x350.png", "清除本地_123账号密码"));
            }
            if (NetPan.isGuangYa("")) {
                items.add(makeVodItem("设置光鸭token", "设置光鸭token", "https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256", "设置光鸭token"));
                items.add(makeVodItem("清除光鸭本地授权", "清除光鸭本地授权", "https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256", "清除光鸭本地授权"));
            }
            if (NetPan.isYunPan189("")) {
                items.add(makeVodItem("设置天意账号", "设置天意账号", "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/a8/fa/f0/a8faf032-0fa4-d9c5-ac70-920d9c84dff1/AppIcon-0-0-1x_U007emarketing-0-7-0-0-sRGB-85-220.png/350x350.png", "设置天意账号"));
            }
            if (NetPan.isYunPan139("")) {
                items.add(makeVodItem("设置异动cookie", "设置异动cookie", "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/87/17/34/871734bc-6a96-b3bb-55d4-72908f285eef/AppIcon-0-0-1x_U007ephone-0-5-0-85-220-0.png/460x0w.webp", "设置异动cookie"));
            }
            if (NetPan.isXunlei("")) {
                items.add(makeVodItem("设置迅雷账号", "设置迅雷账号", "https://pp.myapp.com/ma_icon/0/icon_113692_1776673175/256", "设置迅雷账号"));
                items.add(makeVodItem("清除迅雷本地账号", "清除迅雷本地账号", "https://pp.myapp.com/ma_icon/0/icon_113692_1776673175/256", "清除迅雷本地账号"));
            }
        }
        VodResult result = new VodResult();
        result.y(items);
        result.j(1, 1, 0, 1);
        return result.toString();
    }

    public String homeContent(boolean filterEnabled) {
        ArrayList categories = new ArrayList();
        categories.add(new CategoryItem("1", "应用中心"));
        categories.add(new CategoryItem("2", "网盘配置"));
        return VodResult.q(categories, new ArrayList());
    }

    @Override
    public void init(Context context, String str) {
        super.init(context, str);
        this.actionHandlers.put("开启filebrowser", () -> Log.w(TAG, "TODO: 启动 filebrowser"));
        this.actionHandlers.put("开启alist", () -> Log.w(TAG, "TODO: 启动 alist"));
        this.actionHandlers.put("开启sing-box", () -> Log.w(TAG, "TODO: 启动 sing-box"));
        this.actionHandlers.put("手动选择节点", () -> Log.w(TAG, "TODO: 手动选择节点"));
        this.actionHandlers.put("开启tgsou", () -> Log.w(TAG, "TODO: 启动 tgsou"));
        this.actionHandlers.put("go代理状态", () -> Log.w(TAG, "TODO: 检查代理状态"));
        this.actionHandlers.put("阿里线程", () -> Log.w(TAG, "TODO: 阿里线程设置"));
        this.actionHandlers.put("设置阿里token", () -> Log.w(TAG, "TODO: 设置阿里token"));
        this.actionHandlers.put("摆渡线程", () -> Log.w(TAG, "TODO: 摆渡线程设置"));
        this.actionHandlers.put("夸克线程", () -> Log.w(TAG, "TODO: 夸克线程设置"));
        this.actionHandlers.put("设置夸克 cookie", () -> Log.w(TAG, "TODO: 设置夸克cookie"));
        this.actionHandlers.put("清除本地夸克 cookie", () -> Log.w(TAG, "TODO: 清除夸克cookie"));
        this.actionHandlers.put("UC线程", () -> Log.w(TAG, "TODO: UC线程设置"));
        this.actionHandlers.put("设置UC cookie", () -> Log.w(TAG, "TODO: 设置UC cookie"));
        this.actionHandlers.put("设置UC token", () -> Log.w(TAG, "TODO: 设置UC token"));
        this.actionHandlers.put("UC UT", () -> Log.w(TAG, "TODO: UC UT"));
        this.actionHandlers.put("清除本地UC授权", () -> Log.w(TAG, "TODO: 清除UC授权"));
        this.actionHandlers.put("设置115 cookie", () -> Log.w(TAG, "TODO: 设置115 cookie"));
        this.actionHandlers.put("清除本地115 cookie", () -> Log.w(TAG, "TODO: 清除115 cookie"));
        this.actionHandlers.put("115安全删除码", () -> Log.w(TAG, "TODO: 115安全删除码"));
        this.actionHandlers.put("设置123盘账号", () -> Log.w(TAG, "TODO: 设置123盘账号"));
        this.actionHandlers.put("清除本地_123账号密码", () -> Log.w(TAG, "TODO: 清除123账号密码"));
        this.actionHandlers.put("设置光鸭token", () -> Log.w(TAG, "TODO: 设置光鸭token"));
        this.actionHandlers.put("清除光鸭本地授权", () -> Log.w(TAG, "TODO: 清除光鸭授权"));
        this.actionHandlers.put("设置异动cookie", () -> Log.w(TAG, "TODO: 设置异动cookie"));
        this.actionHandlers.put("设置天意账号", () -> Log.w(TAG, "TODO: 设置天意账号"));
        this.actionHandlers.put("设置迅雷账号", () -> Log.w(TAG, "TODO: 设置迅雷账号"));
        this.actionHandlers.put("清除迅雷本地账号", () -> Log.w(TAG, "TODO: 清除迅雷账号"));
        this.actionHandlers.put("网盘顺序、画质", () -> Log.w(TAG, "TODO: 网盘顺序画质设置"));
        this.actionHandlers.put("网盘下载开关", () -> Log.w(TAG, "TODO: 网盘下载开关"));
        this.actionHandlers.put("原盘调用外部播放器", () -> Log.w(TAG, "TODO: 原盘调用外部播放器"));
    }
}
