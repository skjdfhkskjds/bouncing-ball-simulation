package iaSimluation;
import java.util.ArrayList;
import java.io.*;

public class vals {
	public static void main(String args[]) {
		ArrayList<Double> v1 = new ArrayList<Double>();
		ArrayList<Double> v2 = new ArrayList<Double>();
		ArrayList<Double> d1 = new ArrayList<Double>();
		ArrayList<Double> d2 = new ArrayList<Double>();
		ArrayList<Double> t = new ArrayList<Double>();
		
		double deltaT = 0.1;
		double g = 9.8;
		double m = 5.0;
		double k = 50.0;
		double L = 50.0;
		
		double x = 0.0;
		
		int i = 0;
		
		v1.add(0.0);
		d1.add(100.0);
		t.add(0.0);
		
		while(x >= 0.0){
			v2.add(v1.get(i) + (-g)*deltaT);
			v1.add(v2.get(i));
			d2.add(d1.get(i) + v2.get(i)*deltaT);
			d1.add(d2.get(i));
			t.add(t.get(i) + deltaT);
			x = d2.get(i);
			i++;
		}
		while(x < 0) {
			v2.add(v1.get(i) - (-g + ((4*k*x)/m)*(1-L/Math.sqrt(Math.pow(L, 2) + Math.pow(x, 2))))*deltaT);
			v1.add(v2.get(i));
			d2.add(d1.get(i) + v2.get(i)*deltaT);
			d1.add(d2.get(i));
			t.add(t.get(i) + deltaT);
			x = d2.get(i);
			i++;
		}
		try {
			PrintWriter vel1 = new PrintWriter("Velocity1.txt");
			PrintWriter vel2 = new PrintWriter("Velocity2.txt");
			PrintWriter pos1 = new PrintWriter("Position1.txt");
			PrintWriter pos2 = new PrintWriter("Position2.txt");
			PrintWriter time = new PrintWriter("time.txt");
			for(int count = 0; count < t.size()-1; count++) {
				vel1.println(v1.get(count));
				vel2.println(v2.get(count));
				pos1.println(d1.get(count));
				pos2.println(d2.get(count));
				time.println(t.get(count));
			}
			vel1.close();
			vel2.close();
			pos1.close();
			pos2.close();
			time.close();
		}catch(Exception e) {
		}
	}
}
