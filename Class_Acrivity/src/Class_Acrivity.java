import java.util.Scanner;
public class Class_Acrivity {


public static void main(String[] args) {

	Scanner scanner = new Scanner (System.in);
		System.out.println("Enter number1");
		double number1=scanner.nextDouble();
		System.out.println("Enter number2");
		double number2=scanner.nextDouble();
		System.out.println("Enter number3");
		double number3=scanner.nextDouble();
		System.out.println("Enter number4");
		double number4=scanner.nextDouble();
		sum(number1, number2, number3, number4);
	}
	


private static void sum(double number1, double number2, double number3, double number4) {
	// TODO Auto-generated method stub
	System.out.println(number1+number2+number3+number4);
   }
}