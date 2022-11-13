public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
		    int n = sc.nextInt();
		    String s = sc.next();
		    HashMap <Character, Integer> map = new HashMap<>();
		    for(int j = 0; j < s.length(); j++){
		        char chh = s.charAt(j);
		        if(map.containsKey(chh)){
		            int a = map.get(chh);
		            int b = a + 1;
		            map.put(chh, b);
		        }
		        else{
		            map.put(chh, 1);
		        }
		    }
		    
		    boolean flag = true;
		    for(Character key : map.keySet()){
		        Integer x = map.get(key);
		        if(x % 2 != 0){
		            flag =false;
		            break;
		        }
		    }
		    
		    if(flag){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}