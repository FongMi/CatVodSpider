package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.bean.danmu.DanmakuItem;
import com.github.catvod.danmu.SharedPreferencesService;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DanmakuUIHelper {

    // 定义统一的颜色常量 - 现代化配色方案
    private static final int PRIMARY_COLOR = 0xFF007AFF;        // 主色调蓝色 - 第一层(页签)
    private static final int PRIMARY_DARK = 0xFF0056B3;         // 深蓝色
    private static final int PRIMARY_LIGHT = 0xFF80BFFF;        // 浅蓝色
    private static final int SECONDARY_COLOR = 0xFFFF9500;      // 橙色 - 第二层(分组)
    private static final int SECONDARY_DARK = 0xFFCC7700;       // 深橙色
    private static final int SECONDARY_LIGHT = 0xFFFFB84D;      // 浅橙色
    private static final int TERTIARY_COLOR = 0xFF34C759;       // 绿色 - 第三层(结果)
    private static final int TERTIARY_DARK = 0xFF2D9D4F;        // 深绿色
    private static final int TERTIARY_LIGHT = 0xFF5ECA7C;       // 浅绿色
    private static final int ACCENT_COLOR = 0xFFFF9500;         // 橙色强调
    private static final int ACCENT_LIGHT = 0xFFFFB84D;         // 浅橙色
    private static final int SUCCESS_COLOR = 0xFF34C759;        // 绿色成功
    private static final int TEXT_PRIMARY = 0xFF1A1A1A;         // 深灰色主文本
    private static final int TEXT_SECONDARY = 0xFF666666;       // 中灰色副文本
    private static final int TEXT_TERTIARY = 0xFF999999;        // 浅灰色辅助文本
    private static final int BACKGROUND_LIGHT = 0xFFF8F9FA;     // 浅灰白背景
    private static final int BACKGROUND_WHITE = 0xFFFFFFFF;     // 纯白背景
    private static final int BORDER_COLOR = 0xFFE0E0E0;         // 边框色
    private static final int BORDER_LIGHT = 0xFFF0F0F0;         // 浅边框色
    private static final int FOCUS_HIGHLIGHT_COLOR = 0xFF80BFFF;// 焦点高亮色
    private static final int SHADOW_COLOR = 0x1A000000;         // 阴影色
    private static final int GRAY_INACTIVE = 0xFFBBBBBB;        // 灰色(未选中状态)


    /**
     * 排序状态标记 (false=正序, true=倒序)
     */
    private static boolean isReversed;
    /**
     * 当前选中的标签索引
     */
    private static List<DanmakuItem> currentItems = new ArrayList<>();


    // 显示配置对话框
    // 显示配置对话框
    public static void showConfigDialog(Context ctx) {
        // 添加检查
        if (!(ctx instanceof Activity)) {
            DanmakuSpider.log("错误：Context不是Activity");
            return;
        }
        Activity activity = (Activity) ctx;
        if (activity.isFinishing() || activity.isDestroyed()) {
            DanmakuSpider.log("Activity已销毁或正在销毁，不显示配置对话框");
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 在创建对话框前再次检查状态
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        DanmakuSpider.log("Activity已销毁，不显示配置对话框");
                        return;
                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);

                    LinearLayout mainLayout = new LinearLayout(activity);
                    mainLayout.setOrientation(LinearLayout.VERTICAL);
                    mainLayout.setBackgroundColor(BACKGROUND_WHITE);
                    mainLayout.setPadding(dpToPx(activity, 24), dpToPx(activity, 20), dpToPx(activity, 24), dpToPx(activity, 20));

                    // 标题 - 增强视觉效果
                    TextView title = new TextView(activity);
                    title.setText("Leo弹幕配置");
                    title.setTextSize(24);
                    title.setTextColor(PRIMARY_COLOR);
                    title.setGravity(Gravity.CENTER);
                    title.setPadding(0, dpToPx(activity, 8), 0, dpToPx(activity, 20));
                    title.setTypeface(null, android.graphics.Typeface.BOLD);
                    mainLayout.addView(title);

                    // 副标题说明
                    TextView subtitle = new TextView(activity);
                    subtitle.setText("配置弹幕搜索API地址");
                    subtitle.setTextSize(13);
                    subtitle.setTextColor(TEXT_SECONDARY);
                    subtitle.setGravity(Gravity.CENTER);
                    subtitle.setPadding(0, 0, 0, dpToPx(activity, 16));
                    mainLayout.addView(subtitle);

                    // IP地址提示 - 改进样式
                    TextView ipInfo = new TextView(activity);
                    String ip = NetworkUtils.getLocalIpAddress();
//                ipInfo.setText("Web配置: http://" + ip + ":9810");
                    ipInfo.setTextSize(13);
                    ipInfo.setTextColor(ACCENT_COLOR);
                    ipInfo.setGravity(Gravity.CENTER);
                    ipInfo.setPadding(dpToPx(activity, 12), dpToPx(activity, 8), dpToPx(activity, 12), dpToPx(activity, 12));
                    ipInfo.setBackgroundColor(0xFFFFF8E1);
                    mainLayout.addView(ipInfo);

                    // API输入框容器 - 改进样式
                    LinearLayout inputContainer = new LinearLayout(activity);
                    inputContainer.setOrientation(LinearLayout.VERTICAL);
                    inputContainer.setBackgroundColor(BORDER_LIGHT);
                    inputContainer.setPadding(dpToPx(activity, 2), dpToPx(activity, 2), dpToPx(activity, 2), dpToPx(activity, 2));
                    LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    containerParams.setMargins(0, dpToPx(activity, 12), 0, dpToPx(activity, 12));
                    inputContainer.setLayoutParams(containerParams);

                    EditText apiInput = new EditText(activity);
                    apiInput.setText(TextUtils.join("\n", DanmakuSpider.allApiUrls));
                    apiInput.setHint("每行一个API地址\n例如: https://example.com/danmu");
                    apiInput.setMinLines(4);
                    apiInput.setMaxLines(7);
                    apiInput.setBackgroundColor(BACKGROUND_WHITE);
                    apiInput.setTextColor(TEXT_PRIMARY);
                    apiInput.setTextSize(13);
                    apiInput.setPadding(dpToPx(activity, 12), dpToPx(activity, 12), dpToPx(activity, 12), dpToPx(activity, 12));
                    apiInput.setHintTextColor(TEXT_TERTIARY);

                    inputContainer.addView(apiInput);
                    mainLayout.addView(inputContainer);

                    // 分割线 - 改进样式
                    View divider = new View(activity);
                    divider.setBackgroundColor(BORDER_LIGHT);
                    LinearLayout.LayoutParams dividerParams = new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(activity, 1));
                    dividerParams.setMargins(0, dpToPx(activity, 16), 0, dpToPx(activity, 16));
                    divider.setLayoutParams(dividerParams);
                    mainLayout.addView(divider);

                    // 按钮布局 - 改进设计
                    LinearLayout btnLayout = new LinearLayout(activity);
                    btnLayout.setOrientation(LinearLayout.HORIZONTAL);
                    btnLayout.setGravity(Gravity.CENTER);

                    Button saveBtn = createStyledButton(activity, "保存", PRIMARY_COLOR);
                    Button clearBtn = createStyledButton(activity, "清空缓存", ACCENT_COLOR);
                    Button cancelBtn = createStyledButtonWithBorder(activity, "取消", PRIMARY_COLOR);

                    LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(
                            0, dpToPx(activity, 44), 1);
                    btnParams.setMargins(dpToPx(activity, 6), 0, dpToPx(activity, 6), 0);

                    saveBtn.setLayoutParams(btnParams);
                    clearBtn.setLayoutParams(btnParams);
                    cancelBtn.setLayoutParams(btnParams);

                    btnLayout.addView(saveBtn);
                    btnLayout.addView(clearBtn);
                    btnLayout.addView(cancelBtn);

                    mainLayout.addView(btnLayout);

                    builder.setView(mainLayout);
                    AlertDialog dialog = builder.create();
                    dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,
                            dpToPx(activity, 600)); // 设置固定高度

                    // 按钮事件
                    saveBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String text = apiInput.getText().toString();
                            String[] lines = text.split("\n");
                            Set<String> newUrls = new HashSet<>();
                            for (String line : lines) {
                                String trimmed = line.trim();
                                if (!TextUtils.isEmpty(trimmed) && trimmed.startsWith("http")) {
                                    newUrls.add(trimmed);
                                }
                            }

                            if (newUrls.isEmpty()) {
                                DanmakuSpider.safeShowToast(activity, "请输入有效的API地址");
                                return;
                            }

                            DanmakuSpider.allApiUrls.clear();
                            DanmakuSpider.allApiUrls.addAll(newUrls);
                            DanmakuConfigManager.saveConfig(activity, newUrls);

                            DanmakuSpider.safeShowToast(activity, "配置已保存");

                            DanmakuSpider.log("已保存API地址: " + newUrls);

                            dialog.dismiss();
                        }
                    });

                    clearBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                File cacheDir = new File(activity.getCacheDir(), "leo_danmaku_cache");
                                if (cacheDir.exists()) {
                                    File[] files = cacheDir.listFiles();
                                    if (files != null) {
                                        for (File f : files) f.delete();
                                    }
                                }
                                DanmakuScanner.lastDetectedTitle = "";
                                DanmakuSpider.resetAutoSearch();
                                DanmakuSpider.safeShowToast(activity, "缓存已清空");
                            } catch (Exception e) {
                                DanmakuSpider.safeShowToast(activity, "清空失败");
                            }
                        }
                    });

                    cancelBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    safeShowDialog(activity, dialog);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // 创建带边框的按钮 - 改进版本
    private static Button createStyledButtonWithBorder(Activity activity, String text, int color) {
        Button button = new Button(activity);
        button.setText(text);
        button.setTextColor(color);
        button.setBackground(createRoundedBorderDrawable(color));
        button.setTextSize(14);
        button.setTypeface(null, android.graphics.Typeface.BOLD);

        // 添加焦点效果
        button.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    // 获得焦点时显示填充背景
                    ((Button) v).setBackground(createRoundedBackgroundDrawable(PRIMARY_LIGHT));
                    ((Button) v).setTextColor(PRIMARY_COLOR);
                    v.setScaleX(1.08f);
                    v.setScaleY(1.08f);
                } else {
                    // 失去焦点时恢复边框样式
                    ((Button) v).setBackground(createRoundedBorderDrawable(color));
                    ((Button) v).setTextColor(color);
                    v.setScaleX(1.0f);
                    v.setScaleY(1.0f);
                }
            }
        });

        return button;
    }

    // 创建实心按钮 - 改进版本
    private static Button createStyledButton(Activity activity, String text, int backgroundColor) {
        Button button = new Button(activity);
        button.setText(text);
        button.setTextColor(Color.WHITE);
        button.setBackground(createRoundedBackgroundDrawable(backgroundColor));
        button.setTextSize(14);
        button.setTypeface(null, android.graphics.Typeface.BOLD);

        // 添加焦点效果
        button.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackground(createRoundedBackgroundDrawable(0xFF0052CC));
                    ((Button) v).setTextColor(Color.WHITE);
                    v.setScaleX(1.08f);
                    v.setScaleY(1.08f);
                } else {
                    ((Button) v).setBackground(createRoundedBackgroundDrawable(backgroundColor));
                    v.setScaleX(1.0f);
                    v.setScaleY(1.0f);
                }
            }
        });

        return button;
    }

    // 创建圆角背景 - 带阴影效果
    private static android.graphics.drawable.Drawable createRoundedBackgroundDrawable(int color) {
        android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(12); // 使用px单位的圆角半径
        drawable.setStroke(0, 0); // 无边框
        return drawable;
    }

    // 创建带边框的圆角背景
    private static android.graphics.drawable.Drawable createRoundedBorderDrawable(int color) {
        android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable();
        drawable.setColor(Color.TRANSPARENT);
        drawable.setStroke(2, color);
        drawable.setCornerRadius(12);
        return drawable;
    }

    // 创建渐变背景
    private static android.graphics.drawable.Drawable createGradientDrawable(int startColor, int endColor) {
        android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable(
                android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{startColor, endColor});
        drawable.setCornerRadius(12);
        return drawable;
    }

    // 安全显示对话框的辅助方法
    private static void safeShowDialog(Activity activity, AlertDialog dialog) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && !dialog.isShowing()) {
            try {
                dialog.show();
            } catch (Exception e) {
                DanmakuSpider.log("显示对话框失败: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            DanmakuSpider.log("Activity已销毁或对话框已在显示，无法显示对话框");
        }
    }


    // 显示日志对话框
    public static void showLogDialog(Context ctx) {
        // 添加检查
        if (!(ctx instanceof Activity)) {
            DanmakuSpider.log("错误：Context不是Activity");
            return;
        }

        Activity activity = (Activity) ctx;
        if (activity.isFinishing() || activity.isDestroyed()) {
            DanmakuSpider.log("Activity已销毁或正在销毁，不显示日志对话框");
            return;
        }
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 在创建对话框前再次检查状态
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        DanmakuSpider.log("Activity已销毁，不显示日志对话框");
                        return;
                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);

                    LinearLayout mainLayout = new LinearLayout(activity);
                    mainLayout.setOrientation(LinearLayout.VERTICAL);
                    mainLayout.setBackgroundColor(BACKGROUND_WHITE);

                    // 创建标题部分
                    LinearLayout titleLayout = new LinearLayout(activity);
                    titleLayout.setOrientation(LinearLayout.VERTICAL);
                    titleLayout.setBackgroundColor(PRIMARY_COLOR);
                    titleLayout.setPadding(dpToPx(activity, 20), dpToPx(activity, 16), dpToPx(activity, 20), dpToPx(activity, 16));

                    TextView titleText = new TextView(activity);
                    titleText.setText("Leo弹幕日志 - 打包时间：2026-01-03 23:47");
                    titleText.setTextSize(20);
                    titleText.setTextColor(Color.WHITE);
                    titleText.setTypeface(null, android.graphics.Typeface.BOLD);
                    titleLayout.addView(titleText);

                    mainLayout.addView(titleLayout);

                    // 内容区域
                    ScrollView scrollView = new ScrollView(activity);
                    scrollView.setBackgroundColor(BACKGROUND_LIGHT);
                    LinearLayout.LayoutParams scrollParams = new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT, 0, 1);
                    scrollView.setLayoutParams(scrollParams);

                    TextView logView = new TextView(activity);
                    logView.setText(DanmakuSpider.getLogContent());
                    logView.setTextSize(11);
                    logView.setTextColor(TEXT_SECONDARY);
                    logView.setPadding(dpToPx(activity, 16), dpToPx(activity, 16), dpToPx(activity, 16), dpToPx(activity, 16));
                    logView.setBackgroundColor(BACKGROUND_WHITE);
                    logView.setTypeface(android.graphics.Typeface.MONOSPACE);
                    logView.setLineSpacing(dpToPx(activity, 1), 1.4f);

                    scrollView.addView(logView);
                    mainLayout.addView(scrollView);

                    // 按钮区域
                    LinearLayout btnLayout = new LinearLayout(activity);
                    btnLayout.setOrientation(LinearLayout.HORIZONTAL);
                    btnLayout.setGravity(Gravity.CENTER);
                    btnLayout.setPadding(dpToPx(activity, 16), dpToPx(activity, 12), dpToPx(activity, 16), dpToPx(activity, 12));
                    btnLayout.setBackgroundColor(BACKGROUND_WHITE);

                    Button clearButton = createStyledButton(activity, "清空", ACCENT_COLOR);
                    Button closeButton = createStyledButtonWithBorder(activity, "关闭", PRIMARY_COLOR);

                    LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(
                            0, dpToPx(activity, 44), 1);
                    btnParams.setMargins(dpToPx(activity, 6), 0, dpToPx(activity, 6), 0);

                    clearButton.setLayoutParams(btnParams);
                    closeButton.setLayoutParams(btnParams);

                    btnLayout.addView(clearButton);
                    btnLayout.addView(closeButton);
                    mainLayout.addView(btnLayout);

                    builder.setView(mainLayout);
                    AlertDialog dialog = builder.create();
                    dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,
                            dpToPx(activity, 500));

                    clearButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            DanmakuSpider.clearLogs();
                            dialog.dismiss();
                            showLogDialog(ctx);
                        }
                    });

                    closeButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });

                    safeShowDialog(activity, dialog);
                } catch (Exception e) {
                    DanmakuSpider.log("显示日志对话框异常: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }


    // 显示搜索对话框
    public static void showSearchDialog(Activity activity, String initialKeyword) {
        // 检查Activity状态
        if (activity.isFinishing() || activity.isDestroyed()) {
            DanmakuSpider.log("Activity已销毁或正在销毁，不显示搜索对话框");
            return;
        }

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 在创建对话框前再次检查状态
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        DanmakuSpider.log("Activity已销毁，不显示搜索对话框");
                        return;
                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    LinearLayout mainLayout = new LinearLayout(activity);
                    mainLayout.setOrientation(LinearLayout.VERTICAL);
                    mainLayout.setBackgroundColor(BACKGROUND_WHITE);
                    // 减小主布局内边距，腾出空间
                    mainLayout.setPadding(dpToPx(activity, 15), dpToPx(activity, 10), dpToPx(activity, 15), dpToPx(activity, 10));

                    // 1. 缩小标题 [1]
                    TextView title = new TextView(activity);
                    title.setText("Leo弹幕搜索");
                    title.setTextSize(16); // 缩小字号
                    title.setTextColor(PRIMARY_COLOR);
                    title.setGravity(Gravity.CENTER);
                    title.setTypeface(null, android.graphics.Typeface.BOLD);
                    title.setPadding(0, dpToPx(activity, 2), 0, dpToPx(activity, 5));
                    mainLayout.addView(title);

                    // 搜索框容器 - 改进设计
                    LinearLayout searchLayout = new LinearLayout(activity);
                    searchLayout.setOrientation(LinearLayout.HORIZONTAL);
                    searchLayout.setPadding(0, 0, 0, dpToPx(activity, 4));
                    searchLayout.setGravity(Gravity.CENTER_VERTICAL);

                    final EditText searchInput = new EditText(activity);
                    searchInput.setHint("输入关键词搜索弹幕...");
                    // 优先读取缓存的手动输入值，如果没有则使用initialKeyword
                    String cachedKeyword = SharedPreferencesService.getSearchKeywordCache(activity, initialKeyword);
                    searchInput.setText(cachedKeyword);
                    searchInput.setHintTextColor(TEXT_TERTIARY);
                    searchInput.setBackgroundColor(BACKGROUND_LIGHT);
                    searchInput.setPadding(dpToPx(activity, 12), dpToPx(activity, 10), dpToPx(activity, 12), dpToPx(activity, 10));
                    searchInput.setTextSize(14);
                    searchInput.setTextColor(TEXT_PRIMARY);
                    LinearLayout.LayoutParams inputParams = new LinearLayout.LayoutParams(0, dpToPx(activity, 44), 1);
                    inputParams.setMargins(0, 0, dpToPx(activity, 4), 0);
                    searchInput.setLayoutParams(inputParams);

                    // 倒序按钮
                    Button reverseBtn = createStyledButton(activity, "↓↑", TERTIARY_LIGHT);
                    reverseBtn.setLayoutParams(new LinearLayout.LayoutParams(
                            dpToPx(activity, 50), dpToPx(activity, 44)));
                    reverseBtn.setTextSize(16);

                    Button searchBtn = createStyledButton(activity, "搜索", PRIMARY_COLOR);
                    searchBtn.setLayoutParams(new LinearLayout.LayoutParams(
                            dpToPx(activity, 70), dpToPx(activity, 44)));

                    searchLayout.addView(searchInput);
                    searchLayout.addView(reverseBtn);
                    searchLayout.addView(searchBtn);
                    mainLayout.addView(searchLayout);

                    // 页签容器 - 改进样式
                    LinearLayout tabContainer = new LinearLayout(activity);
                    tabContainer.setOrientation(LinearLayout.HORIZONTAL);
                    tabContainer.setPadding(0, dpToPx(activity, 4), 0, dpToPx(activity, 8));
                    tabContainer.setBackgroundColor(BACKGROUND_LIGHT);
                    LinearLayout.LayoutParams tabContainerParams = new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(activity, 48));
                    tabContainerParams.setMargins(0, dpToPx(activity, 2), 0, dpToPx(activity, 8));
                    tabContainer.setLayoutParams(tabContainerParams);
                    mainLayout.addView(tabContainer);

                    // 结果容器 - 改进样式
                    ScrollView resultScroll = new ScrollView(activity);
                    resultScroll.setBackgroundColor(BACKGROUND_WHITE);
                    LinearLayout resultContainer = new LinearLayout(activity);
                    resultContainer.setOrientation(LinearLayout.VERTICAL);
                    resultContainer.setPadding(0, 10, 0, 0);
                    resultContainer.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);

                    LinearLayout.LayoutParams scrollParams = new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(activity, 300));
                    scrollParams.weight = 1; // 设置权重让其尽可能占满空间
                    resultScroll.setLayoutParams(scrollParams);

                    resultScroll.addView(resultContainer);
                    mainLayout.addView(resultScroll);

                    builder.setView(mainLayout);
                    final AlertDialog dialog = builder.create();

                    // 倒序按钮事件
                    reverseBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            isReversed = !isReversed;
                            reverseBtn.setBackground(createRoundedBackgroundDrawable(isReversed ? ACCENT_COLOR : TERTIARY_LIGHT));

                            // 重新构建分组并显示
                            showResultsForTab(resultContainer, currentItems, activity, dialog);
                        }
                    });

                    // 搜索按钮事件
                    searchBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String keyword = searchInput.getText().toString().trim();
                            if (TextUtils.isEmpty(keyword)) {
                                DanmakuSpider.safeShowToast(activity, "请输入关键词");
                                return;
                            }

                            // 判断是否需要保存到缓存：
                            // 1. 如果用户输入的值与initialKeyword不同，保存该值到缓存
                            // 2. 如果用户改回initialKeyword，清空缓存（使用空字符串作为标记）
                            if (!keyword.equals(initialKeyword)) {
                                // 用户输入了不同的值，保存到缓存
                                SharedPreferencesService.saveSearchKeywordCache(activity, initialKeyword, keyword);
                                DanmakuSpider.log("已保存新的搜索缓存: " + initialKeyword + " -> " + keyword);
                            } else {
                                // 用户改回初始值，清空缓存
                                SharedPreferencesService.saveSearchKeywordCache(activity, initialKeyword, "");
                                DanmakuSpider.log("已清空搜索缓存: " + initialKeyword);
                            }

                            resultContainer.removeAllViews();
                            tabContainer.removeAllViews();
                            TextView loading = new TextView(activity);
                            loading.setText("正在搜索: " + keyword);
                            loading.setGravity(Gravity.CENTER);
                            loading.setPadding(0, 20, 0, 20);
                            loading.setTextColor(TEXT_SECONDARY);
                            resultContainer.addView(loading);

                            new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    List<DanmakuItem> results =
                                            LeoDanmakuService.manualSearch(keyword, activity);
                                    
                                    // 根据排序状态反转结果
                                    if (isReversed) {
                                        java.util.Collections.reverse(results);
                                    }

                                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                                        @Override
                                        public void run() {
                                            resultContainer.removeAllViews();
                                            tabContainer.removeAllViews();

                                            if (results.isEmpty()) {
                                                TextView empty = new TextView(activity);
                                                empty.setText("未找到结果");
                                                empty.setGravity(Gravity.CENTER);
                                                empty.setPadding(0, 50, 0, 50);
                                                empty.setTextColor(TEXT_SECONDARY);
                                                resultContainer.addView(empty);
                                                return;
                                            }

                                            // 按 from 属性分组结果
                                            java.util.Map<String, List<DanmakuItem>> groupedResults =
                                                    new java.util.HashMap<>();
                                            for (DanmakuItem item : results) {
                                                String from = item.from != null ? item.from : "默认";
                                                if (!groupedResults.containsKey(from)) {
                                                    groupedResults.put(from, new java.util.ArrayList<>());
                                                }
                                                groupedResults.get(from).add(item);
                                            }

                                            // 创建页签
                                            java.util.List<String> tabs = new java.util.ArrayList<>(groupedResults.keySet());
                                            java.util.Collections.sort(tabs);

                                            // 创建页签按钮 - 第一层级(蓝色)
                                            for (int i = 0; i < tabs.size(); i++) {
                                                String tabName = tabs.get(i);
                                                Button tabBtn = new Button(activity);
                                                tabBtn.setText(tabName);
                                                tabBtn.setTag(tabName);
                                                tabBtn.setTextSize(14);
                                                tabBtn.setTextColor(Color.WHITE);
                                                tabBtn.setPadding(15, 10, 15, 10);
                                                tabBtn.setBackground(createRoundedBackgroundDrawable(PRIMARY_COLOR));

                                                // 添加焦点效果 - 第一层级：深蓝色焦点
                                                tabBtn.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                                                    @Override
                                                    public void onFocusChange(View v, boolean hasFocus) {
                                                        if (hasFocus) {
                                                            // 焦点状态：深蓝色
                                                            v.setBackground(createRoundedBackgroundDrawable(PRIMARY_DARK));
                                                            v.setScaleX(1.08f);
                                                            v.setScaleY(1.08f);
                                                        } else {
                                                            // 检查是否为当前选中页签
                                                            String currentTabName = (String) v.getTag();
                                                            List<DanmakuItem> tabItems = groupedResults.get(currentTabName);
                                                            boolean containsLastUrl = false;
                                                            if (DanmakuSpider.lastDanmakuUrl != null && !DanmakuSpider.lastDanmakuUrl.isEmpty()) {
                                                                for (DanmakuItem item : tabItems) {
                                                                    if (item.getDanmakuUrl() != null && item.getDanmakuUrl().equals(DanmakuSpider.lastDanmakuUrl)) {
                                                                        containsLastUrl = true;
                                                                        break;
                                                                    }
                                                                }
                                                            }

                                                            if (containsLastUrl) {
                                                                v.setBackground(createRoundedBackgroundDrawable(PRIMARY_COLOR));
                                                            } else {
                                                                v.setBackground(createRoundedBackgroundDrawable(GRAY_INACTIVE));
                                                            }
                                                            v.setScaleX(1.0f);
                                                            v.setScaleY(1.0f);
                                                        }
                                                    }
                                                });

                                                LinearLayout.LayoutParams tabParams = new LinearLayout.LayoutParams(
                                                        0, ViewGroup.LayoutParams.MATCH_PARENT, 1);
                                                tabParams.setMargins(5, 0, 5, 0);
                                                tabBtn.setLayoutParams(tabParams);

                                                final int tabIndex = i;
                                                tabBtn.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v1) {
                                                        // 更新页签样式 - 只高亮当前选中的页签(蓝色)
                                                        for (int j = 0; j < tabContainer.getChildCount(); j++) {
                                                            Button btn = (Button) tabContainer.getChildAt(j);
                                                            if (j == tabIndex) {
                                                                btn.setBackground(createRoundedBackgroundDrawable(PRIMARY_COLOR));
                                                                ((Button) btn).setTextColor(Color.WHITE);
                                                            } else {
                                                                btn.setBackground(createRoundedBackgroundDrawable(GRAY_INACTIVE));
                                                                ((Button) btn).setTextColor(Color.WHITE);
                                                            }
                                                        }

                                                        // 显示对应页签的内容
                                                        showResultsForTab(resultContainer, groupedResults.get(tabName), activity, dialog);
                                                    }
                                                });

                                                tabContainer.addView(tabBtn);

                                                // 检查这个页签是否包含lastDanmakuUrl
                                                List<DanmakuItem> tabItems = groupedResults.get(tabName);
                                                boolean containsLastUrl = false;
                                                if (DanmakuSpider.lastDanmakuUrl != null && !DanmakuSpider.lastDanmakuUrl.isEmpty()) {
                                                    for (DanmakuItem item : tabItems) {
                                                        if (item.getDanmakuUrl() != null && item.getDanmakuUrl().equals(DanmakuSpider.lastDanmakuUrl)) {
                                                            containsLastUrl = true;
                                                            break;
                                                        }
                                                    }
                                                }

                                                // 只有当lastDanmakuUrl为空或空字符串时才默认选中第一个页签
                                                if (DanmakuSpider.lastDanmakuUrl == null || DanmakuSpider.lastDanmakuUrl.isEmpty()) {
                                                    // 默认选中第一个页签 - 蓝色
                                                    if (i == 0) {
                                                        tabBtn.setBackground(createRoundedBackgroundDrawable(PRIMARY_COLOR));
                                                        tabBtn.setTextColor(Color.WHITE);
                                                        showResultsForTab(resultContainer, groupedResults.get(tabName), activity, dialog);
                                                    } else {
                                                        // 其他页签设置为灰色背景
                                                        tabBtn.setBackground(createRoundedBackgroundDrawable(GRAY_INACTIVE));
                                                        tabBtn.setTextColor(Color.WHITE);
                                                    }
                                                } else {
                                                    // 如果lastDanmakuUrl不为空，只高亮包含该URL的页签，并选中展示其内容
                                                    if (containsLastUrl) {
                                                        tabBtn.setBackground(createRoundedBackgroundDrawable(PRIMARY_COLOR));
                                                        tabBtn.setTextColor(Color.WHITE);
                                                        showResultsForTab(resultContainer, groupedResults.get(tabName), activity, dialog);
                                                    } else {
                                                        tabBtn.setBackground(createRoundedBackgroundDrawable(GRAY_INACTIVE));
                                                        tabBtn.setTextColor(Color.WHITE);
                                                    }
                                                }
                                            }
                                        }
                                    });
                                }
                            }).start();
                        }
                    });

                    safeShowDialog(activity, dialog);

                    android.view.WindowManager.LayoutParams lp = new android.view.WindowManager.LayoutParams();
                    lp.copyFrom(dialog.getWindow().getAttributes());
                    lp.width = (int) (activity.getResources().getDisplayMetrics().widthPixels * 0.9); // 宽度占90%
                    lp.height = (int) (activity.getResources().getDisplayMetrics().heightPixels * 0.85); // 高度占85%
                    dialog.getWindow().setAttributes(lp);

                    // 自动触发搜索（优先使用缓存关键词，其次使用initialKeyword）
                    String keywordToSearch = SharedPreferencesService.getSearchKeywordCache(activity, initialKeyword);
                    if (!TextUtils.isEmpty(keywordToSearch)) {
                        searchBtn.performClick();
                    }
                } catch (Exception e) {
                    // 静默失败，避免闪退
                    DanmakuSpider.log("显示搜索对话框异常: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }

    // dp转px
    private static int dpToPx(Context context, int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }


    // 为指定页签显示结果
    private static void showResultsForTab(LinearLayout resultContainer, List<DanmakuItem> items,
                                          Activity activity, AlertDialog dialog) {
        resultContainer.removeAllViews();

        currentItems = items;

        if (items == null || items.isEmpty()) {
            TextView empty = new TextView(activity);
            empty.setText("该来源下无结果");
            empty.setGravity(Gravity.CENTER);
            empty.setPadding(0, 20, 0, 20);
            resultContainer.addView(empty);
            return;
        }

        // 按 animeTitle 分组
        java.util.Map<String, List<DanmakuItem>> animeGroups = new java.util.HashMap<>();
        for (DanmakuItem item : items) {
            String animeTitle = item.animeTitle != null ? item.animeTitle : item.title;
            if (!animeGroups.containsKey(animeTitle)) {
                animeGroups.put(animeTitle, new java.util.ArrayList<>());
            }
            animeGroups.get(animeTitle).add(item);
        }

        // 检查哪些分组包含上次使用的弹幕URL
        java.util.Set<String> groupsWithLastUrl = new java.util.HashSet<>();
        if (DanmakuSpider.lastDanmakuUrl != null) {
            for (java.util.Map.Entry<String, List<DanmakuItem>> entry : animeGroups.entrySet()) {
                String animeTitle = entry.getKey();
                List<DanmakuItem> animeItems = entry.getValue();
                for (DanmakuItem item : animeItems) {
                    if (item.getDanmakuUrl() != null && item.getDanmakuUrl().equals(DanmakuSpider.lastDanmakuUrl)) {
                        groupsWithLastUrl.add(animeTitle);
                        break;
                    }
                }
            }
        }

        // 用于跟踪当前选中的分组按钮
        final java.util.Map<String, Button> groupButtons = new java.util.HashMap<>();

        java.util.List<String> animeTitles = new java.util.ArrayList<>(animeGroups.keySet());
        java.util.Collections.sort(animeTitles);

        for (int groupIndex = 0; groupIndex < animeTitles.size(); groupIndex++) {
            String animeTitle = animeTitles.get(groupIndex);
            List<DanmakuItem> animeItems = animeGroups.get(animeTitle);

            if (animeItems.size() == 1) {
                DanmakuItem item = animeItems.get(0);
                Button resultItem = createResultButton(activity, item, dialog);
                resultContainer.addView(resultItem);
            } else {
                Button groupBtn = new Button(activity);
                groupBtn.setText(animeTitle + " (" + animeItems.size() + "集)");
                groupBtn.setPadding(20, 10, 20, 10);
                groupBtn.setTextSize(14);
                groupBtn.setTypeface(null, android.graphics.Typeface.BOLD);

                // 初始设置选中状态 - 第二层级：橙色
                if (groupsWithLastUrl.contains(animeTitle)) {
                    groupBtn.setBackground(createRoundedBackgroundDrawable(SECONDARY_COLOR));
                    groupBtn.setTextColor(Color.WHITE);
                } else {
                    groupBtn.setBackground(createRoundedBackgroundDrawable(0xFFE8E8E8));
                    groupBtn.setTextColor(TEXT_PRIMARY);
                }

                groupBtn.setClickable(true);
                groupBtn.setFocusable(true);

                // 保存按钮引用，用于管理选中状态
                groupButtons.put(animeTitle, groupBtn);

                // 添加焦点效果 - 第二层级：深橙色焦点
                groupBtn.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        Button button = (Button) v;
                        String title = null;

                        // 找到对应的标题
                        for (java.util.Map.Entry<String, Button> entry : groupButtons.entrySet()) {
                            if (entry.getValue() == v) {
                                title = entry.getKey();
                                break;
                            }
                        }

                        if (hasFocus) {
                            // 获得焦点时显示深橙色高亮
                            v.setBackground(createRoundedBackgroundDrawable(SECONDARY_DARK));
                            button.setTextColor(Color.WHITE);
                            v.setScaleX(1.06f);
                            v.setScaleY(1.06f);
                        } else {
                            // 失去焦点时，恢复到原始选中状态颜色
                            if (groupsWithLastUrl.contains(title)) {
                                v.setBackground(createRoundedBackgroundDrawable(SECONDARY_COLOR));
                                button.setTextColor(Color.WHITE);
                            } else {
                                v.setBackground(createRoundedBackgroundDrawable(0xFFE8E8E8));
                                button.setTextColor(TEXT_PRIMARY);
                            }
                            v.setScaleX(1.0f);
                            v.setScaleY(1.0f);
                        }
                    }
                });

                // 添加展开/收起状态标记
                int[] stateInfo = new int[]{0, 0}; // [isExpanded(0/1), childCount]
                groupBtn.setTag(stateInfo);

                // 点击分组按钮展开/收起内容
                groupBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 点击时更新选中状态 - 只有当前按钮保持选中状态(橙色)
                        for (java.util.Map.Entry<String, Button> entry : groupButtons.entrySet()) {
                            Button otherBtn = entry.getValue();
                            if (otherBtn == v) {
                                // 当前按钮选中 - 橙色
                                otherBtn.setBackground(createRoundedBackgroundDrawable(SECONDARY_COLOR));
                                otherBtn.setTextColor(Color.WHITE);
                                groupsWithLastUrl.clear();
                                groupsWithLastUrl.add(entry.getKey());
                            } else {
                                // 其他按钮取消选中 - 灰色
                                otherBtn.setBackground(createRoundedBackgroundDrawable(0xFFE8E8E8));
                                otherBtn.setTextColor(TEXT_PRIMARY);
                            }
                        }

                        int[] currentStateInfo = (int[]) groupBtn.getTag();
                        boolean isExpanded = currentStateInfo[0] == 1;

                        if (isExpanded) {
                            // 收起内容
                            int buttonIndex = resultContainer.indexOfChild(groupBtn);
                            int childCount = currentStateInfo[1];

                            for (int i = 0; i < childCount; i++) {
                                if (buttonIndex + 1 < resultContainer.getChildCount()) {
                                    resultContainer.removeViewAt(buttonIndex + 1);
                                }
                            }

                            currentStateInfo[0] = 0; // 未展开
                            currentStateInfo[1] = 0; // 子项数量
                            groupBtn.setText(animeTitle + " (" + animeItems.size() + "集)");
                        } else {
                            // 展开内容
                            int buttonIndex = resultContainer.indexOfChild(groupBtn);

                            sortResults(animeItems, isReversed);

                            for (int i = 0; i < animeItems.size(); i++) {
                                DanmakuItem item = animeItems.get(i);
                                Button subItem = createResultButton(activity, item, dialog);                            subItem.setPadding(40, 8, 20, 8);
                                resultContainer.addView(subItem, buttonIndex + 1 + i);
                            }

                            currentStateInfo[0] = 1; // 已展开
                            currentStateInfo[1] = animeItems.size(); // 子项数量
                            groupBtn.setText(animeTitle + " (" + animeItems.size() + "集) [-]");
                        }
                        groupBtn.setTag(currentStateInfo);

                        if (resultContainer.getParent() instanceof ScrollView) {
                            ScrollView scrollView = (ScrollView) resultContainer.getParent();
                            scrollView.post(new Runnable() {
                                @Override
                                public void run() {
                                    int scrollY = resultContainer.getTop() + groupBtn.getTop();
                                    scrollView.smoothScrollTo(0, scrollY);
                                }
                            });
                        }
                    }
                });

                resultContainer.addView(groupBtn);

                if (groupsWithLastUrl.contains(animeTitle)) {
                    groupBtn.post(new Runnable() {
                        @Override
                        public void run() {
                            groupBtn.performClick();
                            // 等待内容展开后再滚动到具体选中的子项
                            resultContainer.post(new Runnable() {
                                @Override
                                public void run() {
                                    // 寻找包含lastDanmakuUrl的具体子项
                                    View targetView = null;
                                    for (int i = 0; i < resultContainer.getChildCount(); i++) {
                                        View child = resultContainer.getChildAt(i);
                                        if (child instanceof Button && child.getTag() instanceof DanmakuItem) {
                                            DanmakuItem item = (DanmakuItem) child.getTag();
                                            if (item.getDanmakuUrl() != null &&
                                                    item.getDanmakuUrl().equals(DanmakuSpider.lastDanmakuUrl)) {
                                                targetView = child;
                                                break;
                                            }
                                        }
                                    }

                                    if (resultContainer.getParent() instanceof ScrollView) {
                                        ScrollView scrollView = (ScrollView) resultContainer.getParent();
                                        View finalTargetView = targetView;
                                        scrollView.post(new Runnable() {
                                            @Override
                                            public void run() {
                                                if (finalTargetView != null) {
                                                    // 滚动到具体选中的结果项
                                                    int scrollY = resultContainer.getTop() + finalTargetView.getTop();
                                                    scrollView.smoothScrollTo(0, scrollY);
                                                } else {
                                                    // 如果找不到目标项，滚动到分组按钮
                                                    int scrollY = resultContainer.getTop() + groupBtn.getTop();
                                                    scrollView.smoothScrollTo(0, scrollY);
                                                }
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    });
                }
            }
        }

        resultContainer.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);
    }

    private static void sortResults(List<DanmakuItem> results, boolean reversed) {
        java.util.Collections.sort(results, new java.util.Comparator<DanmakuItem>() {
            @Override
            public int compare(DanmakuItem item1, DanmakuItem item2) {
                // 基于 epId 进行排序，假设 epId 是 String 或可比较类型 [1]
                if (item1.epId == null || item2.epId == null) return 0;
                int cmp = item1.epId.compareTo(item2.epId);
                return reversed ? -cmp : cmp; // 根据状态决定正序或倒序
            }
        });
    }



    // 创建结果按钮的辅助方法 - 改进版本
    private static Button createResultButton(Activity activity, DanmakuItem item, AlertDialog dialog) {
        Button resultItem = new Button(activity);
        resultItem.setFocusable(true);
        resultItem.setFocusableInTouchMode(true);
        resultItem.setClickable(true);
        resultItem.setText(item.getTitleWithEp());
        resultItem.setTextSize(13);
        resultItem.setPadding(dpToPx(activity, 14), dpToPx(activity, 10), dpToPx(activity, 14), dpToPx(activity, 10));

        // 设置圆角背景 - 第三层级：绿色
        String currentDanmakuUrl = item.getDanmakuUrl();
        if (currentDanmakuUrl != null && currentDanmakuUrl.equals(DanmakuSpider.lastDanmakuUrl)) {
            // 高亮显示 - 使用绿色背景
            resultItem.setBackground(createRoundedBackgroundDrawable(TERTIARY_COLOR));
            resultItem.setTextColor(Color.WHITE);
        } else {
            // 普通显示
            resultItem.setBackground(createRoundedBackgroundDrawable(0xFFF0F0F0));
            resultItem.setTextColor(TEXT_PRIMARY);
        }

        // 设置布局参数 - 添加间距
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, dpToPx(activity, 6), 0, dpToPx(activity, 6));
        resultItem.setLayoutParams(params);

        resultItem.setTag(item);

        resultItem.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    // 获得焦点时的高亮效果 - 深绿色
                    v.setBackground(createRoundedBackgroundDrawable(TERTIARY_DARK));
                    ((Button) v).setTextColor(Color.WHITE);
                    v.setScaleX(1.06f);
                    v.setScaleY(1.06f);
                } else {
                    // 失去焦点时的恢复逻辑
                    DanmakuItem item_tag = (DanmakuItem) v.getTag();
                    String danmakuUrl = item_tag.getDanmakuUrl();

                    // 检查是否为上次使用的弹幕URL，如果是则保持高亮状态
                    if (danmakuUrl != null && danmakuUrl.equals(DanmakuSpider.lastDanmakuUrl)) {
                        v.setBackground(createRoundedBackgroundDrawable(TERTIARY_COLOR));
                        ((Button) v).setTextColor(Color.WHITE);
                    } else {
                        // 普通状态
                        v.setBackground(createRoundedBackgroundDrawable(0xFFF0F0F0));
                        ((Button) v).setTextColor(TEXT_PRIMARY);
                    }
                    v.setScaleX(1.0f);
                    v.setScaleY(1.0f);
                }
            }
        });

        resultItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                DanmakuItem selected = (DanmakuItem) v1.getTag();
                // 记录弹幕URL
                DanmakuSpider.recordDanmakuUrl(selected, false);
                LeoDanmakuService.pushDanmakuDirect(selected, activity, false);
                dialog.dismiss();
            }
        });

        return resultItem;
    }
}

