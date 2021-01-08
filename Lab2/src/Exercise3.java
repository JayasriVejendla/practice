

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		
		
		int sortedArray[] = getSorted(arr1);
		System.out.println("The Reversed array is ");
		for(int i=0;i<size;i++) {
			System.out.println(sortedArray[i]);
		}
		System.out.println("After reversing and sorting array is");
		Arrays.sort(sortedArray);
		for(int i=0;i<size;i++) {
			System.out.println(sortedArray[i]);
		}
		
}
	
	public static int[] getSorted(int arr1[]) {
		int n= arr1.length;
		int j=n;
		int reverseArray[]= new int[n];
        for (int i = 0; i < n; i++) { 
           reverseArray[j - 1] = arr1[i]; 
            j = j - 1; 
        } 
		return reverseArray;
	}
}
