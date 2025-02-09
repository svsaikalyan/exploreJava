import java.util.Random;
import java.util.Arrays;


public class SortExample{
	public static void sortAscOrder(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args){
		Random r = new Random();
		int [] a = new int[10];
		for(int i=0;i<a.length;i++)
			a[i] = r.nextInt(50);
		System.out.println(Arrays.toString(a));
		sortAscOrder(a);
		System.out.println(Arrays.toString(a));
		
	}
}