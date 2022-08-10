package com.example.demo;

import com.example.demo.controller.*;

import org.junit.jupiter.api.Test;
// import all the static methods from the Assertions class, so we may use them in this class
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {
	@Test
	void hello() {
		HelloController controller = new HelloController(); // instance of the controller
		String response = controller.hello("Hello world"); // act
		assertEquals("Hello world", response); // assert
	}
}