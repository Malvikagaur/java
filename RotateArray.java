
import java.util.Scanner;

public class RotateArray {
    static int [] rotate(int arr [], int k){// returning an array of int type and receiving an array
        int n = arr.length;
        k = k % n;
        int ans [] = new int[n];
        int j = 0; // variable used to insert value in ans array

        for(int i = n - k; i < n; i++){ //for first part of the array - that is put infront
            ans[j++] = arr[i];
        }

        for(int i=0; i < n - k; i++){ // the later part - that is put at back
            ans[j++] = arr[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int arr [] = new int[n];

        System.out.print("enter " +n+ " elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the size of k : ");
        int k = sc.nextInt();

        int ans [] = rotate(arr, k);
        System.out.print("array after rotation is : ");
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
