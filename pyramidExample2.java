import java.util.*;
public class pyramidExample2{
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the n:");
		int n = scanner.nextInt();
		System.out.println("");
		for(int i =n;i>0;i--){
			for(int j=n,k=1;k<=i;j--,k++){
				System.out.println(j);
			}
			System.out.println("");
		}
		
		
	}
}