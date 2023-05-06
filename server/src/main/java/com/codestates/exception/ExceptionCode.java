package com.codestates.exception;

import lombok.Getter;
public enum ExceptionCode {
	BOARD_NOT_FOUND(404,"Board not found"),
	COMMENT_NOT_FOUND(404, "Comment not found"),
  MEMBER_NOT_FOUND(404, "Member not found"),
  MEMBER_EXISTS(409, "Member exists");
  
	@Getter
	private int status;
	@Getter
	private String message;

	ExceptionCode(int code, String message) {
		this.status = code;
		this.message = message;
	}
}
