package com.chat;

public class OutputMessage {

	String msg;
	String usr_name;

	public OutputMessage(String msg, String usr_name) {
		super();
		this.msg = msg;
		this.usr_name = usr_name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUsr_name() {
		return usr_name;
	}

	public void setUsr_name(String usr_name) {
		this.usr_name = usr_name;
	}

}
