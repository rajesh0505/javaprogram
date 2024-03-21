package com.ras.utils;

public class TestCaseDTO {

	String name;
	String time;
	String result;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "TestCase [name=" + name + ", time=" + time + ", result=" + result + "]";
	}
	
	
}
