import java.util.Scanner;

class Perform {
    int add(int a, int b){
        int ans = a + b;
        return ans;
    }
}
public class Method {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Perform o = new Perform();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //value of x is stored in a and y is stored in b 
        int y = sc.nextInt();

        System.out.println("the sum is : ");
        int ans = o.add(x, y);
        System.out.println(ans);
    }
}
