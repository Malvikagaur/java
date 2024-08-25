public class Continue1 {
    public static void main(String[] args) {
        
        // for(int num = 1; num <= 50; num++){
        //     if(num % 3 == 0){
        //         continue;
        //     }
        //     System.out.println(num);
        // }
        int num = 1;
        while(num <= 50){
            if(num % 3 == 0){
                num++;
                continue;
            }
            System.out.println(num);
            num++; // in while loop there is a fault we have to write num++ twice here because agr yahi likha rahega toh 1 2 print krne k baad vo kuch print hi nahi karega but iteration chalti rahegi
            //that is why upr num++ likhna is important 
        }
    }
}
