// Use GridBagLayout.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*

*/
public class GridBagDemo extends Applet
implements ItemListener {
String msg = "";
Checkbox winXP, winVista, solaris, mac;
public void init() {
GridBagLayout gbag = new GridBagLayout();
GridBagConstraints gbc = new GridBagConstraints();
setLayout(gbag);
// Define check boxes.
winXP = new Checkbox("Windows XP ", null, true);
winVista = new Checkbox("Windows Vista");
solaris = new Checkbox("Solaris");
mac = new Checkbox("Mac OS");
// Define the grid bag.
// Use default row weight of 0 for first row.
gbc.weightx = 1.0; // use a column weight of 1
gbc.ipadx = 200; // pad by 200 units
gbc.insets = new Insets(4, 4, 0, 0); // inset slightly from top left
gbc.anchor = GridBagConstraints.NORTHEAST;
gbc.gridwidth = GridBagConstraints.RELATIVE;
gbag.setConstraints(winXP, gbc);
gbc.gridwidth = GridBagConstraints.REMAINDER;
gbag.setConstraints(winVista, gbc);
// Give second row a weight of 1.
gbc.weighty = 1.0;
gbc.gridwidth = GridBagConstraints.RELATIVE;
gbag.setConstraints(solaris, gbc);
gbc.gridwidth = GridBagConstraints.REMAINDER;
gbag.setConstraints(mac, gbc);
// Add the components.
add(winXP);
add(winVista);
add(solaris);
add(mac);
// Register to receive item events.
winXP.addItemListener(this);
winVista.addItemListener(this);
solaris.addItemListener(this);
mac.addItemListener(this);
}
// Repaint when status of a check box changes.
public void itemStateChanged(ItemEvent ie) {
repaint();
}
// Display current state of the check boxes.
public void paint(Graphics g) {
msg = "Current state: ";
g.drawString(msg, 6, 80);
msg = " Windows XP: " + winXP.getState();
g.drawString(msg, 6, 100);
msg = " Windows Vista: " + winVista.getState();
g.drawString(msg, 6, 120);
msg = " Solaris: " + solaris.getState();
g.drawString(msg, 6, 140);
msg = " Mac: " + mac.getState();
g.drawString(msg, 6, 160);
}
}