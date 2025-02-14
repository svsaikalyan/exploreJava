/*
* Example to Find two maximum numbers in array in one iteration in java.
*/
public class TwoNumber{
	public static void main(String[] args){
		int ar[] = {33,45,23,47,93};
		int maximum1 = 0;
		int Maximum2 = 0;
		
		for(int i = 0;i<ar.length;i++){
			if(maximum1<ar[i]){
				Maximum2 = maximum1;
				maximum1 = ar[i];
			}
			else if(Maximum2<ar[i]){
				Maximum2 = ar[i];
			}
		}
		System.out.println("maximum1 "+maximum1);
		System.out.println("Maximum2 " +Maximum2);
	}
}