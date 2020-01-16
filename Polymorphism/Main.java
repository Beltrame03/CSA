import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Ship ship1 = new Ship("The GOAT", "1978");
    CruiseShip ship2 = new CruiseShip(20, "BullShip", "2020");
    CargoShip ship3 = new CargoShip(70000, 20, "Ship Happens", "1999");

    ArrayList<Ship> ships = new ArrayList<Ship>();

    Ship ship4 = new CruiseShip(2000, "Breaking Bass", "2019");
    Ship ship5 = new CargoShip(20000, 45, "Ship!", "1903");

    ships.add(ship1);
    ships.add(ship2);
    ships.add(ship3);
    ships.add(ship4);
    ships.add(ship5);
    for (int i = 0; i < ships.size(); i++){
      System.out.println(ships.get(i));
    }
  }
}