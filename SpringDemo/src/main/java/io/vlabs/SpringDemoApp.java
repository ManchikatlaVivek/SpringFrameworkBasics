package io.vlabs;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	

	public static void main(String[] args) {

		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		TrianglePoints trianglePoints = (TrianglePoints)context.getBean("trianglePoints");
		trianglePoints.draw();

	}

}
