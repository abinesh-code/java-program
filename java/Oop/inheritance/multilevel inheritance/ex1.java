class A
{
	void m1()
	{
		System.out.println("A");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("B");
	}
}
class C extends B
{
	void m3()
	{
		System.out.println("C");
	}
}
class D extends C
{
	void m4()
	{
		System.out.println("D");
	}
}
public class ex1
{
	public static void main(String[] args)
	{
		A ob1=new A();
		B ob2=new B();
		C ob3=new C();
		D ob4=new D();

		ob1.m1();

		ob2.m2();
		ob2.m1();

		ob3.m3();
		ob3.m2();

		ob4.m4();
		ob4.m3();
	}
}
