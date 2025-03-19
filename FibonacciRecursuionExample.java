public class FibonacciRecursuionExample
{
	public static void main(String[] args)
	{
		int n = 20;
		System.out.println("enter the series:0,1");
		for(int i=2; i<=n; i++)
		{
			System.out.println(fibonacciRecursion(i)+"");
		}
	}
		public static int fibonacciRecursion(int n)
		{
			if(n==1|n==2)
			{
				return 1;
			}
			return fibonacciRecursion(n-1)+
			fibonacciRecursion(n-2);
		}
}
