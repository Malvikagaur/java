import java.util.Arrays;
import java.util.Scanner;

public class ArrSmallestLargest {
    static int[] smallestAndLargestElement(int arr []){
        Arrays.sort(arr);
        int ans[] = {arr[0], arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();

        int arr [] = new int[n];
        System.out.println("enter " +n+ " the elements");
        for(int i=0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        int [] ans = smallestAndLargestElement(arr);
        System.out.println("largest : " +ans[1]); //array to be retured contains two elemet only largest at 1 and smallest at 0
        System.out.println("smallest : " +ans[0]);
    }
    
}
