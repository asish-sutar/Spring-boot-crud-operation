package com.crud.exception;

import lombok.Getter;

public class StudentNotFoundException extends RuntimeException {
	@Getter
	private Long id;

	public StudentNotFoundException(String msg) {
		super(msg);
	}

	public StudentNotFoundException(Long id, String msg) {
		super(msg);
		this.id = id;
	}

	public StudentNotFoundException(Long id, String msg, Throwable throwable) {
		super(msg, throwable);
		this.id = id;
	}

}
