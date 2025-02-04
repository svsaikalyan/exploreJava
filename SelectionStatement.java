public class SelectionStatement{
	public static void main(String[] args){
		int x = 0;
//error: incompatible types: int cannot be converted to boolean.
		if (x){
			System.out.println("hello");
		}
		else{
			System.out.println("hi");
		}
	}
}