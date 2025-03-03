import java.util.*;

/*public class StackExample{
	public static void main(String[] args){
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("c");
		System.out.println(s.search("A"));
		System.out.println(s.search("D"));
		
	}
}
*/


//The  3 type of cursor
public class StackExample{
	public static void main(String[] args){
		Vector v = new Vector();
		for(int i = 0;i<=10;i++){
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			Integer I = (Integer)e.nextElement();
			if(I%2 ==0)
				System.out.println(I);
			else
			{
				System.out.println(I);
				v.remove(I);
				System.out.println(v);
			}
	    }

	}
}