import java.util.*;
public class PyramidExample{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = scanner.nextInt();
		System.out.println("");
		
		for(int i = 1;i<=n;i++){
			for(int j = 1; j<=i;j++){
				System.out.println(i);
			}
		}
		
	}
}