/** Create a method that accepts a number 
 * and modifies it such that the each of the 
 * digit in the newly formed number is equal 
 * to the difference between two consecutive digits 
 * in the original number. The digit in the units place
 *  can be left as it isimport java.util.Scanner;
 * @author Jayasri Vejendla
 *
 */
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int y=sc.nextInt();
		int y1=modifyNumber(y);
		System.out.println(y1*10+y%10);

	}
	private static int modifyNumber(int y) {
		int diff=0;
		int x;
		String str=Integer.toString(y);
		int a[]=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			a[i]=(int)str.charAt(i);
		}
		StringBuffer sb=new StringBuffer();
		int i=0;
		int b=a[a.length-1];
		for(i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				x=a[i]-a[i+1];
			}
			else {
				x=a[i+1]-a[i];
			}
			sb.append(x);
		}
		diff=Integer.parseInt(sb.toString());
		return diff;
	}

}
