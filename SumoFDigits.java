public class SumoFDigits {
    public static void main(String...args){
           
           int number=3456;  
		   //System.out.println("number     : "+number);
           System.out.println("sum of digits : "+sumOfDigits(number));
           
    }
    static int sum=0;
    public static int sumOfDigits(int number){
           
           if(number == 0){
         return sum;
        }
           else{
         sum = sum + (number%10);
         sumOfDigits(number/10);
        }
        return sum;
    }
 
}