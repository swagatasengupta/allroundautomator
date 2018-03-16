package inheritence;

import interfacedemo.Behavior;
import interfacedemo.Behavior2;

public class Child extends Parent implements Behavior, Behavior2{

	Child(int age) {
		super(age);
		System.out.println("Hello");
	}


	@Override
	public void eats() {
		System.out.println("Child(within same package) eats slowly");
	
	}

	@Override
	public int sleeps(int hoursOfSleep) {
		System.out.println("Child(within same package) sleeps for 10 hours daily");
		return 10;
	}

	@Override
	public void walks() {
		System.out.println("Child walks slowly");
		
	}
	
	public static void main(String[] args) {
		Child ch = new Child(4);
		System.out.println(ch.sleeps(9)); //irrespective of what I pass to sleeps function, it will return 10
		ch.eats();
		ch.laughs();
		ch.walks();
	}


	
}
