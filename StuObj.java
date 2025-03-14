public class StuObj{
	public static void main(String arg[]){
		Student stu = new Student(1, "Ram");
		Course c = new Course(1, "python");
		System.out.println(stu);
		System.out.println(c);
		System.out.println(c.hashCode());
	}
}

class Student{
	int id;
	String name;
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return "Student Id is "+id+", name is "+name;
	}
}
class Course{
	int id;
	String name;
	public Course(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return "Student Id is "+id+", name is "+name;
	}
}