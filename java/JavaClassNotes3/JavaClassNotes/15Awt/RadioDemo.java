import java.awt.*;
import java.awt.event.*;

public class  RadioDemo extends Frame implements ItemListener
{
   Checkbox ch1,ch2,ch3;
   CheckboxGroup cg;
   TextField tf1;

   public RadioDemo()
	{
	   setTitle("Radio Button Demo");
	   setSize(400,300);
	   setLayout(new FlowLayout());
	   cg=new CheckboxGroup();
	   ch1=new Checkbox("india",cg,true);
		ch2=new Checkbox("china",cg,false);
		ch3=new Checkbox("us",cg,false);
		tf1=new TextField(10);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);

		add(ch1);
		add(ch2);
		add(ch3);
		add(tf1);
			}//constructor
public void itemStateChanged(ItemEvent ie)
	{
	if(cg.getSelectedCheckbox()==ch1)
		tf1.setText("india is selected");
else	if(cg.getSelectedCheckbox()==ch2)
		tf1.setText("china is selected");
else	if(cg.getSelectedCheckbox()==ch3)
		tf1.setText("us is selected");
	}
public  static void main(String args[])
	{
	RadioDemo rd=new RadioDemo();
	rd.setVisible(true);
	}
}
