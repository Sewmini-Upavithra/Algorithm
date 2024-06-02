package sorting;

public class SelectionSort {

	    // Method to sort an array using Selection Sort
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;

	        
	        for (int i = 0; i < n - 1; i++) {
	            // Find the minimum element in unsorted array
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    // Method to print the array
	    public static void printArray(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    // Main method to test the Selection Sort
	    public static void main(String[] args) {
	        int[] arr = {10, 15, 25, 30, 40};

	        System.out.println("Unsorted array:");
	        printArray(arr);

	        selectionSort(arr);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }
	


}
		