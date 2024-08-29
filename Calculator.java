
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JFrame jf;
	JLabel displaylabel;
	JButton SevenButten,EightButten,NineButten;
	JButton FourButten,FiveButten,SixButten;
	JButton OneButten,TwoButten,ThreeButten;
	JButton DotButten,SeroButten,EqualButten ;
	JButton MinusButten,PlusButten,MultiplyButten,DivitionButten,ClearButten;
	
	double num1,num2,result;
	char operator;
	boolean isOparatorClicked=false;
	
	public Calculator() {
	
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.getContentPane().setBackground( Color.black );
		jf.setSize(600, 600);
		jf.setLocation(300,150);
		
		displaylabel=new JLabel();
		
		displaylabel.setBounds(30, 50, 540, 60);
		displaylabel.setFont(new Font("Calibri", Font.BOLD, 30));
		displaylabel.setBackground(Color.darkGray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		jf.add(displaylabel);

		
	    SevenButten =new JButton("7");
		SevenButten.setBounds(30, 130, 80, 80);
		SevenButten.setBackground(Color.darkGray);
		SevenButten.setForeground(Color.white);
		SevenButten.setFont(new Font("Arial", Font.PLAIN, 40));
		SevenButten.addActionListener(this);
		jf.add(SevenButten);
		
	    EightButten =new JButton("8");
		EightButten.setBounds(130, 130, 80, 80);
		EightButten.setBackground(Color.darkGray);
		EightButten.setForeground(Color.white);
		EightButten.setFont(new Font("Arial", Font.PLAIN, 40));
		EightButten.addActionListener(this);
		jf.add(EightButten);
		
	    NineButten =new JButton("9");
		NineButten.setBounds(230, 130, 80, 80);
		NineButten.setBackground(Color.darkGray);
		NineButten.setForeground(Color.white);
		NineButten.addActionListener(this);
		NineButten.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(NineButten);
		
	    FourButten =new JButton("4");
		FourButten.setBounds(30, 230, 80, 80);
		FourButten.setBackground(Color.darkGray);
		FourButten.setForeground(Color.white);
		FourButten.addActionListener(this);
		FourButten.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(FourButten);
		
		FiveButten =new JButton("5");
		FiveButten.setBounds(130, 230, 80, 80);
		FiveButten.setBackground(Color.darkGray);
		FiveButten.setForeground(Color.white);
		FiveButten.addActionListener(this);
		FiveButten.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(FiveButten);
		
		SixButten =new JButton("6");
		SixButten.setBounds(230, 230, 80, 80);
		SixButten.setBackground(Color.darkGray);
		SixButten.setForeground(Color.white);
		SixButten.addActionListener(this);
		SixButten.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(SixButten);
		
		OneButten =new JButton("1");
		OneButten.setBounds(30, 330, 80, 80);
		OneButten.setBackground(Color.darkGray);
		OneButten.setForeground(Color.white);
		OneButten.addActionListener(this);
		OneButten.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(OneButten);
		
		TwoButten =new JButton("2");
		TwoButten.setBounds(130, 330, 80, 80);
		TwoButten.setBackground(Color.darkGray);
		TwoButten.setForeground(Color.white);
		TwoButten.addActionListener(this);
		TwoButten.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(TwoButten);
		
        ThreeButten =new JButton("3");
		ThreeButten.setBounds(230, 330, 80, 80);
		ThreeButten.setBackground(Color.darkGray);
		ThreeButten.setForeground(Color.white);
		ThreeButten.addActionListener(this);
		ThreeButten.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(ThreeButten);
		
		DotButten =new JButton(".");
		DotButten.setBounds(30, 430, 80, 80);
		DotButten.setBackground(Color.darkGray);
		DotButten.setForeground(Color.white);
		DotButten.addActionListener(this);
		DotButten.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(DotButten);
		
		SeroButten =new JButton("0");
		SeroButten.setBounds(130, 430, 80, 80);
		SeroButten.setBackground(Color.darkGray);
		SeroButten.setForeground(Color.white);
		SeroButten.setFont(new Font("Arial", Font.PLAIN, 40));
		SeroButten.addActionListener(this);
		jf.add(SeroButten);
		
		EqualButten =new JButton("=");
		EqualButten.setBounds(230, 430, 80, 80);
		EqualButten.setBackground(Color.darkGray);
		EqualButten.setForeground(Color.white);
		EqualButten.setFont(new Font("Arial", Font.PLAIN, 40));
		EqualButten.addActionListener(this);
		jf.add(EqualButten);
		
		PlusButten =new JButton("+");
		PlusButten.setBounds(330, 130, 80, 80);
		
		PlusButten.setFont(new Font("Arial", Font.PLAIN, 40));
		PlusButten.addActionListener(this);
		jf.add(PlusButten);
		
		MinusButten =new JButton("-");
		MinusButten.setBounds(330, 230, 80, 80);
		MinusButten.setFont(new Font("Arial", Font.PLAIN, 40));
		MinusButten.addActionListener(this);
		jf.add(MinusButten);
		
		MultiplyButten =new JButton("x");
		MultiplyButten.setBounds(330, 330, 80, 80);
		MultiplyButten.setFont(new Font("Arial", Font.PLAIN, 40));
		MultiplyButten.addActionListener(this);
		jf.add(MultiplyButten);
		
		DivitionButten =new JButton("%");
		DivitionButten.setBounds(330, 430, 80, 80);
		DivitionButten.setFont(new Font("Arial", Font.PLAIN, 40));
		DivitionButten.addActionListener(this);
		jf.add(DivitionButten);
		
		ClearButten =new JButton("Clear");
		ClearButten.setBounds(430, 430, 150, 80);
		ClearButten.setFont(new Font("Arial", Font.PLAIN, 40));
		ClearButten.addActionListener(this);
		jf.add(ClearButten);
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==SevenButten) {
			if(isOparatorClicked) {
				displaylabel.setText("7");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"7");
			}
			
		
		}else if(e.getSource()==EightButten) {
			if(isOparatorClicked) {
				displaylabel.setText("8");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"8");
			}
			
			
		}else if(e.getSource()==NineButten) {
			if(isOparatorClicked) {
				displaylabel.setText("9");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"9");
			}
			
		}else if(e.getSource()==FourButten) {
			if(isOparatorClicked) {
				displaylabel.setText("4");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"4");
			}
			
		}else if(e.getSource()==FiveButten) {
			if(isOparatorClicked) {
				displaylabel.setText("5");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"5");		
			}
			
		}else if(e.getSource()==SixButten) {
			if(isOparatorClicked) {
				displaylabel.setText("6");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"6");
			}
			
		}else if(e.getSource()==OneButten) {
			if(isOparatorClicked) {
				displaylabel.setText("1");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"1");
			}
			
		}else if(e.getSource()==TwoButten) {
			if(isOparatorClicked) {
				displaylabel.setText("2");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"2");
			}
		}else if(e.getSource()==ThreeButten) {
			
			if(isOparatorClicked) {
				displaylabel.setText("3");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"3");
			}
			
		}else if(e.getSource()==DotButten) {
			if(isOparatorClicked) {
				displaylabel.setText(".");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+".");
			}
			
		}else if(e.getSource()==SeroButten) {
			if(isOparatorClicked) {
				displaylabel.setText("0");
				isOparatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"0");
			}
			
		}else if(e.getSource()==ClearButten) {
			displaylabel.setText("");
			
			
			
		
		
	
			isOparatorClicked=true;
		}else if(e.getSource()==MinusButten) {
			num1=Double.parseDouble(displaylabel.getText());
			operator='-';
			isOparatorClicked=true;
			
			
		}else if(e.getSource()==PlusButten) {
			num1=Double.parseDouble(displaylabel.getText());
			operator='+';
			isOparatorClicked=true;
			
			
		}else if(e.getSource()==MultiplyButten) {
			num1=Double.parseDouble(displaylabel.getText());
			operator='*';
			isOparatorClicked=true;
			
		}else if(e.getSource()==DivitionButten) {
			num1=Double.parseDouble(displaylabel.getText());
			operator='/';
			isOparatorClicked=true;
			
		}else if(e.getSource()==EqualButten) {
			
			num2=Double.parseDouble(displaylabel.getText());
			
			
			switch(operator) {
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}
			
			displaylabel.setText(String.valueOf(result));
			isOparatorClicked=false;
		
			
			
			
	}
		
	}
}
