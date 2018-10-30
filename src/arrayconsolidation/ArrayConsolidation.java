/*
Callum MacLeod
26/10/2018
ICS3U Mr. Kaune
 */

package arrayconsolidation;
import java.util.Scanner;
/**
 *
 * @author camac2045
 */
public class ArrayConsolidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        int total = 0;
        System.out.println("------Average Calculator-----");
        System.out.println("Enter the amount of grades you would like to input:");
        final int NUMS = keyedInput.nextInt();        
        
        int []grades = new int [NUMS];
        System.out.println("");
        System.out.println("Enter all your grades:");
        
        
        for (int i = 0; i < NUMS; i = i+1)
        {
           grades[i] = keyedInput.nextInt();
        }
        
        for (int i = 0; i < NUMS; i = i+1)
        {
           total = total+grades[i];
        }
        total = total/NUMS;
        
        System.out.println("Your average is:");
        System.out.println(total);
    }
    
}
