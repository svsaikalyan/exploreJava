class Animals {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animals {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class IsaRelationship {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark(); 
    }
}



