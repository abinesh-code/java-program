class mobile
{
	int budget()
	{
		return 15000;
	}
}
class vivo extends mobile
{
	int budget()
	{
		return 13000;
	}
}
class motorola extends mobile
{
	int budget()
	{
		return 15000;
	}
}
class realme extends mobile
{
	int budget()
	{
		return 12000;
	}
}
public class ex1
{
	public static void main(String[] args)
	{
		mobile ob1=new mobile();
		vivo ob2=new vivo();
		motorola ob3=new motorola();
		realme ob4=new realme();

		System.out.println("budget of mobile:"+ob1.budget());
		System.out.println("rate of vivo:"+ob2.budget());
		System.out.println("rate of motorola:"+ob3.budget());
		System.out.println("rate of realme:"+ob4.budget());
	}
}
