package sorting;

public class BubbleSort {
	
	static void bubblesort(int[]arr) {
		int n = arr.length;
		int temp = 0;
		boolean swap = true;
		while(swap) {//swap==true
			swap=false;
			for(int x=1; x<(n); x++) {
				if(arr[x-1]>arr[x]) {
					temp = arr[x-1];
					arr[x-1] = arr[x];
					arr[x] = temp;
					swap = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,9,4,8,2};
		bubblesort(arr);
		System.out.println("\nAfter Sorting\n");
		for(int i= 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
			
		}
	
}
		