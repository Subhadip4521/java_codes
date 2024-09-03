// program on menu designing
// MenuBar - for menu bar
//Menu --- Menu names
//MenuItem --MenuItem
//CheckboxMenuItem-- CheckboxMenuItem


import java.awt.*;
import java.awt.event.*;
public class MyMenu extends Frame implements ItemListener ,ActionListener
{
MenuBar mb;
Menu m1,m2;
MenuItem mi1,mi2,mi3,mi4,mi5,mi6;
CheckboxMenuItem cbmi;
TextField tf1;
MyMenu()
{
setTitle("menu design");
setSize(300,300);

mb=new MenuBar();
setMenuBar(mb);
m1=new Menu("File");
mb.add(m1);
m2=new Menu("Edit");
mb.add(m2);
mi1=new MenuItem("one");
mi1.addActionListener(this);
m1.add(mi1);
mi2=new MenuItem("two");
mi2.addActionListener(this);
m1.add(mi2);
m1.addSeparator();
mi3=new MenuItem("three");
mi3.addActionListener(this);
m1.add(mi3);
mi4=new MenuItem("four");
mi4.addActionListener(this);
m1.add(mi4);
tf1=new TextField(10);
mi5=new MenuItem("five");
mi5.addActionListener(this);
m2.add(mi5);
m2.addSeparator();
mi6=new MenuItem("six");
mi6.addActionListener(this);
m2.add(mi6);
m2.addSeparator();
setLayout(new FlowLayout());
cbmi=new CheckboxMenuItem("Seven");
cbmi.addItemListener(this);
m2.add(cbmi);
add(tf1);
setVisible(true);

}

public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();

tf1.setText(s+" clicked");

}


public void itemStateChanged(ItemEvent ie)
{

  if (cbmi.getState())
     tf1.setText("check box item is selected");
else
   tf1.setText("check box item is deselected");

}

public static void main(String args[])
{
new MyMenu();
}
}


