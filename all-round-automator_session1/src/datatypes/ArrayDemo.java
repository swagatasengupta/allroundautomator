package datatypes;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5,6};
		String[] strArray = {"devop-trics","is","a","place","of","education"};
		//					0,				1, 	2,	3,		4, 		5

		Human[] hArr = null;
		hArr = new Human[10];

		for(int i = 0; i< hArr.length; i++) {
			hArr[i] = new Human(); //try commenting this step and see how you get null pointer exception
			System.out.println("hArr[" +i+ "]: "+ hArr[0].age);
		}
		
		Human[] hArr2 = new Human[10];
		for(int i = 0; i< hArr2.length; i++) {
			hArr2[i] = new Human(14,"Female"); //using a non-default constructor
			System.out.println("hArr2[" +i+ "]: "+ hArr2[0].age);
		}
		
		System.out.println("for 1:");
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println("index " + i + " is "+ strArray[i] + " ");
		}
		System.out.println("");
		System.out.println("for 2:");
		
		
		for (String str: strArray) {
			System.out.print(str);
			if(str.equals(strArray[(strArray.length - 1)])) {
				continue;
			} else {
				System.out.print(" ");
			}
		}
		
	}
	
}
