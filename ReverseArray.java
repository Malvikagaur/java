import java.util.Scanner;

public class ReverseArray {

    static int [] reverse(int arr[]){
        int n = arr.length;
        int ans [] = new int[n];
        int j = 0;
        
        for(int i=n-1; i>=0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        // int arr [] = {1, 2, 3, 4, 5};
        // int ans [] = reverse(arr);
        // for(int i=0; i<ans.length; i++){
        //     System.out.print(ans[i]+ " ");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("enter " +n+ " elements of the array that you want to reverse : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = reverse(arr);
        System.out.print("the reversed array is : ");
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
