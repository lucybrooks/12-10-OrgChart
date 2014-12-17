public class OrgChart
{
  public static void main (String[]args)
  {
    Manager first=new Manager("Caeser", "Flickerman", 34, 44.7, 7, "Developement Manager", "Developement");
    Employee pt=new Employee("Peeta", "Mellark", 18, 36.6, 7, "SR Developer");
    Employee lt=new Employee("Katniss", "Everdeen", 18, 28.5, 7, "JR Developer");
    Manager second=new Manager("Heavensbee", "Plutarch", 34, 44.7, 7, "Developement Manager", "Developement");
    Employee pt2=new Employee("Finnick", "Odair", 24, 28.5, 7, "JR Developer");
                                
                                
     printInfo(first);
    printInfo(pt);
    printInfo(lt);
    printInfo(second);  
    printInfo(pt2);
  }   
  public static void printInfo(Person p)
  {
    System.out.print(p.getLastName()+" ");
    System.out.print(p.getFirstName()+" ");
    if (p instanceof Employee)
    {
      System.out.print(((Employee)p).getWage()+" ");
      System.out.print(((Employee)p).getHours()+" ");
      System.out.print(((Employee)p).getJobTitle()+" ");
    }
    if (p instanceof Manager)
    {
      System.out.print(((Manager)p).getWage()+" ");
      System.out.print(((Manager)p).getHours()+" ");
      System.out.print(((Manager)p).getJobTitle()+" ");
      System.out.println(((Manager)p).getDepartment());
    }
    System.out.println();
  }                              
}
