class Parent{
	public void walk(){
		System.out.println("Parent is walking...");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child default constructor");
	}
	public void sleep(){
		System.out.println("Child is sleeping...");
	}
}
class ConstructorBehaviour{
public static void main(String... args){
	Child c1=new Child;
	c1.sleep();
	c1.walk();
	
}