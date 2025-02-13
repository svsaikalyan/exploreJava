/*
* Example to Find number is odd or even without % operator in java >
*/
public class EvenNumber{
	public static void main(String[] args){
		int x = 32;
		if((x&1)==0)
			System.out.println(x+" is EVEN");
		else
			System.out.println(x+" is ODD");
    }
}