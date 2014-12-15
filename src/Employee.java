public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager manager;
  
  //Constructor
  public Employee(String firstname, String lastname, int age, double wage, int hours, String title)
  {
    super(firstname, lastname, age);
    hourlyWage=wage;
    hoursWorked=hours;
    jobTitle=title;
  }
  
  //Accessor
  public double getWage()
  {
    return hourlyWage;
  }
  
  public int getHours()
  {
    return hoursWorked;
  }
  
  public double getWeeklySalary()
  {
    double week=0.0;
    week=(hourlyWage*hoursWorked)*7;
    return week;
  }
  
  public double getYearlySalary()
  {
    double year=0.0;
    year=(hourlyWage*hoursWorked)*364;
    return year;
  }
  
  public String getJobTitle()
  {
    return jobTitle;
  }
  
  public String toString()
  {
    return "Employee: "+super.toString()+" : "+jobTitle+" @ $"+getYearlySalary();
  }
  
  public boolean equals (Object obj)
  {
    if(obj instanceof Employee)
    {
      Employee other=(Employee) obj;
      return hourlyWage==other.hourlyWage && hoursWorked==other.hoursWorked && jobTitle==other.jobTitle && manager==other.manager;
    }
    else
    {
      return false;
    }
  }
  
  public String getManager()
  {
    return manager.toString();
  }
  
  //Mutators
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  
  public void setJobTitle(String title)
  {
    jobTitle=title;
  }
  
  public void giveRaise()
  {
    hourlyWage++;
  }
  
  public void setManager(Manager newManager)
  {
    manager=newManager;
  }
}
