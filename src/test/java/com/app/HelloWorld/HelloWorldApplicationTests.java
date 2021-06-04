package com.app.HelloWorld;


import org.junit.Assert;
import org.junit.Test;

public class HelloWorldApplicationTests {

	String message = "Hello World!";	
   
	@Test
	public void testPrintMessage() {
	   Assert.assertTrue(message == "Hello World! ");
	}
}
