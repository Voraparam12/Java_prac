import java.util.*;
class digitpalindrom
{
	public static void main(String arg[])
	{
		Scanner s1=new Scanner(System.in);
		int n;
		int rem=0;
		int rev=0;
		int temp;
		System.out.println("Enter Number:");
		
		n=s1.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Number is palindrom:");
			}
			else{
					System.out.println("Number is Not Palindrom");
				}
	}
	
}