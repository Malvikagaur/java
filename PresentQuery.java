import java.util.Scanner;

public class PresentQuery {
    static int[] makeFrequencyArray(int arr[]){
        int [] freq = new int[100005];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("enter " +n+ " elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int [] freq = makeFrequencyArray(arr);

        System.out.print("enter the no. of queries : ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.print("enter element to be searched : ");
            int x = sc.nextInt();

            if(freq[x] > 0){
                System.out.println("yes element is there in the orignal array");
            }else{
                System.out.println("no such element is present");
            }
            q--;
        }
    }
}
