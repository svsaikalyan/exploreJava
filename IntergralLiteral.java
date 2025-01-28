/**
What is Literals?
A constant value w...
int i =10;
int is data type
i name of vairable
10 vlaue/ li
= assignetment operator
1. Interger Literals
2. float
3. double
4. char
5. boolean
6. char
7. string

*/

public class IntergralLiteral{
	public static void main(String args[]){
//intergaralliteral
		int x =10;
		int y = 010;
		int z=0X10;
		System.out.println(x+" "+y+""+z);
		exploreDouble();
		intLitersByDecimal();
		intLitersByOctal();
		intLitersByExa();
		intLitersByBoolean();
		intLitersByCharacter();
		stringLiterals();
		
	}
	public static void exploreDouble(){
//floatpointliteral.

//eror: malformed floating-point literal
            //double d = 0X123.456;
//error: incompatible types: possible lossy conversion from double to float
		//float f = 123.456d;
	}
	
	
	/**
	* Decimal number allows 0 to 9
	*/
	public static void intLitersByDecimal(){
		int x =0786;
		}
	/**
	*allow digit are 0 to 7
	*/
	public static void intLitersByOctal(){
		int x = 010;
	}
	/**
	*allowed digit are 0 to 9, a to f or A to F 
	*/
	public static void intLitersByExa(){
		int x = 0BEER;
	}
	/**
	*only posible for the boolean value true/false
	*/
	public static void booleanLiterals(){
		boolean b =true;
	}
	/**
	*allowed range 0 to 65535
	*/
	public static void characterLiterals(){
	//error: cannot find symbol
    // Char c = a;
		char c = a;
	}
	/**
	*sequence of character with in "".
	*/
	public static void stringLiterals(){
// error: not a statement
		string s = 'java';
	}
	
}