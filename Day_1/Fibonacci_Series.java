package Day_1;

public class Fibonacci_Series {
	public static void main(String[] args) {
	  int n = 15;
	  
	 for (int i = 0; i < n; i++) {
		int res = febonacci(i);
		System.out.println(res +" ");
	}
	}

	private static int febonacci(int n) {
		if (n==0 || n==1) {
			return n;
		}
		int prev = febonacci(n-1);
		int prevprev = febonacci(n-2);
	
	return prev +prevprev;
	}
}
