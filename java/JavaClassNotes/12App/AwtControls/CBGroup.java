// Demonstrate check box group.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*

*/
public class CBGroup extends Applet implements ItemListener {
String msg = "";
Checkbox winXP, winVista, solaris, mac;
CheckboxGroup cbg;
public void init() {
cbg = new CheckboxGroup();
winXP = new Checkbox("Windows XP", cbg, true);
winVista = new Checkbox("Windows Vista", cbg, false);
solaris = new Checkbox("Solaris", cbg, false);
mac = new Checkbox("Mac OS", cbg, false);
add(winXP);
add(winVista);
add(solaris);
add(mac);
winXP.addItemListener(this);
winVista.addItemListener(this);
solaris.addItemListener(this);
mac.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie) {
repaint();
}
// Display current state of the check boxes.
public void paint(Graphics g) {
msg = "Current selection: ";
msg += cbg.getSelectedCheckbox().getLabel();
g.drawString(msg, 6, 100);
}
}