class A
{
	int i,j,k;
	A()
	{
		i=10;
		j=20;
		k=i+j;
	}
	void disp()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println("addition of i and j is:"+k);
	}
}
public class ex2
{
	public static void main(String[] args)
	{
		A ob=new A();
		ob.disp();
	}
}
