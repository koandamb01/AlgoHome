package math;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(1));

	}
	
	
	static public int fibonacci(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		return fibonacci(n - 2) + fibonacci(n - 1);
	}

}
