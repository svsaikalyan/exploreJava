import java.util.*;
public class ContainExample{
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<>();
		a.add("blue");
		a.add("red");
		a.add("green");
		a.add("pink");
		a.add("yellow");
		a.add("black");
		a.add("cyan");
		a.add("gold");
		a.add("grey");
		a.add("maroon");
		System.out.println(a.contains("red"));
		
		System.out.println(a.contains("apple"));
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println(arr.contains(90));
		System.out.println(arr.contains(30));
		
		
	}
}

//output:
//true
//false