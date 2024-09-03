import java.applet.*;
import java.awt.*;
/*<applet code="MyApp1" height=300 width=300>
</applet>*/
public class MyApp1 extends Applet
{
String s=" ";
public void init ()
{
setBackground (Color.green);
setForeground (Color.red);
s=s+" INIT ";
}
public void start ()
{
s=s+" START ";
}
public void stop ()
{
s=s+" STOP ";
}
public void destroy ()
{
s=s+" DESTROY ";
}
public void paint (Graphics g)
{
Font f=new Font ("arial", Font.BOLD, 40);
g.setFont (f);
g.drawString (s,100,100);
}
}