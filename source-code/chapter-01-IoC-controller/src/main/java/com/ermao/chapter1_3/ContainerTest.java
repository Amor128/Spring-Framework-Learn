package com.ermao.chapter1_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ermao
 * Date: 2021/9/10 20:34
 */
public class ContainerTest {
	public static void main(String[] args) {
		InstantiateInnerClass();
	}

	public static void InstantiateInnerClass() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1_3.xml");
		Outer.Inner inner = context.getBean("inner", Outer.Inner.class);
		Outer outer = context.getBean("outer", Outer.class);
		System.out.println(outer.getOuter());
		System.out.println(inner.getInner());
	}
}
