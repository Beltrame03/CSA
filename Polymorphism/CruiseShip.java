public class CruiseShip extends Ship{
  private int Passengers;

  public CruiseShip(int Passengers, String Name, String Year){
    super(Name, Year);
    this.Passengers = Passengers;
  }

  public int getPassengerCount(){
    return Passengers;
  }

  public String toString(){
    return super.toString() + " Passengers: " + Passengers + ".";
  }
}