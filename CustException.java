class TooYoungExpection extends RuntimeException
{
	TooYoungExpection(String s)
	{
		super(s);
	}
}
class TooOldException extends RuntimeException
{
	 TooOldException(String s)
	{
		super(s);
	}
}
public class CustException{
	public static void main(String[] args){
		int age = Integer.parseInt(args[0]);
		if(age >60)
		{
			throw new TooYoungExpection("plz wait some more time");
		}
		else if(age <18)
		{
			throw new  TooOldException("your age is already crossed");
		}
		else{
			System.out.println("you will get matched");
		}
	}
}
