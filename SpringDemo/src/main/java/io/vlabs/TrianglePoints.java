package io.vlabs;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TrianglePoints implements ApplicationContextAware, BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
	public TrianglePoints() {
		
	}

	public TrianglePoints(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Points are ("+pointA.getX()+" , "+pointA.getY()+")");
		System.out.println("Points are ("+pointB.getX()+" , "+pointB.getY()+")");
		System.out.println("Points are ("+pointC.getX()+" , "+pointC.getY()+")");
	}
	

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name is: "+name);
		
	}

}
