package com.github.catvod.bean.yun139;

import java.util.List;

/**
 * Yun139 data container within response (replaces eVar.c in Z.e)
 */
public class Yun139Data {
    /** List of folders in the share */
    public List<Yun139Folder> b;

    /** List of files in the share */
    public List<Yun139File> c;

    /** Title of the share (eVar.c.h) */
    public String h;

    public List<Yun139Folder> getFolders() { return b; }
    public List<Yun139File> getFiles() { return c; }
    public String getTitle() { return h; }
}
