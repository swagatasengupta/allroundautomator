package calculator;

//note S and C are capital in the class name as per good coding convention
public class SimpleCalculator1 {

	//this function is for supporting addition functionality
	double add(double a, double b) {
		return (a + b);
	}

	//this function is for supporting multiplication functionality
	double multiply(double a, double b) {
		return (a * b);
	}

	//this function is for supporting division functionality
	double divide(double a, double b) {
		return (a / b);
	}

	//this function is for supporting subtraction functionality
	double subtract(double a, double b) {
		return (a - b);
	}

	public static void main(String[] args) {
		SimpleCalculator1 calc = new SimpleCalculator1();
		System.out.println("calc add 9+10.2: " + calc.add(9, 10.2));
		System.out.println("calc add 5+5: " + calc.add(5, 5));
		System.out.println("calc multiply 14.6 x 19.2: " + calc.multiply(14.6, 19.2));
		System.out.println("calc divide 79 / 8.6: " + calc.divide(79, 8.6));
		System.out.println("calc subtract 12 - 9: " + calc.subtract(12, 9));
	}
}
