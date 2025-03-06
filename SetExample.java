import java.io.*;
import java.util.*;
public class SetExample{
	public static void main(String[] args){
		Set<String> s = new HashSet<>();
		s.add("greek");
		s.add("python");
		s.add("lotus");
		s.add("sunflower");
		s.add("rubber");
		s.add("mango");
		s.add("paper");
		s.add("apple");
		s.add("hello");
		s.add("14");
		System.out.println(" set"+s);
	}
	
	

}
/*
* set[greek, apple, python, 
14, paper, rubber, lotus, 
hello, sunflower, mango]
*/