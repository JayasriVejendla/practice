import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String arr[]=new String[n];
		String arr1[]=new String[n];
		System.out.println("Enter the elements into array");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.next();
		}
		Arrays.sort(arr);
	if(n%2==0) {
		for(int i=0;i<n/2;i++) {
			arr1[i]=arr[i].toUpperCase();
		}
		for(int j=n/2;j<n;j++) {
			arr1[j]=arr[j];
		}
		for(String s:arr1) {
			System.out.println(s);
		}
	}
	else {
		for(int i=0;i<n/2+1;i++) {
			arr1[i]=arr[1].toUpperCase();
		}
		for(int j=n/2+1;j<n;j++) {
			arr1[j]=arr[j];
		}
		for(String s:arr1) {
			System.out.println(s);
		}
	}

}
}








