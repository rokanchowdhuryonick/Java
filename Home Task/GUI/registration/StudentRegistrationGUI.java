package registration;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;


public class StudentRegistrationGUI 
{   
	JFrame frame;
	PrintWriter out;
	File file;
    private JLabel Data_Below; 
    private ButtonGroup Department; 
    private JLabel Firstname_Error; 
    private ButtonGroup Gender; 
    private JComboBox<String> jComboBox1; 
    private JComboBox<String> jComboBox2; 
    private JComboBox<String> jComboBox3; 
    private JLabel jLabel1; 
    private JLabel jLabel11; 
    private JLabel jLabel3; 
    private JLabel jLabel4; 
    private JLabel jLabel5; 
    private JLabel jLabel6; 
    private JLabel jLabel7; 
    private JLabel jLabel8; 
    //private JLabel jLabel9; 
    private JPasswordField jPasswordField1; 
    private JPasswordField jPasswordField2; 
    private JRadioButton jRadioButton1; 
    private JRadioButton jRadioButton2; 
    private JRadioButton jRadioButton3; 
    private JRadioButton jRadioButton4; 
    private JRadioButton jRadioButton5; 
    private JRadioButton jRadioButton6; 
    private JRadioButton jRadioButton7;
    private JTextArea jTextArea1; 
    private JTextField jTextField1; 
    private JTextField jTextField2; 
    private JTextField jTextField3;
    private JButton jButton1; 
    private JButton jButton2; 
    private JLabel pwd_Error;
    private String dates[] 
            = { "1", "2", "3", "4", "5", 
                "6", "7", "8", "9", "10", 
                "11", "12", "13", "14", "15", 
                "16", "17", "18", "19", "20", 
                "21", "22", "23", "24", "25", 
                "26", "27", "28", "29", "30", 
                "31" }; 
        private String months[] 
            = { "Jan", "Feb", "Mar", "Apr", 
                "May", "Jun", "July", "Aug", 
                "Sup", "Oct", "Nov", "Dec" }; 
        private String years[] 
            = { "1995", "1996", "1997", "1998", 
                "1999", "2000", "2001", "2002", 
                "2003", "2004", "2005", "2006", 
                "2007", "2008", "2009", "2010", 
                "2011", "2012", "2013", "2014", 
                "2015", "2016", "2017", "2018", 
                "2019" }; 

    public StudentRegistrationGUI() { 
    	frame = new JFrame("A Student Registration Form by Rokan Chowdhury Onick");
    	frame.setSize(800, 600);
    	
    	frame.setMinimumSize(new Dimension(780, 550));
    	Image icon = Toolkit.getDefaultToolkit().getImage("src/registration/r-icon.jpg");
    	frame.setIconImage(icon);
    	
        this.initComponents();
        
        
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setForeground(Color.GREEN);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initComponents() {
    	
    	
    	jLabel1 = new JLabel("Student First Name");
    	jLabel1.setBounds(10, 30, 120, 20);
    	frame.add(jLabel1);
    	jTextField1 = new JTextField();
    	jTextField1.setBounds(160, 30, 200, 20);
    	frame.add(jTextField1);
    	
    	jTextField1.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent arg0) {
				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				if(jTextField1.getText().equals("")) 
			    { 
			        Firstname_Error.setVisible(true); 
			        jTextField1.setFocusable(true); 
			        jTextField1.requestFocus(true); 
			    } 
			    else 
			    { 
			        Firstname_Error.setVisible(false); 
			    } 
				
			}
         } );
    	
    	jLabel11 = new JLabel("Student Last Name");
    	jLabel11.setBounds(10, 60, 120, 20);
    	frame.add(jLabel11);
    	jTextField2 = new JTextField();
    	jTextField2.setBounds(160, 60, 200, 20);
    	frame.add(jTextField2);
    	
    	jLabel3 = new JLabel("Email Address");
    	jLabel3.setBounds(10, 90, 120, 20);
    	frame.add(jLabel3);
    	jTextField3 = new JTextField();
    	jTextField3.setBounds(160, 90, 200, 20);
    	frame.add(jTextField3);
    	
    	jLabel4 = new JLabel("Password");
    	jLabel4.setBounds(10, 120, 120, 20);
    	frame.add(jLabel4);
    	jPasswordField1 = new JPasswordField();
    	jPasswordField1.setBounds(160, 120, 200, 20);
    	frame.add(jPasswordField1);
    	
    	jLabel5 = new JLabel("Confirm Password");
    	jLabel5.setBounds(10, 150, 120, 20);
    	frame.add(jLabel5);
    	jPasswordField2 = new JPasswordField();
    	jPasswordField2.setBounds(160, 150, 200, 20);
    	frame.add(jPasswordField2);
    	
    	jPasswordField2.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent arg0) {
				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				if(jPasswordField2.getText().equals(jPasswordField1.getText())==true || jPasswordField1.getText().equals(jPasswordField2.getText())==true) 
		        { 
		            pwd_Error.setVisible(false); 
		        } 
		        else 
		        { 
		            pwd_Error.setVisible(true); 
		            jPasswordField1.setFocusable(true); 
		            jPasswordField1.requestFocus(); 
		        } 
				
			}
         } );
    	
    	
    	jLabel6 = new JLabel("Date of Birth");
    	jLabel6.setBounds(10, 180, 120, 20);
    	frame.add(jLabel6);
    	jComboBox1 = new JComboBox<String>(dates);
    	jComboBox1.setBounds(160, 180, 60, 20);
    	frame.add(jComboBox1);
    	jComboBox2 = new JComboBox<String>(months);
    	jComboBox2.setBounds(230, 180, 60, 20);
    	frame.add(jComboBox2);
    	jComboBox3 = new JComboBox<String>(years);
    	jComboBox3.setBounds(300, 180, 60, 20);
    	frame.add(jComboBox3);
    	
    	jLabel7 = new JLabel("Gender");
    	jLabel7.setBounds(10, 210, 120, 20);
    	frame.add(jLabel7);
    	
    	jRadioButton1 = new JRadioButton("Male", true);
    	jRadioButton2 = new JRadioButton("Female");
    	jRadioButton1.setBounds(160, 210, 60, 20);    
    	jRadioButton2.setBounds(230, 210, 100, 20);    
    	Gender = new ButtonGroup();    
    	Gender.add(jRadioButton1);
    	Gender.add(jRadioButton2);
    	frame.add(jRadioButton1); frame.add(jRadioButton2);
    	
    	jLabel8 = new JLabel("Department");
    	jLabel8.setBounds(10, 240, 120, 20);
    	frame.add(jLabel8);
    	
    	jRadioButton3 = new JRadioButton("Civil");
    	jRadioButton4 = new JRadioButton("Computer Science and Engineering", true);
    	jRadioButton5 = new JRadioButton("Electrical");
    	jRadioButton6 = new JRadioButton("Electronics and Communication");
    	jRadioButton7 = new JRadioButton("Mechanical");
    	jRadioButton3.setBounds(160, 240, 200, 20);    
    	jRadioButton4.setBounds(160, 270, 240, 20);    
    	jRadioButton5.setBounds(160, 300, 240, 20);    
    	jRadioButton6.setBounds(160, 330, 240, 20);    
    	jRadioButton7.setBounds(160, 360, 240, 20);    
    	Department = new ButtonGroup();    
    	Department.add(jRadioButton3);
    	Department.add(jRadioButton4);    
    	Department.add(jRadioButton5);
    	Department.add(jRadioButton6);    
    	Department.add(jRadioButton7);
    	frame.add(jRadioButton3); frame.add(jRadioButton4); frame.add(jRadioButton5); frame.add(jRadioButton6); frame.add(jRadioButton7);
    	
    	jButton1 = new JButton("Submit");    
    	jButton1.setBounds(160, 390, 85, 25);
    	frame.add(jButton1);
    	jButton2 = new JButton("Cancel");    
    	jButton2.setBounds(275, 390, 85, 25);
    	frame.add(jButton2);
    	
    	jButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(jTextField1.getText().equals("")) {
					JOptionPane.showMessageDialog(frame,"Bro, Field is empty...","Field empty",JOptionPane.WARNING_MESSAGE);
				}else if(jPasswordField2.getText().equals(jPasswordField1.getText())!=true || jPasswordField1.getText().equals(jPasswordField2.getText())!=true) {
					JOptionPane.showMessageDialog(frame,"Bro, Password & Confirm Password doesn't match yet...","Password Missmatch",JOptionPane.WARNING_MESSAGE);
				}else{
					pwd_Error.setVisible(false); 
					Firstname_Error.setVisible(false);
					jTextArea1.setText("Name : "+jTextField1.getText()+"\n" 
				               +"Surname : "+jTextField2.getText()+"\n" 
				               +"Email Address : "+jTextField3.getText()+"\n" 
				               +"Date Of Birth : "+jComboBox1.getSelectedItem().toString()+" "+jComboBox2.getSelectedItem().toString()+" "+jComboBox3.getSelectedItem().toString()+"\n" 
				               +"Gender : "+ Gender.getSelection().getActionCommand()+"\n" 
				               +"Department : "+Department.getSelection().getActionCommand() 
				            );
					
					file = new File("src/registration/StudentData.txt");
					
					try {
						out = new PrintWriter(file);
					} catch (FileNotFoundException e1) {
						try {
							file.createNewFile();
							out = new PrintWriter(file.getAbsoluteFile());
						} catch (IOException e2) {
							JOptionPane.showMessageDialog(frame,e2.getMessage(),"I/O Exceptio Occurs",JOptionPane.WARNING_MESSAGE);
						}
					}
					out.println(jTextArea1.getText());
					out.close();
					JOptionPane.showMessageDialog(frame, "Student successfully registered!","Success",JOptionPane.PLAIN_MESSAGE);
					
				}
				
			}
    		
    	});
    	
    	
    	jButton2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jTextArea1.setText("");
				pwd_Error.setVisible(false); 
				Firstname_Error.setVisible(false);
				jTextField1.setText("");
				jTextField2.setText("");
				jTextField3.setText("");
				jPasswordField1.setText("");
				jPasswordField2.setText("");
				
			}
    		
    	});
    	
    	Data_Below = new JLabel("Your Data is Below:");
    	Data_Below.setBounds(530, 210, 200, 20);
    	frame.add(Data_Below);
    	
    	jTextArea1 = new JTextArea();
    	jTextArea1.setBounds(420, 235, 340, 250);
    	frame.add(jTextArea1);
    	
    	
    	
    	pwd_Error = new JLabel("*Password and Confirm Password not matched");
    	pwd_Error.setBounds(370, 150, 300, 20);
    	pwd_Error.setForeground(Color.RED);
    	pwd_Error.setVisible(false); 
    	frame.add(pwd_Error);
    	Firstname_Error = new JLabel("*First Name can not be empty");
    	Firstname_Error.setBounds(370, 30, 300, 20);
    	Firstname_Error.setForeground(Color.RED);
        Firstname_Error.setVisible(false);
    	frame.add(Firstname_Error);
    	jRadioButton1.setActionCommand("Male"); 
        jRadioButton2.setActionCommand("Female"); 
        jRadioButton3.setActionCommand("Civil"); 
        jRadioButton4.setActionCommand("Computer Science and Engineering"); 
        jRadioButton6.setActionCommand("Electronics and Communication"); 
        jRadioButton7.setActionCommand("Mechanical");
    	
    	
    	
    	
    }

                                          
public static void main(String args[]) 
{ 
        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() { 
                       public void run() { 
                new StudentRegistrationGUI(); 
            } 
        }); 
    } 
                        
}