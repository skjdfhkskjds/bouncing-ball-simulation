package iaSimluation;

/** 
 * @author Colin Chu
 * @description finds all values
 * 
 * Date Started: 17/01/20
 * Last Modified: 17/01/20
 */

public class BouncingBallSimulation {
	public static int y, lineY;
	public static void main(String[] args) throws InterruptedException{
		y = 70;
		lineY = 300;
		run(y, lineY);
	}
	public static void run(int y, int lineY) throws InterruptedException{
		new render(y, lineY);
	}
}
