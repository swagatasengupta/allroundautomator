package abstractdemo;

public abstract class DemoAbstractClass {

	public int abs_var1;
	public String abs_Str1;
	
	public DemoAbstractClass(){
		abs_var1=10;
		abs_Str1 = "Abs default String";
	}
	
	public void nonAbsMethod() {
		System.out.println("This is a non abstract method within abstract class");
	}
	
	public abstract void absMethod1();
}
