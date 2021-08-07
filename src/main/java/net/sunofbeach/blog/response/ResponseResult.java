package net.sunofbeach.blog.response;

public class ResponseResult {
    private boolean success;
    private int code;
    private String message;
    private Object data;

    public ResponseResult(ResponseState responseState){
        this.success = responseState.isSuccess();
        this.code = responseState.getCode();
        this.message = responseState.getMessage();
    }

    public static ResponseResult SUCCESS(){
        return new ResponseResult(ResponseState.SUCCESS);
    }

    public static ResponseResult SUCCESS(String message){
        ResponseResult responseResult =new ResponseResult(ResponseState.SUCCESS);
        responseResult.setMassage(message);
        return responseResult;
    }

    public static ResponseResult FAILED(String message){
        ResponseResult responseResult=new ResponseResult(ResponseState.FAILED);
        responseResult.setMassage(message);
        return responseResult;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMassage() {
        return message;
    }

    public void setMassage(String massage) {
        this.message = massage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
