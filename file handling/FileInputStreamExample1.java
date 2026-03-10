import java.io.FileInputStream;  
public class FileInputStreamExample1 {  
    public static void main(String args[])throws Exception{    
             
		 FileInputStream fin=new FileInputStream("File1.txt");    
		 int a = fin.read();
		 while(a!=-1){
			 System.out.print((char)a);
             a=fin.read();			 
		 }
		 System.out.println();
		 fin.close();    
		 System.out.println("success...");   
		  		 
    
      }    
}  
