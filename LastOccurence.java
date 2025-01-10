import java.util.Scanner;

public class LastOccurence {
    static int lastIndexOfElementOccured(int [] arr, int x){
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter " +n+ " elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element x : ");
        int x = sc.nextInt();

        System.out.println("last time the element occured at index : " +lastIndexOfElementOccured(arr, x));
    }
}
