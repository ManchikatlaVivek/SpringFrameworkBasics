package io.vlabs;

import java.util.List;

public class TrianglePoints {
	private List<Point> points;

	public TrianglePoints() {

	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {

		for (Point point : points) {
			System.out.println("Points are (" + point.getX() + " , " + point.getY() + ")");
		}
	}

}
