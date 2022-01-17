package iaSimluation;

import java.util.Scanner;
import java.io.File;

public class reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner s = new Scanner(new File("Postion1.txt"));
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
