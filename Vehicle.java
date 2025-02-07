/**
*what is abstract method.
We don't know about implemtation still we can declare a method with abstract method.
*/




abstract class Vehicle{
	public abstract int getNoofWheel();
}

 class Bus extends Vehicle{
	public int getNoofWheel(){
		return 7;
	}
}
 class Auto extends Vehicle{
	public int getNoofWheel(){
		return 3;
	}
}