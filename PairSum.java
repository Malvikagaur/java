import java.util.Scanner;

public class PairSum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size");
        int n = sc.nextInt();
        int arr [] = new int[n];

        System.out.println("enter " +n+ " elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter the target sum");
        int target = sc.nextInt();

        System.out.println("the number of pairs forming the target sum are " +findSum(arr, target));
    }
    static int findSum(int [] arr, int target){
        int ans = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){//for first number that will be fixed through further traversal
            for(int j=i+1; j<n; j++){// for second number and traversing through the loop, fixed elements onwards
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
