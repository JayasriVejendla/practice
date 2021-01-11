

/**Write a Java program that reads a line of integers 
 * and then displays each integer and the sum of all 
 * integersimport java.util.Scanner;
 * @author Jayasri Vejendla
 * 
 *
 */
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of integers");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println("sum is " +sum);

	}

}
