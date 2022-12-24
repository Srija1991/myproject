package bbcalculator.solar;
import java.util.Scanner;
public class MainClass {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scan.nextInt();

		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
                //set the values from Calcvalues
		calcvalues calVO = new calcvalues ();
		calVO.setFirstNumber(num1); 
		calVO.setSecondNumber(num2);
		
		Calculation cal = new Calculation();
		
		int addResult = cal.add(calVO.getFirstNumber(),calVO.getSecondNumber());
		System.out.println("Addition Result ="+addResult);
		
		int subResult=cal.substract(calVO.getFirstNumber(),calVO.getSecondNumber());
		System.out.println("Subtraction Result ="+subResult);
		
		int mulResult = cal.multiply(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Multiplication Result ="+mulResult);
		
		float divResult = cal.divide(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Division Result ="+divResult);
	}
}
