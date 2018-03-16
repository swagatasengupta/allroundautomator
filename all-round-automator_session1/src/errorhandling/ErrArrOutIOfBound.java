package errorhandling;

public class ErrArrOutIOfBound {

	public static void main(String[] args) {

		String[] strArr = { "A", "B", "C" };

		//Try 1
		try {

			// code block 1
			for (int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
			}
			// code block 2
			System.out.println(19 / 0);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out of Bound Exception Occured. This is a custom message.");
			customErrorDisplayGeneric(e);
		} catch (ArithmeticException err) {
			System.out.println("Arithmatic exception occured. Did you try to divide by zero? This is a custom message.");
			customErrorDisplayGeneric(err);
		} /*finally {
			System.out.println("finally block is reached");
		}*/

		
		//Try 2
		try {

			// code block 1
			for (int i = 0; i <= strArr.length; i++) {
				System.out.println(strArr[i]);
			}
			// code block 2
			System.out.println(19 / 0);

		} catch (Exception e) {
			customErrorDisplayGeneric(e);
/*			System.out.println("This is what you get when you to e.PrintStackTrace: ");
			e.printStackTrace();*/
			
			
		} finally {
			System.out.println("Second finally block is reached");
		}
		
	}

	public static void customErrorDisplayGeneric(Exception e) {
		System.out.println("Some error occured. This is a generic exception message.");
		System.out.println("More specific exception is: ");
		System.out.println("e.message: " + e.getMessage());
		System.out.println("e.toString: " + e.toString());
		StackTraceElement[] stelem = e.getStackTrace();
		System.out.println("printing stacktrace elemnts: ");
		for(StackTraceElement elem:stelem ) {
			System.out.println("element: " + elem.toString());
		}
	}
}
