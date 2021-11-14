package vehicles;

import details.Engine;
import professions.Driver;

public class SportCar extends Car{

    private double speed;

    public SportCar(String brand, String type, String weight, Driver driver, Engine engine, double speed) {
        super(brand, type, weight, driver, engine);
        this.speed = speed;
    }
}
