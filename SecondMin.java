
import java.util.Scanner;

public class SecondMin {

    static int findmin(int arr []){
        int min = Integer.MAX_VALUE;
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int findSecondMin(int arr []){
        int min = findmin(arr);
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondmin = findmin(arr);
        return secondmin;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size : ");
        int n = sc.nextInt();
        int arr [] = new int[n];

        System.out.print("enter the elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the second smallest element is : " +findSecondMin(arr));
    }
}
