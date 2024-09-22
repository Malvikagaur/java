import java.util.Scanner;

public class DecimalToBinary {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();
        int ans = 0; //our bibnary num result
        int pw = 1; // power with base 10

        while(decimal_num > 0){
            int parity = decimal_num % 2; 
            ans += (parity * pw); //parity is remainder on division by 2
            pw *= 10;
            decimal_num /= 2; 
        }
        System.out.println(ans);
    }
}
