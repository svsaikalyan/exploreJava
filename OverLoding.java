/*
*what is overloading
1. Two method said to be overloading if both method same name but differnt argument types. 
*/





class OverLoading {  
    public void m1() {  
        System.out.println("no-arg");  
    }  

    public void m1(int i) {  
        System.out.println("int-arg");  
    }  

    public void m1(double d) {  
        System.out.println("double-arg");  
    }  

    public static void main(String[] args) {  
        HasRelationship t = new HasRelationship();  
        t.m1();  
        t.m1(99);  
        t.m1(888.5);  
    }  
}
