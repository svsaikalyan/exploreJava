import java.util.*;
public class IsEmptyExample{
	public static void main(String[] args){
		ArrayList<Integer> s = new ArrayList<>();
		boolean rre = s.isEmpty();
		System.out.println(" "+rre);
		
		s.add(21);
		s.add(23);
		s.add(34);
		s.add(45);
		rre = s.isEmpty();
		System.out.println(""+rre);
		
	}
}
