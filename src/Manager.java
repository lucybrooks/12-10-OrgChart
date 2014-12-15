import java.util.*;

public class Manager extends Employee
{
  private ArrayList <Employee> directReports = new ArrayList <Employee>();
  private String department;
  
  //Constructor
  public Manager(String firstname, String lastname, int age, double wage, int hours, String title, String d)
  {
    super(firstname, lastname, age, wage, hours, title);
    department=d; 
  }
  
  //Accessors
  public String getDepartment()
  {
    return department;
  }
  
  public ArrayList<Employee> getDirectReports()
  {
    return directReports;
  }
  
  public String toString()
  {
    return "Manager: "+super.toString();
  }
  
  public boolean equals(Object obj)
  {
    if(obj instanceof Manager)
    {
      Manager other=(Manager) obj;
      return directReports==other.directReports && department==other.department;
    }
    else
    {
      return false;
    }
  }
  
  //Mutators
  public void addDirectReport(Employee employee)
  {
    directReports.add(employee);
  }
  
  public void removeDirectReport(Employee employee)
  {
    directReports.remove(employee);
  }
  
  public void setDepartment(String dept)
  {
    department=dept;
  }
}
