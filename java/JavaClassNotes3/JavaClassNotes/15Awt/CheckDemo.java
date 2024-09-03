import java.awt.*;
import java.awt.event.*;

public class  CheckDemo extends Frame implements ItemListener
{
   Checkbox ch1,ch2,ch3;
   TextField tf1,tf2,tf3;

   public CheckDemo()
	{
	   setTitle("Check Box Demo");
	   setLayout(new FlowLayout());
	   ch1=new Checkbox("india");
		ch2=new Checkbox("china");
		ch3=new Checkbox("us");
		tf1=new TextField(10);
		tf2=new TextField(10);
		tf3=new TextField(10);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);

		add(ch1);
		add(ch2);
		add(ch3);
		add(tf1);
		add(tf2);
		add(tf3);
	}//constructor
public void itemStateChanged(ItemEvent ie)
	{
	if(ch1.getState())
		tf1.setText("india is selected");
	if(ch2.getState())
		tf2.setText("china is selected");
	if(ch3.getState())
		tf3.setText("us is selected");
	}
public  static void main(String args[])
	{
	CheckDemo cd=new CheckDemo();
	cd.setVisible(true);
	}
}
