class Box
{
	double width,height,depth;
	Box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double vol()
	{
		return width*height*depth;
	}
}
class Boxweight extends Box
{
	double weight;
	Boxweight(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight=m;
	}
}
public class ex1
{
	public static void main(String[] args)
	{
		Boxweight b1=new Boxweight(1,2,3,4);
		double r;
		r=b1.vol();
		System.out.println(r);
		System.out.println(b1.weight);

		Box ob2=new Box();
		ob2=b1;
		r=ob2.vol();
		System.out.println(r);
	}
}
