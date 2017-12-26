package com.yiibai.tutorial.spring.helloworld.impl;

import com.yiibai.tutorial.spring.helloworld.HelloWorld;

/** 
* @author 作者Vladimir E-mail: gyang.shines@gmail.com
* @version 创建时间：2017年12月8日 上午10:20:43 
* 类说明 
*/
public class StrutsHelloWorld implements HelloWorld {
	@Override 
	public void sayHello() {
		System.out.println("Struts Say Hello");
	}

}
