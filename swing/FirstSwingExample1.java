import javax.swing.*;  
public class FirstSwingExample1 extends JFrame {  
     void SwingExample(){
		JButton b=new JButton("click");  //creating instance of JButton  
		b.setBounds(130,100,100, 40);  //x axis, y axis, width, height  
		add(b);    //adding button in JFrame  
		setSize(400,500);     //400 width and 500 height  
		setLayout(null);      //using no layout managers  
		setVisible(true);     //making the frame visible 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
   }
   public static void main(String[] args) {  
	   FirstSwingExample f1 = new FirstSwingExample();
	   f1.SwingExample();
    }  
}  
