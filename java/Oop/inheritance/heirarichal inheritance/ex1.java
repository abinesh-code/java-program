class A
{
	void methodA()
	{
		System.out.println("A");
	}
}
class B extends A
{
	void methodB()
	{
		System.out.println("B");
	}
}
class C extends A
{
	void methodC()
	{
		System.out.println("C");
	}
}
class D extends A
{
	void methodD()
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

    ob1.methodA();

    ob2.methodB();
    ob2.methodA();

    ob3.methodC();
    ob3.methodA();

    ob4.methodD();
    ob4.methodA();
  }
}
