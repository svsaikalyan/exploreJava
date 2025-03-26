public class ArithmeticExample1{
	public static void main(String[] args){
		int a = 23;
		int b = 45;
		int sum = a+b;
		System.out.println("The sum of "+a+" and "+b+" is " +sum);	
		addition(a,b);
	}
	
	public void addition(int a,int b){
		int sum = a+b;
		System.out.println("The sum of "+a+" and "+b+" is " +sum);
		
	}
}