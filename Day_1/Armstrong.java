package Day_1;

public class Armstrong {
	public static void main(String[] args) {
		
		int  num = 153;
		
		ArmstrongNumbercheck(num);
		
	}

	private static void ArmstrongNumbercheck(int num) {
		int sum = 0;
		int originalNumber = num;
		
		while(num > 0) {
		 int rem = num % 10;
		  sum = sum + (rem*rem*rem);
		  num =  num /10;
		}
		if (sum == originalNumber) {
			System.out.println("Armstrong ");
		}else {
			System.out.println(" Not Armstorng");
		}
		
	}

}
