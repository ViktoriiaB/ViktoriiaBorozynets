package vehicles;

import details.Engine;
import professions.Driver;

public class Truck extends Car{

    private int carrying;

    public Truck(String brand, String type, String weight, Driver driver, Engine engine, int carrying) {
        super(brand, type, weight, driver, engine);
        this.carrying = carrying;
    }
}
