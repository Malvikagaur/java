public class SwapWithoutThirdVariable {

    static void swap(int a, int b){
        System.out.println("values before swap");
        System.out.println("value of a : " +a);
        System.out.println("value of b : " +b);
        // a = 3 b = 9
        a = a + b; // 3 + 9 = 12
        b = a - b; // 12 - 9 = 3
        a = a - b; // 12 - 3 = 9

        System.out.println("values after swap");
        System.out.println("value of a : " +a);
        System.out.println("value of b : " +b);
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        swap(a, b);
    }
}
