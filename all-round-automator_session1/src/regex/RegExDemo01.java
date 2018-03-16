package regex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegExDemo01 {

	public static void main(String[] args) {

		/* 		String str1 = "So";
		System.out.println(str1.matches("^(S|s).*$")); //Starts with S
		System.out.println("tegksdf9862343st".matches("^t.*t$"));
		System.out.println("tilt".matches("t..t"));//. means any character
		System.out.println("tmmmmt".matches("tm*t"));//. means any character
		System.out.println("tt".matches("t.*t"));//* means 0 or more characters
		System.out.println("trumpet".matches("t.*t"));
		System.out.println("tnt".matches("tn+t"));// + means at least one character in between
		System.out.println("tt".matches("t.+t")); // returns false
		System.out.println("t23754928734t".matches("^t.*")); // starts with t. ^ stands for starts with
		System.out.println("test of a lifetime".matches("^t.*")); // starts with t. ^ stands for starts with
		System.out.println("t.".matches("^t.*\\.$")); // starts with t and ends with t as well. $ stands for ends with
				//  \\. has to be given to specify . character as it is a special character used in regex
		System.out.println("z".matches("[xyz]")); // Either of the characters in square brackets
		System.out.println("z".matches("(x|y|z)")); // Either of the characters in square brackets
		System.out.println("zaasbbcd".matches("[a-z]+")); // any of the characters in square brackets range. Any character within a-z range
		System.out.println("aGHFJHtaKjhjkd".matches("([a-z]|[A-Z])+")); // any of the characters in square brackets range. Any character within a-z range
		System.out.println("-178360165465468273630".matches("\\-[0-9]+")); // any integer with 0 or multiple - sign before it
		System.out.println("17836018273630".matches("\\-?[0-9]+")); // positive or -ve integer
		System.out.println("zAasBbcd".matches("([a-z]|[A-Z])+")); // Case insensitive any character within a-z range
		System.out.println("$^&%([]*".matches("[\\[\\{$&+,:;=?@#|'<>.-^*()%!\\]\\}]+")); // Checks for one or more special characters
		System.out.println("45".matches("\\d{2}")); // Checks digits exactly 2 times
		System.out.println("XYZ45JJ8765".matches("^[A-Z]{3}\\d{2}[A-Z]{2}\\d{4}$")); // Checks for A-Z 3 characters followed by 2 digits followed by A-Z 2 characters followed by 4 digits
		System.out.println("test@abc.a.in".matches("\\w+@(\\w+\\.)+\\w+")); //checks for email format
		System.out.println("28764".matches("\\d{2,5}(\\.\\d{1,2})*")); //checks for 2 - 5 digit numbers
		System.out.println("223.13".matches("\\d{2,5}(\\.\\d{1,2})*")); //checks for 2 - 5 digit numbers with or without decimals up to 2 places
		System.out.println("https://domainname.org".matches("^http[s]?://\\w+\\.(com|net|org)$")); // to check a URL is http or https and ends with .com, .org or .net
		System.out.println("03:59 aM".matches("(1[0-2]|0?[1-9])\\:[0-5][0-9]\\s([aApP][mM])")); // Time format in AM/PM
		System.out.println("0:00:00".matches("([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")); // Time format in 24 hours
		System.out.println("192.168.1.100".matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$")); // IP format but does not validate numbers above 256
		System.out.println("256.256.256.256".matches("^(([0-9]|[0-9]{2}|1[0-9]{2}|2[0-5][0-6])\\.){3}([0-9]|[0-9]{2}|1[0-9]{2}|2[0-5][0-6])$")); // IPs
		System.out.println("Welcome Test User1, Type: user".matches("Welcome.*, Type: user"));
	*/	
		//Replace examples
		System.out.println("This+is+a+test".replaceAll("\\+"," ")); //replaces # by space
		System.out.println("03:59 aM:764:12:59 PM:964".replaceAll("(1[0-2]|0?[1-9])\\:[0-5][0-9]\\s([aApP][mM])","<12HR_TIME_FORMAT>")); //replaces # by space
		String dateStr = "Today, <dd/mM/YY> is Diwali. Happy Diwali to all";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yy");
		LocalDateTime now = LocalDateTime.now();
		//System.out.println(dateStr.matches(".*<\\w{2}/\\w{2}/\\w{2}>.*") + now.toString());
		System.out.println(dateStr.replaceAll("<\\w{2}/\\w{2}/\\w{2}>", dtf.format(now)));

	}

}
