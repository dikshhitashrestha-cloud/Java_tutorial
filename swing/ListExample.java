import javax.swing.*;  
public class ListExample  
{  
     ListExample(){  
        JFrame f= new JFrame();          
        String week[]= { "Monday","Tuesday","Wednesday",
                                "Thursday","Fiday","Saturday","Sunday"};

          JList list = new JList(week);  
          list.setBounds(100,100, 75,75);  
          f.add(list);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
     }  
public static void main(String args[])  
    {  
   new ListExample();  
    }}  
