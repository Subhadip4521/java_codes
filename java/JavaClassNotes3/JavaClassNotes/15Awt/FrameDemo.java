import java.awt.*;
import java.awt.event.*;

public class  FrameDemo extends Frame 
{
	Font f;
    public FrameDemo()
	{
		addWindowListener(new MyClass(this));
	}

	public void paint(Graphics g)
	{
		f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
		setFont(f);
		g.setColor(new Color(255,67,89));
		setBackground(Color.yellow);
		g.drawString("hello1 how are u",100,100);
	}


public static void main(String args[])
	{
Frame f=	new FrameDemo();
f.setSize(300,300);
f.setVisible(true);
	}
}


class MyClass extends WindowAdapter
{
	FrameDemo fdd;

	MyClass()
	{}
	MyClass(FrameDemo fd)
	{
		fdd=fd;
	}
    public  void windowClosing(java.awt.event.WindowEvent we)
	{
		System.out.println("Iam in wc");
		fdd.setVisible(false);
		System.exit(0);
	}
}