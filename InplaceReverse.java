import java.util.Scanner;

public class InplaceReverse {
    static void swapArrayElements(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int arr[]){
        int i = 0, j = arr.length - 1;
        while(i<j){
            swapArrayElements(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("enter " +n+ " elements of the array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        reverseArray(arr);
        
        System.out.print("Reverse of the array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
    }
}
