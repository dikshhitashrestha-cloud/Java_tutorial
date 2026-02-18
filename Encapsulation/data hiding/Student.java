class Student1{
	private String name;
	private int age;
	private double fees;
	
	public Student1(String name, int age, double fees){
		this.name=name;
		this.age=age;
		this.fees=fees;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public double getFees(){
		return this.fees;
	}
	public void setFees(double fees){
		this.fees=fees;
	}
}
class Student{
	public static void main(String... args){
		Student1 s1=new Student1("Dikshita", 20, 70000);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getFees());
		s1.setName("Lbef");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getFees());
		
		Student1 s2=new Student1("Anushka",21,80000);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getFees());
	}
}
