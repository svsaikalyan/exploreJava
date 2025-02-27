/*
*So, whenever we needed to handle more than one specific exception but take some action for all exceptions, 
we had to have more than one catch block containing the same code.

Syntax
try {  
  
} 
catch (ExceptionType1 | Exceptiontype2 ex){   
    // catch block

*/



import java.io.*;
public class MultiExample{
	public static void main(String[] args){
		try
		{
			//System.out.println(10/0);
			String s  = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException | NullPointerException e){
			System.out.println(e);
		}
	}
}