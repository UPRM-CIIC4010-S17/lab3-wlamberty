import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.BLACK);
		g.fillRect(x1, y1, width+1, height+1);

		//Draw a border
		//		g.setColor(Color.YELLOW);
		//		g.drawRect(x1, y1, width, height);
		//		g.setColor(Color.CYAN);
		//		g.drawRect(x1+5, y1+5, width-10, height-10);
		//
		//		g.setColor(Color.WHITE);
		//		g.drawLine(x1, y1, x2, y2);
		//
		//		g.setColor(Color.RED);
		//		g.drawLine(x2, y1, x1, y2);

		//        g.setColor(Color.LIGHT_GRAY);
		//       g.fillOval((width-60)/2, (height-60)/2, 55, 55);
        //Draw Flag

        g.setColor(Color.RED);

        g.fillRect(x1+10, y1+15, 175, 25);

        g.fillRect(x1+10, y1+65, 175, 25);

        g.fillRect(x1+10, y1+115, 175, 25);

        g.setColor(Color.WHITE);

        g.fillRect(x1+10, y1+40, 175, 25);

        g.fillRect(x1+10, y1+90, 175, 25);

        Polygon p3 = new Polygon();

        p3.addPoint(x1+10, y1+15);

        p3.addPoint(x1+77, y1+75);

        p3.addPoint(x1+10, y1+140);

        g.setColor(Color.BLUE);

        g.fillPolygon(p3);

        Polygon p2 = new Polygon();

        p2.addPoint(x1 + 15, y1 + 73);

        p2.addPoint(x1 + 31, y1 + 73);

        p2.addPoint(x1 + 37, y1 + 58);

        p2.addPoint(x1 + 43, y1 + 73);

        p2.addPoint(x1 + 59, y1 + 73);

        p2.addPoint(x1 + 46, y1 + 83);

        p2.addPoint(x1 + 51, y1 + 98);

        p2.addPoint(x1 + 37, y1 + 88);

        p2.addPoint(x1 + 24, y1 + 98);

        p2.addPoint(x1 + 28, y1 + 83);

        g.setColor(Color.WHITE);

        g.fillPolygon(p2);
	}
}