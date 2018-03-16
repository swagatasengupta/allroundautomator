package regex;

public class RegExAssignment {

	public static void main(String[] args) {

		String creditCardRegEx="(\\d{4}[\\s-]?){3}\\d{4}";
		System.out.println("2342-7642-8363-8368".matches(creditCardRegEx));
		System.out.println("2342 7642 8363 8368".matches(creditCardRegEx));
		System.out.println("2342764283638368".matches(creditCardRegEx));
		//validates a password that contains
		//at least 1 digit
		//at least one lower case letter
		//at least one upper case letter
		//at least one special character within a specific group
		String passwordRegEx = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{4,20})";
		System.out.println("98hT#".matches(passwordRegEx));
		System.out.println("s#T1".matches(passwordRegEx));
		System.out.println("Test@123".matches(passwordRegEx));
		System.out.println("myP@s$w0rd@123".matches(passwordRegEx));
		
	}

}
