public class Swan extends Birds implements CanEat, CanSwim, CanFly{

    public Swan(String name, String type) {
        super(name, type);
    }

    @Override
    void fly() {
    }

    @Override
    void iAm() {
        System.out.println("Swan is a bird");
    }

    @Override
    public void canSwim() {
    }


    @Override
    public String toString() {
        return "Swan{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void canMove() {
    }

    @Override
    public double speed() {
        return CanFly.super.speed();
    }

    @Override
    public void canEat() {
    }
}


