package Day_1;

public class Palindrome_String {

	public static void main(String[] args) {
		String str = "level";
		
		checkPalindrome(str);

	}

	private static void checkPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while (i<j) {
		if (str.charAt(i)!= str.charAt(j)) {
			System.out.println("Not Palindrome");
			return;	
		}
		i++;j--;
		}
		System.out.println("Palindome");
	}
	

}
