import java.awt.*;
import java.awt.event.*;

class TADemo extends Frame implements ActionListener
{
	TextArea ta1,ta2;
	Button b;
	public TADemo()
	{
		setSize(300,400);
		ta1=new TextArea(20,30);
		add(ta1);
		ta2=new TextArea(20,30);
		ta2.setBackground(Color.red);
		add(ta2);
		b=new Button(">>");
		b.addActionListener(this);
		add(b);
		setLayout(new FlowLayout());
		setTitle("TADemo");
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=ta1.getSelectedText();
		ta2.append("\n"+s1);
	}

	public static void main(String[] args) 
	{
		TADemo d=new TADemo();
	}
}
