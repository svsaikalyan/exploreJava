public class SwapNumber
{
	public static void main(String[] args) {
		System.out.println("value is n ,value is m");
		swapnumber(4, 5);
	}
	public static void swapnumber(int m, int n){
		int temp = m;
        m = n;
        n = temp;
		
		System.out.println("value is n ,value is m"+m+", "+n);
	}
}