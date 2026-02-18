class parent{
	public void walk(){
		System.out.println("Parent is walking...");
	}
}
class Child extends Parent{
	public void sleep(){
		System.out.println("Parent is sleeping...");
}
class SingleInheritance{
public static void main(String... args){
	Child c1=new Child;
	c1.sleep();
	c1.walk();
	
}