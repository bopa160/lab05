
/**
 * Write a description of class PersonCreator here.
 *
 * Thomas Ciavattone (your name)
 * 9/19/2016
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
    private String SSN;
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
      SSN= "";
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
    public void changeHeight(int inches)
    {
        height=inches
    }
    public void changeWeight(int pounds)
    {
        weight=pounds
    }
    public void changeSSN(int beginNum, int middleNum, int endNum)
    {
        //if beginNum is bad, tell user to input something else.
        if (beginNum < 000 || beginNum >000)
        {
            System.err.print("Please use a vaild beginning number")
        }
        else if (middleNum < 00 || middleNum > 99 )
    }
}
