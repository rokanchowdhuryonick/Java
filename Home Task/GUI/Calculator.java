package calculator;

import java.awt.*;     
import java.awt.event.*;  
import javax.swing.*;    


public class Calculator {
   private JTextField tfNumber1, tfNumber2, tfResult;
   private JButton btnAdd, btnSub, btnMul, btnDiv, btnMod, btnClear;
   private int number1, number2, result;
  

   public Calculator() {
	   JFrame jf = new JFrame("Calculator | Rokan Chowdhury Onick");
	   Container cp = jf.getContentPane();
	   
	   
	   
      tfNumber1 = new JTextField(10);
      tfNumber2 = new JTextField(10);
      tfResult = new JTextField("0",10);
      tfResult.setEditable(false);
      
      btnAdd = new JButton("+");
      btnSub = new JButton("-");
      btnMul = new JButton("x");
      btnDiv = new JButton("÷");
      btnMod = new JButton("%");
      btnClear = new JButton("CLEAR");
      
      //Add Button
      btnAdd.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
        	 try {
	            number1 = Integer.parseInt(tfNumber1.getText());
	            number2 = Integer.parseInt(tfNumber2.getText());
	            result = number1 + number2;
	            tfResult.setText(result+"");
	         }catch(Exception ex) {
	     		 JOptionPane.showMessageDialog(jf,"Wrong input bro...","Wrong Input",JOptionPane.WARNING_MESSAGE);
	     	 }
         }
      });
      
      //Subtract Button
      btnSub.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent evt) {
             
             try {
            	 number1 = Integer.parseInt(tfNumber1.getText());
                 number2 = Integer.parseInt(tfNumber2.getText());
	             result = number1 - number2;
	             tfResult.setText(result+"");
	          }catch(Exception ex) {
		     		 JOptionPane.showMessageDialog(jf,"Wrong input bro...","Wrong Input",JOptionPane.WARNING_MESSAGE);
		     	 }
          }
       });
      
    //Multiplication Button
      btnMul.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent evt) {
             
             try {
            	 number1 = Integer.parseInt(tfNumber1.getText());
                 number2 = Integer.parseInt(tfNumber2.getText());
	             result = number1 * number2;
	             tfResult.setText(result+"");
	          }catch(Exception ex) {
		     		 JOptionPane.showMessageDialog(jf,"Wrong input bro...","Wrong Input",JOptionPane.WARNING_MESSAGE);
		     	 }
          }
       });
      
    //Division Button
      btnDiv.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent evt) {
        	  
        	 try {
        		 number1 = Integer.parseInt(tfNumber1.getText());
                 number2 = Integer.parseInt(tfNumber2.getText());
        		 result = number1 / number2;
                 tfResult.setText(result+"");
        	 }catch(Exception ex) {
        		 JOptionPane.showMessageDialog(jf,"Something wrong happen bro...","Exception Occur",JOptionPane.WARNING_MESSAGE);
        	 }
             
             
          }
       });
      
    //Mod Button
      btnMod.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent evt) {
             
             try {
            	 number1 = Integer.parseInt(tfNumber1.getText());
                 number2 = Integer.parseInt(tfNumber2.getText());
            	 result = number1 % number2;
            	 tfResult.setText("Reminder: "+result);
	          }catch(Exception ex) {
	     		 JOptionPane.showMessageDialog(jf,"Something wrong happen bro...","Exception Occur",JOptionPane.WARNING_MESSAGE);
	     	 }
	          
	       }
       });
 
      
      btnClear.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
        	 tfNumber1.setText("");
        	 tfNumber2.setText("");
        	 tfResult.setText("0");
         }
      });
      
      
      
       
      cp.add(new JLabel("First Number "));     // at (1, 1)
      cp.add(tfNumber1);                       // at (1, 2)
      cp.add(new JLabel("Second Number "));
      cp.add(tfNumber2);
      cp.add(new JLabel("Result "));
      cp.add(tfResult);
      cp.add(btnAdd);
      cp.add(btnSub);
      cp.add(btnMul);
      cp.add(btnDiv);
      cp.add(btnMod);
      cp.add(btnClear);
      
      
      
      
      //titleLevel.setLayout(null);
	   
      //jf.add(jp,BorderLayout.CENTER);
      cp.setLayout(new GridLayout(6, 2, 10, 5));
      //jf.setLayout(null);
      jf.pack();
      jf.setVisible(true);
      
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
 
   // The entry main() method
   public static void main(String[] args) {
      // For thread safety, use the event-dispatching thread to construct UI
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Calculator(); // Let the constructor does the job
         }
      });
   }
}