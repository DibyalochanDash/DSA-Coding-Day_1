package Day_1;

public class Prime_Number {

	public static void main(String[] args) {
	  int num = 52;
	  primeCheck(num);
	  
	  
	
	  int n = 10;
	  primeNumber10(n);
	  int count = 0;
	  for (int i = 2; count < n; i++) {
		if (primeNumber10(i)) {
			System.out.println(i);
			count++;
		}
	}

	}

	private static boolean  primeNumber10(int n) {
		for (int i = 2; i*i < n; i++) {
			if (n%i ==0) {
				return false;
			}
		}
		return true;
	
		
	}

	private static void primeCheck(int num) {
		for (int i = 2; i * i<= num; i++) {
			if (num%2 ==0) {
				System.out.println("not Prime");
				return;
			}
		}
		System.out.println("Prime");
	}

}
