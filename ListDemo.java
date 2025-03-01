import java.util.*;
public class ListDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> I = new ArrayList<String>();
		I.add("A");
		I.add("10");
		I.add(null);
		System.out.println(I);
		I.remove(2);
		System.out.println(I);
		I.add(2,"M");
		I.add("N");
		System.out.println(I);
	}
}