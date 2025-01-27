public class DataTypes{
	public static void main(String args[]){
		exploreInterger();
		exploreShort();
		exploreBoolean();
		exploreCharacter();
		
	}
	/**
	*boolean value is true/false
	*/
	public static void exploreBoolean(){
		
		boolean b = true;
	}
	/**
	*char is a 2byte
	*/
	public static void exploreCharacter(){
// error: incompatible types: <null> cannot be converted to char
		char ch = null;	
	}
	
	/**
	* int is 4bytes
	* size is 2147483648
	*/
	public static void exploreInterger(){
		int x = 2147483647;
		
// error: incompatible types: possible lossy conversion from long to int
//		int x1= 2147483647L;
// error: incompatible types: boolean cannot be converted to int
	//int x2=true;
	}
	
	
	
	/**
	* short is 2 bytes
	* size is 0 to 32767
	**/
	public static void exploreShort(){
		short s = 32767;
//Case 1
//		error: incompatible types: possible lossy conversion from int to short
//		short s2 = 32768;

// case 2
// error: incompatible types: possible lossy conversion from double to short
//		short s3 = 10.5;
		
// DataTypes.java:20: error: incompatible types: boolean cannot be converted to short		
//		short s4 = true;
		
//error: incompatible types: String cannot be converted to short
//		short s5 = "Hello";


	}
}