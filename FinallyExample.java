public class FinallyExample{
	public static void main(String[] args){
		try{
			System.out.println("inside the block");
			
			System.out.println(32/2);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		finally{
			System.out.println("Finally Exception");
		}
	}
}