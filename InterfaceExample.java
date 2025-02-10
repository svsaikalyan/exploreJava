/*
*what is interface
Any service reqirement specification or any contract b/w client and service provider or 100% pure abstract class is nothing but on 
interface.
*/



interface Interf{
	void m1();
	void m2();
}
abstract class Serviceprovider implements Interf{
	public void m1(){
	}
	
	class subServiceProvider extends Serviceprovider{
		public void m2()
		{
		}
	}
	
}