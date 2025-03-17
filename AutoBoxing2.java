public class AutoBoxing2{
	public static void m1(long l){
		System.out.println("Widening");
	}
	public static void m1(Integer l){
		System.out.println("AutoBoxing");
		
	}
	public static void m1(int...l){
		System.out.println("var-arg");
	}
		
	
	
	public static void main(String[] args){
		
		int x = 10;
		m1(x);
		
	}
		
}