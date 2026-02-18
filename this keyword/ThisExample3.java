//1. To call one constructor inside another constructor
class ThisExample3{
	String name;
	int age;
	double fees;
	ThisExample3(){
		System.out.println("Default constructor..");
	}
	ThisExample3(String name){
		this();
		this.name=name;
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Fees: "+this.fees);
		System.out.println("==============================");
	}
	ThisExample3(String name,int age,double fees){
		System.out.println("Hello constructor");
		this("Bishal");
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
		ThisExample3 t1=new ThisExample3("Rajnikant",80,10000);
		t1.display();
	}
}
