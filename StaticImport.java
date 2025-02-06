/*
*what is static import.
In Java, static import concept is introduced in 1.5 version. With the help of static import, 
we can access the static members of a class directly without class name or any object.
*/

import static java.lang.Math.sqrt;
import static java.lang.Math.*;


public class StaticImport{
	public static void main(String[] args){
		System.out.println(sqrt(4));
		System.out.println(max(10,20));
		System.out.println(random());
		
	}
}