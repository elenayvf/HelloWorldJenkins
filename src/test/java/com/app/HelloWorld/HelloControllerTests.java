package com.app.HelloWorld.hello;

import org.junit.Assert;
import org.junit.Test;


/** * Created by  * Sample junit test code to integrate by */
public class HelloControllerTests{    
	String message = "Hello World!";	
   
	@Test
	public void testPrintMessage() {
	   Assert.assertTrue(HelloController.sayHello() == "Hello World! ");
	}


}