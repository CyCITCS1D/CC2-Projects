/* Project by Cyrus Lloyd R. Lausan */

package array2;
import java.util.Scanner;
/**
 *
 * @author Sae
 */
public class Areas {
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double ans = 0;
        
        System.out.println("Enter Circle Radius: ");
        double r = sc.nextDouble();
        ans = Math.PI * Math.pow(r, 2);
        System.out.println("The area of the circle is "+ ans);
        
        
        System.out.println("\n\n Enter Square Side Length: ");
        r = sc.nextDouble();
        ans = Math.pow(r, 2);
        System.out.println("The area of the Square is "+ ans);
        
        
        System.out.println("\n\n Enter Triangle Base: ");
        r = sc.nextDouble();
        ans = 0.5 * r * r;
        System.out.println("The are of the Triangle is "+ ans);
    }
}
