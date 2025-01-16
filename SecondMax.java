
import java.util.Scanner;

public class SecondMax {

    static int findMax(int arr []){
        int max = Integer.MIN_VALUE; //initializing max as -infinity
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){   // finding the max from the element
                max = arr[i];  // new max is obtained
            }
        }
        return max;
    }

    static int findSecondMax(int arr []){
        int max = findMax(arr); //now max is obtained from the array

        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){    
                arr[i] = Integer.MIN_VALUE;  //mark the maximum obtained as -infinity
            }
        }

        int secondMax = findMax(arr);  //calling the max funtion will able to find us the second max element
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size : ");
        int n = sc.nextInt();
        int arr [] = new int[n];

        System.out.print("enter " +n+ " elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the second maximum element is : " +findSecondMax(arr));
    }
}
