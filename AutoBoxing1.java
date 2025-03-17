public class AutoBoxing1{
	public static void main(String[] args){
		
		Integer x = new Integer(10);
		Integer y = new Integer(10);
		System.out.println(x==y);
		
		Integer a = new Integer(10);
		Integer b = 10;
		System.out.println(a==b);
		
		Integer c = (10);
		Integer d = (10);
		System.out.println(c==d);
		
		Integer r = (100);
		Integer s = (100);
		System.out.println(r==s);
		
		Integer g = (1000);
		Integer h = (1000);
		System.out.println(g==h);
		
		Integer k = (10000);
		Integer j = (10000);
		System.out.println(k==j);
		
		
	}
	
	
}