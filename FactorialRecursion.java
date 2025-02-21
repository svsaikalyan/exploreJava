public class FactorialRecursion{
	public static void main (String[] args){
		int num = 7;
		System.out.println("FactorialRecursion"+num+findFactorial(num));
	}
	
	public static int findFactorial(int num){
		if(num==0)
			return 1;
		
		return num*findFactorial(num-1);
		
	}
}