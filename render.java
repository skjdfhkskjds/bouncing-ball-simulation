package iaSimluation;

import javax.swing.*;
import java.awt.*;

/**
 * @author Colin Chu
 * @description creates the render Date Started: 18/01/20 Last Modified:
 *              20/01/20
 */
public class render extends JFrame {
	public static int[] coordinates = new int[2];
	public JPanel contain = new JPanel();

	public render(int y, int lineY) throws InterruptedException {
		JFrame frame = new JFrame("Render Panel");
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		Circle obj = new Circle(y, lineY);
		frame.setContentPane(obj);

		while (true) {
			while (lineY <= 350) {
				obj.moveBallDown();
				frame.getContentPane().repaint();
				frame.invalidate();
				Thread.sleep(5);
				y = obj.y;
				lineY = obj.lineY;
			}
			while (y >= 70) {
				obj.moveBallUp();
				Thread.sleep(5);
				frame.getContentPane().repaint();
				frame.invalidate();
				y = obj.y;
				lineY = obj.lineY;
			}
		}
	}
}
