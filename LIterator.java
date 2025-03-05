import java.util.*;
public class LIterator{
	public static void main(String[] args){
		ArrayList<String> k = new ArrayList<>();
		k.add("A");
		k.add("B");
		k.add("C");
		k.add("D");
		k.add("F");
		k.add("Z");
		k.add("H");
		k.add("L");
		ListIterator<String> i = k.listIterator();

        System.out.println("Iterating  list:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    
		
	}
}
//output:
/*
*A
B
C
D
F
Z
H
L
*/