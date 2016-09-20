**
 *Create the person and list all infomation about that person.
 *
 * Thomas Ciavattone (your name)
 * 9/19/2016
 */
public class PersonCreator
{
    // Student's name
    private String name;
    // Student's age
    private String age;
    //student's Sex
    private String sex;
    // Student's Height
    private String height;
    // Student's Weight
    private String weight;
    // Student's Socal security numbers
    private String SSN;
    // Student's Address
    private String address;
    //Stundent's phone Number
    private String phone;
    //Stundent's Birthdate
    private String birthdate;
    

    //Create the student
    public PersonCreator (String firstName, String lastName )
    {
      name= firstName + " " + lastName;
      age= "";
      sex= "";
      height= "";
      weight= "";
      SSN= "";
      address= "";
      phone= "";
      birthdate= "";
    }
    
    public void changeAge(int yearsOld)
    {
      age= yearsOld + " years old";
    }
    
    public void changeSex(String gender)
    {
      sex= gender;
    }
    
    public void changeHeight(int inches)
    {
        height=inches + " inches";
    }
    
    public void changeWeight(int pounds)
    {
        weight=pounds + " lbs";
    }
    
    public void changeSSN(int beginNum, int middleNum, int endNum)
    {
        //if beginNum is bad, tell user to input something else.
        if (beginNum < 000 || beginNum > 999)
        {
            System.err.print("Please use a vaild beginning number");
        }
        //if middleNum is bad, tell user to input something else.
        else if (middleNum < 00 || middleNum > 99 )
        {
            System.err.print("Please use a vaild middle number");
        }
        //if endNum is bad, tell user to input something else.
        else if (endNum < 0000 || endNum > 9999)
        {
            System.err.print("Please use a vaild end number");
        }
        SSN= beginNum + "-" + middleNum + "-" + endNum;
    }
    
    public void changeAddress(String homeNum)
    {
        address=homeNum;
    }
    
    public void changePhone(int areaCode, int numBegin, int numEnd)
    {
       if (areaCode < 100 || areaCode > 999)
    {
      System.err.println("Please use a valid area code");
    }
    else if (numBegin < 100 || numBegin > 999)
    {
        System.err.println("Please use a valid begin number");
    } else if (numEnd <1000 || numEnd > 9999)
    {
        System.err.println("Please use a valid end number");
    }
    phone= areaCode + "-" + numBegin + "-" + numEnd;
    
    }

public void changeBirthdate(String month, int date,int year)
{
    if ( date < 01 || date > 31)
    {
        System.err.println("Please insert correct date");
    }
    birthdate= month + " " + date + ", " + year;
}
public void printPersoninfo()
{
    System.out.println(name);
    System.out.println(age);
    System.out.println(sex);
    System.out.println(height);
    System.out.println(weight);
    System.out.println(SSN);
    System.out.println(address);
    System.out.println(phone);
    System.out.println(birthdate);
    System.out.println();
    
}
}
