clsss Overloading{
	public void show(){
		System.out.println("show() executed no argument");
	}
	public void show(int a){
		System.out.println("show() executed 1 argument"+a);
	}
	public void show(String name ){
		System.out.println("show() executed string argument"+name);
	}	
}
class MethodOverloadingExample{
	public static void main(String... args){
		Overloading o =new Overloading();
		o.show();
		o.show("Dixita");
		o.show(10);
		o.show('A');
}
