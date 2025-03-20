class Test <T>{
	T obj;
	Test(T obj) {
		this.obj = obj;
	}
	public T getObject(){
		return this.obj;
	}
		
}

public class GenericsMethod{
	public static void main(String[] args){
		 Test<Integer> iO = new Test<Integer>(15);
		 System.out.println(iO.getObject());
		 
		 Test <String> sO = new Test<String>("yellowcolor");
		 System.out.println(sO.getObject());
		
		
	}
	
}