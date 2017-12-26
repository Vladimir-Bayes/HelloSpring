package com.yiibai.tutorial.spring.helloworld.impl;

import com.yiibai.tutorial.spring.helloworld.HelloWorld;

/** 
* @author 作者Vladimir E-mail: gyang.shines@gmail.com
* @version 创建时间：2017年12月8日 上午10:18:55 
* 类说明 
*/
public class SpringHelloWorld implements HelloWorld {
	@Override
	public void sayHello() {
		System.out.println("Spring Say HelloWorld");
	}
}
