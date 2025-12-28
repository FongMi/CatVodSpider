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
import android.widget.Toast;

import java.io.File;
import java.util.List;

public class DanmakuUIHelper {

    // 定义统一的颜色常量
    private static final int PRIMARY_COLOR = 0xFF007AFF;
    private static final int PRIMARY_DARK = 0xFF0056B3;
    private static final int ACCENT_COLOR = 0xFFFF9500;
    private static final int TEXT_PRIMARY = 0xFF333333;
    private static final int TEXT_SECONDARY = 0xFF666666;
    private static final int BACKGROUND_LIGHT = 0xFFF5F5F5;
    private static final int BACKGROUND_WHITE = 0xFFFFFFFF;
    private static final int BORDER_COLOR = 0xFFE0E0E0;


    // 显示配置对话框
    // 显示配置对话框
    public static void showConfigDialog(Context ctx) {
        // 添加检查
        if (!(ctx instanceof Activity)) {
            DanmakuSpider.log("错误：Context不是Activity");
            return;
        }
        Activity activity = (Activity) ctx;
        if (activity.isFinishing()) {
            DanmakuSpider.log("Activity已销毁，不显示配置对话框");
            return;
        }

        activity.runOnUiThread(() -> {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);

                LinearLayout mainLayout = new LinearLayout(activity);
                mainLayout.setOrientation(LinearLayout.VERTICAL);
                mainLayout.setBackgroundColor(BACKGROUND_WHITE);
                mainLayout.setPadding(40, 30, 40, 30);

                // 标题
                TextView title = new TextView(activity);
                title.setText("Leo弹幕配置");
                title.setTextSize(22);
                title.setTextColor(PRIMARY_COLOR);
                title.setGravity(Gravity.CENTER);
                title.setPadding(0, 0, 0, 25);
                title.setTypeface(null, android.graphics.Typeface.BOLD);
                mainLayout.addView(title);

                // IP地址提示
                TextView ipInfo = new TextView(activity);
                String ip = NetworkUtils.getLocalIpAddress();
                ipInfo.setText("Web配置: http://" + ip + ":9810");
                ipInfo.setTextSize(14);
                ipInfo.setTextColor(ACCENT_COLOR);
                ipInfo.setGravity(Gravity.CENTER);
                ipInfo.setPadding(0, 0, 0, 15);
                mainLayout.addView(ipInfo);

                // API输入框容器
                LinearLayout inputContainer = new LinearLayout(activity);
                inputContainer.setOrientation(LinearLayout.VERTICAL);
                inputContainer.setBackgroundColor(BORDER_COLOR);
                inputContainer.setPadding(2, 2, 2, 2);
                LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                inputContainer.setLayoutParams(containerParams);

                EditText apiInput = new EditText(activity);
                apiInput.setText(TextUtils.join("\n", DanmakuSpider.allApiUrls));
                apiInput.setHint("每行一个API地址\n例如: https://example.com/danmu");
                apiInput.setMinLines(5);
                apiInput.setMaxLines(8);
                apiInput.setBackgroundColor(BACKGROUND_WHITE);
                apiInput.setTextColor(TEXT_PRIMARY);
                apiInput.setPadding(15, 15, 15, 15);
                apiInput.setHintTextColor(TEXT_SECONDARY);

                inputContainer.addView(apiInput);
                mainLayout.addView(inputContainer);

                // 分割线
                View divider = new View(activity);
                divider.setBackgroundColor(BORDER_COLOR);
                LinearLayout.LayoutParams dividerParams = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, 1);
                dividerParams.setMargins(0, 20, 0, 20);
                divider.setLayoutParams(dividerParams);
                mainLayout.addView(divider);

                // 按钮布局
                LinearLayout btnLayout = new LinearLayout(activity);
                btnLayout.setOrientation(LinearLayout.HORIZONTAL);
                btnLayout.setGravity(Gravity.CENTER);

                Button saveBtn = createStyledButton(activity, "保存", PRIMARY_COLOR);
                Button clearBtn = createStyledButton(activity, "清空缓存", ACCENT_COLOR);
                Button cancelBtn = createStyledButtonWithBorder(activity, "取消", PRIMARY_COLOR);

                LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(
                        0, dpToPx(activity, 45), 1);
                btnParams.setMargins(8, 0, 8, 0);

                saveBtn.setLayoutParams(btnParams);
                clearBtn.setLayoutParams(btnParams);
                cancelBtn.setLayoutParams(btnParams);

                btnLayout.addView(saveBtn);
                btnLayout.addView(clearBtn);
                btnLayout.addView(cancelBtn);

                mainLayout.addView(btnLayout);

                builder.setView(mainLayout);
                AlertDialog dialog = builder.create();

                // 按钮事件
                saveBtn.setOnClickListener(v -> {
                    String text = apiInput.getText().toString();
                    String[] lines = text.split("\n");
                    List<String> newUrls = new java.util.ArrayList<>();
                    for (String line : lines) {
                        String trimmed = line.trim();
                        if (!TextUtils.isEmpty(trimmed) && trimmed.startsWith("http")) {
                            newUrls.add(trimmed);
                        }
                    }

                    if (newUrls.isEmpty()) {
                        Toast.makeText(activity, "请输入有效的API地址", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    DanmakuSpider.allApiUrls.clear();
                    DanmakuSpider.allApiUrls.addAll(newUrls);
                    DanmakuSpider.apiUrl = newUrls.get(0);
                    DanmakuConfigManager.saveConfig(activity, newUrls);

                    Toast.makeText(activity, "配置已保存", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                });

                clearBtn.setOnClickListener(v -> {
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
                        Toast.makeText(activity, "缓存已清空", Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        Toast.makeText(activity, "清空失败", Toast.LENGTH_SHORT).show();
                    }
                });

                cancelBtn.setOnClickListener(v -> dialog.dismiss());

                dialog.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    // 创建带边框的按钮
    private static Button createStyledButtonWithBorder(Activity activity, String text, int color) {
        Button button = new Button(activity);
        button.setText(text);
        button.setTextColor(color);
        button.setBackground(createRoundedBorderDrawable(color));
        button.setTextSize(14);
        button.setTypeface(null, android.graphics.Typeface.BOLD);
        return button;
    }

    // 创建实心按钮
    private static Button createStyledButton(Activity activity, String text, int backgroundColor) {
        Button button = new Button(activity);
        button.setText(text);
        button.setTextColor(Color.WHITE);
        button.setBackgroundColor(backgroundColor);
        button.setBackground(createRoundedBackgroundDrawable(backgroundColor));
        button.setTextSize(14);
        button.setTypeface(null, android.graphics.Typeface.BOLD);
        return button;
    }

    // 创建圆角背景
    private static android.graphics.drawable.Drawable createRoundedBackgroundDrawable(int color) {
        android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(25);
        return drawable;
    }

    // 创建带边框的圆角背景
    private static android.graphics.drawable.Drawable createRoundedBorderDrawable(int color) {
        android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable();
        drawable.setColor(Color.TRANSPARENT);
        drawable.setStroke(2, color);
        drawable.setCornerRadius(25);
        return drawable;
    }


    // 显示日志对话框
    // 显示日志对话框
    public static void showLogDialog(Context ctx) {
        // 添加检查
        if (!(ctx instanceof Activity)) {
            DanmakuSpider.log("错误：Context不是Activity");
            return;
        }

        Activity activity = (Activity) ctx;
        if (activity.isFinishing()) {
            DanmakuSpider.log("Activity已销毁，不显示配置对话框");
            return;
        }

        activity.runOnUiThread(() -> {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setTitle("Leo弹幕日志");

                ScrollView scrollView = new ScrollView(activity);
                scrollView.setBackgroundColor(BACKGROUND_LIGHT);

                TextView logView = new TextView(activity);
                logView.setText(DanmakuSpider.getLogContent());
                logView.setTextSize(12);
                logView.setTextColor(TEXT_SECONDARY);
                logView.setPadding(20, 20, 20, 20);
                logView.setBackgroundColor(BACKGROUND_WHITE);
                logView.setTypeface(android.graphics.Typeface.MONOSPACE);

                scrollView.addView(logView);
                builder.setView(scrollView);

                // 使用统一的按钮样式
                Button clearButton = createStyledButton(activity, "清空", ACCENT_COLOR);
                Button closeButton = createStyledButtonWithBorder(activity, "关闭", PRIMARY_COLOR);

                builder.setPositiveButton("关闭", null);
                builder.setNeutralButton("清空", (dialog, which) -> {
                    DanmakuSpider.clearLogs();
                    dialog.dismiss();
                    showLogDialog(ctx);
                });

                builder.show();
            } catch (Exception e) {
                DanmakuSpider.log("显示配置对话框异常: " + e.getMessage());
            }
        });
    }


    // 显示搜索对话框
    public static void showSearchDialog(Activity activity, String initialKeyword) {
        // 检查Activity状态
        if (activity == null || activity.isFinishing()) {
            DanmakuSpider.log("Activity不可用，不显示搜索对话框");
            return;
        }

        activity.runOnUiThread(() -> {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);

                LinearLayout mainLayout = new LinearLayout(activity);
                mainLayout.setOrientation(LinearLayout.VERTICAL);
                mainLayout.setBackgroundColor(BACKGROUND_WHITE);
                mainLayout.setPadding(30, 30, 30, 30);

                TextView title = new TextView(activity);
                title.setText("Leo弹幕搜索");
                title.setTextSize(20);
                title.setTextColor(PRIMARY_COLOR);
                title.setGravity(Gravity.CENTER);
                title.setTypeface(null, android.graphics.Typeface.BOLD);
                title.setPadding(0, 0, 0, 20);
                mainLayout.addView(title);

                // 搜索框容器
                LinearLayout searchLayout = new LinearLayout(activity);
                searchLayout.setOrientation(LinearLayout.HORIZONTAL);
                searchLayout.setPadding(0, 0, 0, 15);

                final EditText searchInput = new EditText(activity);
                searchInput.setHint("输入关键词");
                searchInput.setText(initialKeyword);
                searchInput.setBackgroundColor(BORDER_COLOR);
                searchInput.setPadding(15, 12, 15, 12);
                searchInput.setTextSize(16);
                searchInput.setLayoutParams(new LinearLayout.LayoutParams(
                        0, dpToPx(activity, 50), 1));

                Button searchBtn = createStyledButton(activity, "搜索", PRIMARY_COLOR);
                searchBtn.setLayoutParams(new LinearLayout.LayoutParams(
                        dpToPx(activity, 80), dpToPx(activity, 50)));

                searchLayout.addView(searchInput);
                searchLayout.addView(searchBtn);
                mainLayout.addView(searchLayout);

                // 页签容器
                LinearLayout tabContainer = new LinearLayout(activity);
                tabContainer.setOrientation(LinearLayout.HORIZONTAL);
                tabContainer.setPadding(0, 0, 0, 10);
                tabContainer.setBackgroundColor(BACKGROUND_LIGHT);
                tabContainer.setLayoutParams(new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(activity, 50)));
                mainLayout.addView(tabContainer);

                // 结果容器
                ScrollView resultScroll = new ScrollView(activity);
                LinearLayout resultContainer = new LinearLayout(activity);
                resultContainer.setOrientation(LinearLayout.VERTICAL);
                resultContainer.setPadding(0, 10, 0, 0);

                LinearLayout.LayoutParams scrollParams = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(activity, 400));
                resultScroll.setLayoutParams(scrollParams);
                resultScroll.addView(resultContainer);
                mainLayout.addView(resultScroll);

                builder.setView(mainLayout);
                final AlertDialog dialog = builder.create();

                // 搜索按钮事件
                searchBtn.setOnClickListener(v -> {
                    String keyword = searchInput.getText().toString().trim();
                    if (TextUtils.isEmpty(keyword)) {
                        Toast.makeText(activity, "请输入关键词", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    resultContainer.removeAllViews();
                    tabContainer.removeAllViews();
                    TextView loading = new TextView(activity);
                    loading.setText("正在搜索: " + keyword);
                    loading.setGravity(Gravity.CENTER);
                    loading.setPadding(0, 20, 0, 20);
                    loading.setTextColor(TEXT_SECONDARY);
                    resultContainer.addView(loading);

                    new Thread(() -> {
                        List<LeoDanmakuService.DanmakuItem> results =
                                LeoDanmakuService.manualSearch(keyword, activity);

                        new Handler(Looper.getMainLooper()).post(() -> {
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
                            java.util.Map<String, List<LeoDanmakuService.DanmakuItem>> groupedResults =
                                    new java.util.HashMap<>();
                            for (LeoDanmakuService.DanmakuItem item : results) {
                                String from = item.from != null ? item.from : "默认";
                                groupedResults.computeIfAbsent(from, k -> new java.util.ArrayList<>()).add(item);
                            }

                            // 创建页签
                            java.util.List<String> tabs = new java.util.ArrayList<>(groupedResults.keySet());
                            java.util.Collections.sort(tabs);

                            // 创建页签按钮
                            for (int i = 0; i < tabs.size(); i++) {
                                String tabName = tabs.get(i);
                                Button tabBtn = new Button(activity);
                                tabBtn.setText(tabName);
                                tabBtn.setTag(tabName);
                                tabBtn.setTextSize(14);
                                tabBtn.setTextColor(Color.WHITE);
                                tabBtn.setBackgroundColor(PRIMARY_COLOR);
                                tabBtn.setPadding(15, 10, 15, 10);
                                tabBtn.setBackground(createRoundedBackgroundDrawable(PRIMARY_COLOR));

                                LinearLayout.LayoutParams tabParams = new LinearLayout.LayoutParams(
                                        0, ViewGroup.LayoutParams.MATCH_PARENT, 1);
                                tabParams.setMargins(5, 0, 5, 0);
                                tabBtn.setLayoutParams(tabParams);

                                final int tabIndex = i;
                                tabBtn.setOnClickListener(v1 -> {
                                    // 更新页签样式 - 只高亮当前选中的页签
                                    for (int j = 0; j < tabContainer.getChildCount(); j++) {
                                        Button btn = (Button) tabContainer.getChildAt(j);
                                        if (j == tabIndex) {
                                            btn.setBackground(createRoundedBackgroundDrawable(PRIMARY_COLOR));
                                        } else {
                                            btn.setBackground(createRoundedBackgroundDrawable(0xFFCCCCCC)); // 灰色背景
                                        }
                                    }

                                    // 显示对应页签的内容
                                    showResultsForTab(resultContainer, groupedResults.get(tabName), activity, dialog);
                                });

                                tabContainer.addView(tabBtn);

                                // 检查这个页签是否包含lastDanmakuUrl
                                List<LeoDanmakuService.DanmakuItem> tabItems = groupedResults.get(tabName);
                                boolean containsLastUrl = false;
                                if (DanmakuSpider.lastDanmakuUrl != null && !DanmakuSpider.lastDanmakuUrl.isEmpty()) {
                                    for (LeoDanmakuService.DanmakuItem item : tabItems) {
                                        if (item.getDanmakuUrl() != null && item.getDanmakuUrl().equals(DanmakuSpider.lastDanmakuUrl)) {
                                            containsLastUrl = true;
                                            break;
                                        }
                                    }
                                }

                                // 只有当lastDanmakuUrl为空或空字符串时才默认选中第一个页签
                                if (DanmakuSpider.lastDanmakuUrl == null || DanmakuSpider.lastDanmakuUrl.isEmpty()) {
                                    // 默认选中第一个页签
                                    if (i == 0) {
                                        tabBtn.setBackground(createRoundedBackgroundDrawable(PRIMARY_COLOR));
                                        showResultsForTab(resultContainer, groupedResults.get(tabName), activity, dialog);
                                    } else {
                                        // 其他页签设置为灰色背景
                                        tabBtn.setBackground(createRoundedBackgroundDrawable(0xFFCCCCCC));
                                    }
                                } else {
                                    // 如果lastDanmakuUrl不为空，只高亮包含该URL的页签，并选中展示其内容
                                    if (containsLastUrl) {
                                        tabBtn.setBackground(createRoundedBackgroundDrawable(PRIMARY_COLOR));
                                        showResultsForTab(resultContainer, groupedResults.get(tabName), activity, dialog);
                                    } else {
                                        tabBtn.setBackground(createRoundedBackgroundDrawable(0xFFCCCCCC));
                                    }
                                }
                            }
                        });
                    }).start();
                });

                dialog.show();

                // 自动触发搜索（如果有初始关键词）
                if (!TextUtils.isEmpty(initialKeyword)) {
                    searchBtn.performClick();
                }

            } catch (Exception e) {
                // 静默失败，避免闪退
                DanmakuSpider.log("显示搜索对话框异常: " + e.getMessage());
            }
        });
    }

    // dp转px
    private static int dpToPx(Context context, int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }


    // 为指定页签显示结果
    private static void showResultsForTab(LinearLayout resultContainer, List<LeoDanmakuService.DanmakuItem> items,
                                          Activity activity, AlertDialog dialog) {
        resultContainer.removeAllViews();

        if (items == null || items.isEmpty()) {
            TextView empty = new TextView(activity);
            empty.setText("该来源下无结果");
            empty.setGravity(Gravity.CENTER);
            empty.setPadding(0, 20, 0, 20);
            resultContainer.addView(empty);
            return;
        }

        // 按 animeTitle 分组
        java.util.Map<String, List<LeoDanmakuService.DanmakuItem>> animeGroups = new java.util.HashMap<>();
        for (LeoDanmakuService.DanmakuItem item : items) {
            String animeTitle = item.animeTitle != null ? item.animeTitle : item.title;
            animeGroups.computeIfAbsent(animeTitle, k -> new java.util.ArrayList<>()).add(item);
        }

        // 检查哪些分组包含上次使用的弹幕URL
        java.util.Set<String> groupsWithLastUrl = new java.util.HashSet<>();
        if (DanmakuSpider.lastDanmakuUrl != null) {  // 只有在lastDanmakuUrl不为空时才检查
            for (java.util.Map.Entry<String, List<LeoDanmakuService.DanmakuItem>> entry : animeGroups.entrySet()) {
                String animeTitle = entry.getKey();
                List<LeoDanmakuService.DanmakuItem> animeItems = entry.getValue();
                for (LeoDanmakuService.DanmakuItem item : animeItems) {
                    if (item.getDanmakuUrl() != null && item.getDanmakuUrl().equals(DanmakuSpider.lastDanmakuUrl)) {
                        groupsWithLastUrl.add(animeTitle);
                        break; // 找到一个就够了
                    }
                }
            }
        }

        // 获取分组键的列表，保持顺序
        java.util.List<String> animeTitles = new java.util.ArrayList<>(animeGroups.keySet());
        java.util.Collections.sort(animeTitles); // 排序以确保一致性

        // 遍历每个 animeTitle 组
        for (int groupIndex = 0; groupIndex < animeTitles.size(); groupIndex++) {
            String animeTitle = animeTitles.get(groupIndex);
            List<LeoDanmakuService.DanmakuItem> animeItems = animeGroups.get(animeTitle);

            if (animeItems.size() == 1) {
                // 如果只有一个项目，直接显示按钮
                LeoDanmakuService.DanmakuItem item = animeItems.get(0);
                Button resultItem = createResultButton(activity, item, dialog);
                resultContainer.addView(resultItem);
            } else {
                // 如果有多个项目，创建分组按钮
                Button groupBtn = new Button(activity);
                groupBtn.setText(animeTitle + " (" + animeItems.size() + "集)");
                groupBtn.setPadding(20, 10, 20, 10);

                // 检查这个分组是否包含上次使用的弹幕URL，如果是则高亮显示
                if (groupsWithLastUrl.contains(animeTitle)) {
                    groupBtn.setBackgroundColor(PRIMARY_COLOR);
                    groupBtn.setTextColor(Color.WHITE);
                } else {
                    groupBtn.setTextColor(0xFF333333);
                    groupBtn.setBackgroundColor(0xFFDDDDDD);
                }

                groupBtn.setClickable(true);
                groupBtn.setFocusable(false);

                // 添加展开/收起状态标记和子项索引范围
                int[] stateInfo = new int[]{0, 0, 0}; // [isExpanded(0/1), startIndex, endIndex]
                groupBtn.setTag(stateInfo);

                // 点击分组按钮展开/收起内容
                groupBtn.setOnClickListener(v -> {
                    int[] currentStateInfo = (int[]) groupBtn.getTag();
                    boolean isExpanded = currentStateInfo[0] == 1;

                    if (isExpanded) {
                        // 收起内容 - 移除该分组的子项
                        int buttonIndex = resultContainer.indexOfChild(groupBtn);
                        int childCount = currentStateInfo[1];

                        // 从后往前删除指定数量的子项
                        for (int i = 0; i < childCount; i++) {
                            if (buttonIndex + 1 < resultContainer.getChildCount()) {
                                resultContainer.removeViewAt(buttonIndex + 1);
                            }
                        }

                        // 更新状态
                        currentStateInfo[0] = 0; // 未展开
                        currentStateInfo[1] = 0; // 子项数量
                        // 重新设置高亮状态
                        if (groupsWithLastUrl.contains(animeTitle)) {
                            groupBtn.setBackgroundColor(PRIMARY_COLOR);
                            groupBtn.setTextColor(Color.WHITE);
                        } else {
                            groupBtn.setTextColor(0xFF333333);
                            groupBtn.setBackgroundColor(0xFFDDDDDD);
                        }
                        groupBtn.setText(animeTitle + " (" + animeItems.size() + "集)");
                    } else {
                        // 展开内容 - 在当前按钮后插入子项
                        int buttonIndex = resultContainer.indexOfChild(groupBtn);

                        // 插入子项
                        for (int i = 0; i < animeItems.size(); i++) {
                            LeoDanmakuService.DanmakuItem item = animeItems.get(i);
                            Button subItem = createResultButton(activity, item, dialog);
                            subItem.setPadding(40, 8, 20, 8); // 增加左边距表示层级
                            resultContainer.addView(subItem, buttonIndex + 1 + i);
                        }

                        // 更新状态
                        currentStateInfo[0] = 1; // 已展开
                        currentStateInfo[1] = animeItems.size(); // 子项数量
                        // 重新设置高亮状态
                        if (groupsWithLastUrl.contains(animeTitle)) {
                            groupBtn.setBackgroundColor(PRIMARY_COLOR);
                            groupBtn.setTextColor(Color.WHITE);
                        } else {
                            groupBtn.setTextColor(0xFF333333);
                            groupBtn.setBackgroundColor(0xFFDDDDDD);
                        }
                        groupBtn.setText(animeTitle + " (" + animeItems.size() + "集) [-]");
                    }

                    // 更新按钮状态标记
                    groupBtn.setTag(currentStateInfo);
                });

                resultContainer.addView(groupBtn);

                // 自动展开包含lastDanmakuUrl的分组，而不是只展开第一个
                if (groupsWithLastUrl.contains(animeTitle)) {
                    // 模拟点击包含lastDanmakuUrl的分组按钮以展开它
                    groupBtn.post(() -> groupBtn.performClick());  // 使用post确保UI已更新
                }
            }
        }

        // 为结果容器启用焦点导航
        resultContainer.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);
    }


    // 创建结果按钮的辅助方法
    private static Button createResultButton(Activity activity, LeoDanmakuService.DanmakuItem item, AlertDialog dialog) {
        Button resultItem = new Button(activity);
        resultItem.setFocusable(true);
        resultItem.setFocusableInTouchMode(true);
        resultItem.setClickable(true);
        resultItem.setText(item.toString());
        resultItem.setPadding(20, 10, 20, 10);

        // 检查是否为上次使用的弹幕URL，如果是则高亮显示
        String currentDanmakuUrl = item.getDanmakuUrl();
        if (currentDanmakuUrl != null && currentDanmakuUrl.equals(DanmakuSpider.lastDanmakuUrl)) {
            // 高亮显示 - 使用主色调背景
            resultItem.setBackgroundColor(PRIMARY_COLOR);
            resultItem.setTextColor(Color.WHITE);
        } else {
            // 普通显示
            resultItem.setTextColor(0xFF333333);
            resultItem.setBackgroundColor(0xFFEEEEEE);
        }

        resultItem.setTag(item);

        resultItem.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setBackgroundColor(0xFF007AFF);
                    ((Button) v).setTextColor(Color.WHITE);
                    v.setScaleX(1.05f);
                    v.setScaleY(1.05f);
                } else {
                    // 如果是上次使用的URL，保持高亮状态
                    LeoDanmakuService.DanmakuItem item = (LeoDanmakuService.DanmakuItem) v.getTag();
                    String danmakuUrl = item.getDanmakuUrl();
                    if (danmakuUrl != null && danmakuUrl.equals(DanmakuSpider.lastDanmakuUrl)) {
                        v.setBackgroundColor(PRIMARY_COLOR);
                        ((Button) v).setTextColor(Color.WHITE);
                    } else {
                        v.setBackgroundColor(0xFFEEEEEE);
                        ((Button) v).setTextColor(0xFF333333);
                    }
                    v.setScaleX(1.0f);
                    v.setScaleY(1.0f);
                }
            }
        });

        resultItem.setOnClickListener(v1 -> {
            LeoDanmakuService.DanmakuItem selected =
                    (LeoDanmakuService.DanmakuItem) v1.getTag();
            String danmakuUrl = selected.getDanmakuUrl();
            // 记录弹幕URL
            DanmakuSpider.recordDanmakuUrl(danmakuUrl, false);
            LeoDanmakuService.pushDanmakuDirect(danmakuUrl, activity, false);
            dialog.dismiss();
        });

        return resultItem;
    }
}