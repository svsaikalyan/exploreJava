/*
* what is Singleton
for any java class if we allow create only one object such type 
class is called singleton class.
Example
1.Rutime.
2.Bussiness delegate.
3.Service located.
*/







class Singleton{
	private static Singleton single_instance = null;
	
	public String s;
	
	private Singleton()
	{
		s = "hello iam a part";
	}
	public static Singleton singleton()
	{
		if ( single_instance == null){
			single_instance = new Singleton();
	    }
		return single_instance;
	}
}