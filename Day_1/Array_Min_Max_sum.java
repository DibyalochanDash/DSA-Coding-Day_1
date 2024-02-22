package Day_1;

public class Array_Min_Max_sum {
	public static void main(String[] args) {
		int[] arr = {4,6,8,9,7};
		
		ArraySum(arr);
	}

	private static void ArraySum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(max +" " + min);
		System.out.println(max + min);
		System.out.println(max * min);
		
	}

}
