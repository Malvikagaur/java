import java.util.Scanner;

public class Palin {
    public static boolean checkPalindrome (final int n) {
        int rev = 0;
        int temp = n;

        while(temp != 0){
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        return(rev == n);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        if(checkPalindrome(n)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
