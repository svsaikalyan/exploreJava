import java.util.*;
public class HashIterator{
	public static void main(String[] args){
		HashSet<Integer> s = new HashSet<>();
	    s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		Iterator<Integer> i = s.iterator();
		
		System.out.println("hashset:"+ s);
		while(i.hasNext()){
			System.out.println(i.next()+" ");
		}
		
		
		
	}
}
/*
*hashset:[50, 20, 70, 40, 10, 60, 30]
50
20
70
40
10
60
30
*/