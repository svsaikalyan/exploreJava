public class maximumNumber {
 public static void main(String a[]) {
           int ar[] = { 23, 34, 42, 12, 32, 28 };
           int maximum1 = 0;
           int Maximum2 = 0;
		   for (int i = 0; i < ar.length; i++) { 
                  if (maximum1 < ar[i]) {
                        Maximum2 = maximum1;
                        maximum1 = ar[i];
                  } else if (Maximum2 < ar[i]) {
                        Maximum2 = ar[i];
                  }
           }
 
           System.out.println("Maximum1 : " + maximum1);
           System.out.println("Maximum2 : " + Maximum2);
    }
 
}