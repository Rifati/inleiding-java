package h02;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class NaamOpScherm_1 extends Applet {

	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public void init() {
	    setBackground(Color.white);
	  }

	  public void paint(Graphics g) {
	    g.setColor(Color.blue);
	    g.drawString("Rifati", 50, 60 );
	    g.setColor(Color.red);
	    g.drawString("Musa Huseni", 50,70);
	 
	    
	                                      
	
}
}