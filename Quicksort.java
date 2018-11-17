import java.util.Scanner;
public class Quicksort {
static int partition(int arr[], int low, int high){
    int pivot = arr[high];
    int a = (low-1);
    for(int b = low; b < high; b++){
        if(arr[b] <= pivot){
            a++;
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
    int temp = arr[a + 1];
    arr[a+1] = arr[high];
    arr[high] = temp;
    
    return a + 1;
}
static void sort(int arr[], int low, int high){
    if(low < high){
        int c = partition(arr, low, high);
        sort(arr, low, c-1);
        sort(arr, c+1, high);
    }
}
static void print(int arr[], int d){
    for(int e = 0; e < d; e++){
        System.out.print(arr[e]+" ");
    }System.out.print("\n");
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int f = sc.nextInt();
        int arr[] = new int [f];
        for(int g = 0; g < f; g++){
            System.out.print("Index ["+g+"]: ");
            int h = sc.nextInt();
            arr[g] = h;
        }
        sort(arr, 0, f-1);
        System.out.println("Sorted Array:");
        print(arr, f);
    }
    
}

