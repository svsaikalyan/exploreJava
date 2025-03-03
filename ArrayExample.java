import java.util.*;
public class ArrayExample{
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.add("kalyan");
		l.add(45);
		l.add("rani");
		l.add(0,"testing");
		l.add(0,"venkatesh");
		l.removeLast();
		l.addFirst("ccc");
		System.out.println(l);
		
		
	}
}