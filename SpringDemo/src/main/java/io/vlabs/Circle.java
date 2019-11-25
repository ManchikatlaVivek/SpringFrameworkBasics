package io.vlabs;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Cirlce is Drawn");
		System.out.println("Circle Center: ( "+ center.getX()+" , "+center.getY()+" )");
	}

}
