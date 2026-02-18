interface Lbef{
	void sleep();
	void dance();
	private void title(){
		System.out.println("interface Update Tutorials...");
	}
	static void eat(){
		System.out.println("Updated method eat...");
	}
	default void sing(){
		title();
		System.out.println("Updated method sing...");
	}

}
class Pcps implements Lbef{
	public void sleep(){
		System.out.println("Sleeping...");
	}
	public void dance(){
		System.out.println("Dancing...");
	}
}
class InterfaceUpdate3{
   public static void main(String... args){
	   Pcps p1=new Pcps();
	   p1.dance();
	   p1.sleep();
	   Lbef.eat();
	   p1.sing();
   }
}