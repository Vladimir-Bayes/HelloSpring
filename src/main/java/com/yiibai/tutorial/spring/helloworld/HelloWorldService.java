package com.yiibai.tutorial.spring.helloworld;
/** 
* @author 作者Vladimir E-mail: gyang.shines@gmail.com
* @version 创建时间：2017年12月8日 上午10:17:20 
* 类说明 
*/
public class HelloWorldService {
	
	private HelloWorld helloWorld;
	
	public HelloWorldService() {
		
	}

	public HelloWorld getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	
}
