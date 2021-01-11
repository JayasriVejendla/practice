/**Create a method which accepts an array
 *  of integer elements and return the 
 *  second smallest element in the array**/
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements into array");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			
		}
		int size=array.length;
		Arrays.sort(array);
		int res=array[1];
		System.out.println("second smallest element is :"+res);

	}

}
