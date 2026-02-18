class Parent{
	public void walk(){
		System.out.println("Parent Walking..")
	}
	public void sleep(){
		System.out.println("Parent Sleeping..")
	}
}
class Child extends Parent{
	public void eat(){
		System.out.println("Child Sleeping..")
	}
}
class InMain{
	public static void main(String... args){
		Child p1= new Child();
		p1.walk();
		p1.sleep();
		p1.eat();
	}
}

