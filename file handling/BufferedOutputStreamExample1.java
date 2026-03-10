import java.io.*;  
public class BufferedOutputStreamExample1 {  
    public static void main(String args[])throws Exception{    
             
		 FileOutputStream fout=new FileOutputStream("Lbef.txt",true);    
		 BufferedOutputStream bos = new BufferedOutputStream(fout);
		 String s = "Hello Java Programming\n";
		 byte[] b= s.getBytes();
		 bos.write(b);    
		 bos.close();    
		 System.out.println("success...");    
    
      }    
}  
