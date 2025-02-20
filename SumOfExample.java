public class SumOfExample{
	public static void main(String[] args){
		String s = "javacourses";
		char ch[] = s.toCharArray();      
		int sum = 0;
		for(int i=0;i<ch.length;i++){
			try{
				int x = Integer.valueOf(String.valueOf(ch[i]));
				if(x %2 == 0){
					sum +=x;
				}
			}
			catch(Exception e){
				
			}
		}
		System.out.println(sum);
	}
}