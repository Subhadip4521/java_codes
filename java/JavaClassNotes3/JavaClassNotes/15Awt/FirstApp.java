import java.awt.*;

class  FirstApp extends Frame
{
	TextField tf1,tf2,tf3;
	Button sum,mul,div,sub;
	Label l1,l2,l3;

	public FirstApp()
	{
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
		l3=new Label("Result");
		add(l3);//adds label to container(Frame)
		tf3=new TextField(10);//10 is the width of the component
		add(tf3);
		sum=new Button("Add");//add is the label on the component
		add(sum);
		sub=new Button("Sub");//add is the label on the component
		add(sub);
		mul=new Button("MultiPly");//add is the label on the component
		add(mul);
		div=new Button("Div");//add is the label on the component
		add(div);
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		setVisible(true);
	}//constructor
public static void main(String[] args) 
	{
	 FirstApp ap=new FirstApp();
	}
}
