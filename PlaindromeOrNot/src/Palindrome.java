
public class Palindrome {
	public static int PaliNo(int n)
	{
	   int rem,org,rev=0;
	  org=n;
	  while(n!=0)
	   {
	   rem=n%10;
	   rev=rev*10+rem;
	   n=n/10;
	   }
	   if(rev==org)
	     {
	      return rev;
	      }
	 
	        return rev;

	       }
	  
	      public static void main(String[] args)
	   {
	     int n=626;
	     int rev=PaliNo(n);
	     System.out.println(rev);
	   }

}
