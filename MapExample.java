import java.util.*;
public class MapExample{
	public static void main(String[] args){
		HashMap m = new HashMap();
		m.put("charan", 200);
		m.put("kiran",300);
		m.put("saran",500);
		m.put("varun",700);
		System.out.println(m);
		
		System.out.println(m.put("charan",200));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator i =s1.iterator();
		while(i.hasNext()){
			Map.Entry m1 = (Map.Entry)i.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("charan")){
				m1.setValue(10000);
			}
			
		}
			System.out.println(m);
		
		
		
	}
}