import java.util.*;
import java.util.ListIterator;
public class AList{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<>();
		boolean wes = al.isEmpty();
		System.out.println(" "+wes);
		al.add("blue");
		al.add("pink");
		al.add("yellow");
		al.add("green");
		al.add("brown");
		al.add("grey");
		al.add("orange");
		al.add("lightblue");
		al.add("lightgreen");
		al.add("maroon");
		System.out.println("Original List: "+al);
		
		al.add(1,"red");
		al.add(2,"white");
		al.add(3,"lightpink");
		al.add(4,"gold");
		al.add(5,"purple");
		System.out.println("after add element 1 :"+al);
		
		al.remove(0);
		System.out.println("Element deletion 0"+al);
		
		al.remove("pink");
		al.remove("lightblue");
		al.remove("maroon");
		al.remove("orange");
		al.remove("grey");
		System.out.println("element pink lightblue maroon orange grey removed"+al);
		
		al.set(0,"white");
		al.set(2,"cyan");
		al.set(4,"coral");
		al.set(6,"black");
		System.out.println("After updation of value:"+al);
		
		 ListIterator<String> i = al.listIterator();
		 
		 System.out.println("index from 5:"+al.size());
		 while(i.hasNext()){
			 System.out.println(i.next());
		 }
		
		System.out.println("is.Empty "+al.isEmpty());
		
		
		
	}
}