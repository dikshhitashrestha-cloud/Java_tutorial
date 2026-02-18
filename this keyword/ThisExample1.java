//1. To refer current object
class ThisExample1{
	String name;
	int age;
	double fees;
	ThisExample1(String name,int age,double fees){
		this.name=name;
		this.age=age;
		this.fees=fees;
	}
	public void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Fees: "+this.fees);
		System.out.println("==============================");
		
	}
	public static void main(String... args){
		ThisExample1 t1=new ThisExample1("Rajnikant",80,10000);
		t1.display();
	}
}
