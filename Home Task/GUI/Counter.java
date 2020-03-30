package counter;


import java.awt.event.*;
import javax.swing.*;
 
public class Counter {
   private JTextField tfCount;
   private JButton btnCountUp, btnCountDown, btnReset;
   private JLabel titleLevel;
   private int count = 0;
 
   public Counter () {
	   JFrame jf = new JFrame("Counter | Rokan Chowdhury Onick");
	   titleLevel = new JLabel("A Simple Counter");
	   titleLevel.setBounds(200,10, 120,10);
      tfCount = new JTextField("0", 10);
      tfCount.setBounds(40,35, 100,20); 
      tfCount.setEditable(false);  
 
      btnCountUp = new JButton("Count Up");
      btnCountUp.setBounds(150,35, 100,20);
      
      btnCountUp.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
 
      btnCountDown = new JButton("Count Down");
      btnCountDown.setBounds(252,35, 109,20);
      
      btnCountDown.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count--;
            tfCount.setText(count + "");
         }
      });
 
      btnReset = new JButton("Reset");
      btnReset.setBounds(362,35, 70,20);
      
      btnReset.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count = 0;
            tfCount.setText("0");
         }
      });
      jf.add(titleLevel);
      jf.add(tfCount); 
      jf.add(btnCountUp);
      jf.add(btnCountDown);
      jf.add(btnReset);
      
      //setTitle("Counter | Rokan Chowdhury Onick");
      jf.setSize(500, 100);
      jf.setLayout(null);
      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }
 
   public static void main(String[] args) {
      new Counter(); 
   }
}