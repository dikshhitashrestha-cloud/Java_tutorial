clsss Parent{
	public void show(){
		System.out.println("show() executed no argument");
	}
	public void marry(){
		System.out.println("Marrying to Kajol.....");
	}	
}
class Child extends Parent{
	public void show(int a){
		System.out.println("show() executed 1 argument"+a);
	}
	public void marry(){
		System.out.println("I like Katrina....");
	}
}
	
class MethodRidingExample{
	public static void main(String... args){
		Child o =new Child();
		o.show();
		//o.show("Dixita");
		o.marry();
		//o.show('A');
	}
}
