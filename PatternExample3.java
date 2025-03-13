import java.util.*;
public class PatternExample3{
	public static void main(String[] args){
	Scanner scanner = new Scanner (System.in);
    System.out.println("enter the n:");
    int n = scanner.nextInt();
    for(int i = n;i>0;i--){
		for(int j=i,k=1;k<=i;j--,k++){
			System.out.println(j);
		}
		System.out.println("");


	}		
		
	}
	
	
}
