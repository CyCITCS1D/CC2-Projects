/* Project by Cyrus Lloyd R. Lausan CITCS 1D - 2 */
package array2;

import java.util.Scanner;


/**
 *
 * @author Sae
 */
public class Fibon {
    
    static long f(int n) {
        if ((n == 0) || (n == 1)) {           
            return n;                       
        }
        else {
            return f(n - 1) + f(n - 2);           
        }
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");       
        int a = sc.nextInt();  
        
        /*for (int b = 0; b <= a; b++) {
            System.out.print("f(" +b+ ")" + "\t");           
        } System.out.print("\n");
        */
        
        for (int b = a; b >= 0; b--) {
            for (int c = 0; c <= b; c++) {
                System.out.print(f(c) + "\t");  
            }System.out.print("\n");
            
        }
        
    }
}
