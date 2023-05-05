class A
{
	int i,j;
	A()
	{
		i=1;
		j=2;
	}
	void disp()
	{
		System.out.println(i+" "+j);
	}
}
public class ex1
{
	public static void main(String[] args)
	{
		A e=new A();
		e.disp();
	}
}
