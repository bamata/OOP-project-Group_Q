
package oop_project_group.view;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;
//import java.awt.Rectangle;

public class LoginView  extends JComponent{
   //objects
    private JTextField userNameField;
    private JPasswordField userPasswordField;
    private JLabel labelUserName;
    private JLabel labelUserPassword;
    
    private JButton buttonLogin;
    private JButton buttonCancel;
    
    public LoginView() {
        
        JFrame myFrame = new JFrame("Login View");
        
        JPanel myPanel = new JPanel(  );
        labelUserName = new JLabel("Username: "); // name label
        labelUserName.setBounds(200, 150, 80, 80);
        
        userNameField = new JTextField( 20 ); // user field
        userNameField.setBounds(295, 178, 200, 25);
       
        
        
        labelUserPassword = new JLabel ("Password: "); // password label
        labelUserPassword.setBounds(200, 200, 80, 80);
      
        
        
        userPasswordField = new JPasswordField( 20 ); // password field
        userPasswordField.setBounds(295, 230, 200, 25);
        
        
        buttonLogin = new JButton( " Login ");// login button
        buttonLogin.setBounds(300, 300, 78, 30);
        
        // Validattion
        buttonLogin.addActionListener( new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (Authentificate.Validate(getUserName(), getUserPassword())) {
                    JOptionPane.showMessageDialog(LoginView.this, 
                            "Hello " + getUserName() +" You have logged in" , "Log in",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                   
                } else {
                    JOptionPane.showMessageDialog(LoginView.this, "Oops!, Invalid username or password",
                    "Log in ", JOptionPane.ERROR_MESSAGE);
                    userNameField.setText("");
                    userPasswordField.setText("");
                }
            }
            
            
        });
    
        
       
        
        buttonCancel = new JButton( " Cancel"); // cancel button
        buttonCancel.setBounds(400, 300, 78, 30);
        
        myFrame.setBounds(170, 20, 800, 650);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.getContentPane().setBackground(Color.GRAY);
        // components display
        myFrame.getContentPane().add(labelUserPassword);
        myFrame.getContentPane().add(labelUserName);
        myFrame.getContentPane().add(userNameField);
        myFrame.getContentPane().add(userPasswordField);
        myFrame.getContentPane().add(buttonLogin);
        myFrame.getContentPane().add(buttonCancel);
        myFrame.getContentPane().add(myPanel);
        myFrame.setVisible(true);
        
     
       
    // Collectors
    }
     public String getUserName() {
            return userNameField.getText().trim();
        }
     public String getUserPassword (){
         return new String(userPasswordField.getPassword());
     }
}

        /*
        Group members
        =============
        
        Name                                 Registration Number
        ====                                 ===================
        BAMATA WA BAMATA Maurice             18/420/BSSE-S
        NDAHURA BASARA Moses                 19/231/BIT-S
        ALLY KALIMA                          18/1097/BIT-S
        NANNYUNJA NOELINA                    19/536/BSCS-S
        */