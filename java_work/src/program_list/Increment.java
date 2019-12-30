package program_list;

public class Increment {

	public Increment() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args) {
		int x=1;
		System.out.println("Before the call,x is " +x);
		increment(x);
		System.out.println("After the call, x is " +x);
		
	}
	
	
	public static void increment (int n) {
		n++;
		System.out.println("n inside the method is " +n);
	}
}

