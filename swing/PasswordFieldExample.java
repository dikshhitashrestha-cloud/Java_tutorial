import javax.swing.*;    
public class PasswordFieldExample {  
    public static void main(String[] args) {    
         JFrame f=new JFrame("Password Field Example");  
         JLabel l1=new JLabel("Password:");      
         JPasswordField l2 = new JPasswordField();   
         
         l1.setBounds(20,100, 80,30);    
         l2.setBounds(100,100,100,30);    
         f.add(l1);  f.add(l2);  
         f.setSize(300,300);    
         f.setLayout(null);    
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
      }  
} 
