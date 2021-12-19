import details.Engine;
import professions.Driver;
import vehicles.SportCar;
import vehicles.Truck;

public class TheClass {


    public static void main(String[] args) {

        Driver driver = new Driver("NameDriver",1,45,"FullNameDriver");
        Engine engine = new Engine(90,"SomeCompany");
        SportCar sportCar = new SportCar("Tesla","Model S","someWeight",driver,engine,250.50);
        Truck truck = new Truck("Mercedes-Benz","L1", "someWeight", driver, engine, 500);

        System.out.println(driver);
        System.out.println(engine);
        System.out.println(sportCar);
        System.out.println(truck);

    }
}
