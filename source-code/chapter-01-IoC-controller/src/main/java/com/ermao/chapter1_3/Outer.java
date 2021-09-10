package com.ermao.chapter1_3;

/**
 * @author Ermao
 * Date: 2021/9/10 20:26
 */
public class Outer {
	private String outer;

	public static class Inner {
		private String inner;

		public String getInner() {
			return inner;
		}

		public void setInner(String inner) {
			this.inner = inner;
		}
	}

	public String getOuter() {
		return outer;
	}

	public void setOuter(String outer) {
		this.outer = outer;
	}
}
