import java.util.*;
public class CollectionExample{
	public static void main(String[] args){
		ArrayList t = new ArrayList();
		t.add("Z");
		t.add("A");
		t.add("K");
		t.add("B");
		t.add("V");
		t.add("F");
		//t.add(new Integer(10));CCE
		//t.add(null)NPE;
		System.out.println("Before sorting:"+t);
		System.out.println(t);
		System.out.println("After Sorting:"+t);
	}
	
}
/*
*Before sorting:[Z, A, K, B, V, F]
[Z, A, K, B, V, F]
After Sorting:[Z, A, K, B, V, F]
*/