/** Create a method that accepts a String and 
 * checks if it is a positive string. A string is 
 * considered a positive string, if on moving from left 
 * to right each character in the String comes after the 
 * previous characters in the Alphabetical order.
 * @author Jayasri Vejendla
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 { static boolean isAlphabaticOrder(String s)  
{  
    // length of the string  
    int n = s.length();  
    
    // create a character array  
    // of the length of the string  
    char c[] = new char [n];  
    
    // assign the string  
    // to character array  
    for (int i = 0; i < n; i++) {  
        c[i] = s.charAt(i);  
    }  
    
    // sort the character array  
    Arrays.sort(c);  
    
    // check if the character array  
    // is equal to the string or not  
    for (int i = 0; i < n; i++)  
        if (c[i] != s.charAt(i))   
            return false;  
            
    return true;      
}  
  
public static void main(String args[]) 
{   
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String s = sc.nextLine();
	
      
      
    // check whether the string is  
    // in alphabetical order or not  
    if (isAlphabaticOrder(s))  
       System.out.println(s+" string is positive.");  
    else
        System.out.println(s+" string is not positive.");  
        
} 

}
