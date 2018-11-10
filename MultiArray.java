/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;
import java.util.Scanner;
/**
 *
 * @author Sae
 */
public class MultiArray {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row[] = new int[sc.nextInt()];
        int column[] = new int[row.length];
        
        for (int i = 0; i < row.length; i++) {
            System.out.print("Enter column size for row: " + i + ": ");
            column[i] = sc.nextInt();
        }
        
        int mostColumns = 0;
        for (int i = 0; i < column.length; i++) {
            if (column[i] > mostColumns) {
                mostColumns = column[i];
            }
        }
        
        String arr[][] = new String[row.length][mostColumns];
        
        System.out.print("Enter elements:\n");
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column[i]; j++) {
                System.out.print("Row " + i + " " + "Column " + j + ": ");
                arr[i][j] = sc.next();
            }
        }
        
        System.out.println();
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column[i]; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
