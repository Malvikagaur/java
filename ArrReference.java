import java.util.Scanner;

public class ArrReference {

    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the no. of elements");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("enter the " + n + " elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]+ " ");
        // }
        System.out.println("original array");
        printArray(arr);

        //making the copy of array

        int [] arr2 = arr;
        // for(int i=0; i<n; i++){
        //     System.out.print(arr2[i]+ " ");
        // }
        System.out.println("copy array");
        printArray(arr2);

        //changing some values of array2
        // arr2[0] = 23;
        // arr2[2] = 232;
        // this situation when we are not taking the input and assigning the values directly to the array
        // the output we will get is both the original array and copied array will be 23 33 232
    }
}
