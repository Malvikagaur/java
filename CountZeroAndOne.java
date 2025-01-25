import java.util.Scanner;

public class CountZeroAndOne {

    static void sortZeroandOne(int arr []){
        int n = arr.length;
        int zeroes = 0; //initial count of number of zeroes in array

        //count the number of zeroes present in the array
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }

        //0 to zeroes-1 : 0, zeroes to n-1 : 1
        for(int i = 0; i < n; i++){
            if(i < zeroes){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int arr [] = new int[n];

        System.out.print("enter " +n+ " elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("original array is : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        sortZeroandOne(arr);

        System.out.print("array after sorting 1 and 0 : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
