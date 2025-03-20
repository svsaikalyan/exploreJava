public class DuplicatesInArray{
	static int ar [] = {2,4,5,3,8,9,5};
	public static void main(String[] args){
		System.out.println("array:");
		for(int j = 0;j<ar.length;j++)
			System.out.println(ar[j]+"");
		displayDuplicateInArray();
		
		
		
	}

	static public void
	displayDuplicateInArray(){
		int tempAr[]=new int[100];
		for(int j = 0;j<ar.length;j++){
			if(tempAr[ar[j]]==0){
				tempAr[ar[j]]=1;
			}
			else{
				System.out.println(ar[j]+"");
			}
		}
	}
}
