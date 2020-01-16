public class Ship{
  
  private String name;
  private String year;

  public Ship(String name, String year){
    this.name = name;
    this.year = year;
  }

  public String getName(){
    return name;
  }

  public String getYear(){
    return year;
  }

  public String toString(){
    return "Ship name: " + name + ". Year: " + year + ".";
  }
}