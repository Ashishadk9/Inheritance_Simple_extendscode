
/**
 * Write a description of class Method here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ram extends Students
{
 public String Address;
   
 public static void main(String [] args){
     Ram r = new Ram();
        r.name ="Ram";
        r.age = 20;
        r.Gender ="male";
        r.Address = "pokhara";
        r.print("notGiven");
        
  }   
  public void print(String StudentID){
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);
      System.out.println("Gender: "+Gender);
      System.out.println("Address: "+Address);
  }
  
}
