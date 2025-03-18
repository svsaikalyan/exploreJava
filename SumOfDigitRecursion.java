public class SumOfDigitRecursion{
	public static void main(String[] args){
		int number = 2345;
		System.out.println("number:"+number);
		System.out.println("Sum of digit:"+sumOfDigitUsing(number));
		
		
	}
	static int sum = 0;
	public static int sumOfDigitUsing(int number){
		if(number == 0){
			return sum;
		}
		else{
			sum=sum+(number);
			sumOfDigitUsing(number/10);
		}
		return sum;
		
	}
		
}