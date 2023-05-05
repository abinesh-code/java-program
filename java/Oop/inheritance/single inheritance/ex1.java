class A
{
	int i;
	int j;
	void setij(int x,int y)
	{
		i=x;
		j=y;
	}
}
class B extends A
{
	int tot;
	void sum()
	{
		tot=i+j;
	}
}
public class ex1
{
	public static void main(String[] args)
	{
		A ob1=new A();
		B ob2=new B();

		ob1.i=15;
		ob1.setij(10,15);

		ob2.i=20;
		ob2.setij(20,8);

		ob2.sum();
	    System.out.println(ob2.tot);
	}
}
