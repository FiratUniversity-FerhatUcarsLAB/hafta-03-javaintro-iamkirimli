import java.util.Scanner;

import javax.swing.plaf.basic.BasicMenuItemUI;
public class odev1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Boy Girin: ");
		double boy = scanner.nextInt();
		
		System.out.print("Kilo Girin: ");
		double kilo = scanner.nextInt();
		
		double bmi = (boy*boy)/kilo;
		
		System.out.println("BMI = " + bmi);
		
		
	}

}
