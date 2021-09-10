package com.ermao.chapter1_4;

/**
 * @author Ermao
 * Date: 2021/9/10 23:50
 */
public class A {
	private B b;
	private String value;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				", value='" + value + '\'' +
				'}';
	}
}
