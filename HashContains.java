import java.util.*;
public class HashContains{
	public static void main(String[] args){
		HashSet<Integer> s = new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		System.out.println("Hashset contains:"+s);
		
		System.out.println("HashSet Contains 2: "+ s.contains(2));
		System.out.println("HashSet Contains 10: "+ s.contains(10));
		System.out.println("HashSet Contains 16: "+ s.contains(16));
		
	}
}

/*
*contains:[80, 50, 20, 70, 40, 10, 90, 60, 30]
 Contains 2: false
 Contains 10: true
 Contains 16: false
*/