public class OrgChart
{
  public static void main (String[]args)
  {
    Manager first=new Manager("Caeser", "Flickerman", 34, 44.7, 7, "Developement Manager", "Developement");
    Employee pt=new Employee("Peeta", "Mellark", 18, 36.6, 7, "SR Developer");
    Employee lt=new Employee("Katniss", "Everdeen", 18, 28.5, 7, "JR Developer");
    Manager second=new Manager("Heavensbee", "Plutarch", 34, 44.7, 7, "Developement Manager", "Developement");
    Employee pt2=new Employee("Finnick", "Odair", 24, 28.5, 7, "JR Developer");
                                
                                
    System.out.print("Manager: ");                            
    printInfo(first);
    System.out.print("\tEmployee: ");
    printInfo(pt);
    System.out.print("\tEmployee: ");
    printInfo(lt);
    System.out.print("Manager: ");
    printInfo(second);  
    System.out.print("\tEmployee: ");
    printInfo(pt2);
  }   
  public static void printInfo(Person p)
  {
    System.out.print(p.getLastName()+", ");
    System.out.print(p.getFirstName()+": ");
    if (p instanceof Employee)
    {
      System.out.print(((Employee)p).getJobTitle()+" @ ");
      System.out.print(((Employee)p).getYearlySalary()+"$ ");
    }
    System.out.println();
  }                              
}
