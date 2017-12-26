package com.yiibai.tutorial.spring;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiibai.tutorial.spring.helloworld.HelloWorld;
import com.yiibai.tutorial.spring.helloworld.HelloWorldService;

/** 
* @author 作者Vladimir E-mail: gyang.shines@gmail.com
* @version 创建时间：2017年12月8日 上午10:11:37 
* 类说明 
*/
public class HelloProgram {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		
		HelloWorld hw = service.getHelloWorld();
		
		hw.sayHello();
	}
}
