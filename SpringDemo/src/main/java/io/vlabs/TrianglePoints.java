package io.vlabs;

public class TrianglePoints {
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
		System.out.println("Points are ("+pointA.getX()+" , "+pointA.getY()+")");
		System.out.println("Points are ("+pointB.getX()+" , "+pointB.getY()+")");
		System.out.println("Points are ("+pointC.getX()+" , "+pointC.getY()+")");
	}

}

