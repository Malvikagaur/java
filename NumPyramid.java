import java.util.Scanner;

public class NumPyramid {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= r-i; j++){ //space                                           //          1
                System.out.print(" ");                                                     //         121
            }                                                                                //        12321
            for(int k = 1; k <= i; k++){  //123 vali series
                System.out.print(k);
            }
            for(int l = i - 1; l >= 1; l--){ //321 vali series
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
