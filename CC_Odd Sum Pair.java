/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if(a%2!=0 && b%2==0){
		        System.out.println("YES");
		    }
		    else if(a%2!=0 && c%2==0){
		        System.out.println("YES");
		    }
		    else if(b%2!=0 && a%2==0){
		        System.out.println("YES");
		    }
		    else if(b%2!=0 && c%2==0){
		        System.out.println("YES");
		    }
		    else if(c%2!=0 && b%2==0){
		        System.out.println("YES");
		    }
		    else if(c%2!=0 && a%2==0){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
