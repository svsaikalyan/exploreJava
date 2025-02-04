/**
*what is conditional Operator or Tenory 
we can only ternary operator avaliable in java is known as conditional operator.
condition ? expression1 : expression2

note : 
1. expresion1 and expression2 should be same data type
e.g incompatible types: bad type in conditional expression
	int food = 5<2?3:"4";

*/


public class ConditionalOperator{
	public static void main (String[] args){
		byTernary();
		
		int a = 20,b=10;
		int x = (a>b) ?40:50;
		System.out.println(x);
	}
	public static void byTernary(){
		int owl = 5;
//		incompatible types: bad type in conditional expression
//        int food = owl<2?3:"4";
		int food = owl<2?3:4;
		System.out.println(food);
	}
	
}