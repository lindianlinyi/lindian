package com.lindian.common;

public class CommonResult<T> {
	
	private long code;
	private String msg;
	private T data;
	
	public CommonResult(long code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	/**
	 * 成功返回
	 * @param data 返回的数据
	 * @return
	 */
	public static <T> CommonResult<T> success(T data){
		
		
		return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg(),data);
	}

	/**
	 * 失败返回
	 * @param data
	 * @return
	 */
	public static <T> CommonResult<T> failed(){
		
		
		return new CommonResult<T>(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMsg(),null);
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
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
