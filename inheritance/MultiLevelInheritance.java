class parent{
	public void walk(){
		System.out.println("Parent is walking...")
	}
}
class Child extends Parent{
	public void sleep(){
		System.out.println("Child is sleeping...")
}
class GrandChild extends Child{
	public void eat(){
		System.out.println("GrandChild is eating...")
}
class MultiLevelInheritance{
public static void main(String... args)}{
	GrandChild c1=new GrandChild;
	c1.sleep();
	c1.walk();
	c1.eat();
	
}