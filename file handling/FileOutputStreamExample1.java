nimport java.io.FileOutputStream;  
public class BufferedOutputStreamExample1 {  
    public static void main(String args[])throws Exception{    
             
             FileOutputStream fout=new FileOutputStream("File1.txt",true);    
             String s = "Hello Pcps College\n";
			 byte[] b= s.getBytes();
			 fout.write(b,6,4);    
             fout.close();    
             System.out.println("success...");    
    
      }    
}  
