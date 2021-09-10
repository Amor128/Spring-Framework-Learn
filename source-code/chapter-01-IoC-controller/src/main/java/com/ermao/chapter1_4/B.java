package com.ermao.chapter1_4;

/**
 * @author Ermao
 * Date: 2021/9/10 23:50
 */
public class B {
	private A a;
	private String value;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "B{" +
				", value='" + value + '\'' +
				'}';
	}
}
