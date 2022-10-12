import java.util.*;
public class CC_Tax_in_Chefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int x = sc.nextInt();
            if(x>100){
                System.out.println(x-10);
            }
            else{
                System.out.println(x);
            }
        }
    }
}
