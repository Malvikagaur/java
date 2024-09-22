class MultiArr{
    void exampleArr(){
       // int[][] age = new int[4][5] declaration of multidimensional array
       int[][] arr = {{45, 44, 43}, {87, 88, 89}, {4, 6, 8}}; //array literal way of declaring array
       System.out.println(arr[0][0]); //45
       System.out.println(arr[0][1]); //44
       System.out.println(arr[0][2]); //43

       System.out.println(arr[1][0]); //87
       System.out.println(arr[1][1]); //88
       System.out.println(arr[1][2]); //89

       System.out.println(arr[2][0]); //4
       System.out.println(arr[2][1]); //6
       System.out.println(arr[2][2]); //8
    }
}
public class ArrDemo {
    public static void main(String[] args) {
        MultiArr obj = new MultiArr();
        obj.exampleArr();
    }
}
//      0  1  2
// 0  | 45 44 43
// 1  | 87 88 89
// 2  | 4  6  8