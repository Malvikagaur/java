
import java.util.Scanner;

public class RepeatingNum {
    static int findFirstRepeating(int arr []){
        int n = arr.length;
        for(int i=0; i<n; i++){ //fixing the first number
            for(int j=i+1; j<n; j++){ //finding the secomd number that is repeating
                if(arr[i] == arr[j]){
                    return arr[i]; //the repeating number will be returned and we will come out of the loop
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int arr [] = new int[n];

        System.out.print("enter " +n+ " elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the first repeating element is : " +findFirstRepeating(arr));
    }            
}
