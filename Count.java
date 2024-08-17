import java.util.Scanner;
public class Count{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digcount = 0;
        int o = n;
        while(n>0) {
            n = n/10;
            digcount++;
        }
        System.out.println("enter the number you want to display the count : " +o);
    }
}