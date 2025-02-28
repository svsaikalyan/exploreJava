/*
*
First number of series is 0 & second number of series is 1.
*/





public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10;    
        System.out.print("FibonacciSeries : 0 1 ");
        for(int i=2; i<=n; i++){
         System.out.print(fibonacciExample(i) +" ");
        }
 
    }
    public static int fibonacciExample(int n){
        if(n == 1 || n == 2){
         return 1;
        }
        return fibonacciExample(n-1) + fibonacciExample(n-2); 
    }
   
}
