/** Create a class containing a method to
 *  create the mirror image of a String. 
 *  The method should return the two Strings 
 *  separated with a pipe(|) symbol .
 *  @author Jayasri Vejendla
 *  
 *  
 */

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String str2=getImage(str);
		System.out.println("Mirror image of String");
		System.out.println(str+"|"+str2);

	}
	private static String getImage(String str) {
		StringBuffer s1=new StringBuffer(str);
		StringBuffer str3=s1.reverse();
		String str4=str3.toString();
		return str4;
	}

}
