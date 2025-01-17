public class SwapValues {
    static void swap(int a, int b){
        System.out.println("values before swap");
        System.out.println("value of a : " +a);
        System.out.println("value of b : " +b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("values after swap");
        System.out.println("value of a : " +a);
        System.out.println("value of b : " +b);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swap(a, b);
    }
}
