package net.sunofbeach.blog.response;

public enum ResponseState {
    // enum 枚举 即此方法只有成功和失败
    SUCCESS(true,20000,"操作成功"),
    LOGIN_SUCCESS(true,20001,"登录成功"),
    FAILED(false,40000,"操作失败"),
    GET_RESOURCE_FAILED(false,40001,"获取资源失败"),
    LOGIN_FAILED(false,49999,"登录失败");

    ResponseState(boolean success,int code,String message){
       this.code=code;
       this.success=success;
       this.message=message;
    }

    private int code;
    private String message;
    private boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
