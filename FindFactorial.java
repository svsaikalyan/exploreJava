/*
*
Factorial of a non-negative integer, is multiplication of all integers smaller than or equal to n.
*/





public class FindFactorial {
    public static void main(String...args){ 
           int num=4; 
           System.out.println("Factorial of "+num+" is: "+findFactorail(num));     
    }
    
    
    public static int findFactorail(int num){
           
           if(num==0)
                  return 1;
    
           return num* findFactorail(num-1);
    }
}