import java.awt.*;
import java.awt.event.*;

class  FirstApp extends Frame implements ActionListener
{
	TextField tf1,tf2,tf3;
	Button sum,mul,div,sub;
	Label l1,l2,l3

	public FirstApp()
	{
		System.out.println("hello1")
		setSize(300,300);
		setTitle("First Frame Application");
		l1=new Label("First Value");
		add(l1);//adds label to container(Frame)
		tf1=new TextField(10);//10 is the width of the component
		add(tf1);
		l2=new Label(" Second Value");
		add(l2);//adds label to container(Frame)
		tf2=new TextField(10);//10 is the width of the component
		add(tf2);
		l3=new Label("Third Value");
		add(l3);//adds label to container(Frame)
		tf3=new TextField(10);//10 is the width of the component
		add(tf3);
		sum=new Button("Add");//add is the label on the component
        sum.addActionListener(this);
		add(sum);
		sub=new Button("Sub");//add is the label on the component
		sub.addActionListener(this);
		add(sub);

		mul=new Button("MultiPly");//add is the label on the component
		mul.addActionListener(this);
		add(mul);
		div=new Button("Div");//add is the label on the component
		div.addActionListener(this);
		add(div);
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		setVisible(true);
		System.out.println("end of constructor");
	}//constructor

	public void actionPerformed(ActionEvent ae)
	{
		         System.out.println("hello");
	            String s1=tf1.getText();
				int x=Integer.parseInt(s1.trim());
				String s2=tf2.getText();
				int y=Integer.parseInt(s2.trim());
				int z=0;
				if(ae.getSource()==sum)
		{
					z=x+y;
		}
		else if(ae.getSource()==mul)
		{
			z=x*y;
		}
		else if(ae.getActionCommand().equals("sub"))
		{
			z=x-y;
		}
		else
			z=x/y;
         String res=String.valueOf(z);
		tf3.setText(res);
	}//actionPerformed


public static void main(String[] args) 
	{
	 FirstApp ap=new FirstApp();
	}
}//class
