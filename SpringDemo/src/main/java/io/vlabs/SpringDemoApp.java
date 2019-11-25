package io.vlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		TrianglePoints trianglePoints = (TrianglePoints)context.getBean("trianglePoints");
		trianglePoints.draw();

	}

}
