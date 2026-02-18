package Lbef;
class A{
	private int x=10;
	public void show(){
		System.out.println("Number : "+x);
	}
}
class PrivateMain{
	public static void main(String... args){
		A a1=new A();
		a1.show();
	}
}
