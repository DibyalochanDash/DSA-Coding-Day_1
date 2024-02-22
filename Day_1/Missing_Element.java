package Day_1;

public class Missing_Element {

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6};
        MissingNumber(arr);
    }

    private static void MissingNumber(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                System.out.println("Missing number: " + (arr[i] + 1));
            }
        }
    }
}



