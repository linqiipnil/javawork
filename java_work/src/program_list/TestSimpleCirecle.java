package program_list;

public class TestSimpleCirecle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCircle circle = new SimpleCircle(1);

		System.out.println("The area of the circle of radius " + circle.radius + " is " + circle.getArea());

		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

	}
}

class SimpleCircle1 {
	double radius;

	SimpleCircle1() {
		radius = 1;
	}

	SimpleCircle1(double newRadius) {
		radius = newRadius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}
}