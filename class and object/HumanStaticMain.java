class Human
{
	String name="Dikshita",color="WHite";
	int height=5,leg,hand;
	static String college="Lbef college";
	
	static void walk()
	{
		System.out.println("human can walk..");
	}
	public static void eat()
	{
		System.out.println("human can eat..");
		System.out.println(name);
	}
	void sleep()
	{
		System.out.println("human can sleep..");
	}
	void dance()
	{
		System.out.println("human can dance..");
	}
}
class HumanStaticMain{
	public static void main(String... args)
	{
		Human h1=new Human();
		
		h1.sleep();
		h1.walk();
		Human.eat();
		//Human.sleep();
	}
}






