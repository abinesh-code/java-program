class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("dog is eating");
    }
    void work()
    {
    	eat();
    	super.eat();
    }
}
public class ex1
{
	public static void main(String[] args)
	{
		Dog ob=new Dog();
		ob.work();
	}
}
