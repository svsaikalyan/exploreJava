import java.util.*;
public class HashEmpty{
	public static void main(String[] args){
		HashSet<String> s = new HashSet<>();
		
		System.out.println("hashset empty:"+s.isEmpty());
		
		s.add("blue");
		s.add("grapes");
		s.add("green");
		s.add("banana");
		s.add("yellow");
		s.add("pineapple");
		System.out.println("updated set:"+s);
		
		System.out.println("Hashset:"+s.isEmpty());
	}
}
/*
*hashset empty:true
updated set:[banana, green, blue, pineapple, yellow, grapes]
Hashset:false
*/