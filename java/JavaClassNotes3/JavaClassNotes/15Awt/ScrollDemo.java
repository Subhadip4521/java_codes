import java.awt.*;
import java.awt.event.*;

public class  ScrollDemo extends Frame implements AdjustmentListener
{
	Label l1,l2,l3;
	Scrollbar sb1,sb2,sb3;
	TextArea ta;
	public ScrollDemo()
	{
		setVisible(true);
		setSize(345,345);
		setLayout(new FlowLayout());
		l1=new Label("Red");
		sb1=new Scrollbar(Scrollbar.HORIZONTAL,10,20,0,255);
		add(l1);
		add(sb1);
		l2=new Label("Green");
		sb2=new Scrollbar(Scrollbar.HORIZONTAL,10,20,0,255);
		add(l2);
		add(sb2);
		l3=new Label("Blue");
		sb3=new Scrollbar(Scrollbar.HORIZONTAL,10,20,0,255);
		add(l3);
		add(sb3);
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);
		ta=new TextArea(34,56);
		add(ta);
	}
	public void adjustmentValueChanged(AdjustmentEvent aje)
	{
		int r=sb1.getValue();
		int g=sb2.getValue();
		int b=sb3.getValue();

		Color cl=new Color(r,g,b);
		ta.setBackground(cl);
		ta.setText("  "+r+"  "+g+"  "+b);
	}
	public static void main(String[] args) 
	{
		ScrollDemo sd=new ScrollDemo();
	}
}
