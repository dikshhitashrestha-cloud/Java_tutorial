class IllegalAgeException extends Throwable{
	IllegalAgeException(String msg){
		//super(msg);
	}
}
public class TestThrow1 {   
    public void validate(int age) {  
        if(age<18) {
            try{			
              throw new IllegalAgeException("Person is not eligible to vote"); 
			}
            catch(IllegalAgeException e){
				System.out.println(e);
			}			
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
      }  
       public static void main(String args[]){  
          TestThrow1 t=new TestThrow1();
		  
                 t.validate(13);  
                 System.out.println("rest of the code...");    
      }  	  
}

