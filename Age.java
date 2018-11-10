/* Project by Cyrus Lloyd R. Lausan*/

package array2;
import java.util.Scanner;

/**
 *
 * @author Sae
 */
public class Age {
    
    public static void main(String[] args){
        int age;
        
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            age = sc.nextInt();
            
            if (age < 0) {
                System.out.println("Error!");   
            }else if (age <= 2){
                System.out.println("baby");
            }else if (age <= 5){
                System.out.println("Toddler");
            }else if (age <= 12){
                System.out.println("Kid");
            }else if (age <=18){
                System.out.println("Teenager");
            }else if (age <= 59){
                System.out.println("Adult");
            }
            
        }else{
            System.out.println("Invalid Input");
        }
    }
}
