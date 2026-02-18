// how to prevent overriding in java
//restrict overriding
//static, default, final
//final-variable, method, class

clsss Parent{
	public void show(){
		System.out.println("show() executed no argument");
	}
	public static void marry(){
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
	
class Restrictoverriding{
	public static void main(String... args){
		Child o =new Child();
		o.show();
		//o.show("Dixita");
		o.marry();
		//o.show('A');
	}
}
