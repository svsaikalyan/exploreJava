public class LargeOfThreeeExample{
	public static void main(String[] args){
		int a,b,c;
		a = 13;
		b = 21;
		c = 9;
		
	     if( a > b && a > c )
          System.out.println("a is large");
       else if( a < b && b > c )
          System.out.println("b is large");
       else if( a < c && b < c )
          System.out.println("c is large");
       else  
          System.out.println("a, b, c are not different");
	  
	}
}