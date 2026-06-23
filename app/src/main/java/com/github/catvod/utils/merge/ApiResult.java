package com.github.catvod.utils.merge;

/**
 * API 调用结果包装器
 * <p>
 * 成功时携带返回值，失败时携带错误信息
 */
public final class ApiResult {

    private final Object value;
    private final String error;

    private ApiResult(Object value, String error) {
        this.value = value;
        this.error = error;
    }

    /** 创建成功结果 */
    public static ApiResult success(Object value) {
        return new ApiResult(value, null);
    }

    /** 创建失败结果 */
    public static ApiResult error(String message) {
        return new ApiResult(null, message);
    }

    /** 是否成功 */
    public boolean isSuccess() {
        return error == null;
    }

    /** 获取结果值（失败时抛异常） */
    public Object getValue() {
        if (error != null) {
            throw new RuntimeException(error);
        }
        return value;
    }

    /** 获取错误信息 */
    public String getError() {
        return error;
    }
}
