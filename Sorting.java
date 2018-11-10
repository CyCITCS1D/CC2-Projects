/*Project by Cyrus Lloyd R. Lausan CITCS 1D - 2*/
package array2;

/**
 *
 * @author Sae
 */
public class Sorting {
    
    
    public static void main(String[] args) {
        int arr[] = new int[] {2,4,3,5,7,4,6,9,0};
        
        System.out.print("Before sorting:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        BubbleSort(arr);
        System.out.print("\n");
        
        System.out.print("After sorting:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void BubbleSort(int[] arr) {
        int len = arr.length;
        int temp = 0;
        
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len-i); j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
