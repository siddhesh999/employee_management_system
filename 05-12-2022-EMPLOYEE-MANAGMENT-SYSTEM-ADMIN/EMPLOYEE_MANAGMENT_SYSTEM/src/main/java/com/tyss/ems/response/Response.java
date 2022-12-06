package com.tyss.ems.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

	private boolean error;
	private String message;
	private Object data;
	

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Response [error=" + error + ", message=" + message + ", data=" + data + "]";
	}

	public Response(boolean error, String message, Object data) {
		super();
		this.error = error;
		this.message = message;
		this.data = data;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(boolean error, String message) {
		super();
		this.error = error;
		this.message = message;
	}
	
	

}
