import java.util.Arrays;
import java.util.List;
public class WildCardDemo
{
	public static void main(String[] args){
		List<Integer> list1 = Arrays.asList(3,4,5,9);
		System.out.println("Total sum :"+sum(list1));
		List<Double> list2 = Arrays.asList(9.1,3.1,5.1,7.1);
		System.out.print("Total sum :" + sum(list2));	
	}
	private static double  sum(List<? extends Number> list)
	{
		double sum = 0.0;
		for(Number i : list){
			sum += i.doubleValue();
			
		}
		return sum ;
		
	}
	
}