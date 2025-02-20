class TestExample{
	static int x = 10;
	static {
		System.out.println(x);
	}
}


/*
static{
		m1();
	}
	public static void m1(){
		System.out.println(x);
	}
	static int x = 10;
	
	
	
//illegal forward reference
	static{
		System.out.println(x);
	}
	static int x = 10;
}
*/	