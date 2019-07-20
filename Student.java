package program;

public class Student {
	String student_name;
	int rollno;
Student()
{
String student_name="asha";
int rollno=101;
System.out.println("Student name"+student_name);
System.out.println("Student regno"+rollno);
}
Student(String name, int regno)
{
	student_name=name;
	rollno=regno;
	System.out.println("Student name"+student_name);
	System.out.println("Student regno"+rollno);
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Student a1=new Student();
	Student a2=new Student("prave",102);
   
}
}
