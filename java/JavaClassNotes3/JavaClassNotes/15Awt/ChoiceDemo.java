import java.awt.*;
import java.awt.event.*;

public class  ChoiceDemo extends Frame implements ItemListener
{
	Choice ch;
	TextField tf;
	String data[]={"red","blue","green","yellow"};
	Color cldata[]={Color.red,Color.blue,Color.green,Color.yellow};
	public ChoiceDemo()
	{
		setTitle("choice Demo ");
		setSize(340,300);
		setLayout(new FlowLayout());
		ch=new Choice();
		for(int i=0;i<data.length;++i)
			ch.addItem(data[i]);

		ch.addItemListener(this);
		add(ch);

		tf=new TextField("color change",20);
		add(tf);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		int index=ch.getSelectedIndex();
		Color cl=cldata[index];
		tf.setBackground(cl);
	}

	public static void main(String[] args) 
	{
            ChoiceDemo chd=new ChoiceDemo();
	}
}
