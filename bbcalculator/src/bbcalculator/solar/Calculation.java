package bbcalculator.solar;

public class Calculation {
	static int  sum,sub,mul,div;
	//Method for addition
	public static int add(int num1, int num2){
		sum = num1+num2;
		return sum;

	}
	//Method for subtraction
	public static int substract(int num1, int num2){
		sub = num1-num2;
		return sub;
	}
	//Method for multiplication
	public static int multiply(int num1, int num2){
		mul = num1*num2;
		return mul;
	}
	//Method for division
	public static float divide(int num1, int num2){
		div = num1/num2;
		return div;
	}

}
