class MultiArr{
    void exampleArr(){
       // int[][] age = new int[4][5] declaration of multidimensional array
       int[][] arr = {{45, 44, 43}, {87, 88, 89}}; //array literal way of declaring array
    //    System.out.println(arr[0][0]); //45
    //    System.out.println(arr[0][1]); //44
    //    System.out.println(arr[0][2]); //43

    //    System.out.println(arr[1][0]); //87
    //    System.out.println(arr[1][1]); //88
    //    System.out.println(arr[1][2]); //89

    //    System.out.println(arr[2][0]); //4
    //    System.out.println(arr[2][1]); //6
    //    System.out.println(arr[2][2]); //8

    for(int i = 0; i < arr.length; i++){ //this loop is for outer array which defines the size that is 2 (0,1)
        for(int j = 0; j < arr[i].length; j++){ //this loop is for inner array the elemets which are to be placed they are in terms of arr[0][0] and so on
            System.out.println(arr[i][j]); 
        } //this is the utility of lenth method in place of arr.lenth we could have write i<2 and j<3
    }
    }
    void sumArray(){
        int arr[] = {23, 3, 2, 5, 12, 10, 3456};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
    void maxofArray(){
        int[] arr = {10, 34, 23456, 12, 56, 12339578};
        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("max element : " +ans);
    }
    @SuppressWarnings("unused")
    void searchofElement(){
        int [] arr = {12, 45, 34, 21, 1234, 1245, 3412, 4512, 4123, 3124};
        int x = 1234;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
            }  
        }
        System.out.println("element " + x + " found at index " +ans);    
    }
}
public class ArrDemo {
    public static void main(String[] args) {
        MultiArr obj = new MultiArr();
        //obj.exampleArr();
        //obj.sumArray();
        //obj.maxofArray();
        obj.searchofElement();
    }
}
//      0  1  2
// 0  | 45 44 43
// 1  | 87 88 89
// 2  | 4  6  8