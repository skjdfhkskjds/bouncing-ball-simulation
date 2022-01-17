package iaSimluation;

import javax.swing.*;
import java.awt.*;

/** 
 * @author Colin Chu
 * @description implements the shape into a panel
 * Date Started: 17/01/20
 * Last Modified: 21/01/20
 */

public class Circle extends JPanel {
	public int y, lineY;

	public Circle(int y, int lineY) {
		this.y = y;
		this.lineY = lineY;
	}

	public void moveBallDown() {
		y++;
		if (y > 300) {
			lineY++;
		}
	}

	public void moveBallUp() {
		y--;
		if (y >= 300) {
			lineY--;
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.RED);
		g2d.fillOval((168), (y - 30), 30, 30);

		// box
		g2d.setColor(Color.black);
		g2d.drawRect(15, 75, 250, 250);
		g2d.drawRect(105, 25, 250, 250);
		g2d.drawLine(15, 75, 105, 25);
		g2d.drawLine(265, 75, 355, 25);
		g2d.drawLine(15, 325, 105, 275);
		g2d.drawLine(265, 325, 355, 275);

		// tension lines
		g2d.drawLine(140, 325, 182, lineY);
		g2d.drawLine(60, 300, 182, lineY);
		g2d.drawLine(310, 300, 182, lineY);
		g2d.drawLine(230, 275, 182, lineY);
	}
}
