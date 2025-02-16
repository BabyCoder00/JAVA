public class Pattern3 {
    public static void main(){
        for(int i = 0; i < 4; i++){
            for(int j = 4 - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
