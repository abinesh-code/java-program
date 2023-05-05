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
public class ex2
{
	public static void main(String[] args)
	{
		A ob1=new A();
		B ob2=new B();

		ob1.m1();
		ob2.m1();
	} 
}
