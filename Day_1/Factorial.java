package Day_1;

public class Factorial {

	public static void main(String[] args) {
		int n = 10;
		int res = factorial(n);
		System.out.println(res);

	}

	private static int factorial(int n) {
		if (n==0) {
			return 1;
		}
		return n * factorial(n-1);
	}
	

}
