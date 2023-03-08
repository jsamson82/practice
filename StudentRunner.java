/*
 * Activity 4.9.2
 */
import java.util.ArrayList;
public class StudentRunner
{
  public static void main(String[] args)
  { 
    Student Student1 = new Soccer();
    Student Student2 = new Football();
    Student Student3 = new Percussion();
    Student Student4 = new Brass();
    Student Student5 = new Lights();
    Student Student6 = new Preformer();


    ArrayList <Student> school = new ArrayList<Student>();

    school.add(Student1);
    school.add(Student2);
    school.add(Student3);
    school.add(Student4);
    school.add(Student5);
    school.add(Student6);
    
    
    for (Student x : school)
    {
      x.speak();
    }
    Student a = new Theater("bars, nuts, pb and j", false, 00113345);
    a.eat();


  }
}