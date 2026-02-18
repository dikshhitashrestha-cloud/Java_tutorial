class Parent{
	public void walk(){
		System.out.println("Parent is walking...");
	}
}
class Child1 extends Parent{
	public void sleep(){
		System.out.println("Child is sleeping...");
	}
}
class Child2 extends Parent{
	public void eat(){
		System.out.println("GrandChild is eating...");
	}
}
class HierachicalInheritance{
	public static void main(String... args){
	Child1 c1=new Child1();
	c1.sleep();
	c1.walk();
	//c1.eat();
	}
}