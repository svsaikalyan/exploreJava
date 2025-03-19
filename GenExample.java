class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob = ob;
	}
	public void show()
	{
		System.out.println("The type of ob"+ob.getClass().getName());
	}
	public T getOb()
	{
		return ob;
	}
}
class GenExample{
	public static void main(String[] args){
		Gen<String> g1 = new Gen<String>("durga");
		g1.show();
		System.out.println(g1.getOb());
		
		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.show();
		System.out.println(g2.getOb());
		
		Gen<Double> g3 = new Gen<Double>(10.5);
		g3.show();
		System.out.println(g3.getOb());
		
	}
}
	