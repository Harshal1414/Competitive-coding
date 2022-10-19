import java.util.*;
public class CC_Different_Consecutive_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            String s = sc.next();
            if(s.length()==n){
                int count = 0;
                for(int j = 0; j < s.length()-1; j++){
                    if(s.charAt(j)==s.charAt(j+1)){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
