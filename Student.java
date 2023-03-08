/*
 * Activity 4.9.2
 */
public class Student
{
  private String food;
  private boolean nocturnal;
  private int id;

  public void setFood(){
    food = "Breakfast, Lunch, and Dinner.";
  }
  public String getFood(){
    return food;
  }
  public void setNocturnal(){
    nocturnal = true;
  }
  public boolean getNocturnal(){
    return nocturnal;
  }
  public void setId(){
    id= 000001;
  }
  public void getId()
  {
     System.out.println("This student's ID is " + id);
  }

  public Student(String food, boolean nocturnal,
              int id)
{
  this.food = food;
  this.nocturnal = nocturnal;
  this.id = id;
}
public Student()
{
}
public void speak()
{
  System.out.println("The student speaks");
}
  
  public void eat() 
  {
    System.out.println("This student's diet consists of " + food + ".");
  }
  
  public void isNocturnal()
  {
    if (nocturnal)
      System.out.println("This student is active at night.");
    else
      System.out.println("This student is active during the day.");
  }
  
  
}