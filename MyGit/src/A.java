
public class A {

	public static void main(String[] args) {
		System.out.println("This is A");
		System.out.println("This is A 2nd version");
		
		B b = new B();
		b.printB();
		System.out.println("This is B print");
		System.out.println("This is B print2");
		
		new C().printC();
		System.out.println("This is C print");
		System.out.println("This is C print2");

	}

}
