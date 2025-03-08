import java.util.*;
public class QueueDemo{
	public static void main(String[] args){
		PriorityQueue q = new PriorityQueue(15,new MyComparator());
		q.offer("grey");
		q.offer("blue");
		q.offer("green");
		q.offer("yellow");
		q.offer("voilent");
		q.offer("pink");
		System.out.println(q);
		
		
		
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
			
		}
		
	}
	
