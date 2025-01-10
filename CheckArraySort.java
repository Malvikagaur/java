import java.util.Scanner;

public class CheckArraySort {
    static boolean sortCheck(int arr []){
        boolean check = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("enter " +n+ " elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the result is : " +sortCheck(arr));
    }
}
