import java.util.*;
public class HashElementExample{
	public static void main(String[] args){
		Hashtable<String,Integer> ht = new Hashtable<>();
		ht.put("Arraays",01);
		ht.put("class",02);
		ht.put("solution",03);
		ht.put("white",04);
		ht.put("element",05);
		Enumeration<Integer> values = ht.elements();
        while (values.hasMoreElements()) {
			System.out.println(values.nextElement());

		}			
		
	}
}