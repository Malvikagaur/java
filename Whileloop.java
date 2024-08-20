import java.util.Scanner;
//print 1 to n 
public class Whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1 ;
        while(num <= n){
            System.out.println(num);
            num++ ; // increment operator ++ , num = num + 1
            //++num;
        }
    }
}
