class ExceptionDemo1{
    public static void main(String args[]) {
        
            try{
			    int a[] = new int[5];
				a[5] = 30 / 0;
				System.out.println(a[10]);

			}
			catch(ArrayIndexOutOfBoundsException e){
			   System.out.println("Exception Occured..ArrayIndexOutOfBoundsException");
			}
			catch(ArithmeticException e){
			   System.out.println("Exception Occured..ArithneticException");
			}
			catch(Exception e){
			     System.out.println("Exception Occured..");
			}
			
			
    }
}
