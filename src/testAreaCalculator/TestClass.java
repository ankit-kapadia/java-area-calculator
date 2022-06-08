package testAreaCalculator;

import areaCalculator.*;

public class TestClass {

	public static void main(String[] args) throws Exception {
		Circle c = new Circle(3);
		System.out.println(c.getArea());
		Triangle t = new Triangle(2, 3);
		System.out.println(t.getArea());
	}
}
