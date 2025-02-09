import java.util.Random;
import java.util.Arrays;


public class RandomSort{
	public static void main(String[] args){
		Random r = new Random();
		int [] a = new int[10];
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length;i++){
			a[i] = r.nextInt(50);
		}
		System.out.println(Arrays.toString(a));
		
	}
}