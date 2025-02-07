/**
*what is swap number.
A "swap number" refers to the act of exchanging the values of two numbers, 
essentially meaning you take the value of one variable.
*/

public class SwapTwoNumber{
	public static void main(String[] args){
		int x =2,y=4;
		System.out.println("before swapping, x= " + x + " and y= " + y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping,x="+x+"and y="+y);
	}
}