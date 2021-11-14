import java.util.Objects;

public class Martin extends Birds implements CanEat, CanFly{

    String beak;

    public Martin(String name, String type, String beak) {
        super(name, type);
        this.beak = beak;
    }

    @Override
    void fly() {
    }

    @Override
    void iAm() {
        System.out.println("Martin is a bird");
    }


    @Override
    public String toString() {
        return "Martin{" +
                "beak='" + beak + '\'' +
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
