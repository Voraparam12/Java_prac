import java.util.*;

class maximumofthree
{
	public static void main(String arg[])
	{
		Scanner s1=new Scanner(System.in);
		int a;
		int b;
		int c;
		int max;
		System.out.println("Enter Numbers:");
		a=s1.nextInt();
		b=s1.nextInt();
		c=s1.nextInt();
	 
	max= a>b?(a>c ? a:c) : (b>c ? b:c);

	System.out.println("Maximum of three is:"+max);
	}
}