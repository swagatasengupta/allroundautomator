package interfacedemo;

public interface Behavior {

	public final double pi = 3.14159;
	public void eats();
	public int sleeps(int hoursOfSleep);
	default void laughs() {
		System.out.println("this is the default laughs");
	}
}
