package datatypes;

public class Human{
	int age;
	String sex;
	static boolean isAlive = true;
	
	Human(){
		System.out.println("I am in the default constructor of human class now");
		age = 10;
		sex = "Female";
	}
	Human(int a, String s){
		System.out.println("I am in the constructor(int a, String s) of human class now");
		age = a;
		sex = s;
	}
	
	String determineSex(){
		if(sex == "Male") {
			return "M";
		} else {
			return "F";
		}
	}

	int determineSex(String s){
		int returnVal = 0;
		
		if(s == "Male") {
			returnVal = 1;
		} else if(s == "Female"){
			returnVal = 2;
		} else {
			returnVal = -1;
		}
		return returnVal;
	}

	
	public static void main(String[] args) {
		
		System.out.println("At the begnning of main. Value of Human static variable isAlive is: "+
				Human.isAlive);
		
		Human h1 = new Human();
		Human h2 = new Human(23,"Male");

		
		System.out.println("h1.age: " + h1.age);
		System.out.println("h1.sex: " + h1.sex);
		System.out.println("h1.determineSex(\"Male\"): " + h1.determineSex("Male"));
		System.out.println("h1.Human static variable isAlive is: " + h1.isAlive);

		Human.isAlive=false;
		System.out.println("At the middle of main. Value of Human static variable isAlive is: "+
				Human.isAlive);
		System.out.println("h1.Human static variable isAlive is: " + h1.isAlive);

		
		System.out.println("h2.age: " + h2.age);
		System.out.println("h2.sex: " + h2.sex);
		System.out.println("h2.determineSex(\"Something else\"): " + h2.determineSex("Something else"));
		System.out.println("h2.Human static variable isAlive is: " + h2.isAlive);
	}
}
