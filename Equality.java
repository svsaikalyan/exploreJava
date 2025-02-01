/**
*what is Equality
we can apply equality operator for every primitive type including boolean type. 
*/

public class Equality{
	public static void main(String[] args){
		Thread t = new Thread();
	    Object o = new Object();
	    String s = new String("durga");
	    System.out.println(t == o);
	    System.out.println(o == s);
 //error: incomparable types: String and Thread
//	    System.out.println(s == t);
    }
	
	
}