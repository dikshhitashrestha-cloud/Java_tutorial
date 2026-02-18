interface Lbef{
	void sleep();
	void dance();
	default void eat(){
		System.out.println("Updated method eat...");
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
class InterfaceUpdate1{
   public static void main(String... args){
	   Pcps p1=new Pcps();
	   p1.dance();
	   p1.sleep();
	   Lbef.eat();
   }
}