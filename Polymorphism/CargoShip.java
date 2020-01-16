public class CargoShip extends CruiseShip{
  
  private int tonnage;

  public CargoShip(int tonnage, int Passengers, String Name, String Year){
    super(Passengers, Name, Year);
    this.tonnage = tonnage;
  }

  public int getTonnage(){
    return tonnage;
  }

  public String toString(){
    return super.toString() + " Tonnage: " + tonnage + ".";
  }

}