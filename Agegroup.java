import java.util.Scanner;

public class Agegroup {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // System.out.println("hey");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if(age <=12){
            System.out.println("child");
        } else if(age > 12 && age < 18){
            System.out.println("teenager");
        } else{
            System.out.println("adult");
        }
    }
}
