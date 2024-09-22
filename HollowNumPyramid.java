import java.util.Scanner;

public class HollowNumPyramid {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= r - i; j++){
                System.out.print(" ");
            }
            for(int k = i; k <= i; k++){
                if(k == i || k == r){
                    System.out.print(k);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
