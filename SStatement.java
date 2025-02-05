/**
*what is switch statement
If serveral option are possible then it is not recommend to use nested if else because it reduce readability to handle this requiredwe gshould go switch statement.
*/

public class SStatement{
	public static void main(String [] args){
		byte b = 10;
//error: incompatible types: possible lossy conversion from int to byte
        switch(b+1)
		{
			case 10:
			case 100:
			case 1000:
		}
	}
}