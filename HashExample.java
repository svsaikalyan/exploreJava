
import java.util.*;
public class HashExample{
	public static void main(String[] args){
		HashSet<String> s = new HashSet<>();
		
		System.out.println(s.add("banana"));
		System.out.println(s.add("welcome"));
		System.out.println(s.add("blue"));
		System.out.println(s.add("sunflower"));
		
		System.out.println(s.add("welcome"));
		
		System.out.println("set:"+s);
		
		System.out.println(s.add("w"));
		
		System.out.println(s.add("w"));
		
		System.out.println("set:"+s);
		
		
		
	}
}
/*
*true
true
true
true
false
set:[banana, blue, welcome, sunflower]
true
false
set:[banana, blue, w, welcome, sunflower]
*/