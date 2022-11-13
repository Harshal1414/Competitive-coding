class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
		    int n = sc.nextInt();
		    int array[] = new int[n];
		    for( int j = 0; j < n; j++){
		        array[j] = sc.nextInt();
		    }
		    long ans = 0; 
            long modul = 998244353;
            for(int j = 0; j < n; j++){
                ans = (ans+array[j])%modul;
            }
            ans = (ans*(ans-1))%modul;
            System.out.println(ans);
		}
	}
}