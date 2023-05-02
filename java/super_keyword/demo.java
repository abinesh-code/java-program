class A {
	int x=0;
	
	void set() {
		System.out.println("hello");
	}
}

class B extends A {
	
	void get() {
		super.set();
		System.out.println(super.x);
	}
}


public class Main {
	public static void main(String[] args) {
		
		B e = new B();
		e.get();
		
	}
}
