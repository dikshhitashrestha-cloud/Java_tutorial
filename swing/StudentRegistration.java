import javax.swing.*;

public class StudentRegistration {

    JFrame f;

    StudentRegistration() {

        f = new JFrame("Student Registration Form");

        // NAME
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);

        // AGE
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 100, 100, 30);
        JTextField ageField = new JTextField();
        ageField.setBounds(150, 100, 150, 30);

        // EMAIL
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 150, 100, 30);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 150, 150, 30);

        // ADDRESS (TEXT AREA)
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 200, 100, 30);
        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 200, 200, 80);

        // COUNTRY (COMBO BOX)
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(50, 300, 100, 30);
        String country[] = {"Nepal", "India", "Australia", "USA", "UK"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(150, 300, 150, 30);

        // GENDER (RADIO BUTTON)
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 350, 100, 30);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds(150, 350, 80, 30);
        r2.setBounds(230, 350, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // COURSES (CHECK BOX)
        JLabel courseLabel = new JLabel("Courses:");
        courseLabel.setBounds(50, 400, 100, 30);

        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("C++");
        JCheckBox c3 = new JCheckBox("Python");
        JCheckBox c4 = new JCheckBox("JavaScript");

        c1.setBounds(150, 400, 100, 30);
        c2.setBounds(250, 400, 100, 30);
        c3.setBounds(150, 430, 100, 30);
        c4.setBounds(250, 430, 120, 30);

        // SAVE BUTTON
        JButton saveBtn = new JButton("Save");
        saveBtn.setBounds(170, 480, 100, 40);

        // ADD COMPONENTS
        f.add(nameLabel); f.add(nameField);
        f.add(ageLabel); f.add(ageField);
        f.add(emailLabel); f.add(emailField);
        f.add(addressLabel); f.add(addressArea);
        f.add(countryLabel); f.add(cb);
        f.add(genderLabel); f.add(r1); f.add(r2);
        f.add(courseLabel);
        f.add(c1); f.add(c2); f.add(c3); f.add(c4);
        f.add(saveBtn);

        // FRAME SETTINGS
        f.setSize(450, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}