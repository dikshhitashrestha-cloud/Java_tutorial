class Student
{
	String name,email;
	int age;
	public Student(String name, String email, int age)
	{
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Age: "+age);
	}
}
class StudentMain1{
	public static void main(String... args)
	{
		Student h1=new Student("Dikshita","dikshita@gmail.com",20);
		h1.display();
		Student h2=new Student("Matina","matina@gmail.com",20);
		h2.display();
		Student h3=new Student("Maruf","maruf@gmail.com",22);
		h3.display();
		Student h4=new Student("Prabit","Prabit@gmail.com",21);
		h4.display();
		Student h5=new Student("Rojan","rojan@gmail.com",10);
		h5.display();
		//Student h6=new Student();
	}
}






