package inheritence;

import interfacedemo.Behavior2;

public class Parent implements Behavior2{

	public String parentName="Default Parent Name";
	public int age=30;
	private float salary;
	
	public Parent(int age){
		this.age = age;
	}

	@Override
	public void walks() {
		System.out.println("Parent is walking");
		
	}	
	public void parentF1() {
		System.out.println("Hi!, I am parent's public funciton: parentF1");
	}


}
