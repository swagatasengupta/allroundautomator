package testpackage;

import inheritence.Parent;
import interfacedemo.Behavior;


public class Child2 extends Parent implements Behavior{
	int childage;
	//Note that override was not required as parent and child both are not implementing same function.
	Child2(int childage){
		super(childage + 30);
		this.childage = childage;
	}

	//Note that override was not required as parent and child both are not implementing same function.
	public void eats() {

		System.out.println("Child2 eats a lot");
		
	}

	public int sleeps(int hoursOfSleep) {
		System.out.println("Child2 always sleeps 1 hour more than what you ask her to do");
		return (hoursOfSleep + 1);
	}	
	// This override is an example of implementation override
	@Override
	public void laughs() {

		System.out.println("Child2 has overriden laugh function. Now he is laughing hysterically!");
		
	}
	// This is an example of overriding an inherited method 
	// Parent also implements walks method from Behavior2 interface.
	// Uncomment this if you want to override that implemetation which you inherited from the parent.
/*	@Override
	public void walks() {
		System.out.println("Child2 walks slowly as well like Parent");
		
	}	*/
	public static void main(String[] args) {
		Child2 ch2 = new Child2(19);
		System.out.println("Child2.childage: " + ch2.childage);
		System.out.println("Parent.age " + ch2.age);
		System.out.println("Parent.parentName: " + ch2.parentName);
		ch2.childage = 20;
		ch2.age = 60;
		ch2.parentName = "name updated by child";
		System.out.println("Child2.childage after update : : " + ch2.childage);
		System.out.println("Parent.age after update : " + ch2.age);
		ch2.parentF1();
		System.out.println("Parent.parentName: after update " + ch2.parentName);
		
		ch2.eats();
		System.out.println(ch2.sleeps(11));
		ch2.laughs();
		ch2.walks();
		System.out.println("Variable passed on from interface Behavior- pi= " + ch2.pi);
	
	}


}
