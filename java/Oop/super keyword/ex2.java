class A
{
	void m1()
	{
		System.out.println("A");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("B");
	}
}
class C extends B
{
	void m1()
	{
		System.out.println("C");
	}
}
class D extends C
{
	void m1()
	{
		System.out.println("D");
	}
	void m2()
	{
		m1();
		super.m1();
	}
}
public class ex2
{
	public static void main(String[] args)
	{
		D ob=new D();
		ob.m2();
	}
}
