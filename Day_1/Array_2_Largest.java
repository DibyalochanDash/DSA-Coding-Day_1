package Day_1;

public class Array_2_Largest {

	public static void main(String[] args) {
		int arr[] = {2,5,6,7,8,9};
          
		SecondLargest(arr); 
	}

	private static void SecondLargest(int[] arr) {
		int p = Integer.MIN_VALUE;
		int vp = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > p) {
				vp = p;
				p = arr[i];
			}else if (arr[i]>vp && arr[i]!= p) {
				vp = arr[i];
			}
		}
		System.out.println(vp);
	}

}
