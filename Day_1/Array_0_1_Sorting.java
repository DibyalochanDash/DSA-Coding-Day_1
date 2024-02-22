package Day_1;

public class Array_0_1_Sorting {

	public static void main(String[] args) {
		int arr[] = {0,1,1,0,1,0,1,1,0,1};
         
		Sorting_1_0(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void Sorting_1_0(int[] arr) {
		int left = 0;
		int right = arr.length -1;
		while (left<right) {
			if (arr[left]==1  && arr[right]==0) {
				swap(arr,left,right);
				left++;
				right--;
			}
			if (arr[left]==0) {
				left++;
			}
			if (arr[right]==1) {
				right--;
			}
		}
		
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
