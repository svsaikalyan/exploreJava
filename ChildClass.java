
class Person {
    String name;
    int age;
	Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person {
    int rollno;
    int marks;
	Student(String name, int age, int rollno, int marks) {
        
        super(name, age);
        this.rollno = rollno;
        this.marks = marks;
    }
}
