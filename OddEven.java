import java.util.Scanner;
public class OddEven 
{
    public static void main (String args[]){
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     if(n % 2 == 0)
     {
     System.out.println("num is even");
     }
     else{
        System.out.println("odd");
     }

    }
}