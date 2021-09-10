package com.ermao.chapter1_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ermao
 * Date: 2021/9/10 23:50
 */
public class ContainerTest {
	public static void main(String[] args) {
		circleDependency();
	}

	public static void circleDependency() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1_4.xml");
		A a = context.getBean("a", A.class);
//		B b = context.getBean("b", B.class);
		System.out.println(a.getB());
	}
}
