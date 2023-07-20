
package za.ac.tut.framelogin;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;



public class LoginFrame extends JFrame{
    
    private JPanel headingPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel usernamePasswordCombinedPnl;
    
    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;   
    
    private JTextField usernameTxtF;
    
    private JPasswordField passwordFld;
    
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public LoginFrame()
    {
        setTitle("Login Page");
        setSize(600,650);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        usernamePasswordCombinedPnl = new JPanel(new GridLayout(2,1,1,1));
        usernamePasswordCombinedPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"Login details"));
        
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Login");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD + Font.ITALIC,30));
        headingLbl.setForeground(Color.RED);
        
        usernameLbl = new JLabel("Username");
        passwordLbl = new JLabel("Password");
        
        usernameTxtF = new JTextField(10);
        usernameTxtF.setFocusable(true);
        
        passwordFld = new JPasswordField(10);
        
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        headingPnl.add(headingLbl);
        
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxtF);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordFld);
        
        usernamePasswordCombinedPnl.add(usernamePnl);
        usernamePasswordCombinedPnl.add(passwordPnl);
        
        btnsPnl.add(submitBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(usernamePasswordCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        
        setVisible(true);
    }
}
