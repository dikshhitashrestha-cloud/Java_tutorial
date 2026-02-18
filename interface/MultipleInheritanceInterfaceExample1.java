interface A{
   String walk();
}
interface B{
   String walk();
}
class C implements A,B{
	public String walk(){
		return "Walking....";
	}
}
class MultipleInheritanceInterfaceExample1{
	public static void main(String... args){
		C c1 = new C();
		System.out.println(c1.walk());
		//System.out.println(c1.sleep());
	}
}