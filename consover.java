class over
{
	over()
	{
		System.out.println("Hi I Am First");
	}
	
	over(int a)
	{
		int b=a*a;
		System.out.println(b);
	}
}
class consover
{
	public static void main(String args[])
	{
		over o1=new over();
		over o2=new over(10);
	}
}