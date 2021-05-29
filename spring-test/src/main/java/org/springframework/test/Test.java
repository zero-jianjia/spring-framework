package org.springframework.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jianjia
 * 2021/1/23
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);

//		context.refresh();
//
//		AClass bean = context.getBean(AClass.class);
//		System.out.println(bean);

	}
}
