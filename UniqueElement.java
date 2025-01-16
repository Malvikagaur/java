
import java.util.Scanner;

public class UniqueElement {
    static int findUnique(int arr[]){
        int ans = -1;
        int n = arr.length;

        for(int i=0; i<n;i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return  ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("enter " +n+ " elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the unique element is : " +findUnique(arr));
    }
}
