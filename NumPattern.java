import java.util.Scanner;

public class NumPattern {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        for(int i = 1; i <= r; i++){             //121212
            for(int j = 1; j <= c; j++){         //212121 pattern
                if((i + j) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
