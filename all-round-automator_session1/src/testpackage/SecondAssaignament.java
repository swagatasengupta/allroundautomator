package testpackage;

public class SecondAssaignament {

	public static void main(String args[]) {
		int i;
		
		int maxChars;
		
		for (i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			
			}

		}
		int j = 0;
		while (j <= 20) {
			j = j + 1;
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}

		for (int num = 5; num <= 12; num++) {

			System.out.println("Table of :" + num);

			for (int k = 0; k <= 10; k++) {
				// for(int num=0;num<=10;num++) {

				System.out.println(num + " * " + k + " = " + num * k);

			}
		}

	}

}