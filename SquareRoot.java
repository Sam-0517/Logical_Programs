package Com.BridgeLabz.LogicalProgram;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter positive Integer value ");
		double c = Utility.getIntValue();
		double t = c;
		t = ((c / t) + t) / 2;
		double epsilon = 1e-15;
		
		while (Math.abs(t - c / t) > epsilon * t) {
			t = ((c / t) + t) / 2;
	 	}
		System.out.println(t);
		
	}

}
