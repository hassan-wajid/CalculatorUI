import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;
public class Calculator extends JFrame {
JTextArea screen;
JButton one,two,three,four,five,six,seven,eight,nine,zero;
JButton MUL,DIV,PLUS,SUB;
JButton DOT,C,CE,EQUAL;
	
	public Calculator() {
		setSize(400,500);
		setResizable(false);
		setLocation(300,200);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.black);
		contentPane.setLayout(null);
		setTitle("Calculator");
		
		
		
		screen=new JTextArea();
		screen.setFont(new Font("Bold", Font.PLAIN, 40));
		screen.setColumns(15);
		screen.setRows(4);
		screen.setBounds(18, 14, 350, 53);
		contentPane.add(screen);
		
		seven=new JButton("7");
	    seven.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(seven);
	    seven.setBounds(18, 80, 80, 60);
	  
		
	    
	    eight=new JButton("8");
	    eight.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(eight);
	    eight.setBounds(105, 80, 80, 60);
	
	    
	    
	    
	    nine=new JButton("9");
	    nine.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(nine);
	    nine.setBounds(193, 80, 80, 60);
	
	    
	    
	    MUL=new JButton("x");
	    MUL.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(MUL);
	    MUL.setBounds(281, 80, 80, 60);
	    
	    
	    
	    
	    four=new JButton("4");
	    four.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(four);
	    four.setBounds(18, 150, 80, 60);
	
	    
	    
	   five=new JButton("5");
	    five.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(five);
	    five.setBounds(105, 150, 80, 60);
	  
	    
	    
	    
	    six=new JButton("6");
	    six.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(six);
	    six.setBounds(193, 150, 80, 60);
	  
	    
	    
	    DIV=new JButton("/");
	    DIV.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(DIV);
	    DIV.setBounds(281, 150, 80, 60);
	    
	    
	    
	    
	    
	    one=new JButton("1");
	    one.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(one);
	    one.setBounds(18, 222, 80, 60);
	  
	    
	    
	    two=new JButton("2");
	    two.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(two);
	    two.setBounds(105, 222, 80, 60);
	  
	    
	    
	      three=new JButton("3");
	    three.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(three);
	    three.setBounds(193, 222, 80, 60);
	 
	    
	    
	    SUB=new JButton("-");
	    SUB.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(SUB);
	    SUB.setBounds(281, 222, 80, 60);
	    
	    
	    

	     zero=new JButton("0");
	    zero.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(zero);
	    zero.setBounds(18, 293, 167, 60);
	    
	    
	    
	    

	      DOT=new JButton(".");
	    DOT.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(DOT);
	    DOT.setBounds(193, 293, 80, 60);
	    
	    
	    
	    
	    PLUS=new JButton("+");
	    PLUS.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(PLUS);
	    PLUS.setBounds(281, 293, 80, 133);
	    
	    
	    
	    

	    C=new JButton("C");
	    C.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(C);
	    C.setBounds(18, 365, 80, 60);
	    
		

	     CE=new JButton("CE");
	    CE.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(CE);
	    CE.setBounds(105, 365, 80, 60);
	    
	    

	      EQUAL=new JButton("=");
	    EQUAL.setFont(new Font("Arial", Font.PLAIN, 30));
	    contentPane.add(EQUAL);
	    EQUAL.setBounds(193,365, 80, 60);
	    
	    
	    
	    

	    
	    
	    
	    
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
