package com.ermao.chapter1_2;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * 这个文件演示最基本的 Spring 的使用
 * @author Ermao
 * Date: 2021/9/10 18:27
 */
public class ContainerTest {
	public static void main(String[] args) {
		registerOuterObject();
	}

	public static void traditionalWay() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1_2.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}

	public static void registerOuterObject() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1_2.xml");
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();


		Person person = new Person();
		person.setName("Ermao");
		person.setAge(19);
		beanFactory.registerSingleton("myPerson", person);

		System.out.println("是否注册了person: " + beanFactory.containsSingleton("myPerson"));
		System.out.println("所有单例bean: " + Arrays.toString(beanFactory.getSingletonNames()));


		Person originPerson = context.getBean("person", Person.class);

		Person ioCPerson = (Person) context.getBean("myPerson");
		System.out.println("IoC 容器里面添加的外部person\t\t\t\t" + ioCPerson.hashCode());
		System.out.println("往 IoC 容器里面添加的person\t\t\t\t" + person.hashCode());
		System.out.println("IoC 容器里面的person（从配置文件初始化）\t\t" + originPerson.hashCode());

	}
}
