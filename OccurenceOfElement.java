import java.util.Scanner;

public class OccurenceOfElement {
    static int countOccurence(int arr[], int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("enter " +n+ " the elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value of x : ");
        int x = sc.nextInt();

        System.out.println("count of x : " +countOccurence(arr, x));
    }
}
