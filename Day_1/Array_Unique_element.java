package Day_1;

public class Array_Unique_element {

	public static void main(String[] args) {
		
		int []arr ={1,2,3,1,2,4};

		FindUniqueElement(arr);

	}
 private static void FindUniqueElement(int arr[]){
	 for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First unique element: " + arr[i]);
		     }
        System.out.println("No unique element found in the array.");
 }
}
