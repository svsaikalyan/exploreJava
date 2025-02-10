import java.util.Comparator;
import java.util.Arrays;
import java.util.Collection;
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2){
		StringBuffer sb1 = (StringBuffer)obj1;
		StringBuffer sb2 = (StringBuffer)obj2;
		return sb1.toString().compareTo(sb2.toString());
	}
}
public class ComparedExample{
	public static void main(String[] main){
		StringBuffer[] a = {
			new StringBuffer("banana"),
			new StringBuffer("apple"),
		    new StringBuffer("cherry"),
			new StringBuffer("grape"),
			new StringBuffer("mango"),
		};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}