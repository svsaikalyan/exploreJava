public class ReplaceAll{
	public static void main (String[] args){
		String str = "java make the lesson";
		System.out.println("original string = "+str);
		System.out.println("After replace  capital case = " +
                                      str.replaceAll("a", "A").replaceAll("e", "E"));
	}
}