import java.util.Scanner;
public class Div3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        String result;
        result = (val % 2 == 0 || val % 3 == 0)? "good" : "bad";
        System.out.println(result);
    }
}
