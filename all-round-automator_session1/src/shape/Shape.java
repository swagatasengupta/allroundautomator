package shape;

//assuming shape is only applicable for quadrilaterals and cuboids
public class Shape {

	double length, breadth, height;
	
	Shape(){
		// note "this" keyword is not mandatory.
		// it only means you are referring to member attribute of current class
		// and not any other variable, in case you are getting any from passed on from outside.
/*		this.length = 0;
		this.breadth = 0;
		this.height = 0;*/
		length = 0;
		breadth = 0;
		height = 0;
	}

	Shape(double length, double breadth, double height){
		// note in this case, this keyword is useful and required.
		// it only means you are referring to member attribute of current class
		// and not any other variable, in case you are getting any from passed on from outside.
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	Shape(double length){
		// note in this case, this keyword is useful and required.
		// it only means you are referring to member attribute of current class
		// and not any other variable, in case you are getting any from passed on from outside.
		this.length = this.breadth = this.height = length;
	}
	
	public double surfaceArea() {
		
		return (2.0 * 
					(
							(length * breadth) +
							(breadth * height) +
							(height * length)
					)
				);
	};

	public double volume() {
		return (length * breadth * height);
	};
	
	private boolean isInputNonZero(double input) {
		
		if(input > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Shape square1 = new Shape();
		square1.length = square1.height = square1.breadth = 3.0;
		System.out.println("square1.surfaceArea(): " + square1.surfaceArea() + " square units");
		System.out.println("square1.volume(): " + square1.volume() + " cubic units");

		Shape square2 = new Shape(4.0);
		System.out.println("square2.surfaceArea(): " + square2.surfaceArea() + " square units");
		System.out.println("square2.volume(): " + square2.volume() + " cubic units");

		
		Shape cuboid = new Shape(2.0, 3.0, 4.0);
		System.out.println("cuboid.surfaceArea(): " + cuboid.surfaceArea() + " square units");
		System.out.println("cuboid.volume(): " + cuboid.volume() + " cubic units");
		
	}

}
