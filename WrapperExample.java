import java.util.HashMap;
import java.util.Map;

public class WrapperExample{
	public static void main(String[] args){
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"datastructure");
		hm.put(2,"data");
		hm.put(3,"bluecolor");
		hm.put(4,"greencolor");
		hm.put(5,"roseflower");
		System.out.println(hm.get(1));
		
	}
	
}