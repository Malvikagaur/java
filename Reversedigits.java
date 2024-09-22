import java.util.Scanner;
public class Reversedigits {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
        ans = ans * 10 + n % 10; // n%10 gives remaninder to add
        n/=10; // give quetient that will be next number
        }
        System.out.println(ans);
    }
}
