package Lbef;
class AA{
	private static int x=10;
	public void show(){
		System.out.println("Number : "+x);
	}
	public static void main(String... args){
		AA a1=new AA();
		a1.show();
		System.out.println("Number: "+x);
	}
}
