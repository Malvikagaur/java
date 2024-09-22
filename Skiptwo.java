import java.util.Scanner;

public class Skiptwo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = n;
        for(; num >= 1 ;){// num -= 2 or num = num - 2
            System.out.println(num);
            num -= 2;
        }
    }
}
