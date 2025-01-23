import java.util.Scanner;

public class RotateInplaceArray {
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    static void reverse(int arr[], int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void rotate(int arr[], int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("enter " +n+ " elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the value of k : ");
        int k = sc.nextInt();

        rotate(arr, k);
        System.out.print("array after " +k+ " rotation : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
