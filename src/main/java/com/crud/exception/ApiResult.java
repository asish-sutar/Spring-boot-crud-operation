package com.crud.exception;

import lombok.Data;

@Data
public class ApiResult<T> {
	private Long id;
	private String message;
	private T data;

	private ApiResult(Long code, String message) {
		this.id = code;
		this.message = message;
	}

	private ApiResult(int code, String message) {
		this.id = (long) code;
		this.message = message;
	}

	public static <T> ApiResult<T> success(T data) {
		ApiResult<T> result = new ApiResult<>(200, "Success");
		result.setData(data);
		return result;
	}

	public static <T> ApiResult<T> fail(Long code, String message) {
		return new ApiResult<>(code, message);
	}
}
