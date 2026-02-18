//1. To call one method inside another method
class ThisExample2{
	String name;
	int age;
	double fees;
	ThisExample2(String name,int age,double fees){
		this.name=name;
		this.age=age;
		this.fees=fees;
	}
	public void m1(){
		System.out.println("M1 method called...");
		m2();
	}
	public void m2(){
		System.out.println("M2 method called...");
		this.m3();
	}
	public void m3(){
		System.out.println("M3 method called...");
	}
	public void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Fees: "+this.fees);
		System.out.println("==============================");
		
	}
	public static void main(String... args){
		ThisExample2 t1=new ThisExample2("Rajnikant",80,10000);
		t1.display();
		t1.m1();
	}
}
