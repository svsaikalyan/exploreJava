import java.util.*;
public class RetainAllExample{
	public static void main(String[] args){
	    ArrayList<String> l1 = new ArrayList<>();
        l1.add("pen");
        l1.add("pencil");
        l1.add("rubber");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("pen");
        l2.add("paper");
        l2.add("books");
        l2.add("eraser");

        System.out.println("Before retainAll() l1: " + l1);
        System.out.println("Before retainAll() l2: " + l2);

        l2.retainAll(l1);

        System.out.println("After retainAll() l1: " + l1);
        System.out.println("After retainAll() l2: " + l2);
    }
}
		
	
//output:
/*
*Before retainAll() l1: [pen, pencil, rubber]
Before retainAll() l2: [pen, paper, books, eraser]
After retainAll() l1: [pen, pencil, rubber]
After retainAll() l2: [pen]
*/