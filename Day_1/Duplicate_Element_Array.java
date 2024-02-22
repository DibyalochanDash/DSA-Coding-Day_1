package Day_1;

public class Duplicate_Element_Array {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 2, 1, 3};
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {
    	System.out.print("Duplicate are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
