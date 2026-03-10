import javax.swing.*;  
class TextFieldExample  
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("TextField Example");  
    JTextField  t1=new JTextField("Enter First Name");  
    t1.setBounds(50,100, 200,30);  
    JTextField  t2=new JTextField("Enter Last Name");  
    t2.setBounds(50,150, 200,30);  
    f.add(t1); f.add(t2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    } 
} 
