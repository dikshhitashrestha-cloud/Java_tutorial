import javax.swing.*;
import java.awt.event.*;
public class LoginPage extends JFrame implements ActionListener{
    JLabel msgbox;
	JTextField userText;
	JPasswordField passText;
    LoginPage() {

        // Frame title
        setTitle("Login Page");

        // Username Label & TextField
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 100, 30);
        add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 80, 150, 30);
        add(userText);

        // Password Label & Field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 130, 100, 30);
        add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(150, 130, 150, 30);
        add(passText);

        // Login Button
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(80, 200, 100, 40);
        add(loginBtn);
		loginBtn.addActionListener(this);

        // Sign Up Button
        JButton signupBtn = new JButton("Sign Up");
        signupBtn.setBounds(200, 200, 100, 40);
        add(signupBtn);
		
		//Message box
		msgbox = new JLabel();
        msgbox.setBounds(150, 250, 200, 30);
        add(msgbox);

        // Optional TextArea (like your first example)
        JLabel area = new JLabel("Welcome! Please login.");
        area.setBounds(80, 20, 220, 40);
        add(area);

        // Frame settings
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public void actionPerformed(ActionEvent e){
		String username = userText.getText();
		String password = passText.getText();
		if(username.equals("lbef") && password.equals("lbef@123")){
			msgbox.setText("Login Successful..");
		}
		else{
			msgbox.setText("Login UnSuccessful..");
		}
	}

    public static void main(String[] args) {
        new LoginPage();
    }
}