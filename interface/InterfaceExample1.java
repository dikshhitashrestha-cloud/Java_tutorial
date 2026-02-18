interface lbef
{
   void walk();
   void sleep();
}
abstract class Pcps implements lbef{
    public void walk(){
	   System.out.println("Walking..");
	}
}
class College extends Pcps{
	public void sleep(){
	   System.out.println("Sleeping..");
	}
}
class InterfaceExample1{
   public static void main(String... args){
      College p1 = new College();
	  p1.walk();
	  p1.sleep();
   }
}