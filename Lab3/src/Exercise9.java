/**Create a method to accept date and 
 * print the duration in days, months and 
 * years with regards to current system date.
 * @author Jayasri Vejendla
 * 
 * 
 */


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int a=sc.nextInt();
		System.out.println("Enter a month");
		int b=sc.nextInt();
		System.out.println("Enter date");
		int c=sc.nextInt();
		LocalDate end=LocalDate.now();
		LocalDate date=LocalDate.of(a,b,c);
		Period elapsed=date.until(end);
		System.out.println("Days: " +elapsed.getDays());
		System.out.println("Months: " +elapsed.getMonths());
		System.out.println("Years: " +elapsed.getYears());

	}

}
