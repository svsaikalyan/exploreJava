import java.util.*;
import java.io.*;
public class SetAllExample{
	public static void main(String[] args){
		Set<String> s = new TreeSet<String>();
		s.add("banana");
		s.add("mango");
		s.add("apple");
		s.add("blue");
		s.add("yellow");
		System.out.println("initial set:"+s);
		
		Set<String> s1 = new TreeSet<String>();
		
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s.addAll(s1);
		System.out.println("final Set:"+s1);
	}
}