/*
*OverLoadingExample.
*/




class OverLoadingExample{
	public void m1(int x)
	{
		System.out.println("general method");
	}
	public void m1(int... x)
	{
		System.out.println("var-arg method");
	}
	public static void main(String[] args){
		OverLoadingExample t = new OverLoadingExample();
		t.m1();
		t.m1(10,20);
		t.m1(10);
	}

	
}