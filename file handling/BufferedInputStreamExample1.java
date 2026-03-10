import java.io.*;  
public class BufferedInputStreamExample1 {  
    public static void main(String args[])throws Exception{    
             
		 FileInputStream fin=new FileInputStream("lbef.txt");    
		 BufferedInputStream bis = new BufferedInputStream(fin);
		 int a = bis.read();
		 while(a!=-1){
			 System.out.print((char)a);
             a=bis.read();			 
		 }
		 System.out.println();
		 bis.close();    
		 System.out.println("success...");   
		  		 
    
      }    
}  
