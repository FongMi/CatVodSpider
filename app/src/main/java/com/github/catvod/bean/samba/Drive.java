package com.github.catvod.bean.samba;

import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.hierynomus.smbj.SMBClient;
import com.hierynomus.smbj.auth.AuthenticationContext;
import com.hierynomus.smbj.connection.Connection;
import com.hierynomus.smbj.session.Session;
import com.hierynomus.smbj.share.DiskShare;

import java.lang.reflect.Type;
import java.util.List;

public class Drive {

    @SerializedName("name")
    private String name;
    @SerializedName("server")
    private String server;

    private Connection connection;
    private SMBClient smbClient;
    private DiskShare diskShare;
    private Session session;
    private String subPath;

    public static List<Drive> arrayFrom(String str) {
        Type listType = new TypeToken<List<Drive>>() {}.getType();
        return new Gson().fromJson(str, listType);
    }

    public Drive(String name) {
        this.name = name;
    }

    private String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getServer() {
        return TextUtils.isEmpty(server) ? "" : server;
    }

    public String getSubPath() {
        return TextUtils.isEmpty(subPath) ? "" : subPath;
    }

    public DiskShare getShare() {
        if (diskShare == null) init();
        return diskShare;
    }

    public Class toType() {
        return new Class(getName(), getName(), "1");
    }

    private void init() {
        try {
            smbClient = new SMBClient();
            Uri uri = Uri.parse(getServer());
            String[] parts = uri.getPath().substring(1).split("/", 2);
            connection = smbClient.connect(uri.getHost(), uri.getPort() != -1 ? uri.getPort() : SMBClient.DEFAULT_PORT);
            session = connection.authenticate(getAuthentication(uri));
            diskShare = (DiskShare) session.connectShare(parts[0]);
            subPath = parts.length > 1 ? parts[1] : "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private AuthenticationContext getAuthentication(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null) return AuthenticationContext.guest();
        String[] parts = userInfo.split(":", 2);
        String username = parts[0];
        char[] password = parts.length > 1 ? parts[1].toCharArray() : new char[0];
        return new AuthenticationContext(username, password, null);
    }

    public void release() {
        try {
            if (diskShare != null) diskShare.close();
            if (session != null) session.close();
            if (connection != null) connection.close();
            if (smbClient != null) smbClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection = null;
            diskShare = null;
            smbClient = null;
            session = null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Drive)) return false;
        Drive it = (Drive) obj;
        return getName().equals(it.getName());
    }
}
