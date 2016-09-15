
/**
 * Write a description of class PersonCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Student's name
    private String name;
    // Student's age
    private int age;
    //student's Sex
    private String sex;
    // Student's Height
    private int height;
    // Student's Weight
    private int weight;
    // Student's Socal security numbers
    private int SSN;
    // Student's Address
    private String address;
    //Stundent's Birthdate
    private String birthdate;

    // Create the student
    public PersonCreator (String firstName, String lastName )
    {
      name= firstName + " " + lastName;
      age= -1;
      sex= "";
      height= -1;
      weight= -1;
      SSN= -1;
      address= "";
      phoneNumber= "";
      birthdate= "";
    }
    public void changeAge(int yearsOld)
    {
      age= yearsOld;
    }
    public void changeSex(String gender)
    {
      sex= gender;
    }
}
