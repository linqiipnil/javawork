package program_list;
//ConputeAverage
import java.util.Scanner;

public class ComputeAverage {

	public ComputeAverage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three numbers:");

		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		double average = (number1 + number2 + number3) / 3;
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
		
	}
}
