/*Lausan, Cyrus Lloyd R. CITCS - 1D */
package array2;

import java.util.Arrays;

public class Array2 {
    
    public static void main(String[] args) {
       
       int[] n = {3,9,15,20,65,23,18,4,2,14};
       
        Arrays.sort(n);
        
        int[] odd = new int[n.length];
        int[] even = new int[n.length];
        
        int oddCount = 0;
        int evenCount = 0;


        for (int i = 0; i < n.length; i++) {
            
            if(n[i] % 2 == 0) {
                even [evenCount] = n[i];
                evenCount++;
                
            } else {
                odd[oddCount] = n[i];
                oddCount++;
            }
            
        }
        
        System.out.println("Odd \t Even");
        
        for (int i = 0; i < oddCount; i++)

            System.out.println(odd[i]+"\t"+even[i]);
        }
        
    }
