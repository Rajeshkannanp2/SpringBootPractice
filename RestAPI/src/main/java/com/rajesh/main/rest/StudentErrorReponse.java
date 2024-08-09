package com.rajesh.main.rest;

public class StudentErrorReponse {
	private int status;
	private String message;
	private long timestamp;
	
	public StudentErrorReponse() {
		super();
	}
	public StudentErrorReponse(int status, String message, long timestamp) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return "StudentErrorReponse [status=" + status + ", message=" + message + ", timestamp=" + timestamp + "]";
	}
	
	
}
