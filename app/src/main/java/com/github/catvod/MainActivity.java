package com.github.catvod;

import android.app.Activity;
import android.os.Bundle;

import com.github.catvod.crawler.Spider;
import com.github.catvod.databinding.ActivityMainBinding;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.PTT;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;
    private ExecutorService executor;
    private Spider spider;
    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gson = new GsonBuilder().setPrettyPrinting().create();
        Logger.addLogAdapter(new AndroidLogAdapter());
        executor = Executors.newCachedThreadPool();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                initSpider();
            }
        });
        spider = new PTT();
        initView();
        initEvent();
    }

    private void initView() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    private void initEvent() {
        binding.home.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        homeContent();
                    }
                });
            }
        });
        binding.homeVideo.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        homeVideoContent();
                    }
                });
            }
        });
        binding.category.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        categoryContent();
                    }
                });
            }
        });
        binding.detail.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        detailContent();
                    }
                });
            }
        });
        binding.player.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        playerContent();
                    }
                });
            }
        });
        binding.search.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        searchContent();
                    }
                });
            }
        });
        binding.live.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        liveContent();
                    }
                });
            }
        });
        binding.proxy.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        proxy();
                    }
                });
            }
        });
    }

    private void initSpider() {
        try {
            Init.init(getApplicationContext());
            spider.init(this, "");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void homeContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.homeContent(true)));
            Init.post(new Runnable() {
                @Override
                public void run() {
                    binding.result.setText(result);
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void homeVideoContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.homeVideoContent()));
            Init.post(new Runnable() {
                @Override
                public void run() {
                    binding.result.setText(result);
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void categoryContent() {
        try {
            HashMap<String, String> extend = new HashMap<>();
            extend.put("c", "19");
            extend.put("year", "2024");
            String result = gson.toJson(JsonParser.parseString(spider.categoryContent("3", "2", true, extend)));
            Init.post(new Runnable() {
                @Override
                public void run() {
                    binding.result.setText(result);
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void detailContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.detailContent(java.util.Arrays.asList("78702"))));
            Init.post(new Runnable() {
                @Override
                public void run() {
                    binding.result.setText(result);
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void playerContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.playerContent("", "382044/1/78", new ArrayList<>())));
            Init.post(new Runnable() {
                @Override
                public void run() {
                    binding.result.setText(result);
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void searchContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.searchContent("我的人间烟火", false)));
            Init.post(new Runnable() {
                @Override
                public void run() {
                    binding.result.setText(result);
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void liveContent() {
        try {
            String result = gson.toJson(JsonParser.parseString(spider.liveContent("")));
            Init.post(new Runnable() {
                @Override
                public void run() {
                    binding.result.setText(result);
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void proxy() {
        try {
            Map<String, String> params = new HashMap<>();
            Logger.t("liveContent").d(spider.proxy(params));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}