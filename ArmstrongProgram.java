public class ArmstrongProgram{
	public static void main(String[] args){
		int number = 153;
		int sum = 0;
		int temp = number;
		while(temp>10){
			int rem = temp % 10;
			sum+=(rem*rem*rem);
			temp = temp/10;
		}
		if(number == sum)
			System.out.println(number +"is armstrong number");
		else
			System.out.println(number +"is not armstrong number");
	}
	
}