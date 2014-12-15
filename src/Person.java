public class Person
{
  private String firstn;
  private String lastn;
  private int age;
  
  //Constructor
  public Person(String newf, String newl, int newa)
  {
    firstn=newf;
    lastn=newl;
    age=newa;
  }
  
  //Accessors
  public String getFirstName()
  {
    return firstn;
  }
  
  public String getLastName()
  {
    return lastn;
  }
  
  public int getAge()
  {
    return age;
  }
  
  public String toString()
  {
    return firstn+" , "+lastn;
  } 
  
  public boolean equals(Object obj)
  {
    if (obj instanceof Person)
    {
      Person other=(Person) obj;
      return firstn==other.firstn && lastn==other.lastn && age==other.age;
    }
    else
    {
      return false;
    }
  }
  
  //Mutators
  public void recordBirthday()
  {
    age++;
  }
}
