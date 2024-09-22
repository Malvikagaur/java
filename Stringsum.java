import java.util.Scanner;

public class Stringsum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        // while(num != -1){
        //     sum += num;
        //     num = sc.nextInt();
        // }
        do{
            sum += num;
            num = sc.nextInt();
        } while(num != -1);
        System.out.println(sum);
    }   
}
