import java.util.*;
public class CollectionExample1{
	public static void main(String[] args){
		ArrayList q = new ArrayList();
		q.add(15);
		q.add(20);
		q.add(0);
		q.add(34);
		q.add(23);
		q.add(30);
		System.out.println(q);
		Collections.sort(q);
		System.out.println(Collections.binarySearch(q,20,new MyComparartor()));
		System.out.println(Collections.binarySearch(q,12,new MyComparartor()));
		System.out.println(Collections.binarySearch(q,17));
		
		
	}
}
class MyComparartor implements Comparator{
	public int compare(Object obj1,Object obj2){
		Integer q1 = (Integer)obj1;
		Integer q2 = (Integer)obj2;
		return q2.compareTo(q1);
	}
}

/*
collectionOutput: 
*[15, 20, 0, 34, 23, 30]
2
-7
-3

*/
	