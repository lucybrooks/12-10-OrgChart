public class OrgChart
{
  public static void main (String[]args)
  {
    Manager first=new Manager("Caeser", "Flickerman", 34, 44.7, 7, "Developement Manager", "Developement");
    Employee pt=new Employee("Peeta", "Mellark", 18, 36.6, 7, "SR Developer");
    Employee lt=new Employee("Katniss", "Everdeen", 18, 28.5, 7, "JR Developer");
    Manager second=new Manager("Heavensbee", "Plutarch", 34, 44.7, 7, "Developement Manager", "Developement");
    Employee pt2=new Employee("Finnick", "Odair", 24, 28.5, 7, "JR Developer");
                                
                                
    System.out.println(first);
    System.out.println("\t"+pt);
    System.out.println("\t"+lt);
    System.out.println(second);
    System.out.println("\t"+pt2);  
  }                             
}
