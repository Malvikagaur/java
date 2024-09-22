public class PassbyVal {
    static void changeVal(int a){
        a *= 100;
        System.out.println("inside change : "+a);//this has taken the value of 10 and multiplied it by 100 to give 1000
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before changing the value : "+a);
        changeVal(a);
        System.out.println("after changing the value : "+a); //output in both case will give 10 only because its pass by value another copy of a is created at some different address and it takes 10 as a
    }
}
