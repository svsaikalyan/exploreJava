import java.util.Scanner;
public class Switch{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter grade from (A B or C) ");
		String str = scanner.next();
	    char grade = str.charAt(0);
		switch(grade) {
			case 'A':
			System.out.println("grade A - marks>=80");
			break;
			case 'B':
			System.out.println("grade B - marks>=60");
			break;
			case 'c':
			System.out.println("grade c - marks>=40");
			break;
			default:
			       System.out.println("invalid grade");
				   break;
			
		}
	}
}