import java.util.*;
public class HashClear{
	public static void main(String[] args){
		HashSet<String> s = new  HashSet<>();
		s.add("kiran");
		s.add("krishan");
		s.add("ramu");
		s.add("ali");
		s.add("madhu");
		
		System.out.println("before hashset:"+s);
		
		s.clear();
		
		System.out.println("After hash set:"+s);
		System.out.println("hash set isEmpty() :"+s.isEmpty());
	}
}
/*
*before hashset:[madhu, ramu, kiran, krishan, ali]
After hash set:[]
hash set isEmpty() :true
*/