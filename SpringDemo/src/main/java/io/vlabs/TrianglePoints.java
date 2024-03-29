package io.vlabs;

public class TrianglePoints implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;

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
		System.out.println("Triangle is Drawn");
		System.out.println("Point A: (" + pointA.getX() + " , " + pointA.getY() + ")");
		System.out.println("Point B: (" + pointB.getX() + " , " + pointB.getY() + ")");
		System.out.println("Point C: (" + pointC.getX() + " , " + pointC.getY() + ")");
	}

}
