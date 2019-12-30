package program_list;

import java.util.Scanner;

//SimpleIfDemo
public class SimpleIfDemo {

	public SimpleIfDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		
		int number =input.nextInt();
		
		if (number % 5 ==0) {
			System.out.println("HiFive");
		}
		
		if (number % 2 ==0) {
			System.out.println("HiEven");
		}
	}

}
