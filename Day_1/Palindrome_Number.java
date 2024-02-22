package Day_1;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		int num = 12221;
		
		boolean check = PalindromeNumber(num);
		if (check) {
			System.out.println("Palindrome ");
		}else {
			System.out.println("Not Palindrome ");
		}
	}

	private static boolean PalindromeNumber(int num) {
		int originalNumber = num;
		int reverse = 0;
		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num /10;
		}
		return originalNumber == reverse;
	}

}
