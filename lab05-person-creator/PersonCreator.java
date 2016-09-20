 
    /*
    * Desription: Change person weight (in pounds) to users input
    * Input: int
    * purpose: Insert person weight into program
    * example: 180
    */
    public void changeWeight(int pounds)
    {
        weight=pounds;
    }
    /*
    * Desription: Change person SSN to users input according to SSN format
    * Input: int
    * purpuse: Insert person age into program
    * example: 555-55-5555
    */
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
    /*
    * Desription: Change person address to users input
    * Input: String
    * purpuse: Insert person address into program
    * example: 223 fortune court Garden City, New York
    */
    public void changeAddress(String homeNum)
    {
        address=homeNum;
    }
    /*
    * Desription: Change person phone number to users input according to number's format
    * Input: int
    * purpuse: Insert person age into program
    * example: 516,555,5555
    */
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
    /*
    * Desription: Change person Birthday to users input
    * Input: String, int
    * purpuse: Insert person age into program
    * example: July 21 1996
    */
    public void changeBirthdate(String month, int date,int year)
    {
    if ( date < 01 || date > 31)
    {
        System.err.println("Please insert correct date");
    }
    birthdate= month + " " + date + ", " + year;
    }
    /*
    * Desription: Print users inputed infomation
    * Input: none
    * purpuse: print out imputed values
    * example: Print person infomation.
    */
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
