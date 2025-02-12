class Abexample {
    public static void main(String[] args) {
        Waterbottle on = new Waterbottle(); 
        on.drink(); 

        System.out.println(on.material); 
    }
}

class Waterbottle { 
    String shape = "cylindrical", color = "yellow", company = "dmart", material = "plastic";
    double height = 50.32, weight = 12.34, cost = 50.0;

    void portable() {
        System.out.println("I am storing water");
    }

    void drink() {
        System.out.println("I am drinking");
    }
}
