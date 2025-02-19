/**
*
*/



public class CapitalLetterExample{
	public static void main(String[] args){
		String str = "java make so super";
		System.out.println("original string = " + str);
		System.out.println("After replacing all capital letter = "+str.replaceAll("a", "A").replaceAll("e", "E").replaceAll("e","E")
		                            .replaceAll("o","O").replaceAll("a", "A"));
		
	}
}













