package inheritence;

import abstractdemo.DemoAbstractClass;

public class Child3 extends DemoAbstractClass {

	Child3(){
		super();
	}
	@Override
	public void absMethod1() {
		System.out.println("Child3's implementation of abstract method");
	}

	public static void main(String[] args) {
		
		Child3 ch3 = new Child3();
		System.out.println("ch3.abs_Str1: " + ch3.abs_Str1);
		System.out.println("ch3.abs_var1: " + ch3.abs_var1);
		ch3.absMethod1();
		ch3.nonAbsMethod();
		
		Child4 ch4 = new Child4();
		ch4.absMethod1();
		ch4.nonAbsMethod();
	}

}

class Child4 extends DemoAbstractClass{

	@Override
	public void absMethod1() {
		System.out.println("Child4's implementation of abstract method");
		
	}
	
}