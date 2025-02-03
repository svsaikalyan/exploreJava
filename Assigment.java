/**
*what is assigment operators.
They are 3 type of assigment operator.
1. Simple operators (=)
2. Chained assigment (e.g a= b = c= d)
3. Compound assigment(+=, -=, *=, /=, %=)
*/

public class Assigment{
	public static void main(String[] args){
		simpleOpertor();
		chainedAssigment();
		compoundassigment();
	}
	/*
	* 1. Simple operators (=)
	*/
	private static void simpleOpertor(){
		int x = 20;	// only variable = assigment operator, 20 is the value 
		System.out.println(x);// here x value is 20
		System.out.println("simpleOpertor completed");
		
	}
	/**
	* 2. Chained assigment (e.g a= b = c= d)
	*/
	public static void chainedAssigment(){
		int a, b, c;	// here a, b c are the variable names of type is int.
		a=b=c = 20;		// Here a, b, c value is 20
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("chainedAssigment completed");
	}
	
	/**
	* 3. compound assigment(+=, -=, *=, /=, %=)
	* note : there should not any space present between them. e.g + =
	* b= 10;
	* b+=30 0-> b= b+30;
	**/
	public static void compoundassigment(){
		byte b = 10;
		b += 25;
//		error: illegal start of expression
//      b+ =25;
	
		System.out.println(b);
		System.out.println("compondAssignment completed for +=");
		
		int i = 20;
		i -= 5;
		System.out.println(i);
		System.out.println("compondAssignment completed for -=");
		
		int c = 30;
		c *=5;
		System.out.println(c);
		
		int f = 12;
		f /= 4;
		System.out.println(f);
		
		int s = 56;
		s %= 4;
		System.out.println(s);
	}	
}

