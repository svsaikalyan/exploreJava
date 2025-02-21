class InstanceControl{
	int i = 10;
	{
		m1();
		System.out.println("First Instance");
	}
	InstanceControl()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args){
		System.out.println("main");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("second Instance");
	}
	int j = 20;
	
	
}