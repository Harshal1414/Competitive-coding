class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
	    int t = sc.nextInt();
        for(int i = 0; i< t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(a > b){
                if(a-b <= y){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                
            }
            else if(b>a){
                if(b-a <= x){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("YES");
            }
        }
	}
}
