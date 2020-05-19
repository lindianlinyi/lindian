package com.lindian.common;

public enum ResultCode {

	
	SUCCESS(200,"操作成功"),
	FAILED(500,"操作失败"),
	VALIDATE_FAILED(404,"参数校验失败"),
	UNAUTHORIZED(401,"暂未登录或者token已经过期"),
	FORBIDEN(403,"没有访问权限");
	
	private long code;
	private String msg;
	private ResultCode(long code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
