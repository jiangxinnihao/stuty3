package com.example.msgapp;



public class Msg {
	public final static int RMSG=0;
	public final static int SMSG=1;
	public Msg(String msg, int msgtype) {
		super();
		this.msg = msg;
		this.msgtype = msgtype;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getMsgtype() {
		return msgtype;
	}
	public void setMsgtype(int msgtype) {
		this.msgtype = msgtype;
	}
	private String msg;
	private int msgtype;
	

}
