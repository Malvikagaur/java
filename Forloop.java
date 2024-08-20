import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int num = 0; num <= n; num++){
            System.out.println(num);
        }
    }
}
