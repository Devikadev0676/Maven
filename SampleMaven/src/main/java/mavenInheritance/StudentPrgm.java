package mavenInheritance;

class StudentPrgm
{
String name,dept;
int mark;
public StudentPrgm(String n,String d,int m)
{
name=n;
dept=d;
mark=m;
}
public void display()
 {
      System.out.println("Student Name:"+name);
      System.out.println("Student Department:"+dept);
	  System.out.println("Student Mark:"+mark);
	  
}
 public static void main(String args[])
 {
   System.out.println("STUDENT DETAILS ARE:");
    StudentPrgm e1=new  StudentPrgm("Devika","cse",50);
    StudentPrgm e2=new  StudentPrgm("Reji","eee",75);
    StudentPrgm e3=new  StudentPrgm("Aadhiv","ece",92);
    e1.display();
	System.out.println();
    e2.display();
	System.out.println();
    e3.display();
 }
}
