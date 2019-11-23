package io.vlabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
//		triangle.draw();

//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle = (Triangle) factory.getBean("triangle");
//		triangle.draw();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		TrianglePoints trianglePoints = (TrianglePoints)context.getBean("trianglePoints");
		trianglePoints.draw();

	}

}
