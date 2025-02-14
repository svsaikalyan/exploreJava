/*
* Example to Find number is odd or even without % operator in java >
*/
public class EvenNumber{
	public static void main(String[] args){
		int x = 31;
		evenOrOddByWithoutModule(x);
		isEvenOrOddNumber(32);
    }
	/**
	Write a program is a number is even or odd.
	any number module of 2 is 0 then even else odd number
	*/
	public static void  isEvenOrOddNumber(int x){
		if((x%1)==0)
			System.out.println(x+" is EVEN");
		else
			System.out.println(x+" is ODD");
	}
	
	
	/**
	Write a program to find number is odd or even without % operator in java.
	We will convert our decimal number into binary, binary number consists of only 0 and 1's ,
if its last digit is 1, then number is EVEN in java.
if its last digit is 0, then number is ODD in java.
	*/
	public static void evenOrOddByWithoutModule(int x){
		if((x&1)==0)
			System.out.println(x+" is EVEN");
		else
			System.out.println(x+" is ODD");
	}
}